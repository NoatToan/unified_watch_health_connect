package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.medal.MedalBannerIndicator;
import com.xiaomi.fitness.medal.medallist.FixDragLayout;
import com.xiaomi.fitness.medal.medallist.MedalViewModel;

/* JADX INFO: loaded from: classes9.dex */
public class oef extends nef {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final ConstraintLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(iri.p, 1);
        sparseIntArray.put(iri.M, 2);
        sparseIntArray.put(iri.J, 3);
    }

    public oef(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (FixDragLayout) objArr[1], (MedalBannerIndicator) objArr[3], (ViewPager2) objArr[2], null);
        this.G = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(MedalViewModel medalViewModel) {
        this.E = medalViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.G = 2L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (fv1.c != i) {
            return false;
        }
        A0((MedalViewModel) obj);
        return true;
    }

    public oef(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, H, I));
    }
}
