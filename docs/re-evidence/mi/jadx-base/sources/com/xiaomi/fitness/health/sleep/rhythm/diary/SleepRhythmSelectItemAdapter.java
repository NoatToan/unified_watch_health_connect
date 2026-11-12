package com.xiaomi.fitness.health.sleep.rhythm.diary;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.health.sleep.rhythm.diary.SleepRhythmSelectItemAdapter;
import defpackage.eri;
import defpackage.jui;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003\u001d\u001e\u001fB!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u001c\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\u0015\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u001cR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepRhythmSelectItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepRhythmSelectItemAdapter$SleepRhythmSelectItemViewHolder;", "dataList", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepRhythmSelectItemAdapter$SleepRhythmSelectItem;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepRhythmSelectItemAdapter$OnSleepItemSelectListener;", "<init>", "(Ljava/util/List;Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepRhythmSelectItemAdapter$OnSleepItemSelectListener;)V", "getDataList", "()Ljava/util/List;", "getListener", "()Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepRhythmSelectItemAdapter$OnSleepItemSelectListener;", "setListener", "(Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepRhythmSelectItemAdapter$OnSleepItemSelectListener;)V", "getItemCount", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "onSelect", "value", "(Ljava/lang/Integer;)V", "SleepRhythmSelectItemViewHolder", "SleepRhythmSelectItem", "OnSleepItemSelectListener", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepRhythmSelectItemAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmSelectItemAdapter.kt\ncom/xiaomi/fitness/health/sleep/rhythm/diary/SleepRhythmSelectItemAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1872#2,3:72\n*S KotlinDebug\n*F\n+ 1 SleepRhythmSelectItemAdapter.kt\ncom/xiaomi/fitness/health/sleep/rhythm/diary/SleepRhythmSelectItemAdapter\n*L\n56#1:72,3\n*E\n"})
public final class SleepRhythmSelectItemAdapter extends RecyclerView.Adapter<SleepRhythmSelectItemViewHolder> {

    @NotNull
    private final List<SleepRhythmSelectItem> dataList;

    @Nullable
    private OnSleepItemSelectListener listener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepRhythmSelectItemAdapter$OnSleepItemSelectListener;", "", "onItemSelect", "", "index", "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepRhythmSelectItemAdapter$SleepRhythmSelectItem;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnSleepItemSelectListener {
        void onItemSelect(@NotNull SleepRhythmSelectItem index);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepRhythmSelectItemAdapter$SleepRhythmSelectItem;", "", "index", "", "value", "isSelect", "", "<init>", "(IIZ)V", "getIndex", "()I", "getValue", "()Z", "setSelect", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SleepRhythmSelectItem {
        private final int index;
        private boolean isSelect;
        private final int value;

        public SleepRhythmSelectItem(int i, int i2, boolean z) {
            this.index = i;
            this.value = i2;
            this.isSelect = z;
        }

        public static /* synthetic */ SleepRhythmSelectItem copy$default(SleepRhythmSelectItem sleepRhythmSelectItem, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = sleepRhythmSelectItem.index;
            }
            if ((i3 & 2) != 0) {
                i2 = sleepRhythmSelectItem.value;
            }
            if ((i3 & 4) != 0) {
                z = sleepRhythmSelectItem.isSelect;
            }
            return sleepRhythmSelectItem.copy(i, i2, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsSelect() {
            return this.isSelect;
        }

        @NotNull
        public final SleepRhythmSelectItem copy(int index, int value, boolean isSelect) {
            return new SleepRhythmSelectItem(index, value, isSelect);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SleepRhythmSelectItem)) {
                return false;
            }
            SleepRhythmSelectItem sleepRhythmSelectItem = (SleepRhythmSelectItem) other;
            return this.index == sleepRhythmSelectItem.index && this.value == sleepRhythmSelectItem.value && this.isSelect == sleepRhythmSelectItem.isSelect;
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.index) * 31) + Integer.hashCode(this.value)) * 31) + Boolean.hashCode(this.isSelect);
        }

        public final boolean isSelect() {
            return this.isSelect;
        }

        public final void setSelect(boolean z) {
            this.isSelect = z;
        }

        @NotNull
        public String toString() {
            return "SleepRhythmSelectItem(index=" + this.index + ", value=" + this.value + ", isSelect=" + this.isSelect + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepRhythmSelectItemAdapter$SleepRhythmSelectItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepRhythmSelectItemAdapter$SleepRhythmSelectItem;", "item", "", "bindData", "(Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepRhythmSelectItemAdapter$SleepRhythmSelectItem;)V", "Landroid/widget/TextView;", "contentTV", "Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepRhythmSelectItemAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class SleepRhythmSelectItemViewHolder extends RecyclerView.d0 {

        @Nullable
        private TextView contentTV;
        final /* synthetic */ SleepRhythmSelectItemAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SleepRhythmSelectItemViewHolder(@NotNull SleepRhythmSelectItemAdapter sleepRhythmSelectItemAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sleepRhythmSelectItemAdapter;
            this.contentTV = (TextView) itemView.findViewById(eri.Ag);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$0(SleepRhythmSelectItemAdapter this$0, SleepRhythmSelectItem item, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(item, "$item");
            this$0.onSelect(Integer.valueOf(item.getValue()));
            OnSleepItemSelectListener listener = this$0.getListener();
            if (listener != null) {
                listener.onItemSelect(item);
            }
        }

        public final void bindData(@NotNull final SleepRhythmSelectItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            TextView textView = this.contentTV;
            Intrinsics.checkNotNull(textView);
            textView.setText(String.valueOf(item.getValue()));
            TextView textView2 = this.contentTV;
            Intrinsics.checkNotNull(textView2);
            textView2.setSelected(item.isSelect());
            View view = this.itemView;
            final SleepRhythmSelectItemAdapter sleepRhythmSelectItemAdapter = this.this$0;
            view.setOnClickListener(new View.OnClickListener() { // from class: ovm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SleepRhythmSelectItemAdapter.SleepRhythmSelectItemViewHolder.bindData$lambda$0(sleepRhythmSelectItemAdapter, item, view2);
                }
            });
        }
    }

    public /* synthetic */ SleepRhythmSelectItemAdapter(List list, OnSleepItemSelectListener onSleepItemSelectListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : onSleepItemSelectListener);
    }

    @NotNull
    public final List<SleepRhythmSelectItem> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    @Nullable
    public final OnSleepItemSelectListener getListener() {
        return this.listener;
    }

    public final void onSelect(@Nullable Integer value) {
        if (value == null) {
            return;
        }
        int i = 0;
        for (Object obj : this.dataList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            SleepRhythmSelectItem sleepRhythmSelectItem = (SleepRhythmSelectItem) obj;
            if (i == value.intValue() - 1) {
                sleepRhythmSelectItem.setSelect(!sleepRhythmSelectItem.isSelect());
            } else {
                sleepRhythmSelectItem.setSelect(false);
            }
            i = i2;
        }
        notifyDataSetChanged();
    }

    public final void setListener(@Nullable OnSleepItemSelectListener onSleepItemSelectListener) {
        this.listener = onSleepItemSelectListener;
    }

    public SleepRhythmSelectItemAdapter(@NotNull List<SleepRhythmSelectItem> dataList, @Nullable OnSleepItemSelectListener onSleepItemSelectListener) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
        this.listener = onSleepItemSelectListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SleepRhythmSelectItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.dataList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SleepRhythmSelectItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.z5, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new SleepRhythmSelectItemViewHolder(this, viewInflate);
    }
}
