package com.xiaomi.fitness.sport_eco_manager.utils;

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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\fR+\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\fR+\u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\fR+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010\u001e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u000e\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\fR+\u0010#\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\"8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u000e\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R+\u0010)\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u000e\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\fR+\u0010.\u001a\u00020-2\u0006\u0010\b\u001a\u00020-8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u000e\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/utils/SportManagerPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "KEY_RECOVER_SPORT_REPORT", "getKEY_RECOVER_SPORT_REPORT", "setKEY_RECOVER_SPORT_REPORT", "(Ljava/lang/String;)V", "KEY_RECOVER_SPORT_REPORT$delegate", "Lkotlin/properties/ReadWriteProperty;", "KEY_RECOVER_SPORT_RECORD_CACHE", "getKEY_RECOVER_SPORT_RECORD_CACHE", "setKEY_RECOVER_SPORT_RECORD_CACHE", "KEY_RECOVER_SPORT_RECORD_CACHE$delegate", "KEY_RECOVER_SPORT_RECORD_TEMP_CACHE", "getKEY_RECOVER_SPORT_RECORD_TEMP_CACHE", "setKEY_RECOVER_SPORT_RECORD_TEMP_CACHE", "KEY_RECOVER_SPORT_RECORD_TEMP_CACHE$delegate", "", "KEY_RECOVER_SPORT_PAUSE_COUNT", "getKEY_RECOVER_SPORT_PAUSE_COUNT", "()I", "setKEY_RECOVER_SPORT_PAUSE_COUNT", "(I)V", "KEY_RECOVER_SPORT_PAUSE_COUNT$delegate", "KEY_RECOVER_SPORT_FITNESS_DATA_ID", "getKEY_RECOVER_SPORT_FITNESS_DATA_ID", "setKEY_RECOVER_SPORT_FITNESS_DATA_ID", "KEY_RECOVER_SPORT_FITNESS_DATA_ID$delegate", "", "PRE_SPORT_DURATION_INSEC", "getPRE_SPORT_DURATION_INSEC", "()J", "setPRE_SPORT_DURATION_INSEC", "(J)V", "PRE_SPORT_DURATION_INSEC$delegate", "KEY_REQUEST_LOCATION_DATE", "getKEY_REQUEST_LOCATION_DATE", "setKEY_REQUEST_LOCATION_DATE", "KEY_REQUEST_LOCATION_DATE$delegate", "", "KEY_FIRSTT_REFUSE_BACKGROUND_LOCATION", "getKEY_FIRSTT_REFUSE_BACKGROUND_LOCATION", "()Z", "setKEY_FIRSTT_REFUSE_BACKGROUND_LOCATION", "(Z)V", "KEY_FIRSTT_REFUSE_BACKGROUND_LOCATION$delegate", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportManagerPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportManagerPreference.kt\ncom/xiaomi/fitness/sport_eco_manager/utils/SportManagerPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,51:1\n211#2,7:52\n211#2,7:59\n211#2,7:66\n211#2,7:73\n211#2,7:80\n211#2,7:87\n211#2,7:94\n135#2,6:101\n*S KotlinDebug\n*F\n+ 1 SportManagerPreference.kt\ncom/xiaomi/fitness/sport_eco_manager/utils/SportManagerPreference\n*L\n10#1:52,7\n15#1:59,7\n20#1:66,7\n25#1:73,7\n30#1:80,7\n35#1:87,7\n41#1:94,7\n47#1:101,6\n*E\n"})
public final class SportManagerPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "KEY_RECOVER_SPORT_REPORT", "getKEY_RECOVER_SPORT_REPORT()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "KEY_RECOVER_SPORT_RECORD_CACHE", "getKEY_RECOVER_SPORT_RECORD_CACHE()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "KEY_RECOVER_SPORT_RECORD_TEMP_CACHE", "getKEY_RECOVER_SPORT_RECORD_TEMP_CACHE()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "KEY_RECOVER_SPORT_PAUSE_COUNT", "getKEY_RECOVER_SPORT_PAUSE_COUNT()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "KEY_RECOVER_SPORT_FITNESS_DATA_ID", "getKEY_RECOVER_SPORT_FITNESS_DATA_ID()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "PRE_SPORT_DURATION_INSEC", "getPRE_SPORT_DURATION_INSEC()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "KEY_REQUEST_LOCATION_DATE", "getKEY_REQUEST_LOCATION_DATE()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "KEY_FIRSTT_REFUSE_BACKGROUND_LOCATION", "getKEY_FIRSTT_REFUSE_BACKGROUND_LOCATION()Z", 0))};

    @NotNull
    public static final SportManagerPreference INSTANCE;

    /* JADX INFO: renamed from: KEY_FIRSTT_REFUSE_BACKGROUND_LOCATION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_FIRSTT_REFUSE_BACKGROUND_LOCATION;

    /* JADX INFO: renamed from: KEY_RECOVER_SPORT_FITNESS_DATA_ID$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_RECOVER_SPORT_FITNESS_DATA_ID;

    /* JADX INFO: renamed from: KEY_RECOVER_SPORT_PAUSE_COUNT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_RECOVER_SPORT_PAUSE_COUNT;

    /* JADX INFO: renamed from: KEY_RECOVER_SPORT_RECORD_CACHE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_RECOVER_SPORT_RECORD_CACHE;

    /* JADX INFO: renamed from: KEY_RECOVER_SPORT_RECORD_TEMP_CACHE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_RECOVER_SPORT_RECORD_TEMP_CACHE;

    /* JADX INFO: renamed from: KEY_RECOVER_SPORT_REPORT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_RECOVER_SPORT_REPORT;

    /* JADX INFO: renamed from: KEY_REQUEST_LOCATION_DATE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_REQUEST_LOCATION_DATE;

    /* JADX INFO: renamed from: PRE_SPORT_DURATION_INSEC$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PRE_SPORT_DURATION_INSEC;

    static {
        SportManagerPreference sportManagerPreference = new SportManagerPreference();
        INSTANCE = sportManagerPreference;
        KEY_RECOVER_SPORT_REPORT = sportManagerPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport_eco_manager.utils.SportManagerPreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), "", null, "app_pref", "key_recover_sport_report");
        KEY_RECOVER_SPORT_RECORD_CACHE = sportManagerPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport_eco_manager.utils.SportManagerPreference$special$$inlined$bindAndMigratePrefer$default$2
        }.getType(), "", null, "app_pref", "key_recover_sport_record_cache");
        KEY_RECOVER_SPORT_RECORD_TEMP_CACHE = sportManagerPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport_eco_manager.utils.SportManagerPreference$special$$inlined$bindAndMigratePrefer$default$3
        }.getType(), "", null, "app_pref", "key_recover_sport_record_temp_cache");
        KEY_RECOVER_SPORT_PAUSE_COUNT = sportManagerPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.sport_eco_manager.utils.SportManagerPreference$special$$inlined$bindAndMigratePrefer$default$4
        }.getType(), 0, null, "app_pref", "key_recover_sport_pause_count");
        KEY_RECOVER_SPORT_FITNESS_DATA_ID = sportManagerPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport_eco_manager.utils.SportManagerPreference$special$$inlined$bindAndMigratePrefer$default$5
        }.getType(), "", null, "app_pref", "key_recover_sport_fitness_data_id");
        PRE_SPORT_DURATION_INSEC = sportManagerPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.sport_eco_manager.utils.SportManagerPreference$special$$inlined$bindAndMigratePrefer$default$6
        }.getType(), 0L, null, "app_pref", "PRESPORTDURATIONINSEC");
        KEY_REQUEST_LOCATION_DATE = sportManagerPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport_eco_manager.utils.SportManagerPreference$special$$inlined$bindAndMigratePrefer$default$7
        }.getType(), "", null, "app_pref", "key_request_locatio_date");
        KEY_FIRSTT_REFUSE_BACKGROUND_LOCATION = sportManagerPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport_eco_manager.utils.SportManagerPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), Boolean.TRUE, null, true);
    }

    private SportManagerPreference() {
    }

    public final boolean getKEY_FIRSTT_REFUSE_BACKGROUND_LOCATION() {
        return ((Boolean) KEY_FIRSTT_REFUSE_BACKGROUND_LOCATION.getValue(this, $$delegatedProperties[7])).booleanValue();
    }

    @NotNull
    public final String getKEY_RECOVER_SPORT_FITNESS_DATA_ID() {
        return (String) KEY_RECOVER_SPORT_FITNESS_DATA_ID.getValue(this, $$delegatedProperties[4]);
    }

    public final int getKEY_RECOVER_SPORT_PAUSE_COUNT() {
        return ((Number) KEY_RECOVER_SPORT_PAUSE_COUNT.getValue(this, $$delegatedProperties[3])).intValue();
    }

    @NotNull
    public final String getKEY_RECOVER_SPORT_RECORD_CACHE() {
        return (String) KEY_RECOVER_SPORT_RECORD_CACHE.getValue(this, $$delegatedProperties[1]);
    }

    @NotNull
    public final String getKEY_RECOVER_SPORT_RECORD_TEMP_CACHE() {
        return (String) KEY_RECOVER_SPORT_RECORD_TEMP_CACHE.getValue(this, $$delegatedProperties[2]);
    }

    @NotNull
    public final String getKEY_RECOVER_SPORT_REPORT() {
        return (String) KEY_RECOVER_SPORT_REPORT.getValue(this, $$delegatedProperties[0]);
    }

    @NotNull
    public final String getKEY_REQUEST_LOCATION_DATE() {
        return (String) KEY_REQUEST_LOCATION_DATE.getValue(this, $$delegatedProperties[6]);
    }

    public final long getPRE_SPORT_DURATION_INSEC() {
        return ((Number) PRE_SPORT_DURATION_INSEC.getValue(this, $$delegatedProperties[5])).longValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "sport_eco_manager";
    }

    public final void setKEY_FIRSTT_REFUSE_BACKGROUND_LOCATION(boolean z) {
        KEY_FIRSTT_REFUSE_BACKGROUND_LOCATION.setValue(this, $$delegatedProperties[7], Boolean.valueOf(z));
    }

    public final void setKEY_RECOVER_SPORT_FITNESS_DATA_ID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_RECOVER_SPORT_FITNESS_DATA_ID.setValue(this, $$delegatedProperties[4], str);
    }

    public final void setKEY_RECOVER_SPORT_PAUSE_COUNT(int i) {
        KEY_RECOVER_SPORT_PAUSE_COUNT.setValue(this, $$delegatedProperties[3], Integer.valueOf(i));
    }

    public final void setKEY_RECOVER_SPORT_RECORD_CACHE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_RECOVER_SPORT_RECORD_CACHE.setValue(this, $$delegatedProperties[1], str);
    }

    public final void setKEY_RECOVER_SPORT_RECORD_TEMP_CACHE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_RECOVER_SPORT_RECORD_TEMP_CACHE.setValue(this, $$delegatedProperties[2], str);
    }

    public final void setKEY_RECOVER_SPORT_REPORT(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_RECOVER_SPORT_REPORT.setValue(this, $$delegatedProperties[0], str);
    }

    public final void setKEY_REQUEST_LOCATION_DATE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_REQUEST_LOCATION_DATE.setValue(this, $$delegatedProperties[6], str);
    }

    public final void setPRE_SPORT_DURATION_INSEC(long j) {
        PRE_SPORT_DURATION_INSEC.setValue(this, $$delegatedProperties[5], Long.valueOf(j));
    }
}
