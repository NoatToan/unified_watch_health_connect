package com.xiaomi.infra.galaxy.fds.android.model;

import com.alipay.sdk.m.s.a;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes22.dex */
public class PutObjectResult {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private long g;

    public String getAbsolutePresignedUri() {
        return this.e + getRelativePresignedUri();
    }

    public String getAccessKeyId() {
        return this.c;
    }

    public String getBucketName() {
        return this.a;
    }

    public String getCdnPresignedUri() {
        return this.f + getRelativePresignedUri();
    }

    public long getExpires() {
        return this.g;
    }

    public String getObjectName() {
        return this.b;
    }

    public String getRelativePresignedUri() {
        return FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.a + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.b + "?GalaxyAccessKeyId" + SearchCriteria.EQ + this.c + a.l + "Expires" + SearchCriteria.EQ + this.g + a.l + "Signature" + SearchCriteria.EQ + this.d;
    }

    public String getSignature() {
        return this.d;
    }

    public void setAccessKeyId(String str) {
        this.c = str;
    }

    public void setBucketName(String str) {
        this.a = str;
    }

    public void setCdnServiceBaseUri(String str) {
        this.f = str;
    }

    public void setExpires(long j) {
        this.g = j;
    }

    public void setFdsServiceBaseUri(String str) {
        this.e = str;
    }

    public void setObjectName(String str) {
        this.b = str;
    }

    public void setSignature(String str) {
        this.d = str;
    }
}
