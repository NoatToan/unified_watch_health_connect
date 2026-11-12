package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mg1.a f41764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f41765c;

    public /* synthetic */ h(mg1.a aVar, e23.a aVar2, int i14) {
        this.f41763a = i14;
        this.f41764b = aVar;
        this.f41765c = aVar2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f41763a) {
            case 0:
                GarminAuthBonding.handleClick$lambda$0(this.f41764b, this.f41765c, dialogInterface, i14);
                break;
            case 1:
                GarminAuthBonding.handleClick$lambda$2(this.f41764b, this.f41765c, dialogInterface, i14);
                break;
            case 2:
                RemoteConfigEnv.handleClick$lambda$0(this.f41764b, this.f41765c, dialogInterface, i14);
                break;
            default:
                SetAsNewLivetrackUser.handleClick$lambda$0(this.f41764b, this.f41765c, dialogInterface, i14);
                break;
        }
    }
}
