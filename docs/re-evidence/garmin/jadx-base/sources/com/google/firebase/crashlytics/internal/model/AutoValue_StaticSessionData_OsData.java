package com.google.firebase.crashlytics.internal.model;

import hb.a;
import j20.x;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_StaticSessionData_OsData extends StaticSessionData.OsData {
    private final boolean isRooted;
    private final String osCodeName;
    private final String osRelease;

    public AutoValue_StaticSessionData_OsData(String str, String str2, boolean z14) {
        if (str == null) {
            x.l("Null osRelease");
            throw null;
        }
        this.osRelease = str;
        if (str2 == null) {
            x.l("Null osCodeName");
            throw null;
        }
        this.osCodeName = str2;
        this.isRooted = z14;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticSessionData.OsData) {
            StaticSessionData.OsData osData = (StaticSessionData.OsData) obj;
            if (this.osRelease.equals(osData.osRelease()) && this.osCodeName.equals(osData.osCodeName()) && this.isRooted == osData.isRooted()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.osRelease.hashCode() ^ 1000003) * 1000003) ^ this.osCodeName.hashCode()) * 1000003) ^ (this.isRooted ? 1231 : 1237);
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public boolean isRooted() {
        return this.isRooted;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String osCodeName() {
        return this.osCodeName;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String osRelease() {
        return this.osRelease;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("OsData{osRelease=");
        sb3.append(this.osRelease);
        sb3.append(", osCodeName=");
        sb3.append(this.osCodeName);
        sb3.append(", isRooted=");
        return a.k(sb3, this.isRooted, StringSubstitutor.DEFAULT_VAR_END);
    }
}
