package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.eri;
import defpackage.jui;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0016\u0017B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\u00122\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmBaseItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmBaseItemAdapter$SleepRhythmBaseItemViewHolder;", "dataList", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmBaseItemAdapter$SleepRhythmBaseItem;", "<init>", "(Ljava/util/List;)V", "getDataList", "()Ljava/util/List;", "setDataList", "getItemCount", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "updateDataList", "SleepRhythmBaseItem", "SleepRhythmBaseItemViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepRhythmBaseItemAdapter extends RecyclerView.Adapter<SleepRhythmBaseItemViewHolder> {

    @NotNull
    private List<SleepRhythmBaseItem> dataList;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmBaseItemAdapter$SleepRhythmBaseItem;", "", MiuiCursorConstants.CONTENT, "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getDescription", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SleepRhythmBaseItem {

        @NotNull
        private final String content;

        @NotNull
        private final String description;

        public SleepRhythmBaseItem(@NotNull String content, @NotNull String description) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(description, "description");
            this.content = content;
            this.description = description;
        }

        public static /* synthetic */ SleepRhythmBaseItem copy$default(SleepRhythmBaseItem sleepRhythmBaseItem, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sleepRhythmBaseItem.content;
            }
            if ((i & 2) != 0) {
                str2 = sleepRhythmBaseItem.description;
            }
            return sleepRhythmBaseItem.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final SleepRhythmBaseItem copy(@NotNull String content, @NotNull String description) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(description, "description");
            return new SleepRhythmBaseItem(content, description);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SleepRhythmBaseItem)) {
                return false;
            }
            SleepRhythmBaseItem sleepRhythmBaseItem = (SleepRhythmBaseItem) other;
            return Intrinsics.areEqual(this.content, sleepRhythmBaseItem.content) && Intrinsics.areEqual(this.description, sleepRhythmBaseItem.description);
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        public int hashCode() {
            return (this.content.hashCode() * 31) + this.description.hashCode();
        }

        @NotNull
        public String toString() {
            return "SleepRhythmBaseItem(content=" + this.content + ", description=" + this.description + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmBaseItemAdapter$SleepRhythmBaseItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmBaseItemAdapter$SleepRhythmBaseItem;", "item", "", "bindData", "(Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmBaseItemAdapter$SleepRhythmBaseItem;)V", "Landroid/widget/TextView;", "contentTV", "Landroid/widget/TextView;", "descriptionTV", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmBaseItemAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class SleepRhythmBaseItemViewHolder extends RecyclerView.d0 {

        @Nullable
        private TextView contentTV;

        @Nullable
        private TextView descriptionTV;
        final /* synthetic */ SleepRhythmBaseItemAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SleepRhythmBaseItemViewHolder(@NotNull SleepRhythmBaseItemAdapter sleepRhythmBaseItemAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sleepRhythmBaseItemAdapter;
            this.contentTV = (TextView) itemView.findViewById(eri.k8);
            this.descriptionTV = (TextView) itemView.findViewById(eri.m8);
        }

        public final void bindData(@NotNull SleepRhythmBaseItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            TextView textView = this.contentTV;
            Intrinsics.checkNotNull(textView);
            textView.setText(item.getContent());
            String description = item.getDescription();
            if (description == null || description.length() == 0) {
                TextView textView2 = this.descriptionTV;
                Intrinsics.checkNotNull(textView2);
                ExtUtilKt.gone(textView2);
            } else {
                TextView textView3 = this.descriptionTV;
                Intrinsics.checkNotNull(textView3);
                ExtUtilKt.visible(textView3);
                TextView textView4 = this.descriptionTV;
                Intrinsics.checkNotNull(textView4);
                textView4.setText(item.getDescription());
            }
        }
    }

    public SleepRhythmBaseItemAdapter(@NotNull List<SleepRhythmBaseItem> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
    }

    @NotNull
    public final List<SleepRhythmBaseItem> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    public final void setDataList(@NotNull List<SleepRhythmBaseItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void updateDataList(@NotNull List<SleepRhythmBaseItem> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList.clear();
        this.dataList.addAll(dataList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SleepRhythmBaseItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.dataList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SleepRhythmBaseItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.q5, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new SleepRhythmBaseItemViewHolder(this, viewInflate);
    }
}
