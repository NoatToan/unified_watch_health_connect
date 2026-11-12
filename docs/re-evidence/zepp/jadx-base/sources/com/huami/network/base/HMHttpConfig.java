package com.huami.network.base;

/* JADX INFO: loaded from: classes6.dex */
public class HMHttpConfig {
    public static final String CHARSET_NAME_UTF8 = "utf-8";
    public static final int DEFAULT_RETRY_TIMES = 1;
    public static final int DEFAULT_TIMEOUT_MS = 20000;
    private boolean a;
    private boolean b;
    private int c;
    private int d;

    public static class Builder {
        private HMHttpConfig a = new HMHttpConfig();

        private Builder() {
        }

        public static Builder get() {
            return new Builder();
        }

        public HMHttpConfig create() {
            return this.a;
        }

        public Builder setRetries(int i) {
            this.a.c = i;
            return this;
        }

        public Builder setSupportGzip(boolean z) {
            this.a.b = z;
            return this;
        }

        public Builder setSupportHttps(boolean z) {
            this.a.a = z;
            return this;
        }

        public Builder setTimeout(int i) {
            this.a.d = i;
            return this;
        }
    }

    public static class b {
        public static final HMHttpConfig a = Builder.get().create();

        private b() {
        }
    }

    private HMHttpConfig e(Object obj) {
        return (HMHttpConfig) obj;
    }

    public static HMHttpConfig getDefault() {
        return b.a;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof HMHttpConfig) && (obj == this || (this.a == e(obj).a && this.b == e(obj).b && this.c == e(obj).c && this.d == e(obj).d));
    }

    public int getRetries() {
        return this.c;
    }

    public int getTimeout() {
        return this.d;
    }

    public boolean isSupportGzip() {
        return this.b;
    }

    public boolean isSupportHttps() {
        return this.a;
    }

    private HMHttpConfig() {
        this.a = true;
        this.b = true;
        this.c = 1;
        this.d = 20000;
    }
}
