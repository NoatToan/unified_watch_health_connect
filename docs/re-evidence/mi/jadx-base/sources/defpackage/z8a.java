package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingDurationVM;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;

/* JADX INFO: loaded from: classes10.dex */
public class z8a extends y8a {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I = null;
    public final ConstraintLayout F;
    public long G;

    public z8a(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RightArrowBindingSingleLineTextView) objArr[1], (RightArrowBindingSingleLineTextView) objArr[3], (RightArrowBindingSingleLineTextView) objArr[2]);
        this.G = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        o0(view);
        H();
    }

    public void A0(IntervalTrainingDurationVM intervalTrainingDurationVM) {
        this.E = intervalTrainingDurationVM;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.G = 4L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        View.OnClickListener onClickListener = this.D;
        if ((j & 5) != 0) {
            this.A.setOnClickListener(onClickListener);
            this.B.setOnClickListener(onClickListener);
            this.C.setOnClickListener(onClickListener);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (pv1.f == i) {
            setOnClick((View.OnClickListener) obj);
        } else {
            if (pv1.i != i) {
                return false;
            }
            A0((IntervalTrainingDurationVM) obj);
        }
        return true;
    }

    @Override // defpackage.y8a
    public void setOnClick(View.OnClickListener onClickListener) {
        this.D = onClickListener;
        synchronized (this) {
            this.G |= 1;
        }
        notifyPropertyChanged(pv1.f);
        super.e0();
    }

    public z8a(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, H, I));
    }
}
