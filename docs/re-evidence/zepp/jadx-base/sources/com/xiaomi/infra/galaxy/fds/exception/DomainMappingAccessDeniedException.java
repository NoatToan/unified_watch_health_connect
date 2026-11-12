package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class DomainMappingAccessDeniedException extends GalaxyFDSException {
    private static final long serialVersionUID = 6765549983453165715L;

    public DomainMappingAccessDeniedException() {
        super("Only admin is allowd to edit domain mapping");
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.DomainMappingAccessDenied;
    }

    public DomainMappingAccessDeniedException(String str, Throwable th) {
        super(str, th);
    }
}
