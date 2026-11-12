package hk1;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lhk1/c;", "", "", "headline", "Li53/c;", "boldCopyBlocks", "defaultCopyBlocks", "positiveButton", "negativeButton", "<init>", "(Ljava/lang/String;Li53/c;Li53/c;Ljava/lang/String;Ljava/lang/String;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<String> f84128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<String> f84129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f84130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f84131e;

    public c(String str, i53.c cVar, i53.c cVar2, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? j53.l.b() : cVar, (i14 & 4) != 0 ? j53.l.b() : cVar2, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.f84127a, cVar.f84127a) && p005kotlin.jvm.internal.s.g(this.f84128b, cVar.f84128b) && p005kotlin.jvm.internal.s.g(this.f84129c, cVar.f84129c) && p005kotlin.jvm.internal.s.g(this.f84130d, cVar.f84130d) && p005kotlin.jvm.internal.s.g(this.f84131e, cVar.f84131e);
    }

    public final int hashCode() {
        String str = this.f84127a;
        int iA = l2.a(this.f84129c, l2.a(this.f84128b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f84130d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f84131e;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ConsentData(headline=");
        sb3.append(this.f84127a);
        sb3.append(", boldCopyBlocks=");
        sb3.append(this.f84128b);
        sb3.append(", defaultCopyBlocks=");
        sb3.append(this.f84129c);
        sb3.append(", positiveButton=");
        sb3.append(this.f84130d);
        sb3.append(", negativeButton=");
        return am.j.o(this.f84131e, ")", sb3);
    }

    public c(String str, i53.c<String> cVar, i53.c<String> cVar2, String str2, String str3) {
        cVar.getClass();
        cVar2.getClass();
        this.f84127a = str;
        this.f84128b = cVar;
        this.f84129c = cVar2;
        this.f84130d = str2;
        this.f84131e = str3;
    }

    public c() {
        this(null, null, null, null, null, 31, null);
    }
}
