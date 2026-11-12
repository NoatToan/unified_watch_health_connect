package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.sport_eco.bean.SportingItemData;
import com.xiaomi.fitness.sport_eco.model.CommonSportModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class tz7 extends sz7 {
    public static final ViewDataBinding.i L;
    public static final SparseIntArray M;
    public final ConstraintLayout G;
    public final qsq H;
    public final FrameLayout I;
    public final etq J;
    public long K;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(8);
        L = iVar;
        iVar.a(0, new String[]{"view_eco_indoor_title"}, new int[]{5}, new int[]{fvi.p0});
        iVar.a(3, new String[]{"view_eco_indoor_sport_target"}, new int[]{6}, new int[]{fvi.o0});
        iVar.a(4, new String[]{"view_eco_sport_data"}, new int[]{7}, new int[]{fvi.x0});
        M = null;
    }

    public tz7(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (FrameLayout) objArr[3], (TextView) objArr[1], (ssq) objArr[5], (TextView) objArr[2]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        qsq qsqVar = (qsq) objArr[6];
        this.H = qsqVar;
        k0(qsqVar);
        FrameLayout frameLayout = (FrameLayout) objArr[4];
        this.I = frameLayout;
        frameLayout.setTag(null);
        etq etqVar = (etq) objArr[7];
        this.J = etqVar;
        k0(etqVar);
        this.A.setTag(null);
        this.B.setTag(null);
        k0(this.C);
        this.D.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.sz7
    public void A0(List<SportingItemData> list) {
        this.E = list;
        synchronized (this) {
            this.K |= 4;
        }
        notifyPropertyChanged(pv1.g);
        super.e0();
    }

    @Override // defpackage.sz7
    public void B0(Map<CommonSportModel.SportTitle, String> map) {
        this.F = map;
        synchronized (this) {
            this.K |= 2;
        }
        notifyPropertyChanged(pv1.h);
        super.e0();
    }

    public final boolean C0(ssq ssqVar, int i) {
        if (i != pv1.f30813a) {
            return false;
        }
        synchronized (this) {
            this.K |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.K != 0) {
                    return true;
                }
                return this.C.F() || this.H.F() || this.J.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 8L;
        }
        this.C.H();
        this.H.H();
        this.J.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return C0((ssq) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.C.l0(lifecycleOwner);
        this.H.l0(lifecycleOwner);
        this.J.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.K;
            this.K = 0L;
        }
        Map<CommonSportModel.SportTitle, String> map = this.F;
        List<SportingItemData> list = this.E;
        long j2 = j & 10;
        int i = 0;
        String str3 = null;
        if (j2 != 0) {
            if (map != null) {
                String str4 = map.get(CommonSportModel.SportTitle.majorData);
                String str5 = map.get(CommonSportModel.SportTitle.progressDetail);
                str = map.get(CommonSportModel.SportTitle.unit);
                str2 = str4;
                str3 = str5;
            } else {
                str2 = null;
                str = null;
            }
            boolean z = str3 == null;
            if (j2 != 0) {
                j |= z ? 32L : 16L;
            }
            i = z ? 8 : 0;
            str3 = str2;
        } else {
            str = null;
        }
        long j3 = 12 & j;
        if ((j & 10) != 0) {
            this.H.A0(map);
            this.A.setVisibility(i);
            r8p.b(this.B, str3);
            this.C.A0(map);
            r8p.b(this.D, str);
        }
        if (j3 != 0) {
            this.J.A0(list);
        }
        ViewDataBinding.r(this.C);
        ViewDataBinding.r(this.H);
        ViewDataBinding.r(this.J);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (pv1.h == i) {
            B0((Map) obj);
        } else {
            if (pv1.g != i) {
                return false;
            }
            A0((List) obj);
        }
        return true;
    }

    public tz7(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, L, M));
    }
}
