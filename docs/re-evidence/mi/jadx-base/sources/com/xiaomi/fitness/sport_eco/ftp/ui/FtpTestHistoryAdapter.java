package com.xiaomi.fitness.sport_eco.ftp.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.sport_eco.ftp.request.FtpModel;
import defpackage.fvi;
import defpackage.zri;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u0007\u001a\u00020\u00062\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestHistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/xiaomi/fitness/sport_eco/ftp/request/FtpModel$FtpData;", "items", "", "setDatas", "(Ljava/util/List;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "mItems", "Ljava/util/List;", "<init>", "()V", "HistoryItemHolder", "TagHolder", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FtpTestHistoryAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @Nullable
    private List<FtpModel.FtpData> mItems;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestHistoryAdapter$HistoryItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "sport_level_txt", "Landroid/widget/TextView;", "getSport_level_txt", "()Landroid/widget/TextView;", "setSport_level_txt", "(Landroid/widget/TextView;)V", "sport_time_txt", "getSport_time_txt", "setSport_time_txt", "sport_value_txt", "getSport_value_txt", "setSport_value_txt", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class HistoryItemHolder extends RecyclerView.d0 {

        @NotNull
        private TextView sport_level_txt;

        @NotNull
        private TextView sport_time_txt;

        @NotNull
        private TextView sport_value_txt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HistoryItemHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(zri.u2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.sport_level_txt = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(zri.B2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.sport_time_txt = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(zri.C2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.sport_value_txt = (TextView) viewFindViewById3;
        }

        @NotNull
        public final TextView getSport_level_txt() {
            return this.sport_level_txt;
        }

        @NotNull
        public final TextView getSport_time_txt() {
            return this.sport_time_txt;
        }

        @NotNull
        public final TextView getSport_value_txt() {
            return this.sport_value_txt;
        }

        public final void setSport_level_txt(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.sport_level_txt = textView;
        }

        public final void setSport_time_txt(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.sport_time_txt = textView;
        }

        public final void setSport_value_txt(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.sport_value_txt = textView;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/ui/FtpTestHistoryAdapter$TagHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "sport_year", "Landroid/widget/TextView;", "getSport_year", "()Landroid/widget/TextView;", "setSport_year", "(Landroid/widget/TextView;)V", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class TagHolder extends RecyclerView.d0 {

        @NotNull
        private TextView sport_year;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TagHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(zri.D2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.sport_year = (TextView) viewFindViewById;
        }

        @NotNull
        public final TextView getSport_year() {
            return this.sport_year;
        }

        public final void setSport_year(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.sport_year = textView;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (ArrayUtils.isEmpty(this.mItems)) {
            return 0;
        }
        List<FtpModel.FtpData> list = this.mItems;
        Intrinsics.checkNotNull(list);
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        List<FtpModel.FtpData> list = this.mItems;
        Intrinsics.checkNotNull(list);
        FtpModel.FtpData ftpData = list.get(position);
        Intrinsics.checkNotNull(ftpData);
        return ftpData.getType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof TagHolder) {
            List<FtpModel.FtpData> list = this.mItems;
            Intrinsics.checkNotNull(list);
            FtpModel.FtpData ftpData = list.get(position);
            TextView sport_year = ((TagHolder) holder).getSport_year();
            Intrinsics.checkNotNull(ftpData);
            sport_year.setText(ftpData.getDisplayYear());
            return;
        }
        if (holder instanceof HistoryItemHolder) {
            List<FtpModel.FtpData> list2 = this.mItems;
            Intrinsics.checkNotNull(list2);
            FtpModel.FtpData ftpData2 = list2.get(position);
            HistoryItemHolder historyItemHolder = (HistoryItemHolder) holder;
            TextView sport_level_txt = historyItemHolder.getSport_level_txt();
            Intrinsics.checkNotNull(ftpData2);
            sport_level_txt.setText(ftpData2.getDisplaylevel());
            historyItemHolder.getSport_time_txt().setText(ftpData2.getDisplayTime());
            historyItemHolder.getSport_value_txt().setText(ftpData2.getDisplayScore());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(fvi.k0, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new TagHolder(viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(fvi.j0, parent, false);
        Intrinsics.checkNotNull(viewInflate2);
        return new HistoryItemHolder(viewInflate2);
    }

    public final void setDatas(@Nullable List<FtpModel.FtpData> items) {
        this.mItems = items;
        notifyDataSetChanged();
    }
}
