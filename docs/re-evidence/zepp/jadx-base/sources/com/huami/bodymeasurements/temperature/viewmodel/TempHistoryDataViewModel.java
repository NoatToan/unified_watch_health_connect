package com.huami.bodymeasurements.temperature.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.business.history.HistoryDataItem;
import com.huami.bodymeasurements.temperature.model.usecase.DeleteManualTempItemUseCase;
import com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase;
import com.huami.bodymeasurements.temperature.viewmodel.coroutines.ExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R3\u0010\u001c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0017*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00120\u00120\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R'\u0010\"\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u001d0\u001d0\u00168\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001b¨\u0006%"}, d2 = {"Lcom/huami/bodymeasurements/temperature/viewmodel/TempHistoryDataViewModel;", "Landroidx/lifecycle/ViewModel;", "", "userId", "", "loadData", "Lcom/huami/bodymeasurements/common/business/history/HistoryDataItem;", "item", "deleteItem", "Lcom/huami/bodymeasurements/temperature/model/usecase/GetTempHistoryDataUseCase;", "a", "Lcom/huami/bodymeasurements/temperature/model/usecase/GetTempHistoryDataUseCase;", "loadUseCase", "Lcom/huami/bodymeasurements/temperature/model/usecase/DeleteManualTempItemUseCase;", "b", "Lcom/huami/bodymeasurements/temperature/model/usecase/DeleteManualTempItemUseCase;", "deleteUseCase", "Landroidx/lifecycle/MutableLiveData;", "", "c", "Landroidx/lifecycle/MutableLiveData;", "_historyDataLiveData", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/LiveData;", "getHistoryDataLiveData", "()Landroidx/lifecycle/LiveData;", "historyDataLiveData", "", "e", "_deleteResultLiveData", "f", "getDeleteResultLiveData", "deleteResultLiveData", "<init>", "(Lcom/huami/bodymeasurements/temperature/model/usecase/GetTempHistoryDataUseCase;Lcom/huami/bodymeasurements/temperature/model/usecase/DeleteManualTempItemUseCase;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TempHistoryDataViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GetTempHistoryDataUseCase loadUseCase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DeleteManualTempItemUseCase deleteUseCase;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<HistoryDataItem>> _historyDataLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<HistoryDataItem>> historyDataLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _deleteResultLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> deleteResultLiveData;

    public TempHistoryDataViewModel(@NotNull GetTempHistoryDataUseCase getTempHistoryDataUseCase, @NotNull DeleteManualTempItemUseCase deleteManualTempItemUseCase) {
        this.loadUseCase = getTempHistoryDataUseCase;
        this.deleteUseCase = deleteManualTempItemUseCase;
        MutableLiveData<List<HistoryDataItem>> mutableLiveData = new MutableLiveData<>();
        this._historyDataLiveData = mutableLiveData;
        this.historyDataLiveData = Transformations.map(mutableLiveData, new Function<List<? extends HistoryDataItem>, List<? extends HistoryDataItem>>() { // from class: com.huami.bodymeasurements.temperature.viewmodel.TempHistoryDataViewModel$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final List<? extends HistoryDataItem> apply(List<? extends HistoryDataItem> list) {
                return list;
            }
        });
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this._deleteResultLiveData = mutableLiveData2;
        this.deleteResultLiveData = Transformations.map(mutableLiveData2, new Function<Boolean, Boolean>() { // from class: com.huami.bodymeasurements.temperature.viewmodel.TempHistoryDataViewModel$special$$inlined$map$2
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(Boolean bool) {
                return bool;
            }
        });
    }

    public final void deleteItem(@NotNull HistoryDataItem item, @NotNull String userId) {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new TempHistoryDataViewModel$deleteItem$$inlined$safeLaunch$1(null, this, item, userId), 2, null);
    }

    @NotNull
    public final LiveData<Boolean> getDeleteResultLiveData() {
        return this.deleteResultLiveData;
    }

    @NotNull
    public final LiveData<List<HistoryDataItem>> getHistoryDataLiveData() {
        return this.historyDataLiveData;
    }

    public final void loadData(@NotNull String userId) {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new TempHistoryDataViewModel$loadData$$inlined$safeLaunch$1(null, this, userId), 2, null);
    }
}
