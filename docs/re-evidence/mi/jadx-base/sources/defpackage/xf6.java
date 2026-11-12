package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.hr.BleHeartRateModel;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.hr.BleHrSettingViewModel;
import com.xiaomi.fitness.devicesettings.common.extensions.HeartRateMonitorExtKt;
import com.xiaomi.fitness.devicesettings.widget.DeviceReminderView;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class xf6 extends wf6 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L = null;
    public final LinearLayout H;
    public final DeviceReminderView I;
    public long J;

    public xf6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 2, (SwitchButtonTwoLineTextView) objArr[6], (RightArrowBindingTwoLineTextView) objArr[2], (RightArrowBindingTwoLineTextView) objArr[1], (RightArrowBindingTwoLineTextView) objArr[3], (RightArrowBindingTwoLineTextView) objArr[5], (SwitchButtonBindingTwoLineTextView) objArr[4]);
        this.J = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.H = linearLayout;
        linearLayout.setTag(null);
        DeviceReminderView deviceReminderView = (DeviceReminderView) objArr[7];
        this.I = deviceReminderView;
        deviceReminderView.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(MutableLiveData<ls9> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.J |= 1;
        }
        return true;
    }

    public final boolean B0(MutableLiveData<Integer> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.J |= 2;
        }
        return true;
    }

    public void C0(BleHrSettingViewModel bleHrSettingViewModel) {
        this.G = bleHrSettingViewModel;
        synchronized (this) {
            this.J |= 4;
        }
        notifyPropertyChanged(bw1.f);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 8L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return A0((MutableLiveData) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return B0((MutableLiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        String str;
        String lowStr;
        String str2;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        String hightStr;
        String hrFreqStr;
        String sportHrWarningStr;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean zIsWarningAvailable;
        boolean zIsSportWarningSwitchOn;
        boolean zIsHeartHeathySwitchOn;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        BleHrSettingViewModel bleHrSettingViewModel = this.G;
        String str3 = null;
        int iH0 = 0;
        if ((15 & j) != 0) {
            long j2 = j & 13;
            if (j2 != 0) {
                BleHeartRateModel heartRateModel = bleHrSettingViewModel != null ? bleHrSettingViewModel.getHeartRateModel() : null;
                MutableLiveData<ls9> hrConfig = heartRateModel != null ? heartRateModel.getHrConfig() : null;
                w0(0, hrConfig);
                ls9 value = hrConfig != null ? hrConfig.getValue() : null;
                boolean zIsSupportSportWarning = HeartRateMonitorExtKt.isSupportSportWarning(value);
                lowStr = HeartRateMonitorExtKt.getLowStr(value);
                boolean zIsSupportHeartHealthy = HeartRateMonitorExtKt.isSupportHeartHealthy(value);
                boolean zIsSupportLowHrWarning = HeartRateMonitorExtKt.isSupportLowHrWarning(value);
                hightStr = HeartRateMonitorExtKt.getHightStr(value);
                zIsWarningAvailable = HeartRateMonitorExtKt.isWarningAvailable(value);
                zIsSportWarningSwitchOn = HeartRateMonitorExtKt.isSportWarningSwitchOn(value);
                zIsHeartHeathySwitchOn = HeartRateMonitorExtKt.isHeartHeathySwitchOn(value);
                hrFreqStr = HeartRateMonitorExtKt.getHrFreqStr(value);
                sportHrWarningStr = HeartRateMonitorExtKt.getSportHrWarningStr(value);
                boolean zIsSupportHighHrWarning = HeartRateMonitorExtKt.isSupportHighHrWarning(value);
                if (j2 != 0) {
                    j |= zIsSupportSportWarning ? 32L : 16L;
                }
                if ((j & 13) != 0) {
                    j |= zIsSupportHeartHealthy ? 512L : 256L;
                }
                if ((j & 13) != 0) {
                    j |= zIsSupportLowHrWarning ? 128L : 64L;
                }
                if ((j & 13) != 0) {
                    j |= zIsSupportHighHrWarning ? 2048L : 1024L;
                }
                i5 = 8;
                i6 = zIsSupportSportWarning ? 0 : 8;
                i7 = zIsSupportHeartHealthy ? 0 : 8;
                i8 = zIsSupportLowHrWarning ? 0 : 8;
                if (zIsSupportHighHrWarning) {
                    i5 = 0;
                }
            } else {
                lowStr = null;
                hightStr = null;
                hrFreqStr = null;
                sportHrWarningStr = null;
                i5 = 0;
                i6 = 0;
                i7 = 0;
                i8 = 0;
                zIsWarningAvailable = false;
                zIsSportWarningSwitchOn = false;
                zIsHeartHeathySwitchOn = false;
            }
            if ((j & 14) != 0) {
                MutableLiveData<Integer> type = bleHrSettingViewModel != null ? bleHrSettingViewModel.getType() : null;
                w0(1, type);
                iH0 = ViewDataBinding.h0(type != null ? type.getValue() : null);
            }
            i4 = iH0;
            iH0 = i7;
            i2 = i8;
            str3 = hightStr;
            z = zIsWarningAvailable;
            z3 = zIsSportWarningSwitchOn;
            z2 = zIsHeartHeathySwitchOn;
            str = hrFreqStr;
            str2 = sportHrWarningStr;
            int i9 = i6;
            i3 = i5;
            i = i9;
        } else {
            str = null;
            lowStr = null;
            str2 = null;
            i = 0;
            z = false;
            i2 = 0;
            z2 = false;
            i3 = 0;
            z3 = false;
            i4 = 0;
        }
        if ((13 & j) != 0) {
            this.A.setVisibility(iH0);
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.A, z2);
            this.B.setVisibility(i3);
            RightArrowBindingTwoLineTextView.setEnable(this.B, z);
            RightArrowBindingTwoLineTextView.remindText(this.B, str3);
            RightArrowBindingTwoLineTextView.remindText(this.C, str);
            this.D.setVisibility(i2);
            RightArrowBindingTwoLineTextView.setEnable(this.D, z);
            RightArrowBindingTwoLineTextView.remindText(this.D, lowStr);
            this.E.setVisibility(i);
            boolean z4 = z3;
            RightArrowBindingTwoLineTextView.setEnable(this.E, z4);
            RightArrowBindingTwoLineTextView.remindText(this.E, str2);
            this.F.setVisibility(i);
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.F, z4);
        }
        if ((j & 14) != 0) {
            this.I.setType(i4);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.f != i) {
            return false;
        }
        C0((BleHrSettingViewModel) obj);
        return true;
    }

    public xf6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, K, L));
    }
}
