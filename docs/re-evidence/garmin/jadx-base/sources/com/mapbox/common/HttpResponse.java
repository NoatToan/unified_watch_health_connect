package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class HttpResponse implements Serializable {
    private final HttpRequest request;
    private final long requestId;
    private final Expected<HttpRequestError, HttpResponseData> result;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public HttpResponse(long j8, HttpRequest httpRequest, Expected<HttpRequestError, HttpResponseData> expected) {
        this.requestId = j8;
        this.request = httpRequest;
        this.result = expected;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return this.requestId == httpResponse.requestId && Objects.equals(this.request, httpResponse.request) && Objects.equals(this.result, httpResponse.result);
    }

    public HttpRequest getRequest() {
        return this.request;
    }

    public long getRequestId() {
        return this.requestId;
    }

    public Expected<HttpRequestError, HttpResponseData> getResult() {
        return this.result;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.requestId), this.request, this.result);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[requestId: ");
        com.google.protobuf.a.h(this.requestId, ", request: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.request));
        sb3.append(", result: ");
        sb3.append(RecordUtils.fieldToString(this.result));
        sb3.append("]");
        return sb3.toString();
    }
}
