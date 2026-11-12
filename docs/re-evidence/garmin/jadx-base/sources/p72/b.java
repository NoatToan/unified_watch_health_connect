package p72;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp72/b;", "", "Lu4/d;", "icon", "", "set", "subgroup", "<init>", "(Lu4/d;Ljava/lang/String;Ljava/lang/String;)V", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4.d f136315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136317c;

    public b(u4.d dVar, String str, String str2) {
        dVar.getClass();
        str.getClass();
        this.f136315a = dVar;
        this.f136316b = str;
        this.f136317c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f136315a, bVar.f136315a) && s.g(this.f136316b, bVar.f136316b) && s.g(this.f136317c, bVar.f136317c);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f136315a.hashCode() * 31, 31, this.f136316b);
        String str = this.f136317c;
        return iJ + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IconExample(icon=");
        sb3.append(this.f136315a);
        sb3.append(", set=");
        sb3.append(this.f136316b);
        sb3.append(", subgroup=");
        return am.j.o(this.f136317c, ")", sb3);
    }

    public /* synthetic */ b(u4.d dVar, String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dVar, str, (i14 & 4) != 0 ? null : str2);
    }
}
