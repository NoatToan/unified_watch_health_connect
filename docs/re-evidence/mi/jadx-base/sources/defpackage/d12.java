package defpackage;

import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d12 extends dn5 {
    protected a mXBounds;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14946b;
        public int c;

        public a() {
        }

        public void a(b12 b12Var, hpc hpcVar) {
            float fMax = Math.max(0.0f, Math.min(1.0f, d12.this.mAnimator.h()));
            float lowestVisibleX = b12Var.getLowestVisibleX();
            float highestVisibleX = b12Var.getHighestVisibleX();
            T tH0 = hpcVar.H0(lowestVisibleX, Float.NaN, DataSet.Rounding.DOWN);
            T tH1 = hpcVar.H0(highestVisibleX, Float.NaN, DataSet.Rounding.UP);
            this.f14945a = tH0 == 0 ? 0 : hpcVar.c(tH0);
            int iC = tH1 != 0 ? hpcVar.c(tH1) : 0;
            this.f14946b = iC;
            this.c = (int) ((iC - this.f14945a) * fMax);
        }
    }

    public d12(cu3 cu3Var, hwq hwqVar) {
        super(cu3Var, hwqVar);
        this.mXBounds = new a();
    }

    public boolean isInBoundsX(Entry entry, hpc hpcVar) {
        return entry != null && ((float) hpcVar.c(entry)) < ((float) hpcVar.O0()) * this.mAnimator.h();
    }

    public boolean shouldDrawValues(erc ercVar) {
        return ercVar.isVisible() && (ercVar.l0() || ercVar.D());
    }
}
