package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class AuthenticationFailedException extends GalaxyFDSException {
    private static final long serialVersionUID = -8636481540481787968L;

    public AuthenticationFailedException() {
        super("Make sure you have registered as developer");
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.AuthenticationFailed;
    }

    public AuthenticationFailedException(String str, Throwable th) {
        super(str, th);
    }
}
