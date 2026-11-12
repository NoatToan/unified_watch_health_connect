package e2;

import g2.r1;
import g2.z0;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le2/a;", "Le2/d0;", "", "initialNestedPrefetchItemCount", "<init>", "(I)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z0.b f62396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f62397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f62399f;

    public a(int i14) {
        this.f62394a = i14;
        this.f62395b = -1;
        this.f62398e = -1;
    }

    public static int b(v vVar, boolean z14) {
        return z14 ? ((n) p13.h0.m0(vVar.e())).getF62559a() + 1 : ((n) p13.h0.b0(vVar.e())).getF62559a() - 1;
    }

    @Override // e2.d0
    public final void a(r1 r1Var, int i14) {
        int f75319a = r1Var.getF75319a() == -1 ? this.f62394a : r1Var.getF75319a();
        for (int i15 = 0; i15 < f75319a; i15++) {
            r1Var.a(i14 + i15);
        }
    }

    @Override // e2.d0
    public final void c(i0.c cVar, x xVar) {
        List<y> list = xVar.f62551k;
        int i14 = this.f62395b;
        boolean z14 = this.f62397d;
        if (i14 != -1 && !list.isEmpty() && i14 != b(xVar, z14)) {
            this.f62395b = -1;
            z0.b bVar = this.f62396c;
            if (bVar != null) {
                bVar.cancel();
            }
            this.f62396c = null;
        }
        int i15 = xVar.f62554n;
        int i16 = this.f62398e;
        if (i16 != -1 && this.f62399f != 0.0f && i16 != i15 && !list.isEmpty()) {
            int iB = b(xVar, this.f62399f < 0.0f);
            if (iB >= 0 && iB < i15) {
                this.f62395b = iB;
                this.f62396c = cVar.a(iB, null);
            }
        }
        this.f62398e = i15;
    }

    @Override // e2.d0
    public final void e(i0.c cVar, float f14, v vVar) {
        z0.b bVar;
        z0.b bVar2;
        if (!vVar.e().isEmpty()) {
            boolean z14 = f14 < 0.0f;
            int iB = b(vVar, z14);
            if (iB >= 0 && iB < vVar.getF62554n()) {
                if (iB != this.f62395b) {
                    if (this.f62397d != z14) {
                        this.f62395b = -1;
                        z0.b bVar3 = this.f62396c;
                        if (bVar3 != null) {
                            bVar3.cancel();
                        }
                        this.f62396c = null;
                    }
                    this.f62397d = z14;
                    this.f62395b = iB;
                    this.f62396c = cVar.a(iB, null);
                }
                if (z14) {
                    n nVar = (n) p13.h0.m0(vVar.e());
                    if (((nVar.getF62575q() + nVar.getF62574p()) + vVar.getF62558r()) - vVar.getF62553m() < (-f14) && (bVar2 = this.f62396c) != null) {
                        bVar2.d();
                    }
                } else if (vVar.getF62552l() - ((n) p13.h0.b0(vVar.e())).getF62574p() < f14 && (bVar = this.f62396c) != null) {
                    bVar.d();
                }
            }
        }
        this.f62399f = f14;
    }

    public a() {
        this(0, 1, null);
    }

    public /* synthetic */ a(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 2 : i14);
    }
}
