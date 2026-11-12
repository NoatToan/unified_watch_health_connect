package com.xiaomi.fitness.sport.route.detail.recycler;

import android.R;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.route.detail.model.RankingListItem;
import com.xiaomi.fitness.sport.route.detail.util.RouteDetailExtKt;
import com.xiaomi.fitness.widget.view.DividerView;
import defpackage.dvi;
import defpackage.eoi;
import defpackage.xri;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\"#B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/recycler/RankingListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "ranking", "getRankingIconResId", "(I)Ljava/lang/Integer;", "Landroid/widget/TextView;", "rankingTv", "", "setRankingTv", "(Landroid/widget/TextView;I)V", "", "Lcom/xiaomi/fitness/sport/route/detail/model/RankingListItem;", "list", "updateDataList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "type", "I", "mDataList", "Ljava/util/List;", "<init>", "(I)V", "Companion", "ItemViewHolder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RankingListAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "RankingListAdapter";

    @NotNull
    private List<RankingListItem> mDataList = new ArrayList();
    private final int type;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/recycler/RankingListAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/sport/route/detail/model/RankingListItem;", "item", "", "bindData", "(Lcom/xiaomi/fitness/sport/route/detail/model/RankingListItem;)V", "Landroid/widget/TextView;", "rankingTv", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "rankingIconIv", "Landroid/widget/ImageView;", "userIconIv", "runTimes", "usernameTv", "deviceNameTv", "Lcom/xiaomi/fitness/widget/view/DividerView;", "bottomDivider", "Lcom/xiaomi/fitness/widget/view/DividerView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/sport/route/detail/recycler/RankingListAdapter;Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final DividerView bottomDivider;

        @NotNull
        private final TextView deviceNameTv;

        @NotNull
        private final ImageView rankingIconIv;

        @NotNull
        private final TextView rankingTv;

        @NotNull
        private final TextView runTimes;
        final /* synthetic */ RankingListAdapter this$0;

        @NotNull
        private final ImageView userIconIv;

        @NotNull
        private final TextView usernameTv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(@NotNull RankingListAdapter rankingListAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = rankingListAdapter;
            View viewFindViewById = itemView.findViewById(xri.P4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.rankingTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(xri.O4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.rankingIconIv = (ImageView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(xri.j8);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.userIconIv = (ImageView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(xri.E5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.runTimes = (TextView) viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(xri.l8);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.usernameTv = (TextView) viewFindViewById5;
            View viewFindViewById6 = itemView.findViewById(xri.k1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.deviceNameTv = (TextView) viewFindViewById6;
            View viewFindViewById7 = itemView.findViewById(xri.L);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            this.bottomDivider = (DividerView) viewFindViewById7;
        }

        public final void bindData(@NotNull RankingListItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.this$0.setRankingTv(this.rankingTv, item.getRanking());
            Integer rankingIconResId = this.this$0.getRankingIconResId(item.getRanking());
            this.rankingIconIv.setImageResource(rankingIconResId != null ? rankingIconResId.intValue() : R.color.transparent);
            RouteDetailExtKt.loadImageWithUrl$default(this.userIconIv, item.getUserIcon(), 0, false, 6, null);
            this.runTimes.setText(this.this$0.type == 2 ? RouteDetailExtKt.getRunTimesSpannableStr(item.getClockInTimes()) : TimeDateUtil.getTimeStrWithSecDef(item.getScore()));
            this.usernameTv.setText(item.getUsername());
            String deviceName = item.getDeviceName();
            String string = deviceName != null ? StringsKt__StringsKt.trim((CharSequence) deviceName).toString() : null;
            boolean z = !(string == null || StringsKt__StringsKt.isBlank(string));
            ViewExtKt.setVisible(this.deviceNameTv, z);
            if (z) {
                this.deviceNameTv.setText(item.getDeviceName());
            }
            ViewExtKt.setVisible(this.bottomDivider, item.isMyself());
        }
    }

    public RankingListAdapter(int i) {
        this.type = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer getRankingIconResId(int ranking) {
        if (ranking > 3) {
            return null;
        }
        if (ranking == 1) {
            return Integer.valueOf(eoi.N1);
        }
        if (ranking == 2) {
            return Integer.valueOf(eoi.P1);
        }
        if (ranking == 3) {
            return Integer.valueOf(eoi.M1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRankingTv(TextView rankingTv, int ranking) {
        if (ranking <= 3) {
            ViewExtKt.invisible(rankingTv);
            return;
        }
        ViewExtKt.visible(rankingTv);
        if (ranking > 99) {
            rankingTv.setText("");
        } else {
            rankingTv.setText(String.valueOf(ranking));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mDataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        RankingListItem rankingListItem = this.mDataList.get(position);
        if (holder instanceof ItemViewHolder) {
            ((ItemViewHolder) holder).bindData(rankingListItem);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(dvi.K0, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ItemViewHolder(this, viewInflate);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void updateDataList(@NotNull List<RankingListItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mDataList = list;
        notifyDataSetChanged();
    }
}
