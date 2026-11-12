package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.spo2.BleSpo2Model;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.spo2.BleSpo2SettingViewModel;
import com.xiaomi.fitness.devicesettings.common.BindingAdapters;
import com.xiaomi.fitness.devicesettings.widget.DeviceReminderView;
import com.xiaomi.fitness.devicesettings.widget.SetRadioGroup;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class dg6 extends cg6 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J = null;
    public final NestedScrollView F;
    public final DeviceReminderView G;
    public long H;

    public dg6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 8, (RightArrowBindingTwoLineTextView) objArr[2], (SetRadioGroup) objArr[4], (SwitchButtonBindingTwoLineTextView) objArr[1], (RightArrowBindingTwoLineTextView) objArr[3]);
        this.H = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.F = nestedScrollView;
        nestedScrollView.setTag(null);
        DeviceReminderView deviceReminderView = (DeviceReminderView) objArr[5];
        this.G = deviceReminderView;
        deviceReminderView.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        o0(view);
        H();
    }

    private boolean H0(MutableLiveData<Integer> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.H |= 128;
        }
        return true;
    }

    public final boolean A0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.H |= 4;
        }
        return true;
    }

    public final boolean B0(MutableLiveData<Integer> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.H |= 64;
        }
        return true;
    }

    public final boolean C0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.H |= 1;
        }
        return true;
    }

    public final boolean D0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.H |= 32;
        }
        return true;
    }

    public final boolean E0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.H |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean F0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.H |= 16;
        }
        return true;
    }

    public final boolean G0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.H |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.H = 512L;
        }
        e0();
    }

    public void I0(BleSpo2SettingViewModel bleSpo2SettingViewModel) {
        this.E = bleSpo2SettingViewModel;
        synchronized (this) {
            this.H |= 256;
        }
        notifyPropertyChanged(bw1.f);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return C0((MutableLiveData) obj, i2);
            case 1:
                return G0((MutableLiveData) obj, i2);
            case 2:
                return A0((MutableLiveData) obj, i2);
            case 3:
                return E0((MutableLiveData) obj, i2);
            case 4:
                return F0((MutableLiveData) obj, i2);
            case 5:
                return D0((MutableLiveData) obj, i2);
            case 6:
                return B0((MutableLiveData) obj, i2);
            case 7:
                return H0((MutableLiveData) obj, i2);
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0172  */
    /* JADX WARN: Code duplicated, block: B:113:0x0177  */
    /* JADX WARN: Code duplicated, block: B:116:0x017e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0185  */
    /* JADX WARN: Code duplicated, block: B:119:0x018e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[PHI: r2
      0x0061: PHI (r2v5 long) = (r2v0 long), (r2v13 long) binds: [B:14:0x0032, B:28:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x011a A[PHI: r2
      0x011a: PHI (r2v7 long) = (r2v6 long), (r2v11 long) binds: [B:66:0x00eb, B:80:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        int i;
        int i2;
        int i3;
        int iH0;
        boolean zJ0;
        int i4;
        List<SetRadioGroup.RadioItem> radioItems;
        String radioGroupTitle;
        Integer value;
        Boolean value2;
        String value3;
        long j2;
        int i5;
        MutableLiveData<Integer> type;
        Integer value4;
        MutableLiveData<Integer> frequency;
        MutableLiveData<Boolean> mutableLiveDataIsModeOn;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        BleSpo2SettingViewModel bleSpo2SettingViewModel = this.E;
        if ((1023 & j) != 0) {
            if ((j & 895) != 0) {
                BleSpo2Model spo2Model = bleSpo2SettingViewModel != null ? bleSpo2SettingViewModel.getSpo2Model() : null;
                long j3 = j & 769;
                if (j3 == 0) {
                    i4 = 0;
                } else {
                    MutableLiveData<Boolean> mutableLiveDataIsLDevice = spo2Model != null ? spo2Model.isLDevice() : null;
                    w0(0, mutableLiveDataIsLDevice);
                    boolean zJ1 = ViewDataBinding.j0(mutableLiveDataIsLDevice != null ? mutableLiveDataIsLDevice.getValue() : null);
                    if (j3 != 0) {
                        j |= zJ1 ? PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID : 16384L;
                    }
                    if (zJ1) {
                        i4 = 8;
                    } else {
                        i4 = 0;
                    }
                }
                if ((j & 770) != 0) {
                    MutableLiveData<Boolean> mutableLiveDataIsSpoSwitchOpen = spo2Model != null ? spo2Model.isSpoSwitchOpen() : null;
                    w0(1, mutableLiveDataIsSpoSwitchOpen);
                    zJ0 = ViewDataBinding.j0(mutableLiveDataIsSpoSwitchOpen != null ? mutableLiveDataIsSpoSwitchOpen.getValue() : null);
                } else {
                    zJ0 = false;
                }
                if ((j & 848) != 0) {
                    if (spo2Model != null) {
                        radioItems = spo2Model.getRadioItems();
                        radioGroupTitle = spo2Model.getRadioGroupTitle();
                        mutableLiveDataIsModeOn = spo2Model.isModeOn();
                        frequency = spo2Model.getFrequency();
                    } else {
                        radioItems = null;
                        radioGroupTitle = null;
                        frequency = null;
                        mutableLiveDataIsModeOn = null;
                    }
                    w0(4, mutableLiveDataIsModeOn);
                    w0(6, frequency);
                    value2 = mutableLiveDataIsModeOn != null ? mutableLiveDataIsModeOn.getValue() : null;
                    value = frequency != null ? frequency.getValue() : null;
                } else {
                    radioItems = null;
                    radioGroupTitle = null;
                    value = null;
                    value2 = null;
                }
                if ((j & 772) == 0) {
                    value3 = null;
                } else {
                    MutableLiveData<String> blodLowReminder = spo2Model != null ? spo2Model.getBlodLowReminder() : null;
                    w0(2, blodLowReminder);
                    if (blodLowReminder != null) {
                        value3 = blodLowReminder.getValue();
                    } else {
                        value3 = null;
                    }
                }
                long j4 = j & 776;
                if (j4 == 0) {
                    i2 = 0;
                } else {
                    MutableLiveData<Boolean> mutableLiveDataIsLowShow = spo2Model != null ? spo2Model.isLowShow() : null;
                    w0(3, mutableLiveDataIsLowShow);
                    boolean zJ2 = ViewDataBinding.j0(mutableLiveDataIsLowShow != null ? mutableLiveDataIsLowShow.getValue() : null);
                    if (j4 != 0) {
                        j |= zJ2 ? 2048L : 1024L;
                    }
                    if (zJ2) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                }
                long j5 = j & 800;
                if (j5 != 0) {
                    MutableLiveData<Boolean> mutableLiveDataIsLDevice2 = spo2Model != null ? spo2Model.isLDevice() : null;
                    w0(5, mutableLiveDataIsLDevice2);
                    boolean zJ3 = ViewDataBinding.j0(mutableLiveDataIsLDevice2 != null ? mutableLiveDataIsLDevice2.getValue() : null);
                    if (j5 != 0) {
                        j |= zJ3 ? 139264L : 69632L;
                    }
                    i3 = zJ3 ? 8 : 0;
                    i5 = zJ3 ? 0 : 8;
                    j2 = 896;
                } else {
                    i3 = 0;
                }
                if ((j & j2) != 0) {
                    if (bleSpo2SettingViewModel != null) {
                        type = bleSpo2SettingViewModel.getType();
                    } else {
                        type = null;
                    }
                    w0(7, type);
                    if (type != null) {
                        value4 = type.getValue();
                    } else {
                        value4 = null;
                    }
                    iH0 = ViewDataBinding.h0(value4);
                    i = i5;
                } else {
                    i = i5;
                    iH0 = 0;
                }
            } else {
                i2 = 0;
                i3 = 0;
                zJ0 = false;
                i4 = 0;
                radioItems = null;
                radioGroupTitle = null;
                value = null;
                value2 = null;
                value3 = null;
            }
            j2 = 896;
            i5 = 0;
            if ((j & j2) != 0) {
                if (bleSpo2SettingViewModel != null) {
                    type = bleSpo2SettingViewModel.getType();
                } else {
                    type = null;
                }
                w0(7, type);
                if (type != null) {
                    value4 = type.getValue();
                } else {
                    value4 = null;
                }
                iH0 = ViewDataBinding.h0(value4);
                i = i5;
            } else {
                i = i5;
                iH0 = 0;
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            iH0 = 0;
            zJ0 = false;
            i4 = 0;
            radioItems = null;
            radioGroupTitle = null;
            value = null;
            value2 = null;
            value3 = null;
        }
        if ((j & 770) != 0) {
            RightArrowBindingTwoLineTextView.setEnable(this.A, zJ0);
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.C, zJ0);
        }
        if ((776 & j) != 0) {
            this.A.setVisibility(i2);
        }
        if ((772 & j) != 0) {
            RightArrowBindingTwoLineTextView.remindText(this.A, value3);
            RightArrowBindingTwoLineTextView.remindText(this.D, value3);
        }
        if ((800 & j) != 0) {
            this.B.setVisibility(i3);
            this.C.setVisibility(i);
        }
        if ((848 & j) != 0) {
            BindingAdapters.setRadioGroup(this.B, radioGroupTitle, radioItems, value, value2);
        }
        if ((896 & j) != 0) {
            this.G.setType(iH0);
        }
        if ((j & 769) != 0) {
            this.D.setVisibility(i4);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.f != i) {
            return false;
        }
        I0((BleSpo2SettingViewModel) obj);
        return true;
    }

    public dg6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, I, J));
    }
}
