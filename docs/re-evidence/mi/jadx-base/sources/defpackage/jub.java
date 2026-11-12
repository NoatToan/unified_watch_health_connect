package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.health.sleep.ui.setting.baseui.SleepGuideCarouselIndicator;
import com.xiaomi.fitness.widget.SlidableScrollView;
import com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public class jub extends iub {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(eri.Me, 1);
        sparseIntArray.put(eri.Oh, 2);
        sparseIntArray.put(eri.N9, 3);
        sparseIntArray.put(eri.Y3, 4);
        sparseIntArray.put(eri.v1, 5);
        sparseIntArray.put(eri.Zo, 6);
        sparseIntArray.put(eri.To, 7);
    }

    public jub(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[5], (View) objArr[4], (SwitchButtonSingleLineTextView) objArr[3], (SlidableScrollView) objArr[1], (LinearLayout) objArr[2], (ViewPager2) objArr[6], (SleepGuideCarouselIndicator) objArr[7]);
        this.I = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
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

    public jub(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
