package com.xiaomi.fitness.sport.route.detail.holder;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.route.detail.model.RankInfo;
import com.xiaomi.fitness.sport.route.detail.model.RankingListItem;
import com.xiaomi.fitness.sport.route.detail.recycler.RankingListAdapter;
import com.xiaomi.fitness.sport.route.detail.util.RouteDetailExtKt;
import defpackage.c1j;
import defpackage.ozn;
import defpackage.szn;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0001-B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ%\u0010\u000e\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/holder/TabLayoutHolder;", "", "", "position", "", "switchRankingList", "(I)V", "initAdapters", "()V", "initHolder", "Lcom/xiaomi/fitness/sport/route/detail/model/RankInfo;", "curtUserRankInfo", "", "rankInfoList", "updatePunchInRankingList", "(Lcom/xiaomi/fitness/sport/route/detail/model/RankInfo;Ljava/util/List;)V", "updateGradeRankingList", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "getFragmentActivity", "()Landroidx/fragment/app/FragmentActivity;", "Lcom/xiaomi/fitness/sport/route/detail/recycler/RankingListAdapter;", "punchInRankingListAdapter", "Lcom/xiaomi/fitness/sport/route/detail/recycler/RankingListAdapter;", "gradeRankingListAdapter", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "Landroidx/core/widget/NestedScrollView;", "listScrollView", "Landroidx/core/widget/NestedScrollView;", "Landroidx/recyclerview/widget/RecyclerView;", "gradeRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "punchInRecycler", "Landroidx/appcompat/widget/AppCompatTextView;", "noDataTv", "Landroidx/appcompat/widget/AppCompatTextView;", "Lszn;", "tabLayoutBinding", "Lozn;", "containerBinding", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lszn;Lozn;)V", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TabLayoutHolder {

    @NotNull
    public static final String TAG = "TabLayoutHolder";

    @NotNull
    private final FragmentActivity fragmentActivity;

    @Nullable
    private RankingListAdapter gradeRankingListAdapter;

    @NotNull
    private final RecyclerView gradeRecycler;

    @NotNull
    private final NestedScrollView listScrollView;

    @NotNull
    private final AppCompatTextView noDataTv;

    @Nullable
    private RankingListAdapter punchInRankingListAdapter;

    @NotNull
    private final RecyclerView punchInRecycler;

    @NotNull
    private final TabLayout tabLayout;

    public TabLayoutHolder(@NotNull FragmentActivity fragmentActivity, @NotNull szn tabLayoutBinding, @NotNull ozn containerBinding) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(tabLayoutBinding, "tabLayoutBinding");
        Intrinsics.checkNotNullParameter(containerBinding, "containerBinding");
        this.fragmentActivity = fragmentActivity;
        TabLayout tabLayout = tabLayoutBinding.A;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
        this.tabLayout = tabLayout;
        NestedScrollView listScrollView = containerBinding.B;
        Intrinsics.checkNotNullExpressionValue(listScrollView, "listScrollView");
        this.listScrollView = listScrollView;
        RecyclerView gradeRankingListRecycler = containerBinding.A;
        Intrinsics.checkNotNullExpressionValue(gradeRankingListRecycler, "gradeRankingListRecycler");
        this.gradeRecycler = gradeRankingListRecycler;
        RecyclerView punchInRankingListRecycler = containerBinding.D;
        Intrinsics.checkNotNullExpressionValue(punchInRankingListRecycler, "punchInRankingListRecycler");
        this.punchInRecycler = punchInRankingListRecycler;
        AppCompatTextView noDataTv = containerBinding.C;
        Intrinsics.checkNotNullExpressionValue(noDataTv, "noDataTv");
        this.noDataTv = noDataTv;
    }

    private final void initAdapters() {
        RankingListAdapter rankingListAdapter = new RankingListAdapter(2);
        this.punchInRankingListAdapter = rankingListAdapter;
        this.punchInRecycler.setAdapter(rankingListAdapter);
        RankingListAdapter rankingListAdapter2 = new RankingListAdapter(1);
        this.gradeRankingListAdapter = rankingListAdapter2;
        this.gradeRecycler.setAdapter(rankingListAdapter2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchRankingList(int position) {
        boolean z = position == 0;
        ViewExtKt.setVisible(this.punchInRecycler, z);
        ViewExtKt.setVisible(this.gradeRecycler, !z);
        this.listScrollView.fullScroll(33);
    }

    @NotNull
    public final FragmentActivity getFragmentActivity() {
        return this.fragmentActivity;
    }

    public final void initHolder() {
        this.tabLayout.addOnTabSelectedListener(new TabLayout.d() { // from class: com.xiaomi.fitness.sport.route.detail.holder.TabLayoutHolder.initHolder.1
            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabReselected(TabLayout.g tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabSelected(TabLayout.g tab) {
                Logger.d("TabLayoutHolder", "addOnTabSelectedListener position=" + (tab != null ? Integer.valueOf(tab.g()) : null));
                TabLayoutHolder.this.tabLayout.F(tab);
                TabLayoutHolder.this.switchRankingList(tab != null ? tab.g() : 0);
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabUnselected(TabLayout.g tab) {
            }
        });
        TabLayout.g gVarA = this.tabLayout.A();
        Intrinsics.checkNotNullExpressionValue(gVarA, "newTab(...)");
        TabLayout.TabView view = gVarA.i;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        view.setPadding(ExtUtilsKt.getDp(12), 0, ExtUtilsKt.getDp(12), 0);
        this.tabLayout.c(gVarA.u(c1j.v0));
        TabLayout.g gVarU = this.tabLayout.A().u(c1j.K1);
        Intrinsics.checkNotNullExpressionValue(gVarU, "setText(...)");
        gVarU.i.setPadding(ExtUtilsKt.getDp(28), 0, ExtUtilsKt.getDp(28), 0);
        this.tabLayout.c(gVarU);
        gVarA.m();
        initAdapters();
    }

    public final void updateGradeRankingList(@Nullable RankInfo curtUserRankInfo, @NotNull List<RankInfo> rankInfoList) {
        RankingListAdapter rankingListAdapter;
        Intrinsics.checkNotNullParameter(rankInfoList, "rankInfoList");
        List<RankingListItem> listConvertRankInfoListToRankListItemList = RouteDetailExtKt.convertRankInfoListToRankListItemList(rankInfoList, curtUserRankInfo);
        if (!(!listConvertRankInfoListToRankListItemList.isEmpty()) || (rankingListAdapter = this.gradeRankingListAdapter) == null) {
            return;
        }
        rankingListAdapter.updateDataList(listConvertRankInfoListToRankListItemList);
    }

    public final void updatePunchInRankingList(@Nullable RankInfo curtUserRankInfo, @NotNull List<RankInfo> rankInfoList) {
        Intrinsics.checkNotNullParameter(rankInfoList, "rankInfoList");
        List<RankingListItem> listConvertRankInfoListToRankListItemList = RouteDetailExtKt.convertRankInfoListToRankListItemList(rankInfoList, curtUserRankInfo);
        boolean zIsEmpty = listConvertRankInfoListToRankListItemList.isEmpty();
        boolean z = !zIsEmpty;
        if (z) {
            ViewExtKt.visible(this.punchInRecycler);
            RankingListAdapter rankingListAdapter = this.punchInRankingListAdapter;
            if (rankingListAdapter != null) {
                rankingListAdapter.updateDataList(listConvertRankInfoListToRankListItemList);
            }
        } else {
            ViewExtKt.gone(this.punchInRecycler);
        }
        ViewExtKt.setVisible(this.noDataTv, zIsEmpty);
        ViewExtKt.setVisible(this.tabLayout, z);
    }
}
