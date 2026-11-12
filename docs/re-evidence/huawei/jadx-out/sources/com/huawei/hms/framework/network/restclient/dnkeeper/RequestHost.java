package com.huawei.hms.framework.network.restclient.dnkeeper;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public final class RequestHost {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f13370c = "Unknown Reason";
    private String d = "UNKNOWN";
    private int e = 0;
    private String f = "ALL";
    private long g;

    public String toString() {
        return this.f13368a + "";
    }

    public void setType(String str) {
        this.f = str;
    }

    public void setTime(long j) {
        this.g = j;
    }

    public void setFailIP(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.d = str;
    }

    public void setDomainName(String str) {
        this.f13368a = str;
    }

    public void setDnsFailType(String str) {
        this.f13370c = str;
    }

    public void setApkName(String str) {
        this.f13369b = str;
    }

    public int hashCode() {
        String str = this.f13368a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String getType() {
        return this.f;
    }

    public long getTime() {
        return this.g;
    }

    public String getFailIP() {
        return this.d;
    }

    public String getDomainName() {
        return this.f13368a;
    }

    public String getDnsFailType() {
        return this.f13370c;
    }

    public String getApkName() {
        return this.f13369b;
    }

    public int getAccelerate() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RequestHost) {
            return this.f13368a.equals(((RequestHost) obj).f13368a);
        }
        return false;
    }

    public void enableAccelerate(boolean z) {
        this.e = z ? 1 : 0;
    }

    public RequestHost(String str) {
        setDomainName(str);
    }
}
