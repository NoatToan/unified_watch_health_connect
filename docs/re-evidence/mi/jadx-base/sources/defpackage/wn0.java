package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil;
import com.xiaomi.fitness.sport.view.wear.guide.SportBeanUiDataModel;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class wn0 extends un0 {
    public static final ViewDataBinding.i G;
    public static final SparseIntArray H;
    public final ConstraintLayout E;
    public long F;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(4);
        G = iVar;
        iVar.a(1, new String[]{"view_out_sport_data_realtime_running_posture"}, new int[]{2}, new int[]{dvi.H1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(xri.X2, 3);
    }

    public wn0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (ImageView) objArr[3], (ConstraintLayout) objArr[1], (pvq) objArr[2]);
        this.F = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        this.B.setTag(null);
        k0(this.C);
        o0(view);
        H();
    }

    private boolean B0(pvq pvqVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.F |= 1;
        }
        return true;
    }

    @Override // defpackage.un0
    public void A0(List<SportingItemData> list) {
        this.D = list;
        synchronized (this) {
            this.F |= 2;
        }
        notifyPropertyChanged(nv1.i);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                return this.C.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.F = 4L;
        }
        this.C.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return B0((pvq) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.C.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        SportBeanUiDataModel uiDataListModel;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        long j2 = j & 6;
        List<SportingItemData> sportBeanRunningPostureList = (j2 == 0 || (uiDataListModel = CommonSportModelUtil.INSTANCE.getUiDataListModel(this.D, true)) == null) ? null : uiDataListModel.getSportBeanRunningPostureList();
        if (j2 != 0) {
            this.C.A0(sportBeanRunningPostureList);
        }
        ViewDataBinding.r(this.C);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (nv1.i != i) {
            return false;
        }
        A0((List) obj);
        return true;
    }

    public wn0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, G, H));
    }
}
