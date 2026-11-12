package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BindingAdapters;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingsItemAdapter;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel;
import kotlin.jvm.functions.Function2;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public class ws6 extends vs6 {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F = null;
    public long D;

    public ws6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (RecyclerView) objArr[0]);
        this.D = -1L;
        this.A.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(ObservableArrayList<TabContentItem> observableArrayList, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.D |= 1;
        }
        return true;
    }

    public void B0(TabContentItem tabContentItem) {
        this.C = tabContentItem;
    }

    public void C0(DeviceTabV4ViewModel deviceTabV4ViewModel) {
        this.B = deviceTabV4ViewModel;
        synchronized (this) {
            this.D |= 4;
        }
        notifyPropertyChanged(zv1.f41707k);
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
            this.D = 8L;
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
        DeviceSettingsItemAdapter deviceSettingsItemAdapter;
        Function2<View, Integer, BaseViewHolder<TabContentItem>> function2;
        ItemBinding<TabContentItem> itemBinding2;
        Function2<View, Integer, BaseViewHolder<TabContentItem>> function3;
        DeviceSettingsItemAdapter settingAdapter;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        DeviceTabV4ViewModel deviceTabV4ViewModel = this.B;
        long j2 = j & 13;
        ObservableArrayList<TabContentItem> observableArrayList2 = null;
        if (j2 != 0) {
            if (deviceTabV4ViewModel != null) {
                ItemBinding<TabContentItem> settingItemBindings = deviceTabV4ViewModel.getSettingItemBindings();
                Function2<View, Integer, BaseViewHolder<TabContentItem>> settingViewHolder = deviceTabV4ViewModel.getSettingViewHolder();
                ObservableArrayList<TabContentItem> settingTabItems = deviceTabV4ViewModel.getSettingTabItems();
                settingAdapter = deviceTabV4ViewModel.getSettingAdapter();
                itemBinding2 = settingItemBindings;
                observableArrayList2 = settingTabItems;
                function3 = settingViewHolder;
            } else {
                itemBinding2 = null;
                function3 = null;
                settingAdapter = null;
            }
            y0(0, observableArrayList2);
            observableArrayList = observableArrayList2;
            itemBinding = itemBinding2;
            function2 = function3;
            deviceSettingsItemAdapter = settingAdapter;
        } else {
            itemBinding = null;
            observableArrayList = null;
            deviceSettingsItemAdapter = null;
            function2 = null;
        }
        if (j2 != 0) {
            BindingAdapters.setAdapter(this.A, itemBinding, observableArrayList, deviceSettingsItemAdapter, function2, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.g == i) {
            B0((TabContentItem) obj);
        } else {
            if (zv1.f41707k != i) {
                return false;
            }
            C0((DeviceTabV4ViewModel) obj);
        }
        return true;
    }

    public ws6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, E, F));
    }
}
