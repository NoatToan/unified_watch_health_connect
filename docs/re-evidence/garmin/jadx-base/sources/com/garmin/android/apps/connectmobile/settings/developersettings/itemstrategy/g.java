package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import e23.p;
import p3.m;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceFeaturesActivity f41762b;

    public /* synthetic */ g(DeviceFeaturesActivity deviceFeaturesActivity, int i14) {
        this.f41761a = i14;
        this.f41762b = deviceFeaturesActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f41761a;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                return DeviceFeaturesActivity.onCreate$lambda$0$0(this.f41762b, mVar, iIntValue);
            case 1:
                return DeviceFeaturesActivity.onCreate$lambda$0$0$0(this.f41762b, mVar, iIntValue);
            case 2:
                return DeviceFeaturesActivity.onCreate$lambda$0$0$1(this.f41762b, mVar, iIntValue);
            default:
                return DeviceFeaturesActivity.onCreate$lambda$0(this.f41762b, mVar, iIntValue);
        }
    }
}
