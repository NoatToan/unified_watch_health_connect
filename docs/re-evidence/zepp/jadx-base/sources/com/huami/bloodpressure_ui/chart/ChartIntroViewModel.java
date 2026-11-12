package com.huami.bloodpressure_ui.chart;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/ChartIntroViewModel;", "Landroidx/lifecycle/ViewModel;", "", "enable", "", "setBtnStatusEnable", "checked", "setBtnStatusChecked", "Lcom/huami/bloodpressure_ui/chart/ChartIntroButtonState;", "chartIntroButtonState", "setBtnStatus", "Landroidx/lifecycle/MutableLiveData;", "a", "Landroidx/lifecycle/MutableLiveData;", "_btnStatus", "b", "getBtnStatus", "()Landroidx/lifecycle/MutableLiveData;", "btnStatus", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ChartIntroViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<ChartIntroButtonState> _btnStatus;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<ChartIntroButtonState> btnStatus;

    public ChartIntroViewModel() {
        MutableLiveData<ChartIntroButtonState> mutableLiveData = new MutableLiveData<>(ChartIntroButtonState.ChartIntroButtonUnChecked.INSTANCE);
        this._btnStatus = mutableLiveData;
        this.btnStatus = mutableLiveData;
    }

    @NotNull
    public final MutableLiveData<ChartIntroButtonState> getBtnStatus() {
        return this.btnStatus;
    }

    public final void setBtnStatus(@NotNull ChartIntroButtonState chartIntroButtonState) {
        this._btnStatus.setValue(chartIntroButtonState);
    }

    public final void setBtnStatusChecked(boolean checked) {
        this._btnStatus.postValue(checked ? ChartIntroButtonState.ChartIntroButtonChecked.INSTANCE : ChartIntroButtonState.ChartIntroButtonUnChecked.INSTANCE);
    }

    public final void setBtnStatusEnable(boolean enable) {
        this._btnStatus.postValue(enable ? ChartIntroButtonState.ChartIntroButtonUnChecked.INSTANCE : ChartIntroButtonState.ChartIntroButtonUnable.INSTANCE);
    }
}
