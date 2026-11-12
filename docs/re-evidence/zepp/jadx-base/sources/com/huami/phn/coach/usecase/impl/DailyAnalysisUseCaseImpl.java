package com.huami.phn.coach.usecase.impl;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.phn.coach.usecase.DailyAnalysisUseCase;
import com.huami.phn.coach.usecase.GetPHNDailyAnalysisResultUseCase;
import com.huami.phn.coach.usecase.PhnDailyAnalysis;
import com.huami.phn.core.model.PHNDailyAnalysisResult;
import com.huami.phn.core.source.LocalDataSource;
import com.huami.tools.log.HMLog;
import com.xiaomi.mipush.sdk.Constants;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B!\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/phn/coach/usecase/impl/DailyAnalysisUseCaseImpl;", "Lcom/huami/phn/coach/usecase/DailyAnalysisUseCase;", "", "size", "", "Lcom/huami/phn/coach/usecase/PhnDailyAnalysis;", PointCategory.LOAD, "", "a", "Ljava/lang/Long;", BloodPressureConst.ParamKey.PLANID, "Lcom/huami/phn/core/source/LocalDataSource;", "b", "Lcom/huami/phn/core/source/LocalDataSource;", "localDataSource", "Lcom/huami/phn/coach/usecase/GetPHNDailyAnalysisResultUseCase;", "c", "Lcom/huami/phn/coach/usecase/GetPHNDailyAnalysisResultUseCase;", "getFromWebUseCase", GoogleApiAvailabilityLight.a, "J", "currentOldestTimestamp", "<init>", "(Ljava/lang/Long;Lcom/huami/phn/core/source/LocalDataSource;Lcom/huami/phn/coach/usecase/GetPHNDailyAnalysisResultUseCase;)V", "Companion", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class DailyAnalysisUseCaseImpl implements DailyAnalysisUseCase {

    @NotNull
    private static final String e = "DailyAnalysisUseCaseImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Long planId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource localDataSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final GetPHNDailyAnalysisResultUseCase getFromWebUseCase;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long currentOldestTimestamp;

    public DailyAnalysisUseCaseImpl(@Nullable Long l, @NotNull LocalDataSource localDataSource, @NotNull GetPHNDailyAnalysisResultUseCase getPHNDailyAnalysisResultUseCase) {
        this.planId = l;
        this.localDataSource = localDataSource;
        this.getFromWebUseCase = getPHNDailyAnalysisResultUseCase;
    }

    @Override // com.huami.phn.coach.usecase.DailyAnalysisUseCase
    @NotNull
    public List<PhnDailyAnalysis> load(int size) {
        ArrayList arrayList = new ArrayList();
        Long l = this.planId;
        List<PHNDailyAnalysisResult> listQueryOldestDailyResultByPlanId = l == null ? null : this.localDataSource.queryOldestDailyResultByPlanId(l.longValue());
        if (listQueryOldestDailyResultByPlanId == null) {
            listQueryOldestDailyResultByPlanId = this.localDataSource.queryOldestDailyResult();
        }
        this.getFromWebUseCase.load(listQueryOldestDailyResultByPlanId.isEmpty() ? null : Long.valueOf(((PHNDailyAnalysisResult) CollectionsKt.first((List) listQueryOldestDailyResultByPlanId)).getTimestamp()), -1);
        HMLog.i(e, "query timestamp: " + this.currentOldestTimestamp, new Object[0]);
        Long l2 = this.planId;
        List<PHNDailyAnalysisResult> listQueryDailyResultByPlanId = l2 != null ? this.localDataSource.queryDailyResultByPlanId(size, Long.valueOf(this.currentOldestTimestamp), l2.longValue()) : null;
        if (listQueryDailyResultByPlanId == null) {
            listQueryDailyResultByPlanId = this.localDataSource.queryDailyResult(size, Long.valueOf(this.currentOldestTimestamp));
        }
        for (PHNDailyAnalysisResult pHNDailyAnalysisResult : listQueryDailyResultByPlanId) {
            long timestamp = pHNDailyAnalysisResult.getTimestamp();
            int timezoneOffset = pHNDailyAnalysisResult.getTimezoneOffset();
            String str = timezoneOffset > 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "+";
            int iAbs = Math.abs(timezoneOffset);
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(String.format("GMT%s%02d:%02d", Arrays.copyOf(new Object[]{str, Integer.valueOf(iAbs / 60), Integer.valueOf(iAbs % 60)}, 3))));
            calendar.setTimeInMillis(timestamp);
            arrayList.add(new PhnDailyAnalysis(calendar, pHNDailyAnalysisResult.getResult().getAtl(), pHNDailyAnalysisResult.getResult().getCtl(), pHNDailyAnalysisResult.getResult().getTsb()));
        }
        if (arrayList.size() > 1) {
            g.sortWith(arrayList, new Comparator() { // from class: com.huami.phn.coach.usecase.impl.DailyAnalysisUseCaseImpl$load$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((PhnDailyAnalysis) t2).getDate().getTimeInMillis()), Long.valueOf(((PhnDailyAnalysis) t).getDate().getTimeInMillis()));
                }
            });
        }
        if (arrayList.size() > 0) {
            this.currentOldestTimestamp = ((PhnDailyAnalysis) CollectionsKt.last((List) arrayList)).getDate().getTimeInMillis();
        }
        return arrayList;
    }
}
