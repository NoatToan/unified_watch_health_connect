package com.huawei.hwdevice.phoneprocess.mgr.httpproxy;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import defpackage.cpl;
import health.compact.a.utils.StringUtils;

/* JADX INFO: loaded from: classes11.dex */
public class HttpRequestInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceInfo f17465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CloudType f17466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17467c;
    private int d;
    private String e;
    private String f;
    private int g;
    private String h;
    private int i;
    private final boolean j;
    private long l;
    private String n;

    public HttpRequestInfo(boolean z) {
        this.j = z;
    }

    public boolean k() {
        return this.j;
    }

    public DeviceInfo a() {
        return this.f17465a;
    }

    public void b(DeviceInfo deviceInfo) {
        this.f17465a = deviceInfo;
    }

    public long l() {
        return this.l;
    }

    public void e(long j) {
        this.l = j;
    }

    public String i() {
        return this.h;
    }

    public void a(String str) {
        this.h = str;
    }

    public String d() {
        return this.f17467c;
    }

    public void d(String str) {
        this.f17467c = str;
    }

    public String f() {
        return this.n;
    }

    public void b(String str) {
        this.n = str;
    }

    public CloudType c() {
        return this.f17466b;
    }

    public void c(CloudType cloudType) {
        this.f17466b = cloudType;
    }

    public int h() {
        return this.i;
    }

    public void a(int i) {
        this.i = i;
    }

    public int j() {
        return this.g;
    }

    public void b(int i) {
        this.g = i;
    }

    public String g() {
        return this.f;
    }

    public void c(String str) {
        this.f = str;
    }

    public String b() {
        return this.e;
    }

    public void e(String str) {
        this.e = str;
    }

    public int e() {
        return this.d;
    }

    public void c(int i) {
        this.d = i;
    }

    public boolean n() {
        return StringUtils.g(i());
    }

    public enum CloudType {
        COMMON_CLOUD(0),
        HEALTH_CLOUD(1),
        THEME_CLOUD(2);

        private final int value;

        CloudType(int i) {
            this.value = i;
        }

        public static CloudType from(int i) {
            for (CloudType cloudType : values()) {
                if (cloudType.value == i) {
                    return cloudType;
                }
            }
            return null;
        }
    }

    public String toString() {
        return "HttpRequestInfo{deviceId='" + cpl.a(this.f17465a.getDeviceIdentify()) + ", requestId='" + this.l + ", host='" + this.h + ", grsHostKey='" + this.f17467c + ", path='" + this.n + ", cloudType=" + this.f17466b + ", isForeground=" + this.i + ", method='" + this.g + ", headers=" + this.f + ", body=" + this.e + ", contextType=" + this.d + '}';
    }
}
