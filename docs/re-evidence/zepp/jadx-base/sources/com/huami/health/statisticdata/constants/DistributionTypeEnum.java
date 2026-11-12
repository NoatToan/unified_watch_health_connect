package com.huami.health.statisticdata.constants;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/huami/health/statisticdata/constants/DistributionTypeEnum;", "", "", "typeName", "Ljava/lang/String;", "getTypeName", "()Ljava/lang/String;", "", "categoryGap", LogUtil.I, "getCategoryGap", "()I", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "ACTIVITY_STEP_TTL", "SLEEP_START", "SLEEP_DEEP_DURATION", "SLEEP_SCORE_V2", "BODY_HEIGHT", "BODY_WEIGHT", "ACTIVITY_TIME", "statisticdata_release"}, k = 1, mv = {1, 4, 0})
public enum DistributionTypeEnum {
    ACTIVITY_STEP_TTL("activity_step_ttl", 500),
    SLEEP_START("sleep_start", 1),
    SLEEP_DEEP_DURATION("sleep_deep_duration", 1),
    SLEEP_SCORE_V2("sleep_score_v2", 1),
    BODY_HEIGHT(StatisticDataConstantsKt.BODY_HEIGHT_STR, 5),
    BODY_WEIGHT(StatisticDataConstantsKt.BODY_WEIGHT_STR, 5),
    ACTIVITY_TIME(StatisticDataConstantsKt.ACTIVITY_TIME_STR, 500);

    private final int categoryGap;

    @NotNull
    private final String typeName;

    DistributionTypeEnum(String str, int i) {
        this.typeName = str;
        this.categoryGap = i;
    }

    public final int getCategoryGap() {
        return this.categoryGap;
    }

    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }
}
