package nr;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnr/z;", "", "", "title", "subtitle", TtmlNode.TAG_METADATA, "Lu4/d;", "icon", "", "iconColorResId", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu4/d;Ljava/lang/Integer;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f127597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u4.d f127598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f127599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f127600f;

    public /* synthetic */ z(String str, String str2, String str3, u4.d dVar, Integer num, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : dVar, (i14 & 16) != 0 ? null : num, (i14 & 32) != 0 ? null : str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return p005kotlin.jvm.internal.s.g(this.f127595a, zVar.f127595a) && p005kotlin.jvm.internal.s.g(this.f127596b, zVar.f127596b) && p005kotlin.jvm.internal.s.g(this.f127597c, zVar.f127597c) && p005kotlin.jvm.internal.s.g(this.f127598d, zVar.f127598d) && p005kotlin.jvm.internal.s.g(this.f127599e, zVar.f127599e) && p005kotlin.jvm.internal.s.g(this.f127600f, zVar.f127600f);
    }

    public final int hashCode() {
        int iHashCode = this.f127595a.hashCode() * 31;
        String str = this.f127596b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f127597c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        u4.d dVar = this.f127598d;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Integer num = this.f127599e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f127600f;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("EvaluationRowData(title=", this.f127595a, ", subtitle=", this.f127596b, ", metadata=");
        sbI.append(this.f127597c);
        sbI.append(", icon=");
        sbI.append(this.f127598d);
        sbI.append(", iconColorResId=");
        sbI.append(this.f127599e);
        sbI.append(", description=");
        sbI.append(this.f127600f);
        sbI.append(")");
        return sbI.toString();
    }

    public z(String str, String str2, String str3, u4.d dVar, Integer num, String str4) {
        str.getClass();
        this.f127595a = str;
        this.f127596b = str2;
        this.f127597c = str3;
        this.f127598d = dVar;
        this.f127599e = num;
        this.f127600f = str4;
    }
}
