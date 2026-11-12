package com.xiaomi.fitness.health.spo2.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import defpackage.eri;
import defpackage.jui;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001a\u001b\u001c\u001dB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0007\u001a\u00020\u00062\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/health/spo2/recycler/Spo2RecordDetailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/xiaomi/fitness/health/spo2/recycler/Spo2RecordDetailAdapter$DetailItem;", "detailItems", "", "setDetailItems", "(Ljava/util/List;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "Ljava/util/List;", "<init>", "()V", "RecordDetailHolder", "DividerHolder", "SubtitleHolder", "DetailItem", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class Spo2RecordDetailAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @Nullable
    private List<DetailItem> detailItems;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/health/spo2/recycler/Spo2RecordDetailAdapter$DividerHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DividerHolder extends RecyclerView.d0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DividerHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/health/spo2/recycler/Spo2RecordDetailAdapter$RecordDetailHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "mTvLeft", "Landroid/widget/TextView;", "getMTvLeft", "()Landroid/widget/TextView;", "setMTvLeft", "(Landroid/widget/TextView;)V", "mTvRight", "getMTvRight", "setMTvRight", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class RecordDetailHolder extends RecyclerView.d0 {

        @NotNull
        private TextView mTvLeft;

        @NotNull
        private TextView mTvRight;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecordDetailHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(eri.Cl);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.mTvLeft = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(eri.nm);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.mTvRight = (TextView) viewFindViewById2;
        }

        @NotNull
        public final TextView getMTvLeft() {
            return this.mTvLeft;
        }

        @NotNull
        public final TextView getMTvRight() {
            return this.mTvRight;
        }

        public final void setMTvLeft(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.mTvLeft = textView;
        }

        public final void setMTvRight(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.mTvRight = textView;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/health/spo2/recycler/Spo2RecordDetailAdapter$SubtitleHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "subtitleTextView", "Landroid/widget/TextView;", "getSubtitleTextView", "()Landroid/widget/TextView;", "setSubtitleTextView", "(Landroid/widget/TextView;)V", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class SubtitleHolder extends RecyclerView.d0 {

        @NotNull
        private TextView subtitleTextView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubtitleHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(eri.xh);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.subtitleTextView = (TextView) viewFindViewById;
        }

        @NotNull
        public final TextView getSubtitleTextView() {
            return this.subtitleTextView;
        }

        public final void setSubtitleTextView(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.subtitleTextView = textView;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (ArrayUtils.isEmpty(this.detailItems)) {
            return 0;
        }
        List<DetailItem> list = this.detailItems;
        Intrinsics.checkNotNull(list);
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        List<DetailItem> list = this.detailItems;
        Intrinsics.checkNotNull(list);
        DetailItem detailItem = list.get(position);
        Intrinsics.checkNotNull(detailItem);
        return detailItem.getType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof RecordDetailHolder) {
            List<DetailItem> list = this.detailItems;
            Intrinsics.checkNotNull(list);
            DetailItem detailItem = list.get(position);
            RecordDetailHolder recordDetailHolder = (RecordDetailHolder) holder;
            TextView mTvLeft = recordDetailHolder.getMTvLeft();
            Intrinsics.checkNotNull(detailItem);
            mTvLeft.setText(detailItem.getLeftStr());
            recordDetailHolder.getMTvRight().setText(detailItem.getRightStr());
            return;
        }
        if (holder instanceof SubtitleHolder) {
            List<DetailItem> list2 = this.detailItems;
            Intrinsics.checkNotNull(list2);
            DetailItem detailItem2 = list2.get(position);
            TextView subtitleTextView = ((SubtitleHolder) holder).getSubtitleTextView();
            Intrinsics.checkNotNull(detailItem2);
            subtitleTextView.setText(detailItem2.getSubtitle());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.j6, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new RecordDetailHolder(viewInflate);
        }
        if (viewType != 1) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(jui.E5, parent, false);
            Intrinsics.checkNotNull(viewInflate2);
            return new SubtitleHolder(viewInflate2);
        }
        View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(jui.k6, parent, false);
        Intrinsics.checkNotNull(viewInflate3);
        return new DividerHolder(viewInflate3);
    }

    public final void setDetailItems(@Nullable List<DetailItem> detailItems) {
        this.detailItems = detailItems;
        notifyDataSetChanged();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u000bR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/spo2/recycler/Spo2RecordDetailAdapter$DetailItem;", "Ljava/io/Serializable;", "leftStr", "", "rightStr", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "type", "", "(I)V", Column.SUBTITLE, "(Ljava/lang/String;)V", "value", "getLeftStr", "()Ljava/lang/String;", "getRightStr", "getType", "()I", "getSubtitle", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DetailItem implements Serializable {
        public static final int TYPE_DATA = 0;
        public static final int TYPE_DIVIDER = 1;
        public static final int TYPE_SUBTITLE = 2;

        @Nullable
        private String leftStr;

        @Nullable
        private String rightStr;

        @Nullable
        private String subtitle;
        private int type;

        public DetailItem(@Nullable String str, @Nullable String str2) {
            this.leftStr = str;
            this.rightStr = str2;
        }

        @Nullable
        public final String getLeftStr() {
            return this.leftStr;
        }

        @Nullable
        public final String getRightStr() {
            return this.rightStr;
        }

        @Nullable
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final int getType() {
            return this.type;
        }

        public DetailItem(int i) {
            this.type = i;
        }

        public DetailItem(@NotNull String subtitle) {
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.subtitle = subtitle;
            this.type = 2;
        }
    }
}
