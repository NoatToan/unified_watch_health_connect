package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public class l16 extends k16 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(xqi.C, 1);
        sparseIntArray.put(xqi.D, 2);
        sparseIntArray.put(xqi.H, 3);
        sparseIntArray.put(xqi.E, 4);
        sparseIntArray.put(xqi.F, 5);
        sparseIntArray.put(xqi.G, 6);
        sparseIntArray.put(xqi.d0, 7);
        sparseIntArray.put(xqi.D0, 8);
    }

    public l16(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[1], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[3], (Button) objArr[7], (Button) objArr[8]);
        this.J = -1L;
        this.A.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 1L;
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
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public l16(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
