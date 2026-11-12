package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.xiaomi.fitness.sport_eco.bean.SportingItemData;
import com.xiaomi.fitness.sport_eco.model.CommonSportModel;
import com.xiaomi.fitness.sport_eco.view.widget.SportCommandView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class an0 extends ym0 {
    public static final ViewDataBinding.i X;
    public static final SparseIntArray Y;
    public final guq U;
    public final ConstraintLayout V;
    public long W;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(4);
        X = iVar;
        iVar.a(0, new String[]{"view_jumping_sport"}, new int[]{1}, new int[]{fvi.z0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y = sparseIntArray;
        sparseIntArray.put(zri.n2, 2);
        sparseIntArray.put(zri.f1, 3);
    }

    public an0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, null, null, null, null, null, (LottieAnimationView) objArr[3], null, null, null, null, null, null, null, (SportCommandView) objArr[2], null, null, null, null);
        this.W = -1L;
        guq guqVar = (guq) objArr[1];
        this.U = guqVar;
        k0(guqVar);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.V = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    private boolean C0(vsq vsqVar, int i) {
        if (i != pv1.f30813a) {
            return false;
        }
        synchronized (this) {
            this.W |= 1;
        }
        return true;
    }

    @Override // defpackage.ym0
    public void A0(List<SportingItemData> list) {
        this.S = list;
        synchronized (this) {
            this.W |= 2;
        }
        notifyPropertyChanged(pv1.g);
        super.e0();
    }

    @Override // defpackage.ym0
    public void B0(Map<CommonSportModel.SportTitle, String> map) {
        this.T = map;
        synchronized (this) {
            this.W |= 4;
        }
        notifyPropertyChanged(pv1.h);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.W != 0) {
                    return true;
                }
                return this.U.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.W = 8L;
        }
        this.U.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return C0((vsq) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.U.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.W;
            this.W = 0L;
        }
        List<SportingItemData> list = this.S;
        Map<CommonSportModel.SportTitle, String> map = this.T;
        long j2 = 10 & j;
        long j3 = j & 12;
        if (j2 != 0) {
            this.U.A0(list);
        }
        if (j3 != 0) {
            this.U.B0(map);
        }
        ViewDataBinding.r(this.U);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (pv1.g == i) {
            A0((List) obj);
        } else {
            if (pv1.h != i) {
                return false;
            }
            B0((Map) obj);
        }
        return true;
    }

    public an0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, X, Y));
    }
}
