package com.google.firebase.crashlytics.internal.model;

import com.google.android.gms.internal.measurement.a;
import com.google.common.base.Ascii;
import j20.x;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import u62.z;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo extends CrashlyticsReport.ApplicationExitInfo {
    private final List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> buildIdMappingForArch;
    private final int importance;
    private final int pid;
    private final String processName;
    private final long pss;
    private final int reasonCode;
    private final long rss;
    private final long timestamp;
    private final String traceFile;

    public static final class Builder extends CrashlyticsReport.ApplicationExitInfo.Builder {
        private List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> buildIdMappingForArch;
        private int importance;
        private int pid;
        private String processName;
        private long pss;
        private int reasonCode;
        private long rss;
        private byte set$0;
        private long timestamp;
        private String traceFile;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo build() {
            String str;
            if (this.set$0 == 63 && (str = this.processName) != null) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo(this.pid, str, this.reasonCode, this.importance, this.pss, this.rss, this.timestamp, this.traceFile, this.buildIdMappingForArch);
            }
            StringBuilder sb3 = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb3.append(" pid");
            }
            if (this.processName == null) {
                sb3.append(" processName");
            }
            if ((this.set$0 & 2) == 0) {
                sb3.append(" reasonCode");
            }
            if ((this.set$0 & 4) == 0) {
                sb3.append(" importance");
            }
            if ((this.set$0 & 8) == 0) {
                sb3.append(" pss");
            }
            if ((this.set$0 & Ascii.DLE) == 0) {
                sb3.append(" rss");
            }
            if ((this.set$0 & 32) == 0) {
                sb3.append(" timestamp");
            }
            h.z(a.f("Missing required properties:", sb3));
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setBuildIdMappingForArch(List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list) {
            this.buildIdMappingForArch = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setImportance(int i14) {
            this.importance = i14;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setPid(int i14) {
            this.pid = i14;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setProcessName(String str) {
            if (str != null) {
                this.processName = str;
                return this;
            }
            x.l("Null processName");
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setPss(long j8) {
            this.pss = j8;
            this.set$0 = (byte) (this.set$0 | 8);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setReasonCode(int i14) {
            this.reasonCode = i14;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setRss(long j8) {
            this.rss = j8;
            this.set$0 = (byte) (this.set$0 | Ascii.DLE);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setTimestamp(long j8) {
            this.timestamp = j8;
            this.set$0 = (byte) (this.set$0 | 32);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setTraceFile(String str) {
            this.traceFile = str;
            return this;
        }
    }

    private AutoValue_CrashlyticsReport_ApplicationExitInfo(int i14, String str, int i15, int i16, long j8, long j14, long j15, String str2, List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list) {
        this.pid = i14;
        this.processName = str;
        this.reasonCode = i15;
        this.importance = i16;
        this.pss = j8;
        this.rss = j14;
        this.timestamp = j15;
        this.traceFile = str2;
        this.buildIdMappingForArch = list;
    }

    public boolean equals(Object obj) {
        String str;
        List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.ApplicationExitInfo) {
            CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
            if (this.pid == applicationExitInfo.getPid() && this.processName.equals(applicationExitInfo.getProcessName()) && this.reasonCode == applicationExitInfo.getReasonCode() && this.importance == applicationExitInfo.getImportance() && this.pss == applicationExitInfo.getPss() && this.rss == applicationExitInfo.getRss() && this.timestamp == applicationExitInfo.getTimestamp() && ((str = this.traceFile) != null ? str.equals(applicationExitInfo.getTraceFile()) : applicationExitInfo.getTraceFile() == null) && ((list = this.buildIdMappingForArch) != null ? list.equals(applicationExitInfo.getBuildIdMappingForArch()) : applicationExitInfo.getBuildIdMappingForArch() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> getBuildIdMappingForArch() {
        return this.buildIdMappingForArch;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public int getImportance() {
        return this.importance;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public int getPid() {
        return this.pid;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public String getProcessName() {
        return this.processName;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public long getPss() {
        return this.pss;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public int getReasonCode() {
        return this.reasonCode;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public long getRss() {
        return this.rss;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public String getTraceFile() {
        return this.traceFile;
    }

    public int hashCode() {
        int iHashCode = (((((((this.pid ^ 1000003) * 1000003) ^ this.processName.hashCode()) * 1000003) ^ this.reasonCode) * 1000003) ^ this.importance) * 1000003;
        long j8 = this.pss;
        int i14 = (iHashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j14 = this.rss;
        int i15 = (i14 ^ ((int) (j14 ^ (j14 >>> 32)))) * 1000003;
        long j15 = this.timestamp;
        int i16 = (i15 ^ ((int) (j15 ^ (j15 >>> 32)))) * 1000003;
        String str = this.traceFile;
        int iHashCode2 = (i16 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list = this.buildIdMappingForArch;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("ApplicationExitInfo{pid=");
        sb3.append(this.pid);
        sb3.append(", processName=");
        sb3.append(this.processName);
        sb3.append(", reasonCode=");
        sb3.append(this.reasonCode);
        sb3.append(", importance=");
        sb3.append(this.importance);
        sb3.append(", pss=");
        sb3.append(this.pss);
        sb3.append(", rss=");
        sb3.append(this.rss);
        sb3.append(", timestamp=");
        sb3.append(this.timestamp);
        sb3.append(", traceFile=");
        sb3.append(this.traceFile);
        sb3.append(", buildIdMappingForArch=");
        return z.c(sb3, this.buildIdMappingForArch, StringSubstitutor.DEFAULT_VAR_END);
    }
}
