package yc;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.paging.SeparatorState", f = "Separators.kt", l = {564}, m = "onStaticList")
public final class z3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v3 f196700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m1.d f196701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f196702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f196703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f196704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f196705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f196706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v3<Object, Object> f196707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f196708i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(v3<Object, Object> v3Var, t13.d<? super z3> dVar) {
        super(dVar);
        this.f196707h = v3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f196706g = obj;
        this.f196708i |= Integer.MIN_VALUE;
        return this.f196707h.c(null, this);
    }
}
