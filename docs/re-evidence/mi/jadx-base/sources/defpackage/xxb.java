package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.ecg.view.EcgCombineView;

/* JADX INFO: loaded from: classes9.dex */
public class xxb extends wxb {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(eri.s4, 1);
        sparseIntArray.put(eri.cj, 2);
        sparseIntArray.put(eri.nc, 3);
        sparseIntArray.put(eri.ce, 4);
        sparseIntArray.put(eri.Yd, 5);
        sparseIntArray.put(eri.hd, 6);
        sparseIntArray.put(eri.h3, 7);
        sparseIntArray.put(eri.u4, 8);
    }

    public xxb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[7], (ConstraintLayout) objArr[1], (EcgCombineView) objArr[8], (ConstraintLayout) objArr[0], (TextView) objArr[3], (RadioButton) objArr[6], (TextView) objArr[5], (ImageView) objArr[4], (TextView) objArr[2]);
        this.J = -1L;
        this.D.setTag(null);
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

    public xxb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
