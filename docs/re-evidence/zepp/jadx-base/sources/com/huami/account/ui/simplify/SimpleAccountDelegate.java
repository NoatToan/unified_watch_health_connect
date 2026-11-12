package com.huami.account.ui.simplify;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.huami.account.AccountExternalsKt;
import com.huami.account.AccountStatEvent;
import com.huami.account.HMLoginManager;
import com.huami.account.IAccountDelegate;
import com.huami.account.bean.LogoutSyncTask;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.ui.BindPhoneForRegisterActivity;
import com.huami.account.ui.simplify.external.DbHelper;
import com.huami.account.ui.simplify.external.WebHelper;
import com.huami.ad.AdRepository;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.HMProperty;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.webapi.account.model.HMBeanPersonInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bI\u0010JJ\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0016\u0010\u0010\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0016J \u0010\u0013\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J\b\u0010&\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020\u001aH\u0016J \u0010,\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0016J\u0014\u0010.\u001a\u0004\u0018\u00010\u00072\b\u0010-\u001a\u0004\u0018\u00010\u0007H\u0016J\u0014\u00102\u001a\u0004\u0018\u0001012\b\u00100\u001a\u0004\u0018\u00010/H\u0016J\u0018\u00106\u001a\u00020\u00052\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0007H\u0016J\n\u00107\u001a\u0004\u0018\u000103H\u0016J\b\u00108\u001a\u00020\u0005H\u0016J\u001e\u0010:\u001a\u0004\u0018\u00010\u00072\b\u0010-\u001a\u0004\u0018\u00010\u00072\b\u00109\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010;\u001a\u00020\u001aH\u0016J\u0010\u0010<\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010=\u001a\u00020\u0005H\u0016J \u0010?\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u0007H\u0016J\"\u0010@\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u0007H\u0016J\u0010\u0010B\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u001aH\u0016J$\u0010H\u001a\u00020\u00052\u0006\u0010D\u001a\u00020C2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020F0EH\u0016¨\u0006K"}, d2 = {"Lcom/huami/account/ui/simplify/SimpleAccountDelegate;", "Lcom/huami/account/IAccountDelegate;", "Landroid/content/Intent;", "from", "to", "", "a", "", "userSettingsPrefix", "Landroid/content/SharedPreferences;", "initAccountKeeper", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "goAccountMifit", "", "hosts", "onHttpDnsInit", AccountStatEvent.KEY_ACCOUNT_SIGN_THIRD_NAME, "huamiId", "initDB", "initData", "", "loginType", "Lcom/xiaomi/hm/health/webapi/account/model/HMBeanPersonInfo;", "personInfo", "afterLoginSuccess", "", "syncNeededUserData", "userId", "keepDataRemoveData", "unInitWhenLogout", "clearDataExternal", "goStartUpActivityLoginMi", "afterLogoutActions", "", "Lcom/huami/account/bean/LogoutSyncTask;", "externalSyncDataActionsWhenLogout", "forceLogoutAndClearAllData", "cleanApplicationData", "refreshMiTokenExternalConditions", "refreshToken", "accessToken", "", "expiresIn", "saveTokenToWatch", "deviceId", "getMiotDid", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getDevice", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_AUTH_KEY_NEW, "updateDeviceAuthKey", "getInvalidAuthKeyDeviceSource", "updateSpeechMiotToken", "miotDid", "getDefaultDeviceState", "getDeviceListFromServer", "syncUserSettings", "setActiveHistoryLogin", "eventKey", "skipToSetInfoPage", "goBindPhoneOrSetInfoPage", "isStaging", "updateCompanionHosts", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "info", "", "", "params", "interceptUpdateProfile", "<init>", "()V", "accountui-simplify_release"}, k = 1, mv = {1, 4, 1})
public abstract class SimpleAccountDelegate implements IAccountDelegate {
    private final void a(Intent from, Intent to) {
        Bundle extras;
        Uri data;
        if (from != null && (data = from.getData()) != null && to != null) {
            to.setData(data);
        }
        if (from == null || (extras = from.getExtras()) == null || to == null) {
            return;
        }
        to.putExtras(extras);
    }

    @Override // com.huami.account.IAccountDelegate
    public void afterLoginSuccess(int loginType, @NotNull HMBeanPersonInfo personInfo) {
    }

    @Override // com.huami.account.IAccountDelegate
    public void afterLogoutActions() {
    }

    @Override // com.huami.account.IAccountDelegate
    public void cleanApplicationData() {
    }

    @Override // com.huami.account.IAccountDelegate
    public void clearDataExternal() {
    }

    @Override // com.huami.account.IAccountDelegate
    @NotNull
    public List<LogoutSyncTask> externalSyncDataActionsWhenLogout() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.huami.account.IAccountDelegate
    public void forceLogoutAndClearAllData() {
    }

    @Override // com.huami.account.IAccountDelegate
    @Nullable
    public String getDefaultDeviceState(@Nullable String deviceId, @Nullable String miotDid) {
        return "";
    }

    @Nullable
    public HMBaseDevice getDevice(@Nullable HMDeviceType type) {
        return null;
    }

    @Override // com.huami.account.IAccountDelegate
    public boolean getDeviceListFromServer() {
        return true;
    }

    @Nullable
    public HMDeviceSource getInvalidAuthKeyDeviceSource() {
        return null;
    }

    @Override // com.huami.account.IAccountDelegate
    @Nullable
    public String getMiotDid(@Nullable String deviceId) {
        return "huami-" + deviceId;
    }

    @Override // com.huami.account.IAccountDelegate
    public void goAccountMifit(@NotNull Context context) {
        WebHelper.launch(HMServerDef.getUrl("t/account_mifit"));
    }

    public void goBindPhoneOrSetInfoPage(@NotNull Context context, @Nullable Intent from, @NotNull String eventKey) {
        if (HMAccountKeeper.INSTANCE.getAlreadyBindPhone() || !HMLoginManager.isInMainland()) {
            goMainTabPage(context);
            return;
        }
        Intent intent = new Intent();
        intent.setClass(context, BindPhoneForRegisterActivity.class);
        a(from, intent);
        context.startActivity(intent);
    }

    @Override // com.huami.account.IAccountDelegate
    public void goStartUpActivityLoginMi() {
        goStartUpActivityFromLogout();
    }

    @Override // com.huami.account.IAccountDelegate
    @NotNull
    public SharedPreferences initAccountKeeper() {
        return AccountExternalsKt.getAppContext().getSharedPreferences("account", 0);
    }

    @Override // com.huami.account.IAccountDelegate
    public void initDB(@NotNull Context context, @NotNull String thirdName, @NotNull String huamiId) {
        DbHelper.initDB(context, thirdName, huamiId);
    }

    @Override // com.huami.account.IAccountDelegate
    public void initData() {
    }

    @Override // com.huami.account.IAccountDelegate
    public void interceptUpdateProfile(@NotNull HMPersonInfo info, @NotNull Map<String, Object> params) {
    }

    @Override // com.huami.account.IAccountDelegate
    public boolean isChineseOnly() {
        return IAccountDelegate.DefaultImpls.isChineseOnly(this);
    }

    @Override // com.huami.account.IAccountDelegate
    public void keepDataRemoveData(@NotNull String userId) {
    }

    @Override // com.huami.account.IAccountDelegate
    public void onHttpDnsInit(@NotNull Set<String> hosts) {
        HMServerDef.setTestHost(HMAccountKeeper.INSTANCE.getTestUrl());
        hosts.add(AdRepository.HUAMI_PRODUCT_HOST);
    }

    @Override // com.huami.account.IAccountDelegate
    public boolean refreshMiTokenExternalConditions() {
        return false;
    }

    @Override // com.huami.account.IAccountDelegate
    public void saveTokenToWatch(@NotNull String refreshToken, @NotNull String accessToken, long expiresIn) {
    }

    @Override // com.huami.account.IAccountDelegate
    public void setActiveHistoryLogin() {
    }

    public void skipToSetInfoPage(@NotNull Context context, @NotNull Intent from, @NotNull String eventKey) {
        goMainTabPage(context);
    }

    @Override // com.huami.account.IAccountDelegate
    public boolean syncNeededUserData() {
        return true;
    }

    @Override // com.huami.account.IAccountDelegate
    public boolean syncUserSettings(@NotNull Context context) {
        return true;
    }

    @Override // com.huami.account.IAccountDelegate
    public void unInitWhenLogout() {
    }

    @Override // com.huami.account.IAccountDelegate
    public void updateCompanionHosts(boolean isStaging) {
    }

    public void updateDeviceAuthKey(@NotNull HMDeviceSource source, @NotNull String authKey) {
    }

    @Override // com.huami.account.IAccountDelegate
    public void updateSpeechMiotToken() {
    }

    @NotNull
    public String userSettingsPrefix() {
        return HMProperty.PROPERTY_GROUP_HUAMI_MIDONG_USER_SETTINGS;
    }
}
