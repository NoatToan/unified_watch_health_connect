package com.xiaomi.infra.galaxy.fds.result;

import com.alipay.sdk.m.s.a;
import com.xiaomi.infra.galaxy.fds.Common;
import com.xiaomi.infra.galaxy.fds.model.SSEResultBase;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.net.URI;
import java.net.URISyntaxException;
import javax.xml.bind.annotation.XmlRootElement;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes22.dex */
@XmlRootElement
public class PutObjectResult extends SSEResultBase {
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private long g;
    private Boolean h;

    private static String a(String str) {
        return (str == null || str.isEmpty() || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    public String getAbsolutePreSignedUri() throws URISyntaxException {
        return getAbsolutePreSignedUri(Common.DEFAULT_FDS_SERVICE_BASE_URI);
    }

    public String getAccessKeyId() {
        return this.d;
    }

    public String getBucketName() {
        return this.b;
    }

    public String getCdnPreSignedUri() throws URISyntaxException {
        return getCdnPreSignedUri(Common.DEFAULT_CDN_SERVICE_URI);
    }

    public long getExpires() {
        return this.g;
    }

    public String getObjectName() {
        return this.c;
    }

    public Boolean getOutsideAccess() {
        return this.h;
    }

    public String getPreviousVersionId() {
        return this.f;
    }

    public String getRelativePreSignedUri() throws URISyntaxException {
        return new URI(null, null, null, -1, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.b + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.c, "GalaxyAccessKeyId=" + this.d + a.l + "Expires" + SearchCriteria.EQ + this.g + a.l + "Signature" + SearchCriteria.EQ + this.e, null).toString();
    }

    public String getSignature() {
        return this.e;
    }

    public void setAccessKeyId(String str) {
        this.d = str;
    }

    public void setBucketName(String str) {
        this.b = str;
    }

    public void setExpires(long j) {
        this.g = j;
    }

    public void setObjectName(String str) {
        this.c = str;
    }

    public void setOutsideAccess(Boolean bool) {
        this.h = bool;
    }

    public void setPreviousVersionId(String str) {
        this.f = str;
    }

    public void setSignature(String str) {
        this.e = str;
    }

    public String toString() {
        return "PutObjectResult{bucketName='" + this.b + "', objectName='" + this.c + "', accessKeyId='" + this.d + "', signature='" + this.e + "', previousVersionId='" + this.f + "', expires=" + this.g + ", outsideAccess=" + this.h + '}';
    }

    public String getAbsolutePreSignedUri(String str) throws URISyntaxException {
        return a(str) + getRelativePreSignedUri();
    }

    public String getCdnPreSignedUri(String str) throws URISyntaxException {
        return a(str) + getRelativePreSignedUri();
    }
}
