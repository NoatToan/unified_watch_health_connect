package com.xiaomi.fit.data.common.util;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/data/common/util/FitnessPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "DEVICE_LAUNCH_GPS_SPORT", "getDEVICE_LAUNCH_GPS_SPORT", "()Z", "setDEVICE_LAUNCH_GPS_SPORT", "(Z)V", "DEVICE_LAUNCH_GPS_SPORT$delegate", "Lkotlin/properties/ReadWriteProperty;", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFitnessPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessPreference.kt\ncom/xiaomi/fit/data/common/util/FitnessPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,10:1\n135#2,6:11\n*S KotlinDebug\n*F\n+ 1 FitnessPreference.kt\ncom/xiaomi/fit/data/common/util/FitnessPreference\n*L\n9#1:11,6\n*E\n"})
public final class FitnessPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessPreference.class, "DEVICE_LAUNCH_GPS_SPORT", "getDEVICE_LAUNCH_GPS_SPORT()Z", 0))};

    /* JADX INFO: renamed from: DEVICE_LAUNCH_GPS_SPORT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DEVICE_LAUNCH_GPS_SPORT;

    @NotNull
    public static final FitnessPreference INSTANCE;

    static {
        FitnessPreference fitnessPreference = new FitnessPreference();
        INSTANCE = fitnessPreference;
        DEVICE_LAUNCH_GPS_SPORT = fitnessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fit.data.common.util.FitnessPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), Boolean.FALSE, null, true);
    }

    private FitnessPreference() {
    }

    public final boolean getDEVICE_LAUNCH_GPS_SPORT() {
        return ((Boolean) DEVICE_LAUNCH_GPS_SPORT.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "fitness_preference";
    }

    public final void setDEVICE_LAUNCH_GPS_SPORT(boolean z) {
        DEVICE_LAUNCH_GPS_SPORT.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }
}
