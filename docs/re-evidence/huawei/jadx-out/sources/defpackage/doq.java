package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.HexUtils;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.callback.WeightInsertStatusCallback;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.kit.hwwsp.hagrid.bean.MultiPackageDataRecLogic;
import com.huawei.health.device.kit.wsp.task.BleTaskQueueUtil;
import com.huawei.health.device.kit.wsp.task.IAsynBleTaskCallback;
import com.huawei.health.device.kit.wsp.task.ITaskService;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.device.wifi.control.claim.ClaimWeightDataManager;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.ecologydevice.open.GattMeasureController;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.WeightBaseResponseCallback;
import com.huawei.hwbtsdk.linklayer.DataReceivedCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class doq extends GattMeasureController implements ITaskService {
    private static doq g;
    private boolean aa;
    private dow ac;
    private volatile boolean ad;
    private dso ak;
    private final c aq;
    private Bundle ar;
    private SharedPreferences au;
    private String av;
    private BleTaskQueueUtil ay;
    private int ba;
    private int bd;
    private String be;
    private MultiPackageDataRecLogic bg;
    private final dpc bj;
    private final dpe bk;
    private String bm;
    private volatile BluetoothGatt j;
    private dnj n;
    private String p;
    private enw q;
    private dom s;
    private Bundle v;
    private byte[] w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f32143b = new Object();
    private static final Map<String, Set<UUID>> e = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f32144c = {"weight_device_clear_user_data", "weight_device_ota_update", "weight_measure_set_user", "bind_result", "manager_info_success", "manager_info_failed", "set_manager_info", "set_manager_info_result", "send_config_info", "config_info_result", "get_device_ssid", "get_device_ssid_result", "request_auth", "request_auth_pass", "request_auth_failed", "workkey_info", "request_auth_token", "real_time_weight_info", "send_real_time_weight_info", "real_time_weight_info_failed", "send_history_weight_info", "history_weight_info", "set_user_info_result", "set_weight_unit", "get_scale_version_code", "reset_wifi", "device_reset", "delete_user_data", "get_user_data", "get_weight_unit", "get_user_data_next", "get_scale_version", "get_user_data_again", "get_user_data_send_again", "send_wake_up", "bind_process_completed", "get_manager_info", "send_ssid", "send_wifi_password", "event_bus_disable_notification", "event_bus_current_user_changed", "event_bus_upload_ble_log", "event_bus_file_check", "event_bus_file_parameter", "event_bus_file_data_request", "event_bus_file_result_notify", "event_bus_send_ota_url", "weight_device_tlv_ota_update", "send_config_info_hag_2021"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f32142a = {"weight_device_clear_user_data", "weight_device_ota_update", "weight_measure_set_user", "bind_result", "manager_info_success", "manager_info_failed", "set_manager_info", "set_manager_info_result", "send_config_info", "config_info_result", "get_device_ssid", "get_device_ssid_result", "request_auth", "request_auth_pass", "request_auth_failed", "workkey_info", "request_auth_token", "real_time_weight_info", "send_real_time_weight_info", "real_time_weight_info_failed", "send_history_weight_info", "history_weight_info", "set_user_info_result", "set_weight_unit", "get_scale_version_code", "reset_wifi", "device_reset", "delete_user_data", "get_user_data", "get_weight_unit", "get_user_data_next", "get_scale_version", "get_user_data_again", "get_user_data_send_again", "send_wake_up", "bind_process_completed", "get_manager_info", "send_ssid", "send_wifi_password", "event_bus_disable_notification", "event_bus_current_user_changed", "event_bus_upload_ble_log", "event_bus_file_check", "event_bus_file_parameter", "event_bus_file_data_request", "event_bus_file_result_notify", "event_bus_send_ota_url", "weight_device_tlv_ota_update", "send_config_info_hag_2021"};
    private static Set<String> d = new HashSet();
    private MultiPackageDataRecLogic ap = null;
    private MultiPackageDataRecLogic i = null;
    private MultiPackageDataRecLogic aw = null;
    private MultiPackageDataRecLogic y = null;
    private MultiPackageDataRecLogic u = null;
    private MultiPackageDataRecLogic f = null;
    private HandlerThread x = new HandlerThread("HwWspMeasureController");
    private int at = 0;
    private int k = 0;
    private volatile int bb = 0;
    private final Object al = new Object();
    private final Object l = new Object();
    private volatile boolean ah = false;
    private volatile boolean ab = false;
    private boolean af = false;
    private boolean ae = false;
    private boolean ag = false;
    private boolean am = false;
    private boolean ai = false;
    private int bh = -1;
    private int az = -1;
    private ArrayList<dso> bl = new ArrayList<>(16);
    private ArrayList<dso> bc = new ArrayList<>(16);
    private ArrayList<dso> m = new ArrayList<>(16);
    private ArrayList<HealthData> as = new ArrayList<>(16);
    private dsb bf = dsb.b(BaseApplication.getContext());
    private boolean aj = false;
    private Context o = BaseApplication.getContext();
    private int ao = 0;
    private boolean an = false;
    private log h = null;
    private boolean z = false;
    private EventBus.ICallback r = new EventBus.ICallback() { // from class: doq.3
        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) {
            LogUtil.a("HwWspMeasureController", "HwWspMeasureController event bus event start: ", dVar.e());
            doq.this.bk.a(new drb().j().a(dVar).b(doq.this.ba).b(doq.this.mDevice).d(doq.this.aq).e(doq.this.p).b(doq.this.av).b(doq.this.s).d(doq.this.bh).a());
        }
    };
    private BluetoothGattCallback t = new BluetoothGattCallback() { // from class: doq.9
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            super.onConnectionStateChange(bluetoothGatt, i, i2);
            ReleaseLogUtil.d("R_Weight_HwWspMeasureController", "onConnectionStateChange status:", Integer.valueOf(i), " newState:", Integer.valueOf(i2));
            doq.this.b(bluetoothGatt, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            super.onServicesDiscovered(bluetoothGatt, i);
            ReleaseLogUtil.d("R_Weight_HwWspMeasureController", "onServicesDiscovered status:", Integer.valueOf(i), " type:", Integer.valueOf(doq.this.ba));
            doq.this.d(bluetoothGatt, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            ReleaseLogUtil.d("R_Weight_HwWspMeasureController", "onCharacteristicWrite status:", Integer.valueOf(i), " descriptor:", bluetoothGattCharacteristic.getUuid().toString());
            doq.this.x();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            if (bluetoothGattCharacteristic != null) {
                if (!dpg.ag.contains(bluetoothGattCharacteristic.getUuid().toString()) && dpg.ao.contains(bluetoothGattCharacteristic.getUuid().toString())) {
                    doq.this.ax.a(0, bluetoothGattCharacteristic);
                }
                doq.this.b(new drh.a().c(bluetoothGattCharacteristic.getUuid()).e(bluetoothGattCharacteristic.getValue()).e());
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            LogUtil.a("HwWspMeasureController", "onDescriptorWrite status:", Integer.valueOf(i), " descriptor:", bluetoothGattDescriptor.getCharacteristic().getUuid().toString());
            doq.this.x();
            doq.this.bj.e(true, doq.this.ba);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
            LogUtil.a("HwWspMeasureController", "onCharacteristicRead uuid:", bluetoothGattCharacteristic.getUuid(), " read data:", doq.this.bj.b(bluetoothGattCharacteristic.getValue()));
        }
    };
    private final IBaseResponseCallback ax = new IBaseResponseCallback() { // from class: doq.14
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (obj instanceof BluetoothGattCharacteristic) {
                BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) obj;
                if (bluetoothGattCharacteristic.getService() == null) {
                    return;
                }
                dye.c("event_bus_disable_notification", bluetoothGattCharacteristic.getService().getUuid(), bluetoothGattCharacteristic.getUuid());
                return;
            }
            if (obj instanceof drh) {
                drh drhVar = (drh) obj;
                dye.c("event_bus_disable_notification", drhVar.a(), drhVar.b());
            } else {
                LogUtil.j("HwWspMeasureController", "disableDisableCharacteristicNotification fail");
            }
        }
    };

    @Override // com.huawei.health.device.open.MeasureController
    public boolean start() {
        return true;
    }

    private doq() {
        this.ay = null;
        this.ac = null;
        dso dsoVar = new dso();
        this.ak = dsoVar;
        dsoVar.setEndTime(System.currentTimeMillis());
        this.ay = new BleTaskQueueUtil(this);
        dpc dpcVar = new dpc(this.ay);
        this.bj = dpcVar;
        this.ac = new dow();
        this.bk = new dpe(this.ac, dpcVar);
        this.x.start();
        this.aq = new c(this.x.getLooper());
        this.au = this.o.getSharedPreferences("weightUser", 0);
    }

    public class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            boolean zDiscoverServices = false;
            if (i != 1) {
                if (i == 2) {
                    doq.this.w();
                } else if (i == 3) {
                    doq.this.mDevice.e();
                    LogUtil.a("HwWspMeasureController", "MSG_DISCOVER_SERVICE dierect connect");
                } else if (i == 4) {
                    doq.this.bj.v();
                } else if (i == 7) {
                    LogUtil.a("HwWspMeasureController", "msg get version getScaleVersion");
                    doq.this.bj.b(BleTaskQueueUtil.TaskType.GET_SCALE_VERSION, dre.a().e());
                } else if (i == 8) {
                    doq.this.bj.f();
                } else if (i == 10) {
                    LogUtil.j("R_Weight_HwWspMeasureController", "getHistoryWightData is fail!");
                    doq.this.bj.e(new byte[]{1});
                } else if (i == 11) {
                    doq.this.u();
                } else {
                    a(message);
                }
            } else if (doq.this.j != null && !doq.this.ag) {
                try {
                    zDiscoverServices = doq.this.j.discoverServices();
                } catch (SecurityException e) {
                    LogUtil.e("HwWspMeasureController", "discoverServices, ", e.getMessage());
                }
                removeMessages(2);
                sendEmptyMessageDelayed(2, 20000L);
                ReleaseLogUtil.d("R_Weight_HwWspMeasureController", "Attemping to start service discovery:", Boolean.valueOf(zDiscoverServices));
            } else {
                ReleaseLogUtil.e("R_Weight_HwWspMeasureController", "MSG_DISCOVER_SERVICE mBluetoothGatt is null");
            }
            doq.this.e(message.what);
        }

        private void a(Message message) {
            if (dre.a().c()) {
                return;
            }
            if (message.what >= 1000 && message.what <= BleTaskQueueUtil.TaskType.values().length + 1000) {
                if (message.obj == null || !(message.obj instanceof dro)) {
                    return;
                }
                dro droVar = (dro) message.obj;
                LogUtil.a("HwWspMeasureController", "Resend data type:", droVar.f());
                doq.this.write(droVar, droVar.e());
                return;
            }
            LogUtil.j("R_Weight_HwWspMeasureController", "MsgHandler default");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        this.aq.removeCallbacksAndMessages(null);
        synchronized (this.al) {
            if (this.j != null) {
                try {
                    this.j.close();
                } catch (SecurityException e2) {
                    LogUtil.e("HwWspMeasureController", "handlerDetectTimeout SecurityException:", ExceptionUtils.c(e2));
                }
                LogUtil.a("HwWspMeasureController", "detect time out,close gatt:", this.j);
                this.j = null;
            }
        }
        this.aq.sendEmptyMessageDelayed(3, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        ReleaseLogUtil.e("R_Weight_HwWspMeasureController", "MSG_DISCOVER_SERVICE timeout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        this.bj.b();
        this.bj.n();
        Bundle bundle = new Bundle();
        bundle.putString("auth", "auth");
        EventBus.a(new EventBus.d("request_auth", bundle));
        ReleaseLogUtil.d("R_Weight_HwWspMeasureController", "Service init and start send request auth.");
    }

    public void b(drh drhVar) {
        UUID uuidB = drhVar.b();
        byte[] bArrC = drhVar.c();
        LogUtil.a("HwWspMeasureController", "Device-->SDK:", HexUtils.c(bArrC), " Tag : ", uuidB.toString(), " type : ", Integer.valueOf(this.ba));
        e(uuidB);
        this.bj.b(uuidB, this.ac, bArrC, this.am, this.ba);
        this.bj.a(uuidB, this.ac, bArrC);
        a(uuidB, bArrC, drhVar);
        e(uuidB, bArrC, drhVar);
        if (uuidB.equals(dpg.f32188c)) {
            n(bArrC, drhVar);
            return;
        }
        if (uuidB.equals(dpg.n)) {
            g(bArrC, drhVar);
            return;
        }
        if (uuidB.equals(dpg.f)) {
            z();
            return;
        }
        if (dpg.m.equals(uuidB)) {
            i(bArrC, drhVar);
            return;
        }
        if (dpg.e.equals(uuidB)) {
            d(bArrC);
            return;
        }
        if (dpg.as.equals(uuidB)) {
            LogUtil.d("HwWspMeasureController", " STRING_BLE_N_CHARACTERISTIC_UUID uuid:", uuidB, "data:", this.bj.b(bArrC));
            c(bArrC);
        } else if (dpg.ah.equals(uuidB)) {
            a(bArrC);
        } else {
            LogUtil.d("HwWspMeasureController", "HwWspMeasureController onCharacteristicChanged end");
        }
    }

    private void ac() {
        this.h = new log(1024, new DataReceivedCallback() { // from class: doq.13
            @Override // com.huawei.hwbtsdk.linklayer.DataReceivedCallback
            public void onDataReceived(int i, byte[] bArr) {
                dye.c(bArr);
            }
        });
    }

    private void e(UUID uuid, byte[] bArr, drh drhVar) {
        if (uuid.equals(dpg.k)) {
            this.p = this.ac.c(bArr);
            Bundle bundle = new Bundle();
            bundle.putString("deviceSsid", this.p);
            EventBus.a(new EventBus.d("get_device_ssid_result", bundle));
            return;
        }
        if (uuid.equals(dpg.q)) {
            h(bArr, drhVar);
            return;
        }
        if (uuid.equals(dpg.d)) {
            j(bArr, drhVar);
            return;
        }
        if (uuid.equals(dpg.af)) {
            o(bArr, drhVar);
            return;
        }
        if (uuid.equals(dpg.ai)) {
            e().b(true);
            l(bArr, drhVar);
        } else {
            if (uuid.equals(dpg.ac)) {
                int iE = this.ac.e(bArr);
                if (iE == 1) {
                    LogUtil.a("HwWspMeasureController", " no huid match");
                    this.aq.sendEmptyMessage(9);
                    return;
                } else {
                    this.bj.c(iE, this.ba, this.af, this.ar, this.aq);
                    return;
                }
            }
            LogUtil.d("HwWspMeasureController", " handlerCharacterTwo end");
        }
    }

    private void a(UUID uuid, byte[] bArr, drh drhVar) {
        int i;
        if (dpg.ad.equals(uuid)) {
            int iE = this.ac.e(bArr);
            Bundle bundle = new Bundle();
            bundle.putInt("ret", iE);
            bundle.putInt("weightUnit", this.az);
            LogUtil.a("HwWspMeasureController", "set weight unit resultAck = ", Integer.valueOf(iE), "; mTempUnitType = ", Integer.valueOf(this.az));
            EventBus.a(new EventBus.d("set_weight_unit_result", bundle));
            if (iE != 0 || (i = this.az) == -1) {
                return;
            }
            this.bh = i;
            return;
        }
        if (dpg.t.equals(uuid)) {
            k(bArr, drhVar);
            return;
        }
        if (dpg.l.equals(uuid)) {
            int i2 = this.ac.i(bArr);
            this.bh = i2;
            ReleaseLogUtil.d("R_Weight_HwWspMeasureController", "get weight unit success, unitType = ", Integer.valueOf(i2), "; mIsManualGetUnit:", Boolean.valueOf(this.ai));
            Bundle bundle2 = new Bundle();
            bundle2.putInt("weightUnit", this.bh);
            EventBus.a(new EventBus.d("get_weight_unit_result", bundle2));
            this.ai = false;
            if (this.bd == -15) {
                byte[] bArr2 = new byte[31];
                byte[] bArrC = this.ac.c(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
                System.arraycopy(bArrC, 0, bArr2, 0, bArrC.length);
                Bundle bundle3 = new Bundle();
                bundle3.putByteArray(JsbMapKeyNames.H5_USER_ID, bArr2);
                EventBus.a(new EventBus.d("get_user_data", bundle3));
                return;
            }
            return;
        }
        LogUtil.d("HwWspMeasureController", "HwWspMeasureController handlerCharacter end");
    }

    private void e(UUID uuid) {
        Integer num = dpg.c().get(uuid);
        if (num != null) {
            this.aq.removeMessages(num.intValue() + 1000);
            LogUtil.a("HwWspMeasureController", " remove timeout msg");
        }
    }

    private void n(byte[] bArr, final drh drhVar) {
        LogUtil.d("HwWspMeasureController", "HwWspMeasureController onReceiverBindResponse value = ", eeq.e(bArr));
        if (dxm.aq(this.av)) {
            c(bArr, drhVar);
            return;
        }
        if (this.f == null) {
            this.f = new MultiPackageDataRecLogic("ReceiveBindResp", new MultiPackageDataRecLogic.MultiPackageCb() { // from class: doq.11
                @Override // com.huawei.health.device.kit.hwwsp.hagrid.bean.MultiPackageDataRecLogic.MultiPackageCb
                public void onDataReceiveDone(byte[] bArr2) {
                    doq.this.c(bArr2, drhVar);
                    doq.this.f = null;
                }
            }, this.mDevice.getAddress(), BaseApplication.getContext());
        }
        this.f.b(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(byte[] bArr, drh drhVar) {
        this.ax.a(0, drhVar);
        Bundle bundle = new Bundle();
        if (bArr != null && bArr.length >= 3) {
            bundle.putByte("ret", bArr[0]);
            LogUtil.a("HwWspMeasureController", "onReceiverBindResponse ret = ", Byte.valueOf(bArr[0]));
            float fA = doa.a(bArr, 1, 2) / 100.0f;
            bundle.putFloat("weight_data", fA);
            dso dsoVarD = d(fA);
            if (bArr.length >= 15) {
                int i = 0;
                for (int i2 = 0; i2 < 12; i2 += 2) {
                    dsoVarD.e(i, doa.a(bArr, i2 + 3, 2));
                    i++;
                }
                bundle.putSerializable("resis_data", dsoVarD);
            }
            boolean zB = drk.b(this.be, 18);
            LogUtil.a("HwWspMeasureController", "code:", CommonUtil.n(this.be), "isSupportMultiChannel:", Boolean.valueOf(zB), "bufferData:", this.bj.b(bArr), "length:", Integer.valueOf(bArr.length));
            if (zB && bArr.length >= 27) {
                dsoVarD.c(2);
                int i3 = 0;
                for (int i4 = 0; i4 < 12; i4 += 2) {
                    dsoVarD.b(i3, doa.a(bArr, i4 + 15, 2));
                    i3++;
                }
                bundle.putSerializable("resis_data", dsoVarD);
            }
        } else {
            LogUtil.d("HwWspMeasureController", "HwWspMeasureController onReceiverBindResponse bind failed!");
            bundle.putByte("ret", (byte) 2);
        }
        EventBus.a(new EventBus.d("bind_result", bundle));
    }

    private dso d(float f) {
        dso dsoVar = new dso();
        dsoVar.d(false);
        dsoVar.setWeight(f);
        return dsoVar;
    }

    private void k(byte[] bArr, final drh drhVar) {
        LogUtil.d("HwWspMeasureController", "HwWspMeasureController onReceiverGetUserDataResponse values = ", eeq.e(bArr));
        if (dxm.aq(this.av)) {
            e(bArr, drhVar);
            return;
        }
        if (this.y == null) {
            this.y = new MultiPackageDataRecLogic("ReceiveGetUserDataResp", new MultiPackageDataRecLogic.MultiPackageCb() { // from class: doq.15
                @Override // com.huawei.health.device.kit.hwwsp.hagrid.bean.MultiPackageDataRecLogic.MultiPackageCb
                public void onDataReceiveDone(byte[] bArr2) {
                    doq.this.e(bArr2, drhVar);
                    doq.this.y = null;
                }
            }, this.mDevice.getAddress(), BaseApplication.getContext());
        }
        this.y.b(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(byte[] bArr, drh drhVar) {
        this.ax.a(0, drhVar);
        if (bArr != null && bArr.length == 60) {
            this.ao = 0;
            this.bj.h(bArr);
            return;
        }
        if (bArr != null && bArr.length == 1 && bArr[0] != 0) {
            int i = this.ao + 1;
            this.ao = i;
            if (i < 3) {
                EventBus.a(new EventBus.d("get_user_data_send_again"));
                return;
            }
            return;
        }
        LogUtil.j("R_Weight_HwWspMeasureController", "onReceiverGetUserDataResponse userData length is error or null");
        int i2 = this.ao + 1;
        this.ao = i2;
        if (i2 < 3) {
            EventBus.a(new EventBus.d("get_user_data_again"));
        }
    }

    private void o(byte[] bArr, final drh drhVar) {
        LogUtil.d("HwWspMeasureController", "HwWspMeasureController onReceiverRealTimeResponse values = ", eeq.e(bArr));
        if (dxm.aq(this.av)) {
            d(bArr, drhVar);
            return;
        }
        if (this.aw == null) {
            this.aw = new MultiPackageDataRecLogic("RequestRealTimeReceivePack", new MultiPackageDataRecLogic.MultiPackageCb() { // from class: doq.12
                @Override // com.huawei.health.device.kit.hwwsp.hagrid.bean.MultiPackageDataRecLogic.MultiPackageCb
                public void onDataReceiveDone(byte[] bArr2) {
                    if (doq.this.d(bArr2, drhVar)) {
                        return;
                    }
                    doq.this.aw = null;
                }
            }, this.mDevice.getAddress(), BaseApplication.getContext());
        }
        this.aw.b(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(byte[] bArr, drh drhVar) {
        this.ax.a(0, drhVar);
        this.ab = false;
        LogUtil.d("HwWspMeasureController", "HwWspMeasureController values = ", eeq.e(bArr));
        if (bArr == null) {
            EventBus.a(new EventBus.d("real_time_weight_info_failed", new Bundle()));
            this.aw = null;
            return true;
        }
        if (bArr.length == 0) {
            EventBus.a(new EventBus.d("real_time_weight_info_failed", new Bundle()));
            this.aw = null;
            return true;
        }
        dye.e(bArr, this.be, this.n);
        return false;
    }

    private void l(byte[] bArr, final drh drhVar) {
        LogUtil.d("HwWspMeasureController", "HwWspMeasureController onReceiverHistoryResponse values = ", eeq.e(bArr));
        if (dxm.aq(this.av)) {
            a(bArr, drhVar);
            return;
        }
        if (this.u == null) {
            this.u = new MultiPackageDataRecLogic("ReceiverHistoryResponse", new MultiPackageDataRecLogic.MultiPackageCb() { // from class: doq.16
                @Override // com.huawei.health.device.kit.hwwsp.hagrid.bean.MultiPackageDataRecLogic.MultiPackageCb
                public void onDataReceiveDone(byte[] bArr2) {
                    if (doq.this.a(bArr2, drhVar)) {
                        return;
                    }
                    doq.this.u = null;
                }
            }, this.mDevice.getAddress(), BaseApplication.getContext());
        }
        this.u.b(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(byte[] bArr, drh drhVar) {
        this.ax.a(0, drhVar);
        this.ab = false;
        LogUtil.d("HwWspMeasureController", "HwWspMeasureController values = ", eeq.e(bArr));
        if (bArr == null) {
            this.aq.removeMessages(10);
            this.aq.sendEmptyMessageDelayed(10, 500L);
            this.u = null;
            this.am = false;
            ending();
            return true;
        }
        dye.a(bArr, this.n);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(BluetoothGatt bluetoothGatt, int i) {
        try {
            this.aq.removeCallbacksAndMessages(null);
            int i2 = this.ba;
            if (i2 != -5 && i2 != -6) {
                if (i == 0) {
                    if (bluetoothGatt.getService(dpg.aq) == null) {
                        if (this.k < 10) {
                            a(200);
                            this.k++;
                            return;
                        } else {
                            this.aq.sendEmptyMessage(2);
                            this.k = 0;
                            LogUtil.j("HwWspMeasureController", "Re discover service failed, retry num:", 10);
                            return;
                        }
                    }
                    this.k = 0;
                    this.j = bluetoothGatt;
                    this.bb = 2;
                    b(this.j);
                    this.bj.b(this.mDevice, 2);
                    this.ay.a();
                    this.aq.removeMessages(11);
                    this.aq.sendEmptyMessageDelayed(11, 100L);
                    this.ag = true;
                    return;
                }
                return;
            }
            if (bluetoothGatt != null) {
                bluetoothGatt.close();
            }
        } catch (SecurityException e2) {
            LogUtil.e("HwWspMeasureController", "onDiscovered SecurityException:", ExceptionUtils.c(e2));
        }
    }

    private void b(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt == null || bluetoothGatt.getDevice() == null) {
            LogUtil.j("HwWspMeasureController", "cacheDeviceCapacites fail, gatt is null");
            return;
        }
        String address = bluetoothGatt.getDevice().getAddress();
        List<BluetoothGattService> services = bluetoothGatt.getServices();
        if (njy.e(services)) {
            LogUtil.j("HwWspMeasureController", "cacheDeviceCapacites empty sevices");
        }
        HashSet hashSet = new HashSet();
        Iterator<BluetoothGattService> it = services.iterator();
        while (it.hasNext()) {
            List<BluetoothGattCharacteristic> characteristics = it.next().getCharacteristics();
            if (!njy.e(characteristics)) {
                for (BluetoothGattCharacteristic bluetoothGattCharacteristic : characteristics) {
                    if (bluetoothGattCharacteristic != null && bluetoothGattCharacteristic.getUuid() != null) {
                        hashSet.add(bluetoothGattCharacteristic.getUuid());
                    }
                }
            }
        }
        e.put(address, hashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(BluetoothGatt bluetoothGatt, int i) {
        this.j = bluetoothGatt;
        if (i == 2) {
            a(bluetoothGatt);
        } else if (i == 0) {
            d();
        } else {
            ReleaseLogUtil.e("R_Weight_HwWspMeasureController", "onStateChange unknown");
        }
    }

    private void a(BluetoothGatt bluetoothGatt) {
        try {
            int i = this.ba;
            if (i == -5 || i == -6) {
                if (bluetoothGatt != null) {
                    bluetoothGatt.close();
                    ReleaseLogUtil.d("R_Weight_HwWspMeasureController", "discover but close.");
                    return;
                }
                return;
            }
            if (this.ag) {
                ReleaseLogUtil.d("R_Weight_HwWspMeasureController", "Service has been init.");
                return;
            }
            ReleaseLogUtil.e("R_Weight_HwWspMeasureController", "Service has not been init.");
            this.ad = true;
            this.bj.b(this.mDevice, 1);
            this.be = this.j.getDevice().getAddress();
            a(600);
        } catch (SecurityException e2) {
            LogUtil.e("HwWspMeasureController", "doDeviceConnectedByGatt SecurityException:", ExceptionUtils.c(e2));
        }
    }

    public void d(String str) {
        this.bj.b();
        this.bj.n();
        ReleaseLogUtil.d("R_Weight_HwWspMeasureController", "doDeviceConnectedByUds mType: ", Integer.valueOf(this.ba));
        int i = this.ba;
        if (i == -5 || i == -6) {
            LogUtil.a("R_Weight_HwWspMeasureController", "device connected by uds, but close.");
            return;
        }
        this.bb = 2;
        this.bj.b(this.mDevice, 2);
        this.ay.a();
        this.ad = true;
        this.be = str;
        int i2 = this.ba;
        if (i2 == -1 || i2 == -4) {
            this.bj.v();
        } else if (i2 == -2) {
            this.bj.e(true);
        } else {
            LogUtil.j("HwWspMeasureController", "doDeviceConnectedByUds : unknown branch");
        }
    }

    public void d() {
        this.bb = 3;
        this.ag = false;
        LogUtil.a("HwWspMeasureController", "newState == BluetoothProfile.STATE_DISCONNECTED");
        this.bj.b(this.mDevice, 3);
        this.bj.b(this.mDevice, 4);
        duy.e().d(false);
        this.ad = false;
        if (BluetoothAdapter.getDefaultAdapter().getState() == 10) {
            cleanup();
            return;
        }
        if (this.aa && !dxm.aq(this.av)) {
            s();
            this.aa = false;
            this.aq.sendEmptyMessage(3);
            return;
        }
        cleanup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        if (i == 9) {
            this.bj.b(this.mDevice, 15);
        } else {
            LogUtil.j("R_Weight_HwWspMeasureController", "processHandler default");
        }
    }

    public static doq e() {
        doq doqVar;
        synchronized (f32143b) {
            if (g == null) {
                g = new doq();
            }
            doqVar = g;
        }
        return doqVar;
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController, com.huawei.health.device.open.MeasureController
    public boolean prepare(HealthDevice healthDevice, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        aa();
        this.ab = false;
        this.bj.d(iHealthDeviceCallback);
        LogUtil.a("HwWspMeasureController", "HwWspMeasureController prepare start, isConnect:", Boolean.valueOf(this.ad), ", device:", Integer.valueOf(System.identityHashCode(healthDevice)));
        if (bundle != null) {
            if (this.af && this.bb == 1) {
                return false;
            }
            this.ar = bundle;
            this.ba = bundle.getInt("type");
            this.bd = bundle.getInt("userType");
            this.av = bundle.getString("productId", this.av);
            this.af = bundle.getBoolean("measureButtonOnClick", this.af);
            this.ac.b(dxm.aq(this.av));
        }
        drc.b().c(this.av, this.ay);
        ai();
        LogUtil.a("HwWspMeasureController", "HwWspMeasureController prepare mType : ", Integer.valueOf(this.ba), " isMeasureButtonClicked:", Boolean.valueOf(this.af), " isSyncCurrentTime:", Boolean.valueOf(this.an), " userDataType", Integer.valueOf(this.bd));
        this.bj.b(healthDevice, this.bb != 2 ? 3 : 2);
        if (bundle != null && bundle.getBoolean("queryStatusOnly")) {
            return false;
        }
        int iB = bundle != null ? b(bundle) : -1;
        if (this.af && this.an) {
            LogUtil.a("HwWspMeasureController", "HwWspMeasureController prepare setUserInfo");
            if (iB == 1) {
                EventBus.a(new EventBus.d("weight_measure_set_user", bundle));
            } else {
                EventBus.a(new EventBus.d("weight_measure_set_user"));
            }
        }
        if (this.bd == -15) {
            LogUtil.a("HwWspMeasureController", "HwWspMeasureController prepare get user data");
            if (this.an) {
                EventBus.a(new EventBus.d("get_user_data", bundle));
            } else {
                this.bj.a(bundle);
                e().b(-1);
            }
        }
        return super.prepare(healthDevice, iHealthDeviceCallback, bundle);
    }

    private void ai() {
        int i = this.ba;
        if (i == -2 || i == -1) {
            this.aa = true;
        } else {
            this.aa = false;
        }
    }

    private int b(Bundle bundle) {
        int i = bundle != null ? bundle.getInt("guestUser", 0) : -1;
        if (i == 1) {
            this.v = bundle;
        }
        return i;
    }

    private void aa() {
        EventBus.b(this.r, 0, f32144c);
    }

    public int l() {
        return this.bb;
    }

    @Override // com.huawei.health.device.open.MeasureController
    public void updateState(int i) {
        this.bb = i;
    }

    public boolean m() {
        return this.ae;
    }

    public void e(EventBus.d dVar) {
        if (dVar.b() != null && dVar.b().getBoolean("getNetworkDeviceVersion", false)) {
            LogUtil.j("HwWspMeasureController", "getNetworkDeviceVersion is true");
            this.aq.sendEmptyMessage(7);
            return;
        }
        LogUtil.j("HwWspMeasureController", "dealVersionCodeEvent mIsSyncCurrentTime：", Boolean.valueOf(this.an));
        dom domVar = this.s;
        if (domVar != null) {
            Intent intent = new Intent();
            intent.putExtra("bleVersion", domVar.e());
            intent.putExtra("scaleVersion", domVar.d());
            intent.putExtra(HealthEngineRequestManager.PARAMS_DEVICE_SN, domVar.b());
            intent.putExtra("sourceData", domVar.a());
            EventBus.a(new EventBus.d("set_scale_version_code", intent));
            LogUtil.a("HwWspMeasureController", "dealVersionCodeEvent publish action : set_scale_version_code");
            if (dxm.ai(this.av) || dxm.q(this.av)) {
                return;
            }
            if (this.w != null) {
                Bundle bundle = new Bundle();
                bundle.putByteArray("huid", this.w);
                EventBus.a(new EventBus.d("manager_info_success", bundle));
                return;
            }
            this.aq.sendEmptyMessageDelayed(8, 200L);
            return;
        }
        if (this.an) {
            this.aq.sendEmptyMessageDelayed(7, 200L);
        } else {
            EventBus.a(new EventBus.d("get_version_code_fail", new Intent()));
        }
    }

    public void a(boolean z, dso dsoVar, final byte[] bArr, int i) {
        int[] iArr = {i};
        if (!Utils.h()) {
            dsoVar.a(k());
        } else {
            dnj dnjVar = this.n;
            if (dnjVar == null || dnjVar.i() == null) {
                LogUtil.j("HwWspMeasureController", "HwWspMeasureController save history data mCurrentUser or uuid is null");
                return;
            }
            dsoVar.a(this.n.i());
        }
        if (!z) {
            this.ak = dsoVar.mo828clone();
            this.bj.a(this.mDevice, this.ak);
            return;
        }
        dsoVar.a(true);
        int i2 = iArr[0];
        int i3 = i2 + 2;
        iArr[0] = i3;
        if (bArr.length < i2 + 3) {
            LogUtil.j("HwWspMeasureController", "the count is", Integer.valueOf(i3), "the length is", Integer.valueOf(bArr.length));
            return;
        }
        int iA = doa.a(bArr, i3, 1);
        int i4 = iArr[0] + 1;
        iArr[0] = i4;
        final int iA2 = doa.a(bArr, i4, 1);
        LogUtil.a("HwWspMeasureController", "saveWeightData weightAndFatData userId:", dsoVar.o(), " weight:", Float.valueOf(dsoVar.getWeight()), " suspectedFlag:", Integer.valueOf(iA));
        if (iA == 1) {
            LogUtil.a("HwWspMeasureController", "set suspectedFlag true !");
            dsoVar.e(true);
            if (dxm.av(this.av)) {
                this.m.add(dsoVar);
                d(bArr, iA2);
                return;
            }
        }
        this.bf.a(dsoVar, new IBaseResponseCallback() { // from class: dos
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i5, Object obj) {
                this.f32163a.e(bArr, iA2, i5, obj);
            }
        });
    }

    /* synthetic */ void e(byte[] bArr, int i, int i2, Object obj) {
        if (i2 != 0) {
            return;
        }
        d(bArr, i);
    }

    private void d(byte[] bArr, int i) {
        if (bArr.length != 28 && bArr.length != 40) {
            LogUtil.j("HwWspMeasureController", "weightDataBytes length is not 28 or 40!");
            return;
        }
        if (i == 0) {
            dye.c(this.o, this.av);
            LogUtil.a("HwWspMeasureController", "get history weight data completed!");
            this.am = false;
            p();
            this.m.clear();
            ending();
            return;
        }
        LogUtil.j("HwWspMeasureController", "get history weight data not completed!");
    }

    public String k() {
        SharedPreferences sharedPreferences = this.au;
        if (sharedPreferences != null) {
            return sharedPreferences.getString("weightUser_id", "");
        }
        LogUtil.j("R_Weight_HwWspMeasureController", "mSharedPreferences is null");
        return "";
    }

    public void p() {
        synchronized (this) {
            this.bl.clear();
            this.bc.clear();
            this.as.clear();
            if (!Utils.h()) {
                this.bl.addAll(this.bf.c(k()));
            } else {
                this.bl.addAll(this.bf.c(MultiUsersManager.INSTANCE.getCurrentUser().i()));
            }
            LogUtil.a("HwWspMeasureController", "weight offline data size is :", Integer.valueOf(this.bl.size()));
            if (this.bl.size() > 0 || this.m.size() > 0) {
                ag();
            }
        }
    }

    private void ag() {
        for (dso dsoVar : this.bl) {
            dsoVar.d(false);
            if (dsoVar.s()) {
                this.bc.add(dsoVar);
            } else {
                this.as.add(dsoVar);
            }
        }
        enw enwVar = new enw(10006);
        this.q = enwVar;
        enwVar.e(new WeightInsertStatusCallback() { // from class: doq.19
            @Override // com.huawei.health.device.callback.WeightInsertStatusCallback
            public void isSuccess(boolean z) {
                if (z) {
                    LogUtil.a("HwWspMeasureController", "HwWspMeasureController insert normal History data success");
                    if (dxm.av(doq.this.av)) {
                        LogUtil.a("HwWspMeasureController", "HwWspMeasureController start sync data");
                        ClaimWeightDataManager.INSTANCE.startSync();
                        return;
                    }
                    return;
                }
                LogUtil.j("R_Weight_HwWspMeasureController", "HwWspMeasureController insert normal History data fail");
            }
        });
        ad();
        int size = this.bl.size();
        if (size > 0) {
            double dDoubleValue = new BigDecimal(((double) this.bc.size()) / ((double) size)).setScale(2, RoundingMode.DOWN).doubleValue();
            LogUtil.a("HwWspMeasureController", "normal data size ==", Integer.valueOf(this.as.size()), "suspected data size ==", Integer.valueOf(this.bc.size()));
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(32);
            linkedHashMap.put("click", "1");
            linkedHashMap.put("time", String.valueOf(System.currentTimeMillis()));
            linkedHashMap.put("proportion", String.valueOf(dDoubleValue));
            OpAnalyticsUtil.getInstance().setEvent2nd(AnalyticsValue.HEALTH_PLUGIN_DEVICE_WEIGHT_BODYFATSCALE_OFFLINE_DATA_2060029.value(), linkedHashMap);
        }
    }

    private void ad() {
        ArrayList<HealthData> arrayList = this.as;
        if (arrayList != null && arrayList.size() > 0) {
            LogUtil.a("HwWspMeasureController", "insert normal data to data platform");
            this.q.onDataChanged(this.mDevice, this.as);
            if (!Utils.h()) {
                d(k(), this.as);
            } else {
                d(MultiUsersManager.INSTANCE.getCurrentUser().i(), this.as);
            }
        } else {
            LogUtil.j("HwWspMeasureController", "suspected weight not insert");
        }
        if (!njy.e(this.m) && dxm.av(this.av)) {
            ArrayList arrayList2 = new ArrayList(this.m.size());
            arrayList2.addAll(this.m);
            this.q.onDataChanged(this.mDevice, arrayList2);
        }
        ArrayList<dso> arrayList3 = this.bc;
        if (arrayList3 == null || arrayList3.size() <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("productId", this.av);
        EventBus.a(new EventBus.d("evebus_show_suspected_data_claim_dialog", bundle));
    }

    private void d(String str, ArrayList<HealthData> arrayList) {
        if (arrayList != null && str != null) {
            for (HealthData healthData : arrayList) {
                LogUtil.a("HwWspMeasureController", "mWeightDbHelper delete record time:", Long.valueOf(healthData.getStartTime()));
                this.bf.e(str, healthData.getStartTime());
            }
            return;
        }
        LogUtil.j("R_Weight_HwWspMeasureController", "list is empty or currentUid is empty");
    }

    @Override // com.huawei.health.device.open.MeasureController
    public void cleanup() {
        LogUtil.a("HwWspMeasureController", "HwWspMeasureController cleanup");
        this.aq.removeCallbacksAndMessages(null);
        s();
        super.ending();
    }

    public void s() {
        LogUtil.a("HwWspMeasureController", "HwWspMeasureController setCleanData");
        x();
        b();
        if (dxm.aq(this.av)) {
            dye.a(this.mDevice);
        }
        this.z = false;
        this.be = null;
        this.ag = false;
        this.ay.a();
        this.ab = false;
        this.s = null;
        this.bb = 0;
        this.bj.y();
        this.bj.a();
        this.w = null;
        this.ad = false;
        dre.a().e(false);
        this.aq.removeCallbacksAndMessages(null);
        this.an = false;
        this.am = false;
        this.p = null;
        this.bd = -1;
        ah();
        this.h = null;
    }

    private void ah() {
        this.bg = null;
        this.ap = null;
        this.i = null;
        this.aw = null;
        this.y = null;
        this.u = null;
        this.f = null;
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController, com.huawei.health.device.open.MeasureController
    public void ending() {
        int i;
        LogUtil.a("HwWspMeasureController", "HwWspMeasureController ending mType = ", Integer.valueOf(this.ba));
        boolean z = (this.am || (i = this.ba) == -4 || i == -1 || i == -2) ? false : true;
        if (this.ba == -5 || z) {
            LogUtil.a("HwWspMeasureController", "HwWspMeasureController free connect");
            x();
            b();
            EventBus.a(this.r, f32142a);
            cleanup();
        }
    }

    public void b() {
        synchronized (this.al) {
            if (this.j != null) {
                LogUtil.a("R_Weight_HwWspMeasureController", "HwWspMeasureController disconnect, ", this.j);
                try {
                    this.j.disconnect();
                    dye.a(100L);
                    this.j.close();
                } catch (SecurityException e2) {
                    LogUtil.e("HwWspMeasureController", "closeGattCallback SecurityException:", ExceptionUtils.c(e2));
                }
                this.j = null;
            }
        }
    }

    private void a(int i) {
        c cVar = this.aq;
        if (cVar != null) {
            cVar.removeMessages(1);
            this.aq.sendEmptyMessageDelayed(1, i);
            ReleaseLogUtil.d("R_Weight_HwWspMeasureController", "Send discoverService msg");
            return;
        }
        ReleaseLogUtil.e("R_Weight_HwWspMeasureController", "mMsgHandler is null");
    }

    private void ab() {
        synchronized (this.l) {
            this.ah = true;
            try {
                LogUtil.d("HwWspMeasureController", "get mCharacterLock wait ", Thread.currentThread().getName());
                this.l.wait(6000L);
            } catch (InterruptedException e2) {
                dyg.c(false, "HwWspMeasureController", "InterruptedException = ", e2.getMessage());
            }
            this.ah = false;
        }
        LogUtil.d("HwWspMeasureController", "mCharacterLock out ", Thread.currentThread().getName());
    }

    public void x() {
        synchronized (this.l) {
            if (this.ah) {
                LogUtil.d("HwWspMeasureController", "mCharacterLock notifyAll", Thread.currentThread().getName());
                this.l.notifyAll();
                this.ah = false;
            }
        }
    }

    private void i(byte[] bArr, final drh drhVar) {
        if (dxm.aq(this.av)) {
            f(bArr, drhVar);
            return;
        }
        if (this.bg == null) {
            this.bg = new MultiPackageDataRecLogic("VersionInfoPack", new MultiPackageDataRecLogic.MultiPackageCb() { // from class: doq.4
                @Override // com.huawei.health.device.kit.hwwsp.hagrid.bean.MultiPackageDataRecLogic.MultiPackageCb
                public void onDataReceiveDone(byte[] bArr2) {
                    if (doq.this.f(bArr2, drhVar)) {
                        return;
                    }
                    doq.this.bg = null;
                }
            }, this.mDevice.getAddress(), BaseApplication.getContext());
        }
        this.bg.b(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(byte[] bArr, drh drhVar) {
        this.ax.a(0, drhVar);
        LogUtil.a("HwWspMeasureController", " MultiPackageDataRecLogic VersionInfoPack :", this.bj.b(bArr));
        dom domVarB = dow.b(bArr);
        if (this.av == null) {
            LogUtil.j("HwWspMeasureController", "onReceiveVersionCode mProductId is null");
            return true;
        }
        if (domVarB == null) {
            LogUtil.j("HwWspMeasureController", "onReceiveVersionCode deviceVersion is null");
            this.bg = null;
            Bundle bundle = new Bundle();
            bundle.putBoolean("isManualGetUnit", false);
            EventBus.a(new EventBus.d("get_scale_version", bundle));
            return true;
        }
        dxn.e("HwWspMeasureController", domVarB.e(), this.o, this.be);
        dye.c(domVarB, this.be);
        Intent intent = new Intent();
        intent.putExtra("bleVersion", domVarB.e());
        intent.putExtra("scaleVersion", domVarB.d());
        intent.putExtra("sourceData", domVarB.a());
        intent.putExtra(HealthEngineRequestManager.PARAMS_DEVICE_SN, domVarB.b());
        EventBus.a(new EventBus.d("set_scale_version_code", intent));
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("isManualGetUnit", false);
        bundle2.putString(HealthEngineRequestManager.PARAMS_DEVICE_SN, domVarB.b());
        LogUtil.a("HwWspMeasureController", "onReceiveVersionCode status changed to GET_DEVICE_VERSION");
        this.bj.b(this.mDevice, -16, bundle2);
        EventBus.a(new EventBus.d("get_scale_version", bundle2));
        if (this.ba == -2) {
            this.bj.c(domVarB.e(), domVarB.b(), this.av, this.be);
        }
        this.s = domVarB;
        return false;
    }

    public void h() {
        synchronized (this.al) {
            boolean z = true;
            LogUtil.a("HwWspMeasureController", "HwWspMeasureController enableOtaCharacter");
            if (this.j != null) {
                try {
                    BluetoothGattService service = this.j.getService(dpg.ak);
                    if (service != null) {
                        dro droVar = new dro(BleTaskQueueUtil.TaskType.GET_OTA_UPGRADE_RESULT, new byte[0]);
                        droVar.d(new dro.c(droVar, z) { // from class: doq.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(z);
                                Objects.requireNonNull(droVar);
                                c(new byte[][]{BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE});
                            }
                        });
                        e(service.getCharacteristic(dpg.u), droVar);
                        LogUtil.a("HwWspMeasureController", "HwWspMeasureController enable notification enableOtaCharacter");
                    }
                } catch (SecurityException unused) {
                    LogUtil.j("HwWspMeasureController", "enableOtaCharacter SecurityException");
                }
            }
        }
    }

    public void b(byte[] bArr, boolean z) {
        this.bj.a(bArr, z);
    }

    private void z() {
        this.an = true;
        Bundle bundle = this.v;
        if (bundle != null) {
            this.bj.d(this.aq, this.ba, this.av, bundle);
        } else {
            this.bj.b(this.aq, this.ba, this.av);
        }
    }

    private void d(byte[] bArr) {
        int iE = this.ac.e(bArr);
        ReleaseLogUtil.d("R_Weight_HwWspMeasureController", "reset wifi resultAck = ", Integer.valueOf(iE));
        if (iE == 0) {
            LogUtil.j("HwWspMeasureController", "reset wifi failed");
            this.ae = false;
        } else {
            this.ae = true;
        }
    }

    private void c(byte[] bArr) {
        boolean zAq = dxm.aq(this.av);
        LogUtil.a("HwWspMeasureController", "onReceiveAcceptanceLog isSupportUds=", Boolean.valueOf(zAq));
        if (zAq) {
            dye.c(bArr);
            return;
        }
        if (this.h == null) {
            ac();
        }
        this.h.e(bArr);
    }

    private void a(byte[] bArr) {
        int iE = this.ac.e(bArr);
        LogUtil.a("HwWspMeasureController", "[grs] sendGrsUrl action result :", Integer.valueOf(iE));
        if (iE == 0) {
            LogUtil.a("HwWspMeasureController", "[grs] sendGrsUrl success");
            EventBus.a(new EventBus.d("event_bus_send_ota_url_success"));
        } else {
            LogUtil.a("HwWspMeasureController", "[grs] sendGrsUrl failed");
        }
    }

    private void g(byte[] bArr, final drh drhVar) {
        SharedPreferenceManager.d(String.valueOf(10024), "isPairedDevice", 1);
        if (dxm.aq(this.av)) {
            b(bArr, drhVar);
            return;
        }
        if (this.ap == null) {
            this.ap = new MultiPackageDataRecLogic("ManagerInfoPack", new MultiPackageDataRecLogic.MultiPackageCb() { // from class: doq.5
                @Override // com.huawei.health.device.kit.hwwsp.hagrid.bean.MultiPackageDataRecLogic.MultiPackageCb
                public void onDataReceiveDone(byte[] bArr2) {
                    if (doq.this.b(bArr2, drhVar)) {
                        return;
                    }
                    doq.this.ap = null;
                }
            }, this.mDevice.getAddress(), BaseApplication.getContext());
        }
        this.ap.b(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(byte[] bArr, drh drhVar) {
        this.ay.a(3);
        this.ax.a(0, drhVar);
        drd drdVarA = this.ac.a(bArr);
        if (drdVarA == null) {
            EventBus.a(new EventBus.d("manager_info_failed", new Bundle()));
            this.ap = null;
            this.aq.removeMessages(7);
            this.aq.sendEmptyMessageDelayed(7, 200L);
            return true;
        }
        byte[] bArrC = drdVarA.c();
        this.w = bArrC;
        LogUtil.a("HwWspMeasureController", "onReceiveManagerInfo mHuid: ", CommonUtil.n(eeq.e(bArrC)));
        Bundle bundle = new Bundle();
        bundle.putByteArray("huid", drdVarA.c());
        bundle.putString("cloudDeviceID", drdVarA.a());
        if (!TextUtils.isEmpty(drdVarA.b())) {
            bundle.putString("accountInfo", drdVarA.b());
        }
        EventBus.a(new EventBus.d("manager_info_success", bundle));
        return false;
    }

    private void h(byte[] bArr, final drh drhVar) {
        LogUtil.d("HwWspMeasureController", "HwWspMeasureController onReceiveAuthResponse randA = ", eeq.e(bArr));
        if (this.ac.e(bArr) == 0) {
            EventBus.a(new EventBus.d("request_auth_pass"));
            return;
        }
        if (this.i == null) {
            this.i = new MultiPackageDataRecLogic("RequestAuthReceivePack", new MultiPackageDataRecLogic.MultiPackageCb() { // from class: doq.1
                @Override // com.huawei.health.device.kit.hwwsp.hagrid.bean.MultiPackageDataRecLogic.MultiPackageCb
                public void onDataReceiveDone(byte[] bArr2) {
                    doq.this.ax.a(0, drhVar);
                    LogUtil.d("HwWspMeasureController", "HwWspMeasureController randA = ", eeq.e(bArr2));
                    if (bArr2 == null) {
                        EventBus.a(new EventBus.d("request_auth_failed", new Bundle()));
                        doq.this.i = null;
                        return;
                    }
                    if (bArr2.length == 0) {
                        EventBus.a(new EventBus.d("request_auth_pass"));
                    } else if (bArr2.length >= 16) {
                        dye.e(bArr2, doq.this.o, doq.this.be);
                    } else {
                        EventBus.a(new EventBus.d("request_auth_failed", new Bundle()));
                    }
                    doq.this.i = null;
                }
            }, this.mDevice.getAddress(), BaseApplication.getContext());
        }
        this.i.b(bArr);
    }

    private void j(byte[] bArr, final drh drhVar) {
        LogUtil.d("HwWspMeasureController", "HwWspMeasureController onReceiveAuthTokenResponse receiveData token = ", eeq.e(bArr));
        if (this.i == null) {
            this.i = new MultiPackageDataRecLogic("RequestAuthTokenReceivePack", new MultiPackageDataRecLogic.MultiPackageCb() { // from class: doq.7
                @Override // com.huawei.health.device.kit.hwwsp.hagrid.bean.MultiPackageDataRecLogic.MultiPackageCb
                public void onDataReceiveDone(byte[] bArr2) {
                    doq.this.ax.a(0, drhVar);
                    LogUtil.d("HwWspMeasureController", "HwWspMeasureController tokens = ", eeq.e(bArr2));
                    if (bArr2 == null) {
                        EventBus.a(new EventBus.d("request_auth_failed", new Bundle()));
                        doq.this.i = null;
                    } else {
                        dye.d(bArr2);
                        doq.this.i = null;
                    }
                }
            }, this.mDevice.getAddress(), BaseApplication.getContext());
        }
        this.i.b(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] y() {
        byte[] bArrE;
        byte[] bArrE2;
        if (Utils.h()) {
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
            bArrE = dye.e(accountInfo);
            if (bArrE == null) {
                LogUtil.j("HwWspMeasureController", "sendUserInfo huid is null");
                return null;
            }
            String strI = this.n.i();
            if (strI == null) {
                LogUtil.j("HwWspMeasureController", "sendUserInfo uids is null");
                bArrE2 = new byte[32];
            } else if (strI.equals(accountInfo)) {
                bArrE2 = new byte[32];
            } else {
                bArrE2 = dye.e(this.n.i());
            }
        } else {
            bArrE = dye.e("0");
            bArrE2 = new byte[32];
        }
        byte[] bArr = bArrE2;
        byte[] bArr2 = bArrE;
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(new int[]{10006});
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setEndTime(System.currentTimeMillis());
        hiAggregateOption.setStartTime(0L);
        hiAggregateOption.setCount(1);
        hiAggregateOption.setConstantsKey(new String[]{BleConstants.WEIGHT_KEY});
        hiAggregateOption.setFilter("0");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final float[] fArr = {0.0f};
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: doq.10
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                if (!HiCommonUtil.b(list)) {
                    fArr[0] = list.get(0).getFloat("bodyWeight");
                }
                countDownLatch.countDown();
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("HwWspMeasureController", "readHiHealthData InterruptedException");
        }
        float fR = this.n.r();
        dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
        if (mainUser != null && fArr[0] != 0.0f && this.n.i() != null && this.n.i().equals(mainUser.i())) {
            LogUtil.a("HwWspMeasureController", "mCurrentUser is mainUser");
            fR = fArr[0];
        }
        LogUtil.a("HwWspMeasureController", "mainUser last weight is ", Float.valueOf(fArr[0]), ", currentUser weight is ", Float.valueOf(fR));
        drf drfVar = new drf();
        drfVar.c(dor.a(this.n.j(), this.n.c()));
        drfVar.a(bArr2);
        drfVar.e(this.n.d());
        drfVar.d(fR);
        drfVar.c(bArr);
        drfVar.d(this.n.e());
        if (dor.b(this.be)) {
            drfVar.b(dor.e(this.n.j()));
        }
        return this.ac.e(bArr2, bArr, this.at, 0, e(drfVar));
    }

    private dnj e(drf drfVar) {
        if (drfVar.e() != 0) {
            this.at = 1;
        } else {
            this.at = drfVar.e();
        }
        int iD = drfVar.d();
        int i = this.at;
        int iA = drfVar.a();
        dyg.e(true, "HwWspMeasureController", "mHeight =", Integer.valueOf(iD), ",mSex = ", Integer.valueOf(i), ",mAge = ", Integer.valueOf(iA), "huids = ", this.bj.b(drfVar.b()), "uids =", this.bj.b(drfVar.g()));
        return dye.b(drfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(dnj dnjVar) {
        if (dnjVar == null) {
            return Constants.NULL;
        }
        return dnjVar.c(false);
    }

    private byte[] e(Bundle bundle) {
        byte[] bArrE;
        byte[] bArrE2;
        if (bundle == null) {
            return new byte[32];
        }
        dnj dnjVar = this.n;
        dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
        this.n = MultiUsersManager.INSTANCE.getCurrentUser();
        LogUtil.a("HwWspMeasureController", "getUserInfoFromBundle beforeUser: ", c(dnjVar), "\n mainUser: ", c(mainUser), "\n mCurrentUser: ", c(this.n));
        if (Utils.h()) {
            String string = bundle.getString("huid");
            bArrE = dye.e(string);
            String string2 = bundle.getString("uid");
            LogUtil.a("HwWspMeasureController", "getUserInfoFromBundle huidStr:", string, " uidStr:", string2);
            if (string2 == null) {
                LogUtil.j("HwWspMeasureController", "sendUserInfo uids is null");
                bArrE2 = new byte[32];
            } else if (string2.equals(string)) {
                LogUtil.a("HwWspMeasureController", "send main user");
                bArrE2 = new byte[32];
            } else {
                bArrE2 = dye.e(string2);
            }
        } else {
            bArrE = dye.e("0");
            bArrE2 = new byte[32];
        }
        byte[] bArr = bArrE2;
        byte[] bArr2 = bArrE;
        dnj dnjVarE = e(dye.d(bundle, bArr2, bArr, this.be));
        int i = bundle.getInt("guestUser", 0);
        if (i == 1) {
            bundle.putInt("guestUser", 0);
        }
        return this.ac.e(bArr2, bArr, this.at, i, dnjVarE);
    }

    public void a(Bundle bundle) {
        if (!dxm.aq(this.av) && this.j == null) {
            LogUtil.j("R_Weight_HwWspMeasureController", "bluetooth gatt is null");
        } else if (bundle != null && !bundle.isEmpty()) {
            e(e(bundle));
        } else {
            ae();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(byte[] bArr) {
        if (bArr == null) {
            LogUtil.j("R_Weight_HwWspMeasureController", "User info is empty.");
            return;
        }
        ReleaseLogUtil.d("R_Weight_HwWspMeasureController", "sendUserInfo");
        this.bj.f(bArr);
        LogUtil.d("HwWspMeasureController", "HwWspMeasureController getUserInfo form HiHealthAPI, userinfo= ", this.bj.b(bArr));
    }

    private void ae() {
        MultiUsersManager.INSTANCE.getCurrentUser(new WeightBaseResponseCallback<dnj>() { // from class: doq.8
            @Override // com.huawei.hwbasemgr.WeightBaseResponseCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i, dnj dnjVar) {
                ReleaseLogUtil.d("R_Weight_HwWspMeasureController", "sendCurrentUserInfo");
                if (dnjVar == null || i != 0) {
                    LogUtil.j("HwWspMeasureController", "HwWspMeasureController sendUserInfo getCurrentUser fail, errorCode:", Integer.valueOf(i));
                    return;
                }
                doq doqVar = doq.this;
                LogUtil.a("HwWspMeasureController", "sendCurrentUserInfo mCurrentUser:", doqVar.c(doqVar.n), " objData:", doq.this.c(dnjVar));
                doq.this.n = dnjVar;
                doq.this.e(doq.this.y());
            }
        });
    }

    @Override // com.huawei.health.ecologydevice.open.GattMeasureController
    public BluetoothGattCallback getGattCallbackImpl() {
        if (dxm.aq(this.av)) {
            return null;
        }
        return this.t;
    }

    private boolean e(BluetoothGattCharacteristic bluetoothGattCharacteristic, dro droVar) {
        if (droVar == null || droVar.c() == null || droVar.c().c() == null) {
            LogUtil.j("HwWspMeasureController", "setCharacteristicNotificationWithRetry illegal taskData");
            return false;
        }
        boolean zB = droVar.c().b();
        BluetoothGattDescriptor descriptor = null;
        boolean zWriteDescriptor = false;
        for (int i = 0; i < 3; i++) {
            if (this.j != null) {
                try {
                    zWriteDescriptor = this.j.setCharacteristicNotification(bluetoothGattCharacteristic, zB);
                    descriptor = bluetoothGattCharacteristic.getDescriptor(dpg.aa);
                    if (descriptor != null) {
                        for (byte[] bArr : droVar.c().c()) {
                            descriptor.setValue(bArr);
                        }
                        zWriteDescriptor = this.j.writeDescriptor(descriptor);
                    }
                } catch (SecurityException e2) {
                    LogUtil.e("HwWspMeasureController", "setCharacteristicNotificationWithRetry, ", e2.getMessage());
                }
                if (!zWriteDescriptor) {
                    dye.a(100L);
                    LogUtil.a("HwWspMeasureController", "enable retry failed ", "retry num ", Integer.valueOf(i));
                } else {
                    LogUtil.a("HwWspMeasureController", "setCharacteristicNotification uuid ", bluetoothGattCharacteristic.getUuid(), "current enable uuid set  ", Integer.valueOf(d.size()));
                    if (zB) {
                        d.add(bluetoothGattCharacteristic.getUuid().toString());
                        break;
                    }
                    d.remove(bluetoothGattCharacteristic.getUuid().toString());
                    LogUtil.d("HwWspMeasureController", "remove uuid from mEnableCharactisticSet", bluetoothGattCharacteristic.getUuid());
                    break;
                }
            } else {
                LogUtil.j("R_Weight_HwWspMeasureController", "enableWithRetry mBluetoothGatt is null !");
                return false;
            }
        }
        if (!zWriteDescriptor && descriptor != null) {
            ab();
            try {
                zWriteDescriptor = this.j.writeDescriptor(descriptor);
            } catch (SecurityException e3) {
                LogUtil.e("HwWspMeasureController", "re enable failed, ", e3.getMessage());
            }
            LogUtil.a("HwWspMeasureController", "re enable re ", Boolean.valueOf(zWriteDescriptor));
        }
        return zWriteDescriptor;
    }

    private boolean b(BluetoothGattCharacteristic bluetoothGattCharacteristic, dro droVar) {
        if (this.j == null || droVar == null || droVar.c() == null) {
            LogUtil.a("HwWspMeasureController", "setCharacteristicNotification mBluetoothGatt is null");
            return false;
        }
        LogUtil.d("HwWspMeasureController", "setCharacteristicNotification uuid ", bluetoothGattCharacteristic.getUuid(), " isEnable", Boolean.valueOf(droVar.c().b()));
        boolean zE = e(bluetoothGattCharacteristic, droVar);
        if (zE && droVar.c().b()) {
            ab();
        }
        return zE;
    }

    private void e(UUID uuid, UUID uuid2, dro droVar, IAsynBleTaskCallback iAsynBleTaskCallback) {
        boolean zB;
        BluetoothGattService service;
        synchronized (this.al) {
            zB = false;
            if (this.j != null) {
                try {
                    service = this.j.getService(uuid);
                } catch (SecurityException e2) {
                    LogUtil.e("HwWspMeasureController", "getService failed, ", e2.getMessage());
                    service = null;
                }
                if (service != null) {
                    BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
                    if (characteristic != null) {
                        zB = b(characteristic, droVar);
                    }
                } else {
                    LogUtil.j("R_Weight_HwWspMeasureController", "enable BluetoothGattService is null");
                }
            } else {
                LogUtil.j("R_Weight_HwWspMeasureController", "enable mBluetoothGatt is null");
            }
        }
        if (zB) {
            if (iAsynBleTaskCallback != null) {
                LogUtil.a("HwWspMeasureController", "disable notification success exec mTaskCallback");
                iAsynBleTaskCallback.success(null);
                return;
            }
            return;
        }
        if (iAsynBleTaskCallback != null) {
            iAsynBleTaskCallback.failed();
            LogUtil.a("HwWspMeasureController", "disable notification fail exec mTaskCallback");
        }
    }

    private boolean a(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        String str;
        int i = 1;
        boolean zWriteCharacteristic = true;
        int i2 = 0;
        while (true) {
            if (i2 >= 3) {
                str = "HwWspMeasureController";
                break;
            }
            bluetoothGattCharacteristic.setValue(bArr);
            bluetoothGattCharacteristic.setWriteType(i);
            if (this.j != null) {
                try {
                    zWriteCharacteristic = this.j.writeCharacteristic(bluetoothGattCharacteristic);
                } catch (SecurityException e2) {
                    LogUtil.e("HwWspMeasureController", "sendWithRetry, writeCharacteristic ", e2.getMessage());
                    zWriteCharacteristic = false;
                }
                str = "HwWspMeasureController";
                LogUtil.a(str, "SDK-->Device:", HexUtils.c(bArr), " tag : ", bluetoothGattCharacteristic.getUuid().toString(), " ret is ", Boolean.valueOf(zWriteCharacteristic), "controller : ", this, "mIsGetRealTime ", Boolean.valueOf(this.ab));
                if (zWriteCharacteristic) {
                    break;
                }
                dye.a(100L);
                LogUtil.a(str, "write package retry failed ", this.bj.b(bArr), "retry num ", Integer.valueOf(i2));
                i2++;
                i = 1;
            } else {
                LogUtil.j("R_Weight_HwWspMeasureController", "mBluetoothGatt is null !");
                return false;
            }
        }
        boolean zWriteCharacteristic2 = zWriteCharacteristic;
        if (zWriteCharacteristic2) {
            return zWriteCharacteristic2;
        }
        ab();
        try {
            zWriteCharacteristic2 = this.j.writeCharacteristic(bluetoothGattCharacteristic);
        } catch (SecurityException e3) {
            LogUtil.e(str, "rewrite failed, ", e3.getMessage());
        }
        boolean z = zWriteCharacteristic2;
        LogUtil.a(str, "rewrite SDK-->Device:", HexUtils.c(bArr), " tag : ", bluetoothGattCharacteristic.getUuid().toString(), "ret is ", Boolean.valueOf(z), " controller:", this, " mIsGetRealTime", Boolean.valueOf(this.ab));
        return z;
    }

    private boolean d(BluetoothGattCharacteristic bluetoothGattCharacteristic, ArrayList<byte[]> arrayList) {
        if (this.j == null || this.mDevice == null) {
            LogUtil.j("R_Weight_HwWspMeasureController", "mBluetoothGatt or mDevice is null");
            return false;
        }
        if (bluetoothGattCharacteristic == null || njy.e(arrayList)) {
            LogUtil.j("HwWspMeasureController", "writeCharacteristic data is null or empty");
            return false;
        }
        Iterator<byte[]> it = arrayList.iterator();
        boolean zA = true;
        while (it.hasNext()) {
            zA = a(bluetoothGattCharacteristic, it.next());
            if (!zA) {
                return zA;
            }
            dye.a(10L);
        }
        return zA;
    }

    private boolean b(BluetoothGattCharacteristic bluetoothGattCharacteristic, ArrayList<byte[]> arrayList) {
        if (this.j == null || this.mDevice == null || njy.e(arrayList)) {
            LogUtil.j("HwWspMeasureController", "mBluetoothGatt or mDevice or packages is null");
            return false;
        }
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        if (this.h == null) {
            ac();
        }
        Iterator<byte[]> it = arrayList.iterator();
        boolean zA = true;
        while (it.hasNext()) {
            zA = a(bluetoothGattCharacteristic, it.next());
            if (!zA) {
                return zA;
            }
            dye.a(3L);
        }
        return zA;
    }

    public void c(boolean z) {
        LogUtil.a("HwWspMeasureController", "Begin to get weight unit isManualGetUnit:", Boolean.valueOf(z));
        this.ai = z;
        this.bj.s();
    }

    public void q() {
        if (this.ab) {
            LogUtil.j("HwWspMeasureController", "RealTimeWeight has been send.");
            return;
        }
        this.bj.p();
        LogUtil.a("HwWspMeasureController", "RealTimeWeight send, set mIsMeasureButtonClicked = false");
        this.af = false;
        this.ab = true;
    }

    private boolean b(dro droVar) {
        if (droVar == null) {
            return false;
        }
        UUID uuidC = dpg.al;
        UUID uuidA = dpg.f;
        LogUtil.a("HwWspMeasureController", "writeDataOnce taskType:", droVar.f());
        dpg.e eVar = dpg.b().get(droVar.f());
        if (eVar != null) {
            uuidC = eVar.c();
            uuidA = eVar.a();
        }
        return e(uuidC, uuidA, droVar);
    }

    private boolean e(UUID uuid, UUID uuid2, dro droVar) {
        BluetoothGattService service;
        boolean zB;
        synchronized (this.al) {
            if (this.j == null) {
                LogUtil.j("HwWspMeasureController", "HwWspMeasureController mBluetoothGatt is null");
                return false;
            }
            try {
                service = this.j.getService(uuid);
            } catch (SecurityException e2) {
                LogUtil.e("HwWspMeasureController", "writeDataSucceeded, getService ", e2.getMessage());
                service = null;
            }
            LogUtil.a("HwWspMeasureController", "gattService is : %s", service);
            if (service == null) {
                LogUtil.j("HwWspMeasureController", "HwWspMeasureController write BluetoothGattService is null");
            } else {
                BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
                LogUtil.a("HwWspMeasureController", "uuid:", uuid2, "gattCharacteristic:", characteristic);
                if (characteristic != null && droVar.d() != null) {
                    int i = AnonymousClass6.f32158b[droVar.f().ordinal()];
                    if (i == 1) {
                        if (this.h == null) {
                            ac();
                        }
                        zB = b(characteristic, dye.a(this.h.a(droVar.d())));
                    } else if (i == 2) {
                        zB = d(characteristic, dnz.c(droVar.d(), droVar.g(), this.mDevice.getAddress(), this.aj));
                    } else {
                        zB = d(characteristic, dnz.a(droVar.d(), droVar.g(), this.mDevice.getAddress(), this.aj));
                    }
                    LogUtil.a("HwWspMeasureController", "Write key:", droVar.f().toString(), " result:", Boolean.valueOf(zB));
                    return zB;
                }
                LogUtil.j("HwWspMeasureController", "HwWspMeasureController gattCharacteristic is null");
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: doq$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f32158b;

        static {
            int[] iArr = new int[BleTaskQueueUtil.TaskType.values().length];
            f32158b = iArr;
            try {
                iArr[BleTaskQueueUtil.TaskType.WRITE_BLE_FILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32158b[BleTaskQueueUtil.TaskType.SEND_HILINK_CONFIG_INFO_ENCRYPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.huawei.health.device.kit.wsp.task.ITaskService
    public void write(dro droVar, IAsynBleTaskCallback iAsynBleTaskCallback) {
        boolean zB;
        droVar.c(iAsynBleTaskCallback);
        if ((!dxm.aq(this.av) && this.j == null) || this.mDevice == null) {
            this.ag = false;
            LogUtil.j("R_Weight_HwWspMeasureController", "mBluetoothGatt or mDevice is null when write");
            if (iAsynBleTaskCallback != null) {
                iAsynBleTaskCallback.failed();
                return;
            }
            return;
        }
        if (dxm.aq(this.av)) {
            zB = e(droVar);
        } else {
            zB = b(droVar);
        }
        if (!zB) {
            if (iAsynBleTaskCallback != null) {
                iAsynBleTaskCallback.failed();
                LogUtil.a("R_Weight_HwWspMeasureController", "write fail execute mTaskCallback");
                return;
            }
            return;
        }
        if (droVar.h() > 0) {
            if (droVar.a() < 1) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = droVar;
                messageObtain.what = droVar.f().ordinal() + 1000;
                droVar.c(droVar.a() + 1);
                this.aq.sendMessageDelayed(messageObtain, droVar.h());
            } else {
                LogUtil.j("HwWspMeasureController", "Max retry times:", Integer.valueOf(droVar.a()), " data type : ", droVar.f());
            }
        }
        if (iAsynBleTaskCallback != null) {
            iAsynBleTaskCallback.success(null);
            LogUtil.a("HwWspMeasureController", "write success execute mTaskCallback");
        }
    }

    private boolean e(dro droVar) {
        if (droVar == null) {
            return false;
        }
        synchronized (this.al) {
            if (this.mDevice == null) {
                LogUtil.j("HwWspMeasureController", "writeDataUds : mDevice is null");
                return false;
            }
            String address = this.mDevice.getAddress();
            if (!TextUtils.isEmpty(address)) {
                UniteDevice uniteDeviceB = dxx.d().b(address);
                cmg[] cmgVarArrC = drc.c(droVar);
                if (cmgVarArrC != null && cmgVarArrC[0].f() != null) {
                    LogUtil.a("HwWspMeasureController", "writeDataUds : Write key:", droVar.f().toString(), "; and sendCommand : uuid = ", cmgVarArrC[0].c(), " data = ", eeq.e(cmgVarArrC[0].b()), " SendMode = ", Integer.valueOf(cmgVarArrC[0].f().value()));
                } else {
                    LogUtil.j("HwWspMeasureController", "writeDataUds : Write key: udsCommands is null or udsCommands[0].getSendMode() is null");
                }
                if (cmgVarArrC != null && cmgVarArrC.length > 0 && dpg.j.toString().equals(cmgVarArrC[0].c())) {
                    d(uniteDeviceB, cmgVarArrC);
                } else {
                    drc.b().c(uniteDeviceB, cmgVarArrC);
                }
                return true;
            }
            LogUtil.j("HwWspMeasureController", "writeDataUds : macAddress is null");
            return false;
        }
    }

    private void d(UniteDevice uniteDevice, cmg[] cmgVarArr) {
        drc.b().c(uniteDevice, new cmg[]{cmgVarArr[0]});
        if (cmgVarArr.length > 1) {
            ArrayList<cmg> arrayList = new ArrayList<>(10);
            for (int i = 1; i < cmgVarArr.length; i++) {
                arrayList.add(cmgVarArr[i]);
            }
            this.bj.b(arrayList);
            this.bj.b(uniteDevice);
        }
    }

    @Override // com.huawei.health.device.kit.wsp.task.ITaskService
    public void enable(dro droVar, IAsynBleTaskCallback iAsynBleTaskCallback) {
        UUID uuidC = dpg.am;
        UUID uuidA = dpg.f32186a;
        LogUtil.a("HwWspMeasureController", "enable BluetoothGattService");
        dpg.e eVar = dpg.b().get(droVar.f());
        if (eVar != null) {
            uuidC = eVar.c();
            uuidA = eVar.a();
        }
        if (dxm.aq(this.av)) {
            dye.d(uuidC, uuidA, droVar, iAsynBleTaskCallback, this.mDevice);
        } else {
            e(uuidC, uuidA, droVar, iAsynBleTaskCallback);
        }
    }

    @Override // com.huawei.health.device.kit.wsp.task.ITaskService
    public void disable(dro droVar, IAsynBleTaskCallback iAsynBleTaskCallback) {
        if (droVar == null || droVar.c() == null || droVar.b() == null) {
            LogUtil.j("HwWspMeasureController", "disable illegal task data");
            return;
        }
        Bundle bundleB = droVar.b();
        if (bundleB == null || bundleB.getSerializable("service_uuid") == null || bundleB.getSerializable("characteristic_uuid") == null) {
            LogUtil.j("HwWspMeasureController", "disable notification serviceUuid/characteristicUuid is null");
            return;
        }
        Serializable serializable = bundleB.getSerializable("service_uuid");
        if (!(serializable instanceof UUID)) {
            LogUtil.j("HwWspMeasureController", "disable serviceUuid is not set value");
            return;
        }
        UUID uuid = (UUID) serializable;
        Serializable serializable2 = bundleB.getSerializable("characteristic_uuid");
        if (!(serializable2 instanceof UUID)) {
            LogUtil.j("HwWspMeasureController", "disable characteristicUuid is not set value");
            return;
        }
        UUID uuid2 = (UUID) serializable2;
        if (dxm.aq(this.av)) {
            dye.d(uuid, uuid2, droVar, iAsynBleTaskCallback, this.mDevice);
        } else {
            e(uuid, uuid2, droVar, iAsynBleTaskCallback);
        }
    }

    public boolean b(UUID uuid) {
        return dye.c(this.mDevice, this.av, e, uuid);
    }

    public void c(byte[] bArr, UUID uuid, UUID uuid2) {
        synchronized (this.al) {
            int i = this.ba;
            boolean z = (i == -6 || i == -5) ? false : true;
            if (this.j != null && z) {
                if (this.bb == 2) {
                    LogUtil.a("HwWspMeasureController", "sending heart beat!");
                    try {
                        a(this.j.getService(uuid), bArr, uuid2);
                    } catch (SecurityException unused) {
                        LogUtil.j("R_Weight_HwWspMeasureController", "mBluetoothGatt SecurityException");
                    }
                } else {
                    LogUtil.j("R_Weight_HwWspMeasureController", "mState != BluetoothProfile.STATE_CONNECTED");
                }
            } else {
                LogUtil.j("R_Weight_HwWspMeasureController", "mBluetoothGatt is null");
            }
        }
    }

    public void b(BleTaskQueueUtil.TaskType taskType, byte[] bArr) {
        this.bj.b(taskType, bArr);
    }

    private void a(BluetoothGattService bluetoothGattService, byte[] bArr, UUID uuid) {
        if (bluetoothGattService == null) {
            LogUtil.j("R_Weight_HwWspMeasureController", "write BluetoothGattService is null");
            return;
        }
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(uuid);
        if (characteristic == null) {
            LogUtil.j("R_Weight_HwWspMeasureController", "gattCharacteristic is null");
        } else {
            characteristic.setValue(bArr);
            LogUtil.a("HwWspMeasureController", "Write key:", " isSuccess:", Boolean.valueOf(d(characteristic, dnz.a(bArr, false, this.mDevice.getAddress(), this.aj))));
        }
    }

    public void a() {
        this.bj.e();
    }

    public void d(int i) {
        this.ba = i;
    }

    public String j() {
        return this.av;
    }

    public String g() {
        return this.be;
    }

    public void e(boolean z) {
        this.aj = z;
    }

    public void b(boolean z) {
        this.am = z;
    }

    public boolean o() {
        return this.am;
    }

    public void b(int i) {
        this.bd = i;
    }

    public void c(int i) {
        this.az = i;
    }

    public String n() {
        return this.bm;
    }

    public void b(String str) {
        this.bm = str;
    }

    public boolean f() {
        return this.z;
    }

    public void d(boolean z) {
        this.z = z;
    }

    public void c(IHealthDeviceCallback iHealthDeviceCallback) {
        this.bj.a(iHealthDeviceCallback);
    }

    public void v() {
        this.bj.y();
    }

    public boolean i() {
        return this.an;
    }

    public boolean r() {
        return dye.a(this.n);
    }

    public void t() {
        this.bh = -1;
    }

    public void c() {
        this.bj.b(this.mDevice, 1);
    }
}
