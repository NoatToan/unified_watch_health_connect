package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LocalBroadcast;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class muj extends HwBaseManager implements ParserInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static muj f42433a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42434c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBaseResponseCallback f42435b;
    private final Object d;

    private muj(Context context) {
        super(context);
        this.d = new Object();
    }

    public static muj c() {
        muj mujVar;
        synchronized (f42434c) {
            if (f42433a == null) {
                f42433a = new muj(BaseApplication.getContext());
            }
            mujVar = f42433a;
        }
        return mujVar;
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            LogUtil.j("HwDeviceAppMarketManager", "5.44 get wrong data.");
            return;
        }
        cpl.d("HwDeviceAppMarketManager", bArr, "5.44 tlv: ");
        if (bArr[1] != 3) {
            LogUtil.j("HwDeviceAppMarketManager", "no support");
            return;
        }
        c(bArr);
        LogUtil.a("HwDeviceAppMarketManager", "getResult sendDataToMainProcess ACTION_GET_INSTALL_APP_LIST");
        e("getInstallAppList", bArr, deviceInfo);
    }

    private void e(String str, byte[] bArr, DeviceInfo deviceInfo) {
        mhs.a().setSwitchSettingToDb(str, eeq.e(bArr));
        if (deviceInfo != null) {
            mhs.a().setSwitchSettingToDb(lzf.b(str), deviceInfo.getDeviceIdentify());
        } else {
            LogUtil.j("HwDeviceAppMarketManager", "sendDataToMainProcess deviceInfo is null");
        }
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setAction(lzf.c(str));
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    private void c(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() <= 4) {
            LogUtil.j("HwDeviceAppMarketManager", "dataInfo is null or dataInfo length less than 4.");
            return;
        }
        try {
            ees eesVarB = new eet().b(strE.substring(4));
            List<eew> listE = eesVarB.e();
            List<ees> listB = eesVarB.b();
            for (eew eewVar : listE) {
                if (lsk.a(eewVar.e(), 16) == 127) {
                    a(lsk.a(eewVar.b(), 16), "");
                    return;
                }
                LogUtil.j("HwDeviceAppMarketManager", "no support normal tlv.");
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<ees> it = listB.iterator();
            while (it.hasNext()) {
                Iterator<ees> it2 = it.next().b().iterator();
                while (it2.hasNext()) {
                    Iterator<eew> it3 = it2.next().e().iterator();
                    while (it3.hasNext()) {
                        d(jSONArray, it3.next());
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appList", jSONArray);
            a(0, jSONObject.toString());
        } catch (eeu e) {
            LogUtil.e("HwDeviceAppMarketManager", "dealAppList tlv exception: ", e.getMessage());
            a(-1, "");
        } catch (JSONException unused) {
            LogUtil.e("HwDeviceAppMarketManager", "json exception.");
            a(-1, "");
        }
    }

    private void d(JSONArray jSONArray, eew eewVar) {
        if (lsk.a(eewVar.e(), 16) == 3) {
            jSONArray.put(eeq.d(eewVar.b()));
        } else {
            LogUtil.j("HwDeviceAppMarketManager", "no support struct tlv.");
        }
    }

    private void a(int i, String str) {
        synchronized (this.d) {
            IBaseResponseCallback iBaseResponseCallback = this.f42435b;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(i, str);
            }
        }
        e();
    }

    private void e() {
        synchronized (this.d) {
            this.f42435b = null;
        }
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 42;
    }

    public void b(IBaseResponseCallback iBaseResponseCallback) {
        DeviceInfo next;
        if (iBaseResponseCallback == null) {
            LogUtil.j("HwDeviceAppMarketManager", "getDeviceAppNames callback is null");
            return;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwDeviceAppMarketManager");
        if (deviceList.size() <= 0) {
            next = null;
            break;
        }
        Iterator<DeviceInfo> it = deviceList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (eel.d(next.getProductType()));
        if (next == null || next.getDeviceConnectState() != 2) {
            LogUtil.j("HwDeviceAppMarketManager", "getDeviceAppNames get device info error");
            iBaseResponseCallback.a(300004, null);
        }
        synchronized (this.d) {
            this.f42435b = iBaseResponseCallback;
        }
        c(next);
    }

    private void c(DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(42);
        deviceCommand.setCommandID(3);
        StringBuilder sb = new StringBuilder(16);
        sb.append(eeq.d(129));
        sb.append(eeq.d(0));
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        if (deviceInfo != null) {
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        }
        cpl.d("HwDeviceAppMarketManager", deviceCommand.getDataContent(), "sendGetDeviceAppNames command data is ");
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }
}
