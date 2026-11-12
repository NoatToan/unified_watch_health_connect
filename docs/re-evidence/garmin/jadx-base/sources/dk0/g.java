package dk0;

import i3.e5;
import o4.v0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldk0/g;", "", "Lo4/v0;", "image", "", "title", "subtitle", "version", "<init>", "(Lo4/v0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f60181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f60184d;

    public g(v0 v0Var, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f60181a = v0Var;
        this.f60182b = str;
        this.f60183c = str2;
        this.f60184d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f60181a, gVar.f60181a) && this.f60182b.equals(gVar.f60182b) && this.f60183c.equals(gVar.f60183c) && s.g(this.f60184d, gVar.f60184d);
    }

    public final int hashCode() {
        v0 v0Var = this.f60181a;
        int iJ = wr.g.j(wr.g.j((v0Var == null ? 0 : v0Var.hashCode()) * 31, 31, this.f60182b), 31, this.f60183c);
        String str = this.f60184d;
        return iJ + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GCPlusPaywallCarouselCardData(image=");
        sb3.append(this.f60181a);
        sb3.append(", title=");
        sb3.append(this.f60182b);
        sb3.append(", subtitle=");
        return e5.h(sb3, this.f60183c, ", version=", this.f60184d, ")");
    }
}
