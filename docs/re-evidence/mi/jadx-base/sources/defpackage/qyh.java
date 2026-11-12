package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes7.dex */
public class qyh extends pyh {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final RelativeLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(wqi.m, 1);
        sparseIntArray.put(wqi.J0, 2);
        sparseIntArray.put(wqi.A1, 3);
        sparseIntArray.put(wqi.o, 4);
        sparseIntArray.put(wqi.W, 5);
        sparseIntArray.put(wqi.L0, 6);
        sparseIntArray.put(wqi.z, 7);
        sparseIntArray.put(wqi.K0, 8);
        sparseIntArray.put(wqi.B1, 9);
    }

    public qyh(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[1], (AppCompatImageView) objArr[4], (View) objArr[7], (View) objArr[5], (RelativeLayout) objArr[2], (TextView) objArr[8], (AppCompatImageView) objArr[6], (View) objArr[3], (TextView) objArr[9]);
        this.K = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.J = relativeLayout;
        relativeLayout.setTag(null);
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

    public qyh(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
