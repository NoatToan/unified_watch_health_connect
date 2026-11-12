package com.xiaomi.fitness.health.sleep.ui.setting.repository;

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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00188F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010\u001f\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0010\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R+\u0010#\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0010\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR+\u0010'\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0010\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u0016R+\u0010+\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u0010\u001a\u0004\b,\u0010\u0014\"\u0004\b-\u0010\u0016R+\u0010/\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u0010\u001a\u0004\b0\u0010\u0014\"\u0004\b1\u0010\u0016R+\u00103\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010\u0010\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010\u0016¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/setting/repository/SleepTracePermissionGuidePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "CLOSE_COUNT", "getCLOSE_COUNT", "()I", "setCLOSE_COUNT", "(I)V", "CLOSE_COUNT$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "FIRST_TIME_CLOSED_TIMESTAMP", "getFIRST_TIME_CLOSED_TIMESTAMP", "()J", "setFIRST_TIME_CLOSED_TIMESTAMP", "(J)V", "FIRST_TIME_CLOSED_TIMESTAMP$delegate", "", "SLEEP_DISTRIBUTE_SHOW_ENABLE", "getSLEEP_DISTRIBUTE_SHOW_ENABLE", "()Z", "setSLEEP_DISTRIBUTE_SHOW_ENABLE", "(Z)V", "SLEEP_DISTRIBUTE_SHOW_ENABLE$delegate", "FIRST_TIME_CLOSED_AUDIO_TITLE", "getFIRST_TIME_CLOSED_AUDIO_TITLE", "setFIRST_TIME_CLOSED_AUDIO_TITLE", "FIRST_TIME_CLOSED_AUDIO_TITLE$delegate", "CLOSE_AUDIO_COUNT", "getCLOSE_AUDIO_COUNT", "setCLOSE_AUDIO_COUNT", "CLOSE_AUDIO_COUNT$delegate", "OPEN_AUDIO_SWITCH_TIME", "getOPEN_AUDIO_SWITCH_TIME", "setOPEN_AUDIO_SWITCH_TIME", "OPEN_AUDIO_SWITCH_TIME$delegate", "FIRST_LOOK_SLEEP_DATA_TIME", "getFIRST_LOOK_SLEEP_DATA_TIME", "setFIRST_LOOK_SLEEP_DATA_TIME", "FIRST_LOOK_SLEEP_DATA_TIME$delegate", "SETTING_CLOSED_TIMESTAMP", "getSETTING_CLOSED_TIMESTAMP", "setSETTING_CLOSED_TIMESTAMP", "SETTING_CLOSED_TIMESTAMP$delegate", "SETTING_DIALOG_CLOSED_TIMESTAMP", "getSETTING_DIALOG_CLOSED_TIMESTAMP", "setSETTING_DIALOG_CLOSED_TIMESTAMP", "SETTING_DIALOG_CLOSED_TIMESTAMP$delegate", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepTracePermissionGuidePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepTracePermissionGuidePreference.kt\ncom/xiaomi/fitness/health/sleep/ui/setting/repository/SleepTracePermissionGuidePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,17:1\n135#2,6:18\n135#2,6:24\n135#2,6:30\n135#2,6:36\n135#2,6:42\n135#2,6:48\n135#2,6:54\n135#2,6:60\n135#2,6:66\n*S KotlinDebug\n*F\n+ 1 SleepTracePermissionGuidePreference.kt\ncom/xiaomi/fitness/health/sleep/ui/setting/repository/SleepTracePermissionGuidePreference\n*L\n8#1:18,6\n9#1:24,6\n10#1:30,6\n11#1:36,6\n12#1:42,6\n13#1:48,6\n14#1:54,6\n15#1:60,6\n16#1:66,6\n*E\n"})
public final class SleepTracePermissionGuidePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepTracePermissionGuidePreference.class, "CLOSE_COUNT", "getCLOSE_COUNT()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepTracePermissionGuidePreference.class, "FIRST_TIME_CLOSED_TIMESTAMP", "getFIRST_TIME_CLOSED_TIMESTAMP()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepTracePermissionGuidePreference.class, "SLEEP_DISTRIBUTE_SHOW_ENABLE", "getSLEEP_DISTRIBUTE_SHOW_ENABLE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepTracePermissionGuidePreference.class, "FIRST_TIME_CLOSED_AUDIO_TITLE", "getFIRST_TIME_CLOSED_AUDIO_TITLE()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepTracePermissionGuidePreference.class, "CLOSE_AUDIO_COUNT", "getCLOSE_AUDIO_COUNT()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepTracePermissionGuidePreference.class, "OPEN_AUDIO_SWITCH_TIME", "getOPEN_AUDIO_SWITCH_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepTracePermissionGuidePreference.class, "FIRST_LOOK_SLEEP_DATA_TIME", "getFIRST_LOOK_SLEEP_DATA_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepTracePermissionGuidePreference.class, "SETTING_CLOSED_TIMESTAMP", "getSETTING_CLOSED_TIMESTAMP()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepTracePermissionGuidePreference.class, "SETTING_DIALOG_CLOSED_TIMESTAMP", "getSETTING_DIALOG_CLOSED_TIMESTAMP()J", 0))};

    /* JADX INFO: renamed from: CLOSE_AUDIO_COUNT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CLOSE_AUDIO_COUNT;

    /* JADX INFO: renamed from: CLOSE_COUNT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CLOSE_COUNT;

    /* JADX INFO: renamed from: FIRST_LOOK_SLEEP_DATA_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty FIRST_LOOK_SLEEP_DATA_TIME;

    /* JADX INFO: renamed from: FIRST_TIME_CLOSED_AUDIO_TITLE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty FIRST_TIME_CLOSED_AUDIO_TITLE;

    /* JADX INFO: renamed from: FIRST_TIME_CLOSED_TIMESTAMP$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty FIRST_TIME_CLOSED_TIMESTAMP;

    @NotNull
    public static final SleepTracePermissionGuidePreference INSTANCE;

    /* JADX INFO: renamed from: OPEN_AUDIO_SWITCH_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty OPEN_AUDIO_SWITCH_TIME;

    /* JADX INFO: renamed from: SETTING_CLOSED_TIMESTAMP$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SETTING_CLOSED_TIMESTAMP;

    /* JADX INFO: renamed from: SETTING_DIALOG_CLOSED_TIMESTAMP$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SETTING_DIALOG_CLOSED_TIMESTAMP;

    /* JADX INFO: renamed from: SLEEP_DISTRIBUTE_SHOW_ENABLE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SLEEP_DISTRIBUTE_SHOW_ENABLE;

    static {
        SleepTracePermissionGuidePreference sleepTracePermissionGuidePreference = new SleepTracePermissionGuidePreference();
        INSTANCE = sleepTracePermissionGuidePreference;
        CLOSE_COUNT = sleepTracePermissionGuidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepTracePermissionGuidePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0, null, true);
        FIRST_TIME_CLOSED_TIMESTAMP = sleepTracePermissionGuidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepTracePermissionGuidePreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), 0L, null, true);
        SLEEP_DISTRIBUTE_SHOW_ENABLE = sleepTracePermissionGuidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepTracePermissionGuidePreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), Boolean.TRUE, null, true);
        FIRST_TIME_CLOSED_AUDIO_TITLE = sleepTracePermissionGuidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepTracePermissionGuidePreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), 0L, null, true);
        CLOSE_AUDIO_COUNT = sleepTracePermissionGuidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepTracePermissionGuidePreference$special$$inlined$bindToPreferenceField$default$5
        }.getType(), 0, null, true);
        OPEN_AUDIO_SWITCH_TIME = sleepTracePermissionGuidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepTracePermissionGuidePreference$special$$inlined$bindToPreferenceField$default$6
        }.getType(), 0L, null, true);
        FIRST_LOOK_SLEEP_DATA_TIME = sleepTracePermissionGuidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepTracePermissionGuidePreference$special$$inlined$bindToPreferenceField$default$7
        }.getType(), 0L, null, true);
        SETTING_CLOSED_TIMESTAMP = sleepTracePermissionGuidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepTracePermissionGuidePreference$special$$inlined$bindToPreferenceField$default$8
        }.getType(), 0L, null, true);
        SETTING_DIALOG_CLOSED_TIMESTAMP = sleepTracePermissionGuidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.repository.SleepTracePermissionGuidePreference$special$$inlined$bindToPreferenceField$default$9
        }.getType(), 0L, null, true);
    }

    private SleepTracePermissionGuidePreference() {
    }

    public final int getCLOSE_AUDIO_COUNT() {
        return ((Number) CLOSE_AUDIO_COUNT.getValue(this, $$delegatedProperties[4])).intValue();
    }

    public final int getCLOSE_COUNT() {
        return ((Number) CLOSE_COUNT.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final long getFIRST_LOOK_SLEEP_DATA_TIME() {
        return ((Number) FIRST_LOOK_SLEEP_DATA_TIME.getValue(this, $$delegatedProperties[6])).longValue();
    }

    public final long getFIRST_TIME_CLOSED_AUDIO_TITLE() {
        return ((Number) FIRST_TIME_CLOSED_AUDIO_TITLE.getValue(this, $$delegatedProperties[3])).longValue();
    }

    public final long getFIRST_TIME_CLOSED_TIMESTAMP() {
        return ((Number) FIRST_TIME_CLOSED_TIMESTAMP.getValue(this, $$delegatedProperties[1])).longValue();
    }

    public final long getOPEN_AUDIO_SWITCH_TIME() {
        return ((Number) OPEN_AUDIO_SWITCH_TIME.getValue(this, $$delegatedProperties[5])).longValue();
    }

    public final long getSETTING_CLOSED_TIMESTAMP() {
        return ((Number) SETTING_CLOSED_TIMESTAMP.getValue(this, $$delegatedProperties[7])).longValue();
    }

    public final long getSETTING_DIALOG_CLOSED_TIMESTAMP() {
        return ((Number) SETTING_DIALOG_CLOSED_TIMESTAMP.getValue(this, $$delegatedProperties[8])).longValue();
    }

    public final boolean getSLEEP_DISTRIBUTE_SHOW_ENABLE() {
        return ((Boolean) SLEEP_DISTRIBUTE_SHOW_ENABLE.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "sleep_trace_permission_guide";
    }

    public final void setCLOSE_AUDIO_COUNT(int i) {
        CLOSE_AUDIO_COUNT.setValue(this, $$delegatedProperties[4], Integer.valueOf(i));
    }

    public final void setCLOSE_COUNT(int i) {
        CLOSE_COUNT.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public final void setFIRST_LOOK_SLEEP_DATA_TIME(long j) {
        FIRST_LOOK_SLEEP_DATA_TIME.setValue(this, $$delegatedProperties[6], Long.valueOf(j));
    }

    public final void setFIRST_TIME_CLOSED_AUDIO_TITLE(long j) {
        FIRST_TIME_CLOSED_AUDIO_TITLE.setValue(this, $$delegatedProperties[3], Long.valueOf(j));
    }

    public final void setFIRST_TIME_CLOSED_TIMESTAMP(long j) {
        FIRST_TIME_CLOSED_TIMESTAMP.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }

    public final void setOPEN_AUDIO_SWITCH_TIME(long j) {
        OPEN_AUDIO_SWITCH_TIME.setValue(this, $$delegatedProperties[5], Long.valueOf(j));
    }

    public final void setSETTING_CLOSED_TIMESTAMP(long j) {
        SETTING_CLOSED_TIMESTAMP.setValue(this, $$delegatedProperties[7], Long.valueOf(j));
    }

    public final void setSETTING_DIALOG_CLOSED_TIMESTAMP(long j) {
        SETTING_DIALOG_CLOSED_TIMESTAMP.setValue(this, $$delegatedProperties[8], Long.valueOf(j));
    }

    public final void setSLEEP_DISTRIBUTE_SHOW_ENABLE(boolean z) {
        SLEEP_DISTRIBUTE_SHOW_ENABLE.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }
}
