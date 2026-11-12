package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes9.dex */
public class ktg extends jtg {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(mri.G5, 1);
        sparseIntArray.put(mri.F5, 2);
        sparseIntArray.put(mri.a2, 3);
        sparseIntArray.put(mri.o5, 4);
        sparseIntArray.put(mri.p5, 5);
        sparseIntArray.put(mri.n5, 6);
        sparseIntArray.put(mri.h, 7);
        sparseIntArray.put(mri.M, 8);
        sparseIntArray.put(mri.B4, 9);
    }

    public ktg(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Button) objArr[7], (Button) objArr[8], (ProgressBar) objArr[3], (Button) objArr[9], (TextView) objArr[6], (ImageView) objArr[4], (TextView) objArr[5], (DeviceImageView) objArr[2], (FrameLayout) objArr[1]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
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

    public ktg(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
