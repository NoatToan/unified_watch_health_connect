package com.xiaomi.fitness.sport_eco_manager_export.utils;

import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR+\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\rR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u0017\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u000f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010\"\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u000f\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R+\u0010'\u001a\u00020&2\u0006\u0010\t\u001a\u00020&8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u000f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u0010-\u001a\u00020&2\u0006\u0010\t\u001a\u00020&8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u000f\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R+\u00101\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\u000f\u001a\u0004\b2\u0010\u001e\"\u0004\b3\u0010 R+\u00105\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010\u000f\u001a\u0004\b6\u0010\u001e\"\u0004\b7\u0010 ¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager_export/utils/SportManagerExportPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "PATH_NO_ACCOUNT", "", "spName", "getSpName", "()Ljava/lang/String;", "<set-?>", "KEY_GYM_LOCAL_SPORT_TYPE", "getKEY_GYM_LOCAL_SPORT_TYPE", "setKEY_GYM_LOCAL_SPORT_TYPE", "(Ljava/lang/String;)V", "KEY_GYM_LOCAL_SPORT_TYPE$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "KEY_GYM_LOCAL_FTP_RESULT", "getKEY_GYM_LOCAL_FTP_RESULT", "()I", "setKEY_GYM_LOCAL_FTP_RESULT", "(I)V", "KEY_GYM_LOCAL_FTP_RESULT$delegate", "KEY_GYM_LOCAL_LAST_FTP_RESULT", "getKEY_GYM_LOCAL_LAST_FTP_RESULT", "setKEY_GYM_LOCAL_LAST_FTP_RESULT", "KEY_GYM_LOCAL_LAST_FTP_RESULT$delegate", "", "KEY_GYM_IS_BIKE_FIRST_CONNECT", "getKEY_GYM_IS_BIKE_FIRST_CONNECT", "()Z", "setKEY_GYM_IS_BIKE_FIRST_CONNECT", "(Z)V", "KEY_GYM_IS_BIKE_FIRST_CONNECT$delegate", "KEY_GYM_ENVIRONMENTAL_VALUE", "getKEY_GYM_ENVIRONMENTAL_VALUE", "setKEY_GYM_ENVIRONMENTAL_VALUE", "KEY_GYM_ENVIRONMENTAL_VALUE$delegate", "", "KEY_GYM_ENVIRONMENTAL_TIME", "getKEY_GYM_ENVIRONMENTAL_TIME", "()J", "setKEY_GYM_ENVIRONMENTAL_TIME", "(J)V", "KEY_GYM_ENVIRONMENTAL_TIME$delegate", "KEY_GYM_ENVIRONMENTAL_UPDATE_TIME", "getKEY_GYM_ENVIRONMENTAL_UPDATE_TIME", "setKEY_GYM_ENVIRONMENTAL_UPDATE_TIME", "KEY_GYM_ENVIRONMENTAL_UPDATE_TIME$delegate", "KEY_GYM_IS_SUPPORT_REMIND", "getKEY_GYM_IS_SUPPORT_REMIND", "setKEY_GYM_IS_SUPPORT_REMIND", "KEY_GYM_IS_SUPPORT_REMIND$delegate", "KEY_GYM_IS_JUMPING", "getKEY_GYM_IS_JUMPING", "setKEY_GYM_IS_JUMPING", "KEY_GYM_IS_JUMPING$delegate", "sport-eco-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportManagerExportPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportManagerExportPreference.kt\ncom/xiaomi/fitness/sport_eco_manager_export/utils/SportManagerExportPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,75:1\n211#2,7:76\n211#2,7:83\n211#2,7:90\n211#2,7:97\n211#2,7:104\n211#2,7:111\n211#2,7:118\n211#2,7:125\n211#2,7:132\n*S KotlinDebug\n*F\n+ 1 SportManagerExportPreference.kt\ncom/xiaomi/fitness/sport_eco_manager_export/utils/SportManagerExportPreference\n*L\n18#1:76,7\n25#1:83,7\n32#1:90,7\n38#1:97,7\n44#1:104,7\n50#1:111,7\n55#1:118,7\n62#1:125,7\n69#1:132,7\n*E\n"})
public final class SportManagerExportPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerExportPreference.class, "KEY_GYM_LOCAL_SPORT_TYPE", "getKEY_GYM_LOCAL_SPORT_TYPE()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerExportPreference.class, "KEY_GYM_LOCAL_FTP_RESULT", "getKEY_GYM_LOCAL_FTP_RESULT()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerExportPreference.class, "KEY_GYM_LOCAL_LAST_FTP_RESULT", "getKEY_GYM_LOCAL_LAST_FTP_RESULT()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerExportPreference.class, "KEY_GYM_IS_BIKE_FIRST_CONNECT", "getKEY_GYM_IS_BIKE_FIRST_CONNECT()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerExportPreference.class, "KEY_GYM_ENVIRONMENTAL_VALUE", "getKEY_GYM_ENVIRONMENTAL_VALUE()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerExportPreference.class, "KEY_GYM_ENVIRONMENTAL_TIME", "getKEY_GYM_ENVIRONMENTAL_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerExportPreference.class, "KEY_GYM_ENVIRONMENTAL_UPDATE_TIME", "getKEY_GYM_ENVIRONMENTAL_UPDATE_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerExportPreference.class, "KEY_GYM_IS_SUPPORT_REMIND", "getKEY_GYM_IS_SUPPORT_REMIND()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerExportPreference.class, "KEY_GYM_IS_JUMPING", "getKEY_GYM_IS_JUMPING()Z", 0))};

    @NotNull
    public static final SportManagerExportPreference INSTANCE;

    /* JADX INFO: renamed from: KEY_GYM_ENVIRONMENTAL_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_GYM_ENVIRONMENTAL_TIME;

    /* JADX INFO: renamed from: KEY_GYM_ENVIRONMENTAL_UPDATE_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_GYM_ENVIRONMENTAL_UPDATE_TIME;

    /* JADX INFO: renamed from: KEY_GYM_ENVIRONMENTAL_VALUE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_GYM_ENVIRONMENTAL_VALUE;

    /* JADX INFO: renamed from: KEY_GYM_IS_BIKE_FIRST_CONNECT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_GYM_IS_BIKE_FIRST_CONNECT;

    /* JADX INFO: renamed from: KEY_GYM_IS_JUMPING$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_GYM_IS_JUMPING;

    /* JADX INFO: renamed from: KEY_GYM_IS_SUPPORT_REMIND$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_GYM_IS_SUPPORT_REMIND;

    /* JADX INFO: renamed from: KEY_GYM_LOCAL_FTP_RESULT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_GYM_LOCAL_FTP_RESULT;

    /* JADX INFO: renamed from: KEY_GYM_LOCAL_LAST_FTP_RESULT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_GYM_LOCAL_LAST_FTP_RESULT;

    /* JADX INFO: renamed from: KEY_GYM_LOCAL_SPORT_TYPE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_GYM_LOCAL_SPORT_TYPE;

    @NotNull
    private static final String PATH_NO_ACCOUNT;

    static {
        SportManagerExportPreference sportManagerExportPreference = new SportManagerExportPreference();
        INSTANCE = sportManagerExportPreference;
        PATH_NO_ACCOUNT = FitnessDBConstants.PATH_NO_ACCOUNT;
        KEY_GYM_LOCAL_SPORT_TYPE = sportManagerExportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), "", null, "app_pref", "key_gym_local_sport_type");
        AccountManager.Companion companion = AccountManager.INSTANCE;
        KEY_GYM_LOCAL_FTP_RESULT = sportManagerExportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference$special$$inlined$bindAndMigratePrefer$default$2
        }.getType(), -1, null, AccountManagerExtKt.getInstance(companion).getUserId(), "key_gym_local_ftp_result");
        KEY_GYM_LOCAL_LAST_FTP_RESULT = sportManagerExportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference$special$$inlined$bindAndMigratePrefer$default$3
        }.getType(), -1, null, AccountManagerExtKt.getInstance(companion).getUserId(), "key_gym_local_last_ftp_result");
        Boolean bool = Boolean.TRUE;
        KEY_GYM_IS_BIKE_FIRST_CONNECT = sportManagerExportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference$special$$inlined$bindAndMigratePrefer$default$4
        }.getType(), bool, null, "app_pref", "key_gym_is_bike_first_connect");
        KEY_GYM_ENVIRONMENTAL_VALUE = sportManagerExportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference$special$$inlined$bindAndMigratePrefer$default$5
        }.getType(), -1, null, AccountManagerExtKt.getInstance(companion).getUserId(), "key_gym_environmental_value");
        KEY_GYM_ENVIRONMENTAL_TIME = sportManagerExportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference$special$$inlined$bindAndMigratePrefer$default$6
        }.getType(), -1L, null, AccountManagerExtKt.getInstance(companion).getUserId(), "key_gym_environmental_time");
        KEY_GYM_ENVIRONMENTAL_UPDATE_TIME = sportManagerExportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference$special$$inlined$bindAndMigratePrefer$default$7
        }.getType(), -1L, null, AccountManagerExtKt.getInstance(companion).getUserId(), "key_gym_environmental_update_time");
        KEY_GYM_IS_SUPPORT_REMIND = sportManagerExportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference$special$$inlined$bindAndMigratePrefer$default$8
        }.getType(), bool, null, "app_pref", "key_gym_is_support_remind");
        KEY_GYM_IS_JUMPING = sportManagerExportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference$special$$inlined$bindAndMigratePrefer$default$9
        }.getType(), Boolean.FALSE, null, "app_pref", "key_gym_is_jumping");
    }

    private SportManagerExportPreference() {
    }

    public final long getKEY_GYM_ENVIRONMENTAL_TIME() {
        return ((Number) KEY_GYM_ENVIRONMENTAL_TIME.getValue(this, $$delegatedProperties[5])).longValue();
    }

    public final long getKEY_GYM_ENVIRONMENTAL_UPDATE_TIME() {
        return ((Number) KEY_GYM_ENVIRONMENTAL_UPDATE_TIME.getValue(this, $$delegatedProperties[6])).longValue();
    }

    public final int getKEY_GYM_ENVIRONMENTAL_VALUE() {
        return ((Number) KEY_GYM_ENVIRONMENTAL_VALUE.getValue(this, $$delegatedProperties[4])).intValue();
    }

    public final boolean getKEY_GYM_IS_BIKE_FIRST_CONNECT() {
        return ((Boolean) KEY_GYM_IS_BIKE_FIRST_CONNECT.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    public final boolean getKEY_GYM_IS_JUMPING() {
        return ((Boolean) KEY_GYM_IS_JUMPING.getValue(this, $$delegatedProperties[8])).booleanValue();
    }

    public final boolean getKEY_GYM_IS_SUPPORT_REMIND() {
        return ((Boolean) KEY_GYM_IS_SUPPORT_REMIND.getValue(this, $$delegatedProperties[7])).booleanValue();
    }

    public final int getKEY_GYM_LOCAL_FTP_RESULT() {
        return ((Number) KEY_GYM_LOCAL_FTP_RESULT.getValue(this, $$delegatedProperties[1])).intValue();
    }

    public final int getKEY_GYM_LOCAL_LAST_FTP_RESULT() {
        return ((Number) KEY_GYM_LOCAL_LAST_FTP_RESULT.getValue(this, $$delegatedProperties[2])).intValue();
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

    public final void setKEY_GYM_ENVIRONMENTAL_TIME(long j) {
        KEY_GYM_ENVIRONMENTAL_TIME.setValue(this, $$delegatedProperties[5], Long.valueOf(j));
    }

    public final void setKEY_GYM_ENVIRONMENTAL_UPDATE_TIME(long j) {
        KEY_GYM_ENVIRONMENTAL_UPDATE_TIME.setValue(this, $$delegatedProperties[6], Long.valueOf(j));
    }

    public final void setKEY_GYM_ENVIRONMENTAL_VALUE(int i) {
        KEY_GYM_ENVIRONMENTAL_VALUE.setValue(this, $$delegatedProperties[4], Integer.valueOf(i));
    }

    public final void setKEY_GYM_IS_BIKE_FIRST_CONNECT(boolean z) {
        KEY_GYM_IS_BIKE_FIRST_CONNECT.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    public final void setKEY_GYM_IS_JUMPING(boolean z) {
        KEY_GYM_IS_JUMPING.setValue(this, $$delegatedProperties[8], Boolean.valueOf(z));
    }

    public final void setKEY_GYM_IS_SUPPORT_REMIND(boolean z) {
        KEY_GYM_IS_SUPPORT_REMIND.setValue(this, $$delegatedProperties[7], Boolean.valueOf(z));
    }

    public final void setKEY_GYM_LOCAL_FTP_RESULT(int i) {
        KEY_GYM_LOCAL_FTP_RESULT.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    public final void setKEY_GYM_LOCAL_LAST_FTP_RESULT(int i) {
        KEY_GYM_LOCAL_LAST_FTP_RESULT.setValue(this, $$delegatedProperties[2], Integer.valueOf(i));
    }

    public final void setKEY_GYM_LOCAL_SPORT_TYPE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_GYM_LOCAL_SPORT_TYPE.setValue(this, $$delegatedProperties[0], str);
    }
}
