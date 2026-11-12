package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes10.dex */
public class jjq extends ijq {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(hsi.T0, 1);
        sparseIntArray.put(hsi.t1, 2);
        sparseIntArray.put(hsi.R0, 3);
        sparseIntArray.put(hsi.Q0, 4);
        sparseIntArray.put(hsi.P0, 5);
        sparseIntArray.put(hsi.g0, 6);
        sparseIntArray.put(hsi.h0, 7);
        sparseIntArray.put(hsi.f0, 8);
        sparseIntArray.put(hsi.h, 9);
    }

    public jjq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Button) objArr[9], (RightArrowSingleLineTextView) objArr[8], (RightArrowSingleLineTextView) objArr[6], (RightArrowSingleLineTextView) objArr[7], (RadioButton) objArr[5], (RadioButton) objArr[4], (RadioGroup) objArr[3], (NestedScrollView) objArr[1], (TextView) objArr[2]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 1L;
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
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public jjq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
