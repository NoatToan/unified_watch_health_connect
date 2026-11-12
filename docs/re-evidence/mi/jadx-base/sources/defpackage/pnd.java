package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.about.bean.RnDeviceInfo;
import com.xiaomi.fitness.baseui.recyclerview.adapter.ImageViewBindingAdapter;

/* JADX INFO: loaded from: classes7.dex */
public class pnd extends ond {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G = null;
    public final ConstraintLayout D;
    public long E;

    public pnd(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[1], (TextView) objArr[2]);
        this.E = -1L;
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        this.B.setTag(null);
        o0(view);
        H();
    }

    public void A0(RnDeviceInfo rnDeviceInfo) {
        this.C = rnDeviceInfo;
        synchronized (this) {
            this.E |= 1;
        }
        notifyPropertyChanged(vv1.f37254b);
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
        String bigPreview;
        String name;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        RnDeviceInfo rnDeviceInfo = this.C;
        long j2 = j & 3;
        if (j2 == 0 || rnDeviceInfo == null) {
            bigPreview = null;
            name = null;
        } else {
            bigPreview = rnDeviceInfo.getBigPreview();
            name = rnDeviceInfo.getName();
        }
        if (j2 != 0) {
            ImageViewBindingAdapter.setIcon(this.A, bigPreview, null, null);
            r8p.b(this.B, name);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (vv1.f37254b != i) {
            return false;
        }
        A0((RnDeviceInfo) obj);
        return true;
    }

    public pnd(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, F, G));
    }
}
