package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes8.dex */
public class zi6 extends yi6 {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final SpringBackLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(zqi.M7, 1);
        sparseIntArray.put(zqi.Ia, 2);
        sparseIntArray.put(zqi.Ga, 3);
        sparseIntArray.put(zqi.P8, 4);
        sparseIntArray.put(zqi.b8, 5);
        sparseIntArray.put(zqi.Z7, 6);
        sparseIntArray.put(zqi.Fa, 7);
        sparseIntArray.put(zqi.Y7, 8);
        sparseIntArray.put(zqi.Q, 9);
        sparseIntArray.put(zqi.Ha, 10);
        sparseIntArray.put(zqi.W6, 11);
    }

    public zi6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[9], (TextView) objArr[11], (NestedScrollView) objArr[1], (RightArrowTwoLineTextView) objArr[8], (RightArrowTwoLineTextView) objArr[6], (RightArrowTwoLineTextView) objArr[5], (LinearLayout) objArr[4], (RelativeLayout) objArr[7], (SwitchButtonTwoLineTextView) objArr[3], (TextView) objArr[10], (TextView) objArr[2]);
        this.M = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.L = springBackLayout;
        springBackLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.M = 1L;
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
            this.M = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public zi6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
