package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.datatype.PayApduInfo;
import com.huawei.datatype.PayOpenChannelInfo;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwpaymgr.HwPayManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.nfc.PluginPayAdapter;
import com.huawei.nfc.WalletResponseListener;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class lkw implements PluginPayAdapter {
    private static int ab;
    private static lkw v;
    private static lvj w;
    private static lvb x;
    private static HwPayManager y;
    private int ac;
    private String ad;
    private String ae;
    private String af;
    private String ai;
    private List<String> aj;
    private String am;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private boolean ar;
    private boolean at;
    private boolean av;
    private boolean aw;
    private String az;
    private String ba;
    private String bc;
    private String z;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f40378c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f40376a = new Object();
    private static final Object n = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f40377b = new Object();
    private static final Object u = new Object();
    private static final Object o = new Object();
    private static final Object t = new Object();
    private static final Object h = new Object();
    private static final Object e = new Object();
    private static final Object g = new Object();
    private static final Object k = new Object();
    private static final Object j = new Object();
    private static final Object l = new Object();
    private static final Object i = new Object();
    private static final Object p = new Object();
    private static final Object r = new Object();
    private static final Object f = new Object();
    private static final Object q = new Object();
    private static final Object m = new Object();
    private static final byte[] s = new byte[0];
    private Map<Integer, Object> aa = new HashMap(16);
    private int ay = -1;
    private boolean aq = false;
    private long ax = 0;
    private int au = -1;
    private Map<String, String> bb = new HashMap(16);
    private Handler ak = HandlerExecutor.a();
    private boolean as = false;
    private Map<String, ArrayList<String>> al = new HashMap(16);
    private Runnable ah = new Runnable() { // from class: lkw.3
        @Override // java.lang.Runnable
        public void run() {
            LogUtil.a("PluginPayAdapterImpl", "Enter mBatteryRunnable");
            mev.d().e();
        }
    };
    private IBaseResponseCallback ag = new IBaseResponseCallback() { // from class: lkw.15
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i2, Object obj) {
            ReleaseLogUtil.d("R_PluginPayAdapterImpl", "send apdu onResponse, errorCode: ", Integer.valueOf(i2), " mApduMap.size: ", Integer.valueOf(lkw.this.aa.size()));
            lkw.this.ak.removeCallbacks(lkw.this.ah);
            if (i2 != 0 || !(obj instanceof PayApduInfo)) {
                Iterator it = lkw.this.aa.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    LogUtil.d("PluginPayAdapterImpl", "fail entry.getKey(): ", entry.getKey(), " entry.getValue(): ", entry.getValue());
                    lkw.this.ad = null;
                    lkw.this.e("onResponse", entry.getValue());
                    it.remove();
                }
                LogUtil.d("PluginPayAdapterImpl", "fail, unlockAndRemoveAll, map.size: ", Integer.valueOf(lkw.this.aa.size()));
                return;
            }
            PayApduInfo payApduInfo = (PayApduInfo) obj;
            lkw.this.ad = payApduInfo.getApdu();
            lkw lkwVar = lkw.this;
            lkwVar.e("onResponse", lkwVar.aa.get(Integer.valueOf(payApduInfo.getReqid())));
            lkw.this.aa.remove(Integer.valueOf(payApduInfo.getReqid()));
            int reqid = payApduInfo.getReqid();
            LogUtil.d("PluginPayAdapterImpl", "success, unlockAndRemove, requestId: ", Integer.valueOf(reqid), " lockObject: ", lkw.this.aa.get(Integer.valueOf(payApduInfo.getReqid())), " map.size: ", Integer.valueOf(lkw.this.aa.size()));
        }
    };

    class b implements HwPayManager.ConnectStateChangeCallback {
        private b() {
        }

        @Override // com.huawei.hwdevice.mainprocess.mgr.hwpaymgr.HwPayManager.ConnectStateChangeCallback
        public void onConnectStateChange(int i) {
            LogUtil.a("PluginPayAdapterImpl", "onConnectStateChange");
            if (i != 2) {
                lkw.this.am = null;
                lkw.this.af = null;
                lkw.this.ad = null;
                lkw.this.az = null;
                return;
            }
            LogUtil.d("PluginPayAdapterImpl", "DEVICE_CONNECTED");
        }
    }

    private lkw() {
        LogUtil.a("PluginPayAdapterImpl", "PluginPayAdapterImpl init");
        HwPayManager hwPayManagerE = HwPayManager.e();
        y = hwPayManagerE;
        hwPayManagerE.c(new b());
        x = lvb.e();
        w = lvj.c();
    }

    public static lkw t() {
        lkw lkwVar;
        synchronized (s) {
            if (v == null) {
                v = new lkw();
            }
            LogUtil.a("PluginPayAdapterImpl", "PluginPayAdapterImpl getInstance: ", v);
            lkwVar = v;
        }
        return lkwVar;
    }

    private void c(boolean z) {
        LogUtil.a("PluginPayAdapterImpl", "setmIsFmRecharge isFmRecharge: ", Boolean.valueOf(z));
        this.aq = z;
        if (z) {
            this.ax = System.currentTimeMillis();
        } else {
            this.ax = 0L;
        }
    }

    private int p() {
        if (ab == Integer.MAX_VALUE) {
            ab = 1;
        }
        int i2 = ab;
        ab = i2 + 1;
        return i2;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public byte[] openChannelSnb(byte[] bArr, int i2) {
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "openChannelSNB, aids: ", eeq.e(bArr), " channelType: ", Integer.valueOf(i2));
        Map<String, String> mapOpenChannel = openChannel(eeq.e(bArr), i2);
        if (mapOpenChannel == null) {
            return null;
        }
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "openChannelSNB, apdu: ", mapOpenChannel.get(PluginPayAdapter.KEY_OPEN_CHANNEL_APDU));
        c(true);
        return eeq.c(mapOpenChannel.get(PluginPayAdapter.KEY_OPEN_CHANNEL_APDU));
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public byte[] transmitSnb(byte[] bArr) {
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "transmitSNB, apduBytes: ", eeq.e(bArr));
        return eeq.c(e("00", eeq.e(bArr)));
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public void closeChannelSnb() {
        c(false);
        closeChannel();
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public String getCplc() {
        LogUtil.a("PluginPayAdapterImpl", "PluginPayAdapterImpl getCplc enter");
        if (r()) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", "getCplc fm operation:", this.am);
            return this.am;
        }
        if (!TextUtils.isEmpty(this.am)) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", "cplc is not null, return cplc: ", this.am);
            return this.am;
        }
        if (y == null || !x()) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", "PluginPayAdapterImpl getCplc sPayManager is null");
            return this.am;
        }
        y.b(new IBaseResponseCallback() { // from class: lkw.19
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("R_PluginPayAdapterImpl", "PluginPayAdapterImpl getCplc.onResponse.errorCode: ", Integer.valueOf(i2));
                if (i2 != 0 || !(obj instanceof String)) {
                    lkw.this.am = null;
                } else {
                    lkw.this.am = (String) obj;
                    LogUtil.d("PluginPayAdapterImpl", "get cplc from watch: ", lkw.this.am);
                }
                lkw.this.e("getCplc", lkw.i);
            }
        });
        if (TextUtils.isEmpty(this.am)) {
            c("getCplc", i);
        }
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "PluginPayAdapterImpl getCplc return, cplc: ", this.am);
        return this.am;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public Map<String, String> getDeviceInfo() {
        String uuid;
        HashMap map = new HashMap();
        if (x == null || !x()) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", "PluginPayAdapterImpl getDeviceInfo sDeviceManager is null");
            return map;
        }
        DeviceInfo deviceInfoC = mgg.c("PluginPayAdapterImpl");
        if (deviceInfoC != null) {
            if (deviceInfoC.getDeviceConnectState() == 2) {
                if (TextUtils.isEmpty(deviceInfoC.getUuid())) {
                    uuid = deviceInfoC.getDeviceIdentify();
                } else {
                    uuid = deviceInfoC.getUuid();
                }
                if (TextUtils.isEmpty(uuid)) {
                    xjt.af("getDeviceInfo deviceSn is Empty");
                }
                e(deviceInfoC);
                map.put(PluginPayAdapter.KEY_DEVICE_INFO_SN, eeq.d(uuid));
                map.put("device_model", deviceInfoC.getDeviceModel());
                map.put(PluginPayAdapter.KEY_DEVICE_INFO_SOFT_VERSION, deviceInfoC.getSoftVersion());
                map.put(PluginPayAdapter.KEY_DEVICE_INFO_BT_VERSION, deviceInfoC.getBluetoothVersion());
                map.put(PluginPayAdapter.KEY_DEVICE_INFO_CERT_MODEL, deviceInfoC.getCertModel());
                map.put(PluginPayAdapter.KEY_DEVICE_INFO_UDID, deviceInfoC.getDeviceUdid());
                map.put("device_name", deviceInfoC.getDeviceName());
                map.put(PluginPayAdapter.DEVICE_CATEGORY, String.valueOf(lvi.f(deviceInfoC.getProductType()) ? 1 : 2));
                map.put(PluginPayAdapter.DEVICE_BT_TYPE, String.valueOf(deviceInfoC.getDeviceBluetoothType()));
            }
        }
        return map;
    }

    private void e(DeviceInfo deviceInfo) {
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify)) {
            return;
        }
        String deviceUdid = deviceInfo.getDeviceUdid();
        String strValueOf = String.valueOf(deviceInfo.getProductType());
        String securityDeviceId = deviceInfo.getSecurityDeviceId();
        ArrayList<String> arrayList = this.al.get(deviceIdentify);
        if (arrayList == null || arrayList.size() != 3) {
            ArrayList<String> arrayList2 = new ArrayList<>(3);
            arrayList2.add(deviceUdid);
            arrayList2.add(strValueOf);
            arrayList2.add(securityDeviceId);
            this.al.put(deviceIdentify, arrayList2);
            return;
        }
        if (Objects.equals(arrayList.get(0), deviceUdid) && Objects.equals(arrayList.get(1), strValueOf) && Objects.equals(arrayList.get(2), securityDeviceId)) {
            return;
        }
        String strJoin = String.join(" ", "checkRiskDeviceUdid deviceName:", deviceInfo.getDeviceName(), "deviceIdentify:", CommonUtil.n(deviceIdentify), "oldDeviceUdid:", arrayList.set(0, deviceUdid), "deviceUdid:", deviceUdid, "oldProductType:", arrayList.set(1, strValueOf), "productType:", strValueOf, "oldSecurityDeviceId:", CommonUtil.n(arrayList.set(2, securityDeviceId)), "securityDeviceId:", CommonUtil.n(securityDeviceId));
        ReleaseLogUtil.e("R_PluginPayAdapterImpl", strJoin);
        xjt.af(strJoin);
    }

    private String e(String str, String str2) {
        LogUtil.a("PluginPayAdapterImpl", "enter sendApduForFm channelId: ", str, " requestApdu: ", str2);
        this.ad = null;
        if (str2 == null) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", "sendApduForFm requestApdu is null");
            return this.ad;
        }
        if (y == null || !x()) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", "sendApduForFm sPayManager is null, return null, isConnected is ", Boolean.valueOf(x()));
            return this.ad;
        }
        int iP = p();
        Integer numValueOf = Integer.valueOf(iP);
        this.aa.put(numValueOf, new Object());
        PayApduInfo payApduInfo = new PayApduInfo();
        payApduInfo.setApdu(str2);
        numValueOf.getClass();
        payApduInfo.setReqid(iP);
        try {
            payApduInfo.setChannelId(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.a("R_PluginPayAdapterImpl", "sendApduForFm NumberFormatException");
        }
        y.c(payApduInfo, this.ag);
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "lock, requestId: ", numValueOf, " mApduMap: ", this.aa.get(numValueOf), " size: ", Integer.valueOf(this.aa.size()));
        c("sendApdu", this.aa.get(numValueOf));
        return this.ad;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public String sendApdu(String str, String str2) {
        LogUtil.d("PluginPayAdapterImpl", "enter sendApdu channelId: ", str, " requestApdu: ", str2);
        this.ad = null;
        if (r()) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", " sendApdu fm operation");
            return this.ad;
        }
        if (str2 == null) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", " sendApdu requestApdu is null");
            return this.ad;
        }
        if (y == null || !x()) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", "PluginPayAdapterImpl sendApdu sPayManager is null, return null, isConnected is ", Boolean.valueOf(x()));
            return this.ad;
        }
        int iP = p();
        Integer numValueOf = Integer.valueOf(iP);
        this.aa.put(numValueOf, new Object());
        PayApduInfo payApduInfo = new PayApduInfo();
        payApduInfo.setApdu(str2);
        numValueOf.getClass();
        payApduInfo.setReqid(iP);
        try {
            payApduInfo.setChannelId(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.a("R_PluginPayAdapterImpl", "sendApdu NumberFormatException");
        }
        y.c(payApduInfo, this.ag);
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "lock, requestId: ", numValueOf, " lockObject: ", this.aa.get(numValueOf), " map.size: ", Integer.valueOf(this.aa.size()));
        if (this.as) {
            this.ak.removeCallbacks(this.ah);
            this.ak.postDelayed(this.ah, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
        }
        c("sendApdu", this.aa.get(numValueOf));
        return this.ad;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public Map<String, String> openChannel(String str, int i2) {
        synchronized (r) {
            this.bb = new HashMap(16);
            if (r()) {
                ReleaseLogUtil.e("R_PluginPayAdapterImpl", " openChannel fm operation");
                return null;
            }
            if (y != null && x()) {
                y.c(str, i2, new IBaseResponseCallback() { // from class: lkw.25
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i3, Object obj) {
                        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "openChannel onResponse errorCode:", Integer.valueOf(i3));
                        if (i3 != 0 || !(obj instanceof PayOpenChannelInfo)) {
                            lkw.this.bb.clear();
                        } else {
                            PayOpenChannelInfo payOpenChannelInfo = (PayOpenChannelInfo) obj;
                            lkw.this.bb.put(PluginPayAdapter.KEY_OPEN_CHANNEL_APDU, payOpenChannelInfo.getApdu());
                            lkw.this.bb.put(PluginPayAdapter.KEY_OPEN_CHANNEL_ID, payOpenChannelInfo.getChannelId() + "");
                        }
                        lkw.this.e("openChannel", lkw.t);
                    }
                });
                c("openChannel", t);
                return this.bb;
            }
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", "PluginPayAdapterImpl openChannel sPayManager is null");
            return this.bb;
        }
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public void closeChannel() {
        synchronized (f) {
            LogUtil.d("PluginPayAdapterImpl", "closeChannel enter");
            if (r()) {
                ReleaseLogUtil.e("R_PluginPayAdapterImpl", "closeChannel fm operation");
                return;
            }
            if (y != null && x()) {
                y.e(new IBaseResponseCallback() { // from class: lkw.24
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i2, Object obj) {
                        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "closeChannel onResponse errorCode:", Integer.valueOf(i2));
                        if (i2 == 0) {
                            LogUtil.d("PluginPayAdapterImpl", "closeChannel SUCCESS");
                        } else {
                            LogUtil.d("PluginPayAdapterImpl", "closeChannel FAIL");
                        }
                        lkw.this.e("closeChannel", lkw.h);
                    }
                });
                c("closeChannel", h);
                return;
            }
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", "PluginPayAdapterImpl closeChannel sPayManager is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, Object obj) {
        if (obj == null) {
            return;
        }
        synchronized (obj) {
            obj.notifyAll();
            LogUtil.d("PluginPayAdapterImpl", "method: ", str, " unlock: ", obj);
        }
    }

    private void c(String str, Object obj) {
        if (obj != null) {
            b(str, obj, 80000L);
        } else {
            LogUtil.j("PluginPayAdapterImpl", "objectLock is null");
        }
    }

    private void b(String str, Object obj, long j2) {
        synchronized (obj) {
            try {
                LogUtil.d("PluginPayAdapterImpl", "method: ", str, " lock: ", obj);
                obj.wait(j2);
            } catch (InterruptedException unused) {
                LogUtil.e("PluginPayAdapterImpl", "lock InterruptedException Exception");
            }
        }
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public String getBtcInfoResponse() {
        this.af = "";
        if (r()) {
            LogUtil.a("PluginPayAdapterImpl", " getBTCInfoResponse fm operation");
            return this.af;
        }
        if (y == null || !x()) {
            LogUtil.j("PluginPayAdapterImpl", "PluginPayAdapterImpl getBTCInfoResponse sPayManager is null");
            return this.af;
        }
        y.a(new IBaseResponseCallback() { // from class: lkw.22
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (i2 != 0 || !(obj instanceof String)) {
                    lkw.this.af = null;
                } else {
                    lkw.this.af = (String) obj;
                    LogUtil.a("PluginPayAdapterImpl", "mBtcInfoResponse: ", lkw.this.af);
                }
                lkw.this.e("getBTCInfoResponse", lkw.e);
            }
        });
        if ("".equals(this.af)) {
            c("getBTCInfoResponse", e);
        }
        LogUtil.a("PluginPayAdapterImpl", "getBTCInfoResponse, btcInfo: ", this.af);
        return this.af;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public int getDeviceConnectState() {
        int deviceConnectState;
        DeviceInfo deviceInfoC = mgg.c("PluginPayAdapterImpl");
        if (deviceInfoC == null) {
            LogUtil.j("PluginPayAdapterImpl", "getDeviceConnectState error,deviceInfo is null!");
            deviceConnectState = 0;
        } else {
            deviceConnectState = deviceInfoC.getDeviceConnectState();
        }
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "getDeviceConnectState, state: ", Integer.valueOf(deviceConnectState));
        return deviceConnectState;
    }

    private boolean x() {
        return getDeviceConnectState() == 2;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public boolean addBusCard(String str, String str2, String str3) {
        LogUtil.a("PluginPayAdapterImpl", "addBusCard enter");
        if (r()) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", "addBusCard fm operation");
            return false;
        }
        if (y == null || !x()) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", "PluginPayAdapterImpl addBusCard sPayManager is null");
            return false;
        }
        y.e(str, str2, str3, new IBaseResponseCallback() { // from class: lkw.21
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.e("R_PluginPayAdapterImpl", "addBusCard onResponse errorCode:", Integer.valueOf(i2));
                if (i2 == 0) {
                    lkw.this.an = true;
                } else {
                    lkw.this.an = false;
                }
                lkw.this.e("addBusCard", lkw.f40376a);
            }
        });
        c("addBusCard", f40376a);
        return this.an;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public String getUserId() {
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        if (loginInit == null) {
            return "";
        }
        return loginInit.getAccountInfo(1011);
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public boolean notifyAfterTransferFile(List<Map<String, Object>> list) {
        LogUtil.a("PluginPayAdapterImpl", "notifyAfterTransferFile enter");
        if (r()) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", " notifyAfterTransferFile fm operation");
            return false;
        }
        LogUtil.d("PluginPayAdapterImpl", "PluginPayAdapterImpl notifyAfterTransferFile sInstance: ", v);
        if (y == null || !x()) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", "PluginPayAdapterImpl notifyAfterTransferFile sPayManager is null");
            return false;
        }
        ArrayList arrayList = new ArrayList(16);
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2).get("FILE_NAME");
            Object obj2 = list.get(i2).get("FILE_TYPE");
            if ((obj instanceof String) && (obj2 instanceof Integer)) {
                mbn mbnVar = new mbn();
                String str = (String) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                mbnVar.e(str);
                mbnVar.e(iIntValue);
                arrayList.add(mbnVar);
            }
        }
        y.a(arrayList, new IBaseResponseCallback() { // from class: lkw.23
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj3) {
                ReleaseLogUtil.d("R_PluginPayAdapterImpl", "notifyAfterTransferFile transmitFile errorCode:", Integer.valueOf(i3));
                if (i3 == 0) {
                    lkw.this.ap = true;
                } else {
                    lkw.this.ap = false;
                }
                lkw.this.e("notifyAfterTransferFile", lkw.n);
            }
        });
        c("notifyAfterTransferFile", n);
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "notifyAfterTransferFile end, result is ", this.ap ? "success" : "false");
        return this.ap;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public boolean addCardToWatch(String str) {
        LogUtil.a("PluginPayAdapterImpl", "addCardToWatch enter");
        if (r()) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", " addCardToWatch fm operation");
            return false;
        }
        if (y == null || !x()) {
            ReleaseLogUtil.d("R_PluginPayAdapterImpl", "PluginPayAdapterImpl addCardToWatch sPayManager is null");
            return false;
        }
        y.d(str, new IBaseResponseCallback() { // from class: lkw.27
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("R_PluginPayAdapterImpl", "addCardToWatch onResponse errorCode:", Integer.valueOf(i2));
                if (i2 == 0) {
                    lkw.this.ar = true;
                } else {
                    lkw.this.ar = false;
                }
                lkw.this.e("addCardToWatch", lkw.f40377b);
            }
        });
        c("addCardToWatch", f40377b);
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "addCardToWatch end, result is ", this.ar ? "success" : "false");
        return this.ar;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public boolean updateCardInfo(String str) {
        LogUtil.a("PluginPayAdapterImpl", "updateCardInfo enter");
        if (r()) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", "updateCardInfo fm operation");
            return false;
        }
        this.av = false;
        if (y == null || !x()) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", "PluginPayAdapterImpl updateCardInfo sPayManager is null");
            return false;
        }
        y.e(str, new IBaseResponseCallback() { // from class: lkw.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("R_PluginPayAdapterImpl", "updateCardInfo onResponse errorCode:", Integer.valueOf(i2));
                if (i2 == 0) {
                    lkw.this.av = true;
                } else {
                    lkw.this.av = false;
                }
                lkw.this.e("updateCardInfo", lkw.u);
            }
        });
        Object obj = u;
        if (obj != null) {
            b("updateCardInfo", obj, 6000L);
        } else {
            LogUtil.j("PluginPayAdapterImpl", "UPDATE_CARD_INFO_LOCK is null");
        }
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "updateCardInfo end, result is ", this.av ? "success" : "false");
        return this.av;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public List<String> obtainCardList() {
        LogUtil.a("PluginPayAdapterImpl", "obtainCardList enter");
        if (r()) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", "obtainCardList fm operation");
            return null;
        }
        if (y == null || !x()) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", "PluginPayAdapterImpl obtainCardList sPayManager is null");
            return null;
        }
        y.c(new IBaseResponseCallback() { // from class: lkw.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("R_PluginPayAdapterImpl", "obtainCardList onResponse errorCode:", Integer.valueOf(i2));
                if (i2 != 0) {
                    lkw.this.aj = null;
                } else if (obj instanceof List) {
                    lkw.this.aj = (List) obj;
                }
                lkw.this.e("obtainCardList", lkw.o);
            }
        });
        c("obtainCardList", o);
        List<String> list = this.aj;
        if (list != null) {
            ReleaseLogUtil.d("R_PluginPayAdapterImpl", "obtainCardList end, result cardList size is ", Integer.valueOf(list.size()));
        }
        return this.aj;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public boolean deleteCard(String str) {
        LogUtil.a("PluginPayAdapterImpl", "deleteCard enter");
        if (r()) {
            LogUtil.j("PluginPayAdapterImpl", " deleteCard fm operation");
            return false;
        }
        if (y == null || !x()) {
            LogUtil.j("PluginPayAdapterImpl", "PluginPayAdapterImpl deleteCard sPayManager is null");
            return false;
        }
        y.a(str, new IBaseResponseCallback() { // from class: lkw.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("R_PluginPayAdapterImpl", "deleteCard onResponse errorCode:", Integer.valueOf(i2));
                if (i2 == 0) {
                    lkw.this.ao = true;
                } else {
                    lkw.this.ao = false;
                }
                lkw.this.e("deleteCard", lkw.g);
            }
        });
        c("deleteCard", g);
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "deleteCard end, result is ", this.ao ? "success" : "false");
        return this.ao;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public String getWalletAbility() {
        LogUtil.a("PluginPayAdapterImpl", "getWalletAbility enter");
        if (r()) {
            LogUtil.a("R_PluginPayAdapterImpl", "getWalletAbility fm operation");
            return "";
        }
        if (y == null || !x()) {
            LogUtil.j("PluginPayAdapterImpl", "PluginPayAdapterImpl getWalletAbility sPayManager is null");
            return "";
        }
        if (!TextUtils.isEmpty(this.az)) {
            LogUtil.d("PluginPayAdapterImpl", "mWalletSupportCapacity is not null, return mWalletSupportCapacity: ", this.az);
            return this.az;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        y.g(new IBaseResponseCallback() { // from class: lkw.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("R_PluginPayAdapterImpl", "getWalletAbility onResponse errorCode:", Integer.valueOf(i2));
                if (i2 != 0 || !(obj instanceof String)) {
                    lkw.this.az = null;
                } else {
                    lkw.this.az = (String) obj;
                }
                lkw.this.e("getWalletAbility", lkw.k);
            }
        });
        c("getWalletAbility", k);
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        if (jUptimeMillis2 > 5000) {
            xjt.af("getWalletAbility waitTime:" + jUptimeMillis2);
        }
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "getWalletAbility end, result is ", this.az);
        return this.az;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public int getLockscreenStatus() {
        LogUtil.a("PluginPayAdapterImpl", "getLockscreenStatus enter");
        if (r()) {
            LogUtil.a("PluginPayAdapterImpl", " getLockscreenStatus fm operation");
            return this.au;
        }
        if (x == null) {
            LogUtil.j("PluginPayAdapterImpl", "PluginPayAdapterImpl getLockscreenStatus sDeviceManager is null");
            return this.au;
        }
        mes.b().b(new IBaseResponseCallback() { // from class: lkw.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("R_PluginPayAdapterImpl", "getLockscreenStatus onResponse errorCode:", Integer.valueOf(i2));
                if (i2 != 0 || !(obj instanceof Integer)) {
                    lkw.this.au = -1;
                } else {
                    lkw.this.au = ((Integer) obj).intValue();
                }
                lkw.this.e("getLockscreenStatus", lkw.j);
            }
        });
        c("getLockscreenStatus", j);
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "getLockscreenStatus end, result is ", Integer.valueOf(this.au));
        return this.au;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public boolean notificationOpenPageOfBand(String str) {
        LogUtil.a("PluginPayAdapterImpl", "notificationOpenPageOfBand enter");
        if (x == null) {
            LogUtil.j("PluginPayAdapterImpl", "PluginPayAdapterImpl notificationOpenPageOfBand sDeviceManager is null");
            return this.aw;
        }
        if (r()) {
            LogUtil.a("PluginPayAdapterImpl", " notificationOpenPageOfBand fm operation");
            return this.aw;
        }
        mes.b().d(str, new IBaseResponseCallback() { // from class: lkw.8
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("R_PluginPayAdapterImpl", "notificationOpenPageOfBand onResponse errorCode:", Integer.valueOf(i2));
                if (i2 == 0) {
                    lkw.this.aw = true;
                    LogUtil.a("PluginPayAdapterImpl", "mIsOpenPageResponse: ", Boolean.valueOf(lkw.this.aw));
                } else {
                    lkw.this.aw = false;
                }
                lkw.this.e("notificationOpenPageOfBand", lkw.l);
            }
        });
        c("notificationOpenPageOfBand", l);
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "notificationOpenPageOfBand end,result is ", Boolean.valueOf(this.aw));
        return this.aw;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public int sendAccount(String str) {
        LogUtil.a("PluginPayAdapterImpl", "sendAccount enter");
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null) {
            LogUtil.j("PluginPayAdapterImpl", "ability is null, Do not sendAccount");
            return -2;
        }
        LogUtil.a("PluginPayAdapterImpl", "sendAccount ability: ", deviceCapabilityC);
        if (!deviceCapabilityC.isSupportAccount()) {
            LogUtil.j("PluginPayAdapterImpl", "bot SupportAccount, Do not sendAccount");
            return -2;
        }
        lvj lvjVar = w;
        if (lvjVar == null) {
            LogUtil.j("PluginPayAdapterImpl", "PluginPayAdapterImpl sendAccount sHwWearableManager is null");
            return this.ay;
        }
        lvjVar.e(str, new IBaseResponseCallback() { // from class: lkw.7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("R_PluginPayAdapterImpl", "sendAccount onResponse errorCode:", Integer.valueOf(i2));
                if (obj instanceof Integer) {
                    lkw.this.ay = ((Integer) obj).intValue();
                }
                lkw.this.e("sendAccount", lkw.p);
            }
        });
        c("sendAccount", p);
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "sendAccount end,result is ", Integer.valueOf(this.ay));
        return this.ay;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public void cardEvent(String str, int i2) {
        LogUtil.a("PluginPayAdapterImpl", "cardEvent enter");
        if (r()) {
            LogUtil.a("PluginPayAdapterImpl", "cardEvent fm operation");
        } else if (y == null || !x()) {
            LogUtil.j("PluginPayAdapterImpl", "PluginPayAdapterImpl cardEvent sPayManager is null");
        } else {
            y.a(str, i2, new IBaseResponseCallback() { // from class: lkw.10
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i3, Object obj) {
                    ReleaseLogUtil.d("R_PluginPayAdapterImpl", "cardEvent onResponse errorCode:", Integer.valueOf(i3));
                    if (i3 == 0) {
                        LogUtil.d("PluginPayAdapterImpl", "closeChannel SUCCESS");
                    } else {
                        LogUtil.d("PluginPayAdapterImpl", "closeChannel FAIL");
                    }
                    lkw.this.e("cardEvent", lkw.f40378c);
                }
            });
            c("cardEvent", f40378c);
        }
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public int getDeviceProtocol() {
        int productType;
        DeviceInfo deviceInfoC = mgg.c("PluginPayAdapterImpl");
        if (deviceInfoC == null) {
            LogUtil.j("PluginPayAdapterImpl", "getDeviceProtocol error, deviceInfo is null!");
            productType = -1;
        } else {
            productType = deviceInfoC.getProductType();
        }
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "getDeviceProtocol, deviceType: ", Integer.valueOf(productType));
        return productType;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public int getDeviceBluetoothType() {
        int deviceBluetoothType;
        DeviceInfo deviceInfoC = mgg.c("PluginPayAdapterImpl");
        if (deviceInfoC == null) {
            LogUtil.j("PluginPayAdapterImpl", "getDeviceBTType error,deviceInfo is null!");
            deviceBluetoothType = -1;
        } else {
            deviceBluetoothType = deviceInfoC.getDeviceBluetoothType();
        }
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "getDeviceBTType, state: ", Integer.valueOf(deviceBluetoothType));
        return deviceBluetoothType;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public boolean isDeviceBand(int i2) {
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "isDeviceBand deviceType: ", Integer.valueOf(i2));
        return lvi.f(i2);
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public String getServiceCountryCode() {
        String accountInfo;
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        if (loginInit == null || (accountInfo = loginInit.getAccountInfo(1010)) == null || "".equals(accountInfo)) {
            return "CN";
        }
        LogUtil.a("PluginPayAdapterImpl", "isDeviceBand countryCode: ", accountInfo);
        return accountInfo;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public boolean isSendCardHciAndAmountRuler(String str, Map<String, String> map, List<String> list) {
        LogUtil.a("PluginPayAdapterImpl", "sendCardHciAndAmountRuler enter");
        if (r()) {
            LogUtil.a("PluginPayAdapterImpl", "sendCardHciAndAmountRuler fm operation");
            return false;
        }
        if (y == null || !x()) {
            LogUtil.j("PluginPayAdapterImpl", "PluginPayAdapterImpl sendCardHciAndAmountRuler sPayManager is null");
            return false;
        }
        y.c(str, map, list, new IBaseResponseCallback() { // from class: lkw.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("R_PluginPayAdapterImpl", "isSendCardHciAndAmountRuler onResponse errorCode:", Integer.valueOf(i2));
                if (i2 == 0) {
                    lkw.this.at = true;
                } else {
                    lkw.this.at = false;
                }
                lkw.this.e("sendCardHciAndAmountRuler", lkw.q);
            }
        });
        c("sendCardHciAndAmountRuler", q);
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "sendCardHciAndAmountRuler end, result is ", this.at ? "success" : "false");
        return this.at;
    }

    private boolean r() {
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "checkIsFmRecharge mIsFmRecharge:", Boolean.valueOf(this.aq));
        if (!this.aq) {
            return false;
        }
        if (Math.abs(System.currentTimeMillis() - this.ax) <= 180000) {
            return true;
        }
        this.aq = false;
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "checkIsFmRecharge mIsFmRecharge is false");
        return false;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public String getNfcTagInfo() {
        LogUtil.a("PluginPayAdapterImpl", "getNfcTagInfo enter");
        if (y == null || !x()) {
            LogUtil.j("PluginPayAdapterImpl", "PluginPayAdapterImpl getNfcTagInfo sPayManager is null");
            return "";
        }
        y.h(new IBaseResponseCallback() { // from class: lkw.11
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("R_PluginPayAdapterImpl", "getNfcTagInfo onResponse errorCode:", Integer.valueOf(i2));
                if (obj instanceof String) {
                    lkw.this.bc = (String) obj;
                }
                LogUtil.d("PluginPayAdapterImpl", "unlock getNfcTagInfo");
                lkw.this.e("getNfcTagInfo", lkw.d);
            }
        });
        c("getNfcTagInfo", d);
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "lock getNfcTagInfo, result is ", this.bc);
        return this.bc;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public String getNfcCommandResponse(int i2, String str) {
        LogUtil.a("PluginPayAdapterImpl", "getNfcCommandResponse enter");
        if (y == null || !x()) {
            LogUtil.j("PluginPayAdapterImpl", "PluginPayAdapterImpl getNfcCommandResponse sPayManager is null");
            return "";
        }
        y.b(i2, str, new IBaseResponseCallback() { // from class: lkw.12
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                ReleaseLogUtil.d("R_PluginPayAdapterImpl", "getNfcCommandResponse onResponse errorCode:", Integer.valueOf(i3));
                if (obj instanceof String) {
                    lkw.this.ba = (String) obj;
                }
                LogUtil.d("PluginPayAdapterImpl", "unlock getNfcCommandResponse");
                lkw.this.e("getNfcCommandResponse", lkw.d);
            }
        });
        c("getNfcCommandResponse", d);
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "lock getNfcCommandResponse, result is ", this.ba);
        return this.ba;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public int autheticateMifareSector(byte[] bArr, int i2, int i3) {
        LogUtil.a("PluginPayAdapterImpl", "autheticateMifareSector enter");
        if (y == null || !x()) {
            LogUtil.j("PluginPayAdapterImpl", "PluginPayAdapterImpl autheticateMifareSector sPayManager is null");
            return -2;
        }
        this.ac = -1;
        y.c(bArr, i2, i3, new IBaseResponseCallback() { // from class: lkw.13
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i4, Object obj) {
                ReleaseLogUtil.d("R_PluginPayAdapterImpl", "autheticateMifareSector onResponse errorCode:", Integer.valueOf(i4));
                if (i4 == 100000) {
                    lkw.this.ac = 0;
                } else {
                    lkw.this.ac = i4;
                }
                LogUtil.d("PluginPayAdapterImpl", "unlock autheticateMifareSector");
                lkw.this.e("autheticateMifareSector", lkw.d);
            }
        });
        c("autheticateMifareSector", d);
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "lock autheticateMifareSector, result is ", Integer.valueOf(this.ac));
        return this.ac;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public String getBlockData(byte[] bArr, int i2, int i3) {
        LogUtil.a("PluginPayAdapterImpl", "getBlockData enter");
        if (y == null || !x()) {
            LogUtil.j("PluginPayAdapterImpl", "PluginPayAdapterImpl getBlockData sPayManager is null");
            return "";
        }
        y.a(bArr, i2, i3, new IBaseResponseCallback() { // from class: lkw.14
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i4, Object obj) {
                ReleaseLogUtil.d("R_PluginPayAdapterImpl", "getBlockData onResponse errorCode:", Integer.valueOf(i4));
                if (obj instanceof String) {
                    lkw.this.ae = (String) obj;
                }
                LogUtil.d("PluginPayAdapterImpl", "unlock getBlockData");
                lkw.this.e("getBlockData", lkw.d);
            }
        });
        c("getBlockData", d);
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "lock getBlockData, result is ", this.ae);
        return this.ae;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public int sendAccessCardRfInfo(String str, String str2) {
        LogUtil.a("PluginPayAdapterImpl", "sendAccessCardRfInfo enter");
        if (y == null || !x()) {
            LogUtil.j("PluginPayAdapterImpl", "PluginPayAdapterImpl sendAccessCardRfInfo sPayManager is null");
            return -2;
        }
        y.e(str, str2, new IBaseResponseCallback() { // from class: lkw.17
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("R_PluginPayAdapterImpl", "sendAccessCardRfInfo onResponse errorCode:", Integer.valueOf(i2));
                lkw.this.ac = i2;
                LogUtil.d("PluginPayAdapterImpl", "unlock sendAccessCardRfInfo");
                lkw.this.e("sendAccessCardRfInfo", lkw.d);
            }
        });
        c("sendAccessCardRfInfo", d);
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "lock sendAccessCardRfInfo, result is ", Integer.valueOf(this.ac));
        return this.ac;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public int sendAccessCardReadEvent(int i2) {
        LogUtil.a("PluginPayAdapterImpl", "sendAccessCardReadEvent enter");
        if (y == null || !x()) {
            LogUtil.j("PluginPayAdapterImpl", "PluginPayAdapterImpl sendAccessCardReadEvent sPayManager is null");
            return -2;
        }
        y.b(i2, new IBaseResponseCallback() { // from class: lkw.18
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                ReleaseLogUtil.d("R_PluginPayAdapterImpl", "sendAccessCardReadEvent onResponse errorCode:", Integer.valueOf(i3));
                lkw.this.ac = i3;
                LogUtil.d("PluginPayAdapterImpl", "unlock sendAccessCardReadEvent");
                lkw.this.e("sendAccessCardReadEvent", lkw.d);
            }
        });
        c("sendAccessCardReadEvent", d);
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "lock sendAccessCardReadEvent, result is ", Integer.valueOf(this.ac));
        return this.ac;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public String getCardInfo(int i2, int i3) {
        LogUtil.a("PluginPayAdapterImpl", "getCardInfo enter");
        if (y == null || !x()) {
            LogUtil.j("PluginPayAdapterImpl", "PluginPayAdapterImpl getCardInfo sPayManager is null");
            return null;
        }
        HwPayManager.b(i2, i3, new IBaseResponseCallback() { // from class: lkw.20
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i4, Object obj) {
                ReleaseLogUtil.d("R_PluginPayAdapterImpl", "getCardInfo onResponse errorCode:", Integer.valueOf(i4));
                if (obj instanceof String) {
                    lkw.this.ai = (String) obj;
                } else {
                    lkw.this.ai = null;
                }
                lkw.this.e("getCardInfo", lkw.o);
            }
        });
        c("getCardInfo", o);
        String str = this.ai;
        if (str != null) {
            ReleaseLogUtil.d("R_PluginPayAdapterImpl", "getCardInfo end, cardInfo: ", str);
        }
        return this.ai;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public String getAccessConfigInfo() {
        LogUtil.a("PluginPayAdapterImpl", "getAccessConfigInfo enter");
        if (y == null || !x()) {
            LogUtil.j("PluginPayAdapterImpl", "PluginPayAdapterImpl getLowPowerNumber sPayManager is null");
            return this.z;
        }
        y.d(new IBaseResponseCallback() { // from class: lkw.16
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("R_PluginPayAdapterImpl", "getAccessConfigInfo onResponse errorCode:", Integer.valueOf(i2));
                if (obj instanceof String) {
                    lkw.this.z = (String) obj;
                } else {
                    lkw.this.z = null;
                }
                lkw.this.e("getAccessConfigInfo", lkw.d);
            }
        });
        c("getAccessConfigInfo", d);
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "getAccessConfigInfo: ", this.z);
        return this.z;
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public void registerHealthResponseListener(WalletResponseListener walletResponseListener) {
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "registerHealthResponseListener");
        HwPayManager hwPayManager = y;
        if (hwPayManager == null) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", "PluginPayAdapterImpl registerHealthResponseListener sPayManager is null");
        } else {
            hwPayManager.a(walletResponseListener);
        }
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public void unRegisterHealthResponseListener() {
        LogUtil.a("PluginPayAdapterImpl", "unRegisterHealthResponseListener");
        HwPayManager hwPayManager = y;
        if (hwPayManager == null) {
            LogUtil.j("PluginPayAdapterImpl", "PluginPayAdapterImpl unRegisterHealthResponseListener sPayManager is null");
        } else {
            hwPayManager.c();
        }
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public void sendBluetoothCommand(int i2, int i3, ByteBuffer byteBuffer) {
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "sendWalletTlv");
        if (y == null || !x()) {
            ReleaseLogUtil.e("R_PluginPayAdapterImpl", "PluginPayAdapterImpl notifyAfterTransferFile sPayManager is null");
        } else {
            y.e(i2, i3, byteBuffer);
        }
    }

    @Override // com.huawei.nfc.PluginPayAdapter
    public boolean isWalletOpenCard() {
        ReleaseLogUtil.d("R_PluginPayAdapterImpl", "isOpenCardNewWay");
        return mih.e();
    }
}
