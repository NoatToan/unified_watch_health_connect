package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.ui.DeviceDetail;
import com.xiaomi.fitness.device.manager.ui.manager.DeviceSwipeView;

/* JADX INFO: loaded from: classes8.dex */
public class o76 extends n76 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public long C;

    public o76(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (DeviceSwipeView) objArr[0]);
        this.C = -1L;
        this.A.setTag(null);
        o0(view);
        H();
    }

    public void A0(DeviceDetail deviceDetail) {
        this.B = deviceDetail;
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
        DeviceDetail deviceDetail = this.B;
        if ((j & 3) != 0) {
            DeviceSwipeView.setDeviceDetail(this.A, deviceDetail);
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

    public o76(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
