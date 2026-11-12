package com.android.installreferrer.api;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class ReferrerDetails {
    private static final String b = "install_referrer";
    private static final String c = "referrer_click_timestamp_seconds";
    private static final String d = "install_begin_timestamp_seconds";
    private final Bundle a;

    public ReferrerDetails(Bundle bundle) {
        this.a = bundle;
    }

    public long getInstallBeginTimestampSeconds() {
        return this.a.getLong(d);
    }

    public String getInstallReferrer() {
        return this.a.getString(b);
    }

    public long getReferrerClickTimestampSeconds() {
        return this.a.getLong(c);
    }
}
