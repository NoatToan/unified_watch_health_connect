package dy1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ldy1/g;", "", "", "title", "Li53/c;", "Ldy1/h;", "exercises", "<init>", "(Ljava/lang/String;Li53/c;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<h> f61555b;

    public g(String str, i53.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? j53.l.b() : cVar);
    }

    public static g a(g gVar, i53.c cVar) {
        String str = gVar.f61554a;
        str.getClass();
        cVar.getClass();
        return new g(str, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p005kotlin.jvm.internal.s.g(this.f61554a, gVar.f61554a) && p005kotlin.jvm.internal.s.g(this.f61555b, gVar.f61555b);
    }

    public final int hashCode() {
        return this.f61555b.hashCode() + (this.f61554a.hashCode() * 31);
    }

    public final String toString() {
        return "EditPrimaryLiftScreenState(title=" + this.f61554a + ", exercises=" + this.f61555b + ")";
    }

    public g(String str, i53.c<h> cVar) {
        str.getClass();
        cVar.getClass();
        this.f61554a = str;
        this.f61555b = cVar;
    }

    public g() {
        this(null, null, 3, null);
    }
}
