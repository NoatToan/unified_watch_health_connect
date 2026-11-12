package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BindingAdapters;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.device.manager.ui.DeviceDetail;
import com.xiaomi.fitness.device.manager.ui.manager.ManagerAdapter;
import com.xiaomi.fitness.device.manager.ui.manager.ManagerViewModel;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public class n16 extends m16 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public long C;

    public n16(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (RecyclerView) objArr[0]);
        this.C = -1L;
        this.A.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(ObservableArrayList<DeviceDetail> observableArrayList, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }

    public void B0(ManagerViewModel managerViewModel) {
        this.B = managerViewModel;
        synchronized (this) {
            this.C |= 2;
        }
        notifyPropertyChanged(zv1.f41707k);
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
        ItemBinding<DeviceDetail> itemBinding;
        ObservableArrayList<DeviceDetail> observableArrayList;
        ManagerAdapter managerAdapter;
        Function2<View, Integer, BaseViewHolder<DeviceDetail>> function2;
        ManagerAdapter managerAdapter2;
        Function2<View, Integer, BaseViewHolder<DeviceDetail>> function3;
        ItemBinding<DeviceDetail> itemBinding2;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        ManagerViewModel managerViewModel = this.B;
        long j2 = j & 7;
        ObservableArrayList<DeviceDetail> items = null;
        if (j2 != 0) {
            if (managerViewModel != null) {
                ManagerAdapter adapter = managerViewModel.getAdapter();
                Function2<View, Integer, BaseViewHolder<DeviceDetail>> viewHolderFactory = managerViewModel.getViewHolderFactory();
                ItemBinding<DeviceDetail> itemBinding3 = managerViewModel.getItemBinding();
                managerAdapter2 = adapter;
                items = managerViewModel.getItems();
                itemBinding2 = itemBinding3;
                function3 = viewHolderFactory;
            } else {
                managerAdapter2 = null;
                function3 = null;
                itemBinding2 = null;
            }
            y0(0, items);
            observableArrayList = items;
            managerAdapter = managerAdapter2;
            function2 = function3;
            itemBinding = itemBinding2;
        } else {
            itemBinding = null;
            observableArrayList = null;
            managerAdapter = null;
            function2 = null;
        }
        if (j2 != 0) {
            BindingAdapters.setAdapter(this.A, itemBinding, observableArrayList, managerAdapter, function2, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.f41707k != i) {
            return false;
        }
        B0((ManagerViewModel) obj);
        return true;
    }

    public n16(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
