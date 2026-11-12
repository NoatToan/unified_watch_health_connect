package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.sleep.view.SleepAnimalShadowLayout;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes9.dex */
public class kbe extends jbe {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(eri.F8, 1);
        sparseIntArray.put(eri.Na, 2);
        sparseIntArray.put(eri.bn, 3);
        sparseIntArray.put(eri.s1, 4);
        sparseIntArray.put(eri.N1, 5);
        sparseIntArray.put(eri.d9, 6);
        sparseIntArray.put(eri.Rl, 7);
        sparseIntArray.put(eri.Ql, 8);
        sparseIntArray.put(eri.r1, 9);
        sparseIntArray.put(eri.K1, 10);
        sparseIntArray.put(eri.x5, 11);
        sparseIntArray.put(eri.h9, 12);
        sparseIntArray.put(eri.jm, 13);
        sparseIntArray.put(eri.km, 14);
        sparseIntArray.put(eri.lm, 15);
    }

    public kbe(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CardView) objArr[9], (CardView) objArr[4], (CardView) objArr[0], (ConstraintLayout) objArr[10], (ConstraintLayout) objArr[5], (SleepAnimalShadowLayout) objArr[11], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[6], (RoundImageView) objArr[12], (LinearLayout) objArr[2], (TextView) objArr[8], (TextView) objArr[7], (TextView) objArr[13], (TextView) objArr[14], (TextView) objArr[15], (TextView) objArr[3]);
        this.Q = -1L;
        this.C.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.Q != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Q = 1L;
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
            this.Q = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public kbe(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 16, R, S));
    }
}
