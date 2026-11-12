package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes14.dex */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f53370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f53371b;

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i14) {
        this.f53371b = (byte) (this.f53371b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f53371b == 3) {
            return new e(this.f53370a, 0, null);
        }
        StringBuilder sb3 = new StringBuilder();
        if ((this.f53371b & 1) == 0) {
            sb3.append(" cloudProjectNumber");
        }
        if ((this.f53371b & 2) == 0) {
            sb3.append(" webViewRequestMode");
        }
        vb.h.z("Missing required properties:".concat(sb3.toString()));
        return null;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j8) {
        this.f53370a = j8;
        this.f53371b = (byte) (this.f53371b | 1);
        return this;
    }
}
