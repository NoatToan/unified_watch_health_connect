package com.google.android.clockwork.companion.partnerapi;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_EcoAppNotificationConfig extends EcoAppNotificationConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7812b;
    public final boolean c;
    public final int d;

    public static final class a extends EcoAppNotificationConfig.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f7814b;
        public Boolean c;
        public Integer d;

        @Override // com.google.android.clockwork.companion.partnerapi.EcoAppNotificationConfig.b
        public EcoAppNotificationConfig a() {
            String str = "";
            if (this.f7813a == null) {
                str = " packageName";
            }
            if (this.f7814b == null) {
                str = str + " appName";
            }
            if (this.c == null) {
                str = str + " canChangeMuteSetting";
            }
            if (this.d == null) {
                str = str + " notificationStatus";
            }
            if (str.isEmpty()) {
                return new AutoValue_EcoAppNotificationConfig(this.f7813a, this.f7814b, this.c.booleanValue(), this.d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.clockwork.companion.partnerapi.EcoAppNotificationConfig.b
        public EcoAppNotificationConfig.b b(String str) {
            if (str == null) {
                throw new NullPointerException("Null appName");
            }
            this.f7814b = str;
            return this;
        }

        @Override // com.google.android.clockwork.companion.partnerapi.EcoAppNotificationConfig.b
        public EcoAppNotificationConfig.b c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.android.clockwork.companion.partnerapi.EcoAppNotificationConfig.b
        public EcoAppNotificationConfig.b d(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.clockwork.companion.partnerapi.EcoAppNotificationConfig.b
        public EcoAppNotificationConfig.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null packageName");
            }
            this.f7813a = str;
            return this;
        }
    }

    @Override // com.google.android.clockwork.companion.partnerapi.EcoAppNotificationConfig
    public String a() {
        return this.f7812b;
    }

    @Override // com.google.android.clockwork.companion.partnerapi.EcoAppNotificationConfig
    public boolean c() {
        return this.c;
    }

    @Override // com.google.android.clockwork.companion.partnerapi.EcoAppNotificationConfig
    public int d() {
        return this.d;
    }

    @Override // com.google.android.clockwork.companion.partnerapi.EcoAppNotificationConfig
    public String e() {
        return this.f7811a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EcoAppNotificationConfig)) {
            return false;
        }
        EcoAppNotificationConfig ecoAppNotificationConfig = (EcoAppNotificationConfig) obj;
        return this.f7811a.equals(ecoAppNotificationConfig.e()) && this.f7812b.equals(ecoAppNotificationConfig.a()) && this.c == ecoAppNotificationConfig.c() && this.d == ecoAppNotificationConfig.d();
    }

    public int hashCode() {
        return ((((((this.f7811a.hashCode() ^ 1000003) * 1000003) ^ this.f7812b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d;
    }

    public String toString() {
        return "EcoAppNotificationConfig{packageName=" + this.f7811a + ", appName=" + this.f7812b + ", canChangeMuteSetting=" + this.c + ", notificationStatus=" + this.d + "}";
    }

    public AutoValue_EcoAppNotificationConfig(String str, String str2, boolean z, int i) {
        this.f7811a = str;
        this.f7812b = str2;
        this.c = z;
        this.d = i;
    }
}
