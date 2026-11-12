package com.xiaomi.fitness.sport.sporttab.holder;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel;
import com.xiaomi.fitness.sport.sporttab.recycler.SportTabV4Adapter;
import com.xiaomi.fitness.sport.sporttab.viewholder.BannerListViewHolder;
import com.xiaomi.fitness.sport.sporttab.viewholder.JustDanceViewHolder;
import com.xiaomi.fitness.sport.sporttab.viewholder.RunningGroupViewHolder;
import com.xiaomi.fitness.sport.sporttab.viewholder.SportCourseOldViewHolder;
import com.xiaomi.fitness.sport.sporttab.viewholder.SportCourseViewHolder;
import com.xiaomi.fitness.sport.sporttab.viewholder.SportReportCardViewHolder;
import com.xiaomi.fitness.sport.sporttab.viewholder.TrainingIndexHolder;
import com.xiaomi.fitness.sport.sporttab.viewholder.TrainingPlanViewHolder;
import com.xiaomi.fitness.sport.view.route.holder.RunningRouteHolder;
import com.xiaomi.fitness.sport.viewmodel.RunningRouteListVM;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 !2\u00020\u0001:\u0001!B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u0019J\u0006\u0010\u001d\u001a\u00020\u0019J\u0006\u0010\u001e\u001a\u00020\u0019J\u0006\u0010\u001f\u001a\u00020\u0019J\u0006\u0010 \u001a\u00020\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/holder/SportModelListHolder;", "", "contextFragment", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "mViewModel", "Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "runningRouteListVM", "Lcom/xiaomi/fitness/sport/viewmodel/RunningRouteListVM;", "<init>", "(Lcom/xiaomi/fitness/baseui/view/BaseFragment;Landroidx/fragment/app/FragmentActivity;Landroidx/recyclerview/widget/RecyclerView;Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;Lcom/xiaomi/fitness/sport/viewmodel/RunningRouteListVM;)V", "getFragmentActivity", "()Landroidx/fragment/app/FragmentActivity;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "getMViewModel", "()Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "getRunningRouteListVM", "()Lcom/xiaomi/fitness/sport/viewmodel/RunningRouteListVM;", "sportTabV4Adapter", "Lcom/xiaomi/fitness/sport/sporttab/recycler/SportTabV4Adapter;", "initHolder", "", "refreshAllAdapterData", "refreshFitnessdata", "refreshTrainingIndexCard", "refreshJustDanceCard", "refreshRunningRoute", "refreshTrainingPlanCard", "refreshRunningGroup", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportModelListHolder {

    @NotNull
    public static final String TAG = "SportModelListHolder";

    @NotNull
    private final FragmentActivity fragmentActivity;

    @NotNull
    private final SportTabV4ViewModel mViewModel;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final RunningRouteListVM runningRouteListVM;

    @NotNull
    private final SportTabV4Adapter sportTabV4Adapter;

    public SportModelListHolder(@NotNull BaseFragment contextFragment, @NotNull FragmentActivity fragmentActivity, @NotNull RecyclerView recyclerView, @NotNull SportTabV4ViewModel mViewModel, @NotNull RunningRouteListVM runningRouteListVM) {
        Intrinsics.checkNotNullParameter(contextFragment, "contextFragment");
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(mViewModel, "mViewModel");
        Intrinsics.checkNotNullParameter(runningRouteListVM, "runningRouteListVM");
        this.fragmentActivity = fragmentActivity;
        this.recyclerView = recyclerView;
        this.mViewModel = mViewModel;
        this.runningRouteListVM = runningRouteListVM;
        this.sportTabV4Adapter = new SportTabV4Adapter(contextFragment, fragmentActivity, mViewModel, runningRouteListVM);
    }

    @NotNull
    public final FragmentActivity getFragmentActivity() {
        return this.fragmentActivity;
    }

    @NotNull
    public final SportTabV4ViewModel getMViewModel() {
        return this.mViewModel;
    }

    @NotNull
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    @NotNull
    public final RunningRouteListVM getRunningRouteListVM() {
        return this.runningRouteListVM;
    }

    public final void initHolder() {
        this.recyclerView.setItemAnimator(null);
        this.sportTabV4Adapter.setRecyclerView(this.recyclerView);
        this.recyclerView.setAdapter(this.sportTabV4Adapter);
        this.sportTabV4Adapter.refresh();
    }

    public final void refreshAllAdapterData() {
        SportCourseViewHolder sportCourseViewHolder = this.sportTabV4Adapter.getSportCourseViewHolder();
        if (sportCourseViewHolder != null) {
            sportCourseViewHolder.refreshHolder();
        }
        SportCourseOldViewHolder sportCourseOldViewHolder = this.sportTabV4Adapter.getSportCourseOldViewHolder();
        if (sportCourseOldViewHolder != null) {
            sportCourseOldViewHolder.refreshHolder();
        }
        TrainingIndexHolder trainingIndexHolder = this.sportTabV4Adapter.getTrainingIndexHolder();
        if (trainingIndexHolder != null) {
            trainingIndexHolder.refreshHolder();
        }
        SportReportCardViewHolder sportReportCardViewHolder = this.sportTabV4Adapter.getSportReportCardViewHolder();
        if (sportReportCardViewHolder != null) {
            sportReportCardViewHolder.refreshHolder();
        }
        BannerListViewHolder bannerListViewHolder = this.sportTabV4Adapter.getBannerListViewHolder();
        if (bannerListViewHolder != null) {
            bannerListViewHolder.refreshHolder();
        }
        RunningRouteHolder runningRouteHolder = this.sportTabV4Adapter.getRunningRouteHolder();
        if (runningRouteHolder != null) {
            runningRouteHolder.bindData();
        }
        JustDanceViewHolder justDanceViewHolder = this.sportTabV4Adapter.getJustDanceViewHolder();
        if (justDanceViewHolder != null) {
            justDanceViewHolder.bindData();
        }
        TrainingPlanViewHolder trainingPlanViewHolder = this.sportTabV4Adapter.getTrainingPlanViewHolder();
        if (trainingPlanViewHolder != null) {
            trainingPlanViewHolder.bindData();
        }
        RunningGroupViewHolder runningGroupViewHolder = this.sportTabV4Adapter.getRunningGroupViewHolder();
        if (runningGroupViewHolder != null) {
            runningGroupViewHolder.bindData();
        }
    }

    public final void refreshFitnessdata() {
        TrainingIndexHolder trainingIndexHolder = this.sportTabV4Adapter.getTrainingIndexHolder();
        if (trainingIndexHolder != null) {
            trainingIndexHolder.refreshHolder();
        }
        SportReportCardViewHolder sportReportCardViewHolder = this.sportTabV4Adapter.getSportReportCardViewHolder();
        if (sportReportCardViewHolder != null) {
            sportReportCardViewHolder.refreshHolder();
        }
    }

    public final void refreshJustDanceCard() {
        JustDanceViewHolder justDanceViewHolder = this.sportTabV4Adapter.getJustDanceViewHolder();
        if (justDanceViewHolder != null) {
            justDanceViewHolder.bindData();
        }
    }

    public final void refreshRunningGroup() {
        RunningGroupViewHolder runningGroupViewHolder = this.sportTabV4Adapter.getRunningGroupViewHolder();
        if (runningGroupViewHolder != null) {
            runningGroupViewHolder.refresh();
        }
    }

    public final void refreshRunningRoute() {
        RunningRouteHolder runningRouteHolder = this.sportTabV4Adapter.getRunningRouteHolder();
        if (runningRouteHolder != null) {
            runningRouteHolder.bindData();
        }
    }

    public final void refreshTrainingIndexCard() {
        Object trainingIndexHolder = this.sportTabV4Adapter.getTrainingIndexHolder();
        if (trainingIndexHolder == null) {
            trainingIndexHolder = AbstractJsonLexerKt.NULL;
        }
        Logger.d(TAG, "refreshTrainingIndexCard trainingIndexHolder=" + trainingIndexHolder);
        TrainingIndexHolder trainingIndexHolder2 = this.sportTabV4Adapter.getTrainingIndexHolder();
        if (trainingIndexHolder2 != null) {
            trainingIndexHolder2.refreshHolder();
        }
        SportCourseViewHolder sportCourseViewHolder = this.sportTabV4Adapter.getSportCourseViewHolder();
        if (sportCourseViewHolder != null) {
            sportCourseViewHolder.refreshHolder();
        }
        SportCourseOldViewHolder sportCourseOldViewHolder = this.sportTabV4Adapter.getSportCourseOldViewHolder();
        if (sportCourseOldViewHolder != null) {
            sportCourseOldViewHolder.refreshHolder();
        }
        BannerListViewHolder bannerListViewHolder = this.sportTabV4Adapter.getBannerListViewHolder();
        if (bannerListViewHolder != null) {
            bannerListViewHolder.refreshHolder();
        }
        RunningRouteHolder runningRouteHolder = this.sportTabV4Adapter.getRunningRouteHolder();
        if (runningRouteHolder != null) {
            runningRouteHolder.bindData();
        }
        TrainingPlanViewHolder trainingPlanViewHolder = this.sportTabV4Adapter.getTrainingPlanViewHolder();
        if (trainingPlanViewHolder != null) {
            trainingPlanViewHolder.bindData();
        }
        RunningGroupViewHolder runningGroupViewHolder = this.sportTabV4Adapter.getRunningGroupViewHolder();
        if (runningGroupViewHolder != null) {
            runningGroupViewHolder.bindData();
        }
        JustDanceViewHolder justDanceViewHolder = this.sportTabV4Adapter.getJustDanceViewHolder();
        if (justDanceViewHolder != null) {
            justDanceViewHolder.bindData();
        }
    }

    public final void refreshTrainingPlanCard() {
        TrainingPlanViewHolder trainingPlanViewHolder = this.sportTabV4Adapter.getTrainingPlanViewHolder();
        if (trainingPlanViewHolder != null) {
            trainingPlanViewHolder.bindData();
        }
    }
}
