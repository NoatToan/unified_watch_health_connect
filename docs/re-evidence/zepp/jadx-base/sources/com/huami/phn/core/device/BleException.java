package com.huami.phn.core.device;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0006\u0007\b\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0007\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/huami/phn/core/device/BleException;", "", "", "msg", "<init>", "(Ljava/lang/String;)V", "ActiveDeviceNoPhn", "ActiveDeviceVersionNoPhn", "DeviceDisconnected", "DeviceError", "InvalidParams", "NoActiveDevice", "NoPhnPlan", "Lcom/huami/phn/core/device/BleException$InvalidParams;", "Lcom/huami/phn/core/device/BleException$NoActiveDevice;", "Lcom/huami/phn/core/device/BleException$ActiveDeviceNoPhn;", "Lcom/huami/phn/core/device/BleException$ActiveDeviceVersionNoPhn;", "Lcom/huami/phn/core/device/BleException$DeviceDisconnected;", "Lcom/huami/phn/core/device/BleException$NoPhnPlan;", "Lcom/huami/phn/core/device/BleException$DeviceError;", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public abstract class BleException extends Throwable {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/phn/core/device/BleException$ActiveDeviceNoPhn;", "Lcom/huami/phn/core/device/BleException;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class ActiveDeviceNoPhn extends BleException {

        @NotNull
        public static final ActiveDeviceNoPhn INSTANCE = new ActiveDeviceNoPhn();

        private ActiveDeviceNoPhn() {
            super("当前设备不支持 PHN", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/phn/core/device/BleException$ActiveDeviceVersionNoPhn;", "Lcom/huami/phn/core/device/BleException;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class ActiveDeviceVersionNoPhn extends BleException {

        @NotNull
        public static final ActiveDeviceVersionNoPhn INSTANCE = new ActiveDeviceVersionNoPhn();

        private ActiveDeviceVersionNoPhn() {
            super("当前设备固件版本不支持 PHN", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/phn/core/device/BleException$DeviceDisconnected;", "Lcom/huami/phn/core/device/BleException;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeviceDisconnected extends BleException {

        @NotNull
        public static final DeviceDisconnected INSTANCE = new DeviceDisconnected();

        private DeviceDisconnected() {
            super("设备连接已断开", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/phn/core/device/BleException$DeviceError;", "Lcom/huami/phn/core/device/BleException;", "", "msg", "<init>", "(Ljava/lang/String;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class DeviceError extends BleException {
        public DeviceError(@NotNull String str) {
            super(str, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/huami/phn/core/device/BleException$InvalidParams;", "Lcom/huami/phn/core/device/BleException;", "", "", "params", "<init>", "([Ljava/lang/String;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class InvalidParams extends BleException {
        /* JADX WARN: Illegal instructions before constructor call */
        public InvalidParams(@NotNull String... strArr) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            strArr = (strArr.length == 0) ^ true ? strArr : null;
            String str = "参数不合法!";
            if (strArr != null) {
                String str2 = "参数不合法：" + strArr;
                if (str2 != null) {
                    str = str2;
                }
            }
            super(str, defaultConstructorMarker);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/phn/core/device/BleException$NoActiveDevice;", "Lcom/huami/phn/core/device/BleException;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class NoActiveDevice extends BleException {

        @NotNull
        public static final NoActiveDevice INSTANCE = new NoActiveDevice();

        private NoActiveDevice() {
            super("没有激活设备", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/phn/core/device/BleException$NoPhnPlan;", "Lcom/huami/phn/core/device/BleException;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class NoPhnPlan extends BleException {

        @NotNull
        public static final NoPhnPlan INSTANCE = new NoPhnPlan();

        private NoPhnPlan() {
            super("设备端无 PHN 计划", null);
        }
    }

    private BleException(String str) {
        super(str);
    }

    public /* synthetic */ BleException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
