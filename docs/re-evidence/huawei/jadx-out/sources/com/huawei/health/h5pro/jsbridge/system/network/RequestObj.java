package com.huawei.health.h5pro.jsbridge.system.network;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public class RequestObj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("requestBody")
    private String f6852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("url")
    private String f6853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("requestType")
    private String f6854c = RequestType.GET.requestType;

    @SerializedName("headers")
    private Map<String, String> d;

    @SerializedName(TtmlNode.TAG_BODY)
    private Map<String, Object> e;

    public enum RequestType {
        POST("POST"),
        GET("GET"),
        DELETE(ProfileRequestConstants.DELETE_TYPE),
        PUT(ProfileRequestConstants.PUT_TYPE);

        private final String requestType;

        RequestType(String str) {
            this.requestType = str;
        }
    }

    public Map<String, Object> getBody() {
        return this.e;
    }

    public Map<String, String> getHeaders() {
        return this.d;
    }

    public String getRequestBody() {
        return this.f6852a;
    }

    public String getRequestType() {
        return this.f6854c;
    }

    public String getUrl() {
        return this.f6853b;
    }

    public void setBody(Map<String, Object> map) {
        this.e = map;
    }

    public void setHeaders(Map<String, String> map) {
        this.d = map;
    }

    public void setRequestBody(String str) {
        this.f6852a = str;
    }
}
