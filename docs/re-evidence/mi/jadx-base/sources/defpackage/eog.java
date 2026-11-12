package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.InfoInputEditTextView;

/* JADX INFO: loaded from: classes9.dex */
public class eog extends dog {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(mri.S2, 1);
        sparseIntArray.put(mri.j, 2);
        sparseIntArray.put(mri.x3, 3);
        sparseIntArray.put(mri.D5, 4);
        sparseIntArray.put(mri.Q0, 5);
    }

    public eog(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (InfoInputEditTextView) objArr[2], (TextView) objArr[5], (LinearLayout) objArr[0], (InfoInputEditTextView) objArr[1], (InfoInputEditTextView) objArr[3], (View) objArr[4]);
        this.G = -1L;
        this.C.setTag(null);
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

    public eog(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, H, I));
    }
}
