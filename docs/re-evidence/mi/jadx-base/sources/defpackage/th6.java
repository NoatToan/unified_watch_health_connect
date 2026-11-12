package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalDeviceInfoModel;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalDeviceInfoViewModel;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes10.dex */
public class th6 extends sh6 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(zri.W0, 6);
        sparseIntArray.put(zri.N, 7);
    }

    public th6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (ImageView) objArr[7], (RightArrowBindingTwoLineTextView) objArr[3], (RightArrowBindingTwoLineTextView) objArr[2], (TextView) objArr[1], (RightArrowBindingTwoLineTextView) objArr[5], (RightArrowBindingTwoLineTextView) objArr[4], (LinearLayout) objArr[6], (NestedScrollView) objArr[0]);
        this.J = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.H.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(MutableLiveData<LocalDeviceInfoModel> mutableLiveData, int i) {
        if (i != pv1.f30813a) {
            return false;
        }
        synchronized (this) {
            this.J |= 1;
        }
        return true;
    }

    public void B0(LocalDeviceInfoViewModel localDeviceInfoViewModel) {
        this.I = localDeviceInfoViewModel;
        synchronized (this) {
            this.J |= 2;
        }
        notifyPropertyChanged(pv1.i);
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
            this.J = 4L;
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

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        String sn;
        String name;
        String str;
        String model;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        LocalDeviceInfoViewModel localDeviceInfoViewModel = this.I;
        long j2 = 7 & j;
        String str2 = null;
        if (j2 == 0) {
            sn = null;
            name = null;
            str = null;
            model = null;
        } else {
            MutableLiveData<LocalDeviceInfoModel> deviceInfo = localDeviceInfoViewModel != null ? localDeviceInfoViewModel.getDeviceInfo() : null;
            w0(0, deviceInfo);
            LocalDeviceInfoModel value = deviceInfo != null ? deviceInfo.getValue() : null;
            if (value != null) {
                String fwVersion = value.getFwVersion();
                name = value.getName();
                String mac = value.getMac();
                model = value.getModel();
                sn = value.getSn();
                str = fwVersion;
                str2 = mac;
            } else {
                sn = null;
                name = null;
                str = null;
                model = null;
            }
        }
        if ((j & 4) != 0) {
            RightArrowBindingTwoLineTextView.showMore(this.B, false);
            RightArrowBindingTwoLineTextView.showMore(this.C, false);
            RightArrowBindingTwoLineTextView.showMore(this.E, false);
            RightArrowBindingTwoLineTextView.showMore(this.F, false);
        }
        if (j2 != 0) {
            RightArrowBindingTwoLineTextView.remindText(this.B, str2);
            RightArrowBindingTwoLineTextView.remindText(this.C, model);
            r8p.b(this.D, name);
            RightArrowBindingTwoLineTextView.remindText(this.E, sn);
            RightArrowBindingTwoLineTextView.remindText(this.F, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (pv1.i != i) {
            return false;
        }
        B0((LocalDeviceInfoViewModel) obj);
        return true;
    }

    public th6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, K, L));
    }
}
