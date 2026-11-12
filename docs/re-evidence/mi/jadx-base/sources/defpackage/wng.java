package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class wng extends vng {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final LinearLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(mri.u2, 1);
        sparseIntArray.put(mri.S2, 2);
        sparseIntArray.put(mri.R2, 3);
        sparseIntArray.put(mri.x1, 4);
        sparseIntArray.put(mri.y1, 5);
        sparseIntArray.put(mri.Q1, 6);
        sparseIntArray.put(mri.C4, 7);
        sparseIntArray.put(mri.R1, 8);
    }

    public wng(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[4], (RecyclerView) objArr[5], (TextView) objArr[6], (TextView) objArr[8], (LinearLayout) objArr[1], (GridView) objArr[3], (EditText) objArr[2], (TextView) objArr[7]);
        this.J = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.I = linearLayout;
        linearLayout.setTag(null);
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

    public wng(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
