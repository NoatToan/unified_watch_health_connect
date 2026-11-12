package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public class k2c extends j2c {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public final ConstraintLayout R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(eri.cj, 1);
        sparseIntArray.put(eri.S6, 2);
        sparseIntArray.put(eri.vj, 3);
        sparseIntArray.put(eri.up, 4);
        sparseIntArray.put(eri.tp, 5);
        sparseIntArray.put(eri.wp, 6);
        sparseIntArray.put(eri.vp, 7);
        sparseIntArray.put(eri.Yb, 8);
        sparseIntArray.put(eri.Vb, 9);
        sparseIntArray.put(eri.Ub, 10);
        sparseIntArray.put(eri.Xb, 11);
        sparseIntArray.put(eri.Wb, 12);
        sparseIntArray.put(eri.Z4, 13);
        sparseIntArray.put(eri.W4, 14);
        sparseIntArray.put(eri.V4, 15);
        sparseIntArray.put(eri.Y4, 16);
        sparseIntArray.put(eri.X4, 17);
    }

    public k2c(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[15], (LinearLayout) objArr[14], (TextView) objArr[17], (TextView) objArr[16], (DividerView) objArr[13], (DividerView) objArr[2], (ImageView) objArr[10], (LinearLayout) objArr[9], (TextView) objArr[12], (TextView) objArr[11], (DividerView) objArr[8], (TextView) objArr[1], (LinearLayout) objArr[3], (ImageView) objArr[5], (LinearLayout) objArr[4], (TextView) objArr[7], (TextView) objArr[6]);
        this.S = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.R = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.S != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.S = 1L;
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
            this.S = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public k2c(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 18, T, U));
    }
}
