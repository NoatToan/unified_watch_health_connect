package com.xiaomi.fit.fitness.device.hm.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/data/HmSportMode;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Ordinary", "IntervalRunning", "CourseSport", "TrainingTemplate", "IntervalTraining", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum HmSportMode {
    Ordinary(0),
    IntervalRunning(1),
    CourseSport(2),
    TrainingTemplate(3),
    IntervalTraining(4);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int value;

    HmSportMode(int i) {
        this.value = i;
    }

    @NotNull
    public static EnumEntries<HmSportMode> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
