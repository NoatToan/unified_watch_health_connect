package com.huami.discovery.bridge.jsbridge.api;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public class NavigateToHandlerOptions {
    private Context a;
    private String b;
    private String c;
    private String d;

    public static class Builder {
        private Context a;
        private String b;
        private String c;
        private String d;

        public Builder(Context context) {
            this.a = context;
        }

        public NavigateToHandlerOptions build() {
            return new NavigateToHandlerOptions(this);
        }

        public Builder data(String str) {
            this.d = str;
            return this;
        }

        public Builder jumpSource(String str) {
            this.c = str;
            return this;
        }

        public Builder position(String str) {
            this.b = str;
            return this;
        }
    }

    public NavigateToHandlerOptions(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    public Context getContext() {
        return this.a;
    }

    public String getData() {
        return this.d;
    }

    public String getJumpSource() {
        return this.c;
    }

    public String getPosition() {
        return this.b;
    }
}
