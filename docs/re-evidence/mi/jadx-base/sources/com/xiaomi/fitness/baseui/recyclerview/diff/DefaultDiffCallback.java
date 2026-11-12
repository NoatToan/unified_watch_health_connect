package com.xiaomi.fitness.baseui.recyclerview.diff;

import androidx.recyclerview.widget.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\b\u00028\u00002\b\u0010\u0004\u001a\u0004\b\u00028\u0000H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\b\u00028\u00002\b\u0010\u0004\u001a\u0004\b\u00028\u0000H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u0082\u0002\u0004\n\u0002\b9¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/diff/DefaultDiffCallback;", "T", "Landroidx/recyclerview/widget/h$f;", "oldItem", "newItem", "", "areItemsTheSame", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "areContentsTheSame", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 0, 0})
public final class DefaultDiffCallback<T> extends h.f<T> {
    @Override // androidx.recyclerview.widget.h.f
    public boolean areContentsTheSame(@NotNull T oldItem, @NotNull T newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem, newItem) && oldItem.hashCode() == newItem.hashCode();
    }

    @Override // androidx.recyclerview.widget.h.f
    public boolean areItemsTheSame(@NotNull T oldItem, @NotNull T newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem, newItem) && oldItem.hashCode() == newItem.hashCode();
    }
}
