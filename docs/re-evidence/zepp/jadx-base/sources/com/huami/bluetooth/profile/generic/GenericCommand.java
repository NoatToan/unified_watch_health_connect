package com.huami.bluetooth.profile.generic;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0007\u000b\f\r\u000e\u000f\u0010\u0011B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/huami/bluetooth/profile/generic/GenericCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "b", LogUtil.I, "getValue", "()I", "value", "type", "<init>", "(II)V", "Companion", "DeviceFeature", "GetBatteryInfo", "GetEq", "GetSensorDesc", "GetSnInfo", "HeadsetKnockingNew", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class GenericCommand extends Request.Command {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int c = 255;
    private static final int d = 252;
    private static final int e = 253;
    private static final int f = 1;
    private static final int g = 4;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/generic/GenericCommand$Companion;", "", "", "value", "", "a", "CMD_BYTES", LogUtil.I, "TYPE_BYTES", "TYPE_DF", "TYPE_ECF", "TYPE_GRSP", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final byte[] a(int value) {
            return ByteUtilsKt.toByteArray(value, 4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/generic/GenericCommand$DeviceFeature;", "Lcom/huami/bluetooth/profile/generic/GenericCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeviceFeature extends GenericCommand {

        @NotNull
        public static final DeviceFeature INSTANCE = new DeviceFeature();

        private DeviceFeature() {
            super(253, 15);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/generic/GenericCommand$GetBatteryInfo;", "Lcom/huami/bluetooth/profile/generic/GenericCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetBatteryInfo extends GenericCommand {

        @NotNull
        public static final GetBatteryInfo INSTANCE = new GetBatteryInfo();

        private GetBatteryInfo() {
            super(255, 6);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/generic/GenericCommand$GetEq;", "Lcom/huami/bluetooth/profile/generic/GenericCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetEq extends GenericCommand {

        @NotNull
        public static final GetEq INSTANCE = new GetEq();

        private GetEq() {
            super(255, 5);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/generic/GenericCommand$GetSensorDesc;", "Lcom/huami/bluetooth/profile/generic/GenericCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetSensorDesc extends GenericCommand {

        @NotNull
        public static final GetSensorDesc INSTANCE = new GetSensorDesc();

        private GetSensorDesc() {
            super(252, 16);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/generic/GenericCommand$GetSnInfo;", "Lcom/huami/bluetooth/profile/generic/GenericCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetSnInfo extends GenericCommand {

        @NotNull
        public static final GetSnInfo INSTANCE = new GetSnInfo();

        private GetSnInfo() {
            super(255, 20);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/generic/GenericCommand$HeadsetKnockingNew;", "Lcom/huami/bluetooth/profile/generic/GenericCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class HeadsetKnockingNew extends GenericCommand {

        @NotNull
        public static final HeadsetKnockingNew INSTANCE = new HeadsetKnockingNew();

        private HeadsetKnockingNew() {
            super(255, 23);
        }
    }

    public GenericCommand(int i, int i2) {
        super(ByteUtilsKt.toByteArray(i, 1), INSTANCE.a(i2));
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }
}
