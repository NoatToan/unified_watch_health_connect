package com.google.android.play.integrity.internal;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes14.dex */
final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f53445b;

    public e(int i14, long j8) {
        this.f53444a = i14;
        this.f53445b = j8;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final int a() {
        return this.f53444a;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final long b() {
        return this.f53445b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f53444a == fVar.a() && this.f53445b == fVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f53445b;
        return ((int) (j8 ^ (j8 >>> 32))) ^ ((this.f53444a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EventRecord{eventType=");
        sb3.append(this.f53444a);
        sb3.append(", eventTimestamp=");
        return am.j.i(this.f53445b, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }
}
