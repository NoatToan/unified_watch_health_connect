package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.DeviceImageView;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes8.dex */
public class dj6 extends cj6 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final SpringBackLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(zqi.M7, 1);
        sparseIntArray.put(zqi.N, 2);
        sparseIntArray.put(zqi.Q2, 3);
        sparseIntArray.put(zqi.P0, 4);
        sparseIntArray.put(zqi.La, 5);
        sparseIntArray.put(zqi.Ea, 6);
        sparseIntArray.put(zqi.a8, 7);
    }

    public dj6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (DeviceImageView) objArr[2], (RightArrowTwoLineTextView) objArr[4], (LinearLayout) objArr[3], (NestedScrollView) objArr[1], (RightArrowTwoLineTextView) objArr[7], (LinearLayout) objArr[6], (RightArrowTwoLineTextView) objArr[5]);
        this.I = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.H = springBackLayout;
        springBackLayout.setTag(null);
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

    public dj6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
