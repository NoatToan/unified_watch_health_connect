package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.paging.SeparatorState", f = "Separators.kt", l = {214, 216, 217}, m = "onEvent")
public final class x3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v3 f196620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f196621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v3<Object, Object> f196622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f196623d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(v3<Object, Object> v3Var, t13.d<? super x3> dVar) {
        super(dVar);
        this.f196622c = v3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f196621b = obj;
        this.f196623d |= Integer.MIN_VALUE;
        return this.f196622c.a(null, this);
    }
}
