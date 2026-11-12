package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String[] f41767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f41768c;

    public /* synthetic */ k(String[] strArr, Context context, int i14) {
        this.f41766a = i14;
        this.f41767b = strArr;
        this.f41768c = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        switch (this.f41766a) {
            case 0:
                NewHRZonesTesting.handleClick$lambda$0(this.f41767b, " >> ", this.f41768c, dialogInterface, i14);
                break;
            default:
                TargetedDataDeviceSelection.handleClick$lambda$0(this.f41767b, this.f41768c, dialogInterface, i14);
                break;
        }
    }
}
