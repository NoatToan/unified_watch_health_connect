package com.xiaomi.hm.health.wxapi;

/* JADX INFO: loaded from: classes22.dex */
public class WeChatAPIParams {
    private String a;
    private String b;
    private String c;
    private int d;

    public static class Builder {
        private String a;
        private String b;
        private String c;
        private int d;

        public Builder appid(String appid) {
            this.a = appid;
            return this;
        }

        public WeChatAPIParams build() {
            return new WeChatAPIParams(this);
        }

        public Builder miniprogramType(int miniprogramType) {
            this.d = miniprogramType;
            return this;
        }

        public Builder path(String path) {
            this.c = path;
            return this;
        }

        public Builder userName(String userName) {
            this.b = userName;
            return this;
        }
    }

    public WeChatAPIParams(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    public String getAppid() {
        return this.a;
    }

    public int getMiniprogramType() {
        return this.d;
    }

    public String getPath() {
        return this.c;
    }

    public String getUserName() {
        return this.b;
    }
}
