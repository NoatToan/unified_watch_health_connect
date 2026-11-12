package w9;

import g8.i;
import o53.b0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lw9/a;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lo53/b0;", "Lt13/g;", "coroutineContext", "<init>", "(Lt13/g;)V", "coroutineScope", "(Lo53/b0;)V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements AutoCloseable, b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t13.g f183565a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(b0 b0Var) {
        this(b0Var.getF7937b());
        b0Var.getClass();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        i.p(this.f183565a, null);
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final t13.g getF7937b() {
        return this.f183565a;
    }

    public a(t13.g gVar) {
        gVar.getClass();
        this.f183565a = gVar;
    }
}
