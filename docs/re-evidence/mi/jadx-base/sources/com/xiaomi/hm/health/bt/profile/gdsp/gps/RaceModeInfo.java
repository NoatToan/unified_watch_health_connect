package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import defpackage.c3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0003\u0019\u001a\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo;", "Ljava/io/Serializable;", "data", "", "([B)V", "raceDirection", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection;", "getRaceDirection", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection;", "raceDistance", "", "getRaceDistance", "()I", "raceTrackId", "", "getRaceTrackId", "()J", "raceType", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType;", "getRaceType", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType;", "isRaceMode", "", "toString", "", "Companion", "RaceDirection", "RaceType", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RaceModeInfo implements Serializable {
    public static final int DATA_MIN_LEN = 12;
    private static final int RACE_DIRECTION_END = 2;
    private static final int RACE_DIRECTION_START = 4;
    private static final int RACE_DISTANCE_END = 8;
    private static final int RACE_TRACK_ID_END = 12;
    private static final int RACE_TYPE_END = 1;
    private static final int RACE_TYPE_START = 0;
    private static final long serialVersionUID = 1;

    @NotNull
    private final RaceDirection raceDirection;
    private final int raceDistance;
    private final long raceTrackId;

    @NotNull
    private final RaceType raceType;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000e2\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0004\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection;", "", "name", "", "direction", "", "(Ljava/lang/String;I)V", "getDirection", "()I", "getName$bluetooth_release", "()Ljava/lang/String;", "toString", "Ahead", "Behind", "Companion", "Target", "Unknown", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection$Ahead;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection$Behind;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection$Target;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection$Unknown;", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class RaceDirection {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final int direction;

        @NotNull
        private final String name;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection$Ahead;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Ahead extends RaceDirection {

            @NotNull
            public static final Ahead INSTANCE = new Ahead();

            private Ahead() {
                super("Ahead", 1, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection$Behind;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Behind extends RaceDirection {

            @NotNull
            public static final Behind INSTANCE = new Behind();

            private Behind() {
                super("Behind", 2, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection$Companion;", "", "()V", "valueOf", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection;", "type", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final RaceDirection valueOf(int type) {
                Target target = Target.INSTANCE;
                if (type == target.getDirection()) {
                    return target;
                }
                Ahead ahead = Ahead.INSTANCE;
                if (type == ahead.getDirection()) {
                    return ahead;
                }
                Behind behind = Behind.INSTANCE;
                return type == behind.getDirection() ? behind : Unknown.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection$Target;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Target extends RaceDirection {

            @NotNull
            public static final Target INSTANCE = new Target();

            private Target() {
                super("Target", 0, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection$Unknown;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Unknown extends RaceDirection {

            @NotNull
            public static final Unknown INSTANCE = new Unknown();

            private Unknown() {
                super("Unknown", -1, null);
            }
        }

        public /* synthetic */ RaceDirection(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        @JvmStatic
        @NotNull
        public static final RaceDirection valueOf(int i) {
            return INSTANCE.valueOf(i);
        }

        public final int getDirection() {
            return this.direction;
        }

        @NotNull
        /* JADX INFO: renamed from: getName$bluetooth_release, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public String toString() {
            return "RaceDirection(name='" + this.name + "', direction=" + this.direction + ')';
        }

        private RaceDirection(String str, int i) {
            this.name = str;
            this.direction = i;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \f2\u00020\u0001:\u0004\f\r\u000e\u000fB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType;", "", "name", "", "type", "", "(Ljava/lang/String;I)V", "getName$bluetooth_release", "()Ljava/lang/String;", "getType", "()I", "toString", "Companion", "Normal", "RaceMode", "Unknown", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType$Normal;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType$RaceMode;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType$Unknown;", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class RaceType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String name;
        private final int type;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType$Companion;", "", "()V", "valueOf", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType;", "type", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final RaceType valueOf(int type) {
                Normal normal = Normal.INSTANCE;
                if (type == normal.getType()) {
                    return normal;
                }
                RaceMode raceMode = RaceMode.INSTANCE;
                return type == raceMode.getType() ? raceMode : Unknown.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType$Normal;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Normal extends RaceType {

            @NotNull
            public static final Normal INSTANCE = new Normal();

            private Normal() {
                super("Normal", 0, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType$RaceMode;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class RaceMode extends RaceType {

            @NotNull
            public static final RaceMode INSTANCE = new RaceMode();

            private RaceMode() {
                super("RaceMode", 1, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType$Unknown;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType;", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Unknown extends RaceType {

            @NotNull
            public static final Unknown INSTANCE = new Unknown();

            private Unknown() {
                super("Unknown", -1, null);
            }
        }

        public /* synthetic */ RaceType(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        @JvmStatic
        @NotNull
        public static final RaceType valueOf(int i) {
            return INSTANCE.valueOf(i);
        }

        @NotNull
        /* JADX INFO: renamed from: getName$bluetooth_release, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final int getType() {
            return this.type;
        }

        @NotNull
        public String toString() {
            return "RaceType(name='" + this.name + "', type=" + this.type + ')';
        }

        private RaceType(String str, int i) {
            this.name = str;
            this.type = i;
        }
    }

    public RaceModeInfo(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length < 12) {
            this.raceType = RaceType.Unknown.INSTANCE;
            this.raceDirection = RaceDirection.Unknown.INSTANCE;
            this.raceDistance = -1;
            this.raceTrackId = -1L;
            return;
        }
        this.raceType = RaceType.INSTANCE.valueOf(c3.a(ArraysKt___ArraysJvmKt.copyOfRange(data, 0, 1), 1, 0, 2, null));
        this.raceDirection = RaceDirection.INSTANCE.valueOf(c3.a(ArraysKt___ArraysJvmKt.copyOfRange(data, 1, 2), 1, 0, 2, null));
        this.raceDistance = c3.a(ArraysKt___ArraysJvmKt.copyOfRange(data, 4, 8), 4, 0, 2, null);
        this.raceTrackId = c3.b(ArraysKt___ArraysJvmKt.copyOfRange(data, 8, 12), 4, 0, 2, null);
    }

    @NotNull
    public final RaceDirection getRaceDirection() {
        return this.raceDirection;
    }

    public final int getRaceDistance() {
        return this.raceDistance;
    }

    public final long getRaceTrackId() {
        return this.raceTrackId;
    }

    @NotNull
    public final RaceType getRaceType() {
        return this.raceType;
    }

    public final boolean isRaceMode() {
        return Intrinsics.areEqual(this.raceType, RaceType.RaceMode.INSTANCE);
    }

    @NotNull
    public String toString() {
        return "RaceModeInfo(raceType=" + this.raceType + ", raceDirection=" + this.raceDirection + ", raceDistance=" + this.raceDistance + ", raceTrackId=" + this.raceTrackId + ')';
    }
}
