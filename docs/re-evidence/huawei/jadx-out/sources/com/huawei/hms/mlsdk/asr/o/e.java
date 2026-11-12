package com.huawei.hms.mlsdk.asr.o;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.mlkit.common.ha.HianalyticsLogProvider;
import com.huawei.hms.mlsdk.asr.engine.utils.SmartLogger;
import com.huawei.hms.mlsdk.common.MLApplication;
import com.huawei.operation.OpAnalyticsConstants;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f14403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap f14404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f14405c;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final e f14406a = new e(0);
    }

    /* synthetic */ e(int i) {
        this();
    }

    public static String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(System.currentTimeMillis()));
        StringBuilder sb2 = new StringBuilder(3);
        try {
            SecureRandom instanceStrong = SecureRandom.getInstanceStrong();
            for (int i = 0; i < 3; i++) {
                sb2.append("0123456789".charAt(instanceStrong.nextInt(10)));
            }
        } catch (NoSuchAlgorithmException e) {
            SmartLogger.i("HaAdapter_MLKitAsr", "e:" + e.getMessage());
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    public static e b() {
        return a.f14406a;
    }

    public final void c() {
        if (this.f14403a) {
            SmartLogger.i("HaAdapter_MLKitAsr", "Stop ha moudle");
            if (this.f14405c) {
                HianalyticsLogProvider.getInstance().reportAndCancelTimer("MLKitRtt");
            } else {
                HianalyticsLogProvider.getInstance().reportAndCancelTimer("MLKitAsr");
            }
            this.f14404b.clear();
            this.f14403a = false;
        }
    }

    public final Long d(String str) {
        if (TextUtils.isEmpty(str) || !this.f14403a || !this.f14404b.containsKey(str)) {
            StringBuilder sb = new StringBuilder("getSpeechEndTime return !isInfoGatherStart:!isInfoGatherStart !mEventsToBeReported.containsKey(taskId)");
            sb.append(!this.f14404b.containsKey(str));
            SmartLogger.i("HaAdapter_MLKitAsr", sb.toString());
            return null;
        }
        com.huawei.hms.mlsdk.asr.o.a aVar = (com.huawei.hms.mlsdk.asr.o.a) this.f14404b.get(str);
        if (aVar != null) {
            return Long.valueOf(aVar.h());
        }
        SmartLogger.e("HaAdapter_MLKitAsr", "getSpeechEndTime taskId " + str + " 's asrAnalyticsEvent is null");
        return null;
    }

    public final Long e(String str) {
        if (TextUtils.isEmpty(str) || !this.f14403a || !this.f14404b.containsKey(str)) {
            StringBuilder sb = new StringBuilder("getSpeechStartTime return !isInfoGatherStart:");
            sb.append(!this.f14403a);
            sb.append("!mEventsToBeReported.containsKey(taskId): ");
            sb.append(!this.f14404b.containsKey(str));
            SmartLogger.i("HaAdapter_MLKitAsr", sb.toString());
            return null;
        }
        com.huawei.hms.mlsdk.asr.o.a aVar = (com.huawei.hms.mlsdk.asr.o.a) this.f14404b.get(str);
        if (aVar != null) {
            return Long.valueOf(aVar.i());
        }
        SmartLogger.e("HaAdapter_MLKitAsr", "getSpeechStartTime taskId " + str + " 's asrAnalyticsEvent is null");
        return null;
    }

    public final void f(String str) {
        if (TextUtils.isEmpty(str) || !this.f14403a || !this.f14404b.containsKey(str)) {
            StringBuilder sb = new StringBuilder("postEvent return !isInfoGatherStart: ");
            sb.append(!this.f14403a);
            sb.append("!mEventsToBeReported.containsKey(taskId): ");
            sb.append(!this.f14404b.containsKey(str));
            SmartLogger.i("HaAdapter_MLKitAsr", sb.toString());
            return;
        }
        SmartLogger.i("HaAdapter_MLKitAsr", "Post Event [" + str + "]");
        com.huawei.hms.mlsdk.asr.o.a aVar = (com.huawei.hms.mlsdk.asr.o.a) this.f14404b.get(str);
        if (aVar == null) {
            SmartLogger.e("HaAdapter_MLKitAsr", "eventDetail taskId " + str + " 's asrAnalyticsEvent is null");
        } else {
            SmartLogger.i("HaAdapter_MLKitAsr", "applanguage: " + aVar.a() + " speechStartTime:" + aVar.i() + ",speechEndTime: " + aVar.h() + ",firstWordCost: " + aVar.c() + ",lastWordCost: " + aVar.d() + ",voiceStreamTime:" + aVar.l() + ",uploadVoiceSize: " + aVar.k() + ",textLength: " + aVar.j() + ",chainBuildingDelay: " + aVar.b() + ",result: " + aVar.e() + ",errMsg: " + aVar.f());
        }
        com.huawei.hms.mlsdk.asr.o.a aVar2 = (com.huawei.hms.mlsdk.asr.o.a) this.f14404b.get(str);
        if (aVar2 != null) {
            HianalyticsLogProvider.getInstance().postEvent(MLApplication.getInstance().getAppContext(), 1, aVar2);
            return;
        }
        SmartLogger.e("HaAdapter_MLKitAsr", "postEvent taskId " + str + " 's asrAnalyticsEvent is null");
    }

    private e() {
        this.f14403a = false;
        this.f14404b = new HashMap();
    }

    public final int b(String str) {
        if (TextUtils.isEmpty(str) || !this.f14403a || !this.f14404b.containsKey(str)) {
            StringBuilder sb = new StringBuilder("getLastWordCost return !isInfoGatherStart:");
            sb.append(!this.f14403a);
            sb.append("!mEventsToBeReported.containsKey(taskId): ");
            sb.append(!this.f14404b.containsKey(str));
            SmartLogger.i("HaAdapter_MLKitAsr", sb.toString());
            return 0;
        }
        com.huawei.hms.mlsdk.asr.o.a aVar = (com.huawei.hms.mlsdk.asr.o.a) this.f14404b.get(str);
        if (aVar != null) {
            return aVar.d();
        }
        SmartLogger.e("HaAdapter_MLKitAsr", "getLastWordCost taskId " + str + " 's asrAnalyticsEvent is null");
        return 0;
    }

    public final long c(String str) {
        if (!TextUtils.isEmpty(str) && this.f14403a && this.f14404b.containsKey(str)) {
            com.huawei.hms.mlsdk.asr.o.a aVar = (com.huawei.hms.mlsdk.asr.o.a) this.f14404b.get(str);
            if (aVar == null) {
                SmartLogger.e("HaAdapter_MLKitAsr", "getSendFinalDataTime taskId " + str + " 's asrAnalyticsEvent is null");
                return 0L;
            }
            return aVar.g().longValue();
        }
        StringBuilder sb = new StringBuilder("getLastWordCost return !isInfoGatherStart:");
        sb.append(!this.f14403a);
        sb.append("!mEventsToBeReported.containsKey(taskId): ");
        sb.append(!this.f14404b.containsKey(str));
        SmartLogger.i("HaAdapter_MLKitAsr", sb.toString());
        return 0L;
    }

    public final void a(Context context, boolean z) {
        if (this.f14403a) {
            SmartLogger.i("HaAdapter_MLKitAsr", "has already startHaAnalysis");
            return;
        }
        if (HianalyticsLogProvider.getInstance().sdkForbiddenHiLog(context.getApplicationContext())) {
            SmartLogger.i("HaAdapter_MLKitAsr", "return startHaAnalysis,sdkForbiddenHiLog");
            return;
        }
        this.f14405c = z;
        SmartLogger.i("HaAdapter_MLKitAsr", "Start ha moudle");
        if (z) {
            HianalyticsLogProvider.getInstance().initTimer("MLKitRtt");
        } else {
            HianalyticsLogProvider.getInstance().initTimer("MLKitAsr");
        }
        this.f14403a = true;
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str) && this.f14403a) {
            SmartLogger.i("HaAdapter_MLKitAsr", "taskId: " + str);
            this.f14404b.put(str, new com.huawei.hms.mlsdk.asr.o.a(this.f14405c));
            return;
        }
        StringBuilder sb = new StringBuilder("return createEvent: !isInfoGatherStart: ");
        sb.append(!this.f14403a);
        SmartLogger.i("HaAdapter_MLKitAsr", sb.toString());
    }

    public final void a(String str, int i, Bundle bundle) {
        SmartLogger.i("HaAdapter_MLKitAsr", "handleMsg, taskId: " + str + "msg: " + i);
        if (!TextUtils.isEmpty(str) && this.f14403a && this.f14404b.containsKey(str)) {
            com.huawei.hms.mlsdk.asr.o.a aVar = (com.huawei.hms.mlsdk.asr.o.a) this.f14404b.get(str);
            if (aVar == null) {
                SmartLogger.e("HaAdapter_MLKitAsr", "handleMsg taskId " + str + " 's asrAnalyticsEvent is null");
                return;
            }
            switch (i) {
                case 0:
                    aVar.a(bundle.getString("applanguage"));
                    break;
                case 1:
                    aVar.b(bundle.getLong("speechStartTime"));
                    break;
                case 2:
                    if (aVar.h() == 0) {
                        aVar.a(bundle.getLong("speechEndTime"));
                    } else {
                        SmartLogger.i("HaAdapter_MLKitAsr", "already set speechEndTime");
                    }
                    break;
                case 3:
                    aVar.b(bundle.getInt("firstWordCost"));
                    break;
                case 4:
                    aVar.c(bundle.getInt("lastWordCost"));
                    break;
                case 5:
                    aVar.f(bundle.getInt("voiceStreamTime"));
                    break;
                case 6:
                    aVar.e(bundle.getInt("uploadVoiceSize"));
                    break;
                case 7:
                    aVar.d(bundle.getInt(OpAnalyticsConstants.NOTIFICATION_TEXT_LENGTH));
                    break;
                case 8:
                    aVar.a(bundle.getInt("chainBuildingDelay"));
                    break;
                case 9:
                    aVar.b(String.valueOf(bundle.getInt("result")));
                    break;
                case 10:
                    aVar.c(bundle.getString("errMsg"));
                    break;
                case 11:
                    aVar.a(Long.valueOf(bundle.getLong("sendFinalDataTime")));
                    break;
            }
            return;
        }
        SmartLogger.e("HaAdapter_MLKitAsr", "mEventsToBeReported: has no response event isInfoGatherStart:" + this.f14403a + "msg: " + i);
    }
}
