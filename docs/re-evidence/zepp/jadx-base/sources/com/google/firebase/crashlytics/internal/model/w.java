package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class w extends StaticSessionData.AppData {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final DevelopmentPlatformProvider f;

    public w(String str, String str2, String str3, String str4, int i, DevelopmentPlatformProvider developmentPlatformProvider) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.d = str4;
        this.e = i;
        Objects.requireNonNull(developmentPlatformProvider, "Null developmentPlatformProvider");
        this.f = developmentPlatformProvider;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String appIdentifier() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public int deliveryMechanism() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public DevelopmentPlatformProvider developmentPlatformProvider() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.AppData)) {
            return false;
        }
        StaticSessionData.AppData appData = (StaticSessionData.AppData) obj;
        return this.a.equals(appData.appIdentifier()) && this.b.equals(appData.versionCode()) && this.c.equals(appData.versionName()) && this.d.equals(appData.installUuid()) && this.e == appData.deliveryMechanism() && this.f.equals(appData.developmentPlatformProvider());
    }

    public int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String installUuid() {
        return this.d;
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + com.alipay.sdk.m.u.i.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String versionCode() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String versionName() {
        return this.c;
    }
}
