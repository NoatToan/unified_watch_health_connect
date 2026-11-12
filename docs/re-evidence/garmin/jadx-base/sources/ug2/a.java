package ug2;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lug2/a;", "", "", "messageFormatting", "", "message", "Lug2/b;", "size", "Lug2/c;", "weight", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lug2/b;Lug2/c;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f170674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f170676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f170677d;

    public a(Integer num, String str, b bVar, c cVar) {
        str.getClass();
        this.f170674a = num;
        this.f170675b = str;
        this.f170676c = bVar;
        this.f170677d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f170674a, aVar.f170674a) && p005kotlin.jvm.internal.s.g(this.f170675b, aVar.f170675b) && this.f170676c == aVar.f170676c && this.f170677d == aVar.f170677d;
    }

    public final int hashCode() {
        Integer num = this.f170674a;
        int iJ = wr.g.j((num == null ? 0 : num.hashCode()) * 31, 31, this.f170675b);
        b bVar = this.f170676c;
        int iHashCode = (iJ + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c cVar = this.f170677d;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = l2.f("AlertMessage(messageFormatting=", this.f170674a, ", message=", this.f170675b, ", size=");
        sbF.append(this.f170676c);
        sbF.append(", weight=");
        sbF.append(this.f170677d);
        sbF.append(")");
        return sbF.toString();
    }

    public /* synthetic */ a(Integer num, String str, b bVar, c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, str, bVar, cVar);
    }
}
