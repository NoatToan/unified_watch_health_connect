package com.huawei.health.h5pro.jsbridge.system.storage;

/* JADX INFO: loaded from: classes7.dex */
public class FileMeta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6917c;
    private long d;
    private String e;
    private String f;
    private long h;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f6918a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f6919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f6920c;
        private long d;
        private String e;
        private long f;
        private String g;

        public Builder absolutePath(String str) {
            this.f6920c = str;
            return this;
        }

        public FileMeta build() {
            return new FileMeta(this);
        }

        public Builder dateAdded(long j) {
            this.d = j;
            return this;
        }

        public Builder mimeType(String str) {
            this.e = str;
            return this;
        }

        public Builder name(String str) {
            this.f6919b = str;
            return this;
        }

        public Builder noExist() {
            this.f6918a = false;
            return this;
        }

        public Builder path(String str) {
            this.g = str;
            return this;
        }

        public Builder size(long j) {
            this.f = j;
            return this;
        }
    }

    public String getAbsolutePath() {
        return this.e;
    }

    public long getDateAdded() {
        return this.d;
    }

    public String getMimeType() {
        return this.f6916b;
    }

    public String getName() {
        return this.f6917c;
    }

    public String getPath() {
        return this.f;
    }

    public long getSize() {
        return this.h;
    }

    public boolean isExist() {
        return this.f6915a;
    }

    private FileMeta(Builder builder) {
        this.f = builder.g;
        this.f6917c = builder.f6919b;
        this.e = builder.f6920c;
        this.h = builder.f;
        this.f6916b = builder.e;
        this.d = builder.d;
        this.f6915a = builder.f6918a;
    }
}
