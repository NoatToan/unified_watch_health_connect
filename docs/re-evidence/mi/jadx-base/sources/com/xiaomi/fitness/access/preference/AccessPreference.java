package com.xiaomi.fitness.access.preference;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u000bJ\u0006\u0010\"\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R+\u0010#\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0015\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R+\u0010'\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0015\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/access/preference/AccessPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "misportImportListener", "", "Lkotlin/Function1;", "", "", "<set-?>", "", "PREF_PRIVACY_STORAGE_TAG", "getPREF_PRIVACY_STORAGE_TAG", "()Z", "setPREF_PRIVACY_STORAGE_TAG", "(Z)V", "PREF_PRIVACY_STORAGE_TAG$delegate", "Lkotlin/properties/ReadWriteProperty;", "KEY_MI_SPORT_DATA_IMPORT_STATE", "getKEY_MI_SPORT_DATA_IMPORT_STATE", "()I", "setKEY_MI_SPORT_DATA_IMPORT_STATE", "(I)V", "KEY_MI_SPORT_DATA_IMPORT_STATE$delegate", "LOGIN_SUCCESS", "getLOGIN_SUCCESS", "setLOGIN_SUCCESS", "LOGIN_SUCCESS$delegate", "setMisportImportState", "state", "getMisportImportState", "WECHAT_STEPS_SWITCH_INITIALIZED", "getWECHAT_STEPS_SWITCH_INITIALIZED", "setWECHAT_STEPS_SWITCH_INITIALIZED", "WECHAT_STEPS_SWITCH_INITIALIZED$delegate", "WECHAT_STEPS_VERSION_REVERTED", "getWECHAT_STEPS_VERSION_REVERTED", "setWECHAT_STEPS_VERSION_REVERTED", "WECHAT_STEPS_VERSION_REVERTED$delegate", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccessPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessPreference.kt\ncom/xiaomi/fitness/access/preference/AccessPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,48:1\n135#2,6:49\n211#2,7:55\n135#2,6:62\n135#2,6:68\n135#2,6:74\n*S KotlinDebug\n*F\n+ 1 AccessPreference.kt\ncom/xiaomi/fitness/access/preference/AccessPreference\n*L\n19#1:49,6\n21#1:55,7\n27#1:62,6\n41#1:68,6\n46#1:74,6\n*E\n"})
public final class AccessPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(AccessPreference.class, "PREF_PRIVACY_STORAGE_TAG", "getPREF_PRIVACY_STORAGE_TAG()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AccessPreference.class, "KEY_MI_SPORT_DATA_IMPORT_STATE", "getKEY_MI_SPORT_DATA_IMPORT_STATE()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AccessPreference.class, "LOGIN_SUCCESS", "getLOGIN_SUCCESS()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AccessPreference.class, "WECHAT_STEPS_SWITCH_INITIALIZED", "getWECHAT_STEPS_SWITCH_INITIALIZED()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AccessPreference.class, "WECHAT_STEPS_VERSION_REVERTED", "getWECHAT_STEPS_VERSION_REVERTED()Z", 0))};

    @NotNull
    public static final AccessPreference INSTANCE;

    /* JADX INFO: renamed from: KEY_MI_SPORT_DATA_IMPORT_STATE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_MI_SPORT_DATA_IMPORT_STATE;

    /* JADX INFO: renamed from: LOGIN_SUCCESS$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LOGIN_SUCCESS;

    /* JADX INFO: renamed from: PREF_PRIVACY_STORAGE_TAG$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty PREF_PRIVACY_STORAGE_TAG;

    /* JADX INFO: renamed from: WECHAT_STEPS_SWITCH_INITIALIZED$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty WECHAT_STEPS_SWITCH_INITIALIZED;

    /* JADX INFO: renamed from: WECHAT_STEPS_VERSION_REVERTED$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty WECHAT_STEPS_VERSION_REVERTED;

    @NotNull
    private static final List<Function1<Integer, Unit>> misportImportListener;

    static {
        AccessPreference accessPreference = new AccessPreference();
        INSTANCE = accessPreference;
        misportImportListener = new ArrayList();
        Boolean bool = Boolean.FALSE;
        PREF_PRIVACY_STORAGE_TAG = accessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.access.preference.AccessPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), bool, null, true);
        KEY_MI_SPORT_DATA_IMPORT_STATE = accessPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.access.preference.AccessPreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), 0, null, "app_pref", "key_misport_import_state");
        LOGIN_SUCCESS = accessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.access.preference.AccessPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), bool, null, true);
        WECHAT_STEPS_SWITCH_INITIALIZED = accessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.access.preference.AccessPreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), bool, null, true);
        WECHAT_STEPS_VERSION_REVERTED = accessPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.access.preference.AccessPreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), bool, null, true);
    }

    private AccessPreference() {
    }

    public final int getKEY_MI_SPORT_DATA_IMPORT_STATE() {
        return ((Number) KEY_MI_SPORT_DATA_IMPORT_STATE.getValue(this, $$delegatedProperties[1])).intValue();
    }

    public final boolean getLOGIN_SUCCESS() {
        return ((Boolean) LOGIN_SUCCESS.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public final int getMisportImportState() {
        return getKEY_MI_SPORT_DATA_IMPORT_STATE();
    }

    public final boolean getPREF_PRIVACY_STORAGE_TAG() {
        return ((Boolean) PREF_PRIVACY_STORAGE_TAG.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_pref_start";
    }

    public final boolean getWECHAT_STEPS_SWITCH_INITIALIZED() {
        return ((Boolean) WECHAT_STEPS_SWITCH_INITIALIZED.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    public final boolean getWECHAT_STEPS_VERSION_REVERTED() {
        return ((Boolean) WECHAT_STEPS_VERSION_REVERTED.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    public final void setKEY_MI_SPORT_DATA_IMPORT_STATE(int i) {
        KEY_MI_SPORT_DATA_IMPORT_STATE.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    public final void setLOGIN_SUCCESS(boolean z) {
        LOGIN_SUCCESS.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    public final void setMisportImportState(int state) {
        setKEY_MI_SPORT_DATA_IMPORT_STATE(state);
    }

    public final void setPREF_PRIVACY_STORAGE_TAG(boolean z) {
        PREF_PRIVACY_STORAGE_TAG.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setWECHAT_STEPS_SWITCH_INITIALIZED(boolean z) {
        WECHAT_STEPS_SWITCH_INITIALIZED.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    public final void setWECHAT_STEPS_VERSION_REVERTED(boolean z) {
        WECHAT_STEPS_VERSION_REVERTED.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }
}
