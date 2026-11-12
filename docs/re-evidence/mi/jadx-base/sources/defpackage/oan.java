package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.dialog.CustomCircleProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public class oan extends nan {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final LinearLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(xri.v4, 1);
        sparseIntArray.put(xri.i8, 2);
        sparseIntArray.put(xri.g8, 3);
        sparseIntArray.put(xri.G8, 4);
        sparseIntArray.put(xri.F8, 5);
        sparseIntArray.put(xri.H8, 6);
        sparseIntArray.put(xri.h8, 7);
    }

    public oan(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[1], (LinearLayout) objArr[3], (TextView) objArr[7], (ProgressBar) objArr[2], (CustomCircleProgressBar) objArr[5], (ProgressBar) objArr[4], (TextView) objArr[6]);
        this.I = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.H = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.I = 1L;
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
            this.I = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public oan(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
