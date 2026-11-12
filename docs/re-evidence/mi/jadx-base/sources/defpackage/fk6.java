package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.spo2.HuamiSpo2SettingViewModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.spo2.Spo2Model;
import com.xiaomi.fitness.devicesettings.widget.DeviceReminderView;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class fk6 extends ek6 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H = null;
    public final NestedScrollView D;
    public final DeviceReminderView E;
    public long F;

    public fk6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 3, (RightArrowBindingTwoLineTextView) objArr[2], (SwitchButtonBindingTwoLineTextView) objArr[1]);
        this.F = -1L;
        this.A.setTag(null);
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.D = nestedScrollView;
        nestedScrollView.setTag(null);
        DeviceReminderView deviceReminderView = (DeviceReminderView) objArr[3];
        this.E = deviceReminderView;
        deviceReminderView.setTag(null);
        this.B.setTag(null);
        o0(view);
        H();
    }

    private boolean C0(MutableLiveData<Integer> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.F |= 4;
        }
        return true;
    }

    public final boolean A0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.F |= 2;
        }
        return true;
    }

    public final boolean B0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.F |= 1;
        }
        return true;
    }

    public void D0(HuamiSpo2SettingViewModel huamiSpo2SettingViewModel) {
        this.C = huamiSpo2SettingViewModel;
        synchronized (this) {
            this.F |= 8;
        }
        notifyPropertyChanged(bw1.f);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.F = 16L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((MutableLiveData) obj, i2);
        }
        if (i == 1) {
            return A0((MutableLiveData) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return C0((MutableLiveData) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        int iH0;
        boolean z;
        String value;
        boolean zJ0;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        HuamiSpo2SettingViewModel huamiSpo2SettingViewModel = this.C;
        String str = null;
        if ((31 & j) != 0) {
            if ((27 & j) != 0) {
                Spo2Model mModel = huamiSpo2SettingViewModel != null ? huamiSpo2SettingViewModel.getMModel() : null;
                if ((j & 25) != 0) {
                    MutableLiveData<Boolean> spo2DetectionEnable = mModel != null ? mModel.getSpo2DetectionEnable() : null;
                    w0(0, spo2DetectionEnable);
                    zJ0 = ViewDataBinding.j0(spo2DetectionEnable != null ? spo2DetectionEnable.getValue() : null);
                } else {
                    zJ0 = false;
                }
                if ((j & 26) == 0) {
                    value = null;
                } else {
                    MutableLiveData<String> hypoxemiaReminderValue = mModel != null ? mModel.getHypoxemiaReminderValue() : null;
                    w0(1, hypoxemiaReminderValue);
                    if (hypoxemiaReminderValue != null) {
                        value = hypoxemiaReminderValue.getValue();
                    } else {
                        value = null;
                    }
                }
            } else {
                value = null;
                zJ0 = false;
            }
            if ((j & 28) != 0) {
                MutableLiveData<Integer> type = huamiSpo2SettingViewModel != null ? huamiSpo2SettingViewModel.getType() : null;
                w0(2, type);
                str = value;
                iH0 = ViewDataBinding.h0(type != null ? type.getValue() : null);
                z = zJ0;
            } else {
                str = value;
                z = zJ0;
                iH0 = 0;
            }
        } else {
            iH0 = 0;
            z = false;
        }
        if ((25 & j) != 0) {
            RightArrowBindingTwoLineTextView.setEnable(this.A, z);
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.B, z);
        }
        if ((26 & j) != 0) {
            RightArrowBindingTwoLineTextView.remindText(this.A, str);
        }
        if ((j & 28) != 0) {
            this.E.setType(iH0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.f != i) {
            return false;
        }
        D0((HuamiSpo2SettingViewModel) obj);
        return true;
    }

    public fk6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, G, H));
    }
}
