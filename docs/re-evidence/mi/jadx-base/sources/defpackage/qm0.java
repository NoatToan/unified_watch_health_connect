package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.ecg.view.EcgCombineView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import com.xiaomi.fitness.view.TitleBarAlphaView;

/* JADX INFO: loaded from: classes9.dex */
public class qm0 extends pm0 {
    public static final ViewDataBinding.i g0 = null;
    public static final SparseIntArray h0;
    public final NestedScrollView e0;
    public long f0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        h0 = sparseIntArray;
        sparseIntArray.put(eri.dj, 1);
        sparseIntArray.put(eri.a7, 2);
        sparseIntArray.put(eri.ok, 3);
        sparseIntArray.put(eri.Fk, 4);
        sparseIntArray.put(eri.r4, 5);
        sparseIntArray.put(eri.q4, 6);
        sparseIntArray.put(eri.Q8, 7);
        sparseIntArray.put(eri.ja, 8);
        sparseIntArray.put(eri.n9, 9);
        sparseIntArray.put(eri.Z8, 10);
        sparseIntArray.put(eri.Om, 11);
        sparseIntArray.put(eri.Qm, 12);
        sparseIntArray.put(eri.Pm, 13);
        sparseIntArray.put(eri.d4, 14);
        sparseIntArray.put(eri.Rm, 15);
        sparseIntArray.put(eri.om, 16);
        sparseIntArray.put(eri.kl, 17);
        sparseIntArray.put(eri.Sm, 18);
        sparseIntArray.put(eri.pm, 19);
        sparseIntArray.put(eri.Tj, 20);
        sparseIntArray.put(eri.A9, 21);
        sparseIntArray.put(eri.H9, 22);
        sparseIntArray.put(eri.Mi, 23);
        sparseIntArray.put(eri.dl, 24);
        sparseIntArray.put(eri.dk, 25);
        sparseIntArray.put(eri.ck, 26);
        sparseIntArray.put(eri.ak, 27);
        sparseIntArray.put(eri.c4, 28);
        sparseIntArray.put(eri.ym, 29);
        sparseIntArray.put(eri.L5, 30);
    }

    public qm0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (View) objArr[28], (View) objArr[14], (EcgCombineView) objArr[6], (FrameLayout) objArr[5], (HealthBannerCardSetView) objArr[30], (RelativeLayout) objArr[2], (AppCompatImageView) objArr[7], (AppCompatImageView) objArr[10], (AppCompatImageView) objArr[9], (Barrier) objArr[21], (ConstraintLayout) objArr[22], (ConstraintLayout) objArr[8], (ConstraintLayout) objArr[23], (TitleBarAlphaView) objArr[1], (TextView) objArr[27], (TextView) objArr[26], (TextView) objArr[25], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[24], (TextView) objArr[17], (TextView) objArr[20], (TextView) objArr[16], (TextView) objArr[19], (TextView) objArr[29], (TextView) objArr[11], (TextView) objArr[13], (TextView) objArr[12], (TextView) objArr[15], (TextView) objArr[18]);
        this.f0 = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.e0 = nestedScrollView;
        nestedScrollView.setTag(null);
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

    public qm0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 31, g0, h0));
    }
}
