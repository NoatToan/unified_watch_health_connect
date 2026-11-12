package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.ui.DeviceNormalGuideView;
import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceViewModel;

/* JADX INFO: loaded from: classes8.dex */
public class vu6 extends uu6 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public final DeviceNormalGuideView B;
    public long C;

    public vu6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 3);
        this.C = -1L;
        DeviceNormalGuideView deviceNormalGuideView = (DeviceNormalGuideView) objArr[0];
        this.B = deviceNormalGuideView;
        deviceNormalGuideView.setTag(null);
        o0(view);
        H();
    }

    private boolean C0(ObservableBoolean observableBoolean, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 4;
        }
        return true;
    }

    public final boolean A0(ObservableField<String> observableField, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 2;
        }
        return true;
    }

    public final boolean B0(ObservableField<String> observableField, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }

    public void D0(ScanDeviceViewModel scanDeviceViewModel) {
        this.A = scanDeviceViewModel;
        synchronized (this) {
            this.C |= 8;
        }
        notifyPropertyChanged(zv1.f41707k);
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
            this.C = 16L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((ObservableField) obj, i2);
        }
        if (i == 1) {
            return A0((ObservableField) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return C0((ObservableBoolean) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        String str;
        int i;
        String str2;
        String str3;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        ScanDeviceViewModel scanDeviceViewModel = this.A;
        String str4 = null;
        if ((31 & j) != 0) {
            if ((j & 25) == 0) {
                str2 = null;
            } else {
                ObservableField<String> deviceName = scanDeviceViewModel != null ? scanDeviceViewModel.getDeviceName() : null;
                x0(0, deviceName);
                if (deviceName != null) {
                    str2 = deviceName.get();
                } else {
                    str2 = null;
                }
            }
            if ((j & 26) == 0) {
                str3 = null;
            } else {
                ObservableField<String> deviceIcon = scanDeviceViewModel != null ? scanDeviceViewModel.getDeviceIcon() : null;
                x0(1, deviceIcon);
                if (deviceIcon != null) {
                    str3 = deviceIcon.get();
                } else {
                    str3 = null;
                }
            }
            long j2 = j & 28;
            if (j2 != 0) {
                ObservableBoolean isShowList = scanDeviceViewModel != null ? scanDeviceViewModel.getIsShowList() : null;
                x0(2, isShowList);
                boolean z = isShowList != null ? isShowList.get() : false;
                if (j2 != 0) {
                    j |= z ? 64L : 32L;
                }
                str4 = str2;
                String str5 = str3;
                i = z ? 8 : 0;
                str = str5;
            } else {
                str4 = str2;
                str = str3;
            }
            if ((25 & j) != 0) {
                DeviceNormalGuideView.setName(this.B, str4);
            }
            if ((26 & j) != 0) {
                DeviceNormalGuideView.setIcon(this.B, str);
            }
            if ((j & 28) != 0) {
                this.B.setVisibility(i);
            }
        }
        str = null;
        i = 0;
        if ((25 & j) != 0) {
            DeviceNormalGuideView.setName(this.B, str4);
        }
        if ((26 & j) != 0) {
            DeviceNormalGuideView.setIcon(this.B, str);
        }
        if ((j & 28) != 0) {
            this.B.setVisibility(i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.f41707k != i) {
            return false;
        }
        D0((ScanDeviceViewModel) obj);
        return true;
    }

    public vu6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
