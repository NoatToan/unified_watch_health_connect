package r72;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lr72/i;", "", "", "pageCount", "", "showBanner", "showEmpty", "Lr72/c;", "dataBrickLayout", "<init>", "(IZZLr72/c;)V", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f151178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f151179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f151180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f151181d;

    public /* synthetic */ i(int i14, boolean z14, boolean z15, c cVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 3 : i14, (i15 & 2) != 0 ? false : z14, (i15 & 4) != 0 ? true : z15, (i15 & 8) != 0 ? c.TWO : cVar);
    }

    public static i a(i iVar, int i14, boolean z14, boolean z15, c cVar, int i15) {
        if ((i15 & 1) != 0) {
            i14 = iVar.f151178a;
        }
        if ((i15 & 2) != 0) {
            z14 = iVar.f151179b;
        }
        if ((i15 & 4) != 0) {
            z15 = iVar.f151180c;
        }
        if ((i15 & 8) != 0) {
            cVar = iVar.f151181d;
        }
        iVar.getClass();
        cVar.getClass();
        return new i(i14, z14, z15, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f151178a == iVar.f151178a && this.f151179b == iVar.f151179b && this.f151180c == iVar.f151180c && this.f151181d == iVar.f151181d;
    }

    public final int hashCode() {
        return this.f151181d.hashCode() + q6.f.g(q6.f.g(Integer.hashCode(this.f151178a) * 31, 31, this.f151179b), 31, this.f151180c);
    }

    public final String toString() {
        return "ReportsSettings(pageCount=" + this.f151178a + ", showBanner=" + this.f151179b + ", showEmpty=" + this.f151180c + ", dataBrickLayout=" + this.f151181d + ")";
    }

    public i(int i14, boolean z14, boolean z15, c cVar) {
        cVar.getClass();
        this.f151178a = i14;
        this.f151179b = z14;
        this.f151180c = z15;
        this.f151181d = cVar;
    }

    public i() {
        this(0, false, false, null, 15, null);
    }
}
