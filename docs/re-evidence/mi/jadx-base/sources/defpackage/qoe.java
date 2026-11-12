package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.utils.StringUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class qoe extends poe {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(xri.e7, 6);
        sparseIntArray.put(xri.goal_section, 7);
    }

    public qoe(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ProgressBar) objArr[3], (RelativeLayout) objArr[7], (TextView) objArr[5], (TextView) objArr[4], (RelativeLayout) objArr[6], (TextView) objArr[1], (TextView) objArr[2]);
        this.J = -1L;
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.poe
    public void A0(Map<CommonSportModel.SportTitle, String> map) {
        this.H = map;
        synchronized (this) {
            this.J |= 1;
        }
        notifyPropertyChanged(nv1.f28392k);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 2L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        String str;
        String str2;
        boolean zIsNotBlank;
        String str3;
        String str4;
        String str5;
        int iH0;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        Map<CommonSportModel.SportTitle, String> map = this.H;
        long j2 = j & 3;
        if (j2 != 0) {
            if (map != null) {
                str3 = map.get(CommonSportModel.SportTitle.majorData);
                str4 = map.get(CommonSportModel.SportTitle.progressDetail);
                str5 = map.get(CommonSportModel.SportTitle.progressPercentage);
                str2 = map.get(CommonSportModel.SportTitle.progressValue);
                str = map.get(CommonSportModel.SportTitle.unit);
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
            }
            zIsNotBlank = StringUtil.isNotBlank(str2);
            if (j2 != 0) {
                j = zIsNotBlank ? j | 8 : j | 4;
            }
        } else {
            str = null;
            str2 = null;
            zIsNotBlank = false;
            str3 = null;
            str4 = null;
            str5 = null;
        }
        Integer numValueOf = (j & 8) != 0 ? Integer.valueOf(str2) : null;
        long j3 = j & 3;
        if (j3 != 0) {
            iH0 = ViewDataBinding.h0(Integer.valueOf(zIsNotBlank ? numValueOf.intValue() : 0));
        } else {
            iH0 = 0;
        }
        if (j3 != 0) {
            this.A.setProgress(iH0);
            r8p.b(this.C, str5);
            r8p.b(this.D, str4);
            r8p.b(this.F, str3);
            r8p.b(this.G, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (nv1.f28392k != i) {
            return false;
        }
        A0((Map) obj);
        return true;
    }

    public qoe(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, K, L));
    }
}
