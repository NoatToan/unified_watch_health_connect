package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.feedback.ui.FeedbackItemInfo;

/* JADX INFO: loaded from: classes8.dex */
public class cj9 extends bj9 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public long C;

    public cj9(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[0]);
        this.C = -1L;
        this.A.setTag(null);
        o0(view);
        H();
    }

    public void A0(FeedbackItemInfo feedbackItemInfo) {
        this.B = feedbackItemInfo;
        synchronized (this) {
            this.C |= 1;
        }
        notifyPropertyChanged(bv1.c);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.C = 2L;
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
            j = this.C;
            this.C = 0L;
        }
        FeedbackItemInfo feedbackItemInfo = this.B;
        long j2 = j & 3;
        String title = (j2 == 0 || feedbackItemInfo == null) ? null : feedbackItemInfo.getTitle();
        if (j2 != 0) {
            r8p.b(this.A, title);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bv1.c != i) {
            return false;
        }
        A0((FeedbackItemInfo) obj);
        return true;
    }

    public cj9(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
