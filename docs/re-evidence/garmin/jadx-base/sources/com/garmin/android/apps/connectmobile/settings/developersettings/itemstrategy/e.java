package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.Context;
import e23.p;
import p3.m;
import p3.p1;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41755a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3 f41756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DeviceFeaturesActivity f41757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f41758d;

    public /* synthetic */ e(DeviceFeaturesActivity deviceFeaturesActivity, Context context, p1 p1Var) {
        this.f41757c = deviceFeaturesActivity;
        this.f41758d = context;
        this.f41756b = p1Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f41755a;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                return DeviceFeaturesActivity.onCreate$lambda$0$0$1$2$2(this.f41757c, this.f41758d, this.f41756b, mVar, iIntValue);
            default:
                return DeviceFeaturesActivity.onCreate$lambda$0$0$1$2$4(this.f41756b, this.f41757c, this.f41758d, mVar, iIntValue);
        }
    }

    public /* synthetic */ e(p1 p1Var, DeviceFeaturesActivity deviceFeaturesActivity, Context context) {
        this.f41756b = p1Var;
        this.f41757c = deviceFeaturesActivity;
        this.f41758d = context;
    }
}
