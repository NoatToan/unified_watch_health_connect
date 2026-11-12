package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.nfc.widget.MarqueeTextView;
import com.xiaomi.fitness.nfc.widget.RechargeItemView;

/* JADX INFO: loaded from: classes9.dex */
public class sng extends rng {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(mri.Q4, 1);
        sparseIntArray.put(mri.l4, 2);
        sparseIntArray.put(mri.D0, 3);
        sparseIntArray.put(mri.v2, 4);
        sparseIntArray.put(mri.Z0, 5);
        sparseIntArray.put(mri.Q0, 6);
    }

    public sng(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RecyclerView) objArr[3], (TextView) objArr[6], (ConstraintLayout) objArr[0], (RechargeItemView) objArr[5], (View) objArr[4], (TextView) objArr[2], (MarqueeTextView) objArr[1]);
        this.H = -1L;
        this.C.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.H = 1L;
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
            this.H = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public sng(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
