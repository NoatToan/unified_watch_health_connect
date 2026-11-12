package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class InvalidTrashObjectNameException extends GalaxyFDSException {
    private static final long serialVersionUID = 446773419120254067L;
    private String b;

    public InvalidTrashObjectNameException() {
        this("Trash object name should contains at least 2 '/'");
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.InvalidTrashObjectName;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.b;
    }

    public InvalidTrashObjectNameException(String str) {
        this.b = str;
    }
}
