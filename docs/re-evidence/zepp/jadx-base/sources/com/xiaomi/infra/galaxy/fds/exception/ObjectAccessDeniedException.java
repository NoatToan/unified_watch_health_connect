package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class ObjectAccessDeniedException extends GalaxyFDSException {
    private static final long serialVersionUID = 3705030409880617868L;

    public ObjectAccessDeniedException() {
        super("Please ask owner of resource to grant you permission");
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.ObjectAccessDenied;
    }

    public ObjectAccessDeniedException(String str, Throwable th) {
        super(str, th);
    }
}
