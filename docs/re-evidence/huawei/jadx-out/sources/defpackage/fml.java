package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import com.huawei.ui.commonui.R;
import com.huawei.unitedevice.config.IwearLinkConfig;
import health.compact.a.CloudUtils;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.GRSManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class fml implements IwearLinkConfig {
    public static void c() {
        if (EnvironmentUtils.e()) {
            xgt.e(new fml());
            ReleaseLogUtil.c("DEVMGR_WearLinkConfig", "setWearLinkConfig end");
        }
    }

    @Override // com.huawei.unitedevice.config.IwearLinkConfig
    public void opEvent2nd(String str, LinkedHashMap<String, String> linkedHashMap, boolean z) {
        LogUtil.b("WearLinkConfig", "WearLinkConfig opEvent2nd");
        if (z) {
            linkedHashMap.put(OpAnalyticsConstants.DEVICE_SERIAL_NUMBER, CommonUtil.i());
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(str, linkedHashMap);
    }

    @Override // com.huawei.unitedevice.config.IwearLinkConfig
    public void wearLinkRiskEvent(String str, String str2) {
        LogUtil.b("WearLinkConfig", "WearLinkConfig wearLinkRiskEvent");
        xjt.a(str, str2);
    }

    @Override // com.huawei.unitedevice.config.IwearLinkConfig
    public String getCommonCountryCode(Context context) {
        LogUtil.b("WearLinkConfig", "WearLinkConfig getCommonCountryCode");
        return GRSManager.c(context).getCommonCountryCode();
    }

    @Override // com.huawei.unitedevice.config.IwearLinkConfig
    public boolean getAuthorizationStatus(Context context) {
        LogUtil.b("WearLinkConfig", "WearLinkConfig getAuthorizationStatus");
        if (context == null) {
            context = BaseApplication.b();
        }
        boolean zEquals = "true".equals(KeyValDbManager.d(context).c("key_wether_to_auth"));
        if (!zEquals) {
            LogUtil.b("WearLinkConfig", "getAuthorizationStatus key_wether_to_auth is false");
        }
        return zEquals;
    }

    private static String c(int i) {
        String key = "";
        for (Map.Entry<String, Integer> entry : edg.b().entrySet()) {
            if (entry != null && entry.getKey() != null) {
                key = entry.getKey();
                if ((edg.b().get(key) != null ? edg.b().get(key).intValue() : 0) == i) {
                    break;
                }
            }
        }
        return key;
    }

    @Override // com.huawei.unitedevice.config.IwearLinkConfig
    public String getBrand(int i) {
        LogUtil.b("WearLinkConfig", "WearLinkConfig getBrand");
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(c(i));
        if (pluginInfoByUuid == null) {
            LogUtil.d("WearLinkConfig", "pluginInfo is null");
            return "";
        }
        edz edzVarI = pluginInfoByUuid.i();
        if (edzVarI == null) {
            LogUtil.d("WearLinkConfig", "pluginInfoWear is null");
            return "";
        }
        return edzVarI.j();
    }

    @Override // com.huawei.unitedevice.config.IwearLinkConfig
    public boolean isLogin(Context context) {
        LogUtil.b("WearLinkConfig", "WearLinkConfig isLogin");
        boolean zA = CloudUtils.a();
        LogUtil.b("WearLinkConfig", "isReconnectionDevice isAllowLogin ", Boolean.valueOf(zA));
        boolean isLogined = true;
        if (!zA) {
            return true;
        }
        if (CommonUtil.z(context)) {
            String logoutFlag = ThirdLoginDataStorageUtil.getLogoutFlag();
            LogUtil.b("WearLinkConfig", "isReconnectionDevice logoutFlag ", logoutFlag);
            if (!"false".equals(logoutFlag) && !TextUtils.isEmpty(logoutFlag)) {
                isLogined = false;
            }
        } else {
            isLogined = LoginInit.getInstance(context).getIsLogined();
        }
        ReleaseLogUtil.c("DEVMGR_WearLinkConfig", "isReconnectionDevice isLogin ", Boolean.valueOf(isLogined));
        return isLogined;
    }

    @Override // com.huawei.unitedevice.config.IwearLinkConfig
    public boolean noCloudVersion() {
        LogUtil.b("WearLinkConfig", "WearLinkConfig noCloudVersion");
        return CloudUtils.d();
    }

    @Override // com.huawei.unitedevice.config.IwearLinkConfig
    public void applyOrReleaseResource(boolean z, String str, int i, long j, String str2) {
        if (z) {
            PowerKitManager.a().d(str, i, j, str2);
        } else {
            PowerKitManager.a().a(str, i, str2);
        }
    }

    @Override // com.huawei.unitedevice.config.IwearLinkConfig
    public String getSwitchSetting(String str, String str2) {
        LogUtil.b("WearLinkConfig", "WearLinkConfig getSwitchSetting");
        return ecu.d().getSwitchSetting(str, str2);
    }

    @Override // com.huawei.unitedevice.config.IwearLinkConfig
    public String getDeviceRelation(String str) {
        return edb.d().getDeviceRelation(str);
    }

    @Override // com.huawei.unitedevice.config.IwearLinkConfig
    public List<DeviceInfo> getDeviceMgrList(int i, String str) {
        LogUtil.b("WearLinkConfig", "WearLinkConfig getDeviceList");
        return ecu.d().getDeviceList(HwGetDevicesMode.getValue(i), null, str);
    }

    @Override // com.huawei.unitedevice.config.IwearLinkConfig
    public void notification(int i) {
        LogUtil.b("WearLinkConfig", "WearLinkConfig notification eventId = ", Integer.valueOf(i));
        if (i == 4 || i == 5) {
            b(BaseApplication.b(), i);
        } else {
            d(BaseApplication.b(), i);
        }
    }

    @Override // com.huawei.unitedevice.config.IwearLinkConfig
    public void setProbabilityProblemEvent(String str, String str2) {
        OpAnalyticsUtil.getInstance().setProbabilityProblemEvent(str, str2);
    }

    private void b(Context context, int i) {
        String string;
        Resources resources = context.getResources();
        if (i == 4) {
            string = resources.getString(R.string.IDS_wifi_go_permission_tip);
        } else if (i != 5) {
            return;
        } else {
            string = resources.getString(R.string.IDS_wlan_go_permission_tip);
        }
        LogUtil.b("WearLinkConfig", "show notify");
        int identifier = resources.getIdentifier("IDS_hw_app_name", "string", BaseApplication.d());
        if (identifier == 0) {
            identifier = resources.getIdentifier("IDS_app_name_health", "string", BaseApplication.d());
        }
        NotificationChannel notificationChannel = new NotificationChannel("channel_common_id", identifier == 0 ? "channel_common_name" : context.getString(identifier), 4);
        notificationChannel.enableVibration(false);
        notificationChannel.setSound(null, null);
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context);
        notificationManagerCompatFrom.createNotificationChannel(notificationChannel);
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        Notification notificationBuild = new NotificationCompat.Builder(context, "channel_common_id").setSmallIcon(R.drawable.healthlogo_ic_notification).setAutoCancel(true).setContentText(string).setContentIntent(PendingIntent.getActivity(context, 0, intent, 67108864)).setStyle(new NotificationCompat.BigTextStyle()).setPriority(0).build();
        notificationBuild.flags = 536;
        notificationManagerCompatFrom.notify(2022050515, notificationBuild);
    }

    private void d(Context context, int i) {
        String string;
        if (i == 1) {
            Toast.makeText(context, R.string.IDS_device_mgr_device_pair_guide_tips, 1).show();
            return;
        }
        if (i == 2) {
            string = context.getResources().getString(R.string.IDS_device_unbind_fail_from_system_list);
        } else if (i != 3) {
            return;
        } else {
            string = context.getString(R.string.IDS_blite_guide_paire_fail_no_hilink_device_string);
        }
        Toast.makeText(context, string, 1).show();
    }
}
