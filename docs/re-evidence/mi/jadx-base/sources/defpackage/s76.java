package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import com.xiaomi.fitness.widget.SquareImageView;

/* JADX INFO: loaded from: classes8.dex */
public class s76 extends r76 {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G;
    public final LinearLayout D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(xqi.w, 2);
    }

    public s76(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (SquareImageView) objArr[2], (TextView) objArr[1]);
        this.E = -1L;
        this.B.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.D = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(DeviceInfo deviceInfo) {
        this.C = deviceInfo;
        synchronized (this) {
            this.E |= 1;
        }
        notifyPropertyChanged(zv1.f);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.E = 2L;
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
            j = this.E;
            this.E = 0L;
        }
        DeviceInfo deviceInfo = this.C;
        long j2 = j & 3;
        String name = (j2 == 0 || deviceInfo == null) ? null : deviceInfo.getName();
        if (j2 != 0) {
            r8p.b(this.B, name);
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

    public s76(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, F, G));
    }
}
