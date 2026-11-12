package com.huawei.watchface;

import android.app.Application;
import android.os.UserManager;
import android.view.View;
import com.huawei.openalliance.ad.views.PPSNativeView;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public class w2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f30639b = "w2";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w2 f30640c = new w2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f30641a = true;

    /* JADX INFO: loaded from: classes45.dex */
    public static class a implements PPSNativeView.OnNativeAdClickListener {
        @Override // com.huawei.openalliance.ad.views.PPSNativeView.OnNativeAdClickListener
        public void onClick(View view) {
        }
    }

    public static w2 a() {
        return f30640c;
    }

    public boolean b() {
        return this.f30641a;
    }

    public static void a(Application application) {
        if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isOversea()) {
            HwLog.i(f30639b, "initPps isOversea true");
            return;
        }
        String str = f30639b;
        HwLog.i(str, "initPps isOversea false");
        UserManager userManager = (UserManager) application.getSystemService(UserManager.class);
        if (userManager == null) {
            HwLog.w(str, "Init Pps Sdk - Get UserManager failed.");
        } else {
            if (!userManager.isUserUnlocked()) {
                HwLog.i(str, "Init Pps Sdk - device is locked");
                return;
            }
            HwLog.i(str, "Init Pps Sdk - device is unlocked");
            p1.a(application, true, 4);
            p1.a(application, "themes");
        }
    }

    public static void a(PPSNativeView pPSNativeView) {
        String str = f30639b;
        HwLog.i(str, "setChoiceView: enter ");
        if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isOversea()) {
            HwLog.i(str, "isOversea true");
        } else if (pPSNativeView == null) {
            HwLog.i(str, "nativeAdView is null");
        } else {
            pPSNativeView.setIsCustomDislikeThisAdEnabled(true);
            pPSNativeView.setChoiceViewPosition(4);
        }
    }
}
