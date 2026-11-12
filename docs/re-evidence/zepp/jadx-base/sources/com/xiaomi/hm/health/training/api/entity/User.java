package com.xiaomi.hm.health.training.api.entity;

/* JADX INFO: loaded from: classes21.dex */
public class User {
    private String a;
    private boolean b;
    private boolean c;
    private int d;

    public static class Builder {
        private String a;
        private boolean b;
        private boolean c;
        private int d;

        public User build() {
            return new User(this);
        }

        public Builder setAge(int i) {
            this.d = i;
            return this;
        }

        public Builder setBoundHrDevice(boolean z) {
            this.c = z;
            return this;
        }

        public Builder setGender(boolean z) {
            this.b = z;
            return this;
        }

        public Builder setUid(String str) {
            this.a = str;
            return this;
        }
    }

    private User(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.d = builder.d;
        this.c = builder.c;
    }

    public int getAge() {
        return this.d;
    }

    public String getUid() {
        return this.a;
    }

    public boolean hasBoundHrDevice() {
        return this.c;
    }

    public boolean isMale() {
        return this.b;
    }
}
