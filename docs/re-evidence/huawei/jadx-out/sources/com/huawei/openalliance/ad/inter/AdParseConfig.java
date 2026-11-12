package com.huawei.openalliance.ad.inter;

/* JADX INFO: loaded from: classes12.dex */
public class AdParseConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19002c;
    private boolean d;
    private boolean e;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f19003a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f19004b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f19005c = false;
        private boolean d = false;
        private boolean e = false;

        public Builder setUpdateConfig(boolean z) {
            this.f19004b = z;
            return this;
        }

        public Builder setPreCheckNotifyEnable(boolean z) {
            this.d = z;
            return this;
        }

        public Builder setEncryptInContentRrd(boolean z) {
            this.f19005c = z;
            return this;
        }

        public Builder setEnableFullLog(boolean z) {
            this.e = z;
            return this;
        }

        public Builder setAccelerate(boolean z) {
            this.f19003a = z;
            return this;
        }

        public AdParseConfig build() {
            return new AdParseConfig(this);
        }
    }

    public boolean e() {
        return this.e;
    }

    public boolean d() {
        return this.d;
    }

    public boolean c() {
        return this.f19002c;
    }

    public boolean b() {
        return this.f19001b;
    }

    public boolean a() {
        return this.f19000a;
    }

    private AdParseConfig(Builder builder) {
        this.f19000a = builder.f19003a;
        this.f19001b = builder.f19004b;
        this.f19002c = builder.f19005c;
        this.d = builder.d;
        this.e = builder.e;
    }
}
