package defpackage;

import android.text.TextUtils;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lvu implements BluetoothDataReceiveCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static lvu f40914c;
    private static final Object d = new Object();
    private IBaseResponseCallback e = null;

    private lvu() {
        lvb.e().d(35, this);
    }

    private void e(byte[] bArr) {
        try {
            List<eew> listE = new eet().b(eeq.e(bArr).substring(4)).e();
            if (listE != null && !listE.isEmpty()) {
                for (eew eewVar : listE) {
                    if (CommonUtil.v(eewVar.e()) == 127) {
                        int iV = CommonUtil.v(eewVar.b());
                        LogUtil.d("EcgDurationUtil", "set switch : ", Integer.valueOf(iV));
                        c(iV);
                        return;
                    }
                }
                c(100001);
                return;
            }
            LogUtil.j("EcgDurationUtil", "Tlv is error.");
        } catch (eeu unused) {
            LogUtil.e("EcgDurationUtil", "parseDurationTlv TlvException");
        }
    }

    private void c(int i) {
        IBaseResponseCallback iBaseResponseCallback = this.e;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(i, null);
            this.e = null;
        }
    }

    public static lvu b() {
        lvu lvuVar;
        synchronized (d) {
            if (f40914c == null) {
                f40914c = new lvu();
            }
            lvuVar = f40914c;
        }
        return lvuVar;
    }

    public void e(int i, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("EcgDurationUtil", "setEcgDuration callback is null.");
            return;
        }
        if (i == 0 || i == 1) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(35);
            deviceCommand.setCommandID(16);
            StringBuilder sb = new StringBuilder();
            sb.append(eeq.d(1));
            sb.append(eeq.d(1));
            sb.append(eeq.d(i));
            deviceCommand.setDataLen(sb.length() / 2);
            deviceCommand.setDataContent(eeq.c(sb.toString()));
            LogUtil.a("EcgDurationUtil", "5.35.16 send set cmd : ", sb.toString());
            this.e = iBaseResponseCallback;
            lvb.e().c(deviceCommand);
            return;
        }
        iBaseResponseCallback.a(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, null);
    }

    public int e() {
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("test_ecg_nmpa_key");
        if (!TextUtils.isEmpty(strC) && Boolean.parseBoolean(strC)) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(35), "storage_ecg_duration_json");
            try {
                if (TextUtils.isEmpty(strE)) {
                    return 0;
                }
                return new JSONObject(strE).optInt("get_ecg_authentication_switch_from_device", -1);
            } catch (JSONException unused) {
                LogUtil.e("EcgDurationUtil", "showEcgDurationDialog JSONException");
            }
        }
        return 0;
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr.length < 4) {
            LogUtil.j("EcgDurationUtil", "error tlv");
            return;
        }
        LogUtil.a("EcgDurationUtil", "get result : ", eeq.e(bArr));
        if (bArr[1] == 16) {
            e(bArr);
        }
    }

    public void c(DeviceInfo deviceInfo) {
        lvb.e().h();
    }
}
