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
    @JvmStatic
    fun init(context: Context,flag:String? = "config"){
        if (msp == null){
            msp = context.getSharedPreferences(flag, 0)
        }
    }
    @JvmStatic
    fun setBoolean(key: String?, value: Boolean) {
        if (mspIsNull()) {
            msp?.edit()?.putBoolean(key, value)?.apply()
        }
    }

    @JvmStatic
    fun setString(key: String?, string: String?) {
        if (mspIsNull()) {
            msp?.edit()?.putString(key, string)?.apply()
        }
    }

    @JvmStatic
    fun setInt(key: String?, i: Int) {
        if (mspIsNull()) {
            msp?.edit()?.putInt(key, i)?.apply()
        }
    }

    @JvmStatic
    fun getBoolean(key: String?, defValue: Boolean): Boolean? {
        return if (mspIsNull()) {
            msp?.getBoolean(key, defValue)
        } else {
            defValue
        }
    }

    @JvmStatic
    fun getString(key: String?, difString: String?): String? {
        return if (mspIsNull()) {
            msp?.getString(key, difString)
        } else {
            difString
        }
    }

    @JvmStatic
    fun getInt(key: String?, difi: Int): Int {
        return if (mspIsNull()) {
            msp!!.getInt(key, difi)
        } else {
            difi
        }
    }

    @JvmStatic
    fun deleteData(key: String?) {
        if (mspIsNull()) {
            msp?.edit()?.remove(key)?.apply()
        }
    }

    private fun mspIsNull():Boolean{
        return if (msp == null) {
            throw RuntimeException("PrefUtils  not init,需要先初始化")
        } else {
            true
        }
    }
}