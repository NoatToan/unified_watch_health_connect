package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.devicesettings.base.about.DeviceInfoModel;
import com.xiaomi.fitness.devicesettings.base.about.DeviceInfoViewModel;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public class lj6 extends kj6 {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(zqi.m1, 7);
        sparseIntArray.put(zqi.i4, 8);
        sparseIntArray.put(zqi.o1, 9);
        sparseIntArray.put(zqi.x1, 10);
        sparseIntArray.put(zqi.S1, 11);
        sparseIntArray.put(zqi.H6, 12);
        sparseIntArray.put(zqi.v2, 13);
    }

    public lj6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (AppCompatImageButton) objArr[7], (ImageView) objArr[9], (RightArrowBindingSingleLineTextView) objArr[6], (RightArrowBindingTwoLineTextView) objArr[3], (RightArrowBindingTwoLineTextView) objArr[2], (TextView) objArr[1], (RightArrowTwoLineTextView) objArr[10], (RightArrowBindingTwoLineTextView) objArr[5], (RightArrowTwoLineTextView) objArr[11], (RightArrowBindingTwoLineTextView) objArr[4], (RightArrowTwoLineTextView) objArr[13], (LinearLayout) objArr[8], (RightArrowTwoLineTextView) objArr[12], (NestedScrollView) objArr[0]);
        this.P = -1L;
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.H.setTag(null);
        this.J.setTag(null);
        this.N.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(MutableLiveData<DeviceInfoModel> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.P |= 1;
        }
        return true;
    }

    public void B0(DeviceInfoViewModel deviceInfoViewModel) {
        this.O = deviceInfoViewModel;
        synchronized (this) {
            this.P |= 2;
        }
        notifyPropertyChanged(bw1.f);
        super.e0();
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

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.P = 4L;
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
            j = this.P;
            this.P = 0L;
        }
        DeviceInfoViewModel deviceInfoViewModel = this.O;
        long j2 = 7 & j;
        String str2 = null;
        if (j2 == 0) {
            sn = null;
            name = null;
            str = null;
            model = null;
        } else {
            MutableLiveData<DeviceInfoModel> deviceInfo = deviceInfoViewModel != null ? deviceInfoViewModel.getDeviceInfo() : null;
            w0(0, deviceInfo);
            DeviceInfoModel value = deviceInfo != null ? deviceInfo.getValue() : null;
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
            RightArrowBindingSingleLineTextView.showMore(this.C, true);
            RightArrowBindingTwoLineTextView.showMore(this.D, false);
            RightArrowBindingTwoLineTextView.showMore(this.E, false);
            RightArrowBindingTwoLineTextView.showMore(this.H, false);
            RightArrowBindingTwoLineTextView.showMore(this.J, false);
        }
        if (j2 != 0) {
            RightArrowBindingTwoLineTextView.remindText(this.D, str2);
            RightArrowBindingTwoLineTextView.remindText(this.E, model);
            r8p.b(this.F, name);
            RightArrowBindingTwoLineTextView.remindText(this.H, sn);
            RightArrowBindingTwoLineTextView.remindText(this.J, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.f != i) {
            return false;
        }
        B0((DeviceInfoViewModel) obj);
        return true;
    }

    public lj6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 14, Q, R));
    }
}
