package jc0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljc0/c;", "", "", "percentage", "Ljc0/b;", "chargingStatus", "<init>", "(ILjc0/b;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f98132b;

    public /* synthetic */ c(int i14, b bVar, int i15, j jVar) {
        this(i14, (i15 & 2) != 0 ? null : bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f98131a == cVar.f98131a && this.f98132b == cVar.f98132b;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f98131a) * 31;
        b bVar = this.f98132b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "DeviceBatteryInfo(percentage=" + this.f98131a + ", chargingStatus=" + this.f98132b + ")";
    }

    public c(int i14, b bVar) {
        this.f98131a = i14;
        this.f98132b = bVar;
    }
}
