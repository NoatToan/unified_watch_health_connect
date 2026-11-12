package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes9.dex */
public class mfk extends lfk {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final ConstraintLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(qri.V, 1);
        sparseIntArray.put(qri.o, 2);
        sparseIntArray.put(qri.D, 3);
        sparseIntArray.put(qri.f31774r, 4);
        sparseIntArray.put(qri.q, 5);
        sparseIntArray.put(qri.H, 6);
        sparseIntArray.put(qri.s, 7);
        sparseIntArray.put(qri.X, 8);
        sparseIntArray.put(qri.j, 9);
        sparseIntArray.put(qri.B, 10);
        sparseIntArray.put(qri.f0, 11);
        sparseIntArray.put(qri.F, 12);
    }

    public mfk(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RightArrowBindingSingleLineTextView) objArr[9], (LinearLayout) objArr[2], (RightArrowBindingSingleLineTextView) objArr[5], (RightArrowBindingSingleLineTextView) objArr[4], (RightArrowBindingSingleLineTextView) objArr[7], (TextView) objArr[10], (TextView) objArr[3], (TextView) objArr[12], (TextView) objArr[6], (NestedScrollView) objArr[1], (SwitchButtonBindingTwoLineTextView) objArr[8], (RightArrowBindingSingleLineTextView) objArr[11]);
        this.N = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.N != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.N = 1L;
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
            this.N = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public mfk(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 13, O, P));
    }
}
