package com.huawei.operation.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ddq;

/* JADX INFO: loaded from: classes13.dex */
public class KakaTaskUtils {
    private static final int MSG_REMIND = 4;
    private static final String PARAM_ACTIVITY_ID = "activityId";
    private static final String TAG = "PluginOperation_KakaTaskUtils";

    private KakaTaskUtils() {
    }

    public static void onAchieveEvent(String str, Context context) {
        LogUtil.d(TAG, "onAchieveEvent onPageStarted url = ", str);
        onRemindMsgRefreshEvent(str, context);
    }

    public static void onRemindMsgRefreshEvent(String str, Context context) {
        if (!TextUtils.isEmpty(str) && Uri.decode(str).contains("activityId")) {
            LogUtil.a(TAG, "onRemindMsgRefreshEvent refresh.");
            ddq.d().doPostByKey(context, 4);
        }
    }
}
