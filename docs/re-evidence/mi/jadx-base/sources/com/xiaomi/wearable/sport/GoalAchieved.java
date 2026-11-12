package com.xiaomi.wearable.sport;

import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/wearable/sport/GoalAchieved;", "", "<init>", "()V", SportDataTypeKt.DIMEN_TOTAL, "", "achieved", "minute", "", "second", "percent", "goalType", DailyRecordKey.sportType, "distance", "jumpCount", "toString", "", "Companion", "common-exoplay_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GoalAchieved {
    public static final int CALORIES = 2;
    public static final int COUNT = 6;
    public static final int DISTANCE = 0;
    public static final int MINUTE = 1;
    public static final int RIDING = 6;
    public static final int ROPE_SKIPPING = 14;
    public static final int RUN = 1;
    public static final int RUNNING_INDOOR = 3;
    public static final int WALKING = 2;

    @JvmField
    public float achieved;

    @JvmField
    public int distance;

    @JvmField
    public int goalType;

    @JvmField
    public int jumpCount;

    @JvmField
    public int minute;

    @JvmField
    public int percent;

    @JvmField
    public int second;

    @JvmField
    public int sportType;

    @JvmField
    public float total;

    @NotNull
    public String toString() {
        return "GoalAchieved{total=" + this.total + ", achieved=" + this.achieved + ", minute=" + this.minute + ", second=" + this.second + ", percent=" + this.percent + ", goalType=" + this.goalType + ", sportType=" + this.sportType + ", distance=" + this.distance + ", jumpCount=" + this.jumpCount + "}";
    }
}
