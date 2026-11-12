package com.huami.watch.companion.ui.arch;

import android.app.Application;
import androidx.core.util.Consumer;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.dataflow.HealthData;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.ui.arch.HealthConfigViewModel;
import com.huami.watch.util.Rx;
import com.xiaomi.hm.health.device.event.StatEvent;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00130\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000eR\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/huami/watch/companion/ui/arch/HealthConfigViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "", StatEvent.EventParams.TYPE_CARD_GOAL, "", "saveCalorieGoal", "", Constants.ENABLED, "saveLongSitRemind", "saveStepGoalRemind", "Landroidx/lifecycle/MutableLiveData;", "a", "Landroidx/lifecycle/MutableLiveData;", "getLongSitRemindLiveData", "()Landroidx/lifecycle/MutableLiveData;", "longSitRemindLiveData", "b", "getStepGoalRemindLiveData", "stepGoalRemindLiveData", "Lcom/huami/watch/companion/arch/Result;", "c", "getSyncStatusLiveData", "syncStatusLiveData", GoogleApiAvailabilityLight.a, "getCalorieGoalLiveData", "calorieGoalLiveData", "Landroid/app/Application;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/app/Application;)V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class HealthConfigViewModel extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> longSitRemindLiveData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> stepGoalRemindLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Result<Boolean>> syncStatusLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> calorieGoalLiveData;

    public HealthConfigViewModel(@NotNull Application application) {
        super(application);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.longSitRemindLiveData = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.stepGoalRemindLiveData = mutableLiveData2;
        this.syncStatusLiveData = new MutableLiveData<>();
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        this.calorieGoalLiveData = mutableLiveData3;
        mutableLiveData3.setValue(Integer.valueOf(HealthData.getUserGoalCal(application)));
        mutableLiveData.setValue(Boolean.valueOf(HealthData.isLongSitRemindEnable(application)));
        mutableLiveData2.setValue(Boolean.valueOf(HealthData.isStepGoalRemindEnable(application)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final HealthConfigViewModel healthConfigViewModel, final int i, final Boolean bool) {
        Rx.mainThread(new Runnable() { // from class: pu3
            @Override // java.lang.Runnable
            public final void run() {
                HealthConfigViewModel.i(bool, healthConfigViewModel, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Boolean bool, HealthConfigViewModel healthConfigViewModel, int i) {
        if (!bool.booleanValue()) {
            healthConfigViewModel.getSyncStatusLiveData().postValue(Result.error());
        } else {
            healthConfigViewModel.getCalorieGoalLiveData().setValue(Integer.valueOf(i));
            healthConfigViewModel.getSyncStatusLiveData().postValue(Result.success(bool));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final HealthConfigViewModel healthConfigViewModel, final boolean z, final Boolean bool) {
        Rx.mainThread(new Runnable() { // from class: qu3
            @Override // java.lang.Runnable
            public final void run() {
                HealthConfigViewModel.k(bool, healthConfigViewModel, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Boolean bool, HealthConfigViewModel healthConfigViewModel, boolean z) {
        if (!bool.booleanValue()) {
            healthConfigViewModel.getSyncStatusLiveData().postValue(Result.error());
        } else {
            healthConfigViewModel.getLongSitRemindLiveData().setValue(Boolean.valueOf(z));
            healthConfigViewModel.getSyncStatusLiveData().postValue(Result.success(bool));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(final HealthConfigViewModel healthConfigViewModel, final boolean z, final Boolean bool) {
        Rx.mainThread(new Runnable() { // from class: ru3
            @Override // java.lang.Runnable
            public final void run() {
                HealthConfigViewModel.n(bool, healthConfigViewModel, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(Boolean bool, HealthConfigViewModel healthConfigViewModel, boolean z) {
        if (!bool.booleanValue()) {
            healthConfigViewModel.getSyncStatusLiveData().postValue(Result.error());
        } else {
            healthConfigViewModel.getStepGoalRemindLiveData().setValue(Boolean.valueOf(z));
            healthConfigViewModel.getSyncStatusLiveData().postValue(Result.success(bool));
        }
    }

    @NotNull
    public final MutableLiveData<Integer> getCalorieGoalLiveData() {
        return this.calorieGoalLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getLongSitRemindLiveData() {
        return this.longSitRemindLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getStepGoalRemindLiveData() {
        return this.stepGoalRemindLiveData;
    }

    @NotNull
    public final MutableLiveData<Result<Boolean>> getSyncStatusLiveData() {
        return this.syncStatusLiveData;
    }

    public final void saveCalorieGoal(final int goal) {
        Integer value = this.calorieGoalLiveData.getValue();
        if (value != null && value.intValue() == goal) {
            return;
        }
        this.syncStatusLiveData.postValue(Result.loading());
        SyncUtil.syncUserCalorieGoalToWatch(getApplication(), goal, new Consumer() { // from class: mu3
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                HealthConfigViewModel.h(this.a, goal, (Boolean) obj);
            }
        });
    }

    public final void saveLongSitRemind(final boolean enabled) {
        if (Intrinsics.areEqual(this.longSitRemindLiveData.getValue(), Boolean.valueOf(enabled))) {
            return;
        }
        this.syncStatusLiveData.postValue(Result.loading());
        SyncUtil.syncLongSitRemindToWatch(getApplication(), enabled, new Consumer() { // from class: nu3
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                HealthConfigViewModel.j(this.a, enabled, (Boolean) obj);
            }
        });
    }

    public final void saveStepGoalRemind(final boolean enabled) {
        if (Intrinsics.areEqual(this.stepGoalRemindLiveData.getValue(), Boolean.valueOf(enabled))) {
            return;
        }
        this.syncStatusLiveData.postValue(Result.loading());
        SyncUtil.syncStepGoalRemindToWatch(getApplication(), enabled, new Consumer() { // from class: ou3
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                HealthConfigViewModel.m(this.a, enabled, (Boolean) obj);
            }
        });
    }
}
