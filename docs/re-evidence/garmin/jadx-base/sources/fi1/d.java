package fi1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfi1/d;", "", "Lfi1/a;", "info", "", "connected", "<init>", "(Lfi1/a;Z)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f71773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f71774b;

    public d(a aVar, boolean z14) {
        aVar.getClass();
        this.f71773a = aVar;
        this.f71774b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f71773a.equals(dVar.f71773a) && this.f71774b == dVar.f71774b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71774b) + (this.f71773a.hashCode() * 31);
    }

    public final String toString() {
        return "DeviceState(info=" + this.f71773a + ", connected=" + this.f71774b + ")";
    }
}
