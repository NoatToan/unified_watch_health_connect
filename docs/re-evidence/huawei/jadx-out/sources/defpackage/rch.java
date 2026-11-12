package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.reflect.TypeToken;
import com.huawei.datatype.DeviceCommand;
import com.huawei.devicepair.api.BasePairManagerApi;
import com.huawei.devicepair.model.StartPairOption;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.device.api.DeviceGeneralSettingApi;
import com.huawei.health.device.callback.DeleteDeviceCallback;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.DeviceParameter;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IAddDeviceStateAIDLCallback;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.device.R;
import com.huawei.ui.device.utlis.BluetoothPermisionUtils;
import com.huawei.ui.main.stories.guide.interactors.GuideInteractors;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = BasePairManagerApi.class)
@Singleton
public class rch implements BasePairManagerApi {
    private static final Set<String> d = Collections.unmodifiableSet(new HashSet<String>() { // from class: rch.5
        {
            add("HUAWEI WATCH GT 4-");
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomPermissionAction f47121a;

    @Override // com.huawei.devicepair.api.BasePairManagerApi
    public boolean isSupportOobe(String str) {
        return false;
    }

    @Override // com.huawei.devicepair.api.BasePairManagerApi
    public void syncAccount(String str, int i) {
    }

    @Override // com.huawei.devicepair.api.BasePairManagerApi
    public void connectDevice(final Context context, final String str, final boolean z, final String str2, final IBaseResponseCallback iBaseResponseCallback) {
        SimpleChain.b("BasePairManagerApiImplconnectDevice").e(new SimpleChain.INext() { // from class: rcl
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                this.f47135b.a(context, emitter, objArr);
            }
        }).e(new SimpleChain.INext() { // from class: rcm
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                this.f47137a.d(context, emitter, objArr);
            }
        }).e(new SimpleChain.INext() { // from class: rcp
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                this.f47141c.b(context, emitter, objArr);
            }
        }).e(new SimpleChain.INext() { // from class: rco
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                this.f47140c.b(context, z, emitter, objArr);
            }
        }).d(new SimpleChain.Emitter() { // from class: rch.3
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public void onSuccess(Object... objArr) {
                rch.this.e(str, str2, iBaseResponseCallback);
            }

            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public void onError(String str3) {
                LogUtil.j("BasePairManagerApiImpl", "connectDevice onError:", str3);
                iBaseResponseCallback.a(0, false);
            }
        }, new Object[0]);
    }

    /* synthetic */ void a(Context context, SimpleChain.Emitter emitter, Object[] objArr) {
        b(context, emitter);
    }

    /* synthetic */ void d(Context context, SimpleChain.Emitter emitter, Object[] objArr) {
        e(context, emitter);
    }

    /* synthetic */ void b(Context context, SimpleChain.Emitter emitter, Object[] objArr) {
        e(context, emitter);
    }

    /* synthetic */ void b(Context context, boolean z, SimpleChain.Emitter emitter, Object[] objArr) {
        e(context, emitter, z);
    }

    private void e(final Context context, final SimpleChain.Emitter emitter, boolean z) {
        if (z) {
            emitter.onSuccess(new Object[0]);
            return;
        }
        if (Build.VERSION.SDK_INT < 29 || !CommonUtil.bt()) {
            if (this.f47121a != null) {
                ltd.e().d(this.f47121a);
            }
            this.f47121a = new CustomPermissionAction(context) { // from class: rch.2
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    emitter.onSuccess(new Object[0]);
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    super.onDenied(str);
                    LogUtil.a("BasePairManagerApiImpl", "requestPermissions Permission onDenied");
                    emitter.onError("checkPhoneStatePermission onDenied");
                    rch.this.d(context);
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                    LogUtil.a("BasePairManagerApiImpl", "requestPermissions Permission onForeverDenied");
                    emitter.onError("checkPhoneStatePermission onDenied");
                    rch.this.d(context);
                }
            };
            PermissionUtil.d(context, PermissionUtil.PermissionType.PHONE_STATE, this.f47121a);
            return;
        }
        emitter.onSuccess(new Object[0]);
    }

    private void b(Context context, final SimpleChain.Emitter emitter) {
        if (Build.VERSION.SDK_INT > 30) {
            PermissionUtil.d(context, PermissionUtil.PermissionType.SCAN, new BluetoothPermisionUtils.NearbyPermissionAction(context) { // from class: rch.1
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("BasePairManagerApiImpl", "nearby permission granted");
                    emitter.onSuccess(new Object[0]);
                }

                @Override // com.huawei.ui.device.utlis.BluetoothPermisionUtils.NearbyPermissionAction, com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    super.onDenied(str);
                    emitter.onError("checkBluetoothPermission onDenied");
                }

                @Override // com.huawei.ui.device.utlis.BluetoothPermisionUtils.NearbyPermissionAction, com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                    super.onForeverDenied(permissionType);
                    emitter.onError("checkBluetoothPermission onForeverDenied");
                }
            });
        } else {
            emitter.onSuccess(new Object[0]);
        }
    }

    private void e(Context context, final SimpleChain.Emitter emitter) {
        if (BluetoothAdapter.getDefaultAdapter() != null && !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            LogUtil.a("BasePairManagerApiImpl", "reConnect blue state: ", Integer.valueOf(BluetoothAdapter.getDefaultAdapter().getState()));
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).a(context.getResources().getString(R.string.IDS_device_bluetooth_open_request)).c(R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: rcg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47120b.a(emitter, view);
                }
            }).a(R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: rcj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    rch.b(emitter, view);
                }
            }).c();
            noTitleCustomAlertDialogC.setCancelable(false);
            noTitleCustomAlertDialogC.show();
            return;
        }
        emitter.onSuccess(new Object[0]);
    }

    /* synthetic */ void a(final SimpleChain.Emitter emitter, View view) {
        LogUtil.a("BasePairManagerApiImpl", "user choose open BT");
        BTDeviceMgrUtil.c().c(new BtSwitchStateCallback() { // from class: rch.4
            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
            public void onBtSwitchStateCallback(int i) {
                LogUtil.a("BasePairManagerApiImpl", "reconnect bluetoothSwitchState :", Integer.valueOf(i));
                if (i == 3) {
                    BTDeviceMgrUtil.c().e(this);
                    emitter.onSuccess(new Object[0]);
                }
            }
        });
    }

    static /* synthetic */ void b(SimpleChain.Emitter emitter, View view) {
        LogUtil.a("BasePairManagerApiImpl", "checkBluetoothEnable click NegativeButton");
        emitter.onError("checkBluetoothEnable click NegativeButton");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        rcv.a(BaseApplication.getContext());
        ReleaseLogUtil.d("BasePairManagerApiImpl", "enter startAddDevice():");
        String strB = rcn.b(str2);
        String strA = rcn.a(str2);
        int iC = lvi.c(strB);
        LogUtil.a("BasePairManagerApiImpl", "connectDevice, deviceProductType: ", Integer.valueOf(iC));
        DeviceParameter deviceParameter = new DeviceParameter();
        deviceParameter.setBluetoothType(rcn.e(iC));
        deviceParameter.setProductType(iC);
        deviceParameter.setDeviceNameInfo(strB);
        deviceParameter.setIsSupportHeartRate(false);
        deviceParameter.setProductPin(strA);
        deviceParameter.setIsBand(lvi.f(iC));
        deviceParameter.setNameFilter(rcn.b(iC));
        deviceParameter.setMac(str);
        List<DeviceInfo> listB = rcv.a(BaseApplication.getContext()).b();
        if (rdp.d(iC) || listB == null || listB.isEmpty()) {
            LogUtil.a("BasePairManagerApiImpl", "connectedDeviceInfo is null");
            d(iBaseResponseCallback, deviceParameter, "");
        } else if (listB.size() == 1) {
            a(iC, deviceParameter, listB, iBaseResponseCallback);
        } else {
            b(iC, deviceParameter, listB, iBaseResponseCallback);
        }
    }

    private void a(int i, DeviceParameter deviceParameter, List<DeviceInfo> list, IBaseResponseCallback iBaseResponseCallback) {
        DeviceInfo deviceInfo = list.get(0);
        boolean zD = eel.d(i);
        boolean zD2 = eel.d(deviceInfo.getProductType());
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (!zD2) {
            if (zD) {
                LogUtil.a("BasePairManagerApiImpl", "startAddDevice has one connected other device and want another aw70 device");
                d(iBaseResponseCallback, deviceParameter, "");
                return;
            } else {
                LogUtil.a("BasePairManagerApiImpl", "startAddDevice has one connected other device and want another other device");
                d(iBaseResponseCallback, deviceParameter, deviceIdentify);
                return;
            }
        }
        if (zD2 && deviceInfo.getAutoDetectSwitchStatus() == 1) {
            if (zD) {
                LogUtil.a("BasePairManagerApiImpl", "startAddDevice has one connected aw70 device in run mode and want another aw70 device");
                d(iBaseResponseCallback, deviceParameter, deviceIdentify);
                return;
            } else {
                LogUtil.a("BasePairManagerApiImpl", "startAddDevice has one connected aw70 device in run mode and want another other device");
                d(iBaseResponseCallback, deviceParameter, "");
                return;
            }
        }
        if (zD2 && deviceInfo.getAutoDetectSwitchStatus() == 0) {
            LogUtil.a("BasePairManagerApiImpl", "startAddDevice has one connected aw70 device and want another other device/aw70 device");
            d(iBaseResponseCallback, deviceParameter, deviceIdentify);
        } else {
            LogUtil.a("BasePairManagerApiImpl", "startAddDevice other condition");
        }
    }

    private void b(int i, DeviceParameter deviceParameter, List<DeviceInfo> list, IBaseResponseCallback iBaseResponseCallback) {
        if (eel.d(i)) {
            for (DeviceInfo deviceInfo : list) {
                if (eel.d(deviceInfo.getProductType())) {
                    LogUtil.a("BasePairManagerApiImpl", "startAddDevice has one connected aw70 device and want another aw70 device");
                    d(iBaseResponseCallback, deviceParameter, deviceInfo.getDeviceIdentify());
                    return;
                }
            }
            return;
        }
        for (DeviceInfo deviceInfo2 : list) {
            if (!eel.d(deviceInfo2.getProductType(), deviceInfo2.getAutoDetectSwitchStatus())) {
                LogUtil.a("BasePairManagerApiImpl", "startAddDevice has one connected device is other device");
                d(iBaseResponseCallback, deviceParameter, deviceInfo2.getDeviceIdentify());
                return;
            }
        }
    }

    private void d(final IBaseResponseCallback iBaseResponseCallback, DeviceParameter deviceParameter, String str) {
        rcv.a(BaseApplication.getContext()).a(deviceParameter, str, new IAddDeviceStateAIDLCallback.Stub() { // from class: rch.7
            @Override // com.huawei.hwservicesmgr.IAddDeviceStateAIDLCallback
            public void onAddDeviceState(int i) throws RemoteException {
                LogUtil.j("BasePairManagerApiImpl", "BT open error, state: ", Integer.valueOf(i));
                if (i == 1 || i == 2) {
                    iBaseResponseCallback.a(0, false);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final Context context) {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(context);
        builder.e(context.getString(R.string.IDS_hwh_home_other_permissions_title)).a(context.getString(R.string.IDS_hwh_home_other_permissions_content)).b(context.getString(R.string.IDS_main_btn_state_settings).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: rch.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qrs.al(context);
            }
        }).a(context.getString(R.string.IDS_hw_health_show_common_dialog_cancle_button).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: rch.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("BasePairManagerApiImpl", "handlePermission negative.");
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCanceledOnTouchOutside(false);
        customTextAlertDialogB.show();
    }

    @Override // com.huawei.devicepair.api.BasePairManagerApi
    public void disconnectDevice(String str, String str2, boolean z, final IBaseResponseCallback iBaseResponseCallback) {
        if (rcn.c(str2)) {
            String strB = rcn.b(str2);
            res.d().b(lvi.c(strB), strB);
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(str);
        if (!z) {
            rcv.a(BaseApplication.getContext()).b(arrayList, z);
            return;
        }
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi != null) {
            deviceGeneralSettingApi.deleteDevice(str, null, false, new DeleteDeviceCallback() { // from class: rch.6
                @Override // com.huawei.health.device.callback.DeleteDeviceCallback
                public void onSuccess() {
                    iBaseResponseCallback.a(0, "");
                    LogUtil.a("BasePairManagerApiImpl", "deleteDevice success.");
                }

                @Override // com.huawei.health.device.callback.DeleteDeviceCallback
                public void onFail(String str3) {
                    iBaseResponseCallback.a(-1, str3);
                    LogUtil.a("BasePairManagerApiImpl", "deleteDevice fail msg:", str3);
                }
            });
        }
    }

    @Override // com.huawei.devicepair.api.BasePairManagerApi
    public List<cjo> listDevice() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "BasePairManagerApiImpl");
        ArrayList arrayList = new ArrayList(16);
        if (!deviceList.isEmpty()) {
            for (DeviceInfo deviceInfo : deviceList) {
                cjo cjoVar = new cjo();
                cjoVar.b("5");
                cjoVar.d("5");
                cjm cjmVar = new cjm();
                cjmVar.a(String.valueOf(deviceInfo.getDeviceBluetoothType()));
                cjmVar.b(deviceInfo.getDeviceName());
                cjmVar.d(deviceInfo.getDeviceIdentify());
                if (lvi.f(deviceInfo.getProductType())) {
                    cjmVar.j("wear_band");
                } else {
                    cjmVar.j("wear_watch");
                }
                cjmVar.e(String.valueOf(deviceInfo.getProductType()));
                cjq cjqVar = new cjq();
                cjqVar.c(deviceInfo.getDeviceIdentify());
                cjqVar.d(deviceInfo.getBluetoothVersion());
                cjqVar.e(deviceInfo.getDeviceModel());
                cjqVar.b(deviceInfo.getHiLinkDeviceId());
                cjqVar.a(deviceInfo.getSecurityDeviceId());
                cjqVar.f(deviceInfo.getSoftVersion());
                cjqVar.g(deviceInfo.getEmuiVersion());
                cjqVar.j(String.valueOf(deviceInfo.getProductType()));
                cjmVar.a(cjqVar);
                a(deviceInfo, cjmVar);
                cjoVar.e(cjmVar);
                arrayList.add(cjoVar);
            }
        }
        return arrayList;
    }

    private void a(DeviceInfo deviceInfo, cjm cjmVar) {
        Drawable drawable;
        Bitmap bitmapLoadImageByImageName;
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.a(deviceInfo.getProductType()).aa());
        if (pluginInfoByUuid != null) {
            String strE = eep.e(pluginInfoByUuid, 2, deviceInfo);
            if (new File(pig.c().e(pluginInfoByUuid.c()) + File.separator + pluginInfoByUuid.c() + File.separator + "img" + File.separator + strE + ".png").exists() && (bitmapLoadImageByImageName = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(pluginInfoByUuid, strE)) != null) {
                LogUtil.j("BasePairManagerApiImpl", "deviceBitmapTemp is not null");
                cjmVar.c(rcn.d(bitmapLoadImageByImageName));
                return;
            }
        }
        boolean zD = d(deviceInfo.getProductType());
        ReleaseLogUtil.d("DEVMGR_BasePairManagerApiImpl", "deviceBitmapTemp isBand: ", Boolean.valueOf(zD));
        if (zD) {
            drawable = BaseApplication.getContext().getResources().getDrawable(R.mipmap.device_icon_band_default_new);
        } else {
            drawable = BaseApplication.getContext().getResources().getDrawable(R.mipmap.device_icon_watch_default_new);
        }
        cjmVar.c(rcn.d(qqf.a(drawable)));
    }

    private boolean d(int i) {
        String strB = CommonUtil.b(Process.myPid());
        if (TextUtils.isEmpty(strB)) {
            LogUtil.j("BasePairManagerApiImpl", "isDeviceBand processName isEmpty");
            return true;
        }
        if (strB.endsWith(":PhoneService")) {
            return mmx.g(i);
        }
        return lvi.f(i);
    }

    @Override // com.huawei.devicepair.api.BasePairManagerApi
    public String getOobePath(String str) {
        edn ednVarA = lvi.a(lvi.c(str));
        if (ednVarA != null) {
            String pluginIndexOobe = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginIndexOobe(ednVarA.aa());
            try {
                File filesDir = BaseApplication.getContext().getFilesDir();
                if (filesDir != null) {
                    return filesDir.getCanonicalPath() + File.separator + "plugins" + File.separator + pluginIndexOobe + File.separator + pluginIndexOobe + File.separator + "declaration";
                }
                return "";
            } catch (IOException unused) {
                LogUtil.e("BasePairManagerApiImpl", "getSourcePath catch IOException");
                return "";
            }
        }
        return "";
    }

    @Override // com.huawei.devicepair.api.BasePairManagerApi
    public void sendDeclarationInfoList(String str, String str2) {
        List<cjn> list = (List) HiJsonUtil.d(str2, new TypeToken<List<cjn>>() { // from class: com.huawei.ui.device.devicepairjs.BasePairManagerApiImpl$10
        }.getType());
        if (CollectionUtils.a(list)) {
            LogUtil.j("BasePairManagerApiImpl", "sendDeclarationInfoList, infos is empty");
            return;
        }
        String string = d(list).toString();
        LogUtil.a("BasePairManagerApiImpl", "getDeviceCommand commanHex:" + string);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setmIdentify(str);
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(48);
        deviceCommand.setDataContent(eeq.c(string));
        deviceCommand.setDataLen(eeq.c(string).length);
        lvb.e().c(deviceCommand);
        LogUtil.a("BasePairManagerApiImpl", "sendUserSettingCommand" + deviceCommand.toString());
    }

    private StringBuilder d(List<cjn> list) {
        StringBuilder sb = new StringBuilder(16);
        if (CollectionUtils.a(list)) {
            sb.append(eeq.d(129) + eeq.d(0));
            return sb;
        }
        for (cjn cjnVar : list) {
            if (cjnVar != null && !TextUtils.isEmpty(cjnVar.a())) {
                String strA = eeq.a(cjnVar.a());
                String str = eeq.d(3) + eeq.d(strA.length() / 2) + strA;
                String strD = eeq.d(cjnVar.c());
                String str2 = eeq.d(4) + eeq.d(strD.length() / 2) + strD;
                String strA2 = eeq.a(cjnVar.d());
                String str3 = eeq.d(5) + eeq.d(strA2.length() / 2) + strA2;
                String strA3 = eeq.a(cjnVar.e());
                String str4 = str + str2 + str3 + (eeq.d(6) + eeq.d(strA3.length() / 2) + strA3);
                sb.append(eeq.d(130) + eeq.d(str4.length() / 2) + str4);
            }
        }
        String str5 = eeq.d(129) + eeq.b(sb.length() / 2);
        if (sb.length() > 0) {
            sb.insert(0, str5);
        }
        return sb;
    }

    @Override // com.huawei.devicepair.api.BasePairManagerApi
    public boolean isSupportSyncAccount(String str) {
        DeviceCapability deviceCapabilityA = eej.a(str);
        if (deviceCapabilityA == null) {
            return false;
        }
        if (deviceCapabilityA.isSupportSyncAccount() && !Utils.h()) {
            LogUtil.a("BasePairManagerApiImpl", "empty account");
            return false;
        }
        return deviceCapabilityA.isSupportSyncAccount();
    }

    @Override // com.huawei.devicepair.api.BasePairManagerApi
    public boolean isSupportHwSynergy(String str) {
        return lvi.m(mgg.b(str, "BasePairManagerApiImpl").getProductType()) && eei.a();
    }

    @Override // com.huawei.devicepair.api.BasePairManagerApi
    public void hwSynergy(String str, int i) {
        eei.b(Boolean.valueOf(i == 1));
        mir.c(i == 1);
    }

    @Override // com.huawei.devicepair.api.BasePairManagerApi
    public boolean isSupportKeepAlive() {
        return nzz.c();
    }

    @Override // com.huawei.devicepair.api.BasePairManagerApi
    public void sendOobeStatus(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("BasePairManagerApiImpl", "sendOobeStatus: ", Boolean.valueOf(lvb.e().b("oobeCreated", deviceInfo, 0, null)));
    }

    @Override // com.huawei.devicepair.api.BasePairManagerApi
    public void startPair(Context context, StartPairOption startPairOption) {
        AppRouter.e(Uri.parse(startPairOption.creatDeepLink())).e(268435456).b(e(context));
    }

    @Override // com.huawei.devicepair.api.BasePairManagerApi
    public boolean isSupportH5Pair(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("BasePairManagerApiImpl", "isSupportH5Pair bluetoothName isEmpty");
            return false;
        }
        Iterator<String> it = d.iterator();
        boolean zContains = false;
        while (it.hasNext()) {
            zContains = str.toUpperCase(Locale.ROOT).contains(it.next());
        }
        ReleaseLogUtil.e("BasePairManagerApiImpl", "isSupportH5Pair is ", Boolean.valueOf(zContains));
        return zContains && !CommonUtil.bu();
    }

    public static Context e(Context context) {
        if (context instanceof Activity) {
            return context;
        }
        Activity activityJ = com.huawei.haf.application.BaseApplication.j();
        ReleaseLogUtil.e("BasePairManagerApiImpl", "getActivity topActivity ", activityJ);
        return activityJ == null ? com.huawei.haf.application.BaseApplication.b() : activityJ;
    }

    @Override // com.huawei.devicepair.api.BasePairManagerApi
    public void onSuccessPair(Context context, String str) {
        SharedPreferenceManager.c("privacy_center", "account_device", String.valueOf(System.currentTimeMillis()));
        DeviceInfo deviceInfoB = mgg.b(str, "BasePairManagerApiImpl");
        if (deviceInfoB != null) {
            a(deviceInfoB, str);
            a(deviceInfoB);
            b(str);
        }
        d(str);
        mga.h(deviceInfoB);
        mga.f();
        ino.b(context);
    }

    private void a(DeviceInfo deviceInfo, String str) {
        HashMap map = new HashMap(16);
        map.put("productId", str);
        map.put("deviceId", Integer.valueOf(lvi.a(deviceInfo.getProductType()).k()));
        LogUtil.a("BasePairManagerApiImpl", "PluginAchieve setEvent productID:", BTDeviceMgrUtil.c().e(str));
        oru.a(BaseApplication.getContext()).c(BaseApplication.getContext(), String.valueOf(1500), map);
    }

    private void a(DeviceInfo deviceInfo) {
        GuideInteractors guideInteractors = new GuideInteractors(BaseApplication.getContext());
        guideInteractors.e(true);
        if (rdp.d(deviceInfo.getProductType())) {
            return;
        }
        guideInteractors.b(true);
        guideInteractors.c(true);
        guideInteractors.a(true);
        guideInteractors.j(true);
    }

    private void b(String str) {
        LogUtil.a("BasePairManagerApiImpl", "enter setDeviceActiveTime");
        if (SharedPreferenceManager.a(BaseApplication.getContext(), String.valueOf(2000000)).contains(ckg.b(str))) {
            LogUtil.a("BasePairManagerApiImpl", "setDeviceActiveTime device already active.");
            return;
        }
        StorageParams storageParams = new StorageParams();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(2000000), ckg.b(str), String.valueOf(jCurrentTimeMillis), storageParams);
    }

    private void d(String str) {
        if (mgb.e(mgb.d(str))) {
            AppBundle.d().preDownloadPlugins(BaseApplication.getContext(), Collections.singletonList("PluginWearAbility"), true, true);
        }
        if (rdp.c()) {
            AppBundle.d().preDownloadPlugins(BaseApplication.getContext(), Collections.singletonList("PluginHiAiEngine"), true, true);
        }
        LogUtil.a("BasePairManagerApiImpl", "background downloading");
    }

    @Override // com.huawei.devicepair.api.BasePairManagerApi
    public void removeDevice(String str) {
        rdp.e(str);
    }

    @Override // com.huawei.devicepair.api.BasePairManagerApi
    public void onDestroyActivity() {
        ltd.e().d(this.f47121a);
        ltd.d();
    }
}
