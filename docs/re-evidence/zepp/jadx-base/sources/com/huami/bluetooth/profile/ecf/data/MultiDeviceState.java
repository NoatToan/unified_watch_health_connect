package com.huami.bluetooth.profile.ecf.data;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.companion.esim.AbsEsimOperation;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u001d\u001e\u001fB'\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÂ\u0003J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001a¨\u0006 "}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState;", "", "", "a", "b", "c", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Connection;", "getConnection", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Host;", "getHost", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$State;", "getLeftState", "getRightState", AbsEsimOperation.HEADER_CONNECTION, "host", "leftState", "rightState", "copy", "", "toString", "", "hashCode", "other", "", "equals", "B", "<init>", "(BBBB)V", "Connection", "Host", TrainingAnalytics.ParamKey.STATE, "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MultiDeviceState {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final byte connection;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final byte host;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final byte leftState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final byte rightState;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0007\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Connection;", "", "", "a", "B", "getValue$bluetooth_release", "()B", "value", "<init>", "(B)V", "Companion", "Multi", "Single", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Connection$Single;", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Connection$Multi;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class Connection {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final byte value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Connection$Companion;", "", "", "value", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Connection;", "valueOf", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final Connection valueOf(byte value) {
                Multi multi = Multi.INSTANCE;
                return value == multi.getValue() ? multi : Single.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Connection$Multi;", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Connection;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Multi extends Connection {

            @NotNull
            public static final Multi INSTANCE = new Multi();

            private Multi() {
                super((byte) 1, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Connection$Single;", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Connection;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Single extends Connection {

            @NotNull
            public static final Single INSTANCE = new Single();

            private Single() {
                super((byte) 0, null);
            }
        }

        private Connection(byte b) {
            this.value = b;
        }

        public /* synthetic */ Connection(byte b, DefaultConstructorMarker defaultConstructorMarker) {
            this(b);
        }

        @JvmStatic
        @NotNull
        public static final Connection valueOf(byte b) {
            return INSTANCE.valueOf(b);
        }

        /* JADX INFO: renamed from: getValue$bluetooth_release, reason: from getter */
        public final byte getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0007\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Host;", "", "", "a", "B", "getValue$bluetooth_release", "()B", "value", "<init>", "(B)V", "Companion", "Left", "Right", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Host$Left;", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Host$Right;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class Host {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final byte value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Host$Companion;", "", "", "value", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Host;", "valueOf", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final Host valueOf(byte value) {
                Right right = Right.INSTANCE;
                return value == right.getValue() ? right : Left.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Host$Left;", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Host;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Left extends Host {

            @NotNull
            public static final Left INSTANCE = new Left();

            private Left() {
                super((byte) 0, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Host$Right;", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$Host;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Right extends Host {

            @NotNull
            public static final Right INSTANCE = new Right();

            private Right() {
                super((byte) 1, null);
            }
        }

        private Host(byte b) {
            this.value = b;
        }

        public /* synthetic */ Host(byte b, DefaultConstructorMarker defaultConstructorMarker) {
            this(b);
        }

        @JvmStatic
        @NotNull
        public static final Host valueOf(byte b) {
            return INSTANCE.valueOf(b);
        }

        /* JADX INFO: renamed from: getValue$bluetooth_release, reason: from getter */
        public final byte getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0007\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$State;", "", "", "a", "B", "getValue$bluetooth_release", "()B", "value", "<init>", "(B)V", "Companion", "UnWear", "Unknown", "Wear", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$State$Unknown;", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$State$Wear;", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$State$UnWear;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class State {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final byte value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$State$Companion;", "", "", "value", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$State;", "valueOf", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final State valueOf(byte value) {
                Wear wear = Wear.INSTANCE;
                if (value == wear.getValue()) {
                    return wear;
                }
                UnWear unWear = UnWear.INSTANCE;
                return value == unWear.getValue() ? unWear : Unknown.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$State$UnWear;", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$State;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class UnWear extends State {

            @NotNull
            public static final UnWear INSTANCE = new UnWear();

            private UnWear() {
                super((byte) 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$State$Unknown;", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$State;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Unknown extends State {

            @NotNull
            public static final Unknown INSTANCE = new Unknown();

            private Unknown() {
                super((byte) 0, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$State$Wear;", "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState$State;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Wear extends State {

            @NotNull
            public static final Wear INSTANCE = new Wear();

            private Wear() {
                super((byte) 1, null);
            }
        }

        private State(byte b) {
            this.value = b;
        }

        public /* synthetic */ State(byte b, DefaultConstructorMarker defaultConstructorMarker) {
            this(b);
        }

        @JvmStatic
        @NotNull
        public static final State valueOf(byte b) {
            return INSTANCE.valueOf(b);
        }

        /* JADX INFO: renamed from: getValue$bluetooth_release, reason: from getter */
        public final byte getValue() {
            return this.value;
        }
    }

    public MultiDeviceState(byte b, byte b2, byte b3, byte b4) {
        this.connection = b;
        this.host = b2;
        this.leftState = b3;
        this.rightState = b4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    private final byte getConnection() {
        return this.connection;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    private final byte getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    private final byte getLeftState() {
        return this.leftState;
    }

    public static /* synthetic */ MultiDeviceState copy$default(MultiDeviceState multiDeviceState, byte b, byte b2, byte b3, byte b4, int i, Object obj) {
        if ((i & 1) != 0) {
            b = multiDeviceState.connection;
        }
        if ((i & 2) != 0) {
            b2 = multiDeviceState.host;
        }
        if ((i & 4) != 0) {
            b3 = multiDeviceState.leftState;
        }
        if ((i & 8) != 0) {
            b4 = multiDeviceState.rightState;
        }
        return multiDeviceState.copy(b, b2, b3, b4);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    private final byte getRightState() {
        return this.rightState;
    }

    @NotNull
    public final MultiDeviceState copy(byte connection, byte host, byte leftState, byte rightState) {
        return new MultiDeviceState(connection, host, leftState, rightState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiDeviceState)) {
            return false;
        }
        MultiDeviceState multiDeviceState = (MultiDeviceState) other;
        return this.connection == multiDeviceState.connection && this.host == multiDeviceState.host && this.leftState == multiDeviceState.leftState && this.rightState == multiDeviceState.rightState;
    }

    @NotNull
    public final Connection getConnection() {
        return Connection.INSTANCE.valueOf(this.connection);
    }

    @NotNull
    public final Host getHost() {
        return Host.INSTANCE.valueOf(this.host);
    }

    @NotNull
    public final State getLeftState() {
        return State.INSTANCE.valueOf(this.leftState);
    }

    @NotNull
    public final State getRightState() {
        return State.INSTANCE.valueOf(this.rightState);
    }

    public int hashCode() {
        return (((((this.connection * 31) + this.host) * 31) + this.leftState) * 31) + this.rightState;
    }

    @NotNull
    public String toString() {
        return "MultiDeviceState(connection=" + ((int) this.connection) + ", host=" + ((int) this.host) + ", leftState=" + ((int) this.leftState) + ", rightState=" + ((int) this.rightState) + ')';
    }
}
