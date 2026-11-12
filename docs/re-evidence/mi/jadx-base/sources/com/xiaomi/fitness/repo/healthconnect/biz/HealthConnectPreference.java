package com.xiaomi.fitness.repo.healthconnect.biz;

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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0018\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/biz/HealthConnectPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "KEY_LAST_START_SYNC_TIME", "getKEY_LAST_START_SYNC_TIME", "()J", "setKEY_LAST_START_SYNC_TIME", "(J)V", "KEY_LAST_START_SYNC_TIME$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "KEY_SYNC_RECORDS_FAILURE_TIMES", "getKEY_SYNC_RECORDS_FAILURE_TIMES", "()I", "setKEY_SYNC_RECORDS_FAILURE_TIMES", "(I)V", "KEY_SYNC_RECORDS_FAILURE_TIMES$delegate", "KEY_SYNC_REPORT_FAILURE_TIMES", "getKEY_SYNC_REPORT_FAILURE_TIMES", "setKEY_SYNC_REPORT_FAILURE_TIMES", "KEY_SYNC_REPORT_FAILURE_TIMES$delegate", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHealthConnectPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectPreference.kt\ncom/xiaomi/fitness/repo/healthconnect/biz/HealthConnectPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,29:1\n211#2,7:30\n211#2,7:37\n211#2,7:44\n*S KotlinDebug\n*F\n+ 1 HealthConnectPreference.kt\ncom/xiaomi/fitness/repo/healthconnect/biz/HealthConnectPreference\n*L\n10#1:30,7\n17#1:37,7\n24#1:44,7\n*E\n"})
public final class HealthConnectPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(HealthConnectPreference.class, "KEY_LAST_START_SYNC_TIME", "getKEY_LAST_START_SYNC_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(HealthConnectPreference.class, "KEY_SYNC_RECORDS_FAILURE_TIMES", "getKEY_SYNC_RECORDS_FAILURE_TIMES()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(HealthConnectPreference.class, "KEY_SYNC_REPORT_FAILURE_TIMES", "getKEY_SYNC_REPORT_FAILURE_TIMES()I", 0))};

    @NotNull
    public static final HealthConnectPreference INSTANCE;

    /* JADX INFO: renamed from: KEY_LAST_START_SYNC_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_LAST_START_SYNC_TIME;

    /* JADX INFO: renamed from: KEY_SYNC_RECORDS_FAILURE_TIMES$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_SYNC_RECORDS_FAILURE_TIMES;

    /* JADX INFO: renamed from: KEY_SYNC_REPORT_FAILURE_TIMES$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_SYNC_REPORT_FAILURE_TIMES;

    static {
        HealthConnectPreference healthConnectPreference = new HealthConnectPreference();
        INSTANCE = healthConnectPreference;
        KEY_LAST_START_SYNC_TIME = healthConnectPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.repo.healthconnect.biz.HealthConnectPreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), 0L, null, "app_pref", "key_health_connect_start_sync_time");
        KEY_SYNC_RECORDS_FAILURE_TIMES = healthConnectPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.repo.healthconnect.biz.HealthConnectPreference$special$$inlined$bindAndMigratePrefer$default$2
        }.getType(), 0, null, "app_pref", "key_health_connect_sync_records_failure_times");
        KEY_SYNC_REPORT_FAILURE_TIMES = healthConnectPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.repo.healthconnect.biz.HealthConnectPreference$special$$inlined$bindAndMigratePrefer$default$3
        }.getType(), 0, null, "app_pref", "key_health_connect_sync_report_failure_times");
    }

    private HealthConnectPreference() {
    }

    public final long getKEY_LAST_START_SYNC_TIME() {
        return ((Number) KEY_LAST_START_SYNC_TIME.getValue(this, $$delegatedProperties[0])).longValue();
    }

    public final int getKEY_SYNC_RECORDS_FAILURE_TIMES() {
        return ((Number) KEY_SYNC_RECORDS_FAILURE_TIMES.getValue(this, $$delegatedProperties[1])).intValue();
    }

    public final int getKEY_SYNC_REPORT_FAILURE_TIMES() {
        return ((Number) KEY_SYNC_REPORT_FAILURE_TIMES.getValue(this, $$delegatedProperties[2])).intValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "health_connect";
    }

    public final void setKEY_LAST_START_SYNC_TIME(long j) {
        KEY_LAST_START_SYNC_TIME.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    public final void setKEY_SYNC_RECORDS_FAILURE_TIMES(int i) {
        KEY_SYNC_RECORDS_FAILURE_TIMES.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    public final void setKEY_SYNC_REPORT_FAILURE_TIMES(int i) {
        KEY_SYNC_REPORT_FAILURE_TIMES.setValue(this, $$delegatedProperties[2], Integer.valueOf(i));
    }
}
