package com.google.firebase.crashlytics.internal.model;

import am.j;
import com.google.android.gms.internal.measurement.a;
import com.google.firebase.encoders.annotations.Encodable;
import j20.x;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session extends CrashlyticsReport.Session {
    private final CrashlyticsReport.Session.Application app;
    private final String appQualitySessionId;
    private final boolean crashed;
    private final CrashlyticsReport.Session.Device device;
    private final Long endedAt;
    private final List<CrashlyticsReport.Session.Event> events;
    private final String generator;
    private final int generatorType;
    private final String identifier;

    /* JADX INFO: renamed from: os, reason: collision with root package name */
    private final CrashlyticsReport.Session.OperatingSystem f53715os;
    private final long startedAt;
    private final CrashlyticsReport.Session.User user;

    private AutoValue_CrashlyticsReport_Session(String str, String str2, String str3, long j8, Long l14, boolean z14, CrashlyticsReport.Session.Application application, CrashlyticsReport.Session.User user, CrashlyticsReport.Session.OperatingSystem operatingSystem, CrashlyticsReport.Session.Device device, List<CrashlyticsReport.Session.Event> list, int i14) {
        this.generator = str;
        this.identifier = str2;
        this.appQualitySessionId = str3;
        this.startedAt = j8;
        this.endedAt = l14;
        this.crashed = z14;
        this.app = application;
        this.user = user;
        this.f53715os = operatingSystem;
        this.device = device;
        this.events = list;
        this.generatorType = i14;
    }

    public boolean equals(Object obj) {
        String str;
        Long l14;
        CrashlyticsReport.Session.User user;
        CrashlyticsReport.Session.OperatingSystem operatingSystem;
        CrashlyticsReport.Session.Device device;
        List<CrashlyticsReport.Session.Event> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session) {
            CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
            if (this.generator.equals(session.getGenerator()) && this.identifier.equals(session.getIdentifier()) && ((str = this.appQualitySessionId) != null ? str.equals(session.getAppQualitySessionId()) : session.getAppQualitySessionId() == null) && this.startedAt == session.getStartedAt() && ((l14 = this.endedAt) != null ? l14.equals(session.getEndedAt()) : session.getEndedAt() == null) && this.crashed == session.isCrashed() && this.app.equals(session.getApp()) && ((user = this.user) != null ? user.equals(session.getUser()) : session.getUser() == null) && ((operatingSystem = this.f53715os) != null ? operatingSystem.equals(session.getOs()) : session.getOs() == null) && ((device = this.device) != null ? device.equals(session.getDevice()) : session.getDevice() == null) && ((list = this.events) != null ? list.equals(session.getEvents()) : session.getEvents() == null) && this.generatorType == session.getGeneratorType()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.Application getApp() {
        return this.app;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public String getAppQualitySessionId() {
        return this.appQualitySessionId;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.Device getDevice() {
        return this.device;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public Long getEndedAt() {
        return this.endedAt;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public List<CrashlyticsReport.Session.Event> getEvents() {
        return this.events;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public String getGenerator() {
        return this.generator;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public int getGeneratorType() {
        return this.generatorType;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Encodable.Ignore
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.OperatingSystem getOs() {
        return this.f53715os;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public long getStartedAt() {
        return this.startedAt;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.User getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = (((this.generator.hashCode() ^ 1000003) * 1000003) ^ this.identifier.hashCode()) * 1000003;
        String str = this.appQualitySessionId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j8 = this.startedAt;
        int i14 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        Long l14 = this.endedAt;
        int iHashCode3 = (((((i14 ^ (l14 == null ? 0 : l14.hashCode())) * 1000003) ^ (this.crashed ? 1231 : 1237)) * 1000003) ^ this.app.hashCode()) * 1000003;
        CrashlyticsReport.Session.User user = this.user;
        int iHashCode4 = (iHashCode3 ^ (user == null ? 0 : user.hashCode())) * 1000003;
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.f53715os;
        int iHashCode5 = (iHashCode4 ^ (operatingSystem == null ? 0 : operatingSystem.hashCode())) * 1000003;
        CrashlyticsReport.Session.Device device = this.device;
        int iHashCode6 = (iHashCode5 ^ (device == null ? 0 : device.hashCode())) * 1000003;
        List<CrashlyticsReport.Session.Event> list = this.events;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.generatorType;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public boolean isCrashed() {
        return this.crashed;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public CrashlyticsReport.Session.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("Session{generator=");
        sb3.append(this.generator);
        sb3.append(", identifier=");
        sb3.append(this.identifier);
        sb3.append(", appQualitySessionId=");
        sb3.append(this.appQualitySessionId);
        sb3.append(", startedAt=");
        sb3.append(this.startedAt);
        sb3.append(", endedAt=");
        sb3.append(this.endedAt);
        sb3.append(", crashed=");
        sb3.append(this.crashed);
        sb3.append(", app=");
        sb3.append(this.app);
        sb3.append(", user=");
        sb3.append(this.user);
        sb3.append(", os=");
        sb3.append(this.f53715os);
        sb3.append(", device=");
        sb3.append(this.device);
        sb3.append(", events=");
        sb3.append(this.events);
        sb3.append(", generatorType=");
        return j.q(sb3, this.generatorType, StringSubstitutor.DEFAULT_VAR_END);
    }

    public static final class Builder extends CrashlyticsReport.Session.Builder {
        private CrashlyticsReport.Session.Application app;
        private String appQualitySessionId;
        private boolean crashed;
        private CrashlyticsReport.Session.Device device;
        private Long endedAt;
        private List<CrashlyticsReport.Session.Event> events;
        private String generator;
        private int generatorType;
        private String identifier;

        /* JADX INFO: renamed from: os, reason: collision with root package name */
        private CrashlyticsReport.Session.OperatingSystem f53716os;
        private byte set$0;
        private long startedAt;
        private CrashlyticsReport.Session.User user;

        private Builder(CrashlyticsReport.Session session) {
            this.generator = session.getGenerator();
            this.identifier = session.getIdentifier();
            this.appQualitySessionId = session.getAppQualitySessionId();
            this.startedAt = session.getStartedAt();
            this.endedAt = session.getEndedAt();
            this.crashed = session.isCrashed();
            this.app = session.getApp();
            this.user = session.getUser();
            this.f53716os = session.getOs();
            this.device = session.getDevice();
            this.events = session.getEvents();
            this.generatorType = session.getGeneratorType();
            this.set$0 = (byte) 7;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session build() {
            String str;
            String str2;
            CrashlyticsReport.Session.Application application;
            if (this.set$0 == 7 && (str = this.generator) != null && (str2 = this.identifier) != null && (application = this.app) != null) {
                return new AutoValue_CrashlyticsReport_Session(str, str2, this.appQualitySessionId, this.startedAt, this.endedAt, this.crashed, application, this.user, this.f53716os, this.device, this.events, this.generatorType);
            }
            StringBuilder sb3 = new StringBuilder();
            if (this.generator == null) {
                sb3.append(" generator");
            }
            if (this.identifier == null) {
                sb3.append(" identifier");
            }
            if ((this.set$0 & 1) == 0) {
                sb3.append(" startedAt");
            }
            if ((this.set$0 & 2) == 0) {
                sb3.append(" crashed");
            }
            if (this.app == null) {
                sb3.append(" app");
            }
            if ((this.set$0 & 4) == 0) {
                sb3.append(" generatorType");
            }
            h.z(a.f("Missing required properties:", sb3));
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setApp(CrashlyticsReport.Session.Application application) {
            if (application != null) {
                this.app = application;
                return this;
            }
            x.l("Null app");
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setAppQualitySessionId(String str) {
            this.appQualitySessionId = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setCrashed(boolean z14) {
            this.crashed = z14;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setDevice(CrashlyticsReport.Session.Device device) {
            this.device = device;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setEndedAt(Long l14) {
            this.endedAt = l14;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setEvents(List<CrashlyticsReport.Session.Event> list) {
            this.events = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setGenerator(String str) {
            if (str != null) {
                this.generator = str;
                return this;
            }
            x.l("Null generator");
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setGeneratorType(int i14) {
            this.generatorType = i14;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setIdentifier(String str) {
            if (str != null) {
                this.identifier = str;
                return this;
            }
            x.l("Null identifier");
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setOs(CrashlyticsReport.Session.OperatingSystem operatingSystem) {
            this.f53716os = operatingSystem;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setStartedAt(long j8) {
            this.startedAt = j8;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public CrashlyticsReport.Session.Builder setUser(CrashlyticsReport.Session.User user) {
            this.user = user;
            return this;
        }

        public Builder() {
        }
    }
}
