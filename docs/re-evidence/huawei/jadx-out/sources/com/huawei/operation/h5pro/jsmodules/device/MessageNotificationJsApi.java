package com.huawei.operation.h5pro.jsmodules.device;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.devicepair.api.MessageNotificationApi;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.cjk;
import defpackage.cjr;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MessageNotificationJsApi extends JsBaseModule {
    @JavascriptInterface
    public void isSupportNotify(long j, String str) {
        MessageNotificationApi messageNotificationApiC = cjk.c();
        String deviceMac = DevicePairUtils.getDeviceMac(str);
        if (TextUtils.isEmpty(deviceMac)) {
            LogUtil.j(this.TAG, "isSupportNotify, device mac is empty ");
            onFailureCallback(j, "isSupportNotify error");
        } else {
            onSuccessCallback(j, Boolean.valueOf(messageNotificationApiC.isSupportNotify(deviceMac)));
        }
    }

    @JavascriptInterface
    public void queryMessageNotificationStatus(long j, String str) {
        onSuccessCallback(j, Integer.valueOf(cjk.c().queryMessageNotificationStatus()));
    }

    @JavascriptInterface
    public void setMessageNotificationStatus(long j, String str) {
        MessageNotificationApi messageNotificationApiC = cjk.c();
        String deviceMac = DevicePairUtils.getDeviceMac(str);
        String notificationEnable = DevicePairUtils.getNotificationEnable(str);
        if (TextUtils.isEmpty(deviceMac) || TextUtils.isEmpty(notificationEnable)) {
            LogUtil.j(this.TAG, "setMessageNotificationStatus, get deviceMac or enable is error");
            onFailureCallback(j, "get param error");
        } else {
            onSuccessCallback(j, Integer.valueOf(messageNotificationApiC.setMessageNotificationStatus(this.mContext, deviceMac, Integer.parseInt(notificationEnable))));
        }
    }

    @JavascriptInterface
    public void setNotificationRemindStatus(long j, String str) {
        MessageNotificationApi messageNotificationApiC = cjk.c();
        String remindMode = DevicePairUtils.getRemindMode(str);
        String remindStatus = DevicePairUtils.getRemindStatus(str);
        if (TextUtils.isEmpty(remindMode) || TextUtils.isEmpty(remindStatus)) {
            onFailureCallback(j, "get param error");
            LogUtil.j(this.TAG, "setNotificationRemindStatus, mode or status is empty");
        } else {
            onSuccessCallback(j, Integer.valueOf(messageNotificationApiC.setNotificationRemindStatus(this.mContext, Integer.parseInt(remindMode), Integer.parseInt(remindStatus)) ? 1 : 0));
        }
    }

    @JavascriptInterface
    public void queryApplicationInfoList(final long j, String str) {
        MessageNotificationApi messageNotificationApiC = cjk.c();
        String deviceMac = DevicePairUtils.getDeviceMac(str);
        if (TextUtils.isEmpty(deviceMac)) {
            LogUtil.j(this.TAG, "queryApplicationInfoList, device mac is empty ");
            onFailureCallback(j, "queryApplicationInfoList error");
        } else {
            messageNotificationApiC.queryApplicationInfoList(this.mContext, deviceMac, new IBaseResponseCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.MessageNotificationJsApi.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (obj instanceof List) {
                        MessageNotificationJsApi.this.onSuccessCallback(j, (List) obj);
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void setApplicationNotificationStatus(long j, String str) {
        LogUtil.a(this.TAG, "setApplicationNotificationStatus, param: ", str);
        MessageNotificationApi messageNotificationApiC = cjk.c();
        String pkgName = DevicePairUtils.getPkgName(str);
        String switchMode = DevicePairUtils.getSwitchMode(str);
        String deviceMac = DevicePairUtils.getDeviceMac(str);
        if (TextUtils.isEmpty(pkgName) || TextUtils.isEmpty(switchMode)) {
            LogUtil.j(this.TAG, "setApplicationNotificationStatus, packageName or status is empty");
            onFailureCallback(j, "setApplicationNotificationStatus error");
        } else {
            onSuccessCallback(j, messageNotificationApiC.setApplicationNotificationStatus(this.mContext, pkgName, deviceMac, Integer.parseInt(switchMode)));
        }
    }

    @JavascriptInterface
    public void queryNotificationRemind(long j, String str) {
        MessageNotificationApi messageNotificationApiC = cjk.c();
        String deviceMac = DevicePairUtils.getDeviceMac(str);
        if (TextUtils.isEmpty(deviceMac)) {
            LogUtil.j(this.TAG, "queryNotificationRemind, device mac is empty ");
            onFailureCallback(j, "queryNotificationRemind error");
        } else {
            onSuccessCallback(j, messageNotificationApiC.queryNotificationRemind(deviceMac));
        }
    }

    @JavascriptInterface
    public void getMessagePermission(long j) {
        onSuccessCallback(j, Boolean.valueOf(cjk.c().isMessagePermission(this.mContext)));
    }

    @JavascriptInterface
    public void isAppNotificationEnabled(long j, String str) {
        LogUtil.a(this.TAG, "isAppNotificationEnabled, param: ", str);
        MessageNotificationApi messageNotificationApiC = cjk.c();
        cjr cjrVar = (cjr) HiJsonUtil.d(str, cjr.class);
        if (cjrVar == null) {
            onFailureCallback(j, "get messageNotificationApp is error");
        } else {
            onSuccessCallback(j, Boolean.valueOf(messageNotificationApiC.isAppNotificationEnabled(this.mContext, cjrVar)));
        }
    }

    @JavascriptInterface
    public void enabledAppNotification(long j, String str) {
        LogUtil.a(this.TAG, "enabledAppNotification, param: ", str);
        MessageNotificationApi messageNotificationApiC = cjk.c();
        cjr cjrVar = (cjr) HiJsonUtil.d(str, cjr.class);
        if (cjrVar == null) {
            onFailureCallback(j, "get messageNotificationApp is error");
        } else {
            messageNotificationApiC.enabledAppNotification(this.mContext, cjrVar);
        }
    }
}
