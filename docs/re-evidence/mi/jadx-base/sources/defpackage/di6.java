package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes8.dex */
public class di6 extends ci6 {
    public static final ViewDataBinding.i N;
    public static final SparseIntArray O;
    public final SpringBackLayout K;
    public final LinearLayout L;
    public long M;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(12);
        N = iVar;
        iVar.a(1, new String[]{"layout_endurance_pangu"}, new int[]{2}, new int[]{eui.O2});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(zqi.G8, 3);
        sparseIntArray.put(zqi.v3, 4);
        sparseIntArray.put(zqi.y3, 5);
        sparseIntArray.put(zqi.f, 6);
        sparseIntArray.put(zqi.heart_healthy_detection_layout, 7);
        sparseIntArray.put(zqi.t3, 8);
        sparseIntArray.put(zqi.o8, 9);
        sparseIntArray.put(zqi.p8, 10);
        sparseIntArray.put(zqi.F6, 11);
    }

    public di6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (SwitchButtonTwoLineTextView) objArr[6], (x8e) objArr[2], (LinearLayout) objArr[7], (SwitchButtonTwoLineTextView) objArr[8], (RightArrowTwoLineTextView) objArr[4], (RightArrowTwoLineTextView) objArr[5], (SwitchButtonTwoLineTextView) objArr[11], (SwitchButtonTwoLineTextView) objArr[9], (SwitchButtonTwoLineTextView) objArr[10], (NestedScrollView) objArr[3]);
        this.M = -1L;
        k0(this.B);
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.K = springBackLayout;
        springBackLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.L = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(x8e x8eVar, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.M |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.M != 0) {
                    return true;
                }
                return this.B.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.M = 2L;
        }
        this.B.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((x8e) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.M = 0L;
        }
        ViewDataBinding.r(this.B);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public di6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
