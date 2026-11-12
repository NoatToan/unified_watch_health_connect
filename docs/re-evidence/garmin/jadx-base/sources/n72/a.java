package n72;

import android.content.Context;
import android.content.Intent;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ln72/a;", "Ln72/i;", "", TtmlNode.ATTR_ID, "", "name", "description", "Lkotlin/Function0;", "", FirebaseAnalytics.Param.CONTENT, "Ln72/j;", "settings", "Lkotlin/Function1;", "Landroid/content/Context;", "Landroid/content/Intent;", "getNavIntent", "<init>", "(ILjava/lang/String;Ljava/lang/String;Le23/p;Ln72/j;Le23/l;)V", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f124842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.p<p3.m, Integer, Unit> f124845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f124846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.l<Context, Intent> f124847f;

    /* JADX WARN: Multi-variable type inference failed */
    public a(int i14, String str, String str2, e23.p<? super p3.m, ? super Integer, Unit> pVar, j jVar, e23.l<? super Context, ? extends Intent> lVar) {
        str.getClass();
        str2.getClass();
        pVar.getClass();
        lVar.getClass();
        this.f124842a = i14;
        this.f124843b = str;
        this.f124844c = str2;
        this.f124845d = pVar;
        this.f124846e = jVar;
        this.f124847f = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f124842a == aVar.f124842a && p005kotlin.jvm.internal.s.g(this.f124843b, aVar.f124843b) && p005kotlin.jvm.internal.s.g(this.f124844c, aVar.f124844c) && p005kotlin.jvm.internal.s.g(this.f124845d, aVar.f124845d) && p005kotlin.jvm.internal.s.g(this.f124846e, aVar.f124846e) && p005kotlin.jvm.internal.s.g(this.f124847f, aVar.f124847f);
    }

    @Override // n72.i
    public final e23.p<p3.m, Integer, Unit> getContent() {
        return this.f124845d;
    }

    @Override // n72.i
    /* JADX INFO: renamed from: getDescription, reason: from getter */
    public final String getF124844c() {
        return this.f124844c;
    }

    @Override // n72.i
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final int getF124842a() {
        return this.f124842a;
    }

    @Override // n72.i
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF124843b() {
        return this.f124843b;
    }

    @Override // n72.i
    /* JADX INFO: renamed from: getSettings, reason: from getter */
    public final j getF124846e() {
        return this.f124846e;
    }

    public final int hashCode() {
        int iHashCode = (this.f124845d.hashCode() + wr.g.j(wr.g.j(Integer.hashCode(this.f124842a) * 31, 31, this.f124843b), 31, this.f124844c)) * 31;
        j jVar = this.f124846e;
        return this.f124847f.hashCode() + ((iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbR = wr.g.r(this.f124842a, "ActivityExample(id=", ", name=", this.f124843b, ", description=");
        sbR.append(this.f124844c);
        sbR.append(", content=");
        sbR.append(this.f124845d);
        sbR.append(", settings=");
        sbR.append(this.f124846e);
        sbR.append(", getNavIntent=");
        sbR.append(this.f124847f);
        sbR.append(")");
        return sbR.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i14, String str, String str2, e23.p pVar, j jVar, e23.l lVar, int i15, p005kotlin.jvm.internal.j jVar2) {
        if ((i15 & 8) != 0) {
            e.f124852a.getClass();
            pVar = e.f124854b;
        }
        this(i14, str, str2, pVar, (i15 & 16) != 0 ? null : jVar, lVar);
    }
}
