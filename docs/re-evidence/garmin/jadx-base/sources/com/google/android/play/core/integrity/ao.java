package com.google.android.play.core.integrity;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes14.dex */
final class ao extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f53304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f53305c = null;

    public /* synthetic */ ao(String str, Long l14, Object obj, an anVar) {
        this.f53303a = str;
        this.f53304b = l14;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f53304b;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    public final boolean equals(Object obj) {
        boolean z14;
        Long l14;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (!this.f53303a.equals(integrityTokenRequest.nonce()) || ((l14 = this.f53304b) != null ? !l14.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() != null)) {
                z14 = false;
            } else {
                z14 = true;
            }
        } else {
            z14 = false;
        }
        if ((obj instanceof ao) && a()) {
            return z14;
        }
        return z14;
    }

    public final int hashCode() {
        int iHashCode = this.f53303a.hashCode() ^ 1000003;
        Long l14 = this.f53304b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l14 == null ? 0 : l14.hashCode());
        return a() ? iHashCode2 * 1000003 : iHashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f53303a;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f53303a + ", cloudProjectNumber=" + this.f53304b;
        if (a()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat(StringSubstitutor.DEFAULT_VAR_END);
    }
}
