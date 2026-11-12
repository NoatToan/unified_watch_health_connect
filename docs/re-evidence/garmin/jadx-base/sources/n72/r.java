package n72;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ln72/r;", "Ln72/i;", "", TtmlNode.ATTR_ID, "", "name", "description", "Ln72/j;", "settings", "Lkotlin/Function0;", "", "realContent", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ln72/j;Le23/p;)V", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f124912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f124915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.p<p3.m, Integer, Unit> f124916e;

    /* JADX WARN: Multi-variable type inference failed */
    public r(int i14, String str, String str2, j jVar, e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        str.getClass();
        str2.getClass();
        pVar.getClass();
        this.f124912a = i14;
        this.f124913b = str;
        this.f124914c = str2;
        this.f124915d = jVar;
        this.f124916e = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f124912a == rVar.f124912a && p005kotlin.jvm.internal.s.g(this.f124913b, rVar.f124913b) && p005kotlin.jvm.internal.s.g(this.f124914c, rVar.f124914c) && p005kotlin.jvm.internal.s.g(this.f124915d, rVar.f124915d) && p005kotlin.jvm.internal.s.g(this.f124916e, rVar.f124916e);
    }

    @Override // n72.i
    public final e23.p<p3.m, Integer, Unit> getContent() {
        return new z3.e(318464049, true, new m92.f(this, 10));
    }

    @Override // n72.i
    /* JADX INFO: renamed from: getDescription, reason: from getter */
    public final String getF124914c() {
        return this.f124914c;
    }

    @Override // n72.i
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final int getF124912a() {
        return this.f124912a;
    }

    @Override // n72.i
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF124913b() {
        return this.f124913b;
    }

    @Override // n72.i
    /* JADX INFO: renamed from: getSettings, reason: from getter */
    public final j getF124915d() {
        return this.f124915d;
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(Integer.hashCode(this.f124912a) * 31, 31, this.f124913b), 31, this.f124914c);
        j jVar = this.f124915d;
        return this.f124916e.hashCode() + ((iJ + (jVar == null ? 0 : jVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbR = wr.g.r(this.f124912a, "VerticalScrollExample(id=", ", name=", this.f124913b, ", description=");
        sbR.append(this.f124914c);
        sbR.append(", settings=");
        sbR.append(this.f124915d);
        sbR.append(", realContent=");
        sbR.append(this.f124916e);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ r(int i14, String str, String str2, j jVar, e23.p pVar, int i15, p005kotlin.jvm.internal.j jVar2) {
        this(i14, str, str2, (i15 & 8) != 0 ? null : jVar, pVar);
    }
}
