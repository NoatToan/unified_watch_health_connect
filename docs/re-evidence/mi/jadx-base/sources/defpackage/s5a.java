package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.xiaomi.fitness.devicesettings.widget.EmergencyCallView;
import com.xiaomi.fitness.devicesettings.widget.SosSetView;
import com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class s5a extends r5a {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ScrollView K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(zqi.p1, 1);
        sparseIntArray.put(zqi.K2, 2);
        sparseIntArray.put(zqi.z4, 3);
        sparseIntArray.put(zqi.c9, 4);
        sparseIntArray.put(zqi.L2, 5);
        sparseIntArray.put(zqi.v6, 6);
        sparseIntArray.put(zqi.l7, 7);
        sparseIntArray.put(zqi.D8, 8);
        sparseIntArray.put(zqi.j6, 9);
        sparseIntArray.put(zqi.j5, 10);
    }

    public s5a(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LottieAnimationView) objArr[1], (TextView) objArr[2], (ConstraintLayout) objArr[5], (View) objArr[3], (SosSetView) objArr[10], (SosSetView) objArr[9], (EmergencyCallView) objArr[6], (EmergencyCallView) objArr[7], (ConstraintLayout) objArr[8], (SwitchButtonSingleLineTextView) objArr[4]);
        this.L = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.K = scrollView;
        scrollView.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 1L;
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
            this.L = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public s5a(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
