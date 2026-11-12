package com.huawei.openalliance.ad.processor.eventbeans;

/* JADX INFO: loaded from: classes41.dex */
public class MagLockEventInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f20058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f20059b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f20060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20061b;

        public Builder setPosition(String str) {
            this.f20061b = str;
            return this;
        }

        public Builder setFailReason(Integer num) {
            this.f20060a = num;
            return this;
        }

        public MagLockEventInfo build() {
            return new MagLockEventInfo(this);
        }
    }

    public String b() {
        return this.f20059b;
    }

    public Integer a() {
        return this.f20058a;
    }

    private MagLockEventInfo(Builder builder) {
        this.f20058a = builder.f20060a;
        this.f20059b = builder.f20061b;
    }
}
