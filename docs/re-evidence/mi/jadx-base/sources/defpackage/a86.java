package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.ui.DeviceDetail;

/* JADX INFO: loaded from: classes8.dex */
public class a86 extends z76 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final ConstraintLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(xqi.i0, 2);
        sparseIntArray.put(xqi.e0, 3);
        sparseIntArray.put(xqi.E0, 4);
        sparseIntArray.put(xqi.j0, 5);
    }

    public a86(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Guideline) objArr[3], (ImageView) objArr[2], (ImageView) objArr[5], (TextView) objArr[4], (TextView) objArr[1]);
        this.H = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        this.E.setTag(null);
        o0(view);
        H();
    }

    public void A0(DeviceDetail deviceDetail) {
        this.F = deviceDetail;
        synchronized (this) {
            this.H |= 1;
        }
        notifyPropertyChanged(zv1.g);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.H = 2L;
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
            j = this.H;
            this.H = 0L;
        }
        DeviceDetail deviceDetail = this.F;
        long j2 = j & 3;
        String name = (j2 == 0 || deviceDetail == null) ? null : deviceDetail.getName();
        if (j2 != 0) {
            r8p.b(this.E, name);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.g != i) {
            return false;
        }
        A0((DeviceDetail) obj);
        return true;
    }

    public a86(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, I, J));
    }
}
