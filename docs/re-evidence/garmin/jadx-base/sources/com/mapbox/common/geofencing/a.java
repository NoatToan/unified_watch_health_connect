package com.mapbox.common.geofencing;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f54363b;

    public /* synthetic */ a(long j8, int i14) {
        this.f54362a = i14;
        this.f54363b = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54362a) {
            case 0:
                AddFeatureCallbackNative._init_$lambda$0(this.f54363b);
                break;
            case 1:
                AddObserverCallbackNative._init_$lambda$0(this.f54363b);
                break;
            case 2:
                ClearFeaturesCallbackNative._init_$lambda$0(this.f54363b);
                break;
            case 3:
                ConfigureCallbackNative._init_$lambda$0(this.f54363b);
                break;
            case 4:
                GeofencingUtilsUserConsentResponseCallbackNative._init_$lambda$0(this.f54363b);
                break;
            case 5:
                GetFeatureCallbackNative._init_$lambda$0(this.f54363b);
                break;
            case 6:
                GetOptionsCallbackNative._init_$lambda$0(this.f54363b);
                break;
            case 7:
                RemoveFeatureCallbackNative._init_$lambda$0(this.f54363b);
                break;
            case 8:
                RemoveObserverCallbackNative._init_$lambda$0(this.f54363b);
                break;
            case 9:
                GeofencingFactory.setPeer$lambda$0(this.f54363b);
                break;
            case 10:
                GeofencingObserverNative._init_$lambda$0(this.f54363b);
                break;
            case 11:
                GeofencingServiceNative._init_$lambda$0(this.f54363b);
                break;
            default:
                GeofencingUtils.setPeer$lambda$0(this.f54363b);
                break;
        }
    }
}
