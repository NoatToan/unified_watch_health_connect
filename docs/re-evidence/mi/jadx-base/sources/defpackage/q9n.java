package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.mi.health.sport.CreateRouteMap;
import com.mi.health.sport.TrackShareRoutineView;
import com.xiaomi.fitness.sport.baseui.TitleBar;
import miuix.miuixbasewidget.widget.FilterSortView;

/* JADX INFO: loaded from: classes10.dex */
public class q9n extends p9n {
    public static final ViewDataBinding.i W;
    public static final SparseIntArray X;
    public long V;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(21);
        W = iVar;
        iVar.a(1, new String[]{"layout_route_list_title"}, new int[]{2}, new int[]{dvi.y});
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(xri.x5, 3);
        sparseIntArray.put(xri.C7, 4);
        sparseIntArray.put(xri.r7, 5);
        sparseIntArray.put(xri.I1, 6);
        sparseIntArray.put(xri.t3, 7);
        sparseIntArray.put(xri.v3, 8);
        sparseIntArray.put(xri.Q0, 9);
        sparseIntArray.put(xri.w2, 10);
        sparseIntArray.put(xri.v2, 11);
        sparseIntArray.put(xri.T0, 12);
        sparseIntArray.put(xri.S0, 13);
        sparseIntArray.put(xri.R0, 14);
        sparseIntArray.put(xri.start_point_notice, 15);
        sparseIntArray.put(xri.q5, 16);
        sparseIntArray.put(xri.j3, 17);
        sparseIntArray.put(xri.I, 18);
        sparseIntArray.put(xri.f39392a, 19);
        sparseIntArray.put(xri.i3, 20);
    }

    public q9n(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (FrameLayout) objArr[19], (FrameLayout) objArr[18], (LinearLayoutCompat) objArr[9], (TextView) objArr[14], (CardView) objArr[13], (LinearLayoutCompat) objArr[12], (FilterSortView) objArr[6], (ImageView) objArr[11], (ImageView) objArr[10], (FrameLayout) objArr[20], (CardView) objArr[17], (FrameLayout) objArr[7], (CreateRouteMap) objArr[8], (CoordinatorLayout) objArr[0], (ImageView) objArr[16], (TrackShareRoutineView) objArr[3], (LinearLayoutCompat) objArr[15], (sae) objArr[2], (TitleBar) objArr[5], (LinearLayout) objArr[4], (FrameLayout) objArr[1]);
        this.V = -1L;
        this.N.setTag(null);
        k0(this.R);
        this.U.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(sae saeVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.V |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.V != 0) {
                    return true;
                }
                return this.R.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.V = 2L;
        }
        this.R.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((sae) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.R.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.V = 0L;
        }
        ViewDataBinding.r(this.R);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public q9n(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 21, W, X));
    }
}
