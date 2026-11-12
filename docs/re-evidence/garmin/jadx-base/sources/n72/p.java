package n72;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ln72/p;", "Ln72/i;", "", TtmlNode.ATTR_ID, "", "name", "description", "Ln72/j;", "settings", "Lkotlin/Function0;", "", FirebaseAnalytics.Param.CONTENT, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ln72/j;Le23/p;)V", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f124904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f124907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.p<p3.m, Integer, Unit> f124908e;

    /* JADX WARN: Multi-variable type inference failed */
    public p(int i14, String str, String str2, j jVar, e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        str.getClass();
        str2.getClass();
        pVar.getClass();
        this.f124904a = i14;
        this.f124905b = str;
        this.f124906c = str2;
        this.f124907d = jVar;
        this.f124908e = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f124904a == pVar.f124904a && p005kotlin.jvm.internal.s.g(this.f124905b, pVar.f124905b) && p005kotlin.jvm.internal.s.g(this.f124906c, pVar.f124906c) && p005kotlin.jvm.internal.s.g(this.f124907d, pVar.f124907d) && p005kotlin.jvm.internal.s.g(this.f124908e, pVar.f124908e);
    }

    @Override // n72.i
    public final e23.p<p3.m, Integer, Unit> getContent() {
        return this.f124908e;
    }

    @Override // n72.i
    /* JADX INFO: renamed from: getDescription, reason: from getter */
    public final String getF124906c() {
        return this.f124906c;
    }

    @Override // n72.i
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final int getF124904a() {
        return this.f124904a;
    }

    @Override // n72.i
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF124905b() {
        return this.f124905b;
    }

    @Override // n72.i
    /* JADX INFO: renamed from: getSettings, reason: from getter */
    public final j getF124907d() {
        return this.f124907d;
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(Integer.hashCode(this.f124904a) * 31, 31, this.f124905b), 31, this.f124906c);
        j jVar = this.f124907d;
        return this.f124908e.hashCode() + ((iJ + (jVar == null ? 0 : jVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbR = wr.g.r(this.f124904a, "NoScrollExample(id=", ", name=", this.f124905b, ", description=");
        sbR.append(this.f124906c);
        sbR.append(", settings=");
        sbR.append(this.f124907d);
        sbR.append(", content=");
        sbR.append(this.f124908e);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ p(int i14, String str, String str2, j jVar, e23.p pVar, int i15, p005kotlin.jvm.internal.j jVar2) {
        this(i14, str, str2, (i15 & 8) != 0 ? null : jVar, pVar);
    }
}
