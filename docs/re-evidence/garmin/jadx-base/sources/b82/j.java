package b82;

import c2.s2;
import c2.u2;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import i3.e5;
import i3.fb;
import i3.gb;
import i3.i7;
import i3.mh;
import java.util.List;
import l72.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lb82/j;", "", "<init>", "()V", "a", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f16611a = new j();

    private j() {
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01f8  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i14, e23.l lVar, i53.c cVar, String str, p3.m mVar) {
        String str2;
        cVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(1769949704);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | 48 | (o0VarE.B(cVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (cVar.size() == 1) {
                o0VarE.C(-741598432);
                a aVar = (a) p13.h0.d0(cVar);
                if (aVar == null) {
                    o0VarE.C(-741598433);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-741598432);
                    f16611a.b(384, 0, aVar.f16613b, aVar.f16615d, o0VarE);
                    Unit unit = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                Object objH = q2.h(o0VarE, -741387725, p3.m.f135153a);
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objH == c2565a) {
                    objH = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objH);
                }
                p3.p1 p1Var = (p3.p1) objH;
                Object objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = kg.f.b(o0VarE);
                }
                a2.j jVar = (a2.j) objQ;
                h4.r.a aVar2 = h4.r.S;
                gb gbVarA = fb.a(0.0f, 6, 0L, true);
                p5.l.f136032b.getClass();
                p5.l lVarA = p5.l.a(p5.l.f136038h);
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new ak0.z(p1Var, 18);
                    o0VarE.K(objQ2);
                }
                Object obj = null;
                h4.r rVarY = c2.l.y(u1.w.b(aVar2, jVar, gbVarA, true, null, lVarA, (e23.a) objQ2, 8), 16);
                h4.d.f81522a.getClass();
                h4.g gVar = h4.d.a.f81524b;
                f5.z0 z0VarD = c2.q.d(gVar, false);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarY, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar3 = h5.g.a.f81805b;
                if (cVar2 == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                h5.g.a.e eVar = h5.g.a.f81810g;
                b4.c(eVar, z0VarD, o0VarE);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.u uVar = c2.u.f22885a;
                f5.z0 z0VarD2 = c2.q.d(gVar, false);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(aVar2, o0VarE);
                if (cVar2 == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                h4.g.b bVar2 = h4.d.a.f81534l;
                c2.j.f22691a.getClass();
                s2 s2VarA = c2.q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
                int iHashCode3 = Long.hashCode(o0VarE.U);
                i2 i2VarA2 = o0VarE.a0();
                h4.r rVarC3 = h4.k.c(aVar2, o0VarE);
                if (cVar2 == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC3, o0VarE);
                u2 u2Var = u2.f22900a;
                if (str != null) {
                    for (Object obj2 : cVar) {
                        if (p005kotlin.jvm.internal.s.g(((a) obj2).f16612a, str)) {
                            obj = obj2;
                            break;
                        }
                    }
                    a aVar4 = (a) obj;
                    if (aVar4 == null || (str2 = aVar4.f16613b) == null) {
                        str2 = "";
                    }
                } else {
                    str2 = "";
                }
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
                b3.b.f15502a.getClass();
                i7.b(d3.c.a(), null, null, sn.a.y(o0VarE), o0VarE, 48, 4);
                o0VarE.g0(true);
                boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                long jW = ds.e0.w(o0VarE);
                Object objQ3 = o0VarE.q();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new ak0.z(p1Var, 19);
                    o0VarE.K(objQ3);
                }
                i3.u.a(zBooleanValue, (e23.a) objQ3, null, 0L, null, null, null, jW, 0.0f, 0.0f, z3.f.c(-479503085, new a42.y((List) cVar, lVar, p1Var, (Object) str, 10), o0VarE), o0VarE, 48, 48, 1916);
                o0VarE = o0VarE;
                e5.u(o0VarE, true, true, false);
                Unit unit2 = Unit.INSTANCE;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.l((Object) this, (Object) str, (Object) cVar, lVar, i14, 16);
        }
    }

    public final void b(int i14, int i15, String str, String str2, p3.m mVar) {
        Object obj;
        int i16;
        p3.o0 o0Var;
        Object obj2;
        str.getClass();
        p3.o0 o0VarE = mVar.E(-900278373);
        int i17 = i14 | (o0VarE.B(str) ? 4 : 2);
        int i18 = i15 & 2;
        if (i18 != 0) {
            i16 = i17 | 48;
            obj = str2;
        } else {
            obj = str2;
            i16 = i17 | (o0VarE.B(obj) ? 32 : 16);
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            Object obj3 = i18 != 0 ? null : obj;
            p3.x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97931h, o0VarE);
            g6.f.a aVar = g6.f.f75994b;
            o0Var = o0VarE;
            mh.c(str, v2.b(c2.l.y(h4.r.S, 16), obj3, new i(0), o0VarE, (i16 & 112) | 6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, i16 & 14, 0, 131068);
            obj2 = obj3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            obj2 = obj;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(this, str, obj2, i14, i15, 1);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lb82/j$a;", "", "", TtmlNode.ATTR_ID, "Lu4/d;", "leadingIcon", "trailingIcon", "shortName", "", "enabled", "longName", "contentDescription", "<init>", "(Ljava/lang/String;Lu4/d;Lu4/d;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f16613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f16614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f16615d;

        public /* synthetic */ a(String str, u4.d dVar, u4.d dVar2, String str2, boolean z14, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : dVar, (i14 & 4) != 0 ? null : dVar2, str2, (i14 & 16) != 0 ? true : z14, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : str4);
        }

        public a(String str, u4.d dVar, u4.d dVar2, String str2, boolean z14, String str3, String str4) {
            str.getClass();
            str2.getClass();
            this.f16612a = str;
            this.f16613b = str2;
            this.f16614c = str3;
            this.f16615d = str4;
        }
    }
}
