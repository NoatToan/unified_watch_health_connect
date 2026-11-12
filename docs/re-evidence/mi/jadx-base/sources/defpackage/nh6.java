package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.pressure.HuamiPressureSettingViewModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.pressure.PressureModel;
import com.xiaomi.fitness.devicesettings.widget.DeviceReminderView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class nh6 extends mh6 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H = null;
    public final LinearLayout D;
    public final DeviceReminderView E;
    public long F;

    public nh6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 4, (SwitchButtonBindingTwoLineTextView) objArr[1], (SwitchButtonBindingTwoLineTextView) objArr[2]);
        this.F = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.D = linearLayout;
        linearLayout.setTag(null);
        DeviceReminderView deviceReminderView = (DeviceReminderView) objArr[3];
        this.E = deviceReminderView;
        deviceReminderView.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        o0(view);
        H();
    }

    private boolean D0(MutableLiveData<Integer> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.F |= 8;
        }
        return true;
    }

    public final boolean A0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.F |= 1;
        }
        return true;
    }

    public final boolean B0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.F |= 2;
        }
        return true;
    }

    public final boolean C0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.F |= 4;
        }
        return true;
    }

    public void E0(HuamiPressureSettingViewModel huamiPressureSettingViewModel) {
        this.C = huamiPressureSettingViewModel;
        synchronized (this) {
            this.F |= 16;
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
            this.F = 32L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return A0((MutableLiveData) obj, i2);
        }
        if (i == 1) {
            return B0((MutableLiveData) obj, i2);
        }
        if (i == 2) {
            return C0((MutableLiveData) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return D0((MutableLiveData) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008b A[PHI: r2
      0x008b: PHI (r2v5 long) = (r2v0 long), (r2v7 long) binds: [B:25:0x005a, B:39:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:77:0x0108  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        boolean zJ0;
        int i;
        boolean zJ1;
        int iH0;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        HuamiPressureSettingViewModel huamiPressureSettingViewModel = this.C;
        if ((63 & j) != 0) {
            if ((j & 55) != 0) {
                PressureModel mModel = huamiPressureSettingViewModel != null ? huamiPressureSettingViewModel.getMModel() : null;
                if ((j & 49) != 0) {
                    MutableLiveData<Boolean> pressureDetectionSwitch = mModel != null ? mModel.getPressureDetectionSwitch() : null;
                    w0(0, pressureDetectionSwitch);
                    zJ1 = ViewDataBinding.j0(pressureDetectionSwitch != null ? pressureDetectionSwitch.getValue() : null);
                } else {
                    zJ1 = false;
                }
                long j2 = j & 50;
                if (j2 == 0) {
                    i = 0;
                } else {
                    MutableLiveData<Boolean> relaxReminderSupport = mModel != null ? mModel.getRelaxReminderSupport() : null;
                    w0(1, relaxReminderSupport);
                    boolean zJ2 = ViewDataBinding.j0(relaxReminderSupport != null ? relaxReminderSupport.getValue() : null);
                    if (j2 != 0) {
                        j |= zJ2 ? 128L : 64L;
                    }
                    if (zJ2) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                }
                if ((j & 52) != 0) {
                    MutableLiveData<Boolean> relaxReminderSwitch = mModel != null ? mModel.getRelaxReminderSwitch() : null;
                    w0(2, relaxReminderSwitch);
                    zJ0 = ViewDataBinding.j0(relaxReminderSwitch != null ? relaxReminderSwitch.getValue() : null);
                } else {
                    zJ0 = false;
                }
            } else {
                zJ0 = false;
                i = 0;
                zJ1 = false;
            }
            if ((j & 56) != 0) {
                MutableLiveData<Integer> type = huamiPressureSettingViewModel != null ? huamiPressureSettingViewModel.getType() : null;
                w0(3, type);
                iH0 = ViewDataBinding.h0(type != null ? type.getValue() : null);
            }
            if ((56 & j) != 0) {
                this.E.setType(iH0);
            }
            if ((49 & j) != 0) {
                SwitchButtonBindingTwoLineTextView.setSwitchOn(this.A, zJ1);
                SwitchButtonBindingTwoLineTextView.setEnable(this.B, zJ1);
            }
            if ((50 & j) != 0) {
                this.B.setVisibility(i);
            }
            if ((j & 52) != 0) {
                SwitchButtonBindingTwoLineTextView.setSwitchOn(this.B, zJ0);
            }
        }
        zJ0 = false;
        i = 0;
        zJ1 = false;
        iH0 = 0;
        if ((56 & j) != 0) {
            this.E.setType(iH0);
        }
        if ((49 & j) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.A, zJ1);
            SwitchButtonBindingTwoLineTextView.setEnable(this.B, zJ1);
        }
        if ((50 & j) != 0) {
            this.B.setVisibility(i);
        }
        if ((j & 52) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.B, zJ0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.f != i) {
            return false;
        }
        E0((HuamiPressureSettingViewModel) obj);
        return true;
    }

    public nh6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, G, H));
    }
}
