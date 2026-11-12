package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class y extends StaticSessionData.OsData {
    private final String a;
    private final String b;
    private final boolean c;

    public y(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "Null osRelease");
        this.a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.b = str2;
        this.c = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.OsData)) {
            return false;
        }
        StaticSessionData.OsData osData = (StaticSessionData.OsData) obj;
        return this.a.equals(osData.osRelease()) && this.b.equals(osData.osCodeName()) && this.c == osData.isRooted();
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public boolean isRooted() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String osCodeName() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String osRelease() {
        return this.a;
    }

    public String toString() {
        return "OsData{osRelease=" + this.a + ", osCodeName=" + this.b + ", isRooted=" + this.c + com.alipay.sdk.m.u.i.d;
    }
}
