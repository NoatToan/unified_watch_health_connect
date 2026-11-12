package l72;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBS\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000fB]\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u0011¨\u0006\u0012"}, d2 = {"Ll72/i3;", "", "", TtmlNode.ATTR_ID, Constants.ScionAnalytics.PARAM_LABEL, "", "enabled", "Lu4/d;", "icon", "contentDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLu4/d;Ljava/lang/String;)V", "Lo4/d0;", "labelColor", "iconColor", "(Ljava/lang/String;Ljava/lang/String;ZLo4/d0;Lo4/d0;Lu4/d;Ljava/lang/String;Lkotlin/jvm/internal/j;)V", "showDivider", "(Ljava/lang/String;Ljava/lang/String;ZLo4/d0;Lo4/d0;ZLu4/d;Ljava/lang/String;Lkotlin/jvm/internal/j;)V", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f111065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u4.d f111066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f111067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o4.d0 f111068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o4.d0 f111069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f111070h;

    public /* synthetic */ i3(String str, String str2, boolean z14, o4.d0 d0Var, o4.d0 d0Var2, boolean z15, u4.d dVar, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, (i14 & 4) != 0 ? true : z14, (i14 & 8) != 0 ? null : d0Var, (i14 & 16) != 0 ? null : d0Var2, (i14 & 32) != 0 ? false : z15, (i14 & 64) != 0 ? null : dVar, (i14 & 128) != 0 ? null : str3, (p005kotlin.jvm.internal.j) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return p005kotlin.jvm.internal.s.g(this.f111063a, i3Var.f111063a) && p005kotlin.jvm.internal.s.g(this.f111064b, i3Var.f111064b) && this.f111065c == i3Var.f111065c && p005kotlin.jvm.internal.s.g(this.f111066d, i3Var.f111066d) && p005kotlin.jvm.internal.s.g(this.f111067e, i3Var.f111067e);
    }

    public final int hashCode() {
        int iG = q6.f.g(wr.g.j(this.f111063a.hashCode() * 31, 31, this.f111064b), 31, this.f111065c);
        u4.d dVar = this.f111066d;
        int iHashCode = (iG + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f111067e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("TitleBarMenuItem(id=", this.f111063a, ", label=", this.f111064b, ", enabled=");
        sbI.append(this.f111065c);
        sbI.append(", icon=");
        sbI.append(this.f111066d);
        sbI.append(", contentDescription=");
        return am.j.o(this.f111067e, ")", sbI);
    }

    public /* synthetic */ i3(String str, String str2, boolean z14, o4.d0 d0Var, o4.d0 d0Var2, boolean z15, u4.d dVar, String str3, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, z14, d0Var, d0Var2, z15, dVar, str3);
    }

    public i3(String str, String str2, boolean z14, u4.d dVar, String str3) {
        str.getClass();
        str2.getClass();
        this.f111063a = str;
        this.f111064b = str2;
        this.f111065c = z14;
        this.f111066d = dVar;
        this.f111067e = str3;
    }

    public /* synthetic */ i3(String str, String str2, boolean z14, u4.d dVar, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, (i14 & 4) != 0 ? true : z14, (i14 & 8) != 0 ? null : dVar, (i14 & 16) != 0 ? null : str3);
    }

    public /* synthetic */ i3(String str, String str2, boolean z14, o4.d0 d0Var, o4.d0 d0Var2, u4.d dVar, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, (i14 & 4) != 0 ? true : z14, (i14 & 8) != 0 ? null : d0Var, (i14 & 16) != 0 ? null : d0Var2, (i14 & 32) != 0 ? null : dVar, (i14 & 64) != 0 ? null : str3, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private i3(String str, String str2, boolean z14, o4.d0 d0Var, o4.d0 d0Var2, u4.d dVar, String str3) {
        this(str, str2, z14, dVar, str3);
        str.getClass();
        str2.getClass();
        this.f111068f = d0Var;
        this.f111069g = d0Var2;
    }

    public /* synthetic */ i3(String str, String str2, boolean z14, o4.d0 d0Var, o4.d0 d0Var2, u4.d dVar, String str3, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, z14, d0Var, d0Var2, dVar, str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private i3(String str, String str2, boolean z14, o4.d0 d0Var, o4.d0 d0Var2, boolean z15, u4.d dVar, String str3) {
        this(str, str2, z14, dVar, str3);
        str.getClass();
        str2.getClass();
        this.f111068f = d0Var;
        this.f111069g = d0Var2;
        this.f111070h = z15;
    }
}
