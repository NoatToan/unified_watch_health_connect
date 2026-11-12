package v2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv2/f0;", "Lv2/p0;", "Lv2/h2;", "transformedTextFieldState", "<init>", "(Lv2/h2;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2 f174987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f174988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q3.c<e23.l<u2.d, Unit>> f174989c = new q3.c<>(new e23.l[16], 0);

    public f0(h2 h2Var) {
        this.f174987a = h2Var;
    }

    @Override // v2.p0
    public final void beginBatchEdit() {
        this.f174988b++;
    }

    @Override // v2.p0
    public final long c(long j8) {
        return this.f174987a.f(j8);
    }

    @Override // v2.p0
    public final long d(long j8) {
        return this.f174987a.e(j8);
    }

    @Override // v2.p0
    public final boolean endBatchEdit() {
        int i14 = this.f174988b - 1;
        this.f174988b = i14;
        if (i14 == 0) {
            q3.c<e23.l<u2.d, Unit>> cVar = this.f174989c;
            if (cVar.f142358c != 0) {
                h2 h2Var = this.f174987a;
                u2.h hVar = h2Var.f175039a;
                h2.a aVar = h2.f175038e;
                x2.c cVar2 = x2.c.MergeIfPossible;
                hVar.f167847b.a().b();
                u2.d dVar = hVar.f167847b;
                e23.l<u2.d, Unit>[] lVarArr = cVar.f142356a;
                int i15 = cVar.f142358c;
                for (int i16 = 0; i16 < i15; i16++) {
                    lVarArr[i16].invoke(dVar);
                }
                h2Var.l(dVar);
                u2.h.a(hVar, false, cVar2);
                cVar.g();
            }
        }
        return this.f174988b > 0;
    }

    @Override // v2.p0
    public final void g(e23.l<? super u2.d, Unit> lVar) {
        beginBatchEdit();
        this.f174989c.b(lVar);
        endBatchEdit();
    }
}
