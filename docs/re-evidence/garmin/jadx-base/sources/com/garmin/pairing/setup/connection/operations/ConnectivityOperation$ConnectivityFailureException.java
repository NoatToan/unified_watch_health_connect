package com.garmin.pairing.setup.connection.operations;

import ku2.a;
import la2.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"com/garmin/pairing/setup/connection/operations/ConnectivityOperation$ConnectivityFailureException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lku2/a;", "failureType", "", "message", "", "cause", "Lla2/i;", "failureCode", "<init>", "(Lku2/a;Ljava/lang/String;Ljava/lang/Throwable;Lla2/i;)V", "Lku2/a;", "getFailureType", "()Lku2/a;", "Lla2/i;", "getFailureCode", "()Lla2/i;", "device-setup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConnectivityOperation$ConnectivityFailureException extends Exception {
    private final i failureCode;
    private final a failureType;

    public /* synthetic */ ConnectivityOperation$ConnectivityFailureException(a aVar, String str, Throwable th3, i iVar, int i14, j jVar) {
        this(aVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : th3, (i14 & 8) != 0 ? null : iVar);
    }

    public final i getFailureCode() {
        return this.failureCode;
    }

    public final a getFailureType() {
        return this.failureType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectivityOperation$ConnectivityFailureException(a aVar, String str, Throwable th3, i iVar) {
        super(str == null ? aVar.name() : str, th3);
        aVar.getClass();
        this.failureType = aVar;
        this.failureCode = iVar;
    }
}
