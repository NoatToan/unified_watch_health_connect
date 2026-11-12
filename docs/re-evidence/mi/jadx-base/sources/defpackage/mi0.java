package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.about.DeviceDualAuthorizationViewModel;
import com.xiaomi.fitness.about.adapter.DeviceDualAuthorizationAdapter;
import com.xiaomi.fitness.about.bean.RnDeviceInfo;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BindingAdapters;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes7.dex */
public class mi0 extends li0 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final SpringBackLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(uqi.L, 2);
        sparseIntArray.put(uqi.s, 3);
        sparseIntArray.put(uqi.f36032r, 4);
        sparseIntArray.put(uqi.Y, 5);
        sparseIntArray.put(uqi.v, 6);
        sparseIntArray.put(uqi.Z, 7);
    }

    public mi0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (View) objArr[4], (SwitchButtonBindingTwoLineTextView) objArr[3], (ImageView) objArr[6], (RecyclerView) objArr[1], (NestedScrollView) objArr[2], (TextView) objArr[5], (TextView) objArr[7]);
        this.J = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.I = springBackLayout;
        springBackLayout.setTag(null);
        this.D.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(ObservableArrayList<RnDeviceInfo> observableArrayList, int i) {
        if (i != vv1.f37253a) {
            return false;
        }
        synchronized (this) {
            this.J |= 1;
        }
        return true;
    }

    public void B0(DeviceDualAuthorizationViewModel deviceDualAuthorizationViewModel) {
        this.H = deviceDualAuthorizationViewModel;
        synchronized (this) {
            this.J |= 2;
        }
        notifyPropertyChanged(vv1.c);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 4L;
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
        ObservableArrayList<RnDeviceInfo> observableArrayList;
        DeviceDualAuthorizationAdapter deviceDualAuthorizationAdapter;
        DeviceDualAuthorizationAdapter deviceDualAuthorizationAdapter2;
        ItemBinding<RnDeviceInfo> itemBinding;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        DeviceDualAuthorizationViewModel deviceDualAuthorizationViewModel = this.H;
        long j2 = j & 7;
        ItemBinding<RnDeviceInfo> itemBinding2 = null;
        ObservableArrayList<RnDeviceInfo> items = null;
        int i = 0;
        if (j2 != 0) {
            if (deviceDualAuthorizationViewModel != null) {
                DeviceDualAuthorizationAdapter adapter = deviceDualAuthorizationViewModel.getAdapter();
                itemBinding = deviceDualAuthorizationViewModel.getItemBinding();
                items = deviceDualAuthorizationViewModel.getItems();
                deviceDualAuthorizationAdapter2 = adapter;
            } else {
                deviceDualAuthorizationAdapter2 = null;
                itemBinding = null;
            }
            y0(0, items);
            boolean z = items != null && items.size() > 0;
            if (j2 != 0) {
                j |= z ? 16L : 8L;
            }
            i = z ? 0 : 8;
            ItemBinding<RnDeviceInfo> itemBinding3 = itemBinding;
            deviceDualAuthorizationAdapter = deviceDualAuthorizationAdapter2;
            observableArrayList = items;
            itemBinding2 = itemBinding3;
        } else {
            observableArrayList = null;
            deviceDualAuthorizationAdapter = null;
        }
        if ((j & 7) != 0) {
            this.D.setVisibility(i);
            BindingAdapters.setAdapter(this.D, itemBinding2, observableArrayList, deviceDualAuthorizationAdapter, null, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (vv1.c != i) {
            return false;
        }
        B0((DeviceDualAuthorizationViewModel) obj);
        return true;
    }

    public mi0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, K, L));
    }
}
