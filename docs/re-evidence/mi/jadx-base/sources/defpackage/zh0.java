package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.mi.health.sport.AmapRealTimePathView;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.view.widget.RunningSportMusicView;
import com.xiaomi.fitness.sport.view.widget.SportCommandView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class zh0 extends yh0 {
    public static final ViewDataBinding.i W;
    public static final SparseIntArray X;
    public final ConstraintLayout T;
    public final CoordinatorLayout U;
    public long V;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(19);
        W = iVar;
        iVar.a(1, new String[]{"layout_outdoor_running_title"}, new int[]{3}, new int[]{dvi.x});
        iVar.a(2, new String[]{"view_outdoor_sport_data"}, new int[]{4}, new int[]{dvi.J1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(xri.n, 5);
        sparseIntArray.put(xri.q3, 6);
        sparseIntArray.put(xri.t6, 7);
        sparseIntArray.put(xri.I5, 8);
        sparseIntArray.put(xri.F5, 9);
        sparseIntArray.put(xri.J5, 10);
        sparseIntArray.put(xri.j3, 11);
        sparseIntArray.put(xri.U3, 12);
        sparseIntArray.put(xri.g3, 13);
        sparseIntArray.put(xri.H5, 14);
        sparseIntArray.put(xri.o4, 15);
        sparseIntArray.put(xri.W0, 16);
        sparseIntArray.put(xri.r6, 17);
        sparseIntArray.put(xri.v0, 18);
    }

    public zh0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 2, (AmapRealTimePathView) objArr[5], (LottieAnimationView) objArr[18], (ImageView) objArr[16], (ImageView) objArr[13], (ImageView) objArr[11], (NestedScrollView) objArr[6], (ImageView) objArr[12], (uvq) objArr[4], (mae) objArr[3], (View) objArr[15], (LottieAnimationView) objArr[9], (RunningSportMusicView) objArr[14], (ConstraintLayout) objArr[8], (TextView) objArr[10], (SportCommandView) objArr[17], (ConstraintLayout) objArr[7], (ConstraintLayout) objArr[2]);
        this.V = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.T = constraintLayout;
        constraintLayout.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[1];
        this.U = coordinatorLayout;
        coordinatorLayout.setTag(null);
        k0(this.H);
        k0(this.I);
        this.Q.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.yh0
    public void B0(List<SportingItemData> list) {
        this.R = list;
        synchronized (this) {
            this.V |= 4;
        }
        notifyPropertyChanged(nv1.i);
        super.e0();
    }

    @Override // defpackage.yh0
    public void C0(Map<CommonSportModel.SportTitle, String> map) {
        this.S = map;
        synchronized (this) {
            this.V |= 8;
        }
        notifyPropertyChanged(nv1.f28392k);
        super.e0();
    }

    public final boolean D0(uvq uvqVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.V |= 1;
        }
        return true;
    }

    public final boolean E0(mae maeVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.V |= 2;
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
                return this.I.F() || this.H.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.V = 16L;
        }
        this.I.H();
        this.H.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return D0((uvq) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return E0((mae) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.I.l0(lifecycleOwner);
        this.H.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.V;
            this.V = 0L;
        }
        List<SportingItemData> list = this.R;
        Map<CommonSportModel.SportTitle, String> map = this.S;
        long j2 = 20 & j;
        long j3 = j & 24;
        if (j2 != 0) {
            this.H.A0(list);
        }
        if (j3 != 0) {
            this.H.B0(map);
        }
        ViewDataBinding.r(this.I);
        ViewDataBinding.r(this.H);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (nv1.i == i) {
            B0((List) obj);
        } else {
            if (nv1.f28392k != i) {
                return false;
            }
            C0((Map) obj);
        }
        return true;
    }

    public zh0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 19, W, X));
    }
}
