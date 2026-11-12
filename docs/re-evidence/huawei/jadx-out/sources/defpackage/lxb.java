package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.mainprocess.callback.NotifyPhoneServiceCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lxb implements NotifyPhoneServiceCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41004c = new Object();
    private static volatile lxb e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private lvb f41006b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, List<EarPhoneResponseCallback>> f41005a = new HashMap();
    private List<EarPhoneResponseCallback> d = new ArrayList();

    @Override // com.huawei.hwdevice.mainprocess.callback.NotifyPhoneServiceCallback
    public void executeResponse(int i, DeviceInfo deviceInfo, int i2, String str) {
        LogUtil.e("HwEarPhonePairManager", "executeResponse errCode: ", Integer.valueOf(i));
        edj edjVar = new edj();
        try {
            edjVar = (edj) new Gson().fromJson(str, new TypeToken<edj>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.HwEarPhonePairManager$1
            }.getType());
        } catch (JsonSyntaxException e2) {
            LogUtil.e("HwEarPhonePairManager", "getEarPhoneInfo e ", ExceptionUtils.c(e2));
        }
        c(i, edjVar);
    }

    private void c(int i, edj edjVar) {
        if (i == -1 || i == 1) {
            d("earphone_state", i, edjVar);
            return;
        }
        if (i == 4) {
            d("get_earphone", i, edjVar);
        } else if (i == 11 || i == 12) {
            d("earphone_state", i, edjVar);
        } else {
            LogUtil.j("HwEarPhonePairManager", "other errCode: ", Integer.valueOf(i));
            b(i, edjVar);
        }
    }

    private void b(int i, edj edjVar) {
        synchronized (f41004c) {
            Iterator<EarPhoneResponseCallback> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().onResponse(i, edjVar);
            }
        }
    }

    private lxb() {
        b();
    }

    public static lxb c() {
        if (e == null) {
            synchronized (lxb.class) {
                if (e == null) {
                    e = new lxb();
                }
            }
        }
        return e;
    }

    private void b() {
        lvb lvbVarE = lvb.e();
        this.f41006b = lvbVarE;
        lvbVarE.b("earphoneManager", this);
    }

    public void a(DeviceInfo deviceInfo) {
        this.f41006b.b("earphoneManager", deviceInfo, 0, "start_pair_info");
    }

    private void e(String str, EarPhoneResponseCallback earPhoneResponseCallback) {
        LogUtil.a("HwEarPhonePairManager", "Enter registerEarPhoneCallback:", earPhoneResponseCallback);
        synchronized (f41004c) {
            List<EarPhoneResponseCallback> list = this.f41005a.get(str);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(earPhoneResponseCallback);
                this.f41005a.put(str, arrayList);
            } else {
                LogUtil.a("HwEarPhonePairManager", "registerEarPhoneCallback, lis is not empty");
                if (!list.contains(earPhoneResponseCallback)) {
                    list.add(earPhoneResponseCallback);
                }
            }
        }
    }

    private void d(String str, int i, edj edjVar) {
        synchronized (f41004c) {
            List<EarPhoneResponseCallback> list = this.f41005a.get(str);
            if (!coq.d(list)) {
                Iterator<EarPhoneResponseCallback> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onResponse(i, edjVar);
                }
            }
            this.f41005a.remove(str);
            b(i, edjVar);
        }
    }

    public void c(DeviceInfo deviceInfo, EarPhoneResponseCallback earPhoneResponseCallback) {
        LogUtil.a("HwEarPhonePairManager", "startPairEarPhoneBackDevice: ", earPhoneResponseCallback);
        e("earphone_state", earPhoneResponseCallback);
        this.f41006b.b("earphoneManager", deviceInfo, 0, "start_pair_info_back_device");
    }

    public void b(DeviceInfo deviceInfo) {
        this.f41006b.b("earphoneManager", deviceInfo, 0, "retry_pair_info");
    }

    public void c(DeviceInfo deviceInfo) {
        this.f41006b.b("earphoneManager", deviceInfo, 0, "skip_pair_info");
    }

    public void d(DeviceInfo deviceInfo, String str) {
        this.f41006b.b("earphoneManager", deviceInfo, 0, "cancel_pair_ear_phone");
    }

    public void b(DeviceInfo deviceInfo, EarPhoneResponseCallback earPhoneResponseCallback) {
        LogUtil.a("HwEarPhonePairManager", "requestPullUpEarphonePair: ", earPhoneResponseCallback);
        e("earphone_state", earPhoneResponseCallback);
        this.f41006b.b("earphoneManager", deviceInfo, 0, "pull_up_earphone_pair");
    }

    public void b(final DeviceInfo deviceInfo, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwEarPhonePairManager", "pullUpEarphonePair in. ");
        c().b(deviceInfo, new EarPhoneResponseCallback() { // from class: lxb.2
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
            public void onResponse(int i, edj edjVar) {
                LogUtil.a("HwEarPhonePairManager", "pullUpEarphonePair response. errorCode： ", Integer.valueOf(i));
                if (i == 11) {
                    e(edjVar);
                }
            }

            private void e(final edj edjVar) {
                lxb.this.a(deviceInfo, new IBaseResponseCallback() { // from class: lxb.2.3
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        if (i == 0) {
                            iBaseResponseCallback.a(i, edjVar);
                        }
                    }
                });
            }
        });
    }

    public void d(DeviceInfo deviceInfo) {
        LogUtil.a("HwEarPhonePairManager", "getEarPhoneInfo");
        this.f41006b.b("earphoneManager", deviceInfo, 0, "get_ear_phone_info");
    }

    public void a(DeviceInfo deviceInfo, EarPhoneResponseCallback earPhoneResponseCallback) {
        LogUtil.a("HwEarPhonePairManager", "getEarPhoneInfo: ");
        e("get_earphone", earPhoneResponseCallback);
        this.f41006b.b("earphoneManager", deviceInfo, 0, "get_ear_phone_info");
    }

    public void e(DeviceInfo deviceInfo, EarPhoneResponseCallback earPhoneResponseCallback) {
        LogUtil.a("HwEarPhonePairManager", "getEarPhoneInfoFromCached: ", earPhoneResponseCallback);
        e("get_earphone", earPhoneResponseCallback);
        this.f41006b.b("earphoneManager", deviceInfo, 0, "get_cached_ear_phone_info");
    }

    public boolean b(String str) {
        LogUtil.a("HwEarPhonePairManager", "isEarphonePairedWithPhone: ", str);
        try {
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
            if (remoteDevice == null) {
                LogUtil.j("HwEarPhonePairManager", "isEarphonePairedWithPhone error. mBluetoothDevice is null.");
                return false;
            }
            int bondState = remoteDevice.getBondState();
            LogUtil.a("HwEarPhonePairManager", "isEarphonePairedWithPhone createBondDevice bondState: ", Integer.valueOf(bondState));
            return bondState == 12;
        } catch (IllegalArgumentException | SecurityException e2) {
            LogUtil.e("HwEarPhonePairManager", "isEarphonePairedWithPhone exception:", ExceptionUtils.c(e2));
            return false;
        }
    }

    public void a(DeviceInfo deviceInfo, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwEarPhonePairManager", "isEarphonePairedWithWatch in. ");
        e(deviceInfo, new EarPhoneResponseCallback() { // from class: lxb.3
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
            public void onResponse(int i, edj edjVar) {
                if (edjVar == null) {
                    iBaseResponseCallback.a(1, null);
                } else if ((edjVar.b() & 1) > 0) {
                    iBaseResponseCallback.a(0, edjVar);
                } else {
                    iBaseResponseCallback.a(1, edjVar);
                }
            }
        });
    }

    public void e(DeviceInfo deviceInfo) {
        this.f41006b.b("earphoneManager", deviceInfo, 0, "pair_fail");
    }

    public void e(EarPhoneResponseCallback earPhoneResponseCallback) {
        synchronized (f41004c) {
            if (!this.d.contains(earPhoneResponseCallback)) {
                this.d.add(earPhoneResponseCallback);
            }
        }
    }

    public void b(EarPhoneResponseCallback earPhoneResponseCallback) {
        synchronized (f41004c) {
            this.d.remove(earPhoneResponseCallback);
        }
    }
}
