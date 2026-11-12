package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.threetarget.model.ThreeTargetView;
import com.xiaomi.fitness.health.threetarget.view.ShareAccountInfoView;
import com.xiaomi.fitness.health.threetarget.view.ShareSportTargetDataInfoView;

/* JADX INFO: loaded from: classes9.dex */
public class dvb extends cvb {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final ConstraintLayout N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(eri.W0, 1);
        sparseIntArray.put(eri.Le, 2);
        sparseIntArray.put(eri.n0, 3);
        sparseIntArray.put(eri.p0, 4);
        sparseIntArray.put(eri.n7, 5);
        sparseIntArray.put(eri.l, 6);
        sparseIntArray.put(eri.rc, 7);
        sparseIntArray.put(eri.rh, 8);
        sparseIntArray.put(eri.u9, 9);
        sparseIntArray.put(eri.ni, 10);
        sparseIntArray.put(eri.o0, 11);
        sparseIntArray.put(eri.Se, 12);
    }

    public dvb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ShareAccountInfoView) objArr[6], (CardView) objArr[3], (TextView) objArr[11], (ConstraintLayout) objArr[4], (View) objArr[1], null, (ImageView) objArr[5], (ShareSportTargetDataInfoView) objArr[9], (ShareSportTargetDataInfoView) objArr[7], (NestedScrollView) objArr[2], (RecyclerView) objArr[12], (ShareSportTargetDataInfoView) objArr[8], (ThreeTargetView) objArr[10]);
        this.O = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.N = constraintLayout;
        constraintLayout.setTag(null);
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

    public dvb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 13, P, Q));
    }
}
