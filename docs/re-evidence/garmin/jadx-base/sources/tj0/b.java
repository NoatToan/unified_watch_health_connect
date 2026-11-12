package tj0;

import am.j;
import c80.q;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\rBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ltj0/b;", "", "Lc80/q;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "name", "title", "subtitle", "caption", "version", "imageUrlPath", "<init>", "(Lc80/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f165115h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f165116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f165117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f165118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f165119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f165120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f165121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f165122g;

    public b(q qVar, String str, String str2, String str3, String str4, String str5, String str6) {
        qVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str6.getClass();
        this.f165116a = qVar;
        this.f165117b = str;
        this.f165118c = str2;
        this.f165119d = str3;
        this.f165120e = str4;
        this.f165121f = str5;
        this.f165122g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f165116a == bVar.f165116a && this.f165117b.equals(bVar.f165117b) && this.f165118c.equals(bVar.f165118c) && this.f165119d.equals(bVar.f165119d) && this.f165120e.equals(bVar.f165120e) && s.g(this.f165121f, bVar.f165121f) && this.f165122g.equals(bVar.f165122g);
    }

    public final int hashCode() {
        int iJ = g.j(g.j(g.j(g.j(this.f165116a.hashCode() * 31, 31, this.f165117b), 31, this.f165118c), 31, this.f165119d), 31, this.f165120e);
        String str = this.f165121f;
        return this.f165122g.hashCode() + ((iJ + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GCPlusPaywallFeatureContent(type=");
        sb3.append(this.f165116a);
        sb3.append(", name=");
        sb3.append(this.f165117b);
        sb3.append(", title=");
        sn.a.t(sb3, this.f165118c, ", subtitle=", this.f165119d, ", caption=");
        sn.a.t(sb3, this.f165120e, ", version=", this.f165121f, ", imageUrlPath=");
        return j.o(this.f165122g, ")", sb3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltj0/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
