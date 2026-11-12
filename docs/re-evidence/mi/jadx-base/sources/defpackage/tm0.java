package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil;
import com.xiaomi.fitness.sport.view.wear.guide.SportBeanUiDataModel;
import com.xiaomi.fitness.sport.view.widget.SportCommandView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class tm0 extends rm0 {
    public static final ViewDataBinding.i n0;
    public static final SparseIntArray o0;
    public final ConstraintLayout l0;
    public long m0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(5);
        n0 = iVar;
        iVar.a(0, new String[]{"view_indoor_sport", "view_out_sport_data_realtime_running_posture"}, new int[]{1, 2}, new int[]{dvi.u1, dvi.H1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        o0 = sparseIntArray;
        sparseIntArray.put(xri.r6, 3);
        sparseIntArray.put(xri.p3, 4);
    }

    public tm0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 4, null, null, null, null, null, (xtq) objArr[1], null, null, null, null, null, null, null, null, null, null, (LottieAnimationView) objArr[4], null, null, null, null, null, null, null, null, null, (pvq) objArr[2], null, null, (SportCommandView) objArr[3], null, null, null, null, null);
        this.m0 = -1L;
        k0(this.F);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.l0 = constraintLayout;
        constraintLayout.setTag(null);
        k0(this.a0);
        o0(view);
        H();
    }

    private boolean D0(xtq xtqVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.m0 |= 2;
        }
        return true;
    }

    private boolean E0(pvq pvqVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.m0 |= 1;
        }
        return true;
    }

    private boolean F0(euq euqVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.m0 |= 8;
        }
        return true;
    }

    private boolean G0(xtq xtqVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.m0 |= 4;
        }
        return true;
    }

    @Override // defpackage.rm0
    public void B0(List<SportingItemData> list) {
        this.j0 = list;
        synchronized (this) {
            this.m0 |= 16;
        }
        notifyPropertyChanged(nv1.i);
        super.e0();
    }

    @Override // defpackage.rm0
    public void C0(Map<CommonSportModel.SportTitle, String> map) {
        this.k0 = map;
        synchronized (this) {
            this.m0 |= 32;
        }
        notifyPropertyChanged(nv1.f28392k);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.m0 != 0) {
                    return true;
                }
                return this.F.F() || this.a0.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.m0 = 64L;
        }
        this.F.H();
        this.a0.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return E0((pvq) obj, i2);
        }
        if (i == 1) {
            return D0((xtq) obj, i2);
        }
        if (i == 2) {
            return G0((xtq) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return F0((euq) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.F.l0(lifecycleOwner);
        this.a0.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        List<SportingItemData> sportBeanRunningPostureList;
        synchronized (this) {
            j = this.m0;
            this.m0 = 0L;
        }
        List<SportingItemData> list = this.j0;
        Map<CommonSportModel.SportTitle, String> map = this.k0;
        long j2 = 80 & j;
        List<SportingItemData> commonList = null;
        if (j2 != 0) {
            CommonSportModelUtil commonSportModelUtil = CommonSportModelUtil.INSTANCE;
            SportBeanUiDataModel uiDataListModel = commonSportModelUtil.getUiDataListModel(list, true);
            SportBeanUiDataModel uiDataListModel2 = commonSportModelUtil.getUiDataListModel(list, false);
            sportBeanRunningPostureList = uiDataListModel != null ? uiDataListModel.getSportBeanRunningPostureList() : null;
            if (uiDataListModel2 != null) {
                commonList = uiDataListModel2.getCommonList();
            }
        } else {
            sportBeanRunningPostureList = null;
        }
        long j3 = j & 96;
        if (j2 != 0) {
            this.F.A0(commonList);
            this.a0.A0(sportBeanRunningPostureList);
        }
        if (j3 != 0) {
            this.F.B0(map);
        }
        ViewDataBinding.r(this.F);
        ViewDataBinding.r(this.a0);
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

    public tm0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, n0, o0));
    }
}
