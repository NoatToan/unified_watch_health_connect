package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.mi.health.sport.AmapRealTimePathView;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class svq extends rvq {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I = null;
    public long G;

    public svq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, null, (AmapRealTimePathView) objArr[0], null, null, null);
        this.G = -1L;
        this.B.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(wvq wvqVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.G |= 1;
        }
        return true;
    }

    public void B0(Map<CommonSportModel.SportTitle, String> map) {
        this.F = map;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.G = 4L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((wvq) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (nv1.f28392k != i) {
            return false;
        }
        B0((Map) obj);
        return true;
    }

    public svq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, H, I));
    }
}
