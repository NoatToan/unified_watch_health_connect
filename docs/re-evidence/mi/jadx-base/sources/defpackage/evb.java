package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.threetarget.model.ThreeTargetView;
import com.xiaomi.fitness.health.threetarget.view.ShareAccountInfoView;
import com.xiaomi.fitness.health.threetarget.view.ShareSportTargetDataInfoView;

/* JADX INFO: loaded from: classes9.dex */
public class evb extends cvb {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final RelativeLayout N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(eri.W0, 1);
        sparseIntArray.put(eri.Le, 2);
        sparseIntArray.put(eri.r5, 3);
        sparseIntArray.put(eri.n0, 4);
        sparseIntArray.put(eri.p0, 5);
        sparseIntArray.put(eri.n7, 6);
        sparseIntArray.put(eri.l, 7);
        sparseIntArray.put(eri.rc, 8);
        sparseIntArray.put(eri.rh, 9);
        sparseIntArray.put(eri.u9, 10);
        sparseIntArray.put(eri.ni, 11);
        sparseIntArray.put(eri.o0, 12);
        sparseIntArray.put(eri.Se, 13);
    }

    public evb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ShareAccountInfoView) objArr[7], (CardView) objArr[4], (TextView) objArr[12], (ConstraintLayout) objArr[5], (View) objArr[1], (Guideline) objArr[3], (ImageView) objArr[6], (ShareSportTargetDataInfoView) objArr[10], (ShareSportTargetDataInfoView) objArr[8], (NestedScrollView) objArr[2], (RecyclerView) objArr[13], (ShareSportTargetDataInfoView) objArr[9], (ThreeTargetView) objArr[11]);
        this.O = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.N = relativeLayout;
        relativeLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.O = 1L;
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
            this.O = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public evb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 14, P, Q));
    }
}
