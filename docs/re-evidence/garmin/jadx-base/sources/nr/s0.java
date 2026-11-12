package nr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnr/s0;", "", "", "title", "contentDescription", "Lkotlin/Function0;", "", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f127320c;

    public s0(String str, String str2, e23.a<Unit> aVar) {
        str.getClass();
        str2.getClass();
        this.f127318a = str;
        this.f127319b = str2;
        this.f127320c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return p005kotlin.jvm.internal.s.g(this.f127318a, s0Var.f127318a) && p005kotlin.jvm.internal.s.g(this.f127319b, s0Var.f127319b) && p005kotlin.jvm.internal.s.g(this.f127320c, s0Var.f127320c);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f127318a.hashCode() * 31, 31, this.f127319b);
        e23.a<Unit> aVar = this.f127320c;
        return iJ + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return n23.j.i(p6.b.i("TagData(title=", this.f127318a, ", contentDescription=", this.f127319b, ", onClick="), this.f127320c, ")");
    }

    public /* synthetic */ s0(String str, String str2, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? str : str2, (i14 & 4) != 0 ? null : aVar);
    }
}
