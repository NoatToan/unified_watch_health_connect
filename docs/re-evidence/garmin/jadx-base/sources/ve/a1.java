package ve;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.work.impl.WorkerWrapper", f = "WorkerWrapper.kt", l = {299}, m = "runWorker")
public final class a1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f177540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f177541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f177542c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(y0 y0Var, t13.d<? super a1> dVar) {
        super(dVar);
        this.f177541b = y0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f177540a = obj;
        this.f177542c |= Integer.MIN_VALUE;
        return y0.a(this.f177541b, this);
    }
}
