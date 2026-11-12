package u7;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", l = {211, 47, 48}, m = "lock")
public final class a1<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f169080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f169081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f169082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f169083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0 f169084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f169085f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(w0 w0Var, t13.d<? super a1> dVar) {
        super(dVar);
        this.f169084e = w0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f169083d = obj;
        this.f169085f |= Integer.MIN_VALUE;
        return this.f169084e.d(null, this);
    }
}
