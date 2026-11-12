package com.google.android.play.core.integrity;

import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
final class f extends StandardIntegrityManager.StandardIntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set f53374b;

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest build() {
        Set set = this.f53374b;
        if (set != null) {
            return new h(this.f53373a, set, null);
        }
        vb.h.z("Missing required properties: verdictOptOut");
        return null;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(String str) {
        this.f53373a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setVerdictOptOut(Set<Integer> set) {
        if (set != null) {
            this.f53374b = set;
            return this;
        }
        j20.x.l("Null verdictOptOut");
        return null;
    }
}
