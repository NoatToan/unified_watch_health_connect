package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.calendar.view.DayThreeCircleFiveLineCalendarView;
import com.xiaomi.fitness.baseui.calendar.view.WeekBar;
import com.xiaomi.fitness.health.threetarget.view.ShareAccountInfoView;

/* JADX INFO: loaded from: classes9.dex */
public class hvb extends fvb {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public final RelativeLayout R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(eri.W0, 1);
        sparseIntArray.put(eri.Le, 2);
        sparseIntArray.put(eri.n0, 3);
        sparseIntArray.put(eri.p0, 4);
        sparseIntArray.put(eri.l, 5);
        sparseIntArray.put(eri.m1, 6);
        sparseIntArray.put(eri.w9, 7);
        sparseIntArray.put(eri.v9, 8);
        sparseIntArray.put(eri.n1, 9);
        sparseIntArray.put(eri.qh, 10);
        sparseIntArray.put(eri.uh, 11);
        sparseIntArray.put(eri.th, 12);
        sparseIntArray.put(eri.sh, 13);
        sparseIntArray.put(eri.ld, 14);
        sparseIntArray.put(eri.md, 15);
        sparseIntArray.put(eri.pp, 16);
        sparseIntArray.put(eri.Ob, 17);
    }

    public hvb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ShareAccountInfoView) objArr[5], (CardView) objArr[3], (ConstraintLayout) objArr[4], (View) objArr[1], (LinearLayout) objArr[6], (TextView) objArr[9], (TextView) objArr[8], (TextView) objArr[7], (DayThreeCircleFiveLineCalendarView) objArr[17], (TextView) objArr[14], (TextView) objArr[15], (NestedScrollView) objArr[2], (LinearLayout) objArr[10], (TextView) objArr[13], (TextView) objArr[12], (TextView) objArr[11], (WeekBar) objArr[16]);
        this.S = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.R = relativeLayout;
        relativeLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.S != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.S = 1L;
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
            this.S = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public hvb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 18, T, U));
    }
}
