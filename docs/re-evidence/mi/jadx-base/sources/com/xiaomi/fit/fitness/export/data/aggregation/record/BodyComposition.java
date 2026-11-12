package com.xiaomi.fit.fitness.export.data.aggregation.record;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/record/BodyComposition;", "", "<init>", "(Ljava/lang/String;I)V", "WEIGHT", "BODY_FAT_RATE", "MOISTURE_RATE", "BONE_MASS", "BASAL_METABOLISM", "MUSCLE_RATE", "PROTEIN_RATE", "VISCERAL_FAT", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum BodyComposition {
    WEIGHT,
    BODY_FAT_RATE,
    MOISTURE_RATE,
    BONE_MASS,
    BASAL_METABOLISM,
    MUSCLE_RATE,
    PROTEIN_RATE,
    VISCERAL_FAT;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<BodyComposition> getEntries() {
        return $ENTRIES;
    }
}
