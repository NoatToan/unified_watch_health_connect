package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.connect.handshake.HandshakeCommandBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.operation.h5pro.jsmodules.complaint.ComplaintConstants;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class cmv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f1802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f1803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CountDownLatch f1804c;
    private String d;
    private cna e;
    private HandshakeCommandBase g;
    private CountDownLatch i;

    public void a(boolean z) {
        this.f1802a = z;
        this.f1803b = null;
    }

    public void d(String str) {
        this.d = str;
    }

    public cna e() {
        return this.e;
    }

    public void b(cna cnaVar) {
        this.e = cnaVar;
    }

    public HandshakeCommandBase e(String str, zty ztyVar, ConcurrentHashMap<Long, String> concurrentHashMap, ConcurrentHashMap<String, cmv> concurrentHashMap2) {
        if (TextUtils.isEmpty(str) || ztyVar == null || concurrentHashMap == null || concurrentHashMap2 == null) {
            LogUtil.d("HiChain3AddMemberControlInfo", "processAddMember groupId : ", Boolean.valueOf(TextUtils.isEmpty(str)), " , hiChainGroupManager : ", Boolean.valueOf(ztyVar == null));
            return null;
        }
        a();
        e(str, ztyVar, concurrentHashMap);
        i();
        LogUtil.b("HiChain3AddMemberControlInfo", "processAddMember result:", concurrentHashMap2.putIfAbsent(this.d, this));
        return this.g;
    }

    private void e(String str, zty ztyVar, ConcurrentHashMap<Long, String> concurrentHashMap) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("groupId", str);
            jSONObject.put("groupType", 256);
            jSONObject.put(ComplaintConstants.GROUP_NAME_PARAM_KEY, "health_group_name");
            jSONObject.put("pinCode", cku.c(this.d));
            jSONObject.put("isAdmin", true);
            jSONObject.put("isClient", true);
        } catch (JSONException unused) {
            LogUtil.d("HiChain3AddMemberControlInfo", "addMember failed JSONException");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        concurrentHashMap.putIfAbsent(Long.valueOf(jCurrentTimeMillis), this.d);
        cnd.a().b();
        int iA = ztyVar.a(jCurrentTimeMillis, "com.huawei.health", jSONObject.toString());
        DeviceInfo deviceInfoA = cnk.c().a(this.d);
        if (deviceInfoA != null) {
            cqp.a(100018, deviceInfoA.getDeviceName(), String.valueOf(iA), "");
        }
        LogUtil.b("HiChain3AddMemberControlInfo", "addMemberToGroup result: ", Integer.valueOf(iA), ",json:", jSONObject.toString(), ",deviceIdentify:", cpl.a(this.d));
    }

    public void d(long j, byte[] bArr) {
        if (Arrays.equals(bArr, this.f1803b)) {
            LogUtil.b("HiChain3AddMemberControlInfo", "transmitDataToService isSameData");
            return;
        }
        this.f1803b = bArr;
        ReleaseLogUtil.c("DEVMGR_HiChain3AddMemberControlInfo", "transmit data， phone to device:", cpl.a(this.d));
        this.g = new cks(bArr, (byte) 1, j);
        g();
    }

    private void a() {
        if (this.i == null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.i = countDownLatch;
            LogUtil.b("HiChain3AddMemberControlInfo", "initTransmitLock: mTransmitLatch:", countDownLatch, ",deviceIdentify:", cpl.a(this.d));
        }
    }

    private void i() {
        LogUtil.b("HiChain3AddMemberControlInfo", "waitHiChain: start");
        CountDownLatch countDownLatch = this.i;
        if (countDownLatch == null) {
            LogUtil.b("HiChain3AddMemberControlInfo", "mTransmitLatch is invalid.deviceIdentify:", cpl.a(this.d));
            return;
        }
        try {
            if (!countDownLatch.await(10L, TimeUnit.SECONDS)) {
                ReleaseLogUtil.d("DEVMGR_HiChain3AddMemberControlInfo", "await timeout, hiChain failed");
                DeviceInfo deviceInfoA = cnk.c().a(this.d);
                if (deviceInfoA != null) {
                    cqp.a(100019, deviceInfoA.getDeviceName(), "", "");
                }
                this.g = null;
            }
        } catch (InterruptedException unused) {
            LogUtil.d("HiChain3AddMemberControlInfo", "waitHiChain: InterruptedException");
            this.g = null;
        }
        LogUtil.b("HiChain3AddMemberControlInfo", "waitHiChain: end");
    }

    private void g() {
        LogUtil.b("HiChain3AddMemberControlInfo", "releaseLock: start:", this.i);
        CountDownLatch countDownLatch = this.i;
        if (countDownLatch == null) {
            LogUtil.e("HiChain3AddMemberControlInfo", "releaseLock: mAsyLatch is null");
        } else {
            LogUtil.b("HiChain3AddMemberControlInfo", "releaseLock: countdown:", countDownLatch);
            this.i.countDown();
            this.i = null;
        }
        LogUtil.e("HiChain3AddMemberControlInfo", "releaseLock: end");
    }

    private void d() {
        if (this.f1804c == null) {
            this.f1804c = new CountDownLatch(1);
        }
    }

    private void h() {
        LogUtil.b("HiChain3AddMemberControlInfo", "waitBindFinish: start");
        CountDownLatch countDownLatch = this.f1804c;
        if (countDownLatch == null) {
            LogUtil.e("HiChain3AddMemberControlInfo", "mBindLatch is invalid.");
            return;
        }
        try {
            if (!countDownLatch.await(10L, TimeUnit.SECONDS)) {
                LogUtil.e("HiChain3AddMemberControlInfo", "await timeout, waitBindFinish failed");
                this.g = null;
            }
        } catch (InterruptedException unused) {
            LogUtil.d("HiChain3AddMemberControlInfo", "waitBindFinish: InterruptedException");
            this.g = null;
        }
        LogUtil.b("HiChain3AddMemberControlInfo", "waitBindFinish: end");
    }

    private void f() {
        LogUtil.b("HiChain3AddMemberControlInfo", "releaseLock: start");
        if (this.f1804c == null) {
            LogUtil.e("HiChain3AddMemberControlInfo", "releaseLock: mBindLatch is null");
        } else {
            LogUtil.b("HiChain3AddMemberControlInfo", "releaseLock: countdown");
            this.f1804c.countDown();
            this.f1804c = null;
        }
        LogUtil.b("HiChain3AddMemberControlInfo", "releaseLock: end");
    }

    public cms e(cnb cnbVar, zty ztyVar) {
        cms cmsVar = new cms(false);
        this.g = null;
        if (ztyVar != null && !b(this.d, cnbVar)) {
            int iA = cnbVar.a();
            int iB = cnbVar.b();
            ReleaseLogUtil.c("DEVMGR_HiChain3AddMemberControlInfo", "transmitDataToClient device to hiChain3 type:", Integer.valueOf(iA), ",AuthFinishFlag:", Integer.valueOf(iB));
            DeviceInfo deviceInfoA = cnk.c().a(this.d);
            if (deviceInfoA != null) {
                cqp.a(100024, deviceInfoA.getDeviceName(), String.valueOf(iA), String.valueOf(iB));
            }
            if (iB == 4) {
                cmsVar.a(true);
                return cmsVar;
            }
            if (iB == 1) {
                LogUtil.b("HiChain3AddMemberControlInfo", "transmitDataToClient mIsBind:", Boolean.valueOf(this.f1802a));
                return j();
            }
            if (iB == 2) {
                return this.e.c();
            }
            if (iA == 1 && iB == 0) {
                a();
                long jE = cnbVar.e();
                LogUtil.b("HiChain3AddMemberControlInfo", "transmitDataToClient requestId:", Long.valueOf(jE), ",deviceIdentify:", cpl.a(this.d));
                ztyVar.a(jE, cnbVar.c());
                i();
                if (this.g != null || this.f1802a) {
                    cmsVar.a(true);
                }
                cmsVar.b(this.g);
                return cmsVar;
            }
            if (iA == 2 && iB == 0) {
                return this.e.b(cnbVar);
            }
        }
        return cmsVar;
    }

    private boolean b(String str, cnb cnbVar) {
        if (cnbVar != null && !TextUtils.isEmpty(str)) {
            return false;
        }
        LogUtil.e("HiChain3AddMemberControlInfo", "transmitDataToClient hiChainInfo or deviceIdentify is null");
        return true;
    }

    private cms j() {
        if (this.f1802a) {
            return b();
        }
        d();
        h();
        if (this.f1802a) {
            return b();
        }
        return new cms(false);
    }

    public cms b() {
        cms cmsVar = new cms(false);
        cna cnaVar = this.e;
        return cnaVar == null ? cmsVar : cnaVar.d();
    }

    public void c() {
        this.f1802a = true;
        g();
        f();
        this.f1803b = null;
    }
}
