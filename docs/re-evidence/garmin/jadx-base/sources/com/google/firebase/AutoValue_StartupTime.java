package com.google.firebase;

import am.j;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_StartupTime extends StartupTime {
    private final long elapsedRealtime;
    private final long epochMillis;
    private final long uptimeMillis;

    public AutoValue_StartupTime(long j8, long j14, long j15) {
        this.epochMillis = j8;
        this.elapsedRealtime = j14;
        this.uptimeMillis = j15;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StartupTime) {
            StartupTime startupTime = (StartupTime) obj;
            if (this.epochMillis == startupTime.getEpochMillis() && this.elapsedRealtime == startupTime.getElapsedRealtime() && this.uptimeMillis == startupTime.getUptimeMillis()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.StartupTime
    public long getElapsedRealtime() {
        return this.elapsedRealtime;
    }

    @Override // com.google.firebase.StartupTime
    public long getEpochMillis() {
        return this.epochMillis;
    }

    @Override // com.google.firebase.StartupTime
    public long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public int hashCode() {
        long j8 = this.epochMillis;
        long j14 = this.elapsedRealtime;
        int i14 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j14 ^ (j14 >>> 32)))) * 1000003;
        long j15 = this.uptimeMillis;
        return i14 ^ ((int) ((j15 >>> 32) ^ j15));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("StartupTime{epochMillis=");
        sb3.append(this.epochMillis);
        sb3.append(", elapsedRealtime=");
        sb3.append(this.elapsedRealtime);
        sb3.append(", uptimeMillis=");
        return j.i(this.uptimeMillis, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }
}
