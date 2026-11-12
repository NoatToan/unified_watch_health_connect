package com.xiaomi.fitness.health.sleep.interfere.utils;

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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR+\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR+\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0010\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000e¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/utils/SleepInterferePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "CustomPeriod", "getCustomPeriod", "()Z", "setCustomPeriod", "(Z)V", "CustomPeriod$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "SleepInterferePeriod", "getSleepInterferePeriod", "()I", "setSleepInterferePeriod", "(I)V", "SleepInterferePeriod$delegate", "FutureTaskComplete", "getFutureTaskComplete", "setFutureTaskComplete", "FutureTaskComplete$delegate", "AutoTaskComplete", "getAutoTaskComplete", "setAutoTaskComplete", "AutoTaskComplete$delegate", "IgnoreNapSleep8Check", "getIgnoreNapSleep8Check", "setIgnoreNapSleep8Check", "IgnoreNapSleep8Check$delegate", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepInterferePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInterferePreference.kt\ncom/xiaomi/fitness/health/sleep/interfere/utils/SleepInterferePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,19:1\n135#2,6:20\n135#2,6:26\n135#2,6:32\n135#2,6:38\n135#2,6:44\n*S KotlinDebug\n*F\n+ 1 SleepInterferePreference.kt\ncom/xiaomi/fitness/health/sleep/interfere/utils/SleepInterferePreference\n*L\n10#1:20,6\n12#1:26,6\n14#1:32,6\n16#1:38,6\n18#1:44,6\n*E\n"})
public final class SleepInterferePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepInterferePreference.class, "CustomPeriod", "getCustomPeriod()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepInterferePreference.class, "SleepInterferePeriod", "getSleepInterferePeriod()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepInterferePreference.class, "FutureTaskComplete", "getFutureTaskComplete()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepInterferePreference.class, "AutoTaskComplete", "getAutoTaskComplete()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepInterferePreference.class, "IgnoreNapSleep8Check", "getIgnoreNapSleep8Check()Z", 0))};

    /* JADX INFO: renamed from: AutoTaskComplete$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty AutoTaskComplete;

    /* JADX INFO: renamed from: CustomPeriod$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CustomPeriod;

    /* JADX INFO: renamed from: FutureTaskComplete$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty FutureTaskComplete;

    @NotNull
    public static final SleepInterferePreference INSTANCE;

    /* JADX INFO: renamed from: IgnoreNapSleep8Check$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty IgnoreNapSleep8Check;

    /* JADX INFO: renamed from: SleepInterferePeriod$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SleepInterferePeriod;

    static {
        SleepInterferePreference sleepInterferePreference = new SleepInterferePreference();
        INSTANCE = sleepInterferePreference;
        Boolean bool = Boolean.FALSE;
        CustomPeriod = sleepInterferePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.health.sleep.interfere.utils.SleepInterferePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), bool, null, true);
        SleepInterferePeriod = sleepInterferePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.health.sleep.interfere.utils.SleepInterferePreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), 21, null, true);
        FutureTaskComplete = sleepInterferePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.health.sleep.interfere.utils.SleepInterferePreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), bool, null, true);
        AutoTaskComplete = sleepInterferePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.health.sleep.interfere.utils.SleepInterferePreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), bool, null, true);
        IgnoreNapSleep8Check = sleepInterferePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.health.sleep.interfere.utils.SleepInterferePreference$special$$inlined$bindToPreferenceField$default$5
        }.getType(), bool, null, true);
    }

    private SleepInterferePreference() {
    }

    public final boolean getAutoTaskComplete() {
        return ((Boolean) AutoTaskComplete.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    public final boolean getCustomPeriod() {
        return ((Boolean) CustomPeriod.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final boolean getFutureTaskComplete() {
        return ((Boolean) FutureTaskComplete.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public final boolean getIgnoreNapSleep8Check() {
        return ((Boolean) IgnoreNapSleep8Check.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    public final int getSleepInterferePeriod() {
        return ((Number) SleepInterferePeriod.getValue(this, $$delegatedProperties[1])).intValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "sleep_21_days_interfere";
    }

    public final void setAutoTaskComplete(boolean z) {
        AutoTaskComplete.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    public final void setCustomPeriod(boolean z) {
        CustomPeriod.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setFutureTaskComplete(boolean z) {
        FutureTaskComplete.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    public final void setIgnoreNapSleep8Check(boolean z) {
        IgnoreNapSleep8Check.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    public final void setSleepInterferePeriod(int i) {
        SleepInterferePeriod.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }
}
