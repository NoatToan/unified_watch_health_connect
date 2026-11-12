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
public class wsq extends vsq {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final ConstraintLayout E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(zri.J2, 2);
        sparseIntArray.put(zri.g2, 3);
    }

    public wsq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[3], (TextView) objArr[1], (ImageView) objArr[2]);
        this.F = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        this.B.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.vsq
    public void A0(Map<CommonSportModel.SportTitle, String> map) {
        this.D = map;
        synchronized (this) {
            this.F |= 1;
        }
        notifyPropertyChanged(pv1.h);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.F = 2L;
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
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        Map<CommonSportModel.SportTitle, String> map = this.D;
        long j2 = j & 3;
        String str = (j2 == 0 || map == null) ? null : map.get(CommonSportModel.SportTitle.SportType);
        if (j2 != 0) {
            r8p.b(this.B, str);
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

    public wsq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, G, H));
    }
}
