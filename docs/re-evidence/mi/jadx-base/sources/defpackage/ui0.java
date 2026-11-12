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
public class ui0 extends ri0 {
    public static final ViewDataBinding.i a0;
    public static final SparseIntArray b0;
    public final sz7 X;
    public final ConstraintLayout Y;
    public long Z;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(4);
        a0 = iVar;
        iVar.a(0, new String[]{"eco_view_indoor_sport"}, new int[]{1}, new int[]{fvi.O});
        SparseIntArray sparseIntArray = new SparseIntArray();
        b0 = sparseIntArray;
        sparseIntArray.put(zri.n2, 2);
        sparseIntArray.put(zri.f1, 3);
    }

    public ui0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, null, null, null, null, null, null, null, null, (LottieAnimationView) objArr[3], null, null, null, null, null, null, null, (SportCommandView) objArr[2], null, null, null, null);
        this.Z = -1L;
        sz7 sz7Var = (sz7) objArr[1];
        this.X = sz7Var;
        k0(sz7Var);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Y = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    private boolean C0(vsq vsqVar, int i) {
        if (i != pv1.f30813a) {
            return false;
        }
        synchronized (this) {
            this.Z |= 1;
        }
        return true;
    }

    @Override // defpackage.ri0
    public void A0(List<SportingItemData> list) {
        this.V = list;
        synchronized (this) {
            this.Z |= 2;
        }
        notifyPropertyChanged(pv1.g);
        super.e0();
    }

    @Override // defpackage.ri0
    public void B0(Map<CommonSportModel.SportTitle, String> map) {
        this.W = map;
        synchronized (this) {
            this.Z |= 4;
        }
        notifyPropertyChanged(pv1.h);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.Z != 0) {
                    return true;
                }
                return this.X.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Z = 8L;
        }
        this.X.H();
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
        this.X.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.Z;
            this.Z = 0L;
        }
        List<SportingItemData> list = this.V;
        Map<CommonSportModel.SportTitle, String> map = this.W;
        long j2 = 10 & j;
        long j3 = j & 12;
        if (j2 != 0) {
            this.X.A0(list);
        }
        if (j3 != 0) {
            this.X.B0(map);
        }
        ViewDataBinding.r(this.X);
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

    public ui0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, a0, b0));
    }
}
