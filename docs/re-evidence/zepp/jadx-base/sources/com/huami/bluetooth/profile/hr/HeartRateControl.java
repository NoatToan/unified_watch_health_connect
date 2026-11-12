package com.huami.bluetooth.profile.hr;

import com.huami.bluetooth.profile.Request;
import com.huami.moving.ui.utils.SportAnalytics;
import com.xiaomi.hm.health.bt.profile.hr.HeartRateConfig;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0013\u0014J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\u0002H&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HeartRateControl;", "", "", PointCategory.INIT, "deInit", "Lcom/huami/bluetooth/profile/hr/HeartRateControl$Mode;", "mode", "Lcom/huami/bluetooth/profile/hr/HeartRateControl$Operation;", "operation", "setMode", "", "minutes", "setInterval", "sendHeartbeat", "Lcom/xiaomi/hm/health/bt/profile/hr/HeartRateConfig;", "getHeartRateConfig", "Lcom/huami/bluetooth/profile/Request$Command;", "command", "enableAbnormalHeartWarning", "Mode", "Operation", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface HeartRateControl {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0007\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HeartRateControl$Mode;", "", "", "a", "B", "getValue$bluetooth_release", "()B", "value", "<init>", "(B)V", "AtrialFib", "Continuous", StatEvent.APP_UPGRADE_PARAMS_TYPE_MANUAL, "Sleep", "Lcom/huami/bluetooth/profile/hr/HeartRateControl$Mode$Sleep;", "Lcom/huami/bluetooth/profile/hr/HeartRateControl$Mode$Continuous;", "Lcom/huami/bluetooth/profile/hr/HeartRateControl$Mode$Manual;", "Lcom/huami/bluetooth/profile/hr/HeartRateControl$Mode$AtrialFib;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class Mode {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final byte value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HeartRateControl$Mode$AtrialFib;", "Lcom/huami/bluetooth/profile/hr/HeartRateControl$Mode;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class AtrialFib extends Mode {

            @NotNull
            public static final AtrialFib INSTANCE = new AtrialFib();

            private AtrialFib() {
                super((byte) 3, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HeartRateControl$Mode$Continuous;", "Lcom/huami/bluetooth/profile/hr/HeartRateControl$Mode;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Continuous extends Mode {

            @NotNull
            public static final Continuous INSTANCE = new Continuous();

            private Continuous() {
                super((byte) 1, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HeartRateControl$Mode$Manual;", "Lcom/huami/bluetooth/profile/hr/HeartRateControl$Mode;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Manual extends Mode {

            @NotNull
            public static final Manual INSTANCE = new Manual();

            private Manual() {
                super((byte) 2, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HeartRateControl$Mode$Sleep;", "Lcom/huami/bluetooth/profile/hr/HeartRateControl$Mode;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Sleep extends Mode {

            @NotNull
            public static final Sleep INSTANCE = new Sleep();

            private Sleep() {
                super((byte) 0, null);
            }
        }

        private Mode(byte b) {
            this.value = b;
        }

        public /* synthetic */ Mode(byte b, DefaultConstructorMarker defaultConstructorMarker) {
            this(b);
        }

        /* JADX INFO: renamed from: getValue$bluetooth_release, reason: from getter */
        public final byte getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0007\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HeartRateControl$Operation;", "", "", "a", "B", "getValue$bluetooth_release", "()B", "value", "<init>", "(B)V", "Close", SportAnalytics.ParamValue.OPEN, "Lcom/huami/bluetooth/profile/hr/HeartRateControl$Operation$Close;", "Lcom/huami/bluetooth/profile/hr/HeartRateControl$Operation$Open;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class Operation {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final byte value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HeartRateControl$Operation$Close;", "Lcom/huami/bluetooth/profile/hr/HeartRateControl$Operation;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Close extends Operation {

            @NotNull
            public static final Close INSTANCE = new Close();

            private Close() {
                super((byte) 0, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HeartRateControl$Operation$Open;", "Lcom/huami/bluetooth/profile/hr/HeartRateControl$Operation;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
        public static final class Open extends Operation {

            @NotNull
            public static final Open INSTANCE = new Open();

            private Open() {
                super((byte) 1, null);
            }
        }

        private Operation(byte b) {
            this.value = b;
        }

        public /* synthetic */ Operation(byte b, DefaultConstructorMarker defaultConstructorMarker) {
            this(b);
        }

        /* JADX INFO: renamed from: getValue$bluetooth_release, reason: from getter */
        public final byte getValue() {
            return this.value;
        }
    }

    boolean deInit();

    boolean enableAbnormalHeartWarning(@NotNull Request.Command command, @NotNull Operation operation);

    @Nullable
    HeartRateConfig getHeartRateConfig();

    boolean init();

    boolean sendHeartbeat();

    boolean setInterval(int minutes);

    boolean setMode(@NotNull Mode mode, @NotNull Operation operation);
}
