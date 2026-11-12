package com.xiaomi.hm.health.bt.profile.grsp;

import com.xiaomi.hm.health.bt.utils.BytesUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/grsp/SensorCheckCallback;", "Lcom/xiaomi/hm/health/bt/profile/grsp/IHMSensorDataCallback;", "", "result", "", "onSensorStop", "ignoreLostData", "Lcom/xiaomi/hm/health/bt/profile/grsp/CheckData;", "checkData", "", "data", "onSensorOriginData", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class SensorCheckCallback implements IHMSensorDataCallback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/grsp/SensorCheckCallback$Companion;", "", "", "type", "", "data", "", "getTotalTimeInMills", "getSensorDataLength", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSensorDataLength(int type, @Nullable byte[] data) {
            if (data == null) {
                return -1;
            }
            SensorType sensorType = SensorType.ECG;
            if (type != sensorType.getValue()) {
                if (type != (sensorType.getValue() | SensorType.PPG.getValue())) {
                    return -1;
                }
            }
            return BytesUtil.byteArrayToInt(data, 8);
        }

        public final long getTotalTimeInMills(int type, @Nullable byte[] data) {
            if (data == null) {
                return -1L;
            }
            SensorType sensorType = SensorType.ECG;
            if (type != sensorType.getValue()) {
                if (type != (sensorType.getValue() | SensorType.PPG.getValue())) {
                    return -1L;
                }
            }
            return BytesUtil.byteArrayToLong(data, 0, true);
        }
    }

    public final boolean ignoreLostData() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback
    public void onSensorOriginData(@Nullable byte[] data) {
    }

    public abstract void onSensorStop(@NotNull CheckData checkData);

    @Override // com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback
    public void onSensorStop(boolean result) {
        if (result) {
            return;
        }
        onSensorStop(new CheckData(false));
    }
}
