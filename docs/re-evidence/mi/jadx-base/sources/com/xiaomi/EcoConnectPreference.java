package com.xiaomi;

import android.content.SharedPreferences;
import com.mi.fitness.checkupdate.util.CheckUpdatePreferenceSupport;
import com.xiaomi.EcoConnectPreference;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u00109\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u0005J\u000e\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020;J\u0006\u0010F\u001a\u00020;R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR+\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR+\u0010\u0019\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\u001cR+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0010\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010%\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0010\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R+\u0010)\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0010\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b/\u00100R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b4\u00100R\u001a\u00106\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\u001cR+\u0010<\u001a\u00020;2\u0006\u0010\b\u001a\u00020;8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010\u0010\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u000e\u0010B\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/xiaomi/EcoConnectPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "APP_COUNT", "getAPP_COUNT", "()J", "setAPP_COUNT", "(J)V", "APP_COUNT$delegate", "Lkotlin/properties/ReadWriteProperty;", "DEVICE_COUNT", "getDEVICE_COUNT", "setDEVICE_COUNT", "DEVICE_COUNT$delegate", "LAST_CONNECT_TIME", "getLAST_CONNECT_TIME", "setLAST_CONNECT_TIME", "LAST_CONNECT_TIME$delegate", "AUTH_KEY", "getAUTH_KEY", "setAUTH_KEY", "(Ljava/lang/String;)V", "AUTH_KEY$delegate", "", "IN_BIND_NEW_MODE", "getIN_BIND_NEW_MODE", "()Z", "setIN_BIND_NEW_MODE", "(Z)V", "IN_BIND_NEW_MODE$delegate", "IS_ECO_DEVICE", "getIS_ECO_DEVICE", "setIS_ECO_DEVICE", "IS_ECO_DEVICE$delegate", "OPEN_MIUI_CONNECTION_V5", "getOPEN_MIUI_CONNECTION_V5", "setOPEN_MIUI_CONNECTION_V5", "OPEN_MIUI_CONNECTION_V5$delegate", "externalPreferences", "Landroid/content/SharedPreferences;", "getExternalPreferences", "()Landroid/content/SharedPreferences;", "externalPreferences$delegate", "Lkotlin/Lazy;", "devicePreferences", "getDevicePreferences", "devicePreferences$delegate", "KEY_FIRMWARE_VERSION", "getKEY_FIRMWARE_VERSION", "setKEY_FIRMWARE_VERSION", "getFirmwareVersion", "did", "", "DEVICE_SUPPORT_CAPABILITY", "getDEVICE_SUPPORT_CAPABILITY", "()I", "setDEVICE_SUPPORT_CAPABILITY", "(I)V", "DEVICE_SUPPORT_CAPABILITY$delegate", "TAG", "setDeviceSupportCapability", "", "st", "getDeviceSupportCapability", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEcoConnectPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoConnectPreference.kt\ncom/xiaomi/EcoConnectPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,55:1\n140#2:56\n140#2:57\n140#2:58\n140#2:59\n135#2,6:60\n140#2:66\n135#2,6:67\n135#2,6:73\n*S KotlinDebug\n*F\n+ 1 EcoConnectPreference.kt\ncom/xiaomi/EcoConnectPreference\n*L\n11#1:56\n13#1:57\n15#1:58\n17#1:59\n21#1:60,6\n23#1:66\n25#1:67,6\n41#1:73,6\n*E\n"})
public final class EcoConnectPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoConnectPreference.class, "APP_COUNT", "getAPP_COUNT()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoConnectPreference.class, "DEVICE_COUNT", "getDEVICE_COUNT()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoConnectPreference.class, "LAST_CONNECT_TIME", "getLAST_CONNECT_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoConnectPreference.class, "AUTH_KEY", "getAUTH_KEY()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoConnectPreference.class, "IN_BIND_NEW_MODE", "getIN_BIND_NEW_MODE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoConnectPreference.class, "IS_ECO_DEVICE", "getIS_ECO_DEVICE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoConnectPreference.class, "OPEN_MIUI_CONNECTION_V5", "getOPEN_MIUI_CONNECTION_V5()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(EcoConnectPreference.class, "DEVICE_SUPPORT_CAPABILITY", "getDEVICE_SUPPORT_CAPABILITY()I", 0))};

    /* JADX INFO: renamed from: APP_COUNT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty APP_COUNT;

    /* JADX INFO: renamed from: AUTH_KEY$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty AUTH_KEY;

    /* JADX INFO: renamed from: DEVICE_COUNT$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DEVICE_COUNT;

    /* JADX INFO: renamed from: DEVICE_SUPPORT_CAPABILITY$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DEVICE_SUPPORT_CAPABILITY;

    @NotNull
    public static final EcoConnectPreference INSTANCE;

    /* JADX INFO: renamed from: IN_BIND_NEW_MODE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty IN_BIND_NEW_MODE;

    /* JADX INFO: renamed from: IS_ECO_DEVICE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty IS_ECO_DEVICE;

    @NotNull
    private static String KEY_FIRMWARE_VERSION = null;

    /* JADX INFO: renamed from: LAST_CONNECT_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty LAST_CONNECT_TIME;

    /* JADX INFO: renamed from: OPEN_MIUI_CONNECTION_V5$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty OPEN_MIUI_CONNECTION_V5;

    @NotNull
    private static final String TAG = "EcoConnectPreference";

    /* JADX INFO: renamed from: devicePreferences$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy devicePreferences;

    /* JADX INFO: renamed from: externalPreferences$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy externalPreferences;

    static {
        EcoConnectPreference ecoConnectPreference = new EcoConnectPreference();
        INSTANCE = ecoConnectPreference;
        APP_COUNT = ecoConnectPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.EcoConnectPreference$special$$inlined$bindToPreferenceField$1
        }.getType(), 0L, "appCount", false);
        DEVICE_COUNT = ecoConnectPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.EcoConnectPreference$special$$inlined$bindToPreferenceField$2
        }.getType(), 0L, "deviceCount", false);
        LAST_CONNECT_TIME = ecoConnectPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.EcoConnectPreference$special$$inlined$bindToPreferenceField$3
        }.getType(), 0L, "last_connect_time", false);
        AUTH_KEY = ecoConnectPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.EcoConnectPreference$special$$inlined$bindToPreferenceField$4
        }.getType(), "", "auth_key", false);
        Boolean bool = Boolean.FALSE;
        IN_BIND_NEW_MODE = ecoConnectPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.EcoConnectPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), bool, null, false);
        IS_ECO_DEVICE = ecoConnectPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.EcoConnectPreference$special$$inlined$bindToPreferenceField$5
        }.getType(), bool, "is_eco_device", false);
        OPEN_MIUI_CONNECTION_V5 = ecoConnectPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.EcoConnectPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), bool, null, false);
        externalPreferences = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: oj7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EcoConnectPreference.externalPreferences_delegate$lambda$0();
            }
        });
        devicePreferences = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pj7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EcoConnectPreference.devicePreferences_delegate$lambda$1();
            }
        });
        KEY_FIRMWARE_VERSION = CheckUpdatePreferenceSupport.KEY_FIRMWARE_VERSION;
        DEVICE_SUPPORT_CAPABILITY = ecoConnectPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.EcoConnectPreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), -1, null, true);
    }

    private EcoConnectPreference() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences devicePreferences_delegate$lambda$1() {
        return INSTANCE.newPreferences("eco_device_manager");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences externalPreferences_delegate$lambda$0() {
        return INSTANCE.newPreferences("eco_check_update");
    }

    private final SharedPreferences getDevicePreferences() {
        return (SharedPreferences) devicePreferences.getValue();
    }

    private final SharedPreferences getExternalPreferences() {
        return (SharedPreferences) externalPreferences.getValue();
    }

    public final long getAPP_COUNT() {
        return ((Number) APP_COUNT.getValue(this, $$delegatedProperties[0])).longValue();
    }

    @NotNull
    public final String getAUTH_KEY() {
        return (String) AUTH_KEY.getValue(this, $$delegatedProperties[3]);
    }

    public final long getDEVICE_COUNT() {
        return ((Number) DEVICE_COUNT.getValue(this, $$delegatedProperties[1])).longValue();
    }

    public final int getDEVICE_SUPPORT_CAPABILITY() {
        return ((Number) DEVICE_SUPPORT_CAPABILITY.getValue(this, $$delegatedProperties[7])).intValue();
    }

    public final int getDeviceSupportCapability() {
        Logger.i(TAG, "getDeviceSupportCapability: st = " + getDEVICE_SUPPORT_CAPABILITY());
        return getDEVICE_SUPPORT_CAPABILITY();
    }

    @NotNull
    public final String getFirmwareVersion(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        String string = getExternalPreferences().getString(KEY_FIRMWARE_VERSION + did, "");
        return string == null ? "" : string;
    }

    public final boolean getIN_BIND_NEW_MODE() {
        return ((Boolean) IN_BIND_NEW_MODE.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    public final boolean getIS_ECO_DEVICE() {
        return ((Boolean) IS_ECO_DEVICE.getValue(this, $$delegatedProperties[5])).booleanValue();
    }

    @NotNull
    public final String getKEY_FIRMWARE_VERSION() {
        return KEY_FIRMWARE_VERSION;
    }

    public final long getLAST_CONNECT_TIME() {
        return ((Number) LAST_CONNECT_TIME.getValue(this, $$delegatedProperties[2])).longValue();
    }

    public final boolean getOPEN_MIUI_CONNECTION_V5() {
        return ((Boolean) OPEN_MIUI_CONNECTION_V5.getValue(this, $$delegatedProperties[6])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "eco_device_connect";
    }

    public final void setAPP_COUNT(long j) {
        APP_COUNT.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    public final void setAUTH_KEY(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        AUTH_KEY.setValue(this, $$delegatedProperties[3], str);
    }

    public final void setDEVICE_COUNT(long j) {
        DEVICE_COUNT.setValue(this, $$delegatedProperties[1], Long.valueOf(j));
    }

    public final void setDEVICE_SUPPORT_CAPABILITY(int i) {
        DEVICE_SUPPORT_CAPABILITY.setValue(this, $$delegatedProperties[7], Integer.valueOf(i));
    }

    public final void setDeviceSupportCapability(int st) {
        Logger.i(TAG, "setDeviceSupportCapability() called with: st = " + st);
        setDEVICE_SUPPORT_CAPABILITY(st);
    }

    public final void setIN_BIND_NEW_MODE(boolean z) {
        IN_BIND_NEW_MODE.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    public final void setIS_ECO_DEVICE(boolean z) {
        IS_ECO_DEVICE.setValue(this, $$delegatedProperties[5], Boolean.valueOf(z));
    }

    public final void setKEY_FIRMWARE_VERSION(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_FIRMWARE_VERSION = str;
    }

    public final void setLAST_CONNECT_TIME(long j) {
        LAST_CONNECT_TIME.setValue(this, $$delegatedProperties[2], Long.valueOf(j));
    }

    public final void setOPEN_MIUI_CONNECTION_V5(boolean z) {
        OPEN_MIUI_CONNECTION_V5.setValue(this, $$delegatedProperties[6], Boolean.valueOf(z));
    }
}
