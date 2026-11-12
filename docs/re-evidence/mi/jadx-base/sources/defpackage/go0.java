package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.sleep.view.SleepAnimalShadowLayout;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes9.dex */
public class go0 extends fo0 {
    public static final ViewDataBinding.i g0 = null;
    public static final SparseIntArray h0;
    public final LinearLayout e0;
    public long f0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        h0 = sparseIntArray;
        sparseIntArray.put(eri.t1, 1);
        sparseIntArray.put(eri.L1, 2);
        sparseIntArray.put(eri.F8, 3);
        sparseIntArray.put(eri.M1, 4);
        sparseIntArray.put(eri.q9, 5);
        sparseIntArray.put(eri.pn, 6);
        sparseIntArray.put(eri.Wm, 7);
        sparseIntArray.put(eri.gk, 8);
        sparseIntArray.put(eri.ik, 9);
        sparseIntArray.put(eri.fk, 10);
        sparseIntArray.put(eri.Xe, 11);
        sparseIntArray.put(eri.w8, 12);
        sparseIntArray.put(eri.x8, 13);
        sparseIntArray.put(eri.jk, 14);
        sparseIntArray.put(eri.kk, 15);
        sparseIntArray.put(eri.m9, 16);
        sparseIntArray.put(eri.l9, 17);
        sparseIntArray.put(eri.f5, 18);
        sparseIntArray.put(eri.ge, 19);
        sparseIntArray.put(eri.y7, 20);
        sparseIntArray.put(eri.Hn, 21);
        sparseIntArray.put(eri.je, 22);
        sparseIntArray.put(eri.M7, 23);
        sparseIntArray.put(eri.Tn, 24);
        sparseIntArray.put(eri.ie, 25);
        sparseIntArray.put(eri.N7, 26);
        sparseIntArray.put(eri.Un, 27);
        sparseIntArray.put(eri.he, 28);
        sparseIntArray.put(eri.L7, 29);
        sparseIntArray.put(eri.Sn, 30);
    }

    public go0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CardView) objArr[1], (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[4], (FrameLayout) objArr[18], (ImageView) objArr[20], (ImageView) objArr[29], (ImageView) objArr[23], (ImageView) objArr[26], (RoundImageView) objArr[12], (AppCompatImageView) objArr[13], (AppCompatImageView) objArr[3], (ImageView) objArr[17], (ImageView) objArr[16], (RoundImageView) objArr[5], (RelativeLayout) objArr[19], (RelativeLayout) objArr[28], (RelativeLayout) objArr[25], (RelativeLayout) objArr[22], (SleepAnimalShadowLayout) objArr[11], (TextView) objArr[10], (TextView) objArr[8], (TextView) objArr[9], (TextView) objArr[14], (TextView) objArr[15], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[21], (TextView) objArr[30], (TextView) objArr[24], (TextView) objArr[27]);
        this.f0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.e0 = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.f0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.f0 = 1L;
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
            this.f0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public go0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 31, g0, h0));
    }
}
