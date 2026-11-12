package com.xiaomi.fitness.eco.device.manager;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.main.export.ConfigPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0013\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0005J\u000e\u00103\u001a\u00020(2\u0006\u00102\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R+\u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\fR+\u0010\u0017\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u001aR+\u0010\u001c\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\fR+\u0010 \u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u000e\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\fR+\u0010$\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u000e\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\fR+\u0010)\u001a\u00020(2\u0006\u0010\b\u001a\u00020(8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u000e\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010/\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R+\u00104\u001a\u00020(2\u0006\u0010\b\u001a\u00020(8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010\u000e\u001a\u0004\b5\u0010+\"\u0004\b6\u0010-R+\u00108\u001a\u00020(2\u0006\u0010\b\u001a\u00020(8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010\u000e\u001a\u0004\b9\u0010+\"\u0004\b:\u0010-R+\u0010<\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010\u000e\u001a\u0004\b=\u0010\u0012\"\u0004\b>\u0010\u001aR+\u0010@\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010\u000e\u001a\u0004\bA\u0010\u0007\"\u0004\bB\u0010\f¨\u0006D"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/EcoDevicePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "CURRENT_DEVICE_ID", "getCURRENT_DEVICE_ID", "setCURRENT_DEVICE_ID", "(Ljava/lang/String;)V", "CURRENT_DEVICE_ID$delegate", "Lkotlin/properties/ReadWriteProperty;", "productWhiteListSwitch", "", "getProductWhiteListSwitch", "()Z", "LAST_LOCALE", "getLAST_LOCALE", "setLAST_LOCALE", "LAST_LOCALE$delegate", "RECORD_DEVICE_PHONE", "getRECORD_DEVICE_PHONE", "setRECORD_DEVICE_PHONE", "(Z)V", "RECORD_DEVICE_PHONE$delegate", "OAID", "getOAID", "setOAID", "OAID$delegate", "CUR_PHONE_DID", "getCUR_PHONE_DID", "setCUR_PHONE_DID", "CUR_PHONE_DID$delegate", "APP_LATEST_VERSION_NAME", "getAPP_LATEST_VERSION_NAME", "setAPP_LATEST_VERSION_NAME", "APP_LATEST_VERSION_NAME$delegate", "", "REQUEST_DEVICE_LAST_TIME", "getREQUEST_DEVICE_LAST_TIME", "()J", "setREQUEST_DEVICE_LAST_TIME", "(J)V", "REQUEST_DEVICE_LAST_TIME$delegate", "DEVICE_BIND_TIME", "setDeviceBindTime", "", "did", "getDeviceBindTime", "LAST_REQUEST_PERMISSION_TIME", "getLAST_REQUEST_PERMISSION_TIME", "setLAST_REQUEST_PERMISSION_TIME", "LAST_REQUEST_PERMISSION_TIME$delegate", "LAST_SHOW_BLUE_DATA_DIALOG_TIME", "getLAST_SHOW_BLUE_DATA_DIALOG_TIME", "setLAST_SHOW_BLUE_DATA_DIALOG_TIME", "LAST_SHOW_BLUE_DATA_DIALOG_TIME$delegate", "AGREE_BLUE_DATA_ENABLE", "getAGREE_BLUE_DATA_ENABLE", "setAGREE_BLUE_DATA_ENABLE", "AGREE_BLUE_DATA_ENABLE$delegate", "ECO_CONNECTED_DEVICE_NAME", "getECO_CONNECTED_DEVICE_NAME", "setECO_CONNECTED_DEVICE_NAME", "ECO_CONNECTED_DEVICE_NAME$delegate", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEcoDevicePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoDevicePreference.kt\ncom/xiaomi/fitness/eco/device/manager/EcoDevicePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,68:1\n211#2,7:69\n211#2,7:76\n135#2,6:83\n135#2,6:89\n135#2,6:95\n135#2,6:101\n135#2,6:107\n135#2,6:113\n135#2,6:119\n135#2,6:125\n135#2,6:131\n*S KotlinDebug\n*F\n+ 1 EcoDevicePreference.kt\ncom/xiaomi/fitness/eco/device/manager/EcoDevicePreference\n*L\n22#1:69,7\n34#1:76,7\n40#1:83,6\n42#1:89,6\n44#1:95,6\n46#1:101,6\n48#1:107,6\n60#1:113,6\n61#1:119,6\n62#1:125,6\n67#1:131,6\n*E\n"})
public final class EcoDevicePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoDevicePreference.class, "CURRENT_DEVICE_ID", "getCURRENT_DEVICE_ID()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoDevicePreference.class, "LAST_LOCALE", "getLAST_LOCALE()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoDevicePreference.class, "RECORD_DEVICE_PHONE", "getRECORD_DEVICE_PHONE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoDevicePreference.class, "OAID", "getOAID()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoDevicePreference.class, "CUR_PHONE_DID", "getCUR_PHONE_DID()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoDevicePreference.class, "APP_LATEST_VERSION_NAME", "getAPP_LATEST_VERSION_NAME()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoDevicePreference.class, "REQUEST_DEVICE_LAST_TIME", "getREQUEST_DEVICE_LAST_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoDevicePreference.class, "LAST_REQUEST_PERMISSION_TIME", "getLAST_REQUEST_PERMISSION_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoDevicePreference.class, "LAST_SHOW_BLUE_DATA_DIALOG_TIME", "getLAST_SHOW_BLUE_DATA_DIALOG_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoDevicePreference.class, "AGREE_BLUE_DATA_ENABLE", "getAGREE_BLUE_DATA_ENABLE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoDevicePreference.class, "ECO_CONNECTED_DEVICE_NAME", "getECO_CONNECTED_DEVICE_NAME()Ljava/lang/String;", 0))};

    /* JADX INFO: renamed from: AGREE_BLUE_DATA_ENABLE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty AGREE_BLUE_DATA_ENABLE;

    /* JADX INFO: renamed from: APP_LATEST_VERSION_NAME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty APP_LATEST_VERSION_NAME;

    /* JADX INFO: renamed from: CURRENT_DEVICE_ID$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CURRENT_DEVICE_ID;

    /* JADX INFO: renamed from: CUR_PHONE_DID$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CUR_PHONE_DID;

    @NotNull
    private static final String DEVICE_BIND_TIME = "device_bind_time";

    /* JADX INFO: renamed from: ECO_CONNECTED_DEVICE_NAME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty ECO_CONNECTED_DEVICE_NAME;

    @NotNull
    public static final EcoDevicePreference INSTANCE;

    /* JADX INFO: renamed from: LAST_LOCALE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LAST_LOCALE;

    /* JADX INFO: renamed from: LAST_REQUEST_PERMISSION_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LAST_REQUEST_PERMISSION_TIME;

    /* JADX INFO: renamed from: LAST_SHOW_BLUE_DATA_DIALOG_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LAST_SHOW_BLUE_DATA_DIALOG_TIME;

    /* JADX INFO: renamed from: OAID$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty OAID;

    /* JADX INFO: renamed from: RECORD_DEVICE_PHONE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty RECORD_DEVICE_PHONE;

    /* JADX INFO: renamed from: REQUEST_DEVICE_LAST_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty REQUEST_DEVICE_LAST_TIME;

    static {
        EcoDevicePreference ecoDevicePreference = new EcoDevicePreference();
        INSTANCE = ecoDevicePreference;
        CURRENT_DEVICE_ID = ecoDevicePreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.eco.device.manager.EcoDevicePreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), "", null, "app_pref", "pref_current_device");
        LAST_LOCALE = ecoDevicePreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.eco.device.manager.EcoDevicePreference$special$$inlined$bindAndMigratePrefer$default$2
        }.getType(), LocaleUtil.getCurrentLocale(), null, "config_pref", "key_locale");
        Boolean bool = Boolean.FALSE;
        RECORD_DEVICE_PHONE = ecoDevicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.eco.device.manager.EcoDevicePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), bool, null, true);
        OAID = ecoDevicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.eco.device.manager.EcoDevicePreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), "", null, true);
        CUR_PHONE_DID = ecoDevicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.eco.device.manager.EcoDevicePreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), "", null, true);
        APP_LATEST_VERSION_NAME = ecoDevicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.eco.device.manager.EcoDevicePreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), "", null, false);
        REQUEST_DEVICE_LAST_TIME = ecoDevicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.eco.device.manager.EcoDevicePreference$special$$inlined$bindToPreferenceField$default$5
        }.getType(), 0L, null, true);
        LAST_REQUEST_PERMISSION_TIME = ecoDevicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.eco.device.manager.EcoDevicePreference$special$$inlined$bindToPreferenceField$default$6
        }.getType(), 0L, null, false);
        LAST_SHOW_BLUE_DATA_DIALOG_TIME = ecoDevicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.eco.device.manager.EcoDevicePreference$special$$inlined$bindToPreferenceField$default$7
        }.getType(), 0L, null, false);
        AGREE_BLUE_DATA_ENABLE = ecoDevicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.eco.device.manager.EcoDevicePreference$special$$inlined$bindToPreferenceField$default$8
        }.getType(), bool, null, false);
        ECO_CONNECTED_DEVICE_NAME = ecoDevicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.eco.device.manager.EcoDevicePreference$special$$inlined$bindToPreferenceField$default$9
        }.getType(), "", null, false);
    }

    private EcoDevicePreference() {
    }

    public final boolean getAGREE_BLUE_DATA_ENABLE() {
        return ((Boolean) AGREE_BLUE_DATA_ENABLE.getValue(this, $$delegatedProperties[9])).booleanValue();
    }

    @NotNull
    public final String getAPP_LATEST_VERSION_NAME() {
        return (String) APP_LATEST_VERSION_NAME.getValue(this, $$delegatedProperties[5]);
    }

    @NotNull
    public final String getCURRENT_DEVICE_ID() {
        return (String) CURRENT_DEVICE_ID.getValue(this, $$delegatedProperties[0]);
    }

    @NotNull
    public final String getCUR_PHONE_DID() {
        return (String) CUR_PHONE_DID.getValue(this, $$delegatedProperties[4]);
    }

    public final long getDeviceBindTime(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return ((Number) getValue(did + "_device_bind_time", 0L)).longValue();
    }

    @NotNull
    public final String getECO_CONNECTED_DEVICE_NAME() {
        return (String) ECO_CONNECTED_DEVICE_NAME.getValue(this, $$delegatedProperties[10]);
    }

    @NotNull
    public final String getLAST_LOCALE() {
        return (String) LAST_LOCALE.getValue(this, $$delegatedProperties[1]);
    }

    public final long getLAST_REQUEST_PERMISSION_TIME() {
        return ((Number) LAST_REQUEST_PERMISSION_TIME.getValue(this, $$delegatedProperties[7])).longValue();
    }

    public final long getLAST_SHOW_BLUE_DATA_DIALOG_TIME() {
        return ((Number) LAST_SHOW_BLUE_DATA_DIALOG_TIME.getValue(this, $$delegatedProperties[8])).longValue();
    }

    @NotNull
    public final String getOAID() {
        return (String) OAID.getValue(this, $$delegatedProperties[3]);
    }

    public final boolean getProductWhiteListSwitch() {
        return ((Boolean) ConfigPreference.INSTANCE.getValue(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId() + "_whitelist", Boolean.FALSE)).booleanValue();
    }

    public final boolean getRECORD_DEVICE_PHONE() {
        return ((Boolean) RECORD_DEVICE_PHONE.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public final long getREQUEST_DEVICE_LAST_TIME() {
        return ((Number) REQUEST_DEVICE_LAST_TIME.getValue(this, $$delegatedProperties[6])).longValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "eco_device_manager";
    }

    public final void setAGREE_BLUE_DATA_ENABLE(boolean z) {
        AGREE_BLUE_DATA_ENABLE.setValue(this, $$delegatedProperties[9], Boolean.valueOf(z));
    }

    public final void setAPP_LATEST_VERSION_NAME(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        APP_LATEST_VERSION_NAME.setValue(this, $$delegatedProperties[5], str);
    }

    public final void setCURRENT_DEVICE_ID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        CURRENT_DEVICE_ID.setValue(this, $$delegatedProperties[0], str);
    }

    public final void setCUR_PHONE_DID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        CUR_PHONE_DID.setValue(this, $$delegatedProperties[4], str);
    }

    public final void setDeviceBindTime(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(did + "_device_bind_time", Long.valueOf(System.currentTimeMillis()));
    }

    public final void setECO_CONNECTED_DEVICE_NAME(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        ECO_CONNECTED_DEVICE_NAME.setValue(this, $$delegatedProperties[10], str);
    }

    public final void setLAST_LOCALE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        LAST_LOCALE.setValue(this, $$delegatedProperties[1], str);
    }

    public final void setLAST_REQUEST_PERMISSION_TIME(long j) {
        LAST_REQUEST_PERMISSION_TIME.setValue(this, $$delegatedProperties[7], Long.valueOf(j));
    }

    public final void setLAST_SHOW_BLUE_DATA_DIALOG_TIME(long j) {
        LAST_SHOW_BLUE_DATA_DIALOG_TIME.setValue(this, $$delegatedProperties[8], Long.valueOf(j));
    }

    public final void setOAID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        OAID.setValue(this, $$delegatedProperties[3], str);
    }

    public final void setRECORD_DEVICE_PHONE(boolean z) {
        RECORD_DEVICE_PHONE.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    public final void setREQUEST_DEVICE_LAST_TIME(long j) {
        REQUEST_DEVICE_LAST_TIME.setValue(this, $$delegatedProperties[6], Long.valueOf(j));
    }
}
