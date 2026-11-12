package com.xiaomi.fitness.login.preference;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005J\u000e\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\u0005J\u000e\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020\u0005J\u0006\u0010)\u001a\u00020\u0005J\u0006\u0010*\u001a\u00020\u0005J\u0006\u0010+\u001a\u00020\u0005J\u000e\u0010,\u001a\u00020#2\u0006\u0010&\u001a\u00020\u0005J\u0006\u0010-\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR+\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\u000fR+\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\u000fR+\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\u000fR+\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0011\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\u000f¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/login/preference/RegionSelectPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "isMultipleProcessListener", "", "()Z", "<set-?>", "LOCALE_COUNTRY", "getLOCALE_COUNTRY", "setLOCALE_COUNTRY", "(Ljava/lang/String;)V", "LOCALE_COUNTRY$delegate", "Lkotlin/properties/ReadWriteProperty;", "CURRENT_REGION", "getCURRENT_REGION", "setCURRENT_REGION", "CURRENT_REGION$delegate", "KEY_CURRENT_REGION", "getKEY_CURRENT_REGION", "setKEY_CURRENT_REGION", "KEY_CURRENT_REGION$delegate", "KEY_LOCALE_COUNTRY_BY_IP", "getKEY_LOCALE_COUNTRY_BY_IP", "setKEY_LOCALE_COUNTRY_BY_IP", "KEY_LOCALE_COUNTRY_BY_IP$delegate", "CURRENT_COUNTRY", "getCURRENT_COUNTRY", "setCURRENT_COUNTRY", "CURRENT_COUNTRY$delegate", "setCurrentRegion", "", "region", "setCurrentCountry", "country", "setLocaleCountry", "contry", "getCurrentRegion", "getLocalCountry", "getCurrentCountry", "setLocaleCountryByIP", "getLocaleCountryByIP", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRegionSelectPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegionSelectPreference.kt\ncom/xiaomi/fitness/login/preference/RegionSelectPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,55:1\n211#2,7:56\n135#2,6:63\n211#2,7:69\n211#2,7:76\n135#2,6:83\n*S KotlinDebug\n*F\n+ 1 RegionSelectPreference.kt\ncom/xiaomi/fitness/login/preference/RegionSelectPreference\n*L\n14#1:56,7\n16#1:63,6\n18#1:69,7\n20#1:76,7\n22#1:83,6\n*E\n"})
public final class RegionSelectPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RegionSelectPreference.class, "LOCALE_COUNTRY", "getLOCALE_COUNTRY()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RegionSelectPreference.class, "CURRENT_REGION", "getCURRENT_REGION()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RegionSelectPreference.class, "KEY_CURRENT_REGION", "getKEY_CURRENT_REGION()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RegionSelectPreference.class, "KEY_LOCALE_COUNTRY_BY_IP", "getKEY_LOCALE_COUNTRY_BY_IP()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RegionSelectPreference.class, "CURRENT_COUNTRY", "getCURRENT_COUNTRY()Ljava/lang/String;", 0))};

    /* JADX INFO: renamed from: CURRENT_COUNTRY$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CURRENT_COUNTRY;

    /* JADX INFO: renamed from: CURRENT_REGION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CURRENT_REGION;

    @NotNull
    public static final RegionSelectPreference INSTANCE;

    /* JADX INFO: renamed from: KEY_CURRENT_REGION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_CURRENT_REGION;

    /* JADX INFO: renamed from: KEY_LOCALE_COUNTRY_BY_IP$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_LOCALE_COUNTRY_BY_IP;

    /* JADX INFO: renamed from: LOCALE_COUNTRY$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LOCALE_COUNTRY;

    static {
        RegionSelectPreference regionSelectPreference = new RegionSelectPreference();
        INSTANCE = regionSelectPreference;
        LOCALE_COUNTRY = regionSelectPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.login.preference.RegionSelectPreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), "", null, "app_pref_start", "key_locale_country");
        CURRENT_REGION = regionSelectPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.login.preference.RegionSelectPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), "", null, true);
        KEY_CURRENT_REGION = regionSelectPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.login.preference.RegionSelectPreference$special$$inlined$bindAndMigratePrefer$default$2
        }.getType(), "", null, "app_pref_start", "key_current_region");
        KEY_LOCALE_COUNTRY_BY_IP = regionSelectPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.login.preference.RegionSelectPreference$special$$inlined$bindAndMigratePrefer$default$3
        }.getType(), "", null, "app_pref_start", "key_locale_country_by_ip");
        CURRENT_COUNTRY = regionSelectPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.login.preference.RegionSelectPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), "", null, true);
    }

    private RegionSelectPreference() {
    }

    @NotNull
    public final String getCURRENT_COUNTRY() {
        return (String) CURRENT_COUNTRY.getValue(this, $$delegatedProperties[4]);
    }

    @NotNull
    public final String getCURRENT_REGION() {
        return (String) CURRENT_REGION.getValue(this, $$delegatedProperties[1]);
    }

    @NotNull
    public final String getCurrentCountry() {
        return getCURRENT_COUNTRY();
    }

    @NotNull
    public final String getCurrentRegion() {
        String key_current_region = getKEY_CURRENT_REGION();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = key_current_region.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @NotNull
    public final String getKEY_CURRENT_REGION() {
        return (String) KEY_CURRENT_REGION.getValue(this, $$delegatedProperties[2]);
    }

    @NotNull
    public final String getKEY_LOCALE_COUNTRY_BY_IP() {
        return (String) KEY_LOCALE_COUNTRY_BY_IP.getValue(this, $$delegatedProperties[3]);
    }

    @NotNull
    public final String getLOCALE_COUNTRY() {
        return (String) LOCALE_COUNTRY.getValue(this, $$delegatedProperties[0]);
    }

    @NotNull
    public final String getLocalCountry() {
        return getLOCALE_COUNTRY();
    }

    @NotNull
    public final String getLocaleCountryByIP() {
        return getKEY_LOCALE_COUNTRY_BY_IP();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "region_pref";
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    /* JADX INFO: renamed from: isMultipleProcessListener */
    public boolean getIsMultipleProcessListener() {
        return true;
    }

    public final void setCURRENT_COUNTRY(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        CURRENT_COUNTRY.setValue(this, $$delegatedProperties[4], str);
    }

    public final void setCURRENT_REGION(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        CURRENT_REGION.setValue(this, $$delegatedProperties[1], str);
    }

    public final void setCurrentCountry(@NotNull String country) {
        Intrinsics.checkNotNullParameter(country, "country");
        setCURRENT_COUNTRY(country);
    }

    public final void setCurrentRegion(@NotNull String region) {
        Intrinsics.checkNotNullParameter(region, "region");
        setKEY_CURRENT_REGION(region);
    }

    public final void setKEY_CURRENT_REGION(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_CURRENT_REGION.setValue(this, $$delegatedProperties[2], str);
    }

    public final void setKEY_LOCALE_COUNTRY_BY_IP(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_LOCALE_COUNTRY_BY_IP.setValue(this, $$delegatedProperties[3], str);
    }

    public final void setLOCALE_COUNTRY(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        LOCALE_COUNTRY.setValue(this, $$delegatedProperties[0], str);
    }

    public final void setLocaleCountry(@NotNull String contry) {
        Intrinsics.checkNotNullParameter(contry, "contry");
        setLOCALE_COUNTRY(contry);
    }

    public final void setLocaleCountryByIP(@NotNull String country) {
        Intrinsics.checkNotNullParameter(country, "country");
        setKEY_LOCALE_COUNTRY_BY_IP(country);
    }
}
