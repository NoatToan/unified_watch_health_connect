package com.xiaomi.fitness.health.bloodglucose.util;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR+\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR+\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/util/BloodSugarPermissionGuidePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "FIRST_TIME_CLOSED_TIMESTAMP_EXPIRE", "getFIRST_TIME_CLOSED_TIMESTAMP_EXPIRE", "()J", "setFIRST_TIME_CLOSED_TIMESTAMP_EXPIRE", "(J)V", "FIRST_TIME_CLOSED_TIMESTAMP_EXPIRE$delegate", "Lkotlin/properties/ReadWriteProperty;", "FIRST_TIME_CLOSED_TIMESTAMP_AUTO", "getFIRST_TIME_CLOSED_TIMESTAMP_AUTO", "setFIRST_TIME_CLOSED_TIMESTAMP_AUTO", "FIRST_TIME_CLOSED_TIMESTAMP_AUTO$delegate", "FIRST_TIME_CLOSED_TIMESTAMP_ABNORMAL", "getFIRST_TIME_CLOSED_TIMESTAMP_ABNORMAL", "setFIRST_TIME_CLOSED_TIMESTAMP_ABNORMAL", "FIRST_TIME_CLOSED_TIMESTAMP_ABNORMAL$delegate", "FIRST_TIME_CLOSED_TIMESTAMP_LOSE_DATA", "getFIRST_TIME_CLOSED_TIMESTAMP_LOSE_DATA", "setFIRST_TIME_CLOSED_TIMESTAMP_LOSE_DATA", "FIRST_TIME_CLOSED_TIMESTAMP_LOSE_DATA$delegate", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBloodSugarPermissionGuidePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodSugarPermissionGuidePreference.kt\ncom/xiaomi/fitness/health/bloodglucose/util/BloodSugarPermissionGuidePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,13:1\n135#2,6:14\n135#2,6:20\n135#2,6:26\n135#2,6:32\n*S KotlinDebug\n*F\n+ 1 BloodSugarPermissionGuidePreference.kt\ncom/xiaomi/fitness/health/bloodglucose/util/BloodSugarPermissionGuidePreference\n*L\n9#1:14,6\n10#1:20,6\n11#1:26,6\n12#1:32,6\n*E\n"})
public final class BloodSugarPermissionGuidePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BloodSugarPermissionGuidePreference.class, "FIRST_TIME_CLOSED_TIMESTAMP_EXPIRE", "getFIRST_TIME_CLOSED_TIMESTAMP_EXPIRE()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BloodSugarPermissionGuidePreference.class, "FIRST_TIME_CLOSED_TIMESTAMP_AUTO", "getFIRST_TIME_CLOSED_TIMESTAMP_AUTO()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BloodSugarPermissionGuidePreference.class, "FIRST_TIME_CLOSED_TIMESTAMP_ABNORMAL", "getFIRST_TIME_CLOSED_TIMESTAMP_ABNORMAL()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BloodSugarPermissionGuidePreference.class, "FIRST_TIME_CLOSED_TIMESTAMP_LOSE_DATA", "getFIRST_TIME_CLOSED_TIMESTAMP_LOSE_DATA()J", 0))};

    /* JADX INFO: renamed from: FIRST_TIME_CLOSED_TIMESTAMP_ABNORMAL$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty FIRST_TIME_CLOSED_TIMESTAMP_ABNORMAL;

    /* JADX INFO: renamed from: FIRST_TIME_CLOSED_TIMESTAMP_AUTO$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty FIRST_TIME_CLOSED_TIMESTAMP_AUTO;

    /* JADX INFO: renamed from: FIRST_TIME_CLOSED_TIMESTAMP_EXPIRE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty FIRST_TIME_CLOSED_TIMESTAMP_EXPIRE;

    /* JADX INFO: renamed from: FIRST_TIME_CLOSED_TIMESTAMP_LOSE_DATA$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty FIRST_TIME_CLOSED_TIMESTAMP_LOSE_DATA;

    @NotNull
    public static final BloodSugarPermissionGuidePreference INSTANCE;

    static {
        BloodSugarPermissionGuidePreference bloodSugarPermissionGuidePreference = new BloodSugarPermissionGuidePreference();
        INSTANCE = bloodSugarPermissionGuidePreference;
        FIRST_TIME_CLOSED_TIMESTAMP_EXPIRE = bloodSugarPermissionGuidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.health.bloodglucose.util.BloodSugarPermissionGuidePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0L, null, true);
        FIRST_TIME_CLOSED_TIMESTAMP_AUTO = bloodSugarPermissionGuidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.health.bloodglucose.util.BloodSugarPermissionGuidePreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), 0L, null, true);
        FIRST_TIME_CLOSED_TIMESTAMP_ABNORMAL = bloodSugarPermissionGuidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.health.bloodglucose.util.BloodSugarPermissionGuidePreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), 0L, null, true);
        FIRST_TIME_CLOSED_TIMESTAMP_LOSE_DATA = bloodSugarPermissionGuidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.health.bloodglucose.util.BloodSugarPermissionGuidePreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), 0L, null, true);
    }

    private BloodSugarPermissionGuidePreference() {
    }

    public final long getFIRST_TIME_CLOSED_TIMESTAMP_ABNORMAL() {
        return ((Number) FIRST_TIME_CLOSED_TIMESTAMP_ABNORMAL.getValue(this, $$delegatedProperties[2])).longValue();
    }

    public final long getFIRST_TIME_CLOSED_TIMESTAMP_AUTO() {
        return ((Number) FIRST_TIME_CLOSED_TIMESTAMP_AUTO.getValue(this, $$delegatedProperties[1])).longValue();
    }

    public final long getFIRST_TIME_CLOSED_TIMESTAMP_EXPIRE() {
        return ((Number) FIRST_TIME_CLOSED_TIMESTAMP_EXPIRE.getValue(this, $$delegatedProperties[0])).longValue();
    }

    public final long getFIRST_TIME_CLOSED_TIMESTAMP_LOSE_DATA() {
        return ((Number) FIRST_TIME_CLOSED_TIMESTAMP_LOSE_DATA.getValue(this, $$delegatedProperties[3])).longValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "blood_sugar_permission_preference";
    }

    public final void setFIRST_TIME_CLOSED_TIMESTAMP_ABNORMAL(long j) {
        FIRST_TIME_CLOSED_TIMESTAMP_ABNORMAL.setValue(this, $$delegatedProperties[2], Long.valueOf(j));
    }

    public final void setFIRST_TIME_CLOSED_TIMESTAMP_AUTO(long j) {
        FIRST_TIME_CLOSED_TIMESTAMP_AUTO.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }

    public final void setFIRST_TIME_CLOSED_TIMESTAMP_EXPIRE(long j) {
        FIRST_TIME_CLOSED_TIMESTAMP_EXPIRE.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    public final void setFIRST_TIME_CLOSED_TIMESTAMP_LOSE_DATA(long j) {
        FIRST_TIME_CLOSED_TIMESTAMP_LOSE_DATA.setValue(this, $$delegatedProperties[3], Long.valueOf(j));
    }
}
