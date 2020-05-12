package com.qzl.prefutils

import android.content.Context
import android.content.SharedPreferences

/**
 * @author 强周亮(qiangzhouliang)
 * @desc SharedPreferences 封装
 * @email 2538096489@qq.com
 * @time 2020/5/12 18:07
 */
object PrefUtils {
    private var msp: SharedPreferences? = null
    fun init(context: Context,flag:String? = "config"){
        if (msp == null){
            msp = context.getSharedPreferences(flag, 0)
        }
    }
    fun setBoolean(context: Context, key: String?, value: Boolean) {
        if (msp == null) {
            throw RuntimeException("PrefUtils  not init")
        } else {
            msp?.edit()?.putBoolean(key, value)?.apply()
        }
    }

    fun setString(context: Context, key: String?, string: String?) {
        if (msp == null) {
            throw RuntimeException("PrefUtils  not init")
        } else {
            msp?.edit()?.putString(key, string)?.apply()
        }
    }

    fun setInt(context: Context, key: String?, i: Int) {
        if (msp == null) {
            throw RuntimeException("PrefUtils  not init")
        } else {
            msp?.edit()?.putInt(key, i)?.apply()
        }
    }

    fun getBoolean(context: Context, key: String?, defValue: Boolean): Boolean? {
        if (msp == null) {
            throw RuntimeException("PrefUtils  not init")
        } else {
            return msp?.getBoolean(key, defValue)
        }
    }

    fun getString(context: Context, key: String?, difString: String?): String? {
        if (msp == null) {
            throw RuntimeException("PrefUtils  not init")
        } else {
            return msp?.getString(key, difString)
        }
    }

    fun getInt(context: Context, key: String?, difi: Int): Int {
        if (msp == null) {
            throw RuntimeException("PrefUtils  not init")
        } else {
            return msp!!.getInt(key, difi)
        }
    }

    fun deleteData(context: Context, key: String?) {
        if (msp == null) {
            throw RuntimeException("PrefUtils  not init")
        } else {
            msp?.edit()?.remove(key)?.apply()
        }
    }
}