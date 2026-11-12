package com.google.firebase.remoteconfig.interop.rollouts;

import am.j;
import com.google.android.gms.internal.measurement.a;
import j20.x;
import org.apache.commons.text.StringSubstitutor;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_RolloutAssignment extends RolloutAssignment {
    private final String parameterKey;
    private final String parameterValue;
    private final String rolloutId;
    private final long templateVersion;
    private final String variantId;

    public static final class Builder extends RolloutAssignment.Builder {
        private String parameterKey;
        private String parameterValue;
        private String rolloutId;
        private byte set$0;
        private long templateVersion;
        private String variantId;

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment build() {
            if (this.set$0 == 1 && this.rolloutId != null && this.variantId != null && this.parameterKey != null && this.parameterValue != null) {
                return new AutoValue_RolloutAssignment(this.rolloutId, this.variantId, this.parameterKey, this.parameterValue, this.templateVersion);
            }
            StringBuilder sb3 = new StringBuilder();
            if (this.rolloutId == null) {
                sb3.append(" rolloutId");
            }
            if (this.variantId == null) {
                sb3.append(" variantId");
            }
            if (this.parameterKey == null) {
                sb3.append(" parameterKey");
            }
            if (this.parameterValue == null) {
                sb3.append(" parameterValue");
            }
            if ((1 & this.set$0) == 0) {
                sb3.append(" templateVersion");
            }
            h.z(a.f("Missing required properties:", sb3));
            return null;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setParameterKey(String str) {
            if (str != null) {
                this.parameterKey = str;
                return this;
            }
            x.l("Null parameterKey");
            return null;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setParameterValue(String str) {
            if (str != null) {
                this.parameterValue = str;
                return this;
            }
            x.l("Null parameterValue");
            return null;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setRolloutId(String str) {
            if (str != null) {
                this.rolloutId = str;
                return this;
            }
            x.l("Null rolloutId");
            return null;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setTemplateVersion(long j8) {
            this.templateVersion = j8;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setVariantId(String str) {
            if (str != null) {
                this.variantId = str;
                return this;
            }
            x.l("Null variantId");
            return null;
        }
    }

    private AutoValue_RolloutAssignment(String str, String str2, String str3, String str4, long j8) {
        this.rolloutId = str;
        this.variantId = str2;
        this.parameterKey = str3;
        this.parameterValue = str4;
        this.templateVersion = j8;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RolloutAssignment) {
            RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
            if (this.rolloutId.equals(rolloutAssignment.getRolloutId()) && this.variantId.equals(rolloutAssignment.getVariantId()) && this.parameterKey.equals(rolloutAssignment.getParameterKey()) && this.parameterValue.equals(rolloutAssignment.getParameterValue()) && this.templateVersion == rolloutAssignment.getTemplateVersion()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public String getParameterKey() {
        return this.parameterKey;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public String getParameterValue() {
        return this.parameterValue;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public String getRolloutId() {
        return this.rolloutId;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public long getTemplateVersion() {
        return this.templateVersion;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public String getVariantId() {
        return this.variantId;
    }

    public int hashCode() {
        int iHashCode = (((((((this.rolloutId.hashCode() ^ 1000003) * 1000003) ^ this.variantId.hashCode()) * 1000003) ^ this.parameterKey.hashCode()) * 1000003) ^ this.parameterValue.hashCode()) * 1000003;
        long j8 = this.templateVersion;
        return iHashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb3.append(this.rolloutId);
        sb3.append(", variantId=");
        sb3.append(this.variantId);
        sb3.append(", parameterKey=");
        sb3.append(this.parameterKey);
        sb3.append(", parameterValue=");
        sb3.append(this.parameterValue);
        sb3.append(", templateVersion=");
        return j.i(this.templateVersion, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }
}
