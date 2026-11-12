package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BindingAdapters;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindRopeSkippingListAdapter;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindRopeSkippingListViewModel;
import com.xiaomi.fitness.eco.device.manager.ui.bind.RopeSkippingDevice;
import kotlin.jvm.functions.Function2;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public class tq7 extends sq7 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final ConstraintLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(ari.o, 3);
        sparseIntArray.put(ari.f3381a, 4);
    }

    public tq7(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (TextView) objArr[4], (RecyclerView) objArr[1], (ConstraintLayout) objArr[2], (ImageView) objArr[3]);
        this.G = -1L;
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        this.C.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(ObservableArrayList<RopeSkippingDevice> observableArrayList, int i) {
        if (i != dw1.f15982a) {
            return false;
        }
        synchronized (this) {
            this.G |= 1;
        }
        return true;
    }

    public void B0(BindRopeSkippingListViewModel bindRopeSkippingListViewModel) {
        this.E = bindRopeSkippingListViewModel;
        synchronized (this) {
            this.G |= 2;
        }
        notifyPropertyChanged(dw1.d);
        super.e0();
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
        if (i != 0) {
            return false;
        }
        return A0((ObservableArrayList) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        ItemBinding<RopeSkippingDevice> itemBinding;
        ObservableArrayList<RopeSkippingDevice> observableArrayList;
        BindRopeSkippingListAdapter bindRopeSkippingListAdapter;
        Function2<View, Integer, BaseViewHolder<RopeSkippingDevice>> function2;
        BindRopeSkippingListAdapter bindRopeSkippingListAdapter2;
        Function2<View, Integer, BaseViewHolder<RopeSkippingDevice>> viewHolderFactory;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        BindRopeSkippingListViewModel bindRopeSkippingListViewModel = this.E;
        long j2 = j & 7;
        int i = 0;
        ObservableArrayList<RopeSkippingDevice> items = null;
        if (j2 != 0) {
            if (bindRopeSkippingListViewModel != null) {
                BindRopeSkippingListAdapter adapter = bindRopeSkippingListViewModel.getAdapter();
                itemBinding = bindRopeSkippingListViewModel.getItemBinding();
                viewHolderFactory = bindRopeSkippingListViewModel.getViewHolderFactory();
                items = bindRopeSkippingListViewModel.getItems();
                bindRopeSkippingListAdapter2 = adapter;
            } else {
                bindRopeSkippingListAdapter2 = null;
                itemBinding = null;
                viewHolderFactory = null;
            }
            y0(0, items);
            boolean z = items == null || items.size() == 0;
            if (j2 != 0) {
                j |= z ? 16L : 8L;
            }
            i = z ? 0 : 8;
            bindRopeSkippingListAdapter = bindRopeSkippingListAdapter2;
            function2 = viewHolderFactory;
            observableArrayList = items;
        } else {
            itemBinding = null;
            observableArrayList = null;
            bindRopeSkippingListAdapter = null;
            function2 = null;
        }
        if ((j & 7) != 0) {
            BindingAdapters.setAdapter(this.B, itemBinding, observableArrayList, bindRopeSkippingListAdapter, function2, null);
            this.C.setVisibility(i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (dw1.d != i) {
            return false;
        }
        B0((BindRopeSkippingListViewModel) obj);
        return true;
    }

    public tq7(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, H, I));
    }
}
