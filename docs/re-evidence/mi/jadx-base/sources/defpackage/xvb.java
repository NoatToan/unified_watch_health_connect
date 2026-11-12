package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public class xvb extends wvb {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(eri.m7, 1);
        sparseIntArray.put(eri.Ho, 2);
        sparseIntArray.put(eri.Go, 3);
        sparseIntArray.put(eri.h4, 4);
        sparseIntArray.put(eri.Do, 5);
        sparseIntArray.put(eri.Bo, 6);
        sparseIntArray.put(eri.Co, 7);
        sparseIntArray.put(eri.u, 8);
        sparseIntArray.put(eri.R3, 9);
    }

    public xvb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Button) objArr[8], (Button) objArr[9], (DividerView) objArr[4], (AppCompatImageView) objArr[1], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[5], (TextView) objArr[3], (TextView) objArr[2]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
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

    public xvb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
