package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel;
import com.xiaomi.fitness.devicesettings.widget.DeviceReminderView;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes8.dex */
public class fh6 extends eh6 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final SpringBackLayout I;
    public final DeviceReminderView J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(zqi.G8, 2);
        sparseIntArray.put(zqi.m5, 3);
        sparseIntArray.put(zqi.c4, 4);
        sparseIntArray.put(zqi.e, 5);
        sparseIntArray.put(zqi.E6, 6);
        sparseIntArray.put(zqi.Xa, 7);
        sparseIntArray.put(zqi.Ya, 8);
    }

    public fh6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (SwitchButtonTwoLineTextView) objArr[5], (RightArrowTwoLineTextView) objArr[4], (RightArrowTwoLineTextView) objArr[3], (SwitchButtonTwoLineTextView) objArr[6], (NestedScrollView) objArr[2], (SwitchButtonTwoLineTextView) objArr[7], (RightArrowTwoLineTextView) objArr[8]);
        this.K = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.I = springBackLayout;
        springBackLayout.setTag(null);
        DeviceReminderView deviceReminderView = (DeviceReminderView) objArr[1];
        this.J = deviceReminderView;
        deviceReminderView.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(MutableLiveData<Integer> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.K |= 1;
        }
        return true;
    }

    public void B0(HrHuaMiSettingViewModel hrHuaMiSettingViewModel) {
        this.H = hrHuaMiSettingViewModel;
        synchronized (this) {
            this.K |= 2;
        }
        notifyPropertyChanged(bw1.f);
        super.e0();
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

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 4L;
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
            j = this.K;
            this.K = 0L;
        }
        HrHuaMiSettingViewModel hrHuaMiSettingViewModel = this.H;
        long j2 = j & 7;
        int iH0 = 0;
        if (j2 != 0) {
            MutableLiveData<Integer> type = hrHuaMiSettingViewModel != null ? hrHuaMiSettingViewModel.getType() : null;
            w0(0, type);
            iH0 = ViewDataBinding.h0(type != null ? type.getValue() : null);
        }
        if (j2 != 0) {
            this.J.setType(iH0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.f != i) {
            return false;
        }
        B0((HrHuaMiSettingViewModel) obj);
        return true;
    }

    public fh6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, L, M));
    }
}
