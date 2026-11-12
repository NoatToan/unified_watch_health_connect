package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.view.widget.RunningSportMusicView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ytq extends xtq {
    public static final ViewDataBinding.i M;
    public static final SparseIntArray N;
    public final ConstraintLayout I;
    public final ztq J;
    public final axq K;
    public long L;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(9);
        M = iVar;
        iVar.a(0, new String[]{"view_indoor_title"}, new int[]{5}, new int[]{dvi.w1});
        iVar.a(3, new String[]{"view_indoor_sport_target"}, new int[]{6}, new int[]{dvi.v1});
        iVar.a(4, new String[]{"view_sport_data"}, new int[]{7}, new int[]{dvi.Q1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(xri.D2, 8);
    }

    public ytq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (FrameLayout) objArr[4], (RunningSportMusicView) objArr[8], (FrameLayout) objArr[3], (TextView) objArr[1], (buq) objArr[5], (TextView) objArr[2]);
        this.L = -1L;
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        ztq ztqVar = (ztq) objArr[6];
        this.J = ztqVar;
        k0(ztqVar);
        axq axqVar = (axq) objArr[7];
        this.K = axqVar;
        k0(axqVar);
        this.C.setTag(null);
        this.D.setTag(null);
        k0(this.E);
        this.F.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.xtq
    public void A0(List<SportingItemData> list) {
        this.G = list;
        synchronized (this) {
            this.L |= 2;
        }
        notifyPropertyChanged(nv1.i);
        super.e0();
    }

    @Override // defpackage.xtq
    public void B0(Map<CommonSportModel.SportTitle, String> map) {
        this.H = map;
        synchronized (this) {
            this.L |= 4;
        }
        notifyPropertyChanged(nv1.f28392k);
        super.e0();
    }

    public final boolean C0(buq buqVar, int i) {
        if (i != nv1.f28390a) {
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
                return this.E.F() || this.J.F() || this.K.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 8L;
        }
        this.E.H();
        this.J.H();
        this.K.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return C0((buq) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.E.l0(lifecycleOwner);
        this.J.l0(lifecycleOwner);
        this.K.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        List<SportingItemData> list = this.G;
        Map<CommonSportModel.SportTitle, String> map = this.H;
        long j2 = j & 12;
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
        if ((12 & j) != 0) {
            this.J.A0(map);
            this.C.setVisibility(i);
            r8p.b(this.D, str3);
            this.E.A0(map);
            r8p.b(this.F, str);
        }
        if ((j & 10) != 0) {
            this.K.A0(list);
        }
        ViewDataBinding.r(this.E);
        ViewDataBinding.r(this.J);
        ViewDataBinding.r(this.K);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (nv1.i == i) {
            A0((List) obj);
        } else {
            if (nv1.f28392k != i) {
                return false;
            }
            B0((Map) obj);
        }
        return true;
    }

    public ytq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, M, N));
    }
}
