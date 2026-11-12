package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.sport.coaching.CoachingWorkoutType;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0019\u0010\u0012\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0017\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001d\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/CoachingInfo;", "Ljava/io/Serializable;", "", "toString", "", "a", LogUtil.I, "getSegmentCount", "()I", "segmentCount", "b", "getScore", "score", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType;", "c", "Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType;", "getWorkoutType", "()Lcom/xiaomi/hm/health/bt/profile/sport/coaching/CoachingWorkoutType;", "workoutType", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "e", "J", "getCoachingId", "()J", "coachingId", "", "data", "<init>", "([B)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class CoachingInfo implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int DATA_LENGTH = 52;
    public static final long INVALID_COACHING_ID = -1;
    public static final int INVALID_SCORE = -1;
    private static final int f = 2;
    private static final int g = 2;
    private static final int h = 2;
    private static final int i = 3;
    private static final int j = 1;
    private static final int k = 4;
    private static final int l = 40;
    private static final int m = 44;
    private static final int n = 8;
    private static final int o = 44;
    private static final int p = 999;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int segmentCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int score;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final CoachingWorkoutType workoutType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final long coachingId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0016\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u0016\u0010\u0018\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/CoachingInfo$Companion;", "", "", "score", "getValidScore$bluetooth_release", "(I)I", "getValidScore", "COACHING_ID_LEN", LogUtil.I, "COACHING_ID_START_INDEX", "DATA_COUNT_LEN", "DATA_LENGTH", "DATA_MIN_LEN", "DATA_SCORE_LEN", "", "INVALID_COACHING_ID", "J", "INVALID_SCORE", "MAX_SCORE", "NAME_LEN", "NAME_START_INDEX", "SCORE_START_INDEX", "WORKOUT_TYPE_INDEX", "WORKOUT_TYPE_LEN", "serialVersionUID", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
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

    public CoachingInfo(@NotNull byte[] bArr) {
        if (bArr.length < 44) {
            this.name = "";
            this.score = -1;
            this.workoutType = CoachingWorkoutType.Unknown.INSTANCE;
            this.segmentCount = 0;
            this.coachingId = -1L;
            return;
        }
        this.segmentCount = ByteUtilsKt.toInt$default(bArr, 2, 0, 2, null);
        this.score = INSTANCE.getValidScore$bluetooth_release(ByteUtilsKt.toInt$default(new byte[]{bArr[2], (byte) (bArr[3] & 15)}, 2, 0, 2, null));
        this.workoutType = CoachingWorkoutType.INSTANCE.valueOf(ByteUtilsKt.toInt(bArr, 1, 3) >> 5);
        this.name = ByteArrayKt.toString(ArraysKt___ArraysJvmKt.copyOfRange(bArr, 4, 44), 0, 40);
        this.coachingId = bArr.length > 44 ? GattUtils.bytesToLong(bArr, 44, 8) : -1L;
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
