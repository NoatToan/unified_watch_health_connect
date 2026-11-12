package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class ConvertingMultimediaException extends GalaxyFDSException {
    private static final long serialVersionUID = 6867994043799397945L;

    public ConvertingMultimediaException() {
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.ConvertingMultimedia;
    }

    public ConvertingMultimediaException(String str) {
        super(str, null);
    }

    public ConvertingMultimediaException(String str, Throwable th) {
        super(str, th);
    }
}
