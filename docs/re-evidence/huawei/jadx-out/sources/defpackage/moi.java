package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.framework.network.restclient.Headers;
import com.huawei.hwdevice.phoneprocess.mgr.httpproxy.ErrorCode;
import com.huawei.hwdevice.phoneprocess.mgr.httpproxy.HttpProxyInterface;
import com.huawei.hwdevice.phoneprocess.mgr.httpproxy.HttpRequestInfo;
import com.huawei.hwdevice.phoneprocess.mgr.httpproxy.factory.HttpProxyParamsFactory;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CloudUtils;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import health.compact.a.utils.StringUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class moi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExtendHandler f42067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DataReceiveCallback f42069c;
    private final HttpProxyInterface d;
    private final HttpProxyInterface e;
    private int f;
    private final Object g;
    private final Map<ResultCallback<byte[]>, Object> h;
    private LinkedList<Long> i;
    private final nfk j;

    private boolean c(int i) {
        return 200 <= i && i < 300;
    }

    /* synthetic */ void a(int i, final DeviceInfo deviceInfo, eec eecVar) {
        if (deviceInfo == null || StringUtils.g(deviceInfo.getDeviceIdentify())) {
            LogUtil.j("HttpProxyManager", "deviceInfo or deviceIdentify is null");
            return;
        }
        if (eecVar == null) {
            LogUtil.j("HttpProxyManager", "message is null");
            return;
        }
        if (eecVar instanceof eee) {
            final eee eeeVar = (eee) eecVar;
            if (e(eeeVar)) {
                this.f42068b = "hw.wearable.httpProxy";
                if ("hw.wearable.httpProxyAp".equals(eeeVar.getWearPkgName()) || "hw.wearable.httpProxyAp".equals(eeeVar.getSrcPkgName())) {
                    this.f42068b = "hw.wearable.httpProxyAp";
                }
                LogUtil.a("HttpProxyManager", "start parseReceiveData:", this.f42068b);
                this.f42067a.postTask(new Runnable() { // from class: mop
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f42088c.a(deviceInfo, eeeVar);
                    }
                });
            }
        }
    }

    /* synthetic */ void a(DeviceInfo deviceInfo, eee eeeVar) {
        c(deviceInfo, eeeVar.c());
    }

    private moi() {
        this.g = new Object();
        this.e = new moj();
        this.d = new mom();
        this.h = new ConcurrentHashMap();
        this.i = new LinkedList<>();
        this.f = 0;
        this.f42069c = new DataReceiveCallback() { // from class: mon
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public final void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
                this.f42084c.a(i, deviceInfo, eecVar);
            }
        };
        this.j = new nfk(1L, 60L, 60L);
        this.f42067a = HandlerCenter.e("HttpProxyManager");
    }

    public static moi c() {
        return b.e;
    }

    public void e(DeviceInfo deviceInfo) {
        LogUtil.a("HttpProxyManager", "onDeviceConnected deviceInfo relationship is ", deviceInfo.getRelationship());
        if ("main_relationship".equals(deviceInfo.getRelationship())) {
            i();
        }
    }

    public void c(DeviceInfo deviceInfo) {
        LogUtil.a("HttpProxyManager", "onDeviceDisConnected deviceInfo relationship is ", deviceInfo.getRelationship());
        if ("main_relationship".equals(deviceInfo.getRelationship())) {
            g();
        }
    }

    private void i() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.httpProxy", this.f42069c);
    }

    private void g() {
        edc.e().unRegisterDeviceSampleListener("hw.unitedevice.httpProxy");
    }

    private boolean e(eee eeeVar) {
        if (eeeVar.getCommandId() != 2) {
            LogUtil.j("HttpProxyManager", "command not match.");
            return false;
        }
        if (eeeVar.d() != 800100011) {
            LogUtil.j("HttpProxyManager", "eventId not match.");
            return false;
        }
        byte[] bArrC = eeeVar.c();
        if (bArrC != null && bArrC.length != 0) {
            return true;
        }
        LogUtil.j("HttpProxyManager", "sampleEvent data is empty.");
        return false;
    }

    private void c(DeviceInfo deviceInfo, byte[] bArr) {
        LogUtil.a("HttpProxyManager", "enter parseReceiveData.");
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HttpProxyManager");
        if (deviceList != null && deviceList.size() > 0) {
            deviceInfo = deviceList.get(0);
        }
        try {
            cql.c cVarA = new cql().a(bArr, 0);
            HttpRequestInfo httpRequestInfo = new HttpRequestInfo(cVarA.d((byte) 11, 0) == 1);
            httpRequestInfo.b(deviceInfo);
            httpRequestInfo.e(cVarA.d((byte) 1, -1L));
            httpRequestInfo.b(cVarA.e((byte) 2, ""));
            httpRequestInfo.a(cVarA.e((byte) 3, ""));
            httpRequestInfo.d(cVarA.e((byte) 4, ""));
            httpRequestInfo.b(cVarA.d((byte) 5, -1));
            httpRequestInfo.c(cVarA.e((byte) 6, ""));
            httpRequestInfo.e(cVarA.e((byte) 7, ""));
            httpRequestInfo.c(HttpRequestInfo.CloudType.from(cVarA.d((byte) 8, -1)));
            httpRequestInfo.a(cVarA.d((byte) 9, -1));
            httpRequestInfo.c(cVarA.d((byte) 10, 0));
            ReleaseLogUtil.c("R_HttpProxyManager", "Receive httpProxy request from device, requestId:", Long.valueOf(httpRequestInfo.l()), ", request method is: ", Integer.valueOf(httpRequestInfo.j()));
            StringBuilder sb = new StringBuilder("timestamp: ");
            sb.append(System.currentTimeMillis());
            sb.append(", isForeground: ");
            sb.append(httpRequestInfo.h() == 1);
            sb.append(", Platform: Android");
            xjt.y(sb.toString());
            LogUtil.a("HttpProxyManager", "SampleEvent send by device: ", httpRequestInfo.toString());
            StringBuilder sb2 = new StringBuilder("BI info: timestamp: ");
            sb2.append(System.currentTimeMillis());
            sb2.append(", isForeground: ");
            sb2.append(httpRequestInfo.h() == 1);
            sb2.append(", Platform: Android");
            LogUtil.a("HttpProxyManager", sb2.toString());
            b(httpRequestInfo, deviceInfo);
        } catch (cpy unused) {
            ReleaseLogUtil.c("DEVMGR_HttpProxyManager", "Unable to resolve Tlv data");
        }
    }

    private void b(final HttpRequestInfo httpRequestInfo, final DeviceInfo deviceInfo) {
        int iA = a(httpRequestInfo);
        if (iA != ErrorCode.ERROR_SUCCESS.getCode()) {
            LogUtil.j("HttpProxyManager", "invalid parameters in dispatchRequest.");
            a(httpRequestInfo.a(), e(httpRequestInfo.l(), iA, 0));
            return;
        }
        final String url = new mou(httpRequestInfo.i(), httpRequestInfo.d(), httpRequestInfo.f()).getUrl();
        if (TextUtils.isEmpty(url)) {
            LogUtil.j("HttpProxyManager", "url is empty in dispatchRequest.");
            a(httpRequestInfo.a(), e(httpRequestInfo.l(), ErrorCode.ERROR_GET_GRS_FAILED.getCode(), 0));
        } else if (httpRequestInfo.e() == 1) {
            mok.e(httpRequestInfo.b(), deviceInfo, new com.huawei.hwdevice.phoneprocess.mgr.httpproxy.ResultCallback() { // from class: moo
                @Override // com.huawei.hwdevice.phoneprocess.mgr.httpproxy.ResultCallback
                public final void onResult(String str) {
                    this.f42086c.b(deviceInfo, httpRequestInfo, url, str);
                }
            }, this.f42068b);
        } else {
            b(httpRequestInfo, url, deviceInfo, httpRequestInfo.b());
        }
    }

    /* synthetic */ void b(DeviceInfo deviceInfo, HttpRequestInfo httpRequestInfo, String str, String str2) {
        if (!StringUtils.g(str2) && str2.equals("file transfer failed")) {
            LogUtil.e("HttpProxyManager", "Failed to obtain body file from device");
            a(deviceInfo, e(httpRequestInfo.l(), ErrorCode.FILE_TRANSFER_FAILED.getCode(), 0));
        } else {
            b(httpRequestInfo, str, deviceInfo, str2);
        }
    }

    private void b(HttpRequestInfo httpRequestInfo, String str, DeviceInfo deviceInfo, String str2) {
        HttpProxyParamsFactory httpProxyParamsFactoryB = mpa.b(httpRequestInfo.c());
        if (httpProxyParamsFactoryB == null) {
            LogUtil.j("HttpProxyManager", "paramsFactory is null in dispatchRequest.");
            a(httpRequestInfo.a(), e(httpRequestInfo.l(), ErrorCode.ERROR_INNER.getCode(), 0));
            return;
        }
        Map<String, String> headers = httpProxyParamsFactoryB.getHeaders(httpRequestInfo.g());
        Map<String, String> commonBody = httpProxyParamsFactoryB.getCommonBody(deviceInfo);
        int iJ = httpRequestInfo.j();
        if (iJ != 1 && iJ != 3) {
            str2 = "";
        } else if (httpRequestInfo.c() != HttpRequestInfo.CloudType.COMMON_CLOUD) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                for (String str3 : commonBody.keySet()) {
                    jSONObject.put(str3, commonBody.get(str3));
                }
                str2 = jSONObject.toString();
            } catch (JSONException unused) {
                ReleaseLogUtil.d("HttpProxyManager", "JSONException occurs when creating http body");
                a(httpRequestInfo.a(), e(httpRequestInfo.l(), ErrorCode.ERROR_INNER.getCode(), 0));
                return;
            }
        }
        e();
        if (iJ == 1) {
            b(httpRequestInfo, str, headers, str2);
            return;
        }
        if (iJ == 2) {
            b(httpRequestInfo, str, headers, commonBody);
            return;
        }
        if (iJ == 3) {
            d(httpRequestInfo, str, headers, str2);
        } else if (iJ != 4) {
            LogUtil.j("HttpProxyManager", "dispatchRequest method type: ", Integer.valueOf(iJ));
        } else {
            e(httpRequestInfo, str, headers);
        }
    }

    private int a(HttpRequestInfo httpRequestInfo) {
        if (!c(httpRequestInfo)) {
            return ErrorCode.ERROR_PARAMETER.getCode();
        }
        if (!d()) {
            LogUtil.j("HttpProxyManager", "user is no login in preCheck.");
            return ErrorCode.ERROR_USER_NO_LOGIN.getCode();
        }
        if (httpRequestInfo.n() && Utils.k()) {
            LogUtil.j("HttpProxyManager", "dispatchRequest isOverseaNoCloudVersion.");
            return ErrorCode.ERROR_NO_CLOUD_NOT_SUPPORT.getCode();
        }
        if (j()) {
            LogUtil.j("HttpProxyManager", "too many request.");
            return ErrorCode.ERROR_TOO_MANY_REQUEST.getCode();
        }
        if (a()) {
            LogUtil.j("HttpProxyManager", "channel busy");
            return ErrorCode.ERROR_CHANNEL_BUSY.getCode();
        }
        return ErrorCode.ERROR_SUCCESS.getCode();
    }

    private boolean j() {
        nfk nfkVar = this.j;
        LogUtil.a("HttpProxyManager", "Current token count: ", Long.valueOf(nfkVar.d()), ",lastRefill:", Long.valueOf(nfkVar.b()));
        boolean zC = nfkVar.c();
        if (zC) {
            LogUtil.a("HttpProxyManager", "HttpProxy queue add succeed! Current queue token count:", Long.valueOf(nfkVar.d()));
        }
        return !zC;
    }

    private boolean a() {
        return this.f >= 64;
    }

    private boolean d() {
        boolean isLogined;
        boolean zA = CloudUtils.a();
        health.compact.a.LogUtil.b("HttpProxyManager", "isReconnectionDevice isAllowLogin ", Boolean.valueOf(zA));
        if (!zA) {
            return true;
        }
        if (CommonUtil.z(BaseApplication.b())) {
            String logoutFlag = ThirdLoginDataStorageUtil.getLogoutFlag();
            health.compact.a.LogUtil.b("HttpProxyManager", "isReconnectionDevice logoutFlag ", logoutFlag);
            isLogined = "false".equals(logoutFlag);
        } else {
            isLogined = LoginInit.getInstance(BaseApplication.b()).getIsLogined();
        }
        ReleaseLogUtil.c("DEVMGR_HttpProxyManager", "isReconnectionDevice isLogin ", Boolean.valueOf(isLogined));
        return isLogined;
    }

    private boolean c(HttpRequestInfo httpRequestInfo) {
        if (httpRequestInfo.l() == -1) {
            LogUtil.j("HttpProxyManager", "checkRequestIsValid requestId is empty.");
            return false;
        }
        if (StringUtils.g(httpRequestInfo.f())) {
            LogUtil.j("HttpProxyManager", "checkRequestIsValid path is empty.");
            return false;
        }
        if (StringUtils.g(httpRequestInfo.d()) && StringUtils.g(httpRequestInfo.i())) {
            LogUtil.j("HttpProxyManager", "checkRequestIsValid host and grsHostKey is empty.");
            return false;
        }
        if (httpRequestInfo.j() == -1) {
            LogUtil.j("HttpProxyManager", "checkRequestIsValid method is empty.");
            return false;
        }
        if (httpRequestInfo.h() != 1 && httpRequestInfo.h() != 0) {
            LogUtil.j("HttpProxyManager", "checkRequestIsValid isForeground is ", Integer.valueOf(httpRequestInfo.h()));
            return false;
        }
        if (httpRequestInfo.c() != null) {
            return true;
        }
        LogUtil.j("HttpProxyManager", "checkRequestIsValid cloudType is null.");
        return false;
    }

    private HttpProxyInterface c(boolean z) {
        if (z) {
            return this.d;
        }
        return this.e;
    }

    private void b(final HttpRequestInfo httpRequestInfo, String str, Map<String, String> map, String str2) {
        ReleaseLogUtil.b("R_HttpProxyManager", "app httpProxy send post request, requestId: ", Long.valueOf(httpRequestInfo.l()));
        c(httpRequestInfo.k()).post(str, map, str2, new ResultCallback<oeq>() { // from class: moi.1
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(oeq oeqVar) {
                moi.this.d(httpRequestInfo, oeqVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                moi.this.d(httpRequestInfo, th);
            }
        });
    }

    private void b(final HttpRequestInfo httpRequestInfo, String str, Map<String, String> map, Map<String, String> map2) {
        ReleaseLogUtil.b("R_HttpProxyManager", "app httpProxy send get request, requestId: ", Long.valueOf(httpRequestInfo.l()));
        c(httpRequestInfo.k()).get(str, map, map2, new ResultCallback<oeq>() { // from class: moi.4
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(oeq oeqVar) {
                moi.this.d(httpRequestInfo, oeqVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                moi.this.d(httpRequestInfo, th);
            }
        });
    }

    private void d(final HttpRequestInfo httpRequestInfo, String str, Map<String, String> map, String str2) {
        ReleaseLogUtil.b("R_HttpProxyManager", "app httpProxy send put request, requestId: ", Long.valueOf(httpRequestInfo.l()));
        c(httpRequestInfo.k()).put(str, map, str2, new ResultCallback<oeq>() { // from class: moi.2
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(oeq oeqVar) {
                moi.this.d(httpRequestInfo, oeqVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                moi.this.d(httpRequestInfo, th);
            }
        });
    }

    private void e(final HttpRequestInfo httpRequestInfo, String str, Map<String, String> map) {
        ReleaseLogUtil.b("R_HttpProxyManager", "app httpProxy send delete request, requestId: ", Long.valueOf(httpRequestInfo.l()));
        c(httpRequestInfo.k()).delete(str, map, new ResultCallback<oeq>() { // from class: moi.3
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(oeq oeqVar) {
                moi.this.d(httpRequestInfo, oeqVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                moi.this.d(httpRequestInfo, th);
            }
        });
    }

    private byte[] e(long j, int i, int i2) {
        cqj cqjVar = new cqj();
        cqjVar.e(1, j).b(2, i).i(3, i2).e(4, "".getBytes()).b(5, 0);
        return cqjVar.e();
    }

    private byte[] a(long j, int i, String str, String str2, int i2, int i3) {
        cqj cqjVar = new cqj();
        cqjVar.e(1, j).b(2, i).i(3, i3).b(4, str).b(5, i2).b(6, str2);
        return cqjVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final HttpRequestInfo httpRequestInfo, final oeq oeqVar) {
        if (httpRequestInfo == null) {
            LogUtil.e("HttpProxyManager", "requestInfo is null in handleRequestSuccess.");
            return;
        }
        if (oeqVar == null) {
            LogUtil.e("HttpProxyManager", "response is null in handleRequestSuccess.");
            return;
        }
        byte[] bArrA = oeqVar.a();
        if (bArrA == null) {
            LogUtil.e("HttpProxyManager", "body is null in handleRequestSuccess.");
            bArrA = new byte[0];
        }
        ReleaseLogUtil.b("R_HttpProxyManager", "app httpProxy request succeed, request method: ", Integer.valueOf(httpRequestInfo.j()), " requestId: ", Long.valueOf(httpRequestInfo.l()));
        final int iB = oeqVar.b() == 0 ? 200 : oeqVar.b();
        int i = bArrA.length > 3072 ? 1 : 0;
        if (i == 1) {
            ReleaseLogUtil.c("DEVMGR_HttpProxyManager", "handleRequestSuccess request file transfer");
            mok.e(httpRequestInfo.l(), bArrA, new com.huawei.hwdevice.phoneprocess.mgr.httpproxy.ResultCallback() { // from class: moq
                @Override // com.huawei.hwdevice.phoneprocess.mgr.httpproxy.ResultCallback
                public final void onResult(String str) {
                    this.f42090b.e(httpRequestInfo, oeqVar, iB, str);
                }
            });
        } else {
            ReleaseLogUtil.c("DEVMGR_HttpProxyManager", "handleRequestSuccess data stream");
            a(httpRequestInfo.a(), new d(httpRequestInfo.l()).e(ErrorCode.ERROR_SUCCESS.getCode()).b(iB).c(oeqVar.a()).d(i).a(oeqVar.e()).d());
        }
    }

    /* synthetic */ void e(HttpRequestInfo httpRequestInfo, oeq oeqVar, int i, String str) {
        if (!StringUtils.g(str) && str.equals("create cloud response file failed")) {
            LogUtil.e("HttpProxyManager", "Failed to write cloud response file");
            a(httpRequestInfo.a(), e(httpRequestInfo.l(), ErrorCode.APP_CREATE_FILE_FAILED.getCode(), 0));
        } else {
            a(httpRequestInfo.a(), a(httpRequestInfo.l(), ErrorCode.ERROR_SUCCESS.getCode(), str, oeqVar.e(), 1, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final HttpRequestInfo httpRequestInfo, Throwable th) {
        if (httpRequestInfo == null) {
            LogUtil.e("HttpProxyManager", "requestInfo is null in handleRequestFailure.");
            return;
        }
        if (th == null) {
            LogUtil.e("HttpProxyManager", "throwable is null in handleRequestFailure.");
            return;
        }
        final oeq oeqVarA = a(th);
        if (!c(oeqVarA.b())) {
            LogUtil.j("HttpProxyManager", "throwable is", ExceptionUtils.c(th));
            final int i = oeqVarA.a().length > 3072 ? 1 : 0;
            ReleaseLogUtil.c("DEVMGR_HttpProxyManager", "handleRequestFailure requestId:", Long.valueOf(httpRequestInfo.l()), " code:", Integer.valueOf(oeqVarA.b()));
            final d dVar = new d(httpRequestInfo.l());
            if (i == 1) {
                ReleaseLogUtil.c("DEVMGR_HttpProxyManager", "handleRequestFailure request file transfer");
                mok.e(httpRequestInfo.l(), oeqVarA.a(), new com.huawei.hwdevice.phoneprocess.mgr.httpproxy.ResultCallback() { // from class: moh
                    @Override // com.huawei.hwdevice.phoneprocess.mgr.httpproxy.ResultCallback
                    public final void onResult(String str) {
                        this.f42064a.b(dVar, oeqVarA, httpRequestInfo, i, str);
                    }
                });
                return;
            } else {
                ReleaseLogUtil.c("DEVMGR_HttpProxyManager", "handleRequestFailure data stream");
                a(httpRequestInfo.a(), dVar.e(ErrorCode.ERROR_NETWORK_REQUEST_FAILED.getCode()).b(oeqVarA.b()).c(oeqVarA.a()).d(i).a(oeqVarA.e()).d());
                return;
            }
        }
        d(httpRequestInfo, oeqVarA);
    }

    /* synthetic */ void b(d dVar, oeq oeqVar, HttpRequestInfo httpRequestInfo, int i, String str) {
        if (!StringUtils.g(str) && str.equals("create cloud response file failed")) {
            ReleaseLogUtil.d("DEVMGR_HttpProxyManager", "handleRequestFailure Failed to write cloud response file");
            a(httpRequestInfo.a(), dVar.e(ErrorCode.APP_CREATE_FILE_FAILED.getCode()).b(0).a(oeqVar.e()).d());
        } else {
            a(httpRequestInfo.a(), dVar.e(ErrorCode.ERROR_NETWORK_REQUEST_FAILED.getCode()).b(oeqVar.b()).c(str.getBytes()).d(i).a(oeqVar.e()).d());
        }
    }

    private oeq a(Throwable th) {
        int i = 0;
        byte[] bArrA = new byte[0];
        byte[] bArrBytes = new byte[0];
        Map<String, List<String>> map = new HashMap<>();
        if (th instanceof oeu) {
            oeu oeuVar = (oeu) th;
            int iE = oeuVar.e();
            if (c(iE)) {
                if (oeuVar.b() != null) {
                    try {
                        bArrBytes = ((oeu) th).b().bytes();
                    } catch (IOException e) {
                        LogUtil.e("HttpProxyManager", "convert ApiResponse err: " + e.getMessage());
                    }
                    Headers headersC = oeuVar.c();
                    if (headersC != null) {
                        map = headersC.toMultimap();
                    }
                    return new oeq(map, bArrBytes, iE);
                }
            } else {
                if (oeuVar.a() != null) {
                    bArrA = oeuVar.a();
                }
                Headers headersC2 = oeuVar.c();
                if (headersC2 != null) {
                    map = headersC2.toMultimap();
                }
            }
            i = iE;
        }
        return new oeq(map, bArrA, i);
    }

    private void b() {
        this.f--;
    }

    private void e() {
        this.f++;
    }

    private void a(DeviceInfo deviceInfo, byte[] bArr) {
        b();
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.unitedevice.httpProxy");
        eeeVar.setWearPkgName(this.f42068b);
        eeeVar.a(800100012L);
        eeeVar.setCommandId(2);
        eeeVar.a(0);
        eeeVar.e(bArr);
        edc.e().sendSampleEventCommand(deviceInfo, eeeVar, "HttpProxyManager");
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f42076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f42077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f42078c;
        private final long d;
        private int e;
        private byte[] i;

        public d(long j) {
            this.d = j;
        }

        public d e(int i) {
            this.e = i;
            return this;
        }

        public d b(int i) {
            this.f42077b = i;
            return this;
        }

        public d c(byte[] bArr) {
            this.i = bArr;
            return this;
        }

        public d d(int i) {
            this.f42076a = i;
            return this;
        }

        public d a(String str) {
            this.f42078c = str;
            return this;
        }

        public byte[] d() {
            cqj cqjVar = new cqj();
            cqjVar.e(1, this.d).b(2, this.e).i(3, this.f42077b).e(4, this.i).b(5, this.f42076a).b(6, this.f42078c);
            return cqjVar.e();
        }
    }

    static class b {
        private static final moi e = new moi();
    }
}
