package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.smarthome.ble_core.R;
import com.xiaomi.smarthome.bluetooth.Response;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BtConstants;
import com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.framework.plugin.rn.RnModuleProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider;
import com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTUtils;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnCallbackMapUtil;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.BleGattProfile;
import com.xiaomi.smarthome.library.bluetooth.connect.BleGattService;
import com.xiaomi.smarthome.library.bluetooth.connect.Code;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.library.util.GlobalHandlerManager;
import com.xiaomi.smarthome.rn.core.bean.RnPluginDeviceInfo;
import com.xiaomi.smarthome.shop.utils.ToastUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class cuk implements IRnBluetoothProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, UUID> f14728a = new HashMap();

    public class a implements Response.BleConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f14729a;

        public a(Callback callback) {
            this.f14729a = callback;
        }

        @Override // com.xiaomi.smarthome.bluetooth.Response.BleResponse
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, Bundle bundle) {
            cuk.this.b(i, bundle, this.f14729a);
        }
    }

    public class b implements IBleSecureConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callback f14732b;

        public b(String str, Callback callback) {
            this.f14731a = str;
            this.f14732b = callback;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onAuthResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onBindResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onConnectResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onLastResponse(int i, Bundle bundle) {
            if (i == 0) {
                Intent intent = new Intent(BluetoothConstants.ACTION_ONLINE_STATUS_CHANGED);
                intent.putExtra("extra_mac", this.f14731a);
                intent.putExtra("extra_online_status", 80);
                BluetoothUtils.sendBroadcast(intent);
            }
            BluetoothLog.i("connect  " + i + "  " + bundle);
            cuk.this.b(i, bundle, this.f14732b);
        }
    }

    public class c implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f14733a;

        public c(Callback callback) {
            this.f14733a = callback;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            Callback callback = this.f14733a;
            if (callback != null) {
                callback.invoke(objArr);
            }
        }
    }

    public class d implements wa3<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f14735a;

        public d(Callback callback) {
            this.f14735a = callback;
        }

        @Override // defpackage.wa3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Bundle bundle) {
            MRnLog.i("RnBluetoothProviderImpl", "doSpecOperation onSuccess start,");
            Callback callback = this.f14735a;
            if (callback != null) {
                try {
                    if (bundle == null) {
                        callback.invoke(Boolean.TRUE, Arguments.createMap());
                    } else {
                        String string = bundle.getString("key_spec_json_resp");
                        MRnLog.i("RnBluetoothProviderImpl", "doSpecOperation onSuccess,json=" + string);
                        this.f14735a.invoke(Boolean.TRUE, string);
                    }
                } catch (Exception e) {
                    MRnLog.e("RnBluetoothProviderImpl", "doSpecOperation onSuccess,error=" + e);
                }
            }
        }

        @Override // defpackage.wa3
        public void onFail(int i, String str) {
            MRnLog.i("RnBluetoothProviderImpl", "doSpecOperation onFail start,code=" + i + ",msg=" + str);
            if (this.f14735a != null) {
                try {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putInt("code", i);
                    writableMapCreateMap.putString("message", str);
                    this.f14735a.invoke(Boolean.FALSE, writableMapCreateMap);
                } catch (Exception e) {
                    MRnLog.e("RnBluetoothProviderImpl", "doSpecOperation onFail,code=" + i + ",msg=" + str + ",error=" + e);
                }
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BluetoothUtils.openBluetoothSilently();
        }
    }

    public class f implements zvc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f14738a;

        public f(Callback callback) {
            this.f14738a = callback;
        }

        @Override // zvc.a
        public void onDenied() {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putBoolean("checkBluetooth", false);
            this.f14738a.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(writableMapCreateMap));
        }

        @Override // zvc.a
        public void onGranted() {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putBoolean("checkBluetooth", true);
            this.f14738a.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(writableMapCreateMap));
        }
    }

    public class g implements IBleSecureConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f14741b;
        public final /* synthetic */ DeviceStat c;
        public final /* synthetic */ ReadableMap d;
        public final /* synthetic */ Callback e;
        public final /* synthetic */ int f;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ int h;

        public g(String str, Activity activity, DeviceStat deviceStat, ReadableMap readableMap, Callback callback, int i, boolean z, int i2) {
            this.f14740a = str;
            this.f14741b = activity;
            this.c = deviceStat;
            this.d = readableMap;
            this.e = callback;
            this.f = i;
            this.g = z;
            this.h = i2;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onAuthResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onBindResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onConnectResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onLastResponse(int i, Bundle bundle) {
            BluetoothLog.i("connect  " + i + "  " + bundle);
            if (-10 == i) {
                nq2.b(this.f14740a);
                cuk.this.connect(this.f14741b, this.c, this.f14740a, 0, this.d, this.e);
                return;
            }
            if (this.f != -1) {
                cuk.this.b(i, bundle, this.e);
                if (i == 0 && this.g) {
                    cuk.this.c(this.h, this.f14740a);
                    return;
                }
                return;
            }
            if (i != 0) {
                cuk.this.connect(this.f14741b, this.c, this.f14740a, 3, this.d, this.e);
                return;
            }
            cuk.this.b(i, bundle, this.e);
            if (i == 0 && this.g) {
                cuk.this.c(this.h, this.f14740a);
            }
        }
    }

    public class h implements IBleSecureConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f14742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f14743b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;

        public h(Callback callback, boolean z, int i, String str) {
            this.f14742a = callback;
            this.f14743b = z;
            this.c = i;
            this.d = str;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onAuthResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onBindResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onConnectResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onLastResponse(int i, Bundle bundle) {
            BluetoothLog.i("connect  " + i + "  " + bundle);
            cuk.this.b(i, bundle, this.f14742a);
            if (i == 0 && this.f14743b) {
                cuk.this.c(this.c, this.d);
            }
        }
    }

    public class i implements IBleSecureConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f14744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callback f14745b;

        public i(String str, Callback callback) {
            this.f14744a = str;
            this.f14745b = callback;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onAuthResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onBindResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onConnectResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onLastResponse(int i, Bundle bundle) {
            if (i == 0) {
                Intent intent = new Intent(BluetoothConstants.ACTION_ONLINE_STATUS_CHANGED);
                intent.putExtra("extra_mac", this.f14744a);
                intent.putExtra("extra_online_status", 80);
                BluetoothUtils.sendBroadcast(intent);
            }
            BluetoothLog.i("connect  " + i + "  " + bundle);
            cuk.this.b(i, bundle, this.f14745b);
        }
    }

    public class j extends BluetoothResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f14746a;

        public j(Callback callback) {
            this.f14746a = callback;
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
        public void onResponse(int i, Bundle bundle) throws RemoteException {
            BluetoothLog.i("connect  " + i + "  " + bundle);
            cuk.this.b(i, bundle, this.f14746a);
        }
    }

    public class k implements IBleSecureConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f14748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f14749b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;

        public k(Callback callback, boolean z, int i, String str) {
            this.f14748a = callback;
            this.f14749b = z;
            this.c = i;
            this.d = str;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onAuthResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onBindResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onConnectResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onLastResponse(int i, Bundle bundle) {
            cuk.this.b(i, bundle, this.f14748a);
            if (i == 0 && this.f14749b) {
                cuk.this.c(this.c, this.d);
            }
        }
    }

    public void b(int i2, Bundle bundle, Callback callback) {
        UUID uuid;
        UUID uuid2;
        if (callback != null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj == null) {
                        writableMapCreateMap.putNull(str);
                    } else if (obj instanceof byte[]) {
                        writableMapCreateMap.putString(str, MIOTUtils.byte2String((byte[]) obj));
                    } else if (obj.getClass().isArray()) {
                        try {
                            writableMapCreateMap.putArray(str, Arguments.fromArray(obj));
                        } catch (Throwable unused) {
                        }
                    } else if (obj instanceof String) {
                        writableMapCreateMap.putString(str, (String) obj);
                    } else if (obj instanceof Number) {
                        if (obj instanceof Integer) {
                            writableMapCreateMap.putInt(str, ((Integer) obj).intValue());
                        } else {
                            writableMapCreateMap.putDouble(str, ((Number) obj).doubleValue());
                        }
                    } else if (obj instanceof Boolean) {
                        writableMapCreateMap.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof List) {
                        writableMapCreateMap.putArray(str, Arguments.fromList((List) obj));
                    } else if (obj instanceof BleGattProfile) {
                        WritableArray writableArrayCreateArray = Arguments.createArray();
                        for (BleGattService bleGattService : ((BleGattProfile) obj).getServices()) {
                            if (bleGattService != null && (uuid = bleGattService.getUUID()) != null) {
                                WritableMap writableMapCreateMap2 = Arguments.createMap();
                                String lowerCase = uuid.toString().toLowerCase();
                                this.f14728a.put(lowerCase, uuid);
                                writableMapCreateMap2.putString("uuid", lowerCase);
                                List<ParcelUuid> characters = bleGattService.getCharacters();
                                if (characters != null) {
                                    WritableArray writableArrayCreateArray2 = Arguments.createArray();
                                    for (ParcelUuid parcelUuid : characters) {
                                        if (parcelUuid != null && (uuid2 = parcelUuid.getUuid()) != null) {
                                            String lowerCase2 = uuid2.toString().toLowerCase();
                                            this.f14728a.put(lowerCase2, uuid2);
                                            writableArrayCreateArray2.pushString(lowerCase2);
                                        }
                                    }
                                    writableMapCreateMap2.putArray("chars", writableArrayCreateArray2);
                                    writableArrayCreateArray.pushMap(writableMapCreateMap2);
                                }
                            }
                        }
                        writableMapCreateMap.putArray("services", writableArrayCreateArray);
                    }
                }
            }
            writableMapCreateMap.putInt("code", i2);
            if (i2 != -55) {
                switch (i2) {
                    case -35:
                        writableMapCreateMap.putString("msg", "REQUEST_SC_REGISTER_PAIR_CODE_EXPIRED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case -34:
                        writableMapCreateMap.putString("msg", "REQUEST_SC_REGISTER_PAIR_CODE_FAILED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case -33:
                        writableMapCreateMap.putString("msg", "REQUEST_SC_REGISTER_INPUT_PAIR_CODE");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case -32:
                        writableMapCreateMap.putString("msg", "REQUEST_STATUS_DISCONNECTED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case -31:
                        writableMapCreateMap.putString("msg", "REQUEST_TOKEN_VERIFY_FAILED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case -30:
                        writableMapCreateMap.putString("msg", "REQUEST_BIND_DID_FAILED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case Code.REQUEST_GET_DID_FAILED /* -29 */:
                        writableMapCreateMap.putString("msg", "REQUEST_GET_DID_FAILED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case Code.REQUEST_WRITE_FAILED /* -28 */:
                        writableMapCreateMap.putString("msg", "REQUEST_WRITE_FAILED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case Code.REQUEST_NOTIFY_FAILED /* -27 */:
                        writableMapCreateMap.putString("msg", "REQUEST_NOTIFY_FAILED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case Code.REQUEST_SC_BIND_LTMK_FAILED /* -26 */:
                        writableMapCreateMap.putString("msg", "REQUEST_SC_BIND_LTMK_FAILED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case Code.REQUEST_SC_SHARED_LOGIN_KEY_ID_EMPTY /* -25 */:
                        writableMapCreateMap.putString("msg", "REQUEST_SC_SHARED_LOGIN_KEY_ID_EMPTY");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case Code.REQUEST_SC_SHARED_LOGIN_FAILED /* -24 */:
                        writableMapCreateMap.putString("msg", "REQUEST_SC_SHARED_LOGIN_FAILED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case Code.REQUEST_SC_SHARED_LOGIN_ENCRYPT_DATA_FAILED /* -23 */:
                        writableMapCreateMap.putString("msg", "REQUEST_SC_SHARED_LOGIN_ENCRYPT_DATA_FAILED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case Code.REQUEST_SC_LOGIN_FAILED /* -22 */:
                        writableMapCreateMap.putString("msg", "REQUEST_SC_LOGIN_FAILED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case Code.REQUEST_SC_LOGIN_ENCRYPT_DATA_FAILED /* -21 */:
                        writableMapCreateMap.putString("msg", "REQUEST_SC_LOGIN_ENCRYPT_DATA_FAILED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case Code.REQUEST_SC_REGISTER_FAILED /* -20 */:
                        writableMapCreateMap.putString("msg", "REQUEST_SC_REGISTER_FAILED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case Code.REQUEST_SC_SHARED_KEY_FAILED /* -19 */:
                        writableMapCreateMap.putString("msg", "REQUEST_SC_SHARED_KEY_FAILED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case Code.REQUEST_SC_SHARED_KEY_EXPIRED /* -18 */:
                        writableMapCreateMap.putString("msg", "REQUEST_SHARED_KEY_EXPIRED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case -17:
                        writableMapCreateMap.putString("msg", "REQUEST_REGISTERED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case -16:
                        writableMapCreateMap.putString("msg", "REQUEST_NOT_REGISTERED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case -15:
                        writableMapCreateMap.putString("msg", "REQUEST_EXCEPTION");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case -14:
                        writableMapCreateMap.putString("msg", "REQUEST_DENIED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case -13:
                        writableMapCreateMap.putString("msg", "REQUEST_ONGOING");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case -12:
                        writableMapCreateMap.putString("msg", "CONFIG_UNREADY");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case -11:
                        writableMapCreateMap.putString("msg", "REQUEST_OVERFLOW");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    case -10:
                        writableMapCreateMap.putString("msg", "TOKEN_NOT_MATCHED");
                        callback.invoke(Boolean.FALSE, writableMapCreateMap);
                        return;
                    default:
                        switch (i2) {
                            case -7:
                                break;
                            case -6:
                                writableMapCreateMap.putString("msg", "CONNECTION_NOT_READY");
                                callback.invoke(Boolean.FALSE, writableMapCreateMap);
                                break;
                            case -5:
                                writableMapCreateMap.putString("msg", "BLUETOOTH_DISABLED");
                                callback.invoke(Boolean.FALSE, writableMapCreateMap);
                                break;
                            case -4:
                                writableMapCreateMap.putString("msg", "BLE_NOT_SUPPORTED");
                                callback.invoke(Boolean.FALSE, writableMapCreateMap);
                                break;
                            case -3:
                                writableMapCreateMap.putString("msg", "ILLEGAL_ARGUMENT");
                                callback.invoke(Boolean.FALSE, writableMapCreateMap);
                                break;
                            case -2:
                                writableMapCreateMap.putString("msg", "REQUEST_CANCELED");
                                callback.invoke(Boolean.FALSE, writableMapCreateMap);
                                break;
                            case -1:
                                writableMapCreateMap.putString("msg", "REQUEST_FAILED");
                                callback.invoke(Boolean.FALSE, writableMapCreateMap);
                                break;
                            case 0:
                                callback.invoke(Boolean.TRUE, writableMapCreateMap);
                                break;
                            default:
                                writableMapCreateMap.putString("msg", "unknow");
                                callback.invoke(Boolean.FALSE, writableMapCreateMap);
                                break;
                        }
                }
            }
            writableMapCreateMap.putString("msg", "REQUEST_TIMEDOUT");
            callback.invoke(Boolean.FALSE, writableMapCreateMap);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void bindDevice(String str) {
        BluetoothService.getInstance(MiJiaEnvironment.getAppContext()).callBluetoothApi(str, 33, null, null);
    }

    public final void c(int i2, String str) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void call(String str, int i2, ReadableMap readableMap, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void checkBluetoothPermission(Activity activity, Callback callback) {
        mvk.e().f().checkBluetoothPermission(activity, new f(callback));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void connect(Activity activity, DeviceStat deviceStat, String str, int i2, ReadableMap readableMap, Callback callback) {
        d(activity, deviceStat, str, i2, readableMap, new c(callback));
    }

    public void d(Activity activity, DeviceStat deviceStat, String str, int i2, ReadableMap readableMap, Callback callback) {
        int i3;
        MRnLog.i("RnBluetoothProviderImpl", String.format("connectDevice start,mac=%s,type=%s", str, Integer.valueOf(i2)));
        if (BluetoothUtils.isBluetoothHalfOpen()) {
            callback.invoke(Boolean.FALSE, "ble is half open");
            ToastUtil.show(activity, R.string.open_bluetooth_switch);
            return;
        }
        if (deviceStat == null) {
            callback.invoke(Boolean.FALSE, "deviceStat == null");
            return;
        }
        RnPluginDeviceInfo pluginInfo = ((IRnRuntimeProvider) RnModuleProvider.as(IRnRuntimeProvider.class)).getPluginInfo();
        if (pluginInfo == null) {
            callback.invoke(Boolean.FALSE, "no pluginRecord");
            return;
        }
        if (i2 != -1) {
            i3 = i2;
        } else if (pluginInfo.getBluetoothSecurityChip() == 1) {
            i3 = (deviceStat.permitLevel & 16) != 0 ? 1 : 2;
        } else {
            i3 = 0;
        }
        double d2 = MIOTUtils.getDouble(readableMap, "timeout", 35000.0d);
        int i4 = MIOTUtils.getInt(readableMap, "discoverRetry", 2);
        double d3 = MIOTUtils.getDouble(readableMap, "discoverTimeout", d2 / ((double) Math.max(i4, 1)));
        int i5 = MIOTUtils.getInt(readableMap, "connectRetry", 1);
        boolean z = MIOTUtils.getBoolean(readableMap, "checkFirmwareVersion");
        BleConnectOptions bleConnectOptionsBuild = new BleConnectOptions.Builder().setConnectRetry(i5).setConnectTimeout((int) d2).setServiceDiscoverRetry(i4).setNoReportBleInfo(MIOTUtils.getBoolean(readableMap, "noReportBleInfo")).setServiceDiscoverTimeout((int) d3).build();
        String str2 = deviceStat.model;
        MRnLog.i("RnBluetoothProviderImpl", String.format("connectDevice start,model=%s", str2));
        if (i3 == 0) {
            g23.c(str, bleConnectOptionsBuild, new g(str, activity, deviceStat, readableMap, callback, i2, z, i3));
            return;
        }
        if (i3 == 1) {
            g23.d(str, bleConnectOptionsBuild, new h(callback, z, i3, str));
            return;
        }
        if (i3 == 2) {
            g23.e(str, bleConnectOptionsBuild, new i(str, callback));
            return;
        }
        if (i3 == 3) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(BtConstants.KEY_OPTIONS, bleConnectOptionsBuild);
            BluetoothService.getInstance(MiJiaEnvironment.getAppContext()).callBluetoothApi(str, 1, bundle, new j(callback));
        } else {
            if (i3 == 4) {
                q23.c(str2, str, bleConnectOptionsBuild, new k(callback, z, i3, str));
                return;
            }
            if (i3 != 5) {
                if (i3 == 6) {
                    g23.f(str2, str, bleConnectOptionsBuild, new b(str, callback));
                }
            } else {
                String string = MIOTUtils.getString(readableMap, "did");
                BluetoothMyLogger.d("ble mesh did =" + string);
                g23.a(str, string, deviceStat.token, new a(callback));
            }
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void decryptMessageXiaoMiBLE(String str, String str2, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void disconnectDeviceWithDelay(String str, double d2) {
        long j2 = d2 > 0.0d ? (long) d2 : 0L;
        Bundle bundle = new Bundle();
        if (j2 > 0) {
            bundle.putLong(IBluetoothService.EXTRA_DELAY, j2);
        }
        bundle.putBoolean(IBluetoothService.EXTRA_FROM_RN, true);
        BluetoothService.getInstance(MiJiaEnvironment.getAppContext()).callBluetoothApi(str, 2, bundle, null);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void doSpecOperation(String str, int i2, String str2, Callback callback) {
        MRnLog.i("RnBluetoothProviderImpl", String.format("doSpecOperation start,mac=%s,opCode=%s,json=%s,callback=%s", str, Integer.valueOf(i2), str2, callback));
        m5n.c(str, i2, str2, null, new d(callback));
    }

    public final void e(Context context, int i2) {
        if (BluetoothUtils.checkBluetoothPermission() && context != null && (context instanceof Activity) && !BluetoothUtils.isBluetoothEnabled()) {
            try {
                ((Activity) context).startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), i2);
            } catch (Exception e2) {
                ToastUtil.show(context, R.string.open_bluetooth_switch);
                MiJiaLog.writeLogOnAll(LogType.PLUGIN, "miot-rn-plugin", "openBluetooth err : " + Log.getStackTraceString(e2));
            }
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void encryptMessageXiaoMiBLE(String str, String str2, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void generateOneTimePwdBySelf(ReadableMap readableMap, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void getOneTimePassword(String str, int i2, int i3, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public String getTokenMd5(String str) {
        return null;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void getVersion(String str, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void goToWifiConfigStep(Activity activity, String str) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void initOneTimeContextBySelf(ReadableMap readableMap, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public boolean isAutoReconnect(String str) {
        return false;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void isBleGatewayConnected(String str, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public boolean isBluetoothHalfOpen() {
        return false;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public boolean isBluetoothOpen() {
        return BluetoothUtils.isBluetoothEnabled();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void isSecurityChipSharedKeyValid(String str, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void miotBleDecrypt(String str, String str2, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void miotBleEncrypt(String str, String str2, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void onCatalystInstanceDestroy(String str) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void openBluetooth(Activity activity, String str, boolean z) {
        if (z) {
            GlobalHandlerManager.getInstance().getGlobalWorkerHandler().post(new e());
        } else {
            e(activity, 16);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void readHexStringWithCallback(String str, String str2, String str3, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void readRSSI(String str, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void registerBlockListener(String str, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void registerCharacterChanged(String str, String str2, String str3, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void registerMediaButtonReceiver(String str) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void removeToken(String str) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void setAlertConfigs(String str, int i2, boolean z, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void setAutoReconnect(String str, boolean z, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void setIndicationWithCallback(String str, boolean z, String str2, String str3, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void setNotifyWithCallback(String str, boolean z, String str2, String str3, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void startLeScan(ReactApplicationContext reactApplicationContext, int i2, ReadableArray readableArray) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void startScan(ReactApplicationContext reactApplicationContext, int i2, int i3) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void stopScan() {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void toggleLockXiaoMiBLE(String str, int i2, int i3, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void unBindDevice(String str) {
        BluetoothService.getInstance(MiJiaEnvironment.getAppContext()).callBluetoothApi(str, 34, null, null);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void unRegisterMediaButtonReceiver(String str) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void unregisterBlockListener(String str) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void unregisterCharacterChanged(String str, String str2, String str3) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void writeBlock(String str, String str2, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnBluetoothProvider
    public void writeHexStringWithCallback(String str, String str2, String str3, String str4, int i2, Callback callback) {
    }
}
