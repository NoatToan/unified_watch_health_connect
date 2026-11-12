package com.xiaomi.infra.galaxy.fds.android;

import com.xiaomi.infra.galaxy.fds.android.auth.GalaxyFDSCredential;
import com.xiaomi.infra.galaxy.fds.android.util.Args;

/* JADX INFO: loaded from: classes22.dex */
public class FDSClientConfiguration {
    public static final int DEFAULT_CONNECTION_TIMEOUT_MS = 50000;
    public static final int DEFAULT_MAX_RETRY_TIMES = 3;
    public static final int DEFAULT_SOCKET_TIMEOUT_MS = 50000;
    public static final int DEFAULT_THREAD_POOL_CORE_SIZE = 4;
    public static final int DEFAULT_THREAD_POOL_KEEP_ALIVE_SECS = 30;
    public static final int DEFAULT_THREAD_POOL_MAX_SIZE = 10;
    public static final int DEFAULT_UPLOAD_PART_SIZE = 5242880;
    public static final int DEFAULT_WORK_QUEUE_CAPACITY = 10240;
    private static final String s = "http://";
    private static final String t = "https://";
    private static final String u = "cdn";
    private static final String v = "fds.api.xiaomi.com";
    private static final String w = "fds.api.mi-img.com";
    private GalaxyFDSCredential k;
    private String r;
    private int a = 50000;
    private int b = 50000;
    private int c = 0;
    private int d = 0;
    private int e = 3;
    private int f = DEFAULT_UPLOAD_PART_SIZE;
    private int g = 4;
    private int h = 10;
    private int i = 30;
    private int j = 10240;
    private String l = "cnbj0";
    private boolean m = true;
    private boolean n = false;
    private boolean o = true;
    private boolean p = false;
    private String q = "";

    public String a(boolean z) {
        if (this.p) {
            return this.q;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.m ? t : s);
        String str = this.r;
        if (str != null && !str.isEmpty()) {
            sb.append(this.r);
        } else if (z) {
            sb.append("cdn." + this.l + "." + w);
        } else {
            sb.append(this.l + "." + v);
        }
        return sb.toString();
    }

    public void b(boolean z) {
        this.p = z;
    }

    public String c() {
        return a(false);
    }

    public String d() {
        return this.q;
    }

    public String e() {
        return a(true);
    }

    public void enableCdnForDownload(boolean z) {
        this.o = z;
    }

    public void enableCdnForUpload(boolean z) {
        this.n = z;
    }

    public void enableHttps(boolean z) {
        this.m = z;
    }

    public String f() {
        return a(this.o);
    }

    public String g() {
        return a(this.n);
    }

    @Deprecated
    public String getCdnServiceBaseUri() {
        return e();
    }

    public int getConnectionTimeoutMs() {
        return this.b;
    }

    public GalaxyFDSCredential getCredential() {
        return this.k;
    }

    public String getEndpoint() {
        return this.r;
    }

    @Deprecated
    public String getFdsServiceBaseUri() {
        return c();
    }

    public int getMaxRetryTimes() {
        return this.e;
    }

    public String getRegionName() {
        return this.l;
    }

    public int[] getSocketBufferSizeHints() {
        return new int[]{this.c, this.d};
    }

    public int getSocketTimeoutMs() {
        return this.a;
    }

    public int getThreadPoolCoreSize() {
        return this.g;
    }

    public int getThreadPoolKeepAliveSecs() {
        return this.i;
    }

    public int getThreadPoolMaxSize() {
        return this.h;
    }

    public int getUploadPartSize() {
        return this.f;
    }

    public int getWorkQueueCapacity() {
        return this.j;
    }

    public boolean h() {
        return this.p;
    }

    public void i(String str) {
        this.q = str;
    }

    public boolean isCdnEnabledForDownload() {
        return this.o;
    }

    public boolean isCdnEnabledForUpload() {
        return this.n;
    }

    public boolean isHttpsEnabled() {
        return this.m;
    }

    public FDSClientConfiguration j(String str) {
        i(str);
        return this;
    }

    public FDSClientConfiguration k(boolean z) {
        b(z);
        return this;
    }

    @Deprecated
    public void setCdnServiceBaseUri(String str) {
    }

    public void setConnectionTimeoutMs(int i) {
        this.b = i;
    }

    public void setCredential(GalaxyFDSCredential galaxyFDSCredential) {
        Args.notNull(galaxyFDSCredential, "credential");
        this.k = galaxyFDSCredential;
    }

    public void setEndpoint(String str) {
        this.r = str;
    }

    @Deprecated
    public void setFdsServiceBaseUri(String str) {
    }

    public void setMaxRetryTimes(int i) {
        Args.notNegative(i, "max retry times");
        this.e = i;
    }

    public void setRegionName(String str) {
        this.l = str;
    }

    public void setSocketBufferSizeHints(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public void setSocketTimeoutMs(int i) {
        this.a = i;
    }

    public void setThreadPoolCoreSize(int i) {
        this.g = i;
    }

    public void setThreadPoolKeepAliveSecs(int i) {
        this.i = i;
    }

    public void setThreadPoolMaxSize(int i) {
        this.h = i;
    }

    public void setUploadPartSize(int i) {
        Args.check(i >= 5242880, "upload part size");
        this.f = i;
    }

    public void setWorkQueueCapacity(int i) {
        this.j = i;
    }

    public FDSClientConfiguration withCdnForDownload(boolean z) {
        enableCdnForDownload(z);
        return this;
    }

    public FDSClientConfiguration withCdnForUpload(boolean z) {
        enableCdnForUpload(z);
        return this;
    }

    @Deprecated
    public FDSClientConfiguration withCdnServiceBaseUri(String str) {
        return this;
    }

    public FDSClientConfiguration withConnectionTimeoutMs(int i) {
        setConnectionTimeoutMs(i);
        return this;
    }

    public FDSClientConfiguration withCredential(GalaxyFDSCredential galaxyFDSCredential) {
        setCredential(galaxyFDSCredential);
        return this;
    }

    @Deprecated
    public FDSClientConfiguration withFdsServiceBaseUri(String str) {
        return this;
    }

    public FDSClientConfiguration withHttps(boolean z) {
        enableHttps(z);
        return this;
    }

    public FDSClientConfiguration withMaxRetryTimes(int i) {
        setMaxRetryTimes(i);
        return this;
    }

    public FDSClientConfiguration withRegionName(String str) {
        setRegionName(str);
        return this;
    }

    public FDSClientConfiguration withSocketBufferSizeHints(int i, int i2) {
        setSocketBufferSizeHints(i, i2);
        return this;
    }

    public FDSClientConfiguration withSocketTimeoutMs(int i) {
        setSocketTimeoutMs(i);
        return this;
    }

    public FDSClientConfiguration withThreadPoolCoreSize(int i) {
        setThreadPoolCoreSize(i);
        return this;
    }

    public FDSClientConfiguration withThreadPoolKeepAliveSecs(int i) {
        setThreadPoolKeepAliveSecs(i);
        return this;
    }

    public FDSClientConfiguration withThreadPoolMaxSize(int i) {
        setThreadPoolMaxSize(i);
        return this;
    }

    public FDSClientConfiguration withUploadPartSize(int i) {
        setUploadPartSize(i);
        return this;
    }

    public FDSClientConfiguration withWorkQueueCapacity(int i) {
        setWorkQueueCapacity(i);
        return this;
    }
}
