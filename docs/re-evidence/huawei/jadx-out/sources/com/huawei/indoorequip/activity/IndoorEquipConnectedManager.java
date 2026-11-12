package com.huawei.indoorequip.activity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.nfc.NdefMessage;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.btsportdevice.callback.DataLifecycle;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.device.base.AbstractFitnessClient;
import com.huawei.health.device.model.DeviceInformation;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.datastruct.QrCodeOrNfcInfo;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import defpackage.etn;
import defpackage.lsy;
import defpackage.njy;
import defpackage.nwa;
import defpackage.nxs;
import defpackage.nzc;
import health.compact.a.HuaweiHealth;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes12.dex */
public class IndoorEquipConnectedManager implements DataLifecycle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f17780a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BluetoothAdapter f17782c;
    private Context d;
    private nwa g;
    private Handler i;
    private OnNfcConnectListener j;
    private long k = 0;
    private long m = 0;
    private boolean f = false;
    private String o = "Other";
    private QrCodeOrNfcInfo h = null;
    private String e = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17781b = "";

    public interface OnNfcConnectListener {
        void onQrCodeOrNfcInfoSet(QrCodeOrNfcInfo qrCodeOrNfcInfo);

        void onStartTimeChange(long j);
    }

    @Override // com.huawei.btsportdevice.callback.DataLifecycle
    public void onPause() {
    }

    @Override // com.huawei.btsportdevice.callback.DataLifecycle
    public void onResume() {
    }

    @Override // com.huawei.btsportdevice.callback.DataLifecycle
    public void onStart() {
    }

    public IndoorEquipConnectedManager(Context context, OnNfcConnectListener onNfcConnectListener, Handler handler) {
        if (context == null) {
            this.d = BaseApplication.getContext();
        } else {
            this.d = context;
        }
        this.j = onNfcConnectListener;
        this.i = handler;
    }

    public QrCodeOrNfcInfo e() {
        return this.h;
    }

    public long b() {
        return this.k;
    }

    @Override // com.huawei.btsportdevice.callback.DataLifecycle
    public void onDestroy() {
        LogUtil.a("IndoorEquipConnectedManager", "onDestroy");
    }

    @Override // com.huawei.btsportdevice.callback.DataLifecycle
    public void init() {
        this.h = null;
        this.g = nwa.n();
        if (!(this.d.getSystemService("bluetooth") instanceof BluetoothManager)) {
            LogUtil.j("IndoorEquipConnectedManager", "not instance of BluetoothManager");
            return;
        }
        BluetoothManager bluetoothManager = (BluetoothManager) this.d.getSystemService("bluetooth");
        if (bluetoothManager != null) {
            this.f17782c = bluetoothManager.getAdapter();
        }
    }

    private void b(QrCodeOrNfcInfo qrCodeOrNfcInfo) {
        if (this.g.u()) {
            LogUtil.a("IndoorEquipConnectedManager", "in connectBtByNfc: WillNotResponseNfcAndQrcode is true, return");
            return;
        }
        this.h = qrCodeOrNfcInfo;
        c(qrCodeOrNfcInfo);
        BluetoothAdapter bluetoothAdapter = this.f17782c;
        if (bluetoothAdapter == null) {
            LogUtil.j("IndoorEquipConnectedManager", "in connectBtByNfc: mBluetoothAdapter is null");
            return;
        }
        if (!bluetoothAdapter.isEnabled()) {
            LogUtil.j("IndoorEquipConnectedManager", "in connectBtByNfc: mBluetoothAdapter not enabled");
            return;
        }
        Handler handler = this.i;
        if (handler == null) {
            LogUtil.j("IndoorEquipConnectedManager", "in connectBtByNfc: mHandler is null");
            return;
        }
        if (this.h == null) {
            handler.sendEmptyMessage(1001);
            return;
        }
        handler.sendEmptyMessage(311);
        int length = this.h.getBtMac().length();
        String btName = Constants.LINK;
        if (length != 0) {
            Context context = this.d;
            String str = this.o;
            if (!this.f) {
                btName = this.h.getBtName();
            }
            nzc.c(context, str, btName, this.h);
            c(this.h.getBtMac());
            return;
        }
        nzc.c(this.d, this.o, Constants.LINK, this.h);
        a(this.h.getBtName());
    }

    public void e(String str) {
        if (nzc.a()) {
            QrCodeOrNfcInfo qrCodeOrNfcInfoAnalysisQrCodeOrNfc = QrCodeOrNfcInfo.analysisQrCodeOrNfc(str);
            this.h = qrCodeOrNfcInfoAnalysisQrCodeOrNfc;
            if (qrCodeOrNfcInfoAnalysisQrCodeOrNfc == null) {
                LogUtil.e("IndoorEquipConnectedManager", "connectBtByNfc data error ");
                return;
            }
            qrCodeOrNfcInfoAnalysisQrCodeOrNfc.setDataSource(1);
            this.f = nzc.g(str);
            this.f17780a = this.h.getDeviceType();
            this.m = SystemClock.elapsedRealtime();
            if ("".equals(etn.e("stype", str))) {
                this.o = "NFC";
            }
            b(this.h);
            a(this.m);
            LogUtil.a("IndoorEquipConnectedManager", "send LocalBroadcast action is CONNECT_BT_BY_NFC, ISFTMP: ", Boolean.valueOf(this.f));
            this.k = System.currentTimeMillis();
            if (str == null || !str.contains("&tvn=")) {
                return;
            }
            String strE = nzc.e(str);
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            Intent intent = new Intent("com.huawei.health.BROADCAST_INTENT_CONNECT_TV");
            intent.putExtra("KEY_OF_TV_DEVICE_NAME", strE);
            LocalBroadcastManager.getInstance().sendBroadcast(intent);
        }
    }

    private void a(long j) {
        OnNfcConnectListener onNfcConnectListener = this.j;
        if (onNfcConnectListener != null) {
            onNfcConnectListener.onStartTimeChange(j);
        }
    }

    private void c(QrCodeOrNfcInfo qrCodeOrNfcInfo) {
        OnNfcConnectListener onNfcConnectListener = this.j;
        if (onNfcConnectListener != null) {
            onNfcConnectListener.onQrCodeOrNfcInfoSet(qrCodeOrNfcInfo);
        }
    }

    private void d(Intent intent) {
        if (nzc.a()) {
            BluetoothAdapter bluetoothAdapter = this.f17782c;
            if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
                LogUtil.j("IndoorEquipConnectedManager", "in connectBtByEmuiScan: mBluetoothAdapter not enabled");
                return;
            }
            if (this.h == null) {
                b(1001);
                return;
            }
            if ("ScanBtnAPP".equals(intent.getStringExtra("START_SPORT_SOURCE"))) {
                LogUtil.a("IndoorEquipConnectedManager", "start sport from bluetooth scan");
                this.o = "ScanBtnAPP";
            } else {
                LogUtil.a("IndoorEquipConnectedManager", "start sport from qrCode");
                this.h.setDataSource(2);
                this.o = "ScanApp";
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.m = jElapsedRealtime;
            a(jElapsedRealtime);
            c(this.h);
            if (this.g.u()) {
                LogUtil.e("IndoorEquipConnectedManager", "in connectBtByEmuiScan: WillNotResponseNfcAndQrcode is true, return");
                return;
            }
            boolean zIsEmpty = TextUtils.isEmpty(this.h.getBtMac());
            String btName = Constants.LINK;
            if (!zIsEmpty) {
                Context context = this.d;
                String str = this.o;
                if (!this.f) {
                    btName = this.h.getBtName();
                }
                nzc.c(context, str, btName, this.h);
                c(this.h.getBtMac());
            } else {
                nzc.c(this.d, this.o, Constants.LINK, this.h);
                a(this.h.getBtName());
            }
            LogUtil.a("IndoorEquipConnectedManager", "CONNECT_BT_BY_EMUI_SCAN, isFtmp: ", Boolean.valueOf(this.f));
            this.k = System.currentTimeMillis();
            String tvName = this.h.getTvName();
            if (TextUtils.isEmpty(tvName)) {
                return;
            }
            Intent intent2 = new Intent("com.huawei.health.BROADCAST_INTENT_CONNECT_TV");
            intent2.putExtra("KEY_OF_TV_DEVICE_NAME", tvName);
            LocalBroadcastManager.getInstance().sendBroadcast(intent2);
        }
    }

    private void a(String str) {
        this.e = str;
        LogUtil.a("IndoorEquipConnectedManager", "connectBtByName");
        c(1, this.e);
    }

    private void c(String str) {
        this.f17781b = str;
        LogUtil.a("IndoorEquipConnectedManager", "connectBtByMac");
        c(0, this.f17781b);
    }

    private void c(final int i, final String str) {
        this.g.e(AbstractFitnessClient.ACTION_GATT_STATE_CONNECTING);
        lsy.a(new Runnable() { // from class: com.huawei.indoorequip.activity.IndoorEquipConnectedManager.3
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("IndoorEquipConnectedManager", "mFitnessClient is not null and will connect");
                nxs.d().a(IndoorEquipConnectedManager.this.f17780a);
                if (i == 0) {
                    nxs.d().e(IndoorEquipConnectedManager.this.f, str);
                } else {
                    nxs.d().c(IndoorEquipConnectedManager.this.f, str);
                }
                IndoorEquipConnectedManager.this.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        SharedPreferences.Editor editorEdit = this.d.getSharedPreferences("IndoorEquipServiceRunning", 0).edit();
        editorEdit.putString("lastConnectData", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
        editorEdit.apply();
    }

    public void a(final boolean z) {
        if (AbstractFitnessClient.ACTION_GATT_STATE_CONNECTED.equals(this.g.m())) {
            this.g.e(AbstractFitnessClient.ACTION_GATT_STATE_DISCONNECTING);
            LogUtil.a("IndoorEquipConnectedManager", "disconnectBt");
            lsy.a(new Runnable() { // from class: com.huawei.indoorequip.activity.IndoorEquipConnectedManager.5
                @Override // java.lang.Runnable
                public void run() {
                    nxs.d().a(z);
                }
            });
        }
    }

    public void a(Intent intent) {
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES");
        if (parcelableArrayExtra == null || parcelableArrayExtra.length <= 0) {
            LogUtil.e("IndoorEquipConnectedManager", "onNewIntent, Parcelable is null");
            return;
        }
        if (!a()) {
            LogUtil.a("IndoorEquipConnectedManager", "onNewIntent, mBlueConnectState is ", this.g.m());
            b(1005);
            return;
        }
        Parcelable parcelable = parcelableArrayExtra[0];
        String str = null;
        NdefMessage ndefMessage = parcelable instanceof NdefMessage ? (NdefMessage) parcelable : null;
        if (ndefMessage != null) {
            try {
                if (njy.c(ndefMessage.getRecords(), 0) && ndefMessage.getRecords()[0] != null) {
                    str = new String(ndefMessage.getRecords()[0].getPayload(), "UTF-8");
                }
            } catch (UnsupportedEncodingException unused) {
                LogUtil.e("IndoorEquipConnectedManager", "disposeNdefDiscovered,UnsupportedEncodingException");
                return;
            }
        }
        if (str == null) {
            LogUtil.e("IndoorEquipConnectedManager", "payLoad is null");
            return;
        }
        if (str.length() > 100) {
            LogUtil.a("IndoorEquipConnectedManager", "payload from NFC is too long");
            b(1002);
            return;
        }
        e(15);
        if (this.g.s()) {
            e(str);
        } else {
            b(1004);
            LogUtil.j("IndoorEquipConnectedManager", "onCreate, mService is still not running");
        }
    }

    public void b(String str) {
        if (a()) {
            e(15);
            if (this.g.s()) {
                e(str);
                return;
            } else {
                b(1004);
                LogUtil.j("IndoorEquipConnectedManager", "onNewIntent, mService is still not running");
                return;
            }
        }
        b(1005);
        LogUtil.a("IndoorEquipConnectedManager", "session is running already");
    }

    public void c(Intent intent) {
        QrCodeOrNfcInfo qrCodeOrNfcInfoF = f(intent);
        this.h = qrCodeOrNfcInfoF;
        if (!TextUtils.isEmpty(qrCodeOrNfcInfoF.getBtMac()) || !TextUtils.isEmpty(this.h.getBtName())) {
            LogUtil.a("IndoorEquipConnectedManager", "onNewIntent, start by emui scan");
            if (!a()) {
                b(1005);
                LogUtil.a("IndoorEquipConnectedManager", "session is running already");
                return;
            }
            e(15);
            if (this.g.s()) {
                d(intent);
                return;
            } else {
                b(1004);
                LogUtil.j("IndoorEquipConnectedManager", "mService is still not running");
                return;
            }
        }
        b(1001);
        LogUtil.a("IndoorEquipConnectedManager", "onNewIntent but intent is not necessary to dispose");
    }

    private QrCodeOrNfcInfo f(Intent intent) {
        QrCodeOrNfcInfo qrCodeOrNfcInfo = new QrCodeOrNfcInfo();
        if (intent != null) {
            qrCodeOrNfcInfo.setPid(intent.getStringExtra("PID_FROM_QRCODE"));
            String stringExtra = intent.getStringExtra("DEVICE_TYPE_INDEX");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = "31";
            }
            this.f17780a = stringExtra;
            qrCodeOrNfcInfo.setDeviceType(stringExtra);
            qrCodeOrNfcInfo.setBtMac(intent.getStringExtra("BLE_FROM_QRCODE"));
            qrCodeOrNfcInfo.setBtType("BLE");
            qrCodeOrNfcInfo.setBtName(intent.getStringExtra("BLENAME_FROM_QRCODE"));
            qrCodeOrNfcInfo.setTvName(intent.getStringExtra("TVNAME_FROM_QRCODE"));
            String stringExtra2 = intent.getStringExtra("PROTOCOL_FROM_QRCODE");
            this.f = TextUtils.isEmpty(stringExtra2) || "2".equals(stringExtra2);
            if (!TextUtils.isEmpty(qrCodeOrNfcInfo.getBtMac()) && nzc.i(qrCodeOrNfcInfo.getBtMac())) {
                qrCodeOrNfcInfo.setBtMac(nzc.b(qrCodeOrNfcInfo.getBtMac()));
            }
        }
        return qrCodeOrNfcInfo;
    }

    public void b(Intent intent) {
        LogUtil.a("IndoorEquipConnectedManager", "onCreate, start by emui scan or click entrance btn");
        QrCodeOrNfcInfo qrCodeOrNfcInfoF = f(intent);
        this.h = qrCodeOrNfcInfoF;
        if (!TextUtils.isEmpty(qrCodeOrNfcInfoF.getBtMac()) || !TextUtils.isEmpty(this.h.getBtName())) {
            nzc.a(HuaweiHealth.a(), "ScanAPP", this.h.getBtMac());
            d(intent);
        } else {
            nzc.a(HuaweiHealth.a(), "Click", this.h.getBtMac());
            LogUtil.a("IndoorEquipConnectedManager", "onCreate, start but all extra strings are null");
            b(1004);
        }
    }

    public DeviceInformation e(Intent intent) {
        DeviceInformation deviceInformation = new DeviceInformation();
        if (intent == null) {
            return deviceInformation;
        }
        if (this.h == null) {
            this.h = f(intent);
        }
        deviceInformation.setDeviceType(nzc.a(this.f17780a));
        deviceInformation.setManufacturerString(intent.getStringExtra(ProfileRequestConstants.MANU));
        deviceInformation.setModelString(intent.getStringExtra("model"));
        return deviceInformation;
    }

    private boolean a() {
        nwa nwaVarN = nwa.n();
        this.g = nwaVarN;
        return AbstractFitnessClient.ACTION_GATT_STATE_DISCONNECTED.equals(nwaVarN.m()) || "unknown".equals(this.g.m());
    }

    private void b(int i) {
        Handler handler = this.i;
        if (handler != null) {
            handler.sendEmptyMessage(i);
        }
    }

    private void e(int i) {
        for (int i2 = 0; !this.g.s() && i2 < i; i2++) {
            SystemClock.sleep(100L);
        }
    }

    public boolean c() {
        return this.f;
    }
}
