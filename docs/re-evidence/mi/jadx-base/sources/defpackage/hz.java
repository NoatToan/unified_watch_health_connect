package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes7.dex */
public class hz extends gz {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final ConstraintLayout N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(uqi.L, 1);
        sparseIntArray.put(uqi.f36029a, 2);
        sparseIntArray.put(uqi.K, 3);
        sparseIntArray.put(uqi.J, 4);
        sparseIntArray.put(uqi.f36032r, 5);
        sparseIntArray.put(uqi.t, 6);
        sparseIntArray.put(uqi.X, 7);
        sparseIntArray.put(uqi.z, 8);
        sparseIntArray.put(uqi.q, 9);
        sparseIntArray.put(uqi.F, 10);
        sparseIntArray.put(uqi.l, 11);
        sparseIntArray.put(uqi.j, 12);
        sparseIntArray.put(uqi.f36031k, 13);
    }

    public hz(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[2], (LinearLayout) objArr[12], (Button) objArr[13], (RightArrowBindingSingleLineTextView) objArr[11], (SwitchButtonBindingTwoLineTextView) objArr[9], (View) objArr[5], (RightArrowBindingSingleLineTextView) objArr[6], (SwitchButtonBindingTwoLineTextView) objArr[8], (SwitchButtonBindingTwoLineTextView) objArr[10], (RightArrowBindingSingleLineTextView) objArr[4], (RightArrowBindingSingleLineTextView) objArr[3], (NestedScrollView) objArr[1], (RightArrowTwoLineTextView) objArr[7]);
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

    public hz(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 14, P, Q));
    }
}
