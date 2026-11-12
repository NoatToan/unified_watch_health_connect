package yc;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.paging.PagingDataPresenter", f = "PagingDataPresenter.kt", l = {478}, m = "presentNewList")
public final class d3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a3 f195832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f195833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b1 f195834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b1 f195835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n0 f195836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k2 f195837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f195838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f195839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f195840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f195841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a3<Object> f195842k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f195843l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(a3<Object> a3Var, t13.d<? super d3> dVar) {
        super(dVar);
        this.f195842k = a3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195841j = obj;
        this.f195843l |= Integer.MIN_VALUE;
        return a3.a(this.f195842k, null, 0, 0, false, null, null, null, this);
    }
}
