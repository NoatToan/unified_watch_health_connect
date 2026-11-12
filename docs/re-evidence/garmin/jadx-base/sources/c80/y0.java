package c80;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lc80/y0;", "", "", TtmlNode.ATTR_ID, "Lc80/p0;", NotificationConstants.KEY_DATA_MIME_TYPE, "overline", "title", TtmlNode.TAG_BODY, "cta", "dismissLabel", "", "Lc80/s0;", "locations", "", "priority", "Lc80/n0;", "conditions", "Lc80/k0;", "behaviors", "Lc80/t0;", "resources", "Lc80/w0;", "target", "", "tags", "<init>", "(Ljava/lang/String;Lc80/p0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lc80/n0;Lc80/k0;Lc80/t0;Lc80/w0;Ljava/util/Set;)V", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f25638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f25643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<s0> f25644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f25645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n0 f25646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k0 f25647k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t0 f25648l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w0 f25649m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set<String> f25650n;

    /* JADX WARN: Multi-variable type inference failed */
    public y0(String str, p0 p0Var, String str2, String str3, String str4, String str5, String str6, List<? extends s0> list, Integer num, n0 n0Var, k0 k0Var, t0 t0Var, w0 w0Var, Set<String> set) {
        str.getClass();
        p0Var.getClass();
        list.getClass();
        n0Var.getClass();
        k0Var.getClass();
        t0Var.getClass();
        set.getClass();
        this.f25637a = str;
        this.f25638b = p0Var;
        this.f25639c = str2;
        this.f25640d = str3;
        this.f25641e = str4;
        this.f25642f = str5;
        this.f25643g = str6;
        this.f25644h = list;
        this.f25645i = num;
        this.f25646j = n0Var;
        this.f25647k = k0Var;
        this.f25648l = t0Var;
        this.f25649m = w0Var;
        this.f25650n = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f25637a.equals(y0Var.f25637a) && this.f25638b == y0Var.f25638b && p005kotlin.jvm.internal.s.g(this.f25639c, y0Var.f25639c) && p005kotlin.jvm.internal.s.g(this.f25640d, y0Var.f25640d) && p005kotlin.jvm.internal.s.g(this.f25641e, y0Var.f25641e) && p005kotlin.jvm.internal.s.g(this.f25642f, y0Var.f25642f) && p005kotlin.jvm.internal.s.g(this.f25643g, y0Var.f25643g) && this.f25644h.equals(y0Var.f25644h) && p005kotlin.jvm.internal.s.g(this.f25645i, y0Var.f25645i) && this.f25646j.equals(y0Var.f25646j) && this.f25647k.equals(y0Var.f25647k) && this.f25648l.equals(y0Var.f25648l) && p005kotlin.jvm.internal.s.g(this.f25649m, y0Var.f25649m) && this.f25650n.equals(y0Var.f25650n);
    }

    public final int hashCode() {
        int iHashCode = (this.f25638b.hashCode() + (this.f25637a.hashCode() * 31)) * 31;
        String str = this.f25639c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25640d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25641e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25642f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f25643g;
        int iB = lc.u0.b((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f25644h);
        Integer num = this.f25645i;
        int iHashCode6 = (this.f25648l.hashCode() + ((this.f25647k.hashCode() + ((this.f25646j.hashCode() + ((iB + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31)) * 31;
        w0 w0Var = this.f25649m;
        return this.f25650n.hashCode() + ((iHashCode6 + (w0Var != null ? w0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Promotion(id=");
        sb3.append(this.f25637a);
        sb3.append(", type=");
        sb3.append(this.f25638b);
        sb3.append(", overline=");
        sn.a.t(sb3, this.f25639c, ", title=", this.f25640d, ", body=");
        sn.a.t(sb3, this.f25641e, ", cta=", this.f25642f, ", dismissLabel=");
        v.e0.o(this.f25643g, ", locations=", ", priority=", sb3, this.f25644h);
        sb3.append(this.f25645i);
        sb3.append(", conditions=");
        sb3.append(this.f25646j);
        sb3.append(", behaviors=");
        sb3.append(this.f25647k);
        sb3.append(", resources=");
        sb3.append(this.f25648l);
        sb3.append(", target=");
        sb3.append(this.f25649m);
        sb3.append(", tags=");
        sb3.append(this.f25650n);
        sb3.append(")");
        return sb3.toString();
    }
}
