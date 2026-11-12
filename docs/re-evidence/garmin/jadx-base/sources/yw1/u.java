package yw1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyw1/u;", "", "", "totalSets", "", "totalTime", "<init>", "(ILjava/lang/String;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f199983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199984b;

    public u(int i14, String str) {
        str.getClass();
        this.f199983a = i14;
        this.f199984b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f199983a == uVar.f199983a && this.f199984b.equals(uVar.f199984b);
    }

    public final int hashCode() {
        return this.f199984b.hashCode() + (Integer.hashCode(this.f199983a) * 31);
    }

    public final String toString() {
        return o2.c.e(this.f199983a, "StrengthPerformanceStats(totalSets=", ", totalTime=", this.f199984b, ")");
    }
}
