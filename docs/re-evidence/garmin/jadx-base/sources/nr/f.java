package nr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lnr/f;", "", "", "title", "subtitle", "Lu4/d;", "icon", "Lkotlin/Function0;", "", "onItemSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lu4/d;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u4.d f127037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.a<Unit> f127038d;

    public /* synthetic */ f(String str, String str2, u4.d dVar, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : dVar, (i14 & 8) != 0 ? null : aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.f127035a, fVar.f127035a) && p005kotlin.jvm.internal.s.g(this.f127036b, fVar.f127036b) && p005kotlin.jvm.internal.s.g(this.f127037c, fVar.f127037c) && p005kotlin.jvm.internal.s.g(this.f127038d, fVar.f127038d);
    }

    public final int hashCode() {
        int iHashCode = this.f127035a.hashCode() * 31;
        String str = this.f127036b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        u4.d dVar = this.f127037c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e23.a<Unit> aVar = this.f127038d;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("Navigation(title=", this.f127035a, ", subtitle=", this.f127036b, ", icon=");
        sbI.append(this.f127037c);
        sbI.append(", onItemSelected=");
        sbI.append(this.f127038d);
        sbI.append(")");
        return sbI.toString();
    }

    public f(String str, String str2, u4.d dVar, e23.a<Unit> aVar) {
        str.getClass();
        this.f127035a = str;
        this.f127036b = str2;
        this.f127037c = dVar;
        this.f127038d = aVar;
    }
}
