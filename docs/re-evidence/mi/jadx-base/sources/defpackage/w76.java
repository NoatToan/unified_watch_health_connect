package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceStatusView;
import com.xiaomi.fitness.device.manager.ui.tab.TabDeviceContentItem;

/* JADX INFO: loaded from: classes8.dex */
public class w76 extends v76 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public final DeviceStatusView B;
    public long C;

    public w76(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 5);
        this.C = -1L;
        DeviceStatusView deviceStatusView = (DeviceStatusView) objArr[0];
        this.B = deviceStatusView;
        deviceStatusView.setTag(null);
        o0(view);
        H();
    }

    private boolean B0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }

    private boolean C0(ObservableInt observableInt, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 16;
        }
        return true;
    }

    private boolean E0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 2;
        }
        return true;
    }

    public final boolean A0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 4;
        }
        return true;
    }

    public final boolean D0(ObservableBoolean observableBoolean, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 8;
        }
        return true;
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

    public void F0(TabDeviceContentItem tabDeviceContentItem) {
        this.A = tabDeviceContentItem;
        synchronized (this) {
            this.C |= 32;
        }
        notifyPropertyChanged(zv1.g);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.C = 64L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((MutableLiveData) obj, i2);
        }
        if (i == 1) {
            return E0((MutableLiveData) obj, i2);
        }
        if (i == 2) {
            return A0((MutableLiveData) obj, i2);
        }
        if (i == 3) {
            return D0((ObservableBoolean) obj, i2);
        }
        if (i != 4) {
            return false;
        }
        return C0((ObservableInt) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b1  */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        String str;
        String str2;
        int i;
        String str3;
        boolean z;
        String value;
        String value2;
        String value3;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        TabDeviceContentItem tabDeviceContentItem = this.A;
        if ((127 & j) != 0) {
            if ((j & 97) == 0) {
                value = null;
            } else {
                LiveData<?> iconUrl = tabDeviceContentItem != null ? tabDeviceContentItem.getIconUrl() : null;
                w0(0, iconUrl);
                if (iconUrl != null) {
                    value = iconUrl.getValue();
                } else {
                    value = null;
                }
            }
            if ((j & 98) == 0) {
                value2 = null;
            } else {
                LiveData<?> title = tabDeviceContentItem != null ? tabDeviceContentItem.getTitle() : null;
                w0(1, title);
                if (title != null) {
                    value2 = title.getValue();
                } else {
                    value2 = null;
                }
            }
            if ((j & 100) == 0) {
                value3 = null;
            } else {
                LiveData<?> faceUrl = tabDeviceContentItem != null ? tabDeviceContentItem.getFaceUrl() : null;
                w0(2, faceUrl);
                if (faceUrl != null) {
                    value3 = faceUrl.getValue();
                } else {
                    value3 = null;
                }
            }
            if ((j & 104) == 0) {
                z = false;
            } else {
                ObservableBoolean supportSwitchWearMode = tabDeviceContentItem != null ? tabDeviceContentItem.getSupportSwitchWearMode() : null;
                x0(3, supportSwitchWearMode);
                if (supportSwitchWearMode != null) {
                    z = supportSwitchWearMode.get();
                } else {
                    z = false;
                }
            }
            if ((j & 112) == 0) {
                str = value2;
                i = 0;
                String str4 = value3;
                str3 = value;
                str2 = str4;
            } else {
                ObservableInt status = tabDeviceContentItem != null ? tabDeviceContentItem.getStatus() : null;
                x0(4, status);
                if (status != null) {
                    String str5 = value2;
                    i = status.get();
                    str = str5;
                    String str6 = value3;
                    str3 = value;
                    str2 = str6;
                } else {
                    str = value2;
                    i = 0;
                    String str7 = value3;
                    str3 = value;
                    str2 = str7;
                }
            }
        } else {
            str = null;
            str2 = null;
            i = 0;
            str3 = null;
            z = false;
        }
        if ((97 & j) != 0) {
            DeviceStatusView.setIcon(this.B, str3);
        }
        if ((j & 98) != 0) {
            DeviceStatusView.setName(this.B, str);
        }
        if ((112 & j) != 0) {
            DeviceStatusView.setStatus(this.B, i);
        }
        if ((j & 104) != 0) {
            DeviceStatusView.setFaceIcon(this.B, z);
        }
        if ((j & 100) != 0) {
            DeviceStatusView.setFaceIcon(this.B, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.g != i) {
            return false;
        }
        F0((TabDeviceContentItem) obj);
        return true;
    }

    public w76(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
