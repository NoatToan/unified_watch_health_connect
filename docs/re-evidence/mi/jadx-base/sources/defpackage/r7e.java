package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class r7e extends q7e {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final LinearLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(eri.qe, 1);
        sparseIntArray.put(eri.O7, 2);
        sparseIntArray.put(eri.ao, 3);
        sparseIntArray.put(eri.Cn, 4);
        sparseIntArray.put(eri.Ug, 5);
        sparseIntArray.put(eri.re, 6);
        sparseIntArray.put(eri.Zn, 7);
        sparseIntArray.put(eri.L, 8);
    }

    public r7e(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[8], (ImageView) objArr[2], (RelativeLayout) objArr[1], (RelativeLayout) objArr[6], (View) objArr[5], (TextView) objArr[4], (TextView) objArr[7], (TextView) objArr[3]);
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

    public r7e(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
