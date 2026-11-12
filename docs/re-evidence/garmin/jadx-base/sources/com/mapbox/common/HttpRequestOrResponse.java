package com.mapbox.common;

import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public class HttpRequestOrResponse {
    private Type type;
    private Object value;

    public enum Type {
        HTTP_REQUEST,
        HTTP_RESPONSE
    }

    public HttpRequestOrResponse(HttpRequest httpRequest) {
        this.type = Type.HTTP_REQUEST;
        this.value = httpRequest;
    }

    public static HttpRequestOrResponse valueOf(HttpRequest httpRequest) {
        return new HttpRequestOrResponse(httpRequest);
    }

    public HttpRequest getHttpRequest() {
        if (isHttpRequest()) {
            return (HttpRequest) this.value;
        }
        h.z("The content of the variant does not have type (HttpRequest)");
        return null;
    }

    public HttpResponse getHttpResponse() {
        if (isHttpResponse()) {
            return (HttpResponse) this.value;
        }
        h.z("The content of the variant does not have type (HttpResponse)");
        return null;
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isHttpRequest() {
        return this.type == Type.HTTP_REQUEST;
    }

    public boolean isHttpResponse() {
        return this.type == Type.HTTP_RESPONSE;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static HttpRequestOrResponse valueOf(HttpResponse httpResponse) {
        return new HttpRequestOrResponse(httpResponse);
    }

    public HttpRequestOrResponse(HttpResponse httpResponse) {
        this.type = Type.HTTP_RESPONSE;
        this.value = httpResponse;
    }
}
