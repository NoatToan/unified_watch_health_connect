package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BindingAdapters;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.provider.MergeObservableList;
import com.xiaomi.fitness.feedback.bugreport.FeedBackSubCategoryAdapter;
import com.xiaomi.fitness.feedback.bugreport.FeedBackSubCategoryHolder;
import com.xiaomi.fitness.feedback.bugreport.FeedbackDeviceInfo;
import com.xiaomi.fitness.feedback.bugreport.FeedbackTypesViewModel;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public class ck9 extends bk9 {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F = null;
    public final LinearLayout C;
    public long D;

    public ck9(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (RecyclerView) objArr[1]);
        this.D = -1L;
        this.A.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.C = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(MergeObservableList<FeedbackDeviceInfo> mergeObservableList, int i) {
        if (i != bv1.f4630a) {
            return false;
        }
        synchronized (this) {
            this.D |= 1;
        }
        return true;
    }

    public void B0(FeedbackTypesViewModel feedbackTypesViewModel) {
        this.B = feedbackTypesViewModel;
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
        return A0((MergeObservableList) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        ItemBinding<FeedbackDeviceInfo> itemBinding;
        MergeObservableList<FeedbackDeviceInfo> mergeObservableList;
        FeedBackSubCategoryAdapter feedBackSubCategoryAdapter;
        Function2<View, Integer, FeedBackSubCategoryHolder> function2;
        FeedBackSubCategoryAdapter feedBackSubCategoryAdapter2;
        Function2<View, Integer, FeedBackSubCategoryHolder> function3;
        ItemBinding<FeedbackDeviceInfo> itemBinding2;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        FeedbackTypesViewModel feedbackTypesViewModel = this.B;
        long j2 = j & 7;
        MergeObservableList<FeedbackDeviceInfo> tagItems = null;
        if (j2 != 0) {
            if (feedbackTypesViewModel != null) {
                FeedBackSubCategoryAdapter adapter = feedbackTypesViewModel.getAdapter();
                Function2<View, Integer, FeedBackSubCategoryHolder> viewHolderFactory = feedbackTypesViewModel.getViewHolderFactory();
                ItemBinding<FeedbackDeviceInfo> feedbackItemBinding = feedbackTypesViewModel.getFeedbackItemBinding();
                feedBackSubCategoryAdapter2 = adapter;
                tagItems = feedbackTypesViewModel.getTagItems();
                itemBinding2 = feedbackItemBinding;
                function3 = viewHolderFactory;
            } else {
                feedBackSubCategoryAdapter2 = null;
                function3 = null;
                itemBinding2 = null;
            }
            y0(0, tagItems);
            mergeObservableList = tagItems;
            feedBackSubCategoryAdapter = feedBackSubCategoryAdapter2;
            function2 = function3;
            itemBinding = itemBinding2;
        } else {
            itemBinding = null;
            mergeObservableList = null;
            feedBackSubCategoryAdapter = null;
            function2 = null;
        }
        if (j2 != 0) {
            BindingAdapters.setAdapter(this.A, itemBinding, mergeObservableList, feedBackSubCategoryAdapter, function2, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bv1.e != i) {
            return false;
        }
        B0((FeedbackTypesViewModel) obj);
        return true;
    }

    public ck9(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 2, E, F));
    }
}
