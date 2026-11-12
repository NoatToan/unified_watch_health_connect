package com.xiaomi.fitness.sport_manager.utils;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.sport_manager_export.SportConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\fR+\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\fR+\u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\fR+\u0010\u0017\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\fR+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u000e\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010\"\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u000e\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\fR+\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00020&8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u000e\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u0010-\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u000e\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010\fR+\u00102\u001a\u0002012\u0006\u0010\b\u001a\u0002018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010\u000e\u001a\u0004\b3\u00104\"\u0004\b5\u00106R+\u00108\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010\u000e\u001a\u0004\b9\u0010\u001e\"\u0004\b:\u0010 R+\u0010<\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010\u000e\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010 R+\u0010@\u001a\u0002012\u0006\u0010\b\u001a\u0002018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010\u000e\u001a\u0004\bA\u00104\"\u0004\bB\u00106¨\u0006D"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/utils/SportManagerPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "KEY_RECOVER_SPORT_REPORT", "getKEY_RECOVER_SPORT_REPORT", "setKEY_RECOVER_SPORT_REPORT", "(Ljava/lang/String;)V", "KEY_RECOVER_SPORT_REPORT$delegate", "Lkotlin/properties/ReadWriteProperty;", "KEY_RECOVER_SPORT_RECORD_CACHE", "getKEY_RECOVER_SPORT_RECORD_CACHE", "setKEY_RECOVER_SPORT_RECORD_CACHE", "KEY_RECOVER_SPORT_RECORD_CACHE$delegate", "KEY_RECOVER_SPORT_RECORD_TEMP_CACHE", "getKEY_RECOVER_SPORT_RECORD_TEMP_CACHE", "setKEY_RECOVER_SPORT_RECORD_TEMP_CACHE", "KEY_RECOVER_SPORT_RECORD_TEMP_CACHE$delegate", "KEY_RECOVER_SPORT_GPS", "getKEY_RECOVER_SPORT_GPS", "setKEY_RECOVER_SPORT_GPS", "KEY_RECOVER_SPORT_GPS$delegate", "", "KEY_RECOVER_SPORT_PAUSE_COUNT", "getKEY_RECOVER_SPORT_PAUSE_COUNT", "()I", "setKEY_RECOVER_SPORT_PAUSE_COUNT", "(I)V", "KEY_RECOVER_SPORT_PAUSE_COUNT$delegate", "KEY_RECOVER_SPORT_FITNESS_DATA_ID", "getKEY_RECOVER_SPORT_FITNESS_DATA_ID", "setKEY_RECOVER_SPORT_FITNESS_DATA_ID", "KEY_RECOVER_SPORT_FITNESS_DATA_ID$delegate", "", "PRE_SPORT_DURATION_INSEC", "getPRE_SPORT_DURATION_INSEC", "()J", "setPRE_SPORT_DURATION_INSEC", "(J)V", "PRE_SPORT_DURATION_INSEC$delegate", "KEY_REQUEST_LOCATION_DATE", "getKEY_REQUEST_LOCATION_DATE", "setKEY_REQUEST_LOCATION_DATE", "KEY_REQUEST_LOCATION_DATE$delegate", "", "KEY_FIRSTT_REFUSE_BACKGROUND_LOCATION", "getKEY_FIRSTT_REFUSE_BACKGROUND_LOCATION", "()Z", "setKEY_FIRSTT_REFUSE_BACKGROUND_LOCATION", "(Z)V", "KEY_FIRSTT_REFUSE_BACKGROUND_LOCATION$delegate", "KEY_START_SPORT_MODE", "getKEY_START_SPORT_MODE", "setKEY_START_SPORT_MODE", "KEY_START_SPORT_MODE$delegate", "LAUNCH_SPORT_PAGE_GET_WEAR_MODE", "getLAUNCH_SPORT_PAGE_GET_WEAR_MODE", "setLAUNCH_SPORT_PAGE_GET_WEAR_MODE", "LAUNCH_SPORT_PAGE_GET_WEAR_MODE$delegate", "KEY_SPORE_HAS_PRE_ROUTE", "getKEY_SPORE_HAS_PRE_ROUTE", "setKEY_SPORE_HAS_PRE_ROUTE", "KEY_SPORE_HAS_PRE_ROUTE$delegate", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportManagerPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportManagerPreference.kt\ncom/xiaomi/fitness/sport_manager/utils/SportManagerPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,67:1\n211#2,7:68\n211#2,7:75\n211#2,7:82\n211#2,7:89\n211#2,7:96\n211#2,7:103\n211#2,7:110\n211#2,7:117\n135#2,6:124\n135#2,6:130\n135#2,6:136\n135#2,6:142\n*S KotlinDebug\n*F\n+ 1 SportManagerPreference.kt\ncom/xiaomi/fitness/sport_manager/utils/SportManagerPreference\n*L\n11#1:68,7\n16#1:75,7\n21#1:82,7\n26#1:89,7\n31#1:96,7\n36#1:103,7\n41#1:110,7\n47#1:117,7\n53#1:124,6\n60#1:130,6\n63#1:136,6\n65#1:142,6\n*E\n"})
public final class SportManagerPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "KEY_RECOVER_SPORT_REPORT", "getKEY_RECOVER_SPORT_REPORT()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "KEY_RECOVER_SPORT_RECORD_CACHE", "getKEY_RECOVER_SPORT_RECORD_CACHE()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "KEY_RECOVER_SPORT_RECORD_TEMP_CACHE", "getKEY_RECOVER_SPORT_RECORD_TEMP_CACHE()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "KEY_RECOVER_SPORT_GPS", "getKEY_RECOVER_SPORT_GPS()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "KEY_RECOVER_SPORT_PAUSE_COUNT", "getKEY_RECOVER_SPORT_PAUSE_COUNT()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "KEY_RECOVER_SPORT_FITNESS_DATA_ID", "getKEY_RECOVER_SPORT_FITNESS_DATA_ID()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "PRE_SPORT_DURATION_INSEC", "getPRE_SPORT_DURATION_INSEC()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "KEY_REQUEST_LOCATION_DATE", "getKEY_REQUEST_LOCATION_DATE()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "KEY_FIRSTT_REFUSE_BACKGROUND_LOCATION", "getKEY_FIRSTT_REFUSE_BACKGROUND_LOCATION()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "KEY_START_SPORT_MODE", "getKEY_START_SPORT_MODE()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "LAUNCH_SPORT_PAGE_GET_WEAR_MODE", "getLAUNCH_SPORT_PAGE_GET_WEAR_MODE()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportManagerPreference.class, "KEY_SPORE_HAS_PRE_ROUTE", "getKEY_SPORE_HAS_PRE_ROUTE()Z", 0))};

    @NotNull
    public static final SportManagerPreference INSTANCE;

    /* JADX INFO: renamed from: KEY_FIRSTT_REFUSE_BACKGROUND_LOCATION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_FIRSTT_REFUSE_BACKGROUND_LOCATION;

    /* JADX INFO: renamed from: KEY_RECOVER_SPORT_FITNESS_DATA_ID$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_RECOVER_SPORT_FITNESS_DATA_ID;

    /* JADX INFO: renamed from: KEY_RECOVER_SPORT_GPS$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_RECOVER_SPORT_GPS;

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

    /* JADX INFO: renamed from: KEY_SPORE_HAS_PRE_ROUTE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_SPORE_HAS_PRE_ROUTE;

    /* JADX INFO: renamed from: KEY_START_SPORT_MODE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_START_SPORT_MODE;

    /* JADX INFO: renamed from: LAUNCH_SPORT_PAGE_GET_WEAR_MODE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LAUNCH_SPORT_PAGE_GET_WEAR_MODE;

    /* JADX INFO: renamed from: PRE_SPORT_DURATION_INSEC$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PRE_SPORT_DURATION_INSEC;

    static {
        SportManagerPreference sportManagerPreference = new SportManagerPreference();
        INSTANCE = sportManagerPreference;
        KEY_RECOVER_SPORT_REPORT = sportManagerPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport_manager.utils.SportManagerPreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), "", null, "app_pref", "key_recover_sport_report");
        KEY_RECOVER_SPORT_RECORD_CACHE = sportManagerPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport_manager.utils.SportManagerPreference$special$$inlined$bindAndMigratePrefer$default$2
        }.getType(), "", null, "app_pref", "key_recover_sport_record_cache");
        KEY_RECOVER_SPORT_RECORD_TEMP_CACHE = sportManagerPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport_manager.utils.SportManagerPreference$special$$inlined$bindAndMigratePrefer$default$3
        }.getType(), "", null, "app_pref", "key_recover_sport_record_temp_cache");
        KEY_RECOVER_SPORT_GPS = sportManagerPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport_manager.utils.SportManagerPreference$special$$inlined$bindAndMigratePrefer$default$4
        }.getType(), "", null, "app_pref", SportConstants.KEY_RECOVER_SPORT_GPS);
        KEY_RECOVER_SPORT_PAUSE_COUNT = sportManagerPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.sport_manager.utils.SportManagerPreference$special$$inlined$bindAndMigratePrefer$default$5
        }.getType(), 0, null, "app_pref", "key_recover_sport_pause_count");
        KEY_RECOVER_SPORT_FITNESS_DATA_ID = sportManagerPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport_manager.utils.SportManagerPreference$special$$inlined$bindAndMigratePrefer$default$6
        }.getType(), "", null, "app_pref", "key_recover_sport_fitness_data_id");
        PRE_SPORT_DURATION_INSEC = sportManagerPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.sport_manager.utils.SportManagerPreference$special$$inlined$bindAndMigratePrefer$default$7
        }.getType(), 0L, null, "app_pref", "PRESPORTDURATIONINSEC");
        KEY_REQUEST_LOCATION_DATE = sportManagerPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport_manager.utils.SportManagerPreference$special$$inlined$bindAndMigratePrefer$default$8
        }.getType(), "", null, "app_pref", "key_request_locatio_date");
        KEY_FIRSTT_REFUSE_BACKGROUND_LOCATION = sportManagerPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport_manager.utils.SportManagerPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), Boolean.TRUE, null, true);
        KEY_START_SPORT_MODE = sportManagerPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.sport_manager.utils.SportManagerPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), 0, null, true);
        LAUNCH_SPORT_PAGE_GET_WEAR_MODE = sportManagerPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.sport_manager.utils.SportManagerPreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), 0, null, true);
        KEY_SPORE_HAS_PRE_ROUTE = sportManagerPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport_manager.utils.SportManagerPreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), Boolean.FALSE, null, true);
    }

    private SportManagerPreference() {
    }

    public final boolean getKEY_FIRSTT_REFUSE_BACKGROUND_LOCATION() {
        return ((Boolean) KEY_FIRSTT_REFUSE_BACKGROUND_LOCATION.getValue(this, $$delegatedProperties[8])).booleanValue();
    }

    @NotNull
    public final String getKEY_RECOVER_SPORT_FITNESS_DATA_ID() {
        return (String) KEY_RECOVER_SPORT_FITNESS_DATA_ID.getValue(this, $$delegatedProperties[5]);
    }

    @NotNull
    public final String getKEY_RECOVER_SPORT_GPS() {
        return (String) KEY_RECOVER_SPORT_GPS.getValue(this, $$delegatedProperties[3]);
    }

    public final int getKEY_RECOVER_SPORT_PAUSE_COUNT() {
        return ((Number) KEY_RECOVER_SPORT_PAUSE_COUNT.getValue(this, $$delegatedProperties[4])).intValue();
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
        return (String) KEY_REQUEST_LOCATION_DATE.getValue(this, $$delegatedProperties[7]);
    }

    public final boolean getKEY_SPORE_HAS_PRE_ROUTE() {
        return ((Boolean) KEY_SPORE_HAS_PRE_ROUTE.getValue(this, $$delegatedProperties[11])).booleanValue();
    }

    public final int getKEY_START_SPORT_MODE() {
        return ((Number) KEY_START_SPORT_MODE.getValue(this, $$delegatedProperties[9])).intValue();
    }

    public final int getLAUNCH_SPORT_PAGE_GET_WEAR_MODE() {
        return ((Number) LAUNCH_SPORT_PAGE_GET_WEAR_MODE.getValue(this, $$delegatedProperties[10])).intValue();
    }

    public final long getPRE_SPORT_DURATION_INSEC() {
        return ((Number) PRE_SPORT_DURATION_INSEC.getValue(this, $$delegatedProperties[6])).longValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "sport_manager";
    }

    public final void setKEY_FIRSTT_REFUSE_BACKGROUND_LOCATION(boolean z) {
        KEY_FIRSTT_REFUSE_BACKGROUND_LOCATION.setValue(this, $$delegatedProperties[8], Boolean.valueOf(z));
    }

    public final void setKEY_RECOVER_SPORT_FITNESS_DATA_ID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_RECOVER_SPORT_FITNESS_DATA_ID.setValue(this, $$delegatedProperties[5], str);
    }

    public final void setKEY_RECOVER_SPORT_GPS(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_RECOVER_SPORT_GPS.setValue(this, $$delegatedProperties[3], str);
    }

    public final void setKEY_RECOVER_SPORT_PAUSE_COUNT(int i) {
        KEY_RECOVER_SPORT_PAUSE_COUNT.setValue(this, $$delegatedProperties[4], Integer.valueOf(i));
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
        KEY_REQUEST_LOCATION_DATE.setValue(this, $$delegatedProperties[7], str);
    }

    public final void setKEY_SPORE_HAS_PRE_ROUTE(boolean z) {
        KEY_SPORE_HAS_PRE_ROUTE.setValue(this, $$delegatedProperties[11], Boolean.valueOf(z));
    }

    public final void setKEY_START_SPORT_MODE(int i) {
        KEY_START_SPORT_MODE.setValue(this, $$delegatedProperties[9], Integer.valueOf(i));
    }

    public final void setLAUNCH_SPORT_PAGE_GET_WEAR_MODE(int i) {
        LAUNCH_SPORT_PAGE_GET_WEAR_MODE.setValue(this, $$delegatedProperties[10], Integer.valueOf(i));
    }

    public final void setPRE_SPORT_DURATION_INSEC(long j) {
        PRE_SPORT_DURATION_INSEC.setValue(this, $$delegatedProperties[6], Long.valueOf(j));
    }
}
