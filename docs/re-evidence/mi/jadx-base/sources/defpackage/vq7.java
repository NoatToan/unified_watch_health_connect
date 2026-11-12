package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoAddDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.ui.EcoDeviceNormalGuideView;
import com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindViewModel;
import com.xiaomi.fitness.eco.device.manager.ui.bind.EcoDeviceBindStatusView;

/* JADX INFO: loaded from: classes8.dex */
public class vq7 extends uq7 {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final LinearLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(ari.d, 4);
        sparseIntArray.put(ari.i, 5);
        sparseIntArray.put(ari.l, 6);
        sparseIntArray.put(ari.j, 7);
        sparseIntArray.put(ari.f3383k, 8);
    }

    public vq7(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (ScrollView) objArr[4], (TextView) objArr[2], (EcoDeviceNormalGuideView) objArr[1], (View) objArr[5], (EcoDeviceBindStatusView) objArr[7], (EcoDeviceBindStatusView) objArr[8], (EcoDeviceBindStatusView) objArr[6], (TextView) objArr[3]);
        this.L = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.K = linearLayout;
        linearLayout.setTag(null);
        this.H.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(ObservableInt observableInt, int i) {
        if (i != dw1.f15982a) {
            return false;
        }
        synchronized (this) {
            this.L |= 1;
        }
        return true;
    }

    public void B0(EcoAddDeviceInfo ecoAddDeviceInfo) {
        this.J = ecoAddDeviceInfo;
        synchronized (this) {
            this.L |= 2;
        }
        notifyPropertyChanged(dw1.f15983b);
        super.e0();
    }

    public void C0(EcoBindViewModel ecoBindViewModel) {
        this.I = ecoBindViewModel;
        synchronized (this) {
            this.L |= 4;
        }
        notifyPropertyChanged(dw1.d);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 8L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((ObservableInt) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        String name;
        String bigIcon;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        EcoAddDeviceInfo ecoAddDeviceInfo = this.J;
        EcoBindViewModel ecoBindViewModel = this.I;
        long j2 = 10 & j;
        if (j2 == 0 || ecoAddDeviceInfo == null) {
            name = null;
            bigIcon = null;
        } else {
            bigIcon = ecoAddDeviceInfo.getBigIcon();
            name = ecoAddDeviceInfo.getName();
        }
        long j3 = j & 13;
        int i = 0;
        if (j3 != 0) {
            ObservableInt isFail = ecoBindViewModel != null ? ecoBindViewModel.getIsFail() : null;
            x0(0, isFail);
            if (isFail != null) {
                i = isFail.get();
            }
        }
        if (j3 != 0) {
            this.B.setVisibility(i);
            this.H.setVisibility(i);
        }
        if (j2 != 0) {
            EcoDeviceNormalGuideView.setIcon(this.C, bigIcon);
            EcoDeviceNormalGuideView.setName(this.C, name);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (dw1.f15983b == i) {
            B0((EcoAddDeviceInfo) obj);
        } else {
            if (dw1.d != i) {
                return false;
            }
            C0((EcoBindViewModel) obj);
        }
        return true;
    }

    public vq7(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, M, N));
    }
}
