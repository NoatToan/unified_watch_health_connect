package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class OrgBlockedException extends GalaxyFDSException {
    private static final long serialVersionUID = -434711420428127663L;

    public OrgBlockedException() {
        super("This resource is freeze");
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.QuotaApplyDenied;
    }

    public OrgBlockedException(String str, Throwable th) {
        super(str, th);
    }
}
