package com.xiaomi.fitness.device.manager;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.extensions.GsonExtKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.device.manager.DevicePreference;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0005J\u000e\u0010/\u001a\u0002002\u0006\u0010.\u001a\u00020\u0005J\u000e\u0010M\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0005J\u000e\u0010N\u001a\u00020O2\u0006\u0010.\u001a\u00020\u0005J\u001c\u0010c\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00052\f\u0010d\u001a\b\u0012\u0004\u0012\u00020f0eJ\u0014\u0010g\u001a\b\u0012\u0004\u0012\u00020f0e2\u0006\u0010.\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R+\u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\fR+\u0010\u0017\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\fR+\u0010\u001b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\fR+\u0010\u001f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u000e\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\fR+\u0010#\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u000e\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\fR+\u0010'\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u000e\u001a\u0004\b(\u0010\u0007\"\u0004\b)\u0010\fR\u000e\u0010+\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R+\u00101\u001a\u0002002\u0006\u0010\b\u001a\u0002008F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010\u000e\u001a\u0004\b2\u00103\"\u0004\b4\u00105R+\u00107\u001a\u0002002\u0006\u0010\b\u001a\u0002008F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\u000e\u001a\u0004\b8\u00103\"\u0004\b9\u00105R+\u0010;\u001a\u0002002\u0006\u0010\b\u001a\u0002008F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010\u000e\u001a\u0004\b<\u00103\"\u0004\b=\u00105R+\u0010?\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010\u000e\u001a\u0004\b@\u0010\u0012\"\u0004\bA\u0010BR+\u0010D\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010\u000e\u001a\u0004\bE\u0010\u0012\"\u0004\bF\u0010BR+\u0010H\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010\u000e\u001a\u0004\bI\u0010\u0012\"\u0004\bJ\u0010BR\u000e\u0010L\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010P\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bR\u0010SR$\u0010W\u001a\u00020\u00102\u0006\u0010V\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010\u0012\"\u0004\bY\u0010BR+\u0010Z\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010\u000e\u001a\u0004\b[\u0010\u0012\"\u0004\b\\\u0010BR+\u0010^\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010\u000e\u001a\u0004\b_\u0010\u0012\"\u0004\b`\u0010BR\u000e\u0010b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006h"}, d2 = {"Lcom/xiaomi/fitness/device/manager/DevicePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "CURRENT_DEVICE_ID", "getCURRENT_DEVICE_ID", "setCURRENT_DEVICE_ID", "(Ljava/lang/String;)V", "CURRENT_DEVICE_ID$delegate", "Lkotlin/properties/ReadWriteProperty;", "productWhiteListSwitch", "", "getProductWhiteListSwitch", "()Z", "LAST_LOCALE", "getLAST_LOCALE", "setLAST_LOCALE", "LAST_LOCALE$delegate", "RECORD_PHONE_USER", "getRECORD_PHONE_USER", "setRECORD_PHONE_USER", "RECORD_PHONE_USER$delegate", "OLD_HEALTH_OAID", "getOLD_HEALTH_OAID", "setOLD_HEALTH_OAID", "OLD_HEALTH_OAID$delegate", "OAID", "getOAID", "setOAID", "OAID$delegate", "CUR_PHONE_DID", "getCUR_PHONE_DID", "setCUR_PHONE_DID", "CUR_PHONE_DID$delegate", "APP_LATEST_VERSION_NAME", "getAPP_LATEST_VERSION_NAME", "setAPP_LATEST_VERSION_NAME", "APP_LATEST_VERSION_NAME$delegate", "DEVICE_BIND_TIME", "setDeviceBindTime", "", "did", "getDeviceBindTime", "", "LAST_REQUEST_PERMISSION_TIME", "getLAST_REQUEST_PERMISSION_TIME", "()J", "setLAST_REQUEST_PERMISSION_TIME", "(J)V", "LAST_REQUEST_PERMISSION_TIME$delegate", "LAST_REQUEST_LOCATION_SWITCH", "getLAST_REQUEST_LOCATION_SWITCH", "setLAST_REQUEST_LOCATION_SWITCH", "LAST_REQUEST_LOCATION_SWITCH$delegate", "LAST_SHOW_BLUE_DATA_DIALOG_TIME", "getLAST_SHOW_BLUE_DATA_DIALOG_TIME", "setLAST_SHOW_BLUE_DATA_DIALOG_TIME", "LAST_SHOW_BLUE_DATA_DIALOG_TIME$delegate", "AGREE_BLUE_DATA_ENABLE", "getAGREE_BLUE_DATA_ENABLE", "setAGREE_BLUE_DATA_ENABLE", "(Z)V", "AGREE_BLUE_DATA_ENABLE$delegate", "SOURCE_PRODUCT_NO_LOGIN", "getSOURCE_PRODUCT_NO_LOGIN", "setSOURCE_PRODUCT_NO_LOGIN", "SOURCE_PRODUCT_NO_LOGIN$delegate", "CONNECT_NEW_PHONE", "getCONNECT_NEW_PHONE", "setCONNECT_NEW_PHONE", "CONNECT_NEW_PHONE$delegate", "DEVICE_SYNC_TIME", "setSyncTime", "getSyncTime", "", "connectPreferences", "Landroid/content/SharedPreferences;", "getConnectPreferences", "()Landroid/content/SharedPreferences;", "connectPreferences$delegate", "Lkotlin/Lazy;", "value", "IN_BIND_NEW_MODE", "getIN_BIND_NEW_MODE", "setIN_BIND_NEW_MODE", "LYRA_ENABLED", "getLYRA_ENABLED", "setLYRA_ENABLED", "LYRA_ENABLED$delegate", "FACE_ENTRANCE_TITLE", "getFACE_ENTRANCE_TITLE", "setFACE_ENTRANCE_TITLE", "FACE_ENTRANCE_TITLE$delegate", "KEY_CACHE_FACE_ENTRANCE_ITEM", "setFaceEntranceItem", "list", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "getFaceEntranceItem", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDevicePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DevicePreference.kt\ncom/xiaomi/fitness/device/manager/DevicePreference\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n+ 3 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,138:1\n53#2,7:139\n211#3,7:146\n211#3,7:153\n135#3,6:160\n135#3,6:166\n135#3,6:172\n135#3,6:178\n135#3,6:184\n135#3,6:190\n135#3,6:196\n135#3,6:202\n135#3,6:208\n135#3,6:214\n135#3,6:220\n135#3,6:226\n135#3,6:232\n*S KotlinDebug\n*F\n+ 1 DevicePreference.kt\ncom/xiaomi/fitness/device/manager/DevicePreference\n*L\n131#1:139,7\n27#1:146,7\n39#1:153,7\n50#1:160,6\n61#1:166,6\n63#1:172,6\n65#1:178,6\n67#1:184,6\n81#1:190,6\n82#1:196,6\n83#1:202,6\n84#1:208,6\n86#1:214,6\n89#1:220,6\n116#1:226,6\n117#1:232,6\n*E\n"})
public final class DevicePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(DevicePreference.class, "CURRENT_DEVICE_ID", "getCURRENT_DEVICE_ID()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DevicePreference.class, "LAST_LOCALE", "getLAST_LOCALE()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DevicePreference.class, "RECORD_PHONE_USER", "getRECORD_PHONE_USER()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DevicePreference.class, "OLD_HEALTH_OAID", "getOLD_HEALTH_OAID()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DevicePreference.class, "OAID", "getOAID()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DevicePreference.class, "CUR_PHONE_DID", "getCUR_PHONE_DID()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DevicePreference.class, "APP_LATEST_VERSION_NAME", "getAPP_LATEST_VERSION_NAME()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DevicePreference.class, "LAST_REQUEST_PERMISSION_TIME", "getLAST_REQUEST_PERMISSION_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DevicePreference.class, "LAST_REQUEST_LOCATION_SWITCH", "getLAST_REQUEST_LOCATION_SWITCH()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DevicePreference.class, "LAST_SHOW_BLUE_DATA_DIALOG_TIME", "getLAST_SHOW_BLUE_DATA_DIALOG_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DevicePreference.class, "AGREE_BLUE_DATA_ENABLE", "getAGREE_BLUE_DATA_ENABLE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DevicePreference.class, "SOURCE_PRODUCT_NO_LOGIN", "getSOURCE_PRODUCT_NO_LOGIN()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DevicePreference.class, "CONNECT_NEW_PHONE", "getCONNECT_NEW_PHONE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DevicePreference.class, "LYRA_ENABLED", "getLYRA_ENABLED()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DevicePreference.class, "FACE_ENTRANCE_TITLE", "getFACE_ENTRANCE_TITLE()Z", 0))};

    /* JADX INFO: renamed from: AGREE_BLUE_DATA_ENABLE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty AGREE_BLUE_DATA_ENABLE;

    /* JADX INFO: renamed from: APP_LATEST_VERSION_NAME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty APP_LATEST_VERSION_NAME;

    /* JADX INFO: renamed from: CONNECT_NEW_PHONE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CONNECT_NEW_PHONE;

    /* JADX INFO: renamed from: CURRENT_DEVICE_ID$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CURRENT_DEVICE_ID;

    /* JADX INFO: renamed from: CUR_PHONE_DID$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CUR_PHONE_DID;

    @NotNull
    private static final String DEVICE_BIND_TIME = "device_bind_time";

    @NotNull
    private static final String DEVICE_SYNC_TIME = "device_sync_time";

    /* JADX INFO: renamed from: FACE_ENTRANCE_TITLE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty FACE_ENTRANCE_TITLE;

    @NotNull
    public static final DevicePreference INSTANCE;

    @NotNull
    private static final String KEY_CACHE_FACE_ENTRANCE_ITEM = "key_cache_face_entrance_item";

    /* JADX INFO: renamed from: LAST_LOCALE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LAST_LOCALE;

    /* JADX INFO: renamed from: LAST_REQUEST_LOCATION_SWITCH$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LAST_REQUEST_LOCATION_SWITCH;

    /* JADX INFO: renamed from: LAST_REQUEST_PERMISSION_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LAST_REQUEST_PERMISSION_TIME;

    /* JADX INFO: renamed from: LAST_SHOW_BLUE_DATA_DIALOG_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LAST_SHOW_BLUE_DATA_DIALOG_TIME;

    /* JADX INFO: renamed from: LYRA_ENABLED$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LYRA_ENABLED;

    /* JADX INFO: renamed from: OAID$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty OAID;

    /* JADX INFO: renamed from: OLD_HEALTH_OAID$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty OLD_HEALTH_OAID;

    /* JADX INFO: renamed from: RECORD_PHONE_USER$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty RECORD_PHONE_USER;

    /* JADX INFO: renamed from: SOURCE_PRODUCT_NO_LOGIN$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SOURCE_PRODUCT_NO_LOGIN;

    /* JADX INFO: renamed from: connectPreferences$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy connectPreferences;

    static {
        DevicePreference devicePreference = new DevicePreference();
        INSTANCE = devicePreference;
        CURRENT_DEVICE_ID = devicePreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.device.manager.DevicePreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), "", null, "app_pref", "pref_current_device");
        LAST_LOCALE = devicePreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.device.manager.DevicePreference$special$$inlined$bindAndMigratePrefer$default$2
        }.getType(), LocaleUtil.getCurrentLocale(), null, "config_pref", "key_locale");
        RECORD_PHONE_USER = devicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.device.manager.DevicePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), "", null, true);
        OLD_HEALTH_OAID = devicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.device.manager.DevicePreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), "", null, true);
        OAID = devicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.device.manager.DevicePreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), "", null, true);
        CUR_PHONE_DID = devicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.device.manager.DevicePreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), "", null, true);
        APP_LATEST_VERSION_NAME = devicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.device.manager.DevicePreference$special$$inlined$bindToPreferenceField$default$5
        }.getType(), "", null, false);
        LAST_REQUEST_PERMISSION_TIME = devicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.device.manager.DevicePreference$special$$inlined$bindToPreferenceField$default$6
        }.getType(), 0L, null, false);
        LAST_REQUEST_LOCATION_SWITCH = devicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.device.manager.DevicePreference$special$$inlined$bindToPreferenceField$default$7
        }.getType(), 0L, null, false);
        LAST_SHOW_BLUE_DATA_DIALOG_TIME = devicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.device.manager.DevicePreference$special$$inlined$bindToPreferenceField$default$8
        }.getType(), 0L, null, false);
        Boolean bool = Boolean.FALSE;
        AGREE_BLUE_DATA_ENABLE = devicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.device.manager.DevicePreference$special$$inlined$bindToPreferenceField$default$9
        }.getType(), bool, null, false);
        SOURCE_PRODUCT_NO_LOGIN = devicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.device.manager.DevicePreference$special$$inlined$bindToPreferenceField$default$10
        }.getType(), bool, null, false);
        CONNECT_NEW_PHONE = devicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.device.manager.DevicePreference$special$$inlined$bindToPreferenceField$default$11
        }.getType(), bool, null, false);
        connectPreferences = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ra6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DevicePreference.connectPreferences_delegate$lambda$0();
            }
        });
        LYRA_ENABLED = devicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.device.manager.DevicePreference$special$$inlined$bindToPreferenceField$default$12
        }.getType(), bool, null, false);
        FACE_ENTRANCE_TITLE = devicePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.device.manager.DevicePreference$special$$inlined$bindToPreferenceField$default$13
        }.getType(), bool, null, true);
    }

    private DevicePreference() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences connectPreferences_delegate$lambda$0() {
        return INSTANCE.newPreferences("device_connect");
    }

    private final SharedPreferences getConnectPreferences() {
        return (SharedPreferences) connectPreferences.getValue();
    }

    public final boolean getAGREE_BLUE_DATA_ENABLE() {
        return ((Boolean) AGREE_BLUE_DATA_ENABLE.getValue(this, $$delegatedProperties[10])).booleanValue();
    }

    @NotNull
    public final String getAPP_LATEST_VERSION_NAME() {
        return (String) APP_LATEST_VERSION_NAME.getValue(this, $$delegatedProperties[6]);
    }

    public final boolean getCONNECT_NEW_PHONE() {
        return ((Boolean) CONNECT_NEW_PHONE.getValue(this, $$delegatedProperties[12])).booleanValue();
    }

    @NotNull
    public final String getCURRENT_DEVICE_ID() {
        return (String) CURRENT_DEVICE_ID.getValue(this, $$delegatedProperties[0]);
    }

    @NotNull
    public final String getCUR_PHONE_DID() {
        return (String) CUR_PHONE_DID.getValue(this, $$delegatedProperties[5]);
    }

    public final long getDeviceBindTime(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return ((Number) getValue(did + "_device_bind_time", 0L)).longValue();
    }

    public final boolean getFACE_ENTRANCE_TITLE() {
        return ((Boolean) FACE_ENTRANCE_TITLE.getValue(this, $$delegatedProperties[14])).booleanValue();
    }

    @NotNull
    public final List<FaceData> getFaceEntranceItem(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        String str = (String) getValue(did + "_key_cache_face_entrance_item", "");
        try {
            if (str.length() == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
            Gson gsonCreate = gsonBuilder.create();
            Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
            Object objFromJson = gsonCreate.fromJson(str, new com.google.gson.reflect.TypeToken<List<? extends FaceData>>() { // from class: com.xiaomi.fitness.device.manager.DevicePreference.getFaceEntranceItem.1
            }.getType());
            Intrinsics.checkNotNull(objFromJson);
            return (List) objFromJson;
        } catch (Exception e) {
            e.printStackTrace();
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    public final boolean getIN_BIND_NEW_MODE() {
        return getConnectPreferences().getBoolean("in_bind_new_mode", false);
    }

    @NotNull
    public final String getLAST_LOCALE() {
        return (String) LAST_LOCALE.getValue(this, $$delegatedProperties[1]);
    }

    public final long getLAST_REQUEST_LOCATION_SWITCH() {
        return ((Number) LAST_REQUEST_LOCATION_SWITCH.getValue(this, $$delegatedProperties[8])).longValue();
    }

    public final long getLAST_REQUEST_PERMISSION_TIME() {
        return ((Number) LAST_REQUEST_PERMISSION_TIME.getValue(this, $$delegatedProperties[7])).longValue();
    }

    public final long getLAST_SHOW_BLUE_DATA_DIALOG_TIME() {
        return ((Number) LAST_SHOW_BLUE_DATA_DIALOG_TIME.getValue(this, $$delegatedProperties[9])).longValue();
    }

    public final boolean getLYRA_ENABLED() {
        return ((Boolean) LYRA_ENABLED.getValue(this, $$delegatedProperties[13])).booleanValue();
    }

    @NotNull
    public final String getOAID() {
        return (String) OAID.getValue(this, $$delegatedProperties[4]);
    }

    @NotNull
    public final String getOLD_HEALTH_OAID() {
        return (String) OLD_HEALTH_OAID.getValue(this, $$delegatedProperties[3]);
    }

    public final boolean getProductWhiteListSwitch() {
        return ((Boolean) ConfigPreference.INSTANCE.getValue(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId() + "_whitelist", Boolean.FALSE)).booleanValue();
    }

    @NotNull
    public final String getRECORD_PHONE_USER() {
        return (String) RECORD_PHONE_USER.getValue(this, $$delegatedProperties[2]);
    }

    public final boolean getSOURCE_PRODUCT_NO_LOGIN() {
        return ((Boolean) SOURCE_PRODUCT_NO_LOGIN.getValue(this, $$delegatedProperties[11])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "device_manager";
    }

    public final int getSyncTime(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        long jLongValue = ((Number) getValue(did + "_device_sync_time", 0L)).longValue();
        if (jLongValue == 0) {
            return 0;
        }
        return ((int) ((System.currentTimeMillis() - jLongValue) / ((long) 60000))) + 1;
    }

    public final void setAGREE_BLUE_DATA_ENABLE(boolean z) {
        AGREE_BLUE_DATA_ENABLE.setValue(this, $$delegatedProperties[10], Boolean.valueOf(z));
    }

    public final void setAPP_LATEST_VERSION_NAME(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        APP_LATEST_VERSION_NAME.setValue(this, $$delegatedProperties[6], str);
    }

    public final void setCONNECT_NEW_PHONE(boolean z) {
        CONNECT_NEW_PHONE.setValue(this, $$delegatedProperties[12], Boolean.valueOf(z));
    }

    public final void setCURRENT_DEVICE_ID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        CURRENT_DEVICE_ID.setValue(this, $$delegatedProperties[0], str);
    }

    public final void setCUR_PHONE_DID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        CUR_PHONE_DID.setValue(this, $$delegatedProperties[5], str);
    }

    public final void setDeviceBindTime(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(did + "_device_bind_time", Long.valueOf(System.currentTimeMillis()));
    }

    public final void setFACE_ENTRANCE_TITLE(boolean z) {
        FACE_ENTRANCE_TITLE.setValue(this, $$delegatedProperties[14], Boolean.valueOf(z));
    }

    public final void setFaceEntranceItem(@NotNull String did, @NotNull List<FaceData> list) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(list, "list");
        putValue(did + "_key_cache_face_entrance_item", GsonExtKt.toJson(list));
    }

    public final void setIN_BIND_NEW_MODE(boolean z) {
        getConnectPreferences().edit().putBoolean("in_bind_new_mode", z).apply();
    }

    public final void setLAST_LOCALE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        LAST_LOCALE.setValue(this, $$delegatedProperties[1], str);
    }

    public final void setLAST_REQUEST_LOCATION_SWITCH(long j) {
        LAST_REQUEST_LOCATION_SWITCH.setValue(this, $$delegatedProperties[8], Long.valueOf(j));
    }

    public final void setLAST_REQUEST_PERMISSION_TIME(long j) {
        LAST_REQUEST_PERMISSION_TIME.setValue(this, $$delegatedProperties[7], Long.valueOf(j));
    }

    public final void setLAST_SHOW_BLUE_DATA_DIALOG_TIME(long j) {
        LAST_SHOW_BLUE_DATA_DIALOG_TIME.setValue(this, $$delegatedProperties[9], Long.valueOf(j));
    }

    public final void setLYRA_ENABLED(boolean z) {
        LYRA_ENABLED.setValue(this, $$delegatedProperties[13], Boolean.valueOf(z));
    }

    public final void setOAID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        OAID.setValue(this, $$delegatedProperties[4], str);
    }

    public final void setOLD_HEALTH_OAID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        OLD_HEALTH_OAID.setValue(this, $$delegatedProperties[3], str);
    }

    public final void setRECORD_PHONE_USER(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        RECORD_PHONE_USER.setValue(this, $$delegatedProperties[2], str);
    }

    public final void setSOURCE_PRODUCT_NO_LOGIN(boolean z) {
        SOURCE_PRODUCT_NO_LOGIN.setValue(this, $$delegatedProperties[11], Boolean.valueOf(z));
    }

    public final void setSyncTime(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(did + "_device_sync_time", Long.valueOf(System.currentTimeMillis()));
    }
}
