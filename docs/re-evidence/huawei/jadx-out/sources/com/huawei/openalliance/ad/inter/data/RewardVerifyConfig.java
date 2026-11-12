package com.huawei.openalliance.ad.inter.data;

/* JADX INFO: loaded from: classes12.dex */
public class RewardVerifyConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19195b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f19196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f19197b;

        public Builder setUserId(String str) {
            this.f19197b = str;
            return this;
        }

        public Builder setData(String str) {
            this.f19196a = str;
            return this;
        }

        public RewardVerifyConfig build() {
            return new RewardVerifyConfig(this);
        }
    }

    public String getUserId() {
        return this.f19195b;
    }

    public String getData() {
        return this.f19194a;
    }

    private RewardVerifyConfig(Builder builder) {
        if (builder != null) {
            this.f19194a = builder.f19196a;
            this.f19195b = builder.f19197b;
        }
    }

    private RewardVerifyConfig() {
    }
}
