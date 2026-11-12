package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView;
import com.xiaomi.fitness.widget.view.DividerView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes9.dex */
public class hub extends gub {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public final NestedScrollView P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(eri.F, 1);
        sparseIntArray.put(eri.E, 2);
        sparseIntArray.put(eri.B, 3);
        sparseIntArray.put(eri.C, 4);
        sparseIntArray.put(eri.D, 5);
        sparseIntArray.put(eri.z, 6);
        sparseIntArray.put(eri.A, 7);
        sparseIntArray.put(eri.Y3, 8);
        sparseIntArray.put(eri.G3, 9);
        sparseIntArray.put(eri.F3, 10);
        sparseIntArray.put(eri.A3, 11);
        sparseIntArray.put(eri.C3, 12);
        sparseIntArray.put(eri.D3, 13);
        sparseIntArray.put(eri.E3, 14);
        sparseIntArray.put(eri.z3, 15);
    }

    public hub(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[6], (RightArrowSingleLineTextView) objArr[7], (RightArrowSingleLineTextView) objArr[3], (TextView) objArr[4], (RightArrowSingleLineTextView) objArr[5], (TextView) objArr[2], (SwitchButtonSingleLineTextView) objArr[1], (RightArrowSingleLineTextView) objArr[15], (RightArrowSingleLineTextView) objArr[11], (TextView) objArr[12], (RightArrowSingleLineTextView) objArr[13], (TextView) objArr[14], (TextView) objArr[10], (SwitchButtonSingleLineTextView) objArr[9], (DividerView) objArr[8]);
        this.Q = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.P = nestedScrollView;
        nestedScrollView.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.Q != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Q = 1L;
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
            this.Q = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public hub(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 16, R, S));
    }
}
