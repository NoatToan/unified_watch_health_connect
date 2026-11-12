package u7;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {66, 41}, m = "lock")
public final class o1<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f169266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f169267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f169268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q1 f169269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f169270e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(q1 q1Var, t13.d<? super o1> dVar) {
        super(dVar);
        this.f169269d = q1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f169268c = obj;
        this.f169270e |= Integer.MIN_VALUE;
        return this.f169269d.d(null, this);
    }
}
