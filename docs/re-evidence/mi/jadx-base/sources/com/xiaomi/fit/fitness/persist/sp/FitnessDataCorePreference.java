package com.xiaomi.fit.fitness.persist.sp;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/sp/FitnessDataCorePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "MARK_MIGRATE", "getMARK_MIGRATE", "()Z", "setMARK_MIGRATE", "(Z)V", "MARK_MIGRATE$delegate", "Lkotlin/properties/ReadWriteProperty;", "MARK_NEW_MIGRATE_USER_V2", "getMARK_NEW_MIGRATE_USER_V2", "setMARK_NEW_MIGRATE_USER_V2", "(Ljava/lang/String;)V", "MARK_NEW_MIGRATE_USER_V2$delegate", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFitnessDataCorePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessDataCorePreference.kt\ncom/xiaomi/fit/fitness/persist/sp/FitnessDataCorePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,17:1\n135#2,6:18\n135#2,6:24\n*S KotlinDebug\n*F\n+ 1 FitnessDataCorePreference.kt\ncom/xiaomi/fit/fitness/persist/sp/FitnessDataCorePreference\n*L\n14#1:18,6\n16#1:24,6\n*E\n"})
public final class FitnessDataCorePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessDataCorePreference.class, "MARK_MIGRATE", "getMARK_MIGRATE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FitnessDataCorePreference.class, "MARK_NEW_MIGRATE_USER_V2", "getMARK_NEW_MIGRATE_USER_V2()Ljava/lang/String;", 0))};

    @NotNull
    public static final FitnessDataCorePreference INSTANCE;

    /* JADX INFO: renamed from: MARK_MIGRATE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty MARK_MIGRATE;

    /* JADX INFO: renamed from: MARK_NEW_MIGRATE_USER_V2$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty MARK_NEW_MIGRATE_USER_V2;

    static {
        FitnessDataCorePreference fitnessDataCorePreference = new FitnessDataCorePreference();
        INSTANCE = fitnessDataCorePreference;
        MARK_MIGRATE = fitnessDataCorePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fit.fitness.persist.sp.FitnessDataCorePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), Boolean.FALSE, null, true);
        MARK_NEW_MIGRATE_USER_V2 = fitnessDataCorePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fit.fitness.persist.sp.FitnessDataCorePreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), "", null, true);
    }

    private FitnessDataCorePreference() {
    }

    public final boolean getMARK_MIGRATE() {
        return ((Boolean) MARK_MIGRATE.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    @NotNull
    public final String getMARK_NEW_MIGRATE_USER_V2() {
        return (String) MARK_NEW_MIGRATE_USER_V2.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "fitness_data_vore";
    }

    public final void setMARK_MIGRATE(boolean z) {
        MARK_MIGRATE.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setMARK_NEW_MIGRATE_USER_V2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        MARK_NEW_MIGRATE_USER_V2.setValue(this, $$delegatedProperties[1], str);
    }
}
