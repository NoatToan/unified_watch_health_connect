package com.xiaomi.fitness.account.region;

import android.content.Intent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\"\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\"\u001a\u00020\fJ\u0006\u0010#\u001a\u00020\fJ\u000e\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\fJ\u000e\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\fJ\u001a\u0010(\u001a\u00020\r2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bJ\u001a\u0010*\u001a\u00020\r2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bJ\u000e\u0010;\u001a\u00020\r2\u0006\u0010'\u001a\u00020\fJ\u001a\u0010<\u001a\u00020\r2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bJ\u001a\u0010=\u001a\u00020\r2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR+\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0014R+\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0014R \u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010 R+\u0010+\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u0016\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010 R+\u0010/\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u0016\u001a\u0004\b0\u0010\u000f\"\u0004\b1\u0010\u0014R+\u00103\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010\u0016\u001a\u0004\b4\u0010\u000f\"\u0004\b5\u0010\u0014R+\u00107\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\u0016\u001a\u0004\b8\u0010\u000f\"\u0004\b9\u0010\u0014¨\u0006>"}, d2 = {"Lcom/xiaomi/fitness/account/region/RegionPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "TAG", "syncWebListener", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lkotlin/Function1;", "", "", "isMultipleProcessListener", "()Z", "<set-?>", "SYNC_WEB_VALUE", "getSYNC_WEB_VALUE", "setSYNC_WEB_VALUE", "(Z)V", "SYNC_WEB_VALUE$delegate", "Lkotlin/properties/ReadWriteProperty;", "HEALTH_DEVICE_ACCESS_SWITCH", "getHEALTH_DEVICE_ACCESS_SWITCH", "setHEALTH_DEVICE_ACCESS_SWITCH", "HEALTH_DEVICE_ACCESS_SWITCH$delegate", "privacyListener", "", "CURRENT_LOCALE", "getCURRENT_LOCALE", "setCURRENT_LOCALE", "(Ljava/lang/String;)V", "CURRENT_LOCALE$delegate", "getSyncWeb", "getDefaultSyncWeb", "setSyncWeb", "open", "setSettingSyncWeb", "value", "addSyncWebListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeSyncWebListener", "PERSONALIZE_MODE", "getPERSONALIZE_MODE", "setPERSONALIZE_MODE", "PERSONALIZE_MODE$delegate", "PRIVACY_AGREE", "getPRIVACY_AGREE", "setPRIVACY_AGREE", "PRIVACY_AGREE$delegate", "PREF_PRIVACY_EXPERIENCE_TAG", "getPREF_PRIVACY_EXPERIENCE_TAG", "setPREF_PRIVACY_EXPERIENCE_TAG", "PREF_PRIVACY_EXPERIENCE_TAG$delegate", "LOGIN_SUCCESS", "getLOGIN_SUCCESS", "setLOGIN_SUCCESS", "LOGIN_SUCCESS$delegate", "setSettingPrivacy", "addPrivacyListener", "removePrivacyListener", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRegionPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegionPreference.kt\ncom/xiaomi/fitness/account/region/RegionPreference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,110:1\n1863#2,2:111\n1863#2,2:113\n135#3,6:115\n135#3,6:121\n140#3:127\n135#3,6:128\n211#3,7:134\n211#3,7:141\n135#3,6:148\n*S KotlinDebug\n*F\n+ 1 RegionPreference.kt\ncom/xiaomi/fitness/account/region/RegionPreference\n*L\n67#1:111,2\n90#1:113,2\n28#1:115,6\n34#1:121,6\n38#1:127\n80#1:128,6\n82#1:134,7\n84#1:141,7\n86#1:148,6\n*E\n"})
public final class RegionPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RegionPreference.class, "SYNC_WEB_VALUE", "getSYNC_WEB_VALUE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RegionPreference.class, "HEALTH_DEVICE_ACCESS_SWITCH", "getHEALTH_DEVICE_ACCESS_SWITCH()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RegionPreference.class, "CURRENT_LOCALE", "getCURRENT_LOCALE()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RegionPreference.class, "PERSONALIZE_MODE", "getPERSONALIZE_MODE()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RegionPreference.class, "PRIVACY_AGREE", "getPRIVACY_AGREE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RegionPreference.class, "PREF_PRIVACY_EXPERIENCE_TAG", "getPREF_PRIVACY_EXPERIENCE_TAG()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RegionPreference.class, "LOGIN_SUCCESS", "getLOGIN_SUCCESS()Z", 0))};

    /* JADX INFO: renamed from: CURRENT_LOCALE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CURRENT_LOCALE;

    /* JADX INFO: renamed from: HEALTH_DEVICE_ACCESS_SWITCH$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty HEALTH_DEVICE_ACCESS_SWITCH;

    @NotNull
    public static final RegionPreference INSTANCE;

    /* JADX INFO: renamed from: LOGIN_SUCCESS$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LOGIN_SUCCESS;

    /* JADX INFO: renamed from: PERSONALIZE_MODE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PERSONALIZE_MODE;

    /* JADX INFO: renamed from: PREF_PRIVACY_EXPERIENCE_TAG$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREF_PRIVACY_EXPERIENCE_TAG;

    /* JADX INFO: renamed from: PRIVACY_AGREE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PRIVACY_AGREE;

    /* JADX INFO: renamed from: SYNC_WEB_VALUE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SYNC_WEB_VALUE;

    @NotNull
    private static final String TAG;

    @NotNull
    private static final List<Function1<Boolean, Unit>> privacyListener;

    @NotNull
    private static final CopyOnWriteArraySet<Function1<Boolean, Unit>> syncWebListener;

    static {
        RegionPreference regionPreference = new RegionPreference();
        INSTANCE = regionPreference;
        TAG = "RegionPreference";
        syncWebListener = new CopyOnWriteArraySet<>();
        Boolean bool = Boolean.FALSE;
        SYNC_WEB_VALUE = regionPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.account.region.RegionPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), bool, null, true);
        HEALTH_DEVICE_ACCESS_SWITCH = regionPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.account.region.RegionPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), Boolean.TRUE, null, true);
        privacyListener = new ArrayList();
        CURRENT_LOCALE = regionPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.account.region.RegionPreference$special$$inlined$bindToPreferenceField$1
        }.getType(), "", "current_locale", true);
        PERSONALIZE_MODE = regionPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.account.region.RegionPreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), "", null, true);
        PRIVACY_AGREE = regionPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.account.region.RegionPreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), bool, null, "app_pref", "pref_privacy_agree");
        PREF_PRIVACY_EXPERIENCE_TAG = regionPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.account.region.RegionPreference$special$$inlined$bindAndMigratePrefer$default$2
        }.getType(), bool, null, "app_pref", "pref_privacy_experience");
        LOGIN_SUCCESS = regionPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.account.region.RegionPreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), bool, null, true);
    }

    private RegionPreference() {
    }

    private final boolean getSYNC_WEB_VALUE() {
        return ((Boolean) SYNC_WEB_VALUE.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final void setSYNC_WEB_VALUE(boolean z) {
        SYNC_WEB_VALUE.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void addPrivacyListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<Function1<Boolean, Unit>> list = privacyListener;
        if (list.contains(listener)) {
            return;
        }
        list.add(listener);
    }

    public final void addSyncWebListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CopyOnWriteArraySet<Function1<Boolean, Unit>> copyOnWriteArraySet = syncWebListener;
        if (copyOnWriteArraySet.contains(listener)) {
            return;
        }
        copyOnWriteArraySet.add(listener);
    }

    @NotNull
    public final String getCURRENT_LOCALE() {
        return (String) CURRENT_LOCALE.getValue(this, $$delegatedProperties[2]);
    }

    public final boolean getDefaultSyncWeb() {
        if (((Boolean) getValue("sync_pref", "enable", Boolean.FALSE)).booleanValue()) {
            setSYNC_WEB_VALUE(true);
        }
        return getSYNC_WEB_VALUE();
    }

    public final boolean getHEALTH_DEVICE_ACCESS_SWITCH() {
        return ((Boolean) HEALTH_DEVICE_ACCESS_SWITCH.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final boolean getLOGIN_SUCCESS() {
        return ((Boolean) LOGIN_SUCCESS.getValue(this, $$delegatedProperties[6])).booleanValue();
    }

    @NotNull
    public final String getPERSONALIZE_MODE() {
        return (String) PERSONALIZE_MODE.getValue(this, $$delegatedProperties[3]);
    }

    public final boolean getPREF_PRIVACY_EXPERIENCE_TAG() {
        return ((Boolean) PREF_PRIVACY_EXPERIENCE_TAG.getValue(this, $$delegatedProperties[5])).booleanValue();
    }

    public final boolean getPRIVACY_AGREE() {
        return ((Boolean) PRIVACY_AGREE.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_pref_start";
    }

    public final boolean getSyncWeb() {
        return ((Boolean) getValue("sync_pref", "enable", Boolean.FALSE)).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    /* JADX INFO: renamed from: isMultipleProcessListener */
    public boolean getIsMultipleProcessListener() {
        return true;
    }

    public final void removePrivacyListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        privacyListener.remove(listener);
    }

    public final void removeSyncWebListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        syncWebListener.remove(listener);
    }

    public final void setCURRENT_LOCALE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        CURRENT_LOCALE.setValue(this, $$delegatedProperties[2], str);
    }

    public final void setHEALTH_DEVICE_ACCESS_SWITCH(boolean z) {
        HEALTH_DEVICE_ACCESS_SWITCH.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setLOGIN_SUCCESS(boolean z) {
        LOGIN_SUCCESS.setValue(this, $$delegatedProperties[6], Boolean.valueOf(z));
    }

    public final void setPERSONALIZE_MODE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        PERSONALIZE_MODE.setValue(this, $$delegatedProperties[3], str);
    }

    public final void setPREF_PRIVACY_EXPERIENCE_TAG(boolean z) {
        PREF_PRIVACY_EXPERIENCE_TAG.setValue(this, $$delegatedProperties[5], Boolean.valueOf(z));
    }

    public final void setPRIVACY_AGREE(boolean z) {
        PRIVACY_AGREE.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    public final void setSettingPrivacy(boolean value) {
        setPRIVACY_AGREE(value);
        Iterator<T> it = privacyListener.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke2(Boolean.valueOf(value));
        }
        if (value) {
            Intent intent = new Intent("APP_ACCOUNT_REFRESH");
            intent.putExtra("extra_update_type", 3);
            ApplicationExtKt.getApplication().sendBroadcast(intent);
        }
    }

    public final void setSettingSyncWeb(boolean value) {
        setSYNC_WEB_VALUE(value);
        Iterator<T> it = syncWebListener.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke2(Boolean.valueOf(value));
        }
    }

    public final void setSyncWeb(boolean open) {
        setSYNC_WEB_VALUE(true);
        putValue("sync_pref", "enable", Boolean.valueOf(open));
        StringBuilder sb = new StringBuilder();
        sb.append("sp is ");
        sb.append(open);
    }
}
