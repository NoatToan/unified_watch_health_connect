package com.mi.health.sleep;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR+\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR+\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR+\u0010\u001e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0011\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u000f¨\u0006\""}, d2 = {"Lcom/mi/health/sleep/SleepConfigPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "defVal", "", "<set-?>", "KEY_SLEEP_HOUR", "getKEY_SLEEP_HOUR", "()I", "setKEY_SLEEP_HOUR", "(I)V", "KEY_SLEEP_HOUR$delegate", "Lkotlin/properties/ReadWriteProperty;", "KEY_SLEEP_MIN", "getKEY_SLEEP_MIN", "setKEY_SLEEP_MIN", "KEY_SLEEP_MIN$delegate", "KEY_WAKE_HOUR", "getKEY_WAKE_HOUR", "setKEY_WAKE_HOUR", "KEY_WAKE_HOUR$delegate", "KEY_WAKE_MIN", "getKEY_WAKE_MIN", "setKEY_WAKE_MIN", "KEY_WAKE_MIN$delegate", "KEY_REPEAT", "getKEY_REPEAT", "setKEY_REPEAT", "KEY_REPEAT$delegate", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepConfigPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepConfigPreference.kt\ncom/mi/health/sleep/SleepConfigPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,19:1\n135#2,6:20\n135#2,6:26\n135#2,6:32\n135#2,6:38\n135#2,6:44\n*S KotlinDebug\n*F\n+ 1 SleepConfigPreference.kt\ncom/mi/health/sleep/SleepConfigPreference\n*L\n14#1:20,6\n15#1:26,6\n16#1:32,6\n17#1:38,6\n18#1:44,6\n*E\n"})
public final class SleepConfigPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepConfigPreference.class, "KEY_SLEEP_HOUR", "getKEY_SLEEP_HOUR()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepConfigPreference.class, "KEY_SLEEP_MIN", "getKEY_SLEEP_MIN()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepConfigPreference.class, "KEY_WAKE_HOUR", "getKEY_WAKE_HOUR()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepConfigPreference.class, "KEY_WAKE_MIN", "getKEY_WAKE_MIN()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepConfigPreference.class, "KEY_REPEAT", "getKEY_REPEAT()I", 0))};

    @NotNull
    public static final SleepConfigPreference INSTANCE;

    /* JADX INFO: renamed from: KEY_REPEAT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_REPEAT;

    /* JADX INFO: renamed from: KEY_SLEEP_HOUR$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_SLEEP_HOUR;

    /* JADX INFO: renamed from: KEY_SLEEP_MIN$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_SLEEP_MIN;

    /* JADX INFO: renamed from: KEY_WAKE_HOUR$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_WAKE_HOUR;

    /* JADX INFO: renamed from: KEY_WAKE_MIN$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_WAKE_MIN;
    private static final int defVal = 0;

    static {
        SleepConfigPreference sleepConfigPreference = new SleepConfigPreference();
        INSTANCE = sleepConfigPreference;
        KEY_SLEEP_HOUR = sleepConfigPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.mi.health.sleep.SleepConfigPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), 0, "sleep_hour", true);
        KEY_SLEEP_MIN = sleepConfigPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.mi.health.sleep.SleepConfigPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), 0, "sleep_min", true);
        KEY_WAKE_HOUR = sleepConfigPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.mi.health.sleep.SleepConfigPreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), 0, "wake_hour", true);
        KEY_WAKE_MIN = sleepConfigPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.mi.health.sleep.SleepConfigPreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), 0, "wake_min", true);
        KEY_REPEAT = sleepConfigPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.mi.health.sleep.SleepConfigPreference$special$$inlined$bindToPreferenceField$default$5
        }.getType(), 0, "repeat", true);
    }

    private SleepConfigPreference() {
    }

    public final int getKEY_REPEAT() {
        return ((Number) KEY_REPEAT.getValue(this, $$delegatedProperties[4])).intValue();
    }

    public final int getKEY_SLEEP_HOUR() {
        return ((Number) KEY_SLEEP_HOUR.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final int getKEY_SLEEP_MIN() {
        return ((Number) KEY_SLEEP_MIN.getValue(this, $$delegatedProperties[1])).intValue();
    }

    public final int getKEY_WAKE_HOUR() {
        return ((Number) KEY_WAKE_HOUR.getValue(this, $$delegatedProperties[2])).intValue();
    }

    public final int getKEY_WAKE_MIN() {
        return ((Number) KEY_WAKE_MIN.getValue(this, $$delegatedProperties[3])).intValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "sleep_schedule_spf";
    }

    public final void setKEY_REPEAT(int i) {
        KEY_REPEAT.setValue(this, $$delegatedProperties[4], Integer.valueOf(i));
    }

    public final void setKEY_SLEEP_HOUR(int i) {
        KEY_SLEEP_HOUR.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public final void setKEY_SLEEP_MIN(int i) {
        KEY_SLEEP_MIN.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    public final void setKEY_WAKE_HOUR(int i) {
        KEY_WAKE_HOUR.setValue(this, $$delegatedProperties[2], Integer.valueOf(i));
    }

    public final void setKEY_WAKE_MIN(int i) {
        KEY_WAKE_MIN.setValue(this, $$delegatedProperties[3], Integer.valueOf(i));
    }
}
