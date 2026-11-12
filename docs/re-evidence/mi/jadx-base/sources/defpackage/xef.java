package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class xef extends wef {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F;
    public final ConstraintLayout C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(iri.x0, 1);
    }

    public xef(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[1]);
        this.D = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.C = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(ecf ecfVar) {
        this.B = ecfVar;
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
            this.D = 2L;
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
            this.D = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (fv1.f18276b != i) {
            return false;
        }
        A0((ecf) obj);
        return true;
    }

    public xef(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 2, E, F));
    }
}
