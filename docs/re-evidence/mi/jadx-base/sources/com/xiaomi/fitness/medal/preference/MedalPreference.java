package com.xiaomi.fitness.medal.preference;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0018\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R+\u0010\u001c\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/medal/preference/MedalPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "KEY_IS_NFC_DOOR_MEDAL_UPLOADED", "KEY_IS_NFC_TRANSIT_MEDAL_UPLOADED", "<set-?>", "LOCALE_COUNTRY", "getLOCALE_COUNTRY", "setLOCALE_COUNTRY", "(Ljava/lang/String;)V", "LOCALE_COUNTRY$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "KEY_NFC_TRANSIT_MEDAL_UPLOADED", "getKEY_NFC_TRANSIT_MEDAL_UPLOADED", "()Z", "setKEY_NFC_TRANSIT_MEDAL_UPLOADED", "(Z)V", "KEY_NFC_TRANSIT_MEDAL_UPLOADED$delegate", "KEY_NFC_DOOR_MEDAL_UPLOADED", "getKEY_NFC_DOOR_MEDAL_UPLOADED", "setKEY_NFC_DOOR_MEDAL_UPLOADED", "KEY_NFC_DOOR_MEDAL_UPLOADED$delegate", "KEY_NEW_USER_MEDAL_UPLOADED", "getKEY_NEW_USER_MEDAL_UPLOADED", "setKEY_NEW_USER_MEDAL_UPLOADED", "KEY_NEW_USER_MEDAL_UPLOADED$delegate", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMedalPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedalPreference.kt\ncom/xiaomi/fitness/medal/preference/MedalPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,35:1\n135#2,6:36\n140#2:42\n140#2:43\n135#2,6:44\n*S KotlinDebug\n*F\n+ 1 MedalPreference.kt\ncom/xiaomi/fitness/medal/preference/MedalPreference\n*L\n15#1:36,6\n17#1:42\n23#1:43\n29#1:44,6\n*E\n"})
public final class MedalPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedalPreference.class, "LOCALE_COUNTRY", "getLOCALE_COUNTRY()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedalPreference.class, "KEY_NFC_TRANSIT_MEDAL_UPLOADED", "getKEY_NFC_TRANSIT_MEDAL_UPLOADED()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedalPreference.class, "KEY_NFC_DOOR_MEDAL_UPLOADED", "getKEY_NFC_DOOR_MEDAL_UPLOADED()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(MedalPreference.class, "KEY_NEW_USER_MEDAL_UPLOADED", "getKEY_NEW_USER_MEDAL_UPLOADED()Z", 0))};

    @NotNull
    public static final MedalPreference INSTANCE;

    @NotNull
    public static final String KEY_IS_NFC_DOOR_MEDAL_UPLOADED = "is_nfc_door_medal_updated";

    @NotNull
    public static final String KEY_IS_NFC_TRANSIT_MEDAL_UPLOADED = "is_nfc_transit_medal_updated";

    /* JADX INFO: renamed from: KEY_NEW_USER_MEDAL_UPLOADED$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_NEW_USER_MEDAL_UPLOADED;

    /* JADX INFO: renamed from: KEY_NFC_DOOR_MEDAL_UPLOADED$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_NFC_DOOR_MEDAL_UPLOADED;

    /* JADX INFO: renamed from: KEY_NFC_TRANSIT_MEDAL_UPLOADED$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_NFC_TRANSIT_MEDAL_UPLOADED;

    /* JADX INFO: renamed from: LOCALE_COUNTRY$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LOCALE_COUNTRY;

    static {
        MedalPreference medalPreference = new MedalPreference();
        INSTANCE = medalPreference;
        LOCALE_COUNTRY = medalPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.medal.preference.MedalPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), "", null, true);
        Boolean bool = Boolean.FALSE;
        UserInfoManager.Companion companion = UserInfoManager.INSTANCE;
        KEY_NFC_TRANSIT_MEDAL_UPLOADED = medalPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.medal.preference.MedalPreference$special$$inlined$bindToPreferenceField$1
        }.getType(), bool, KEY_IS_NFC_DOOR_MEDAL_UPLOADED + AccountManagerExtKt.getInstance(companion).getUserId(), true);
        KEY_NFC_DOOR_MEDAL_UPLOADED = medalPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.medal.preference.MedalPreference$special$$inlined$bindToPreferenceField$2
        }.getType(), bool, KEY_IS_NFC_DOOR_MEDAL_UPLOADED + AccountManagerExtKt.getInstance(companion).getUserId(), true);
        KEY_NEW_USER_MEDAL_UPLOADED = medalPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.medal.preference.MedalPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), bool, null, true);
    }

    private MedalPreference() {
    }

    public final boolean getKEY_NEW_USER_MEDAL_UPLOADED() {
        return ((Boolean) KEY_NEW_USER_MEDAL_UPLOADED.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    public final boolean getKEY_NFC_DOOR_MEDAL_UPLOADED() {
        return ((Boolean) KEY_NFC_DOOR_MEDAL_UPLOADED.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public final boolean getKEY_NFC_TRANSIT_MEDAL_UPLOADED() {
        return ((Boolean) KEY_NFC_TRANSIT_MEDAL_UPLOADED.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    @NotNull
    public final String getLOCALE_COUNTRY() {
        return (String) LOCALE_COUNTRY.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_pref_start";
    }

    public final void setKEY_NEW_USER_MEDAL_UPLOADED(boolean z) {
        KEY_NEW_USER_MEDAL_UPLOADED.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    public final void setKEY_NFC_DOOR_MEDAL_UPLOADED(boolean z) {
        KEY_NFC_DOOR_MEDAL_UPLOADED.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    public final void setKEY_NFC_TRANSIT_MEDAL_UPLOADED(boolean z) {
        KEY_NFC_TRANSIT_MEDAL_UPLOADED.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setLOCALE_COUNTRY(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        LOCALE_COUNTRY.setValue(this, $$delegatedProperties[0], str);
    }
}
