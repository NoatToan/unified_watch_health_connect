package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.scan.BleDevice;
import com.xiaomi.fitness.device.manager.export.scan.ScannedDeviceInfo;
import com.xiaomi.fitness.widget.FeatureItemBindingView;

/* JADX INFO: loaded from: classes8.dex */
public class e86 extends d86 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public long C;

    public e86(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (FeatureItemBindingView) objArr[0]);
        this.C = -1L;
        this.A.setTag(null);
        o0(view);
        H();
    }

    public void A0(ScannedDeviceInfo scannedDeviceInfo) {
        this.B = scannedDeviceInfo;
        synchronized (this) {
            this.C |= 1;
        }
        notifyPropertyChanged(zv1.j);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.C = 2L;
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
        String address;
        String name;
        BleDevice bleDevice;
        DeviceInfo deviceinfo;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        ScannedDeviceInfo scannedDeviceInfo = this.B;
        long j2 = j & 3;
        String smallIcon = null;
        if (j2 != 0) {
            if (scannedDeviceInfo != null) {
                bleDevice = scannedDeviceInfo.getBleDevice();
                deviceinfo = scannedDeviceInfo.getDeviceinfo();
            } else {
                bleDevice = null;
                deviceinfo = null;
            }
            if (bleDevice != null) {
                name = bleDevice.getName();
                address = bleDevice.getAddress();
            } else {
                address = null;
                name = null;
            }
            if (deviceinfo != null) {
                smallIcon = deviceinfo.getSmallIcon();
            }
        } else {
            address = null;
            name = null;
        }
        if (j2 != 0) {
            FeatureItemBindingView.setIcon(this.A, smallIcon);
            FeatureItemBindingView.setSubtitle(this.A, address);
            FeatureItemBindingView.setTitle(this.A, name);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.j != i) {
            return false;
        }
        A0((ScannedDeviceInfo) obj);
        return true;
    }

    public e86(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
