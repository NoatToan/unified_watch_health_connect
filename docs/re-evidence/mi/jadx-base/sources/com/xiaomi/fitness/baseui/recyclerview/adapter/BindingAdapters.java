package com.xiaomi.fitness.baseui.recyclerview.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.h;
import com.xiaomi.fitness.baseui.recyclerview.diff.AsyncDiffObservableList;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import defpackage.gsi;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J±\u0001\u0010\u0018\u001a\u00020\u0017\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t2L\u0010\u0014\u001aH\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0007¢\u0006\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BindingAdapters;", "", "T", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "itemBinding", "", "items", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseBindingAdapter;", "adapter", "Lkotlin/Function2;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "", "viewType", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/ViewHolderFactory;", "viewHolderFactory", "Landroidx/recyclerview/widget/c;", "diffConfig", "", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;Ljava/util/List;Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseBindingAdapter;Lkotlin/jvm/functions/Function2;Landroidx/recyclerview/widget/c;)V", "Landroidx/recyclerview/widget/h$f;", "callback", "toAsyncDifferConfig", "(Landroidx/recyclerview/widget/h$f;)Landroidx/recyclerview/widget/c;", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/OnItemBind;", "onItemBind", "toItemBinding", "(Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/OnItemBind;)Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 0, 0})
public final class BindingAdapters {

    @NotNull
    public static final BindingAdapters INSTANCE = new BindingAdapters();

    private BindingAdapters() {
    }

    @JvmStatic
    public static final <T> void setAdapter(@NotNull RecyclerView recyclerView, @NotNull ItemBinding<? super T> itemBinding, @Nullable List<? extends T> items, @Nullable BaseBindingAdapter<T> adapter, @Nullable Function2<? super View, ? super Integer, ? extends BaseViewHolder<T>> viewHolderFactory, @Nullable c<T> diffConfig) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        BaseBindingAdapter<T> baseBindingAdapter = (BaseBindingAdapter) recyclerView.getAdapter();
        if (adapter == null) {
            adapter = baseBindingAdapter == null ? new BaseBindingAdapter<>(null, 1, null) : baseBindingAdapter;
        }
        adapter.setItemBinding(itemBinding);
        if (diffConfig == null || items == null) {
            if (items == null) {
                items = CollectionsKt__CollectionsKt.emptyList();
            }
            adapter.setDataList(items);
        } else {
            Object tag = recyclerView.getTag(gsi.u0);
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.recyclerview.diff.AsyncDiffObservableList<T of com.xiaomi.fitness.baseui.recyclerview.adapter.BindingAdapters.setAdapter>");
            ((AsyncDiffObservableList) tag).update(items);
        }
        adapter.setViewHolderFactory(viewHolderFactory);
        if (baseBindingAdapter != adapter) {
            recyclerView.setAdapter(adapter);
        }
    }

    public static /* synthetic */ void setAdapter$default(RecyclerView recyclerView, ItemBinding itemBinding, List list, BaseBindingAdapter baseBindingAdapter, Function2 function2, c cVar, int i, Object obj) {
        if ((i & 32) != 0) {
            cVar = null;
        }
        setAdapter(recyclerView, itemBinding, list, baseBindingAdapter, function2, cVar);
    }

    @JvmStatic
    @NotNull
    public static final <T> c<T> toAsyncDifferConfig(@NotNull h.f<T> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        c<T> cVarA = new c.a(callback).a();
        Intrinsics.checkNotNullExpressionValue(cVarA, "build(...)");
        return cVarA;
    }

    @JvmStatic
    @NotNull
    public static final <T> ItemBinding<T> toItemBinding(@NotNull OnItemBind<T> onItemBind) {
        Intrinsics.checkNotNullParameter(onItemBind, "onItemBind");
        return ItemBinding.INSTANCE.of(onItemBind);
    }
}
