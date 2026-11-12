package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceViewModel;
import com.xiaomi.fitness.widget.SquareImageView;

/* JADX INFO: loaded from: classes8.dex */
public class tu6 extends su6 {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(xqi.K, 1);
    }

    public tu6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[0], (SquareImageView) objArr[1]);
        this.D = -1L;
        this.A.setTag(null);
        o0(view);
        H();
    }

    public void A0(ScanDeviceViewModel scanDeviceViewModel) {
        this.C = scanDeviceViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.D = 2L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.D = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.f41707k != i) {
            return false;
        }
        A0((ScanDeviceViewModel) obj);
        return true;
    }

    public tu6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 2, E, F));
    }
}
