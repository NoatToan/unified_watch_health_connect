package u7;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {214, 118}, m = "writeScope")
public final class n0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0 f169242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f169243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f169244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q0 f169245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f169246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o0<Object> f169247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f169248g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0<Object> o0Var, t13.d<? super n0> dVar) {
        super(dVar);
        this.f169247f = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f169246e = obj;
        this.f169248g |= Integer.MIN_VALUE;
        return this.f169247f.d(null, this);
    }
}
