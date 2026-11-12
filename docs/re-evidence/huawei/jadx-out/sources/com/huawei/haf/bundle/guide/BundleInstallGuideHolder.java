package com.huawei.haf.bundle.guide;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huawei.haf.bundle.InstallGuide;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class BundleInstallGuideHolder {
    private static InstallGuide e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BaseBundleInstallGuide f5843c;

    public BundleInstallGuideHolder(String str) {
        this.f5842b = str;
    }

    public void c(Activity activity) {
        int iE = e(activity);
        LogUtil.b(this.f5842b, "initialize, launcherIndex=", Integer.valueOf(iE));
        BaseBundleInstallGuide baseBundleInstallGuide = new BaseBundleInstallGuide(activity, iE);
        this.f5843c = baseBundleInstallGuide;
        if (iE == -1) {
            baseBundleInstallGuide.onFinish(false);
        } else {
            baseBundleInstallGuide.e();
        }
    }

    public void a() {
        LogUtil.b(this.f5842b, WorkoutExercises.CLEAN);
        BaseBundleInstallGuide baseBundleInstallGuide = this.f5843c;
        if (baseBundleInstallGuide != null) {
            baseBundleInstallGuide.d();
            this.f5843c = null;
        }
    }

    public static void c(InstallGuide installGuide) {
        if (installGuide != null) {
            e = installGuide;
        }
    }

    public static InstallGuide d() {
        return e;
    }

    private int e(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            LogUtil.d(this.f5842b, "intent == null");
            return -1;
        }
        try {
            return intent.getIntExtra("launcherIndex", -1);
        } catch (Exception unused) {
            return -1;
        }
    }
}
