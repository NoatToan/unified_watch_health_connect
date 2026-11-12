package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.utils.StringUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class cuq extends buq {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(xri.Z6, 5);
        sparseIntArray.put(xri.C2, 6);
        sparseIntArray.put(xri.k6, 7);
    }

    public cuq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[2], (TextView) objArr[4], (ImageView) objArr[6], (TextView) objArr[3], (ImageView) objArr[7], (TextView) objArr[1], (ImageView) objArr[5]);
        this.J = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        this.D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        this.F.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.buq
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
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        Map<CommonSportModel.SportTitle, String> map = this.H;
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
            this.B.setVisibility(i);
            this.D.setVisibility(i);
            r8p.b(this.F, str);
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

    public cuq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, K, L));
    }
}
