package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import defpackage.CoachingWorkoutType;
import defpackage.c3;
import defpackage.tet;
import defpackage.y2;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/CoachingInfo;", "Ljava/io/Serializable;", "", "toString", "", "segmentCount", "I", "getSegmentCount", "()I", "score", "getScore", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "coachingId", "J", "getCoachingId", "()J", "Lq4;", "workoutType", "Lq4;", "getWorkoutType", "()Lq4;", "", "data", "<init>", "([B)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class CoachingInfo implements Serializable {
    private static final int COACHING_ID_LEN = 8;
    private static final int COACHING_ID_START_INDEX = 44;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DATA_COUNT_LEN = 2;
    public static final int DATA_LENGTH = 52;
    private static final int DATA_MIN_LEN = 44;
    private static final int DATA_SCORE_LEN = 2;
    public static final long INVALID_COACHING_ID = -1;
    public static final int INVALID_SCORE = -1;
    private static final int MAX_SCORE = 999;
    private static final int NAME_LEN = 40;
    private static final int NAME_START_INDEX = 4;
    private static final int SCORE_START_INDEX = 2;
    private static final int WORKOUT_TYPE_INDEX = 3;
    private static final int WORKOUT_TYPE_LEN = 1;
    private static final long serialVersionUID = 1;
    private final long coachingId;

    @NotNull
    private final String name;
    private final int score;
    private final int segmentCount;

    @NotNull
    private final CoachingWorkoutType workoutType;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/CoachingInfo$Companion;", "", "()V", "COACHING_ID_LEN", "", "COACHING_ID_START_INDEX", "DATA_COUNT_LEN", "DATA_LENGTH", "DATA_MIN_LEN", "DATA_SCORE_LEN", "INVALID_COACHING_ID", "", "INVALID_SCORE", "MAX_SCORE", "NAME_LEN", "NAME_START_INDEX", "SCORE_START_INDEX", "WORKOUT_TYPE_INDEX", "WORKOUT_TYPE_LEN", "serialVersionUID", "getValidScore", "score", "getValidScore$bluetooth_release", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getValidScore$bluetooth_release(int score) {
            if (score > 999 || score < 0) {
                return -1;
            }
            return score;
        }
    }

    public CoachingInfo(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length < 44) {
            this.name = "";
            this.score = -1;
            this.workoutType = CoachingWorkoutType.g.d;
            this.segmentCount = 0;
            this.coachingId = -1L;
            return;
        }
        this.segmentCount = c3.a(data, 2, 0, 2, null);
        this.score = INSTANCE.getValidScore$bluetooth_release(c3.a(new byte[]{data[2], (byte) (data[3] & 15)}, 2, 0, 2, null));
        this.workoutType = CoachingWorkoutType.c.a(c3.a(data, 1, 3) >> 5);
        this.name = y2.a(ArraysKt___ArraysJvmKt.copyOfRange(data, 4, 44), 0, 40);
        this.coachingId = data.length > 44 ? tet.v(data, 44, 8) : -1L;
    }

    public final long getCoachingId() {
        return this.coachingId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getScore() {
        return this.score;
    }

    public final int getSegmentCount() {
        return this.segmentCount;
    }

    @NotNull
    public final CoachingWorkoutType getWorkoutType() {
        return this.workoutType;
    }

    @NotNull
    public String toString() {
        return "CoachingInfo(coachingId='" + this.coachingId + "',name='" + this.name + "', score='" + this.score + "', workoutType='" + this.workoutType + "', segmentCount='" + this.segmentCount + "')";
    }
}
