package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public class xnd extends wnd {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final LinearLayout O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(csi.U4, 1);
        sparseIntArray.put(csi.x1, 2);
        sparseIntArray.put(csi.N, 3);
        sparseIntArray.put(csi.E4, 4);
        sparseIntArray.put(csi.R3, 5);
        sparseIntArray.put(csi.x, 6);
        sparseIntArray.put(csi.w, 7);
        sparseIntArray.put(csi.y, 8);
        sparseIntArray.put(csi.T3, 9);
        sparseIntArray.put(csi.Y, 10);
        sparseIntArray.put(csi.a0, 11);
        sparseIntArray.put(csi.M3, 12);
        sparseIntArray.put(csi.o, 13);
        sparseIntArray.put(csi.p, 14);
    }

    public xnd(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[13], (TextView) objArr[14], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[8], (TextView) objArr[3], (TextView) objArr[10], (TextView) objArr[11], (ImageView) objArr[2], (TextView) objArr[12], (TextView) objArr[5], (TextView) objArr[9], (View) objArr[4], (TextView) objArr[1]);
        this.P = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.O = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.P = 1L;
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
            this.P = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public xnd(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 15, Q, R));
    }
}
