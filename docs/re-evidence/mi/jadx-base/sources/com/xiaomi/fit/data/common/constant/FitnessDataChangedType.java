package com.xiaomi.fit.data.common.constant;

import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.fitness.sport_manager.utils.SportUtilsKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fit/data/common/constant/FitnessDataChangedType;", "", "<init>", "(Ljava/lang/String;I)V", SportUtilsKt.TAG, AIApiConstants.Fitness.NAME, "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum FitnessDataChangedType {
    Sport,
    Fitness;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<FitnessDataChangedType> getEntries() {
        return $ENTRIES;
    }
}
