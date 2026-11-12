package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes8.dex */
public class ei9 extends di9 {
    public static final ViewDataBinding.i X = null;
    public static final SparseIntArray Y;
    public final SpringBackLayout V;
    public long W;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y = sparseIntArray;
        sparseIntArray.put(cri.C, 1);
        sparseIntArray.put(cri.f14645r, 2);
        sparseIntArray.put(cri.D, 3);
        sparseIntArray.put(cri.o, 4);
        sparseIntArray.put(cri.d, 5);
        sparseIntArray.put(cri.H, 6);
        sparseIntArray.put(cri.h, 7);
        sparseIntArray.put(cri.s, 8);
        sparseIntArray.put(cri.q, 9);
        sparseIntArray.put(cri.i, 10);
        sparseIntArray.put(cri.t, 11);
        sparseIntArray.put(cri.A, 12);
        sparseIntArray.put(cri.x, 13);
        sparseIntArray.put(cri.j, 14);
        sparseIntArray.put(cri.w, 15);
        sparseIntArray.put(cri.J, 16);
        sparseIntArray.put(cri.I, 17);
        sparseIntArray.put(cri.u, 18);
        sparseIntArray.put(cri.E, 19);
        sparseIntArray.put(cri.v, 20);
        sparseIntArray.put(cri.K, 21);
    }

    public ei9(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (EditText) objArr[5], (View) objArr[7], (View) objArr[10], (View) objArr[14], (TextView) objArr[4], (RecyclerView) objArr[9], (TextView) objArr[2], (TextView) objArr[8], (TextView) objArr[11], (ConstraintLayout) objArr[18], (CheckedTextView) objArr[20], (ConstraintLayout) objArr[15], (EditText) objArr[13], (EditText) objArr[12], (NestedScrollView) objArr[1], (LinearLayout) objArr[3], (TextView) objArr[19], (TextView) objArr[6], (TextView) objArr[17], (TextView) objArr[16], (TextView) objArr[21]);
        this.W = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.V = springBackLayout;
        springBackLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.W != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.W = 1L;
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
            this.W = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ei9(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 22, X, Y));
    }
}
