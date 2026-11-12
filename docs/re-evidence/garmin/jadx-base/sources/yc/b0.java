package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {287}, m = "getStateAsEvents")
public final class b0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d0 f195762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f195763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f195764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0<Object> f195765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f195766e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0<Object> d0Var, t13.d<? super b0> dVar) {
        super(dVar);
        this.f195765d = d0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195764c = obj;
        this.f195766e |= Integer.MIN_VALUE;
        return this.f195765d.a(this);
    }
}
