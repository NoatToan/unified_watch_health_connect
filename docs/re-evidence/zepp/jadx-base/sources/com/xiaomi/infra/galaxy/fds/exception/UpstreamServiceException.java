package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class UpstreamServiceException extends GalaxyFDSException {
    public UpstreamServiceException() {
        super("An exception occurred in the upstream service");
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.UpstreamServiceError;
    }

    public UpstreamServiceException(String str) {
        super(str);
    }

    public UpstreamServiceException(String str, Throwable th) {
        super(str, th);
    }
}
