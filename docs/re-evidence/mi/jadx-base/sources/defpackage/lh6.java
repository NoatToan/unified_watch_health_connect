package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingViewModel;
import com.xiaomi.fitness.devicesettings.widget.DeviceReminderView;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class lh6 extends kh6 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final LinearLayout G;
    public final DeviceReminderView H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(zqi.v3, 2);
        sparseIntArray.put(zqi.x3, 3);
        sparseIntArray.put(zqi.P4, 4);
        sparseIntArray.put(zqi.f, 5);
        sparseIntArray.put(zqi.t3, 6);
    }

    public lh6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (SwitchButtonTwoLineTextView) objArr[5], (SwitchButtonTwoLineTextView) objArr[6], (RightArrowTwoLineTextView) objArr[2], (RightArrowTwoLineTextView) objArr[3], (RightArrowTwoLineTextView) objArr[4]);
        this.I = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.G = linearLayout;
        linearLayout.setTag(null);
        DeviceReminderView deviceReminderView = (DeviceReminderView) objArr[1];
        this.H = deviceReminderView;
        deviceReminderView.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(MutableLiveData<Integer> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.I |= 1;
        }
        return true;
    }

    public void B0(HuamiHrSettingViewModel huamiHrSettingViewModel) {
        this.F = huamiHrSettingViewModel;
        synchronized (this) {
            this.I |= 2;
        }
        notifyPropertyChanged(bw1.f);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.I = 4L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((MutableLiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        HuamiHrSettingViewModel huamiHrSettingViewModel = this.F;
        long j2 = j & 7;
        int iH0 = 0;
        if (j2 != 0) {
            MutableLiveData<Integer> type = huamiHrSettingViewModel != null ? huamiHrSettingViewModel.getType() : null;
            w0(0, type);
            iH0 = ViewDataBinding.h0(type != null ? type.getValue() : null);
        }
        if (j2 != 0) {
            this.H.setType(iH0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.f != i) {
            return false;
        }
        B0((HuamiHrSettingViewModel) obj);
        return true;
    }

    public lh6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, J, K));
    }
}
