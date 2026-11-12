package com.google.android.datatransport.cct.internal;

import com.garmin.android.apps.connectmobile.f3;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes13.dex */
final class AutoValue_ExternalPRequestContext extends ExternalPRequestContext {
    private final Integer originAssociatedProductId;

    public static final class Builder extends ExternalPRequestContext.Builder {
        private Integer originAssociatedProductId;

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public ExternalPRequestContext build() {
            return new AutoValue_ExternalPRequestContext(this.originAssociatedProductId);
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public ExternalPRequestContext.Builder setOriginAssociatedProductId(Integer num) {
            this.originAssociatedProductId = num;
            return this;
        }
    }

    private AutoValue_ExternalPRequestContext(Integer num) {
        this.originAssociatedProductId = num;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPRequestContext)) {
            return false;
        }
        Integer num = this.originAssociatedProductId;
        Integer originAssociatedProductId = ((ExternalPRequestContext) obj).getOriginAssociatedProductId();
        if (num == null) {
            return originAssociatedProductId == null;
        }
        return num.equals(originAssociatedProductId);
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext
    public Integer getOriginAssociatedProductId() {
        return this.originAssociatedProductId;
    }

    public int hashCode() {
        Integer num = this.originAssociatedProductId;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return f3.i(new StringBuilder("ExternalPRequestContext{originAssociatedProductId="), this.originAssociatedProductId, StringSubstitutor.DEFAULT_VAR_END);
    }
}
