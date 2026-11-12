package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.curse.view.CurseDataHolder;
import com.xiaomi.fitness.health.curse.view.CurseMoreView;
import com.xiaomi.fitness.health.curse.view.CurseNoticeCardView;
import com.xiaomi.fitness.health.curse.view.CurseResetCardView;
import com.xiaomi.fitness.health.curse.view.CurseSymptomHolder;
import com.xiaomi.fitness.health.curse.view.CurseTempViewHolder;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes9.dex */
public class qnb extends pnb {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final SpringBackLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(eri.Le, 1);
        sparseIntArray.put(eri.M1, 2);
        sparseIntArray.put(eri.K2, 3);
        sparseIntArray.put(eri.d8, 4);
        sparseIntArray.put(eri.c8, 5);
        sparseIntArray.put(eri.pc, 6);
        sparseIntArray.put(eri.Zd, 7);
        sparseIntArray.put(eri.Wc, 8);
        sparseIntArray.put(eri.Ph, 9);
        sparseIntArray.put(eri.w2, 10);
        sparseIntArray.put(eri.L5, 11);
        sparseIntArray.put(eri.x9, 12);
    }

    public qnb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[2], (CurseTempViewHolder) objArr[10], (CurseDataHolder) objArr[3], (HealthBannerCardSetView) objArr[11], (CurseNoticeCardView) objArr[5], (CurseNoticeCardView) objArr[4], (CurseMoreView) objArr[12], (CurseNoticeCardView) objArr[6], (CurseResetCardView) objArr[8], (CurseResetCardView) objArr[7], (NestedScrollView) objArr[1], (CurseSymptomHolder) objArr[9]);
        this.N = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.M = springBackLayout;
        springBackLayout.setTag(null);
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

    public qnb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 13, O, P));
    }
}
