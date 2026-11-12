package com.xiaomi.fitness.chart.barchart.diff;

import androidx.recyclerview.widget.h;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B#\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/chart/barchart/diff/BarChartDiffCallback;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "T", "Landroidx/recyclerview/widget/h$b;", "", "getOldListSize", "()I", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "(II)Z", "areContentsTheSame", "", "oldList", "Ljava/util/List;", "newList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "chart_release"}, k = 1, mv = {2, 0, 0})
public final class BarChartDiffCallback<T extends RecyclerBarEntry> extends h.b {

    @NotNull
    private final List<T> newList;

    @NotNull
    private final List<T> oldList;

    /* JADX WARN: Multi-variable type inference failed */
    public BarChartDiffCallback(@NotNull List<? extends T> oldList, @NotNull List<? extends T> newList) {
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        this.oldList = oldList;
        this.newList = newList;
    }

    @Override // androidx.recyclerview.widget.h.b
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return Intrinsics.areEqual(this.oldList.get(oldItemPosition), this.oldList.get(newItemPosition));
    }

    @Override // androidx.recyclerview.widget.h.b
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return this.oldList.get(oldItemPosition).timestamp == this.newList.get(newItemPosition).timestamp;
    }

    @Override // androidx.recyclerview.widget.h.b
    public int getNewListSize() {
        return this.newList.size();
    }

    @Override // androidx.recyclerview.widget.h.b
    public int getOldListSize() {
        return this.oldList.size();
    }
}
