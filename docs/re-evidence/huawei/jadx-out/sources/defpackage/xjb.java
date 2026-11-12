package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.AppRouterResultReceiver;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.hwcommonfilemgr.ParserInterface;
import com.huawei.unitedevice.p2p.IdentityInfo;
import health.compact.a.LogUtil;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
public class xjb implements ParserInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final xjb f53095c = new xjb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HandlerThread f53096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f53097b;
    private Map<Integer, SendCallback> d = new ConcurrentHashMap(16);
    private Map<Integer, PingCallback> e = new ConcurrentHashMap(16);

    private xjb() {
        this.f53096a = null;
        HandlerThread handlerThread = new HandlerThread("P2pResponseManager");
        this.f53096a = handlerThread;
        handlerThread.start();
        this.f53097b = new Handler(this.f53096a.getLooper());
    }

    public void c(int i, SendCallback sendCallback) {
        if (sendCallback != null) {
            this.d.put(Integer.valueOf(i), sendCallback);
        }
    }

    public void b(int i, PingCallback pingCallback) {
        if (pingCallback != null) {
            this.e.put(Integer.valueOf(i), pingCallback);
        }
    }

    public void d(DeviceInfo deviceInfo, xiv xivVar) {
        int iA = xivVar.a();
        int iF = xivVar.f();
        LogUtil.b("P2pResponseManager", "response getSubCmd: ", Integer.valueOf(iF), " response getSrcPkgName: ", xivVar.g(), " response getDstPkgName: ", xivVar.c());
        if (xivVar.f() == 3) {
            d(xivVar.d(), iA);
        } else if (xivVar.f() == 2) {
            a(deviceInfo, xivVar);
        } else {
            c(deviceInfo, xivVar);
        }
    }

    private void d(cqa cqaVar, int i) {
        if (cqaVar == null) {
            LogUtil.e("P2pResponseManager", "responseTlv is null");
            return;
        }
        if (i == -1) {
            LogUtil.e("P2pResponseManager", "result sequenceNum is error");
            return;
        }
        String strC = cqaVar.c();
        LogUtil.b("P2pResponseManager", "handleResultCallback sequenceNum is ", Integer.valueOf(i), "handleResultCallback result int is ", 203);
        int iA = TextUtils.isEmpty(strC) ? 203 : cpb.a(strC);
        if (this.e.containsKey(Integer.valueOf(i))) {
            LogUtil.b("P2pResponseManager", "handleResultCallback is P2pPingCallback");
            PingCallback pingCallbackRemove = this.e.remove(Integer.valueOf(i));
            if (pingCallbackRemove == null) {
                LogUtil.b("P2pResponseManager", "handleResultCallback pingCallback is null");
                return;
            } else {
                pingCallbackRemove.onPingResult(iA);
                return;
            }
        }
        if (this.d.containsKey(Integer.valueOf(i))) {
            LogUtil.b("P2pResponseManager", "handleResultCallback is P2pSendCallback");
            SendCallback sendCallbackRemove = this.d.remove(Integer.valueOf(i));
            sendCallbackRemove.onSendResult(iA);
            if (iA == 207) {
                sendCallbackRemove.onSendProgress(100L);
                return;
            } else {
                sendCallbackRemove.onSendProgress(0L);
                return;
            }
        }
        LogUtil.e("P2pResponseManager", "handleResultCallback is null");
    }

    private void a(DeviceInfo deviceInfo, xiv xivVar) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.e("P2pResponseManager", "handDeviceSendCommand device or device identify is null");
            return;
        }
        IdentityInfo identityInfo = new IdentityInfo(xivVar.g(), xivVar.h());
        IdentityInfo identityInfo2 = new IdentityInfo(xivVar.c(), xivVar.b());
        LogUtil.b("P2pResponseManager", "handDeviceSendCommand enter handDeviceSendCommand response.getSrcPkgName() ", xivVar.g(), "response.getSrcPkgCert(): ", xivVar.h(), "response.getDstPkgName(): ", xivVar.c(), "response.getDstPkgCert(): ", xivVar.b());
        List<xiy> listC = xjc.b().c(deviceInfo.getDeviceMac(), identityInfo, identityInfo2);
        LogUtil.b("P2pResponseManager", "receivers size is ", Integer.valueOf(listC.size()));
        if (listC.isEmpty()) {
            LogUtil.e("P2pResponseManager", "handDeviceSendCommand receiver is null");
            e(deviceInfo, xivVar, 206);
            return;
        }
        byte[] bArrE = xivVar.e();
        if (bArrE == null || TextUtils.isEmpty(identityInfo.getPackageName()) || TextUtils.isEmpty(identityInfo2.getPackageName())) {
            LogUtil.e("P2pResponseManager", "handDeviceSendCommand message or package name is null");
            return;
        }
        if (listC.isEmpty()) {
            e(deviceInfo, xivVar, 206);
            return;
        }
        xiu.c cVar = new xiu.c();
        cVar.a(bArrE);
        xiu xiuVarC = cVar.c();
        for (xiy xiyVar : listC) {
            e(deviceInfo, xivVar, a.w);
            if (xiyVar.d() != null) {
                LogUtil.b("P2pResponseManager", "entry onReceiveMessage receiver processName is ", xiyVar.b());
                try {
                    xiyVar.d().onReceiveMessage(deviceInfo, xiuVarC);
                    LogUtil.b("P2pResponseManager", "onReceiveMessage success! ");
                } catch (Exception e) {
                    LogUtil.d("P2pResponseManager", "onReceiveMessage Exception: ", ExceptionUtils.c(e));
                }
            }
        }
    }

    private void c(final DeviceInfo deviceInfo, final xiv xivVar) {
        if (deviceInfo == null) {
            return;
        }
        LogUtil.b("P2pResponseManager", "handDevicePingCommand enter");
        if (TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.e("P2pResponseManager", "handDevicePingCommand device identify is null");
        } else {
            ThreadPoolManager.c().b("P2pResponseManager", new Runnable() { // from class: xjb.4
                @Override // java.lang.Runnable
                public void run() {
                    xjb.this.e(deviceInfo, xivVar, 205);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DeviceInfo deviceInfo, xiv xivVar, int i) {
        if (TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.e("P2pResponseManager", "sendDeviceCommand device identify is null");
            return;
        }
        int iA = xivVar.a();
        int iF = xivVar.f();
        IdentityInfo identityInfo = new IdentityInfo(xivVar.g(), xivVar.h());
        IdentityInfo identityInfo2 = new IdentityInfo(xivVar.c(), xivVar.b());
        if (xivVar.f() == 1) {
            i = b(identityInfo, xivVar, deviceInfo);
            LogUtil.b("P2pResponseManager", "pullUpHealthBusiness response: ", Integer.valueOf(i));
        }
        if ("com.huawei.health.btproxy".equals(identityInfo.getPackageName()) && "hw.unitedevice.btproxy".equals(identityInfo2.getPackageName())) {
            LogUtil.b("P2pResponseManager", "doDeviceResponse is not response for btProxy");
            return;
        }
        cmg cmgVarB = xiw.b(iA, identityInfo2, identityInfo, iF, i);
        if (cmgVarB == null) {
            LogUtil.e("P2pResponseManager", "sendDeviceCommand message is null");
            return;
        }
        LogUtil.c("P2pResponseManager", "sendDeviceCommand message is ", cmgVarB.toString());
        UniteDevice uniteDevice = new UniteDevice();
        uniteDevice.setIdentify(deviceInfo.getDeviceMac());
        uniteDevice.setDeviceInfo(deviceInfo);
        xip.a().e(uniteDevice, cmgVarB);
    }

    private int b(IdentityInfo identityInfo, xiv xivVar, DeviceInfo deviceInfo) {
        String strC = xivVar.c();
        String packageName = identityInfo.getPackageName();
        LogUtil.b("P2pResponseManager", "pullUpHealthBusiness destPkgName: ", strC, ",getPackageName: ", packageName);
        String[] strArrSplit = strC.split("\\.");
        if (strArrSplit.length > 2 && strArrSplit[2].equals("wakeapp")) {
            byte[] bArrE = xivVar.e();
            if (bArrE == null || bArrE.length == 0) {
                return 204;
            }
            xix xixVarA = xio.c().a(bArrE);
            LogUtil.b("P2pResponseManager", "p2pPingPayload openType: ", Integer.valueOf(xixVarA.d()));
            String strA = xixVarA.a();
            if (!TextUtils.isEmpty(strA)) {
                if (strA.startsWith("hiresearch_scheme://")) {
                    xixVarA.e(1);
                    return a(strA) ? a.A : a.C;
                }
                if (strA.contains("from=")) {
                    return d(strA);
                }
                return d(strA + (strA.contains("?") ? "&" : "?") + "from=watch");
            }
            if (cop.h()) {
                int iE = e(xixVarA.d(), xixVarA.b());
                if (iE == 0) {
                    LogUtil.b("P2pResponseManager", "p2pPingPayload open target in plugin not exist. ");
                } else {
                    if (iE == 1) {
                        LogUtil.b("P2pResponseManager", "p2pPingPayload open target in plugin successful. ");
                        return a.A;
                    }
                    if (iE == 2) {
                        LogUtil.b("P2pResponseManager", "p2pPingPayload open target in plugin not download. ");
                        return 204;
                    }
                }
            }
            return d(xixVarA, deviceInfo);
        }
        if (TextUtils.isEmpty(packageName)) {
            return 205;
        }
        a(identityInfo.getPackageName(), deviceInfo);
        return 205;
    }

    private int d(xix xixVar, DeviceInfo deviceInfo) {
        LogUtil.b("P2pResponseManager", "pingActionDispenser: ", Integer.valueOf(xixVar.d()));
        int iD = xixVar.d();
        if (iD == 1) {
            if (d(xixVar.b(), xixVar.a(), xixVar.c())) {
                return 205;
            }
            return a.C;
        }
        if (iD == 2) {
            c(xixVar.b(), xixVar.c(), deviceInfo);
            return 205;
        }
        if (iD == 3) {
            if (c(xixVar.a())) {
                return 205;
            }
            return a.C;
        }
        if (iD == 4) {
            return d(xixVar.a());
        }
        if (!TextUtils.isEmpty(xixVar.a())) {
            return d(xixVar.a());
        }
        LogUtil.e("P2pResponseManager", "Can't find the correspondent case. ");
        return 205;
    }

    private boolean a(String str) {
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            intent.setFlags(268435456);
            BaseApplication.b().startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            LogUtil.d("P2pResponseManager", "startH5Page ActivityNotFoundException: ", e.getMessage());
            return false;
        }
    }

    private void a(final String str, final DeviceInfo deviceInfo) {
        if (this.f53097b == null) {
            LogUtil.e("P2pResponseManager", "mCpHandler is null");
        } else if (TextUtils.isEmpty(str)) {
            LogUtil.e("P2pResponseManager", "pkgName is null");
        } else {
            this.f53097b.post(new Runnable() { // from class: xjb.2
                @Override // java.lang.Runnable
                public void run() {
                    String strE = xiz.e(str);
                    if (TextUtils.isEmpty(strE)) {
                        return;
                    }
                    try {
                        Intent intent = new Intent();
                        intent.setAction(strE);
                        intent.setPackage(BaseApplication.b().getPackageName());
                        intent.putExtra("packageName", str);
                        LogUtil.b("P2pResponseManager", "service action: ", strE, " package: ", str);
                        BaseApplication.b().startService(intent);
                        cqp.a(100073, cqc.a((Object) deviceInfo.getDeviceName()), "", "");
                    } catch (IllegalStateException | SecurityException e) {
                        LogUtil.d("P2pResponseManager", "startService exception ", ExceptionUtils.c(e));
                    }
                }
            });
        }
    }

    private void c(final String str, final String str2, final DeviceInfo deviceInfo) {
        LogUtil.b("P2pResponseManager", "startActivity with serviceName: [", str, "], pkgName: [", str2, "]. ");
        if (this.f53097b == null) {
            LogUtil.e("P2pResponseManager", "mCpHandler is null");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.e("P2pResponseManager", "serviceName or pkgName is null");
        } else {
            this.f53097b.post(new Runnable() { // from class: xjb.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Intent intent = new Intent();
                        intent.setAction(str);
                        intent.setClassName(str2, str);
                        BaseApplication.b().startService(intent);
                        cqp.a(100073, cqc.a((Object) deviceInfo.getDeviceName()), "", "");
                    } catch (IllegalStateException e) {
                        LogUtil.d("P2pResponseManager", "startService pkgName IllegalStateException = ", ExceptionUtils.c(e));
                    }
                }
            });
        }
    }

    private boolean d(String str, String str2, String str3) {
        LogUtil.b("P2pResponseManager", "startActivity with activityName: [", str, "], deepLinkUrl: [", str2, "], pkgName: [", str3, "]. ");
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str)) {
                LogUtil.e("P2pResponseManager", "startActivity activityName or pkgName is null. ");
                return false;
            }
            if (str3.equals("com.huawei.health")) {
                LogUtil.b("P2pResponseManager", "startActivity inside activityName: [", str, "], pkgName: [", str3, "]. ");
                try {
                    Intent intent = new Intent();
                    intent.setClassName(str3, str);
                    intent.setFlags(268435456);
                    BaseApplication.b().startActivity(intent);
                    return true;
                } catch (ActivityNotFoundException e) {
                    LogUtil.d("P2pResponseManager", "startActivity startH5Page ActivityNotFoundException: ", e.getMessage());
                    return false;
                }
            }
            LogUtil.b("P2pResponseManager", "startActivity outside activityName: [", str, "], pkgName: [", str3, "]. ");
            try {
                Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent2.setComponent(new ComponentName(str3, str));
                intent2.setFlags(268435456);
                BaseApplication.b().startActivity(intent2);
                return true;
            } catch (ActivityNotFoundException e2) {
                LogUtil.d("P2pResponseManager", "startH5Page ActivityNotFoundException: ", e2.getMessage());
                return false;
            }
        }
        d(str2);
        return true;
    }

    private int d(String str) {
        LogUtil.b("P2pResponseManager", "startDeepLink with deepLink: [", str, "]. ");
        if (TextUtils.isEmpty(str) || !(str.startsWith("huaweischeme://healthapp/router/") || str.startsWith("huaweischeme://healthapp/home/"))) {
            return a.C;
        }
        int iE = e(str);
        if (iE == 0 || iE == 1) {
            LogUtil.b("P2pResponseManager", "startDeepLink p2pPingPayload open target in plugin successful. ");
            return a.A;
        }
        if (iE != 2) {
            return a.C;
        }
        LogUtil.b("P2pResponseManager", "startDeepLink p2pPingPayload open target in plugin not download. ");
        return 204;
    }

    private int e(String str) {
        final int[] iArr = {-1};
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        final int[] iArr2 = {-1};
        AppRouter.e(Uri.parse(str)).a((Context) null, new AppRouterResultReceiver() { // from class: xjb.5
            @Override // com.huawei.haf.router.AppRouterResultReceiver
            public void e(Guidepost guidepost, int i, String str2) {
                LogUtil.b("P2pResponseManager", "startDeepLink onPluginResult status:", Integer.valueOf(i), ", pluginName=", str2);
                iArr[0] = i;
                countDownLatch.countDown();
                if (i == 2) {
                    countDownLatch.countDown();
                }
            }

            @Override // com.huawei.haf.router.AppRouterResultReceiver
            public void a(Guidepost guidepost, int i) {
                LogUtil.b("P2pResponseManager", "startDeepLink onRouteResult status:", Integer.valueOf(i));
                iArr2[0] = i != 11 ? 1 : 11;
                countDownLatch.countDown();
            }
        });
        try {
            if (!countDownLatch.await(500L, TimeUnit.MILLISECONDS)) {
                LogUtil.d("P2pResponseManager", "startDeepLink time out");
            }
        } catch (InterruptedException unused) {
            LogUtil.d("P2pResponseManager", "startDeepLink await InterruptedException! ");
        }
        if (iArr[0] != 2) {
            iArr[0] = iArr2[0];
        }
        return iArr[0];
    }

    private boolean c(String str) {
        LogUtil.b("P2pResponseManager", "startH5Page with url: [", str, "]. ");
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("P2pResponseManager", "startH5Page with url is empty. ");
            return false;
        }
        try {
            Intent intent = new Intent();
            intent.setData(Uri.parse(str));
            intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.setFlags(268435456);
            BaseApplication.b().startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            LogUtil.d("P2pResponseManager", "startH5Page ActivityNotFoundException: ", e.getMessage());
            return false;
        }
    }

    private int e(int i, String str) {
        LogUtil.b("P2pResponseManager", "checkPluginAvailable in. ");
        int[] iArr = {0};
        if (!TextUtils.isEmpty(str) && (i == 1 || i == 2)) {
            StringBuilder sb = new StringBuilder(256);
            sb.append("huaweischeme://healthapp/HuaweiHealth/startComponent?type=");
            sb.append(i == 1 ? "activity" : "service");
            sb.append("&className=");
            sb.append(str);
            sb.append("&onlyPlugin=true");
            iArr[0] = e(sb.toString());
        }
        return iArr[0];
    }

    public static xjb c() {
        return f53095c;
    }

    @Override // com.huawei.unitedevice.hwcommonfilemgr.ParserInterface
    public boolean getResult(DeviceInfo deviceInfo, byte[] bArr) {
        boolean zD = xio.c().d(deviceInfo, bArr);
        LogUtil.b("P2pResponseManager", "isP2pResult: ", Boolean.valueOf(zD));
        if (!zD) {
            return true;
        }
        xiv xivVarC = xio.c().c(bArr);
        if (xivVarC == null || xivVarC.f() == -1) {
            LogUtil.e("P2pResponseManager", "onDataReceived p2p response is invalid");
            return true;
        }
        boolean zD2 = xio.c().d(bArr, xivVarC, this.e);
        LogUtil.b("P2pResponseManager", "isHealthResult: ", Boolean.valueOf(zD2));
        if (!zD2) {
            return true;
        }
        if (bArr[0] == 57 && bArr[1] == 1) {
            LogUtil.b("P2pResponseManager", "getResult sport bt-proxy");
            xivVarC.b("com.huawei.health.btproxy");
            xivVarC.a("BtproxyDistributeNet");
            xivVarC.e("hw.unitedevice.btproxy");
            xivVarC.d("UniteDeviceManagement");
        }
        d(deviceInfo, xivVarC);
        return false;
    }
}
