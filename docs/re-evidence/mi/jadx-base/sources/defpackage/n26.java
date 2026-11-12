package defpackage;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.ui.DeviceDetail;

/* JADX INFO: loaded from: classes8.dex */
public class n26 extends m26 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(xqi.f39369r, 5);
        sparseIntArray.put(xqi.v, 6);
        sparseIntArray.put(xqi.z, 7);
    }

    public n26(rk5 rk5Var, View[] viewArr, Object[] objArr) {
        super(rk5Var, viewArr[0], 0, (AppCompatImageView) objArr[5], (ConstraintLayout) objArr[6], (ImageView) objArr[7], (LinearLayout) objArr[0], (TextView) objArr[2], (TextView) objArr[3], (TextView) objArr[1], (TextView) objArr[4]);
        this.J = -1L;
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        p0(viewArr);
        H();
    }

    @Override // defpackage.m26
    public void C0(DeviceDetail deviceDetail) {
        this.I = deviceDetail;
        synchronized (this) {
            this.J |= 1;
        }
        notifyPropertyChanged(zv1.d);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 2L;
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
        String str;
        String str2;
        boolean z;
        String mac;
        boolean isCurrent;
        String string;
        int i;
        Resources resources;
        int i2;
        String des;
        String name;
        boolean isConnecting;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        DeviceDetail deviceDetail = this.I;
        long j2 = j & 3;
        if (j2 != 0) {
            if (deviceDetail != null) {
                mac = deviceDetail.getMac();
                des = deviceDetail.getDes();
                name = deviceDetail.getName();
                isConnecting = deviceDetail.getIsConnecting();
                isCurrent = deviceDetail.getIsCurrent();
            } else {
                mac = null;
                des = null;
                name = null;
                isConnecting = false;
                isCurrent = false;
            }
            if (j2 != 0) {
                j = isConnecting ? j | 512 : j | 256;
            }
            if ((j & 3) != 0) {
                j = isCurrent ? j | 8 : j | 4;
            }
            str = des;
            str2 = name;
            z = isConnecting;
        } else {
            str = null;
            str2 = null;
            z = false;
            mac = null;
            isCurrent = false;
        }
        long j3 = j & 2;
        if (j3 != 0 && j3 != 0) {
            j |= 64;
        }
        boolean zIsEditMode = ((256 & j) == 0 || deviceDetail == null) ? false : deviceDetail.isEditMode();
        boolean isAccessory = ((4 & j) == 0 || deviceDetail == null) ? false : deviceDetail.getIsAccessory();
        long j4 = j & 3;
        if (j4 != 0) {
            if (isCurrent) {
                isAccessory = true;
            }
            if (z) {
                zIsEditMode = true;
            }
            if (j4 != 0) {
                j |= isAccessory ? 32L : 16L;
            }
            if ((j & 3) != 0) {
                j |= zIsEditMode ? 2048L : 1024L;
            }
            if (isAccessory) {
                resources = this.H.getResources();
                i2 = uzi.O1;
            } else {
                resources = this.H.getResources();
                i2 = uzi.I1;
            }
            string = resources.getString(i2);
            i = zIsEditMode ? 8 : 0;
        } else {
            string = null;
            i = 0;
        }
        if ((3 & j) != 0) {
            this.E.setEnabled(z);
            r8p.b(this.E, str);
            r8p.b(this.F, mac);
            r8p.b(this.G, str2);
            r8p.b(this.H, string);
            this.H.setVisibility(i);
        }
        if ((j & 2) != 0) {
            this.F.setVisibility(8);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.d != i) {
            return false;
        }
        C0((DeviceDetail) obj);
        return true;
    }

    public n26(rk5 rk5Var, View[] viewArr) {
        this(rk5Var, viewArr, ViewDataBinding.V(rk5Var, viewArr, 8, K, L));
    }
}
