package com.xiaomi.fitness.relative.threetarget.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fitness.baseui.AbsViewModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/relative/threetarget/viewmodel/DataRegularTargetViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "regularTargetReport", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "getRegularTargetReport", "()Landroidx/lifecycle/MutableLiveData;", "currentSelectedDate", "Lorg/joda/time/LocalDate;", "getCurrentSelectedDate", "relativeUid", "", "getRelativeUid", "()J", "setRelativeUid", "(J)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DataRegularTargetViewModel extends AbsViewModel {

    @NotNull
    private final MutableLiveData<DailyGoalReport> regularTargetReport = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<LocalDate> currentSelectedDate = new MutableLiveData<>();
    private long relativeUid = -1;

    @NotNull
    public final MutableLiveData<LocalDate> getCurrentSelectedDate() {
        return this.currentSelectedDate;
    }

    @NotNull
    public final MutableLiveData<DailyGoalReport> getRegularTargetReport() {
        return this.regularTargetReport;
    }

    public final long getRelativeUid() {
        return this.relativeUid;
    }

    public final void setRelativeUid(long j) {
        this.relativeUid = j;
    }
}
