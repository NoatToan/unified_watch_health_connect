package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class z3o extends y3o {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public final LinearLayout R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(xri.w0, 1);
        sparseIntArray.put(xri.b5, 2);
        sparseIntArray.put(xri.l, 3);
        sparseIntArray.put(xri.V5, 4);
        sparseIntArray.put(xri.course_list_recycler, 5);
        sparseIntArray.put(xri.h, 6);
        sparseIntArray.put(xri.D, 7);
        sparseIntArray.put(xri.F, 8);
        sparseIntArray.put(xri.G, 9);
        sparseIntArray.put(xri.m7, 10);
        sparseIntArray.put(xri.X6, 11);
        sparseIntArray.put(xri.o3, 12);
        sparseIntArray.put(xri.H3, 13);
        sparseIntArray.put(xri.G3, 14);
        sparseIntArray.put(xri.q8, 15);
        sparseIntArray.put(xri.i, 16);
        sparseIntArray.put(xri.H2, 17);
    }

    public z3o(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[6], (ImageView) objArr[16], (TextView) objArr[3], (LinearLayout) objArr[7], (ImageView) objArr[8], (ImageView) objArr[9], (ConstraintLayout) objArr[1], (RecyclerView) objArr[5], (TextView) objArr[17], (ConstraintLayout) objArr[12], (TextView) objArr[14], (ImageView) objArr[13], (ImageView) objArr[2], (TextView) objArr[4], (TextView) objArr[11], (TextView) objArr[10], (TextView) objArr[15]);
        this.S = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.R = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.S != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.S = 1L;
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
            this.S = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public z3o(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 18, T, U));
    }
}
