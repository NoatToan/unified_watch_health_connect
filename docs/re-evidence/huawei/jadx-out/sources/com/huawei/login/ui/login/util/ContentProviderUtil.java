package com.huawei.login.ui.login.util;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdataaccessmodel.utils.StorageDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes2.dex */
public class ContentProviderUtil {
    private static final String COUNTRY_CODE = "country_code";
    private static final String DEVICE_ID = "device_id";
    private static final String DEVICE_TYPE = "device_type";
    private static final Object LOCK_OBJECT = new Object();
    private static final String SERVICE_COUNTRY_CODE = "service_country_code";
    private static final String TAG = "ContentProviderUtil";
    private static ContentProviderUtil mContentProviderUtil;
    private static Context mContext;

    public static ContentProviderUtil getInstance(Context context) {
        ContentProviderUtil contentProviderUtil;
        synchronized (LOCK_OBJECT) {
            try {
                if (context == null) {
                    mContext = BaseApplication.getContext();
                } else {
                    mContext = context;
                }
                if (mContentProviderUtil == null) {
                    mContentProviderUtil = new ContentProviderUtil();
                }
                contentProviderUtil = mContentProviderUtil;
            } catch (Throwable th) {
                throw th;
            }
        }
        return contentProviderUtil;
    }

    public void setCountryCode(String str, StorageDataCallback storageDataCallback) {
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "setCountryCode: mContext is null !");
        } else {
            KeyValDbManager.d(context).a("country_code", str, new StorageParams(1), storageDataCallback);
            LogUtil.d(TAG, "setCountryCode completed, country is:", str);
        }
    }

    public String getCountryCode() {
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "getCountryCode: mContext is null !");
            return "";
        }
        String strB = KeyValDbManager.d(context).b("country_code", new StorageParams(1));
        LogUtil.d(TAG, "getCountryCode completed !");
        return strB;
    }

    public void setServiceCountryCode(String str, StorageDataCallback storageDataCallback) {
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "setServiceCountryCode: mContext is null !");
        } else {
            KeyValDbManager.d(context).a(SERVICE_COUNTRY_CODE, str, new StorageParams(1), storageDataCallback);
            LogUtil.d(TAG, "setServiceCountryCode completed, serviceCountryCode is:", str);
        }
    }

    public String getServiceCountryCode() {
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "getServiceCountryCode: mContext is null !");
            return "";
        }
        String strB = KeyValDbManager.d(context).b(SERVICE_COUNTRY_CODE, new StorageParams(1));
        LogUtil.d(TAG, "getServiceCountryCode completed !!!");
        return strB;
    }

    public void setDeviceType(String str, StorageDataCallback storageDataCallback) {
        if (mContext == null) {
            LogUtil.e(TAG, "setDeviceType: mContext is null!");
            return;
        }
        LoginCache.configDeviceType(str);
        KeyValDbManager.d(mContext).c("device_type", str, storageDataCallback);
        LogUtil.d(TAG, "setCountryCode completed, deviceType is:", str);
    }

    public String getDeviceType() {
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "getDeviceType: mContext is null !");
            return "";
        }
        String strC = KeyValDbManager.d(context).c("device_type");
        LogUtil.d(TAG, "getDeviceType completed !!!");
        return strC;
    }

    public void setDeviceId(String str, StorageDataCallback storageDataCallback) {
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "setDeviceId: mContext is null !");
        } else {
            KeyValDbManager.d(context).a("device_id", str, new StorageParams(1), storageDataCallback);
            LogUtil.d(TAG, "setDeviceId completed, deviceId is:", str);
        }
    }

    public String getDeviceId() throws Throwable {
        Context context = mContext;
        if (context == null) {
            LogUtil.e(TAG, "getDeviceId: mContext is null !!!");
            return "";
        }
        String strB = KeyValDbManager.d(context).b("device_id", new StorageParams(1));
        LogUtil.d(TAG, "getDeviceId completed !!!");
        return strB;
    }
}
