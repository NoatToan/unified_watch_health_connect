package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.mi.health.sport.AmapRealTimePathView;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class tvq extends rvq {
    public static final ViewDataBinding.i H;
    public static final SparseIntArray I;
    public long G;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(5);
        H = iVar;
        iVar.a(1, new String[]{"view_outdoor_title"}, new int[]{2}, new int[]{dvi.K1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(xri.s3, 3);
        sparseIntArray.put(xri.u8, 4);
    }

    public tvq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (LinearLayout) objArr[1], (AmapRealTimePathView) objArr[3], (ConstraintLayout) objArr[0], (wvq) objArr[2], (View) objArr[4]);
        this.G = -1L;
        this.A.setTag(null);
        this.C.setTag(null);
        k0(this.D);
        o0(view);
        H();
    }

    private boolean A0(wvq wvqVar, int i) {
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
        synchronized (this) {
            this.G |= 2;
        }
        notifyPropertyChanged(nv1.f28392k);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.G != 0) {
                    return true;
                }
                return this.D.F();
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
        this.D.H();
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
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.D.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        Map<CommonSportModel.SportTitle, String> map = this.F;
        if ((j & 6) != 0) {
            this.D.A0(map);
        }
        ViewDataBinding.r(this.D);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (nv1.f28392k != i) {
            return false;
        }
        B0((Map) obj);
        return true;
    }

    public tvq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, H, I));
    }
}
