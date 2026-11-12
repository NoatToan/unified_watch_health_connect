package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.pressure.BlePressureSettingViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.pressure.PressureModel;
import com.xiaomi.fitness.devicesettings.widget.DeviceReminderView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class zf6 extends yf6 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H = null;
    public final LinearLayout D;
    public final DeviceReminderView E;
    public long F;

    public zf6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 4, (SwitchButtonBindingTwoLineTextView) objArr[2], (SwitchButtonBindingTwoLineTextView) objArr[1]);
        this.F = -1L;
        this.A.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.D = linearLayout;
        linearLayout.setTag(null);
        DeviceReminderView deviceReminderView = (DeviceReminderView) objArr[3];
        this.E = deviceReminderView;
        deviceReminderView.setTag(null);
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

    public final boolean A0(ObservableBoolean observableBoolean, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.F |= 2;
        }
        return true;
    }

    public final boolean B0(ObservableBoolean observableBoolean, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.F |= 1;
        }
        return true;
    }

    public final boolean C0(ObservableBoolean observableBoolean, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.F |= 4;
        }
        return true;
    }

    public void E0(BlePressureSettingViewModel blePressureSettingViewModel) {
        this.C = blePressureSettingViewModel;
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
            return B0((ObservableBoolean) obj, i2);
        }
        if (i == 1) {
            return A0((ObservableBoolean) obj, i2);
        }
        if (i == 2) {
            return C0((ObservableBoolean) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return D0((MutableLiveData) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079 A[PHI: r2
      0x0079: PHI (r2v6 long) = (r2v0 long), (r2v8 long) binds: [B:23:0x004f, B:36:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        int iH0;
        boolean z;
        boolean z2;
        int i;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        BlePressureSettingViewModel blePressureSettingViewModel = this.C;
        long j2 = 50;
        if ((63 & j) != 0) {
            if ((j & 55) != 0) {
                PressureModel pressureModel = blePressureSettingViewModel != null ? blePressureSettingViewModel.getPressureModel() : null;
                if ((j & 49) == 0) {
                    z2 = false;
                } else {
                    ObservableBoolean highPressureNoticeSwitch = pressureModel != null ? pressureModel.getHighPressureNoticeSwitch() : null;
                    x0(0, highPressureNoticeSwitch);
                    if (highPressureNoticeSwitch != null) {
                        z2 = highPressureNoticeSwitch.get();
                    } else {
                        z2 = false;
                    }
                }
                long j3 = j & 50;
                if (j3 == 0) {
                    i = 0;
                } else {
                    ObservableBoolean highPressureNoticeSupport = pressureModel != null ? pressureModel.getHighPressureNoticeSupport() : null;
                    x0(1, highPressureNoticeSupport);
                    boolean z3 = highPressureNoticeSupport != null ? highPressureNoticeSupport.get() : false;
                    if (j3 != 0) {
                        j |= z3 ? 128L : 64L;
                    }
                    if (z3) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                }
                if ((j & 52) == 0) {
                    z = false;
                } else {
                    ObservableBoolean pressureDetectionSwitch = pressureModel != null ? pressureModel.getPressureDetectionSwitch() : null;
                    x0(2, pressureDetectionSwitch);
                    if (pressureDetectionSwitch != null) {
                        z = pressureDetectionSwitch.get();
                    } else {
                        z = false;
                    }
                }
            } else {
                z = false;
                i = 0;
                z2 = false;
            }
            if ((j & 56) != 0) {
                LiveData<?> type = blePressureSettingViewModel != null ? blePressureSettingViewModel.getType() : null;
                w0(3, type);
                iH0 = ViewDataBinding.h0(type != null ? type.getValue() : null);
            } else {
                iH0 = 0;
            }
            j2 = 50;
        } else {
            iH0 = 0;
            z = false;
            z2 = false;
            i = 0;
        }
        if ((j2 & j) != 0) {
            this.A.setVisibility(i);
        }
        if ((52 & j) != 0) {
            SwitchButtonBindingTwoLineTextView.setEnable(this.A, z);
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.B, z);
        }
        if ((49 & j) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.A, z2);
        }
        if ((j & 56) != 0) {
            this.E.setType(iH0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.f != i) {
            return false;
        }
        E0((BlePressureSettingViewModel) obj);
        return true;
    }

    public zf6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, G, H));
    }
}
