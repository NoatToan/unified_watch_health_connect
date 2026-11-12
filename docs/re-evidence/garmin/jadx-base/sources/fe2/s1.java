package fe2;

import com.garmin.android.apps.connectmobile.f3;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lfe2/s1;", "", "", TtmlNode.ATTR_ID, "timestamp", "", "text", "", "recipientSessionIds", "senderSessionId", "senderDisplayName", "seq", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f70921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f70922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f70924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f70925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f70926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f70927g;

    public s1(Long l14, Long l15, String str, List<String> list, String str2, String str3, Long l16) {
        this.f70921a = l14;
        this.f70922b = l15;
        this.f70923c = str;
        this.f70924d = list;
        this.f70925e = str2;
        this.f70926f = str3;
        this.f70927g = l16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return p005kotlin.jvm.internal.s.g(this.f70921a, s1Var.f70921a) && p005kotlin.jvm.internal.s.g(this.f70922b, s1Var.f70922b) && p005kotlin.jvm.internal.s.g(this.f70923c, s1Var.f70923c) && p005kotlin.jvm.internal.s.g(this.f70924d, s1Var.f70924d) && p005kotlin.jvm.internal.s.g(this.f70925e, s1Var.f70925e) && p005kotlin.jvm.internal.s.g(this.f70926f, s1Var.f70926f) && p005kotlin.jvm.internal.s.g(this.f70927g, s1Var.f70927g);
    }

    public final int hashCode() {
        Long l14 = this.f70921a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.f70922b;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.f70923c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.f70924d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f70925e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f70926f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l16 = this.f70927g;
        return iHashCode6 + (l16 != null ? l16.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = f3.j(this.f70921a, this.f70922b, "Message(id=", ", timestamp=", ", text=");
        v.e0.o(this.f70923c, ", recipientSessionIds=", ", senderSessionId=", sbJ, this.f70924d);
        sn.a.t(sbJ, this.f70925e, ", senderDisplayName=", this.f70926f, ", seq=");
        return p6.b.g(sbJ, this.f70927g, ")");
    }
}
