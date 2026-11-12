package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class TransferBucketOwnerException extends GalaxyFDSException {
    private static final long serialVersionUID = -974711420428687663L;

    public TransferBucketOwnerException() {
        super("Only FDS admin is allowed to transfer bucket owner, please contact fds-help@xiaomi.com");
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.QuotaApplyDenied;
    }
}
