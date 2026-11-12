package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class ObjectOutsideAccessDeniedException extends GalaxyFDSException {
    public ObjectOutsideAccessDeniedException() {
        super("Object is not allowed outside access");
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.ObjectAccessDenied;
    }

    public ObjectOutsideAccessDeniedException(String str, Throwable th) {
        super(str, th);
    }
}
