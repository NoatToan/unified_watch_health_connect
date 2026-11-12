package wd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackServiceController", f = "LivetrackServiceController.kt", l = {109}, m = "bindToService", v = 2)
public final class i1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f184503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f184504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f184505c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(g1 g1Var, t13.d<? super i1> dVar) {
        super(dVar);
        this.f184504b = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184503a = obj;
        this.f184505c |= Integer.MIN_VALUE;
        return this.f184504b.b(null, this);
    }
}
