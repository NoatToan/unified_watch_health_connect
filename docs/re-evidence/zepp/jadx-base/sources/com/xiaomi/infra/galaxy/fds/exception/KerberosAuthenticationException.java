package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class KerberosAuthenticationException extends GalaxyFDSException {
    private static final long serialVersionUID = 7719002330871888192L;

    public KerberosAuthenticationException() {
        super("Authentication failed");
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.KerberosAuthenticationFail;
    }

    public KerberosAuthenticationException(String str, Throwable th) {
        super(str, th);
    }

    public KerberosAuthenticationException(String str) {
        super(str);
    }
}
