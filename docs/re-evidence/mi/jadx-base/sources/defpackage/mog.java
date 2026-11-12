package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;

/* JADX INFO: loaded from: classes9.dex */
public class mog extends log {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final RelativeLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(mri.Z, 1);
        sparseIntArray.put(mri.G5, 2);
        sparseIntArray.put(mri.i1, 3);
        sparseIntArray.put(mri.C3, 4);
        sparseIntArray.put(mri.S4, 5);
        sparseIntArray.put(mri.f1, 6);
        sparseIntArray.put(mri.W3, 7);
        sparseIntArray.put(mri.F1, 8);
        sparseIntArray.put(mri.X0, 9);
        sparseIntArray.put(mri.G4, 10);
    }

    public mog(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[1], (TextView) objArr[9], (TextView) objArr[6], (DeviceImageView) objArr[3], (TextView) objArr[8], (ProgressBar) objArr[4], (TextView) objArr[7], (TextView) objArr[10], (TextView) objArr[5], (FrameLayout) objArr[2]);
        this.L = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.K = relativeLayout;
        relativeLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 1L;
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
            this.L = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public mog(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
