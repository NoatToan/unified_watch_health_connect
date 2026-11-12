package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;

/* JADX INFO: loaded from: classes9.dex */
public class wog extends vog {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(mri.N1, 1);
        sparseIntArray.put(mri.i1, 2);
        sparseIntArray.put(mri.A4, 3);
        sparseIntArray.put(mri.W0, 4);
        sparseIntArray.put(mri.U0, 5);
        sparseIntArray.put(mri.J1, 6);
        sparseIntArray.put(mri.K1, 7);
        sparseIntArray.put(mri.L, 8);
    }

    public wog(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (View) objArr[8], (TextView) objArr[5], (TextView) objArr[4], (DeviceImageView) objArr[2], (LinearLayout) objArr[6], (TextView) objArr[7], (RelativeLayout) objArr[1], (RelativeLayout) objArr[0], (ImageView) objArr[3]);
        this.J = -1L;
        this.H.setTag(null);
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

    public wog(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
