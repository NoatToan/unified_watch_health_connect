package com.huawei.health.ui.notification.uihandlers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BadParcelableException;
import android.os.Bundle;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.health.ui.notification.common.IReporter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import defpackage.npt;
import health.compact.a.AuthorizationUtils;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.StepsRecord;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class HealthSmartCoverHelper extends IReporter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f10326c = true;
    private static long e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CoverStateBroadcastReceiver f10328b;
    private long d = 0;

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void languageChanged() {
    }

    public HealthSmartCoverHelper(Context context) {
        this.f10327a = context;
    }

    private void e(Context context, int i, int i2, int i3) {
        Bundle bundle = new Bundle();
        bundle.putIntArray("cache total data", new int[]{i, i3, i2});
        bundle.putInt(MedalConstants.EVENT_STEPS, i);
        bundle.putInt("cal", i3);
        bundle.putInt("distance", i2);
        Intent intent = new Intent("android.com.huawei.bone.NOTIFY_SPORT_DATA");
        intent.putExtras(bundle);
        long jA = LogUtil.a(5000, e);
        if (jA != -1) {
            ReleaseLogUtil.d("Step_HealthSmrtCvrHlp", npt.d("broadcast step : ", Integer.valueOf(i), " distance ", Integer.valueOf(i2)));
            e = jA;
        }
        intent.setPackage(AuthorizationUtils.c(context) ? CommonUtil.ad() : "com.android.keyguard");
        a(context, intent, "com.android.keyguard.permission.SEND_STEP_INFO_COUNTER");
        intent.setPackage("com.android.systemui");
        a(context, intent, "com.android.keyguard.permission.SEND_STEP_INFO_COUNTER");
    }

    public static final void a(Context context, Intent intent, String str) {
        if (context == null) {
            LogUtil.e("Step_HealthSmrtCvrHlp", "context is null");
        } else if (intent != null) {
            try {
                context.sendBroadcast(intent, str);
            } catch (RuntimeException e2) {
                LogUtil.e("Step_HealthSmrtCvrHlp", "sendBroadcast exception:", e2.getMessage());
            }
        }
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void onStart(Bundle bundle) {
        super.onStart(bundle);
        if (this.f10328b == null) {
            this.f10328b = new CoverStateBroadcastReceiver();
        }
        Context context = this.f10327a;
        if (context != null) {
            BroadcastManagerUtil.c(context, this.f10328b, new IntentFilter("com.huawei.android.cover.STATE"), "android.permission.RESET_FINGERPRINT_LOCKOUT", null);
        }
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void refresh(StepsRecord stepsRecord) {
        if (stepsRecord == null) {
            LogUtil.e("Step_HealthSmrtCvrHlp", "record is null:");
            return;
        }
        boolean zAd = CommonUtil.ad(this.f10327a);
        long jA = LogUtil.a(5000, this.d);
        if (jA != -1) {
            ReleaseLogUtil.d("Step_HealthSmrtCvrHlp", "refresh isLocked:", Boolean.valueOf(zAd), "sIsOpenState:", Boolean.valueOf(f10326c));
            this.d = jA;
        }
        if (zAd || !f10326c) {
            boolean zD = ScreenUtil.d();
            ReleaseLogUtil.d("Step_HealthSmrtCvrHlp", "refresh isScreenOn:", Boolean.valueOf(zD));
            if (zD) {
                e(this.f10327a, stepsRecord.f, stepsRecord.f36647a, stepsRecord.f36649c);
            }
        }
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void onStop() {
        CoverStateBroadcastReceiver coverStateBroadcastReceiver;
        super.onStop();
        Context context = this.f10327a;
        if (context == null || (coverStateBroadcastReceiver = this.f10328b) == null) {
            return;
        }
        context.unregisterReceiver(coverStateBroadcastReceiver);
        this.f10328b = null;
    }

    public static class CoverStateBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null || intent == null || !"com.huawei.android.cover.STATE".equals(intent.getAction())) {
                return;
            }
            try {
                boolean unused = HealthSmartCoverHelper.f10326c = intent.getBooleanExtra("coverOpen", true);
            } catch (BadParcelableException e) {
                LogUtil.e("Step_HealthSmrtCvrHlp", "BadParcelableException getBooleanExtra:", LogAnonymous.b(e));
            }
        }
    }
}
