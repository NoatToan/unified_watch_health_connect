package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.mi.health.course.activity.eco.EcoRoutingActivityViewModel;

/* JADX INFO: loaded from: classes5.dex */
public class cj0 extends bj0 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public final ConstraintLayout B;
    public long C;

    public cj0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0);
        this.C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.B = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.bj0
    public void A0(EcoRoutingActivityViewModel ecoRoutingActivityViewModel) {
        this.A = ecoRoutingActivityViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.C = 2L;
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
            this.C = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (ew1.c != i) {
            return false;
        }
        A0((EcoRoutingActivityViewModel) obj);
        return true;
    }

    public cj0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
