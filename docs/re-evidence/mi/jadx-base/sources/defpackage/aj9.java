package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.feedback.history.HistoryDetail;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class aj9 extends zi9 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public final RightArrowTwoLineTextView B;
    public long C;

    public aj9(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0);
        this.C = -1L;
        RightArrowTwoLineTextView rightArrowTwoLineTextView = (RightArrowTwoLineTextView) objArr[0];
        this.B = rightArrowTwoLineTextView;
        rightArrowTwoLineTextView.setTag(null);
        o0(view);
        H();
    }

    public void A0(HistoryDetail historyDetail) {
        this.A = historyDetail;
        synchronized (this) {
            this.C |= 1;
        }
        notifyPropertyChanged(bv1.d);
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
        String content;
        String time;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        HistoryDetail historyDetail = this.A;
        long j2 = j & 3;
        if (j2 == 0 || historyDetail == null) {
            content = null;
            time = null;
        } else {
            content = historyDetail.getContent();
            time = historyDetail.getTime();
        }
        if (j2 != 0) {
            this.B.setTitle(content);
            this.B.setSubtitle(time);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bv1.d != i) {
            return false;
        }
        A0((HistoryDetail) obj);
        return true;
    }

    public aj9(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
