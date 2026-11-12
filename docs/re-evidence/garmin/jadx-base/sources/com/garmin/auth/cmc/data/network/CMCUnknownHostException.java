package com.garmin.auth.cmc.data.network;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/garmin/auth/cmc/data/network/CMCUnknownHostException;", "Lcom/garmin/auth/cmc/data/network/NetworkException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CMCUnknownHostException extends NetworkException {
    public static final int $stable = 8;
    private final Throwable cause;
    private final String message;

    public /* synthetic */ CMCUnknownHostException(String str, Throwable th3, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : th3);
    }

    public static /* synthetic */ CMCUnknownHostException copy$default(CMCUnknownHostException cMCUnknownHostException, String str, Throwable th3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = cMCUnknownHostException.message;
        }
        if ((i14 & 2) != 0) {
            th3 = cMCUnknownHostException.cause;
        }
        return cMCUnknownHostException.copy(str, th3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Throwable getCause() {
        return this.cause;
    }

    public final CMCUnknownHostException copy(String message, Throwable cause) {
        return new CMCUnknownHostException(message, cause);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CMCUnknownHostException)) {
            return false;
        }
        CMCUnknownHostException cMCUnknownHostException = (CMCUnknownHostException) other;
        return s.g(this.message, cMCUnknownHostException.message) && s.g(this.cause, cMCUnknownHostException.cause);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Throwable th3 = this.cause;
        return iHashCode + (th3 != null ? th3.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CMCUnknownHostException(message=" + this.message + ", cause=" + this.cause + ")";
    }

    public CMCUnknownHostException(String str, Throwable th3) {
        super(str, th3);
        this.message = str;
        this.cause = th3;
    }
}
