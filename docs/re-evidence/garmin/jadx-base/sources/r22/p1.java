package r22;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lr22/p1;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "value", "", "valueIconId", "contentDescription", "helpContentDescription", "Lkotlin/Function0;", "", "onClickListener", "onHelpClickListener", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Le23/a;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f149795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f149796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f149797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.a<Unit> f149798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e23.a<Unit> f149799g;

    public /* synthetic */ p1(String str, String str2, Integer num, String str3, String str4, e23.a aVar, e23.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : aVar, (i14 & 64) != 0 ? null : aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return p005kotlin.jvm.internal.s.g(this.f149793a, p1Var.f149793a) && p005kotlin.jvm.internal.s.g(this.f149794b, p1Var.f149794b) && p005kotlin.jvm.internal.s.g(this.f149795c, p1Var.f149795c) && p005kotlin.jvm.internal.s.g(this.f149796d, p1Var.f149796d) && p005kotlin.jvm.internal.s.g(this.f149797e, p1Var.f149797e) && p005kotlin.jvm.internal.s.g(this.f149798f, p1Var.f149798f) && p005kotlin.jvm.internal.s.g(this.f149799g, p1Var.f149799g);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f149793a.hashCode() * 31, 31, this.f149794b);
        Integer num = this.f149795c;
        int iHashCode = (iJ + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f149796d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f149797e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        e23.a<Unit> aVar = this.f149798f;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        e23.a<Unit> aVar2 = this.f149799g;
        return iHashCode4 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("RowData(label=", this.f149793a, ", value=", this.f149794b, ", valueIconId=");
        p6.b.l(this.f149795c, ", contentDescription=", this.f149796d, ", helpContentDescription=", sbI);
        sbI.append(this.f149797e);
        sbI.append(", onClickListener=");
        sbI.append(this.f149798f);
        sbI.append(", onHelpClickListener=");
        return n23.j.i(sbI, this.f149799g, ")");
    }

    public p1(String str, String str2, Integer num, String str3, String str4, e23.a<Unit> aVar, e23.a<Unit> aVar2) {
        str.getClass();
        str2.getClass();
        this.f149793a = str;
        this.f149794b = str2;
        this.f149795c = num;
        this.f149796d = str3;
        this.f149797e = str4;
        this.f149798f = aVar;
        this.f149799g = aVar2;
    }
}
