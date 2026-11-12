package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.ContentValues;
import android.text.TextUtils;
import com.huawei.health.device.api.DeviceManagerApi;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.util.BrUtils;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.linechart.common.DateType;
import health.compact.a.LogUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
@ApiDefine(uri = EcologyDeviceApi.class)
public class eig implements EcologyDeviceApi {
    @Override // com.huawei.health.device.api.EcologyDeviceApi
    public void uploadDataToHota(String str, String str2) {
        LogUtil.b("EcologyDeviceImpl", "uploadDataToHota");
        if (TextUtils.isEmpty(str2)) {
            LogUtil.e("EcologyDeviceImpl", "uploadDataToHota data is null");
            return;
        }
        try {
            new etp.b().d(new JSONObject(str2).getString("sn")).a(str).b().e();
        } catch (JSONException unused) {
            LogUtil.d("EcologyDeviceImpl", "uploadDataToHota JSONException");
        }
    }

    @Override // com.huawei.health.device.api.EcologyDeviceApi
    public String getProductInfo(String str) {
        String strA;
        LogUtil.b("EcologyDeviceImpl", "getProductInfo");
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (elhVarD.l() == null) {
                    strA = "";
                } else {
                    strA = elo.a(str, elhVarD.l().d());
                }
                jSONObject.put("deviceName", strA);
                jSONObject.put("ota", elhVarD.c("ota"));
                return jSONObject.toString();
            } catch (JSONException unused) {
                LogUtil.d("EcologyDeviceImpl", "getProductInfo JSONException");
            }
        }
        return "";
    }

    @Override // com.huawei.health.device.api.EcologyDeviceApi
    public boolean isSupportPerformanceByProductId(String str) {
        return "true".equals(era.a("isSupportScore", str));
    }

    @Override // com.huawei.health.device.api.EcologyDeviceApi
    public boolean isHighRopeType(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("EcologyDeviceImpl", "isHighRopeType productId is null");
            return false;
        }
        return "2G98".equals(era.b(str));
    }

    @Override // com.huawei.health.device.api.EcologyDeviceApi
    public String getNonWearableDeviceName(dru druVar) {
        String asString = "";
        if (druVar == null) {
            LogUtil.e("EcologyDeviceImpl", "deviceGroupInfo is null ");
            return "";
        }
        Object objI = druVar.i();
        elh elhVar = objI instanceof elh ? (elh) objI : null;
        if (elhVar == null) {
            LogUtil.e("EcologyDeviceImpl", "productInfo is null ");
            return "";
        }
        if (elhVar.l() == null) {
            LogUtil.e("EcologyDeviceImpl", "productInfo manifest is null ");
            return "";
        }
        ContentValues contentValuesD = druVar.d();
        if (contentValuesD != null) {
            if (!TextUtils.isEmpty(contentValuesD.getAsString("sn"))) {
                asString = contentValuesD.getAsString("sn");
            } else {
                asString = contentValuesD.getAsString("uniqueId");
            }
        }
        if (elhVar.d() != null && elhVar.d().size() <= 0) {
            return a(elhVar.l().d(), asString);
        }
        if (!TextUtils.isEmpty(asString)) {
            return a(elo.a(elhVar.t(), elhVar.l().d()), asString);
        }
        return elo.a(elhVar.t(), elhVar.l().d());
    }

    @Override // com.huawei.health.device.api.EcologyDeviceApi
    public void setPreference(String str, String str2) {
        emq.a(str, str2);
    }

    @Override // com.huawei.health.device.api.EcologyDeviceApi
    public MeasurableDevice fromBluetoothDevice(BluetoothDevice bluetoothDevice) {
        return efx.b(bluetoothDevice);
    }

    @Override // com.huawei.health.device.api.EcologyDeviceApi
    public void syncCloud(int i, IBaseResponseCallback iBaseResponseCallback) {
        syncCloud(i, false, iBaseResponseCallback);
    }

    @Override // com.huawei.health.device.api.EcologyDeviceApi
    public void syncCloud(int i, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        eml.b().e(i, z, iBaseResponseCallback);
    }

    private String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("EcologyDeviceImpl", "name is empty");
            return "";
        }
        if (str.toUpperCase(Locale.ROOT).contains(d(str2).toUpperCase(Locale.ROOT))) {
            return str;
        }
        return str + d(str2).toUpperCase(Locale.ROOT);
    }

    private String d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.b("EcologyDeviceImpl", "getDeviceIdentification identification is null");
            return "";
        }
        if (str.replace(":", "").length() < 3) {
            LogUtil.b("EcologyDeviceImpl", "identification's length less than 3");
            return Constants.LINK + str.replace(":", "");
        }
        return Constants.LINK + str.replace(":", "").substring(str.replace(":", "").length() - 3);
    }

    @Override // com.huawei.health.device.api.EcologyDeviceApi
    public List<HiHealthData> assembleRopeCaloriePoints(List<HiHealthData> list) {
        return egy.a(list);
    }

    @Override // com.huawei.health.device.api.EcologyDeviceApi
    public String getProdId(String str) {
        return era.b(str);
    }

    @Override // com.huawei.health.device.api.EcologyDeviceApi
    public void requestPerformanceRank(IBaseResponseCallback iBaseResponseCallback) {
        emj.b().e(iBaseResponseCallback);
    }

    @Override // com.huawei.health.device.api.EcologyDeviceApi
    public float queryPerformanceRank(String str, float f, DateType dateType) {
        return emj.b().a(str, f, dateType);
    }

    @Override // com.huawei.health.device.api.EcologyDeviceApi
    public void quaryPerformanceOfBest(IBaseResponseCallback iBaseResponseCallback, DateType dateType) {
        LogUtil.b("EcologyDeviceImpl", "quaryPerformanceOfBest()");
        emj.b().d(iBaseResponseCallback, dateType);
    }

    @Override // com.huawei.health.device.api.EcologyDeviceApi
    public void ropeDataSetDeviceType(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            LogUtil.e("EcologyDeviceImpl", "HighRopeSetDeviceType() motionPathSimplify is null");
            return;
        }
        ProductMapInfo productMapInfoC = era.c(dmg.a().getProductId());
        if (productMapInfoC == null) {
            LogUtil.e("EcologyDeviceImpl", "HighRopeSetDeviceType() productMapInfo is null");
        } else {
            motionPathSimplify.saveDeviceType(productMapInfoC.c());
            motionPathSimplify.saveProductId(productMapInfoC.g());
        }
    }

    @Override // com.huawei.health.device.api.EcologyDeviceApi
    public void ropeSetFitnessMachineControl(int i, int i2, int[] iArr) {
        emh.b().c(i, i2, iArr);
    }

    @Override // com.huawei.health.device.api.EcologyDeviceApi
    public boolean isDeviceConnected(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("EcologyDeviceImpl", "isDeviceConnected() productId is Empty.");
            return false;
        }
        ArrayList<ContentValues> bondedDeviceByProductId = ((DeviceManagerApi) Services.b("PluginDevice", DeviceManagerApi.class)).getBondedDeviceByProductId(str);
        BrUtils brUtils = new BrUtils();
        Iterator<ContentValues> it = bondedDeviceByProductId.iterator();
        while (it.hasNext()) {
            if (brUtils.c(it.next().getAsString("uniqueId"))) {
                return true;
            }
        }
        return false;
    }
}
