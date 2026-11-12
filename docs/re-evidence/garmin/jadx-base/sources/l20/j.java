package l20;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ll20/j;", "", "", "value", "Ll20/k;", "labelType", "", "isPrimary", "<init>", "(Ljava/lang/String;Ll20/k;Z)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f109006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f109007c;

    public j(String str, k kVar, boolean z14) {
        str.getClass();
        kVar.getClass();
        this.f109005a = str;
        this.f109006b = kVar;
        this.f109007c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f109005a.equals(jVar.f109005a) && this.f109006b == jVar.f109006b && this.f109007c == jVar.f109007c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109007c) + ((this.f109006b.hashCode() + (this.f109005a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EmailContactInfo(value=");
        sb3.append(this.f109005a);
        sb3.append(", labelType=");
        sb3.append(this.f109006b);
        sb3.append(", isPrimary=");
        return hb.a.k(sb3, this.f109007c, ")");
    }
}
