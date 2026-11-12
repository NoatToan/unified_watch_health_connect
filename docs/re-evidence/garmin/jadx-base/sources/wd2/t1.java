package wd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.MobcoreApiImpl", f = "MobcoreApiImpl.kt", l = {32}, m = "getLivetrackPersonalUrl", v = 2)
public final class t1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f184617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f184618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f184619c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(p1 p1Var, t13.d<? super t1> dVar) {
        super(dVar);
        this.f184618b = p1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184617a = obj;
        this.f184619c |= Integer.MIN_VALUE;
        return this.f184618b.g(this);
    }
}
