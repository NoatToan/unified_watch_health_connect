package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.callback.FitnessCloudCallBack;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetBindDeviceReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.UnbindDeviceRequest;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.intelligent.ReleaseDeviceLinkageResponse;
import com.huawei.hwcloudmodel.model.userprofile.GetBindDeviceRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwdevice.outofprocess.mgr.device.ProfileAgent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.profile.client.connect.ServiceConnectCallback;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.device.utlis.FindNetworkUtils;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.util.ReconnectUtils;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public class rts {
    public static SimpleChain d(final Activity activity, final DeviceInfo deviceInfo, final boolean z) {
        return SimpleChain.b("deleteDevice").e(new SimpleChain.INext() { // from class: rto
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                ReconnectUtils.b(emitter, activity, deviceInfo);
            }
        }).e(new SimpleChain.INext() { // from class: rtu
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                ReconnectUtils.e(emitter, activity, deviceInfo);
            }
        }).e(new SimpleChain.INext() { // from class: rtt
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                rts.a(emitter, activity, deviceInfo, z);
            }
        }).e(new SimpleChain.INext() { // from class: rtw
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter, Object[] objArr) {
                rts.a(emitter, deviceInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(SimpleChain.Emitter emitter, Activity activity, final DeviceInfo deviceInfo, boolean z) {
        SimpleChain.b("unbindIntelligent").e(new SimpleChain.INext() { // from class: rts.5
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public void onNext(final SimpleChain.Emitter emitter2, Object... objArr) {
                mhs.a().getSwitchSetting("intelligent_home_linkage", deviceInfo.getDeviceIdentify(), new IBaseResponseCallback() { // from class: rts.5.2
                    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        String str;
                        boolean z2 = false;
                        if (i == 0 && (obj instanceof String)) {
                            String str2 = (String) obj;
                            if (str2.contains(Constants.PARAM_SERVER_SPLIT)) {
                                String[] strArrSplit = str2.split(Constants.PARAM_SERVER_SPLIT);
                                LogUtil.a("DeleteDeviceUtils", "getIntelligentStatus splits length is ", Integer.valueOf(strArrSplit.length));
                                if (strArrSplit.length == 5) {
                                    str = strArrSplit[0];
                                    z2 = true;
                                } else {
                                    str = "";
                                }
                            } else {
                                str = "";
                            }
                        } else {
                            str = "";
                        }
                        LogUtil.a("DeleteDeviceUtils", "getIntelligentStatus isEnable = ", Boolean.valueOf(z2));
                        emitter2.onSuccess(Boolean.valueOf(z2), str);
                    }
                });
            }
        }).e(new AnonymousClass1(activity, deviceInfo, emitter, z)).d(emitter, new Object[0]);
    }

    /* JADX INFO: renamed from: rts$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes43.dex */
    class AnonymousClass1 implements SimpleChain.INext {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f47645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SimpleChain.Emitter f47646c;
        final /* synthetic */ boolean d;
        final /* synthetic */ DeviceInfo e;

        AnonymousClass1(Activity activity, DeviceInfo deviceInfo, SimpleChain.Emitter emitter, boolean z) {
            this.f47645b = activity;
            this.e = deviceInfo;
            this.f47646c = emitter;
            this.d = z;
        }

        @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
        public void onNext(SimpleChain.Emitter emitter, Object... objArr) {
            if (objArr.length == 2) {
                Object obj = objArr[0];
                if ((obj instanceof Boolean) && (objArr[1] instanceof String)) {
                    final boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    final String str = (String) objArr[1];
                    this.f47645b.runOnUiThread(new Runnable() { // from class: rts.1.3
                        @Override // java.lang.Runnable
                        public void run() {
                            LogUtil.a("DeleteDeviceUtils", "updateIntelligentStatus enter");
                            if (CommonUtil.ab(BaseApplication.getContext())) {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                anonymousClass1.b(anonymousClass1.f47645b, AnonymousClass1.this.e, zBooleanValue, str);
                            } else {
                                AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                                anonymousClass2.d(zBooleanValue, str, anonymousClass2.e);
                            }
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(boolean z, String str, DeviceInfo deviceInfo) {
            if (z) {
                e(this.f47646c, str, String.format(Locale.ENGLISH, this.f47645b.getString(R.string.IDS_device_to_intelligent_home_linkage_remove_pairing), this.f47645b.getString(R.string.IDS_app_name_health), this.f47645b.getString(R.string.IDS_device_intelligent_home)), deviceInfo, false);
            } else {
                c(this.f47646c, this.f47645b.getResources().getString(R.string.IDS_unbind_device_wear_home), deviceInfo, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(boolean z, String str, DeviceInfo deviceInfo) {
            if (z) {
                e(this.f47646c, str, String.format(Locale.ENGLISH, this.f47645b.getString(R.string.IDS_device_to_intelligent_home_linkage_findnet_remove_pairing), this.f47645b.getString(R.string.IDS_app_name_health), this.f47645b.getString(R.string.IDS_device_intelligent_home)), deviceInfo, true);
            } else {
                c(this.f47646c, this.f47645b.getResources().getString(R.string.IDS_find_network_delete), deviceInfo, true);
            }
        }

        /* JADX INFO: renamed from: rts$1$1, reason: invalid class name and collision with other inner class name */
        class C03581 implements FindNetworkUtils.IFindNetworkCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f47647a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ DeviceInfo f47648b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Activity f47649c;
            final /* synthetic */ boolean d;

            C03581(Activity activity, boolean z, String str, DeviceInfo deviceInfo) {
                this.f47649c = activity;
                this.d = z;
                this.f47647a = str;
                this.f47648b = deviceInfo;
            }

            @Override // com.huawei.ui.device.utlis.FindNetworkUtils.IFindNetworkCallback
            public void onSuccess(final int i, HashMap<String, Object> map) {
                Activity activity = this.f47649c;
                if (activity == null) {
                    LogUtil.j("DeleteDeviceUtils", "activity is null");
                    return;
                }
                final boolean z = this.d;
                final String str = this.f47647a;
                final DeviceInfo deviceInfo = this.f47648b;
                activity.runOnUiThread(new Runnable() { // from class: ruc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47670a.a(i, z, str, deviceInfo);
                    }
                });
            }

            /* synthetic */ void a(int i, boolean z, String str, DeviceInfo deviceInfo) {
                if (i == 1) {
                    AnonymousClass1.this.e(z, str, deviceInfo);
                } else {
                    AnonymousClass1.this.d(z, str, deviceInfo);
                }
            }

            @Override // com.huawei.ui.device.utlis.FindNetworkUtils.IFindNetworkCallback
            public void onFail(String str) {
                LogUtil.j("DeleteDeviceUtils", "queryRegisterStatus fail message:", str);
                Activity activity = this.f47649c;
                if (activity == null) {
                    LogUtil.j("DeleteDeviceUtils", "activity is null");
                    return;
                }
                final boolean z = this.d;
                final String str2 = this.f47647a;
                final DeviceInfo deviceInfo = this.f47648b;
                activity.runOnUiThread(new Runnable() { // from class: rtz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47664b.c(z, str2, deviceInfo);
                    }
                });
            }

            /* synthetic */ void c(boolean z, String str, DeviceInfo deviceInfo) {
                AnonymousClass1.this.d(z, str, deviceInfo);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(Activity activity, DeviceInfo deviceInfo, boolean z, String str) {
            FindNetworkUtils.e(deviceInfo, com.huawei.haf.application.BaseApplication.b(), new C03581(activity, z, str, deviceInfo));
        }

        private void c(final SimpleChain.Emitter emitter, String str, final DeviceInfo deviceInfo, final boolean z) {
            if (this.d) {
                LogUtil.a("DeleteDeviceUtils", 1, "DeleteDeviceUtils", "enter showRestoreFactoryDialog()");
                CustomTextAlertDialog.Builder builderB = new CustomTextAlertDialog.Builder(this.f47645b).a(R.string.IDS_device_wear_home_delete_device).a(str).a(R.string.IDS_unbind_device_wear_home_unpair, new View.OnClickListener() { // from class: rtx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        rts.AnonymousClass1.b(z, deviceInfo, emitter, view);
                    }
                }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: rtv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        rts.AnonymousClass1.b(emitter, view);
                    }
                }).b(Integer.valueOf(com.huawei.hwdevicemgr.R.color.blood_pressure_dialog_negative));
                if (this.f47645b.isFinishing()) {
                    return;
                }
                CustomTextAlertDialog customTextAlertDialogB = builderB.b();
                customTextAlertDialogB.setCancelable(false);
                customTextAlertDialogB.show();
                return;
            }
            LogUtil.a("DeleteDeviceUtils", 1, "DeleteDeviceUtils", " showRestoreFactoryDialog isShowConfirmDialog：", Boolean.valueOf(this.d));
            if (z) {
                FindNetworkUtils.b(deviceInfo, BaseApplication.getContext());
            }
            rdt.e(3);
            emitter.onSuccess(new Object[0]);
        }

        static /* synthetic */ void b(boolean z, DeviceInfo deviceInfo, SimpleChain.Emitter emitter, View view) {
            LogUtil.a("DeleteDeviceUtils", "showUnbindDialog ok click");
            if (z) {
                FindNetworkUtils.b(deviceInfo, BaseApplication.getContext());
            }
            rdt.e(3);
            emitter.onSuccess(new Object[0]);
        }

        static /* synthetic */ void b(SimpleChain.Emitter emitter, View view) {
            LogUtil.a("DeleteDeviceUtils", "showUnbindDialog cancel click");
            emitter.onError("showUnbindDialog cancel click");
        }

        private void e(final SimpleChain.Emitter emitter, final String str, String str2, final DeviceInfo deviceInfo, final boolean z) {
            LogUtil.a("DeleteDeviceUtils", 1, "DeleteDeviceUtils", "enter showUnbindIntelligentHomeDialog()");
            boolean z2 = this.d;
            if (!z2) {
                LogUtil.a("DeleteDeviceUtils", 1, "DeleteDeviceUtils", " showUnbindIntelligentHomeDialog isShowConfirmDialog：", Boolean.valueOf(z2));
                if (z) {
                    FindNetworkUtils.b(deviceInfo, BaseApplication.getContext());
                }
                emitter.onSuccess(new Object[0]);
                d(str);
                return;
            }
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f47645b).a(R.string.IDS_device_wear_home_delete_device).a(str2).a(R.string.IDS_music_management_delete, new View.OnClickListener() { // from class: rua
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f47668c.a(z, deviceInfo, emitter, str, view);
                }
            }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: rub
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    rts.AnonymousClass1.e(emitter, view);
                }
            }).b();
            customTextAlertDialogB.setCancelable(false);
            customTextAlertDialogB.show();
        }

        /* synthetic */ void a(boolean z, DeviceInfo deviceInfo, SimpleChain.Emitter emitter, String str, View view) {
            if (z) {
                FindNetworkUtils.b(deviceInfo, BaseApplication.getContext());
            }
            emitter.onSuccess(new Object[0]);
            d(str);
        }

        static /* synthetic */ void e(SimpleChain.Emitter emitter, View view) {
            LogUtil.d("DeleteDeviceUtils", "showUnbindIntelligentHomeDialog cancel click");
            emitter.onError("showUnbindIntelligentHomeDialog cancel click");
        }

        private void d(String str) {
            LogUtil.d("DeleteDeviceUtils", "showUnbindDialog ok click");
            lxe.a(BaseApplication.getContext()).d(str, new FitnessCloudCallBack() { // from class: rts.1.2
                @Override // com.huawei.callback.FitnessCloudCallBack
                public void onResponce(Object obj) {
                    if (obj instanceof ReleaseDeviceLinkageResponse) {
                        ReleaseDeviceLinkageResponse releaseDeviceLinkageResponse = (ReleaseDeviceLinkageResponse) obj;
                        if (releaseDeviceLinkageResponse.getResultCode().intValue() == 0) {
                            mhs.a().setSwitchSetting("intelligent_home_linkage", null, AnonymousClass1.this.e.getDeviceIdentify(), null);
                            LogUtil.a("DeleteDeviceUtils", "releaseDeviceLinkage is success ", releaseDeviceLinkageResponse.getResultCode(), Constants.LINK, releaseDeviceLinkageResponse.getResultDesc());
                            return;
                        } else {
                            LogUtil.j("DeleteDeviceUtils", "releaseDeviceLinkage is fail ", releaseDeviceLinkageResponse.getResultCode() + Constants.LINK, releaseDeviceLinkageResponse.getResultDesc());
                            return;
                        }
                    }
                    LogUtil.j("DeleteDeviceUtils", "releaseDeviceLinkage is fail");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(SimpleChain.Emitter emitter, DeviceInfo deviceInfo) {
        if (deviceInfo instanceof CloudDeviceInfo) {
            a(emitter, (CloudDeviceInfo) deviceInfo);
            return;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        LogUtil.a("DeleteDeviceUtils", 0, "DeleteDeviceUtils", "Enter unbindDevice");
        rcw.b(BaseApplication.getContext()).b(deviceInfo);
        rcw.b(BaseApplication.getContext()).g(deviceIdentify);
        LogUtil.a("DeleteDeviceUtils", "deleteDevice");
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(deviceIdentify);
        tfn.a().b(arrayList, true);
        b();
        DeviceCapability deviceCapabilityA = eej.a(deviceIdentify);
        if (deviceCapabilityA != null && deviceCapabilityA.isSupportSyncWifi()) {
            KeyValDbManager.d(BaseApplication.getContext()).b("saved_support_sync_wifi", "0");
        }
        rdt.e(deviceInfo);
        tqp.a(deviceInfo.getProductType(), deviceIdentify);
        c(deviceInfo);
        meo.a().e(deviceInfo);
        e(deviceInfo);
        a(deviceInfo);
        lvl.a(deviceInfo);
        e();
        lvb.e().b("deleteDevice", deviceInfo, 0, "");
        emitter.onSuccess(new Object[0]);
    }

    private static void a(SimpleChain.Emitter emitter, CloudDeviceInfo cloudDeviceInfo) {
        LogUtil.a("DeleteDeviceUtils", "unbindCloudDevice");
        String strA = a(cloudDeviceInfo);
        rcw.b(BaseApplication.getContext()).b(cloudDeviceInfo);
        tfi.c(strA);
        rdt.b(cloudDeviceInfo.getDeviceName());
        lmf.d().c(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        b();
        lvb.e().b("deleteDevice", cloudDeviceInfo, 0, "");
        emitter.onSuccess(new Object[0]);
    }

    private static String a(CloudDeviceInfo cloudDeviceInfo) {
        String smartDeviceUdid = cloudDeviceInfo.getSmartDeviceUdid();
        if (TextUtils.isEmpty(smartDeviceUdid) && cloudDeviceInfo.getSecurityUuid() != null) {
            smartDeviceUdid = cloudDeviceInfo.getSecurityUuid() + "#ANDROID21";
        }
        LogUtil.a("DeleteDeviceUtils", "deviceUuid length:", Integer.valueOf(smartDeviceUdid.length()));
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(cloudDeviceInfo.getDeviceIdentify());
        tfn.a().b(arrayList, true);
        lvl.a(cloudDeviceInfo);
        return smartDeviceUdid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        List<MessageObject> messages = messageCenterApi.getMessages(String.valueOf(19), "device_type_connected");
        LogUtil.a("DeleteDeviceUtils", "deleteDeviceInfo, delete messageList, messageList.size():", Integer.valueOf(messages.size()));
        int size = messages.size();
        for (int i = 0; i < size; i++) {
            try {
                messageCenterApi.deleteMessage(messages.get(i).getMsgId());
                lvb.e().setSharedPreference("kStorage_DeviceCfgMgr_Identify", "", null);
                LogUtil.d("DeleteDeviceUtils", "deleteDeviceInfo delete success");
            } catch (NumberFormatException unused) {
                LogUtil.e("DeleteDeviceUtils", "deleteDeviceInfo error");
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            LogUtil.a("DeleteDeviceUtils", "get device info");
            String strD = erh.d(deviceInfo.getDeviceIdentify());
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(PrebakedEffectId.RT_COIN_DROP), strD);
            LogUtil.a("DeleteDeviceUtils", "sharedPreferenceResult is ", strE);
            if (!TextUtils.isEmpty(strE) && strE.equals("0")) {
                SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(PrebakedEffectId.RT_COIN_DROP), strD);
            }
            SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10005), "keyUserGuidePage" + strD);
            SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10008), "keyToastShowTime" + strD);
            KeyValDbManager.d(BaseApplication.getContext()).d("downloadHiAiPlugin");
        }
    }

    private static void e(final DeviceInfo deviceInfo) {
        if (Utils.o() || deviceInfo == null) {
            return;
        }
        ProfileAgent.PROFILE_AGENT.connectProfile(new ServiceConnectCallback() { // from class: rts.3
            @Override // com.huawei.profile.client.connect.ServiceConnectCallback
            public void onConnect() {
                LogUtil.a("DeleteDeviceUtils", "profile connected");
                ProfileAgent.PROFILE_AGENT.setConnected(true);
                ThreadPoolManager.c().execute(new Runnable() { // from class: rts.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        new mgz().a(deviceInfo.getSecurityUuid() + "#ANDROID21");
                        ProfileAgent.PROFILE_AGENT.disconnectProfile();
                    }
                });
            }

            @Override // com.huawei.profile.client.connect.ServiceConnectCallback
            public void onDisconnect() {
                ProfileAgent.PROFILE_AGENT.setConnected(false);
                LogUtil.a("DeleteDeviceUtils", "profile disconnected");
            }
        });
    }

    private static void a(DeviceInfo deviceInfo) {
        LogUtil.a("DeleteDeviceUtils", "removeCloudDevice removedDeviceInfo is ", deviceInfo.toString());
        String deviceModel = deviceInfo.getDeviceModel();
        if (deviceModel == null || !deviceModel.toUpperCase(Locale.ENGLISH).contains("HECTOR")) {
            LogUtil.j("DeleteDeviceUtils", "removeCloudDevice getDeviceModel not contains HECTOR");
        } else {
            final String deviceName = deviceInfo.getDeviceName();
            lsy.a(new Runnable() { // from class: rts.2
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("DeleteDeviceUtils", "removeCloudDevice run() getAllBindDeviceSync");
                    GetBindDeviceRsp getBindDeviceRspA = lqo.b(BaseApplication.getContext()).a(new GetBindDeviceReq());
                    if (!a(getBindDeviceRspA)) {
                        LogUtil.e("DeleteDeviceUtils", "removeCloudDevice getBindDeviceSync error");
                        return;
                    }
                    List<com.huawei.hwcloudmodel.model.userprofile.DeviceInfo> deviceInfos = getBindDeviceRspA.getDeviceInfos();
                    if (deviceInfos == null || deviceInfos.isEmpty()) {
                        LogUtil.j("DeleteDeviceUtils", "getBindDeviceSync deviceInfos is null");
                        return;
                    }
                    for (com.huawei.hwcloudmodel.model.userprofile.DeviceInfo deviceInfo2 : deviceInfos) {
                        if (deviceName == null || deviceInfo2 == null || TextUtils.isEmpty(deviceInfo2.getName())) {
                            LogUtil.j("DeleteDeviceUtils", "getBindDeviceSync info data error");
                        } else if (deviceInfo2.getName().equals(deviceName)) {
                            LogUtil.a("DeleteDeviceUtils", "cloud DeviceInfo is ", deviceInfo2.toString());
                            b(deviceInfo2.getDeviceCode().longValue());
                            return;
                        }
                    }
                }

                private boolean a(GetBindDeviceRsp getBindDeviceRsp) {
                    if (getBindDeviceRsp == null) {
                        LogUtil.j("DeleteDeviceUtils", "checkCloudResponse response is null");
                        return false;
                    }
                    Integer resultCode = getBindDeviceRsp.getResultCode();
                    int iIntValue = resultCode.intValue();
                    LogUtil.a("DeleteDeviceUtils", "checkCloudResponse response resultCode is,", resultCode);
                    return iIntValue == 0;
                }

                private void b(long j) {
                    LogUtil.a("DeleteDeviceUtils", "unBindDevice enter");
                    UnbindDeviceRequest unbindDeviceRequest = new UnbindDeviceRequest();
                    unbindDeviceRequest.setDeviceCode(Long.valueOf(j));
                    CloudCommonReponse cloudCommonReponseD = lqo.b(BaseApplication.getContext()).d(unbindDeviceRequest);
                    if (cloudCommonReponseD != null) {
                        LogUtil.a("DeleteDeviceUtils", "unBindDevice response is ", cloudCommonReponseD.toString());
                    } else {
                        LogUtil.j("DeleteDeviceUtils", "unBindDevice response is null");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        LogUtil.a("DeleteDeviceUtils", 0, "DeleteDeviceUtils", "Enter sendDeviceListChangeBroadcast()");
        if (CommonUtil.ck()) {
            eem.a(tfn.a().k(), "DeleteDeviceUtils");
        }
    }

    public static void b(Activity activity, boolean z, final BaseResponseCallback<Boolean> baseResponseCallback) throws Throwable {
        if (!Utils.h() || LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            ReleaseLogUtil.e("R_DeleteDeviceUtils", "checkUserChanger no ifAllowLogin or isBrowseMode");
            baseResponseCallback.onResponse(0, false);
            return;
        }
        String strB = KeyValDbManager.d(BaseApplication.getContext()).b("user_id_at_device", new StorageParams(14));
        String strC = cqm.c(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        if (TextUtils.isEmpty(strB)) {
            LogUtil.a("DeleteDeviceUtils", "checkUserChanger Sp no USER_ID_AT_DEVICE");
            KeyValDbManager.d(BaseApplication.getContext()).b("user_id_at_device", strC, new StorageParams(14));
            baseResponseCallback.onResponse(0, false);
        } else {
            if (Objects.equals(strB, strC)) {
                baseResponseCallback.onResponse(0, false);
                return;
            }
            LogUtil.a("DeleteDeviceUtils", "checkLogin user changer");
            KeyValDbManager.d(BaseApplication.getContext()).b("user_id_at_device", strC, new StorageParams(14));
            if (com.huawei.haf.application.BaseApplication.j() == activity && z) {
                AppRouter.c("/home/main").c(com.huawei.operation.utils.Constants.HOME_TAB_NAME, com.huawei.operation.utils.Constants.HOME).b(activity);
            }
            b(new BaseResponseCallback<Boolean>() { // from class: rts.4
                @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onResponse(int i, Boolean bool) {
                    LogUtil.a("DeleteDeviceUtils", "checkLogin onResponse idDone:", bool);
                    baseResponseCallback.onResponse(0, true);
                }
            });
        }
    }

    private static void b(final BaseResponseCallback<Boolean> baseResponseCallback) {
        ThreadPoolManager.c().a("cleanAllWearDevice", new Runnable() { // from class: rts.10
            @Override // java.lang.Runnable
            public void run() {
                boolean zAwait;
                CountDownLatch countDownLatch = new CountDownLatch(2);
                rts.b(countDownLatch);
                rts.a(countDownLatch);
                try {
                    zAwait = countDownLatch.await(30L, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                    LogUtil.j("DeleteDeviceUtils", "cleanAllWearDevice InterruptedException");
                    zAwait = false;
                }
                BaseResponseCallback baseResponseCallback2 = baseResponseCallback;
                if (baseResponseCallback2 != null) {
                    baseResponseCallback2.onResponse(0, Boolean.valueOf(zAwait));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final CountDownLatch countDownLatch) {
        ThreadPoolManager.c().a("unbindAllPairDevice", new Runnable() { // from class: rts.7
            @Override // java.lang.Runnable
            public void run() {
                List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "DeleteDeviceUtils");
                if (coq.d(deviceList)) {
                    LogUtil.j("DeleteDeviceUtils", "unbindAllPairDevice getDeviceList deviceInfos isEmpty");
                    countDownLatch.countDown();
                    return;
                }
                ArrayList arrayList = new ArrayList(16);
                Iterator<DeviceInfo> it = deviceList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getDeviceIdentify());
                }
                LogUtil.a("DeleteDeviceUtils", "unbindAllPairDevice unPair macList");
                tfn.a().b(arrayList, true);
                rts.b();
                d(deviceList);
                countDownLatch.countDown();
            }

            private void d(List<DeviceInfo> list) {
                for (DeviceInfo deviceInfo : list) {
                    tqp.a(deviceInfo.getProductType(), deviceInfo.getDeviceIdentify());
                    rts.c(deviceInfo);
                    rts.e();
                    lvb.e().b("deleteDevice", deviceInfo, 0, "");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final CountDownLatch countDownLatch) {
        ThreadPoolManager.c().a("checkShowNewDeviceGuide", new Runnable() { // from class: rts.6
            @Override // java.lang.Runnable
            public void run() {
                lvl.e();
                countDownLatch.countDown();
            }
        });
    }
}
