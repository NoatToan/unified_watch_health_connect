package androidx.lifecycle;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {221, 222}, m = "emitSource$lifecycle_livedata", v = 1)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s0 f7932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j<Object> f7934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7935d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j<Object> jVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f7934c = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f7933b = obj;
        this.f7935d |= Integer.MIN_VALUE;
        return this.f7934c.q(null, this);
    }
}
