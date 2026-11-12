package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: loaded from: classes9.dex */
public class tob extends sob {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(eri.Dk, 1);
        sparseIntArray.put(eri.Ll, 2);
        sparseIntArray.put(eri.Vj, 3);
        sparseIntArray.put(eri.d4, 4);
        sparseIntArray.put(eri.fn, 5);
        sparseIntArray.put(eri.F9, 6);
        sparseIntArray.put(eri.Fm, 7);
    }

    public tob(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[4], (FlexboxLayout) objArr[6], (LinearLayout) objArr[0], (TextView) objArr[3], (TextView) objArr[1], (TextView) objArr[2], (TextView) objArr[7], (TextView) objArr[5]);
        this.I = -1L;
        this.C.setTag(null);
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

    public tob(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
