package com.xiaomi.fitness.sport.sporttab.recycler;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel;
import com.xiaomi.fitness.sport.sporttab.uimodel.SportTabUiModel;
import com.xiaomi.fitness.sport.sporttab.util.SportTabConstants;
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
import defpackage.dvi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002tuB'\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\br\u0010sJ\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R$\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010;\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010I\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010P\u001a\u0004\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010W\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010^\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010e\u001a\u0004\u0018\u00010d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010l\u001a\u0004\u0018\u00010k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010q¨\u0006v"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/recycler/SportTabV4Adapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "refresh", "()V", "onAttachedToRecyclerView", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "position", "getItemViewType", "(I)I", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "onViewRecycled", "(Landroidx/recyclerview/widget/RecyclerView$d0;)V", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "contextFragment", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "getFragmentActivity", "()Landroidx/fragment/app/FragmentActivity;", "Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "mViewModel", "Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "getMViewModel", "()Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "Lcom/xiaomi/fitness/sport/viewmodel/RunningRouteListVM;", "runningRouteListVM", "Lcom/xiaomi/fitness/sport/viewmodel/RunningRouteListVM;", "getRunningRouteListVM", "()Lcom/xiaomi/fitness/sport/viewmodel/RunningRouteListVM;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "", "Lcom/xiaomi/fitness/sport/sporttab/uimodel/SportTabUiModel;", "mUiModelList", "Ljava/util/List;", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/SportCourseViewHolder;", "sportCourseViewHolder", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/SportCourseViewHolder;", "getSportCourseViewHolder", "()Lcom/xiaomi/fitness/sport/sporttab/viewholder/SportCourseViewHolder;", "setSportCourseViewHolder", "(Lcom/xiaomi/fitness/sport/sporttab/viewholder/SportCourseViewHolder;)V", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/SportCourseOldViewHolder;", "sportCourseOldViewHolder", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/SportCourseOldViewHolder;", "getSportCourseOldViewHolder", "()Lcom/xiaomi/fitness/sport/sporttab/viewholder/SportCourseOldViewHolder;", "setSportCourseOldViewHolder", "(Lcom/xiaomi/fitness/sport/sporttab/viewholder/SportCourseOldViewHolder;)V", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/TrainingIndexHolder;", "trainingIndexHolder", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/TrainingIndexHolder;", "getTrainingIndexHolder", "()Lcom/xiaomi/fitness/sport/sporttab/viewholder/TrainingIndexHolder;", "setTrainingIndexHolder", "(Lcom/xiaomi/fitness/sport/sporttab/viewholder/TrainingIndexHolder;)V", "Lcom/xiaomi/fitness/sport/view/route/holder/RunningRouteHolder;", "runningRouteHolder", "Lcom/xiaomi/fitness/sport/view/route/holder/RunningRouteHolder;", "getRunningRouteHolder", "()Lcom/xiaomi/fitness/sport/view/route/holder/RunningRouteHolder;", "setRunningRouteHolder", "(Lcom/xiaomi/fitness/sport/view/route/holder/RunningRouteHolder;)V", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/SportReportCardViewHolder;", "sportReportCardViewHolder", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/SportReportCardViewHolder;", "getSportReportCardViewHolder", "()Lcom/xiaomi/fitness/sport/sporttab/viewholder/SportReportCardViewHolder;", "setSportReportCardViewHolder", "(Lcom/xiaomi/fitness/sport/sporttab/viewholder/SportReportCardViewHolder;)V", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/BannerListViewHolder;", "bannerListViewHolder", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/BannerListViewHolder;", "getBannerListViewHolder", "()Lcom/xiaomi/fitness/sport/sporttab/viewholder/BannerListViewHolder;", "setBannerListViewHolder", "(Lcom/xiaomi/fitness/sport/sporttab/viewholder/BannerListViewHolder;)V", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/JustDanceViewHolder;", "justDanceViewHolder", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/JustDanceViewHolder;", "getJustDanceViewHolder", "()Lcom/xiaomi/fitness/sport/sporttab/viewholder/JustDanceViewHolder;", "setJustDanceViewHolder", "(Lcom/xiaomi/fitness/sport/sporttab/viewholder/JustDanceViewHolder;)V", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/TrainingPlanViewHolder;", "trainingPlanViewHolder", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/TrainingPlanViewHolder;", "getTrainingPlanViewHolder", "()Lcom/xiaomi/fitness/sport/sporttab/viewholder/TrainingPlanViewHolder;", "setTrainingPlanViewHolder", "(Lcom/xiaomi/fitness/sport/sporttab/viewholder/TrainingPlanViewHolder;)V", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/RunningGroupViewHolder;", "runningGroupViewHolder", "Lcom/xiaomi/fitness/sport/sporttab/viewholder/RunningGroupViewHolder;", "getRunningGroupViewHolder", "()Lcom/xiaomi/fitness/sport/sporttab/viewholder/RunningGroupViewHolder;", "setRunningGroupViewHolder", "(Lcom/xiaomi/fitness/sport/sporttab/viewholder/RunningGroupViewHolder;)V", "<init>", "(Lcom/xiaomi/fitness/baseui/view/BaseFragment;Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;Lcom/xiaomi/fitness/sport/viewmodel/RunningRouteListVM;)V", "Companion", "EmptyViewHolder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportTabV4Adapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int POSITION_JUST_DANCE = 5;
    public static final int POSITION_OPERATIONAL_BANNER = 2;
    public static final int POSITION_RUNNING_ROUTE = 4;
    public static final int POSITION_SPORT_COURSE = 3;
    public static final int POSITION_SPORT_COURSE_OLD = 7;
    public static final int POSITION_SPORT_REPORT = 0;
    public static final int POSITION_SPORT_RUNNING_GROUP = 8;
    public static final int POSITION_TRAINING_INDICATOR = 1;
    public static final int POSITION_TRAINING_PLAN = 6;

    @NotNull
    public static final String TAG = "SportTabV4Adapter";

    @Nullable
    private BannerListViewHolder bannerListViewHolder;

    @NotNull
    private final BaseFragment contextFragment;

    @NotNull
    private final FragmentActivity fragmentActivity;

    @Nullable
    private JustDanceViewHolder justDanceViewHolder;
    private RecyclerView mRecyclerView;

    @NotNull
    private List<SportTabUiModel> mUiModelList;

    @NotNull
    private final SportTabV4ViewModel mViewModel;

    @Nullable
    private RunningGroupViewHolder runningGroupViewHolder;

    @Nullable
    private RunningRouteHolder runningRouteHolder;

    @NotNull
    private final RunningRouteListVM runningRouteListVM;

    @Nullable
    private SportCourseOldViewHolder sportCourseOldViewHolder;

    @Nullable
    private SportCourseViewHolder sportCourseViewHolder;

    @Nullable
    private SportReportCardViewHolder sportReportCardViewHolder;

    @Nullable
    private TrainingIndexHolder trainingIndexHolder;

    @Nullable
    private TrainingPlanViewHolder trainingPlanViewHolder;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/recycler/SportTabV4Adapter$EmptyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class EmptyViewHolder extends RecyclerView.d0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmptyViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    public SportTabV4Adapter(@NotNull BaseFragment contextFragment, @NotNull FragmentActivity fragmentActivity, @NotNull SportTabV4ViewModel mViewModel, @NotNull RunningRouteListVM runningRouteListVM) {
        Intrinsics.checkNotNullParameter(contextFragment, "contextFragment");
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(mViewModel, "mViewModel");
        Intrinsics.checkNotNullParameter(runningRouteListVM, "runningRouteListVM");
        this.contextFragment = contextFragment;
        this.fragmentActivity = fragmentActivity;
        this.mViewModel = mViewModel;
        this.runningRouteListVM = runningRouteListVM;
        ArrayList arrayList = new ArrayList();
        this.mUiModelList = arrayList;
        arrayList.add(new SportTabUiModel.SportRecordSportTabUiModel(0, null, 3, null));
        this.mUiModelList.add(new SportTabUiModel.TrainingIndicatorUiModel(0, null, 3, null));
        AppUtil appUtil = AppUtil.INSTANCE;
        if (!appUtil.isPlayChannel()) {
            this.mUiModelList.add(new SportTabUiModel.RunningGroupUiModel(null, 0, 3, null));
        }
        this.mUiModelList.add(new SportTabUiModel.TrainingPlanUIModel(null, 0, 3, null));
        if (!appUtil.isPlayChannel()) {
            this.mUiModelList.add(new SportTabUiModel.RunningRouteUiModel(0, null, 3, null));
        }
        this.mUiModelList.add(new SportTabUiModel.BannerListUiModel(0, null, 3, null));
        this.mUiModelList.add(new SportTabUiModel.JustDanceUIModel(null, 0, 3, null));
        this.mUiModelList.add(new SportTabUiModel.RecommendationCourseListUiModel(null, 0, 3, null));
    }

    @Nullable
    public final BannerListViewHolder getBannerListViewHolder() {
        return this.bannerListViewHolder;
    }

    @NotNull
    public final FragmentActivity getFragmentActivity() {
        return this.fragmentActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mUiModelList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.mUiModelList.get(position).getPosition();
    }

    @Nullable
    public final JustDanceViewHolder getJustDanceViewHolder() {
        return this.justDanceViewHolder;
    }

    @NotNull
    public final SportTabV4ViewModel getMViewModel() {
        return this.mViewModel;
    }

    @Nullable
    public final RunningGroupViewHolder getRunningGroupViewHolder() {
        return this.runningGroupViewHolder;
    }

    @Nullable
    public final RunningRouteHolder getRunningRouteHolder() {
        return this.runningRouteHolder;
    }

    @NotNull
    public final RunningRouteListVM getRunningRouteListVM() {
        return this.runningRouteListVM;
    }

    @Nullable
    public final SportCourseOldViewHolder getSportCourseOldViewHolder() {
        return this.sportCourseOldViewHolder;
    }

    @Nullable
    public final SportCourseViewHolder getSportCourseViewHolder() {
        return this.sportCourseViewHolder;
    }

    @Nullable
    public final SportReportCardViewHolder getSportReportCardViewHolder() {
        return this.sportReportCardViewHolder;
    }

    @Nullable
    public final TrainingIndexHolder getTrainingIndexHolder() {
        return this.trainingIndexHolder;
    }

    @Nullable
    public final TrainingPlanViewHolder getTrainingPlanViewHolder() {
        return this.trainingPlanViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.mRecyclerView = recyclerView;
        Logger.i(TAG, "onAttachedToRecyclerView running mUiModelList=" + this.mUiModelList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof SportReportCardViewHolder) {
            SportTabUiModel sportTabUiModel = this.mUiModelList.get(position);
            if (sportTabUiModel instanceof SportTabUiModel.SportRecordSportTabUiModel) {
                ((SportReportCardViewHolder) holder).bindData((SportTabUiModel.SportRecordSportTabUiModel) sportTabUiModel);
            }
        }
        if ((holder instanceof TrainingIndexHolder) && (this.mUiModelList.get(position) instanceof SportTabUiModel.TrainingIndicatorUiModel)) {
            ((TrainingIndexHolder) holder).bindData();
        }
        if ((holder instanceof RunningRouteHolder) && (this.mUiModelList.get(position) instanceof SportTabUiModel.RunningRouteUiModel)) {
            ((RunningRouteHolder) holder).bindData();
        }
        if ((holder instanceof BannerListViewHolder) && (this.mUiModelList.get(position) instanceof SportTabUiModel.BannerListUiModel)) {
            ((BannerListViewHolder) holder).bindData();
        }
        if ((holder instanceof JustDanceViewHolder) && (this.mUiModelList.get(position) instanceof SportTabUiModel.JustDanceUIModel)) {
            ((JustDanceViewHolder) holder).bindData();
        }
        if ((holder instanceof SportCourseViewHolder) && (this.mUiModelList.get(position) instanceof SportTabUiModel.RecommendationCourseListUiModel)) {
            ((SportCourseViewHolder) holder).bindData();
        }
        if ((holder instanceof TrainingPlanViewHolder) && (this.mUiModelList.get(position) instanceof SportTabUiModel.TrainingPlanUIModel)) {
            ((TrainingPlanViewHolder) holder).bindData();
        }
        if ((holder instanceof SportCourseOldViewHolder) && (this.mUiModelList.get(position) instanceof SportTabUiModel.RecommendationCourseListOldUiModel)) {
            ((SportCourseOldViewHolder) holder).bindData();
        }
        if ((holder instanceof RunningGroupViewHolder) && (this.mUiModelList.get(position) instanceof SportTabUiModel.RunningGroupUiModel)) {
            ((RunningGroupViewHolder) holder).bindData();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Logger.i(TAG, "onCreateViewHolder viewType=" + viewType);
        switch (viewType) {
            case 0:
                View viewInflate = LayoutInflater.from(parent.getContext()).inflate(dvi.g1, parent, false);
                viewInflate.setTag(SportTabConstants.TAG_SPORT_RECORD_ENTRANCE);
                Intrinsics.checkNotNull(viewInflate);
                SportReportCardViewHolder sportReportCardViewHolder = new SportReportCardViewHolder(viewInflate, this.fragmentActivity, this.mViewModel);
                this.sportReportCardViewHolder = sportReportCardViewHolder;
                Intrinsics.checkNotNull(sportReportCardViewHolder);
                return sportReportCardViewHolder;
            case 1:
                View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(dvi.m1, parent, false);
                BaseFragment baseFragment = this.contextFragment;
                Intrinsics.checkNotNull(viewInflate2);
                this.trainingIndexHolder = new TrainingIndexHolder(baseFragment, viewInflate2, this.fragmentActivity);
                viewInflate2.setTag(SportTabConstants.TAG_TRAINING_INDEX_CARD);
                TrainingIndexHolder trainingIndexHolder = this.trainingIndexHolder;
                Intrinsics.checkNotNull(trainingIndexHolder);
                return trainingIndexHolder;
            case 2:
                View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(dvi.a1, parent, false);
                Intrinsics.checkNotNull(viewInflate3);
                BannerListViewHolder bannerListViewHolder = new BannerListViewHolder(viewInflate3, this.fragmentActivity, this.mViewModel);
                this.bannerListViewHolder = bannerListViewHolder;
                Intrinsics.checkNotNull(bannerListViewHolder);
                return bannerListViewHolder;
            case 3:
                View viewInflate4 = LayoutInflater.from(parent.getContext()).inflate(dvi.j1, parent, false);
                Intrinsics.checkNotNull(viewInflate4);
                SportCourseViewHolder sportCourseViewHolder = new SportCourseViewHolder(viewInflate4, this.fragmentActivity, this.mViewModel);
                this.sportCourseViewHolder = sportCourseViewHolder;
                Intrinsics.checkNotNull(sportCourseViewHolder);
                return sportCourseViewHolder;
            case 4:
                RunningRouteHolder runningRouteHolder = new RunningRouteHolder(LayoutInflater.from(parent.getContext()).inflate(dvi.U0, parent, false), this.fragmentActivity, this.mViewModel, this.runningRouteListVM);
                this.runningRouteHolder = runningRouteHolder;
                Intrinsics.checkNotNull(runningRouteHolder);
                return runningRouteHolder;
            case 5:
                View viewInflate5 = LayoutInflater.from(parent.getContext()).inflate(dvi.t0, parent, false);
                Intrinsics.checkNotNull(viewInflate5);
                JustDanceViewHolder justDanceViewHolder = new JustDanceViewHolder(viewInflate5);
                this.justDanceViewHolder = justDanceViewHolder;
                Intrinsics.checkNotNull(justDanceViewHolder);
                return justDanceViewHolder;
            case 6:
                View viewInflate6 = LayoutInflater.from(parent.getContext()).inflate(dvi.k1, parent, false);
                Intrinsics.checkNotNull(viewInflate6);
                TrainingPlanViewHolder trainingPlanViewHolder = new TrainingPlanViewHolder(viewInflate6, this.fragmentActivity, this.mViewModel);
                this.trainingPlanViewHolder = trainingPlanViewHolder;
                Intrinsics.checkNotNull(trainingPlanViewHolder);
                return trainingPlanViewHolder;
            case 7:
                View viewInflate7 = LayoutInflater.from(parent.getContext()).inflate(dvi.j1, parent, false);
                Intrinsics.checkNotNull(viewInflate7);
                SportCourseOldViewHolder sportCourseOldViewHolder = new SportCourseOldViewHolder(viewInflate7, this.fragmentActivity, this.mViewModel);
                this.sportCourseOldViewHolder = sportCourseOldViewHolder;
                Intrinsics.checkNotNull(sportCourseOldViewHolder);
                return sportCourseOldViewHolder;
            case 8:
                View viewInflate8 = LayoutInflater.from(parent.getContext()).inflate(dvi.h1, parent, false);
                Intrinsics.checkNotNull(viewInflate8);
                RunningGroupViewHolder runningGroupViewHolder = new RunningGroupViewHolder(viewInflate8, this.fragmentActivity, this.mViewModel);
                this.runningGroupViewHolder = runningGroupViewHolder;
                Intrinsics.checkNotNull(runningGroupViewHolder);
                return runningGroupViewHolder;
            default:
                View viewInflate9 = LayoutInflater.from(parent.getContext()).inflate(dvi.g1, parent, false);
                Intrinsics.checkNotNull(viewInflate9);
                return new SportReportCardViewHolder(viewInflate9, this.fragmentActivity, this.mViewModel);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NotNull RecyclerView.d0 holder) {
        BannerListViewHolder bannerListViewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if ((holder instanceof BannerListViewHolder) && (bannerListViewHolder = this.bannerListViewHolder) != null) {
            bannerListViewHolder.clearObserver();
        }
        super.onViewRecycled(holder);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void refresh() {
        notifyDataSetChanged();
    }

    public final void setBannerListViewHolder(@Nullable BannerListViewHolder bannerListViewHolder) {
        this.bannerListViewHolder = bannerListViewHolder;
    }

    public final void setJustDanceViewHolder(@Nullable JustDanceViewHolder justDanceViewHolder) {
        this.justDanceViewHolder = justDanceViewHolder;
    }

    public final void setRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.mRecyclerView = recyclerView;
    }

    public final void setRunningGroupViewHolder(@Nullable RunningGroupViewHolder runningGroupViewHolder) {
        this.runningGroupViewHolder = runningGroupViewHolder;
    }

    public final void setRunningRouteHolder(@Nullable RunningRouteHolder runningRouteHolder) {
        this.runningRouteHolder = runningRouteHolder;
    }

    public final void setSportCourseOldViewHolder(@Nullable SportCourseOldViewHolder sportCourseOldViewHolder) {
        this.sportCourseOldViewHolder = sportCourseOldViewHolder;
    }

    public final void setSportCourseViewHolder(@Nullable SportCourseViewHolder sportCourseViewHolder) {
        this.sportCourseViewHolder = sportCourseViewHolder;
    }

    public final void setSportReportCardViewHolder(@Nullable SportReportCardViewHolder sportReportCardViewHolder) {
        this.sportReportCardViewHolder = sportReportCardViewHolder;
    }

    public final void setTrainingIndexHolder(@Nullable TrainingIndexHolder trainingIndexHolder) {
        this.trainingIndexHolder = trainingIndexHolder;
    }

    public final void setTrainingPlanViewHolder(@Nullable TrainingPlanViewHolder trainingPlanViewHolder) {
        this.trainingPlanViewHolder = trainingPlanViewHolder;
    }
}
