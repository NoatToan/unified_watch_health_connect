package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;

/* JADX INFO: loaded from: classes10.dex */
public class hjq extends gjq {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final LinearLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(hsi.I, 1);
        sparseIntArray.put(hsi.D0, 2);
        sparseIntArray.put(hsi.B1, 3);
        sparseIntArray.put(hsi.j0, 4);
        sparseIntArray.put(hsi.G0, 5);
        sparseIntArray.put(hsi.H0, 6);
        sparseIntArray.put(hsi.I0, 7);
        sparseIntArray.put(hsi.v1, 8);
    }

    public hjq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Guideline) objArr[1], (LinearLayout) objArr[4], (TextView) objArr[2], (NumberPickerView) objArr[5], (NumberPickerView) objArr[6], (NumberPickerView) objArr[7], (TextView) objArr[8], (TextView) objArr[3]);
        this.J = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.I = linearLayout;
        linearLayout.setTag(null);
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

    public hjq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
