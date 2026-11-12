package r53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lr53/h2;", "Ls53/c;", "Lr53/e2;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h2 extends s53.c<e2<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f150641a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.k f150642b;

    @Override // s53.c
    public final boolean a(s53.a aVar) {
        e2 e2Var = (e2) aVar;
        if (this.f150641a >= 0) {
            return false;
        }
        long j8 = e2Var.f150585i;
        if (j8 < e2Var.f150586j) {
            e2Var.f150586j = j8;
        }
        this.f150641a = j8;
        return true;
    }

    @Override // s53.c
    public final t13.d[] b(s53.a aVar) {
        long j8 = this.f150641a;
        this.f150641a = -1L;
        this.f150642b = null;
        return ((e2) aVar).x(j8);
    }
}
