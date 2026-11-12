package com.huawei.haf.bundle;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class InstallRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f5801c;

    private InstallRequest(Builder builder) {
        this.f5801c = builder.f5802b;
    }

    public static Builder b() {
        return new Builder();
    }

    public List<String> d() {
        return this.f5801c;
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<String> f5802b;

        private Builder() {
            this.f5802b = new ArrayList();
        }

        public Builder d(String str) {
            if (!TextUtils.isEmpty(str) && !this.f5802b.contains(str)) {
                this.f5802b.add(str);
            }
            return this;
        }

        public InstallRequest d() {
            return new InstallRequest(this);
        }
    }
}
