package com.huami.account;

import android.content.Context;
import android.content.SharedPreferences;
import com.huami.account.bean.AuthDevice;
import com.huami.account.bean.AuthDeviceSource;
import com.huami.account.bean.LogoutSyncTask;
import com.huami.account.constants.LoginType;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.webapi.account.model.HMBeanPersonInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH&J\b\u0010\u000f\u001a\u00020\u0006H&J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u001a\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H&J\b\u0010\u0018\u001a\u00020\u0010H&J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\tH&J\b\u0010\u001b\u001a\u00020\u0006H&J\b\u0010\u001c\u001a\u00020\u0006H&J\b\u0010\u001d\u001a\u00020\u0006H&J\b\u0010\u001e\u001a\u00020\u0006H&J\b\u0010\u001f\u001a\u00020\u0006H&J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H&J\b\u0010#\u001a\u00020\u0006H&J\b\u0010$\u001a\u00020\u0006H&J\b\u0010%\u001a\u00020\u0010H&J \u0010*\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H&J\u0014\u0010,\u001a\u0004\u0018\u00010\t2\b\u0010+\u001a\u0004\u0018\u00010\tH&J\n\u0010.\u001a\u0004\u0018\u00010-H&J\u0018\u00101\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u00020\tH&J\b\u00103\u001a\u000202H&J\b\u00104\u001a\u00020\u0006H&J\u001e\u00106\u001a\u0004\u0018\u00010\t2\b\u0010+\u001a\u0004\u0018\u00010\t2\b\u00105\u001a\u0004\u0018\u00010\tH&J\b\u00107\u001a\u00020\u0010H&J\u0010\u00108\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u00109\u001a\u00020\u0006H&J\u0010\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0010H&J$\u0010@\u001a\u00020\u00062\u0006\u0010=\u001a\u00020<2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010>H&J\b\u0010A\u001a\u00020\u0010H\u0016J\b\u0010B\u001a\u00020\u0006H&¨\u0006C"}, d2 = {"Lcom/huami/account/IAccountDelegate;", "", "Landroid/content/SharedPreferences;", "initAccountKeeper", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "goAccountMifit", "", "", "hosts", "onHttpDnsInit", AccountStatEvent.KEY_ACCOUNT_SIGN_THIRD_NAME, "huamiId", "initDB", "initData", "", "isFromNewUser", "goMainTabPage", "", "loginType", "Lcom/xiaomi/hm/health/webapi/account/model/HMBeanPersonInfo;", "personInfo", "afterLoginSuccess", "syncNeededUserData", "userId", "keepDataRemoveData", "unInitWhenLogout", "clearDataExternal", "goStartUpActivityFromLogout", "goStartUpActivityLoginMi", "afterLogoutActions", "", "Lcom/huami/account/bean/LogoutSyncTask;", "externalSyncDataActionsWhenLogout", "forceLogoutAndClearAllData", "cleanApplicationData", "refreshMiTokenExternalConditions", "refreshToken", "accessToken", "", "expiresIn", "saveTokenToWatch", "deviceId", "getMiotDid", "Lcom/huami/account/bean/AuthDevice;", "getCurrentDevice", "source", HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_AUTH_KEY_NEW, "updateDeviceAuthKey", "Lcom/huami/account/bean/AuthDeviceSource;", "getInvalidAuthKeyDeviceSource", "updateSpeechMiotToken", "miotDid", "getDefaultDeviceState", "getDeviceListFromServer", "syncUserSettings", "setActiveHistoryLogin", "isStaging", "updateCompanionHosts", "Lcom/xiaomi/hm/health/model/account/HMPersonInfo;", "info", "", "params", "interceptUpdateProfile", "isChineseOnly", "processExitingUser", "accountui_release"}, k = 1, mv = {1, 5, 1})
public interface IAccountDelegate {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static boolean isChineseOnly(@NotNull IAccountDelegate iAccountDelegate) {
            return false;
        }
    }

    void afterLoginSuccess(@LoginType int loginType, @NotNull HMBeanPersonInfo personInfo);

    void afterLogoutActions();

    void cleanApplicationData();

    void clearDataExternal();

    @NotNull
    List<LogoutSyncTask> externalSyncDataActionsWhenLogout();

    void forceLogoutAndClearAllData();

    @Nullable
    AuthDevice getCurrentDevice();

    @Nullable
    String getDefaultDeviceState(@Nullable String deviceId, @Nullable String miotDid);

    boolean getDeviceListFromServer();

    @NotNull
    AuthDeviceSource getInvalidAuthKeyDeviceSource();

    @Nullable
    String getMiotDid(@Nullable String deviceId);

    void goAccountMifit(@NotNull Context context);

    void goMainTabPage(@NotNull Context context, boolean isFromNewUser);

    void goStartUpActivityFromLogout();

    void goStartUpActivityLoginMi();

    @NotNull
    SharedPreferences initAccountKeeper();

    void initDB(@NotNull Context context, @NotNull String thirdName, @NotNull String huamiId);

    void initData();

    void interceptUpdateProfile(@NotNull HMPersonInfo info, @NotNull Map<String, Object> params);

    boolean isChineseOnly();

    void keepDataRemoveData(@NotNull String userId);

    void onHttpDnsInit(@NotNull Set<String> hosts);

    void processExitingUser();

    boolean refreshMiTokenExternalConditions();

    void saveTokenToWatch(@NotNull String refreshToken, @NotNull String accessToken, long expiresIn);

    void setActiveHistoryLogin();

    boolean syncNeededUserData();

    boolean syncUserSettings(@NotNull Context context);

    void unInitWhenLogout();

    void updateCompanionHosts(boolean isStaging);

    void updateDeviceAuthKey(int source, @NotNull String authKey);

    void updateSpeechMiotToken();
}
