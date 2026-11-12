package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class VerifyOAuthAccessTokenError extends GalaxyFDSException {
    private static final long serialVersionUID = 1673791846160068073L;

    public VerifyOAuthAccessTokenError() {
        super("Make sure your access token is correct and valid");
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.VerifyOAuthAccessTokenError;
    }
}
