package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import miuix.androidbasewidget.widget.EditText;

/* JADX INFO: loaded from: classes8.dex */
public class xm6 extends wm6 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final LinearLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(zqi.n0, 1);
        sparseIntArray.put(zqi.G2, 2);
        sparseIntArray.put(zqi.D2, 3);
        sparseIntArray.put(zqi.E2, 4);
        sparseIntArray.put(zqi.b9, 5);
        sparseIntArray.put(zqi.J2, 6);
        sparseIntArray.put(zqi.I2, 7);
    }

    public xm6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CardView) objArr[1], (EditText) objArr[3], (TextView) objArr[4], (LinearLayout) objArr[2], (RightArrowTwoLineTextView) objArr[7], (RightArrowTwoLineTextView) objArr[6], (SwitchButtonTwoLineTextView) objArr[5]);
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

    public xm6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
