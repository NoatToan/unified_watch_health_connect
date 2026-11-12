package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.sleep.viewmodel.BleSleepSettingViewModel;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class bg6 extends ag6 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H = null;
    public final LinearLayout E;
    public long F;

    public bg6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 5, (SwitchButtonTwoLineTextView) objArr[3], (SwitchButtonTwoLineTextView) objArr[2], (SwitchButtonBindingTwoLineTextView) objArr[1]);
        this.F = -1L;
        this.A.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.E = linearLayout;
        linearLayout.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.F |= 4;
        }
        return true;
    }

    public final boolean B0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.F |= 8;
        }
        return true;
    }

    public final boolean C0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.F |= 1;
        }
        return true;
    }

    public final boolean D0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.F |= 2;
        }
        return true;
    }

    public final boolean E0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.F |= 16;
        }
        return true;
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

    public void F0(BleSleepSettingViewModel bleSleepSettingViewModel) {
        this.D = bleSleepSettingViewModel;
        synchronized (this) {
            this.F |= 32;
        }
        notifyPropertyChanged(bw1.f);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.F = 64L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return C0((MutableLiveData) obj, i2);
        }
        if (i == 1) {
            return D0((MutableLiveData) obj, i2);
        }
        if (i == 2) {
            return A0((MutableLiveData) obj, i2);
        }
        if (i == 3) {
            return B0((MutableLiveData) obj, i2);
        }
        if (i != 4) {
            return false;
        }
        return E0((MutableLiveData) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053 A[PHI: r2
      0x0053: PHI (r2v3 long) = (r2v0 long), (r2v9 long) binds: [B:9:0x0022, B:23:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae A[PHI: r2
      0x00ae: PHI (r2v5 long) = (r2v4 long), (r2v7 long) binds: [B:39:0x007c, B:53:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        boolean z;
        boolean zJ0;
        int i;
        int i2;
        boolean zJ1;
        int i3;
        boolean zJ2;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        BleSleepSettingViewModel bleSleepSettingViewModel = this.D;
        if ((127 & j) != 0) {
            long j2 = j & 97;
            if (j2 == 0) {
                i3 = 0;
            } else {
                MutableLiveData<Boolean> sleepRateSupport = bleSleepSettingViewModel != null ? bleSleepSettingViewModel.getSleepRateSupport() : null;
                w0(0, sleepRateSupport);
                boolean zJ3 = ViewDataBinding.j0(sleepRateSupport != null ? sleepRateSupport.getValue() : null);
                if (j2 != 0) {
                    j |= zJ3 ? 1024L : 512L;
                }
                if (zJ3) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
            }
            if ((j & 98) != 0) {
                MutableLiveData<Boolean> sleepRateSwitch = bleSleepSettingViewModel != null ? bleSleepSettingViewModel.getSleepRateSwitch() : null;
                w0(1, sleepRateSwitch);
                zJ2 = ViewDataBinding.j0(sleepRateSwitch != null ? sleepRateSwitch.getValue() : null);
            } else {
                zJ2 = false;
            }
            long j3 = j & 100;
            if (j3 == 0) {
                i2 = 0;
            } else {
                MutableLiveData<Boolean> sleepBreathSupport = bleSleepSettingViewModel != null ? bleSleepSettingViewModel.getSleepBreathSupport() : null;
                w0(2, sleepBreathSupport);
                boolean zJ4 = ViewDataBinding.j0(sleepBreathSupport != null ? sleepBreathSupport.getValue() : null);
                if (j3 != 0) {
                    j |= zJ4 ? 256L : 128L;
                }
                if (zJ4) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
            }
            if ((j & 104) != 0) {
                MutableLiveData<Boolean> sleepBreathSwitch = bleSleepSettingViewModel != null ? bleSleepSettingViewModel.getSleepBreathSwitch() : null;
                w0(3, sleepBreathSwitch);
                zJ1 = ViewDataBinding.j0(sleepBreathSwitch != null ? sleepBreathSwitch.getValue() : null);
            } else {
                zJ1 = false;
            }
            if ((j & 112) != 0) {
                MutableLiveData<Boolean> sleepSettingSwitch = bleSleepSettingViewModel != null ? bleSleepSettingViewModel.getSleepSettingSwitch() : null;
                w0(4, sleepSettingSwitch);
                int i4 = i3;
                zJ0 = ViewDataBinding.j0(sleepSettingSwitch != null ? sleepSettingSwitch.getValue() : null);
                z = zJ2;
                i = i4;
            } else {
                z = zJ2;
                i = i3;
                zJ0 = false;
            }
        } else {
            z = false;
            zJ0 = false;
            i = 0;
            i2 = 0;
            zJ1 = false;
        }
        if ((97 & j) != 0) {
            this.A.setVisibility(i);
        }
        if ((j & 98) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.A, z);
        }
        if ((100 & j) != 0) {
            this.B.setVisibility(i2);
        }
        if ((j & 104) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.B, zJ1);
        }
        if ((j & 112) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.C, zJ0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.f != i) {
            return false;
        }
        F0((BleSleepSettingViewModel) obj);
        return true;
    }

    public bg6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, G, H));
    }
}
