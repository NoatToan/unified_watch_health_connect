package com.xiaomi.fitness.nfc.sp;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010<\u001a\u00020-H\u0007J\u0010\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u0005H\u0007J\u0018\u0010?\u001a\u00020@2\u0006\u0010>\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u0015H\u0007J\u0010\u0010B\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u0005H\u0007J\u0018\u0010C\u001a\u00020@2\u0006\u0010>\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u0015H\u0007J\u0018\u0010E\u001a\u00020@2\u0006\u0010>\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u0005H\u0007J\u0012\u0010G\u001a\u0004\u0018\u00010\u00052\u0006\u0010>\u001a\u00020\u0005H\u0007J\u0010\u0010H\u001a\u00020@2\u0006\u0010>\u001a\u00020\u0005H\u0007J\n\u0010I\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010J\u001a\u00020@2\u0006\u0010K\u001a\u00020\u0005H\u0007J\n\u0010L\u001a\u0004\u0018\u00010\u0005H\u0007J\u0018\u0010M\u001a\u00020@2\u0006\u0010N\u001a\u00020\u00052\u0006\u0010O\u001a\u00020\u0005H\u0007J\u0012\u0010P\u001a\u0004\u0018\u00010\u00052\u0006\u0010N\u001a\u00020\u0005H\u0007J\u0018\u0010Q\u001a\u00020@2\u0006\u0010N\u001a\u00020\u00052\u0006\u0010O\u001a\u00020\u0015H\u0007J\u0018\u0010R\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u0015H\u0007J\u0010\u0010T\u001a\u00020@2\u0006\u0010O\u001a\u00020-H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR+\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0012R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R+\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0014\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R+\u0010#\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0014\u001a\u0004\b#\u0010\u0017\"\u0004\b$\u0010\u0019R+\u0010'\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020&8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0014\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u0010.\u001a\u00020-2\u0006\u0010\u000e\u001a\u00020-8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u0014\u001a\u0004\b/\u00100\"\u0004\b1\u00102R+\u00104\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010\u0014\u001a\u0004\b5\u0010\r\"\u0004\b6\u0010\u0012R+\u00108\u001a\u00020-2\u0006\u0010\u000e\u001a\u00020-8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010\u0014\u001a\u0004\b9\u00100\"\u0004\b:\u00102¨\u0006U"}, d2 = {"Lcom/xiaomi/fitness/nfc/sp/NfcPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "sIsCheckPreAccountData", "", NfcPreference.sSupportMasterRegins, "mRequestOTPLimitMethod", "sKeyMailboxId", NfcPreference.sKeyCarDeviceId, NfcPreference.sKeyCarDeviceName, "spName", "getSpName", "()Ljava/lang/String;", "<set-?>", "supportMasterRegins", "getSupportMasterRegins", "setSupportMasterRegins", "(Ljava/lang/String;)V", "supportMasterRegins$delegate", "Lkotlin/properties/ReadWriteProperty;", "", "isCheckUserBind", "()Z", "setCheckUserBind", "(Z)V", "isCheckUserBind$delegate", "KEY_NFC_CARD_MANAGER_POLICY", "getKEY_NFC_CARD_MANAGER_POLICY", "setKEY_NFC_CARD_MANAGER_POLICY", "KEY_NFC_CARD_MANAGER_POLICY$delegate", "carCardProtocol", "getCarCardProtocol", "setCarCardProtocol", "carCardProtocol$delegate", "isShowedOpenDoorBackUp", "setShowedOpenDoorBackUp", "isShowedOpenDoorBackUp$delegate", "", "KEY_NFC_CARD_VISA_UPDATE_REMIND_TIME", "getKEY_NFC_CARD_VISA_UPDATE_REMIND_TIME", "()J", "setKEY_NFC_CARD_VISA_UPDATE_REMIND_TIME", "(J)V", "KEY_NFC_CARD_VISA_UPDATE_REMIND_TIME$delegate", "", "KEY_NFC_CARD_VISA_UPDATE_REMIND_TIMES", "getKEY_NFC_CARD_VISA_UPDATE_REMIND_TIMES", "()I", "setKEY_NFC_CARD_VISA_UPDATE_REMIND_TIMES", "(I)V", "KEY_NFC_CARD_VISA_UPDATE_REMIND_TIMES$delegate", "requestOTPLimitMethod", "getRequestOTPLimitMethod", "setRequestOTPLimitMethod", "requestOTPLimitMethod$delegate", "env", "getEnv", "setEnv", "env$delegate", "getEnvr", "isInitSync", "did", "setInitSync", "", "isSynced", "isNeedYoYoCardFirstSync", "setNeedYoYoCardFirstSync", "isNeedSynced", "setCarMailboxId", "mailboxID", "getCarMailboxId", "setCarDeviceId", "getCarDeviceId", "setCarDeviceName", "deviceName", "getCarDeviceName", "putString", "key", "value", "getString", "putBoolean", "getBoolean", "default", "setEnvCommit", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNfcPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NfcPreference.kt\ncom/xiaomi/fitness/nfc/sp/NfcPreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,122:1\n140#2:123\n135#2,6:124\n140#2:130\n140#2:131\n140#2:132\n140#2:133\n140#2:134\n140#2:135\n140#2:136\n*S KotlinDebug\n*F\n+ 1 NfcPreference.kt\ncom/xiaomi/fitness/nfc/sp/NfcPreference\n*L\n21#1:123\n23#1:124,6\n28#1:130\n30#1:131\n32#1:132\n34#1:133\n35#1:134\n40#1:135\n41#1:136\n*E\n"})
public final class NfcPreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(NfcPreference.class, "supportMasterRegins", "getSupportMasterRegins()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(NfcPreference.class, "isCheckUserBind", "isCheckUserBind()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(NfcPreference.class, "KEY_NFC_CARD_MANAGER_POLICY", "getKEY_NFC_CARD_MANAGER_POLICY()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(NfcPreference.class, "carCardProtocol", "getCarCardProtocol()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(NfcPreference.class, "isShowedOpenDoorBackUp", "isShowedOpenDoorBackUp()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(NfcPreference.class, "KEY_NFC_CARD_VISA_UPDATE_REMIND_TIME", "getKEY_NFC_CARD_VISA_UPDATE_REMIND_TIME()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(NfcPreference.class, "KEY_NFC_CARD_VISA_UPDATE_REMIND_TIMES", "getKEY_NFC_CARD_VISA_UPDATE_REMIND_TIMES()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(NfcPreference.class, "requestOTPLimitMethod", "getRequestOTPLimitMethod()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(NfcPreference.class, "env", "getEnv()I", 0))};

    @NotNull
    public static final NfcPreference INSTANCE;

    /* JADX INFO: renamed from: KEY_NFC_CARD_MANAGER_POLICY$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_NFC_CARD_MANAGER_POLICY;

    /* JADX INFO: renamed from: KEY_NFC_CARD_VISA_UPDATE_REMIND_TIME$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_NFC_CARD_VISA_UPDATE_REMIND_TIME;

    /* JADX INFO: renamed from: KEY_NFC_CARD_VISA_UPDATE_REMIND_TIMES$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_NFC_CARD_VISA_UPDATE_REMIND_TIMES;

    /* JADX INFO: renamed from: carCardProtocol$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty carCardProtocol;

    /* JADX INFO: renamed from: env$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty env;

    /* JADX INFO: renamed from: isCheckUserBind$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty isCheckUserBind;

    /* JADX INFO: renamed from: isShowedOpenDoorBackUp$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty isShowedOpenDoorBackUp;

    @NotNull
    public static final String mRequestOTPLimitMethod = "key_nfc_request_otp_limit";

    /* JADX INFO: renamed from: requestOTPLimitMethod$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty requestOTPLimitMethod;

    @NotNull
    public static final String sIsCheckPreAccountData = "key_is_nfc_mastercard_check_pre_account_data";

    @NotNull
    public static final String sKeyCarDeviceId = "sKeyCarDeviceId";

    @NotNull
    public static final String sKeyCarDeviceName = "sKeyCarDeviceName";

    @NotNull
    public static final String sKeyMailboxId = "sKeyMailboxId_";

    @NotNull
    public static final String sSupportMasterRegins = "sSupportMasterRegins";

    /* JADX INFO: renamed from: supportMasterRegins$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty supportMasterRegins;

    static {
        NfcPreference nfcPreference = new NfcPreference();
        INSTANCE = nfcPreference;
        supportMasterRegins = nfcPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.nfc.sp.NfcPreference$special$$inlined$bindToPreferenceField$1
        }.getType(), "", sSupportMasterRegins, true);
        Boolean bool = Boolean.FALSE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        isCheckUserBind = nfcPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.nfc.sp.NfcPreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), bool, "key_is_nfc_mastercard_check_pre_account_data_" + (wearableDeviceModel != null ? wearableDeviceModel.getDid() : null), true);
        KEY_NFC_CARD_MANAGER_POLICY = nfcPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.nfc.sp.NfcPreference$special$$inlined$bindToPreferenceField$2
        }.getType(), bool, null, true);
        carCardProtocol = nfcPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.nfc.sp.NfcPreference$special$$inlined$bindToPreferenceField$3
        }.getType(), bool, null, true);
        isShowedOpenDoorBackUp = nfcPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.nfc.sp.NfcPreference$special$$inlined$bindToPreferenceField$4
        }.getType(), bool, null, true);
        KEY_NFC_CARD_VISA_UPDATE_REMIND_TIME = nfcPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Long.class), new TypeToken<Long>() { // from class: com.xiaomi.fitness.nfc.sp.NfcPreference$special$$inlined$bindToPreferenceField$5
        }.getType(), 0L, null, true);
        KEY_NFC_CARD_VISA_UPDATE_REMIND_TIMES = nfcPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.nfc.sp.NfcPreference$special$$inlined$bindToPreferenceField$6
        }.getType(), 0, null, true);
        requestOTPLimitMethod = nfcPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.nfc.sp.NfcPreference$special$$inlined$bindToPreferenceField$7
        }.getType(), "", mRequestOTPLimitMethod, true);
        env = nfcPreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.nfc.sp.NfcPreference$special$$inlined$bindToPreferenceField$8
        }.getType(), 2, "staging_index", true);
    }

    private NfcPreference() {
    }

    @JvmStatic
    public static final boolean getBoolean(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        return INSTANCE.getPreferences().getBoolean(key, z);
    }

    @JvmStatic
    @Nullable
    public static final String getCarDeviceId() {
        return getString(sKeyCarDeviceId);
    }

    @JvmStatic
    @Nullable
    public static final String getCarDeviceName() {
        return getString(sKeyCarDeviceName);
    }

    @JvmStatic
    @Nullable
    public static final String getCarMailboxId(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return getString(sKeyMailboxId + did);
    }

    private final int getEnv() {
        return ((Number) env.getValue(this, $$delegatedProperties[8])).intValue();
    }

    @JvmStatic
    public static final int getEnvr() {
        return INSTANCE.getEnv();
    }

    @JvmStatic
    @Nullable
    public static final String getString(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return INSTANCE.getPreferences().getString(key, null);
    }

    @JvmStatic
    public static final boolean isInitSync(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return ((Boolean) INSTANCE.getValue("key_is_nfc_card_list_loaded_" + did, Boolean.FALSE)).booleanValue();
    }

    @JvmStatic
    public static final boolean isNeedYoYoCardFirstSync(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return ((Boolean) INSTANCE.getValue("is_need_sync_yoyocard_" + did, Boolean.TRUE)).booleanValue();
    }

    @JvmStatic
    public static final void putBoolean(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        INSTANCE.getPreferences().edit().putBoolean(key, value).apply();
    }

    @JvmStatic
    public static final void putString(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        INSTANCE.getPreferences().edit().putString(key, value).apply();
    }

    @JvmStatic
    public static final void setCarDeviceId(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        putString(sKeyCarDeviceId, did);
    }

    @JvmStatic
    public static final void setCarDeviceName(@NotNull String deviceName) {
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        putString(sKeyCarDeviceName, deviceName);
    }

    @JvmStatic
    public static final void setCarMailboxId(@NotNull String did, @NotNull String mailboxID) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mailboxID, "mailboxID");
        putString(sKeyMailboxId + did, mailboxID);
    }

    private final void setEnv(int i) {
        env.setValue(this, $$delegatedProperties[8], Integer.valueOf(i));
    }

    @JvmStatic
    public static final void setEnvCommit(int value) {
        INSTANCE.setEnv(value);
    }

    @JvmStatic
    public static final void setInitSync(@NotNull String did, boolean isSynced) {
        Intrinsics.checkNotNullParameter(did, "did");
        INSTANCE.putValue("key_is_nfc_card_list_loaded_" + did, Boolean.valueOf(isSynced));
    }

    @JvmStatic
    public static final void setNeedYoYoCardFirstSync(@NotNull String did, boolean isNeedSynced) {
        Intrinsics.checkNotNullParameter(did, "did");
        INSTANCE.putValue("is_need_sync_yoyocard_" + did, Boolean.valueOf(isNeedSynced));
    }

    public final boolean getCarCardProtocol() {
        return ((Boolean) carCardProtocol.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    public final boolean getKEY_NFC_CARD_MANAGER_POLICY() {
        return ((Boolean) KEY_NFC_CARD_MANAGER_POLICY.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public final long getKEY_NFC_CARD_VISA_UPDATE_REMIND_TIME() {
        return ((Number) KEY_NFC_CARD_VISA_UPDATE_REMIND_TIME.getValue(this, $$delegatedProperties[5])).longValue();
    }

    public final int getKEY_NFC_CARD_VISA_UPDATE_REMIND_TIMES() {
        return ((Number) KEY_NFC_CARD_VISA_UPDATE_REMIND_TIMES.getValue(this, $$delegatedProperties[6])).intValue();
    }

    @NotNull
    public final String getRequestOTPLimitMethod() {
        return (String) requestOTPLimitMethod.getValue(this, $$delegatedProperties[7]);
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_pref_nfc";
    }

    @NotNull
    public final String getSupportMasterRegins() {
        return (String) supportMasterRegins.getValue(this, $$delegatedProperties[0]);
    }

    public final boolean isCheckUserBind() {
        return ((Boolean) isCheckUserBind.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final boolean isShowedOpenDoorBackUp() {
        return ((Boolean) isShowedOpenDoorBackUp.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    public final void setCarCardProtocol(boolean z) {
        carCardProtocol.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    public final void setCheckUserBind(boolean z) {
        isCheckUserBind.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setKEY_NFC_CARD_MANAGER_POLICY(boolean z) {
        KEY_NFC_CARD_MANAGER_POLICY.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    public final void setKEY_NFC_CARD_VISA_UPDATE_REMIND_TIME(long j) {
        KEY_NFC_CARD_VISA_UPDATE_REMIND_TIME.setValue(this, $$delegatedProperties[5], Long.valueOf(j));
    }

    public final void setKEY_NFC_CARD_VISA_UPDATE_REMIND_TIMES(int i) {
        KEY_NFC_CARD_VISA_UPDATE_REMIND_TIMES.setValue(this, $$delegatedProperties[6], Integer.valueOf(i));
    }

    public final void setRequestOTPLimitMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        requestOTPLimitMethod.setValue(this, $$delegatedProperties[7], str);
    }

    public final void setShowedOpenDoorBackUp(boolean z) {
        isShowedOpenDoorBackUp.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    public final void setSupportMasterRegins(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        supportMasterRegins.setValue(this, $$delegatedProperties[0], str);
    }
}
