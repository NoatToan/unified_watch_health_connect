package ib0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lib0/f;", "", "Li53/c;", "", "avatars", "Ljb0/a;", "permissionsDialogType", "Ljb0/c;", "selectedProfilePictureType", "", "isLoading", "isError", "", "lastUpdatedTimestamp", "<init>", "(Li53/c;Ljb0/a;Ljb0/c;ZZJ)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<String> f92457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb0.a f92458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb0.c f92459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f92460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f92461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f92462f;

    public f(i53.c cVar, jb0.a aVar, jb0.c cVar2, boolean z14, boolean z15, long j8, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j53.l.b() : cVar, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? null : cVar2, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? false : z15, (i14 & 32) != 0 ? 0L : j8);
    }

    public static f a(f fVar, i53.f fVar2, jb0.a aVar, jb0.c cVar, long j8, int i14) {
        i53.c<String> cVar2 = fVar2;
        if ((i14 & 1) != 0) {
            cVar2 = fVar.f92457a;
        }
        i53.c<String> cVar3 = cVar2;
        if ((i14 & 2) != 0) {
            aVar = fVar.f92458b;
        }
        jb0.a aVar2 = aVar;
        if ((i14 & 4) != 0) {
            cVar = fVar.f92459c;
        }
        jb0.c cVar4 = cVar;
        boolean z14 = (i14 & 8) != 0 ? fVar.f92460d : false;
        boolean z15 = (i14 & 16) != 0 ? fVar.f92461e : true;
        if ((i14 & 32) != 0) {
            j8 = fVar.f92462f;
        }
        fVar.getClass();
        cVar3.getClass();
        return new f(cVar3, aVar2, cVar4, z14, z15, j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.f92457a, fVar.f92457a) && p005kotlin.jvm.internal.s.g(this.f92458b, fVar.f92458b) && p005kotlin.jvm.internal.s.g(this.f92459c, fVar.f92459c) && this.f92460d == fVar.f92460d && this.f92461e == fVar.f92461e && this.f92462f == fVar.f92462f;
    }

    public final int hashCode() {
        int iHashCode = this.f92457a.hashCode() * 31;
        jb0.a aVar = this.f92458b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jb0.c cVar = this.f92459c;
        return Long.hashCode(this.f92462f) + q6.f.g(q6.f.g((iHashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31, 31, this.f92460d), 31, this.f92461e);
    }

    public final String toString() {
        return "ProfileImageUiState(avatars=" + this.f92457a + ", permissionsDialogType=" + this.f92458b + ", selectedProfilePictureType=" + this.f92459c + ", isLoading=" + this.f92460d + ", isError=" + this.f92461e + ", lastUpdatedTimestamp=" + this.f92462f + ")";
    }

    public f(i53.c<String> cVar, jb0.a aVar, jb0.c cVar2, boolean z14, boolean z15, long j8) {
        cVar.getClass();
        this.f92457a = cVar;
        this.f92458b = aVar;
        this.f92459c = cVar2;
        this.f92460d = z14;
        this.f92461e = z15;
        this.f92462f = j8;
    }

    public f() {
        this(null, null, null, false, false, 0L, 63, null);
    }
}
