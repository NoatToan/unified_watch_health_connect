package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public class a6o extends z5o {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(xri.H3, 1);
        sparseIntArray.put(xri.m7, 2);
        sparseIntArray.put(xri.q8, 3);
        sparseIntArray.put(xri.i, 4);
        sparseIntArray.put(xri.j, 5);
        sparseIntArray.put(xri.g, 6);
    }

    public a6o(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[6], (ImageView) objArr[4], (TextView) objArr[5], (ConstraintLayout) objArr[0], (ImageView) objArr[1], (TextView) objArr[2], (DividerView) objArr[3]);
        this.I = -1L;
        this.D.setTag(null);
        o0(view);
        H();
    }

    public void A0(String str) {
        this.H = str;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.I = 2L;
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
            this.I = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (nv1.d != i) {
            return false;
        }
        A0((String) obj);
        return true;
    }

    public a6o(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, J, K));
    }
}
