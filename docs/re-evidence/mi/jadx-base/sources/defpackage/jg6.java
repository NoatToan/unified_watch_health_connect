package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.common.ecg.ECGMeasureRemindSelectCountView;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes8.dex */
public class jg6 extends ig6 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final SpringBackLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(zqi.G8, 1);
        sparseIntArray.put(zqi.o7, 2);
        sparseIntArray.put(zqi.n7, 3);
        sparseIntArray.put(zqi.q7, 4);
        sparseIntArray.put(zqi.p7, 5);
        sparseIntArray.put(zqi.r7, 6);
    }

    public jg6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayoutCompat) objArr[3], (SwitchButtonTwoLineTextView) objArr[2], (ECGMeasureRemindSelectCountView) objArr[5], (RightArrowSingleLineTextView) objArr[4], (LinearLayoutCompat) objArr[6], (NestedScrollView) objArr[1]);
        this.H = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.G = springBackLayout;
        springBackLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.H = 1L;
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
            this.H = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public jg6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
