package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.CardImageView;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;

/* JADX INFO: loaded from: classes9.dex */
public class mpg extends lpg {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final ConstraintLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(mri.G5, 1);
        sparseIntArray.put(mri.Z, 2);
        sparseIntArray.put(mri.i1, 3);
        sparseIntArray.put(mri.C3, 4);
        sparseIntArray.put(mri.m5, 5);
    }

    public mpg(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CardImageView) objArr[2], (DeviceImageView) objArr[3], (ProgressBar) objArr[4], (TextView) objArr[5], (RelativeLayout) objArr[1]);
        this.G = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.G = 1L;
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
            this.G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public mpg(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, H, I));
    }
}
