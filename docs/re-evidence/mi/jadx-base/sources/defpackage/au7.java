package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.adapter.ImageViewBindingAdapter;
import com.xiaomi.fitness.eco.device.manager.ui.BloodSugarDeviceDetail;
import com.xiaomi.fitness.eco.device.manager.ui.EarPhoneDeviceDetail;
import com.xiaomi.fitness.eco.device.manager.ui.EcoDeviceDetail;

/* JADX INFO: loaded from: classes8.dex */
public class au7 extends zt7 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J = null;
    public final ConstraintLayout G;
    public long H;

    public au7(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[1], (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[4], (TextView) objArr[5]);
        this.H = -1L;
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        o0(view);
        H();
    }

    public void A0(EcoDeviceDetail ecoDeviceDetail) {
        this.F = ecoDeviceDetail;
        synchronized (this) {
            this.H |= 1;
        }
        notifyPropertyChanged(dw1.c);
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

    /* JADX WARN: Code duplicated, block: B:78:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        String des;
        boolean z;
        int i;
        int i2;
        boolean z2;
        String str;
        String str2;
        int i3;
        String name;
        String str3;
        long j2;
        int i4;
        String statusText;
        boolean isOwner;
        String icon;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        EcoDeviceDetail ecoDeviceDetail = this.F;
        long j3 = j & 3;
        if (j3 != 0) {
            z2 = ecoDeviceDetail instanceof EarPhoneDeviceDetail;
            z = ecoDeviceDetail instanceof BloodSugarDeviceDetail;
            if (j3 != 0) {
                j = z2 ? j | 8 : j | 4;
            }
            if ((j & 3) != 0) {
                j |= z ? 128L : 64L;
            }
            if (ecoDeviceDetail != null) {
                des = ecoDeviceDetail.getDes();
                statusText = ecoDeviceDetail.getStatusText();
                int deviceType = ecoDeviceDetail.getDeviceType();
                isOwner = ecoDeviceDetail.getIsOwner();
                icon = ecoDeviceDetail.getIcon();
                i4 = deviceType;
            } else {
                des = null;
                i4 = 0;
                statusText = null;
                isOwner = false;
                icon = null;
            }
            if ((j & 3) != 0) {
                j |= isOwner ? 2048L : 1024L;
            }
            boolean z3 = i4 == 3;
            i2 = isOwner ? 8 : 0;
            if ((j & 3) != 0) {
                j |= z3 ? 512L : 256L;
            }
            i = z3 ? 8 : 0;
            str = statusText;
            str2 = icon;
        } else {
            des = null;
            z = false;
            i = 0;
            i2 = 0;
            z2 = false;
            str = null;
            str2 = null;
        }
        String nameSuffix = ((j & 8) == 0 || ecoDeviceDetail == null) ? null : ecoDeviceDetail.getNameSuffix();
        long j4 = j & 3;
        if (j4 != 0) {
            boolean z4 = z ? true : z2;
            if (j4 != 0) {
                j |= z4 ? 32L : 16L;
            }
            i3 = z4 ? 0 : 8;
        } else {
            i3 = 0;
        }
        if ((j & 12) != 0) {
            name = ecoDeviceDetail != null ? ecoDeviceDetail.getName() : null;
            if ((8 & j) != 0) {
                str3 = name + nameSuffix;
            }
            j2 = j & 3;
            if (j2 != 0) {
                name = null;
            } else if (z2) {
                name = str3;
            }
            if (j2 != 0) {
                ImageViewBindingAdapter.setIcon(this.A, str2, null, null);
                r8p.b(this.B, des);
                this.B.setVisibility(i);
                r8p.b(this.C, name);
                this.D.setVisibility(i2);
                r8p.b(this.E, str);
                this.E.setVisibility(i3);
            }
        }
        name = null;
        str3 = null;
        j2 = j & 3;
        if (j2 != 0) {
            name = null;
        } else if (z2) {
            name = str3;
        }
        if (j2 != 0) {
            ImageViewBindingAdapter.setIcon(this.A, str2, null, null);
            r8p.b(this.B, des);
            this.B.setVisibility(i);
            r8p.b(this.C, name);
            this.D.setVisibility(i2);
            r8p.b(this.E, str);
            this.E.setVisibility(i3);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (dw1.c != i) {
            return false;
        }
        A0((EcoDeviceDetail) obj);
        return true;
    }

    public au7(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, I, J));
    }
}
