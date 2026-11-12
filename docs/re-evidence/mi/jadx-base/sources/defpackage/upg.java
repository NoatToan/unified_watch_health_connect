package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.BankCardView;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;

/* JADX INFO: loaded from: classes9.dex */
public class upg extends tpg {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(mri.L, 1);
        sparseIntArray.put(mri.F2, 2);
        sparseIntArray.put(mri.B, 3);
        sparseIntArray.put(mri.j1, 4);
        sparseIntArray.put(mri.Q4, 5);
        sparseIntArray.put(mri.k5, 6);
        sparseIntArray.put(mri.y3, 7);
        sparseIntArray.put(mri.i1, 8);
    }

    public upg(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (BankCardView) objArr[3], (View) objArr[1], (DeviceImageView) objArr[8], (DeviceImageView) objArr[4], (ConstraintLayout) objArr[2], (ImageView) objArr[7], (TextView) objArr[5], (ConstraintLayout) objArr[6]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 1L;
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
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public upg(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
