package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.utils.StringUtil;
import com.xiaomi.fitness.sport.view.widget.GpsSignalView;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class xvq extends wvq {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(xri.p0, 6);
        sparseIntArray.put(xri.Y1, 7);
        sparseIntArray.put(xri.k6, 8);
    }

    public xvq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[3], (TextView) objArr[5], (LinearLayout) objArr[6], (GpsSignalView) objArr[7], (TextView) objArr[4], (ImageView) objArr[8], (TextView) objArr[2], (TextView) objArr[1]);
        this.K = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        this.E.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.wvq
    public void A0(Map<CommonSportModel.SportTitle, String> map) {
        this.I = map;
        synchronized (this) {
            this.K |= 1;
        }
        notifyPropertyChanged(nv1.f28392k);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 2L;
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
            j = this.K;
            this.K = 0L;
        }
        Map<CommonSportModel.SportTitle, String> map = this.I;
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
            boolean zIsBlank = StringUtil.isBlank(str2);
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
            this.A.setVisibility(i);
            this.B.setVisibility(i);
            this.E.setVisibility(i);
            this.G.setVisibility(i);
            r8p.b(this.H, str);
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

    public xvq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, L, M));
    }
}
