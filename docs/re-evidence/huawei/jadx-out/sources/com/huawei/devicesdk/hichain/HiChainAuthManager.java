package com.huawei.devicesdk.hichain;

import android.text.TextUtils;
import com.huawei.common.Constant;
import com.huawei.devicesdk.connect.handshake.HandshakeCommandBase;
import com.huawei.haf.application.BaseApplication;
import com.huawei.security.deviceauth.HwDevAuthConnectionCallback;
import com.huawei.security.deviceauth.HwDeviceAuthManager;
import defpackage.cml;
import defpackage.cms;
import defpackage.cpl;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class HiChainAuthManager {
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, HiChainClient> f5439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CountDownLatch f5440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5441c;
    private HwDeviceAuthManager e;

    static class HiChainServiceConnection implements HwDevAuthConnectionCallback {
        private HiChainServiceConnection() {
        }

        public void onServiceDisconnected() {
            LogUtil.b("HiChainAuthManager", "onServiceDisconnected");
            HiChainAuthManager.e().b(false);
        }

        public void onServiceConnected() {
            LogUtil.b("HiChainAuthManager", Constant.SERVICE_CONNECT_MESSAGE);
            HiChainAuthManager.e().b(true);
            HiChainAuthManager.e().f();
        }
    }

    private HiChainAuthManager() {
        this.f5441c = false;
        this.f5439a = new ConcurrentHashMap<>(16);
    }

    public static HiChainAuthManager e() {
        return a.f5442a;
    }

    private boolean j() {
        return this.f5441c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        this.f5441c = z;
    }

    public boolean a(String str) {
        return this.f5439a.containsKey(str);
    }

    public boolean b() {
        LogUtil.b("HiChainAuthManager", "isAllHaveResult() start.");
        if (this.f5439a.isEmpty()) {
            return true;
        }
        for (HiChainClient hiChainClient : this.f5439a.values()) {
            if (hiChainClient != null && !hiChainClient.b()) {
                return false;
            }
        }
        return true;
    }

    public void d() {
        LogUtil.b("HiChainAuthManager", "disHiChainAuth()");
        if (b()) {
            LogUtil.b("HiChainAuthManager", "isAllHaveResult(): ", Boolean.valueOf(b()));
            i();
        }
    }

    private void a() {
        LogUtil.b("HiChainAuthManager", "start connectDeviceAuthService");
        this.e.connectDeviceAuthService();
    }

    private void i() {
        LogUtil.b("HiChainAuthManager", "start disconnectDeviceAuthService");
        synchronized (d) {
            HwDeviceAuthManager hwDeviceAuthManager = this.e;
            if (hwDeviceAuthManager != null) {
                hwDeviceAuthManager.disconnectDeviceAuthService();
            }
        }
    }

    public static HandshakeCommandBase c(String str, cml cmlVar) {
        LogUtil.b("HiChainAuthManager", "initHiChain start ");
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("HiChainAuthManager", "initHiChain: deviceIdentify is null");
            return null;
        }
        HiChainAuthManager hiChainAuthManagerE = e();
        hiChainAuthManagerE.e(str);
        if (!hiChainAuthManagerE.c()) {
            ReleaseLogUtil.d("DEVMGR_HiChainAuthManager", "initHiChain: connect hiChain failed");
            hiChainAuthManagerE.e(str);
            return null;
        }
        HandshakeCommandBase handshakeCommandBaseD = hiChainAuthManagerE.d(str, cmlVar);
        if (handshakeCommandBaseD == null) {
            LogUtil.b("HiChainAuthManager", "nextCommand use to finish auth");
            hiChainAuthManagerE.e(str);
        }
        return handshakeCommandBaseD;
    }

    public void e(String str) {
        HiChainClient hiChainClient;
        LogUtil.b("HiChainAuthManager", "disConnect() start.");
        if (!this.f5439a.containsKey(str) || (hiChainClient = this.f5439a.get(str)) == null || hiChainClient.b()) {
            return;
        }
        LogUtil.b("HiChainAuthManager", "HiChain组件操作没有结束.");
        hiChainClient.j();
    }

    public byte[] d(String str) {
        HiChainClient hiChainClient = this.f5439a.get(str);
        if (hiChainClient == null) {
            LogUtil.d("HiChainAuthManager", "deviceIdentify ", cpl.e(str), " have not open hichain");
            return null;
        }
        return hiChainClient.e();
    }

    private boolean c() {
        synchronized (d) {
            h();
            if (this.e == null) {
                LogUtil.b("HiChainAuthManager", "HiChainAuthManager create");
                this.e = HwDeviceAuthManager.getInstance(BaseApplication.b(), new HiChainServiceConnection());
                g();
                return j();
            }
            LogUtil.b("HiChainAuthManager", "Check all processes are complete, then reconnect. isConnectFlag: ", Boolean.valueOf(j()));
            if (b() && !j()) {
                a();
                g();
                return j();
            }
            LogUtil.b("HiChainAuthManager", "HiChainService is connected");
            return true;
        }
    }

    private void h() {
        this.f5440b = new CountDownLatch(1);
        LogUtil.b("HiChainAuthManager", "initLock success");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f5440b == null) {
            LogUtil.d("HiChainAuthManager", "mConnectLatch is null, releaseLock fail.");
            return;
        }
        LogUtil.b("HiChainAuthManager", "releaseLock: start");
        this.f5440b.countDown();
        this.f5440b = null;
    }

    private HandshakeCommandBase d(String str, cml cmlVar) {
        if (this.f5439a.containsKey(str)) {
            return this.f5439a.get(str).e(cmlVar);
        }
        HiChainClient hiChainClient = new HiChainClient(str, this.e);
        this.f5439a.put(str, hiChainClient);
        return hiChainClient.c(cmlVar);
    }

    private void g() {
        ReleaseLogUtil.c("DEVMGR_HiChainAuthManager", "waitConnect: start");
        CountDownLatch countDownLatch = this.f5440b;
        if (countDownLatch == null) {
            LogUtil.b("HiChainAuthManager", "mConnectLatch is invalid.");
            return;
        }
        try {
            if (!countDownLatch.await(2L, TimeUnit.SECONDS)) {
                ReleaseLogUtil.d("DEVMGR_HiChainAuthManager", "connect deviceAuthService timeout");
                b(false);
            }
        } catch (InterruptedException unused) {
            LogUtil.d("HiChainAuthManager", "waitConnect: InterruptedException");
            b(false);
        }
        LogUtil.b("HiChainAuthManager", "waitConnect: end");
    }

    public cms b(String str, byte[] bArr) {
        cms cmsVar = new cms(false);
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("HiChainAuthManager", "transmitDataToClient: deviceIdentify is null");
            return cmsVar;
        }
        HiChainClient hiChainClient = this.f5439a.get(str);
        if (hiChainClient == null) {
            LogUtil.e("HiChainAuthManager", "transmitDataToClient: hiChainClient is null");
            return cmsVar;
        }
        cms cmsVarB = hiChainClient.b(bArr);
        if ((!cmsVarB.c() || hiChainClient.h()) && !hiChainClient.b()) {
            hiChainClient.j();
        }
        return cmsVarB;
    }

    public HandshakeCommandBase b(String str) {
        HiChainClient hiChainClient = this.f5439a.get(str);
        if (hiChainClient == null || !j()) {
            return null;
        }
        return hiChainClient.d();
    }

    public boolean j(String str) {
        HiChainClient hiChainClient = this.f5439a.get(str);
        if (hiChainClient == null) {
            return false;
        }
        return hiChainClient.c();
    }

    public void e(String str, boolean z) {
        HiChainClient hiChainClient = this.f5439a.get(str);
        if (hiChainClient == null) {
            return;
        }
        hiChainClient.b(z);
    }

    public void c(String str) {
        if (this.f5439a.containsKey(str)) {
            this.f5439a.remove(str);
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static HiChainAuthManager f5442a = new HiChainAuthManager();
    }
}
