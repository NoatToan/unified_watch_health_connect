package com.huami.bloodpressure_ui.tab;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/bloodpressure_ui/tab/BloodPressureTabViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/bloodpressure_ui/tab/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "setTimeMode", "Landroidx/lifecycle/MutableLiveData;", "a", "Landroidx/lifecycle/MutableLiveData;", "_currentTimeMode", "b", "getCurrentTimeMode", "()Landroidx/lifecycle/MutableLiveData;", "currentTimeMode", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureTabViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TimeMode> _currentTimeMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TimeMode> currentTimeMode;

    public BloodPressureTabViewModel() {
        MutableLiveData<TimeMode> mutableLiveData = new MutableLiveData<>(TimeMode.DAY);
        this._currentTimeMode = mutableLiveData;
        this.currentTimeMode = mutableLiveData;
    }

    @NotNull
    public final MutableLiveData<TimeMode> getCurrentTimeMode() {
        return this.currentTimeMode;
    }

    public final void setTimeMode(@NotNull TimeMode timeMode) {
        this._currentTimeMode.postValue(timeMode);
    }
}
