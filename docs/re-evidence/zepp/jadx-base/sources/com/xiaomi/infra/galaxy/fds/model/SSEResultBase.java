package com.xiaomi.infra.galaxy.fds.model;

/* JADX INFO: loaded from: classes22.dex */
public abstract class SSEResultBase implements ServerSideEncryptionResult {
    private String a;

    @Override // com.xiaomi.infra.galaxy.fds.model.ServerSideEncryptionResult
    public final String getSSEAlgorithm() {
        return this.a;
    }

    @Override // com.xiaomi.infra.galaxy.fds.model.ServerSideEncryptionResult
    public final void setSSEAlgorithm(String str) {
        this.a = str;
    }
}
