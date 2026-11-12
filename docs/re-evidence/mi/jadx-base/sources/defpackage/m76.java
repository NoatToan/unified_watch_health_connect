package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ViewDataBinding;
import com.fitness.banner.export.v2.BannerItemV2;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BindingAdapters;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceBannerAdapter;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public class m76 extends l76 {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F = null;
    public long D;

    public m76(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (RecyclerView) objArr[0]);
        this.D = -1L;
        this.A.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(ObservableArrayList<BannerItemV2> observableArrayList, int i) {
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
        ItemBinding<BannerItemV2> itemBinding;
        ObservableArrayList<BannerItemV2> observableArrayList;
        DeviceBannerAdapter deviceBannerAdapter;
        DeviceBannerAdapter deviceBannerAdapter2;
        ItemBinding<BannerItemV2> bannerItemBinding;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        DeviceTabV4ViewModel deviceTabV4ViewModel = this.B;
        long j2 = j & 13;
        ObservableArrayList<BannerItemV2> observableArrayList2 = null;
        if (j2 != 0) {
            if (deviceTabV4ViewModel != null) {
                DeviceBannerAdapter bannerAdapter = deviceTabV4ViewModel.getBannerAdapter();
                ObservableArrayList<BannerItemV2> bannerItems = deviceTabV4ViewModel.getBannerItems();
                bannerItemBinding = deviceTabV4ViewModel.getBannerItemBinding();
                deviceBannerAdapter2 = bannerAdapter;
                observableArrayList2 = bannerItems;
            } else {
                deviceBannerAdapter2 = null;
                bannerItemBinding = null;
            }
            y0(0, observableArrayList2);
            observableArrayList = observableArrayList2;
            deviceBannerAdapter = deviceBannerAdapter2;
            itemBinding = bannerItemBinding;
        } else {
            itemBinding = null;
            observableArrayList = null;
            deviceBannerAdapter = null;
        }
        if (j2 != 0) {
            BindingAdapters.setAdapter(this.A, itemBinding, observableArrayList, deviceBannerAdapter, null, null);
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

    public m76(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, E, F));
    }
}
