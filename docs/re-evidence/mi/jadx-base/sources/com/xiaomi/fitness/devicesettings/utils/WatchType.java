package com.xiaomi.fitness.devicesettings.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/utils/WatchType;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "TYPE_ROUND_WATCH", "TYPE_SQUARE_WATCH", "TYPE_ROUND_BAND", "TYPE_SQUARE_BAND", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum WatchType {
    TYPE_ROUND_WATCH(1),
    TYPE_SQUARE_WATCH(2),
    TYPE_ROUND_BAND(3),
    TYPE_SQUARE_BAND(4);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    WatchType(int i) {
    }

    @NotNull
    public static EnumEntries<WatchType> getEntries() {
        return $ENTRIES;
    }
}
