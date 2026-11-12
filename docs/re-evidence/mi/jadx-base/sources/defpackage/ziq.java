package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes10.dex */
public class ziq extends yiq {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final SpringBackLayout N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(hsi.S0, 1);
        sparseIntArray.put(hsi.i0, 2);
        sparseIntArray.put(hsi.G, 3);
        sparseIntArray.put(hsi.j, 4);
        sparseIntArray.put(hsi.d1, 5);
        sparseIntArray.put(hsi.j1, 6);
        sparseIntArray.put(hsi.k1, 7);
        sparseIntArray.put(hsi.K, 8);
        sparseIntArray.put(hsi.f20406a, 9);
        sparseIntArray.put(hsi.goal_notify_switch, 10);
        sparseIntArray.put(hsi.z, 11);
        sparseIntArray.put(hsi.B0, 12);
        sparseIntArray.put(hsi.goal_achieve_notify, 13);
    }

    public ziq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RightArrowBindingTwoLineTextView) objArr[9], (RightArrowBindingTwoLineTextView) objArr[4], (View) objArr[11], (TextView) objArr[3], (SwitchButtonTwoLineTextView) objArr[13], (ConstraintLayout) objArr[10], (ImageView) objArr[8], (LinearLayout) objArr[2], (TextView) objArr[12], (NestedScrollView) objArr[1], (RightArrowBindingTwoLineTextView) objArr[5], (LinearLayout) objArr[6], (TextView) objArr[7]);
        this.O = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.N = springBackLayout;
        springBackLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.O = 1L;
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
            this.O = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ziq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 14, P, Q));
    }
}
