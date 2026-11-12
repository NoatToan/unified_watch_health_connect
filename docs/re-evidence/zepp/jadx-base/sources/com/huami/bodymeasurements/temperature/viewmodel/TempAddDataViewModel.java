package com.huami.bodymeasurements.temperature.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.helper.Resource;
import com.huami.bodymeasurements.temperature.model.usecase.AddManualTempUseCase;
import com.huami.bodymeasurements.temperature.viewmodel.coroutines.ExtKt;
import com.huami.watch.transport.httpsupport.model.DataItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\"\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00180\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R3\u0010!\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u001c*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00180\u00180\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/huami/bodymeasurements/temperature/viewmodel/TempAddDataViewModel;", "Landroidx/lifecycle/ViewModel;", "", "tempInput", "", "setTemp", "", "time", "setPostTime", "getPostTime", "", "checkPostTime", "userId", DataItem.HTTP_METHOD_POST, "Lcom/huami/bodymeasurements/temperature/model/usecase/AddManualTempUseCase;", "a", "Lcom/huami/bodymeasurements/temperature/model/usecase/AddManualTempUseCase;", "useCase", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "tempLiveData", "c", "postTimeLiveData", "Lcom/huami/arch/helper/Resource;", GoogleApiAvailabilityLight.a, "_postResultLiveData", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "e", "Landroidx/lifecycle/LiveData;", "getPostResultLiveData", "()Landroidx/lifecycle/LiveData;", "postResultLiveData", "<init>", "(Lcom/huami/bodymeasurements/temperature/model/usecase/AddManualTempUseCase;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TempAddDataViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AddManualTempUseCase useCase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> tempLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Long> postTimeLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<Unit>> _postResultLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<Unit>> postResultLiveData;

    public TempAddDataViewModel(@NotNull AddManualTempUseCase addManualTempUseCase) {
        this.useCase = addManualTempUseCase;
        MutableLiveData<Resource<Unit>> mutableLiveData = new MutableLiveData<>();
        this._postResultLiveData = mutableLiveData;
        this.postResultLiveData = Transformations.map(mutableLiveData, new Function<Resource<? extends Unit>, Resource<? extends Unit>>() { // from class: com.huami.bodymeasurements.temperature.viewmodel.TempAddDataViewModel$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final Resource<? extends Unit> apply(Resource<? extends Unit> resource) {
                return resource;
            }
        });
        setPostTime(System.currentTimeMillis());
    }

    public final boolean checkPostTime() {
        return getPostTime() <= System.currentTimeMillis();
    }

    @NotNull
    public final LiveData<Resource<Unit>> getPostResultLiveData() {
        return this.postResultLiveData;
    }

    public final long getPostTime() {
        Long value = this.postTimeLiveData.getValue();
        if (value == null) {
            value = Long.valueOf(System.currentTimeMillis());
        }
        return value.longValue();
    }

    public final void post(@NotNull String userId) {
        if (this.tempLiveData.getValue() == null || this.postTimeLiveData.getValue() == null) {
            return;
        }
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new TempAddDataViewModel$post$$inlined$safeLaunch$1(null, this, userId), 2, null);
    }

    public final void setPostTime(long time) {
        this.postTimeLiveData.setValue(Long.valueOf(time));
    }

    public final void setTemp(@NotNull String tempInput) {
        this.tempLiveData.setValue(tempInput);
    }
}
