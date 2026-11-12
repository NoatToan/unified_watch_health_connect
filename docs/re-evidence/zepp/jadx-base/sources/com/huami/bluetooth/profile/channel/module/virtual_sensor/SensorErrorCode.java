package com.huami.bluetooth.profile.channel.module.virtual_sensor;

import com.alipay.sdk.m.f0.c;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/SensorErrorCode;", "", "", "value", LogUtil.I, "getValue", "()I", "", "desc", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "UNKNOWN", c.p, "INVALID_PARAMETER", "NO_MEMORY", "UNSUPPORT_SENSOR_TYPE", "TIMEOUT", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum SensorErrorCode {
    UNKNOWN(0, "未知错误"),
    SUCCESS(1, "成功"),
    INVALID_PARAMETER(2, "成功"),
    NO_MEMORY(3, "内存不足"),
    UNSUPPORT_SENSOR_TYPE(4, "不支持的传感器类型"),
    TIMEOUT(5, "超时");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String desc;
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/SensorErrorCode$Companion;", "", "", "value", "Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/SensorErrorCode;", "fromValue", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SensorErrorCode fromValue(int value) {
            SensorErrorCode sensorErrorCode;
            SensorErrorCode[] sensorErrorCodeArrValues = SensorErrorCode.values();
            int length = sensorErrorCodeArrValues.length;
            do {
                length--;
                if (length < 0) {
                    sensorErrorCode = null;
                    break;
                }
                sensorErrorCode = sensorErrorCodeArrValues[length];
            } while (!(sensorErrorCode.getValue() == value));
            return sensorErrorCode == null ? SensorErrorCode.UNKNOWN : sensorErrorCode;
        }
    }

    SensorErrorCode(int i, String str) {
        this.value = i;
        this.desc = str;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final int getValue() {
        return this.value;
    }
}
