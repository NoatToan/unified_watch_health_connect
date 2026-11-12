package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.device.manager.ui.tab.AccessoryDeviceStatusView;
import com.xiaomi.fitness.device.manager.ui.tab.TabAccessoryDeviceContentItem;

/* JADX INFO: loaded from: classes8.dex */
public class e76 extends d76 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public final AccessoryDeviceStatusView B;
    public long C;

    public e76(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 3);
        this.C = -1L;
        AccessoryDeviceStatusView accessoryDeviceStatusView = (AccessoryDeviceStatusView) objArr[0];
        this.B = accessoryDeviceStatusView;
        accessoryDeviceStatusView.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }

    public final boolean B0(ObservableInt observableInt, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 4;
        }
        return true;
    }

    public final boolean C0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 2;
        }
        return true;
    }

    public void D0(TabAccessoryDeviceContentItem tabAccessoryDeviceContentItem) {
        this.A = tabAccessoryDeviceContentItem;
        synchronized (this) {
            this.C |= 8;
        }
        notifyPropertyChanged(zv1.g);
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
            return A0((MutableLiveData) obj, i2);
        }
        if (i == 1) {
            return C0((MutableLiveData) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return B0((ObservableInt) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:42:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00af  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        String value;
        String value2;
        int mode;
        int i;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        TabAccessoryDeviceContentItem tabAccessoryDeviceContentItem = this.A;
        if ((31 & j) != 0) {
            if ((j & 25) == 0) {
                value = null;
            } else {
                LiveData<?> iconUrl = tabAccessoryDeviceContentItem != null ? tabAccessoryDeviceContentItem.getIconUrl() : null;
                w0(0, iconUrl);
                if (iconUrl != null) {
                    value = iconUrl.getValue();
                } else {
                    value = null;
                }
            }
            if ((j & 26) == 0) {
                value2 = null;
            } else {
                LiveData<?> subtitle = tabAccessoryDeviceContentItem != null ? tabAccessoryDeviceContentItem.getSubtitle() : null;
                w0(1, subtitle);
                if (subtitle != null) {
                    value2 = subtitle.getValue();
                } else {
                    value2 = null;
                }
            }
            mode = ((j & 24) == 0 || tabAccessoryDeviceContentItem == null) ? 0 : tabAccessoryDeviceContentItem.getMode();
            if ((j & 28) != 0) {
                ObservableInt status = tabAccessoryDeviceContentItem != null ? tabAccessoryDeviceContentItem.getStatus() : null;
                x0(2, status);
                i = status != null ? status.get() : 0;
            }
            if ((25 & j) != 0) {
                AccessoryDeviceStatusView.setBeanPreviewUrl(this.B, value);
            }
            if ((26 & j) != 0) {
                AccessoryDeviceStatusView.setStatus(this.B, value2);
            }
            if ((j & 28) != 0) {
                AccessoryDeviceStatusView.setStatus(this.B, i);
            }
            if ((j & 24) != 0) {
                AccessoryDeviceStatusView.setDeviceMode(this.B, mode);
            }
        }
        value = null;
        value2 = null;
        mode = 0;
        if ((25 & j) != 0) {
            AccessoryDeviceStatusView.setBeanPreviewUrl(this.B, value);
        }
        if ((26 & j) != 0) {
            AccessoryDeviceStatusView.setStatus(this.B, value2);
        }
        if ((j & 28) != 0) {
            AccessoryDeviceStatusView.setStatus(this.B, i);
        }
        if ((j & 24) != 0) {
            AccessoryDeviceStatusView.setDeviceMode(this.B, mode);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.g != i) {
            return false;
        }
        D0((TabAccessoryDeviceContentItem) obj);
        return true;
    }

    public e76(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
