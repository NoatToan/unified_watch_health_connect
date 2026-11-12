package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class a extends CrashlyticsReportWithSessionId {
    private final CrashlyticsReport a;
    private final String b;
    private final File c;

    public a(CrashlyticsReport crashlyticsReport, String str, File file) {
        Objects.requireNonNull(crashlyticsReport, "Null report");
        this.a = crashlyticsReport;
        Objects.requireNonNull(str, "Null sessionId");
        this.b = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.c = file;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReportWithSessionId)) {
            return false;
        }
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
        return this.a.equals(crashlyticsReportWithSessionId.getReport()) && this.b.equals(crashlyticsReportWithSessionId.getSessionId()) && this.c.equals(crashlyticsReportWithSessionId.getReportFile());
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public CrashlyticsReport getReport() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public File getReportFile() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public String getSessionId() {
        return this.b;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + com.alipay.sdk.m.u.i.d;
    }
}
