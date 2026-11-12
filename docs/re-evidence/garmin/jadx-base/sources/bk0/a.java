package bk0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbk0/a;", "", "", "name", "description", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18468c;

    public a(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f18466a = str;
        this.f18467b = str2;
        this.f18468c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18466a.equals(aVar.f18466a) && this.f18467b.equals(aVar.f18467b) && s.g(this.f18468c, aVar.f18468c);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f18466a.hashCode() * 31, 31, this.f18467b);
        String str = this.f18468c;
        return iJ + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return am.j.o(this.f18468c, ")", p6.b.i("FeatureBenefitData(name=", this.f18466a, ", description=", this.f18467b, ", version="));
    }
}
