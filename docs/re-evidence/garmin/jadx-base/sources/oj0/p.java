package oj0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.data.GCPlusRepository", f = "GCPlusRepository.kt", l = {318, 141}, m = "fetchGCPlusPlanSelectionContent", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.a f132336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f132337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f132338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f132339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f132340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f132341f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(f fVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f132340e = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132339d = obj;
        this.f132341f |= Integer.MIN_VALUE;
        return this.f132340e.j(this);
    }
}
