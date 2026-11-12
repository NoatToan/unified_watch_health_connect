package au0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.liveactivity.LiveActivityRepositoryWrapper", f = "LiveActivityRepositoryWrapper.kt", l = {237}, m = "valueEstimationComplete", v = 2)
public final class g0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yf2.a f12911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f12913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12914d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(z zVar, t13.d<? super g0> dVar) {
        super(dVar);
        this.f12913c = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12912b = obj;
        this.f12914d |= Integer.MIN_VALUE;
        return this.f12913c.b(0L, null, this);
    }
}
