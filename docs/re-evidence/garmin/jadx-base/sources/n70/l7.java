package n70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ln70/l7;", "", "", "forceDeviceUpdate", "Lzr1/c;", "syncStatus", "bluetoothState", "Ln70/p1$a;", "deviceInfo", "Laz0/c$a;", "networkConnectionState", "<init>", "(ZLzr1/c;ZLn70/p1$a;Laz0/c$a;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f124395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zr1.c f124396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f124397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p1.a f124398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final az0.c.a f124399e;

    public l7(boolean z14, zr1.c cVar, boolean z15, p1.a aVar, az0.c.a aVar2) {
        cVar.getClass();
        aVar2.getClass();
        this.f124395a = z14;
        this.f124396b = cVar;
        this.f124397c = z15;
        this.f124398d = aVar;
        this.f124399e = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7)) {
            return false;
        }
        l7 l7Var = (l7) obj;
        return this.f124395a == l7Var.f124395a && this.f124396b.equals(l7Var.f124396b) && this.f124397c == l7Var.f124397c && p005kotlin.jvm.internal.s.g(this.f124398d, l7Var.f124398d) && this.f124399e == l7Var.f124399e;
    }

    public final int hashCode() {
        int iG = q6.f.g((this.f124396b.hashCode() + (Boolean.hashCode(this.f124395a) * 31)) * 31, 31, this.f124397c);
        p1.a aVar = this.f124398d;
        return this.f124399e.hashCode() + ((iG + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    public final String toString() {
        return "SyncStatusHolder(forceDeviceUpdate=" + this.f124395a + ", syncStatus=" + this.f124396b + ", bluetoothState=" + this.f124397c + ", deviceInfo=" + this.f124398d + ", networkConnectionState=" + this.f124399e + ")";
    }
}
