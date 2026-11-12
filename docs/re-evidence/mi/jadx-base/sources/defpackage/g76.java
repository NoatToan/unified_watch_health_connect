package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.ui.AddDeviceView;
import com.xiaomi.fitness.device.manager.ui.DeviceDetail;

/* JADX INFO: loaded from: classes8.dex */
public class g76 extends f76 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public final AddDeviceView B;
    public long C;

    public g76(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0);
        this.C = -1L;
        AddDeviceView addDeviceView = (AddDeviceView) objArr[0];
        this.B = addDeviceView;
        addDeviceView.setTag(null);
        o0(view);
        H();
    }

    public void A0(DeviceDetail deviceDetail) {
        this.A = deviceDetail;
        synchronized (this) {
            this.C |= 1;
        }
        notifyPropertyChanged(zv1.d);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.C = 2L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        DeviceDetail deviceDetail = this.A;
        long j2 = j & 3;
        int i = 0;
        if (j2 != 0) {
            boolean zIsEditMode = deviceDetail != null ? deviceDetail.isEditMode() : false;
            if (j2 != 0) {
                j |= zIsEditMode ? 8L : 4L;
            }
            if (zIsEditMode) {
                i = 4;
            }
        }
        if ((j & 3) != 0) {
            this.B.setVisibility(i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.d != i) {
            return false;
        }
        A0((DeviceDetail) obj);
        return true;
    }

    public g76(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
