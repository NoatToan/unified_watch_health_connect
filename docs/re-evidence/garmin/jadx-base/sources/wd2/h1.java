package wd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackServiceController", f = "LivetrackServiceController.kt", l = {274}, m = "bindSelf", v = 2)
public final class h1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f184488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f184489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f184490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(g1 g1Var, t13.d<? super h1> dVar) {
        super(dVar);
        this.f184489b = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184488a = obj;
        this.f184490c |= Integer.MIN_VALUE;
        int i14 = g1.f184468k;
        return this.f184489b.a(this);
    }
}
