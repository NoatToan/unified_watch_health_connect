package com.huawei.openalliance.ad;

import android.app.Dialog;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes12.dex */
public class vm implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.huawei.openalliance.ad.views.interfaces.k f21471a;

    @Override // java.lang.Runnable
    public void run() {
        if (a(this.f21471a.getNonwifiDialog())) {
            hw.a("RewardViewNonWifiDlgR", "NonWifiDialog already shown.");
            return;
        }
        hw.b("RewardViewNonWifiDlgR", "pop up dialog");
        Resources resources = this.f21471a.getResources();
        String string = resources.getString(R.string.hiad_consume_data_to_play_video_no_data_size);
        String string2 = resources.getString(R.string.hiad_reward_close_dialog_continue);
        String string3 = resources.getString(R.string.hiad_reward_close_dialog_close);
        com.huawei.openalliance.ad.views.interfaces.k kVar = this.f21471a;
        kVar.setNonwifiDialog(com.huawei.openalliance.ad.utils.ac.a(kVar.getContext(), "", string, string2, string3, new vl(this.f21471a)));
        this.f21471a.getNonwifiDialog().setCancelable(false);
        this.f21471a.pauseView();
    }

    public static boolean a(Dialog dialog) {
        return dialog != null && dialog.isShowing();
    }

    public vm(com.huawei.openalliance.ad.views.interfaces.k kVar) {
        this.f21471a = kVar;
    }
}
