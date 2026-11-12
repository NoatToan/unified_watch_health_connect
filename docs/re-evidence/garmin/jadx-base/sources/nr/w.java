package nr;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnr/w;", "", "", TtmlNode.ATTR_ID, "", "name", "imageUrl", "subtitle", "Lkotlin/Function0;", "", "onClick", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f127392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f127394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f127395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.a<Unit> f127396e;

    public /* synthetic */ w(long j8, String str, String str2, String str3, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, str, str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f127392a == wVar.f127392a && p005kotlin.jvm.internal.s.g(this.f127393b, wVar.f127393b) && p005kotlin.jvm.internal.s.g(this.f127394c, wVar.f127394c) && p005kotlin.jvm.internal.s.g(this.f127395d, wVar.f127395d) && p005kotlin.jvm.internal.s.g(this.f127396e, wVar.f127396e);
    }

    public final int hashCode() {
        int iJ = wr.g.j(Long.hashCode(this.f127392a) * 31, 31, this.f127393b);
        String str = this.f127394c;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f127395d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        e23.a<Unit> aVar = this.f127396e;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f127392a, "DogRowData(id=", ", name=", this.f127393b);
        sn.a.t(sbK, ", imageUrl=", this.f127394c, ", subtitle=", this.f127395d);
        sbK.append(", onClick=");
        sbK.append(this.f127396e);
        sbK.append(")");
        return sbK.toString();
    }

    public w(long j8, String str, String str2, String str3, e23.a<Unit> aVar) {
        str.getClass();
        this.f127392a = j8;
        this.f127393b = str;
        this.f127394c = str2;
        this.f127395d = str3;
        this.f127396e = aVar;
    }
}
