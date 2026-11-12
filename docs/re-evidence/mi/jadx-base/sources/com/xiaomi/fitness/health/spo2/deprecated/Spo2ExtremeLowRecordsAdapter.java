package com.xiaomi.fitness.health.spo2.deprecated;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.AbnormalItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.spo2.deprecated.Spo2ExtremeLowRecordsAdapter;
import defpackage.eri;
import defpackage.jui;
import defpackage.uv6;
import defpackage.xr5;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/spo2/deprecated/Spo2ExtremeLowRecordsAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "Lcom/xiaomi/fitness/health/spo2/deprecated/Spo2ExtremeLowRecordsAdapter$AllRecordsHolder;", "<init>", "()V", "onItemClickListener", "Lcom/xiaomi/fitness/health/spo2/deprecated/Spo2ExtremeLowRecordsAdapter$OnItemClickListener;", "setOnItemClickListener", "", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClickListener", "AllRecordsHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpo2ExtremeLowRecordsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spo2ExtremeLowRecordsAdapter.kt\ncom/xiaomi/fitness/health/spo2/deprecated/Spo2ExtremeLowRecordsAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1971#2,14:64\n2341#2,14:78\n1#3:92\n*S KotlinDebug\n*F\n+ 1 Spo2ExtremeLowRecordsAdapter.kt\ncom/xiaomi/fitness/health/spo2/deprecated/Spo2ExtremeLowRecordsAdapter\n*L\n39#1:64,14\n40#1:78,14\n*E\n"})
public final class Spo2ExtremeLowRecordsAdapter extends PagingDataAdapter<SegmentItem, AllRecordsHolder> {

    @Nullable
    private OnItemClickListener onItemClickListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/health/spo2/deprecated/Spo2ExtremeLowRecordsAdapter$AllRecordsHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "tvValue", "Landroid/widget/TextView;", "getTvValue", "()Landroid/widget/TextView;", "setTvValue", "(Landroid/widget/TextView;)V", "tvRecordTime", "getTvRecordTime", "setTvRecordTime", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AllRecordsHolder extends RecyclerView.d0 {

        @NotNull
        private TextView tvRecordTime;

        @NotNull
        private TextView tvValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AllRecordsHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(eri.qn);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.tvValue = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(eri.im);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.tvRecordTime = (TextView) viewFindViewById2;
        }

        @NotNull
        public final TextView getTvRecordTime() {
            return this.tvRecordTime;
        }

        @NotNull
        public final TextView getTvValue() {
            return this.tvValue;
        }

        public final void setTvRecordTime(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.tvRecordTime = textView;
        }

        public final void setTvValue(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.tvValue = textView;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/health/spo2/deprecated/Spo2ExtremeLowRecordsAdapter$OnItemClickListener;", "", "onClick", "", "item", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onClick(@NotNull SegmentItem item);
    }

    public Spo2ExtremeLowRecordsAdapter() {
        super(new uv6(), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$3(Spo2ExtremeLowRecordsAdapter this$0, SegmentItem spo2ExtremeLowRecord, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(spo2ExtremeLowRecord, "$spo2ExtremeLowRecord");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener == null || onItemClickListener == null) {
            return;
        }
        onItemClickListener.onClick(spo2ExtremeLowRecord);
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener onItemClickListener) {
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.onItemClickListener = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull AllRecordsHolder holder, int position) {
        List<AbnormalItem> items;
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        final SegmentItem item = getItem(position);
        if (item == null || (items = item.getItems()) == null) {
            return;
        }
        List<AbnormalItem> list = items;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int value = ((AbnormalItem) next).getValue();
                do {
                    Object next3 = it.next();
                    int value2 = ((AbnormalItem) next3).getValue();
                    if (value < value2) {
                        next = next3;
                        value = value2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        AbnormalItem abnormalItem = (AbnormalItem) next;
        Integer numValueOf = abnormalItem != null ? Integer.valueOf(abnormalItem.getValue()) : null;
        Iterator<T> it2 = list.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                int value3 = ((AbnormalItem) next2).getValue();
                do {
                    Object next4 = it2.next();
                    int value4 = ((AbnormalItem) next4).getValue();
                    if (value3 > value4) {
                        next2 = next4;
                        value3 = value4;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        AbnormalItem abnormalItem2 = (AbnormalItem) next2;
        String str = (abnormalItem2 != null ? Integer.valueOf(abnormalItem2.getValue()) : null) + "-" + (numValueOf != null ? xr5.h(numValueOf.intValue()) : null);
        String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(item.getStartTime() * ((long) 1000));
        holder.getTvValue().setText(str);
        holder.getTvRecordTime().setText(dateYYYYMMddLocalFormat);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: y7n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Spo2ExtremeLowRecordsAdapter.onBindViewHolder$lambda$3(this.f39898a, item, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public AllRecordsHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.h6, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new AllRecordsHolder(viewInflate);
    }
}
