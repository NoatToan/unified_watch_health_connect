package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class InvalidBucketNameException extends GalaxyFDSException {
    private static final long serialVersionUID = 436771419220254068L;
    private String b;

    public InvalidBucketNameException(String str) {
        this.b = str;
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.InvalidBucketName;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.b;
    }
}
