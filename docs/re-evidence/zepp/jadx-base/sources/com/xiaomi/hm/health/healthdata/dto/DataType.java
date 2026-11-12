package com.xiaomi.hm.health.healthdata.dto;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "", "", "getType", "()Ljava/lang/String;", "type", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface DataType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/dto/DataType$Companion;", "", "", "value", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "find", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        @Nullable
        public final DataType find(@NotNull String value) {
            DataType dataTypeFind = HealthDataType.INSTANCE.find(value);
            if (dataTypeFind != null || (dataTypeFind = StressDataType.INSTANCE.find(value)) != null) {
                return dataTypeFind;
            }
            TemperatureDataType temperatureDataTypeFind = TemperatureDataType.INSTANCE.find(value);
            if (temperatureDataTypeFind == null) {
                return null;
            }
            return temperatureDataTypeFind;
        }
    }

    @NotNull
    String getType();
}
