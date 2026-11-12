package com.huami.watch.hmwatchmanager.bt_connect;

import android.os.Bundle;
import android.util.Log;
import com.huami.watch.datatrans.CMyTransObj;

/* JADX INFO: loaded from: classes16.dex */
public class DataPackingManager {
    public static final String ACTION_APPS_RECEIVER = "android.intent.action.APPReceiver";
    public static final String ACTION_HUAMI_DATASEND = "com.huami.watch.datasend";
    public static final String ACTION_REQUEST_STATUS = "com.huami.watch.reqstatu";
    public static final String ACTION_SET_LOCALE = "com.huami.watch.setlocale";
    public static final String ACTION_UPDATE_USER_INFO = "com.huami.watch.userinfo";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static CMyTransObj packing(String str, String str2, Bundle bundle) {
        CMyTransObj cMyTransObj = new CMyTransObj();
        str.hashCode();
        switch (str) {
            case "com.huami.notification.test.schedulereminder":
            case "com.huami.notification.test.getmedal":
            case "com.huami.notification.test.sittoolong":
            case "com.huami.notification.test.weather":
            case "com.huami.notification.test.lowbattery":
            case "com.huami.notification.test.reachgoal":
                cMyTransObj.mUrl = str;
                return cMyTransObj;
            case "com.huami.watch.reqstatu":
                cMyTransObj.mUrl = str;
                return cMyTransObj;
            case "com.huami.watch.userinfo":
                cMyTransObj.mUrl = str;
                cMyTransObj.mBundle = bundle;
                return cMyTransObj;
            case "com.huami.watch.companion.transport.Widget":
                cMyTransObj.mUrl = str;
                cMyTransObj.mBundle = bundle;
                return cMyTransObj;
            case "com.huami.watch.setlocale":
                cMyTransObj.mUrl = str;
                cMyTransObj.mBundle = bundle;
                return cMyTransObj;
            case "com.huami.watch.datasend":
                if (bundle == null) {
                    return null;
                }
                if (bundle.containsKey("packagename") && bundle.containsKey("servicename")) {
                    Log.w("xuxue", str + " " + bundle.getString("packagename") + " " + bundle.getString("servicename"));
                }
                cMyTransObj.mUrl = str2;
                cMyTransObj.mBundle = bundle;
                return cMyTransObj;
            default:
                return cMyTransObj;
        }
    }
}
