package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.btsportdevice.callback.MessageOrStateCallback;
import com.huawei.health.device.datatype.SkippingTargetMode;
import com.huawei.health.ecologydevice.fitness.RopeFittingsClient;
import com.huawei.health.ecologydevice.fitness.datastruct.DeviceInformation;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import health.compact.a.CommonUtil;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class emh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile emh f33179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33180c;
    private boolean e;
    private MessageOrStateCallback g;
    private egn j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f33178a = new Object();
    private static final Map<String, RopeFittingsClient> d = new HashMap();

    private emh() {
    }

    public static emh b() {
        emh emhVar;
        if (f33179b == null) {
            synchronized (f33178a) {
                if (f33179b == null) {
                    f33179b = new emh();
                }
                emhVar = f33179b;
            }
            return emhVar;
        }
        return f33179b;
    }

    public void j() {
        LogUtil.d("RopeDeviceManager", "init()");
        if (this.j == null) {
            this.j = new egn();
            MessageOrStateCallback messageOrStateCallback = this.g;
            if (messageOrStateCallback != null) {
                a("RopeDeviceManager", messageOrStateCallback, false, null);
            }
        }
    }

    public boolean g() {
        egn egnVar = this.j;
        return egnVar != null && egnVar.b() == 6;
    }

    public String a() {
        egn egnVar = this.j;
        if (egnVar != null) {
            return egnVar.e();
        }
        return "";
    }

    public void e(MessageOrStateCallback messageOrStateCallback) {
        this.g = messageOrStateCallback;
        if (messageOrStateCallback != null) {
            a("RopeDeviceManager", messageOrStateCallback, false, null);
        }
    }

    public void b(String str, MessageOrStateCallback messageOrStateCallback, boolean z) {
        a(str, messageOrStateCallback, z, null);
    }

    public void a(String str, MessageOrStateCallback messageOrStateCallback, boolean z, List<Integer> list) {
        egn egnVar = this.j;
        if (egnVar != null) {
            egnVar.b(str, messageOrStateCallback, z, list);
        } else {
            LogUtil.e("RopeDeviceManager", "ropeFitnessClient is null");
        }
    }

    public void a(boolean z, String str) {
        if (this.j != null && !TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str) && !str.equals(d())) {
                f();
            }
            this.j.connectByMac(z, str);
            return;
        }
        LogUtil.e("RopeDeviceManager", "ropeFitnessClient is null");
    }

    public void c(SkippingTargetMode skippingTargetMode) {
        egn egnVar = this.j;
        if (egnVar != null) {
            egnVar.a(skippingTargetMode);
        } else {
            LogUtil.e("RopeDeviceManager", "ropeFitnessClient is null");
        }
    }

    public void e(int i, int[] iArr) {
        egn egnVar = this.j;
        if (egnVar != null) {
            egnVar.setFitnessMachineControl(i, iArr);
        } else {
            LogUtil.e("RopeDeviceManager", "ropeFitnessClient is null");
        }
    }

    public void c(int i, int i2, int[] iArr) {
        egn egnVar = this.j;
        if (egnVar != null) {
            egnVar.setFitnessMachineControl(i, i2, iArr);
        } else {
            LogUtil.e("RopeDeviceManager", "ropeFitnessClient is null");
        }
    }

    public void b(int i, int i2, int[] iArr) {
        egn egnVar = this.j;
        if (egnVar != null) {
            egnVar.a(i, i2, iArr);
        } else {
            LogUtil.e("RopeDeviceManager", "ropeFitnessClient is null");
        }
    }

    public void a(String str, boolean z) {
        egn egnVar = this.j;
        if (egnVar != null) {
            egnVar.removeMessageOrStateCallback(str, z);
        } else {
            LogUtil.e("RopeDeviceManager", "ropeFitnessClient is null");
        }
    }

    public void h() {
        eqt.c().e(false);
        egn egnVar = this.j;
        if (egnVar != null) {
            egnVar.releaseResource();
            this.j = null;
        } else {
            LogUtil.e("RopeDeviceManager", "ropeFitnessClient is null");
        }
    }

    public String d() {
        egn egnVar = this.j;
        if (egnVar != null) {
            return egnVar.getCurrentMacAddress();
        }
        LogUtil.e("RopeDeviceManager", "ropeFitnessClient is null");
        return "";
    }

    public void e(String str) {
        egn egnVar = this.j;
        if (egnVar != null) {
            egnVar.b(str);
        } else {
            LogUtil.e("RopeDeviceManager", "ropeFitnessClient is null");
        }
    }

    public String i() {
        egn egnVar = this.j;
        if (egnVar != null) {
            return egnVar.d();
        }
        LogUtil.e("RopeDeviceManager", "ropeFitnessClient is null");
        return "";
    }

    public void c(String str) {
        egn egnVar = this.j;
        if (egnVar != null) {
            egnVar.a(str);
        } else {
            LogUtil.e("RopeDeviceManager", "ropeFitnessClient is null");
        }
    }

    public DeviceInformation c() {
        egn egnVar = this.j;
        return egnVar != null ? egnVar.a() : new DeviceInformation();
    }

    private void f() {
        LogUtil.a("RopeDeviceManager", "initRopeRealTimeDataCallBack");
        a("DeviceManagerDefault", new MessageOrStateCallback() { // from class: emh.3
            @Override // com.huawei.btsportdevice.callback.MessageOrStateCallback
            public void onStateChange(String str) {
            }

            @Override // com.huawei.btsportdevice.callback.MessageOrStateCallback
            public void onNewMessage(int i, Bundle bundle) {
                if (i == 1000) {
                    emh.this.f33180c = true;
                }
                if (i == 1001) {
                    emh.this.f33180c = false;
                }
                if (i != 902) {
                    return;
                }
                if (bundle != null) {
                    if (!emh.d.isEmpty()) {
                        if (!emh.this.f33180c || !emh.this.e) {
                            LogUtil.j("RopeDeviceManager", "Linkage is not enabled or authorized.mIsStartSkippingRope = ", Boolean.valueOf(emh.this.f33180c), " mIsFittingAuthentication = ", Boolean.valueOf(emh.this.e));
                            return;
                        }
                        LogUtil.a("RopeDeviceManager", "in onNewMessage, newCase is DATA_AVAILABLE");
                        if (bundle.getInt("com.huawei.health.fitness.KEY_MESSAGE_FITNESS_DATA_TYPE") != 22) {
                            LogUtil.j("RopeDeviceManager", "other type");
                            return;
                        }
                        Serializable serializable = bundle.getSerializable("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK_FITNESS_DATA");
                        LogUtil.d("RopeDeviceManager", "onNewMessage DATA_AVAILABLE:", serializable);
                        if (serializable instanceof HashMap) {
                            emh.this.e((HashMap<Integer, Object>) serializable);
                            return;
                        }
                        return;
                    }
                    LogUtil.j("RopeDeviceManager", "FITTINGS_MAC is empty");
                    return;
                }
                LogUtil.j("RopeDeviceManager", "bundle is null");
            }
        }, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(HashMap<Integer, Object> map) {
        Object obj = map.get(40010);
        Object obj2 = map.get(40001);
        Object obj3 = map.get(6);
        Object obj4 = map.get(40011);
        Object obj5 = map.get(Integer.valueOf(SmartMsgConstant.MSG_TYPE_RIDE_USER));
        LinkedList linkedList = new LinkedList();
        linkedList.add(0, 31);
        linkedList.add(1, Integer.valueOf(obj != null ? ((Integer) obj).intValue() : 0));
        linkedList.add(2, Integer.valueOf(obj2 != null ? ((Integer) obj2).intValue() : 0));
        linkedList.add(3, Integer.valueOf(obj3 != null ? ((Integer) obj3).intValue() : 0));
        linkedList.add(4, Integer.valueOf(obj4 != null ? ((Integer) obj4).intValue() : 0));
        linkedList.add(5, Integer.valueOf(obj5 != null ? ((Integer) obj5).intValue() : 0));
        int[] iArr = new int[6];
        for (int i = 0; i < linkedList.size(); i++) {
            iArr[i] = ((Integer) linkedList.get(i)).intValue();
        }
        d(iArr);
    }

    private RopeFittingsClient a(String str) {
        Map<String, RopeFittingsClient> map = d;
        RopeFittingsClient ropeFittingsClient = map.get(str);
        if (ropeFittingsClient != null) {
            return ropeFittingsClient;
        }
        RopeFittingsClient ropeFittingsClient2 = new RopeFittingsClient(str);
        map.put(str, ropeFittingsClient2);
        return ropeFittingsClient2;
    }

    public void a(String str, RopeFittingsClient.FittingsMessageOrStateCallback fittingsMessageOrStateCallback) {
        RopeFittingsClient ropeFittingsClientA = a(str);
        if (e(ropeFittingsClientA)) {
            return;
        }
        ropeFittingsClientA.a(fittingsMessageOrStateCallback);
        ropeFittingsClientA.d();
    }

    public void b(String str) {
        a(str).b();
        d.remove(str);
    }

    public void d(int[] iArr) {
        for (Map.Entry<String, RopeFittingsClient> entry : d.entrySet()) {
            RopeFittingsClient value = entry.getValue();
            if (!e(value)) {
                LogUtil.a("RopeDeviceManager", "device = ", CommonUtil.n(entry.getKey()));
                return;
            }
            value.e(iArr);
        }
    }

    public void d(int i, int i2) {
        for (Map.Entry<String, RopeFittingsClient> entry : d.entrySet()) {
            RopeFittingsClient value = entry.getValue();
            if (!e(value)) {
                LogUtil.a("RopeDeviceManager", "device ", CommonUtil.n(entry.getKey()));
                return;
            }
            value.a(i, i2);
        }
    }

    public void a(int i) {
        for (Map.Entry<String, RopeFittingsClient> entry : d.entrySet()) {
            RopeFittingsClient value = entry.getValue();
            if (!e(value)) {
                LogUtil.a("RopeDeviceManager", "device ", CommonUtil.n(entry.getKey()));
                return;
            }
            value.e(i);
        }
    }

    public boolean d(String str) {
        return e(a(str));
    }

    private boolean e(RopeFittingsClient ropeFittingsClient) {
        boolean zA = ropeFittingsClient.a();
        LogUtil.a("RopeDeviceManager", zA ? "connect" : "unConnected");
        return zA;
    }

    public void b(boolean z) {
        this.e = z;
    }
}
