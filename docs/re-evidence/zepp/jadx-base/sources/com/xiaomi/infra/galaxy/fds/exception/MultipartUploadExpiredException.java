package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class MultipartUploadExpiredException extends GalaxyFDSException {
    public MultipartUploadExpiredException() {
        super("This multipart upload has expired");
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.MultipartUploadExpired;
    }
}
