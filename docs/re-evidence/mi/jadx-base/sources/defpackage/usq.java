package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.model.CommonSportModel;
import com.xiaomi.fitness.sport_eco.utils.StringUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class usq extends ssq {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(zri.J2, 5);
        sparseIntArray.put(zri.g2, 6);
    }

    public usq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[2], (TextView) objArr[4], (TextView) objArr[3], (ImageView) objArr[6], (TextView) objArr[1], (ImageView) objArr[5]);
        this.I = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        this.E.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.ssq
    public void A0(Map<CommonSportModel.SportTitle, String> map) {
        this.G = map;
        synchronized (this) {
            this.I |= 1;
        }
        notifyPropertyChanged(pv1.h);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.I = 2L;
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
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        Map<CommonSportModel.SportTitle, String> map = this.G;
        long j2 = j & 3;
        int i = 0;
        String str2 = null;
        if (j2 != 0) {
            if (map != null) {
                str2 = map.get(CommonSportModel.SportTitle.connectDevice);
                str = map.get(CommonSportModel.SportTitle.SportType);
            } else {
                str = null;
            }
            boolean zIsBlank = StringUtils.isBlank(str2);
            if (j2 != 0) {
                j |= zIsBlank ? 8L : 4L;
            }
            if (zIsBlank) {
                i = 8;
            }
        } else {
            str = null;
        }
        if ((j & 3) != 0) {
            r8p.b(this.A, str2);
            this.B.setVisibility(i);
            this.C.setVisibility(i);
            r8p.b(this.E, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (pv1.h != i) {
            return false;
        }
        A0((Map) obj);
        return true;
    }

    public usq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, J, K));
    }
}
