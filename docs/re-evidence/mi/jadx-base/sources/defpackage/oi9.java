package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.feedback.bugreport.FeedbackDeviceInfo;
import com.xiaomi.fitness.feedback.bugreport.FeedbackTypesViewModel;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class oi9 extends ni9 {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G = null;
    public long E;

    public oi9(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RightArrowBindingSingleLineTextView) objArr[1], (FrameLayout) objArr[0]);
        this.E = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        o0(view);
        H();
    }

    public void A0(FeedbackDeviceInfo feedbackDeviceInfo) {
        this.C = feedbackDeviceInfo;
        synchronized (this) {
            this.E |= 1;
        }
        notifyPropertyChanged(bv1.c);
        super.e0();
    }

    public void B0(FeedbackTypesViewModel feedbackTypesViewModel) {
        this.D = feedbackTypesViewModel;
        synchronized (this) {
            this.E |= 2;
        }
        notifyPropertyChanged(bv1.e);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.E = 4L;
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
        boolean zJ0;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        FeedbackDeviceInfo feedbackDeviceInfo = this.C;
        FeedbackTypesViewModel feedbackTypesViewModel = this.D;
        long j2 = 5 & j;
        String appName = (j2 == 0 || feedbackDeviceInfo == null) ? null : feedbackDeviceInfo.getAppName();
        long j3 = j & 6;
        if (j3 != 0) {
            zJ0 = ViewDataBinding.j0(feedbackTypesViewModel != null ? feedbackTypesViewModel.getShowMore() : null);
        } else {
            zJ0 = false;
        }
        if (j2 != 0) {
            RightArrowBindingSingleLineTextView.setTitle(this.A, appName);
        }
        if (j3 != 0) {
            this.A.showMore(zJ0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bv1.c == i) {
            A0((FeedbackDeviceInfo) obj);
        } else {
            if (bv1.e != i) {
                return false;
            }
            B0((FeedbackTypesViewModel) obj);
        }
        return true;
    }

    public oi9(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 2, F, G));
    }
}
