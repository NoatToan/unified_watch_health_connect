package com.xiaomi.fitness.repo.sleep.sp;

import com.google.gson.Gson;
import com.xiaomi.fit.fitness.export.data.distribute.SleepDistributeConfig;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R+\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/repo/sleep/sp/SleepDataCorePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "TAG", "<set-?>", "KEY_SLEEP_DISTRIBUTE_CONFIG", "getKEY_SLEEP_DISTRIBUTE_CONFIG", "setKEY_SLEEP_DISTRIBUTE_CONFIG", "(Ljava/lang/String;)V", "KEY_SLEEP_DISTRIBUTE_CONFIG$delegate", "Lkotlin/properties/ReadWriteProperty;", "updateDistributeConfig", "", "map", "", "", "age", "getSleepDistributeConfig", "Lcom/xiaomi/fit/fitness/export/data/distribute/SleepDistributeConfig;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepDataCorePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepDataCorePreference.kt\ncom/xiaomi/fitness/repo/sleep/sp/SleepDataCorePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,36:1\n135#2,6:37\n*S KotlinDebug\n*F\n+ 1 SleepDataCorePreference.kt\ncom/xiaomi/fitness/repo/sleep/sp/SleepDataCorePreference\n*L\n16#1:37,6\n*E\n"})
public final class SleepDataCorePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SleepDataCorePreference.class, "KEY_SLEEP_DISTRIBUTE_CONFIG", "getKEY_SLEEP_DISTRIBUTE_CONFIG()Ljava/lang/String;", 0))};

    @NotNull
    public static final SleepDataCorePreference INSTANCE;

    /* JADX INFO: renamed from: KEY_SLEEP_DISTRIBUTE_CONFIG$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_SLEEP_DISTRIBUTE_CONFIG;

    @NotNull
    public static final String TAG = "SleepDataCorePreference";

    static {
        SleepDataCorePreference sleepDataCorePreference = new SleepDataCorePreference();
        INSTANCE = sleepDataCorePreference;
        KEY_SLEEP_DISTRIBUTE_CONFIG = sleepDataCorePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.repo.sleep.sp.SleepDataCorePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), "", null, true);
    }

    private SleepDataCorePreference() {
    }

    private final String getKEY_SLEEP_DISTRIBUTE_CONFIG() {
        return (String) KEY_SLEEP_DISTRIBUTE_CONFIG.getValue(this, $$delegatedProperties[0]);
    }

    private final void setKEY_SLEEP_DISTRIBUTE_CONFIG(String str) {
        KEY_SLEEP_DISTRIBUTE_CONFIG.setValue(this, $$delegatedProperties[0], str);
    }

    @Nullable
    public final SleepDistributeConfig getSleepDistributeConfig() {
        SleepDistributeConfig sleepDistributeConfig = (SleepDistributeConfig) new Gson().fromJson(getKEY_SLEEP_DISTRIBUTE_CONFIG(), SleepDistributeConfig.class);
        Logger.i(TAG, "getSleepDistributeConfig " + sleepDistributeConfig);
        return sleepDistributeConfig;
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "health_data_core_sleep_pref";
    }

    public final void updateDistributeConfig(@Nullable Map<Integer, Integer> map, int age) {
        Logger.i(TAG, "updateDistributeConfig " + map);
        if (map == null) {
            return;
        }
        setKEY_SLEEP_DISTRIBUTE_CONFIG(new Gson().toJson(new SleepDistributeConfig(TimeUtils.getBeginOfToday() / ((long) 1000), map, age)));
    }
}
