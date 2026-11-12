package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.sleep.view.SleepAnimalShadowLayout;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes9.dex */
public class jyb extends iyb {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final ConstraintLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(eri.Rl, 1);
        sparseIntArray.put(eri.Ql, 2);
        sparseIntArray.put(eri.sl, 3);
        sparseIntArray.put(eri.ul, 4);
        sparseIntArray.put(eri.tl, 5);
        sparseIntArray.put(eri.rl, 6);
        sparseIntArray.put(eri.Ve, 7);
        sparseIntArray.put(eri.V8, 8);
        sparseIntArray.put(eri.We, 9);
        sparseIntArray.put(eri.d9, 10);
        sparseIntArray.put(eri.i0, 11);
        sparseIntArray.put(eri.gn, 12);
    }

    public jyb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Barrier) objArr[11], (RoundImageView) objArr[8], (AppCompatImageView) objArr[10], (SleepAnimalShadowLayout) objArr[7], (RelativeLayout) objArr[9], (TextView) objArr[6], (TextView) objArr[3], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[2], (TextView) objArr[1], (AppCompatTextView) objArr[12]);
        this.N = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.N != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.N = 1L;
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
            this.N = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public jyb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 13, O, P));
    }
}
