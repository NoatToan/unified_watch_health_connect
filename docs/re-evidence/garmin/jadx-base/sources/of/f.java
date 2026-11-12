package of;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {75}, m = "intercept")
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f131632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f131633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f131634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f131635d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f131634c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131633b = obj;
        this.f131635d |= Integer.MIN_VALUE;
        return this.f131634c.a(null, this);
    }
}
