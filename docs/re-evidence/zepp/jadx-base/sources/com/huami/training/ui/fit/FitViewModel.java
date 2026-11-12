package com.huami.training.ui.fit;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.repo.ConfigRepo;
import com.huami.training.repo.FitRepo;
import com.huami.training.repo.PlanRepo;
import com.huami.training.ui.fit.FitViewModel;
import com.huami.training.util.ConfigManager;
import com.huami.training.vo.JoinedCourseVo;
import com.huami.training.vo.Resource;
import com.huami.training.vo.Status;
import com.huami.training.vo.TrainingPlanVo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R+\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR-\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00160\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\r\u001a\u0004\b \u0010\u000f¨\u0006*"}, d2 = {"Lcom/huami/training/ui/fit/FitViewModel;", "Landroidx/lifecycle/ViewModel;", "", "loadConfigurations", "Lcom/huami/training/repo/ConfigRepo;", "a", "Lcom/huami/training/repo/ConfigRepo;", "configRepo", "Landroidx/lifecycle/LiveData;", "Lcom/huami/training/vo/Resource;", "", "Lcom/huami/training/vo/JoinedCourseVo;", "b", "Landroidx/lifecycle/LiveData;", "getJoinedTrainings", "()Landroidx/lifecycle/LiveData;", "joinedTrainings", "Lcom/huami/training/vo/TrainingPlanVo;", "c", "getTrainingPlan", "trainingPlan", "Landroidx/lifecycle/MediatorLiveData;", "Lkotlin/Pair;", "", "", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MediatorLiveData;", "getPlanExistence", "()Landroidx/lifecycle/MediatorLiveData;", "planExistence", "", "e", "getPlanBgImage", "planBgImage", "Lcom/huami/training/repo/FitRepo;", "fitRepo", "Lcom/huami/training/repo/PlanRepo;", "planRepo", "Lcom/huami/training/util/ConfigManager;", "configManager", "<init>", "(Lcom/huami/training/repo/FitRepo;Lcom/huami/training/repo/PlanRepo;Lcom/huami/training/repo/ConfigRepo;Lcom/huami/training/util/ConfigManager;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class FitViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ConfigRepo configRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<List<JoinedCourseVo>>> joinedTrainings;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<TrainingPlanVo>> trainingPlan;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Pair<Boolean, Long>> planExistence;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> planBgImage;

    public FitViewModel(@NotNull FitRepo fitRepo, @NotNull PlanRepo planRepo, @NotNull ConfigRepo configRepo, @NotNull ConfigManager configManager) {
        this.configRepo = configRepo;
        this.joinedTrainings = fitRepo.loadLatestTwoJoinedTrainings();
        LiveData<Resource<TrainingPlanVo>> liveDataLoadTrainingPlan = planRepo.loadTrainingPlan();
        this.trainingPlan = liveDataLoadTrainingPlan;
        MediatorLiveData<Pair<Boolean, Long>> mediatorLiveData = new MediatorLiveData<>();
        this.planExistence = mediatorLiveData;
        this.planBgImage = configManager.getPlanBackgroundImageInFitnessPage();
        mediatorLiveData.addSource(liveDataLoadTrainingPlan, new Observer() { // from class: p82
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                FitViewModel.b(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(FitViewModel fitViewModel, Resource resource) {
        if ((resource.getStatus() == Status.LOADING && resource.getData() == null) || resource.getStatus() == Status.ERROR) {
            return;
        }
        Pair<Boolean, Long> value = fitViewModel.getPlanExistence().getValue();
        Boolean first = value == null ? null : value.getFirst();
        boolean z = resource.getData() != null;
        if (!Intrinsics.areEqual(Boolean.valueOf(z), first)) {
            MediatorLiveData<Pair<Boolean, Long>> planExistence = fitViewModel.getPlanExistence();
            Boolean boolValueOf = Boolean.valueOf(z);
            TrainingPlanVo trainingPlanVo = (TrainingPlanVo) resource.getData();
            planExistence.setValue(new Pair<>(boolValueOf, trainingPlanVo != null ? Long.valueOf(trainingPlanVo.getId()) : null));
        }
    }

    @NotNull
    public final LiveData<Resource<List<JoinedCourseVo>>> getJoinedTrainings() {
        return this.joinedTrainings;
    }

    @NotNull
    public final LiveData<String> getPlanBgImage() {
        return this.planBgImage;
    }

    @NotNull
    public final MediatorLiveData<Pair<Boolean, Long>> getPlanExistence() {
        return this.planExistence;
    }

    @NotNull
    public final LiveData<Resource<TrainingPlanVo>> getTrainingPlan() {
        return this.trainingPlan;
    }

    public final void loadConfigurations() {
        ConfigRepo.loadConfigurations$default(this.configRepo, null, 1, null);
    }
}
