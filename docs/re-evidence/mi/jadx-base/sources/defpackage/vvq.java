package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil;
import com.xiaomi.fitness.sport.view.wear.guide.SportBeanUiDataModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class vvq extends uvq {
    public static final ViewDataBinding.i Z;
    public static final SparseIntArray a0;
    public final ztq X;
    public long Y;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(22);
        Z = iVar;
        iVar.a(1, new String[]{"view_outdoor_title"}, new int[]{12}, new int[]{dvi.K1});
        iVar.a(4, new String[]{"view_indoor_sport_target"}, new int[]{13}, new int[]{dvi.v1});
        iVar.a(5, new String[]{"view_out_sport_data"}, new int[]{14}, new int[]{dvi.G1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        a0 = sparseIntArray;
        sparseIntArray.put(xri.I5, 15);
        sparseIntArray.put(xri.F5, 16);
        sparseIntArray.put(xri.K5, 17);
        sparseIntArray.put(xri.j3, 18);
        sparseIntArray.put(xri.g3, 19);
        sparseIntArray.put(xri.l6, 20);
        sparseIntArray.put(xri.s, 21);
    }

    public vvq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 2, (ConstraintLayout) objArr[21], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[8], (TextView) objArr[9], (TextView) objArr[10], (TextView) objArr[11], (ConstraintLayout) objArr[0], (ImageView) objArr[19], (LinearLayout) objArr[5], (ImageView) objArr[18], (wvq) objArr[12], (LottieAnimationView) objArr[16], (ConstraintLayout) objArr[15], (TextView) objArr[17], (ConstraintLayout) objArr[20], (LinearLayout) objArr[4], (TextView) objArr[2], (LinearLayout) objArr[1], (TextView) objArr[3], (mvq) objArr[14]);
        this.Y = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.J.setTag(null);
        ztq ztqVar = (ztq) objArr[13];
        this.X = ztqVar;
        k0(ztqVar);
        k0(this.L);
        this.Q.setTag(null);
        this.R.setTag(null);
        this.S.setTag(null);
        this.T.setTag(null);
        k0(this.U);
        o0(view);
        H();
    }

    private boolean C0(wvq wvqVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.Y |= 2;
        }
        return true;
    }

    @Override // defpackage.uvq
    public void A0(List<SportingItemData> list) {
        this.V = list;
        synchronized (this) {
            this.Y |= 4;
        }
        notifyPropertyChanged(nv1.i);
        super.e0();
    }

    @Override // defpackage.uvq
    public void B0(Map<CommonSportModel.SportTitle, String> map) {
        this.W = map;
        synchronized (this) {
            this.Y |= 8;
        }
        notifyPropertyChanged(nv1.f28392k);
        super.e0();
    }

    public final boolean D0(mvq mvqVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.Y |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.Y != 0) {
                    return true;
                }
                return this.L.F() || this.X.F() || this.U.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Y = 16L;
        }
        this.L.H();
        this.X.H();
        this.U.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return D0((mvq) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return C0((wvq) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.L.l0(lifecycleOwner);
        this.X.l0(lifecycleOwner);
        this.U.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        List<SportingItemData> commonList;
        String dataDes;
        String data;
        String data2;
        String dataDes2;
        String str;
        SportingItemData sportingItemData;
        SportingItemData sportingItemData2;
        synchronized (this) {
            j = this.Y;
            this.Y = 0L;
        }
        List<SportingItemData> list = this.V;
        Map<CommonSportModel.SportTitle, String> map = this.W;
        long j2 = 20 & j;
        String str2 = null;
        if (j2 != 0) {
            if (list != null) {
                sportingItemData = (SportingItemData) ViewDataBinding.B(list, 1);
                sportingItemData2 = (SportingItemData) ViewDataBinding.B(list, 0);
            } else {
                sportingItemData = null;
                sportingItemData2 = null;
            }
            SportBeanUiDataModel uiDataListModel = CommonSportModelUtil.INSTANCE.getUiDataListModel(list, false);
            if (sportingItemData != null) {
                dataDes = sportingItemData.getDataDes();
                data = sportingItemData.getData();
            } else {
                dataDes = null;
                data = null;
            }
            if (sportingItemData2 != null) {
                dataDes2 = sportingItemData2.getDataDes();
                data2 = sportingItemData2.getData();
            } else {
                data2 = null;
                dataDes2 = null;
            }
            commonList = uiDataListModel != null ? uiDataListModel.getCommonList() : null;
        } else {
            commonList = null;
            dataDes = null;
            data = null;
            data2 = null;
            dataDes2 = null;
        }
        long j3 = j & 24;
        if (j3 == 0 || map == null) {
            str = null;
        } else {
            str2 = map.get(CommonSportModel.SportTitle.majorData);
            str = map.get(CommonSportModel.SportTitle.unit);
        }
        if (j3 != 0) {
            r8p.b(this.B, str2);
            r8p.b(this.C, str);
            this.X.A0(map);
            this.L.A0(map);
            r8p.b(this.R, str2);
            r8p.b(this.T, str);
        }
        if (j2 != 0) {
            r8p.b(this.D, data2);
            r8p.b(this.E, dataDes2);
            r8p.b(this.F, data);
            r8p.b(this.G, dataDes);
            this.U.A0(commonList);
        }
        ViewDataBinding.r(this.L);
        ViewDataBinding.r(this.X);
        ViewDataBinding.r(this.U);
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

    public vvq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 22, Z, a0));
    }
}
