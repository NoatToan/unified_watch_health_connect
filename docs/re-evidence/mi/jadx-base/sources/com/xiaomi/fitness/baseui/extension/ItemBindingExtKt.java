package com.xiaomi.fitness.baseui.extension;

import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBindClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0086\b\u001as\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00062U\b\b\u0010\u0007\u001aO\u0012\u001b\u0012\u0019\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\bH\u0086\bø\u0001\u0000\u001a\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0010H\u0086\b\u001a3\u0010\u0011\u001a\u00020\u000e\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0006*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0086\b\u001a{\u0010\u0011\u001a\u00020\u000e\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0006*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00122U\b\b\u0010\u0013\u001aO\u0012\u001b\u0012\u0019\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"itemBindingOf", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "T", "variableId", "", "layoutRes", "", "block", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "itemBinding", "position", "item", "", "toItemBinding", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/OnItemBind;", "map", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/OnItemBindClass;", "onItemBind", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ItemBindingExtKt {
    @NotNull
    public static final <T> ItemBinding<T> itemBindingOf(int i, int i2) {
        return ItemBinding.INSTANCE.of(i, i2);
    }

    public static final /* synthetic */ <T> void map(OnItemBindClass<? super T> onItemBindClass, int i, int i2) {
        Intrinsics.checkNotNullParameter(onItemBindClass, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        onItemBindClass.map(Reflection.getOrCreateKotlinClass(Object.class), i, i2);
    }

    @NotNull
    public static final <T> ItemBinding<T> toItemBinding(@NotNull OnItemBind<T> onItemBind) {
        Intrinsics.checkNotNullParameter(onItemBind, "<this>");
        return ItemBinding.INSTANCE.of(onItemBind);
    }

    @NotNull
    public static final <T> ItemBinding<T> itemBindingOf(@NotNull final Function3<? super ItemBinding<? super T>, ? super Integer, ? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return ItemBinding.INSTANCE.of(new OnItemBind<T>() { // from class: com.xiaomi.fitness.baseui.extension.ItemBindingExtKt.itemBindingOf.1
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<T> itemBinding, int position, T item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                block.invoke(itemBinding, Integer.valueOf(position), item);
            }
        });
    }

    public static final /* synthetic */ <T> void map(OnItemBindClass<? super T> onItemBindClass, final Function3<? super ItemBinding<? super T>, ? super Integer, ? super T, Unit> onItemBind) {
        Intrinsics.checkNotNullParameter(onItemBindClass, "<this>");
        Intrinsics.checkNotNullParameter(onItemBind, "onItemBind");
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass<E> orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.needClassReification();
        onItemBindClass.map(orCreateKotlinClass, new OnItemBind<T>() { // from class: com.xiaomi.fitness.baseui.extension.ItemBindingExtKt.map.1
            @Override // com.xiaomi.fitness.baseui.recyclerview.itembindings.OnItemBind
            public void onItemBind(ItemBinding<T> itemBinding, int position, T item) {
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                Intrinsics.checkNotNullParameter(item, "item");
                onItemBind.invoke(itemBinding, Integer.valueOf(position), item);
            }
        });
    }
}
