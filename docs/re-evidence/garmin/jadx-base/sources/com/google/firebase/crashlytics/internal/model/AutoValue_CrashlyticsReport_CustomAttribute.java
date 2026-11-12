package com.google.firebase.crashlytics.internal.model;

import am.j;
import com.google.android.gms.internal.measurement.a;
import j20.x;
import org.apache.commons.text.StringSubstitutor;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_CustomAttribute extends CrashlyticsReport.CustomAttribute {
    private final String key;
    private final String value;

    public static final class Builder extends CrashlyticsReport.CustomAttribute.Builder {
        private String key;
        private String value;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public CrashlyticsReport.CustomAttribute build() {
            String str;
            String str2 = this.key;
            if (str2 != null && (str = this.value) != null) {
                return new AutoValue_CrashlyticsReport_CustomAttribute(str2, str);
            }
            StringBuilder sb3 = new StringBuilder();
            if (this.key == null) {
                sb3.append(" key");
            }
            if (this.value == null) {
                sb3.append(" value");
            }
            h.z(a.f("Missing required properties:", sb3));
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public CrashlyticsReport.CustomAttribute.Builder setKey(String str) {
            if (str != null) {
                this.key = str;
                return this;
            }
            x.l("Null key");
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public CrashlyticsReport.CustomAttribute.Builder setValue(String str) {
            if (str != null) {
                this.value = str;
                return this;
            }
            x.l("Null value");
            return null;
        }
    }

    private AutoValue_CrashlyticsReport_CustomAttribute(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.CustomAttribute) {
            CrashlyticsReport.CustomAttribute customAttribute = (CrashlyticsReport.CustomAttribute) obj;
            if (this.key.equals(customAttribute.getKey()) && this.value.equals(customAttribute.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    public String getKey() {
        return this.key;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return ((this.key.hashCode() ^ 1000003) * 1000003) ^ this.value.hashCode();
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("CustomAttribute{key=");
        sb3.append(this.key);
        sb3.append(", value=");
        return j.o(this.value, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }
}
