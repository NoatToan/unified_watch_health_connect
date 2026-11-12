package com.xiaomi.fit.fitness.persist.server.data;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"ONE_DAY_TIME_IN_SEC", "", "getONE_DAY_TIME_IN_SEC", "()J", "fitness-data-core_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FitnessRequestParamKt {
    private static final long ONE_DAY_TIME_IN_SEC = TimeUnit.DAYS.toSeconds(1);

    public static final long getONE_DAY_TIME_IN_SEC() {
        return ONE_DAY_TIME_IN_SEC;
    }
}
