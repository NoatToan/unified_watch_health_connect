package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.amap.api.maps.MapView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.divider.MaterialDivider;
import com.mi.health.sport.TrackShareRoutineView;

/* JADX INFO: loaded from: classes10.dex */
public class vzn extends uzn {
    public static final ViewDataBinding.i X;
    public static final SparseIntArray Y;
    public final ConstraintLayout V;
    public long W;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(22);
        X = iVar;
        iVar.a(0, new String[]{"route_detail_progress"}, new int[]{5}, new int[]{dvi.I});
        iVar.a(1, new String[]{"sport_running_route_into_section_layout", "sport_route_detail_tab_layout", "sport_route_detail_ranking_container"}, new int[]{2, 3, 4}, new int[]{dvi.X0, dvi.Q0, dvi.O0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y = sparseIntArray;
        sparseIntArray.put(xri.v3, 6);
        sparseIntArray.put(xri.x5, 7);
        sparseIntArray.put(xri.M, 8);
        sparseIntArray.put(xri.N, 9);
        sparseIntArray.put(xri.z1, 10);
        sparseIntArray.put(xri.A1, 11);
        sparseIntArray.put(xri.Z3, 12);
        sparseIntArray.put(xri.a4, 13);
        sparseIntArray.put(xri.start_running_tab, 14);
        sparseIntArray.put(xri.start_running_btn, 15);
        sparseIntArray.put(xri.c, 16);
        sparseIntArray.put(xri.r2, 17);
        sparseIntArray.put(xri.F3, 18);
        sparseIntArray.put(xri.s2, 19);
        sparseIntArray.put(xri.E3, 20);
        sparseIntArray.put(xri.t2, 21);
    }

    public vzn(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 4, (ConstraintLayout) objArr[16], (AppBarLayout) objArr[8], (ConstraintLayout) objArr[9], (ConstraintLayout) objArr[1], (RelativeLayout) objArr[10], (ImageView) objArr[11], (CardView) objArr[17], (ImageView) objArr[19], (ImageView) objArr[21], (MapView) objArr[6], (MaterialDivider) objArr[20], (LinearLayout) objArr[18], (ConstraintLayout) objArr[12], (AppCompatTextView) objArr[13], (azk) objArr[5], (ozn) objArr[4], (yzn) objArr[2], (TrackShareRoutineView) objArr[7], (TextView) objArr[15], (RelativeLayout) objArr[14], (szn) objArr[3]);
        this.W = -1L;
        this.D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.V = constraintLayout;
        constraintLayout.setTag(null);
        k0(this.O);
        k0(this.P);
        k0(this.Q);
        k0(this.U);
        o0(view);
        H();
    }

    public final boolean A0(azk azkVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.W |= 1;
        }
        return true;
    }

    public final boolean B0(ozn oznVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.W |= 8;
        }
        return true;
    }

    public final boolean C0(yzn yznVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.W |= 4;
        }
        return true;
    }

    public final boolean D0(szn sznVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.W |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.W != 0) {
                    return true;
                }
                return this.Q.F() || this.U.F() || this.P.F() || this.O.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.W = 16L;
        }
        this.Q.H();
        this.U.H();
        this.P.H();
        this.O.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return A0((azk) obj, i2);
        }
        if (i == 1) {
            return D0((szn) obj, i2);
        }
        if (i == 2) {
            return C0((yzn) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return B0((ozn) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.Q.l0(lifecycleOwner);
        this.U.l0(lifecycleOwner);
        this.P.l0(lifecycleOwner);
        this.O.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.W = 0L;
        }
        ViewDataBinding.r(this.Q);
        ViewDataBinding.r(this.U);
        ViewDataBinding.r(this.P);
        ViewDataBinding.r(this.O);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public vzn(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 22, X, Y));
    }
}
