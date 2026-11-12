package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.fitness.banner.export.view.MultipleStyleBannerView;
import com.xiaomi.fitness.mine.v4.MineV4ViewModel;
import com.xiaomi.fitness.mine.vip.MineVipView;
import com.xiaomi.fitness.mine.widget.MedalEntranceView;
import com.xiaomi.fitness.mine.widget.MineActivePKPlayChannelView;
import com.xiaomi.fitness.mine.widget.MineActivePKView;
import com.xiaomi.fitness.mine.widget.MineAssetsView;
import com.xiaomi.fitness.mine.widget.MineHabitView;
import com.xiaomi.fitness.mine.widget.MineUserInfoView;
import com.xiaomi.fitness.mine.widget.MineWeekReportView;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.view.HomeHeaderTabTitleView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes9.dex */
public class f1g extends d1g {
    public static final ViewDataBinding.i Y = null;
    public static final SparseIntArray Z;
    public final ConstraintLayout W;
    public long X;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Z = sparseIntArray;
        sparseIntArray.put(lri.r0, 1);
        sparseIntArray.put(lri.W0, 2);
        sparseIntArray.put(lri.T0, 3);
        sparseIntArray.put(lri.S0, 4);
        sparseIntArray.put(lri.b0, 5);
        sparseIntArray.put(lri.Z, 6);
        sparseIntArray.put(lri.s1, 7);
        sparseIntArray.put(lri.n0, 8);
        sparseIntArray.put(lri.C, 9);
        sparseIntArray.put(lri.o0, 10);
        sparseIntArray.put(lri.a0, 11);
        sparseIntArray.put(lri.w1, 12);
        sparseIntArray.put(lri.c, 13);
        sparseIntArray.put(lri.p0, 14);
        sparseIntArray.put(lri.P0, 15);
        sparseIntArray.put(lri.m0, 16);
        sparseIntArray.put(lri.U, 17);
        sparseIntArray.put(lri.T, 18);
        sparseIntArray.put(lri.s0, 19);
        sparseIntArray.put(lri.D, 20);
        sparseIntArray.put(lri.O, 21);
    }

    public f1g(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (MineActivePKView) objArr[13], (View) objArr[9], (RightArrowBindingSingleLineTextView) objArr[20], (RecyclerView) objArr[21], (ConstraintLayout) objArr[18], (MultipleStyleBannerView) objArr[17], (MineAssetsView) objArr[6], (MineHabitView) objArr[11], (MineUserInfoView) objArr[5], (MedalEntranceView) objArr[16], (ConstraintLayout) objArr[8], (View) objArr[10], (ConstraintLayout) objArr[14], (HomeHeaderTabTitleView) objArr[1], (TextView) objArr[19], (MineActivePKPlayChannelView) objArr[15], (LinearLayoutCompat) objArr[4], (NestedScrollView) objArr[3], (SpringBackLayout) objArr[2], (MineVipView) objArr[7], (MineWeekReportView) objArr[12]);
        this.X = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.W = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(MineV4ViewModel mineV4ViewModel) {
        this.V = mineV4ViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.X != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.X = 2L;
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
            this.X = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (gv1.c != i) {
            return false;
        }
        A0((MineV4ViewModel) obj);
        return true;
    }

    public f1g(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 22, Y, Z));
    }
}
