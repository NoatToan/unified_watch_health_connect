package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BindingAdapters;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.feedback.history.HistoryAdapter;
import com.xiaomi.fitness.feedback.history.HistoryDetail;
import com.xiaomi.fitness.feedback.history.HistoryViewModel;

/* JADX INFO: loaded from: classes8.dex */
public class gi9 extends fi9 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public final RecyclerView B;
    public long C;

    public gi9(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1);
        this.C = -1L;
        RecyclerView recyclerView = (RecyclerView) objArr[0];
        this.B = recyclerView;
        recyclerView.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(ObservableArrayList<HistoryDetail> observableArrayList, int i) {
        if (i != bv1.f4630a) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }

    public void B0(HistoryViewModel historyViewModel) {
        this.A = historyViewModel;
        synchronized (this) {
            this.C |= 2;
        }
        notifyPropertyChanged(bv1.e);
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
            this.C = 4L;
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
        ItemBinding<HistoryDetail> itemBinding;
        ObservableArrayList<HistoryDetail> observableArrayList;
        HistoryAdapter historyAdapter;
        HistoryAdapter historyAdapter2;
        ItemBinding<HistoryDetail> itemBinding2;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        HistoryViewModel historyViewModel = this.A;
        long j2 = j & 7;
        ObservableArrayList<HistoryDetail> items = null;
        if (j2 != 0) {
            if (historyViewModel != null) {
                HistoryAdapter adapter = historyViewModel.getAdapter();
                ItemBinding<HistoryDetail> itemBinding3 = historyViewModel.getItemBinding();
                historyAdapter2 = adapter;
                items = historyViewModel.getItems();
                itemBinding2 = itemBinding3;
            } else {
                historyAdapter2 = null;
                itemBinding2 = null;
            }
            y0(0, items);
            observableArrayList = items;
            historyAdapter = historyAdapter2;
            itemBinding = itemBinding2;
        } else {
            itemBinding = null;
            observableArrayList = null;
            historyAdapter = null;
        }
        if (j2 != 0) {
            BindingAdapters.setAdapter(this.B, itemBinding, observableArrayList, historyAdapter, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bv1.e != i) {
            return false;
        }
        B0((HistoryViewModel) obj);
        return true;
    }

    public gi9(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
