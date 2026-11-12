package sb0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import q6.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lsb0/b;", "", "", "syncStarted", "", "syncPercent", "firmwareUpdateStarted", "Lz90/b;", "syncResult", "", "failedCount", "<init>", "(ZFZLz90/b;I)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f158390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f158391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f158392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z90.b f158393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f158394e;

    public /* synthetic */ b(boolean z14, float f14, boolean z15, z90.b bVar, int i14, int i15, j jVar) {
        this((i15 & 1) != 0 ? false : z14, (i15 & 2) != 0 ? 0.0f : f14, (i15 & 4) != 0 ? false : z15, (i15 & 8) != 0 ? null : bVar, (i15 & 16) != 0 ? 0 : i14);
    }

    public static b a(b bVar, float f14, boolean z14, int i14) {
        boolean z15 = (i14 & 1) != 0 ? bVar.f158390a : true;
        if ((i14 & 2) != 0) {
            f14 = bVar.f158391b;
        }
        float f15 = f14;
        if ((i14 & 4) != 0) {
            z14 = bVar.f158392c;
        }
        z90.b bVar2 = bVar.f158393d;
        int i15 = bVar.f158394e;
        bVar.getClass();
        return new b(z15, f15, z14, bVar2, i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f158390a == bVar.f158390a && Float.compare(this.f158391b, bVar.f158391b) == 0 && this.f158392c == bVar.f158392c && this.f158393d == bVar.f158393d && this.f158394e == bVar.f158394e;
    }

    public final int hashCode() {
        int iG = f.g(f.d(this.f158391b, Boolean.hashCode(this.f158390a) * 31, 31), 31, this.f158392c);
        z90.b bVar = this.f158393d;
        return Integer.hashCode(this.f158394e) + ((iG + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeviceSetupSyncState(syncStarted=");
        sb3.append(this.f158390a);
        sb3.append(", syncPercent=");
        sb3.append(this.f158391b);
        sb3.append(", firmwareUpdateStarted=");
        sb3.append(this.f158392c);
        sb3.append(", syncResult=");
        sb3.append(this.f158393d);
        sb3.append(", failedCount=");
        return am.j.q(sb3, this.f158394e, ")");
    }

    public b(boolean z14, float f14, boolean z15, z90.b bVar, int i14) {
        this.f158390a = z14;
        this.f158391b = f14;
        this.f158392c = z15;
        this.f158393d = bVar;
        this.f158394e = i14;
    }

    public b() {
        this(false, 0.0f, false, null, 0, 31, null);
    }
}
