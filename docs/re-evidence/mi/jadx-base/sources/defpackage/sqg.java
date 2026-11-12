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
public class sqg extends rqg {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final RelativeLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(mri.i0, 1);
        sparseIntArray.put(mri.O, 2);
        sparseIntArray.put(mri.G5, 3);
        sparseIntArray.put(mri.i1, 4);
        sparseIntArray.put(mri.B2, 5);
        sparseIntArray.put(mri.Y1, 6);
        sparseIntArray.put(mri.A4, 7);
        sparseIntArray.put(mri.d2, 8);
        sparseIntArray.put(mri.N4, 9);
    }

    public sqg(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[2], (RelativeLayout) objArr[1], (DeviceImageView) objArr[4], (RelativeLayout) objArr[6], (TextView) objArr[8], (ProgressBar) objArr[5], (TextView) objArr[7], (TextView) objArr[9], (FrameLayout) objArr[3]);
        this.K = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.J = relativeLayout;
        relativeLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 1L;
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
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public sqg(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
