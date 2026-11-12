package com.xiaomi.clientreport.data;

import android.content.Context;

/* JADX INFO: loaded from: classes18.dex */
public class Config {
    public static final boolean DEFAULT_EVENT_ENCRYPTED = true;
    public static final long DEFAULT_EVENT_UPLOAD_FREQUENCY = 86400;
    public static final boolean DEFAULT_EVENT_UPLOAD_SWITCH_OPEN = false;
    public static final long DEFAULT_MAX_FILE_LENGTH = 1048576;
    public static final long DEFAULT_PERF_UPLOAD_FREQUENCY = 86400;
    public static final boolean DEFAULT_PERF_UPLOAD_SWITCH_OPEN = false;
    private String a;
    private boolean b;
    private boolean c;
    private boolean d;
    private long e;
    private long f;
    private long g;

    public static class Builder {
        private int a = -1;
        private int b = -1;
        private int c = -1;
        private String d = null;
        private long e = -1;
        private long f = -1;
        private long g = -1;

        public Config build(Context context) {
            return new Config(context, this);
        }

        public Builder setAESKey(String str) {
            this.d = str;
            return this;
        }

        public Builder setEventEncrypted(boolean z) {
            this.a = z ? 1 : 0;
            return this;
        }

        public Builder setEventUploadFrequency(long j) {
            this.f = j;
            return this;
        }

        public Builder setEventUploadSwitchOpen(boolean z) {
            this.b = z ? 1 : 0;
            return this;
        }

        public Builder setMaxFileLength(long j) {
            this.e = j;
            return this;
        }

        public Builder setPerfUploadFrequency(long j) {
            this.g = j;
            return this;
        }

        public Builder setPerfUploadSwitchOpen(boolean z) {
            this.c = z ? 1 : 0;
            return this;
        }
    }

    private Config() {
        this.b = true;
        this.c = false;
        this.d = false;
        this.e = 1048576L;
        this.f = 86400L;
        this.g = 86400L;
    }

    private Config(Context context, Builder builder) {
        this.b = true;
        this.c = false;
        this.d = false;
        this.e = 1048576L;
        this.f = 86400L;
        this.g = 86400L;
    }

    public static Config defaultConfig(Context context) {
        return getBuilder().build(context);
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public long getEventUploadFrequency() {
        return this.f;
    }

    public long getMaxFileLength() {
        return this.e;
    }

    public long getPerfUploadFrequency() {
        return this.g;
    }

    public boolean isEventEncrypted() {
        return this.b;
    }

    public boolean isEventUploadSwitchOpen() {
        return this.c;
    }

    public boolean isPerfUploadSwitchOpen() {
        return this.d;
    }

    public String toString() {
        return "";
    }
}
