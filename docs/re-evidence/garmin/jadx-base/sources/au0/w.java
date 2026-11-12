package au0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.liveactivity.LiveActivityPowerDataProviderImpl", f = "LiveActivityPowerDataProviderImpl.kt", l = {36}, m = "getPowerFtp", v = 2)
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f12998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12999c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(u uVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f12998b = uVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12997a = obj;
        this.f12999c |= Integer.MIN_VALUE;
        return this.f12998b.b(null, this);
    }
}
