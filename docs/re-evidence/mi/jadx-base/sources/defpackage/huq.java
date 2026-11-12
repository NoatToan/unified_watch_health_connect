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
public class huq extends guq {
    public static final ViewDataBinding.i M;
    public static final SparseIntArray N;
    public final ConstraintLayout H;
    public final iuq I;
    public final FrameLayout J;
    public final etq K;
    public long L;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(9);
        M = iVar;
        iVar.a(0, new String[]{"view_jumping_title"}, new int[]{6}, new int[]{fvi.B0});
        iVar.a(4, new String[]{"view_jumping_sport_target"}, new int[]{7}, new int[]{fvi.A0});
        iVar.a(5, new String[]{"view_eco_sport_data"}, new int[]{8}, new int[]{fvi.x0});
        N = null;
    }

    public huq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (FrameLayout) objArr[4], (TextView) objArr[2], (TextView) objArr[1], (kuq) objArr[6], (TextView) objArr[3]);
        this.L = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        iuq iuqVar = (iuq) objArr[7];
        this.I = iuqVar;
        k0(iuqVar);
        FrameLayout frameLayout = (FrameLayout) objArr[5];
        this.J = frameLayout;
        frameLayout.setTag(null);
        etq etqVar = (etq) objArr[8];
        this.K = etqVar;
        k0(etqVar);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        k0(this.D);
        this.E.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.guq
    public void A0(List<SportingItemData> list) {
        this.F = list;
        synchronized (this) {
            this.L |= 2;
        }
        notifyPropertyChanged(pv1.g);
        super.e0();
    }

    @Override // defpackage.guq
    public void B0(Map<CommonSportModel.SportTitle, String> map) {
        this.G = map;
        synchronized (this) {
            this.L |= 4;
        }
        notifyPropertyChanged(pv1.h);
        super.e0();
    }

    public final boolean C0(kuq kuqVar, int i) {
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
                return this.D.F() || this.I.F() || this.K.F();
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
        this.D.H();
        this.I.H();
        this.K.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return C0((kuq) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.D.l0(lifecycleOwner);
        this.I.l0(lifecycleOwner);
        this.K.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        String str;
        String str2;
        int i;
        String str3;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        List<SportingItemData> list = this.F;
        Map<CommonSportModel.SportTitle, String> map = this.G;
        long j2 = j & 12;
        String str4 = null;
        int i2 = 0;
        if (j2 != 0) {
            if (map != null) {
                String str5 = map.get(CommonSportModel.SportTitle.majorData);
                String str6 = map.get(CommonSportModel.SportTitle.progressDetail);
                str = map.get(CommonSportModel.SportTitle.unit);
                str2 = map.get(CommonSportModel.SportTitle.groupData);
                str3 = str5;
                str4 = str6;
            } else {
                str3 = null;
                str = null;
                str2 = null;
            }
            boolean z = str4 == null;
            boolean z2 = str2 == null;
            if (j2 != 0) {
                j |= z ? 128L : 64L;
            }
            if ((j & 12) != 0) {
                j |= z2 ? 32L : 16L;
            }
            int i3 = z ? 8 : 0;
            i = z2 ? 8 : 0;
            i2 = i3;
            str4 = str3;
        } else {
            str = null;
            str2 = null;
            i = 0;
        }
        if ((12 & j) != 0) {
            this.I.A0(map);
            this.A.setVisibility(i2);
            r8p.b(this.B, str4);
            r8p.b(this.C, str2);
            this.C.setVisibility(i);
            this.D.A0(map);
            r8p.b(this.E, str);
        }
        if ((j & 10) != 0) {
            this.K.A0(list);
        }
        ViewDataBinding.r(this.D);
        ViewDataBinding.r(this.I);
        ViewDataBinding.r(this.K);
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

    public huq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, M, N));
    }
}
