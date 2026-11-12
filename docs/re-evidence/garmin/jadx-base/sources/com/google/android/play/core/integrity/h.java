package com.google.android.play.core.integrity;

import i3.e5;
import java.util.Set;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes14.dex */
final class h extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f53376b;

    public /* synthetic */ h(String str, Set set, g gVar) {
        this.f53375a = str;
        this.f53376b = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest) {
            StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
            String str = this.f53375a;
            if (str != null ? str.equals(standardIntegrityTokenRequest.requestHash()) : standardIntegrityTokenRequest.requestHash() == null) {
                if (this.f53376b.equals(standardIntegrityTokenRequest.verdictOptOut())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f53375a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f53376b.hashCode();
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final String requestHash() {
        return this.f53375a;
    }

    public final String toString() {
        return e5.h(new StringBuilder("StandardIntegrityTokenRequest{requestHash="), this.f53375a, ", verdictOptOut=", this.f53376b.toString(), StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final Set<Integer> verdictOptOut() {
        return this.f53376b;
    }
}
