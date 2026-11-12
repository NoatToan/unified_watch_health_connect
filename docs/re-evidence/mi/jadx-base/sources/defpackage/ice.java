package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class ice extends hce {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final FrameLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(eri.ga, 1);
        sparseIntArray.put(eri.bn, 2);
        sparseIntArray.put(eri.Mm, 3);
        sparseIntArray.put(eri.r7, 4);
        sparseIntArray.put(eri.fa, 5);
        sparseIntArray.put(eri.Em, 6);
        sparseIntArray.put(eri.Dm, 7);
        sparseIntArray.put(eri.Fg, 8);
    }

    public ice(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (AppCompatImageView) objArr[4], (ConstraintLayout) objArr[5], (ConstraintLayout) objArr[1], (LinearLayout) objArr[8], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[3], (TextView) objArr[2]);
        this.J = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.I = frameLayout;
        frameLayout.setTag(null);
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

    public ice(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
