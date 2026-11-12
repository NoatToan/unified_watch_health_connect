package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BindingAdapters;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.device.manager.export.add.DeviceInfo;
import com.xiaomi.fitness.device.manager.ui.add.AddDeviceListAdapter;
import com.xiaomi.fitness.device.manager.ui.add.AddDeviceViewModel;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public class h16 extends g16 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public long C;

    public h16(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (RecyclerView) objArr[0]);
        this.C = -1L;
        this.A.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(MutableLiveData<List<DeviceInfo>> mutableLiveData, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }

    public void B0(AddDeviceViewModel addDeviceViewModel) {
        this.B = addDeviceViewModel;
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
        return A0((MutableLiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        ItemBinding<DeviceInfo> itemBinding;
        List<DeviceInfo> value;
        AddDeviceListAdapter addDeviceListAdapter;
        Function2<View, Integer, BaseViewHolder<DeviceInfo>> function2;
        AddDeviceListAdapter adapter;
        ItemBinding<DeviceInfo> deviceItemBinding;
        MutableLiveData<List<DeviceInfo>> deviceItems;
        Function2<View, Integer, BaseViewHolder<DeviceInfo>> viewHolderFactory;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        AddDeviceViewModel addDeviceViewModel = this.B;
        long j2 = j & 7;
        if (j2 != 0) {
            if (addDeviceViewModel != null) {
                adapter = addDeviceViewModel.getAdapter();
                deviceItemBinding = addDeviceViewModel.getDeviceItemBinding();
                viewHolderFactory = addDeviceViewModel.getViewHolderFactory();
                deviceItems = addDeviceViewModel.getDeviceItems();
            } else {
                adapter = null;
                deviceItemBinding = null;
                deviceItems = null;
                viewHolderFactory = null;
            }
            w0(0, deviceItems);
            value = deviceItems != null ? deviceItems.getValue() : null;
            addDeviceListAdapter = adapter;
            itemBinding = deviceItemBinding;
            function2 = viewHolderFactory;
        } else {
            itemBinding = null;
            value = null;
            addDeviceListAdapter = null;
            function2 = null;
        }
        if (j2 != 0) {
            BindingAdapters.setAdapter(this.A, itemBinding, value, addDeviceListAdapter, function2, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.f41707k != i) {
            return false;
        }
        B0((AddDeviceViewModel) obj);
        return true;
    }

    public h16(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
