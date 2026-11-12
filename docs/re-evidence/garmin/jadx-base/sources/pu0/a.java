package pu0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d53.u;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpu0/a;", "", "", TtmlNode.ATTR_ID, "displayName", "profilePictureUrl", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Comparable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f141181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f141182d;

    public a(String str, String str2, String str3, Boolean bool) {
        str.getClass();
        str2.getClass();
        this.f141179a = str;
        this.f141180b = str2;
        this.f141181c = str3;
        this.f141182d = bool;
    }

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        a aVar2 = aVar;
        aVar2.getClass();
        if (this == aVar2) {
            return 0;
        }
        return u.l(this.f141180b, aVar2.f141180b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f141179a, aVar.f141179a) && s.g(this.f141180b, aVar.f141180b) && s.g(this.f141181c, aVar.f141181c) && s.g(this.f141182d, aVar.f141182d);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f141179a.hashCode() * 31, 31, this.f141180b);
        String str = this.f141181c;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f141182d;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.f141182d;
        StringBuilder sbI = p6.b.i("Connection(id=", this.f141179a, ", displayName=", this.f141180b, ", profilePictureUrl=");
        sbI.append(this.f141181c);
        sbI.append(", isSelected=");
        sbI.append(bool);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ a(String str, String str2, String str3, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, str3, (i14 & 8) != 0 ? null : bool);
    }
}
