package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BindingAdapters;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabItemAdapter;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public class m56 extends l56 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public long C;

    public m56(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (RecyclerView) objArr[0]);
        this.C = -1L;
        this.A.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(ObservableArrayList<TabContentItem> observableArrayList, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }

    public void B0(DeviceTabV4ViewModel deviceTabV4ViewModel) {
        this.B = deviceTabV4ViewModel;
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
        ItemBinding<TabContentItem> itemBinding;
        ObservableArrayList<TabContentItem> observableArrayList;
        DeviceTabItemAdapter deviceTabItemAdapter;
        DeviceTabItemAdapter deviceTabItemAdapter2;
        ItemBinding<TabContentItem> itemBindings;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        DeviceTabV4ViewModel deviceTabV4ViewModel = this.B;
        long j2 = j & 7;
        ObservableArrayList<TabContentItem> observableArrayList2 = null;
        if (j2 != 0) {
            if (deviceTabV4ViewModel != null) {
                DeviceTabItemAdapter adapter = deviceTabV4ViewModel.getAdapter();
                ObservableArrayList<TabContentItem> tabItems = deviceTabV4ViewModel.getTabItems();
                itemBindings = deviceTabV4ViewModel.getItemBindings();
                deviceTabItemAdapter2 = adapter;
                observableArrayList2 = tabItems;
            } else {
                deviceTabItemAdapter2 = null;
                itemBindings = null;
            }
            y0(0, observableArrayList2);
            observableArrayList = observableArrayList2;
            deviceTabItemAdapter = deviceTabItemAdapter2;
            itemBinding = itemBindings;
        } else {
            itemBinding = null;
            observableArrayList = null;
            deviceTabItemAdapter = null;
        }
        if (j2 != 0) {
            BindingAdapters.setAdapter(this.A, itemBinding, observableArrayList, deviceTabItemAdapter, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.f41707k != i) {
            return false;
        }
        B0((DeviceTabV4ViewModel) obj);
        return true;
    }

    public m56(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
