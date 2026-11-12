package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.BubbleAnimationView;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateCustomTouchView;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;

/* JADX INFO: loaded from: classes8.dex */
public class ff6 extends ef6 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final ConstraintLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(zqi.ba, 1);
        sparseIntArray.put(zqi.a0, 2);
        sparseIntArray.put(zqi.K6, 3);
        sparseIntArray.put(zqi.Q, 4);
        sparseIntArray.put(zqi.Pa, 5);
        sparseIntArray.put(zqi.Q8, 6);
    }

    public ff6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[4], (BubbleAnimationView) objArr[2], (VibrateModeProgressBar) objArr[3], (Button) objArr[6], (VibrateCustomTouchView) objArr[1], (Button) objArr[5]);
        this.H = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
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

    public ff6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
