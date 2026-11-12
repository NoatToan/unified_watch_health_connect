package com.xiaomi.hm.health.bt.profile.bloodpressure;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.UUID;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016R!\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R!\u0010\u000b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R!\u0010\u000e\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R!\u0010\u0011\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007R!\u0010\u0014\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/bloodpressure/BloodPressureConstant;", "", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "a", "Ljava/util/UUID;", "getUUID_SERVICE_BLOOD_PRESSURE", "()Ljava/util/UUID;", "UUID_SERVICE_BLOOD_PRESSURE", "b", "getUUID_SERVICE_BLOOD_PRESSURE_CURR_TIME", "UUID_SERVICE_BLOOD_PRESSURE_CURR_TIME", "c", "getUU_CHARA_BP_MEASURE", "UU_CHARA_BP_MEASURE", GoogleApiAvailabilityLight.a, "getUU_CHARA_BP_RACP", "UU_CHARA_BP_RACP", "e", "getUU_CHARA_DATE_TIME", "UU_CHARA_DATE_TIME", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureConstant {

    @NotNull
    public static final BloodPressureConstant INSTANCE = new BloodPressureConstant();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final UUID UUID_SERVICE_BLOOD_PRESSURE = GattUtils.uuid16("1810");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final UUID UUID_SERVICE_BLOOD_PRESSURE_CURR_TIME = GattUtils.uuid16("1805");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final UUID UU_CHARA_BP_MEASURE = GattUtils.uuid16("2A35");

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final UUID UU_CHARA_BP_RACP = GattUtils.uuid16("2A52");

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final UUID UU_CHARA_DATE_TIME = GattUtils.uuid16("2A2B");

    private BloodPressureConstant() {
    }

    public final UUID getUUID_SERVICE_BLOOD_PRESSURE() {
        return UUID_SERVICE_BLOOD_PRESSURE;
    }

    public final UUID getUUID_SERVICE_BLOOD_PRESSURE_CURR_TIME() {
        return UUID_SERVICE_BLOOD_PRESSURE_CURR_TIME;
    }

    public final UUID getUU_CHARA_BP_MEASURE() {
        return UU_CHARA_BP_MEASURE;
    }

    public final UUID getUU_CHARA_BP_RACP() {
        return UU_CHARA_BP_RACP;
    }

    public final UUID getUU_CHARA_DATE_TIME() {
        return UU_CHARA_DATE_TIME;
    }
}
