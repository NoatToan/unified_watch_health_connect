package com.xiaomi.fitness.about.preference;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import java.util.Iterator;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001a\u001a\u00020\u0005J\u0006\u0010\u001b\u001a\u00020\u000fJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000fJ\u0006\u0010\u001e\u001a\u00020\u000fJ\u001a\u0010\u001f\u001a\u00020\u00192\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00190\u0018R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\fR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00190\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/about/preference/SettingPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "COACH_PREFER", "getCOACH_PREFER", "setCOACH_PREFER", "(Ljava/lang/String;)V", "COACH_PREFER$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "KEY_NOT_UPLOAD_GPS_ENABLE", "getKEY_NOT_UPLOAD_GPS_ENABLE", "()Z", "setKEY_NOT_UPLOAD_GPS_ENABLE", "(Z)V", "KEY_NOT_UPLOAD_GPS_ENABLE$delegate", "notUploadGpsEnableListener", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lkotlin/Function1;", "", "getCoachSaved", "isCoachMale", "setNotUploadGpsEnable", "notUpload", "getNotUploadGpsEnable", "addNotUploadGpsEnableListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "about_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSettingPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingPreference.kt\ncom/xiaomi/fitness/about/preference/SettingPreference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,50:1\n1863#2,2:51\n135#3,6:53\n211#3,7:59\n*S KotlinDebug\n*F\n+ 1 SettingPreference.kt\ncom/xiaomi/fitness/about/preference/SettingPreference\n*L\n34#1:51,2\n19#1:53,6\n21#1:59,7\n*E\n"})
public final class SettingPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SettingPreference.class, "COACH_PREFER", "getCOACH_PREFER()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SettingPreference.class, "KEY_NOT_UPLOAD_GPS_ENABLE", "getKEY_NOT_UPLOAD_GPS_ENABLE()Z", 0))};

    /* JADX INFO: renamed from: COACH_PREFER$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty COACH_PREFER;

    @NotNull
    public static final SettingPreference INSTANCE;

    /* JADX INFO: renamed from: KEY_NOT_UPLOAD_GPS_ENABLE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_NOT_UPLOAD_GPS_ENABLE;

    @NotNull
    private static final CopyOnWriteArraySet<Function1<Boolean, Unit>> notUploadGpsEnableListener;

    static {
        SettingPreference settingPreference = new SettingPreference();
        INSTANCE = settingPreference;
        COACH_PREFER = settingPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.about.preference.SettingPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), "", null, true);
        KEY_NOT_UPLOAD_GPS_ENABLE = settingPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.about.preference.SettingPreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), Boolean.FALSE, null, "app_pref", "key_not_upload_gps_enable");
        notUploadGpsEnableListener = new CopyOnWriteArraySet<>();
    }

    private SettingPreference() {
    }

    public final void addNotUploadGpsEnableListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CopyOnWriteArraySet<Function1<Boolean, Unit>> copyOnWriteArraySet = notUploadGpsEnableListener;
        if (copyOnWriteArraySet.contains(listener)) {
            return;
        }
        copyOnWriteArraySet.add(listener);
    }

    @NotNull
    public final String getCOACH_PREFER() {
        return (String) COACH_PREFER.getValue(this, $$delegatedProperties[0]);
    }

    @NotNull
    public final String getCoachSaved() {
        return getCOACH_PREFER().length() == 0 ? AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).isMale() ? "male" : "female" : getCOACH_PREFER();
    }

    public final boolean getKEY_NOT_UPLOAD_GPS_ENABLE() {
        return ((Boolean) KEY_NOT_UPLOAD_GPS_ENABLE.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final boolean getNotUploadGpsEnable() {
        return getKEY_NOT_UPLOAD_GPS_ENABLE();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_pref_start";
    }

    public final boolean isCoachMale() {
        return Intrinsics.areEqual(getCoachSaved(), "male");
    }

    public final void setCOACH_PREFER(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        COACH_PREFER.setValue(this, $$delegatedProperties[0], str);
    }

    public final void setKEY_NOT_UPLOAD_GPS_ENABLE(boolean z) {
        KEY_NOT_UPLOAD_GPS_ENABLE.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setNotUploadGpsEnable(boolean notUpload) {
        setKEY_NOT_UPLOAD_GPS_ENABLE(notUpload);
        Iterator<T> it = notUploadGpsEnableListener.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke2(Boolean.valueOf(notUpload));
        }
    }
}
