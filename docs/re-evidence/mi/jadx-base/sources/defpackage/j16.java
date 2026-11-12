package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import com.xiaomi.fitness.device.manager.ui.bind.BindViewModel;
import com.xiaomi.fitness.ubox.export.DeviceIconView;

/* JADX INFO: loaded from: classes8.dex */
public class j16 extends i16 {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final LinearLayout N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(xqi.M, 8);
        sparseIntArray.put(xqi.p, 9);
        sparseIntArray.put(xqi.s, 10);
        sparseIntArray.put(xqi.F0, 11);
    }

    public j16(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 3, (LinearLayout) objArr[9], (TextView) objArr[2], (TextView) objArr[1], (ScrollView) objArr[8], (TextView) objArr[6], (TextView) objArr[3], (TextView) objArr[7], (DeviceIconView) objArr[10], (CheckBox) objArr[4], (TextView) objArr[5], (TextView) objArr[11]);
        this.O = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.N = linearLayout;
        linearLayout.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.O |= 2;
        }
        return true;
    }

    public final boolean B0(ObservableInt observableInt, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.O |= 4;
        }
        return true;
    }

    public final boolean C0(ObservableInt observableInt, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.O |= 1;
        }
        return true;
    }

    public void D0(DeviceInfo deviceInfo) {
        this.M = deviceInfo;
        synchronized (this) {
            this.O |= 8;
        }
        notifyPropertyChanged(zv1.e);
        super.e0();
    }

    public void E0(BindViewModel bindViewModel) {
        this.L = bindViewModel;
        synchronized (this) {
            this.O |= 16;
        }
        notifyPropertyChanged(zv1.f41707k);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.O = 32L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return C0((ObservableInt) obj, i2);
        }
        if (i == 1) {
            return A0((MutableLiveData) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return B0((ObservableInt) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        int i;
        String value;
        int i2;
        synchronized (this) {
            j = this.O;
            this.O = 0L;
        }
        DeviceInfo deviceInfo = this.M;
        BindViewModel bindViewModel = this.L;
        long j2 = 40 & j;
        String name = (j2 == 0 || deviceInfo == null) ? null : deviceInfo.getName();
        if ((55 & j) != 0) {
            if ((j & 49) == 0) {
                i2 = 0;
            } else {
                ObservableInt silentUpgrade = bindViewModel != null ? bindViewModel.getSilentUpgrade() : null;
                x0(0, silentUpgrade);
                if (silentUpgrade != null) {
                    i2 = silentUpgrade.get();
                } else {
                    i2 = 0;
                }
            }
            if ((j & 50) == 0) {
                value = null;
            } else {
                LiveData<?> bindStatusTip = bindViewModel != null ? bindViewModel.getBindStatusTip() : null;
                w0(1, bindStatusTip);
                if (bindStatusTip != null) {
                    value = bindStatusTip.getValue();
                } else {
                    value = null;
                }
            }
            if ((j & 52) == 0) {
                i = 0;
            } else {
                ObservableInt isFail = bindViewModel != null ? bindViewModel.getIsFail() : null;
                x0(2, isFail);
                if (isFail != null) {
                    i = isFail.get();
                } else {
                    i = 0;
                }
            }
        } else {
            i = 0;
            value = null;
            i2 = 0;
        }
        if ((50 & j) != 0) {
            r8p.b(this.B, value);
        }
        if (j2 != 0) {
            r8p.b(this.C, name);
        }
        if ((j & 52) != 0) {
            this.E.setVisibility(i);
            this.F.setVisibility(i);
            this.G.setVisibility(i);
        }
        if ((j & 49) != 0) {
            this.I.setVisibility(i2);
            this.J.setVisibility(i2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.e == i) {
            D0((DeviceInfo) obj);
        } else {
            if (zv1.f41707k != i) {
                return false;
            }
            E0((BindViewModel) obj);
        }
        return true;
    }

    public j16(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, P, Q));
    }
}
