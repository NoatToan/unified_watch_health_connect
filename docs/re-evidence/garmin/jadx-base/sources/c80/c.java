package c80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lc80/c;", "", "", "activityId", "", "isOwnActivity", "isCloudPositioningProcessing", "", "activityStartTimeGMT", "displayName", "<init>", "(JZZLjava/lang/String;Ljava/lang/String;)V", "gcm-domain-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25312e;

    public c(long j8, boolean z14, boolean z15, String str, String str2) {
        this.f25308a = j8;
        this.f25309b = z14;
        this.f25310c = z15;
        this.f25311d = str;
        this.f25312e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f25308a == cVar.f25308a && this.f25309b == cVar.f25309b && this.f25310c == cVar.f25310c && p005kotlin.jvm.internal.s.g(this.f25311d, cVar.f25311d) && p005kotlin.jvm.internal.s.g(this.f25312e, cVar.f25312e);
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(Long.hashCode(this.f25308a) * 31, 31, this.f25309b), 31, this.f25310c);
        String str = this.f25311d;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25312e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityInfo(activityId=");
        sb3.append(this.f25308a);
        sb3.append(", isOwnActivity=");
        sb3.append(this.f25309b);
        sb3.append(", isCloudPositioningProcessing=");
        sb3.append(this.f25310c);
        sb3.append(", activityStartTimeGMT=");
        sb3.append(this.f25311d);
        return v.e0.h(sb3, ", displayName=", this.f25312e, ")");
    }
}
