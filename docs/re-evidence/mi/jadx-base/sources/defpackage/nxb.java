package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: loaded from: classes9.dex */
public class nxb extends mxb {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final ConstraintLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(eri.qn, 1);
        sparseIntArray.put(eri.jn, 2);
        sparseIntArray.put(eri.i5, 3);
        sparseIntArray.put(eri.Bl, 4);
        sparseIntArray.put(eri.Uj, 5);
        sparseIntArray.put(eri.Z8, 6);
    }

    public nxb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (FlexboxLayout) objArr[3], (ImageView) objArr[6], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[2], (TextView) objArr[1]);
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

    public nxb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
