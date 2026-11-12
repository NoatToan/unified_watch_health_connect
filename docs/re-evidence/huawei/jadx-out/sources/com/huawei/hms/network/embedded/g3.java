package com.huawei.hms.network.embedded;

import android.os.SystemClock;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.inner.api.DnsNetworkService;
import com.huawei.hms.network.inner.api.NetworkKitInnerImpl;
import com.huawei.hms.network.inner.api.NetworkService;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public class g3 extends g7 {
    public static final String h = "HttpEventListener";
    public static final AtomicLong i = new AtomicLong(1);
    public static final a j = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l3 f14803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DnsNetworkService f14804c;
    public long d;
    public int e = 0;
    public e3 f;
    public z2 g;

    public void setRCEventListener(z2 z2Var) {
        this.g = z2Var;
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void secureConnectStart(t6 t6Var) {
        super.secureConnectStart(t6Var);
        this.f14803b.getMetricsRealTime().setSecureConnectStartTime();
        this.f14803b.getMetricsTime().setSecureConnectStartTime();
        a("secureConnectStart", this.f14803b.getMetricsRealTime().getSecureConnectStartTime());
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void secureConnectEnd(t6 t6Var, @Nullable i7 i7Var) {
        super.secureConnectEnd(t6Var, i7Var);
        this.f14803b.getMetricsRealTime().setSecureConnectEndTime();
        this.f14803b.getMetricsTime().setSecureConnectEndTime();
        a("secureConnectEnd", this.f14803b.getMetricsRealTime().getSecureConnectEndTime());
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void responseHeadersStart(t6 t6Var) {
        super.responseHeadersStart(t6Var);
        this.f14803b.getMetricsRealTime().setResponseHeadersStartTime();
        this.f14803b.getMetricsTime().setResponseHeadersStartTime();
        this.f14803b.getMetricsRealTime().setTtfb(this.f14803b.getMetricsRealTime().getResponseHeadersStartTime());
        this.f14803b.getMetricsTime().setTtfb(this.f14803b.getMetricsTime().getResponseHeadersStartTime());
        a("responseHeadersStart", this.f14803b.getMetricsRealTime().getResponseHeadersStartTime());
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void responseHeadersEnd(t6 t6Var, v7 v7Var) {
        super.responseHeadersEnd(t6Var, v7Var);
        this.f14803b.getMetricsRealTime().setResponseHeadersEndTime();
        this.f14803b.getMetricsTime().setResponseHeadersEndTime();
        this.f14803b.getMetricsRealTime().setTtfbV1(this.f14803b.getMetricsRealTime().getResponseHeadersEndTime());
        this.f14803b.getMetricsTime().setTtfbV1(this.f14803b.getMetricsTime().getResponseHeadersEndTime());
        a(v7Var);
        a("responseHeadersEnd", this.f14803b.getMetricsRealTime().getResponseHeadersEndTime());
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void responseFailed(t6 t6Var, IOException iOException) {
        super.responseFailed(t6Var, iOException);
        this.f14803b.getMetricsRealTime().setResponseBodyEndTime();
        this.f14803b.getMetricsTime().setResponseBodyEndTime();
        a("responseFailed", this.f14803b.getMetricsRealTime().getResponseBodyEndTime());
        z2 z2Var = this.g;
        if (z2Var != null) {
            z2Var.responseFailed();
        }
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void responseBodyStart(t6 t6Var) {
        super.responseBodyStart(t6Var);
        this.f14803b.getMetricsRealTime().setResponseBodyStartTime();
        this.f14803b.getMetricsTime().setResponseBodyStartTime();
        a("responseBodyStart", this.f14803b.getMetricsRealTime().getResponseBodyStartTime());
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void responseBodyEnd(t6 t6Var, long j2) {
        super.responseBodyEnd(t6Var, j2);
        this.f14803b.getMetricsRealTime().setResponseBodyEndTime();
        this.f14803b.getMetricsTime().setResponseBodyEndTime();
        a("responseBodyEnd", this.f14803b.getMetricsRealTime().getResponseBodyEndTime());
        z2 z2Var = this.g;
        if (z2Var != null) {
            z2Var.responseBodyEnd();
        }
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void requestHeadersStart(t6 t6Var) {
        super.requestHeadersStart(t6Var);
        this.f14803b.getMetricsRealTime().setRequestHeadersStartTime();
        this.f14803b.getMetricsTime().setRequestHeadersStartTime();
        a("requestHeadersStart", this.f14803b.getMetricsRealTime().getRequestHeadersStartTime());
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void requestHeadersEnd(t6 t6Var, t7 t7Var) {
        super.requestHeadersEnd(t6Var, t7Var);
        this.f14803b.getMetricsRealTime().setRequestHeadersEndTime();
        this.f14803b.getMetricsTime().setRequestHeadersEndTime();
        a("requestHeadersEnd", this.f14803b.getMetricsRealTime().getRequestHeadersEndTime());
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void requestBodyStart(t6 t6Var) {
        super.requestBodyStart(t6Var);
        this.f14803b.getMetricsRealTime().setRequestBodyStartTime();
        this.f14803b.getMetricsTime().setRequestBodyStartTime();
        a("requestBodyStart", this.f14803b.getMetricsRealTime().getRequestBodyStartTime());
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void requestBodyEnd(t6 t6Var, long j2) {
        super.requestBodyEnd(t6Var, j2);
        this.f14803b.getMetrics().setRequestByteCount(j2);
        this.f14803b.getMetricsRealTime().setRequestBodyEndTime();
        this.f14803b.getMetricsTime().setRequestBodyEndTime();
        a("requestBodyEnd", this.f14803b.getMetricsRealTime().getRequestBodyEndTime());
    }

    public RequestFinishedInfo getRequestFinishedInfo() {
        return this.f14803b;
    }

    public e3 getConnectionInfo() {
        return this.f;
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void dnsStart(t6 t6Var, String str) {
        super.dnsStart(t6Var, str);
        this.f14803b.getMetricsRealTime().setDnsStartTime();
        this.f14803b.getMetricsTime().setDnsStartTime();
        a("dnsStart", this.f14803b.getMetricsRealTime().getDnsStartTime());
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void dnsEnd(t6 t6Var, String str, List<InetAddress> list) {
        super.dnsEnd(t6Var, str, list);
        this.f14803b.getMetricsRealTime().setDnsEndTime();
        this.f14803b.getMetricsTime().setDnsEndTime();
        this.f14803b.getMetrics().setDnsCache(this.f14804c.getDnsCache());
        this.f14803b.getMetrics().setDnsType(this.f14804c.getDnsType());
        this.f14803b.getMetrics().setDnsTtl(this.f14804c.getDnsTtl());
        this.f14803b.getMetrics().setDnsStatus(this.f14804c.getDnsStatus());
        a("dnsEnd", this.f14803b.getMetricsRealTime().getDnsEndTime());
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void connectionReleased(t6 t6Var, y6 y6Var) {
        super.connectionReleased(t6Var, y6Var);
        this.f14803b.getMetricsRealTime().setConnectionReleasedTime();
        this.f14803b.getMetricsTime().setConnectionReleasedTime();
        a("connectionReleased", this.f14803b.getMetricsRealTime().getConnectionReleasedTime());
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void connectionAcquired(t6 t6Var, y6 y6Var) {
        String strA;
        String strA2;
        super.connectionAcquired(t6Var, y6Var);
        y8 y8Var = (y8) y6Var;
        this.f14803b.getMetricsRealTime().setConnectionAcquiredTime();
        this.f14803b.getMetricsTime().setConnectionAcquiredTime();
        a("connectionAcquired, connection id = " + y6Var.hashCode(), this.f14803b.getMetricsRealTime().getConnectionAcquiredTime());
        if (y8Var == null) {
            return;
        }
        this.f = new e3(this.f14803b.getHost(), y8Var);
        x7 x7VarB = y8Var.b();
        r7 r7VarD = y8Var.d();
        if (y8Var.a() != null) {
            strA = y8Var.a().f().a();
            strA2 = y8Var.a().a().a();
        } else {
            strA = null;
            strA2 = null;
        }
        if (strA != null) {
            this.f14803b.getMetrics().setTlsVersion(strA);
        }
        if (strA2 != null) {
            this.f14803b.getMetrics().setCipherSuite(strA2);
        }
        if (r7VarD != null) {
            this.f14803b.getMetrics().setProtocol(r7VarD.toString());
        }
        a(x7VarB.d(), true);
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void connectStart(t6 t6Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(t6Var, inetSocketAddress, proxy);
        u2 metrics = this.f14803b.getMetrics();
        int i2 = this.e;
        this.e = i2 + 1;
        metrics.setConnectRetryTime(i2);
        a(inetSocketAddress, false);
        if (this.f14803b.getMetricsRealTime().getConnectStartTime() == 0) {
            this.f14803b.getMetricsRealTime().setConnectStartTime();
            this.f14803b.getMetricsTime().setConnectStartTime();
        }
        a("connectStart", this.f14803b.getMetricsRealTime().getConnectStartTime());
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void connectFailed(t6 t6Var, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable r7 r7Var, IOException iOException) {
        super.connectFailed(t6Var, inetSocketAddress, proxy, r7Var, iOException);
        if (r7Var != null) {
            this.f14803b.getMetrics().setProtocol(r7Var.toString());
        }
        this.f14803b.getMetricsRealTime().setConnectEndTime();
        this.f14803b.getMetricsTime().setConnectEndTime();
        a("connectFailed", this.f14803b.getMetricsRealTime().getConnectEndTime());
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void connectEnd(t6 t6Var, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable r7 r7Var) {
        super.connectEnd(t6Var, inetSocketAddress, proxy, r7Var);
        if (r7Var != null) {
            this.f14803b.getMetrics().setProtocol(r7Var.toString());
        }
        a(inetSocketAddress, true);
        this.f14803b.getMetricsRealTime().setConnectEndTime();
        this.f14803b.getMetricsTime().setConnectEndTime();
        a("connectEnd", this.f14803b.getMetricsRealTime().getConnectEndTime());
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void callStart(t6 t6Var) {
        super.callStart(t6Var);
        this.f14803b.getMetricsRealTime().setCallStartTime();
        this.f14803b.getMetricsTime().setCallStartTime();
        this.f14803b.setUrl(t6Var.request().k().toString());
        this.d = SystemClock.elapsedRealtime();
        a("callStart", this.f14803b.getMetricsRealTime().getCallStartTime());
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void callFailed(t6 t6Var, IOException iOException) {
        super.callFailed(t6Var, iOException);
        this.f14803b.setException(iOException);
        this.f14803b.getMetricsRealTime().setCallEndTime();
        this.f14803b.getMetricsTime().setCallEndTime();
        this.f14803b.getMetrics().setDnsType(this.f14804c.getDnsType());
        this.f14803b.getMetrics().setDnsCache(this.f14804c.getDnsCache());
        a("callFailed", this.f14803b.getMetricsRealTime().getCallEndTime());
    }

    @Override // com.huawei.hms.network.embedded.g7
    public void callEnd(t6 t6Var) {
        super.callEnd(t6Var);
        this.f14803b.getMetricsRealTime().setCallEndTime();
        this.f14803b.getMetricsTime().setCallEndTime();
        a("callEnd", this.f14803b.getMetricsRealTime().getCallEndTime());
    }

    public static a getFactory() {
        return j;
    }

    public static class a implements g7.b {
        public WeakHashMap<t6, WeakReference<g3>> events = new WeakHashMap<>();
        public final Object lock = new Object();

        public g3 getListener(t6 t6Var) {
            WeakReference<g3> weakReference;
            synchronized (this.lock) {
                weakReference = this.events.get(t6Var);
            }
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // com.huawei.hms.network.embedded.g7.b
        public g3 create(t6 t6Var) {
            g3 g3Var = new g3();
            synchronized (this.lock) {
                this.events.put(t6Var, new WeakReference<>(g3Var));
            }
            return g3Var;
        }
    }

    private void a(InetSocketAddress inetSocketAddress, boolean z) {
        InetAddress address;
        if (inetSocketAddress == null || (address = inetSocketAddress.getAddress()) == null) {
            return;
        }
        if (z) {
            this.f14803b.getMetrics().setSuccessIp(address.getHostAddress());
        } else {
            this.f14803b.getMetrics().addConnectIps(address.getHostAddress());
        }
    }

    private void a(String str, long j2) {
        Logger.v(h, "callId = %d / %s : ElapsedTime = %d", Long.valueOf(this.f14802a), str, Long.valueOf(j2 - this.d));
    }

    private void a(v7 v7Var) {
        String strB = v7Var.b(j2.w);
        Logger.v(h, "content-length : " + strB);
        this.f14803b.getMetrics().setResponseByteCount(StringUtils.stringToLong(strB, -1L));
    }

    public g3() {
        NetworkService service = NetworkKitInnerImpl.getInstance().getService("dns");
        if (!(service instanceof DnsNetworkService)) {
            throw new IllegalStateException("DNS service not available");
        }
        this.f14804c = (DnsNetworkService) service;
        this.f14802a = i.getAndIncrement();
        this.f14803b = new l3();
    }
}
