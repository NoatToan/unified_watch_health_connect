package com.xiaomi.fitness.health.sleep.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.entity.SleepAnalyzeItem;
import com.xiaomi.fitness.health.sleep.ui.adapter.SleepQualityAnalyzeAdapter;
import com.xiaomi.fitness.health.sleep.utils.SleepAnalyzeHelper;
import com.xiaomi.fitness.health.sleep.view.SleepViewModel;
import defpackage.c0j;
import defpackage.gfe;
import defpackage.ica;
import defpackage.iji;
import defpackage.jui;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B\u0007¢\u0006\u0004\b%\u0010\u000bJ\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/SleepQualityDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/view/SleepViewModel;", "Lica;", "", "Lcom/xiaomi/fitness/health/sleep/entity/SleepAnalyzeItem;", "itemList", "", "refreshView", "(Ljava/util/List;)V", "initRecyclerView", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "showAccurate", "Z", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "allDayReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "preReport", "Landroidx/recyclerview/widget/RecyclerView;", "analyzeRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "analyzeScoreView", "Landroid/view/View;", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepQualityAnalyzeAdapter;", "analyzeAdapter", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepQualityAnalyzeAdapter;", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepQualityDetailFragment extends Hilt_SleepQualityDetailFragment<SleepViewModel, ica> {

    @NotNull
    public static final String KEY_SHOW_ACCURATE = "show_accurate";

    @NotNull
    public static final String KEY_SLEEP_PRE_REPORT = "pre_sleep_report";

    @NotNull
    public static final String KEY_SLEEP_REPORT = "sleep_report";

    @Nullable
    private AllDaySleepReport allDayReport;
    private SleepQualityAnalyzeAdapter analyzeAdapter;
    private RecyclerView analyzeRecyclerView;
    private View analyzeScoreView;

    @Nullable
    private AllDaySleepReport preReport;
    private boolean showAccurate;

    public SleepQualityDetailFragment() {
        super(jui.T0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initRecyclerView() {
        this.analyzeAdapter = new SleepQualityAnalyzeAdapter();
        RecyclerView recyclerView = this.analyzeRecyclerView;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("analyzeRecyclerView");
            recyclerView = null;
        }
        SleepQualityAnalyzeAdapter sleepQualityAnalyzeAdapter = this.analyzeAdapter;
        if (sleepQualityAnalyzeAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("analyzeAdapter");
            sleepQualityAnalyzeAdapter = null;
        }
        recyclerView.setAdapter(sleepQualityAnalyzeAdapter);
        RecyclerView recyclerView3 = this.analyzeRecyclerView;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("analyzeRecyclerView");
        } else {
            recyclerView2 = recyclerView3;
        }
        recyclerView2.setNestedScrollingEnabled(false);
        gfe gfeVar = new gfe(getContext(), SleepAnalyzeHelper.INSTANCE.getSleepLevelList(), 3);
        RecyclerView levelDescRecyclerview = ((ica) getMBinding()).L;
        Intrinsics.checkNotNullExpressionValue(levelDescRecyclerview, "levelDescRecyclerview");
        ViewGroup.LayoutParams layoutParams = levelDescRecyclerview.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        Context context = getContext();
        layoutParams.width = (context == null || !UIUtils.INSTANCE.isTabletAndLandscape(context)) ? -1 : ExtUtilsKt.getDp(300);
        levelDescRecyclerview.setLayoutParams(layoutParams);
        levelDescRecyclerview.setLayoutManager(new GridLayoutManager(getContext(), 3));
        levelDescRecyclerview.setHasFixedSize(true);
        levelDescRecyclerview.setNestedScrollingEnabled(false);
        levelDescRecyclerview.setAdapter(gfeVar);
    }

    private final void refreshView(List<SleepAnalyzeItem> itemList) {
        SleepQualityAnalyzeAdapter sleepQualityAnalyzeAdapter = null;
        View view = null;
        if (itemList.isEmpty()) {
            View view2 = this.analyzeScoreView;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("analyzeScoreView");
            } else {
                view = view2;
            }
            ViewExtKt.setVisible(view, false);
            return;
        }
        View view3 = this.analyzeScoreView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("analyzeScoreView");
            view3 = null;
        }
        ViewExtKt.setVisible(view3, true);
        SleepQualityAnalyzeAdapter sleepQualityAnalyzeAdapter2 = this.analyzeAdapter;
        if (sleepQualityAnalyzeAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("analyzeAdapter");
        } else {
            sleepQualityAnalyzeAdapter = sleepQualityAnalyzeAdapter2;
        }
        sleepQualityAnalyzeAdapter.setData(itemList);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.T0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarExpandState(0);
        setTitleBackground(iji.T2);
        this.analyzeScoreView = ((ica) getMBinding()).B;
        this.analyzeRecyclerView = ((ica) getMBinding()).A;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.showAccurate = arguments.getBoolean(KEY_SHOW_ACCURATE, false);
            this.allDayReport = (AllDaySleepReport) arguments.getSerializable("sleep_report");
            this.preReport = (AllDaySleepReport) arguments.getSerializable(KEY_SLEEP_PRE_REPORT);
        }
        if (!this.showAccurate || this.allDayReport == null) {
            setTitle(getString(c0j.Xh));
            TextView tvGuideAssistTip = ((ica) getMBinding()).U;
            Intrinsics.checkNotNullExpressionValue(tvGuideAssistTip, "tvGuideAssistTip");
            ViewExtKt.setVisible(tvGuideAssistTip, true);
            View view2 = this.analyzeScoreView;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("analyzeScoreView");
                view2 = null;
            }
            ViewExtKt.setVisible(view2, false);
            return;
        }
        setTitle(getString(c0j.ai));
        TextView tvGuideAssistTip2 = ((ica) getMBinding()).U;
        Intrinsics.checkNotNullExpressionValue(tvGuideAssistTip2, "tvGuideAssistTip");
        ViewExtKt.setVisible(tvGuideAssistTip2, false);
        initRecyclerView();
        SleepAnalyzeHelper sleepAnalyzeHelper = SleepAnalyzeHelper.INSTANCE;
        AllDaySleepReport allDaySleepReport = this.allDayReport;
        Intrinsics.checkNotNull(allDaySleepReport);
        refreshView(sleepAnalyzeHelper.transformSleepAnalyzeList(allDaySleepReport, this.preReport));
    }
}
