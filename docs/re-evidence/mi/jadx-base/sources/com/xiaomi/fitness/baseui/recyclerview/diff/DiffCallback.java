package com.xiaomi.fitness.baseui.recyclerview.diff;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/diff/DiffCallback;", "T", "", "areItemsTheSame", "", "oldItem", "newItem", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "areContentsTheSame", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DiffCallback<T> {
    boolean areContentsTheSame(T oldItem, T newItem);

    boolean areItemsTheSame(T oldItem, T newItem);
}
