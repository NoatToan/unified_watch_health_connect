package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class hi6 extends gi6 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final LinearLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(zqi.L8, 1);
        sparseIntArray.put(zqi.K8, 2);
        sparseIntArray.put(zqi.R2, 3);
        sparseIntArray.put(zqi.l8, 4);
        sparseIntArray.put(zqi.V, 5);
        sparseIntArray.put(zqi.U, 6);
        sparseIntArray.put(zqi.V8, 7);
    }

    public hi6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RightArrowTwoLineTextView) objArr[6], (RightArrowTwoLineTextView) objArr[5], (RightArrowTwoLineTextView) objArr[3], (SwitchButtonTwoLineTextView) objArr[4], (RightArrowTwoLineTextView) objArr[2], (SwitchButtonTwoLineTextView) objArr[1], (SwitchButtonTwoLineTextView) objArr[7]);
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

    public hi6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
