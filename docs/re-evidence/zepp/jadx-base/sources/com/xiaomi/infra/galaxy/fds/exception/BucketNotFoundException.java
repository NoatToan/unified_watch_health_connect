package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class BucketNotFoundException extends GalaxyFDSException {
    private static final long serialVersionUID = 5814749308983510510L;

    public BucketNotFoundException() {
        super("Make sure you have created bucket in current region");
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.BucketNotFound;
    }

    public BucketNotFoundException(String str) {
        super(str);
    }

    public BucketNotFoundException(String str, Throwable th) {
        super(str, th);
    }
}
