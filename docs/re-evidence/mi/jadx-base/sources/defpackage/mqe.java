package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class mqe extends lqe {
    public static final ViewDataBinding.i S = null;
    public static final SparseIntArray T;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(gri.i, 1);
        sparseIntArray.put(gri.B, 2);
        sparseIntArray.put(gri.h, 3);
        sparseIntArray.put(gri.C, 4);
        sparseIntArray.put(gri.D, 5);
        sparseIntArray.put(gri.n0, 6);
        sparseIntArray.put(gri.m0, 7);
        sparseIntArray.put(gri.o0, 8);
        sparseIntArray.put(gri.E, 9);
        sparseIntArray.put(gri.I, 10);
        sparseIntArray.put(gri.r0, 11);
        sparseIntArray.put(gri.H, 12);
        sparseIntArray.put(gri.G, 13);
        sparseIntArray.put(gri.q0, 14);
        sparseIntArray.put(gri.F, 15);
        sparseIntArray.put(gri.p0, 16);
    }

    public mqe(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[3], (ImageView) objArr[1], (Guideline) objArr[2], (Guideline) objArr[4], (Guideline) objArr[5], (Guideline) objArr[9], (Guideline) objArr[15], (Guideline) objArr[13], (Guideline) objArr[12], (Guideline) objArr[10], (TextView) objArr[7], (ConstraintLayout) objArr[6], (TextView) objArr[8], (Button) objArr[16], (TextView) objArr[14], (ConstraintLayout) objArr[0], (TextView) objArr[11]);
        this.R = -1L;
        this.P.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.R != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.R = 1L;
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
            this.R = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public mqe(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 17, S, T));
    }
}
