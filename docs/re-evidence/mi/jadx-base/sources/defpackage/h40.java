package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.access.bean.DeviceModelsInfo;
import com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerListAdapter;
import com.xiaomi.fitness.access.wechatsportimport.manager.AccessDeviceManagerViewModel;
import com.xiaomi.fitness.access.wechatsportimport.manager.AddAccessDeviceManagerViewHolder;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BindingAdapters;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class h40 extends g40 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final ConstraintLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(vqi.z, 2);
        sparseIntArray.put(vqi.F, 3);
        sparseIntArray.put(vqi.G, 4);
    }

    public h40(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (RecyclerView) objArr[1], (View) objArr[2], (FrameLayout) objArr[3], (RightArrowSingleLineTextView) objArr[4]);
        this.G = -1L;
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(ObservableArrayList<DeviceModelsInfo> observableArrayList, int i) {
        if (i != xv1.f39496a) {
            return false;
        }
        synchronized (this) {
            this.G |= 1;
        }
        return true;
    }

    public void B0(AccessDeviceManagerViewModel accessDeviceManagerViewModel) {
        this.E = accessDeviceManagerViewModel;
        synchronized (this) {
            this.G |= 2;
        }
        notifyPropertyChanged(xv1.c);
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
        ItemBinding<DeviceModelsInfo> itemBinding;
        ObservableArrayList<DeviceModelsInfo> observableArrayList;
        AccessDeviceManagerListAdapter accessDeviceManagerListAdapter;
        Function2<View, Integer, AddAccessDeviceManagerViewHolder> function2;
        AccessDeviceManagerListAdapter accessDeviceManagerListAdapter2;
        Function2<View, Integer, AddAccessDeviceManagerViewHolder> viewHolderFactory;
        ItemBinding<DeviceModelsInfo> deviceModelItemBinding;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        AccessDeviceManagerViewModel accessDeviceManagerViewModel = this.E;
        long j2 = j & 7;
        ObservableArrayList<DeviceModelsInfo> observableArrayList2 = null;
        if (j2 != 0) {
            if (accessDeviceManagerViewModel != null) {
                AccessDeviceManagerListAdapter adapter = accessDeviceManagerViewModel.getAdapter();
                ObservableArrayList<DeviceModelsInfo> deviceModelDataItems = accessDeviceManagerViewModel.getDeviceModelDataItems();
                viewHolderFactory = accessDeviceManagerViewModel.getViewHolderFactory();
                deviceModelItemBinding = accessDeviceManagerViewModel.getDeviceModelItemBinding();
                accessDeviceManagerListAdapter2 = adapter;
                observableArrayList2 = deviceModelDataItems;
            } else {
                accessDeviceManagerListAdapter2 = null;
                viewHolderFactory = null;
                deviceModelItemBinding = null;
            }
            y0(0, observableArrayList2);
            observableArrayList = observableArrayList2;
            accessDeviceManagerListAdapter = accessDeviceManagerListAdapter2;
            function2 = viewHolderFactory;
            itemBinding = deviceModelItemBinding;
        } else {
            itemBinding = null;
            observableArrayList = null;
            accessDeviceManagerListAdapter = null;
            function2 = null;
        }
        if (j2 != 0) {
            BindingAdapters.setAdapter(this.A, itemBinding, observableArrayList, accessDeviceManagerListAdapter, function2, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (xv1.c != i) {
            return false;
        }
        B0((AccessDeviceManagerViewModel) obj);
        return true;
    }

    public h40(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, H, I));
    }
}
