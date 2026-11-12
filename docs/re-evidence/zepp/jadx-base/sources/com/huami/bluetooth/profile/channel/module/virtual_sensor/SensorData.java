package com.huami.bluetooth.profile.channel.module.virtual_sensor;

import com.huami.bluetooth.profile.channel.module.base.ToBytes;
import com.huami.mifit.sportlib.gpx.data.GPXBasePoint;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0011\u001a\u00020\u0007H\u0016R\u0019\u0010\u0017\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001d\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/SensorData;", "Lcom/huami/bluetooth/profile/channel/module/base/ToBytes;", "", "value", "withInt", "(Ljava/lang/Integer;)Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/SensorData;", "withByte", "", "byteArray", "withBytes", "", "withLong", "(Ljava/lang/Long;)Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/SensorData;", "withShort", "", "text", "withString", "toBytes", "Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/SensorType;", "a", "Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/SensorType;", "getType", "()Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/SensorType;", "type", "Ljava/io/ByteArrayOutputStream;", "b", "Ljava/io/ByteArrayOutputStream;", "getBos", "()Ljava/io/ByteArrayOutputStream;", "bos", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/SensorType;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SensorData implements ToBytes {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SensorType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ByteArrayOutputStream bos;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/SensorData$Companion;", "", "", "timestamp", "", GPXBasePoint.XML.ATTR_LAT, "lng", "alt", "", "speed", "Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/SensorData;", "buildGpsSensorData", "(JIILjava/lang/Integer;Ljava/lang/Double;)Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/SensorData;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SensorData buildGpsSensorData(long timestamp, int lat, int lng, @Nullable Integer alt, @Nullable Double speed) {
            int i = alt != null ? 1 : 0;
            if (speed != null) {
                i |= 2;
            }
            return new SensorData(SensorType.GPS).withInt(Integer.valueOf(i)).withLong(Long.valueOf(timestamp)).withInt(Integer.valueOf(lat)).withInt(Integer.valueOf(lng)).withInt(alt).withShort(speed != null ? Integer.valueOf((int) (speed.doubleValue() * ((double) 100))) : null);
        }
    }

    public SensorData(@NotNull SensorType sensorType) {
        this.type = sensorType;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.bos = byteArrayOutputStream;
        byteArrayOutputStream.write(sensorType.getValue());
    }

    @NotNull
    public final ByteArrayOutputStream getBos() {
        return this.bos;
    }

    @NotNull
    public final SensorType getType() {
        return this.type;
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.ToBytes
    @NotNull
    public byte[] toBytes() {
        return this.bos.toByteArray();
    }

    @NotNull
    public final SensorData withByte(@Nullable Integer value) {
        if (value != null) {
            getBos().write(value.intValue());
        }
        return this;
    }

    @NotNull
    public final SensorData withBytes(@Nullable byte[] byteArray) {
        if (byteArray != null) {
            getBos().write(byteArray);
        }
        return this;
    }

    @NotNull
    public final SensorData withInt(@Nullable Integer value) {
        if (value != null) {
            value.intValue();
            getBos().write(GattUtils.intToBytes(value.intValue()));
        }
        return this;
    }

    @NotNull
    public final SensorData withLong(@Nullable Long value) {
        if (value != null) {
            value.longValue();
            getBos().write(GattUtils.longToBytes(value.longValue()));
        }
        return this;
    }

    @NotNull
    public final SensorData withShort(@Nullable Integer value) {
        if (value != null) {
            value.intValue();
            getBos().write(GattUtils.numberToBytes(value.intValue(), 2));
        }
        return this;
    }

    @NotNull
    public final SensorData withString(@Nullable String text) {
        if (text != null) {
            getBos().write(text.getBytes(Charsets.UTF_8));
            getBos().write(0);
        }
        return this;
    }
}
