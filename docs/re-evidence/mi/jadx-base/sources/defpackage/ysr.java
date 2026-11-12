package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes2.dex */
public class ysr extends xsr {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final LinearLayoutCompat G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(psi.f30710r, 1);
        sparseIntArray.put(psi.H, 2);
        sparseIntArray.put(psi.s, 3);
        sparseIntArray.put(psi.M, 4);
        sparseIntArray.put(psi.o, 5);
        sparseIntArray.put(psi.K, 6);
    }

    public ysr(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Button) objArr[5], (Button) objArr[1], (Button) objArr[3], (TextView) objArr[2], (TextView) objArr[6], (Button) objArr[4]);
        this.H = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.G = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.H = 1L;
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
            this.H = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ysr(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
