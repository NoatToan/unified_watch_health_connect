package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class v extends StaticSessionData {
    private final StaticSessionData.AppData a;
    private final StaticSessionData.OsData b;
    private final StaticSessionData.DeviceData c;

    public v(StaticSessionData.AppData appData, StaticSessionData.OsData osData, StaticSessionData.DeviceData deviceData) {
        Objects.requireNonNull(appData, "Null appData");
        this.a = appData;
        Objects.requireNonNull(osData, "Null osData");
        this.b = osData;
        Objects.requireNonNull(deviceData, "Null deviceData");
        this.c = deviceData;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.AppData appData() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.DeviceData deviceData() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData)) {
            return false;
        }
        StaticSessionData staticSessionData = (StaticSessionData) obj;
        return this.a.equals(staticSessionData.appData()) && this.b.equals(staticSessionData.osData()) && this.c.equals(staticSessionData.deviceData());
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.OsData osData() {
        return this.b;
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + com.alipay.sdk.m.u.i.d;
    }
}
