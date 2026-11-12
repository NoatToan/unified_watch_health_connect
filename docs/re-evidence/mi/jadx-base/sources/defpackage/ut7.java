package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BindingAdapters;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.eco.device.manager.ui.EcoDeviceDetail;
import com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceAdapterV4;
import com.xiaomi.fitness.eco.device.manager.ui.tab.OtherDeviceTabV4ViewModel;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public class ut7 extends tt7 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public long C;

    public ut7(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (RecyclerView) objArr[0]);
        this.C = -1L;
        this.A.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(ObservableArrayList<EcoDeviceDetail> observableArrayList, int i) {
        if (i != dw1.f15982a) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }

    public void B0(OtherDeviceTabV4ViewModel otherDeviceTabV4ViewModel) {
        this.B = otherDeviceTabV4ViewModel;
        synchronized (this) {
            this.C |= 2;
        }
        notifyPropertyChanged(dw1.d);
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
        ItemBinding<EcoDeviceDetail> itemBinding;
        ObservableArrayList<EcoDeviceDetail> observableArrayList;
        OtherDeviceAdapterV4 otherDeviceAdapterV4;
        OtherDeviceAdapterV4 otherDeviceAdapterV5;
        ItemBinding<EcoDeviceDetail> itemBinding2;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        OtherDeviceTabV4ViewModel otherDeviceTabV4ViewModel = this.B;
        long j2 = j & 7;
        ObservableArrayList<EcoDeviceDetail> items = null;
        if (j2 != 0) {
            if (otherDeviceTabV4ViewModel != null) {
                OtherDeviceAdapterV4 adapter = otherDeviceTabV4ViewModel.getAdapter();
                ItemBinding<EcoDeviceDetail> itemBinding3 = otherDeviceTabV4ViewModel.getItemBinding();
                otherDeviceAdapterV5 = adapter;
                items = otherDeviceTabV4ViewModel.getItems();
                itemBinding2 = itemBinding3;
            } else {
                otherDeviceAdapterV5 = null;
                itemBinding2 = null;
            }
            y0(0, items);
            observableArrayList = items;
            otherDeviceAdapterV4 = otherDeviceAdapterV5;
            itemBinding = itemBinding2;
        } else {
            itemBinding = null;
            observableArrayList = null;
            otherDeviceAdapterV4 = null;
        }
        if (j2 != 0) {
            BindingAdapters.setAdapter(this.A, itemBinding, observableArrayList, otherDeviceAdapterV4, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (dw1.d != i) {
            return false;
        }
        B0((OtherDeviceTabV4ViewModel) obj);
        return true;
    }

    public ut7(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
