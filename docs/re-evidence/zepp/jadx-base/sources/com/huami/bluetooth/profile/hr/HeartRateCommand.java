package com.huami.bluetooth.profile.hr;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00062\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HeartRateCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "value", "<init>", "(I)V", "Companion", "Heartbeat", "SetAtrialFib", "SetInterval", "SetWorkMode", "Lcom/huami/bluetooth/profile/hr/HeartRateCommand$SetInterval;", "Lcom/huami/bluetooth/profile/hr/HeartRateCommand$SetWorkMode;", "Lcom/huami/bluetooth/profile/hr/HeartRateCommand$Heartbeat;", "Lcom/huami/bluetooth/profile/hr/HeartRateCommand$SetAtrialFib;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class HeartRateCommand extends Request.Command {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int b = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HeartRateCommand$Companion;", "", "", "value", "", "a", "SIZE_BYTES", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] a(int value) {
            return ByteUtilsKt.toByteArray(value, 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HeartRateCommand$Heartbeat;", "Lcom/huami/bluetooth/profile/hr/HeartRateCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Heartbeat extends HeartRateCommand {

        @NotNull
        public static final Heartbeat INSTANCE = new Heartbeat();

        private Heartbeat() {
            super(22, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HeartRateCommand$SetAtrialFib;", "Lcom/huami/bluetooth/profile/hr/HeartRateCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetAtrialFib extends HeartRateCommand {

        @NotNull
        public static final SetAtrialFib INSTANCE = new SetAtrialFib();

        private SetAtrialFib() {
            super(48, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HeartRateCommand$SetInterval;", "Lcom/huami/bluetooth/profile/hr/HeartRateCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetInterval extends HeartRateCommand {

        @NotNull
        public static final SetInterval INSTANCE = new SetInterval();

        private SetInterval() {
            super(20, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HeartRateCommand$SetWorkMode;", "Lcom/huami/bluetooth/profile/hr/HeartRateCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetWorkMode extends HeartRateCommand {

        @NotNull
        public static final SetWorkMode INSTANCE = new SetWorkMode();

        private SetWorkMode() {
            super(21, null);
        }
    }

    private HeartRateCommand(int i) {
        super(INSTANCE.a(i));
    }

    public /* synthetic */ HeartRateCommand(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
