package com.xiaomi.hm.health.device.fw_upgrade;

import android.os.Environment;
import com.google.gson.reflect.TypeToken;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.firmware.FirmwareManagerApi;
import com.xiaomi.hm.health.device.fw_upgrade.NetFwUpgradeManager;
import com.xiaomi.hm.health.eventbus.EventFwCheckResult;
import com.xiaomi.hm.health.model.app_upgrade.WebResponse;
import com.xiaomi.hm.health.model.fw_upgrade.ItemFwResponse;
import de.greenrobot.event.EventBus;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class NetFwUpgradeManager {
    public static final String LAST_INVOKE_APP_VERSION = "last_fw_app_version";
    public static final String LAST_INVOKE_DATA = "last_fw_date";
    public static final int TYPE_SUCCESS_PATH = 2;
    private static final String a = "FwUpgrade-Manager";
    private static final String b = "v1/firmwares.json";
    private static final int c = 1;
    private static final String d = "fw_download_temp";
    private static final String e = "fw_downloaded";
    private static final String f = ".fw";
    private static final String g = ".zip";
    private static final String h = "firmware";
    private static final String i = "zip";
    private static final Lazy<DeviceManagerApi> j = KoinJavaComponent.inject(DeviceManagerApi.class);
    private static final Lazy<DeviceUtilsApi> k = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private static final Lazy<KeeperProxyApi> l = KoinJavaComponent.inject(KeeperProxyApi.class);
    private static final Lazy<FirmwareManagerApi> m = KoinJavaComponent.inject(FirmwareManagerApi.class);

    public class a extends IHMHttpResponseHandler {
        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.i(NetFwUpgradeManager.a, "onCancel--- ", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.i(NetFwUpgradeManager.a, "onCompleted--- ", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            EventBus.getDefault().post(new EventFwCheckResult(false));
            HMLog.i(NetFwUpgradeManager.a, "onError: " + th, new Object[0]);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x006d  */
        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            boolean z;
            HMLog.i(NetFwUpgradeManager.a, "onItem: " + hMHttpResponseData, new Object[0]);
            if (!hMHttpResponseData.isSuccess()) {
                EventBus.getDefault().post(new EventFwCheckResult(false));
                return;
            }
            ((KeeperProxyApi) NetFwUpgradeManager.l.getValue()).keepFwUpgradeDate();
            if (hMHttpResponseData.getResponseBody() != null) {
                String str = new String(hMHttpResponseData.getResponseBody(), Charset.defaultCharset());
                HMLog.i(NetFwUpgradeManager.a, " response = " + str, new Object[0]);
                List listJ = NetFwUpgradeManager.j(str);
                if (listJ != null) {
                    z = true;
                    NetFwUpgradeManager.g(listJ);
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                return;
            }
            EventBus.getDefault().post(new EventFwCheckResult(false));
        }
    }

    public class b extends TypeToken<WebResponse<List<ItemFwResponse>>> {
    }

    public static void checkFwFromServerAsync(boolean z) {
        if (!z && !GlobalConfig.get().isBuildInner() && !k.getValue().compareDateCalendar(l.getValue().getLastFwUpgradeDate(), Calendar.getInstance())) {
            HMLog.i(a, "Today has checked fw upgrade.", new Object[0]);
            return;
        }
        DeviceManagerApi value = j.getValue();
        if (value.hasBound(HMDeviceType.MILI) || value.hasBound(HMDeviceType.WEIGHT) || value.hasBound(HMDeviceType.SHOES)) {
            new Thread(new Runnable() { // from class: lc5
                @Override // java.lang.Runnable
                public final void run() {
                    NetFwUpgradeManager.f();
                }
            }).start();
        } else {
            HMLog.d(a, "not any band device , return !", new Object[0]);
        }
    }

    private static ItemFwResponse e(ItemFwResponse itemFwResponse) {
        if (Integer.parseInt(itemFwResponse.getApp_version()) != HMAppConfig.getVersionCode()) {
            HMLog.i(a, " appVersion is not equals, filter!!! ", new Object[0]);
            itemFwResponse.setNotVaild(true);
            return itemFwResponse;
        }
        String firmware_version = itemFwResponse.getFirmware_version();
        Lazy<FirmwareManagerApi> lazy = m;
        int versionCode = lazy.getValue().getVersionCode(firmware_version);
        HMLog.i(a, "serverFwVersion = " + firmware_version + " , serverFwVersionCode = " + versionCode, new Object[0]);
        if (versionCode == -1) {
            HMLog.i(a, " serverFwVersion is wrong ,need filter , return ! ", new Object[0]);
            itemFwResponse.setNotVaild(true);
            return itemFwResponse;
        }
        int source = itemFwResponse.getSource();
        if (!j.getValue().hasBound(HMDeviceSource.fromValue(source))) {
            HMLog.i(a, "not band, return !", new Object[0]);
            itemFwResponse.setNotVaild(true);
            return itemFwResponse;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("source_");
        sb.append(source);
        if (source == HMDeviceSource.MILI_1S.getValue()) {
            sb.append("_hr");
            sb.append(itemFwResponse.getHr_version());
        }
        sb.append('(');
        sb.append(HMAppConfig.getVersionCode());
        sb.append('_');
        sb.append(firmware_version);
        sb.append(')');
        HMLog.i(a, "firmwareType : " + itemFwResponse.getFileInfo().firmwareType, new Object[0]);
        if (i.equals(itemFwResponse.getFileInfo().firmwareType)) {
            sb.append(".zip");
        } else {
            sb.append(f);
        }
        HMLog.i(a, "downSdcarUrl = " + sb.toString(), new Object[0]);
        itemFwResponse.setDownLoadSdcardUrl(sb.toString());
        itemFwResponse.setFirmware_version_code(versionCode);
        itemFwResponse.setHr_version_code(lazy.getValue().getVersionCode(itemFwResponse.getHr_version()));
        return itemFwResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void f() {
        HMLog.i(a, "checkFwFromServerSync start...", new Object[0]);
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("app_version", Integer.valueOf(HMAppConfig.getVersionCode()));
        systemParams.put("app_channel", GlobalConfig.get().isBuildPlay() ? "play" : "mi");
        HMWebUtil.doRequest(HMServerDef.getUrl(b), systemParams, Support.RequestSupport.GET, true, new a());
        HMLog.i(a, "checkFwFromServerSync stop...", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(List<ItemFwResponse> list) {
        ArrayList<ItemFwResponse> arrayList = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            ItemFwResponse itemFwResponse = list.get(i2);
            HMLog.i(a, "filter before item : " + itemFwResponse.toString(), new Object[0]);
            ItemFwResponse itemFwResponseE = e(itemFwResponse);
            HMLog.i(a, "filter after  item : " + itemFwResponseE.toString(), new Object[0]);
            if (!itemFwResponseE.isNotVaild()) {
                arrayList.add(itemFwResponseE);
            }
        }
        String sdcardPathByType = getSdcardPathByType(2);
        String sdcardPathByType2 = getSdcardPathByType(1);
        if (arrayList.isEmpty()) {
            EventBus.getDefault().post(new EventFwCheckResult(false));
            return;
        }
        for (ItemFwResponse itemFwResponse2 : arrayList) {
            String str = sdcardPathByType + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + itemFwResponse2.getDownLoadSdcardUrl();
            if (h(itemFwResponse2, str)) {
                String str2 = sdcardPathByType2 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + itemFwResponse2.getDownLoadSdcardUrl();
                HMLog.d(a, "tempSdcardUrl = " + str2, new Object[0]);
                HMLog.d(a, "successSdcardUrl = " + str, new Object[0]);
                m.getValue().getDownloadApi(itemFwResponse2, str2, str).download();
            }
        }
    }

    public static String getSdcardPathByType(int i2) {
        String externalStorageState = Environment.getExternalStorageState();
        String str = i2 == 2 ? e : d;
        File externalFilesDir = "mounted".equals(externalStorageState) ? DeviceXFunctionsKt.getContext().getExternalFilesDir(str) : DeviceXFunctionsKt.getContext().getFilesDir();
        if (externalFilesDir == null) {
            externalFilesDir = DeviceXFunctionsKt.getContext().getFilesDir();
        }
        if (externalFilesDir != null) {
            return externalFilesDir.getPath();
        }
        return FileUtils.getExternalStorageDirectoryCompatible(DeviceXFunctionsKt.getContext()).getPath() + File.separator + str;
    }

    private static boolean h(ItemFwResponse itemFwResponse, String str) {
        try {
            boolean zB = FwDaoManager.getManager().b(itemFwResponse.getSource(), Integer.parseInt(itemFwResponse.getApp_version()), itemFwResponse.getFirmware_version_code());
            HMLog.i(a, "isExistDatabase = " + zB, new Object[0]);
            if (!zB) {
                return true;
            }
            File file = new File(str);
            if (file.exists()) {
                if (itemFwResponse.getMd5_content().equalsIgnoreCase(Md5FileUtils.getFileMD5String(file))) {
                    HMLog.i(a, "already download , md5 is same , not redownload, return ! " + file.getPath(), new Object[0]);
                    return false;
                }
                HMLog.i(a, "already download, but md5 is not same , delete = " + file.delete(), new Object[0]);
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<ItemFwResponse> j(String str) {
        try {
            WebResponse webResponse = (WebResponse) k.getValue().getGson().fromJson(str, new b().getType());
            if (webResponse != null && webResponse.isSuccess() && webResponse.getData() != null) {
                return (List) webResponse.getData();
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            HMLog.d(a, "e = " + e2, new Object[0]);
            return null;
        }
    }
}
