package gu0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgu0/c;", "", "", "deviceId", "", "transitionNumber", "<init>", "(JI)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f79045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79046b;

    public /* synthetic */ c(long j8, int i14, int i15, j jVar) {
        this(j8, (i15 & 2) != 0 ? 0 : i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f79045a == cVar.f79045a && this.f79046b == cVar.f79046b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f79046b) + (Long.hashCode(this.f79045a) * 31);
    }

    public final String toString() {
        StringBuilder sbW = h.w(this.f79046b, "TransitionCounterRecord(deviceId=", ", transitionNumber=", this.f79045a);
        sbW.append(")");
        return sbW.toString();
    }

    public c(long j8, int i14) {
        this.f79045a = j8;
        this.f79046b = i14;
    }
}
