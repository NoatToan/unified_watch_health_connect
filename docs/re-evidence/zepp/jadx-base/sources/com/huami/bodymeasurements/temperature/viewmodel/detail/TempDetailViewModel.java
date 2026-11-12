package com.huami.bodymeasurements.temperature.viewmodel.detail;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.bodymeasurements.temperature.model.usecase.FetchTempFromServerUseCase;
import com.huami.bodymeasurements.temperature.model.usecase.GetLatestTempUseCase;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import com.huami.bodymeasurements.temperature.viewmodel.coroutines.ExtKt;
import kotlin.Metadata;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR!\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/bodymeasurements/temperature/viewmodel/detail/TempDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "", "userId", "", "setUserId", "Lcom/huami/bodymeasurements/temperature/model/usecase/FetchTempFromServerUseCase;", "a", "Lcom/huami/bodymeasurements/temperature/model/usecase/FetchTempFromServerUseCase;", "fetchTempFromServerUseCase", "Lcom/huami/bodymeasurements/temperature/model/usecase/GetLatestTempUseCase;", "b", "Lcom/huami/bodymeasurements/temperature/model/usecase/GetLatestTempUseCase;", "latestTempUseCase", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/bodymeasurements/temperature/view/vo/TemperatureVo;", "c", "Landroidx/lifecycle/MutableLiveData;", "getLatestTempLiveData", "()Landroidx/lifecycle/MutableLiveData;", "latestTempLiveData", "<init>", "(Lcom/huami/bodymeasurements/temperature/model/usecase/FetchTempFromServerUseCase;Lcom/huami/bodymeasurements/temperature/model/usecase/GetLatestTempUseCase;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TempDetailViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FetchTempFromServerUseCase fetchTempFromServerUseCase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final GetLatestTempUseCase latestTempUseCase;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TemperatureVo> latestTempLiveData = new MutableLiveData<>();

    public TempDetailViewModel(@NotNull FetchTempFromServerUseCase fetchTempFromServerUseCase, @NotNull GetLatestTempUseCase getLatestTempUseCase) {
        this.fetchTempFromServerUseCase = fetchTempFromServerUseCase;
        this.latestTempUseCase = getLatestTempUseCase;
    }

    @NotNull
    public final MutableLiveData<TemperatureVo> getLatestTempLiveData() {
        return this.latestTempLiveData;
    }

    public final void setUserId(@NotNull String userId) {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new TempDetailViewModel$setUserId$$inlined$safeLaunch$1(null, this, userId), 2, null);
    }
}
