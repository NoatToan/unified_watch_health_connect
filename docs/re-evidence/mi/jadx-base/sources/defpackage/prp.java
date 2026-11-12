package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public class prp extends orp {
    public static final ViewDataBinding.i U = null;
    public static final SparseIntArray V;
    public final ConstraintLayout S;
    public long T;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(bsi.f7, 1);
        sparseIntArray.put(bsi.Z1, 2);
        sparseIntArray.put(bsi.f4565b, 3);
        sparseIntArray.put(bsi.c, 4);
        sparseIntArray.put(bsi.d, 5);
        sparseIntArray.put(bsi.h4, 6);
        sparseIntArray.put(bsi.i4, 7);
        sparseIntArray.put(bsi.j4, 8);
        sparseIntArray.put(bsi.e6, 9);
        sparseIntArray.put(bsi.ha, 10);
        sparseIntArray.put(bsi.ia, 11);
        sparseIntArray.put(bsi.ja, 12);
        sparseIntArray.put(bsi.ea, 13);
        sparseIntArray.put(bsi.fa, 14);
        sparseIntArray.put(bsi.ga, 15);
        sparseIntArray.put(bsi.t7, 16);
        sparseIntArray.put(bsi.z4, 17);
        sparseIntArray.put(bsi.A4, 18);
    }

    public prp(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[3], (TextView) objArr[4], (TextView) objArr[5], (LinearLayout) objArr[2], (LinearLayout) objArr[6], (TextView) objArr[7], (TextView) objArr[8], (TextView) objArr[17], (TextView) objArr[18], (LinearLayout) objArr[9], (ConstraintLayout) objArr[1], (LinearLayout) objArr[16], (LinearLayout) objArr[13], (TextView) objArr[14], (TextView) objArr[15], (LinearLayout) objArr[10], (TextView) objArr[11], (TextView) objArr[12]);
        this.T = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.S = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.T != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.T = 1L;
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
            this.T = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public prp(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 19, U, V));
    }
}
