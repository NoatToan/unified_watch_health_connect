package wd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.MobcoreApiImpl", f = "MobcoreApiImpl.kt", l = {43}, m = "saveLiveTrackPersonalUrl", v = 2)
public final class w1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f184656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f184657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f184658c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(p1 p1Var, t13.d<? super w1> dVar) {
        super(dVar);
        this.f184657b = p1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184656a = obj;
        this.f184658c |= Integer.MIN_VALUE;
        return this.f184657b.b(null, this);
    }
}
