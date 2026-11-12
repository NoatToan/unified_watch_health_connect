package l20;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ll20/o;", "", "", "value", "Ll20/p;", "labelType", "", "isPrimary", "<init>", "(Ljava/lang/String;Ll20/p;Z)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f109034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f109035c;

    public o(String str, p pVar, boolean z14) {
        str.getClass();
        pVar.getClass();
        this.f109033a = str;
        this.f109034b = pVar;
        this.f109035c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f109033a.equals(oVar.f109033a) && this.f109034b == oVar.f109034b && this.f109035c == oVar.f109035c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109035c) + ((this.f109034b.hashCode() + (this.f109033a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PhoneContactInfo(value=");
        sb3.append(this.f109033a);
        sb3.append(", labelType=");
        sb3.append(this.f109034b);
        sb3.append(", isPrimary=");
        return hb.a.k(sb3, this.f109035c, ")");
    }
}
