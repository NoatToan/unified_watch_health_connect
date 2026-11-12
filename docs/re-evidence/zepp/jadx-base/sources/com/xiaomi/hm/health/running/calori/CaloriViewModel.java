package com.xiaomi.hm.health.running.calori;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/running/calori/CaloriViewModel;", "Landroidx/lifecycle/ViewModel;", "", "currentTimeMillis", "", "calculateRestCal", "Landroidx/lifecycle/MutableLiveData;", "", "a", "Landroidx/lifecycle/MutableLiveData;", "_restCal", "Landroidx/lifecycle/LiveData;", "b", "Landroidx/lifecycle/LiveData;", "getRestCal", "()Landroidx/lifecycle/LiveData;", "restCal", "c", LogUtil.I, "getCurrentDayPosition", "()I", "setCurrentDayPosition", "(I)V", "currentDayPosition", GoogleApiAvailabilityLight.a, "getCurrentWeekPosition", "setCurrentWeekPosition", "currentWeekPosition", "e", "getCurrentMonthPosition", "setCurrentMonthPosition", "currentMonthPosition", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CaloriViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> _restCal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Integer> restCal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int currentDayPosition;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int currentWeekPosition;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int currentMonthPosition;

    public CaloriViewModel() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this._restCal = mutableLiveData;
        this.restCal = mutableLiveData;
        this.currentDayPosition = -1;
        this.currentWeekPosition = -1;
        this.currentMonthPosition = -1;
    }

    public final void calculateRestCal(long currentTimeMillis) {
        this._restCal.postValue(Integer.valueOf(CalorieHelper.INSTANCE.getRestCalByUser(currentTimeMillis)));
    }

    public final int getCurrentDayPosition() {
        return this.currentDayPosition;
    }

    public final int getCurrentMonthPosition() {
        return this.currentMonthPosition;
    }

    public final int getCurrentWeekPosition() {
        return this.currentWeekPosition;
    }

    @NotNull
    public final LiveData<Integer> getRestCal() {
        return this.restCal;
    }

    public final void setCurrentDayPosition(int i) {
        this.currentDayPosition = i;
    }

    public final void setCurrentMonthPosition(int i) {
        this.currentMonthPosition = i;
    }

    public final void setCurrentWeekPosition(int i) {
        this.currentWeekPosition = i;
    }
}
