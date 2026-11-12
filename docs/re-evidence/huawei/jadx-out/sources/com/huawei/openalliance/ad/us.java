package com.huawei.openalliance.ad;

import android.app.Dialog;
import android.content.res.Resources;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes41.dex */
public class us implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<com.huawei.openalliance.ad.views.s> f20326a;

    @Override // java.lang.Runnable
    public void run() {
        com.huawei.openalliance.ad.views.s sVar = this.f20326a.get();
        if (sVar == null) {
            hw.c("InterstitialViewNonWifi", "container is null.");
            return;
        }
        if (a(sVar.getNonwifiDialog())) {
            hw.b("InterstitialViewNonWifi", "NonWifiDialog already shown.");
            return;
        }
        hw.b("InterstitialViewNonWifi", "pop up dialog");
        Resources resources = sVar.getResources();
        sVar.setNonwifiDialog(com.huawei.openalliance.ad.utils.ac.a(sVar.getContext(), "", resources.getString(R.string.hiad_consume_data_to_play_video_no_data_size), resources.getString(R.string.hiad_reward_close_dialog_continue), resources.getString(R.string.hiad_reward_close_dialog_close), new ur(sVar)));
        sVar.getNonwifiDialog().setCancelable(false);
    }

    public static boolean a(Dialog dialog) {
        return dialog != null && dialog.isShowing();
    }

    public us(com.huawei.openalliance.ad.views.s sVar) {
        this.f20326a = new WeakReference<>(sVar);
    }
}
