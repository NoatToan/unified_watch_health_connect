package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class BucketOutsideAccessDeniedException extends GalaxyFDSException {
    public BucketOutsideAccessDeniedException() {
        super("Bucket is not allowed outside access");
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.BucketAccessDenied;
    }

    public BucketOutsideAccessDeniedException(String str, Throwable th) {
        super(str, th);
    }
}
