package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.datatype.DataDeviceAvoidDisturbInfo;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.DeviceGeneralSettingApi;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.device.callback.DeleteDeviceCallback;
import com.huawei.health.device.callback.DeviceGeneralSettingCallback;
import com.huawei.health.device.callback.FactoryRestCallback;
import com.huawei.health.device.callback.QueryBackLogDataCallback;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.h5pro.jsmodules.fallDetection.FallDetectionUtil;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.BaseDeviceBenefitInfo;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import com.huawei.trade.datatype.DeviceBenefits;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.trade.datatype.RepeatResourceBenefitInfo;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.homehealth.util.FeedBackLogHelper;
import com.huawei.ui.homewear21.home.manager.hwnfcwalletmgr.WalletAppManager;
import com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback;
import com.huawei.wear.oversea.overseamanger.SatcomQueryCallBack;
import com.huawei.wear.oversea.satcomcard.SatcomCardSupportInfo;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = DeviceGeneralSettingApi.class)
@Singleton
public class sgn implements DeviceGeneralSettingApi {
    private ContentValues a(String str) {
        return null;
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportAutoLightScreen(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceCapability deviceCapabilityD = d(str);
        if (deviceCapabilityD == null) {
            deviceGeneralSettingCallback.onResult(false);
        } else {
            deviceGeneralSettingCallback.onResult(deviceCapabilityD.isSupportAutoLightScreen());
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportBluetoothOffAlert(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceCapability deviceCapabilityD = d(str);
        if (deviceCapabilityD == null) {
            deviceGeneralSettingCallback.onResult(false);
        } else {
            deviceGeneralSettingCallback.onResult(deviceCapabilityD.isBluetoothOffAlert());
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void queryAutoLightScreenStatus(String str, final DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        if (b(str, "auto_light_screen", deviceGeneralSettingCallback)) {
            return;
        }
        mhs.a().getSwitchSetting("auto_light_screen", new IBaseResponseCallback() { // from class: shc
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                sgn.b(deviceGeneralSettingCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void b(DeviceGeneralSettingCallback deviceGeneralSettingCallback, int i, Object obj) {
        ReleaseLogUtil.d("DEVMGR_DeviceGeneralSettingApi", "lightScreenSwitch errorCode: ", Integer.valueOf(i), " ; objectData: ", obj);
        boolean zEquals = true;
        if (i == 0 && (obj instanceof String)) {
            zEquals = true ^ "0".equals((String) obj);
        }
        deviceGeneralSettingCallback.onResult(zEquals);
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void queryBluetoothOffAlertStatus(String str, final DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        if (b(str, "bt_lost_remind", deviceGeneralSettingCallback)) {
            return;
        }
        mhs.a().getSwitchSetting("bt_lost_remind", new IBaseResponseCallback() { // from class: shb
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                sgn.a(deviceGeneralSettingCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void a(DeviceGeneralSettingCallback deviceGeneralSettingCallback, int i, Object obj) {
        ReleaseLogUtil.d("DEVMGR_DeviceGeneralSettingApi", "queryBluetoothOffAlertStatus errorCode: ", Integer.valueOf(i), " ; objectData: ", obj);
        deviceGeneralSettingCallback.onResult((i == 0 && (obj instanceof String)) ? !"0".equals((String) obj) : false);
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void setAutoLightScreen(final String str, final Boolean bool, final DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        SimpleChain.b("DeviceGeneralSettingApi").e(new SimpleChain.INext() { // from class: sgy
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                this.f48054b.c(bool, str, emitter, objArr);
            }
        }).e(new SimpleChain.INext() { // from class: sgw
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                this.e.d(str, bool, emitter, objArr);
            }
        }).d(new SimpleChain.Emitter() { // from class: sgv
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                deviceGeneralSettingCallback.onResult(true);
            }
        }, new Object[0]);
    }

    /* synthetic */ void c(Boolean bool, String str, final SimpleChain.Emitter emitter, Object[] objArr) {
        LogUtil.a("DeviceGeneralSettingApi", "setAutoLightScreen sendSetSwitchSettingCmd");
        mhs.a().sendSetSwitchSettingCmd(bool.booleanValue(), str, 1, 9, new IBaseResponseCallback() { // from class: sgn.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("DeviceGeneralSettingApi", "mRotateWakeScreenListener errorCode: ", Integer.valueOf(i), " ; objectData: ", obj);
                emitter.onSuccess(new Object[0]);
            }
        });
    }

    /* synthetic */ void d(String str, Boolean bool, SimpleChain.Emitter emitter, Object[] objArr) {
        String str2;
        LogUtil.a("DeviceGeneralSettingApi", "setAutoLightScreen saveSwitchLocaleButton");
        if (!b(str, "auto_light_screen", bool.booleanValue())) {
            if (e(str) != null) {
                if (bool.booleanValue()) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                mhs.a().setSwitchSetting("auto_light_screen", str2, null);
            } else {
                LogUtil.j("DeviceGeneralSettingApi", "mRotateWakeScreenListener deviceInfo is null");
            }
        }
        emitter.onSuccess(new Object[0]);
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void setBluetoothOffAlert(String str, Boolean bool, final DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceSettingsInteractors.e(BaseApplication.b()).d(str, bool.booleanValue(), new IBaseResponseCallback() { // from class: sgn.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("DeviceGeneralSettingApi", "setBluetoothOffAlert errorCode：", Integer.valueOf(i), ",objectData is ", obj);
                deviceGeneralSettingCallback.onResult(true);
            }
        });
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportSyncWifi(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceCapability deviceCapabilityD = d(str);
        boolean z = false;
        if (deviceCapabilityD == null) {
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        if (CommonUtil.at() && deviceCapabilityD.isSupportSyncWifi()) {
            z = true;
        }
        deviceGeneralSettingCallback.onResult(z);
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySyncWifiConfigStatus(String str, final DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: sgt
            @Override // java.lang.Runnable
            public final void run() {
                sgn.c(deviceGeneralSettingCallback);
            }
        });
    }

    static /* synthetic */ void c(DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        HiUserPreference userPreference = HiHealthManager.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getUserPreference("sync_wifi_toggle_status");
        if (userPreference == null) {
            HiHealthManager.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).setUserPreference(new HiUserPreference("sync_wifi_toggle_status", "1"), true);
            userPreference = HiHealthManager.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getUserPreference("sync_wifi_toggle_status");
        }
        if (userPreference != null) {
            String value = userPreference.getValue();
            if (value != null) {
                value = value.trim();
            }
            deviceGeneralSettingCallback.onResult((!Utils.n() || Utils.o()) ? true ^ "0".equals(value) : true);
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void setSyncWifiConfigStatus(String str, final Boolean bool, final DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: she
            @Override // java.lang.Runnable
            public final void run() {
                sgn.a(bool, deviceGeneralSettingCallback);
            }
        });
    }

    static /* synthetic */ void a(Boolean bool, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        HiUserPreference hiUserPreference;
        if (bool.booleanValue()) {
            hiUserPreference = new HiUserPreference("sync_wifi_toggle_status", "1");
        } else {
            hiUserPreference = new HiUserPreference("sync_wifi_toggle_status", "0");
        }
        HiHealthManager.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).setUserPreference(hiUserPreference, true);
        if (bool.booleanValue()) {
            LogUtil.a("DeviceGeneralSettingApi", "click sync wifi toggle and send wifi data in main process");
            lvb.e().i();
        } else {
            LogUtil.a("DeviceGeneralSettingApi", "click sync wifi toggle is closed");
        }
        deviceGeneralSettingCallback.onResult(true);
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportOtaUpdate(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceCapability deviceCapabilityD = d(str);
        if (deviceCapabilityD == null) {
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        boolean zD = eey.d(deviceInfoE, 58);
        boolean zD2 = eey.d(deviceInfoE, 108);
        LogUtil.a("DeviceGeneralSettingApi", "initFirmwareUpgradeItem isSupportOtaUpgrade:", Boolean.valueOf(zD2));
        if (deviceCapabilityD.isOtaUpdate() || zD || zD2) {
            deviceGeneralSettingCallback.onResult(true);
        } else {
            deviceGeneralSettingCallback.onResult(false);
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportDeviceInfo(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceInfo deviceInfo = getDeviceInfo(str);
        if (deviceInfo == null) {
            deviceGeneralSettingCallback.onResult(false);
        } else if (deviceInfo.getProductType() != 11) {
            deviceGeneralSettingCallback.onResult(true);
        } else {
            deviceGeneralSettingCallback.onResult(false);
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportFactoryReset(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceCapability deviceCapabilityD = d(str);
        if (deviceCapabilityD == null) {
            deviceGeneralSettingCallback.onResult(false);
        } else {
            deviceGeneralSettingCallback.onResult(deviceCapabilityD.isFactoryReset());
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void jumpWearSmartDetect(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        ReleaseLogUtil.d("DEVMGR_DeviceGeneralSettingApi", "jumpWearSmartDetect");
        final DeviceInfo deviceInfo = getDeviceInfo(str);
        if (deviceInfo == null) {
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            deviceGeneralSettingCallback.onResult(false);
        } else {
            final boolean z = deviceInfo.getDeviceConnectState() == 2;
            activityJ.runOnUiThread(new Runnable() { // from class: sgz
                @Override // java.lang.Runnable
                public final void run() {
                    lwo.c().e(deviceInfo, !z ? 1 : 0);
                }
            });
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportDetection(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceInfo deviceInfo = getDeviceInfo(str);
        if (deviceInfo == null) {
            ReleaseLogUtil.d("DEVMGR_DeviceGeneralSettingApi", "querySupportDetection deviceInfo is null");
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 2) {
            boolean zD = eey.d(deviceInfo, 71);
            boolean zD2 = eey.d(deviceInfo, 115);
            LogUtil.a("DeviceGeneralSettingApi", "isSupportDetecttion = ", Boolean.valueOf(zD), " isSupportDiagnosisOut = ", Boolean.valueOf(zD2), " isHarmony = ", Boolean.valueOf(CommonUtil.bc()));
            boolean z = CommonUtil.bc() && zD;
            boolean z2 = !CommonUtil.bc() && zD2;
            if ((z || z2) && tqp.h()) {
                LogUtil.a("DeviceGeneralSettingApi", "show detection entrance");
                deviceGeneralSettingCallback.onResult(true);
                return;
            } else {
                deviceGeneralSettingCallback.onResult(false);
                return;
            }
        }
        deviceGeneralSettingCallback.onResult(tqp.h());
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void pullUpAppWithWant(Object obj, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        String str = (String) obj;
        final DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            ReleaseLogUtil.d("DEVMGR_DeviceGeneralSettingApi", "pullUpAppWithWant mac:", CommonUtil.n(str));
            deviceGeneralSettingCallback.onResult(false);
        } else {
            activityJ.runOnUiThread(new Runnable() { // from class: sgx
                @Override // java.lang.Runnable
                public final void run() {
                    sgn.e(deviceInfoE);
                }
            });
        }
    }

    static /* synthetic */ void e(DeviceInfo deviceInfo) {
        FeedBackLogHelper feedBackLogHelper = new FeedBackLogHelper();
        feedBackLogHelper.b(deviceInfo);
        feedBackLogHelper.j();
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportNewEsim(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceCapability deviceCapabilityD = d(str);
        boolean z = false;
        if (deviceCapabilityD == null) {
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        if (!qrs.ah(BaseApplication.b()) && deviceCapabilityD.isSupportEsim() && deviceCapabilityD.isSupportNewEsim()) {
            z = true;
        }
        deviceGeneralSettingCallback.onResult(z);
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportServiceHotline(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        if (loj.c(36) && tqp.j()) {
            if (deviceInfoE != null && !lvi.a(deviceInfoE.getProductType()).ah()) {
                deviceGeneralSettingCallback.onResult(false);
            } else {
                deviceGeneralSettingCallback.onResult(true);
            }
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportMyHW(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        if (loj.c(29)) {
            if (deviceInfoE != null && !lvi.a(deviceInfoE.getProductType()).ae()) {
                deviceGeneralSettingCallback.onResult(false);
                return;
            } else {
                deviceGeneralSettingCallback.onResult(true);
                return;
            }
        }
        deviceGeneralSettingCallback.onResult(false);
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportLogFeedback(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        if (deviceInfoE.getAutoDetectSwitchStatus() != 1 && tqp.d() && a(deviceInfoE)) {
            LogUtil.a("DeviceGeneralSettingApi", "show logFeedback.");
            deviceGeneralSettingCallback.onResult(true);
        } else {
            deviceGeneralSettingCallback.onResult(false);
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportWallet(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        if (WalletAppManager.getInstance().isOverseaService()) {
            e(str, deviceGeneralSettingCallback);
        } else {
            deviceGeneralSettingCallback.onResult(rgd.e(str, rtk.c(str)));
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void queryBacklogEvents(String str, final QueryBackLogDataCallback queryBackLogDataCallback) {
        final DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            ReleaseLogUtil.d("DEVMGR_DeviceGeneralSettingApi", "deviceInfo is null");
            queryBackLogDataCallback.onResult(null);
        } else {
            SimpleChain.b("DeviceGeneralSettingApi").e(new SimpleChain.INext() { // from class: sgr
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
                public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                    ykx.b(deviceInfoE, emitter);
                }
            }).e(new SimpleChain.INext() { // from class: sgs
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
                public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                    this.f48048a.e(deviceInfoE, emitter, objArr);
                }
            }).d(new SimpleChain.Emitter() { // from class: sgq
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public final void onSuccess(Object[] objArr) {
                    sgn.d(queryBackLogDataCallback, objArr);
                }
            }, new Object[0]);
        }
    }

    /* synthetic */ void e(DeviceInfo deviceInfo, final SimpleChain.Emitter emitter, Object[] objArr) {
        if (objArr.length > 0) {
            final String string = objArr[0].toString();
            new riq().a(deviceInfo, new BackLogCallback<List<dse>>() { // from class: sgn.5
                @Override // com.huawei.health.device.callback.BackLogCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<dse> list) {
                    synchronized (list) {
                        int i = 0;
                        int i2 = 0;
                        for (dse dseVar : list) {
                            if (!dseVar.b()) {
                                i++;
                            }
                            if (!dseVar.a()) {
                                i2++;
                            }
                        }
                        JSONObject jSONObject = new JSONObject();
                        String str = "true";
                        try {
                            if ("06D".equals(string)) {
                                str = "true";
                            } else if ("06E".equals(string)) {
                                str = "false";
                            }
                            jSONObject.put("isWatch", str);
                            jSONObject.put("notFinishBacklogNum", i2);
                            jSONObject.put("notViewedBacklogNum", i);
                        } catch (JSONException unused) {
                            LogUtil.j("DeviceGeneralSettingApi", "queryBacklogEvent JSONException");
                        }
                        emitter.onSuccess(jSONObject);
                    }
                }

                @Override // com.huawei.health.device.callback.BackLogCallback
                public void onFailure(int i, String str) {
                    emitter.onError("next args is empty");
                }
            });
        } else {
            emitter.onError("next args is empty");
        }
    }

    static /* synthetic */ void d(QueryBackLogDataCallback queryBackLogDataCallback, Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            LogUtil.a("DeviceGeneralSettingApi", "subscribe args is empty");
            return;
        }
        Object obj = objArr[0];
        if (obj instanceof JSONObject) {
            queryBackLogDataCallback.onResult((JSONObject) obj);
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void queryBenefitData(final DeviceInfo deviceInfo, final QueryBackLogDataCallback queryBackLogDataCallback) {
        final JSONObject jSONObject = new JSONObject();
        if (deviceInfo.getDeviceConnectState() != 2) {
            queryBackLogDataCallback.onResult(jSONObject);
        } else {
            lsy.a(new Runnable() { // from class: sgn.3
                @Override // java.lang.Runnable
                public void run() {
                    PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
                    if (payApi == null) {
                        queryBackLogDataCallback.onResult(jSONObject);
                    } else {
                        payApi.getDeviceBenefits(qhu.d(deviceInfo, DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_ALL, true), new IBaseResponseCallback() { // from class: sgn.3.4
                            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                            /* JADX INFO: renamed from: onResponse */
                            public void a(int i, Object obj) {
                                List<BaseDeviceBenefitInfo> listA = rvj.a(i, obj, deviceInfo);
                                if (njy.e(listA)) {
                                    queryBackLogDataCallback.onResult(jSONObject);
                                    return;
                                }
                                try {
                                    rvl rvlVarA = rvj.a(listA.get(0), deviceInfo);
                                    jSONObject.put("description", rvlVarA.d());
                                    jSONObject.put("countNumber", listA.size());
                                    jSONObject.put("isWatch", rvlVarA.c());
                                    jSONObject.put("type", rvlVarA.b());
                                    jSONObject.put("value", rvlVarA.a());
                                } catch (JSONException unused) {
                                    LogUtil.a("DeviceGeneralSettingApi", "queryBenefitData error");
                                }
                                queryBackLogDataCallback.onResult(jSONObject);
                            }
                        });
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void exclusiveServiceSupport(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            LogUtil.a("DeviceGeneralSettingApi", "exclusiveServiceSupport deviceInfo is null");
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        List<String> fieldList = deviceInfoE.getFieldList();
        if (fieldList == null || fieldList.isEmpty()) {
            LogUtil.a("DeviceGeneralSettingApi", "exclusiveServiceSupport not support ");
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        boolean zB = b(deviceInfoE);
        if (CommonUtil.ab(BaseApplication.b())) {
            b(deviceInfoE, zB, deviceGeneralSettingCallback);
        } else {
            deviceGeneralSettingCallback.onResult(zB);
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public boolean isSupportExclusiveGuardianFromLocal(String str) {
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            LogUtil.j("DeviceGeneralSettingApi", "isSupportExclusiveGuardianFromLocal deviceInfo is null, deviceMac: " + CommonUtil.n(str));
            return false;
        }
        List<String> fieldList = deviceInfoE.getFieldList();
        if (fieldList == null || fieldList.isEmpty()) {
            LogUtil.j("DeviceGeneralSettingApi", "isSupportExclusiveGuardianFromLocal fieldList is empty, deviceMac: " + CommonUtil.n(str));
            return false;
        }
        return b(deviceInfoE);
    }

    private boolean b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return false;
        }
        String strE = tqp.e(BaseApplication.b(), deviceInfo.getDeviceIdentify(), "exclusiveGuardStatus");
        ReleaseLogUtil.d("DEVMGR_DeviceGeneralSettingApi", "updateStatusFromLocal exclusiveGuardianLocalStatus = ", strE);
        if ("1".equals(strE) || "2".equals(strE) || "3".equals(strE)) {
            return true;
        }
        LogUtil.j("DeviceGeneralSettingApi", "updateStatusFromLocal else branch");
        return false;
    }

    private void b(final DeviceInfo deviceInfo, final boolean z, final DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        LogUtil.a("DeviceGeneralSettingApi", "getDeviceBenefits");
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.j("DeviceGeneralSettingApi", "getDeviceBenefits payApi is null");
            deviceGeneralSettingCallback.onResult(z);
        } else {
            payApi.getDeviceBenefits(qhu.d(deviceInfo, DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_INBOX, true), new IBaseResponseCallback() { // from class: shf
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f48068b.c(deviceGeneralSettingCallback, z, deviceInfo, i, obj);
                }
            });
        }
    }

    /* synthetic */ void c(DeviceGeneralSettingCallback deviceGeneralSettingCallback, boolean z, DeviceInfo deviceInfo, int i, Object obj) {
        LogUtil.a("DeviceGeneralSettingApi", "getDeviceBenefits errorCode = ", Integer.valueOf(i), ", objectData = ", obj);
        if (i != 0 || !(obj instanceof DeviceBenefits)) {
            LogUtil.j("DeviceGeneralSettingApi", "getDeviceBenefits fail");
            deviceGeneralSettingCallback.onResult(z);
        } else {
            LogUtil.d("DeviceGeneralSettingApi", "getDeviceBenefits objectData = ", HiJsonUtil.d(obj));
            e((DeviceBenefits) obj, deviceInfo, z, deviceGeneralSettingCallback);
        }
    }

    private void e(DeviceBenefits deviceBenefits, DeviceInfo deviceInfo, boolean z, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        List<DeviceInboxInfo> inboxInfos = deviceBenefits.getInboxInfos();
        if (inboxInfos == null || inboxInfos.isEmpty()) {
            LogUtil.j("DeviceGeneralSettingApi", "handleDeviceBenefitsResult inboxInfoList is null or empty");
            deviceGeneralSettingCallback.onResult(z);
            return;
        }
        boolean z2 = false;
        for (DeviceInboxInfo deviceInboxInfo : inboxInfos) {
            if (tqp.b(deviceInboxInfo)) {
                if (deviceInboxInfo.getActiveStatus() == 1) {
                    e(deviceInfo, "1");
                    deviceGeneralSettingCallback.onResult(true);
                    return;
                } else if (deviceInboxInfo.getActiveStatus() == 2) {
                    z2 = true;
                } else {
                    LogUtil.j("DeviceGeneralSettingApi", "handleDeviceBenefitsResult else branch");
                }
            }
        }
        ReleaseLogUtil.d("DEVMGR_DeviceGeneralSettingApi", "handleDeviceBenefitsResult isActiveStatus = ", Boolean.valueOf(z2));
        if (z2) {
            c(deviceInfo, true, deviceGeneralSettingCallback);
        }
    }

    private void c(final DeviceInfo deviceInfo, final boolean z, final DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        LogUtil.a("DeviceGeneralSettingApi", "queryBenefitInfo");
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            deviceGeneralSettingCallback.onResult(z);
            LogUtil.j("DeviceGeneralSettingApi", "queryBenefitInfo payApi is null");
        } else {
            payApi.queryBenefitInfo(9, "", new IBaseResponseCallback() { // from class: shd
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.e.e(deviceGeneralSettingCallback, z, deviceInfo, i, obj);
                }
            });
        }
    }

    /* synthetic */ void e(DeviceGeneralSettingCallback deviceGeneralSettingCallback, boolean z, DeviceInfo deviceInfo, int i, Object obj) {
        LogUtil.a("DeviceGeneralSettingApi", "queryBenefitInfo errorCode = ", Integer.valueOf(i), ", objectData = ", obj);
        if (i != 0 || !(obj instanceof RepeatResourceBenefitInfo)) {
            LogUtil.j("DeviceGeneralSettingApi", "queryBenefitInfo fail");
            deviceGeneralSettingCallback.onResult(z);
            return;
        }
        LogUtil.a("DeviceGeneralSettingApi", "queryBenefitInfo objectData = ", HiJsonUtil.d(obj));
        RepeatResourceBenefitInfo repeatResourceBenefitInfo = (RepeatResourceBenefitInfo) obj;
        long nowTime = repeatResourceBenefitInfo.getNowTime() != 0 ? repeatResourceBenefitInfo.getNowTime() : System.currentTimeMillis();
        LogUtil.a("DeviceGeneralSettingApi", "queryBenefitInfo currentTime = ", Long.valueOf(nowTime));
        if (repeatResourceBenefitInfo.getExpireTime().longValue() >= nowTime) {
            a(deviceInfo, z, deviceGeneralSettingCallback);
        } else {
            e(deviceInfo, "2");
            deviceGeneralSettingCallback.onResult(true);
        }
    }

    private void a(final DeviceInfo deviceInfo, final boolean z, final DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        LogUtil.a("DeviceGeneralSettingApi", "getDoctorBasicInfo");
        ugs.e().getDoctorBasicInfo(new DataCallback() { // from class: sgn.6
            @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
            public void onFailure(int i, String str) {
                LogUtil.j("DeviceGeneralSettingApi", "getDoctorBasicInfo errorCode = ", i + ", errorInfo = ", str);
                if (CommonUtil.ab(BaseApplication.b())) {
                    sgn.this.e(deviceInfo, "2");
                    deviceGeneralSettingCallback.onResult(true);
                } else {
                    deviceGeneralSettingCallback.onResult(z);
                }
            }

            @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.a("DeviceGeneralSettingApi", "getDoctorBasicInfo data = " + jSONObject.toString());
                try {
                    if (jSONObject.getInt("resultCode") == 0) {
                        if (TextUtils.isEmpty(jSONObject.optString("doctorId"))) {
                            sgn.this.e(deviceInfo, "2");
                            deviceGeneralSettingCallback.onResult(true);
                            LogUtil.a("DeviceGeneralSettingApi", "getDoctorBasicInfo doctorId is empty");
                            return;
                        } else {
                            sgn.this.e(deviceInfo, "3");
                            deviceGeneralSettingCallback.onResult(true);
                            return;
                        }
                    }
                    deviceGeneralSettingCallback.onResult(z);
                } catch (JSONException unused) {
                    LogUtil.e("DeviceGeneralSettingApi", "getDoctorBasicInfo JSONException");
                    deviceGeneralSettingCallback.onResult(z);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DeviceInfo deviceInfo, String str) {
        Context contextB = BaseApplication.b();
        LogUtil.a("DeviceGeneralSettingApi", "updateToBeSignedStatus");
        tqp.e(contextB, deviceInfo.getDeviceIdentify(), "exclusiveGuardDoctorImgUrl", "");
        tqp.e(contextB, deviceInfo.getDeviceIdentify(), "exclusiveGuardStatus", str);
    }

    private void e(final String str, final DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        if (LoginInit.getInstance(BaseApplication.b()).isMinorAccount()) {
            LogUtil.a("DeviceGeneralSettingApi", "checkSupportPOverseaWallet minor account");
            deviceGeneralSettingCallback.onResult(false);
        } else {
            if (d()) {
                LogUtil.a("DeviceGeneralSettingApi", "addOverseaWalletItem isKoreaVersion  is true");
                if (deviceGeneralSettingCallback != null) {
                    deviceGeneralSettingCallback.onResult(false);
                    return;
                }
                return;
            }
            WalletAppManager.getInstance().getValidWalletApplication(str, new ResponseCallback() { // from class: sgu
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    sgn.d(deviceGeneralSettingCallback, str, i, (List) obj);
                }
            });
        }
    }

    static /* synthetic */ void d(DeviceGeneralSettingCallback deviceGeneralSettingCallback, String str, int i, List list) {
        boolean z = !CollectionUtils.a(list);
        ReleaseLogUtil.d("DEVMGR_DeviceGeneralSettingApi", "requestOverseaWallet isShowOverseaWallet:", Boolean.valueOf(z));
        deviceGeneralSettingCallback.onResult(z);
        WalletAppManager.getInstance().setIsSupportWalletApp(str, z);
    }

    private boolean d() {
        boolean zA = Utils.a(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
        LogUtil.a("DeviceGeneralSettingApi", "isKoreaVersion is:", Boolean.valueOf(zA));
        return zA;
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportSatellite(DeviceInfo deviceInfo, final DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        boolean zD = eey.d(deviceInfo, 283);
        ReleaseLogUtil.d("DEVMGR_DeviceGeneralSettingApi", "isSupportBeidou: ", Boolean.valueOf(zD));
        if (zD) {
            deviceGeneralSettingCallback.onResult(false);
        } else {
            rgd.c(deviceInfo, new SatcomQueryCallBack() { // from class: sgn.9
                @Override // com.huawei.wear.oversea.overseamanger.SatcomQueryCallBack
                public int onSuccess(SatcomCardSupportInfo satcomCardSupportInfo) {
                    int iE = satcomCardSupportInfo.e();
                    boolean zB = satcomCardSupportInfo.b();
                    int iD = satcomCardSupportInfo.d();
                    ReleaseLogUtil.d("DEVMGR_DeviceGeneralSettingApi", "querySupportSatcom onSuccess returnCode:", Integer.valueOf(iE), ", isSupportSatcomCard:", Boolean.valueOf(zB), ", activityPeriod:", Integer.valueOf(iD));
                    deviceGeneralSettingCallback.onResult(zB && iD != 0);
                    return iE;
                }

                @Override // com.huawei.wear.oversea.overseamanger.SatcomQueryCallBack
                public int onFail(SatcomCardSupportInfo satcomCardSupportInfo) {
                    int iE = satcomCardSupportInfo.e();
                    ReleaseLogUtil.e("DEVMGR_DeviceGeneralSettingApi", "querySupportSatcom fail returnCode is:", Integer.valueOf(iE));
                    deviceGeneralSettingCallback.onResult(false);
                    return iE;
                }
            });
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    @Deprecated
    public void factoryReset(final String str, final int i, final FactoryRestCallback factoryRestCallback) {
        ReleaseLogUtil.d("DEVMGR_DeviceGeneralSettingApi", "enter factoryReset");
        final DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            factoryRestCallback.onFail("device info is null");
            return;
        }
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            factoryRestCallback.onFail("activity is null");
        } else {
            activityJ.runOnUiThread(new Runnable() { // from class: sgm
                @Override // java.lang.Runnable
                public final void run() {
                    sgn.e(factoryRestCallback, str, deviceInfoE, i);
                }
            });
        }
    }

    static /* synthetic */ void e(FactoryRestCallback factoryRestCallback, String str, DeviceInfo deviceInfo, int i) {
        tpp tppVarC = tpp.c();
        tppVarC.b();
        tppVarC.e(factoryRestCallback);
        tppVarC.a(true);
        tppVarC.c(str, deviceInfo, i);
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void deleteDevice(final String str, String str2, boolean z, final DeleteDeviceCallback deleteDeviceCallback) {
        LogUtil.a("DeviceGeneralSettingApi", "deleteDevice deviceMac:", str, " deviceName:", str2);
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            deleteDeviceCallback.onFail("activity is null ");
            return;
        }
        DeviceInfo deviceInfo = getDeviceInfo(str);
        if (deviceInfo == null) {
            LogUtil.j("DeviceGeneralSettingApi", "deleteDevice getDeviceInfo1 ==null");
            deviceInfo = lvl.e(str);
        }
        if (deviceInfo != null) {
            rts.d(activityJ, deviceInfo, z).d(new SimpleChain.Emitter() { // from class: sgn.10
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public void onSuccess(Object... objArr) {
                    deleteDeviceCallback.onSuccess();
                    lut.a().c(str);
                }

                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public void onError(String str3) {
                    deleteDeviceCallback.onFail(str3);
                }
            }, new Object[0]);
            return;
        }
        ContentValues contentValuesA = a(str);
        if (contentValuesA != null) {
            final String asString = contentValuesA.getAsString("uniqueId");
            SimpleChain.b("deleteDevice contentValues").e(new SimpleChain.INext() { // from class: shg
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
                public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                    drw.e().l(asString);
                }
            }).d(new SimpleChain.Emitter() { // from class: sgn.7
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public void onSuccess(Object... objArr) {
                    deleteDeviceCallback.onSuccess();
                }

                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public void onError(String str3) {
                    deleteDeviceCallback.onFail(str3);
                }
            }, new Object[0]);
        } else {
            deleteDeviceCallback.onFail("device info is null");
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportLeftRightHandWearMode(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceCapability deviceCapabilityD = d(str);
        if (deviceCapabilityD == null) {
            deviceGeneralSettingCallback.onResult(false);
        } else {
            deviceGeneralSettingCallback.onResult(deviceCapabilityD.isSupportLeftRightHandWearMode());
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void queryLeftRightHandWearModeStatus(String str, final DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        mhs.a().getSwitchSetting("left_or_right_hand_wear_status", new IBaseResponseCallback() { // from class: shh
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                sgn.c(deviceGeneralSettingCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void c(DeviceGeneralSettingCallback deviceGeneralSettingCallback, int i, Object obj) {
        LogUtil.a("DeviceGeneralSettingApi", "LEFT_OR_RIGHT_HAND_WEAR_STATUS errorCode: ", Integer.valueOf(i), " ; objectData: ", obj);
        boolean z = (i == 0 && (obj instanceof String) && "1".equals((String) obj)) ? false : true;
        LogUtil.a("DeviceGeneralSettingApi", "isLeftHand: ", Boolean.valueOf(z));
        if (deviceGeneralSettingCallback != null) {
            deviceGeneralSettingCallback.onResult(z);
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void setLeftRightHandWearMode(String str, Boolean bool, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        String str2;
        boolean zBooleanValue = bool.booleanValue();
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null || deviceInfoE.getDeviceConnectState() != 2) {
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        mhs.a().sendSetSwitchSettingCmd(!zBooleanValue, "", 1, 26, null);
        if (!zBooleanValue) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        mhs.a().setSwitchSetting("left_or_right_hand_wear_status", str2, null);
        deviceGeneralSettingCallback.onResult(true);
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportRotateSwitchScreen(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceCapability deviceCapabilityD = d(str);
        if (deviceCapabilityD == null) {
            deviceGeneralSettingCallback.onResult(false);
        } else {
            deviceGeneralSettingCallback.onResult(deviceCapabilityD.isSupportRotateSwitchScreen());
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void queryRotateSwitchScreenStatus(String str, final DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        mhs.a().getSwitchSetting("rotate_switch_screen", new IBaseResponseCallback() { // from class: sgn.8
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                deviceGeneralSettingCallback.onResult((i == 0 && (obj instanceof String)) ? !"0".equals((String) obj) : false);
            }
        });
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void setRotateSwitchScreen(String str, Boolean bool, final DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null || deviceInfoE.getDeviceConnectState() != 2) {
            deviceGeneralSettingCallback.onResult(false);
        } else {
            mhs.a().setSwitchSetting("rotate_switch_screen", bool.booleanValue() ? "1" : "0", null);
            mhs.a().sendSetSwitchSettingCmd(bool.booleanValue(), deviceInfoE.getDeviceIdentify(), 1, 27, new IBaseResponseCallback() { // from class: sgn.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("DeviceGeneralSettingApi", "setRotateSwitchScreen errorCode: ", Integer.valueOf(i));
                    deviceGeneralSettingCallback.onResult(true);
                }
            });
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportNoDisturb(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceCapability deviceCapabilityD = d(str);
        if (deviceCapabilityD == null) {
            deviceGeneralSettingCallback.onResult(false);
        } else {
            deviceGeneralSettingCallback.onResult(deviceCapabilityD.isAvoidDisturb());
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void queryNoDisturbStatus(String str, final DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceSettingsInteractors.e(BaseApplication.b()).e(BaseApplication.b(), new IBaseResponseCallback() { // from class: shi
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                sgn.d(deviceGeneralSettingCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void d(DeviceGeneralSettingCallback deviceGeneralSettingCallback, int i, Object obj) {
        if (obj == null) {
            LogUtil.j("DeviceGeneralSettingApi", "updateNoDisturb objectData is null.");
            return;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            list.add(new DataDeviceAvoidDisturbInfo());
        }
        if (njy.e(list)) {
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        DataDeviceAvoidDisturbInfo dataDeviceAvoidDisturbInfo = (DataDeviceAvoidDisturbInfo) list.get(0);
        int deviceAvoidDisturbSwitch = dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbSwitch();
        int deviceAvoidDisturbTimeSwitch = dataDeviceAvoidDisturbInfo.getDeviceAvoidDisturbTimeSwitch();
        LogUtil.a("DeviceGeneralSettingApi", "handleNoDisturbStatus() switch is ", Integer.valueOf(deviceAvoidDisturbSwitch), ",deviceAvoidDisturbTimeSwitch:", Integer.valueOf(deviceAvoidDisturbTimeSwitch));
        deviceGeneralSettingCallback.onResult((deviceAvoidDisturbSwitch == 0 && deviceAvoidDisturbTimeSwitch == 0) ? false : true);
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportCustomBand(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceCapability deviceCapabilityD = d(str);
        if (deviceCapabilityD == null) {
            deviceGeneralSettingCallback.onResult(false);
        } else {
            deviceGeneralSettingCallback.onResult(deviceCapabilityD.isSupportOneLevelMenu());
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportDoublePhone(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceCapability deviceCapabilityD = d(str);
        boolean z = false;
        if (deviceCapabilityD == null) {
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        if (deviceCapabilityD.isSupportPhonesInfo() && deviceCapabilityD.isSupportNotifyDeviceBroadCast()) {
            z = true;
        }
        deviceGeneralSettingCallback.onResult(z);
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportDiagnosticAnalysis(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceInfo deviceInfo = getDeviceInfo(str);
        boolean z = false;
        if (deviceInfo == null) {
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        if (deviceInfo.getDeviceConnectState() != 2 && tqp.h()) {
            z = true;
        }
        deviceGeneralSettingCallback.onResult(z);
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void onActivityResult(int i, int i2, Intent intent) {
        tpp.c().b(i, i2, intent);
    }

    private boolean a(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            return !Utils.o() && lws.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).c(deviceInfo) && lvi.g(deviceInfo.getProductType());
        }
        LogUtil.j("DeviceGeneralSettingApi", "deviceInfo is null");
        return false;
    }

    public DeviceCapability d(String str) {
        return DeviceSettingsInteractors.e(BaseApplication.b()).e(str);
    }

    private boolean b(String str, String str2, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        boolean z = false;
        if (mgb.d(str) != 2) {
            return false;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.b(), String.valueOf(10008), str2);
        if (TextUtils.isEmpty(strE)) {
            if (!"bt_lost_remind".equals(str2)) {
                z = true;
            }
        } else {
            z = Boolean.parseBoolean(strE);
        }
        deviceGeneralSettingCallback.onResult(z);
        return true;
    }

    private boolean b(String str, String str2, boolean z) {
        if (mgb.d(str) != 2) {
            return false;
        }
        SharedPreferenceManager.e(BaseApplication.b(), String.valueOf(10008), str2, Boolean.toString(z), null);
        return true;
    }

    private DeviceInfo e(String str) {
        LogUtil.a("DeviceGeneralSettingApi", "getLocalDeviceInfo", CommonUtil.n(str));
        DeviceInfo deviceInfoB = lut.a().b(str);
        if (deviceInfoB instanceof CloudDeviceInfo) {
            return null;
        }
        return deviceInfoB;
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public DeviceInfo getDeviceInfo(String str) {
        LogUtil.a("DeviceGeneralSettingApi", "getDeviceInfo", CommonUtil.n(str));
        return lut.a().b(str);
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void setFallDetection(String str, int i, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            deviceGeneralSettingCallback.onResult(false);
            ReleaseLogUtil.e("DEVMGR_DeviceGeneralSettingApi", "setFallDetection deviceInfo is null");
        } else {
            boolean zSendSampleConfigToDevice = FallDetectionUtil.sendSampleConfigToDevice(true, deviceInfoE, i, System.currentTimeMillis());
            ReleaseLogUtil.d("DEVMGR_DeviceGeneralSettingApi", "setFallDetection sendSampleConfigToDevice isSuccess ", Boolean.valueOf(zSendSampleConfigToDevice));
            deviceGeneralSettingCallback.onResult(zSendSampleConfigToDevice);
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportBetaFeedback(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        if (eei.d(deviceInfoE)) {
            LogUtil.j("DeviceGeneralSettingApi", "new honor device does not support");
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        if (CommonUtil.bu()) {
            LogUtil.j("DEVMGR_DeviceGeneralSettingApi", "release version not support");
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        if (LoginInit.getInstance(BaseApplication.b()).isKoreaCountry()) {
            ReleaseLogUtil.e("DEVMGR_DeviceGeneralSettingApi", "beta version not support Korea");
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        String strC = KeyValDbManager.d(BaseApplication.b()).c("is_support_dfx_status");
        boolean zEquals = "true".equals(strC);
        LogUtil.a("DeviceGeneralSettingApi", "dfxStatus = ", strC);
        boolean z = eey.d(deviceInfoE, 34) && lws.c(BaseApplication.b()).d(str) && zEquals;
        if (Utils.o() && z) {
            LogUtil.a("DeviceGeneralSettingApi", "show setting_about_beta_question.");
            deviceGeneralSettingCallback.onResult(true);
        } else {
            deviceGeneralSettingCallback.onResult(false);
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportHonorPrivacy(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceInfo deviceInfoE = e(str);
        boolean z = false;
        if (deviceInfoE == null) {
            deviceGeneralSettingCallback.onResult(false);
            return;
        }
        if (etn.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext()) && lvi.l(deviceInfoE.getProductType()) && SharedPreferenceManager.c(BaseApplication.b(), LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011))) {
            z = true;
        }
        deviceGeneralSettingCallback.onResult(z);
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportLiveWindow(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        boolean zB = tqp.b(e(str));
        LogUtil.a("DeviceGeneralSettingApi", "querySupportLiveWindow isSupport ", Boolean.valueOf(zB));
        deviceGeneralSettingCallback.onResult(zB);
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportScreenshotSetting(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            deviceGeneralSettingCallback.onResult(false);
            ReleaseLogUtil.e("DEVMGR_DeviceGeneralSettingApi", "querySupportScreenshotSetting deviceInfo is null");
        } else {
            boolean zD = eey.d(deviceInfoE, 289);
            ReleaseLogUtil.d("DEVMGR_DeviceGeneralSettingApi", "querySupportScreenshotSetting isSupport: ", Boolean.valueOf(zD));
            deviceGeneralSettingCallback.onResult(zD);
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void getDeviceShape(String str, ResultCallback<Number> resultCallback) {
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            resultCallback.onFailure(new Throwable("getDeviceShape device is null"));
            return;
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.j(deviceInfoE.getProductType()));
        Objects.isNull(pluginInfoByUuid);
        if (pluginInfoByUuid == null) {
            resultCallback.onFailure(new Throwable("getDeviceShape DescriptionInfo is null"));
            return;
        }
        edz edzVarI = pluginInfoByUuid.i();
        Objects.isNull(edzVarI);
        if (edzVarI == null) {
            resultCallback.onFailure(new Throwable("getDeviceShape WearDeviceInfo is null"));
            return;
        }
        int iAi = edzVarI.ai();
        ReleaseLogUtil.d("DEVMGR_DeviceGeneralSettingApi", "getDeviceShape deviceShapes:", Integer.valueOf(iAi));
        resultCallback.onSuccess(Integer.valueOf(iAi));
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void isHonorDevice(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            deviceGeneralSettingCallback.onResult(false);
            ReleaseLogUtil.e("DEVMGR_DeviceGeneralSettingApi", "isHonorDevice deviceInfo is null");
        } else {
            boolean zD = eei.d(deviceInfoE);
            ReleaseLogUtil.d("DEVMGR_DeviceGeneralSettingApi", "isHonorDevice isSupport: ", Boolean.valueOf(zD));
            deviceGeneralSettingCallback.onResult(zD);
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportCalendar(final String str, final DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        ThreadPoolManager.c().a("querySupportCalendar", new Runnable() { // from class: sgp
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b(str, deviceGeneralSettingCallback);
            }
        });
    }

    /* synthetic */ void b(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            deviceGeneralSettingCallback.onResult(false);
            ReleaseLogUtil.e("DEVMGR_DeviceGeneralSettingApi", "querySupportCalendar deviceInfo is null");
        } else if (!TextUtils.isEmpty(top.d(deviceInfoE))) {
            deviceGeneralSettingCallback.onResult(true);
        } else {
            deviceGeneralSettingCallback.onResult(false);
        }
    }

    @Override // com.huawei.health.device.api.DeviceGeneralSettingApi
    public void querySupportWeather(final String str, final DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        ThreadPoolManager.c().a("querySupportWeather", new Runnable() { // from class: sha
            @Override // java.lang.Runnable
            public final void run() {
                this.f48061c.c(str, deviceGeneralSettingCallback);
            }
        });
    }

    /* synthetic */ void c(String str, DeviceGeneralSettingCallback deviceGeneralSettingCallback) {
        DeviceInfo deviceInfoE = e(str);
        if (deviceInfoE == null) {
            deviceGeneralSettingCallback.onResult(false);
            ReleaseLogUtil.e("DEVMGR_DeviceGeneralSettingApi", "querySupportWeather deviceInfo is null");
        } else if (!TextUtils.isEmpty(top.a(deviceInfoE))) {
            deviceGeneralSettingCallback.onResult(true);
        } else {
            deviceGeneralSettingCallback.onResult(false);
        }
    }
}
