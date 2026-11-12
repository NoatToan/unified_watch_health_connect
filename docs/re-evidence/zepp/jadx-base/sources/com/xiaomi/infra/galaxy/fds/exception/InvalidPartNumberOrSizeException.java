package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class InvalidPartNumberOrSizeException extends GalaxyFDSException {
    private static final long serialVersionUID = -980535900742856349L;

    public InvalidPartNumberOrSizeException() {
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.InvalidPartNumberOrSize;
    }

    public InvalidPartNumberOrSizeException(String str, Throwable th) {
        super(str, th);
    }
}
