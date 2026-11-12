package com.garmin.samd.exception;

import kx2.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/samd/exception/MFARequiredException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkx2/a;", "forFeature", "<init>", "(Lkx2/a;)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MFARequiredException extends Exception {
    public MFARequiredException(a aVar) {
        String strName;
        super("MFA required ".concat((aVar == null || (strName = aVar.name()) == null) ? "" : strName));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MFARequiredException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ MFARequiredException(a aVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : aVar);
    }
}
