package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public class fn6 extends en6 {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F;
    public final ConstraintLayout C;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(zqi.M3, 1);
        sparseIntArray.put(zqi.Q3, 2);
    }

    public fn6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CardView) objArr[1], (ImageView) objArr[2]);
        this.D = -1L;
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
        synchronized (this) {
            this.D = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public fn6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, E, F));
    }
}
