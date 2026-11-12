package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.sport_eco.bean.SportingItemData;
import com.xiaomi.fitness.sport_eco.model.CommonSportModel;
import com.xiaomi.fitness.sport_eco.utils.StringUtils;
import com.xiaomi.fitness.sport_eco.view.lockscreen.ui.LockUnderView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ox7 extends nx7 {
    public static final ViewDataBinding.i M;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(9);
        M = iVar;
        iVar.a(2, new String[]{"eco_lock_view_sport_title", "eco_lock_view_out_sport_data"}, new int[]{3, 4}, new int[]{fvi.f18293r, fvi.q});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(zri.e1, 5);
        sparseIntArray.put(zri.p3, 6);
        sparseIntArray.put(zri.r3, 7);
        sparseIntArray.put(zri.t3, 8);
    }

    public ox7(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 2, (TextView) objArr[1], (LinearLayout) objArr[2], (LockUnderView) objArr[5], (wu7) objArr[4], (yu7) objArr[3], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[8]);
        this.L = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        k0(this.D);
        k0(this.E);
        o0(view);
        H();
    }

    @Override // defpackage.nx7
    public void B0(List<SportingItemData> list) {
        this.I = list;
        synchronized (this) {
            this.L |= 8;
        }
        notifyPropertyChanged(pv1.g);
        super.e0();
    }

    @Override // defpackage.nx7
    public void C0(Map<CommonSportModel.SportTitle, String> map) {
        this.J = map;
        synchronized (this) {
            this.L |= 4;
        }
        notifyPropertyChanged(pv1.h);
        super.e0();
    }

    public final boolean D0(wu7 wu7Var, int i) {
        if (i != pv1.f30813a) {
            return false;
        }
        synchronized (this) {
            this.L |= 2;
        }
        return true;
    }

    public final boolean E0(yu7 yu7Var, int i) {
        if (i != pv1.f30813a) {
            return false;
        }
        synchronized (this) {
            this.L |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.L != 0) {
                    return true;
                }
                return this.E.F() || this.D.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 16L;
        }
        this.E.H();
        this.D.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return E0((yu7) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return D0((wu7) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.E.l0(lifecycleOwner);
        this.D.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        Map<CommonSportModel.SportTitle, String> map = this.J;
        List<SportingItemData> list = this.I;
        long j2 = j & 20;
        int i = 0;
        String str = null;
        if (j2 != 0) {
            str = map != null ? map.get(CommonSportModel.SportTitle.connectDevice) : null;
            boolean zIsBlank = StringUtils.isBlank(str);
            if (j2 != 0) {
                j |= zIsBlank ? 64L : 32L;
            }
            if (zIsBlank) {
                i = 8;
            }
        }
        long j3 = 24 & j;
        if ((j & 20) != 0) {
            r8p.b(this.A, str);
            this.A.setVisibility(i);
            this.E.A0(map);
        }
        if (j3 != 0) {
            this.D.A0(list);
        }
        ViewDataBinding.r(this.E);
        ViewDataBinding.r(this.D);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (pv1.h == i) {
            C0((Map) obj);
        } else {
            if (pv1.g != i) {
                return false;
            }
            B0((List) obj);
        }
        return true;
    }

    public ox7(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, M, N));
    }
}
