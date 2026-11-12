package fd;

import android.net.Uri;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import u62.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eBK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lfd/a;", "", "", "deletionMode", "matchBehavior", "Ljava/time/Instant;", TtmlNode.START, TtmlNode.END, "", "Landroid/net/Uri;", "domainUris", "originUris", "<init>", "(IILjava/time/Instant;Ljava/time/Instant;Ljava/util/List;Ljava/util/List;)V", "a", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f70415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f70416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Instant f70417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Uri> f70418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<Uri> f70419f;

    static {
        new C1444a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i14, int i15, Instant instant, Instant instant2, List list, List list2, int i16, p005kotlin.jvm.internal.j jVar) {
        if ((i16 & 4) != 0) {
            instant = Instant.MIN;
            instant.getClass();
        }
        Instant instant3 = instant;
        if ((i16 & 8) != 0) {
            instant2 = Instant.MAX;
            instant2.getClass();
        }
        this(i14, i15, instant3, instant2, (i16 & 16) != 0 ? j0.f134944a : list, (i16 & 32) != 0 ? j0.f134944a : list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f70414a == aVar.f70414a && new HashSet(this.f70418e).equals(new HashSet(aVar.f70418e)) && new HashSet(this.f70419f).equals(new HashSet(aVar.f70419f)) && s.g(this.f70416c, aVar.f70416c) && s.g(this.f70417d, aVar.f70417d) && this.f70415b == aVar.f70415b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f70415b) + wr.g.k(this.f70417d, wr.g.k(this.f70416c, u0.b(u0.b(Integer.hashCode(this.f70414a) * 31, 31, this.f70418e), 31, this.f70419f), 31), 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("DeletionRequest { DeletionMode=", this.f70414a == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA", ", MatchBehavior=", this.f70415b == 0 ? "MATCH_BEHAVIOR_DELETE" : "MATCH_BEHAVIOR_PRESERVE", ", Start=");
        sbI.append(this.f70416c);
        sbI.append(", End=");
        sbI.append(this.f70417d);
        sbI.append(", DomainUris=");
        sbI.append(this.f70418e);
        sbI.append(", OriginUris=");
        return z.c(sbI, this.f70419f, " }");
    }

    /* JADX INFO: renamed from: fd.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lfd/a$a;", "", "<init>", "()V", "", "DELETION_MODE_ALL", "I", "DELETION_MODE_EXCLUDE_INTERNAL_DATA", "MATCH_BEHAVIOR_DELETE", "MATCH_BEHAVIOR_PRESERVE", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C1444a {
        public /* synthetic */ C1444a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1444a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(int i14, int i15, Instant instant, Instant instant2, List<? extends Uri> list, List<? extends Uri> list2) {
        instant.getClass();
        instant2.getClass();
        list.getClass();
        list2.getClass();
        this.f70414a = i14;
        this.f70415b = i15;
        this.f70416c = instant;
        this.f70417d = instant2;
        this.f70418e = list;
        this.f70419f = list2;
    }
}
