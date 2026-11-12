package nr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnr/o0;", "", "", "title", "actionText", "actionContentDescription", "Lkotlin/Function0;", "", "onAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f127275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.a<Unit> f127276d;

    public /* synthetic */ o0(String str, String str2, String str3, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? "" : str3, (i14 & 8) != 0 ? null : aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return p005kotlin.jvm.internal.s.g(this.f127273a, o0Var.f127273a) && p005kotlin.jvm.internal.s.g(this.f127274b, o0Var.f127274b) && p005kotlin.jvm.internal.s.g(this.f127275c, o0Var.f127275c) && p005kotlin.jvm.internal.s.g(this.f127276d, o0Var.f127276d);
    }

    public final int hashCode() {
        int iHashCode = this.f127273a.hashCode() * 31;
        String str = this.f127274b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f127275c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        e23.a<Unit> aVar = this.f127276d;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("SectionHeaderData(title=", this.f127273a, ", actionText=", this.f127274b, ", actionContentDescription=");
        sbI.append(this.f127275c);
        sbI.append(", onAction=");
        sbI.append(this.f127276d);
        sbI.append(")");
        return sbI.toString();
    }

    public o0(String str, String str2, String str3, e23.a<Unit> aVar) {
        str.getClass();
        this.f127273a = str;
        this.f127274b = str2;
        this.f127275c = str3;
        this.f127276d = aVar;
    }
}
