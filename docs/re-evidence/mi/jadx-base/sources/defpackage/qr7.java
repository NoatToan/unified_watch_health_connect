package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.adapter.ImageViewBindingAdapter;
import com.xiaomi.fitness.eco.device.manager.ui.bind.RopeSkippingDevice;

/* JADX INFO: loaded from: classes8.dex */
public class qr7 extends pr7 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I = null;
    public long G;

    public qr7(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[0], (ImageView) objArr[1], (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[4]);
        this.G = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        o0(view);
        H();
    }

    public void A0(RopeSkippingDevice ropeSkippingDevice) {
        this.F = ropeSkippingDevice;
        synchronized (this) {
            this.G |= 1;
        }
        notifyPropertyChanged(dw1.c);
        super.e0();
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
            this.G = 2L;
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
        int i;
        String bigIcon;
        String name;
        boolean isCurrent;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        RopeSkippingDevice ropeSkippingDevice = this.F;
        long j2 = j & 3;
        boolean z = false;
        if (j2 != 0) {
            if (ropeSkippingDevice != null) {
                isCurrent = ropeSkippingDevice.getIsCurrent();
                bigIcon = ropeSkippingDevice.getBigIcon();
                name = ropeSkippingDevice.getName();
            } else {
                isCurrent = false;
                bigIcon = null;
                name = null;
            }
            if (j2 != 0) {
                j |= isCurrent ? 40L : 20L;
            }
            i = isCurrent ? 8 : 0;
            z = isCurrent;
        } else {
            i = 0;
            bigIcon = null;
            name = null;
        }
        String mac = ((4 & j) == 0 || ropeSkippingDevice == null) ? null : ropeSkippingDevice.getMac();
        long j3 = j & 3;
        if (j3 == 0) {
            mac = null;
        } else if (z) {
            mac = this.C.getResources().getString(yzi.H);
        }
        if (j3 != 0) {
            ImageViewBindingAdapter.setIcon(this.B, bigIcon, null, null);
            r8p.b(this.C, mac);
            r8p.b(this.D, name);
            this.E.setVisibility(i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (dw1.c != i) {
            return false;
        }
        A0((RopeSkippingDevice) obj);
        return true;
    }

    public qr7(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, H, I));
    }
}
