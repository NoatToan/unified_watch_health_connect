package com.xiaomi.fitness.sport_manager_export.utils;

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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\fR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/utils/SportManagerExportPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "KEY_GYM_LOCAL_SPORT_TYPE", "getKEY_GYM_LOCAL_SPORT_TYPE", "setKEY_GYM_LOCAL_SPORT_TYPE", "(Ljava/lang/String;)V", "KEY_GYM_LOCAL_SPORT_TYPE$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "KEY_CREATE_ROUTE_EMPTY_MAP_GUIDE", "getKEY_CREATE_ROUTE_EMPTY_MAP_GUIDE", "()Z", "setKEY_CREATE_ROUTE_EMPTY_MAP_GUIDE", "(Z)V", "KEY_CREATE_ROUTE_EMPTY_MAP_GUIDE$delegate", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportManagerExportPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportManagerExportPreference.kt\ncom/xiaomi/fitness/sport_manager_export/utils/SportManagerExportPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,20:1\n211#2,7:21\n211#2,7:28\n*S KotlinDebug\n*F\n+ 1 SportManagerExportPreference.kt\ncom/xiaomi/fitness/sport_manager_export/utils/SportManagerExportPreference\n*L\n10#1:21,7\n16#1:28,7\n*E\n"})
public final class SportManagerExportPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerExportPreference.class, "KEY_GYM_LOCAL_SPORT_TYPE", "getKEY_GYM_LOCAL_SPORT_TYPE()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerExportPreference.class, "KEY_CREATE_ROUTE_EMPTY_MAP_GUIDE", "getKEY_CREATE_ROUTE_EMPTY_MAP_GUIDE()Z", 0))};

    @NotNull
    public static final SportManagerExportPreference INSTANCE;

    /* JADX INFO: renamed from: KEY_CREATE_ROUTE_EMPTY_MAP_GUIDE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_CREATE_ROUTE_EMPTY_MAP_GUIDE;

    /* JADX INFO: renamed from: KEY_GYM_LOCAL_SPORT_TYPE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_GYM_LOCAL_SPORT_TYPE;

    static {
        SportManagerExportPreference sportManagerExportPreference = new SportManagerExportPreference();
        INSTANCE = sportManagerExportPreference;
        KEY_GYM_LOCAL_SPORT_TYPE = sportManagerExportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport_manager_export.utils.SportManagerExportPreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), "", null, "app_pref", "key_gym_local_sport_type");
        KEY_CREATE_ROUTE_EMPTY_MAP_GUIDE = sportManagerExportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport_manager_export.utils.SportManagerExportPreference$special$$inlined$bindAndMigratePrefer$default$2
        }.getType(), Boolean.FALSE, null, "app_pref", "key_create_route_empty_map_guide");
    }

    private SportManagerExportPreference() {
    }

    public final boolean getKEY_CREATE_ROUTE_EMPTY_MAP_GUIDE() {
        return ((Boolean) KEY_CREATE_ROUTE_EMPTY_MAP_GUIDE.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    @NotNull
    public final String getKEY_GYM_LOCAL_SPORT_TYPE() {
        return (String) KEY_GYM_LOCAL_SPORT_TYPE.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "sport_manager_export";
    }

    public final void setKEY_CREATE_ROUTE_EMPTY_MAP_GUIDE(boolean z) {
        KEY_CREATE_ROUTE_EMPTY_MAP_GUIDE.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setKEY_GYM_LOCAL_SPORT_TYPE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_GYM_LOCAL_SPORT_TYPE.setValue(this, $$delegatedProperties[0], str);
    }
}
