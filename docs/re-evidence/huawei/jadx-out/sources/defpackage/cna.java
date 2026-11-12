package defpackage;

import com.huawei.devicesdk.connect.handshake.HandshakeCommandBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.application.BaseApplication;
import com.huawei.operation.utils.Constants;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import ohos.security.deviceauth.sdk.DeviceAuthCallback;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class cna {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CountDownLatch f1816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f1817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CountDownLatch f1818c;
    private byte[] d;
    private String e;
    private String f;
    private d g;
    private byte[] h;
    private volatile boolean i;
    private ztz j;
    private HandshakeCommandBase l;
    private boolean o = false;

    public cna(String str, String str2) {
        this.f = str2;
        ztz ztzVarC = ztz.c();
        this.j = ztzVarC;
        ztzVarC.e(BaseApplication.b(), cpb.d());
        this.g = new d();
        this.e = str;
        this.i = false;
    }

    public boolean e() {
        return this.o;
    }

    public void e(boolean z) {
        this.o = z;
    }

    public byte[] b() {
        return this.h;
    }

    public void b(byte[] bArr) {
        this.h = bArr;
    }

    class d implements DeviceAuthCallback {
        d() {
        }

        @Override // ohos.security.deviceauth.sdk.DeviceAuthCallback
        public boolean onTransmit(long j, byte[] bArr) {
            cna.this.e(j, bArr);
            return true;
        }

        @Override // ohos.security.deviceauth.sdk.DeviceAuthCallback
        public void onSessionKeyReturned(long j, byte[] bArr) {
            LogUtil.b("AuthCallback", "onSessionKeyReturned: (requestId: ", Long.valueOf(j), ", key length: ", Integer.valueOf(bArr.length), Constants.RIGHT_BRACKET_ONLY);
        }

        @Override // ohos.security.deviceauth.sdk.DeviceAuthCallback
        public void onFinish(long j, int i, String str) {
            ReleaseLogUtil.d("DEVMGR_HiChain3Client", "onFinish: (requestId: ", Long.valueOf(j), ", operationCode:", Integer.valueOf(i), ",mCurrentRequestId:", Long.valueOf(cna.this.f1817b), "returnData: ", cna.this.d(str), Constants.RIGHT_BRACKET_ONLY);
            DeviceInfo deviceInfoA = cnk.c().a(cna.this.e);
            if (deviceInfoA != null) {
                cqp.a(100022, deviceInfoA.getDeviceName(), String.valueOf(i), String.valueOf(j));
            }
            if (cna.this.f1817b != j) {
                LogUtil.e("AuthCallback", "onTransmit requestId invalid,mCurrentRequestId:", Long.valueOf(cna.this.f1817b));
                return;
            }
            try {
                String string = new JSONObject(str).getString("sessionKey");
                if (string == null || string.length() == 0) {
                    LogUtil.d("AuthCallback", "onSessionKeyReturned sessionKey is empty");
                }
                cna.this.b(cph.d(string));
            } catch (JSONException unused) {
                LogUtil.d("AuthCallback", "parse groupId failed JSONException");
            }
            cna.this.i = true;
            cna.this.i();
            cna.this.j();
            cna.this.d = null;
        }

        @Override // ohos.security.deviceauth.sdk.DeviceAuthCallback
        public void onError(long j, int i, int i2, String str) {
            ReleaseLogUtil.c("DEVMGR_HiChain3Client", "onError: (requestId: ", Long.valueOf(j), ", operationCode: ", Integer.valueOf(i), ", errorCode: ", Integer.valueOf(i2), ", errorReturn:", str, Constants.RIGHT_BRACKET_ONLY);
            DeviceInfo deviceInfoA = cnk.c().a(cna.this.e);
            if (deviceInfoA != null) {
                cqp.a(100021, deviceInfoA.getDeviceName(), String.valueOf(i2), String.valueOf(i));
            }
            if (cna.this.f1817b != j) {
                LogUtil.e("AuthCallback", "onTransmit requestId invalid,mCurrentRequestId:", Long.valueOf(cna.this.f1817b));
            } else {
                cna.this.i();
            }
        }

        @Override // ohos.security.deviceauth.sdk.DeviceAuthCallback
        public String onRequest(long j, int i, String str) {
            return new JSONObject().toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("sessionKey")) {
                jSONObject.put("sessionKey", cop.e(jSONObject.getString("sessionKey")));
            }
            if (jSONObject.has("groupId")) {
                jSONObject.put("groupId", cop.e(jSONObject.getString("groupId")));
            }
            if (jSONObject.has("peerAuthId")) {
                jSONObject.put("peerAuthId", cop.e(jSONObject.getString("peerAuthId")));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            LogUtil.d("HiChain3Client", "fuzzDataPrint client json exception: ", e.getMessage());
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j, byte[] bArr) {
        if (Arrays.equals(bArr, this.d)) {
            LogUtil.b("HiChain3Client", "transmitDataToService isSameData");
            return;
        }
        this.d = bArr;
        ReleaseLogUtil.c("DEVMGR_HiChain3Client", "transmit data， phone to device");
        this.l = new cks(bArr, (byte) 2, j);
        DeviceInfo deviceInfoA = cnk.c().a(this.e);
        if (deviceInfoA != null) {
            cqp.a(100020, deviceInfoA.getDeviceName(), "", String.valueOf(j));
        }
        i();
    }

    private void a() {
        this.i = false;
        this.d = null;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("peerConnDeviceId", cnc.e(this.e));
            jSONObject.put("isClient", true);
            jSONObject.put("groupId", this.f);
            jSONObject.put("servicePkgName", BaseApplication.b().getPackageName());
        } catch (JSONException unused) {
            LogUtil.d("HiChain3Client", "authDevice failed JSONException");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f1817b = jCurrentTimeMillis;
        this.j.e(BaseApplication.b(), cpb.d());
        int iB = this.j.b(jCurrentTimeMillis, jSONObject.toString(), this.g);
        LogUtil.b("HiChain3Client", "authDevice result: ", Integer.valueOf(iB), ",json:", jSONObject.toString(), ",authRequestId:", Long.valueOf(jCurrentTimeMillis), ",deviceIdentify:", cpl.a(this.e));
    }

    private void h() {
        if (this.f1818c == null) {
            this.f1818c = new CountDownLatch(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        LogUtil.b("HiChain3Client", "releaseLock start");
        if (this.f1818c == null) {
            LogUtil.e("HiChain3Client", "releaseLock mAsyLatch is null");
        } else {
            LogUtil.e("HiChain3Client", "releaseLock countdown");
            this.f1818c.countDown();
            this.f1818c = null;
        }
        LogUtil.b("HiChain3Client", "releaseLock end");
    }

    private void k() {
        LogUtil.b("HiChain3Client", "waitHiChain: start");
        CountDownLatch countDownLatch = this.f1818c;
        if (countDownLatch == null) {
            LogUtil.b("HiChain3Client", "mAsyncLatch is invalid.");
            return;
        }
        try {
            if (!countDownLatch.await(10L, TimeUnit.SECONDS)) {
                DeviceInfo deviceInfoA = cnk.c().a(this.e);
                if (deviceInfoA != null) {
                    cqp.a(100023, deviceInfoA.getDeviceName(), "", "");
                }
                ReleaseLogUtil.d("DEVMGR_HiChain3Client", "await auth timeout, hiChain failed");
                this.l = null;
            }
        } catch (InterruptedException unused) {
            LogUtil.d("HiChain3Client", "waitHiChain: InterruptedException");
            this.l = null;
        }
        LogUtil.b("HiChain3Client", "waitHiChain: end");
    }

    private void g() {
        if (this.f1816a == null) {
            this.f1816a = new CountDownLatch(1);
        }
    }

    private void m() {
        LogUtil.b("HiChain3Client", "waitAuthFinish: start");
        CountDownLatch countDownLatch = this.f1816a;
        if (countDownLatch == null) {
            LogUtil.e("HiChain3Client", "mAuthLatch is invalid.");
            return;
        }
        try {
            if (!countDownLatch.await(10L, TimeUnit.SECONDS)) {
                LogUtil.e("HiChain3Client", "await timeout, waitAuthFinish failed");
                this.l = null;
            }
        } catch (InterruptedException unused) {
            LogUtil.d("HiChain3Client", "waitAuthFinish: InterruptedException");
            this.l = null;
        }
        LogUtil.b("HiChain3Client", "waitAuthFinish: end");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.b("HiChain3Client", "releaseLock: start");
        if (this.f1816a == null) {
            LogUtil.e("HiChain3Client", "releaseLock: mAuthLatch is null");
        } else {
            LogUtil.b("HiChain3Client", "releaseLock: countdown");
            this.f1816a.countDown();
            this.f1816a = null;
        }
        LogUtil.b("HiChain3Client", "releaseLock: end");
    }

    public cms d() {
        e(true);
        h();
        cms cmsVar = new cms(false);
        a();
        k();
        if (this.l != null) {
            cmsVar.a(true);
        }
        cmsVar.b(this.l);
        return cmsVar;
    }

    public cms b(cnb cnbVar) {
        LogUtil.b("HiChain3Client", "transmit data, device to phone");
        cms cmsVar = new cms(false);
        this.l = null;
        if (cnbVar == null) {
            return cmsVar;
        }
        h();
        long jE = cnbVar.e();
        this.f1817b = jE;
        LogUtil.b("HiChain3Client", "transmitDataToClient authDevice transmit data, device to phone,requestId:", Long.valueOf(jE));
        this.j.b(jE, cnbVar.c(), this.g);
        k();
        if (this.l != null || this.i) {
            cmsVar.a(true);
        }
        cmsVar.b(this.l);
        return cmsVar;
    }

    public cms c() {
        LogUtil.b("HiChain3Client", "transmit data, authFinishGetNextCommand");
        if (this.i) {
            return f();
        }
        g();
        m();
        if (this.i) {
            return f();
        }
        return new cms(false);
    }

    private cms f() {
        cms cmsVar = new cms(false);
        ReleaseLogUtil.c("DEVMGR_HiChain3Client", "auth success, start 5.1.7");
        this.l = new ckq(false);
        cmsVar.a(true);
        cmsVar.b(this.l);
        return cmsVar;
    }
}
