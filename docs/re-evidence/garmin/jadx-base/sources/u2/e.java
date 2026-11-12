package u2;

import d53.u;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import s5.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0018\u00010\t\u0012\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lu2/e;", "", "text", "Ls5/w0;", "selection", "composition", "Lo13/p;", "Lu2/j;", "highlight", "", "Ls5/c$d;", "Ls5/c$a;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "composingAnnotations", "outputAnnotations", "<init>", "(Ljava/lang/CharSequence;JLs5/w0;Lo13/p;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<s5.c.d<s5.c.a>> f167837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<s5.c.d<s5.c.a>> f167838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f167839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f167840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w0 f167841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p<j, w0> f167842f;

    private e(CharSequence charSequence, long j8, w0 w0Var, p<j, w0> pVar, List<s5.c.d<s5.c.a>> list, List<s5.c.d<s5.c.a>> list2) {
        this.f167837a = list;
        this.f167838b = list2;
        this.f167839c = charSequence instanceof e ? ((e) charSequence).f167839c : charSequence;
        this.f167840d = og.a.x(0, charSequence.length(), j8);
        this.f167841e = w0Var != null ? w0.a(og.a.x(0, charSequence.length(), w0Var.f157317a)) : null;
        this.f167842f = pVar != null ? new p<>(pVar.f128594a, w0.a(og.a.x(0, charSequence.length(), pVar.f128595b.f157317a))) : null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i14) {
        return this.f167839c.charAt(i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (w0.d(this.f167840d, eVar.f167840d) && s.g(this.f167841e, eVar.f167841e) && s.g(this.f167842f, eVar.f167842f) && s.g(this.f167837a, eVar.f167837a)) {
            return u.m(this.f167839c, eVar.f167839c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f167839c.hashCode() * 31;
        w0.a aVar = w0.f157315b;
        int iE = q6.f.e(iHashCode, 31, this.f167840d);
        w0 w0Var = this.f167841e;
        int iHashCode2 = (iE + (w0Var != null ? Long.hashCode(w0Var.f157317a) : 0)) * 31;
        p<j, w0> pVar = this.f167842f;
        int iHashCode3 = (iHashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        List<s5.c.d<s5.c.a>> list = this.f167837a;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f167839c.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i14, int i15) {
        return this.f167839c.subSequence(i14, i15);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f167839c.toString();
    }

    public /* synthetic */ e(CharSequence charSequence, long j8, w0 w0Var, p pVar, List list, List list2, p005kotlin.jvm.internal.j jVar) {
        this(charSequence, j8, w0Var, pVar, list, list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(CharSequence charSequence, long j8, w0 w0Var, p pVar, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        long j14;
        CharSequence charSequence2 = (i14 & 1) != 0 ? "" : charSequence;
        if ((i14 & 2) != 0) {
            w0.f157315b.getClass();
            j14 = w0.f157316c;
        } else {
            j14 = j8;
        }
        w0 w0Var2 = (i14 & 4) != 0 ? null : w0Var;
        p pVar2 = (i14 & 8) != 0 ? null : pVar;
        List list3 = (i14 & 16) != 0 ? null : list;
        this(charSequence2, j14, w0Var2, pVar2, list3, (i14 & 32) == 0 ? list2 : null, null);
    }
}
