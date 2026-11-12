package com.huawei.hms.ads.jsb;

/* JADX INFO: loaded from: classes10.dex */
public class JsbConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f12800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f12801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f12802c;
    private boolean d;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f12803a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f12804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f12805c;
        private boolean d;

        public final Builder initGrs(String str, String str2) {
            this.f12804b = str;
            this.f12805c = str2;
            return this;
        }

        public final Builder initGrs(String str) {
            this.f12804b = str;
            return this;
        }

        public final Builder enableUserInfo(boolean z) {
            this.f12803a = z;
            return this;
        }

        public final Builder enableLog(boolean z) {
            this.d = z;
            return this;
        }

        public final JsbConfig build() {
            return new JsbConfig(this);
        }
    }

    public boolean d() {
        return this.d;
    }

    public String c() {
        return this.f12802c;
    }

    public String b() {
        return this.f12801b;
    }

    public boolean a() {
        return this.f12800a;
    }

    private JsbConfig(Builder builder) {
        this.f12800a = true;
        this.f12800a = builder.f12803a;
        this.f12801b = builder.f12804b;
        this.f12802c = builder.f12805c;
        this.d = builder.d;
    }
}
