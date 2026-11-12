package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes5.dex */
public class crf extends brf {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(rqi.d, 1);
        sparseIntArray.put(rqi.e, 2);
        sparseIntArray.put(rqi.i, 3);
        sparseIntArray.put(rqi.f32801a, 4);
        sparseIntArray.put(rqi.f32802b, 5);
        sparseIntArray.put(rqi.l, 6);
        sparseIntArray.put(rqi.f32803k, 7);
        sparseIntArray.put(rqi.f, 8);
    }

    public crf(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Barrier) objArr[4], (Barrier) objArr[5], (FrameLayout) objArr[1], (RoundImageView) objArr[2], (ImageView) objArr[8], (TextView) objArr[3], (TextView) objArr[7], (TextView) objArr[6]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
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

    public crf(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
