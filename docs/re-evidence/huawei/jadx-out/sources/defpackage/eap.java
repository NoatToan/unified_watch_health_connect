package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.health.device.util.EventBus;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.unite.DeviceDetailInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetAllDeviceRsp;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public class eap {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static eap f32606c;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<String> f32607a;
    private List<DeviceDetailInfo> d;
    private ArrayList<String> g;
    private List<DeviceDetailInfo> j;
    private int i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32608b = false;

    static /* synthetic */ int d(eap eapVar) {
        int i = eapVar.i;
        eapVar.i = i + 1;
        return i;
    }

    private eap() {
    }

    public static eap c() {
        eap eapVar;
        synchronized (e) {
            if (f32606c == null) {
                f32606c = new eap();
            }
            eapVar = f32606c;
        }
        return eapVar;
    }

    private boolean h() {
        return this.f32608b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.f32608b = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.d = null;
        this.j = null;
        this.f32607a = null;
        this.g = null;
        this.i = 0;
        a(false);
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (j()) {
            a(true);
            d();
        } else {
            dyg.d(false, "WiFiDeviceUnBondPushHandler", "getUserDevice local has not device");
        }
    }

    private boolean j() {
        this.f32607a = ecf.h();
        this.g = ecf.e();
        return c(this.f32607a) || c(this.g);
    }

    private boolean c(ArrayList<String> arrayList) {
        return arrayList != null && arrayList.size() > 0;
    }

    private boolean c(List<DeviceDetailInfo> list) {
        return list != null && list.size() > 0;
    }

    private void d() {
        lqo.b(dxw.d()).d(new ICloudOperationResult<WifiDeviceGetAllDeviceRsp>() { // from class: eap.4
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void operationResult(WifiDeviceGetAllDeviceRsp wifiDeviceGetAllDeviceRsp, String str, boolean z) {
                int iIntValue;
                String resultDesc;
                eap.d(eap.this);
                if (z) {
                    if (wifiDeviceGetAllDeviceRsp != null) {
                        dyg.a(false, "WiFiDeviceUnBondPushHandler", "getUserDevice reg device success :", wifiDeviceGetAllDeviceRsp.toString());
                        eap.this.d = wifiDeviceGetAllDeviceRsp.getAuthorizedDeviceDetailInfoList();
                        eap.this.j = wifiDeviceGetAllDeviceRsp.getDeviceDetailInfoList();
                    }
                    eap.this.a();
                    eap.this.e();
                    eap.this.a(false);
                    return;
                }
                if (wifiDeviceGetAllDeviceRsp == null) {
                    iIntValue = Constants.CODE_UNKNOWN_ERROR;
                    resultDesc = "unknown error";
                } else {
                    iIntValue = wifiDeviceGetAllDeviceRsp.getResultCode().intValue();
                    resultDesc = wifiDeviceGetAllDeviceRsp.getResultDesc();
                }
                dyg.d(false, "WiFiDeviceUnBondPushHandler", "getUserAllDevice() errCode = ", Integer.valueOf(iIntValue), ",resultDesc:", resultDesc);
                if (eap.this.i <= 2) {
                    eap.this.g();
                } else {
                    eap.this.a(false);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        List<DeviceDetailInfo> list = this.d;
        dyg.a(false, "WiFiDeviceUnBondPushHandler", "compareAuthDevice mAuthDevice :", list == null ? Constants.NULL : Integer.valueOf(list.size()));
        if (!c(this.f32607a)) {
            dyg.a(false, "WiFiDeviceUnBondPushHandler", "compareAuthDevice Local No devices");
        } else if (!c(this.d)) {
            b(this.f32607a);
            i();
        } else {
            ArrayList<String> arrayListE = e(this.f32607a, this.d);
            if (arrayListE.size() > 0) {
                dyg.a(false, "WiFiDeviceUnBondPushHandler", "compareAuthDevice deviceDevices ", Integer.valueOf(arrayListE.size()));
                b(arrayListE);
                i();
            } else {
                dyg.a(false, "WiFiDeviceUnBondPushHandler", "compareAuthDevice No Contact binding device");
            }
        }
        eam.d().h();
    }

    private ArrayList<String> e(ArrayList<String> arrayList, List<DeviceDetailInfo> list) {
        ArrayList<String> arrayList2 = new ArrayList<>(16);
        for (String str : arrayList) {
            if (TextUtils.isEmpty(str)) {
                break;
            }
            Iterator<DeviceDetailInfo> it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (str.equals(it.next().getDevId())) {
                    z = true;
                }
            }
            if (!z) {
                arrayList2.add(str);
            }
        }
        return arrayList2;
    }

    private void i() {
        Bundle bundle = new Bundle();
        bundle.putString("pushType", "release_auth");
        EventBus.a(new EventBus.d("multi_user_auto_cancle_dialog", bundle));
    }

    private void b(ArrayList<String> arrayList) {
        for (String str : arrayList) {
            boolean zF = drw.e().f(str);
            dyg.a(false, "WiFiDeviceUnBondPushHandler", "unBondLocalDevice Whether the desorption was successful ", Boolean.valueOf(zF), " deviceID: ", dyg.b(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        List<DeviceDetailInfo> list = this.j;
        dyg.a(false, "WiFiDeviceUnBondPushHandler", "getUserDevice reg device MainUserDevice :", list == null ? Constants.NULL : Integer.valueOf(list.size()));
        ArrayList<String> arrayListE = ecf.e(true);
        this.g = arrayListE;
        if (!c(arrayListE)) {
            dyg.a(false, "WiFiDeviceUnBondPushHandler", "compareDevice Local No devices");
            return;
        }
        if (!c(this.j)) {
            b(this.g);
            return;
        }
        ArrayList<String> arrayListE2 = e(this.g, this.j);
        if (arrayListE2.size() > 0) {
            dyg.a(false, "WiFiDeviceUnBondPushHandler", "compareDevice deviceDevices ", Integer.valueOf(arrayListE2.size()));
            b(arrayListE2);
        } else {
            dyg.a(false, "WiFiDeviceUnBondPushHandler", "compareDevice No Contact binding device");
        }
    }

    public void b() {
        if (!h()) {
            dyg.a(false, "WiFiDeviceUnBondPushHandler", "onStart working ...");
            lsy.a(new Runnable() { // from class: eap.3
                @Override // java.lang.Runnable
                public void run() {
                    eap.this.f();
                }
            });
        } else {
            dyg.a(false, "WiFiDeviceUnBondPushHandler", "onStart is working");
        }
    }
}
