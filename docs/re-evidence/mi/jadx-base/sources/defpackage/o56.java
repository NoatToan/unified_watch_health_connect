package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BindingAdapters;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingListViewModel;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceSettingsItemAdapter;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public class o56 extends n56 {
    public static final ViewDataBinding.i F;
    public static final SparseIntArray G;
    public final ConstraintLayout D;
    public long E;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(3);
        F = iVar;
        iVar.a(0, new String[]{"device_item_unbind_device_v4"}, new int[]{2}, new int[]{dui.H});
        G = null;
    }

    public o56(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 2, (RecyclerView) objArr[1], (h86) objArr[2]);
        this.E = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        this.A.setTag(null);
        k0(this.B);
        o0(view);
        H();
    }

    public final boolean A0(h86 h86Var, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.E |= 1;
        }
        return true;
    }

    public final boolean B0(ObservableArrayList<TabContentItem> observableArrayList, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.E |= 2;
        }
        return true;
    }

    public void C0(DeviceSettingListViewModel deviceSettingListViewModel) {
        this.C = deviceSettingListViewModel;
        synchronized (this) {
            this.E |= 4;
        }
        notifyPropertyChanged(zv1.f41707k);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                return this.B.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.E = 8L;
        }
        this.B.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return A0((h86) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return B0((ObservableArrayList) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
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
            j = this.E;
            this.E = 0L;
        }
        DeviceSettingListViewModel deviceSettingListViewModel = this.C;
        long j2 = j & 14;
        ObservableArrayList<TabContentItem> observableArrayList2 = null;
        if (j2 != 0) {
            if (deviceSettingListViewModel != null) {
                ItemBinding<TabContentItem> settingTabBindings = deviceSettingListViewModel.getSettingTabBindings();
                Function2<View, Integer, BaseViewHolder<TabContentItem>> settingHolder = deviceSettingListViewModel.getSettingHolder();
                ObservableArrayList<TabContentItem> settingTabItems = deviceSettingListViewModel.getSettingTabItems();
                settingAdapter = deviceSettingListViewModel.getSettingAdapter();
                itemBinding2 = settingTabBindings;
                observableArrayList2 = settingTabItems;
                function3 = settingHolder;
            } else {
                itemBinding2 = null;
                function3 = null;
                settingAdapter = null;
            }
            y0(1, observableArrayList2);
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
        ViewDataBinding.r(this.B);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.f41707k != i) {
            return false;
        }
        C0((DeviceSettingListViewModel) obj);
        return true;
    }

    public o56(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, F, G));
    }
}
