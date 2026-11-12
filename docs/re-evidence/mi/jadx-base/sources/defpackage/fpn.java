package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.view.justdance.JDViewBindingAdapter;
import com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlModel;
import com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlViewModel;
import com.xiaomi.fitness.widget.button.SwitchButton;

/* JADX INFO: loaded from: classes10.dex */
public class fpn extends epn {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(xri.o1, 5);
        sparseIntArray.put(xri.Z5, 6);
        sparseIntArray.put(xri.x8, 7);
        sparseIntArray.put(xri.l1, 8);
    }

    public fpn(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 3, (TextView) objArr[8], (ImageView) objArr[5], (TextView) objArr[6], (CheckBox) objArr[3], (SwitchButton) objArr[2], (SwitchButton) objArr[1], (CheckBox) objArr[4], (TextView) objArr[7]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        o0(view);
        H();
    }

    private boolean C0(ObservableBoolean observableBoolean, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.K |= 1;
        }
        return true;
    }

    public final boolean D0(ObservableBoolean observableBoolean, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.K |= 4;
        }
        return true;
    }

    public final boolean E0(ObservableBoolean observableBoolean, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.K |= 2;
        }
        return true;
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

    public void F0(JustDanceControlViewModel justDanceControlViewModel) {
        this.I = justDanceControlViewModel;
        synchronized (this) {
            this.K |= 8;
        }
        notifyPropertyChanged(nv1.l);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 16L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return C0((ObservableBoolean) obj, i2);
        }
        if (i == 1) {
            return E0((ObservableBoolean) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return D0((ObservableBoolean) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        synchronized (this) {
            j = this.K;
            this.K = 0L;
        }
        JustDanceControlViewModel justDanceControlViewModel = this.I;
        if ((31 & j) != 0) {
            JustDanceControlModel mModel = justDanceControlViewModel != null ? justDanceControlViewModel.getMModel() : null;
            long j2 = j & 25;
            if (j2 != 0) {
                ObservableBoolean enableSlide = mModel != null ? mModel.getEnableSlide() : null;
                x0(0, enableSlide);
                z5 = enableSlide != null ? enableSlide.get() : false;
                if (j2 != 0) {
                    j |= z5 ? 1088L : 544L;
                }
                z4 = !z5;
            } else {
                z4 = false;
                z5 = false;
            }
            long j3 = j & 26;
            if (j3 != 0) {
                ObservableBoolean slideMirror = mModel != null ? mModel.getSlideMirror() : null;
                x0(1, slideMirror);
                z2 = slideMirror != null ? slideMirror.get() : false;
                if (j3 != 0) {
                    j |= z2 ? 4096L : 2048L;
                }
            } else {
                z2 = false;
            }
            long j4 = j & 28;
            if (j4 != 0) {
                ObservableBoolean enableVibrate = mModel != null ? mModel.getEnableVibrate() : null;
                x0(2, enableVibrate);
                z = enableVibrate != null ? enableVibrate.get() : false;
                if (j4 != 0) {
                    j |= z ? 256L : 128L;
                }
                z3 = z5;
            } else {
                z3 = z5;
                z = false;
            }
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        if ((j & 25) != 0) {
            ta4.a(this.D, z3);
            ta4.a(this.G, z4);
        }
        if ((j & 26) != 0) {
            JDViewBindingAdapter.setSwitchButtonChecked(this.E, z2);
        }
        if ((j & 28) != 0) {
            JDViewBindingAdapter.setSwitchButtonChecked(this.F, z);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (nv1.l != i) {
            return false;
        }
        F0((JustDanceControlViewModel) obj);
        return true;
    }

    public fpn(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, L, M));
    }
}
