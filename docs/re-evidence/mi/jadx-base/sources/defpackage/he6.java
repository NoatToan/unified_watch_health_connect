package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class he6 extends ge6 {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F = null;
    public final ConstraintLayout C;
    public long D;

    public he6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RightArrowBindingTwoLineTextView) objArr[1], (RightArrowBindingTwoLineTextView) objArr[2]);
        this.D = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.C = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.D = 1L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        if ((j & 1) != 0) {
            RightArrowBindingTwoLineTextView.showMore(this.A, false);
            RightArrowBindingTwoLineTextView.showMore(this.B, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public he6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, E, F));
    }
}
