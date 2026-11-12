package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class OperationDeniedException extends GalaxyFDSException {
    private static final long serialVersionUID = -974711420428687663L;

    public OperationDeniedException() {
        super("This operation is denied");
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.OperationDenied;
    }

    public OperationDeniedException(String str, Throwable th) {
        super(str, th);
    }
}
