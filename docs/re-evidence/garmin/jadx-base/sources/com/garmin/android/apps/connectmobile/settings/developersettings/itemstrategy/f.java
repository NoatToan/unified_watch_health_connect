package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceFeaturesActivity f41760b;

    public /* synthetic */ f(DeviceFeaturesActivity deviceFeaturesActivity, int i14) {
        this.f41759a = i14;
        this.f41760b = deviceFeaturesActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f41759a;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (i14) {
            case 0:
                return DeviceFeaturesActivity.onCreate$lambda$0$0$1$2$1$0$0$0(this.f41760b, zBooleanValue);
            default:
                return DeviceFeaturesActivity.onCreate$lambda$0$0$1$2$0$0$0$0(this.f41760b, zBooleanValue);
        }
    }
}
