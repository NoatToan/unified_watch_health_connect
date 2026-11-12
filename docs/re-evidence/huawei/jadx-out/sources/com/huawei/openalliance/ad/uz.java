package com.huawei.openalliance.ad;

import android.content.DialogInterface;
import com.huawei.openalliance.ad.constant.RewardMethods;

/* JADX INFO: loaded from: classes12.dex */
public class uz implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.huawei.openalliance.ad.views.interfaces.j f20704a;

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.f20704a.l();
        this.f20704a.setDownloadDialog(null);
        this.f20704a.a("130");
        this.f20704a.b(RewardMethods.SHOW_DOWNLOAD_CONFIRM);
        this.f20704a.resumeView();
    }

    public uz(com.huawei.openalliance.ad.views.interfaces.j jVar) {
        this.f20704a = jVar;
    }
}
