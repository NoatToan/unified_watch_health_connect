package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes14.dex */
final class am extends IntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f53302b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f53301a;
        if (str != null) {
            an anVar = null;
            return new ao(str, this.f53302b, anVar, anVar);
        }
        vb.h.z("Missing required properties: nonce");
        return null;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j8) {
        this.f53302b = Long.valueOf(j8);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str != null) {
            this.f53301a = str;
            return this;
        }
        j20.x.l("Null nonce");
        return null;
    }
}
