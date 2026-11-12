package ku0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lku0/a;", "", "", TtmlNode.ATTR_ID, "title", "description", "", "phoneNumberID", "", "showWarning", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f106538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f106539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f106540e;

    public /* synthetic */ a(String str, String str2, String str3, long j8, boolean z14, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? "" : str2, str3, j8, (i14 & 16) != 0 ? false : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f106536a, aVar.f106536a) && s.g(this.f106537b, aVar.f106537b) && s.g(this.f106538c, aVar.f106538c) && this.f106539d == aVar.f106539d && this.f106540e == aVar.f106540e;
    }

    public final int hashCode() {
        String str = this.f106536a;
        int iJ = g.j((str == null ? 0 : str.hashCode()) * 31, 31, this.f106537b);
        String str2 = this.f106538c;
        return Boolean.hashCode(this.f106540e) + q6.f.e((iJ + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f106539d);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("LiveEventContactListItem(id=", this.f106536a, ", title=", this.f106537b, ", description=");
        e5.s(this.f106539d, this.f106538c, ", phoneNumberID=", sbI);
        return com.airbnb.lottie.animation.keyframe.a.i(sbI, ", showWarning=", this.f106540e, ")");
    }

    public a(String str, String str2, String str3, long j8, boolean z14) {
        str2.getClass();
        this.f106536a = str;
        this.f106537b = str2;
        this.f106538c = str3;
        this.f106539d = j8;
        this.f106540e = z14;
    }
}
