package defpackage;

import android.app.PendingIntent;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class qht extends h7n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31537b;
    public final int c;
    public final long d;
    public final long e;
    public final List f;
    public final List g;
    public final PendingIntent h;
    public final List i;

    public qht(int i, int i2, int i3, long j, long j2, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.f31536a = i;
        this.f31537b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = list;
        this.g = list2;
        this.h = pendingIntent;
        this.i = list3;
    }

    @Override // defpackage.h7n
    public final long a() {
        return this.d;
    }

    @Override // defpackage.h7n
    public final int b() {
        return this.c;
    }

    @Override // defpackage.h7n
    @Deprecated
    public final PendingIntent c() {
        return this.h;
    }

    @Override // defpackage.h7n
    public final int d() {
        return this.f31536a;
    }

    @Override // defpackage.h7n
    public final int e() {
        return this.f31537b;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        PendingIntent pendingIntent;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h7n) {
            h7n h7nVar = (h7n) obj;
            if (this.f31536a == h7nVar.d() && this.f31537b == h7nVar.e() && this.c == h7nVar.b() && this.d == h7nVar.a() && this.e == h7nVar.f() && ((list = this.f) != null ? list.equals(h7nVar.h()) : h7nVar.h() == null) && ((list2 = this.g) != null ? list2.equals(h7nVar.g()) : h7nVar.g() == null) && ((pendingIntent = this.h) != null ? pendingIntent.equals(h7nVar.c()) : h7nVar.c() == null) && ((list3 = this.i) != null ? list3.equals(h7nVar.i()) : h7nVar.i() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.h7n
    public final long f() {
        return this.e;
    }

    @Override // defpackage.h7n
    public final List g() {
        return this.g;
    }

    @Override // defpackage.h7n
    public final List h() {
        return this.f;
    }

    public final int hashCode() {
        int i = ((((this.f31536a ^ 1000003) * 1000003) ^ this.f31537b) * 1000003) ^ this.c;
        long j = this.d;
        long j2 = j ^ (j >>> 32);
        long j3 = this.e;
        long j4 = (j3 >>> 32) ^ j3;
        List list = this.f;
        int iHashCode = ((((((i * 1000003) ^ ((int) j2)) * 1000003) ^ ((int) j4)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.g;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.h;
        int iHashCode3 = (iHashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.i;
        return iHashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // defpackage.h7n
    public final List i() {
        return this.i;
    }

    public final String toString() {
        return "SplitInstallSessionState{sessionId=" + this.f31536a + ", status=" + this.f31537b + ", errorCode=" + this.c + ", bytesDownloaded=" + this.d + ", totalBytesToDownload=" + this.e + ", moduleNamesNullable=" + String.valueOf(this.f) + ", languagesNullable=" + String.valueOf(this.g) + ", resolutionIntent=" + String.valueOf(this.h) + ", splitFileIntents=" + String.valueOf(this.i) + "}";
    }
}
