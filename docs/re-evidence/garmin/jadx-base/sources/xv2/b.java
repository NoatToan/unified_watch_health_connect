package xv2;

import i3.e5;
import p005kotlin.Metadata;
import wr.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxv2/b;", "", "", "title", "message", "positiveText", "negativeText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f192276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f192277d;

    public b(String str, String str2, String str3, String str4) {
        kg.f.p(str, str2, str3, str4);
        this.f192274a = str;
        this.f192275b = str2;
        this.f192276c = str3;
        this.f192277d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f192274a.equals(bVar.f192274a) && this.f192275b.equals(bVar.f192275b) && this.f192276c.equals(bVar.f192276c) && this.f192277d.equals(bVar.f192277d);
    }

    public final int hashCode() {
        return this.f192277d.hashCode() + g.j(g.j(this.f192274a.hashCode() * 31, 31, this.f192275b), 31, this.f192276c);
    }

    public final String toString() {
        return e5.h(p6.b.i("LocalizedConfirmationMessage(title=", this.f192274a, ", message=", this.f192275b, ", positiveText="), this.f192276c, ", negativeText=", this.f192277d, ")");
    }
}
