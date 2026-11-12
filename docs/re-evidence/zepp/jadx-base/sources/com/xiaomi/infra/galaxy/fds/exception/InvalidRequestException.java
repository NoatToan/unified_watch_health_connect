package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class InvalidRequestException extends GalaxyFDSException {
    private static final long serialVersionUID = 1159385783471785922L;

    public InvalidRequestException() {
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.InvalidRequest;
    }

    public InvalidRequestException(String str) {
        super(str);
    }

    public InvalidRequestException(String str, Throwable th) {
        super(str, th);
    }
}
