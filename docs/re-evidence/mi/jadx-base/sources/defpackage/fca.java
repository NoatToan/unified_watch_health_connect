package defpackage;

import android.content.res.Resources;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SleepModelModel;
import com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SleepModelViewModel;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class fca extends eca {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(zqi.q8, 7);
        sparseIntArray.put(zqi.g2, 8);
    }

    public fca(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 8, (SwitchButtonBindingTwoLineTextView) objArr[3], (View) objArr[8], (SwitchButtonBindingSingleLineTextView) objArr[6], (TextView) objArr[7], (TextView) objArr[1], (RightArrowBindingSingleLineTextView) objArr[4], (SwitchButtonBindingTwoLineTextView) objArr[2], (RightArrowBindingSingleLineTextView) objArr[5]);
        this.K = -1L;
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        this.C.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(ObservableBoolean observableBoolean, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.K |= 128;
        }
        return true;
    }

    public final boolean B0(ObservableBoolean observableBoolean, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.K |= 8;
        }
        return true;
    }

    public final boolean C0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.K |= 1;
        }
        return true;
    }

    public final boolean D0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.K |= 64;
        }
        return true;
    }

    public final boolean E0(ObservableBoolean observableBoolean, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.K |= 16;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean F0(ObservableBoolean observableBoolean, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.K |= 4;
        }
        return true;
    }

    public final boolean G0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.K |= 32;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 512L;
        }
        e0();
    }

    public final boolean H0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.K |= 2;
        }
        return true;
    }

    public void I0(SleepModelViewModel sleepModelViewModel) {
        this.I = sleepModelViewModel;
        synchronized (this) {
            this.K |= 256;
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
                return H0((MutableLiveData) obj, i2);
            case 2:
                return F0((ObservableBoolean) obj, i2);
            case 3:
                return B0((ObservableBoolean) obj, i2);
            case 4:
                return E0((ObservableBoolean) obj, i2);
            case 5:
                return G0((MutableLiveData) obj, i2);
            case 6:
                return D0((MutableLiveData) obj, i2);
            case 7:
                return A0((ObservableBoolean) obj, i2);
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0239 A[PHI: r2
      0x0239: PHI (r2v4 long) = (r2v3 long), (r2v18 long) binds: [B:155:0x021c, B:164:0x0233] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x012f  */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        long j2;
        SleepModelModel mModel;
        String value;
        String value2;
        ObservableBoolean supportSyncMiuiSleepModel;
        LiveData<?> switchOn;
        String value3;
        Boolean value4;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean zJ0;
        boolean z4;
        long j3;
        ObservableBoolean supportSetWakeAlarm;
        boolean z5;
        int i2;
        int i3;
        int i4;
        boolean z6;
        String string;
        int i5;
        Resources resources;
        int i6;
        synchronized (this) {
            j = this.K;
            this.K = 0L;
        }
        SleepModelViewModel sleepModelViewModel = this.I;
        String string2 = null;
        if ((1023 & j) != 0) {
            mModel = sleepModelViewModel != null ? sleepModelViewModel.getMModel() : null;
            if ((j & 769) == 0) {
                value = null;
            } else {
                LiveData<?> liveDataM272getSleepTimeSelectorText = mModel != null ? mModel.m272getSleepTimeSelectorText() : null;
                w0(0, liveDataM272getSleepTimeSelectorText);
                if (liveDataM272getSleepTimeSelectorText != null) {
                    value = liveDataM272getSleepTimeSelectorText.getValue();
                } else {
                    value = null;
                }
            }
            if ((j & 770) == 0) {
                value2 = null;
            } else {
                LiveData<?> liveDataM274getWakeUpTimeSelectorText = mModel != null ? mModel.m274getWakeUpTimeSelectorText() : null;
                w0(1, liveDataM274getWakeUpTimeSelectorText);
                if (liveDataM274getWakeUpTimeSelectorText != null) {
                    value2 = liveDataM274getWakeUpTimeSelectorText.getValue();
                } else {
                    value2 = null;
                }
            }
            if ((j & 820) != 0) {
                supportSyncMiuiSleepModel = mModel != null ? mModel.getSupportSyncMiuiSleepModel() : null;
                x0(2, supportSyncMiuiSleepModel);
                z2 = supportSyncMiuiSleepModel != null ? supportSyncMiuiSleepModel.get() : false;
                if ((j & 788) != 0) {
                    j = z2 ? j | PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID : j | 16384;
                }
                z4 = !z2;
                if ((j & 804) != 0) {
                    j = z4 ? j | 2048 : j | 1024;
                }
                if ((j & 820) != 0) {
                    j = z4 ? j | PlaybackStateCompat.ACTION_PREPARE_FROM_URI : j | PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                }
            } else {
                supportSyncMiuiSleepModel = null;
                z2 = false;
                z4 = false;
            }
            if ((j & 776) == 0) {
                z3 = false;
            } else {
                ObservableBoolean setAlarmSwitch = mModel != null ? mModel.getSetAlarmSwitch() : null;
                x0(3, setAlarmSwitch);
                if (setAlarmSwitch != null) {
                    z3 = setAlarmSwitch.get();
                } else {
                    z3 = false;
                }
            }
            if ((j & 800) != 0) {
                switchOn = mModel != null ? mModel.getSwitchOn() : null;
                w0(5, switchOn);
                value4 = switchOn != null ? switchOn.getValue() : null;
                zJ0 = ViewDataBinding.j0(value4);
            } else {
                switchOn = null;
                value4 = null;
                zJ0 = false;
            }
            if ((j & 832) == 0) {
                value3 = null;
            } else {
                LiveData<?> liveDataM273getSubTitle = mModel != null ? mModel.m273getSubTitle() : null;
                w0(6, liveDataM273getSubTitle);
                if (liveDataM273getSubTitle != null) {
                    value3 = liveDataM273getSubTitle.getValue();
                } else {
                    value3 = null;
                }
            }
            long j4 = j & 900;
            if (j4 != 0) {
                ObservableBoolean loadComplete = mModel != null ? mModel.getLoadComplete() : null;
                x0(7, loadComplete);
                z = loadComplete != null ? loadComplete.get() : false;
                if (j4 != 0) {
                    j |= z ? 8192L : 4096L;
                }
                j2 = 0;
                if ((j & 896) != 0) {
                    j |= z ? 33554432L : 16777216L;
                }
                if ((j & 896) != 0 && !z) {
                    i = 4;
                }
            } else {
                j2 = 0;
                z = false;
            }
            i = 0;
        } else {
            j2 = 0;
            mModel = null;
            value = null;
            value2 = null;
            supportSyncMiuiSleepModel = null;
            switchOn = null;
            value3 = null;
            value4 = null;
            z = false;
            i = 0;
            z2 = false;
            z3 = false;
            zJ0 = false;
            z4 = false;
        }
        if ((j & 8192) != j2) {
            if (mModel != null) {
                supportSyncMiuiSleepModel = mModel.getSupportSyncMiuiSleepModel();
            }
            x0(2, supportSyncMiuiSleepModel);
            if (supportSyncMiuiSleepModel != null) {
                z2 = supportSyncMiuiSleepModel.get();
            }
            j3 = 0;
            if ((j & 788) != 0) {
                j = z2 ? j | PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID : j | 16384;
            }
        } else {
            j3 = 0;
        }
        if ((j & PlaybackStateCompat.ACTION_PREPARE_FROM_URI) != j3) {
            supportSetWakeAlarm = mModel != null ? mModel.getSupportSetWakeAlarm() : null;
            x0(4, supportSetWakeAlarm);
            z5 = supportSetWakeAlarm != null ? supportSetWakeAlarm.get() : false;
            if ((j & 16384) != 0) {
                j |= z5 ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
            }
        } else {
            supportSetWakeAlarm = null;
            z5 = false;
        }
        if ((j & 2048) != 0) {
            if (mModel != null) {
                switchOn = mModel.getSwitchOn();
            }
            w0(5, switchOn);
            if (switchOn != null) {
                value4 = switchOn.getValue();
            }
            zJ0 = ViewDataBinding.j0(value4);
        }
        long j5 = j & 804;
        if (j5 == 0) {
            i2 = 0;
        } else {
            boolean z7 = z4 ? zJ0 : false;
            if (j5 != 0) {
                j |= z7 ? 536870912L : 268435456L;
            }
            if (z7) {
                i2 = 0;
            } else {
                i2 = 8;
            }
        }
        long j6 = j & 900;
        if (j6 != 0) {
            boolean z8 = z ? z2 : false;
            if (j6 != 0) {
                j |= z8 ? 2149580800L : 1074790400L;
            }
            i3 = z8 ? 0 : 8;
            i4 = z8 ? 8 : 0;
        } else {
            i3 = 0;
            i4 = 0;
        }
        long j7 = j & 820;
        if (j7 != 0) {
            z6 = z4 ? z5 : false;
            if (j7 != 0) {
                j |= z6 ? 134217728L : 67108864L;
            }
        } else {
            z6 = false;
        }
        long j8 = j & 16384;
        if (j8 != 0) {
            if (mModel != null) {
                supportSetWakeAlarm = mModel.getSupportSetWakeAlarm();
            }
            ObservableBoolean observableBoolean = supportSetWakeAlarm;
            x0(4, observableBoolean);
            boolean z9 = observableBoolean != null ? observableBoolean.get() : z5;
            if (j8 != 0) {
                j |= z9 ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
            }
            if (z9) {
                resources = this.E.getResources();
                i6 = wzi.i7;
            } else {
                resources = this.E.getResources();
                i6 = wzi.h7;
            }
            string = resources.getString(i6);
        } else {
            string = null;
        }
        if ((j & 134217728) != 0) {
            LiveData<?> switchOn2 = mModel != null ? mModel.getSwitchOn() : switchOn;
            w0(5, switchOn2);
            zJ0 = ViewDataBinding.j0(switchOn2 != null ? switchOn2.getValue() : value4);
        }
        boolean z10 = zJ0;
        if ((j & 788) != 0) {
            string2 = z2 ? this.E.getResources().getString(wzi.j7) : string;
        }
        String str = string2;
        long j9 = j & 820;
        if (j9 != 0) {
            boolean z11 = z6 ? z10 : false;
            if (j9 != 0) {
                j |= z11 ? 8388608L : 4194304L;
            }
            i5 = z11 ? 0 : 8;
        } else {
            i5 = 0;
        }
        if ((j & 900) != 0) {
            this.A.setVisibility(i4);
            this.G.setVisibility(i3);
        }
        if ((j & 896) != 0) {
            SwitchButtonBindingTwoLineTextView.setEnable(this.A, z);
            this.E.setVisibility(i);
            RightArrowBindingSingleLineTextView.setEnable(this.F, z);
            SwitchButtonBindingTwoLineTextView.setEnable(this.G, z);
            RightArrowBindingSingleLineTextView.setEnable(this.H, z);
        }
        if ((832 & j) != 0) {
            SwitchButtonBindingTwoLineTextView.setSubtitle(this.A, value3);
            SwitchButtonBindingTwoLineTextView.setSubtitle(this.G, value3);
        }
        if ((800 & j) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.A, z10);
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.G, z10);
        }
        if ((j & 820) != 0) {
            this.C.setVisibility(i5);
        }
        if ((776 & j) != 0) {
            SwitchButtonBindingSingleLineTextView.setSwitchOn(this.C, z3);
        }
        if ((j & 788) != 0) {
            r8p.b(this.E, str);
        }
        if ((j & 804) != 0) {
            this.F.setVisibility(i2);
            this.H.setVisibility(i2);
        }
        if ((j & 769) != 0) {
            RightArrowBindingSingleLineTextView.remindText(this.F, value);
        }
        if ((j & 770) != 0) {
            RightArrowBindingSingleLineTextView.remindText(this.H, value2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.f != i) {
            return false;
        }
        I0((SleepModelViewModel) obj);
        return true;
    }

    public fca(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, L, M));
    }
}
