package u7;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {101}, m = "readScope")
public final class m0<R> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0 f169225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j0 f169226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f169227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f169228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0<Object> f169229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f169230f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(o0<Object> o0Var, t13.d<? super m0> dVar) {
        super(dVar);
        this.f169229e = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f169228d = obj;
        this.f169230f |= Integer.MIN_VALUE;
        return this.f169229e.c(null, this);
    }
}
