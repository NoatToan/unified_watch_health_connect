package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;

/* JADX INFO: loaded from: classes9.dex */
public class amg extends zlg {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final RelativeLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(mri.Z, 1);
        sparseIntArray.put(mri.G5, 2);
        sparseIntArray.put(mri.i1, 3);
        sparseIntArray.put(mri.C3, 4);
        sparseIntArray.put(mri.A4, 5);
        sparseIntArray.put(mri.S4, 6);
        sparseIntArray.put(mri.f1, 7);
        sparseIntArray.put(mri.W3, 8);
    }

    public amg(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[1], (TextView) objArr[7], (DeviceImageView) objArr[3], (ProgressBar) objArr[4], (TextView) objArr[8], (ImageView) objArr[5], (TextView) objArr[6], (FrameLayout) objArr[2]);
        this.J = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.I = relativeLayout;
        relativeLayout.setTag(null);
        o0(view);
        H();
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
            this.J = 1L;
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
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public amg(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
