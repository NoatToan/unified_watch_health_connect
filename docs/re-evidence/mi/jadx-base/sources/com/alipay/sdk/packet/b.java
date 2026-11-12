package com.alipay.sdk.packet;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5854b;

    public b(String str, String str2) {
        this.f5853a = str;
        this.f5854b = str2;
    }

    public String a() {
        return this.f5853a;
    }

    public String b() {
        return this.f5854b;
    }

    public JSONObject c() {
        if (TextUtils.isEmpty(this.f5854b)) {
            return null;
        }
        try {
            return new JSONObject(this.f5854b);
        } catch (Exception e) {
            com.alipay.sdk.util.c.d(e);
            return null;
        }
    }

    public String toString() {
        return String.format("<Letter envelop=%s body=%s>", this.f5853a, this.f5854b);
    }
}
