package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;

/* JADX INFO: loaded from: classes10.dex */
public class pjq extends ojq {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final ConstraintLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(hsi.v0, 1);
        sparseIntArray.put(hsi.y0, 2);
        sparseIntArray.put(hsi.t0, 3);
        sparseIntArray.put(hsi.u0, 4);
        sparseIntArray.put(hsi.x0, 5);
        sparseIntArray.put(hsi.w0, 6);
    }

    public pjq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[4], (TextView) objArr[1], (TextView) objArr[6], (TextView) objArr[5], (NumberPickerView) objArr[2], (TextView) objArr[3]);
        this.H = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
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

    public pjq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
