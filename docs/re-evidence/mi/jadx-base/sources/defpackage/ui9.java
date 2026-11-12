package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.feedback.ui.FeedbackItemInfo;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ui9 extends ti9 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public long C;

    public ui9(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RightArrowBindingSingleLineTextView) objArr[0]);
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
        String str;
        boolean z;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        FeedbackItemInfo feedbackItemInfo = this.B;
        long j2 = j & 3;
        List<FeedbackItemInfo> subItemList = null;
        boolean z2 = false;
        if (j2 != 0) {
            if (feedbackItemInfo != null) {
                String title = feedbackItemInfo.getTitle();
                subItemList = feedbackItemInfo.getSubItemList();
                str = title;
            } else {
                str = null;
            }
            z = subItemList != null;
            if (j2 != 0) {
                j = z ? j | 8 : j | 4;
            }
        } else {
            str = null;
            z = false;
        }
        boolean z3 = ((j & 8) == 0 || subItemList == null || subItemList.size() <= 0) ? false : true;
        long j3 = j & 3;
        if (j3 != 0 && z) {
            z2 = z3;
        }
        if (j3 != 0) {
            RightArrowBindingSingleLineTextView.setTitle(this.A, str);
            this.A.showMore(z2);
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

    public ui9(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
