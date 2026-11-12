package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.export.bean.TabDeviceBannerSettingsItem;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceBannerSettingsView;

/* JADX INFO: loaded from: classes8.dex */
public class c86 extends b86 implements x7h.a {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G = null;
    public final DeviceBannerSettingsView B;
    public final View.OnClickListener C;
    public final View.OnClickListener D;
    public long E;

    public c86(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1);
        this.E = -1L;
        DeviceBannerSettingsView deviceBannerSettingsView = (DeviceBannerSettingsView) objArr[0];
        this.B = deviceBannerSettingsView;
        deviceBannerSettingsView.setTag(null);
        o0(view);
        this.C = new x7h(this, 1);
        this.D = new x7h(this, 2);
        H();
    }

    public final boolean A0(ObservableInt observableInt, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.E |= 1;
        }
        return true;
    }

    public void B0(TabDeviceBannerSettingsItem tabDeviceBannerSettingsItem) {
        this.A = tabDeviceBannerSettingsItem;
        synchronized (this) {
            this.E |= 2;
        }
        notifyPropertyChanged(zv1.g);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.E = 4L;
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

    @Override // x7h.a
    public final void a(int i, View view) {
        TabDeviceBannerSettingsItem tabDeviceBannerSettingsItem;
        if (i != 1) {
            if (i == 2 && (tabDeviceBannerSettingsItem = this.A) != null) {
                tabDeviceBannerSettingsItem.handleOpenListener(view);
                return;
            }
            return;
        }
        TabDeviceBannerSettingsItem tabDeviceBannerSettingsItem2 = this.A;
        if (tabDeviceBannerSettingsItem2 != null) {
            tabDeviceBannerSettingsItem2.handleOnCloseListener(view);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        TabDeviceBannerSettingsItem tabDeviceBannerSettingsItem = this.A;
        long j2 = 7 & j;
        int i = 0;
        if (j2 != 0) {
            ObservableInt remindType = tabDeviceBannerSettingsItem != null ? tabDeviceBannerSettingsItem.getRemindType() : null;
            x0(0, remindType);
            if (remindType != null) {
                i = remindType.get();
            }
        }
        if ((j & 4) != 0) {
            DeviceBannerSettingsView.setCloseOnClickListener(this.B, this.C);
            DeviceBannerSettingsView.setOpenOnClickListener(this.B, this.D);
        }
        if (j2 != 0) {
            DeviceBannerSettingsView.setRemindType(this.B, i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.g != i) {
            return false;
        }
        B0((TabDeviceBannerSettingsItem) obj);
        return true;
    }

    public c86(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, F, G));
    }
}
