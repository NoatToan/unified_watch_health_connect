package com.garmin.samd.exception;

import p005kotlin.Metadata;
import zi2.a;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/samd/exception/GHSEnvironmentNotSupportedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lzi2/a;", "environment", "<init>", "(Lzi2/a;)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GHSEnvironmentNotSupportedException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GHSEnvironmentNotSupportedException(a aVar) {
        super("'ConnectEnvironment' " + aVar + " not supported");
        aVar.getClass();
    }
}
