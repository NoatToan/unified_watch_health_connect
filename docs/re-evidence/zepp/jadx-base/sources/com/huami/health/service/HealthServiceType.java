package com.huami.health.service;

import com.google.android.gms.fitness.data.Field;
import com.huami.ecg.core.model.constant.MeasureContentType;
import com.huami.ecg.core.model.constant.WearPosition;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import com.xiaomi.hm.health.lab.model.SensorRecordsEnity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/huami/health/service/HealthServiceType;", "", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", WearPosition.CHEST, "WAIST", "HIP", "ARM", "THIGH", "CALF", "BODY_FAT", StatEvent.BF_OPERATION_BMI_TYPE, "MUSCLE", "WATER", "PROTEIN", "BASAL_METABOLISM", "VISCERAL_FAT", "BONE", SensorRecordsEnity.SensorType.SENSOR_TEMPERATURE, "BLOOD_SUGAR", MeasureContentType.BLOOD_PRESSURE, "SKELETAL_MUSCLE", "SUBCUTANEOUS_FAT", "health-service_release"}, k = 1, mv = {1, 4, 0})
public enum HealthServiceType {
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

    HealthServiceType(String str) {
        this.type = str;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}
