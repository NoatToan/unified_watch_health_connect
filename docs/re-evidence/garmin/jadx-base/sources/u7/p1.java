package u7;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {50}, m = "tryLock")
public final class p1<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.b f169289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f169290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f169291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q1 f169292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f169293e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(q1 q1Var, t13.d<? super p1> dVar) {
        super(dVar);
        this.f169292d = q1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f169291c = obj;
        this.f169293e |= Integer.MIN_VALUE;
        return this.f169292d.a(null, this);
    }
}
