package com.xiaomi.fitness.sport_eco.ftp;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/ftp/FtpChartType;", "", "item", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getItem", "()Ljava/lang/String;", "TIME", "DISTANCE", "BPM", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum FtpChartType {
    TIME("time"),
    DISTANCE("distance"),
    BPM("bpm");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final String item;

    FtpChartType(String str) {
        this.item = str;
    }

    @NotNull
    public static EnumEntries<FtpChartType> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getItem() {
        return this.item;
    }
}
