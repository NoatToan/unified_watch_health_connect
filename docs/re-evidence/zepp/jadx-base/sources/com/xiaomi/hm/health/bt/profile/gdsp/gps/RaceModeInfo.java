package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.upnp.std.av.renderer.AVTransport;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0003\"#$B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0017\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001d\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo;", "Ljava/io/Serializable;", "", "isRaceMode", "", "toString", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType;", "a", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType;", "getRaceType", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType;", "raceType", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection;", "b", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection;", "getRaceDirection", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection;", "raceDirection", "", "c", LogUtil.I, "getRaceDistance", "()I", "raceDistance", "", GoogleApiAvailabilityLight.a, "J", "getRaceTrackId", "()J", "raceTrackId", "", "data", "<init>", "([B)V", "Companion", "RaceDirection", "RaceType", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class RaceModeInfo implements Serializable {
    public static final int DATA_MIN_LEN = 12;
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;
    private static final int h = 4;
    private static final int i = 8;
    private static final int j = 12;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final RaceType raceType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final RaceDirection raceDirection;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int raceDistance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long raceTrackId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00112\u00020\u0001:\u0005\u0012\u0013\u0011\u0014\u0015B\u0019\b\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\b\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection;", "", "", "toString", "a", "Ljava/lang/String;", "getName$bluetooth_release", "()Ljava/lang/String;", "name", "", "b", LogUtil.I, "getDirection", "()I", "direction", "<init>", "(Ljava/lang/String;I)V", "Companion", "Ahead", "Behind", AVTransport.TARGET, "Unknown", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection$Unknown;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection$Target;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection$Ahead;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection$Behind;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class RaceDirection {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int direction;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection$Ahead;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Ahead extends RaceDirection {

            @NotNull
            public static final Ahead INSTANCE = new Ahead();

            private Ahead() {
                super("Ahead", 1, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection$Behind;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Behind extends RaceDirection {

            @NotNull
            public static final Behind INSTANCE = new Behind();

            private Behind() {
                super("Behind", 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection$Companion;", "", "", "type", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection;", "valueOf", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection$Target;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Target extends RaceDirection {

            @NotNull
            public static final Target INSTANCE = new Target();

            private Target() {
                super(AVTransport.TARGET, 0, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection$Unknown;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceDirection;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Unknown extends RaceDirection {

            @NotNull
            public static final Unknown INSTANCE = new Unknown();

            private Unknown() {
                super("Unknown", -1, null);
            }
        }

        private RaceDirection(String str, int i) {
            this.name = str;
            this.direction = i;
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00112\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u0019\b\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\b\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType;", "", "", "toString", "a", "Ljava/lang/String;", "getName$bluetooth_release", "()Ljava/lang/String;", "name", "", "b", LogUtil.I, "getType", "()I", "type", "<init>", "(Ljava/lang/String;I)V", "Companion", StatEvent.VALUE_NORMAL, "RaceMode", "Unknown", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType$Unknown;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType$Normal;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType$RaceMode;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class RaceType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int type;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType$Companion;", "", "", "type", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType;", "valueOf", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType$Normal;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Normal extends RaceType {

            @NotNull
            public static final Normal INSTANCE = new Normal();

            private Normal() {
                super(StatEvent.VALUE_NORMAL, 0, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType$RaceMode;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class RaceMode extends RaceType {

            @NotNull
            public static final RaceMode INSTANCE = new RaceMode();

            private RaceMode() {
                super("RaceMode", 1, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType$Unknown;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/RaceModeInfo$RaceType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Unknown extends RaceType {

            @NotNull
            public static final Unknown INSTANCE = new Unknown();

            private Unknown() {
                super("Unknown", -1, null);
            }
        }

        private RaceType(String str, int i) {
            this.name = str;
            this.type = i;
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
    }

    public RaceModeInfo(@NotNull byte[] bArr) {
        if (bArr.length < 12) {
            this.raceType = RaceType.Unknown.INSTANCE;
            this.raceDirection = RaceDirection.Unknown.INSTANCE;
            this.raceDistance = -1;
            this.raceTrackId = -1L;
            return;
        }
        this.raceType = RaceType.INSTANCE.valueOf(ByteUtilsKt.toInt$default(ArraysKt___ArraysJvmKt.copyOfRange(bArr, 0, 1), 1, 0, 2, null));
        this.raceDirection = RaceDirection.INSTANCE.valueOf(ByteUtilsKt.toInt$default(ArraysKt___ArraysJvmKt.copyOfRange(bArr, 1, 2), 1, 0, 2, null));
        this.raceDistance = ByteUtilsKt.toInt$default(ArraysKt___ArraysJvmKt.copyOfRange(bArr, 4, 8), 4, 0, 2, null);
        this.raceTrackId = ByteUtilsKt.toLong$default(ArraysKt___ArraysJvmKt.copyOfRange(bArr, 8, 12), 4, 0, 2, null);
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
