package com.xiaomi.fitness.sport_eco.utils;

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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0005J\u000e\u00100\u001a\u0002012\u0006\u0010/\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR+\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR+\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR+\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0010\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR+\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0010\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR+\u0010%\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0010\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR+\u0010)\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\u0010\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010,R+\u00102\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u0010\u001a\u0004\b3\u0010\f\"\u0004\b4\u0010\u000eR+\u00106\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010\u0010\u001a\u0004\b7\u0010\f\"\u0004\b8\u0010\u000e¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/utils/SportPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "PROMPT_USERINFO", "getPROMPT_USERINFO", "()Z", "setPROMPT_USERINFO", "(Z)V", "PROMPT_USERINFO$delegate", "Lkotlin/properties/ReadWriteProperty;", "USE_TREADMILL_BEFORE", "getUSE_TREADMILL_BEFORE", "setUSE_TREADMILL_BEFORE", "USE_TREADMILL_BEFORE$delegate", "USE_EXBIKE_BEFORE", "getUSE_EXBIKE_BEFORE", "setUSE_EXBIKE_BEFORE", "USE_EXBIKE_BEFORE$delegate", "GYM_REPORT_REMIND", "getGYM_REPORT_REMIND", "setGYM_REPORT_REMIND", "GYM_REPORT_REMIND$delegate", "GYM_ECO_REPORT_REMIND", "getGYM_ECO_REPORT_REMIND", "setGYM_ECO_REPORT_REMIND", "GYM_ECO_REPORT_REMIND$delegate", "KEY_BG_PERMISSION", "getKEY_BG_PERMISSION", "setKEY_BG_PERMISSION", "KEY_BG_PERMISSION$delegate", "KEY_SHOW_SPORT_SETTING_BADGE", "getKEY_SHOW_SPORT_SETTING_BADGE", "setKEY_SHOW_SPORT_SETTING_BADGE", "KEY_SHOW_SPORT_SETTING_BADGE$delegate", "LOCAL_DEVICE_RED_POINT_SHOW", "getLOCAL_DEVICE_RED_POINT_SHOW", "setLOCAL_DEVICE_RED_POINT_SHOW", "(Ljava/lang/String;)V", "LOCAL_DEVICE_RED_POINT_SHOW$delegate", "getDeviceUpgradeRedPoint", "mac", "setDeviceUpgradeRedPoint", "", "GYM_JUMP_REPORT_REMIND", "getGYM_JUMP_REPORT_REMIND", "setGYM_JUMP_REPORT_REMIND", "GYM_JUMP_REPORT_REMIND$delegate", "USE_JUMP_BEFORE", "getUSE_JUMP_BEFORE", "setUSE_JUMP_BEFORE", "USE_JUMP_BEFORE$delegate", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportPreference.kt\ncom/xiaomi/fitness/sport_eco/utils/SportPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,89:1\n346#2,8:90\n217#2:98\n135#2,6:99\n211#2,7:105\n211#2,7:112\n211#2,7:119\n211#2,7:126\n211#2,7:133\n211#2,7:140\n211#2,7:147\n211#2,7:154\n211#2,7:161\n*S KotlinDebug\n*F\n+ 1 SportPreference.kt\ncom/xiaomi/fitness/sport_eco/utils/SportPreference\n*L\n60#1:90,8\n69#1:98\n9#1:99,6\n12#1:105,7\n20#1:112,7\n27#1:119,7\n34#1:126,7\n41#1:133,7\n47#1:140,7\n53#1:147,7\n77#1:154,7\n83#1:161,7\n*E\n"})
public final class SportPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "PROMPT_USERINFO", "getPROMPT_USERINFO()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "USE_TREADMILL_BEFORE", "getUSE_TREADMILL_BEFORE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "USE_EXBIKE_BEFORE", "getUSE_EXBIKE_BEFORE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "GYM_REPORT_REMIND", "getGYM_REPORT_REMIND()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "GYM_ECO_REPORT_REMIND", "getGYM_ECO_REPORT_REMIND()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "KEY_BG_PERMISSION", "getKEY_BG_PERMISSION()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "KEY_SHOW_SPORT_SETTING_BADGE", "getKEY_SHOW_SPORT_SETTING_BADGE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "LOCAL_DEVICE_RED_POINT_SHOW", "getLOCAL_DEVICE_RED_POINT_SHOW()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "GYM_JUMP_REPORT_REMIND", "getGYM_JUMP_REPORT_REMIND()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SportPreference.class, "USE_JUMP_BEFORE", "getUSE_JUMP_BEFORE()Z", 0))};

    /* JADX INFO: renamed from: GYM_ECO_REPORT_REMIND$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty GYM_ECO_REPORT_REMIND;

    /* JADX INFO: renamed from: GYM_JUMP_REPORT_REMIND$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty GYM_JUMP_REPORT_REMIND;

    /* JADX INFO: renamed from: GYM_REPORT_REMIND$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty GYM_REPORT_REMIND;

    @NotNull
    public static final SportPreference INSTANCE;

    /* JADX INFO: renamed from: KEY_BG_PERMISSION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_BG_PERMISSION;

    /* JADX INFO: renamed from: KEY_SHOW_SPORT_SETTING_BADGE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_SHOW_SPORT_SETTING_BADGE;

    /* JADX INFO: renamed from: LOCAL_DEVICE_RED_POINT_SHOW$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LOCAL_DEVICE_RED_POINT_SHOW;

    /* JADX INFO: renamed from: PROMPT_USERINFO$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PROMPT_USERINFO;

    /* JADX INFO: renamed from: USE_EXBIKE_BEFORE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty USE_EXBIKE_BEFORE;

    /* JADX INFO: renamed from: USE_JUMP_BEFORE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty USE_JUMP_BEFORE;

    /* JADX INFO: renamed from: USE_TREADMILL_BEFORE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty USE_TREADMILL_BEFORE;

    static {
        SportPreference sportPreference = new SportPreference();
        INSTANCE = sportPreference;
        Boolean bool = Boolean.TRUE;
        PROMPT_USERINFO = sportPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport_eco.utils.SportPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), bool, null, true);
        Boolean bool2 = Boolean.FALSE;
        USE_TREADMILL_BEFORE = sportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport_eco.utils.SportPreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), bool2, null, "app_pref", "use_treadmill_before");
        USE_EXBIKE_BEFORE = sportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport_eco.utils.SportPreference$special$$inlined$bindAndMigratePrefer$default$2
        }.getType(), bool2, null, "app_pref", "use_exbike_before");
        GYM_REPORT_REMIND = sportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport_eco.utils.SportPreference$special$$inlined$bindAndMigratePrefer$default$3
        }.getType(), bool, null, "app_pref", "SPORT_REPOET");
        GYM_ECO_REPORT_REMIND = sportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport_eco.utils.SportPreference$special$$inlined$bindAndMigratePrefer$default$4
        }.getType(), bool, null, "app_pref", "SPORT_ECO_REPOET");
        KEY_BG_PERMISSION = sportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport_eco.utils.SportPreference$special$$inlined$bindAndMigratePrefer$default$5
        }.getType(), bool, null, "app_pref", "show_sport_background_permission");
        KEY_SHOW_SPORT_SETTING_BADGE = sportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport_eco.utils.SportPreference$special$$inlined$bindAndMigratePrefer$default$6
        }.getType(), bool, null, "app_pref", "show_sport_setting_badge");
        LOCAL_DEVICE_RED_POINT_SHOW = sportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport_eco.utils.SportPreference$special$$inlined$bindAndMigratePrefer$default$7
        }.getType(), "", null, "app_pref", "local_device_red_point_show");
        GYM_JUMP_REPORT_REMIND = sportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport_eco.utils.SportPreference$special$$inlined$bindAndMigratePrefer$default$8
        }.getType(), bool, null, "app_pref", "SPORT_JUMP_REPOET");
        USE_JUMP_BEFORE = sportPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.sport_eco.utils.SportPreference$special$$inlined$bindAndMigratePrefer$default$9
        }.getType(), bool2, null, "app_pref", "use_jump_before");
    }

    private SportPreference() {
    }

    @NotNull
    public final String getDeviceUpgradeRedPoint(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        return (String) getAndMigrateValue(Reflection.getOrCreateKotlinClass(String.class), mac + "local_device_red_point_show", "", getSpName(), "app_pref", mac + "local_device_red_point_show");
    }

    public final boolean getGYM_ECO_REPORT_REMIND() {
        return ((Boolean) GYM_ECO_REPORT_REMIND.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    public final boolean getGYM_JUMP_REPORT_REMIND() {
        return ((Boolean) GYM_JUMP_REPORT_REMIND.getValue(this, $$delegatedProperties[8])).booleanValue();
    }

    public final boolean getGYM_REPORT_REMIND() {
        return ((Boolean) GYM_REPORT_REMIND.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    public final boolean getKEY_BG_PERMISSION() {
        return ((Boolean) KEY_BG_PERMISSION.getValue(this, $$delegatedProperties[5])).booleanValue();
    }

    public final boolean getKEY_SHOW_SPORT_SETTING_BADGE() {
        return ((Boolean) KEY_SHOW_SPORT_SETTING_BADGE.getValue(this, $$delegatedProperties[6])).booleanValue();
    }

    @NotNull
    public final String getLOCAL_DEVICE_RED_POINT_SHOW() {
        return (String) LOCAL_DEVICE_RED_POINT_SHOW.getValue(this, $$delegatedProperties[7]);
    }

    public final boolean getPROMPT_USERINFO() {
        return ((Boolean) PROMPT_USERINFO.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "sport_ui";
    }

    public final boolean getUSE_EXBIKE_BEFORE() {
        return ((Boolean) USE_EXBIKE_BEFORE.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public final boolean getUSE_JUMP_BEFORE() {
        return ((Boolean) USE_JUMP_BEFORE.getValue(this, $$delegatedProperties[9])).booleanValue();
    }

    public final boolean getUSE_TREADMILL_BEFORE() {
        return ((Boolean) USE_TREADMILL_BEFORE.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final void setDeviceUpgradeRedPoint(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.sport_eco.utils.SportPreference$setDeviceUpgradeRedPoint$$inlined$bindAndMigratePrefer$1
        }.getType(), "", mac + "local_device_red_point_show", "app_pref", mac + "local_device_red_point_show");
    }

    public final void setGYM_ECO_REPORT_REMIND(boolean z) {
        GYM_ECO_REPORT_REMIND.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    public final void setGYM_JUMP_REPORT_REMIND(boolean z) {
        GYM_JUMP_REPORT_REMIND.setValue(this, $$delegatedProperties[8], Boolean.valueOf(z));
    }

    public final void setGYM_REPORT_REMIND(boolean z) {
        GYM_REPORT_REMIND.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    public final void setKEY_BG_PERMISSION(boolean z) {
        KEY_BG_PERMISSION.setValue(this, $$delegatedProperties[5], Boolean.valueOf(z));
    }

    public final void setKEY_SHOW_SPORT_SETTING_BADGE(boolean z) {
        KEY_SHOW_SPORT_SETTING_BADGE.setValue(this, $$delegatedProperties[6], Boolean.valueOf(z));
    }

    public final void setLOCAL_DEVICE_RED_POINT_SHOW(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        LOCAL_DEVICE_RED_POINT_SHOW.setValue(this, $$delegatedProperties[7], str);
    }

    public final void setPROMPT_USERINFO(boolean z) {
        PROMPT_USERINFO.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setUSE_EXBIKE_BEFORE(boolean z) {
        USE_EXBIKE_BEFORE.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    public final void setUSE_JUMP_BEFORE(boolean z) {
        USE_JUMP_BEFORE.setValue(this, $$delegatedProperties[9], Boolean.valueOf(z));
    }

    public final void setUSE_TREADMILL_BEFORE(boolean z) {
        USE_TREADMILL_BEFORE.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }
}
