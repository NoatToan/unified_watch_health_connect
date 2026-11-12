package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class iqe extends hqe {
    public static final ViewDataBinding.i d0 = null;
    public static final SparseIntArray e0;
    public final LinearLayout b0;
    public long c0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e0 = sparseIntArray;
        sparseIntArray.put(gri.d0, 1);
        sparseIntArray.put(gri.c0, 2);
        sparseIntArray.put(gri.common_hint_des, 3);
        sparseIntArray.put(gri.j, 4);
        sparseIntArray.put(gri.M, 5);
        sparseIntArray.put(gri.f19270k, 6);
        sparseIntArray.put(gri.f19268a, 7);
        sparseIntArray.put(gri.U, 8);
        sparseIntArray.put(gri.d, 9);
        sparseIntArray.put(gri.e, 10);
        sparseIntArray.put(gri.f19269b, 11);
        sparseIntArray.put(gri.c, 12);
        sparseIntArray.put(gri.f, 13);
        sparseIntArray.put(gri.g, 14);
        sparseIntArray.put(gri.y, 15);
        sparseIntArray.put(gri.A, 16);
        sparseIntArray.put(gri.b0, 17);
        sparseIntArray.put(gri.Y, 18);
        sparseIntArray.put(gri.X, 19);
        sparseIntArray.put(gri.W, 20);
        sparseIntArray.put(gri.T, 21);
        sparseIntArray.put(gri.l0, 22);
        sparseIntArray.put(gri.z, 23);
        sparseIntArray.put(gri.a0, 24);
        sparseIntArray.put(gri.V, 25);
        sparseIntArray.put(gri.Z, 26);
        sparseIntArray.put(gri.i0, 27);
    }

    public iqe(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CheckBox) objArr[7], (CheckBox) objArr[11], (TextView) objArr[12], (CheckBox) objArr[9], (TextView) objArr[10], (CheckBox) objArr[13], (TextView) objArr[14], (LinearLayout) objArr[4], (LinearLayout) objArr[6], (TextView) objArr[3], (LinearLayout) objArr[15], (CheckBox) objArr[23], (CheckBox) objArr[16], (LinearLayout) objArr[5], (TextView) objArr[21], (TextView) objArr[8], (TextView) objArr[25], (CheckBox) objArr[20], (LinearLayout) objArr[19], (TextView) objArr[18], (TextView) objArr[26], (TextView) objArr[24], (TextView) objArr[17], (TextView) objArr[2], (TextView) objArr[1], (TextView) objArr[27], (LinearLayout) objArr[22]);
        this.c0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.b0 = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.c0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.c0 = 1L;
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
            this.c0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public iqe(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 28, d0, e0));
    }
}
