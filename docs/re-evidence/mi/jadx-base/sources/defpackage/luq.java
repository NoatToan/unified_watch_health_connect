package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.model.CommonSportModel;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class luq extends kuq {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(zri.Y0, 3);
        sparseIntArray.put(zri.z, 4);
        sparseIntArray.put(zri.J2, 5);
        sparseIntArray.put(zri.g2, 6);
    }

    public luq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[2], (TextView) objArr[4], (TextView) objArr[3], (ImageView) objArr[6], (TextView) objArr[1], (ImageView) objArr[5]);
        this.I = -1L;
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        this.E.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.kuq
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
        String str2;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        Map<CommonSportModel.SportTitle, String> map = this.G;
        long j2 = j & 3;
        if (j2 == 0 || map == null) {
            str = null;
            str2 = null;
        } else {
            str = map.get(CommonSportModel.SportTitle.connectDevice);
            str2 = map.get(CommonSportModel.SportTitle.SportType);
        }
        if (j2 != 0) {
            r8p.b(this.A, str);
            r8p.b(this.E, str2);
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

    public luq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, J, K));
    }
}
