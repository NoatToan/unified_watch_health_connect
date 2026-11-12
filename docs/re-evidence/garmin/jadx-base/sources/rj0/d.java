package rj0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u000bB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lrj0/d;", "", "", "title", "description", "Lrj0/g;", "media", "Lrj0/f;", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrj0/g;Lrj0/f;)V", "a", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f152981e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f152984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f152985d;

    public d(String str, String str2, g gVar, f fVar) {
        str.getClass();
        str2.getClass();
        gVar.getClass();
        this.f152982a = str;
        this.f152983b = str2;
        this.f152984c = gVar;
        this.f152985d = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f152982a.equals(dVar.f152982a) && this.f152983b.equals(dVar.f152983b) && this.f152984c.equals(dVar.f152984c) && s.g(this.f152985d, dVar.f152985d);
    }

    public final int hashCode() {
        int iHashCode = (this.f152984c.hashCode() + wr.g.j(this.f152982a.hashCode() * 31, 31, this.f152983b)) * 31;
        f fVar = this.f152985d;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("GCPlusFeatureEducationPageContent(title=", this.f152982a, ", description=", this.f152983b, ", media=");
        sbI.append(this.f152984c);
        sbI.append(", link=");
        sbI.append(this.f152985d);
        sbI.append(")");
        return sbI.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrj0/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
