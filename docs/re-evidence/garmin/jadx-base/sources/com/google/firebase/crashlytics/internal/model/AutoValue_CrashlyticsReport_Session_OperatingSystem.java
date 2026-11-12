package com.google.firebase.crashlytics.internal.model;

import com.google.android.gms.internal.measurement.a;
import j20.x;
import org.apache.commons.text.StringSubstitutor;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_OperatingSystem extends CrashlyticsReport.Session.OperatingSystem {
    private final String buildVersion;
    private final boolean jailbroken;
    private final int platform;
    private final String version;

    public static final class Builder extends CrashlyticsReport.Session.OperatingSystem.Builder {
        private String buildVersion;
        private boolean jailbroken;
        private int platform;
        private byte set$0;
        private String version;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem build() {
            String str;
            String str2;
            if (this.set$0 == 3 && (str = this.version) != null && (str2 = this.buildVersion) != null) {
                return new AutoValue_CrashlyticsReport_Session_OperatingSystem(this.platform, str, str2, this.jailbroken);
            }
            StringBuilder sb3 = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb3.append(" platform");
            }
            if (this.version == null) {
                sb3.append(" version");
            }
            if (this.buildVersion == null) {
                sb3.append(" buildVersion");
            }
            if ((this.set$0 & 2) == 0) {
                sb3.append(" jailbroken");
            }
            h.z(a.f("Missing required properties:", sb3));
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder setBuildVersion(String str) {
            if (str != null) {
                this.buildVersion = str;
                return this;
            }
            x.l("Null buildVersion");
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder setJailbroken(boolean z14) {
            this.jailbroken = z14;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder setPlatform(int i14) {
            this.platform = i14;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public CrashlyticsReport.Session.OperatingSystem.Builder setVersion(String str) {
            if (str != null) {
                this.version = str;
                return this;
            }
            x.l("Null version");
            return null;
        }
    }

    private AutoValue_CrashlyticsReport_Session_OperatingSystem(int i14, String str, String str2, boolean z14) {
        this.platform = i14;
        this.version = str;
        this.buildVersion = str2;
        this.jailbroken = z14;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.OperatingSystem) {
            CrashlyticsReport.Session.OperatingSystem operatingSystem = (CrashlyticsReport.Session.OperatingSystem) obj;
            if (this.platform == operatingSystem.getPlatform() && this.version.equals(operatingSystem.getVersion()) && this.buildVersion.equals(operatingSystem.getBuildVersion()) && this.jailbroken == operatingSystem.isJailbroken()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public String getBuildVersion() {
        return this.buildVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public int getPlatform() {
        return this.platform;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return ((((((this.platform ^ 1000003) * 1000003) ^ this.version.hashCode()) * 1000003) ^ this.buildVersion.hashCode()) * 1000003) ^ (this.jailbroken ? 1231 : 1237);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public boolean isJailbroken() {
        return this.jailbroken;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("OperatingSystem{platform=");
        sb3.append(this.platform);
        sb3.append(", version=");
        sb3.append(this.version);
        sb3.append(", buildVersion=");
        sb3.append(this.buildVersion);
        sb3.append(", jailbroken=");
        return hb.a.k(sb3, this.jailbroken, StringSubstitutor.DEFAULT_VAR_END);
    }
}
