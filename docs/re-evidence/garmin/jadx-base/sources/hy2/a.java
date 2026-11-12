package hy2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lhy2/a;", "", "", "deviceId", "", "messageExistInQueue", "messageAddedInQueue", "", "json", "<init>", "(JZZLjava/lang/String;)V", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f86369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f86370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f86371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f86372d;

    public a(long j8, boolean z14, boolean z15, String str) {
        this.f86369a = j8;
        this.f86370b = z14;
        this.f86371c = z15;
        this.f86372d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f86369a == aVar.f86369a && this.f86370b == aVar.f86370b && this.f86371c == aVar.f86371c && s.g(this.f86372d, aVar.f86372d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f86369a) * 31;
        boolean z14 = this.f86370b;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = (iHashCode + r14) * 31;
        boolean z15 = this.f86371c;
        int i15 = (i14 + (z15 ? 1 : z15)) * 31;
        String str = this.f86372d;
        return i15 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CheckDeviceFirmwareUpdateResponse(deviceId=" + this.f86369a + ", messageExistInQueue=" + this.f86370b + ", messageAddedInQueue=" + this.f86371c + ", json=" + this.f86372d + ")";
    }
}
