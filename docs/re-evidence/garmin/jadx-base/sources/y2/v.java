package y2;

import android.os.Trace;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import f5.a1;
import f5.b1;
import f5.v1;
import f5.w;
import f5.x;
import f5.y0;
import h5.c0;
import h5.y1;
import java.util.HashMap;
import java.util.List;
import o4.d0;
import o4.j0;
import o4.q1;
import o4.y;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.o2;
import p5.h0;
import p5.k0;
import s5.p0;
import s5.q0;
import s5.x0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0016BS\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ly2/v;", "Lh4/r$c;", "Lh5/c0;", "Lh5/s;", "Lh5/y1;", "", "text", "Ls5/x0;", TtmlNode.TAG_STYLE, "Lw5/q$b;", "fontFamilyResolver", "Ld6/p;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lo4/j0;", "overrideColor", "<init>", "(Ljava/lang/String;Ls5/x0;Lw5/q$b;IZIILo4/j0;Lkotlin/jvm/internal/j;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v extends h4.r.c implements c0, h5.s, y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f194188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x0 f194189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w5.q.b f194190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f194191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f194192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f194193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f194194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j0 f194195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap f194196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f194197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u f194198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f194199l;

    /* JADX WARN: Illegal instructions before constructor call */
    public v(String str, x0 x0Var, w5.q.b bVar, int i14, boolean z14, int i15, int i16, j0 j0Var, int i17, p005kotlin.jvm.internal.j jVar) {
        int i18;
        if ((i17 & 8) != 0) {
            d6.p.f57793b.getClass();
            i18 = d6.p.f57794c;
        } else {
            i18 = i14;
        }
        this(str, x0Var, bVar, i18, (i17 & 16) != 0 ? true : z14, (i17 & 32) != 0 ? Integer.MAX_VALUE : i15, (i17 & 64) != 0 ? 1 : i16, (i17 & 128) != 0 ? null : j0Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [e23.l] */
    /* JADX WARN: Type inference failed for: r0v2, types: [y2.u] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // h5.y1
    public final void D1(k0 k0Var) {
        u uVar = this.f194198k;
        ?? r14 = uVar;
        if (uVar == null) {
            final int i14 = 0;
            ?? r15 = new e23.l(this) { // from class: y2.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v f194187b;

                {
                    this.f194187b = this;
                }

                /* JADX WARN: Code duplicated, block: B:27:0x00e7  */
                @Override // e23.l
                public final Object invoke(Object obj) {
                    long jA;
                    g6.c cVar;
                    q0 q0Var;
                    int i15 = i14;
                    boolean z14 = true;
                    v vVar = this.f194187b;
                    switch (i15) {
                        case 0:
                            List list = (List) obj;
                            h hVarU1 = vVar.U1();
                            x0 x0Var = vVar.f194189b;
                            j0 j0Var = vVar.f194195h;
                            if (j0Var != null) {
                                jA = j0Var.a();
                            } else {
                                d0.f128823b.getClass();
                                jA = d0.f128832k;
                            }
                            x0 x0VarF = x0.f(x0Var, jA, 0L, null, 0L, 0, 0L, 16777214);
                            g6.o oVar = hVarU1.f194095o;
                            q0 q0Var2 = null;
                            if (oVar == null || (cVar = hVarU1.f194089i) == null) {
                                q0Var = null;
                            } else {
                                s5.c cVar2 = new s5.c(hVarU1.f194081a, null, 2, null);
                                if (hVarU1.f194090j == null || hVarU1.f194094n == null) {
                                    q0Var = null;
                                } else {
                                    long j8 = hVarU1.f194096p & (-8589934589L);
                                    g6.a.C1525a c1525a = g6.a.f75987b;
                                    p13.j0 j0Var2 = p13.j0.f134944a;
                                    q0Var = new q0(new p0(cVar2, x0VarF, j0Var2, hVarU1.f194086f, hVarU1.f194085e, hVarU1.f194084d, cVar, oVar, hVarU1.f194083c, j8, (p005kotlin.jvm.internal.j) null), new s5.o(new s5.q(cVar2, x0VarF, j0Var2, cVar, hVarU1.f194083c), j8, hVarU1.f194086f, hVarU1.f194084d, (p005kotlin.jvm.internal.j) null), hVarU1.f194092l, null);
                                }
                            }
                            if (q0Var != null) {
                                list.add(q0Var);
                                q0Var2 = q0Var;
                            }
                            return Boolean.valueOf(q0Var2 != null);
                        case 1:
                            String str = ((s5.c) obj).f157138b;
                            v.a aVar = vVar.f194199l;
                            if (aVar == null) {
                                v.a aVar2 = new v.a(vVar.f194188a, str, false, null, 12, null);
                                h hVar = new h(str, vVar.f194189b, vVar.f194190c, vVar.f194191d, vVar.f194192e, vVar.f194193f, vVar.f194194g, null);
                                hVar.d(vVar.U1().f194089i);
                                aVar2.f194203d = hVar;
                                vVar.f194199l = aVar2;
                            } else if (!p005kotlin.jvm.internal.s.g(str, aVar.f194201b)) {
                                aVar.f194201b = str;
                                h hVar2 = aVar.f194203d;
                                if (hVar2 != null) {
                                    x0 x0Var2 = vVar.f194189b;
                                    w5.q.b bVar = vVar.f194190c;
                                    int i16 = vVar.f194191d;
                                    boolean z15 = vVar.f194192e;
                                    int i17 = vVar.f194193f;
                                    int i18 = vVar.f194194g;
                                    hVar2.f194081a = str;
                                    hVar2.f194082b = x0Var2;
                                    hVar2.f194083c = bVar;
                                    hVar2.f194084d = i16;
                                    hVar2.f194085e = z15;
                                    hVar2.f194086f = i17;
                                    hVar2.f194087g = i18;
                                    b.f194043b.getClass();
                                    hVar2.f194099s = (hVar2.f194099s << 2) | b.f194045d;
                                    hVar2.c();
                                }
                            }
                            h5.k.g(vVar).U();
                            h5.k.g(vVar).T();
                            h5.t.a(vVar);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            v.a aVar3 = vVar.f194199l;
                            if (aVar3 == null) {
                                z14 = false;
                            } else {
                                aVar3.f194202c = zBooleanValue;
                                h5.k.g(vVar).U();
                                h5.k.g(vVar).T();
                                h5.t.a(vVar);
                            }
                            return Boolean.valueOf(z14);
                    }
                }
            };
            this.f194198k = r15;
            r14 = r15;
        }
        h0.B(k0Var, new s5.c(this.f194188a, null, 2, null));
        a aVar = this.f194199l;
        if (aVar != null) {
            boolean z14 = aVar.f194202c;
            p5.d0 d0Var = p5.d0.f135959a;
            d0Var.getClass();
            p5.j0<Boolean> j0Var = p5.d0.F;
            k23.l<Object>[] lVarArr = h0.f136016a;
            k23.l<Object> lVar = lVarArr[17];
            Boolean boolValueOf = Boolean.valueOf(z14);
            j0Var.getClass();
            k0Var.a(j0Var, boolValueOf);
            s5.c cVar = new s5.c(aVar.f194201b, null, 2, null);
            d0Var.getClass();
            p5.j0<s5.c> j0Var2 = p5.d0.E;
            k23.l<Object> lVar2 = lVarArr[16];
            j0Var2.getClass();
            k0Var.a(j0Var2, cVar);
        }
        final int i15 = 1;
        e23.l lVar3 = new e23.l(this) { // from class: y2.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f194187b;

            {
                this.f194187b = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00e7  */
            @Override // e23.l
            public final Object invoke(Object obj) {
                long jA;
                g6.c cVar2;
                q0 q0Var;
                int i16 = i15;
                boolean z15 = true;
                v vVar = this.f194187b;
                switch (i16) {
                    case 0:
                        List list = (List) obj;
                        h hVarU1 = vVar.U1();
                        x0 x0Var = vVar.f194189b;
                        j0 j0Var3 = vVar.f194195h;
                        if (j0Var3 != null) {
                            jA = j0Var3.a();
                        } else {
                            d0.f128823b.getClass();
                            jA = d0.f128832k;
                        }
                        x0 x0VarF = x0.f(x0Var, jA, 0L, null, 0L, 0, 0L, 16777214);
                        g6.o oVar = hVarU1.f194095o;
                        q0 q0Var2 = null;
                        if (oVar == null || (cVar2 = hVarU1.f194089i) == null) {
                            q0Var = null;
                        } else {
                            s5.c cVar3 = new s5.c(hVarU1.f194081a, null, 2, null);
                            if (hVarU1.f194090j == null || hVarU1.f194094n == null) {
                                q0Var = null;
                            } else {
                                long j8 = hVarU1.f194096p & (-8589934589L);
                                g6.a.C1525a c1525a = g6.a.f75987b;
                                p13.j0 j0Var4 = p13.j0.f134944a;
                                q0Var = new q0(new p0(cVar3, x0VarF, j0Var4, hVarU1.f194086f, hVarU1.f194085e, hVarU1.f194084d, cVar2, oVar, hVarU1.f194083c, j8, (p005kotlin.jvm.internal.j) null), new s5.o(new s5.q(cVar3, x0VarF, j0Var4, cVar2, hVarU1.f194083c), j8, hVarU1.f194086f, hVarU1.f194084d, (p005kotlin.jvm.internal.j) null), hVarU1.f194092l, null);
                            }
                        }
                        if (q0Var != null) {
                            list.add(q0Var);
                            q0Var2 = q0Var;
                        }
                        return Boolean.valueOf(q0Var2 != null);
                    case 1:
                        String str = ((s5.c) obj).f157138b;
                        v.a aVar2 = vVar.f194199l;
                        if (aVar2 == null) {
                            v.a aVar3 = new v.a(vVar.f194188a, str, false, null, 12, null);
                            h hVar = new h(str, vVar.f194189b, vVar.f194190c, vVar.f194191d, vVar.f194192e, vVar.f194193f, vVar.f194194g, null);
                            hVar.d(vVar.U1().f194089i);
                            aVar3.f194203d = hVar;
                            vVar.f194199l = aVar3;
                        } else if (!p005kotlin.jvm.internal.s.g(str, aVar2.f194201b)) {
                            aVar2.f194201b = str;
                            h hVar2 = aVar2.f194203d;
                            if (hVar2 != null) {
                                x0 x0Var2 = vVar.f194189b;
                                w5.q.b bVar = vVar.f194190c;
                                int i17 = vVar.f194191d;
                                boolean z16 = vVar.f194192e;
                                int i18 = vVar.f194193f;
                                int i19 = vVar.f194194g;
                                hVar2.f194081a = str;
                                hVar2.f194082b = x0Var2;
                                hVar2.f194083c = bVar;
                                hVar2.f194084d = i17;
                                hVar2.f194085e = z16;
                                hVar2.f194086f = i18;
                                hVar2.f194087g = i19;
                                b.f194043b.getClass();
                                hVar2.f194099s = (hVar2.f194099s << 2) | b.f194045d;
                                hVar2.c();
                            }
                        }
                        h5.k.g(vVar).U();
                        h5.k.g(vVar).T();
                        h5.t.a(vVar);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        v.a aVar4 = vVar.f194199l;
                        if (aVar4 == null) {
                            z15 = false;
                        } else {
                            aVar4.f194202c = zBooleanValue;
                            h5.k.g(vVar).U();
                            h5.k.g(vVar).T();
                            h5.t.a(vVar);
                        }
                        return Boolean.valueOf(z15);
                }
            }
        };
        p5.p pVar = p5.p.f136057a;
        pVar.getClass();
        k0Var.a(p5.p.f136069m, new p5.a(null, lVar3));
        final int i16 = 2;
        e23.l lVar4 = new e23.l(this) { // from class: y2.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f194187b;

            {
                this.f194187b = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00e7  */
            @Override // e23.l
            public final Object invoke(Object obj) {
                long jA;
                g6.c cVar2;
                q0 q0Var;
                int i17 = i16;
                boolean z15 = true;
                v vVar = this.f194187b;
                switch (i17) {
                    case 0:
                        List list = (List) obj;
                        h hVarU1 = vVar.U1();
                        x0 x0Var = vVar.f194189b;
                        j0 j0Var3 = vVar.f194195h;
                        if (j0Var3 != null) {
                            jA = j0Var3.a();
                        } else {
                            d0.f128823b.getClass();
                            jA = d0.f128832k;
                        }
                        x0 x0VarF = x0.f(x0Var, jA, 0L, null, 0L, 0, 0L, 16777214);
                        g6.o oVar = hVarU1.f194095o;
                        q0 q0Var2 = null;
                        if (oVar == null || (cVar2 = hVarU1.f194089i) == null) {
                            q0Var = null;
                        } else {
                            s5.c cVar3 = new s5.c(hVarU1.f194081a, null, 2, null);
                            if (hVarU1.f194090j == null || hVarU1.f194094n == null) {
                                q0Var = null;
                            } else {
                                long j8 = hVarU1.f194096p & (-8589934589L);
                                g6.a.C1525a c1525a = g6.a.f75987b;
                                p13.j0 j0Var4 = p13.j0.f134944a;
                                q0Var = new q0(new p0(cVar3, x0VarF, j0Var4, hVarU1.f194086f, hVarU1.f194085e, hVarU1.f194084d, cVar2, oVar, hVarU1.f194083c, j8, (p005kotlin.jvm.internal.j) null), new s5.o(new s5.q(cVar3, x0VarF, j0Var4, cVar2, hVarU1.f194083c), j8, hVarU1.f194086f, hVarU1.f194084d, (p005kotlin.jvm.internal.j) null), hVarU1.f194092l, null);
                            }
                        }
                        if (q0Var != null) {
                            list.add(q0Var);
                            q0Var2 = q0Var;
                        }
                        return Boolean.valueOf(q0Var2 != null);
                    case 1:
                        String str = ((s5.c) obj).f157138b;
                        v.a aVar2 = vVar.f194199l;
                        if (aVar2 == null) {
                            v.a aVar3 = new v.a(vVar.f194188a, str, false, null, 12, null);
                            h hVar = new h(str, vVar.f194189b, vVar.f194190c, vVar.f194191d, vVar.f194192e, vVar.f194193f, vVar.f194194g, null);
                            hVar.d(vVar.U1().f194089i);
                            aVar3.f194203d = hVar;
                            vVar.f194199l = aVar3;
                        } else if (!p005kotlin.jvm.internal.s.g(str, aVar2.f194201b)) {
                            aVar2.f194201b = str;
                            h hVar2 = aVar2.f194203d;
                            if (hVar2 != null) {
                                x0 x0Var2 = vVar.f194189b;
                                w5.q.b bVar = vVar.f194190c;
                                int i18 = vVar.f194191d;
                                boolean z16 = vVar.f194192e;
                                int i19 = vVar.f194193f;
                                int i110 = vVar.f194194g;
                                hVar2.f194081a = str;
                                hVar2.f194082b = x0Var2;
                                hVar2.f194083c = bVar;
                                hVar2.f194084d = i18;
                                hVar2.f194085e = z16;
                                hVar2.f194086f = i19;
                                hVar2.f194087g = i110;
                                b.f194043b.getClass();
                                hVar2.f194099s = (hVar2.f194099s << 2) | b.f194045d;
                                hVar2.c();
                            }
                        }
                        h5.k.g(vVar).U();
                        h5.k.g(vVar).T();
                        h5.t.a(vVar);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        v.a aVar4 = vVar.f194199l;
                        if (aVar4 == null) {
                            z15 = false;
                        } else {
                            aVar4.f194202c = zBooleanValue;
                            h5.k.g(vVar).U();
                            h5.k.g(vVar).T();
                            h5.t.a(vVar);
                        }
                        return Boolean.valueOf(z15);
                }
            }
        };
        pVar.getClass();
        k0Var.a(p5.p.f136070n, new p5.a(null, lVar4));
        xn.r rVar = new xn.r(this, 7);
        pVar.getClass();
        k0Var.a(p5.p.f136071o, new p5.a(null, rVar));
        h0.e(k0Var, r14);
    }

    public final h U1() {
        if (this.f194197j == null) {
            this.f194197j = new h(this.f194188a, this.f194189b, this.f194190c, this.f194191d, this.f194192e, this.f194193f, this.f194194g, null);
        }
        h hVar = this.f194197j;
        hVar.getClass();
        return hVar;
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013  */
    @Override // h5.c0
    public final int maxIntrinsicHeight(x xVar, w wVar, int i14) {
        h hVarU1;
        b1 b1Var = (b1) xVar;
        a aVar = this.f194199l;
        if (aVar == null) {
            hVarU1 = U1();
        } else {
            if (!aVar.f194202c) {
                aVar = null;
            }
            if (aVar == null || (hVarU1 = aVar.f194203d) == null) {
                hVarU1 = U1();
            }
        }
        hVarU1.d(b1Var);
        return hVarU1.a(i14, xVar.getF68910b());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013  */
    @Override // h5.c0
    public final int maxIntrinsicWidth(x xVar, w wVar, int i14) {
        h hVarU1;
        b1 b1Var = (b1) xVar;
        a aVar = this.f194199l;
        if (aVar == null) {
            hVarU1 = U1();
        } else {
            if (!aVar.f194202c) {
                aVar = null;
            }
            if (aVar == null || (hVarU1 = aVar.f194203d) == null) {
                hVarU1 = U1();
            }
        }
        hVarU1.d(b1Var);
        return o2.a(hVarU1.e(xVar.getF68910b()).a());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:23:0x004c, B:24:0x006e, B:12:0x0015), top: B:29:0x0005 }] */
    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final a1 mo5measure3p2s80s(b1 b1Var, y0 y0Var, long j8) {
        h hVarU1;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            a aVar = this.f194199l;
            if (aVar == null) {
                hVarU1 = U1();
            } else {
                if (!aVar.f194202c) {
                    aVar = null;
                }
                if (aVar == null || (hVarU1 = aVar.f194203d) == null) {
                    hVarU1 = U1();
                }
            }
            hVarU1.d(b1Var);
            boolean zB = hVarU1.b(j8, b1Var.getF68910b());
            s5.u uVar = hVarU1.f194094n;
            if (uVar != null) {
                uVar.b();
            }
            Unit unit = Unit.INSTANCE;
            s5.b bVar = hVarU1.f194090j;
            bVar.getClass();
            long j14 = hVarU1.f194092l;
            if (zB) {
                h5.k.e(this, 2).R1();
                HashMap map = this.f194196i;
                if (map == null) {
                    map = new HashMap(2);
                    this.f194196i = map;
                }
                map.put(f5.b.f68892a, Integer.valueOf(Math.round(bVar.g())));
                map.put(f5.b.f68893b, Integer.valueOf(Math.round(bVar.l())));
            }
            int i14 = (int) (j14 >> 32);
            int i15 = (int) (j14 & 4294967295L);
            g6.a.f75987b.getClass();
            v1 v1VarQ = y0Var.Q(g6.a.C1525a.b(i14, i14, i15, i15));
            HashMap map2 = this.f194196i;
            map2.getClass();
            return b1Var.H1(i14, i15, map2, new a03.k0(v1VarQ, 25));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013  */
    @Override // h5.c0
    public final int minIntrinsicHeight(x xVar, w wVar, int i14) {
        h hVarU1;
        b1 b1Var = (b1) xVar;
        a aVar = this.f194199l;
        if (aVar == null) {
            hVarU1 = U1();
        } else {
            if (!aVar.f194202c) {
                aVar = null;
            }
            if (aVar == null || (hVarU1 = aVar.f194203d) == null) {
                hVarU1 = U1();
            }
        }
        hVarU1.d(b1Var);
        return hVarU1.a(i14, xVar.getF68910b());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013  */
    @Override // h5.c0
    public final int minIntrinsicWidth(x xVar, w wVar, int i14) {
        h hVarU1;
        b1 b1Var = (b1) xVar;
        a aVar = this.f194199l;
        if (aVar == null) {
            hVarU1 = U1();
        } else {
            if (!aVar.f194202c) {
                aVar = null;
            }
            if (aVar == null || (hVarU1 = aVar.f194203d) == null) {
                hVarU1 = U1();
            }
        }
        hVarU1.d(b1Var);
        return o2.a(hVarU1.e(xVar.getF68910b()).c());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0018  */
    @Override // h5.s
    public final void p(h5.h0 h0Var) {
        h hVarU1;
        long jC;
        if (getIsAttached()) {
            a aVar = this.f194199l;
            if (aVar == null) {
                hVarU1 = U1();
            } else {
                if (!aVar.f194202c) {
                    aVar = null;
                }
                if (aVar == null || (hVarU1 = aVar.f194203d) == null) {
                    hVarU1 = U1();
                }
            }
            s5.b bVar = hVarU1.f194090j;
            if (bVar == null) {
                b2.e.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.f194197j + ", textSubstitution=" + this.f194199l + CoreConstants.RIGHT_PARENTHESIS_CHAR);
                o2.c.f();
                return;
            }
            y yVarA = h0Var.f81825a.f142543b.a();
            boolean z14 = hVarU1.f194091k;
            if (z14) {
                long j8 = hVarU1.f194092l;
                yVarA.l();
                o4.c0.f128819b.getClass();
                yVarA.a(0.0f, 0.0f, (int) (j8 >> 32), (int) (j8 & 4294967295L), o4.c0.f128820c);
            }
            try {
                d6.i iVar = this.f194189b.f157322a.background;
                if (iVar == null) {
                    d6.i.f57760b.getClass();
                    iVar = d6.i.f57761c;
                }
                d6.i iVar2 = iVar;
                q1 q1Var = this.f194189b.f157322a.shadow;
                if (q1Var == null) {
                    q1.f128956d.getClass();
                    q1Var = q1.f128957e;
                }
                q1 q1Var2 = q1Var;
                x0 x0Var = this.f194189b;
                q4.g gVar = x0Var.f157322a.drawStyle;
                if (gVar == null) {
                    gVar = q4.j.f142560a;
                }
                q4.g gVar2 = gVar;
                o4.w wVarB = x0Var.b();
                if (wVarB != null) {
                    float f57706c = this.f194189b.f157322a.f157211a.getF57706c();
                    q4.f.f142555o0.getClass();
                    bVar.t(yVarA, wVarB, f57706c, q1Var2, iVar2, gVar2, q4.f.a.f142557b);
                } else {
                    j0 j0Var = this.f194195h;
                    if (j0Var != null) {
                        jC = j0Var.a();
                    } else {
                        d0.f128823b.getClass();
                        jC = d0.f128832k;
                    }
                    if (jC == 16) {
                        if (this.f194189b.c() != 16) {
                            jC = this.f194189b.c();
                        } else {
                            d0.f128823b.getClass();
                            jC = d0.f128824c;
                        }
                    }
                    q4.f.f142555o0.getClass();
                    bVar.k(yVarA, jC, q1Var2, iVar2, gVar2, q4.f.a.f142557b);
                }
            } finally {
                if (z14) {
                    yVarA.i();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ly2/v$a;", "", "", "original", "substitution", "", "isShowingSubstitution", "Ly2/h;", "layoutCache", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLy2/h;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f194200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f194201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f194202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public h f194203d;

        public /* synthetic */ a(String str, String str2, boolean z14, h hVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, str2, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? null : hVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f194200a, aVar.f194200a) && p005kotlin.jvm.internal.s.g(this.f194201b, aVar.f194201b) && this.f194202c == aVar.f194202c && p005kotlin.jvm.internal.s.g(this.f194203d, aVar.f194203d);
        }

        public final int hashCode() {
            int iG = q6.f.g(wr.g.j(this.f194200a.hashCode() * 31, 31, this.f194201b), 31, this.f194202c);
            h hVar = this.f194203d;
            return iG + (hVar == null ? 0 : hVar.hashCode());
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("TextSubstitution(layoutCache=");
            sb3.append(this.f194203d);
            sb3.append(", isShowingSubstitution=");
            return am.j.t(sb3, this.f194202c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        public a(String str, String str2, boolean z14, h hVar) {
            this.f194200a = str;
            this.f194201b = str2;
            this.f194202c = z14;
            this.f194203d = hVar;
        }
    }

    private v(String str, x0 x0Var, w5.q.b bVar, int i14, boolean z14, int i15, int i16, j0 j0Var) {
        this.f194188a = str;
        this.f194189b = x0Var;
        this.f194190c = bVar;
        this.f194191d = i14;
        this.f194192e = z14;
        this.f194193f = i15;
        this.f194194g = i16;
        this.f194195h = j0Var;
    }

    public /* synthetic */ v(String str, x0 x0Var, w5.q.b bVar, int i14, boolean z14, int i15, int i16, j0 j0Var, p005kotlin.jvm.internal.j jVar) {
        this(str, x0Var, bVar, i14, z14, i15, i16, j0Var);
    }
}
