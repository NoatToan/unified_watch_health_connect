package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class MirrorFailedException extends GalaxyFDSException {
    public MirrorFailedException() {
        super("Get mirror object failed");
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.MirrorFailed;
    }

    public MirrorFailedException(String str, Throwable th) {
        super(str, th);
    }
}
