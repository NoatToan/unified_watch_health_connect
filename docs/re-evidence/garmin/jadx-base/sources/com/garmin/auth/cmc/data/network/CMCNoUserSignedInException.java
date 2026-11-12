package com.garmin.auth.cmc.data.network;

import am.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/garmin/auth/cmc/data/network/CMCNoUserSignedInException;", "Lcom/garmin/auth/cmc/data/network/NetworkException;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CMCNoUserSignedInException extends NetworkException {
    public static final int $stable = 8;
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CMCNoUserSignedInException(String str) {
        super(str, null, 2, null);
        str.getClass();
        this.message = str;
    }

    public static /* synthetic */ CMCNoUserSignedInException copy$default(CMCNoUserSignedInException cMCNoUserSignedInException, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = cMCNoUserSignedInException.message;
        }
        return cMCNoUserSignedInException.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final CMCNoUserSignedInException copy(String message) {
        message.getClass();
        return new CMCNoUserSignedInException(message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CMCNoUserSignedInException) && s.g(this.message, ((CMCNoUserSignedInException) other).message);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return j.m("CMCNoUserSignedInException(message=", this.message, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CMCNoUserSignedInException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ CMCNoUserSignedInException(String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "no user signed in" : str);
    }
}
