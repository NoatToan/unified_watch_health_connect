package com.huami.step.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.step.model.StepTimeLineInfo;
import com.huami.step.model.TimeIndex;
import com.huami.step.repo.StepInfoRepository;
import com.huami.step.viewmodel.StepStageViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000fR\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000fR%\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/huami/step/viewmodel/StepStageViewModel;", "Landroidx/lifecycle/ViewModel;", "", "userId", "", "setUserId", "Lcom/huami/step/repo/StepInfoRepository;", "a", "Lcom/huami/step/repo/StepInfoRepository;", "repository", "Landroidx/lifecycle/MutableLiveData;", "", "b", "Landroidx/lifecycle/MutableLiveData;", "getDate", "()Landroidx/lifecycle/MutableLiveData;", "date", "c", "getUserId", "", GoogleApiAvailabilityLight.a, "getStageVisible", "stageVisible", "Lcom/huami/step/model/TimeIndex;", "e", "getStageStatus", "stageStatus", "f", "getMaxPagePosition", "maxPagePosition", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/step/model/StepTimeLineInfo;", "g", "Landroidx/lifecycle/LiveData;", "getStageData", "()Landroidx/lifecycle/LiveData;", "stageData", "<init>", "(Lcom/huami/step/repo/StepInfoRepository;)V", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepStageViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final StepInfoRepository repository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> date;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> userId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> stageVisible;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TimeIndex> stageStatus;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> maxPagePosition;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<StepTimeLineInfo>> stageData;

    public StepStageViewModel(@NotNull StepInfoRepository stepInfoRepository) {
        this.repository = stepInfoRepository;
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>();
        this.date = mutableLiveData;
        this.userId = new MutableLiveData<>();
        this.stageVisible = new MutableLiveData<>();
        this.stageStatus = new MutableLiveData<>();
        this.maxPagePosition = new MutableLiveData<>();
        this.stageData = Transformations.switchMap(mutableLiveData, new Function() { // from class: qg7
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return StepStageViewModel.b(this.a, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData b(StepStageViewModel stepStageViewModel, Long l) {
        return stepStageViewModel.repository.getStepsStage(l.longValue(), String.valueOf(stepStageViewModel.getUserId().getValue()));
    }

    @NotNull
    public final MutableLiveData<Long> getDate() {
        return this.date;
    }

    @NotNull
    public final MutableLiveData<Integer> getMaxPagePosition() {
        return this.maxPagePosition;
    }

    @NotNull
    public final LiveData<List<StepTimeLineInfo>> getStageData() {
        return this.stageData;
    }

    @NotNull
    public final MutableLiveData<TimeIndex> getStageStatus() {
        return this.stageStatus;
    }

    @NotNull
    public final MutableLiveData<Integer> getStageVisible() {
        return this.stageVisible;
    }

    @NotNull
    public final MutableLiveData<String> getUserId() {
        return this.userId;
    }

    public final void setUserId(@NotNull String userId) {
        if (Intrinsics.areEqual(this.userId.getValue(), userId)) {
            return;
        }
        this.userId.setValue(userId);
    }
}
