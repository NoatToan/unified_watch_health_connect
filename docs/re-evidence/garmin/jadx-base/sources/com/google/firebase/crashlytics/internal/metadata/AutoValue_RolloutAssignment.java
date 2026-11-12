package com.google.firebase.crashlytics.internal.metadata;

import am.j;
import j20.x;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_RolloutAssignment extends RolloutAssignment {
    private final String parameterKey;
    private final String parameterValue;
    private final String rolloutId;
    private final long templateVersion;
    private final String variantId;

    public AutoValue_RolloutAssignment(String str, String str2, String str3, String str4, long j8) {
        if (str == null) {
            x.l("Null rolloutId");
            throw null;
        }
        this.rolloutId = str;
        if (str2 == null) {
            x.l("Null parameterKey");
            throw null;
        }
        this.parameterKey = str2;
        if (str3 == null) {
            x.l("Null parameterValue");
            throw null;
        }
        this.parameterValue = str3;
        if (str4 == null) {
            x.l("Null variantId");
            throw null;
        }
        this.variantId = str4;
        this.templateVersion = j8;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RolloutAssignment) {
            RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
            if (this.rolloutId.equals(rolloutAssignment.getRolloutId()) && this.parameterKey.equals(rolloutAssignment.getParameterKey()) && this.parameterValue.equals(rolloutAssignment.getParameterValue()) && this.variantId.equals(rolloutAssignment.getVariantId()) && this.templateVersion == rolloutAssignment.getTemplateVersion()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getParameterKey() {
        return this.parameterKey;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getParameterValue() {
        return this.parameterValue;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getRolloutId() {
        return this.rolloutId;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public long getTemplateVersion() {
        return this.templateVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getVariantId() {
        return this.variantId;
    }

    public int hashCode() {
        int iHashCode = (((((((this.rolloutId.hashCode() ^ 1000003) * 1000003) ^ this.parameterKey.hashCode()) * 1000003) ^ this.parameterValue.hashCode()) * 1000003) ^ this.variantId.hashCode()) * 1000003;
        long j8 = this.templateVersion;
        return iHashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb3.append(this.rolloutId);
        sb3.append(", parameterKey=");
        sb3.append(this.parameterKey);
        sb3.append(", parameterValue=");
        sb3.append(this.parameterValue);
        sb3.append(", variantId=");
        sb3.append(this.variantId);
        sb3.append(", templateVersion=");
        return j.i(this.templateVersion, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }
}
