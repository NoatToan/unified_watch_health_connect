package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.miui.tsmclient.model.ErrorCode;
import com.smarthome.core.scan.BleSearchResponse;
import com.smarthome.core.scan.DeviceScanManager;
import com.xiaomi.smarthome.bluetooth.Response;
import com.xiaomi.smarthome.cache.BleCacheManager;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.IBluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecureConnectManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.SecureConnectOptions;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.device.api.BleMeshFirmwareUpdateInfo;
import com.xiaomi.smarthome.device.api.Callback;
import com.xiaomi.smarthome.device.api.McuUpdateInfo;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class f23 {

    public class a implements NetCallback<NetResult, NetError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callback f17314b;

        public a(String str, Callback callback) {
            this.f17313a = str;
            this.f17314b = callback;
        }

        @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCache(NetResult netResult) {
        }

        @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onFailure(NetError netError) {
            this.f17314b.onFailure(netError.getCode(), netError.toString());
        }

        @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(NetResult netResult) {
            String str = netResult.mResponse;
            if (TextUtils.isEmpty(str)) {
                this.f17314b.onFailure(-1, "response empty ! ");
                return;
            }
            if (!TextUtils.isEmpty(this.f17313a)) {
                BluetoothCache.setBleFirmwareUpdateInfo(this.f17313a, str);
            }
            try {
                this.f17314b.onSuccess(f23.i(str, this.f17313a));
            } catch (JSONException unused) {
                this.f17314b.onFailure(-1, "response parse error ! ");
            }
        }
    }

    public class b extends BluetoothResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Response.BleReadFirmwareVersionResponse f17315a;

        public b(Response.BleReadFirmwareVersionResponse bleReadFirmwareVersionResponse) {
            this.f17315a = bleReadFirmwareVersionResponse;
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
        public void onResponse(int i, Bundle bundle) throws RemoteException {
            this.f17315a.onResponse(i, bundle.getString(IBluetoothService.EXTRA_VALUE));
        }
    }

    public class c implements IBleSecureConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Device f17317b;
        public final /* synthetic */ Response.BleConnectResponse c;

        public c(String str, Device device, Response.BleConnectResponse bleConnectResponse) {
            this.f17316a = str;
            this.f17317b = device;
            this.c = bleConnectResponse;
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
                DeviceApi.reportBleMeshVersion(this.f17316a, this.f17317b.did, null);
            }
            try {
                this.c.onResponse(i, bundle);
            } catch (Throwable th) {
                BluetoothLog.e(th);
            }
        }
    }

    public class d implements IBleSecureConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Response.BleConnectResponse f17318a;

        public d(Response.BleConnectResponse bleConnectResponse) {
            this.f17318a = bleConnectResponse;
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
            try {
                this.f17318a.onResponse(i, bundle);
            } catch (Throwable th) {
                BluetoothLog.e(th);
            }
        }
    }

    public class e extends BluetoothResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Response.BleConnectResponse f17319a;

        public e(Response.BleConnectResponse bleConnectResponse) {
            this.f17319a = bleConnectResponse;
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
        public void onResponse(int i, Bundle bundle) throws RemoteException {
            Response.BleConnectResponse bleConnectResponse = this.f17319a;
            if (bleConnectResponse != null) {
                if (bundle != null) {
                    bundle.setClassLoader(bleConnectResponse.getClass().getClassLoader());
                }
                this.f17319a.onResponse(i, bundle);
            }
        }
    }

    public class f implements IBleSecureConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Response.BleConnectResponse f17320a;

        public f(Response.BleConnectResponse bleConnectResponse) {
            this.f17320a = bleConnectResponse;
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
            try {
                this.f17320a.onResponse(i, bundle);
            } catch (Throwable th) {
                BluetoothLog.e(th);
            }
        }
    }

    public class g implements IBleSecureConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Response.BleConnectResponse f17321a;

        public g(Response.BleConnectResponse bleConnectResponse) {
            this.f17321a = bleConnectResponse;
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
            try {
                this.f17321a.onResponse(i, bundle);
            } catch (Throwable th) {
                BluetoothLog.e(th);
            }
        }
    }

    public class h implements IBleSecureConnectResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Response.BleConnectResponse f17322a;

        public h(Response.BleConnectResponse bleConnectResponse) {
            this.f17322a = bleConnectResponse;
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
            try {
                this.f17322a.onResponse(i, bundle);
            } catch (Throwable th) {
                BluetoothLog.e(th);
            }
        }
    }

    public static void b(String str, Device device, Response.BleConnectResponse bleConnectResponse) {
        if (device != null && device.isBinded()) {
            BleSecureConnectManager.bleMeshConnect(str, device.did, device.token, new SecureConnectOptions.Builder().setConnectOptions(new BleConnectOptions.Builder().setConnectRetry(2).setConnectTimeout(35000).setServiceDiscoverRetry(2).setServiceDiscoverTimeout(ErrorCode.ERROR_CODE_INVALID_PARAM).build()).build(), new c(str, device, bleConnectResponse));
            return;
        }
        BluetoothMyLogger.v(String.format("bleMeshConnect: %s has unbind", BluetoothMyLogger.getBase64(str)));
        if (bleConnectResponse != null) {
            try {
                bleConnectResponse.onResponse(-1, null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void c(String str, Response.BleConnectResponse bleConnectResponse) {
        BleSecureConnectManager.bleStandardAuthConnect(str, new SecureConnectOptions.Builder().setConnectOptions(new BleConnectOptions.Builder().setConnectRetry(1).setConnectTimeout(35000).setServiceDiscoverRetry(2).setServiceDiscoverTimeout(ErrorCode.ERROR_CODE_INVALID_PARAM).build()).build(), new d(bleConnectResponse));
    }

    public static int d(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return 0;
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (TextUtils.isEmpty(str2)) {
            return 1;
        }
        String[] strArrSplit = str.split("[._]");
        String[] strArrSplit2 = str2.split("[._]");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i = 0; i < iMin; i++) {
            try {
                int i2 = Integer.parseInt(strArrSplit[i]);
                int i3 = Integer.parseInt(strArrSplit2[i]);
                if (i2 != i3) {
                    return i2 - i3;
                }
            } catch (Exception e2) {
                BluetoothLog.e(e2);
                return 0;
            }
        }
        return strArrSplit.length - strArrSplit2.length;
    }

    public static void e(String str, Response.BleConnectResponse bleConnectResponse) {
        BluetoothService.getInstance(MiJiaEnvironment.getAppContext()).callBluetoothApi(str, 1, new Bundle(), new e(bleConnectResponse));
    }

    public static void f(String str) {
        BluetoothService.getInstance(MiJiaEnvironment.getAppContext()).callBluetoothApi(str, 2, new Bundle(), null);
    }

    public static void g(String str, String str2, String str3, Callback<BleMeshFirmwareUpdateInfo> callback) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new KeyValuePair("data", jSONObject.toString()));
            NetRequest.Builder builder = new NetRequest.Builder();
            builder.method("POST").path("/v2/device/latest_ver").addQueries(arrayList);
            if (!TextUtils.isEmpty(str)) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new KeyValuePair("MIOT-REQUEST-MODEL", str));
                builder.addHeaders(arrayList2);
            }
            SmartHomeRc4Api.getInstance().sendRequest(builder.build(), new a(str3, callback));
        } catch (JSONException e2) {
            if (callback != null) {
                callback.onFailure(-1, e2.toString());
            }
        }
    }

    public static void h(String str, Response.BleReadFirmwareVersionResponse bleReadFirmwareVersionResponse) {
        if (bleReadFirmwareVersionResponse == null || TextUtils.isEmpty(str)) {
            return;
        }
        BluetoothService.getInstance(MiJiaEnvironment.getAppContext()).callBluetoothApi(str, 48, new Bundle(), new b(bleReadFirmwareVersionResponse));
    }

    public static BleMeshFirmwareUpdateInfo i(String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str).getJSONObject("result");
        BleMeshFirmwareUpdateInfo bleMeshFirmwareUpdateInfo = new BleMeshFirmwareUpdateInfo();
        bleMeshFirmwareUpdateInfo.version = jSONObject.optString("version");
        bleMeshFirmwareUpdateInfo.safeUrl = jSONObject.optString("safe_url");
        bleMeshFirmwareUpdateInfo.timeout = jSONObject.optInt("time_out", 30);
        bleMeshFirmwareUpdateInfo.url = jSONObject.optString("url");
        bleMeshFirmwareUpdateInfo.changeLog = jSONObject.optString("changeLog");
        bleMeshFirmwareUpdateInfo.md5 = jSONObject.optString("md5");
        if (!TextUtils.isEmpty(str2)) {
            BleCacheManager.getInstance().getBleDeviceState(str2).setLatestVersion(bleMeshFirmwareUpdateInfo.version);
        }
        String strOptString = jSONObject.optString("mcu_version");
        String strOptString2 = jSONObject.optString("mcu_safe_url");
        String strOptString3 = jSONObject.optString("mcu_md5");
        if (!TextUtils.isEmpty(strOptString)) {
            McuUpdateInfo mcuUpdateInfo = new McuUpdateInfo();
            mcuUpdateInfo.version = strOptString;
            mcuUpdateInfo.url = strOptString2;
            mcuUpdateInfo.md5 = strOptString3;
            bleMeshFirmwareUpdateInfo.mcuUpdateInfo = mcuUpdateInfo;
        }
        return bleMeshFirmwareUpdateInfo;
    }

    public static void j(String str) {
        BluetoothCache.setPropToken(str, "");
        BluetoothCache.setPropLtmk(str, "");
        BluetoothCache.setPropPincode(str, "");
        BluetoothCache.setPropLtmkEncryptType(str, 0);
        BluetoothCache.setShowPincode(str, true);
    }

    public static void k(String str, Response.BleConnectResponse bleConnectResponse) {
        BleSecureConnectManager.secureConnect(str, new SecureConnectOptions.Builder().setConnectOptions(new BleConnectOptions.Builder().setConnectRetry(1).setConnectTimeout(35000).setServiceDiscoverRetry(2).setServiceDiscoverTimeout(ErrorCode.ERROR_CODE_INVALID_PARAM).build()).build(), new h(bleConnectResponse));
    }

    public static void l(String str, Response.BleConnectResponse bleConnectResponse) {
        BleSecureConnectManager.securityChipConnect(str, new SecureConnectOptions.Builder().setConnectOptions(new BleConnectOptions.Builder().setConnectRetry(1).setConnectTimeout(35000).setServiceDiscoverRetry(2).setServiceDiscoverTimeout(ErrorCode.ERROR_CODE_INVALID_PARAM).build()).build(), new g(bleConnectResponse));
    }

    public static void m(String str, Response.BleConnectResponse bleConnectResponse) {
        BleSecureConnectManager.securityChipSharedDeviceConnect(str, new SecureConnectOptions.Builder().setConnectOptions(new BleConnectOptions.Builder().setConnectRetry(1).setConnectTimeout(35000).setServiceDiscoverRetry(2).setServiceDiscoverTimeout(ErrorCode.ERROR_CODE_INVALID_PARAM).build()).build(), new f(bleConnectResponse));
    }

    public static void n(int i, BleSearchResponse bleSearchResponse) {
        if (i <= 0 || bleSearchResponse == null) {
            return;
        }
        DeviceScanManager.INSTANCE.startSearchDevice(MiJiaEnvironment.getAppContext(), bleSearchResponse, 10000);
    }
}
