package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.electronic.scale.model.UserDataViewModel;
import com.xiaomi.fitness.electronic.scale.widget.NoSwipeViewPager;
import com.xiaomi.fitness.electronic.scale.widget.titlebar.TitleBarAlphaView;
import miuix.miuixbasewidget.widget.FilterSortView;

/* JADX INFO: loaded from: classes8.dex */
public class uk0 extends tk0 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final RelativeLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(bri.V1, 1);
        sparseIntArray.put(bri.W3, 2);
        sparseIntArray.put(bri.y, 3);
        sparseIntArray.put(bri.Z2, 4);
        sparseIntArray.put(bri.m2, 5);
        sparseIntArray.put(bri.w3, 6);
        sparseIntArray.put(bri.t0, 7);
        sparseIntArray.put(bri.k6, 8);
    }

    public uk0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[3], (FilterSortView) objArr[7], (LinearLayoutCompat) objArr[1], (LinearLayout) objArr[5], (RecyclerView) objArr[4], (RelativeLayout) objArr[6], (TitleBarAlphaView) objArr[2], (NoSwipeViewPager) objArr[8]);
        this.K = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.J = relativeLayout;
        relativeLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(UserDataViewModel userDataViewModel) {
        this.I = userDataViewModel;
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
            this.K = 2L;
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
        if (av1.d != i) {
            return false;
        }
        A0((UserDataViewModel) obj);
        return true;
    }

    public uk0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, L, M));
    }
}
