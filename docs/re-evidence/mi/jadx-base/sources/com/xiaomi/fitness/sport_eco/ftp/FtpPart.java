package com.xiaomi.fitness.sport_eco.ftp;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/FtpPart;", "", "<init>", "(Ljava/lang/String;I)V", "START_WARMING_UP", "WARMING_UP", "TEST_IS_ABOUT_TO_START", "TEST_START", "KEEP_GOING", "DAWN_IS_COMING", "NEW_STAGE_BEGINS", "THE_ENERGY_RING_STARTS_CHARGING", "COMPLETE_TEST", "TRUST_ME", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum FtpPart {
    START_WARMING_UP,
    WARMING_UP,
    TEST_IS_ABOUT_TO_START,
    TEST_START,
    KEEP_GOING,
    DAWN_IS_COMING,
    NEW_STAGE_BEGINS,
    THE_ENERGY_RING_STARTS_CHARGING,
    COMPLETE_TEST,
    TRUST_ME;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<FtpPart> getEntries() {
        return $ENTRIES;
    }
}
