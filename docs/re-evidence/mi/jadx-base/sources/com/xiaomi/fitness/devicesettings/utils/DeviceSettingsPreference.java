package com.xiaomi.fitness.devicesettings.utils;

import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b>\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u001b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020\u00052\u0006\u0010a\u001a\u00020\u000bJ\u000e\u0010^\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u0005J\u0006\u0010b\u001a\u00020\u000bJ\u000e\u0010c\u001a\u00020_2\u0006\u0010d\u001a\u00020\u000bJ\u0016\u0010e\u001a\u00020_2\u0006\u0010`\u001a\u00020\u00052\u0006\u0010a\u001a\u00020\u000bJ\u000e\u0010f\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u0005J\u000e\u0010g\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u0005J\u0016\u0010h\u001a\u00020_2\u0006\u0010`\u001a\u00020\u00052\u0006\u0010i\u001a\u00020\u000bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010`\u001a\u00020\u0005H\u0002J%\u0010j\u001a\u0002Hk\"\b\b\u0000\u0010k*\u00020l2\u0006\u0010m\u001a\u00020\u00052\u0006\u0010n\u001a\u0002Hk¢\u0006\u0002\u0010oJ\u0010\u0010p\u001a\u00020\u00052\u0006\u0010`\u001a\u00020\u0005H\u0002J\u0016\u0010q\u001a\u00020_2\u0006\u0010`\u001a\u00020\u00052\u0006\u0010r\u001a\u00020\u000bJ\u000e\u0010s\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u0005J\u000e\u0010t\u001a\u00020\u00052\u0006\u0010`\u001a\u00020\u0005J\u0016\u0010u\u001a\u00020_2\u0006\u0010`\u001a\u00020\u00052\u0006\u0010v\u001a\u00020\u000bJ\u000e\u0010w\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u0005J\u0016\u0010x\u001a\u00020_2\u0006\u0010`\u001a\u00020\u00052\u0006\u0010v\u001a\u00020\u000bJ\u000e\u0010y\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u0005J\u0016\u0010z\u001a\u00020_2\u0006\u0010`\u001a\u00020\u00052\u0006\u0010{\u001a\u00020JJ\u000e\u0010|\u001a\u00020J2\u0006\u0010`\u001a\u00020\u0005J\u001f\u0010}\u001a\u00020_2\b\u0010~\u001a\u0004\u0018\u00010\u007f2\u0007\u0010\u0080\u0001\u001a\u00020J¢\u0006\u0003\u0010\u0081\u0001J\u0017\u0010\u0082\u0001\u001a\u0004\u0018\u00010J2\u0006\u0010~\u001a\u00020\u007f¢\u0006\u0003\u0010\u0083\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fR+\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u0011R+\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u0011R+\u0010\u001c\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0013\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\u001fR+\u0010!\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0013\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u0011R+\u0010%\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0013\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\u001fR+\u0010)\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0013\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\u001fR+\u0010-\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0013\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010\u001fR+\u00101\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0013\u001a\u0004\b2\u0010\f\"\u0004\b3\u0010\u0011R+\u00105\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010\u0013\u001a\u0004\b6\u0010\u0007\"\u0004\b7\u0010\u001fR+\u00109\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010\u0013\u001a\u0004\b:\u0010\f\"\u0004\b;\u0010\u0011R+\u0010=\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010\u0013\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u0011R+\u0010A\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010\u0013\u001a\u0004\bB\u0010\f\"\u0004\bC\u0010\u0011R\u000e\u0010E\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R+\u0010K\u001a\u00020J2\u0006\u0010\r\u001a\u00020J8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010\u0013\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u000e\u0010Q\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R+\u0010R\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010\u0013\u001a\u0004\bS\u0010\u0007\"\u0004\bT\u0010\u001fR+\u0010V\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010\u0013\u001a\u0004\bW\u0010\u0007\"\u0004\bX\u0010\u001fR+\u0010Z\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010\u0013\u001a\u0004\b[\u0010\f\"\u0004\b\\\u0010\u0011R1\u0010\u0084\u0001\u001a\u00020\u007f2\u0006\u0010\r\u001a\u00020\u007f8F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u0089\u0001\u0010\u0013\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R/\u0010\u008a\u0001\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010\u0013\u001a\u0005\b\u008b\u0001\u0010\f\"\u0005\b\u008c\u0001\u0010\u0011R/\u0010\u008e\u0001\u001a\u00020J2\u0006\u0010\r\u001a\u00020J8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010\u0013\u001a\u0005\b\u008f\u0001\u0010M\"\u0005\b\u0090\u0001\u0010OR/\u0010\u0092\u0001\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010\u0013\u001a\u0005\b\u0093\u0001\u0010\f\"\u0005\b\u0094\u0001\u0010\u0011R/\u0010\u0096\u0001\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010\u0013\u001a\u0005\b\u0097\u0001\u0010\f\"\u0005\b\u0098\u0001\u0010\u0011¨\u0006\u009a\u0001"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/utils/DeviceSettingsPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", DeviceSettingsPreference.sKeyZenMode, "sOldHrHighWaring", "isMultipleProcessListener", "", "()Z", "<set-?>", "DUMP_DEVICE_LOG", "getDUMP_DEVICE_LOG", "setDUMP_DEVICE_LOG", "(Z)V", "DUMP_DEVICE_LOG$delegate", "Lkotlin/properties/ReadWriteProperty;", "SYNC_SCHEDULE", "getSYNC_SCHEDULE", "setSYNC_SCHEDULE", "SYNC_SCHEDULE$delegate", "SYNC_SLEEP_SCHEDULE", "getSYNC_SLEEP_SCHEDULE", "setSYNC_SLEEP_SCHEDULE", "SYNC_SLEEP_SCHEDULE$delegate", "KEY_VIBRATE_MODE", "getKEY_VIBRATE_MODE", "setKEY_VIBRATE_MODE", "(Ljava/lang/String;)V", "KEY_VIBRATE_MODE$delegate", "HID_STATUS", "getHID_STATUS", "setHID_STATUS", "HID_STATUS$delegate", "VIBRATE_LIST", "getVIBRATE_LIST", "setVIBRATE_LIST", "VIBRATE_LIST$delegate", "KEY_VIBRATE_MODE_SELECT_NAME", "getKEY_VIBRATE_MODE_SELECT_NAME", "setKEY_VIBRATE_MODE_SELECT_NAME", "KEY_VIBRATE_MODE_SELECT_NAME$delegate", "KEY_VIBRATE_MODE_SELECT_ID", "getKEY_VIBRATE_MODE_SELECT_ID", "setKEY_VIBRATE_MODE_SELECT_ID", "KEY_VIBRATE_MODE_SELECT_ID$delegate", "KEY_SUPPORT_HUAMI_ALARM", "getKEY_SUPPORT_HUAMI_ALARM", "setKEY_SUPPORT_HUAMI_ALARM", "KEY_SUPPORT_HUAMI_ALARM$delegate", "KEY_IN_CALL_NOTIFY_CONFIG", "getKEY_IN_CALL_NOTIFY_CONFIG", "setKEY_IN_CALL_NOTIFY_CONFIG", "KEY_IN_CALL_NOTIFY_CONFIG$delegate", "KEY_GOAL_REMIND_ENABLE", "getKEY_GOAL_REMIND_ENABLE", "setKEY_GOAL_REMIND_ENABLE", "KEY_GOAL_REMIND_ENABLE$delegate", "KEY_SYNC_MIUI_ALARM", "getKEY_SYNC_MIUI_ALARM", "setKEY_SYNC_MIUI_ALARM", "KEY_SYNC_MIUI_ALARM$delegate", "hasShowPushMusicDialog", "getHasShowPushMusicDialog", "setHasShowPushMusicDialog", "hasShowPushMusicDialog$delegate", "KEY_SYNC_SCHEDULE", "KEY_SYNC_MIUI_TODO", "KEY_SYNC_MIUI_SOS_CONTACTS", "KEY_DISABLE_MIUI_SOS_CONTACTS", "KEY_L66_SUPPORT_NIGHT_MODE", "", "DEVICE_MICR_PHONE_STATE_CHANGE_MODE", "getDEVICE_MICR_PHONE_STATE_CHANGE_MODE", "()I", "setDEVICE_MICR_PHONE_STATE_CHANGE_MODE", "(I)V", "DEVICE_MICR_PHONE_STATE_CHANGE_MODE$delegate", "TAG", "DEVICE_SETTINGS_ECG_MEASURE_REMIND", "getDEVICE_SETTINGS_ECG_MEASURE_REMIND", "setDEVICE_SETTINGS_ECG_MEASURE_REMIND", "DEVICE_SETTINGS_ECG_MEASURE_REMIND$delegate", "DEVICE_SETTINGS_BLOOD_PRESSURE_MEASURE_REMIND", "getDEVICE_SETTINGS_BLOOD_PRESSURE_MEASURE_REMIND", "setDEVICE_SETTINGS_BLOOD_PRESSURE_MEASURE_REMIND", "DEVICE_SETTINGS_BLOOD_PRESSURE_MEASURE_REMIND$delegate", "DEVICE_SETTINGS_SHOW_VIBRATE_GUIDE", "getDEVICE_SETTINGS_SHOW_VIBRATE_GUIDE", "setDEVICE_SETTINGS_SHOW_VIBRATE_GUIDE", "DEVICE_SETTINGS_SHOW_VIBRATE_GUIDE$delegate", "isZenModeOpen", "", "did", "isOpen", "isNeedSyncSchedule", "setNeedSyncSchedule", "isNeedSync", "setSyncMiuiTodoSwitchStatus", "getSyncMiuiTodoSwitchStatus", "getLimitBindStatus", "setLimitBindStatus", "limitBind", "getNonNulValue", "T", "", "key", "default", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getSuffixTag", "setHuamiSynced", "synced", "getHuamiSynced", "getHumaiSyncedKey", "setAgreeSyncMIUISosContacts", CommonConstants.KEY_AGREE, "getAgreeSyncMIUISosContacts", "setDisableSyncMIUISosContacts", "getDisableSyncMIUISosContacts", "setL66SupportNightMode", "status", "getL66SupportNightMode", "setSummaryProgress", "time", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "(Ljava/lang/Long;I)V", "getSummaryProgress", "(J)Ljava/lang/Integer;", "DIALOG_SHOW_TIME", "getDIALOG_SHOW_TIME", "()J", "setDIALOG_SHOW_TIME", "(J)V", "DIALOG_SHOW_TIME$delegate", "CLOUD_CONFIG_INVITE_REVIEW_SWITCH", "getCLOUD_CONFIG_INVITE_REVIEW_SWITCH", "setCLOUD_CONFIG_INVITE_REVIEW_SWITCH", "CLOUD_CONFIG_INVITE_REVIEW_SWITCH$delegate", "CLOUD_CONFIG_STATE", "getCLOUD_CONFIG_STATE", "setCLOUD_CONFIG_STATE", "CLOUD_CONFIG_STATE$delegate", "AUDIO_RECORD_NOTIFY", "getAUDIO_RECORD_NOTIFY", "setAUDIO_RECORD_NOTIFY", "AUDIO_RECORD_NOTIFY$delegate", "MINORS_NOTIFY", "getMINORS_NOTIFY", "setMINORS_NOTIFY", "MINORS_NOTIFY$delegate", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceSettingsPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceSettingsPreference.kt\ncom/xiaomi/fitness/devicesettings/utils/DeviceSettingsPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,164:1\n353#2:165\n211#2,7:166\n135#2,6:173\n135#2,6:179\n135#2,6:185\n211#2,7:191\n211#2,7:198\n135#2,6:205\n135#2,6:211\n135#2,6:217\n135#2,6:223\n135#2,6:229\n135#2,6:235\n135#2,6:241\n135#2,6:247\n135#2,6:253\n135#2,6:259\n135#2,6:265\n135#2,6:271\n135#2,6:277\n135#2,6:283\n135#2,6:289\n135#2,6:295\n*S KotlinDebug\n*F\n+ 1 DeviceSettingsPreference.kt\ncom/xiaomi/fitness/devicesettings/utils/DeviceSettingsPreference\n*L\n91#1:165\n19#1:166,7\n20#1:173,6\n21#1:179,6\n22#1:185,6\n23#1:191,7\n26#1:198,7\n28#1:205,6\n29#1:211,6\n30#1:217,6\n31#1:223,6\n32#1:229,6\n33#1:235,6\n35#1:241,6\n43#1:247,6\n56#1:253,6\n57#1:259,6\n59#1:265,6\n159#1:271,6\n160#1:277,6\n161#1:283,6\n162#1:289,6\n163#1:295,6\n*E\n"})
public final class DeviceSettingsPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "DUMP_DEVICE_LOG", "getDUMP_DEVICE_LOG()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "SYNC_SCHEDULE", "getSYNC_SCHEDULE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "SYNC_SLEEP_SCHEDULE", "getSYNC_SLEEP_SCHEDULE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "KEY_VIBRATE_MODE", "getKEY_VIBRATE_MODE()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "HID_STATUS", "getHID_STATUS()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "VIBRATE_LIST", "getVIBRATE_LIST()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "KEY_VIBRATE_MODE_SELECT_NAME", "getKEY_VIBRATE_MODE_SELECT_NAME()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "KEY_VIBRATE_MODE_SELECT_ID", "getKEY_VIBRATE_MODE_SELECT_ID()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "KEY_SUPPORT_HUAMI_ALARM", "getKEY_SUPPORT_HUAMI_ALARM()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "KEY_IN_CALL_NOTIFY_CONFIG", "getKEY_IN_CALL_NOTIFY_CONFIG()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "KEY_GOAL_REMIND_ENABLE", "getKEY_GOAL_REMIND_ENABLE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "KEY_SYNC_MIUI_ALARM", "getKEY_SYNC_MIUI_ALARM()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "hasShowPushMusicDialog", "getHasShowPushMusicDialog()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "DEVICE_MICR_PHONE_STATE_CHANGE_MODE", "getDEVICE_MICR_PHONE_STATE_CHANGE_MODE()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "DEVICE_SETTINGS_ECG_MEASURE_REMIND", "getDEVICE_SETTINGS_ECG_MEASURE_REMIND()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "DEVICE_SETTINGS_BLOOD_PRESSURE_MEASURE_REMIND", "getDEVICE_SETTINGS_BLOOD_PRESSURE_MEASURE_REMIND()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "DEVICE_SETTINGS_SHOW_VIBRATE_GUIDE", "getDEVICE_SETTINGS_SHOW_VIBRATE_GUIDE()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "DIALOG_SHOW_TIME", "getDIALOG_SHOW_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "CLOUD_CONFIG_INVITE_REVIEW_SWITCH", "getCLOUD_CONFIG_INVITE_REVIEW_SWITCH()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "CLOUD_CONFIG_STATE", "getCLOUD_CONFIG_STATE()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "AUDIO_RECORD_NOTIFY", "getAUDIO_RECORD_NOTIFY()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceSettingsPreference.class, "MINORS_NOTIFY", "getMINORS_NOTIFY()Z", 0))};

    /* JADX INFO: renamed from: AUDIO_RECORD_NOTIFY$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty AUDIO_RECORD_NOTIFY;

    /* JADX INFO: renamed from: CLOUD_CONFIG_INVITE_REVIEW_SWITCH$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CLOUD_CONFIG_INVITE_REVIEW_SWITCH;

    /* JADX INFO: renamed from: CLOUD_CONFIG_STATE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty CLOUD_CONFIG_STATE;

    /* JADX INFO: renamed from: DEVICE_MICR_PHONE_STATE_CHANGE_MODE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DEVICE_MICR_PHONE_STATE_CHANGE_MODE;

    /* JADX INFO: renamed from: DEVICE_SETTINGS_BLOOD_PRESSURE_MEASURE_REMIND$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DEVICE_SETTINGS_BLOOD_PRESSURE_MEASURE_REMIND;

    /* JADX INFO: renamed from: DEVICE_SETTINGS_ECG_MEASURE_REMIND$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DEVICE_SETTINGS_ECG_MEASURE_REMIND;

    /* JADX INFO: renamed from: DEVICE_SETTINGS_SHOW_VIBRATE_GUIDE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DEVICE_SETTINGS_SHOW_VIBRATE_GUIDE;

    /* JADX INFO: renamed from: DIALOG_SHOW_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DIALOG_SHOW_TIME;

    /* JADX INFO: renamed from: DUMP_DEVICE_LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty DUMP_DEVICE_LOG;

    /* JADX INFO: renamed from: HID_STATUS$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty HID_STATUS;

    @NotNull
    public static final DeviceSettingsPreference INSTANCE;

    @NotNull
    private static final String KEY_DISABLE_MIUI_SOS_CONTACTS = "disable_miui_sos_contacts";

    /* JADX INFO: renamed from: KEY_GOAL_REMIND_ENABLE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_GOAL_REMIND_ENABLE;

    /* JADX INFO: renamed from: KEY_IN_CALL_NOTIFY_CONFIG$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_IN_CALL_NOTIFY_CONFIG;

    @NotNull
    private static final String KEY_L66_SUPPORT_NIGHT_MODE = "l66_support_night_mode";

    /* JADX INFO: renamed from: KEY_SUPPORT_HUAMI_ALARM$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_SUPPORT_HUAMI_ALARM;

    /* JADX INFO: renamed from: KEY_SYNC_MIUI_ALARM$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_SYNC_MIUI_ALARM;

    @NotNull
    private static final String KEY_SYNC_MIUI_SOS_CONTACTS = "sync_miui_sos_contacts";

    @NotNull
    private static final String KEY_SYNC_MIUI_TODO = "sync_miui_todo";

    @NotNull
    private static final String KEY_SYNC_SCHEDULE = "should_sync_schedule";

    /* JADX INFO: renamed from: KEY_VIBRATE_MODE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_VIBRATE_MODE;

    /* JADX INFO: renamed from: KEY_VIBRATE_MODE_SELECT_ID$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_VIBRATE_MODE_SELECT_ID;

    /* JADX INFO: renamed from: KEY_VIBRATE_MODE_SELECT_NAME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_VIBRATE_MODE_SELECT_NAME;

    /* JADX INFO: renamed from: MINORS_NOTIFY$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty MINORS_NOTIFY;

    /* JADX INFO: renamed from: SYNC_SCHEDULE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SYNC_SCHEDULE;

    /* JADX INFO: renamed from: SYNC_SLEEP_SCHEDULE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SYNC_SLEEP_SCHEDULE;

    @NotNull
    private static final String TAG = "DeviceSettingsPreference";

    /* JADX INFO: renamed from: VIBRATE_LIST$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty VIBRATE_LIST;

    /* JADX INFO: renamed from: hasShowPushMusicDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty hasShowPushMusicDialog;

    @NotNull
    public static final String sKeyZenMode = "sKeyZenMode";

    @NotNull
    public static final String sOldHrHighWaring = "key_warning_supposed";

    static {
        DeviceSettingsPreference deviceSettingsPreference = new DeviceSettingsPreference();
        INSTANCE = deviceSettingsPreference;
        Boolean bool = Boolean.FALSE;
        DUMP_DEVICE_LOG = deviceSettingsPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindAndMigratePrefer$default$1
        }.getType(), bool, null, "app_pref", "key_dump_device_log");
        SYNC_SCHEDULE = deviceSettingsPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), bool, null, false);
        SYNC_SLEEP_SCHEDULE = deviceSettingsPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), bool, null, false);
        KEY_VIBRATE_MODE = deviceSettingsPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), "", null, false);
        HID_STATUS = deviceSettingsPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindAndMigratePrefer$default$2
        }.getType(), bool, null, "app_pref", "hid_status");
        VIBRATE_LIST = deviceSettingsPreference.bindAndMigratePrefer(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindAndMigratePrefer$default$3
        }.getType(), "", null, "app_pref", deviceSettingsPreference.getKEY_VIBRATE_MODE() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
        KEY_VIBRATE_MODE_SELECT_NAME = deviceSettingsPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), "", null, false);
        KEY_VIBRATE_MODE_SELECT_ID = deviceSettingsPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindToPreferenceField$default$5
        }.getType(), "", null, false);
        KEY_SUPPORT_HUAMI_ALARM = deviceSettingsPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindToPreferenceField$default$6
        }.getType(), bool, null, false);
        KEY_IN_CALL_NOTIFY_CONFIG = deviceSettingsPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindToPreferenceField$default$7
        }.getType(), "", null, false);
        KEY_GOAL_REMIND_ENABLE = deviceSettingsPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindToPreferenceField$default$8
        }.getType(), bool, null, false);
        Boolean bool2 = Boolean.TRUE;
        KEY_SYNC_MIUI_ALARM = deviceSettingsPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindToPreferenceField$default$9
        }.getType(), bool2, null, false);
        hasShowPushMusicDialog = deviceSettingsPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindToPreferenceField$default$10
        }.getType(), bool, null, false);
        DEVICE_MICR_PHONE_STATE_CHANGE_MODE = deviceSettingsPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindToPreferenceField$default$11
        }.getType(), 0, null, false);
        DEVICE_SETTINGS_ECG_MEASURE_REMIND = deviceSettingsPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindToPreferenceField$default$12
        }.getType(), "", null, false);
        DEVICE_SETTINGS_BLOOD_PRESSURE_MEASURE_REMIND = deviceSettingsPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindToPreferenceField$default$13
        }.getType(), "", null, false);
        DEVICE_SETTINGS_SHOW_VIBRATE_GUIDE = deviceSettingsPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindToPreferenceField$default$14
        }.getType(), bool2, null, false);
        DIALOG_SHOW_TIME = deviceSettingsPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindToPreferenceField$default$15
        }.getType(), 0L, null, true);
        CLOUD_CONFIG_INVITE_REVIEW_SWITCH = deviceSettingsPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindToPreferenceField$default$16
        }.getType(), bool, null, true);
        CLOUD_CONFIG_STATE = deviceSettingsPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindToPreferenceField$default$17
        }.getType(), 0, null, true);
        AUDIO_RECORD_NOTIFY = deviceSettingsPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindToPreferenceField$default$18
        }.getType(), bool, null, true);
        MINORS_NOTIFY = deviceSettingsPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference$special$$inlined$bindToPreferenceField$default$19
        }.getType(), bool, null, true);
    }

    private DeviceSettingsPreference() {
    }

    private final String getSuffixTag(String did) {
        return "-" + did;
    }

    public final boolean getAUDIO_RECORD_NOTIFY() {
        return ((Boolean) AUDIO_RECORD_NOTIFY.getValue(this, $$delegatedProperties[20])).booleanValue();
    }

    public final boolean getAgreeSyncMIUISosContacts(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        boolean zBooleanValue = ((Boolean) getValue(KEY_SYNC_MIUI_SOS_CONTACTS + did, Boolean.FALSE)).booleanValue();
        Logger.i("getAgreeSyncMIUISosContacts: " + zBooleanValue, new Object[0]);
        return zBooleanValue;
    }

    public final boolean getCLOUD_CONFIG_INVITE_REVIEW_SWITCH() {
        return ((Boolean) CLOUD_CONFIG_INVITE_REVIEW_SWITCH.getValue(this, $$delegatedProperties[18])).booleanValue();
    }

    public final int getCLOUD_CONFIG_STATE() {
        return ((Number) CLOUD_CONFIG_STATE.getValue(this, $$delegatedProperties[19])).intValue();
    }

    public final int getDEVICE_MICR_PHONE_STATE_CHANGE_MODE() {
        return ((Number) DEVICE_MICR_PHONE_STATE_CHANGE_MODE.getValue(this, $$delegatedProperties[13])).intValue();
    }

    @NotNull
    public final String getDEVICE_SETTINGS_BLOOD_PRESSURE_MEASURE_REMIND() {
        return (String) DEVICE_SETTINGS_BLOOD_PRESSURE_MEASURE_REMIND.getValue(this, $$delegatedProperties[15]);
    }

    @NotNull
    public final String getDEVICE_SETTINGS_ECG_MEASURE_REMIND() {
        return (String) DEVICE_SETTINGS_ECG_MEASURE_REMIND.getValue(this, $$delegatedProperties[14]);
    }

    public final boolean getDEVICE_SETTINGS_SHOW_VIBRATE_GUIDE() {
        return ((Boolean) DEVICE_SETTINGS_SHOW_VIBRATE_GUIDE.getValue(this, $$delegatedProperties[16])).booleanValue();
    }

    public final long getDIALOG_SHOW_TIME() {
        return ((Number) DIALOG_SHOW_TIME.getValue(this, $$delegatedProperties[17])).longValue();
    }

    public final boolean getDUMP_DEVICE_LOG() {
        return ((Boolean) DUMP_DEVICE_LOG.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final boolean getDisableSyncMIUISosContacts(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return ((Boolean) getValue(KEY_DISABLE_MIUI_SOS_CONTACTS + did, Boolean.FALSE)).booleanValue();
    }

    public final boolean getHID_STATUS() {
        return ((Boolean) HID_STATUS.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    public final boolean getHasShowPushMusicDialog() {
        return ((Boolean) hasShowPushMusicDialog.getValue(this, $$delegatedProperties[12])).booleanValue();
    }

    public final boolean getHuamiSynced(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return ((Boolean) getValue(getHumaiSyncedKey(did), Boolean.FALSE)).booleanValue();
    }

    @NotNull
    public final String getHumaiSyncedKey(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return "huami_synced_" + did;
    }

    public final boolean getKEY_GOAL_REMIND_ENABLE() {
        return ((Boolean) KEY_GOAL_REMIND_ENABLE.getValue(this, $$delegatedProperties[10])).booleanValue();
    }

    @NotNull
    public final String getKEY_IN_CALL_NOTIFY_CONFIG() {
        return (String) KEY_IN_CALL_NOTIFY_CONFIG.getValue(this, $$delegatedProperties[9]);
    }

    public final boolean getKEY_SUPPORT_HUAMI_ALARM() {
        return ((Boolean) KEY_SUPPORT_HUAMI_ALARM.getValue(this, $$delegatedProperties[8])).booleanValue();
    }

    public final boolean getKEY_SYNC_MIUI_ALARM() {
        return ((Boolean) KEY_SYNC_MIUI_ALARM.getValue(this, $$delegatedProperties[11])).booleanValue();
    }

    @NotNull
    public final String getKEY_VIBRATE_MODE() {
        return (String) KEY_VIBRATE_MODE.getValue(this, $$delegatedProperties[3]);
    }

    @NotNull
    public final String getKEY_VIBRATE_MODE_SELECT_ID() {
        return (String) KEY_VIBRATE_MODE_SELECT_ID.getValue(this, $$delegatedProperties[7]);
    }

    @NotNull
    public final String getKEY_VIBRATE_MODE_SELECT_NAME() {
        return (String) KEY_VIBRATE_MODE_SELECT_NAME.getValue(this, $$delegatedProperties[6]);
    }

    public final int getL66SupportNightMode(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return ((Number) getValue(KEY_L66_SUPPORT_NIGHT_MODE + did, 0)).intValue();
    }

    public final boolean getLimitBindStatus(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return ((Boolean) getAndMigrateValue(Reflection.getOrCreateKotlinClass(Boolean.class), "key_limit_bind_status_" + did, Boolean.FALSE, getSpName(), getSpName(did), "limit_bind")).booleanValue();
    }

    public final boolean getMINORS_NOTIFY() {
        return ((Boolean) MINORS_NOTIFY.getValue(this, $$delegatedProperties[21])).booleanValue();
    }

    @NotNull
    public final <T> T getNonNulValue(@NotNull String key, @NotNull T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(t, "default");
        T t2 = (T) getValue(key, t);
        return t2 == null ? t : t2;
    }

    public final boolean getSYNC_SCHEDULE() {
        return ((Boolean) SYNC_SCHEDULE.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final boolean getSYNC_SLEEP_SCHEDULE() {
        return ((Boolean) SYNC_SLEEP_SCHEDULE.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "device_settings";
    }

    @Nullable
    public final Integer getSummaryProgress(long time) {
        return (Integer) getValue(String.valueOf(time), 0);
    }

    public final boolean getSyncMiuiTodoSwitchStatus(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        String str = "sync_miui_todo_" + did;
        boolean zBooleanValue = ((Boolean) getValue(str, Boolean.TRUE)).booleanValue();
        Logger.i(TAG, "getSyncMiuiTodoStatus " + str + " " + zBooleanValue);
        return zBooleanValue;
    }

    @NotNull
    public final String getVIBRATE_LIST() {
        return (String) VIBRATE_LIST.getValue(this, $$delegatedProperties[5]);
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    /* JADX INFO: renamed from: isMultipleProcessListener */
    public boolean getIsMultipleProcessListener() {
        return true;
    }

    public final boolean isNeedSyncSchedule() {
        return ((Boolean) getValue(KEY_SYNC_SCHEDULE, Boolean.FALSE)).booleanValue();
    }

    public final void isZenModeOpen(@NotNull String did, boolean isOpen) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue("sKeyZenMode_" + did, Boolean.valueOf(isOpen));
    }

    public final void setAUDIO_RECORD_NOTIFY(boolean z) {
        AUDIO_RECORD_NOTIFY.setValue(this, $$delegatedProperties[20], Boolean.valueOf(z));
    }

    public final void setAgreeSyncMIUISosContacts(@NotNull String did, boolean agree) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(KEY_SYNC_MIUI_SOS_CONTACTS + did, Boolean.valueOf(agree));
    }

    public final void setCLOUD_CONFIG_INVITE_REVIEW_SWITCH(boolean z) {
        CLOUD_CONFIG_INVITE_REVIEW_SWITCH.setValue(this, $$delegatedProperties[18], Boolean.valueOf(z));
    }

    public final void setCLOUD_CONFIG_STATE(int i) {
        CLOUD_CONFIG_STATE.setValue(this, $$delegatedProperties[19], Integer.valueOf(i));
    }

    public final void setDEVICE_MICR_PHONE_STATE_CHANGE_MODE(int i) {
        DEVICE_MICR_PHONE_STATE_CHANGE_MODE.setValue(this, $$delegatedProperties[13], Integer.valueOf(i));
    }

    public final void setDEVICE_SETTINGS_BLOOD_PRESSURE_MEASURE_REMIND(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        DEVICE_SETTINGS_BLOOD_PRESSURE_MEASURE_REMIND.setValue(this, $$delegatedProperties[15], str);
    }

    public final void setDEVICE_SETTINGS_ECG_MEASURE_REMIND(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        DEVICE_SETTINGS_ECG_MEASURE_REMIND.setValue(this, $$delegatedProperties[14], str);
    }

    public final void setDEVICE_SETTINGS_SHOW_VIBRATE_GUIDE(boolean z) {
        DEVICE_SETTINGS_SHOW_VIBRATE_GUIDE.setValue(this, $$delegatedProperties[16], Boolean.valueOf(z));
    }

    public final void setDIALOG_SHOW_TIME(long j) {
        DIALOG_SHOW_TIME.setValue(this, $$delegatedProperties[17], Long.valueOf(j));
    }

    public final void setDUMP_DEVICE_LOG(boolean z) {
        DUMP_DEVICE_LOG.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setDisableSyncMIUISosContacts(@NotNull String did, boolean agree) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(KEY_DISABLE_MIUI_SOS_CONTACTS + did, Boolean.valueOf(agree));
    }

    public final void setHID_STATUS(boolean z) {
        HID_STATUS.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    public final void setHasShowPushMusicDialog(boolean z) {
        hasShowPushMusicDialog.setValue(this, $$delegatedProperties[12], Boolean.valueOf(z));
    }

    public final void setHuamiSynced(@NotNull String did, boolean synced) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i("DeviceSetting", "setHuamiSynced did:" + did + " synced:" + synced);
        putValue(getHumaiSyncedKey(did), Boolean.valueOf(synced));
    }

    public final void setKEY_GOAL_REMIND_ENABLE(boolean z) {
        KEY_GOAL_REMIND_ENABLE.setValue(this, $$delegatedProperties[10], Boolean.valueOf(z));
    }

    public final void setKEY_IN_CALL_NOTIFY_CONFIG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_IN_CALL_NOTIFY_CONFIG.setValue(this, $$delegatedProperties[9], str);
    }

    public final void setKEY_SUPPORT_HUAMI_ALARM(boolean z) {
        KEY_SUPPORT_HUAMI_ALARM.setValue(this, $$delegatedProperties[8], Boolean.valueOf(z));
    }

    public final void setKEY_SYNC_MIUI_ALARM(boolean z) {
        KEY_SYNC_MIUI_ALARM.setValue(this, $$delegatedProperties[11], Boolean.valueOf(z));
    }

    public final void setKEY_VIBRATE_MODE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_VIBRATE_MODE.setValue(this, $$delegatedProperties[3], str);
    }

    public final void setKEY_VIBRATE_MODE_SELECT_ID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_VIBRATE_MODE_SELECT_ID.setValue(this, $$delegatedProperties[7], str);
    }

    public final void setKEY_VIBRATE_MODE_SELECT_NAME(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        KEY_VIBRATE_MODE_SELECT_NAME.setValue(this, $$delegatedProperties[6], str);
    }

    public final void setL66SupportNightMode(@NotNull String did, int status) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(KEY_L66_SUPPORT_NIGHT_MODE + did, Integer.valueOf(status));
    }

    public final void setLimitBindStatus(@NotNull String did, boolean limitBind) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue(getSpName(), "key_limit_bind_status_" + did, Boolean.valueOf(limitBind));
    }

    public final void setMINORS_NOTIFY(boolean z) {
        MINORS_NOTIFY.setValue(this, $$delegatedProperties[21], Boolean.valueOf(z));
    }

    public final void setNeedSyncSchedule(boolean isNeedSync) {
        putValue(KEY_SYNC_SCHEDULE, Boolean.valueOf(isNeedSync));
    }

    public final void setSYNC_SCHEDULE(boolean z) {
        SYNC_SCHEDULE.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setSYNC_SLEEP_SCHEDULE(boolean z) {
        SYNC_SLEEP_SCHEDULE.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    public final void setSummaryProgress(@Nullable Long time, int progress) {
        if (time != null) {
            putValue(String.valueOf(time), Integer.valueOf(progress));
        }
    }

    public final void setSyncMiuiTodoSwitchStatus(@NotNull String did, boolean isOpen) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(TAG, "setSyncMiuiTodoStatus " + did + " " + isOpen);
        StringBuilder sb = new StringBuilder();
        sb.append("sync_miui_todo_");
        sb.append(did);
        putValue(sb.toString(), Boolean.valueOf(isOpen));
    }

    public final void setVIBRATE_LIST(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        VIBRATE_LIST.setValue(this, $$delegatedProperties[5], str);
    }

    private final String getSpName(String did) {
        return AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + did.hashCode();
    }

    public final boolean isZenModeOpen(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return ((Boolean) getValue("sKeyZenMode_" + did, Boolean.FALSE)).booleanValue();
    }
}
