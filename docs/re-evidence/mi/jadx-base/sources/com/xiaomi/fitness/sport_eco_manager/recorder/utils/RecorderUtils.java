package com.xiaomi.fitness.sport_eco_manager.recorder.utils;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/recorder/utils/RecorderUtils;", "", "<init>", "()V", "isSupportRecover", "", DailyRecordKey.sportType, "", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecorderUtils {

    @NotNull
    public static final RecorderUtils INSTANCE = new RecorderUtils();

    private RecorderUtils() {
    }

    public final boolean isSupportRecover(int sportType) {
        return sportType == 1 || sportType == 2 || sportType == 3 || sportType == 6 || sportType == 7;
    }
}
