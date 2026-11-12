package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BindingAdapters;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.feedback.ui.FeedbackAdapter;
import com.xiaomi.fitness.feedback.ui.FeedbackItemInfo;
import com.xiaomi.fitness.feedback.ui.FeedbackQuestionViewModel;
import kotlin.jvm.functions.Function2;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public class ki9 extends ji9 {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F = null;
    public final NestedScrollView C;
    public long D;

    public ki9(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (RecyclerView) objArr[1]);
        this.D = -1L;
        this.A.setTag(null);
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.C = nestedScrollView;
        nestedScrollView.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(ObservableArrayList<FeedbackItemInfo> observableArrayList, int i) {
        if (i != bv1.f4630a) {
            return false;
        }
        synchronized (this) {
            this.D |= 1;
        }
        return true;
    }

    public void B0(FeedbackQuestionViewModel feedbackQuestionViewModel) {
        this.B = feedbackQuestionViewModel;
        synchronized (this) {
            this.D |= 2;
        }
        notifyPropertyChanged(bv1.e);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.D = 4L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((ObservableArrayList) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        ItemBinding<FeedbackItemInfo> itemBinding;
        ObservableArrayList<FeedbackItemInfo> observableArrayList;
        FeedbackAdapter feedbackAdapter;
        Function2<View, Integer, BaseViewHolder<FeedbackItemInfo>> function2;
        FeedbackAdapter feedbackAdapter2;
        Function2<View, Integer, BaseViewHolder<FeedbackItemInfo>> function3;
        ItemBinding<FeedbackItemInfo> itemBinding2;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        FeedbackQuestionViewModel feedbackQuestionViewModel = this.B;
        long j2 = j & 7;
        ObservableArrayList<FeedbackItemInfo> items = null;
        if (j2 != 0) {
            if (feedbackQuestionViewModel != null) {
                FeedbackAdapter adapter = feedbackQuestionViewModel.getAdapter();
                Function2<View, Integer, BaseViewHolder<FeedbackItemInfo>> viewHolderFactory = feedbackQuestionViewModel.getViewHolderFactory();
                ItemBinding<FeedbackItemInfo> itemBinding3 = feedbackQuestionViewModel.getItemBinding();
                feedbackAdapter2 = adapter;
                items = feedbackQuestionViewModel.getItems();
                itemBinding2 = itemBinding3;
                function3 = viewHolderFactory;
            } else {
                feedbackAdapter2 = null;
                function3 = null;
                itemBinding2 = null;
            }
            y0(0, items);
            observableArrayList = items;
            feedbackAdapter = feedbackAdapter2;
            function2 = function3;
            itemBinding = itemBinding2;
        } else {
            itemBinding = null;
            observableArrayList = null;
            feedbackAdapter = null;
            function2 = null;
        }
        if (j2 != 0) {
            BindingAdapters.setAdapter(this.A, itemBinding, observableArrayList, feedbackAdapter, function2, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bv1.e != i) {
            return false;
        }
        B0((FeedbackQuestionViewModel) obj);
        return true;
    }

    public ki9(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 2, E, F));
    }
}
