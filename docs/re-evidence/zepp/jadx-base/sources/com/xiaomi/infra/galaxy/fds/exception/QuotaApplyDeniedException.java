package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class QuotaApplyDeniedException extends GalaxyFDSException {
    private static final long serialVersionUID = -974711420428687663L;

    public QuotaApplyDeniedException() {
        super("Only admin is allowed to access Quota Apply");
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.QuotaApplyDenied;
    }

    public QuotaApplyDeniedException(String str, Throwable th) {
        super(str, th);
    }
}
