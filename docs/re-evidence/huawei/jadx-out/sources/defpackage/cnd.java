package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.connect.handshake.HandshakeCommandBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.operation.h5pro.jsmodules.complaint.ComplaintConstants;
import com.huawei.operation.utils.Constants;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import ohos.security.deviceauth.sdk.DeviceAuthCallback;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class cnd {
    private static final String d;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f1822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CountDownLatch f1823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, cmv> f1824c;
    private zty f;
    private a g;
    private ConcurrentHashMap<Long, String> h;
    private volatile String i;
    private CountDownLatch j;

    static {
        d = cop.g() ? BaseApplication.APP_PACKAGE_HEALTH_TV : "com.huawei.health";
    }

    class a implements DeviceAuthCallback {
        private a() {
        }

        @Override // ohos.security.deviceauth.sdk.DeviceAuthCallback
        public boolean onTransmit(long j, byte[] bArr) {
            LogUtil.b("GroupManagerCallBack", "onDataTransmit requestId start,requestId: ", Long.valueOf(j));
            String str = (String) cnd.this.h.get(Long.valueOf(j));
            if (!TextUtils.isEmpty(str) || cnd.this.f1824c.size() != 1) {
                cmv cmvVar = (cmv) cnd.this.f1824c.get(str);
                if (cmvVar == null) {
                    LogUtil.b("GroupManagerCallBack", "onDataTransmit valid, controlInfo is null,requestId: ", Long.valueOf(j));
                    return true;
                }
                cmvVar.d(j, bArr);
                return true;
            }
            LogUtil.b("GroupManagerCallBack", "onDataTransmit deviceId is null");
            cmv cmvVar2 = (cmv) ((Map.Entry) cnd.this.f1824c.entrySet().iterator().next()).getValue();
            if (cmvVar2 == null) {
                LogUtil.b("GroupManagerCallBack", "onDataTransmit valid, controlInfo is null,requestId: ", Long.valueOf(j));
                return true;
            }
            cmvVar2.d(j, bArr);
            return true;
        }

        @Override // ohos.security.deviceauth.sdk.DeviceAuthCallback
        public void onSessionKeyReturned(long j, byte[] bArr) {
            LogUtil.b("GroupManagerCallBack", "onSessionKeyReturned: (requestId: ", Long.valueOf(j), ", key length: ", Integer.valueOf(bArr.length), Constants.RIGHT_BRACKET_ONLY);
        }

        @Override // ohos.security.deviceauth.sdk.DeviceAuthCallback
        public void onFinish(long j, int i, String str) {
            ReleaseLogUtil.c("DEVMGR_HiChain3GroupManager", "onFinish: (requestId: ", Long.valueOf(j), ", operationCode: ", Integer.valueOf(i), ", returnData: ", cnd.this.i(str), Constants.RIGHT_BRACKET_ONLY);
            String str2 = (String) cnd.this.h.get(Long.valueOf(j));
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            DeviceInfo deviceInfoA = cnk.c().a(str2);
            if (deviceInfoA != null) {
                cqp.a(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100014, deviceInfoA.getDeviceName(), String.valueOf(i), String.valueOf(j));
            }
            if (i != 0) {
                if (i == 1) {
                    cnd.this.h();
                    return;
                } else if (i == 2) {
                    cnd.this.e(j, str);
                    return;
                } else {
                    LogUtil.e("GroupManagerCallBack", "onFinish default");
                    return;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                cnd.this.i = jSONObject.getString("groupId");
                cnd cndVar = cnd.this;
                cndVar.f1822a = cndVar.i;
                cnd.a().f();
            } catch (JSONException unused) {
                LogUtil.d("GroupManagerCallBack", "parse groupId failed JSONException");
            }
        }

        @Override // ohos.security.deviceauth.sdk.DeviceAuthCallback
        public void onError(long j, int i, int i2, String str) {
            ReleaseLogUtil.c("DEVMGR_HiChain3GroupManager", "onError: (requestId: ", Long.valueOf(j), ", operationCode: ", Integer.valueOf(i), ", errorCode: ", Integer.valueOf(i2), ", errorReturn:", str, Constants.RIGHT_BRACKET_ONLY);
            String str2 = (String) cnd.this.h.get(Long.valueOf(j));
            if (TextUtils.isEmpty(str2)) {
                cqp.a(100015, "", String.valueOf(i), String.valueOf(j));
            } else {
                DeviceInfo deviceInfoA = cnk.c().a(str2);
                if (deviceInfoA != null) {
                    cqp.a(100015, deviceInfoA.getDeviceName(), String.valueOf(i), String.valueOf(j));
                }
            }
            if ((i == 2 || i == 3 || i == 4) && TextUtils.isEmpty(str2)) {
                return;
            }
            cnd.this.f();
        }

        @Override // ohos.security.deviceauth.sdk.DeviceAuthCallback
        public String onRequest(long j, int i, String str) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String i(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("sessionKey")) {
                jSONObject.put("sessionKey", cop.e(jSONObject.getString("sessionKey")));
            }
            if (jSONObject.has("addId")) {
                jSONObject.put("addId", cop.e(jSONObject.getString("addId")));
            }
            if (jSONObject.has("groupId")) {
                jSONObject.put("groupId", cop.e(jSONObject.getString("groupId")));
            }
            if (jSONObject.has("groupOwner")) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.getString("groupOwner"));
                if (jSONObject2.has("pubKey")) {
                    jSONObject2.put("pubKey", cop.e(jSONObject2.getString("pubKey")));
                }
                jSONObject.put("groupOwner", jSONObject2);
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            LogUtil.d("HiChain3GroupManager", "fuzzDataPrint group json exception: ", e2.getMessage());
            return "";
        }
    }

    private cnd() {
        this.h = new ConcurrentHashMap<>(16);
        this.f1824c = new ConcurrentHashMap<>(16);
        this.i = "";
        this.f1822a = "";
        this.f = zty.d();
        this.g = new a();
        i();
    }

    public void b(String str, boolean z) {
        ConcurrentHashMap<String, cmv> concurrentHashMap = this.f1824c;
        if (concurrentHashMap == null) {
            LogUtil.e("HiChain3GroupManager", "deviceIdentify", cpl.e(str), "mAddMemberControlMap is null");
            return;
        }
        if (!concurrentHashMap.containsKey(str)) {
            LogUtil.e("HiChain3GroupManager", "deviceIdentify", cpl.e(str), "not have HiChainClient setIsHiChain3On");
            return;
        }
        cmv cmvVar = this.f1824c.get(str);
        if (cmvVar == null) {
            LogUtil.e("HiChain3GroupManager", "deviceIdentify", cpl.e(str), ",controlInfo is null");
            return;
        }
        cna cnaVarE = cmvVar.e();
        if (cnaVarE == null) {
            LogUtil.e("HiChain3GroupManager", "deviceIdentify", cpl.e(str), ",client is null");
        } else {
            cnaVarE.e(z);
        }
    }

    public boolean b(String str) {
        ConcurrentHashMap<String, cmv> concurrentHashMap = this.f1824c;
        if (concurrentHashMap == null) {
            LogUtil.e("HiChain3GroupManager", "deviceIdentify", cpl.e(str), "mHiChainClientMap is null isHiChain3On");
            return false;
        }
        if (!concurrentHashMap.containsKey(str)) {
            LogUtil.e("HiChain3GroupManager", "deviceIdentify", cpl.e(str), "not have HiChainClient isHiChain3On");
            return false;
        }
        cmv cmvVar = this.f1824c.get(str);
        if (cmvVar == null) {
            LogUtil.e("HiChain3GroupManager", "deviceIdentify", cpl.e(str), "controlInfo is null");
            return false;
        }
        cna cnaVarE = cmvVar.e();
        if (cnaVarE == null) {
            LogUtil.e("HiChain3GroupManager", "deviceIdentify", cpl.e(str), "hiChain3Client is null");
            return false;
        }
        return cnaVarE.e();
    }

    public boolean d(String str) {
        ConcurrentHashMap<String, cmv> concurrentHashMap = this.f1824c;
        if (concurrentHashMap == null) {
            LogUtil.e("HiChain3GroupManager", "deviceIdentify", cpl.e(str), "mHiChainClientMap is null isHaveHiChainClient");
            return false;
        }
        return concurrentHashMap.containsKey(str);
    }

    public byte[] e(String str) {
        ConcurrentHashMap<String, cmv> concurrentHashMap = this.f1824c;
        if (concurrentHashMap == null) {
            LogUtil.e("HiChain3GroupManager", "deviceIdentify", cpl.e(str), "mHiChainClientMap is null getCurrentSessionKey");
            return null;
        }
        if (!concurrentHashMap.containsKey(str)) {
            LogUtil.e("HiChain3GroupManager", "deviceIdentify", cpl.e(str), "not have HiChainClient getCurrentSessionKey");
            return null;
        }
        cmv cmvVar = this.f1824c.get(str);
        if (cmvVar == null) {
            LogUtil.e("HiChain3GroupManager", "getCurrentSessionKey is null, deviceIdentify", cpl.e(str));
            return null;
        }
        cna cnaVarE = cmvVar.e();
        if (cnaVarE == null) {
            LogUtil.e("HiChain3GroupManager", "getCurrentSessionKey Client is null, deviceIdentify", cpl.e(str));
            return null;
        }
        return cnaVarE.b();
    }

    public void d() {
        this.i = null;
    }

    public void a(String str) {
        ConcurrentHashMap<String, cmv> concurrentHashMap = this.f1824c;
        if (concurrentHashMap != null && concurrentHashMap.containsKey(str)) {
            this.f1824c.remove(str);
            LogUtil.b("HiChain3GroupManager", "clearHiChain3Client mAddMemberControlMap remove ,", cpl.a(str));
        }
        cku.a(str);
        h(str);
    }

    public static cnd a() {
        return e.e;
    }

    public HandshakeCommandBase c(String str, String str2, cml cmlVar, boolean z) {
        LogUtil.b("HiChain3GroupManager", "initHiChain3 start ", cpl.a(str2));
        if (TextUtils.isEmpty(str2)) {
            LogUtil.e("HiChain3GroupManager", "initHiChain3: deviceIdentify is null");
            return null;
        }
        cnd cndVarA = a();
        String strF = cndVarA.f(str);
        if (strF == null) {
            ReleaseLogUtil.d("DEVMGR_HiChain3GroupManager", "initHiChain3: connect hiChain failed");
            return null;
        }
        return cndVarA.e(str2, cmlVar, z, strF);
    }

    private String f(String str) {
        String str2;
        synchronized (e) {
            d();
            this.i = k(str);
            if (TextUtils.isEmpty(this.i)) {
                m(str);
            }
            LogUtil.b("HiChain3GroupManager", "HiChainService is connected");
            str2 = this.i;
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j, String str) {
        String str2 = this.h.get(Long.valueOf(j));
        if (TextUtils.isEmpty(str2)) {
            try {
                String string = new JSONObject(str).getString("addId");
                String strD = cnc.d(string);
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(strD)) {
                    LogUtil.b("HiChain3GroupManager", "add member onFinish requestId invalid,but deviceId conform to continue ,", cpl.a(strD));
                    str2 = strD;
                }
                return;
            } catch (JSONException unused) {
                LogUtil.d("HiChain3GroupManager", "add member onFinish parse failed JSONException");
                return;
            }
        }
        cmv cmvVar = this.f1824c.get(str2);
        if (cmvVar == null) {
            LogUtil.e("HiChain3GroupManager", "add member onFinish controlInfo is null");
        } else {
            cmvVar.c();
        }
    }

    private void g() {
        this.f1823b = new CountDownLatch(1);
        LogUtil.b("HiChain3GroupManager", "initLock success");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f1823b == null) {
            LogUtil.e("HiChain3GroupManager", "mConnectLatch is null, releaseLock fail.");
            return;
        }
        LogUtil.b("HiChain3GroupManager", "releaseLock: start");
        this.f1823b.countDown();
        this.f1823b = null;
        LogUtil.b("HiChain3GroupManager", "releaseLock: end");
    }

    private void e() {
        this.j = new CountDownLatch(1);
        LogUtil.b("HiChain3GroupManager", "initDelLock success");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.j == null) {
            LogUtil.e("HiChain3GroupManager", "releaseDelLock is null, releaseLock fail.");
            return;
        }
        LogUtil.b("HiChain3GroupManager", "releaseDelLock: start");
        this.j.countDown();
        this.j = null;
        LogUtil.b("HiChain3GroupManager", "releaseDelLock: end");
    }

    private void j() {
        LogUtil.b("HiChain3GroupManager", "waitDelGroup: start");
        CountDownLatch countDownLatch = this.j;
        if (countDownLatch == null) {
            LogUtil.e("HiChain3GroupManager", "waitDelGroup is invalid.");
            return;
        }
        try {
            if (!countDownLatch.await(2L, TimeUnit.SECONDS)) {
                LogUtil.e("HiChain3GroupManager", "waitDelGroup deviceAuthService timeout");
            }
        } catch (InterruptedException unused) {
            LogUtil.d("HiChain3GroupManager", "waitDelGroup: InterruptedException");
        }
        LogUtil.b("HiChain3GroupManager", "waitDelGroup: end");
    }

    private HandshakeCommandBase e(String str, cml cmlVar, boolean z, String str2) {
        boolean zA = this.f.a(d, str2, cnc.e(str));
        ReleaseLogUtil.c("DEVMGR_HiChain3GroupManager", "openHiChainAuth isAdd:", Boolean.valueOf(zA), ",isFirstPair:", Boolean.valueOf(z), ",deviceIdentify:", cpl.a(str));
        if (!this.f1824c.containsKey(str)) {
            LogUtil.b("HiChain3GroupManager", "no exist");
            cmv cmvVar = new cmv();
            cmvVar.d(str);
            cmvVar.b(new cna(str, str2));
            this.f1824c.putIfAbsent(str, cmvVar);
            LogUtil.b("HiChain3GroupManager", "openHiChainAuth mAddMemberControlMap putIfAbsent ,", cpl.a(str));
        }
        if (zA && !z) {
            cmv cmvVar2 = this.f1824c.get(str);
            if (cmvVar2 == null) {
                LogUtil.b("HiChain3GroupManager", "openHiChainAuth to processToAuth valid");
                return null;
            }
            cmvVar2.a(true);
            return cmvVar2.b().e();
        }
        cmv cmvVar3 = this.f1824c.get(str);
        if (cmvVar3 == null) {
            LogUtil.b("HiChain3GroupManager", "openHiChainAuth to GetDevicePinCodeCommand valid");
            return null;
        }
        cmvVar3.a(false);
        DeviceInfo deviceInfoA = cnk.c().a(str);
        if (deviceInfoA != null) {
            cqp.a(100016, deviceInfoA.getDeviceName(), "", "");
        }
        return new ckp(cmlVar);
    }

    public HandshakeCommandBase c(String str) {
        cmv cmvVar = this.f1824c.get(str);
        if (cmvVar == null) {
            LogUtil.b("HiChain3GroupManager", "addMemberToGroup valid");
            return null;
        }
        String str2 = this.i;
        if (TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.d("DEVMGR_HiChain3GroupManager", "addMemberToGroup mGroupId is empty, use mBackUpGroupId");
            str2 = this.f1822a;
        }
        return cmvVar.e(str2, this.f, this.h, this.f1824c);
    }

    private void m(String str) {
        LogUtil.b("HiChain3GroupManager", "waitConnect: start");
        CountDownLatch countDownLatch = this.f1823b;
        if (countDownLatch == null) {
            LogUtil.b("HiChain3GroupManager", "mConnectLatch is invalid.");
            return;
        }
        try {
            if (!countDownLatch.await(5L, TimeUnit.SECONDS)) {
                cqp.a(100013, str, "", "");
                ReleaseLogUtil.d("DEVMGR_HiChain3GroupManager", "create group timeout");
            }
        } catch (InterruptedException unused) {
            LogUtil.d("HiChain3GroupManager", "waitConnect: InterruptedException");
        }
        LogUtil.b("HiChain3GroupManager", "waitConnect: end");
    }

    public cms c(String str, cnb cnbVar) {
        cmv cmvVar = this.f1824c.get(str);
        if (cmvVar == null) {
            LogUtil.b("HiChain3GroupManager", "transmitDataToClient valid");
            return new cms(false);
        }
        return cmvVar.e(cnbVar, this.f);
    }

    private String c(String str, String str2) {
        if (this.f.a(d, str2, cpb.d())) {
            LogUtil.b("HiChain3GroupManager", "checkPhoneUdid,The udid already in group");
            return str2;
        }
        LogUtil.b("HiChain3GroupManager", "checkPhoneUdid to del group");
        e();
        g(str2);
        j();
        return j(str);
    }

    private String c() {
        String strD = cpb.d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ComplaintConstants.GROUP_NAME_PARAM_KEY, "health_group_name");
            jSONObject.put("groupType", 256);
            jSONObject.put("deviceId", strD);
            jSONObject.put("userType", 0);
            jSONObject.put("groupVisibility", -1);
            jSONObject.put("expireTime", -1);
        } catch (JSONException unused) {
            LogUtil.d("HiChain3GroupManager", "createGroup failed JSONException");
        }
        return jSONObject.toString();
    }

    private String j(String str) {
        g();
        String strC = c();
        int iC = this.f.c(System.currentTimeMillis(), d, strC);
        LogUtil.b("HiChain3GroupManager", "createGroup result: ", Integer.valueOf(iC), ",json: ", strC);
        cqp.a(100012, str, String.valueOf(iC), "");
        return this.i;
    }

    private String k(String str) {
        String strC = c();
        b();
        List<String> listC = this.f.c(d, strC);
        if (!listC.isEmpty()) {
            try {
                String string = new JSONObject(listC.get(0)).getString("groupId");
                LogUtil.b("HiChain3GroupManager", "The group name already exists! groupId: ", string);
                return c(str, string);
            } catch (JSONException unused) {
                LogUtil.e("HiChain3GroupManager", "getGroupInfo JSONException");
                return this.i;
            }
        }
        return j(str);
    }

    private void h(String str) {
        if (this.f == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isClient", true);
            jSONObject.put("groupId", this.i);
            jSONObject.put("deleteId", cnc.e(str));
            jSONObject.put("isForceDelete", true);
            jSONObject.put("isIgnoreChannel", true);
        } catch (JSONException unused) {
            LogUtil.d("HiChain3GroupManager", "deleteMember failed JSONException");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        b();
        int iD = this.f.d(jCurrentTimeMillis, d, jSONObject.toString());
        LogUtil.b("HiChain3GroupManager", "deleteMemberFromGroup result: ", Integer.valueOf(iD), ",json:", jSONObject.toString());
    }

    private void g(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("groupId", str);
        } catch (JSONException unused) {
            LogUtil.d("HiChain3GroupManager", "deleteGroup failed JSONException ");
        }
        int iE = this.f.e(System.currentTimeMillis(), d, jSONObject.toString());
        LogUtil.b("HiChain3GroupManager", "deleteGroup result: ", Integer.valueOf(iE), ",json:", jSONObject.toString());
    }

    private void i() {
        b();
    }

    public void b() {
        this.f.c(com.huawei.haf.application.BaseApplication.b(), cpb.d());
        LogUtil.b("HiChain3GroupManager", "initService mGroupManagerCallBack: ", this.g);
        this.f.d(d, this.g);
    }

    static class e {
        private static cnd e = new cnd();
    }
}
