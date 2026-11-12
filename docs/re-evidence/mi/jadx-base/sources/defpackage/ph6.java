package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.sleep.HuamiSleepSettingViewModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.sleep.SleepModel;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class ph6 extends oh6 {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G = null;
    public final LinearLayout D;
    public long E;

    public ph6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 3, (SwitchButtonTwoLineTextView) objArr[1], (SwitchButtonTwoLineTextView) objArr[2]);
        this.E = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.D = linearLayout;
        linearLayout.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.E |= 4;
        }
        return true;
    }

    public final boolean B0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.E |= 1;
        }
        return true;
    }

    public final boolean C0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.E |= 2;
        }
        return true;
    }

    public void D0(HuamiSleepSettingViewModel huamiSleepSettingViewModel) {
        this.C = huamiSleepSettingViewModel;
        synchronized (this) {
            this.E |= 8;
        }
        notifyPropertyChanged(bw1.f);
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
            this.E = 16L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((MutableLiveData) obj, i2);
        }
        if (i == 1) {
            return C0((MutableLiveData) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return A0((MutableLiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        int i;
        boolean z;
        boolean zJ0;
        boolean zJ1;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        HuamiSleepSettingViewModel huamiSleepSettingViewModel = this.C;
        if ((31 & j) != 0) {
            SleepModel mModel = huamiSleepSettingViewModel != null ? huamiSleepSettingViewModel.getMModel() : null;
            if ((j & 25) != 0) {
                MutableLiveData<Boolean> sleepBreathDetectionSwitch = mModel != null ? mModel.getSleepBreathDetectionSwitch() : null;
                w0(0, sleepBreathDetectionSwitch);
                zJ0 = ViewDataBinding.j0(sleepBreathDetectionSwitch != null ? sleepBreathDetectionSwitch.getValue() : null);
            } else {
                zJ0 = false;
            }
            if ((j & 26) != 0) {
                MutableLiveData<Boolean> sleepDetectionSwitch = mModel != null ? mModel.getSleepDetectionSwitch() : null;
                w0(1, sleepDetectionSwitch);
                zJ1 = ViewDataBinding.j0(sleepDetectionSwitch != null ? sleepDetectionSwitch.getValue() : null);
            } else {
                zJ1 = false;
            }
            long j2 = j & 28;
            if (j2 != 0) {
                MutableLiveData<Boolean> sleepBreathDetectionSupport = mModel != null ? mModel.getSleepBreathDetectionSupport() : null;
                w0(2, sleepBreathDetectionSupport);
                boolean zJ2 = ViewDataBinding.j0(sleepBreathDetectionSupport != null ? sleepBreathDetectionSupport.getValue() : null);
                if (j2 != 0) {
                    j |= zJ2 ? 64L : 32L;
                }
                i = zJ2 ? 0 : 8;
                z = zJ1;
            } else {
                z = zJ1;
                i = 0;
            }
        } else {
            i = 0;
            z = false;
            zJ0 = false;
        }
        if ((26 & j) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.A, z);
        }
        if ((j & 28) != 0) {
            this.B.setVisibility(i);
        }
        if ((j & 25) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.B, zJ0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.f != i) {
            return false;
        }
        D0((HuamiSleepSettingViewModel) obj);
        return true;
    }

    public ph6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, F, G));
    }
}
