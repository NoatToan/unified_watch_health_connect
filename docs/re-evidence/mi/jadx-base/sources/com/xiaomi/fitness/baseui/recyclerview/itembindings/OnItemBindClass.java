package com.xiaomi.fitness.baseui.recyclerview.itembindings;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\rJ2\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\b\b\u0001\u0010\u000f*\u00028\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0003J\u0006\u0010\u0011\u001a\u00020\rJ+\u0010\u0010\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0002R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/OnItemBindClass;", "T", "", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/OnItemBind;", "<init>", "()V", "itemBindingClassList", "", "Lkotlin/reflect/KClass;", "itemBindingList", "map", "itemClass", "variableId", "", "layoutRes", "E", "onItemBind", "itemTypeCount", "", "itemBinding", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "position", "item", "(Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;ILjava/lang/Object;)V", "itemBind", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OnItemBindClass<T> implements OnItemBind<T> {

    @NotNull
    private final List<KClass<? extends T>> itemBindingClassList = new ArrayList(2);

    @NotNull
    private final List<OnItemBind<? extends T>> itemBindingList = new ArrayList(2);

    private final OnItemBind<T> itemBind(final int variableId, final int layoutRes) {
        return new OnItemBind<T>() { // from class: com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBindClass.itemBind.1
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<T> itemBinding, int position, T item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                itemBinding.set(variableId, layoutRes);
            }
        };
    }

    public final int itemTypeCount() {
        return this.itemBindingClassList.size();
    }

    @NotNull
    public final OnItemBindClass<T> map(@NotNull KClass<? extends T> itemClass, int variableId, int layoutRes) {
        Intrinsics.checkNotNullParameter(itemClass, "itemClass");
        int iIndexOf = this.itemBindingClassList.indexOf(itemClass);
        if (iIndexOf >= 0) {
            this.itemBindingList.set(iIndexOf, itemBind(variableId, layoutRes));
        } else {
            this.itemBindingClassList.add(itemClass);
            this.itemBindingList.add(itemBind(variableId, layoutRes));
        }
        return this;
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
    public void onItemBind(@NotNull ItemBinding<T> itemBinding, int position, @NotNull T item) {
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        Intrinsics.checkNotNullParameter(item, "item");
        int size = this.itemBindingClassList.size();
        for (int i = 0; i < size; i++) {
            if (this.itemBindingClassList.get(i).isInstance(item)) {
                OnItemBind<? extends T> onItemBind = this.itemBindingList.get(i);
                Intrinsics.checkNotNull(onItemBind, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind<T of com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBindClass>");
                onItemBind.onItemBind(itemBinding, position, item);
                return;
            }
        }
        throw new IllegalArgumentException("Missing class for item " + item);
    }

    @NotNull
    public final <E extends T> OnItemBindClass<T> map(@NotNull KClass<E> itemClass, @NotNull OnItemBind<E> onItemBind) {
        Intrinsics.checkNotNullParameter(itemClass, "itemClass");
        Intrinsics.checkNotNullParameter(onItemBind, "onItemBind");
        int iIndexOf = this.itemBindingClassList.indexOf(itemClass);
        if (iIndexOf >= 0) {
            this.itemBindingList.set(iIndexOf, onItemBind);
        } else {
            this.itemBindingClassList.add(itemClass);
            this.itemBindingList.add(onItemBind);
        }
        return this;
    }
}
