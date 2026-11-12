package com.xiaomi.fitness.health.threetarget.model;

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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/model/ThreeTargetPermissionGuidePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "SHOW_COUNT", "getSHOW_COUNT", "()I", "setSHOW_COUNT", "(I)V", "SHOW_COUNT$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "FIRST_TIME_SHOW_TIMESTAMP", "getFIRST_TIME_SHOW_TIMESTAMP", "()J", "setFIRST_TIME_SHOW_TIMESTAMP", "(J)V", "FIRST_TIME_SHOW_TIMESTAMP$delegate", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nThreeTargetPermissionGuidePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreeTargetPermissionGuidePreference.kt\ncom/xiaomi/fitness/health/threetarget/model/ThreeTargetPermissionGuidePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,10:1\n135#2,6:11\n135#2,6:17\n*S KotlinDebug\n*F\n+ 1 ThreeTargetPermissionGuidePreference.kt\ncom/xiaomi/fitness/health/threetarget/model/ThreeTargetPermissionGuidePreference\n*L\n8#1:11,6\n9#1:17,6\n*E\n"})
public final class ThreeTargetPermissionGuidePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ThreeTargetPermissionGuidePreference.class, "SHOW_COUNT", "getSHOW_COUNT()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ThreeTargetPermissionGuidePreference.class, "FIRST_TIME_SHOW_TIMESTAMP", "getFIRST_TIME_SHOW_TIMESTAMP()J", 0))};

    /* JADX INFO: renamed from: FIRST_TIME_SHOW_TIMESTAMP$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty FIRST_TIME_SHOW_TIMESTAMP;

    @NotNull
    public static final ThreeTargetPermissionGuidePreference INSTANCE;

    /* JADX INFO: renamed from: SHOW_COUNT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SHOW_COUNT;

    static {
        ThreeTargetPermissionGuidePreference threeTargetPermissionGuidePreference = new ThreeTargetPermissionGuidePreference();
        INSTANCE = threeTargetPermissionGuidePreference;
        SHOW_COUNT = threeTargetPermissionGuidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.health.threetarget.model.ThreeTargetPermissionGuidePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0, null, true);
        FIRST_TIME_SHOW_TIMESTAMP = threeTargetPermissionGuidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.health.threetarget.model.ThreeTargetPermissionGuidePreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), 0L, null, true);
    }

    private ThreeTargetPermissionGuidePreference() {
    }

    public final long getFIRST_TIME_SHOW_TIMESTAMP() {
        return ((Number) FIRST_TIME_SHOW_TIMESTAMP.getValue(this, $$delegatedProperties[1])).longValue();
    }

    public final int getSHOW_COUNT() {
        return ((Number) SHOW_COUNT.getValue(this, $$delegatedProperties[0])).intValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "sleep_trace_permission_guide";
    }

    public final void setFIRST_TIME_SHOW_TIMESTAMP(long j) {
        FIRST_TIME_SHOW_TIMESTAMP.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }

    public final void setSHOW_COUNT(int i) {
        SHOW_COUNT.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }
}
