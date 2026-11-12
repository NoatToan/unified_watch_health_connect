package defpackage;

import android.content.res.Resources;
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
public class yc7 extends xc7 {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final LinearLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(ari.d, 7);
        sparseIntArray.put(ari.i, 8);
        sparseIntArray.put(ari.l, 9);
        sparseIntArray.put(ari.s, 10);
    }

    public yc7(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (ScrollView) objArr[7], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[6], (EcoDeviceNormalGuideView) objArr[1], (View) objArr[8], (EcoDeviceBindStatusView) objArr[3], (EcoDeviceBindStatusView) objArr[9], (EcoDeviceBindStatusView) objArr[2], (TextView) objArr[10]);
        this.N = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.G.setTag(null);
        this.I.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.M = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(ObservableInt observableInt, int i) {
        if (i != dw1.f15982a) {
            return false;
        }
        synchronized (this) {
            this.N |= 1;
        }
        return true;
    }

    public void B0(EcoAddDeviceInfo ecoAddDeviceInfo) {
        this.L = ecoAddDeviceInfo;
        synchronized (this) {
            this.N |= 2;
        }
        notifyPropertyChanged(dw1.f15983b);
        super.e0();
    }

    public void C0(EcoBindViewModel ecoBindViewModel) {
        this.K = ecoBindViewModel;
        synchronized (this) {
            this.N |= 4;
        }
        notifyPropertyChanged(dw1.d);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.N != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.N = 8L;
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
        int i;
        String string;
        String string2;
        String bigIcon;
        String name;
        String string3;
        boolean zIsSportMachine;
        Resources resources;
        int i2;
        synchronized (this) {
            j = this.N;
            this.N = 0L;
        }
        EcoAddDeviceInfo ecoAddDeviceInfo = this.L;
        EcoBindViewModel ecoBindViewModel = this.K;
        long j2 = j & 10;
        int i3 = 0;
        if (j2 != 0) {
            if (ecoAddDeviceInfo != null) {
                bigIcon = ecoAddDeviceInfo.getBigIcon();
                name = ecoAddDeviceInfo.getName();
                zIsSportMachine = ecoAddDeviceInfo.isSportMachine();
            } else {
                zIsSportMachine = false;
                bigIcon = null;
                name = null;
            }
            if (j2 != 0) {
                j |= zIsSportMachine ? 2720L : 1360L;
            }
            i = zIsSportMachine ? 8 : 0;
            string3 = this.I.getResources().getString(zIsSportMachine ? yzi.t : yzi.q);
            string2 = zIsSportMachine ? this.I.getResources().getString(yzi.u) : this.I.getResources().getString(yzi.y);
            if (zIsSportMachine) {
                resources = this.I.getResources();
                i2 = yzi.s;
            } else {
                resources = this.I.getResources();
                i2 = yzi.x;
            }
            string = resources.getString(i2);
        } else {
            i = 0;
            string = null;
            string2 = null;
            bigIcon = null;
            name = null;
            string3 = null;
        }
        long j3 = j & 13;
        if (j3 != 0) {
            ObservableInt isFail = ecoBindViewModel != null ? ecoBindViewModel.getIsFail() : null;
            x0(0, isFail);
            if (isFail != null) {
                i3 = isFail.get();
            }
        }
        if (j3 != 0) {
            this.B.setVisibility(i3);
            this.C.setVisibility(i3);
            this.D.setVisibility(i3);
        }
        if ((j & 10) != 0) {
            EcoDeviceNormalGuideView.setIcon(this.E, bigIcon);
            EcoDeviceNormalGuideView.setName(this.E, name);
            this.G.setVisibility(i);
            EcoDeviceBindStatusView.setLoadingText(this.I, string);
            EcoDeviceBindStatusView.setFailText(this.I, string3);
            EcoDeviceBindStatusView.setSuccessText(this.I, string2);
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

    public yc7(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, O, P));
    }
}
