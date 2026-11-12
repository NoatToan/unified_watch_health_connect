package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingModel;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel;
import com.xiaomi.fitness.health.sleep.ui.setting.util.RemindTextConverter;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public class fwb extends ewb implements y7h.a {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R = null;
    public final LinearLayout I;
    public final DividerView J;
    public final TextView K;
    public final DividerView L;
    public final TextView M;
    public final RightArrowSingleLineTextView N;
    public final View.OnClickListener O;
    public long P;

    public fwb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 11, (SwitchButtonTwoLineTextView) objArr[6], (RightArrowBindingTwoLineTextView) objArr[11], (SwitchButtonBindingTwoLineTextView) objArr[5], (RightArrowBindingTwoLineTextView) objArr[12], (SwitchButtonBindingTwoLineTextView) objArr[4], (RightArrowBindingTwoLineTextView) objArr[1], (SwitchButtonBindingTwoLineTextView) objArr[10]);
        this.P = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.I = linearLayout;
        linearLayout.setTag(null);
        DividerView dividerView = (DividerView) objArr[2];
        this.J = dividerView;
        dividerView.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.K = textView;
        textView.setTag(null);
        DividerView dividerView2 = (DividerView) objArr[7];
        this.L = dividerView2;
        dividerView2.setTag(null);
        TextView textView2 = (TextView) objArr[8];
        this.M = textView2;
        textView2.setTag(null);
        RightArrowSingleLineTextView rightArrowSingleLineTextView = (RightArrowSingleLineTextView) objArr[9];
        this.N = rightArrowSingleLineTextView;
        rightArrowSingleLineTextView.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        o0(view);
        this.O = new y7h(this, 1);
        H();
    }

    private boolean E0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.P |= 512;
        }
        return true;
    }

    private boolean F0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.P |= 8;
        }
        return true;
    }

    public final boolean A0(ObservableBoolean observableBoolean, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.P |= 256;
        }
        return true;
    }

    public final boolean B0(ObservableBoolean observableBoolean, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.P |= 2;
        }
        return true;
    }

    public final boolean C0(ObservableBoolean observableBoolean, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.P |= 1;
        }
        return true;
    }

    public final boolean D0(ObservableBoolean observableBoolean, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.P |= 1024;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean G0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.P |= 16;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.P = 4096L;
        }
        e0();
    }

    public final boolean H0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.P |= 32;
        }
        return true;
    }

    public final boolean I0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.P |= 128;
        }
        return true;
    }

    public final boolean J0(ObservableBoolean observableBoolean, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.P |= 64;
        }
        return true;
    }

    public final boolean K0(LiveData<Integer> liveData, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.P |= 4;
        }
        return true;
    }

    public void L0(SleepSettingViewModel sleepSettingViewModel) {
        this.H = sleepSettingViewModel;
        synchronized (this) {
            this.P |= 2048;
        }
        notifyPropertyChanged(cv1.f14764b);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return C0((ObservableBoolean) obj, i2);
            case 1:
                return B0((ObservableBoolean) obj, i2);
            case 2:
                return K0((LiveData) obj, i2);
            case 3:
                return F0((MutableLiveData) obj, i2);
            case 4:
                return G0((MutableLiveData) obj, i2);
            case 5:
                return H0((MutableLiveData) obj, i2);
            case 6:
                return J0((ObservableBoolean) obj, i2);
            case 7:
                return I0((MutableLiveData) obj, i2);
            case 8:
                return A0((ObservableBoolean) obj, i2);
            case 9:
                return E0((MutableLiveData) obj, i2);
            case 10:
                return D0((ObservableBoolean) obj, i2);
            default:
                return false;
        }
    }

    @Override // y7h.a
    public final void a(int i, View view) {
        SleepSettingViewModel sleepSettingViewModel = this.H;
        if (sleepSettingViewModel != null) {
            sleepSettingViewModel.onSleepScheduleItemClicked(view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0150  */
    /* JADX WARN: Code duplicated, block: B:121:0x016e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x0199  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:142:0x01af  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c9 A[PHI: r2
      0x01c9: PHI (r2v9 long) = (r2v8 long), (r2v13 long) binds: [B:135:0x0195, B:149:0x01c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:156:0x01d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:158:0x01da  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:164:0x01ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:169:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:170:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:172:0x0200  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d A[PHI: r2
      0x005d: PHI (r2v3 long) = (r2v0 long), (r2v19 long) binds: [B:12:0x0032, B:25:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x008e A[PHI: r2
      0x008e: PHI (r2v5 long) = (r2v4 long), (r2v17 long) binds: [B:30:0x0063, B:43:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0114 A[PHI: r2
      0x0114: PHI (r2v7 long) = (r2v6 long), (r2v15 long) binds: [B:74:0x00e2, B:88:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String remindTextWithAudioRecordPermCheckIfNeed;
        boolean zJ0;
        boolean zJ1;
        boolean z;
        String value;
        boolean z2;
        int i6;
        int i7;
        long j2;
        int i8;
        long j3;
        ObservableBoolean scheduleSupport;
        boolean z3;
        int i9;
        long j4;
        LiveData<?> sleepBreathDetectionSupport;
        Boolean value2;
        boolean zJ2;
        long j5;
        synchronized (this) {
            j = this.P;
            this.P = 0L;
        }
        SleepSettingViewModel sleepSettingViewModel = this.H;
        if ((8191 & j) != 0) {
            SleepSettingModel mModel = sleepSettingViewModel != null ? sleepSettingViewModel.getMModel() : null;
            long j6 = j & 6145;
            if (j6 == 0) {
                i4 = 0;
            } else {
                ObservableBoolean romSupport = mModel != null ? mModel.getRomSupport() : null;
                x0(0, romSupport);
                boolean z4 = romSupport != null ? romSupport.get() : false;
                if (j6 != 0) {
                    j |= z4 ? PlaybackStateCompat.ACTION_SET_REPEAT_MODE : PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                }
                if (z4) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
            }
            long j7 = j & 6146;
            if (j7 == 0) {
                i6 = 0;
            } else {
                ObservableBoolean deviceSupport = mModel != null ? mModel.getDeviceSupport() : null;
                x0(1, deviceSupport);
                boolean z5 = deviceSupport != null ? deviceSupport.get() : false;
                if (j7 != 0) {
                    j |= z5 ? PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH : PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                }
                if (z5) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
            }
            if ((j & 6148) != 0) {
                LiveData<?> snoreDetection = mModel != null ? mModel.getSnoreDetection() : null;
                w0(2, snoreDetection);
                remindTextWithAudioRecordPermCheckIfNeed = RemindTextConverter.INSTANCE.getRemindTextWithAudioRecordPermCheckIfNeed(ViewDataBinding.h0(snoreDetection != null ? snoreDetection.getValue() : null) == 2, true);
            } else {
                remindTextWithAudioRecordPermCheckIfNeed = null;
            }
            if ((j & 6152) != 0) {
                LiveData<?> sleepBreathDetectionSwitch = mModel != null ? mModel.getSleepBreathDetectionSwitch() : null;
                w0(3, sleepBreathDetectionSwitch);
                zJ0 = ViewDataBinding.j0(sleepBreathDetectionSwitch != null ? sleepBreathDetectionSwitch.getValue() : null);
            } else {
                zJ0 = false;
            }
            long j8 = j & 6160;
            if (j8 == 0) {
                i7 = 0;
            } else {
                LiveData<?> sleepBreathRateSupport = mModel != null ? mModel.getSleepBreathRateSupport() : null;
                w0(4, sleepBreathRateSupport);
                boolean zJ3 = ViewDataBinding.j0(sleepBreathRateSupport != null ? sleepBreathRateSupport.getValue() : null);
                if (j8 != 0) {
                    j |= zJ3 ? 4194304L : PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
                }
                if (zJ3) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
            }
            if ((j & 6176) != 0) {
                LiveData<?> sleepBreathRateSwitch = mModel != null ? mModel.getSleepBreathRateSwitch() : null;
                w0(5, sleepBreathRateSwitch);
                zJ1 = ViewDataBinding.j0(sleepBreathRateSwitch != null ? sleepBreathRateSwitch.getValue() : null);
            } else {
                zJ1 = false;
            }
            if ((j & 6208) == 0) {
                z = false;
            } else {
                ObservableBoolean sleepTraceEnabled = mModel != null ? mModel.getSleepTraceEnabled() : null;
                x0(6, sleepTraceEnabled);
                if (sleepTraceEnabled != null) {
                    z = sleepTraceEnabled.get();
                } else {
                    z = false;
                }
            }
            if ((j & 6272) == 0) {
                value = null;
            } else {
                LiveData<?> sleepGoalTimeText = mModel != null ? mModel.getSleepGoalTimeText() : null;
                w0(7, sleepGoalTimeText);
                if (sleepGoalTimeText != null) {
                    value = sleepGoalTimeText.getValue();
                } else {
                    value = null;
                }
            }
            if ((j & 6400) != 0) {
                ObservableBoolean deviceSleepAssistSwitch = mModel != null ? mModel.getDeviceSleepAssistSwitch() : null;
                x0(8, deviceSleepAssistSwitch);
                z2 = deviceSleepAssistSwitch != null ? deviceSleepAssistSwitch.get() : false;
                j2 = j & 6656;
                if (j2 == 0) {
                    i8 = 0;
                } else {
                    if (mModel != null) {
                        sleepBreathDetectionSupport = mModel.getSleepBreathDetectionSupport();
                    } else {
                        sleepBreathDetectionSupport = null;
                    }
                    w0(9, sleepBreathDetectionSupport);
                    if (sleepBreathDetectionSupport != null) {
                        value2 = sleepBreathDetectionSupport.getValue();
                    } else {
                        value2 = null;
                    }
                    zJ2 = ViewDataBinding.j0(value2);
                    if (j2 != 0) {
                        if (zJ2) {
                            j5 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                        } else {
                            j5 = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
                        }
                        j |= j5;
                    }
                    if (zJ2) {
                        i8 = 0;
                    } else {
                        i8 = 8;
                    }
                }
                j3 = j & 7168;
                if (j3 != 0) {
                    if (mModel != null) {
                        scheduleSupport = mModel.getScheduleSupport();
                    } else {
                        scheduleSupport = null;
                    }
                    x0(10, scheduleSupport);
                    if (scheduleSupport != null) {
                        z3 = scheduleSupport.get();
                    } else {
                        z3 = false;
                    }
                    if (j3 != 0) {
                        if (z3) {
                            j4 = 16384;
                        } else {
                            j4 = 8192;
                        }
                        j |= j4;
                    }
                    if (z3) {
                        i9 = 0;
                    } else {
                        i9 = 8;
                    }
                    i3 = i8;
                    i = i6;
                    i5 = i7;
                    i2 = i9;
                } else {
                    i3 = i8;
                    i = i6;
                    i5 = i7;
                    i2 = 0;
                }
            }
            j2 = j & 6656;
            if (j2 == 0) {
                i8 = 0;
            } else {
                if (mModel != null) {
                    sleepBreathDetectionSupport = mModel.getSleepBreathDetectionSupport();
                } else {
                    sleepBreathDetectionSupport = null;
                }
                w0(9, sleepBreathDetectionSupport);
                if (sleepBreathDetectionSupport != null) {
                    value2 = sleepBreathDetectionSupport.getValue();
                } else {
                    value2 = null;
                }
                zJ2 = ViewDataBinding.j0(value2);
                if (j2 != 0) {
                    if (zJ2) {
                        j5 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    } else {
                        j5 = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
                    }
                    j |= j5;
                }
                if (zJ2) {
                    i8 = 0;
                } else {
                    i8 = 8;
                }
            }
            j3 = j & 7168;
            if (j3 != 0) {
                if (mModel != null) {
                    scheduleSupport = mModel.getScheduleSupport();
                } else {
                    scheduleSupport = null;
                }
                x0(10, scheduleSupport);
                if (scheduleSupport != null) {
                    z3 = scheduleSupport.get();
                } else {
                    z3 = false;
                }
                if (j3 != 0) {
                    if (z3) {
                        j4 = 16384;
                    } else {
                        j4 = 8192;
                    }
                    j |= j4;
                }
                if (z3) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                i3 = i8;
                i = i6;
                i5 = i7;
                i2 = i9;
            } else {
                i3 = i8;
                i = i6;
                i5 = i7;
                i2 = 0;
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            remindTextWithAudioRecordPermCheckIfNeed = null;
            zJ0 = false;
            zJ1 = false;
            z = false;
            value = null;
            z2 = false;
        }
        if ((j & 6160) != 0) {
            this.A.setVisibility(i5);
        }
        if ((j & 6176) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.A, zJ1);
        }
        if ((j & 6145) != 0) {
            this.B.setVisibility(i4);
            this.L.setVisibility(i4);
            this.M.setVisibility(i4);
            this.D.setVisibility(i4);
            this.G.setVisibility(i4);
        }
        if ((6208 & j) != 0) {
            RightArrowBindingTwoLineTextView.setEnable(this.B, z);
            RightArrowBindingTwoLineTextView.setEnable(this.D, z);
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.G, z);
        }
        if ((j & 6146) != 0) {
            this.J.setVisibility(i);
            this.K.setVisibility(i);
            this.E.setVisibility(i);
        }
        if ((4096 & j) != 0) {
            this.N.setOnClickListener(this.O);
        }
        if ((7168 & j) != 0) {
            this.N.setVisibility(i2);
        }
        if ((6656 & j) != 0) {
            this.C.setVisibility(i3);
        }
        if ((j & 6152) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.C, zJ0);
        }
        if ((j & 6148) != 0) {
            RightArrowBindingTwoLineTextView.remindText(this.D, remindTextWithAudioRecordPermCheckIfNeed);
        }
        if ((6400 & j) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.E, z2);
        }
        if ((j & 6272) != 0) {
            RightArrowBindingTwoLineTextView.remindText(this.F, value);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (cv1.f14764b != i) {
            return false;
        }
        L0((SleepSettingViewModel) obj);
        return true;
    }

    public fwb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 13, Q, R));
    }
}
