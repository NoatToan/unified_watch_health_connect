package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.eri;
import defpackage.jui;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0016\u0017B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\u00122\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmBaseItemListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmBaseItemListAdapter$SleepRhythmBaseItemViewHolder;", "dataList", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmBaseItemListAdapter$SleepRhythmBaseListItem;", "<init>", "(Ljava/util/List;)V", "getDataList", "()Ljava/util/List;", "setDataList", "getItemCount", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "updateDataList", "SleepRhythmBaseListItem", "SleepRhythmBaseItemViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepRhythmBaseItemListAdapter extends RecyclerView.Adapter<SleepRhythmBaseItemViewHolder> {

    @NotNull
    private List<SleepRhythmBaseListItem> dataList;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmBaseItemListAdapter$SleepRhythmBaseItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmBaseItemListAdapter$SleepRhythmBaseListItem;", "item", "", "bindData", "(Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmBaseItemListAdapter$SleepRhythmBaseListItem;)V", "Landroid/widget/TextView;", "line1TV", "Landroid/widget/TextView;", "line2TV", "line3TV", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmBaseItemListAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class SleepRhythmBaseItemViewHolder extends RecyclerView.d0 {

        @Nullable
        private TextView line1TV;

        @Nullable
        private TextView line2TV;

        @Nullable
        private TextView line3TV;
        final /* synthetic */ SleepRhythmBaseItemListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SleepRhythmBaseItemViewHolder(@NotNull SleepRhythmBaseItemListAdapter sleepRhythmBaseItemListAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sleepRhythmBaseItemListAdapter;
            this.line1TV = (TextView) itemView.findViewById(eri.n8);
            this.line2TV = (TextView) itemView.findViewById(eri.o8);
            this.line3TV = (TextView) itemView.findViewById(eri.p8);
        }

        public final void bindData(@NotNull SleepRhythmBaseListItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            TextView textView = this.line1TV;
            Intrinsics.checkNotNull(textView);
            textView.setText(item.getContent1());
            String content2 = item.getContent2();
            if (content2 == null || content2.length() == 0) {
                TextView textView2 = this.line2TV;
                Intrinsics.checkNotNull(textView2);
                ExtUtilKt.gone(textView2);
            } else {
                TextView textView3 = this.line2TV;
                Intrinsics.checkNotNull(textView3);
                ExtUtilKt.visible(textView3);
                TextView textView4 = this.line2TV;
                Intrinsics.checkNotNull(textView4);
                textView4.setText(item.getContent2());
            }
            String content3 = item.getContent3();
            if (content3 == null || content3.length() == 0) {
                TextView textView5 = this.line3TV;
                Intrinsics.checkNotNull(textView5);
                ExtUtilKt.gone(textView5);
            } else {
                TextView textView6 = this.line3TV;
                Intrinsics.checkNotNull(textView6);
                ExtUtilKt.visible(textView6);
                TextView textView7 = this.line3TV;
                Intrinsics.checkNotNull(textView7);
                textView7.setText(item.getContent3());
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmBaseItemListAdapter$SleepRhythmBaseListItem;", "", "content1", "", "content2", "content3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent1", "()Ljava/lang/String;", "getContent2", "getContent3", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SleepRhythmBaseListItem {

        @NotNull
        private final String content1;

        @Nullable
        private final String content2;

        @Nullable
        private final String content3;

        public SleepRhythmBaseListItem(@NotNull String content1, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(content1, "content1");
            this.content1 = content1;
            this.content2 = str;
            this.content3 = str2;
        }

        public static /* synthetic */ SleepRhythmBaseListItem copy$default(SleepRhythmBaseListItem sleepRhythmBaseListItem, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sleepRhythmBaseListItem.content1;
            }
            if ((i & 2) != 0) {
                str2 = sleepRhythmBaseListItem.content2;
            }
            if ((i & 4) != 0) {
                str3 = sleepRhythmBaseListItem.content3;
            }
            return sleepRhythmBaseListItem.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContent1() {
            return this.content1;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getContent2() {
            return this.content2;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getContent3() {
            return this.content3;
        }

        @NotNull
        public final SleepRhythmBaseListItem copy(@NotNull String content1, @Nullable String content2, @Nullable String content3) {
            Intrinsics.checkNotNullParameter(content1, "content1");
            return new SleepRhythmBaseListItem(content1, content2, content3);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SleepRhythmBaseListItem)) {
                return false;
            }
            SleepRhythmBaseListItem sleepRhythmBaseListItem = (SleepRhythmBaseListItem) other;
            return Intrinsics.areEqual(this.content1, sleepRhythmBaseListItem.content1) && Intrinsics.areEqual(this.content2, sleepRhythmBaseListItem.content2) && Intrinsics.areEqual(this.content3, sleepRhythmBaseListItem.content3);
        }

        @NotNull
        public final String getContent1() {
            return this.content1;
        }

        @Nullable
        public final String getContent2() {
            return this.content2;
        }

        @Nullable
        public final String getContent3() {
            return this.content3;
        }

        public int hashCode() {
            int iHashCode = this.content1.hashCode() * 31;
            String str = this.content2;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.content3;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SleepRhythmBaseListItem(content1=" + this.content1 + ", content2=" + this.content2 + ", content3=" + this.content3 + ")";
        }
    }

    public SleepRhythmBaseItemListAdapter(@NotNull List<SleepRhythmBaseListItem> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
    }

    @NotNull
    public final List<SleepRhythmBaseListItem> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    public final void setDataList(@NotNull List<SleepRhythmBaseListItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void updateDataList(@NotNull List<SleepRhythmBaseListItem> dataList) {
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
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.r5, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new SleepRhythmBaseItemViewHolder(this, viewInflate);
    }
}
