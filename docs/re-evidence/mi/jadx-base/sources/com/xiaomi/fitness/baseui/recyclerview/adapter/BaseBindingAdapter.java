package com.xiaomi.fitness.baseui.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.Utils;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseBindingViewHolder;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import defpackage.sk5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 8*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u000289B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u000bJ&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J,\u0010\"\u001a\u00020\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010$\u001a\u00020\u001f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016J\u0016\u0010(\u001a\u00020)2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u00132\u0006\u0010+\u001a\u00020,H\u0016J\u000e\u0010.\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001fJ5\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u00104\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00105J\u0016\u00106\u001a\u00020\u00132\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\b\u00107\u001a\u00020\u0013H\u0002R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\rX\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseBindingAdapter;", "T", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseAdapter;", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BindingCollectionAdapter;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "mCallback", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/WeakReferenceOnListChangedCallback;", "mLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "itemBinding", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "getItemBinding", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "setItemBinding", "(Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;)V", "setDataList", "", "list", "", "setLifecycleOwner", "lifecycleOwner", "createViewHolder", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "view", "Landroid/view/View;", "onBindViewHolder", "holder", "position", "payloads", "", "", "isForDataBinding", "", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onDetachedFromRecyclerView", "getItemViewType", "onBindBinding", "binding", "Landroidx/databinding/ViewDataBinding;", "variableId", "layoutRes", "item", "(Landroidx/databinding/ViewDataBinding;IIILjava/lang/Object;)V", "onViewDetachedFromWindow", "tryGetLifecycleOwner", "Companion", "BindingViewHolder", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BaseBindingAdapter<T> extends BaseAdapter<T> implements BindingCollectionAdapter<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Object DATA_INVALIDATION = new Object();
    public ItemBinding<? super T> itemBinding;

    @Nullable
    private WeakReferenceOnListChangedCallback<T> mCallback;

    @Nullable
    private LifecycleOwner mLifecycleOwner;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseBindingAdapter$BindingViewHolder;", "T", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseBindingViewHolder;", "Landroidx/databinding/ViewDataBinding;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BindingViewHolder<T> extends BaseBindingViewHolder<ViewDataBinding, T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BindingViewHolder(@NotNull View view) {
            super(0, view);
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseBindingAdapter$Companion;", "", "<init>", "()V", "DATA_INVALIDATION", "getDATA_INVALIDATION", "()Ljava/lang/Object;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Object getDATA_INVALIDATION() {
            return BaseBindingAdapter.DATA_INVALIDATION;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseBindingAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean isForDataBinding(List<Object> payloads) {
        if (payloads.size() == 0) {
            return false;
        }
        int size = payloads.size();
        for (int i = 0; i < size; i++) {
            if (payloads.get(i) != DATA_INVALIDATION) {
                return false;
            }
        }
        return true;
    }

    private final void tryGetLifecycleOwner() {
        LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
        if (lifecycleOwner != null) {
            Intrinsics.checkNotNull(lifecycleOwner);
            if (lifecycleOwner.getLifecycle().getState() != Lifecycle.State.DESTROYED) {
                return;
            }
        }
        Utils utils = Utils.INSTANCE;
        RecyclerView recyclerView = getRecyclerView();
        Intrinsics.checkNotNull(recyclerView);
        this.mLifecycleOwner = utils.findLifecycleOwner(recyclerView);
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.adapter.BaseAdapter
    @NotNull
    public BaseViewHolder<T> createViewHolder(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        BaseViewHolder<T> baseViewHolderCreateViewHolder = super.createViewHolder(inflater, parent, viewType);
        if (baseViewHolderCreateViewHolder instanceof BaseBindingViewHolder) {
            ((BaseBindingViewHolder) baseViewHolderCreateViewHolder).addOnRebindCallback(getRecyclerView());
        }
        return baseViewHolderCreateViewHolder;
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.adapter.BindingCollectionAdapter
    @NotNull
    public ItemBinding<? super T> getItemBinding() {
        ItemBinding<? super T> itemBinding = this.itemBinding;
        if (itemBinding != null) {
            return itemBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemBinding");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.adapter.BaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int position) {
        T itemData = getItemData(position);
        if (itemData == null) {
            return super.getItemViewType(position);
        }
        getItemBinding().onItemBind$ui_release(position, itemData);
        return getItemBinding().getLayoutId();
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.adapter.BaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (getRecyclerView() == null) {
            this.mCallback = new WeakReferenceOnListChangedCallback<>(this, getDataList());
            getDataList().addOnListChangedCallback(this.mCallback);
        }
        super.onAttachedToRecyclerView(recyclerView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.recyclerview.adapter.BindingCollectionAdapter
    public void onBindBinding(@NotNull ViewDataBinding binding, int variableId, int layoutRes, int position, T item) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        tryGetLifecycleOwner();
        if (getItemBinding().bind(binding, item)) {
            binding.t();
            LifecycleOwner lifecycleOwner = this.mLifecycleOwner;
            if (lifecycleOwner != null) {
                binding.l0(lifecycleOwner);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.d0 d0Var, int i, List list) {
        onBindViewHolder((BaseViewHolder) d0Var, i, (List<Object>) list);
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.adapter.BaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (getRecyclerView() != null) {
            getDataList().removeOnListChangedCallback(this.mCallback);
            this.mCallback = null;
        }
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.adapter.BaseAdapter
    public void setDataList(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (Intrinsics.areEqual(getDataList(), list)) {
            return;
        }
        getDataList().removeOnListChangedCallback(this.mCallback);
        this.mCallback = null;
        f<T> fVarNewObservable$default = !(list instanceof f) ? ListExtKt.newObservable$default(list, null, 1, null) : (f) list;
        WeakReferenceOnListChangedCallback<T> weakReferenceOnListChangedCallback = new WeakReferenceOnListChangedCallback<>(this, fVarNewObservable$default);
        this.mCallback = weakReferenceOnListChangedCallback;
        fVarNewObservable$default.addOnListChangedCallback(weakReferenceOnListChangedCallback);
        updateData(fVarNewObservable$default);
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.adapter.BindingCollectionAdapter
    public void setItemBinding(@NotNull ItemBinding<? super T> itemBinding) {
        Intrinsics.checkNotNullParameter(itemBinding, "<set-?>");
        this.itemBinding = itemBinding;
    }

    public final void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        this.mLifecycleOwner = lifecycleOwner;
        if (getRecyclerView() != null) {
            RecyclerView recyclerView = getRecyclerView();
            Intrinsics.checkNotNull(recyclerView);
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView recyclerView2 = getRecyclerView();
                Intrinsics.checkNotNull(recyclerView2);
                ViewDataBinding viewDataBindingH = sk5.h(recyclerView2.getChildAt(i));
                if (viewDataBindingH != null) {
                    viewDataBindingH.l0(lifecycleOwner);
                }
            }
        }
    }

    public BaseBindingAdapter(@Nullable Lifecycle lifecycle) {
        super(lifecycle);
    }

    public void onBindViewHolder(@NotNull BaseViewHolder<T> holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        onBindViewHolder((BaseViewHolder) holder, position);
        ViewDataBinding viewDataBindingH = sk5.h(holder.itemView);
        Intrinsics.checkNotNull(viewDataBindingH);
        if (isForDataBinding(payloads)) {
            viewDataBindingH.t();
            return;
        }
        T itemData = getItemData(position);
        if (itemData != null) {
            onBindBinding(viewDataBindingH, getItemBinding().getVariableId(), getItemBinding().getLayoutId(), position, itemData);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NotNull BaseViewHolder<T> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        this.mLifecycleOwner = null;
    }

    public /* synthetic */ BaseBindingAdapter(Lifecycle lifecycle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : lifecycle);
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.adapter.BaseAdapter
    @NotNull
    public BaseViewHolder<T> createViewHolder(@Nullable View view) {
        if (view != null) {
            return new BindingViewHolder(view);
        }
        return super.createViewHolder(view);
    }
}
