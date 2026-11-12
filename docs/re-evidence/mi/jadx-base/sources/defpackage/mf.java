package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public class mf extends jf {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final LinearLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(csi.D0, 1);
        sparseIntArray.put(csi.e0, 2);
        sparseIntArray.put(csi.W4, 3);
        sparseIntArray.put(csi.b2, 4);
        sparseIntArray.put(csi.a2, 5);
        sparseIntArray.put(csi.G1, 6);
        sparseIntArray.put(csi.f1, 7);
    }

    public mf(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[2], (TextView) objArr[1], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[5], (LinearLayout) objArr[4], (TextView) objArr[3]);
        this.I = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.H = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
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
            this.I = 1L;
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
        return true;
    }

    public mf(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
