package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class s1c extends r1c {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final LinearLayoutCompat G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(eri.s8, 1);
        sparseIntArray.put(eri.Le, 2);
        sparseIntArray.put(eri.Sj, 3);
        sparseIntArray.put(eri.Pj, 4);
        sparseIntArray.put(eri.Oj, 5);
        sparseIntArray.put(eri.Nj, 6);
    }

    public s1c(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (AppCompatImageView) objArr[1], (NestedScrollView) objArr[2], (TextView) objArr[6], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[3]);
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

    public s1c(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
