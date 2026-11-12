package u4;

import java.util.List;
import lc.u0;
import o4.h1;
import o4.u1;
import o4.v1;
import o4.w;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u009b\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lu4/q;", "Lu4/n;", "", "name", "", "Lu4/g;", "pathData", "Lo4/h1;", "pathFillType", "Lo4/w;", "fill", "", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Lo4/u1;", "strokeLineCap", "Lo4/v1;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "<init>", "(Ljava/lang/String;Ljava/util/List;ILo4/w;FLo4/w;FFIIFFFFLkotlin/jvm/internal/j;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g> f168528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f168529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f168530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f168531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f168532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f168533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f168534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f168535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f168536j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f168537k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f168538l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f168539m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f168540n;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q(String str, List list, int i14, w wVar, float f14, w wVar2, float f15, float f16, int i15, int i16, float f17, float f18, float f19, float f22, int i17, p005kotlin.jvm.internal.j jVar) {
        int i18;
        int i19;
        String str2 = (i17 & 1) != 0 ? "" : str;
        w wVar3 = (i17 & 8) != 0 ? null : wVar;
        float f24 = (i17 & 16) != 0 ? 1.0f : f14;
        w wVar4 = (i17 & 32) != 0 ? null : wVar2;
        float f25 = (i17 & 64) != 0 ? 1.0f : f15;
        float f26 = (i17 & 128) != 0 ? 0.0f : f16;
        if ((i17 & 256) != 0) {
            j0 j0Var = m.f168519a;
            i18 = 0;
        } else {
            i18 = i15;
        }
        if ((i17 & 512) != 0) {
            j0 j0Var2 = m.f168519a;
            i19 = 0;
        } else {
            i19 = i16;
        }
        this(str2, list, i14, wVar3, f24, wVar4, f25, f26, i18, i19, (i17 & 1024) != 0 ? 4.0f : f17, (i17 & 2048) != 0 ? 0.0f : f18, (i17 & 4096) != 0 ? 1.0f : f19, (i17 & 8192) != 0 ? 0.0f : f22, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (s.g(this.f168527a, qVar.f168527a) && s.g(this.f168530d, qVar.f168530d) && this.f168531e == qVar.f168531e && s.g(this.f168532f, qVar.f168532f) && this.f168533g == qVar.f168533g && this.f168534h == qVar.f168534h) {
                int i14 = qVar.f168535i;
                u1.a aVar = u1.f129010b;
                if (this.f168535i == i14) {
                    int i15 = qVar.f168536j;
                    v1.a aVar2 = v1.f129019b;
                    if (this.f168536j == i15 && this.f168537k == qVar.f168537k && this.f168538l == qVar.f168538l && this.f168539m == qVar.f168539m && this.f168540n == qVar.f168540n) {
                        int i16 = qVar.f168529c;
                        h1.a aVar3 = h1.f128863b;
                        return this.f168529c == i16 && s.g(this.f168528b, qVar.f168528b);
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB = u0.b(this.f168527a.hashCode() * 31, 31, this.f168528b);
        w wVar = this.f168530d;
        int iD = q6.f.d(this.f168531e, (iB + (wVar != null ? wVar.hashCode() : 0)) * 31, 31);
        w wVar2 = this.f168532f;
        int iD2 = q6.f.d(this.f168534h, q6.f.d(this.f168533g, (iD + (wVar2 != null ? wVar2.hashCode() : 0)) * 31, 31), 31);
        u1.a aVar = u1.f129010b;
        int iD3 = q2.d(this.f168535i, iD2, 31);
        v1.a aVar2 = v1.f129019b;
        int iD4 = q6.f.d(this.f168540n, q6.f.d(this.f168539m, q6.f.d(this.f168538l, q6.f.d(this.f168537k, q2.d(this.f168536j, iD3, 31), 31), 31), 31), 31);
        h1.a aVar3 = h1.f128863b;
        return Integer.hashCode(this.f168529c) + iD4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private q(String str, List<? extends g> list, int i14, w wVar, float f14, w wVar2, float f15, float f16, int i15, int i16, float f17, float f18, float f19, float f22) {
        super(null);
        this.f168527a = str;
        this.f168528b = list;
        this.f168529c = i14;
        this.f168530d = wVar;
        this.f168531e = f14;
        this.f168532f = wVar2;
        this.f168533g = f15;
        this.f168534h = f16;
        this.f168535i = i15;
        this.f168536j = i16;
        this.f168537k = f17;
        this.f168538l = f18;
        this.f168539m = f19;
        this.f168540n = f22;
    }

    public /* synthetic */ q(String str, List list, int i14, w wVar, float f14, w wVar2, float f15, float f16, int i15, int i16, float f17, float f18, float f19, float f22, p005kotlin.jvm.internal.j jVar) {
        this(str, list, i14, wVar, f14, wVar2, f15, f16, i15, i16, f17, f18, f19, f22);
    }
}
