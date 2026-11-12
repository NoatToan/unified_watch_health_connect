package wd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.MobcoreApiImpl", f = "MobcoreApiImpl.kt", l = {25}, m = "createProfilePasscode", v = 2)
public final class q1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f184583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f184584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f184585c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(p1 p1Var, t13.d<? super q1> dVar) {
        super(dVar);
        this.f184584b = p1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184583a = obj;
        this.f184585c |= Integer.MIN_VALUE;
        return this.f184584b.c(null, this);
    }
}
