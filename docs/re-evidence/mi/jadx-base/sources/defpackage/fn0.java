package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fitness.baseui.widget.CustomCircleProgressBar;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes8.dex */
public class fn0 extends en0 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(zqi.J4, 1);
        sparseIntArray.put(zqi.G9, 2);
        sparseIntArray.put(zqi.S0, 3);
        sparseIntArray.put(zqi.U8, 4);
        sparseIntArray.put(zqi.R1, 5);
        sparseIntArray.put(zqi.P1, 6);
        sparseIntArray.put(zqi.K4, 7);
        sparseIntArray.put(zqi.N4, 8);
        sparseIntArray.put(zqi.O4, 9);
    }

    public fn0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (FrameLayout) objArr[3], (TextView) objArr[6], (CustomCircleProgressBar) objArr[5], (LinearLayoutCompat) objArr[1], (LinearLayout) objArr[7], (ProgressBar) objArr[8], (TextView) objArr[9], (LinearLayout) objArr[4], (TabLayout) objArr[2]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 1L;
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
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public fn0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
