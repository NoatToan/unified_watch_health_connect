package com.garmin.samd.repository;

import d53.u;
import d53.w;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p6.b;
import wr.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000bJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\u0006\u0010\u001b\u001a\u00020\u0017J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/garmin/samd/repository/UnexpectedResponseCodeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "responseCode", "", "responseBody", "", "deviceUnitId", "", "(ILjava/lang/String;Ljava/lang/Long;)V", "getDeviceUnitId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getResponseBody", "()Ljava/lang/String;", "getResponseCode", "()I", "component1", "component2", "component3", "copy", "(ILjava/lang/String;Ljava/lang/Long;)Lcom/garmin/samd/repository/UnexpectedResponseCodeException;", "equals", "", "other", "", "hashCode", "isCaptivePortal", "toString", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class UnexpectedResponseCodeException extends Exception {
    private final Long deviceUnitId;
    private final String responseBody;
    private final int responseCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnexpectedResponseCodeException(int i14, String str, Long l14) {
        super(i14 + ": " + str);
        str.getClass();
        this.responseCode = i14;
        this.responseBody = str;
        this.deviceUnitId = l14;
    }

    public static /* synthetic */ UnexpectedResponseCodeException copy$default(UnexpectedResponseCodeException unexpectedResponseCodeException, int i14, String str, Long l14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i14 = unexpectedResponseCodeException.responseCode;
        }
        if ((i15 & 2) != 0) {
            str = unexpectedResponseCodeException.responseBody;
        }
        if ((i15 & 4) != 0) {
            l14 = unexpectedResponseCodeException.deviceUnitId;
        }
        return unexpectedResponseCodeException.copy(i14, str, l14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResponseCode() {
        return this.responseCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getResponseBody() {
        return this.responseBody;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getDeviceUnitId() {
        return this.deviceUnitId;
    }

    public final UnexpectedResponseCodeException copy(int responseCode, String responseBody, Long deviceUnitId) {
        responseBody.getClass();
        return new UnexpectedResponseCodeException(responseCode, responseBody, deviceUnitId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnexpectedResponseCodeException)) {
            return false;
        }
        UnexpectedResponseCodeException unexpectedResponseCodeException = (UnexpectedResponseCodeException) other;
        return this.responseCode == unexpectedResponseCodeException.responseCode && s.g(this.responseBody, unexpectedResponseCodeException.responseBody) && s.g(this.deviceUnitId, unexpectedResponseCodeException.deviceUnitId);
    }

    public final Long getDeviceUnitId() {
        return this.deviceUnitId;
    }

    public final String getResponseBody() {
        return this.responseBody;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public int hashCode() {
        int iJ = g.j(Integer.hashCode(this.responseCode) * 31, 31, this.responseBody);
        Long l14 = this.deviceUnitId;
        return iJ + (l14 == null ? 0 : l14.hashCode());
    }

    public final boolean isCaptivePortal() {
        String string = w.i0(this.responseBody).toString();
        return u.y(string, "<!doctype", true) || w.z(string, "<html", true);
    }

    @Override // java.lang.Throwable
    public String toString() {
        int i14 = this.responseCode;
        String str = this.responseBody;
        return b.g(g.r(i14, "UnexpectedResponseCodeException(responseCode=", ", responseBody=", str, ", deviceUnitId="), this.deviceUnitId, ")");
    }

    public /* synthetic */ UnexpectedResponseCodeException(int i14, String str, Long l14, int i15, j jVar) {
        this(i14, str, (i15 & 4) != 0 ? null : l14);
    }
}
