package rj0;

import c80.q;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u000eB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lrj0/c;", "", "Lc80/q;", "featureType", "", "title", "version", "subtitle", "listRowImageUrlPath", "", "Lrj0/d;", "pages", "<init>", "(Lc80/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f152974g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f152975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f152978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f152979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<d> f152980f;

    public c(q qVar, String str, String str2, String str3, String str4, List<d> list) {
        qVar.getClass();
        str.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.f152975a = qVar;
        this.f152976b = str;
        this.f152977c = str2;
        this.f152978d = str3;
        this.f152979e = str4;
        this.f152980f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f152975a == cVar.f152975a && this.f152976b.equals(cVar.f152976b) && s.g(this.f152977c, cVar.f152977c) && this.f152978d.equals(cVar.f152978d) && this.f152979e.equals(cVar.f152979e) && this.f152980f.equals(cVar.f152980f);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f152975a.hashCode() * 31, 31, this.f152976b);
        String str = this.f152977c;
        return this.f152980f.hashCode() + wr.g.j(wr.g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.f152978d), 31, this.f152979e);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GCPlusFeatureEducationContent(featureType=");
        sb3.append(this.f152975a);
        sb3.append(", title=");
        sb3.append(this.f152976b);
        sb3.append(", version=");
        sn.a.t(sb3, this.f152977c, ", subtitle=", this.f152978d, ", listRowImageUrlPath=");
        sb3.append(this.f152979e);
        sb3.append(", pages=");
        sb3.append(this.f152980f);
        sb3.append(")");
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrj0/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
