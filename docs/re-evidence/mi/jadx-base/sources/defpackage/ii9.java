package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BindingAdapters;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.feedback.history.DialogueInfo;
import com.xiaomi.fitness.feedback.history.HistoryDetail;
import com.xiaomi.fitness.feedback.history.HistoryDetailViewModel;
import com.xiaomi.fitness.feedback.history.ReplyAdapter;

/* JADX INFO: loaded from: classes8.dex */
public class ii9 extends hi9 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final LinearLayout G;
    public final RecyclerView H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(cri.m, 4);
        sparseIntArray.put(cri.n, 5);
    }

    public ii9(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (TextView) objArr[2], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[1]);
        this.I = -1L;
        this.A.setTag(null);
        this.D.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.G = linearLayout;
        linearLayout.setTag(null);
        RecyclerView recyclerView = (RecyclerView) objArr[3];
        this.H = recyclerView;
        recyclerView.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(ObservableArrayList<DialogueInfo> observableArrayList, int i) {
        if (i != bv1.f4630a) {
            return false;
        }
        synchronized (this) {
            this.I |= 1;
        }
        return true;
    }

    public void B0(HistoryDetail historyDetail) {
        this.F = historyDetail;
        synchronized (this) {
            this.I |= 2;
        }
        notifyPropertyChanged(bv1.f4631b);
        super.e0();
    }

    public void C0(HistoryDetailViewModel historyDetailViewModel) {
        this.E = historyDetailViewModel;
        synchronized (this) {
            this.I |= 4;
        }
        notifyPropertyChanged(bv1.e);
        super.e0();
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
            this.I = 8L;
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
        String content;
        String feedbackNum;
        ItemBinding<DialogueInfo> itemBinding;
        ObservableArrayList<DialogueInfo> observableArrayList;
        ReplyAdapter replyAdapter;
        ItemBinding<DialogueInfo> itemBinding2;
        ReplyAdapter replyAdapter2;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        HistoryDetail historyDetail = this.F;
        HistoryDetailViewModel historyDetailViewModel = this.E;
        long j2 = 10 & j;
        ObservableArrayList<DialogueInfo> items = null;
        if (j2 == 0 || historyDetail == null) {
            content = null;
            feedbackNum = null;
        } else {
            feedbackNum = historyDetail.getFeedbackNum();
            content = historyDetail.getContent();
        }
        long j3 = j & 13;
        if (j3 != 0) {
            if (historyDetailViewModel != null) {
                ReplyAdapter adapter = historyDetailViewModel.getAdapter();
                itemBinding2 = historyDetailViewModel.getItemBinding();
                items = historyDetailViewModel.getItems();
                replyAdapter2 = adapter;
            } else {
                itemBinding2 = null;
                replyAdapter2 = null;
            }
            y0(0, items);
            itemBinding = itemBinding2;
            replyAdapter = replyAdapter2;
            observableArrayList = items;
        } else {
            itemBinding = null;
            observableArrayList = null;
            replyAdapter = null;
        }
        if (j2 != 0) {
            r8p.b(this.A, feedbackNum);
            r8p.b(this.D, content);
        }
        if (j3 != 0) {
            BindingAdapters.setAdapter(this.H, itemBinding, observableArrayList, replyAdapter, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bv1.f4631b == i) {
            B0((HistoryDetail) obj);
        } else {
            if (bv1.e != i) {
                return false;
            }
            C0((HistoryDetailViewModel) obj);
        }
        return true;
    }

    public ii9(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, J, K));
    }
}
