package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class z7e extends y7e {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(eri.O7, 1);
        sparseIntArray.put(eri.ao, 2);
        sparseIntArray.put(eri.N0, 3);
        sparseIntArray.put(eri.Cn, 4);
        sparseIntArray.put(eri.M2, 5);
    }

    public z7e(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayoutCompat) objArr[0], (LinearLayout) objArr[3], (TextView) objArr[5], (ImageView) objArr[1], (TextView) objArr[4], (TextView) objArr[2]);
        this.G = -1L;
        this.A.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.G = 1L;
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
            this.G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public z7e(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, H, I));
    }
}
