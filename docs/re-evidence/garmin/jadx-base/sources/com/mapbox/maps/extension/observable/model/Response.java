package com.mapbox.maps.extension.observable.model;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.mapbox.common.HttpHeaders;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes2.dex */
@e
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jk\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\rHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lcom/mapbox/maps/extension/observable/model/Response;", "", "eTag", "", "mustRevalidate", "", "noContent", "modified", "source", "Lcom/mapbox/maps/extension/observable/model/ResponseSourceType;", "notModified", "expires", "size", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/mapbox/maps/extension/observable/model/Error;", "(Ljava/lang/String;ZZLjava/lang/String;Lcom/mapbox/maps/extension/observable/model/ResponseSourceType;ZLjava/lang/String;ILcom/mapbox/maps/extension/observable/model/Error;)V", "getETag", "()Ljava/lang/String;", "getError", "()Lcom/mapbox/maps/extension/observable/model/Error;", "getExpires", "getModified", "getMustRevalidate", "()Z", "getNoContent", "getNotModified", "getSize", "()I", "getSource", "()Lcom/mapbox/maps/extension/observable/model/ResponseSourceType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Response {

    @SerializedName(HttpHeaders.ETAG)
    private final String eTag;

    @SerializedName(Constants.IPC_BUNDLE_KEY_SEND_ERROR)
    private final Error error;

    @SerializedName("expires")
    private final String expires;

    @SerializedName("modified")
    private final String modified;

    @SerializedName("must-revalidate")
    private final boolean mustRevalidate;

    @SerializedName("no-content")
    private final boolean noContent;

    @SerializedName("not-modified")
    private final boolean notModified;

    @SerializedName("size")
    private final int size;

    @SerializedName("source")
    private final ResponseSourceType source;

    public Response(String str, boolean z14, boolean z15, String str2, ResponseSourceType responseSourceType, boolean z16, String str3, int i14, Error error) {
        responseSourceType.getClass();
        this.eTag = str;
        this.mustRevalidate = z14;
        this.noContent = z15;
        this.modified = str2;
        this.source = responseSourceType;
        this.notModified = z16;
        this.expires = str3;
        this.size = i14;
        this.error = error;
    }

    public static /* synthetic */ Response copy$default(Response response, String str, boolean z14, boolean z15, String str2, ResponseSourceType responseSourceType, boolean z16, String str3, int i14, Error error, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = response.eTag;
        }
        if ((i15 & 2) != 0) {
            z14 = response.mustRevalidate;
        }
        if ((i15 & 4) != 0) {
            z15 = response.noContent;
        }
        if ((i15 & 8) != 0) {
            str2 = response.modified;
        }
        if ((i15 & 16) != 0) {
            responseSourceType = response.source;
        }
        if ((i15 & 32) != 0) {
            z16 = response.notModified;
        }
        if ((i15 & 64) != 0) {
            str3 = response.expires;
        }
        if ((i15 & 128) != 0) {
            i14 = response.size;
        }
        if ((i15 & 256) != 0) {
            error = response.error;
        }
        int i16 = i14;
        Error error2 = error;
        boolean z17 = z16;
        String str4 = str3;
        ResponseSourceType responseSourceType2 = responseSourceType;
        boolean z18 = z15;
        return response.copy(str, z14, z18, str2, responseSourceType2, z17, str4, i16, error2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getETag() {
        return this.eTag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getNoContent() {
        return this.noContent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModified() {
        return this.modified;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ResponseSourceType getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getNotModified() {
        return this.notModified;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getExpires() {
        return this.expires;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Error getError() {
        return this.error;
    }

    public final Response copy(String eTag, boolean mustRevalidate, boolean noContent, String modified, ResponseSourceType source, boolean notModified, String expires, int size, Error error) {
        source.getClass();
        return new Response(eTag, mustRevalidate, noContent, modified, source, notModified, expires, size, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Response)) {
            return false;
        }
        Response response = (Response) other;
        return s.g(this.eTag, response.eTag) && this.mustRevalidate == response.mustRevalidate && this.noContent == response.noContent && s.g(this.modified, response.modified) && this.source == response.source && this.notModified == response.notModified && s.g(this.expires, response.expires) && this.size == response.size && s.g(this.error, response.error);
    }

    public final String getETag() {
        return this.eTag;
    }

    public final Error getError() {
        return this.error;
    }

    public final String getExpires() {
        return this.expires;
    }

    public final String getModified() {
        return this.modified;
    }

    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean getNoContent() {
        return this.noContent;
    }

    public final boolean getNotModified() {
        return this.notModified;
    }

    public final int getSize() {
        return this.size;
    }

    public final ResponseSourceType getSource() {
        return this.source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public int hashCode() {
        String str = this.eTag;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z14 = this.mustRevalidate;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = (iHashCode + r14) * 31;
        boolean z15 = this.noContent;
        ?? r15 = z15;
        if (z15) {
            r15 = 1;
        }
        int i15 = (i14 + r15) * 31;
        String str2 = this.modified;
        int iHashCode2 = (this.source.hashCode() + ((i15 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        boolean z16 = this.notModified;
        int i16 = (iHashCode2 + (z16 ? 1 : z16)) * 31;
        String str3 = this.expires;
        int iD = q2.d(this.size, (i16 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        Error error = this.error;
        return iD + (error != null ? error.hashCode() : 0);
    }

    public String toString() {
        return "Response(eTag=" + this.eTag + ", mustRevalidate=" + this.mustRevalidate + ", noContent=" + this.noContent + ", modified=" + this.modified + ", source=" + this.source + ", notModified=" + this.notModified + ", expires=" + this.expires + ", size=" + this.size + ", error=" + this.error + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
