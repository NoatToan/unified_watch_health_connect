package com.huawei.devicepair.api;

import android.content.Context;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import defpackage.cjp;
import defpackage.cjr;

/* JADX INFO: loaded from: classes23.dex */
public interface MessageNotificationApi {
    void enabledAppNotification(Context context, cjr cjrVar);

    boolean isAppNotificationEnabled(Context context, cjr cjrVar);

    boolean isMessagePermission(Context context);

    boolean isSupportNotify(String str);

    void queryApplicationInfoList(Context context, String str, IBaseResponseCallback iBaseResponseCallback);

    int queryMessageNotificationStatus();

    cjp queryNotificationRemind(String str);

    cjr setApplicationNotificationStatus(Context context, String str, String str2, int i);

    int setMessageNotificationStatus(Context context, String str, int i);

    boolean setNotificationRemindStatus(Context context, int i, int i2);
}
