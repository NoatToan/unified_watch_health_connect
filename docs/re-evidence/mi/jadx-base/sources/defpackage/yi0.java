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
public class yi0 extends wi0 {
    public static final ViewDataBinding.i Z;
    public static final SparseIntArray a0;
    public final sz7 W;
    public final ConstraintLayout X;
    public long Y;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(4);
        Z = iVar;
        iVar.a(0, new String[]{"eco_view_indoor_sport"}, new int[]{1}, new int[]{fvi.O});
        SparseIntArray sparseIntArray = new SparseIntArray();
        a0 = sparseIntArray;
        sparseIntArray.put(zri.n2, 2);
        sparseIntArray.put(zri.f1, 3);
    }

    public yi0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, null, null, null, null, null, null, null, (LottieAnimationView) objArr[3], null, null, null, null, null, null, null, (SportCommandView) objArr[2], null, null, null, null);
        this.Y = -1L;
        sz7 sz7Var = (sz7) objArr[1];
        this.W = sz7Var;
        k0(sz7Var);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.X = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    private boolean C0(vsq vsqVar, int i) {
        if (i != pv1.f30813a) {
            return false;
        }
        synchronized (this) {
            this.Y |= 1;
        }
        return true;
    }

    @Override // defpackage.wi0
    public void A0(List<SportingItemData> list) {
        this.U = list;
        synchronized (this) {
            this.Y |= 2;
        }
        notifyPropertyChanged(pv1.g);
        super.e0();
    }

    @Override // defpackage.wi0
    public void B0(Map<CommonSportModel.SportTitle, String> map) {
        this.V = map;
        synchronized (this) {
            this.Y |= 4;
        }
        notifyPropertyChanged(pv1.h);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.Y != 0) {
                    return true;
                }
                return this.W.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Y = 8L;
        }
        this.W.H();
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
        this.W.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.Y;
            this.Y = 0L;
        }
        List<SportingItemData> list = this.U;
        Map<CommonSportModel.SportTitle, String> map = this.V;
        long j2 = 10 & j;
        long j3 = j & 12;
        if (j2 != 0) {
            this.W.A0(list);
        }
        if (j3 != 0) {
            this.W.B0(map);
        }
        ViewDataBinding.r(this.W);
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

    public yi0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, Z, a0));
    }
}
