package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import e23.p;
import p3.m;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceFeaturesActivity f41753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3 f41754c;

    public /* synthetic */ d(DeviceFeaturesActivity deviceFeaturesActivity, x3 x3Var, int i14) {
        this.f41752a = i14;
        this.f41753b = deviceFeaturesActivity;
        this.f41754c = x3Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f41752a;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                return DeviceFeaturesActivity.onCreate$lambda$0$0$1$2$1(this.f41753b, this.f41754c, mVar, iIntValue);
            case 1:
                return DeviceFeaturesActivity.onCreate$lambda$0$0$1$2$1$0(this.f41753b, this.f41754c, mVar, iIntValue);
            case 2:
                return DeviceFeaturesActivity.onCreate$lambda$0$0$1$2$0$0(this.f41753b, this.f41754c, mVar, iIntValue);
            default:
                return DeviceFeaturesActivity.onCreate$lambda$0$0$1$2$0(this.f41753b, this.f41754c, mVar, iIntValue);
        }
    }
}
