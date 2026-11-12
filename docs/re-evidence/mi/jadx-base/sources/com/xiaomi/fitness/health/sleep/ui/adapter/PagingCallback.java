package com.xiaomi.fitness.health.sleep.ui.adapter;

import androidx.recyclerview.widget.h;
import com.xiaomi.fit.fitness.export.data.ITimeData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/PagingCallback;", "Lcom/xiaomi/fit/fitness/export/data/ITimeData;", "T", "Landroidx/recyclerview/widget/h$f;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fit/fitness/export/data/ITimeData;Lcom/xiaomi/fit/fitness/export/data/ITimeData;)Z", "areContentsTheSame", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PagingCallback<T extends ITimeData> extends h.f<T> {
    @Override // androidx.recyclerview.widget.h.f
    public boolean areContentsTheSame(@NotNull T oldItem, @NotNull T newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.getTimestamp() == newItem.getTimestamp();
    }

    @Override // androidx.recyclerview.widget.h.f
    public boolean areItemsTheSame(@NotNull T oldItem, @NotNull T newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.getTimestamp() == newItem.getTimestamp();
    }
}
