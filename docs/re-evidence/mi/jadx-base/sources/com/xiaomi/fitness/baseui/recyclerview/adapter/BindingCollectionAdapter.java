package com.xiaomi.fitness.baseui.recyclerview.adapter;

import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J7\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0012R \u0010\u0003\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BindingCollectionAdapter;", "T", "", "itemBinding", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "getItemBinding", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "setItemBinding", "(Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;)V", "onBindBinding", "", "binding", "Landroidx/databinding/ViewDataBinding;", "variableId", "", "layoutRes", "position", "item", "(Landroidx/databinding/ViewDataBinding;IIILjava/lang/Object;)V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface BindingCollectionAdapter<T> {
    @NotNull
    ItemBinding<? super T> getItemBinding();

    void onBindBinding(@NotNull ViewDataBinding binding, int variableId, int layoutRes, int position, T item);

    void setItemBinding(@NotNull ItemBinding<? super T> itemBinding);
}
