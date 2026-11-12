package com.huawei.openalliance.ad.utils;

import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import com.huawei.profile.profile.ProfileExtendConstants;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f20399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f20400b;

    public static void b() {
        f20400b = System.currentTimeMillis();
    }

    public static boolean a(List<FeedbackInfo> list) {
        if (bm.a(list)) {
            return false;
        }
        for (FeedbackInfo feedbackInfo : list) {
            if (feedbackInfo != null && feedbackInfo.b()) {
                return true;
            }
        }
        return false;
    }

    public static boolean a() {
        if (Math.abs(System.currentTimeMillis() - f20399a) < 500 || Math.abs(System.currentTimeMillis() - f20400b) < ProfileExtendConstants.TIME_OUT) {
            return true;
        }
        f20399a = System.currentTimeMillis();
        return false;
    }
}
