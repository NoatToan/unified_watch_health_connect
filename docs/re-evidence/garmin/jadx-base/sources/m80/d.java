package m80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.companion.data.CompanionDeviceRepositoryImpl", f = "CompanionDeviceRepositoryImpl.kt", l = {51}, m = "getUnlinkedDevices", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f117143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f117144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f117145c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f117144b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f117143a = obj;
        this.f117145c |= Integer.MIN_VALUE;
        return this.f117144b.g(this);
    }
}
