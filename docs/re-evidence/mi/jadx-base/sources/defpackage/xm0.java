package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingVM;
import com.xiaomi.fitness.sport_eco.view.interval.ScrollViewPager;
import com.xiaomi.fitness.sport_eco.view.widget.ExpandableTextView;
import com.xiaomi.fitness.widget.view.RatioImageView;
import miuix.miuixbasewidget.widget.FilterSortView;

/* JADX INFO: loaded from: classes10.dex */
public class xm0 extends wm0 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(zri.r1, 1);
        sparseIntArray.put(zri.K, 2);
        sparseIntArray.put(zri.y, 3);
        sparseIntArray.put(zri.U, 4);
        sparseIntArray.put(zri.B3, 5);
        sparseIntArray.put(zri.start_view, 6);
    }

    public xm0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[3], (ExpandableTextView) objArr[2], (FilterSortView) objArr[4], (RatioImageView) objArr[1], (TextView) objArr[6], (ScrollViewPager) objArr[5]);
        this.I = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(IntervalTrainingVM intervalTrainingVM) {
        this.G = intervalTrainingVM;
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
            this.I = 2L;
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
        if (pv1.i != i) {
            return false;
        }
        A0((IntervalTrainingVM) obj);
        return true;
    }

    public xm0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, J, K));
    }
}
