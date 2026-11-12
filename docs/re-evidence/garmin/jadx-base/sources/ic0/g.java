package ic0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.data.InMemoryDeviceInfoRepository", f = "InMemoryDeviceInfoRepository.kt", l = {39}, m = "refresh", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f92597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f92598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92599c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f92598b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f92597a = obj;
        this.f92599c |= Integer.MIN_VALUE;
        return this.f92598b.b(this);
    }
}
