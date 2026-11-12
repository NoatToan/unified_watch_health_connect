package com.huami.watchfacesstore.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.tools.analytics.DbUtils;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.analytic.WFAnalyticHelper;
import com.huami.watchfacesstore.analytic.WFStateEvent;
import com.huami.watchfacesstore.bean.Ranking;
import com.huami.watchfacesstore.ui.adapter.RankingAdapter;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.huami.watchfacesstore.ui.store.list.RankListActivity;
import com.huami.watchfacesstore.view.recycleview.BaseRVAdapter;
import com.huami.watchfacesstore.view.recycleview.ViewHolder;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u000e"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/RankingAdapter;", "Lcom/huami/watchfacesstore/view/recycleview/BaseRVAdapter;", "Lcom/huami/watchfacesstore/bean/Ranking;", "Lcom/huami/watchfacesstore/view/recycleview/ViewHolder;", "holder", "", "position", "item", "", "convert", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class RankingAdapter extends BaseRVAdapter<Ranking> {
    public RankingAdapter(@NotNull Context context) {
        super(context, R.layout.wf_item_ranking);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(RankingAdapter rankingAdapter, Ranking ranking, View view) {
        RankListActivity.INSTANCE.actionStart(rankingAdapter.getContext(), ranking.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(Ranking ranking, RankingAdapter rankingAdapter, ViewHolder viewHolder, int i, int i2) {
        WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, WFStateEvent.WF_STORE_RANKING_CLICK_NUM, null, q.mapOf(TuplesKt.to(WFStateEvent.WF_RANKING_SOURCE, ranking.getType())), null, 10, null);
        WatchFaceDetailActivity.Companion.actionStart$default(WatchFaceDetailActivity.INSTANCE, rankingAdapter.getContext(), 0, ranking.getData().get(i2).getId(), null, WatchFaceDetailActivity.FROM_RANK, 8, null);
    }

    @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter
    public void convert(@NotNull ViewHolder holder, int position, @Nullable final Ranking item) {
        if (item == null) {
            return;
        }
        holder.setText(R.id.tv_home_item_title, Intrinsics.areEqual(item.getType(), "total") ? R.string.wf_home_item_rank_title_1 : R.string.wf_home_item_rank_title_2);
        ((TextView) holder.getView(R.id.tv_home_more)).setOnClickListener(new View.OnClickListener() { // from class: u66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RankingAdapter.l(this.a, item, view);
            }
        });
        RecyclerView recyclerView = (RecyclerView) holder.getView(R.id.ranking_item_recyclerView);
        RankInnerAdapter rankInnerAdapter = new RankInnerAdapter(getContext(), 0, item.getData());
        rankInnerAdapter.setOnItemClickListener(new BaseRVAdapter.OnItemClickListener() { // from class: v66
            @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter.OnItemClickListener
            public final void onItemClick(ViewHolder viewHolder, int i, int i2) {
                RankingAdapter.m(item, this, viewHolder, i, i2);
            }
        });
        recyclerView.setAdapter(rankInnerAdapter);
    }
}
