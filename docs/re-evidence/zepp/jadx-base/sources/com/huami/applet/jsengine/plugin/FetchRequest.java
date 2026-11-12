package com.huami.applet.jsengine.plugin;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.transdata.transport.Actions;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b2\u00103J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003JY\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u000f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0019\u0010\u0011\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u0019\u0010\u0013\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0014\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010\u001d\u001a\u0004\b1\u0010\u001f¨\u00064"}, d2 = {"Lcom/huami/applet/jsengine/plugin/FetchRequest;", "", "", "component1", "component2", "Lorg/json/JSONObject;", "component3", "component4", "component5", "component6", "", "component7", "component8", "id", "body", Actions.KEY_HEADERS, "method", "query", "url", "timeout", "responseType", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getBody", "c", "Lorg/json/JSONObject;", "getHeaders", "()Lorg/json/JSONObject;", GoogleApiAvailabilityLight.a, "getMethod", "e", "getQuery", "f", "getUrl", "g", "J", "getTimeout", "()J", "h", "getResponseType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;JLjava/lang/String;)V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FetchRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String body;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final JSONObject headers;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String method;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final JSONObject query;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String url;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final long timeout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final String responseType;

    public FetchRequest(@NotNull String str, @NotNull String str2, @NotNull JSONObject jSONObject, @NotNull String str3, @NotNull JSONObject jSONObject2, @NotNull String str4, long j, @NotNull String str5) {
        this.id = str;
        this.body = str2;
        this.headers = jSONObject;
        this.method = str3;
        this.query = jSONObject2;
        this.url = str4;
        this.timeout = j;
        this.responseType = str5;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JSONObject getHeaders() {
        return this.headers;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final JSONObject getQuery() {
        return this.query;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getTimeout() {
        return this.timeout;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getResponseType() {
        return this.responseType;
    }

    @NotNull
    public final FetchRequest copy(@NotNull String id, @NotNull String body, @NotNull JSONObject headers, @NotNull String method, @NotNull JSONObject query, @NotNull String url, long timeout, @NotNull String responseType) {
        return new FetchRequest(id, body, headers, method, query, url, timeout, responseType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchRequest)) {
            return false;
        }
        FetchRequest fetchRequest = (FetchRequest) other;
        return Intrinsics.areEqual(this.id, fetchRequest.id) && Intrinsics.areEqual(this.body, fetchRequest.body) && Intrinsics.areEqual(this.headers, fetchRequest.headers) && Intrinsics.areEqual(this.method, fetchRequest.method) && Intrinsics.areEqual(this.query, fetchRequest.query) && Intrinsics.areEqual(this.url, fetchRequest.url) && this.timeout == fetchRequest.timeout && Intrinsics.areEqual(this.responseType, fetchRequest.responseType);
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final JSONObject getHeaders() {
        return this.headers;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final JSONObject getQuery() {
        return this.query;
    }

    @NotNull
    public final String getResponseType() {
        return this.responseType;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((((((((this.id.hashCode() * 31) + this.body.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.method.hashCode()) * 31) + this.query.hashCode()) * 31) + this.url.hashCode()) * 31) + b.a(this.timeout)) * 31) + this.responseType.hashCode();
    }

    @NotNull
    public String toString() {
        return "FetchRequest(id=" + this.id + ", body=" + this.body + ", headers=" + this.headers + ", method=" + this.method + ", query=" + this.query + ", url=" + this.url + ", timeout=" + this.timeout + ", responseType=" + this.responseType + ')';
    }
}
