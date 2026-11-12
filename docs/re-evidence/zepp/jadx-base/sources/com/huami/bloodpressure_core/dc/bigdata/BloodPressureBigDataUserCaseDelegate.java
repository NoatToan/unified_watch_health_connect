package com.huami.bloodpressure_core.dc.bigdata;

import com.huami.bigdata.statistics.bloodpressure.BloodPressureBigDataUseCase;
import com.huami.bigdata.statistics.bloodpressure.BloodPressureStatistics;
import com.huami.bigdata.statistics.core.resource.Resource;
import com.huami.bloodpressure_core.ext.TimeFormatEx;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007J#\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J#\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/huami/bloodpressure_core/dc/bigdata/BloodPressureBigDataUserCaseDelegate;", "", "", "startTimeStamp", "Lcom/huami/bigdata/statistics/core/resource/Resource;", "Lcom/huami/bigdata/statistics/bloodpressure/BloodPressureStatistics;", "getDay", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeek", "getMonth", "getYear", "Lcom/huami/bigdata/statistics/bloodpressure/BloodPressureBigDataUseCase;", "a", "Lcom/huami/bigdata/statistics/bloodpressure/BloodPressureBigDataUseCase;", "iBloodPressureBigDataUseCase", "<init>", "(Lcom/huami/bigdata/statistics/bloodpressure/BloodPressureBigDataUseCase;)V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureBigDataUserCaseDelegate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BloodPressureBigDataUseCase iBloodPressureBigDataUseCase;

    public BloodPressureBigDataUserCaseDelegate(@NotNull BloodPressureBigDataUseCase bloodPressureBigDataUseCase) {
        this.iBloodPressureBigDataUseCase = bloodPressureBigDataUseCase;
    }

    @Nullable
    public final Object getDay(long j, @NotNull Continuation<? super Resource<BloodPressureStatistics>> continuation) {
        return this.iBloodPressureBigDataUseCase.getDay(TimeFormatEx.INSTANCE.formatTimeYMDInter(j), continuation);
    }

    @Nullable
    public final Object getMonth(long j, @NotNull Continuation<? super Resource<BloodPressureStatistics>> continuation) {
        return this.iBloodPressureBigDataUseCase.getMonth(TimeFormatEx.INSTANCE.formatTimeYMDInter(j), continuation);
    }

    @Nullable
    public final Object getWeek(long j, @NotNull Continuation<? super Resource<BloodPressureStatistics>> continuation) {
        return this.iBloodPressureBigDataUseCase.getWeek(TimeFormatEx.INSTANCE.formatTimeYMDInter(j), continuation);
    }

    @Nullable
    public final Object getYear(long j, @NotNull Continuation<? super Resource<BloodPressureStatistics>> continuation) {
        return this.iBloodPressureBigDataUseCase.getYear(TimeFormatEx.INSTANCE.formatTimeYMDInter(j), continuation);
    }
}
