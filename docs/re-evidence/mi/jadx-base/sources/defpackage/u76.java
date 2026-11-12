package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;

/* JADX INFO: loaded from: classes8.dex */
public class u76 extends t76 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public long C;

    public u76(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[0]);
        this.C = -1L;
        this.A.setTag(null);
        o0(view);
        H();
    }

    public void A0(DeviceInfo deviceInfo) {
        this.B = deviceInfo;
        synchronized (this) {
            this.C |= 1;
        }
        notifyPropertyChanged(zv1.f);
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
        DeviceInfo deviceInfo = this.B;
        long j2 = j & 3;
        String name = (j2 == 0 || deviceInfo == null) ? null : deviceInfo.getName();
        if (j2 != 0) {
            r8p.b(this.A, name);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.f != i) {
            return false;
        }
        A0((DeviceInfo) obj);
        return true;
    }

    public u76(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
