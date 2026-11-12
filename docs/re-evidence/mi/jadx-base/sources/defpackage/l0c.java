package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes9.dex */
public class l0c extends k0c {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final SpringBackLayout O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(eri.Yg, 1);
        sparseIntArray.put(eri.j, 2);
        sparseIntArray.put(eri.Q7, 3);
        sparseIntArray.put(eri.Ni, 4);
        sparseIntArray.put(eri.d4, 5);
        sparseIntArray.put(eri.f16996k, 6);
        sparseIntArray.put(eri.dd, 7);
        sparseIntArray.put(eri.Ng, 8);
        sparseIntArray.put(eri.common_privacy_brief, 9);
        sparseIntArray.put(eri.cd, 10);
        sparseIntArray.put(eri.sb, 11);
        sparseIntArray.put(eri.tb, 12);
        sparseIntArray.put(eri.ub, 13);
        sparseIntArray.put(eri.i, 14);
    }

    public l0c(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RightArrowBindingSingleLineTextView) objArr[14], (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[6], (RightArrowBindingSingleLineTextView) objArr[9], (View) objArr[5], (ImageView) objArr[3], (RightArrowBindingSingleLineTextView) objArr[11], (RightArrowBindingSingleLineTextView) objArr[12], (RightArrowBindingSingleLineTextView) objArr[13], (RightArrowBindingSingleLineTextView) objArr[10], (RightArrowBindingTwoLineTextView) objArr[7], (RightArrowBindingSingleLineTextView) objArr[8], (NestedScrollView) objArr[1], (TextView) objArr[4]);
        this.P = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.O = springBackLayout;
        springBackLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.P = 1L;
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
            this.P = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public l0c(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 15, Q, R));
    }
}
