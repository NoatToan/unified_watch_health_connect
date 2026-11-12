package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class a extends CrashlyticsReport {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final String f;
    private final String g;
    private final CrashlyticsReport.Session h;
    private final CrashlyticsReport.FilesPayload i;

    public static final class b extends CrashlyticsReport.Builder {
        private String a;
        private String b;
        private Integer c;
        private String d;
        private String e;
        private String f;
        private CrashlyticsReport.Session g;
        private CrashlyticsReport.FilesPayload h;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport build() {
            String str = "";
            if (this.a == null) {
                str = " sdkVersion";
            }
            if (this.b == null) {
                str = str + " gmpAppId";
            }
            if (this.c == null) {
                str = str + " platform";
            }
            if (this.d == null) {
                str = str + " installationUuid";
            }
            if (this.e == null) {
                str = str + " buildVersion";
            }
            if (this.f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b, this.c.intValue(), this.d, this.e, this.f, this.g, this.h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setBuildVersion(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setDisplayVersion(String str) {
            Objects.requireNonNull(str, "Null displayVersion");
            this.f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setGmpAppId(String str) {
            Objects.requireNonNull(str, "Null gmpAppId");
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setInstallationUuid(String str) {
            Objects.requireNonNull(str, "Null installationUuid");
            this.d = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setNdkPayload(CrashlyticsReport.FilesPayload filesPayload) {
            this.h = filesPayload;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setPlatform(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setSdkVersion(String str) {
            Objects.requireNonNull(str, "Null sdkVersion");
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public CrashlyticsReport.Builder setSession(CrashlyticsReport.Session session) {
            this.g = session;
            return this;
        }

        public b() {
        }

        private b(CrashlyticsReport crashlyticsReport) {
            this.a = crashlyticsReport.getSdkVersion();
            this.b = crashlyticsReport.getGmpAppId();
            this.c = Integer.valueOf(crashlyticsReport.getPlatform());
            this.d = crashlyticsReport.getInstallationUuid();
            this.e = crashlyticsReport.getBuildVersion();
            this.f = crashlyticsReport.getDisplayVersion();
            this.g = crashlyticsReport.getSession();
            this.h = crashlyticsReport.getNdkPayload();
        }
    }

    public boolean equals(Object obj) {
        CrashlyticsReport.Session session;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (this.b.equals(crashlyticsReport.getSdkVersion()) && this.c.equals(crashlyticsReport.getGmpAppId()) && this.d == crashlyticsReport.getPlatform() && this.e.equals(crashlyticsReport.getInstallationUuid()) && this.f.equals(crashlyticsReport.getBuildVersion()) && this.g.equals(crashlyticsReport.getDisplayVersion()) && ((session = this.h) != null ? session.equals(crashlyticsReport.getSession()) : crashlyticsReport.getSession() == null)) {
            CrashlyticsReport.FilesPayload filesPayload = this.i;
            if (filesPayload == null) {
                if (crashlyticsReport.getNdkPayload() == null) {
                    return true;
                }
            } else if (filesPayload.equals(crashlyticsReport.getNdkPayload())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public String getBuildVersion() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public String getDisplayVersion() {
        return this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public String getGmpAppId() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public String getInstallationUuid() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public CrashlyticsReport.FilesPayload getNdkPayload() {
        return this.i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public int getPlatform() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public String getSdkVersion() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public CrashlyticsReport.Session getSession() {
        return this.h;
    }

    public int hashCode() {
        int iHashCode = (((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        CrashlyticsReport.Session session = this.h;
        int iHashCode2 = (iHashCode ^ (session == null ? 0 : session.hashCode())) * 1000003;
        CrashlyticsReport.FilesPayload filesPayload = this.i;
        return iHashCode2 ^ (filesPayload != null ? filesPayload.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public CrashlyticsReport.Builder toBuilder() {
        return new b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", buildVersion=" + this.f + ", displayVersion=" + this.g + ", session=" + this.h + ", ndkPayload=" + this.i + com.alipay.sdk.m.u.i.d;
    }

    private a(String str, String str2, int i, String str3, String str4, String str5, @Nullable CrashlyticsReport.Session session, @Nullable CrashlyticsReport.FilesPayload filesPayload) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = session;
        this.i = filesPayload;
    }
}
