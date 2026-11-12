package ct1;

import e2.i0;
import java.util.List;
import p005kotlin.Metadata;
import z1.t;
import z1.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lct1/m;", "Lz1/t;", "Le2/i0;", "lazyListState", "Lz1/u;", "snapPosition", "Lg6/c;", "density", "<init>", "(Le2/i0;Lz1/u;Lg6/c;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f55518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f55519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g6.c f55520c;

    public m(i0 i0Var, u uVar, g6.c cVar) {
        i0Var.getClass();
        uVar.getClass();
        cVar.getClass();
        this.f55518a = i0Var;
        this.f55519b = uVar;
        this.f55520c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    @Override // z1.t
    public final float a(float f14) {
        i0 i0Var = this.f55518a;
        List<e2.n> listE = i0Var.j().e();
        int size = listE.size();
        float f15 = Float.POSITIVE_INFINITY;
        float f16 = Float.NEGATIVE_INFINITY;
        for (int i14 = 0; i14 < size; i14++) {
            e2.n nVar = listE.get(i14);
            int iA = (int) (i0Var.j().a() >> 32);
            int iB = i0Var.j().b();
            int f62557q = i0Var.j().getF62557q();
            int f62575q = nVar.getF62575q();
            int f62574p = nVar.getF62574p();
            i0Var.j().getClass();
            float fC = f62574p - this.f55519b.c(iA, f62575q, iB, f62557q);
            if (fC <= 0.0f && fC > f16) {
                f16 = fC;
            }
            if (fC >= 0.0f && fC < f15) {
                f15 = fC;
            }
        }
        char c14 = Math.abs(f14) >= this.f55520c.s0(n.f55521a) ? f14 > 0.0f ? (char) 1 : (char) 2 : (char) 0;
        if (c14 == 0) {
            if (Math.abs(f15) <= Math.abs(f16)) {
                f16 = f15;
            }
        } else if (c14 == 1) {
            f16 = f15;
        } else if (c14 != 2) {
            f16 = 0.0f;
        }
        if (f16 == Float.POSITIVE_INFINITY || f16 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return f16;
    }

    @Override // z1.t
    public final float b(float f14, float f15) {
        return 0.0f;
    }

    public /* synthetic */ m(i0 i0Var, u uVar, g6.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(i0Var, (i14 & 2) != 0 ? u.a.f200875a : uVar, cVar);
    }
}
