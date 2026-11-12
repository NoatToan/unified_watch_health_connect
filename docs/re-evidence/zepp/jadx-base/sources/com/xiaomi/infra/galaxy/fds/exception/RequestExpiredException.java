package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class RequestExpiredException extends GalaxyFDSException {
    private static final long serialVersionUID = 8343726194793255836L;

    public RequestExpiredException() {
        super("This presigned url has expired");
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.RequestExpired;
    }
}
