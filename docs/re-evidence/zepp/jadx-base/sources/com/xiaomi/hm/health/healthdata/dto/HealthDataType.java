package com.xiaomi.hm.health.healthdata.dto;

import com.google.android.gms.fitness.data.Field;
import com.huami.ecg.core.model.constant.MeasureContentType;
import com.huami.ecg.core.model.constant.WearPosition;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import com.xiaomi.hm.health.lab.model.SensorRecordsEnity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", WearPosition.CHEST, "WAIST", "HIP", "ARM", "THIGH", "CALF", "BODY_FAT", StatEvent.BF_OPERATION_BMI_TYPE, "MUSCLE", "WATER", "PROTEIN", "BASAL_METABOLISM", "VISCERAL_FAT", "BONE", SensorRecordsEnity.SensorType.SENSOR_TEMPERATURE, "BLOOD_SUGAR", MeasureContentType.BLOOD_PRESSURE, "SKELETAL_MUSCLE", "SUBCUTANEOUS_FAT", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public enum HealthDataType implements DataType {
    CHEST("chest"),
    WAIST("waist"),
    HIP("hip"),
    ARM("arm"),
    THIGH("thigh"),
    CALF("calf"),
    BODY_FAT(BFConstant.TYPE_BODY_FAT_AD),
    BMI("bmi"),
    MUSCLE("muscle"),
    WATER("water"),
    PROTEIN(Field.NUTRIENT_PROTEIN),
    BASAL_METABOLISM("basal_metabolism"),
    VISCERAL_FAT("visceral_fat"),
    BONE("bone"),
    TEMPERATURE("temperature"),
    BLOOD_SUGAR(RouterHelper.DATA_TYPE_BLOOD_SUGAR),
    BLOOD_PRESSURE("blood_pressure"),
    SKELETAL_MUSCLE("skeletal_muscle"),
    SUBCUTANEOUS_FAT("subcutaneous_fat");


    @NotNull
    private final String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final HealthDataType[] values = values();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType$Companion;", "", "", "value", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "find", "", "values", "[Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final HealthDataType find(@NotNull String value) {
            for (HealthDataType healthDataType : HealthDataType.values) {
                if (Intrinsics.areEqual(healthDataType.getType(), value)) {
                    return healthDataType;
                }
            }
            return null;
        }
    }

    HealthDataType(String str) {
        this.type = str;
    }

    @Override // com.xiaomi.hm.health.healthdata.dto.DataType
    @NotNull
    public String getType() {
        return this.type;
    }
}
