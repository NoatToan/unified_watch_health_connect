package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public class pv6 extends ov6 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(bsi.E5, 1);
        sparseIntArray.put(bsi.E2, 2);
        sparseIntArray.put(bsi.l9, 3);
        sparseIntArray.put(bsi.L5, 4);
        sparseIntArray.put(bsi.M2, 5);
        sparseIntArray.put(bsi.F9, 6);
        sparseIntArray.put(bsi.O5, 7);
        sparseIntArray.put(bsi.J2, 8);
        sparseIntArray.put(bsi.n8, 9);
    }

    public pv6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[2], (ImageView) objArr[8], (ImageView) objArr[5], (LinearLayout) objArr[0], (RelativeLayout) objArr[1], (RelativeLayout) objArr[7], (RelativeLayout) objArr[4], (TextView) objArr[9], (TextView) objArr[3], (TextView) objArr[6]);
        this.K = -1L;
        this.D.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 1L;
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
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public pv6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
