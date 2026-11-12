package y2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import h5.x0;
import kotlin.m2;
import o4.j0;
import p005kotlin.Metadata;
import r1.q2;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ly2/t;", "Lh5/x0;", "Ly2/v;", "", "text", "Ls5/x0;", TtmlNode.TAG_STYLE, "Lw5/q$b;", "fontFamilyResolver", "Ld6/p;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lo4/j0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(Ljava/lang/String;Ls5/x0;Lw5/q$b;IZIILo4/j0;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t extends x0<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s5.x0 f194179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5.q.b f194180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f194181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f194182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f194183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f194184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j0 f194185h;

    /* JADX WARN: Illegal instructions before constructor call */
    public t(String str, s5.x0 x0Var, w5.q.b bVar, int i14, boolean z14, int i15, int i16, j0 j0Var, int i17, p005kotlin.jvm.internal.j jVar) {
        int i18;
        if ((i17 & 8) != 0) {
            d6.p.f57793b.getClass();
            i18 = d6.p.f57794c;
        } else {
            i18 = i14;
        }
        this(str, x0Var, bVar, i18, (i17 & 16) != 0 ? true : z14, (i17 & 32) != 0 ? Integer.MAX_VALUE : i15, (i17 & 64) != 0 ? 1 : i16, (i17 & 128) != 0 ? null : j0Var, null);
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new v(this.f194178a, this.f194179b, this.f194180c, this.f194181d, this.f194182e, this.f194183f, this.f194184g, this.f194185h, null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (!p005kotlin.jvm.internal.s.g(this.f194185h, tVar.f194185h) || !p005kotlin.jvm.internal.s.g(this.f194178a, tVar.f194178a) || !p005kotlin.jvm.internal.s.g(this.f194179b, tVar.f194179b) || !p005kotlin.jvm.internal.s.g(this.f194180c, tVar.f194180c)) {
            return false;
        }
        int i14 = tVar.f194181d;
        d6.p.a aVar = d6.p.f57793b;
        return this.f194181d == i14 && this.f194182e == tVar.f194182e && this.f194183f == tVar.f194183f && this.f194184g == tVar.f194184g;
    }

    @Override // h5.x0
    public final int hashCode() {
        int iHashCode = (this.f194180c.hashCode() + e0.b(this.f194178a.hashCode() * 31, 31, this.f194179b)) * 31;
        d6.p.a aVar = d6.p.f57793b;
        int iG = (((q6.f.g(q2.d(this.f194181d, iHashCode, 31), 31, this.f194182e) + this.f194183f) * 31) + this.f194184g) * 31;
        j0 j0Var = this.f194185h;
        return iG + (j0Var != null ? j0Var.hashCode() : 0);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        boolean z14;
        v vVar = (v) cVar;
        j0 j0Var = vVar.f194195h;
        j0 j0Var2 = this.f194185h;
        boolean zG = p005kotlin.jvm.internal.s.g(j0Var2, j0Var);
        vVar.f194195h = j0Var2;
        boolean z15 = false;
        boolean z16 = true;
        s5.x0 x0Var = this.f194179b;
        if (zG) {
            s5.x0 x0Var2 = vVar.f194189b;
            if (x0Var == x0Var2) {
                x0Var.getClass();
            } else if (!x0Var.f157322a.c(x0Var2.f157322a)) {
                z14 = true;
            }
            z14 = false;
        } else {
            z14 = true;
        }
        String str = vVar.f194188a;
        String str2 = this.f194178a;
        if (!p005kotlin.jvm.internal.s.g(str, str2)) {
            vVar.f194188a = str2;
            vVar.f194199l = null;
            z15 = true;
        }
        boolean z17 = !vVar.f194189b.d(x0Var);
        vVar.f194189b = x0Var;
        int i14 = vVar.f194194g;
        int i15 = this.f194184g;
        if (i14 != i15) {
            vVar.f194194g = i15;
            z17 = true;
        }
        int i16 = vVar.f194193f;
        int i17 = this.f194183f;
        if (i16 != i17) {
            vVar.f194193f = i17;
            z17 = true;
        }
        boolean z18 = vVar.f194192e;
        boolean z19 = this.f194182e;
        if (z18 != z19) {
            vVar.f194192e = z19;
            z17 = true;
        }
        w5.q.b bVar = vVar.f194190c;
        w5.q.b bVar2 = this.f194180c;
        if (!p005kotlin.jvm.internal.s.g(bVar, bVar2)) {
            vVar.f194190c = bVar2;
            z17 = true;
        }
        int i18 = vVar.f194191d;
        d6.p.a aVar = d6.p.f57793b;
        int i19 = this.f194181d;
        if (i18 == i19) {
            z16 = z17;
        } else {
            vVar.f194191d = i19;
        }
        if (z15 || z16) {
            h hVarU1 = vVar.U1();
            String str3 = vVar.f194188a;
            s5.x0 x0Var3 = vVar.f194189b;
            w5.q.b bVar3 = vVar.f194190c;
            int i24 = vVar.f194191d;
            boolean z24 = vVar.f194192e;
            int i25 = vVar.f194193f;
            int i26 = vVar.f194194g;
            hVarU1.f194081a = str3;
            hVarU1.f194082b = x0Var3;
            hVarU1.f194083c = bVar3;
            hVarU1.f194084d = i24;
            hVarU1.f194085e = z24;
            hVarU1.f194086f = i25;
            hVarU1.f194087g = i26;
            b.f194043b.getClass();
            hVarU1.f194099s = b.f194045d | (hVarU1.f194099s << 2);
            hVarU1.c();
        }
        if (vVar.getIsAttached()) {
            if (z15 || (z14 && vVar.f194198k != null)) {
                h5.k.g(vVar).U();
            }
            if (z15 || z16) {
                h5.k.g(vVar).T();
                h5.t.a(vVar);
            }
            if (z14) {
                h5.t.a(vVar);
            }
        }
    }

    private t(String str, s5.x0 x0Var, w5.q.b bVar, int i14, boolean z14, int i15, int i16, j0 j0Var) {
        this.f194178a = str;
        this.f194179b = x0Var;
        this.f194180c = bVar;
        this.f194181d = i14;
        this.f194182e = z14;
        this.f194183f = i15;
        this.f194184g = i16;
        this.f194185h = j0Var;
    }

    public /* synthetic */ t(String str, s5.x0 x0Var, w5.q.b bVar, int i14, boolean z14, int i15, int i16, j0 j0Var, p005kotlin.jvm.internal.j jVar) {
        this(str, x0Var, bVar, i14, z14, i15, i16, j0Var);
    }
}
