package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.access.bean.DeviceModelsInfo;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;

/* JADX INFO: loaded from: classes7.dex */
public class a40 extends z30 {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F = null;
    public final ConstraintLayout C;
    public long D;

    public a40(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RightArrowBindingTwoLineTextView) objArr[1]);
        this.D = -1L;
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.C = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(DeviceModelsInfo deviceModelsInfo) {
        this.B = deviceModelsInfo;
        synchronized (this) {
            this.D |= 1;
        }
        notifyPropertyChanged(xv1.f39497b);
        super.e0();
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
        long j;
        String bindStatus;
        String icon;
        String name;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        DeviceModelsInfo deviceModelsInfo = this.B;
        long j2 = j & 3;
        if (j2 == 0 || deviceModelsInfo == null) {
            bindStatus = null;
            icon = null;
            name = null;
        } else {
            bindStatus = deviceModelsInfo.getBindStatus();
            icon = deviceModelsInfo.getIcon();
            name = deviceModelsInfo.getName();
        }
        if (j2 != 0) {
            RightArrowBindingTwoLineTextView.setIcon(this.A, icon);
            RightArrowBindingTwoLineTextView.remindText(this.A, bindStatus);
            RightArrowBindingTwoLineTextView.setTitle(this.A, name);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (xv1.f39497b != i) {
            return false;
        }
        A0((DeviceModelsInfo) obj);
        return true;
    }

    public a40(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 2, E, F));
    }
}
