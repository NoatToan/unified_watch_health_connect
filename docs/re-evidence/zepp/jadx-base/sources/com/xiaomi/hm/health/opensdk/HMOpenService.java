package com.xiaomi.hm.health.opensdk;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.huami.nfc.applet.api.SeAppletApi;
import com.huami.nfc.applet.api.SeInfoApi;
import com.huami.nfc.ble.IDeviceApi;
import com.huami.nfc.ble.NfcBleApi;
import com.huami.nfc.web.NfcDevice;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertApp;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.nfc.ApduRequest;
import com.xiaomi.hm.health.bt.profile.nfc.ApduResponse;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCBlockInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardInfo;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCCardType;
import com.xiaomi.hm.health.bt.profile.nfc.HMNFCStatus;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.NfcDeviceConfigKt;
import com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService;
import com.xiaomi.hm.health.nfc.bus.INFCOpenServiceWebAPI;
import com.xiaomi.hm.health.nfc.door.BandSupportBleDeviceKt;
import com.xiaomi.hm.health.nfc.service.CardInfoApi;
import com.xiaomi.hm.health.nfc.service.INfcOpenService;
import com.xiaomi.hm.health.nfc.service.NfcOpenService;
import com.xiaomi.hm.health.nfc.service.NfcOpenServiceTryException;
import com.xiaomi.hm.health.opensdk.model.HMApduRequest;
import com.xiaomi.hm.health.opensdk.model.HMApduResponse;
import com.xiaomi.hm.health.opensdk.model.HMReminder;
import com.xiaomi.hm.health.opensdk.model.NfcBlock;
import com.xiaomi.hm.health.opensdk.model.NfcTag;
import com.xiaomi.hm.health.reminder.ReminderExt;
import com.xiaomi.hm.health.reminder.ReminderUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
public class HMOpenService extends Service {
    public static final int STATE_CMD_FAILED = 3;
    public static final int STATE_INTERNAL_ERROR = 99;
    public static final int STATE_NOT_CONNECT = 2;
    public static final int STATE_NOT_SUPPORT = 1;
    public static final int STATE_OK = 0;
    public static final int STATE_PARAM_ERROR = 4;
    private static final String k = "HMOpenService";
    private Context a = null;
    private Lazy<SeAppletApi> b = KoinJavaComponent.inject(SeAppletApi.class);
    private Lazy<INFCOpenServiceWebAPI> c = KoinJavaComponent.inject(INFCOpenServiceWebAPI.class);
    private Lazy<NfcDevice> d = KoinJavaComponent.inject(NfcDevice.class);
    private Lazy<NfcBleApi> e = KoinJavaComponent.inject(NfcBleApi.class);
    private Lazy<SeInfoApi> f = KoinJavaComponent.inject(SeInfoApi.class);
    private Lazy<IDeviceApi> g = KoinJavaComponent.inject(IDeviceApi.class);
    private Lazy<DeviceSnService> h = KoinJavaComponent.inject(DeviceSnService.class);
    private INfcOpenService i = null;
    private final IHMOpenService.Stub j = new a();

    public class a extends IHMOpenService.Stub {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.opensdk.HMOpenService$a$a, reason: collision with other inner class name */
        public class C0985a implements IHMFirmwareUpgradeCallback {
            public final /* synthetic */ IHMCallback a;

            public C0985a(final IHMCallback val$cb) {
                this.a = val$cb;
            }

            @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
            public void onFwProgress(Progress progress) {
                try {
                    this.a.onProgress(progress.getPercent());
                } catch (Exception e) {
                    HMLog.d(HMOpenService.k, e.toString(), new Object[0]);
                }
            }

            @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
            public void onFwStart(int none) {
                try {
                    this.a.onStart();
                } catch (Exception e) {
                    HMLog.d(HMOpenService.k, e.toString(), new Object[0]);
                }
            }

            @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
            public void onFwStop(boolean result) {
                try {
                    this.a.onStop(result ? 1 : 0);
                } catch (Exception e) {
                    HMLog.d(HMOpenService.k, e.toString(), new Object[0]);
                }
            }
        }

        public a() {
        }

        private ArrayList<NfcBlock> a(List<HMNFCBlockInfo> infos) {
            ArrayList<NfcBlock> arrayList = new ArrayList<>();
            if (infos == null) {
                return arrayList;
            }
            for (HMNFCBlockInfo hMNFCBlockInfo : infos) {
                arrayList.add(new NfcBlock(hMNFCBlockInfo.getHeader(), hMNFCBlockInfo.getIndex(), hMNFCBlockInfo.getFlag(), hMNFCBlockInfo.getData()));
            }
            return arrayList;
        }

        private HMApduResponse b(HMApduRequest request, HMNFCCardType hmnfcCardType) {
            HMLog.d(HMOpenService.k, "sendApduRequest", new Object[0]);
            if (!NfcDeviceConfigKt.hasFeatureNfc()) {
                return new HMApduResponse(1);
            }
            HMBaseDevice hMBaseBleDevice = BandSupportBleDeviceKt.getHMBaseBleDevice();
            if (hMBaseBleDevice == null || !hMBaseBleDevice.isConnected()) {
                return new HMApduResponse(2);
            }
            ApduRequest apduRequest = new ApduRequest(request.getData(), request.getDataLen(), request.isEncrypt());
            if (hmnfcCardType == null) {
                hmnfcCardType = HMNFCCardType.UNKNOWN;
            }
            apduRequest.setType(hmnfcCardType);
            ApduResponse apduResponseSendNfcDataSync = ((HMMiLiProDevice) hMBaseBleDevice).sendNfcDataSync(apduRequest);
            return (apduResponseSendNfcDataSync == null || !apduResponseSendNfcDataSync.isValid()) ? new HMApduResponse(3) : new HMApduResponse(apduResponseSendNfcDataSync.getData(), apduResponseSendNfcDataSync.getLen(), 0);
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public int alert(String title, String message) throws RemoteException {
            HMBaseDevice hMBaseBleDevice = BandSupportBleDeviceKt.getHMBaseBleDevice();
            if (!(hMBaseBleDevice instanceof HMMiLiProDevice)) {
                return 1;
            }
            HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) hMBaseBleDevice;
            if (!hMMiLiProDevice.isConnected()) {
                return 2;
            }
            String string = HMOpenService.this.a.getResources().getString(R.string.app_name);
            HMAlertModeExt hMAlertModeExt = new HMAlertModeExt(HMAlertApp.MSPORT, title, message);
            hMAlertModeExt.setAppName(string);
            return hMMiLiProDevice.alertSync(hMAlertModeExt) ? 0 : 3;
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public int closeApduChannel() throws RemoteException {
            HMLog.d(HMOpenService.k, "closeApduChannel", new Object[0]);
            if (!NfcDeviceConfigKt.hasFeatureNfc()) {
                return 1;
            }
            HMBaseDevice hMBaseBleDevice = BandSupportBleDeviceKt.getHMBaseBleDevice();
            if (hMBaseBleDevice == null || !hMBaseBleDevice.isConnected()) {
                return 2;
            }
            HMNFCStatus hMNFCStatusDisconnectNfcSync = ((HMMiLiProDevice) hMBaseBleDevice).disconnectNfcSync();
            return (hMNFCStatusDisconnectNfcSync == null || !hMNFCStatusDisconnectNfcSync.isSuccess()) ? 3 : 0;
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public String deleteCard(Map info) throws RemoteException {
            return HMOpenService.this.h().deleteCard(info).json();
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public int dfu(int type, String path, final IHMCallback cb) throws RemoteException {
            HMBaseDevice hMBaseBleDevice = BandSupportBleDeviceKt.getHMBaseBleDevice();
            if (!(hMBaseBleDevice instanceof HMMiLiProDevice)) {
                return 1;
            }
            HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) hMBaseBleDevice;
            if (!hMMiLiProDevice.isConnected()) {
                return 2;
            }
            hMMiLiProDevice.updateFwUpgrade(new HMFirmwareInfo(path, HMFirmwareType.fromValue(type)), new C0985a(cb));
            return 0;
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public String getMacAddress() throws RemoteException {
            return HMDeviceManager.getInstance().getBoundDeviceAddress(HMDeviceType.MILI);
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public NfcTag getNfcTag() throws RemoteException {
            if (!NfcDeviceConfigKt.hasFeatureNfc()) {
                throw new IllegalStateException("STATE_NOT_SUPPORT");
            }
            HMBaseDevice hMBaseBleDevice = BandSupportBleDeviceKt.getHMBaseBleDevice();
            if (hMBaseBleDevice == null || !hMBaseBleDevice.isConnected()) {
                throw new IllegalStateException("STATE_NOT_CONNECT");
            }
            HMNFCCardInfo nfcCardInfoSync = ((HMMiLiProDevice) hMBaseBleDevice).getNfcCardInfoSync();
            if (nfcCardInfoSync != null) {
                return new NfcTag(nfcCardInfoSync.getHeader(), nfcCardInfoSync.getResult(), nfcCardInfoSync.getAtqa(), nfcCardInfoSync.getSak(), nfcCardInfoSync.getUidLen(), nfcCardInfoSync.getUid(), nfcCardInfoSync.getBlockNum(), a(nfcCardInfoSync.getBlockInfos()), nfcCardInfoSync.getBlockData());
            }
            throw new IllegalStateException("STATE_CMD_FAILED");
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public String getSN() throws RemoteException {
            return ((DeviceSnService) HMOpenService.this.h.getValue()).getSn(HMDeviceType.MILI);
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public String getSeId(Map info) throws RemoteException {
            return HMOpenService.this.h().getSeId(info).json();
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService.Stub, android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            String nameForUid = HMOpenService.this.getPackageManager().getNameForUid(Binder.getCallingUid());
            HMLog.i(HMOpenService.k, "callingApp:" + nameForUid, new Object[0]);
            if (TextUtils.isEmpty(nameForUid)) {
                HMLog.i(HMOpenService.k, "未获取到调用者包名信息。", new Object[0]);
                return false;
            }
            if (!HMOpenService.this.f(nameForUid, code)) {
                HMLog.i(HMOpenService.k, "没有权限使用此方法。TRANSACTION code: " + code, new Object[0]);
                return false;
            }
            String appSignatureSHA1 = SignatureKt.getAppSignatureSHA1(HMOpenService.this.a, nameForUid);
            if (HMOpenService.this.g(nameForUid, appSignatureSHA1)) {
                return super.onTransact(code, data, reply, flags);
            }
            HMLog.i(HMOpenService.k, "未配置签名信息或签名不匹配。调用签名信息为：" + appSignatureSHA1, new Object[0]);
            return false;
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public int openApduChannel() throws RemoteException {
            HMLog.d(HMOpenService.k, "openApduChannel", new Object[0]);
            if (!NfcDeviceConfigKt.hasFeatureNfc()) {
                return 1;
            }
            HMBaseDevice hMBaseBleDevice = BandSupportBleDeviceKt.getHMBaseBleDevice();
            if (hMBaseBleDevice == null || !hMBaseBleDevice.isConnected()) {
                return 2;
            }
            HMNFCStatus hMNFCStatusConnectNfcSync = ((HMMiLiProDevice) hMBaseBleDevice).connectNfcSync(null);
            return (hMNFCStatusConnectNfcSync == null || !hMNFCStatusConnectNfcSync.isSuccess()) ? 3 : 0;
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public String queryCardInfo(Map info) throws RemoteException {
            return HMOpenService.this.h().queryCardInfo(info).json();
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public HMApduResponse sendApduRequest(HMApduRequest request) {
            return b(request, null);
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public HMApduResponse sendMasterApduRequest(HMApduRequest request) {
            return b(request, HMNFCCardType.MASTERCARD);
        }

        @Override // com.xiaomi.hm.health.opensdk.IHMOpenService
        public int setReminder(HMReminder reminder) throws RemoteException {
            HMBaseDevice hMBaseBleDevice = BandSupportBleDeviceKt.getHMBaseBleDevice();
            if (!(hMBaseBleDevice instanceof HMMiLiProDevice)) {
                return 1;
            }
            HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) hMBaseBleDevice;
            if (!hMMiLiProDevice.isConnected()) {
                return 2;
            }
            ReminderExt reminderExt = new ReminderExt();
            reminderExt.setId(reminder.getId());
            reminderExt.setOp(reminder.getOp());
            reminderExt.setLoop(reminder.getLoop());
            reminderExt.setFrom(1);
            reminderExt.setTitle(reminder.getTitle());
            reminderExt.setBody(reminder.getBody());
            reminderExt.setStartDate(reminder.getStartDate());
            reminderExt.setStopDate(reminder.getStopDate());
            reminderExt.setVibrateType(reminder.getVibrateType());
            ArrayList arrayList = new ArrayList();
            arrayList.add(reminderExt);
            return hMMiLiProDevice.setReminderSync(ReminderUtils.createReminders(arrayList)) ? 0 : 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(String callingApp, int code) {
        return ServicePermissionKt.getPermissionGroupByKey(callingApp).contains(Integer.valueOf(code));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(String callingApp, String signature) {
        return ServicePermissionKt.getSignatureListByKey(callingApp).contains(signature);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public INfcOpenService h() {
        if (this.i == null) {
            SeInfoApi value = this.f.getValue();
            INFCOpenServiceWebAPI value2 = this.c.getValue();
            this.i = new NfcOpenServiceTryException(new NfcOpenService(this.d.getValue(), value, value2, new CardInfoApi(this.b.getValue(), value2), this.g.getValue(), this.e.getValue()));
        }
        return this.i;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return this.j;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.a = this;
    }
}
