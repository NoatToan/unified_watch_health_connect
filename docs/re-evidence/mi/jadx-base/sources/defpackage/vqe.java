package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.account.api.bean.CountryInfo;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BindingAdapters;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.provider.MergeObservableList;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.login.region.RegionSelectListAdapter;
import com.xiaomi.fitness.login.region.RegionSelectListViewModel;
import com.xiaomi.fitness.login.widget.QuickIndexView;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public class vqe extends uqe {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final LinearLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(gri.t, 2);
        sparseIntArray.put(gri.v, 3);
        sparseIntArray.put(gri.f19271r, 4);
        sparseIntArray.put(gri.u, 5);
        sparseIntArray.put(gri.s, 6);
    }

    public vqe(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (TextView) objArr[4], (QuickIndexView) objArr[6], (EditText) objArr[2], (TextView) objArr[5], (TextView) objArr[3], (RecyclerView) objArr[1]);
        this.I = -1L;
        this.F.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.H = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(MergeObservableList<CountryInfo> mergeObservableList, int i) {
        if (i != dv1.f15951a) {
            return false;
        }
        synchronized (this) {
            this.I |= 1;
        }
        return true;
    }

    public void B0(RegionSelectListViewModel regionSelectListViewModel) {
        this.G = regionSelectListViewModel;
        synchronized (this) {
            this.I |= 2;
        }
        notifyPropertyChanged(dv1.d);
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
            this.I = 4L;
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
        ItemBinding<CountryInfo> itemBinding;
        MergeObservableList<CountryInfo> mergeObservableList;
        RegionSelectListAdapter regionSelectListAdapter;
        Function2<View, Integer, BaseViewHolder<CountryInfo>> function2;
        RegionSelectListAdapter regionSelectListAdapter2;
        ItemBinding<CountryInfo> itemBinding2;
        Function2<View, Integer, BaseViewHolder<CountryInfo>> viewHolderFactory;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        RegionSelectListViewModel regionSelectListViewModel = this.G;
        long j2 = j & 7;
        MergeObservableList<CountryInfo> mergeObservableList2 = null;
        if (j2 != 0) {
            if (regionSelectListViewModel != null) {
                RegionSelectListAdapter adapter = regionSelectListViewModel.getAdapter();
                ItemBinding<CountryInfo> regionItemBinding = regionSelectListViewModel.getRegionItemBinding();
                MergeObservableList<CountryInfo> regionItems = regionSelectListViewModel.getRegionItems();
                viewHolderFactory = regionSelectListViewModel.getViewHolderFactory();
                regionSelectListAdapter2 = adapter;
                mergeObservableList2 = regionItems;
                itemBinding2 = regionItemBinding;
            } else {
                regionSelectListAdapter2 = null;
                itemBinding2 = null;
                viewHolderFactory = null;
            }
            y0(0, mergeObservableList2);
            mergeObservableList = mergeObservableList2;
            regionSelectListAdapter = regionSelectListAdapter2;
            itemBinding = itemBinding2;
            function2 = viewHolderFactory;
        } else {
            itemBinding = null;
            mergeObservableList = null;
            regionSelectListAdapter = null;
            function2 = null;
        }
        if (j2 != 0) {
            BindingAdapters.setAdapter(this.F, itemBinding, mergeObservableList, regionSelectListAdapter, function2, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (dv1.d != i) {
            return false;
        }
        B0((RegionSelectListViewModel) obj);
        return true;
    }

    public vqe(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, J, K));
    }
}
