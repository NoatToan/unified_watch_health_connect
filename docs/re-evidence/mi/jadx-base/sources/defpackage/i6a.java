package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BindingAdapters;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.watch.face.adapter.FaceCategoryAdapter;
import com.xiaomi.fitness.watch.face.data.FaceAllTabInfo;
import com.xiaomi.fitness.watch.face.viewmodel.FaceCategoryViewModel;
import com.xiaomi.fitness.watch.face.widget.StateLayout;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public class i6a extends h6a {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F = null;
    public long D;

    public i6a(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (RecyclerView) objArr[1], (StateLayout) objArr[0]);
        this.D = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(ObservableArrayList<FaceAllTabInfo> observableArrayList, int i) {
        if (i != tv1.f35070a) {
            return false;
        }
        synchronized (this) {
            this.D |= 1;
        }
        return true;
    }

    public void B0(FaceCategoryViewModel faceCategoryViewModel) {
        this.C = faceCategoryViewModel;
        synchronized (this) {
            this.D |= 2;
        }
        notifyPropertyChanged(tv1.d);
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
            this.D = 4L;
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
        ItemBinding<FaceAllTabInfo> itemBinding;
        ObservableArrayList<FaceAllTabInfo> observableArrayList;
        FaceCategoryAdapter faceCategoryAdapter;
        Function2<View, Integer, BaseViewHolder<FaceAllTabInfo>> function2;
        ItemBinding<FaceAllTabInfo> itemBinding2;
        FaceCategoryAdapter faceCategoryAdapter2;
        Function2<View, Integer, BaseViewHolder<FaceAllTabInfo>> function3;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        FaceCategoryViewModel faceCategoryViewModel = this.C;
        long j2 = j & 7;
        ObservableArrayList<FaceAllTabInfo> items = null;
        if (j2 != 0) {
            if (faceCategoryViewModel != null) {
                ItemBinding<FaceAllTabInfo> categoryBindings = faceCategoryViewModel.getCategoryBindings();
                FaceCategoryAdapter faceCategoryAdapter3 = faceCategoryViewModel.getFaceCategoryAdapter();
                Function2<View, Integer, BaseViewHolder<FaceAllTabInfo>> viewHolder = faceCategoryViewModel.getViewHolder();
                itemBinding2 = categoryBindings;
                items = faceCategoryViewModel.getItems();
                function3 = viewHolder;
                faceCategoryAdapter2 = faceCategoryAdapter3;
            } else {
                itemBinding2 = null;
                faceCategoryAdapter2 = null;
                function3 = null;
            }
            y0(0, items);
            observableArrayList = items;
            itemBinding = itemBinding2;
            faceCategoryAdapter = faceCategoryAdapter2;
            function2 = function3;
        } else {
            itemBinding = null;
            observableArrayList = null;
            faceCategoryAdapter = null;
            function2 = null;
        }
        if (j2 != 0) {
            BindingAdapters.setAdapter(this.A, itemBinding, observableArrayList, faceCategoryAdapter, function2, null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (tv1.d != i) {
            return false;
        }
        B0((FaceCategoryViewModel) obj);
        return true;
    }

    public i6a(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 2, E, F));
    }
}
