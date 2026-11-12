package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.ContentValues;
import android.text.TextUtils;
import com.huawei.health.device.api.PluginDeviceApi;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import health.compact.a.Services;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class egh extends EngineLogicBaseManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile egh f32939c;
    private static final Object e = new Object();

    private egh() {
        super(BaseApplication.getContext());
    }

    public static egh d() {
        if (f32939c == null) {
            synchronized (e) {
                if (f32939c == null) {
                    f32939c = new egh();
                }
            }
        }
        return f32939c;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        if (xiuVar == null) {
            LogUtil.j("EcologyDeviceDiscoveryFreeDeviceManager", "onReceiveDeviceCommand message is null");
        } else if (xiuVar.c() == 2) {
            LogUtil.a("EcologyDeviceDiscoveryFreeDeviceManager", "onReceiveDeviceCommand message type is file");
        }
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.WATCH_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "com.huawei.watch.ecocenter";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return "com.huawei.watch.ecocenter_BOx7SOHhpgvYBva2HgwiHYsqRO8WMaJyQ/CJ0Wke2W7wNIi/BcC0S2PfPE5vr02mqcCjhbXCtthfTL+k9X0EEYA=";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        LogUtil.a("EcologyDeviceDiscoveryFreeDeviceManager", "connectState ", connectState);
        if (connectState == ConnectState.CONNECTED) {
            LogUtil.a("EcologyDeviceDiscoveryFreeDeviceManager", "onDeviceConnected");
        }
    }

    private String d(ArrayList<ContentValues> arrayList) {
        String strG;
        String strE;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            if (njy.e(arrayList)) {
                LogUtil.j("EcologyDeviceDiscoveryFreeDeviceManager", "bondedDevice is empty");
                return jSONObject.put(BleConstants.DEV_INFO, jSONArray).toString();
            }
            for (ContentValues contentValues : arrayList) {
                String asString = contentValues.getAsString("productId");
                String asString2 = contentValues.getAsString("uniqueId");
                if (BluetoothAdapter.checkBluetoothAddress(asString2)) {
                    elh elhVarD = ResourceManager.c().d(asString);
                    String strD = null;
                    String strC = elhVarD != null ? etn.c(asString, elhVarD.l().d()) : null;
                    ProductMapInfo productMapInfoC = era.c(asString);
                    if (productMapInfoC != null) {
                        strD = productMapInfoC.d();
                        strE = productMapInfoC.e();
                        strG = productMapInfoC.g();
                    } else {
                        strG = null;
                        strE = null;
                    }
                    String asString3 = contentValues.getAsString("name");
                    LogUtil.a("EcologyDeviceDiscoveryFreeDeviceManager", "deviceName=", strC, " model=", strD, " devType=", strE, " bleName=", asString3, " prodId=", strG);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("deviceName", strC);
                    jSONObject2.put("model", strD);
                    jSONObject2.put("devType", strE);
                    jSONObject2.put("bleName", asString3);
                    jSONObject2.put("mac", asString2);
                    jSONObject2.put("prodId", strG);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put(BleConstants.DEV_INFO, jSONArray);
            return jSONObject.toString();
        } catch (JSONException e2) {
            LogUtil.e("EcologyDeviceDiscoveryFreeDeviceManager", "JSONException:", e2.getMessage());
        }
    }

    public void e() {
        String strD = d(((PluginDeviceApi) Services.b("PluginDevice", PluginDeviceApi.class)).getBondedDevice());
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("EcologyDeviceDiscoveryFreeDeviceManager", "sendData is empty");
        } else {
            sendComand(new xiu.c().a(strD.getBytes(StandardCharsets.UTF_8)).c(), new SendCallback() { // from class: egh.2
                @Override // com.huawei.health.deviceconnect.callback.SendCallback
                public void onSendProgress(long j) {
                }

                @Override // com.huawei.health.deviceconnect.callback.SendCallback
                public void onSendResult(int i) {
                    if (i == 206) {
                        LogUtil.j("EcologyDeviceDiscoveryFreeDeviceManager", "sendCommand fail");
                    } else if (i != 207) {
                        LogUtil.j("EcologyDeviceDiscoveryFreeDeviceManager", "sendCommand other Result = ", Integer.valueOf(i));
                    } else {
                        LogUtil.a("EcologyDeviceDiscoveryFreeDeviceManager", "sendCommand success");
                    }
                }

                @Override // com.huawei.health.deviceconnect.callback.SendCallback
                public void onFileTransferReport(String str) {
                    LogUtil.a("EcologyDeviceDiscoveryFreeDeviceManager", "onFileTransferReport transferWay: ", str);
                }
            });
        }
    }
}
