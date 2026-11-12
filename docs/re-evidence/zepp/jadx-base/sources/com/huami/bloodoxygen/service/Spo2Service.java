package com.huami.bloodoxygen.service;

import com.huami.bloodoxygen.service.odi.SleepBreathScore;
import com.huami.bloodoxygen.service.osaevent.DifficultBreath;
import com.huami.bloodoxygen.service.other.Spo2;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&J$\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0002H&J.\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005H&¨\u0006\u000f"}, d2 = {"Lcom/huami/bloodoxygen/service/Spo2Service;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/bloodoxygen/service/other/Spo2;", "getLatestClickSpo2Flow", "", "from", "to", "", "Lcom/huami/bloodoxygen/service/odi/SleepBreathScore;", "getSleepBreathScoreListFlow", "getLatestSleepBreathScoreFlow", "splitIntervalTimeMillis", "Lcom/huami/bloodoxygen/service/osaevent/DifficultBreath;", "getDifficultBreathListFlow", "service_release"}, k = 1, mv = {1, 4, 1})
public interface Spo2Service {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Flow getDifficultBreathListFlow$default(Spo2Service spo2Service, long j, long j2, long j3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDifficultBreathListFlow");
            }
            if ((i & 4) != 0) {
                j3 = 3600000;
            }
            return spo2Service.getDifficultBreathListFlow(j, j2, j3);
        }
    }

    @NotNull
    Flow<List<DifficultBreath>> getDifficultBreathListFlow(long from, long to, long splitIntervalTimeMillis);

    @NotNull
    Flow<Spo2> getLatestClickSpo2Flow();

    @NotNull
    Flow<SleepBreathScore> getLatestSleepBreathScoreFlow();

    @NotNull
    Flow<List<SleepBreathScore>> getSleepBreathScoreListFlow(long from, long to);
}
