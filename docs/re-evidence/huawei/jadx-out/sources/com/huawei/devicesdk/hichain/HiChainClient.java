package com.huawei.devicesdk.hichain;

import android.text.TextUtils;
import com.huawei.devicesdk.connect.handshake.HandshakeCommandBase;
import com.huawei.security.deviceauth.ConfirmParams;
import com.huawei.security.deviceauth.HwDevAuthCallback;
import com.huawei.security.deviceauth.HwDeviceAuthManager;
import com.huawei.security.deviceauth.OperationCode;
import com.huawei.security.deviceauth.OperationParameter;
import com.huawei.security.deviceauth.UserInfo;
import defpackage.ckp;
import defpackage.ckq;
import defpackage.cks;
import defpackage.cku;
import defpackage.cml;
import defpackage.cms;
import defpackage.cnc;
import defpackage.cpl;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class HiChainClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CountDownLatch f5443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private UserInfo f5445c;
    private byte[] d;
    private OperationParameter e;
    private HwDeviceAuthManager g;
    private int k;
    private HandshakeCommandBase l;
    private cml n;
    private boolean j = false;
    private boolean f = true;
    private boolean i = false;
    private boolean h = false;

    public HiChainClient(String str, HwDeviceAuthManager hwDeviceAuthManager) {
        this.f5444b = str;
        this.g = hwDeviceAuthManager;
        OperationParameter operationParameter = new OperationParameter(m());
        this.e = operationParameter;
        operationParameter.setSelfId(d(str));
        this.e.setSelfType(0);
        this.e.setServiceType("HwSmartWatch");
        this.e.setCallbackHandler(new HiChainCallbackHandler());
        UserInfo userInfo = new UserInfo();
        this.f5445c = userInfo;
        userInfo.setAuthId(d(str));
        this.f5445c.setServiceType("HwSmartWatch");
        this.f5445c.setUserType(0);
    }

    public boolean c() {
        return this.j;
    }

    public void b(boolean z) {
        this.j = z;
    }

    public boolean b() {
        return this.i;
    }

    private void c(boolean z) {
        this.i = z;
    }

    private void e(boolean z) {
        this.f = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l() {
        return this.f;
    }

    public byte[] e() {
        return this.d;
    }

    public void d(byte[] bArr) {
        this.d = bArr;
    }

    public boolean h() {
        return this.h;
    }

    class HiChainCallbackHandler implements HwDevAuthCallback {
        private HiChainCallbackHandler() {
        }

        public void onOperationFinished(String str, OperationCode operationCode, int i, byte[] bArr) {
            ReleaseLogUtil.c("DEVMGR_HiChainClient", "onOperationFinished sessionId: ", cpl.a(str), " operationCode: " + operationCode, " result: ", Integer.valueOf(i));
            if (operationCode == OperationCode.BIND) {
                if (i == 0) {
                    HiChainClient.this.e(bArr);
                    HiChainClient.this.a();
                    return;
                } else {
                    ReleaseLogUtil.c("DEVMGR_HiChainClient", "bind failed");
                    HiChainClient.this.f();
                    return;
                }
            }
            if (operationCode != OperationCode.AUTHENTICATE) {
                LogUtil.b("HiChainClient", "Unknown operation. ");
                return;
            }
            if (i != 0) {
                if (HiChainClient.this.l()) {
                    if (HiChainClient.this.k >= 2) {
                        HiChainClient.this.l = null;
                        HiChainClient.this.q();
                        return;
                    } else {
                        LogUtil.b("HiChainClient", "onOperationFinished: first auth failed");
                        return;
                    }
                }
                LogUtil.b("HiChainClient", "second auth failed");
                HiChainClient.this.f();
                return;
            }
            ReleaseLogUtil.c("DEVMGR_HiChainClient", "auth success, start 5.1.7");
            HiChainClient.this.h = true;
            HiChainClient.this.l = new ckq(false);
            HiChainClient.this.j();
            HiChainClient.this.q();
        }

        public void onSessionKeyReturned(String str, byte[] bArr) {
            LogUtil.b("HiChainClient", "onSessionKeyReturned", cpl.a(str));
            if (bArr == null || bArr.length == 0) {
                LogUtil.d("HiChainClient", "onSessionKeyReturned sessionKey is empty");
            }
            HiChainClient.this.d(bArr);
        }

        public boolean onDataTransmit(String str, byte[] bArr) {
            LogUtil.b("HiChainClient", "onDataTransmit sessionId start,sessionId: ", cpl.a(str));
            HiChainClient.this.c(bArr);
            return true;
        }

        public ConfirmParams onReceiveRequest(String str, OperationCode operationCode) {
            LogUtil.b("HiChainClient", "onReceiveRequest sessionId： ", cpl.a(str), " operationCode " + operationCode);
            ConfirmParams confirmParams = new ConfirmParams();
            confirmParams.setConfirmation(-2147483642);
            if (operationCode == OperationCode.BIND || operationCode == OperationCode.AUTH_KEY_AGREEMENT) {
                confirmParams.setPin(cku.c(HiChainClient.this.f5444b));
            }
            confirmParams.setKeyLength(32);
            return confirmParams;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(byte[] bArr) {
        ReleaseLogUtil.c("DEVMGR_HiChainClient", "transmit data， phone to device");
        this.l = new cks(bArr, (byte) 0, 0L);
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        LogUtil.b("HiChainClient", "hichain failed");
        j();
        this.l = null;
        q();
    }

    private String m() {
        return String.valueOf(System.currentTimeMillis());
    }

    private byte[] d(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.d("HiChainClient", "string to byte UnsupportedEncodingException");
            return new byte[0];
        }
    }

    public HandshakeCommandBase c(cml cmlVar) {
        this.n = cmlVar;
        b(true);
        g();
        return this.l;
    }

    private void g() {
        if (!k()) {
            o();
        }
        t();
        this.k = 0;
        a();
    }

    public void a() {
        LogUtil.b("HiChainClient", "authenticate peer .mClientParams , start");
        this.e.setSessionId(m());
        ReleaseLogUtil.c("DEVMGR_HiChainClient", "start hiChain auth");
        n();
        int iAuthenticatePeer = this.g.authenticatePeer(this.e, (String) null, 32);
        if (iAuthenticatePeer != -2147483642) {
            ReleaseLogUtil.b("DEVMGR_HiChainClient", "authenticate peer failed.error code:", Integer.valueOf(iAuthenticatePeer));
            f();
            return;
        }
        LogUtil.b("HiChainClient", "authenticate peer success::", Integer.valueOf(iAuthenticatePeer));
        if (l()) {
            LogUtil.b("HiChainClient", "first hiChain auth, wait");
            s();
        }
    }

    private void n() {
        if (this.f5443a == null) {
            this.f5443a = new CountDownLatch(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        LogUtil.e("HiChainClient", "releaseLock: start");
        if (this.f5443a == null) {
            LogUtil.e("HiChainClient", "releaseLock: mAsyLatch is null");
            return;
        }
        LogUtil.e("HiChainClient", "releaseLock: countdown");
        this.f5443a.countDown();
        this.f5443a = null;
    }

    public HandshakeCommandBase e(cml cmlVar) {
        this.n = cmlVar;
        b(true);
        c(false);
        g();
        return this.l;
    }

    public void j() {
        LogUtil.b("HiChainClient", "data recovery");
        e(true);
        cku.a(this.f5444b);
        cnc.b(this.f5444b, "");
        c(true);
        HiChainAuthManager.e().d();
    }

    private void o() {
        LogUtil.b("HiChainClient", "registerClient result:", Integer.valueOf(this.g.registerNewUser(this.f5445c, 0, (String) null, (HwDevAuthCallback) null)));
    }

    private boolean k() {
        return this.g.isRegistered(this.f5445c);
    }

    private void s() {
        ReleaseLogUtil.c("DEVMGR_HiChainClient", "waitHiChain: start");
        CountDownLatch countDownLatch = this.f5443a;
        if (countDownLatch == null) {
            LogUtil.b("HiChainClient", "mAsyncLatch is invalid.");
            return;
        }
        try {
            if (!countDownLatch.await(10L, TimeUnit.SECONDS)) {
                ReleaseLogUtil.d("DEVMGR_HiChainClient", "await timeout, hiChain failed");
                this.l = null;
            }
        } catch (InterruptedException unused) {
            LogUtil.d("HiChainClient", "waitHiChain: InterruptedException");
            this.l = null;
        }
        LogUtil.b("HiChainClient", "waitHiChain: end");
    }

    public cms b(byte[] bArr) {
        LogUtil.b("HiChainClient", "transmit data, device to phone");
        cms cmsVar = new cms(false);
        if (a(bArr)) {
            ReleaseLogUtil.d("DEVMGR_HiChainClient", "string to dealAuthenticateFailure");
            HandshakeCommandBase handshakeCommandBaseI = i();
            if (handshakeCommandBaseI != null) {
                cmsVar.a(true);
                cmsVar.b(handshakeCommandBaseI);
            }
            return cmsVar;
        }
        n();
        this.g.processReceivedData(this.e, bArr);
        this.k++;
        s();
        HandshakeCommandBase handshakeCommandBase = this.l;
        if (handshakeCommandBase != null || (this.k >= 2 && handshakeCommandBase == null)) {
            cmsVar.a(true);
        }
        cmsVar.b(this.l);
        return cmsVar;
    }

    private boolean a(byte[] bArr) {
        if (this.f) {
            return bArr == null || bArr.length == 0;
        }
        return false;
    }

    private HandshakeCommandBase i() {
        ReleaseLogUtil.c("DEVMGR_HiChainClient", "UniteDevice first Authenticate failure,go to bindPeer");
        e(false);
        LogUtil.b("HiChainClient", "dealFirstAuthFailure-get pinCode from 5.1.44");
        return new ckp(this.n);
    }

    public HandshakeCommandBase d() {
        LogUtil.b("HiChainClient", "bindPeer peer.mClientParams");
        this.e.setSessionId(m());
        ReleaseLogUtil.c("DEVMGR_HiChainClient", "start hiChain bind");
        n();
        int iBindPeer = this.g.bindPeer(this.e, cku.c(this.f5444b), 32);
        if (iBindPeer != -2147483642) {
            ReleaseLogUtil.b("DEVMGR_HiChainClient", "client bind peer failed.", Integer.valueOf(iBindPeer));
            f();
        } else {
            LogUtil.b("HiChainClient", "client bind peer success.", Integer.valueOf(iBindPeer));
            s();
        }
        return this.l;
    }

    private void t() {
        try {
            LogUtil.b("HiChainClient", "registerGroup end result: ", this.g.getClass().getMethod("registerGroup", String.class, UserInfo.class, Integer.TYPE).invoke(this.g, "HwSmartWatchGroup", this.f5445c, -1));
        } catch (IllegalAccessException unused) {
            LogUtil.d("HiChainClient", "registerGroup IllegalAccessException exception.");
        } catch (IllegalArgumentException unused2) {
            LogUtil.d("HiChainClient", "registerGroup IllegalArgumentException exception.");
        } catch (NoSuchMethodException unused3) {
            LogUtil.d("HiChainClient", "registerGroup NoSuchMethodException exception.");
        } catch (SecurityException unused4) {
            LogUtil.d("HiChainClient", "registerGroup SecurityException exception.");
        } catch (InvocationTargetException unused5) {
            LogUtil.d("HiChainClient", "registerGroup InvocationTargetException exception.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(byte[] bArr) {
        String str;
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.d("HiChainClient", "UnsupportedEncodingException");
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("HiChainClient", "addTrustedDevice peerAuthId is null");
            return;
        }
        if (TextUtils.isEmpty(cnc.e(this.f5444b))) {
            LogUtil.e("HiChainClient", "addTrustedDevice peerConnDeviceId is null");
            return;
        }
        try {
            LogUtil.b("HiChainClient", "addTrustedDevice result", this.g.getClass().getMethod("addTrustedDevice", String.class, String.class, String.class).invoke(this.g, "HwSmartWatchGroup", cnc.e(this.f5444b), str));
        } catch (IllegalAccessException unused2) {
            LogUtil.d("HiChainClient", "addTrustedDevice IllegalAccessException exception.");
        } catch (IllegalArgumentException unused3) {
            LogUtil.d("HiChainClient", "addTrustedDevice IllegalArgumentException exception.");
        } catch (NoSuchMethodException unused4) {
            LogUtil.d("HiChainClient", "addTrustedDevice NoSuchMethodException exception.");
        } catch (SecurityException unused5) {
            LogUtil.d("HiChainClient", "addTrustedDevice SecurityException exception.");
        } catch (InvocationTargetException unused6) {
            LogUtil.d("HiChainClient", "addTrustedDevice InvocationTargetException exception.");
        }
    }
}
