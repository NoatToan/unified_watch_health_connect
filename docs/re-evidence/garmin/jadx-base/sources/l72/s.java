package l72;

import b21.p9;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e5;
import i3.i7;
import i3.mh;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Ll72/s;", "", "<init>", "()V", "a", "b", "", "isTitleMultiline", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f111232a = new s();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll72/s$a;", "", "<init>", "(Ljava/lang/String;I)V", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        COLOR,
        KNOCKOUT
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll72/s$b;", "", "<init>", "(Ljava/lang/String;I)V", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        INFO,
        CAUTION,
        SUCCESS,
        ALERT
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f111242b;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.COLOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.KNOCKOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f111241a = iArr;
            int[] iArr2 = new int[b.values().length];
            try {
                iArr2[b.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[b.CAUTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[b.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[b.ALERT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f111242b = iArr2;
        }
    }

    private s() {
    }

    public static long f(b bVar, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        int i14 = c.f111242b[bVar.ordinal()];
        if (i14 == 1) {
            mVar.C(1948439354);
            d92.b.f58623a.getClass();
            long jB = d92.b.a(mVar).k().b();
            mVar.f();
            return jB;
        }
        if (i14 == 2) {
            mVar.C(1948441246);
            d92.b.f58623a.getClass();
            long j8 = d92.b.a(mVar).k().f63528e;
            mVar.f();
            return j8;
        }
        if (i14 == 3) {
            mVar.C(1948443258);
            d92.b.f58623a.getClass();
            long jB2 = d92.b.a(mVar).k().b();
            mVar.f();
            return jB2;
        }
        if (i14 != 4) {
            throw n23.j.m(mVar, 1948437625);
        }
        mVar.C(1948445086);
        d92.b.f58623a.getClass();
        long j14 = d92.b.a(mVar).k().f63527d;
        mVar.f();
        return j14;
    }

    public final void a(boolean z14, e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14) {
        int i15;
        pVar.getClass();
        p3.o0 o0VarE = mVar.E(1535538388);
        int i16 = 4;
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.h(z14) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            r1.c0.e(z14, null, r1.u0.d(null, 3).b(r1.u0.c(null, null, 15)), r1.u0.e(null, 3).b(r1.u0.j(null, null, 15)), null, z3.f.c(-227591428, new ba2.i(pVar, i16), o0VarE), o0VarE, (i15 & 14) | 200064, 18);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b(this, z14, pVar, i14, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:117:0x0206  */
    /* JADX WARN: Code duplicated, block: B:119:0x020d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0211  */
    /* JADX WARN: Code duplicated, block: B:125:0x022c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0248  */
    /* JADX WARN: Code duplicated, block: B:129:0x024c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0250  */
    /* JADX WARN: Code duplicated, block: B:133:0x0296  */
    /* JADX WARN: Code duplicated, block: B:135:0x029d  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:141:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:144:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:146:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:147:0x0304  */
    /* JADX WARN: Code duplicated, block: B:149:0x030d  */
    /* JADX WARN: Code duplicated, block: B:151:0x036f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0375  */
    /* JADX WARN: Code duplicated, block: B:156:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:158:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:159:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:164:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:167:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:169:0x041d  */
    /* JADX WARN: Code duplicated, block: B:170:0x041f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0429  */
    /* JADX WARN: Code duplicated, block: B:174:0x042b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0439  */
    /* JADX WARN: Code duplicated, block: B:182:0x0496  */
    /* JADX WARN: Code duplicated, block: B:185:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:186:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:189:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:190:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:193:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:194:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:197:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:200:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:201:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:205:0x0533  */
    /* JADX WARN: Code duplicated, block: B:207:0x0593  */
    /* JADX WARN: Code duplicated, block: B:210:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:211:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:214:0x05b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:219:0x05db  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r22v1, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r8v10, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v5, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r8v6, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r8v8, types: [p3.o0] */
    public final void b(h4.r rVar, u4.d dVar, a aVar, e23.p pVar, String str, String str2, String str3, boolean z14, e23.a aVar2, e23.a aVar3, p3.m mVar, int i14, int i15) {
        int i16;
        int i17;
        e23.a aVar4;
        ?? r14;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        c2.u2 u2Var;
        h4.r.a aVar5;
        h5.g.a.b bVar;
        c2.u2 u2Var2;
        h5.g.a.C1623g c1623g;
        float f14;
        j92.b bVar2;
        j92.e eVar;
        f5.z0 z0VarD;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        int i18;
        long jE;
        long j8;
        j92.b bVar3;
        j92.e eVar2;
        c2.z zVarA;
        int iHashCode2;
        p3.i2 i2VarA1;
        h4.r rVarC2;
        int i19;
        ?? r15;
        p3.o0 o0Var;
        j92.f fVar2;
        s5.x0 x0Var;
        ?? r16;
        ?? r17;
        ?? r18;
        int i24;
        Object objQ;
        p3.m.a.C2565a c2565a;
        ?? r19;
        ?? r24;
        ?? r110;
        Object objQ2;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objQ3;
        f5.z0 z0VarD2;
        int iHashCode3;
        p3.i2 i2VarA2;
        h4.r rVarC3;
        p3.o0 o0VarE = mVar.E(1393142027);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.k(aVar == null ? -1 : aVar.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(pVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.B(str) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i16 |= o0VarE.B(str2) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= o0VarE.B(str3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= o0VarE.B(null) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= o0VarE.h(z14) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarE.r(aVar2) ? 536870912 : 268435456;
        }
        int i25 = i16;
        if ((i15 & 6) == 0) {
            i17 = i15 | (o0VarE.r(aVar3) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if (o0VarE.n(i25 & 1, ((i25 & 306783379) == 306783378 && (i17 & 3) == 2) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            float f15 = 8;
            g6.f.a aVar6 = g6.f.f75994b;
            k2.h hVarA = k2.i.a(f15);
            long jB = am.j.B(d92.b.f58623a, o0VarE);
            Object objQ4 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ4 == c2565a2) {
                objQ4 = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ4;
            h4.r.a aVar7 = h4.r.S;
            h4.r rVarThen = rVar.then(v2.a(l4.k.b(v2.a(c2.x2.f(u1.n.e(aVar7, jB, hVarA), 1.0f), !z14, new kq.r(29), o0VarE, 0), hVarA), aVar3 != null, new p9(jVar, z14, aVar3, 10), o0VarE, 0));
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            c2.s2 s2VarA = c2.q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode4 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA3 = o0VarE.a0();
            h4.r rVarC4 = h4.k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar8 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
            b4.c(c1623g2, i2VarA3, o0VarE);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC4, o0VarE);
                u2Var = c2.u2.f22900a;
                if (pVar != null) {
                    o0VarE.C(1552234745);
                    j92.b bVar5 = d92.b.f58625c;
                    bVar5.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    float f16 = eVar4.f97920e;
                    bVar5.getClass();
                    float f17 = eVar4.f97920e;
                    bVar5.getClass();
                    aVar5 = aVar7;
                    h4.r rVarC5 = c2.l.C(aVar5, f16, f17, 0.0f, eVar4.f97920e, 4);
                    z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    iHashCode3 = Long.hashCode(o0VarE.U);
                    i2VarA2 = o0VarE.a0();
                    rVarC3 = h4.k.c(rVarC5, o0VarE);
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar8);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar3, z0VarD2, o0VarE);
                    b4.c(c1623g2, i2VarA2, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
                    }
                    b4.c(fVar, rVarC3, o0VarE);
                    c2.u uVar = c2.u.f22885a;
                    e5.r((i25 >> 9) & 14, pVar, o0VarE, true, false);
                    bVar = bVar4;
                    u2Var2 = u2Var;
                    c1623g = c1623g2;
                    f14 = 1.0f;
                } else {
                    aVar5 = aVar7;
                    if (dVar != null) {
                        o0VarE.C(1552513187);
                        bVar2 = d92.b.f58625c;
                        bVar2.getClass();
                        eVar = j92.b.f97899b;
                        float f18 = eVar.f97920e;
                        bVar2.getClass();
                        float f19 = eVar.f97920e;
                        bVar2.getClass();
                        h4.r rVarC6 = c2.l.C(aVar5, f18, f19, 0.0f, eVar.f97920e, 4);
                        z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = h4.k.c(rVarC6, o0VarE);
                        if (cVar != null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar8);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar3, z0VarD, o0VarE);
                        b4.c(c1623g2, i2VarA0, o0VarE);
                        if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                        }
                        b4.c(fVar, rVarC, o0VarE);
                        c2.u uVar2 = c2.u.f22885a;
                        d92.b.a(o0VarE).f().getClass();
                        d92.b.a(o0VarE).e().e();
                        i18 = c.f111241a[aVar.ordinal()];
                        if (i18 != 1) {
                            o0VarE.C(1910009308);
                            jE = d92.b.a(o0VarE).e().e();
                            o0VarE.g0(false);
                            Unit unit = Unit.INSTANCE;
                            j8 = jB;
                        } else {
                            if (i18 == 2) {
                                throw kg.f.h(o0VarE, -1462409089, false);
                            }
                            j8 = zl.a.b(o0VarE, 1910223053, o0VarE).f63508c;
                            jE = d92.b.a(o0VarE).e().f();
                            o0VarE.g0(false);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        h4.r rVarE = u1.n.e(l4.k.b(aVar5, k2.i.f102406a), jE, o4.m1.f128891a);
                        bVar2.getClass();
                        h4.r rVarQ = c2.x2.q(rVarE, j92.b.f97901d.f97906e);
                        bVar2.getClass();
                        c1623g = c1623g2;
                        bVar = bVar4;
                        u2Var2 = u2Var;
                        f14 = 1.0f;
                        aVar5 = aVar5;
                        i7.b(dVar, null, c2.l.y(rVarQ, eVar.f97918c), j8, o0VarE, ((i25 >> 3) & 14) | 48, 0);
                        o0VarE.g0(true);
                        o0VarE.g0(false);
                    } else {
                        bVar = bVar4;
                        u2Var2 = u2Var;
                        c1623g = c1623g2;
                        f14 = 1.0f;
                        o0VarE.C(1553674075);
                        o0VarE.g0(false);
                    }
                }
                bVar3 = d92.b.f58625c;
                bVar3.getClass();
                eVar2 = j92.b.f97899b;
                h4.r rVarA = u2Var2.a(c2.l.C(aVar5, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), f14, true);
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                p3.x1 x1Var2 = p3.n.f135158a;
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarA, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw 0;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar8);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, zVarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                if (str != null) {
                    o0VarE.C(-1631577359);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                    h4.r rVarC7 = c2.l.C(aVar5, 16, 0.0f, 0.0f, f15, 6);
                    if ((i25 & 29360128) == 8388608) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((i25 & 57344) == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z15 | z16;
                    objQ3 = o0VarE.q();
                    if (z17 || objQ3 == r21) {
                        objQ3 = new jl0.e(str, 20);
                        o0VarE.K(objQ3);
                    }
                    i19 = 8388608;
                    r15 = 0;
                    mh.c(str, p5.v.c((e23.l) objQ3, rVarC7, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, (i25 >> 12) & 14, 0, 131068);
                    p3.o0 o0Var2 = o0VarE;
                    o0Var2.g0(false);
                    o0Var = o0Var2;
                } else {
                    i19 = 8388608;
                    r15 = 0;
                    o0VarE.C(-1631159727);
                    o0VarE.g0(false);
                    o0Var = o0VarE;
                }
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0Var = j92.f.f97932i;
                s5.x0 x0VarB2 = d92.c.b(x0Var, o0Var);
                bVar3.getClass();
                h4.r rVarC8 = c2.l.C(aVar5, eVar2.f97920e, 0.0f, 0.0f, 0.0f, 14);
                if (str3 == null) {
                    r16 = 1;
                } else {
                    r16 = r15;
                }
                h4.r rVarA2 = v2.a(rVarC8, r16, new q(r15), o0Var, r15);
                if ((i25 & 29360128) == i19) {
                    r17 = 1;
                } else {
                    r17 = r15;
                }
                if ((i25 & 458752) == 131072) {
                    r18 = 1;
                } else {
                    r18 = r15;
                }
                i24 = r18 | r17;
                objQ = o0Var.q();
                if (i24 == 0) {
                    c2565a = c2565a2;
                    if (objQ == c2565a) {
                    }
                    p3.o0 o0Var3 = o0Var;
                    mh.c(str2, p5.v.c((e23.l) objQ, rVarA2, r15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0Var3, (i25 >> 15) & 14, 0, 131068);
                    r19 = o0Var3;
                    if (str3 != null) {
                        r19.C(-1630585855);
                        fVar2.getClass();
                        s5.x0 x0VarE = d92.c.e(x0Var);
                        long jA = d92.b.a(r19).k().a();
                        bVar3.getClass();
                        float f22 = eVar2.f97920e;
                        bVar3.getClass();
                        float f24 = eVar2.f97920e;
                        bVar3.getClass();
                        mh.c(str3, c2.l.C(aVar5, f22, eVar2.f97918c, 0.0f, f24, 4), jA, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE, r19, (i25 >> 18) & 14, 0, 131064);
                        ?? r25 = r19;
                        r25.g0(r15);
                        r24 = r25;
                    } else {
                        r19.C(-1630245103);
                        r19.g0(r15);
                        r24 = r19;
                    }
                    r24.g0(true);
                    o0 o0Var4 = o0.SMALL;
                    if ((i25 & 1879048192) == 536870912) {
                        r110 = 1;
                    } else {
                        r110 = r15;
                    }
                    objQ2 = r24.q();
                    if (r110 == 0 || objQ2 == c2565a) {
                        aVar4 = aVar2;
                        objQ2 = new ku1.a(aVar4, 26);
                        r24.K(objQ2);
                    } else {
                        aVar4 = aVar2;
                    }
                    ?? r26 = r24;
                    u0.a(null, o0Var4, null, null, (e23.a) objQ2, r26, 48, 13);
                    ?? r27 = r26;
                    r27.g0(true);
                    r14 = r27;
                } else {
                    c2565a = r21;
                }
                objQ = new jl0.e(str2, 21);
                o0Var.K(objQ);
                p3.o0 o0Var5 = o0Var;
                mh.c(str2, p5.v.c((e23.l) objQ, rVarA2, r15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0Var5, (i25 >> 15) & 14, 0, 131068);
                r19 = o0Var5;
                if (str3 != null) {
                    r19.C(-1630585855);
                    fVar2.getClass();
                    s5.x0 x0VarE2 = d92.c.e(x0Var);
                    long jA2 = d92.b.a(r19).k().a();
                    bVar3.getClass();
                    float f25 = eVar2.f97920e;
                    bVar3.getClass();
                    float f26 = eVar2.f97920e;
                    bVar3.getClass();
                    mh.c(str3, c2.l.C(aVar5, f25, eVar2.f97918c, 0.0f, f26, 4), jA2, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE2, r19, (i25 >> 18) & 14, 0, 131064);
                    ?? r28 = r19;
                    r28.g0(r15);
                    r24 = r28;
                } else {
                    r19.C(-1630245103);
                    r19.g0(r15);
                    r24 = r19;
                }
                r24.g0(true);
                o0 o0Var6 = o0.SMALL;
                if ((i25 & 1879048192) == 536870912) {
                    r110 = 1;
                } else {
                    r110 = r15;
                }
                objQ2 = r24.q();
                if (r110 == 0) {
                    aVar4 = aVar2;
                    objQ2 = new ku1.a(aVar4, 26);
                    r24.K(objQ2);
                } else {
                    aVar4 = aVar2;
                    objQ2 = new ku1.a(aVar4, 26);
                    r24.K(objQ2);
                }
                ?? r29 = r24;
                u0.a(null, o0Var6, null, null, (e23.a) objQ2, r29, 48, 13);
                ?? r210 = r29;
                r210.g0(true);
                r14 = r210;
            }
            v.h.A(iHashCode4, o0VarE, iHashCode4, bVar4);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC4, o0VarE);
            u2Var = c2.u2.f22900a;
            if (pVar != null) {
                o0VarE.C(1552234745);
                j92.b bVar6 = d92.b.f58625c;
                bVar6.getClass();
                j92.e eVar5 = j92.b.f97899b;
                float f110 = eVar5.f97920e;
                bVar6.getClass();
                float f111 = eVar5.f97920e;
                bVar6.getClass();
                aVar5 = aVar7;
                h4.r rVarC9 = c2.l.C(aVar5, f110, f111, 0.0f, eVar5.f97920e, 4);
                z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = h4.k.c(rVarC9, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar8);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, z0VarD2, o0VarE);
                b4.c(c1623g2, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
                } else {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
                }
                b4.c(fVar, rVarC3, o0VarE);
                c2.u uVar3 = c2.u.f22885a;
                e5.r((i25 >> 9) & 14, pVar, o0VarE, true, false);
                bVar = bVar4;
                u2Var2 = u2Var;
                c1623g = c1623g2;
                f14 = 1.0f;
            } else {
                aVar5 = aVar7;
                if (dVar != null) {
                    o0VarE.C(1552513187);
                    bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    eVar = j92.b.f97899b;
                    float f112 = eVar.f97920e;
                    bVar2.getClass();
                    float f113 = eVar.f97920e;
                    bVar2.getClass();
                    h4.r rVarC10 = c2.l.C(aVar5, f112, f113, 0.0f, eVar.f97920e, 4);
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarC10, o0VarE);
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar8);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar3, z0VarD, o0VarE);
                    b4.c(c1623g2, i2VarA0, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    c2.u uVar4 = c2.u.f22885a;
                    d92.b.a(o0VarE).f().getClass();
                    d92.b.a(o0VarE).e().e();
                    i18 = c.f111241a[aVar.ordinal()];
                    if (i18 != 1) {
                        o0VarE.C(1910009308);
                        jE = d92.b.a(o0VarE).e().e();
                        o0VarE.g0(false);
                        Unit unit3 = Unit.INSTANCE;
                        j8 = jB;
                    } else {
                        if (i18 == 2) {
                            throw kg.f.h(o0VarE, -1462409089, false);
                        }
                        j8 = zl.a.b(o0VarE, 1910223053, o0VarE).f63508c;
                        jE = d92.b.a(o0VarE).e().f();
                        o0VarE.g0(false);
                        Unit unit4 = Unit.INSTANCE;
                    }
                    h4.r rVarE2 = u1.n.e(l4.k.b(aVar5, k2.i.f102406a), jE, o4.m1.f128891a);
                    bVar2.getClass();
                    h4.r rVarQ2 = c2.x2.q(rVarE2, j92.b.f97901d.f97906e);
                    bVar2.getClass();
                    c1623g = c1623g2;
                    bVar = bVar4;
                    u2Var2 = u2Var;
                    f14 = 1.0f;
                    aVar5 = aVar5;
                    i7.b(dVar, null, c2.l.y(rVarQ2, eVar.f97918c), j8, o0VarE, ((i25 >> 3) & 14) | 48, 0);
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                } else {
                    bVar = bVar4;
                    u2Var2 = u2Var;
                    c1623g = c1623g2;
                    f14 = 1.0f;
                    o0VarE.C(1553674075);
                    o0VarE.g0(false);
                }
            }
            bVar3 = d92.b.f58625c;
            bVar3.getClass();
            eVar2 = j92.b.f97899b;
            h4.r rVarA3 = u2Var2.a(c2.l.C(aVar5, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), f14, true);
            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            p3.x1 x1Var3 = p3.n.f135158a;
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarA3, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw 0;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            b4.c(eVar3, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            if (str != null) {
                o0VarE.C(-1631577359);
                d92.b.f58624b.getClass();
                s5.x0 x0VarB3 = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                h4.r rVarC11 = c2.l.C(aVar5, 16, 0.0f, 0.0f, f15, 6);
                if ((i25 & 29360128) == 8388608) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i25 & 57344) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z15 | z16;
                objQ3 = o0VarE.q();
                if (z17) {
                    objQ3 = new jl0.e(str, 20);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new jl0.e(str, 20);
                    o0VarE.K(objQ3);
                }
                i19 = 8388608;
                r15 = 0;
                mh.c(str, p5.v.c((e23.l) objQ3, rVarC11, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB3, o0VarE, (i25 >> 12) & 14, 0, 131068);
                p3.o0 o0Var7 = o0VarE;
                o0Var7.g0(false);
                o0Var = o0Var7;
            } else {
                i19 = 8388608;
                r15 = 0;
                o0VarE.C(-1631159727);
                o0VarE.g0(false);
                o0Var = o0VarE;
            }
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0Var = j92.f.f97932i;
            s5.x0 x0VarB4 = d92.c.b(x0Var, o0Var);
            bVar3.getClass();
            h4.r rVarC12 = c2.l.C(aVar5, eVar2.f97920e, 0.0f, 0.0f, 0.0f, 14);
            if (str3 == null) {
                r16 = 1;
            } else {
                r16 = r15;
            }
            h4.r rVarA4 = v2.a(rVarC12, r16, new q(r15), o0Var, r15);
            if ((i25 & 29360128) == i19) {
                r17 = 1;
            } else {
                r17 = r15;
            }
            if ((i25 & 458752) == 131072) {
                r18 = 1;
            } else {
                r18 = r15;
            }
            i24 = r18 | r17;
            objQ = o0Var.q();
            if (i24 == 0) {
                c2565a = c2565a2;
                if (objQ == c2565a) {
                }
                p3.o0 o0Var8 = o0Var;
                mh.c(str2, p5.v.c((e23.l) objQ, rVarA4, r15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB4, o0Var8, (i25 >> 15) & 14, 0, 131068);
                r19 = o0Var8;
                if (str3 != null) {
                    r19.C(-1630585855);
                    fVar2.getClass();
                    s5.x0 x0VarE3 = d92.c.e(x0Var);
                    long jA3 = d92.b.a(r19).k().a();
                    bVar3.getClass();
                    float f27 = eVar2.f97920e;
                    bVar3.getClass();
                    float f28 = eVar2.f97920e;
                    bVar3.getClass();
                    mh.c(str3, c2.l.C(aVar5, f27, eVar2.f97918c, 0.0f, f28, 4), jA3, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE3, r19, (i25 >> 18) & 14, 0, 131064);
                    ?? r211 = r19;
                    r211.g0(r15);
                    r24 = r211;
                } else {
                    r19.C(-1630245103);
                    r19.g0(r15);
                    r24 = r19;
                }
                r24.g0(true);
                o0 o0Var9 = o0.SMALL;
                if ((i25 & 1879048192) == 536870912) {
                    r110 = 1;
                } else {
                    r110 = r15;
                }
                objQ2 = r24.q();
                if (r110 == 0) {
                    aVar4 = aVar2;
                    objQ2 = new ku1.a(aVar4, 26);
                    r24.K(objQ2);
                } else {
                    aVar4 = aVar2;
                    objQ2 = new ku1.a(aVar4, 26);
                    r24.K(objQ2);
                }
                ?? r212 = r24;
                u0.a(null, o0Var9, null, null, (e23.a) objQ2, r212, 48, 13);
                ?? r213 = r212;
                r213.g0(true);
                r14 = r213;
            } else {
                c2565a = r21;
            }
            objQ = new jl0.e(str2, 21);
            o0Var.K(objQ);
            p3.o0 o0Var10 = o0Var;
            mh.c(str2, p5.v.c((e23.l) objQ, rVarA4, r15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB4, o0Var10, (i25 >> 15) & 14, 0, 131068);
            r19 = o0Var10;
            if (str3 != null) {
                r19.C(-1630585855);
                fVar2.getClass();
                s5.x0 x0VarE4 = d92.c.e(x0Var);
                long jA4 = d92.b.a(r19).k().a();
                bVar3.getClass();
                float f29 = eVar2.f97920e;
                bVar3.getClass();
                float f210 = eVar2.f97920e;
                bVar3.getClass();
                mh.c(str3, c2.l.C(aVar5, f29, eVar2.f97918c, 0.0f, f210, 4), jA4, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE4, r19, (i25 >> 18) & 14, 0, 131064);
                ?? r214 = r19;
                r214.g0(r15);
                r24 = r214;
            } else {
                r19.C(-1630245103);
                r19.g0(r15);
                r24 = r19;
            }
            r24.g0(true);
            o0 o0Var11 = o0.SMALL;
            if ((i25 & 1879048192) == 536870912) {
                r110 = 1;
            } else {
                r110 = r15;
            }
            objQ2 = r24.q();
            if (r110 == 0) {
                aVar4 = aVar2;
                objQ2 = new ku1.a(aVar4, 26);
                r24.K(objQ2);
            } else {
                aVar4 = aVar2;
                objQ2 = new ku1.a(aVar4, 26);
                r24.K(objQ2);
            }
            ?? r215 = r24;
            u0.a(null, o0Var11, null, null, (e23.a) objQ2, r215, 48, 13);
            ?? r216 = r215;
            r216.g0(true);
            r14 = r216;
        } else {
            aVar4 = aVar2;
            o0VarE.e();
            r14 = o0VarE;
        }
        p3.p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.i(this, rVar, dVar, aVar, pVar, str, str2, str3, z14, aVar4, aVar3, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0123  */
    /* JADX WARN: Code duplicated, block: B:102:0x0126  */
    /* JADX WARN: Code duplicated, block: B:104:0x012b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0137  */
    /* JADX WARN: Code duplicated, block: B:109:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0140  */
    /* JADX WARN: Code duplicated, block: B:114:0x0150  */
    /* JADX WARN: Code duplicated, block: B:118:0x0159  */
    /* JADX WARN: Code duplicated, block: B:121:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0165  */
    /* JADX WARN: Code duplicated, block: B:123:0x0169  */
    /* JADX WARN: Code duplicated, block: B:126:0x016d  */
    /* JADX WARN: Code duplicated, block: B:127:0x016f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0172  */
    /* JADX WARN: Code duplicated, block: B:130:0x0175  */
    /* JADX WARN: Code duplicated, block: B:132:0x0179  */
    /* JADX WARN: Code duplicated, block: B:133:0x017b  */
    /* JADX WARN: Code duplicated, block: B:135:0x017f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0181  */
    /* JADX WARN: Code duplicated, block: B:138:0x0185  */
    /* JADX WARN: Code duplicated, block: B:140:0x0188  */
    /* JADX WARN: Code duplicated, block: B:141:0x018b  */
    /* JADX WARN: Code duplicated, block: B:143:0x018f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0191  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x010e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x0119  */
    public final void c(h4.r rVar, u4.d dVar, a aVar, e23.p pVar, String str, String str2, String str3, boolean z14, e23.a aVar2, e23.a aVar3, p3.m mVar, int i14, int i15, int i16) {
        h4.r rVar2;
        int i17;
        u4.d dVar2;
        int i18;
        int iOrdinal;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        String str4;
        int i29;
        int i30;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        boolean z15;
        a aVar4;
        e23.p pVar2;
        String str5;
        boolean z16;
        h4.r rVar3;
        u4.d dVar3;
        e23.a aVar5;
        String str6;
        p3.p2 p2VarI0;
        h4.r rVar4;
        u4.d dVar4;
        a aVar6;
        e23.p pVar3;
        String str7;
        boolean z17;
        e23.a aVar7;
        int i39;
        int i44;
        int i45;
        p3.o0 o0VarL = vb.h.l(506349935, aVar2, str2, mVar);
        int i46 = i16 & 1;
        if (i46 != 0) {
            i17 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i17 = (o0VarL.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i17 = i14;
        }
        int i47 = i16 & 2;
        if (i47 == 0) {
            if ((i14 & 48) == 0) {
                dVar2 = dVar;
                i17 |= o0VarL.B(dVar2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                i17 |= 384;
            } else if ((i14 & 384) == 0) {
                if (aVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = aVar.ordinal();
                }
                if (o0VarL.k(iOrdinal)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i24 = i16 & 8;
            if (i24 != 0) {
                if ((i14 & 3072) == 0) {
                    if (o0VarL.r(pVar)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i17 |= i25;
                }
                i26 = i16 & 16;
                if (i26 != 0) {
                    if ((i14 & 24576) == 0) {
                        if (o0VarL.B(str)) {
                            i27 = 16384;
                        } else {
                            i27 = 8192;
                        }
                        i17 |= i27;
                    }
                    if ((i14 & 196608) == 0) {
                        if (o0VarL.B(str2)) {
                            i45 = 131072;
                        } else {
                            i45 = 65536;
                        }
                        i17 |= i45;
                    }
                    i28 = i16 & 64;
                    if (i28 != 0) {
                        i17 |= 1572864;
                        str4 = str3;
                    } else {
                        str4 = str3;
                        if ((i14 & 1572864) == 0) {
                            if (o0VarL.B(str4)) {
                                i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            } else {
                                i29 = 524288;
                            }
                            i17 |= i29;
                        }
                    }
                    i30 = i17 | 12582912;
                    i34 = i16 & 256;
                    if (i34 != 0) {
                        if ((100663296 & i14) == 0) {
                            if (o0VarL.h(z14)) {
                                i35 = 67108864;
                            } else {
                                i35 = 33554432;
                            }
                            i30 |= i35;
                        }
                        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarL.r(aVar2)) {
                                i44 = 536870912;
                            } else {
                                i44 = 268435456;
                            }
                            i30 |= i44;
                        }
                        i36 = i16 & 1024;
                        if (i36 != 0) {
                            i37 = i15 | 6;
                        } else if ((i15 & 6) == 0) {
                            if (o0VarL.r(aVar3)) {
                                i38 = 4;
                            } else {
                                i38 = 2;
                            }
                            i37 = i15 | i38;
                        } else {
                            i37 = i15;
                        }
                        if ((i15 & 48) == 0) {
                            if (o0VarL.B(this)) {
                                i39 = 32;
                            } else {
                                i39 = 16;
                            }
                            i37 |= i39;
                        }
                        if ((i30 & 306783379) == 306783378 || (i37 & 19) != 18) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (o0VarL.n(i30 & 1, z15)) {
                            if (i46 != 0) {
                                rVar4 = h4.r.S;
                            } else {
                                rVar4 = rVar2;
                            }
                            if (i47 != 0) {
                                dVar4 = null;
                            } else {
                                dVar4 = dVar2;
                            }
                            if (i18 != 0) {
                                aVar6 = a.COLOR;
                            } else {
                                aVar6 = aVar;
                            }
                            if (i24 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i26 != 0) {
                                str7 = null;
                            } else {
                                str7 = str;
                            }
                            if (i28 != 0) {
                                str4 = null;
                            }
                            if (i34 != 0) {
                                z17 = true;
                            } else {
                                z17 = z14;
                            }
                            if (i36 != 0) {
                                aVar7 = null;
                            } else {
                                aVar7 = aVar3;
                            }
                            p3.x1 x1Var = p3.n.f135158a;
                            b(rVar4, dVar4, aVar6, pVar3, str7, str2, str4, z17, aVar2, aVar7, o0VarL, i30 & 2147483646, i37 & 126);
                            str5 = str7;
                            z16 = z17;
                            pVar2 = pVar3;
                            aVar5 = aVar7;
                            aVar4 = aVar6;
                            dVar3 = dVar4;
                            rVar3 = rVar4;
                        } else {
                            o0VarL.e();
                            aVar4 = aVar;
                            pVar2 = pVar;
                            str5 = str;
                            z16 = z14;
                            rVar3 = rVar2;
                            dVar3 = dVar2;
                            aVar5 = aVar3;
                        }
                        str6 = str4;
                        p2VarI0 = o0VarL.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new f21.k0(this, rVar3, dVar3, aVar4, pVar2, str5, str2, str6, z16, aVar2, aVar5, i14, i15, i16);
                        }
                    }
                    i30 = i17 | 113246208;
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarL.r(aVar2)) {
                            i44 = 536870912;
                        } else {
                            i44 = 268435456;
                        }
                        i30 |= i44;
                    }
                    i36 = i16 & 1024;
                    if (i36 != 0) {
                        i37 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarL.r(aVar3)) {
                            i38 = 4;
                        } else {
                            i38 = 2;
                        }
                        i37 = i15 | i38;
                    } else {
                        i37 = i15;
                    }
                    if ((i15 & 48) == 0) {
                        if (o0VarL.B(this)) {
                            i39 = 32;
                        } else {
                            i39 = 16;
                        }
                        i37 |= i39;
                    }
                    if ((i30 & 306783379) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (o0VarL.n(i30 & 1, z15)) {
                        if (i46 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i47 != 0) {
                            dVar4 = null;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i18 != 0) {
                            aVar6 = a.COLOR;
                        } else {
                            aVar6 = aVar;
                        }
                        if (i24 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i26 != 0) {
                            str7 = null;
                        } else {
                            str7 = str;
                        }
                        if (i28 != 0) {
                            str4 = null;
                        }
                        if (i34 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if (i36 != 0) {
                            aVar7 = null;
                        } else {
                            aVar7 = aVar3;
                        }
                        p3.x1 x1Var2 = p3.n.f135158a;
                        b(rVar4, dVar4, aVar6, pVar3, str7, str2, str4, z17, aVar2, aVar7, o0VarL, i30 & 2147483646, i37 & 126);
                        str5 = str7;
                        z16 = z17;
                        pVar2 = pVar3;
                        aVar5 = aVar7;
                        aVar4 = aVar6;
                        dVar3 = dVar4;
                        rVar3 = rVar4;
                    } else {
                        o0VarL.e();
                        aVar4 = aVar;
                        pVar2 = pVar;
                        str5 = str;
                        z16 = z14;
                        rVar3 = rVar2;
                        dVar3 = dVar2;
                        aVar5 = aVar3;
                    }
                    str6 = str4;
                    p2VarI0 = o0VarL.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new f21.k0(this, rVar3, dVar3, aVar4, pVar2, str5, str2, str6, z16, aVar2, aVar5, i14, i15, i16);
                    }
                }
                i17 |= 24576;
                if ((i14 & 196608) == 0) {
                    if (o0VarL.B(str2)) {
                        i45 = 131072;
                    } else {
                        i45 = 65536;
                    }
                    i17 |= i45;
                }
                i28 = i16 & 64;
                if (i28 != 0) {
                    i17 |= 1572864;
                    str4 = str3;
                } else {
                    str4 = str3;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarL.B(str4)) {
                            i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i29 = 524288;
                        }
                        i17 |= i29;
                    }
                }
                i30 = i17 | 12582912;
                i34 = i16 & 256;
                if (i34 != 0) {
                    if ((100663296 & i14) == 0) {
                        if (o0VarL.h(z14)) {
                            i35 = 67108864;
                        } else {
                            i35 = 33554432;
                        }
                        i30 |= i35;
                    }
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarL.r(aVar2)) {
                            i44 = 536870912;
                        } else {
                            i44 = 268435456;
                        }
                        i30 |= i44;
                    }
                    i36 = i16 & 1024;
                    if (i36 != 0) {
                        i37 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarL.r(aVar3)) {
                            i38 = 4;
                        } else {
                            i38 = 2;
                        }
                        i37 = i15 | i38;
                    } else {
                        i37 = i15;
                    }
                    if ((i15 & 48) == 0) {
                        if (o0VarL.B(this)) {
                            i39 = 32;
                        } else {
                            i39 = 16;
                        }
                        i37 |= i39;
                    }
                    if ((i30 & 306783379) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (o0VarL.n(i30 & 1, z15)) {
                        if (i46 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i47 != 0) {
                            dVar4 = null;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i18 != 0) {
                            aVar6 = a.COLOR;
                        } else {
                            aVar6 = aVar;
                        }
                        if (i24 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i26 != 0) {
                            str7 = null;
                        } else {
                            str7 = str;
                        }
                        if (i28 != 0) {
                            str4 = null;
                        }
                        if (i34 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if (i36 != 0) {
                            aVar7 = null;
                        } else {
                            aVar7 = aVar3;
                        }
                        p3.x1 x1Var3 = p3.n.f135158a;
                        b(rVar4, dVar4, aVar6, pVar3, str7, str2, str4, z17, aVar2, aVar7, o0VarL, i30 & 2147483646, i37 & 126);
                        str5 = str7;
                        z16 = z17;
                        pVar2 = pVar3;
                        aVar5 = aVar7;
                        aVar4 = aVar6;
                        dVar3 = dVar4;
                        rVar3 = rVar4;
                    } else {
                        o0VarL.e();
                        aVar4 = aVar;
                        pVar2 = pVar;
                        str5 = str;
                        z16 = z14;
                        rVar3 = rVar2;
                        dVar3 = dVar2;
                        aVar5 = aVar3;
                    }
                    str6 = str4;
                    p2VarI0 = o0VarL.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new f21.k0(this, rVar3, dVar3, aVar4, pVar2, str5, str2, str6, z16, aVar2, aVar5, i14, i15, i16);
                    }
                }
                i30 = i17 | 113246208;
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarL.r(aVar2)) {
                        i44 = 536870912;
                    } else {
                        i44 = 268435456;
                    }
                    i30 |= i44;
                }
                i36 = i16 & 1024;
                if (i36 != 0) {
                    i37 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarL.r(aVar3)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i37 = i15 | i38;
                } else {
                    i37 = i15;
                }
                if ((i15 & 48) == 0) {
                    if (o0VarL.B(this)) {
                        i39 = 32;
                    } else {
                        i39 = 16;
                    }
                    i37 |= i39;
                }
                if ((i30 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarL.n(i30 & 1, z15)) {
                    if (i46 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i47 != 0) {
                        dVar4 = null;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i18 != 0) {
                        aVar6 = a.COLOR;
                    } else {
                        aVar6 = aVar;
                    }
                    if (i24 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i26 != 0) {
                        str7 = null;
                    } else {
                        str7 = str;
                    }
                    if (i28 != 0) {
                        str4 = null;
                    }
                    if (i34 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i36 != 0) {
                        aVar7 = null;
                    } else {
                        aVar7 = aVar3;
                    }
                    p3.x1 x1Var4 = p3.n.f135158a;
                    b(rVar4, dVar4, aVar6, pVar3, str7, str2, str4, z17, aVar2, aVar7, o0VarL, i30 & 2147483646, i37 & 126);
                    str5 = str7;
                    z16 = z17;
                    pVar2 = pVar3;
                    aVar5 = aVar7;
                    aVar4 = aVar6;
                    dVar3 = dVar4;
                    rVar3 = rVar4;
                } else {
                    o0VarL.e();
                    aVar4 = aVar;
                    pVar2 = pVar;
                    str5 = str;
                    z16 = z14;
                    rVar3 = rVar2;
                    dVar3 = dVar2;
                    aVar5 = aVar3;
                }
                str6 = str4;
                p2VarI0 = o0VarL.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new f21.k0(this, rVar3, dVar3, aVar4, pVar2, str5, str2, str6, z16, aVar2, aVar5, i14, i15, i16);
                }
            }
            i17 |= 3072;
            i26 = i16 & 16;
            if (i26 != 0) {
                if ((i14 & 24576) == 0) {
                    if (o0VarL.B(str)) {
                        i27 = 16384;
                    } else {
                        i27 = 8192;
                    }
                    i17 |= i27;
                }
                if ((i14 & 196608) == 0) {
                    if (o0VarL.B(str2)) {
                        i45 = 131072;
                    } else {
                        i45 = 65536;
                    }
                    i17 |= i45;
                }
                i28 = i16 & 64;
                if (i28 != 0) {
                    i17 |= 1572864;
                    str4 = str3;
                } else {
                    str4 = str3;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarL.B(str4)) {
                            i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i29 = 524288;
                        }
                        i17 |= i29;
                    }
                }
                i30 = i17 | 12582912;
                i34 = i16 & 256;
                if (i34 != 0) {
                    if ((100663296 & i14) == 0) {
                        if (o0VarL.h(z14)) {
                            i35 = 67108864;
                        } else {
                            i35 = 33554432;
                        }
                        i30 |= i35;
                    }
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarL.r(aVar2)) {
                            i44 = 536870912;
                        } else {
                            i44 = 268435456;
                        }
                        i30 |= i44;
                    }
                    i36 = i16 & 1024;
                    if (i36 != 0) {
                        i37 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarL.r(aVar3)) {
                            i38 = 4;
                        } else {
                            i38 = 2;
                        }
                        i37 = i15 | i38;
                    } else {
                        i37 = i15;
                    }
                    if ((i15 & 48) == 0) {
                        if (o0VarL.B(this)) {
                            i39 = 32;
                        } else {
                            i39 = 16;
                        }
                        i37 |= i39;
                    }
                    if ((i30 & 306783379) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (o0VarL.n(i30 & 1, z15)) {
                        if (i46 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i47 != 0) {
                            dVar4 = null;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i18 != 0) {
                            aVar6 = a.COLOR;
                        } else {
                            aVar6 = aVar;
                        }
                        if (i24 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i26 != 0) {
                            str7 = null;
                        } else {
                            str7 = str;
                        }
                        if (i28 != 0) {
                            str4 = null;
                        }
                        if (i34 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if (i36 != 0) {
                            aVar7 = null;
                        } else {
                            aVar7 = aVar3;
                        }
                        p3.x1 x1Var5 = p3.n.f135158a;
                        b(rVar4, dVar4, aVar6, pVar3, str7, str2, str4, z17, aVar2, aVar7, o0VarL, i30 & 2147483646, i37 & 126);
                        str5 = str7;
                        z16 = z17;
                        pVar2 = pVar3;
                        aVar5 = aVar7;
                        aVar4 = aVar6;
                        dVar3 = dVar4;
                        rVar3 = rVar4;
                    } else {
                        o0VarL.e();
                        aVar4 = aVar;
                        pVar2 = pVar;
                        str5 = str;
                        z16 = z14;
                        rVar3 = rVar2;
                        dVar3 = dVar2;
                        aVar5 = aVar3;
                    }
                    str6 = str4;
                    p2VarI0 = o0VarL.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new f21.k0(this, rVar3, dVar3, aVar4, pVar2, str5, str2, str6, z16, aVar2, aVar5, i14, i15, i16);
                    }
                }
                i30 = i17 | 113246208;
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarL.r(aVar2)) {
                        i44 = 536870912;
                    } else {
                        i44 = 268435456;
                    }
                    i30 |= i44;
                }
                i36 = i16 & 1024;
                if (i36 != 0) {
                    i37 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarL.r(aVar3)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i37 = i15 | i38;
                } else {
                    i37 = i15;
                }
                if ((i15 & 48) == 0) {
                    if (o0VarL.B(this)) {
                        i39 = 32;
                    } else {
                        i39 = 16;
                    }
                    i37 |= i39;
                }
                if ((i30 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarL.n(i30 & 1, z15)) {
                    if (i46 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i47 != 0) {
                        dVar4 = null;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i18 != 0) {
                        aVar6 = a.COLOR;
                    } else {
                        aVar6 = aVar;
                    }
                    if (i24 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i26 != 0) {
                        str7 = null;
                    } else {
                        str7 = str;
                    }
                    if (i28 != 0) {
                        str4 = null;
                    }
                    if (i34 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i36 != 0) {
                        aVar7 = null;
                    } else {
                        aVar7 = aVar3;
                    }
                    p3.x1 x1Var6 = p3.n.f135158a;
                    b(rVar4, dVar4, aVar6, pVar3, str7, str2, str4, z17, aVar2, aVar7, o0VarL, i30 & 2147483646, i37 & 126);
                    str5 = str7;
                    z16 = z17;
                    pVar2 = pVar3;
                    aVar5 = aVar7;
                    aVar4 = aVar6;
                    dVar3 = dVar4;
                    rVar3 = rVar4;
                } else {
                    o0VarL.e();
                    aVar4 = aVar;
                    pVar2 = pVar;
                    str5 = str;
                    z16 = z14;
                    rVar3 = rVar2;
                    dVar3 = dVar2;
                    aVar5 = aVar3;
                }
                str6 = str4;
                p2VarI0 = o0VarL.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new f21.k0(this, rVar3, dVar3, aVar4, pVar2, str5, str2, str6, z16, aVar2, aVar5, i14, i15, i16);
                }
            }
            i17 |= 24576;
            if ((i14 & 196608) == 0) {
                if (o0VarL.B(str2)) {
                    i45 = 131072;
                } else {
                    i45 = 65536;
                }
                i17 |= i45;
            }
            i28 = i16 & 64;
            if (i28 != 0) {
                i17 |= 1572864;
                str4 = str3;
            } else {
                str4 = str3;
                if ((i14 & 1572864) == 0) {
                    if (o0VarL.B(str4)) {
                        i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i29 = 524288;
                    }
                    i17 |= i29;
                }
            }
            i30 = i17 | 12582912;
            i34 = i16 & 256;
            if (i34 != 0) {
                if ((100663296 & i14) == 0) {
                    if (o0VarL.h(z14)) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i30 |= i35;
                }
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarL.r(aVar2)) {
                        i44 = 536870912;
                    } else {
                        i44 = 268435456;
                    }
                    i30 |= i44;
                }
                i36 = i16 & 1024;
                if (i36 != 0) {
                    i37 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarL.r(aVar3)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i37 = i15 | i38;
                } else {
                    i37 = i15;
                }
                if ((i15 & 48) == 0) {
                    if (o0VarL.B(this)) {
                        i39 = 32;
                    } else {
                        i39 = 16;
                    }
                    i37 |= i39;
                }
                if ((i30 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarL.n(i30 & 1, z15)) {
                    if (i46 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i47 != 0) {
                        dVar4 = null;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i18 != 0) {
                        aVar6 = a.COLOR;
                    } else {
                        aVar6 = aVar;
                    }
                    if (i24 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i26 != 0) {
                        str7 = null;
                    } else {
                        str7 = str;
                    }
                    if (i28 != 0) {
                        str4 = null;
                    }
                    if (i34 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i36 != 0) {
                        aVar7 = null;
                    } else {
                        aVar7 = aVar3;
                    }
                    p3.x1 x1Var7 = p3.n.f135158a;
                    b(rVar4, dVar4, aVar6, pVar3, str7, str2, str4, z17, aVar2, aVar7, o0VarL, i30 & 2147483646, i37 & 126);
                    str5 = str7;
                    z16 = z17;
                    pVar2 = pVar3;
                    aVar5 = aVar7;
                    aVar4 = aVar6;
                    dVar3 = dVar4;
                    rVar3 = rVar4;
                } else {
                    o0VarL.e();
                    aVar4 = aVar;
                    pVar2 = pVar;
                    str5 = str;
                    z16 = z14;
                    rVar3 = rVar2;
                    dVar3 = dVar2;
                    aVar5 = aVar3;
                }
                str6 = str4;
                p2VarI0 = o0VarL.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new f21.k0(this, rVar3, dVar3, aVar4, pVar2, str5, str2, str6, z16, aVar2, aVar5, i14, i15, i16);
                }
            }
            i30 = i17 | 113246208;
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarL.r(aVar2)) {
                    i44 = 536870912;
                } else {
                    i44 = 268435456;
                }
                i30 |= i44;
            }
            i36 = i16 & 1024;
            if (i36 != 0) {
                i37 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarL.r(aVar3)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i37 = i15 | i38;
            } else {
                i37 = i15;
            }
            if ((i15 & 48) == 0) {
                if (o0VarL.B(this)) {
                    i39 = 32;
                } else {
                    i39 = 16;
                }
                i37 |= i39;
            }
            if ((i30 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (o0VarL.n(i30 & 1, z15)) {
                if (i46 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i47 != 0) {
                    dVar4 = null;
                } else {
                    dVar4 = dVar2;
                }
                if (i18 != 0) {
                    aVar6 = a.COLOR;
                } else {
                    aVar6 = aVar;
                }
                if (i24 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                if (i26 != 0) {
                    str7 = null;
                } else {
                    str7 = str;
                }
                if (i28 != 0) {
                    str4 = null;
                }
                if (i34 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i36 != 0) {
                    aVar7 = null;
                } else {
                    aVar7 = aVar3;
                }
                p3.x1 x1Var8 = p3.n.f135158a;
                b(rVar4, dVar4, aVar6, pVar3, str7, str2, str4, z17, aVar2, aVar7, o0VarL, i30 & 2147483646, i37 & 126);
                str5 = str7;
                z16 = z17;
                pVar2 = pVar3;
                aVar5 = aVar7;
                aVar4 = aVar6;
                dVar3 = dVar4;
                rVar3 = rVar4;
            } else {
                o0VarL.e();
                aVar4 = aVar;
                pVar2 = pVar;
                str5 = str;
                z16 = z14;
                rVar3 = rVar2;
                dVar3 = dVar2;
                aVar5 = aVar3;
            }
            str6 = str4;
            p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f21.k0(this, rVar3, dVar3, aVar4, pVar2, str5, str2, str6, z16, aVar2, aVar5, i14, i15, i16);
            }
        }
        i17 |= 48;
        dVar2 = dVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            i17 |= 384;
        } else if ((i14 & 384) == 0) {
            if (aVar == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = aVar.ordinal();
            }
            if (o0VarL.k(iOrdinal)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i17 |= i19;
        }
        i24 = i16 & 8;
        if (i24 != 0) {
            if ((i14 & 3072) == 0) {
                if (o0VarL.r(pVar)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i17 |= i25;
            }
            i26 = i16 & 16;
            if (i26 != 0) {
                if ((i14 & 24576) == 0) {
                    if (o0VarL.B(str)) {
                        i27 = 16384;
                    } else {
                        i27 = 8192;
                    }
                    i17 |= i27;
                }
                if ((i14 & 196608) == 0) {
                    if (o0VarL.B(str2)) {
                        i45 = 131072;
                    } else {
                        i45 = 65536;
                    }
                    i17 |= i45;
                }
                i28 = i16 & 64;
                if (i28 != 0) {
                    i17 |= 1572864;
                    str4 = str3;
                } else {
                    str4 = str3;
                    if ((i14 & 1572864) == 0) {
                        if (o0VarL.B(str4)) {
                            i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i29 = 524288;
                        }
                        i17 |= i29;
                    }
                }
                i30 = i17 | 12582912;
                i34 = i16 & 256;
                if (i34 != 0) {
                    if ((100663296 & i14) == 0) {
                        if (o0VarL.h(z14)) {
                            i35 = 67108864;
                        } else {
                            i35 = 33554432;
                        }
                        i30 |= i35;
                    }
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarL.r(aVar2)) {
                            i44 = 536870912;
                        } else {
                            i44 = 268435456;
                        }
                        i30 |= i44;
                    }
                    i36 = i16 & 1024;
                    if (i36 != 0) {
                        i37 = i15 | 6;
                    } else if ((i15 & 6) == 0) {
                        if (o0VarL.r(aVar3)) {
                            i38 = 4;
                        } else {
                            i38 = 2;
                        }
                        i37 = i15 | i38;
                    } else {
                        i37 = i15;
                    }
                    if ((i15 & 48) == 0) {
                        if (o0VarL.B(this)) {
                            i39 = 32;
                        } else {
                            i39 = 16;
                        }
                        i37 |= i39;
                    }
                    if ((i30 & 306783379) == 306783378) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (o0VarL.n(i30 & 1, z15)) {
                        if (i46 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i47 != 0) {
                            dVar4 = null;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i18 != 0) {
                            aVar6 = a.COLOR;
                        } else {
                            aVar6 = aVar;
                        }
                        if (i24 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i26 != 0) {
                            str7 = null;
                        } else {
                            str7 = str;
                        }
                        if (i28 != 0) {
                            str4 = null;
                        }
                        if (i34 != 0) {
                            z17 = true;
                        } else {
                            z17 = z14;
                        }
                        if (i36 != 0) {
                            aVar7 = null;
                        } else {
                            aVar7 = aVar3;
                        }
                        p3.x1 x1Var9 = p3.n.f135158a;
                        b(rVar4, dVar4, aVar6, pVar3, str7, str2, str4, z17, aVar2, aVar7, o0VarL, i30 & 2147483646, i37 & 126);
                        str5 = str7;
                        z16 = z17;
                        pVar2 = pVar3;
                        aVar5 = aVar7;
                        aVar4 = aVar6;
                        dVar3 = dVar4;
                        rVar3 = rVar4;
                    } else {
                        o0VarL.e();
                        aVar4 = aVar;
                        pVar2 = pVar;
                        str5 = str;
                        z16 = z14;
                        rVar3 = rVar2;
                        dVar3 = dVar2;
                        aVar5 = aVar3;
                    }
                    str6 = str4;
                    p2VarI0 = o0VarL.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new f21.k0(this, rVar3, dVar3, aVar4, pVar2, str5, str2, str6, z16, aVar2, aVar5, i14, i15, i16);
                    }
                }
                i30 = i17 | 113246208;
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarL.r(aVar2)) {
                        i44 = 536870912;
                    } else {
                        i44 = 268435456;
                    }
                    i30 |= i44;
                }
                i36 = i16 & 1024;
                if (i36 != 0) {
                    i37 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarL.r(aVar3)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i37 = i15 | i38;
                } else {
                    i37 = i15;
                }
                if ((i15 & 48) == 0) {
                    if (o0VarL.B(this)) {
                        i39 = 32;
                    } else {
                        i39 = 16;
                    }
                    i37 |= i39;
                }
                if ((i30 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarL.n(i30 & 1, z15)) {
                    if (i46 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i47 != 0) {
                        dVar4 = null;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i18 != 0) {
                        aVar6 = a.COLOR;
                    } else {
                        aVar6 = aVar;
                    }
                    if (i24 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i26 != 0) {
                        str7 = null;
                    } else {
                        str7 = str;
                    }
                    if (i28 != 0) {
                        str4 = null;
                    }
                    if (i34 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i36 != 0) {
                        aVar7 = null;
                    } else {
                        aVar7 = aVar3;
                    }
                    p3.x1 x1Var10 = p3.n.f135158a;
                    b(rVar4, dVar4, aVar6, pVar3, str7, str2, str4, z17, aVar2, aVar7, o0VarL, i30 & 2147483646, i37 & 126);
                    str5 = str7;
                    z16 = z17;
                    pVar2 = pVar3;
                    aVar5 = aVar7;
                    aVar4 = aVar6;
                    dVar3 = dVar4;
                    rVar3 = rVar4;
                } else {
                    o0VarL.e();
                    aVar4 = aVar;
                    pVar2 = pVar;
                    str5 = str;
                    z16 = z14;
                    rVar3 = rVar2;
                    dVar3 = dVar2;
                    aVar5 = aVar3;
                }
                str6 = str4;
                p2VarI0 = o0VarL.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new f21.k0(this, rVar3, dVar3, aVar4, pVar2, str5, str2, str6, z16, aVar2, aVar5, i14, i15, i16);
                }
            }
            i17 |= 24576;
            if ((i14 & 196608) == 0) {
                if (o0VarL.B(str2)) {
                    i45 = 131072;
                } else {
                    i45 = 65536;
                }
                i17 |= i45;
            }
            i28 = i16 & 64;
            if (i28 != 0) {
                i17 |= 1572864;
                str4 = str3;
            } else {
                str4 = str3;
                if ((i14 & 1572864) == 0) {
                    if (o0VarL.B(str4)) {
                        i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i29 = 524288;
                    }
                    i17 |= i29;
                }
            }
            i30 = i17 | 12582912;
            i34 = i16 & 256;
            if (i34 != 0) {
                if ((100663296 & i14) == 0) {
                    if (o0VarL.h(z14)) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i30 |= i35;
                }
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarL.r(aVar2)) {
                        i44 = 536870912;
                    } else {
                        i44 = 268435456;
                    }
                    i30 |= i44;
                }
                i36 = i16 & 1024;
                if (i36 != 0) {
                    i37 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarL.r(aVar3)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i37 = i15 | i38;
                } else {
                    i37 = i15;
                }
                if ((i15 & 48) == 0) {
                    if (o0VarL.B(this)) {
                        i39 = 32;
                    } else {
                        i39 = 16;
                    }
                    i37 |= i39;
                }
                if ((i30 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarL.n(i30 & 1, z15)) {
                    if (i46 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i47 != 0) {
                        dVar4 = null;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i18 != 0) {
                        aVar6 = a.COLOR;
                    } else {
                        aVar6 = aVar;
                    }
                    if (i24 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i26 != 0) {
                        str7 = null;
                    } else {
                        str7 = str;
                    }
                    if (i28 != 0) {
                        str4 = null;
                    }
                    if (i34 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i36 != 0) {
                        aVar7 = null;
                    } else {
                        aVar7 = aVar3;
                    }
                    p3.x1 x1Var11 = p3.n.f135158a;
                    b(rVar4, dVar4, aVar6, pVar3, str7, str2, str4, z17, aVar2, aVar7, o0VarL, i30 & 2147483646, i37 & 126);
                    str5 = str7;
                    z16 = z17;
                    pVar2 = pVar3;
                    aVar5 = aVar7;
                    aVar4 = aVar6;
                    dVar3 = dVar4;
                    rVar3 = rVar4;
                } else {
                    o0VarL.e();
                    aVar4 = aVar;
                    pVar2 = pVar;
                    str5 = str;
                    z16 = z14;
                    rVar3 = rVar2;
                    dVar3 = dVar2;
                    aVar5 = aVar3;
                }
                str6 = str4;
                p2VarI0 = o0VarL.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new f21.k0(this, rVar3, dVar3, aVar4, pVar2, str5, str2, str6, z16, aVar2, aVar5, i14, i15, i16);
                }
            }
            i30 = i17 | 113246208;
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarL.r(aVar2)) {
                    i44 = 536870912;
                } else {
                    i44 = 268435456;
                }
                i30 |= i44;
            }
            i36 = i16 & 1024;
            if (i36 != 0) {
                i37 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarL.r(aVar3)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i37 = i15 | i38;
            } else {
                i37 = i15;
            }
            if ((i15 & 48) == 0) {
                if (o0VarL.B(this)) {
                    i39 = 32;
                } else {
                    i39 = 16;
                }
                i37 |= i39;
            }
            if ((i30 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (o0VarL.n(i30 & 1, z15)) {
                if (i46 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i47 != 0) {
                    dVar4 = null;
                } else {
                    dVar4 = dVar2;
                }
                if (i18 != 0) {
                    aVar6 = a.COLOR;
                } else {
                    aVar6 = aVar;
                }
                if (i24 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                if (i26 != 0) {
                    str7 = null;
                } else {
                    str7 = str;
                }
                if (i28 != 0) {
                    str4 = null;
                }
                if (i34 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i36 != 0) {
                    aVar7 = null;
                } else {
                    aVar7 = aVar3;
                }
                p3.x1 x1Var12 = p3.n.f135158a;
                b(rVar4, dVar4, aVar6, pVar3, str7, str2, str4, z17, aVar2, aVar7, o0VarL, i30 & 2147483646, i37 & 126);
                str5 = str7;
                z16 = z17;
                pVar2 = pVar3;
                aVar5 = aVar7;
                aVar4 = aVar6;
                dVar3 = dVar4;
                rVar3 = rVar4;
            } else {
                o0VarL.e();
                aVar4 = aVar;
                pVar2 = pVar;
                str5 = str;
                z16 = z14;
                rVar3 = rVar2;
                dVar3 = dVar2;
                aVar5 = aVar3;
            }
            str6 = str4;
            p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f21.k0(this, rVar3, dVar3, aVar4, pVar2, str5, str2, str6, z16, aVar2, aVar5, i14, i15, i16);
            }
        }
        i17 |= 3072;
        i26 = i16 & 16;
        if (i26 != 0) {
            if ((i14 & 24576) == 0) {
                if (o0VarL.B(str)) {
                    i27 = 16384;
                } else {
                    i27 = 8192;
                }
                i17 |= i27;
            }
            if ((i14 & 196608) == 0) {
                if (o0VarL.B(str2)) {
                    i45 = 131072;
                } else {
                    i45 = 65536;
                }
                i17 |= i45;
            }
            i28 = i16 & 64;
            if (i28 != 0) {
                i17 |= 1572864;
                str4 = str3;
            } else {
                str4 = str3;
                if ((i14 & 1572864) == 0) {
                    if (o0VarL.B(str4)) {
                        i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i29 = 524288;
                    }
                    i17 |= i29;
                }
            }
            i30 = i17 | 12582912;
            i34 = i16 & 256;
            if (i34 != 0) {
                if ((100663296 & i14) == 0) {
                    if (o0VarL.h(z14)) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i30 |= i35;
                }
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarL.r(aVar2)) {
                        i44 = 536870912;
                    } else {
                        i44 = 268435456;
                    }
                    i30 |= i44;
                }
                i36 = i16 & 1024;
                if (i36 != 0) {
                    i37 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (o0VarL.r(aVar3)) {
                        i38 = 4;
                    } else {
                        i38 = 2;
                    }
                    i37 = i15 | i38;
                } else {
                    i37 = i15;
                }
                if ((i15 & 48) == 0) {
                    if (o0VarL.B(this)) {
                        i39 = 32;
                    } else {
                        i39 = 16;
                    }
                    i37 |= i39;
                }
                if ((i30 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (o0VarL.n(i30 & 1, z15)) {
                    if (i46 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i47 != 0) {
                        dVar4 = null;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i18 != 0) {
                        aVar6 = a.COLOR;
                    } else {
                        aVar6 = aVar;
                    }
                    if (i24 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i26 != 0) {
                        str7 = null;
                    } else {
                        str7 = str;
                    }
                    if (i28 != 0) {
                        str4 = null;
                    }
                    if (i34 != 0) {
                        z17 = true;
                    } else {
                        z17 = z14;
                    }
                    if (i36 != 0) {
                        aVar7 = null;
                    } else {
                        aVar7 = aVar3;
                    }
                    p3.x1 x1Var13 = p3.n.f135158a;
                    b(rVar4, dVar4, aVar6, pVar3, str7, str2, str4, z17, aVar2, aVar7, o0VarL, i30 & 2147483646, i37 & 126);
                    str5 = str7;
                    z16 = z17;
                    pVar2 = pVar3;
                    aVar5 = aVar7;
                    aVar4 = aVar6;
                    dVar3 = dVar4;
                    rVar3 = rVar4;
                } else {
                    o0VarL.e();
                    aVar4 = aVar;
                    pVar2 = pVar;
                    str5 = str;
                    z16 = z14;
                    rVar3 = rVar2;
                    dVar3 = dVar2;
                    aVar5 = aVar3;
                }
                str6 = str4;
                p2VarI0 = o0VarL.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new f21.k0(this, rVar3, dVar3, aVar4, pVar2, str5, str2, str6, z16, aVar2, aVar5, i14, i15, i16);
                }
            }
            i30 = i17 | 113246208;
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarL.r(aVar2)) {
                    i44 = 536870912;
                } else {
                    i44 = 268435456;
                }
                i30 |= i44;
            }
            i36 = i16 & 1024;
            if (i36 != 0) {
                i37 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarL.r(aVar3)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i37 = i15 | i38;
            } else {
                i37 = i15;
            }
            if ((i15 & 48) == 0) {
                if (o0VarL.B(this)) {
                    i39 = 32;
                } else {
                    i39 = 16;
                }
                i37 |= i39;
            }
            if ((i30 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (o0VarL.n(i30 & 1, z15)) {
                if (i46 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i47 != 0) {
                    dVar4 = null;
                } else {
                    dVar4 = dVar2;
                }
                if (i18 != 0) {
                    aVar6 = a.COLOR;
                } else {
                    aVar6 = aVar;
                }
                if (i24 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                if (i26 != 0) {
                    str7 = null;
                } else {
                    str7 = str;
                }
                if (i28 != 0) {
                    str4 = null;
                }
                if (i34 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i36 != 0) {
                    aVar7 = null;
                } else {
                    aVar7 = aVar3;
                }
                p3.x1 x1Var14 = p3.n.f135158a;
                b(rVar4, dVar4, aVar6, pVar3, str7, str2, str4, z17, aVar2, aVar7, o0VarL, i30 & 2147483646, i37 & 126);
                str5 = str7;
                z16 = z17;
                pVar2 = pVar3;
                aVar5 = aVar7;
                aVar4 = aVar6;
                dVar3 = dVar4;
                rVar3 = rVar4;
            } else {
                o0VarL.e();
                aVar4 = aVar;
                pVar2 = pVar;
                str5 = str;
                z16 = z14;
                rVar3 = rVar2;
                dVar3 = dVar2;
                aVar5 = aVar3;
            }
            str6 = str4;
            p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f21.k0(this, rVar3, dVar3, aVar4, pVar2, str5, str2, str6, z16, aVar2, aVar5, i14, i15, i16);
            }
        }
        i17 |= 24576;
        if ((i14 & 196608) == 0) {
            if (o0VarL.B(str2)) {
                i45 = 131072;
            } else {
                i45 = 65536;
            }
            i17 |= i45;
        }
        i28 = i16 & 64;
        if (i28 != 0) {
            i17 |= 1572864;
            str4 = str3;
        } else {
            str4 = str3;
            if ((i14 & 1572864) == 0) {
                if (o0VarL.B(str4)) {
                    i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i29 = 524288;
                }
                i17 |= i29;
            }
        }
        i30 = i17 | 12582912;
        i34 = i16 & 256;
        if (i34 != 0) {
            if ((100663296 & i14) == 0) {
                if (o0VarL.h(z14)) {
                    i35 = 67108864;
                } else {
                    i35 = 33554432;
                }
                i30 |= i35;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarL.r(aVar2)) {
                    i44 = 536870912;
                } else {
                    i44 = 268435456;
                }
                i30 |= i44;
            }
            i36 = i16 & 1024;
            if (i36 != 0) {
                i37 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (o0VarL.r(aVar3)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i37 = i15 | i38;
            } else {
                i37 = i15;
            }
            if ((i15 & 48) == 0) {
                if (o0VarL.B(this)) {
                    i39 = 32;
                } else {
                    i39 = 16;
                }
                i37 |= i39;
            }
            if ((i30 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (o0VarL.n(i30 & 1, z15)) {
                if (i46 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i47 != 0) {
                    dVar4 = null;
                } else {
                    dVar4 = dVar2;
                }
                if (i18 != 0) {
                    aVar6 = a.COLOR;
                } else {
                    aVar6 = aVar;
                }
                if (i24 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                if (i26 != 0) {
                    str7 = null;
                } else {
                    str7 = str;
                }
                if (i28 != 0) {
                    str4 = null;
                }
                if (i34 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                if (i36 != 0) {
                    aVar7 = null;
                } else {
                    aVar7 = aVar3;
                }
                p3.x1 x1Var15 = p3.n.f135158a;
                b(rVar4, dVar4, aVar6, pVar3, str7, str2, str4, z17, aVar2, aVar7, o0VarL, i30 & 2147483646, i37 & 126);
                str5 = str7;
                z16 = z17;
                pVar2 = pVar3;
                aVar5 = aVar7;
                aVar4 = aVar6;
                dVar3 = dVar4;
                rVar3 = rVar4;
            } else {
                o0VarL.e();
                aVar4 = aVar;
                pVar2 = pVar;
                str5 = str;
                z16 = z14;
                rVar3 = rVar2;
                dVar3 = dVar2;
                aVar5 = aVar3;
            }
            str6 = str4;
            p2VarI0 = o0VarL.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f21.k0(this, rVar3, dVar3, aVar4, pVar2, str5, str2, str6, z16, aVar2, aVar5, i14, i15, i16);
            }
        }
        i30 = i17 | 113246208;
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarL.r(aVar2)) {
                i44 = 536870912;
            } else {
                i44 = 268435456;
            }
            i30 |= i44;
        }
        i36 = i16 & 1024;
        if (i36 != 0) {
            i37 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            if (o0VarL.r(aVar3)) {
                i38 = 4;
            } else {
                i38 = 2;
            }
            i37 = i15 | i38;
        } else {
            i37 = i15;
        }
        if ((i15 & 48) == 0) {
            if (o0VarL.B(this)) {
                i39 = 32;
            } else {
                i39 = 16;
            }
            i37 |= i39;
        }
        if ((i30 & 306783379) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (o0VarL.n(i30 & 1, z15)) {
            if (i46 != 0) {
                rVar4 = h4.r.S;
            } else {
                rVar4 = rVar2;
            }
            if (i47 != 0) {
                dVar4 = null;
            } else {
                dVar4 = dVar2;
            }
            if (i18 != 0) {
                aVar6 = a.COLOR;
            } else {
                aVar6 = aVar;
            }
            if (i24 != 0) {
                pVar3 = null;
            } else {
                pVar3 = pVar;
            }
            if (i26 != 0) {
                str7 = null;
            } else {
                str7 = str;
            }
            if (i28 != 0) {
                str4 = null;
            }
            if (i34 != 0) {
                z17 = true;
            } else {
                z17 = z14;
            }
            if (i36 != 0) {
                aVar7 = null;
            } else {
                aVar7 = aVar3;
            }
            p3.x1 x1Var16 = p3.n.f135158a;
            b(rVar4, dVar4, aVar6, pVar3, str7, str2, str4, z17, aVar2, aVar7, o0VarL, i30 & 2147483646, i37 & 126);
            str5 = str7;
            z16 = z17;
            pVar2 = pVar3;
            aVar5 = aVar7;
            aVar4 = aVar6;
            dVar3 = dVar4;
            rVar3 = rVar4;
        } else {
            o0VarL.e();
            aVar4 = aVar;
            pVar2 = pVar;
            str5 = str;
            z16 = z14;
            rVar3 = rVar2;
            dVar3 = dVar2;
            aVar5 = aVar3;
        }
        str6 = str4;
        p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f21.k0(this, rVar3, dVar3, aVar4, pVar2, str5, str2, str6, z16, aVar2, aVar5, i14, i15, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0124  */
    /* JADX WARN: Code duplicated, block: B:104:0x0126  */
    /* JADX WARN: Code duplicated, block: B:107:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0131  */
    /* JADX WARN: Code duplicated, block: B:109:0x0139  */
    /* JADX WARN: Code duplicated, block: B:111:0x013d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0141  */
    /* JADX WARN: Code duplicated, block: B:114:0x0145  */
    /* JADX WARN: Code duplicated, block: B:117:0x014a  */
    /* JADX WARN: Code duplicated, block: B:118:0x014d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0151  */
    /* JADX WARN: Code duplicated, block: B:121:0x0154  */
    /* JADX WARN: Code duplicated, block: B:123:0x0158  */
    /* JADX WARN: Code duplicated, block: B:124:0x015b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0161  */
    /* JADX WARN: Code duplicated, block: B:128:0x016b  */
    /* JADX WARN: Code duplicated, block: B:130:0x018a  */
    /* JADX WARN: Code duplicated, block: B:133:0x019e  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:96:0x010b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0111  */
    /* JADX WARN: Code duplicated, block: B:99:0x0114  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(h4.r rVar, b bVar, u4.d dVar, String str, String str2, String str3, e23.a aVar, e23.a aVar2, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        String str4;
        String str5;
        int i17;
        String str6;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z14;
        p3.o0 o0Var;
        e23.a aVar3;
        h4.r rVar3;
        String str7;
        String str8;
        b bVar2;
        e23.a aVar4;
        p3.p2 p2VarI0;
        int i28;
        h4.r rVar4;
        b bVar3;
        String str9;
        e23.a aVar5;
        e23.a aVar6;
        s5.c cVar;
        int i29;
        dVar.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(161799453);
        int i30 = i15 & 1;
        if (i30 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        int i34 = i15 & 2;
        if (i34 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarE.k(bVar == null ? -1 : bVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(dVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            str4 = str;
            i16 |= o0VarE.B(str4) ? 2048 : 1024;
        } else {
            str4 = str;
        }
        int i35 = i15 & 16;
        if (i35 == 0) {
            if ((i14 & 24576) == 0) {
                str5 = str2;
                i16 |= o0VarE.B(str5) ? 16384 : 8192;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                if ((196608 & i14) == 0) {
                    str6 = str3;
                    if (o0VarE.B(str6)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 64;
                if (i19 != 0) {
                    if ((1572864 & i14) == 0) {
                        if (o0VarE.r(aVar)) {
                            i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i24 = 524288;
                        }
                        i16 |= i24;
                    }
                    if ((i15 & 128) != 0) {
                        i16 |= 12582912;
                    } else if ((i14 & 12582912) == 0) {
                        if (o0VarE.B(null)) {
                            i25 = 8388608;
                        } else {
                            i25 = 4194304;
                        }
                        i16 |= i25;
                    }
                    i26 = i15 & 256;
                    if (i26 != 0) {
                        i16 |= 100663296;
                    } else if ((i14 & 100663296) == 0) {
                        if (o0VarE.r(aVar2)) {
                            i27 = 67108864;
                        } else {
                            i27 = 33554432;
                        }
                        i16 |= i27;
                    }
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.B(this)) {
                            i29 = 536870912;
                        } else {
                            i29 = 268435456;
                        }
                        i16 |= i29;
                    }
                    if ((i16 & 306783379) != 306783378) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i16 & 1, z14)) {
                        if (i30 != 0) {
                            rVar4 = h4.r.S;
                            i28 = i19;
                        } else {
                            i28 = i19;
                            rVar4 = rVar2;
                        }
                        if (i34 != 0) {
                            bVar3 = b.INFO;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i35 != 0) {
                            str5 = null;
                        }
                        if (i17 != 0) {
                            str9 = null;
                        } else {
                            str9 = str6;
                        }
                        if (i28 != 0) {
                            aVar5 = null;
                        } else {
                            aVar5 = aVar;
                        }
                        if (i26 != 0) {
                            aVar6 = null;
                        } else {
                            aVar6 = aVar2;
                        }
                        p3.x1 x1Var = p3.n.f135158a;
                        if (str5 != null) {
                            cVar = new s5.c(str5, null, 2, null);
                        } else {
                            cVar = null;
                        }
                        o0Var = o0VarE;
                        e(rVar4, bVar3, dVar, str4, cVar, str9, aVar5, null, aVar6, o0Var, i16 & 2147426302, 0);
                        str7 = str5;
                        rVar3 = rVar4;
                        bVar2 = bVar3;
                        str8 = str9;
                        aVar4 = aVar5;
                        aVar3 = aVar6;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        aVar3 = aVar2;
                        rVar3 = rVar2;
                        str7 = str5;
                        str8 = str6;
                        bVar2 = bVar;
                        aVar4 = aVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new h02.c(this, rVar3, bVar2, dVar, str, str7, str8, aVar4, aVar3, i14, i15);
                    }
                }
                i16 |= 1572864;
                if ((i15 & 128) != 0) {
                    i16 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    if (o0VarE.B(null)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i16 |= i25;
                }
                i26 = i15 & 256;
                if (i26 != 0) {
                    i16 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    if (o0VarE.r(aVar2)) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i16 |= i27;
                }
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.B(this)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i16 |= i29;
                }
                if ((i16 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i30 != 0) {
                        rVar4 = h4.r.S;
                        i28 = i19;
                    } else {
                        i28 = i19;
                        rVar4 = rVar2;
                    }
                    if (i34 != 0) {
                        bVar3 = b.INFO;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i35 != 0) {
                        str5 = null;
                    }
                    if (i17 != 0) {
                        str9 = null;
                    } else {
                        str9 = str6;
                    }
                    if (i28 != 0) {
                        aVar5 = null;
                    } else {
                        aVar5 = aVar;
                    }
                    if (i26 != 0) {
                        aVar6 = null;
                    } else {
                        aVar6 = aVar2;
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                    if (str5 != null) {
                        cVar = new s5.c(str5, null, 2, null);
                    } else {
                        cVar = null;
                    }
                    o0Var = o0VarE;
                    e(rVar4, bVar3, dVar, str4, cVar, str9, aVar5, null, aVar6, o0Var, i16 & 2147426302, 0);
                    str7 = str5;
                    rVar3 = rVar4;
                    bVar2 = bVar3;
                    str8 = str9;
                    aVar4 = aVar5;
                    aVar3 = aVar6;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    aVar3 = aVar2;
                    rVar3 = rVar2;
                    str7 = str5;
                    str8 = str6;
                    bVar2 = bVar;
                    aVar4 = aVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new h02.c(this, rVar3, bVar2, dVar, str, str7, str8, aVar4, aVar3, i14, i15);
                }
            }
            i16 |= 196608;
            str6 = str3;
            i19 = i15 & 64;
            if (i19 != 0) {
                if ((1572864 & i14) == 0) {
                    if (o0VarE.r(aVar)) {
                        i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
                if ((i15 & 128) != 0) {
                    i16 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    if (o0VarE.B(null)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i16 |= i25;
                }
                i26 = i15 & 256;
                if (i26 != 0) {
                    i16 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    if (o0VarE.r(aVar2)) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i16 |= i27;
                }
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.B(this)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i16 |= i29;
                }
                if ((i16 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i30 != 0) {
                        rVar4 = h4.r.S;
                        i28 = i19;
                    } else {
                        i28 = i19;
                        rVar4 = rVar2;
                    }
                    if (i34 != 0) {
                        bVar3 = b.INFO;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i35 != 0) {
                        str5 = null;
                    }
                    if (i17 != 0) {
                        str9 = null;
                    } else {
                        str9 = str6;
                    }
                    if (i28 != 0) {
                        aVar5 = null;
                    } else {
                        aVar5 = aVar;
                    }
                    if (i26 != 0) {
                        aVar6 = null;
                    } else {
                        aVar6 = aVar2;
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                    if (str5 != null) {
                        cVar = new s5.c(str5, null, 2, null);
                    } else {
                        cVar = null;
                    }
                    o0Var = o0VarE;
                    e(rVar4, bVar3, dVar, str4, cVar, str9, aVar5, null, aVar6, o0Var, i16 & 2147426302, 0);
                    str7 = str5;
                    rVar3 = rVar4;
                    bVar2 = bVar3;
                    str8 = str9;
                    aVar4 = aVar5;
                    aVar3 = aVar6;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    aVar3 = aVar2;
                    rVar3 = rVar2;
                    str7 = str5;
                    str8 = str6;
                    bVar2 = bVar;
                    aVar4 = aVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new h02.c(this, rVar3, bVar2, dVar, str, str7, str8, aVar4, aVar3, i14, i15);
                }
            }
            i16 |= 1572864;
            if ((i15 & 128) != 0) {
                i16 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (o0VarE.B(null)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i16 |= i25;
            }
            i26 = i15 & 256;
            if (i26 != 0) {
                i16 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarE.r(aVar2)) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i16 |= i27;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.B(this)) {
                    i29 = 536870912;
                } else {
                    i29 = 268435456;
                }
                i16 |= i29;
            }
            if ((i16 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i30 != 0) {
                    rVar4 = h4.r.S;
                    i28 = i19;
                } else {
                    i28 = i19;
                    rVar4 = rVar2;
                }
                if (i34 != 0) {
                    bVar3 = b.INFO;
                } else {
                    bVar3 = bVar;
                }
                if (i35 != 0) {
                    str5 = null;
                }
                if (i17 != 0) {
                    str9 = null;
                } else {
                    str9 = str6;
                }
                if (i28 != 0) {
                    aVar5 = null;
                } else {
                    aVar5 = aVar;
                }
                if (i26 != 0) {
                    aVar6 = null;
                } else {
                    aVar6 = aVar2;
                }
                p3.x1 x1Var4 = p3.n.f135158a;
                if (str5 != null) {
                    cVar = new s5.c(str5, null, 2, null);
                } else {
                    cVar = null;
                }
                o0Var = o0VarE;
                e(rVar4, bVar3, dVar, str4, cVar, str9, aVar5, null, aVar6, o0Var, i16 & 2147426302, 0);
                str7 = str5;
                rVar3 = rVar4;
                bVar2 = bVar3;
                str8 = str9;
                aVar4 = aVar5;
                aVar3 = aVar6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                aVar3 = aVar2;
                rVar3 = rVar2;
                str7 = str5;
                str8 = str6;
                bVar2 = bVar;
                aVar4 = aVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new h02.c(this, rVar3, bVar2, dVar, str, str7, str8, aVar4, aVar3, i14, i15);
            }
        }
        i16 |= 24576;
        str5 = str2;
        i17 = i15 & 32;
        if (i17 != 0) {
            if ((196608 & i14) == 0) {
                str6 = str3;
                if (o0VarE.B(str6)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i16 |= i18;
            }
            i19 = i15 & 64;
            if (i19 != 0) {
                if ((1572864 & i14) == 0) {
                    if (o0VarE.r(aVar)) {
                        i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
                if ((i15 & 128) != 0) {
                    i16 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    if (o0VarE.B(null)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i16 |= i25;
                }
                i26 = i15 & 256;
                if (i26 != 0) {
                    i16 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    if (o0VarE.r(aVar2)) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i16 |= i27;
                }
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.B(this)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i16 |= i29;
                }
                if ((i16 & 306783379) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i30 != 0) {
                        rVar4 = h4.r.S;
                        i28 = i19;
                    } else {
                        i28 = i19;
                        rVar4 = rVar2;
                    }
                    if (i34 != 0) {
                        bVar3 = b.INFO;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i35 != 0) {
                        str5 = null;
                    }
                    if (i17 != 0) {
                        str9 = null;
                    } else {
                        str9 = str6;
                    }
                    if (i28 != 0) {
                        aVar5 = null;
                    } else {
                        aVar5 = aVar;
                    }
                    if (i26 != 0) {
                        aVar6 = null;
                    } else {
                        aVar6 = aVar2;
                    }
                    p3.x1 x1Var5 = p3.n.f135158a;
                    if (str5 != null) {
                        cVar = new s5.c(str5, null, 2, null);
                    } else {
                        cVar = null;
                    }
                    o0Var = o0VarE;
                    e(rVar4, bVar3, dVar, str4, cVar, str9, aVar5, null, aVar6, o0Var, i16 & 2147426302, 0);
                    str7 = str5;
                    rVar3 = rVar4;
                    bVar2 = bVar3;
                    str8 = str9;
                    aVar4 = aVar5;
                    aVar3 = aVar6;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    aVar3 = aVar2;
                    rVar3 = rVar2;
                    str7 = str5;
                    str8 = str6;
                    bVar2 = bVar;
                    aVar4 = aVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new h02.c(this, rVar3, bVar2, dVar, str, str7, str8, aVar4, aVar3, i14, i15);
                }
            }
            i16 |= 1572864;
            if ((i15 & 128) != 0) {
                i16 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (o0VarE.B(null)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i16 |= i25;
            }
            i26 = i15 & 256;
            if (i26 != 0) {
                i16 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarE.r(aVar2)) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i16 |= i27;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.B(this)) {
                    i29 = 536870912;
                } else {
                    i29 = 268435456;
                }
                i16 |= i29;
            }
            if ((i16 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i30 != 0) {
                    rVar4 = h4.r.S;
                    i28 = i19;
                } else {
                    i28 = i19;
                    rVar4 = rVar2;
                }
                if (i34 != 0) {
                    bVar3 = b.INFO;
                } else {
                    bVar3 = bVar;
                }
                if (i35 != 0) {
                    str5 = null;
                }
                if (i17 != 0) {
                    str9 = null;
                } else {
                    str9 = str6;
                }
                if (i28 != 0) {
                    aVar5 = null;
                } else {
                    aVar5 = aVar;
                }
                if (i26 != 0) {
                    aVar6 = null;
                } else {
                    aVar6 = aVar2;
                }
                p3.x1 x1Var6 = p3.n.f135158a;
                if (str5 != null) {
                    cVar = new s5.c(str5, null, 2, null);
                } else {
                    cVar = null;
                }
                o0Var = o0VarE;
                e(rVar4, bVar3, dVar, str4, cVar, str9, aVar5, null, aVar6, o0Var, i16 & 2147426302, 0);
                str7 = str5;
                rVar3 = rVar4;
                bVar2 = bVar3;
                str8 = str9;
                aVar4 = aVar5;
                aVar3 = aVar6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                aVar3 = aVar2;
                rVar3 = rVar2;
                str7 = str5;
                str8 = str6;
                bVar2 = bVar;
                aVar4 = aVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new h02.c(this, rVar3, bVar2, dVar, str, str7, str8, aVar4, aVar3, i14, i15);
            }
        }
        i16 |= 196608;
        str6 = str3;
        i19 = i15 & 64;
        if (i19 != 0) {
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(aVar)) {
                    i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i24 = 524288;
                }
                i16 |= i24;
            }
            if ((i15 & 128) != 0) {
                i16 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (o0VarE.B(null)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i16 |= i25;
            }
            i26 = i15 & 256;
            if (i26 != 0) {
                i16 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarE.r(aVar2)) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i16 |= i27;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.B(this)) {
                    i29 = 536870912;
                } else {
                    i29 = 268435456;
                }
                i16 |= i29;
            }
            if ((i16 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i30 != 0) {
                    rVar4 = h4.r.S;
                    i28 = i19;
                } else {
                    i28 = i19;
                    rVar4 = rVar2;
                }
                if (i34 != 0) {
                    bVar3 = b.INFO;
                } else {
                    bVar3 = bVar;
                }
                if (i35 != 0) {
                    str5 = null;
                }
                if (i17 != 0) {
                    str9 = null;
                } else {
                    str9 = str6;
                }
                if (i28 != 0) {
                    aVar5 = null;
                } else {
                    aVar5 = aVar;
                }
                if (i26 != 0) {
                    aVar6 = null;
                } else {
                    aVar6 = aVar2;
                }
                p3.x1 x1Var7 = p3.n.f135158a;
                if (str5 != null) {
                    cVar = new s5.c(str5, null, 2, null);
                } else {
                    cVar = null;
                }
                o0Var = o0VarE;
                e(rVar4, bVar3, dVar, str4, cVar, str9, aVar5, null, aVar6, o0Var, i16 & 2147426302, 0);
                str7 = str5;
                rVar3 = rVar4;
                bVar2 = bVar3;
                str8 = str9;
                aVar4 = aVar5;
                aVar3 = aVar6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                aVar3 = aVar2;
                rVar3 = rVar2;
                str7 = str5;
                str8 = str6;
                bVar2 = bVar;
                aVar4 = aVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new h02.c(this, rVar3, bVar2, dVar, str, str7, str8, aVar4, aVar3, i14, i15);
            }
        }
        i16 |= 1572864;
        if ((i15 & 128) != 0) {
            i16 |= 12582912;
        } else if ((i14 & 12582912) == 0) {
            if (o0VarE.B(null)) {
                i25 = 8388608;
            } else {
                i25 = 4194304;
            }
            i16 |= i25;
        }
        i26 = i15 & 256;
        if (i26 != 0) {
            i16 |= 100663296;
        } else if ((i14 & 100663296) == 0) {
            if (o0VarE.r(aVar2)) {
                i27 = 67108864;
            } else {
                i27 = 33554432;
            }
            i16 |= i27;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.B(this)) {
                i29 = 536870912;
            } else {
                i29 = 268435456;
            }
            i16 |= i29;
        }
        if ((i16 & 306783379) != 306783378) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i30 != 0) {
                rVar4 = h4.r.S;
                i28 = i19;
            } else {
                i28 = i19;
                rVar4 = rVar2;
            }
            if (i34 != 0) {
                bVar3 = b.INFO;
            } else {
                bVar3 = bVar;
            }
            if (i35 != 0) {
                str5 = null;
            }
            if (i17 != 0) {
                str9 = null;
            } else {
                str9 = str6;
            }
            if (i28 != 0) {
                aVar5 = null;
            } else {
                aVar5 = aVar;
            }
            if (i26 != 0) {
                aVar6 = null;
            } else {
                aVar6 = aVar2;
            }
            p3.x1 x1Var8 = p3.n.f135158a;
            if (str5 != null) {
                cVar = new s5.c(str5, null, 2, null);
            } else {
                cVar = null;
            }
            o0Var = o0VarE;
            e(rVar4, bVar3, dVar, str4, cVar, str9, aVar5, null, aVar6, o0Var, i16 & 2147426302, 0);
            str7 = str5;
            rVar3 = rVar4;
            bVar2 = bVar3;
            str8 = str9;
            aVar4 = aVar5;
            aVar3 = aVar6;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            aVar3 = aVar2;
            rVar3 = rVar2;
            str7 = str5;
            str8 = str6;
            bVar2 = bVar;
            aVar4 = aVar;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h02.c(this, rVar3, bVar2, dVar, str, str7, str8, aVar4, aVar3, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0123  */
    /* JADX WARN: Code duplicated, block: B:101:0x0125  */
    /* JADX WARN: Code duplicated, block: B:103:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x012a  */
    /* JADX WARN: Code duplicated, block: B:106:0x012e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0130  */
    /* JADX WARN: Code duplicated, block: B:110:0x0143  */
    /* JADX WARN: Code duplicated, block: B:113:0x014f  */
    /* JADX WARN: Code duplicated, block: B:121:0x017d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0196  */
    /* JADX WARN: Code duplicated, block: B:126:0x0199  */
    /* JADX WARN: Code duplicated, block: B:128:0x019c  */
    /* JADX WARN: Code duplicated, block: B:130:0x019f  */
    /* JADX WARN: Code duplicated, block: B:132:0x01be  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:136:0x0209  */
    /* JADX WARN: Code duplicated, block: B:139:0x0236  */
    /* JADX WARN: Code duplicated, block: B:140:0x0238  */
    /* JADX WARN: Code duplicated, block: B:143:0x0245  */
    /* JADX WARN: Code duplicated, block: B:144:0x0247  */
    /* JADX WARN: Code duplicated, block: B:147:0x0278  */
    /* JADX WARN: Code duplicated, block: B:149:0x027f  */
    /* JADX WARN: Code duplicated, block: B:150:0x0283  */
    /* JADX WARN: Code duplicated, block: B:153:0x0296  */
    /* JADX WARN: Code duplicated, block: B:156:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:160:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:163:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:166:0x030a  */
    /* JADX WARN: Code duplicated, block: B:168:0x0318  */
    /* JADX WARN: Code duplicated, block: B:171:0x032e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0331  */
    /* JADX WARN: Code duplicated, block: B:175:0x0334  */
    /* JADX WARN: Code duplicated, block: B:177:0x0337  */
    /* JADX WARN: Code duplicated, block: B:178:0x0347  */
    /* JADX WARN: Code duplicated, block: B:180:0x0350  */
    /* JADX WARN: Code duplicated, block: B:181:0x036a  */
    /* JADX WARN: Code duplicated, block: B:182:0x037c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0422  */
    /* JADX WARN: Code duplicated, block: B:187:0x0429  */
    /* JADX WARN: Code duplicated, block: B:188:0x042d  */
    /* JADX WARN: Code duplicated, block: B:191:0x043a  */
    /* JADX WARN: Code duplicated, block: B:193:0x0448  */
    /* JADX WARN: Code duplicated, block: B:198:0x0470  */
    /* JADX WARN: Code duplicated, block: B:199:0x0472  */
    /* JADX WARN: Code duplicated, block: B:202:0x047b  */
    /* JADX WARN: Code duplicated, block: B:203:0x047d  */
    /* JADX WARN: Code duplicated, block: B:206:0x0485  */
    /* JADX WARN: Code duplicated, block: B:209:0x048a  */
    /* JADX WARN: Code duplicated, block: B:210:0x048f  */
    /* JADX WARN: Code duplicated, block: B:214:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:217:0x0501  */
    /* JADX WARN: Code duplicated, block: B:219:0x0548  */
    /* JADX WARN: Code duplicated, block: B:220:0x054a  */
    /* JADX WARN: Code duplicated, block: B:223:0x0554  */
    /* JADX WARN: Code duplicated, block: B:224:0x0556  */
    /* JADX WARN: Code duplicated, block: B:227:0x055e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:230:0x0566  */
    /* JADX WARN: Code duplicated, block: B:232:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:234:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:236:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:238:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:240:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:242:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:244:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:246:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:247:0x0611  */
    /* JADX WARN: Code duplicated, block: B:248:0x0627  */
    /* JADX WARN: Code duplicated, block: B:251:0x0687  */
    /* JADX WARN: Code duplicated, block: B:254:0x069e  */
    /* JADX WARN: Code duplicated, block: B:256:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:257:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:260:0x06c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:261:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:264:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:266:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:268:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:270:0x0702  */
    /* JADX WARN: Code duplicated, block: B:272:0x0706  */
    /* JADX WARN: Code duplicated, block: B:275:0x0718  */
    /* JADX WARN: Code duplicated, block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:88:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:96:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x011c  */
    /* JADX WARN: Code duplicated, block: B:98:0x011f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e(h4.r rVar, b bVar, u4.d dVar, String str, s5.c cVar, String str2, e23.a<Unit> aVar, b92.a aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14, int i15) {
        int i16;
        int i17;
        e23.a<Unit> aVar4;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        boolean z14;
        b bVar2;
        String str3;
        b92.a aVar5;
        e23.a<Unit> aVar6;
        e23.a<Unit> aVar7;
        p3.p2 p2VarI0;
        String str4;
        e23.a<Unit> aVar8;
        b92.a aVar9;
        e23.a<Unit> aVar10;
        Object objQ;
        p3.m.a.C2565a c2565a;
        Object objQ2;
        p3.p1 p1Var;
        h4.g.b bVar3;
        h4.r.a aVar11;
        int[] iArr;
        int i27;
        long jC;
        boolean z15;
        boolean z16;
        c2.s2 s2VarA;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar12;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar4;
        e23.a<Unit> aVar13;
        h5.g.a.f fVar;
        c2.u2 u2Var;
        j92.b bVar5;
        j92.e eVar2;
        int i28;
        float f14;
        b92.a aVar14;
        e23.a<Unit> aVar15;
        f5.z0 z0VarD;
        int iHashCode2;
        p3.i2 i2VarA1;
        h4.r rVarC2;
        int i29;
        long jB;
        e23.a<Unit> aVar16;
        c2.z zVarA;
        int iHashCode3;
        p3.i2 i2VarA2;
        h4.r rVarC3;
        j92.f fVar2;
        int i30;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objQ3;
        p3.m.a.C2565a c2565a2;
        b92.a aVar17;
        Object objQ4;
        b92.a aVar18;
        b92.a aVar19;
        j92.e eVar3;
        String str5;
        int i34;
        boolean z24;
        Object objQ5;
        int i35;
        long jA;
        boolean z25;
        boolean z26;
        boolean z27;
        Object objQ6;
        b92.a aVar20;
        int i36;
        dVar.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(2076729117);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.k(bVar == null ? -1 : bVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(dVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(str) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.B(cVar) ? 16384 : 8192;
        }
        int i37 = i15 & 32;
        if (i37 == 0) {
            if ((196608 & i14) == 0) {
                i16 |= o0VarE.B(str2) ? 131072 : 65536;
            }
            i17 = i15 & 64;
            if (i17 != 0) {
                i16 |= 1572864;
                aVar4 = aVar;
            } else {
                aVar4 = aVar;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.r(aVar4)) {
                        i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i18 = 524288;
                    }
                    i16 |= i18;
                }
            }
            i19 = i15 & 128;
            if (i19 != 0) {
                i16 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (o0VarE.B(aVar2)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i16 |= i24;
            }
            i25 = i15 & 256;
            if (i25 != 0) {
                i16 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarE.r(aVar3)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i16 |= i26;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.B(this)) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i16 |= i36;
            }
            if ((i16 & 306783379) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i37 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i17 != 0) {
                    aVar8 = null;
                } else {
                    aVar8 = aVar4;
                }
                if (i19 != 0) {
                    aVar9 = null;
                } else {
                    aVar9 = aVar2;
                }
                if (i25 != 0) {
                    aVar10 = null;
                } else {
                    aVar10 = aVar3;
                }
                p3.x1 x1Var = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = kg.f.b(o0VarE);
                }
                a2.j jVar = (a2.j) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objQ2);
                }
                p1Var = (p3.p1) objQ2;
                g6.f.a aVar21 = g6.f.f75994b;
                k2.h hVarA = k2.i.a(8);
                if (cVar == null || str4 != null || ((Boolean) p1Var.getF182175a()).booleanValue()) {
                    h4.d.f81522a.getClass();
                    bVar3 = h4.d.a.f81533k;
                } else {
                    h4.d.f81522a.getClass();
                    bVar3 = h4.d.a.f81534l;
                }
                h4.g.b bVar6 = bVar3;
                aVar11 = h4.r.S;
                iArr = c.f111242b;
                i27 = iArr[bVar.ordinal()];
                if (i27 != 1) {
                    o0VarE.C(929965334);
                    d92.b.f58623a.getClass();
                    jC = d92.b.a(o0VarE).e().c();
                    o0VarE.g0(false);
                } else if (i27 != 2) {
                    o0VarE.C(929967129);
                    d92.b.f58623a.getClass();
                    jC = d92.b.a(o0VarE).e().b();
                    o0VarE.g0(false);
                } else if (i27 != 3) {
                    o0VarE.C(929969017);
                    d92.b.f58623a.getClass();
                    jC = ((o4.d0) d92.b.a(o0VarE).e().f63501f.getF182175a()).f128833a;
                    o0VarE.g0(false);
                } else {
                    if (i27 == 4) {
                        throw kg.f.h(o0VarE, 929963597, false);
                    }
                    o0VarE.C(929970841);
                    d92.b.f58623a.getClass();
                    jC = d92.b.a(o0VarE).e().h();
                    o0VarE.g0(false);
                }
                h4.r rVarB = l4.k.b(c2.x2.f(u1.n.e(aVar11, jC, hVarA), 1.0f), hVarA);
                if (aVar8 != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                h4.r rVarA = v2.a(rVarB, z15, new r(jVar, aVar8, 0), o0VarE, 0);
                if (aVar10 == null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                h4.r rVarThen = rVar.then(v2.a(rVarA, z16, new q(1), o0VarE, 0));
                c2.j.f22691a.getClass();
                s2VarA = c2.q2.a(c2.j.f22692b, bVar6, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarThen, o0VarE);
                h5.g.V.getClass();
                aVar12 = h5.g.a.f81805b;
                if (cVar2 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar12);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, s2VarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar4 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    aVar13 = aVar8;
                } else {
                    aVar13 = aVar8;
                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    u2Var = c2.u2.f22900a;
                    d92.b.f58623a.getClass();
                    bVar5 = d92.b.f58625c;
                    bVar5.getClass();
                    eVar2 = j92.b.f97899b;
                    float f15 = eVar2.f97920e;
                    i28 = i16;
                    f14 = eVar2.f97920e;
                    bVar5.getClass();
                    aVar14 = aVar9;
                    bVar5.getClass();
                    h4.r rVarB2 = c2.l.B(aVar11, f15, f14, 12, f14);
                    h4.d.f81522a.getClass();
                    aVar15 = aVar10;
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarB2, o0VarE);
                    if (cVar2 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar12);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    c2.u uVar = c2.u.f22885a;
                    f111232a.getClass();
                    i29 = iArr[bVar.ordinal()];
                    if (i29 != 1) {
                        o0VarE.C(232183219);
                        jB = d92.b.a(o0VarE).f().b();
                        o0VarE.g0(false);
                    } else if (i29 != 2) {
                        jB = zl.a.b(o0VarE, 232185111, o0VarE).f63509d;
                        o0VarE.g0(false);
                    } else if (i29 != 3) {
                        o0VarE.C(232187123);
                        jB = d92.b.a(o0VarE).f().b();
                        o0VarE.g0(false);
                    } else {
                        if (i29 == 4) {
                            throw kg.f.h(o0VarE, 232181490, false);
                        }
                        jB = zl.a.b(o0VarE, 232188951, o0VarE).f63508c;
                        o0VarE.g0(false);
                    }
                    h4.r rVarE = u1.n.e(l4.k.b(aVar11, k2.i.f102406a), o4.d0.c(0.14f, d92.b.a(o0VarE).f().f63509d, 14), o4.m1.f128891a);
                    bVar5.getClass();
                    h4.r rVarQ = c2.x2.q(rVarE, j92.b.f97901d.f97906e);
                    bVar5.getClass();
                    aVar16 = aVar13;
                    i7.b(dVar, null, c2.l.y(rVarQ, eVar2.f97918c), jB, o0VarE, ((i28 >> 6) & 14) | 48, 0);
                    o0VarE.g0(true);
                    c2.j.c cVar3 = c2.j.f22696f;
                    h4.r rVarC4 = u2Var.c(u2Var.a(aVar11, 1.0f, true), h4.d.a.f81534l);
                    bVar5.getClass();
                    h4.r rVarA2 = c2.l.A(rVarC4, 0.0f, f14, 1);
                    zVarA = c2.y.a(cVar3, h4.d.a.f81536n, o0VarE, 6);
                    iHashCode3 = Long.hashCode(o0VarE.U);
                    i2VarA2 = o0VarE.a0();
                    rVarC3 = h4.k.c(rVarA2, o0VarE);
                    if (cVar2 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar12);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA2, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
                    }
                    b4.c(fVar, rVarC3, o0VarE);
                    c2.b0 b0Var = c2.b0.f22601a;
                    fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    s5.x0 x0VarE = d92.c.e(j92.f.f97931h);
                    bVar2 = bVar;
                    long jF = f(bVar2, o0VarE);
                    i30 = i28 & 29360128;
                    if (i30 == 8388608) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i28 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | z17;
                    objQ3 = o0VarE.q();
                    if (z19) {
                        c2565a2 = c2565a;
                    } else {
                        c2565a2 = c2565a;
                        if (objQ3 == c2565a2) {
                            aVar17 = aVar14;
                        }
                        h4.r rVarC5 = p5.v.c((e23.l) objQ3, aVar11, false);
                        objQ4 = o0VarE.q();
                        if (objQ4 == c2565a2) {
                            objQ4 = new ky0.k(p1Var, 9);
                            o0VarE.K(objQ4);
                        }
                        p3.m.a.C2565a c2565a3 = c2565a2;
                        aVar18 = aVar17;
                        mh.c(str, rVarC5, jF, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, (e23.l) objQ4, x0VarE, o0VarE, (i28 >> 9) & 14, 1572864, 65528);
                        o0VarE = o0VarE;
                        if (cVar != null) {
                            o0VarE.C(1882977931);
                            fVar2.getClass();
                            s5.x0 x0VarA = s5.x0.a(j92.f.f97932i, 0L, 0L, null, null, 0L, null, null, 0, o53.f0.B(20), null, null, 16646143);
                            long jF2 = f(bVar2, o0VarE);
                            bVar5.getClass();
                            h4.r rVarC6 = c2.l.C(aVar11, 0.0f, eVar2.f97917b, 0.0f, 0.0f, 13);
                            if (i30 == 8388608) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            if ((i28 & 57344) == 16384) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            z27 = z26 | z25;
                            objQ6 = o0VarE.q();
                            if (!z27 || objQ6 == c2565a3) {
                                aVar20 = aVar18;
                                objQ6 = new l3.p1(10, aVar20, cVar);
                                o0VarE.K(objQ6);
                            } else {
                                aVar20 = aVar18;
                            }
                            eVar3 = eVar2;
                            aVar19 = aVar20;
                            mh.d(cVar, p5.v.c((e23.l) objQ6, rVarC6, false), jF2, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarA, o0VarE, (i28 >> 12) & 14, 0, 262136);
                            o0VarE = o0VarE;
                            o0VarE.g0(false);
                        } else {
                            aVar19 = aVar18;
                            eVar3 = eVar2;
                            o0VarE.C(1883457067);
                            o0VarE.g0(false);
                        }
                        if (str4 != null) {
                            o0VarE.C(1883529111);
                            fVar2.getClass();
                            s5.x0 x0VarE2 = d92.c.e(j92.f.f97932i);
                            p3.x1 x1Var2 = p3.n.f135158a;
                            i35 = iArr[bVar2.ordinal()];
                            if (i35 != 1) {
                                i34 = 4;
                                o0VarE.C(1667360099);
                                jA = d92.b.a(o0VarE).k().a();
                                o0VarE.g0(false);
                            } else if (i35 != 2) {
                                i34 = 4;
                                o0VarE.C(1667361960);
                                jA = d92.b.a(o0VarE).k().f63528e;
                                o0VarE.g0(false);
                            } else if (i35 != 3) {
                                i34 = 4;
                                if (i35 == 4) {
                                    throw kg.f.h(o0VarE, 1667358374, false);
                                }
                                o0VarE.C(1667365928);
                                jA = d92.b.a(o0VarE).k().f63527d;
                                o0VarE.g0(false);
                            } else {
                                i34 = 4;
                                o0VarE.C(1667363976);
                                jA = d92.b.a(o0VarE).k().f63527d;
                                o0VarE.g0(false);
                            }
                            long j8 = jA;
                            bVar5.getClass();
                            p3.o0 o0Var = o0VarE;
                            String str6 = str4;
                            mh.c(str6, c2.l.C(aVar11, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13), j8, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE2, o0Var, (i28 >> 15) & 14, 0, 131064);
                            str5 = str6;
                            o0VarE = o0Var;
                            o0VarE.g0(false);
                        } else {
                            str5 = str4;
                            i34 = 4;
                            o0VarE.C(1883812203);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(true);
                        if (aVar15 != null) {
                            o0VarE.C(598896379);
                            h4.r rVarC7 = c2.l.C(aVar11, 0.0f, 0.0f, i34, 0.0f, 11);
                            if ((i28 & 234881024) == 67108864) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            objQ5 = o0VarE.q();
                            if (z24 || objQ5 == c2565a3) {
                                objQ5 = new ku1.a(aVar15, 29);
                                o0VarE.K(objQ5);
                            }
                            u0.a(rVarC7, null, null, null, (e23.a) objQ5, o0VarE, 6, 14);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(598994401);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(true);
                        p3.x1 x1Var3 = p3.n.f135158a;
                        aVar5 = aVar19;
                        str3 = str5;
                        aVar6 = aVar15;
                        aVar7 = aVar16;
                    }
                    aVar17 = aVar14;
                    objQ3 = new i70.a(aVar17, str, 6);
                    o0VarE.K(objQ3);
                    h4.r rVarC8 = p5.v.c((e23.l) objQ3, aVar11, false);
                    objQ4 = o0VarE.q();
                    if (objQ4 == c2565a2) {
                        objQ4 = new ky0.k(p1Var, 9);
                        o0VarE.K(objQ4);
                    }
                    p3.m.a.C2565a c2565a4 = c2565a2;
                    aVar18 = aVar17;
                    mh.c(str, rVarC8, jF, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, (e23.l) objQ4, x0VarE, o0VarE, (i28 >> 9) & 14, 1572864, 65528);
                    o0VarE = o0VarE;
                    if (cVar != null) {
                        o0VarE.C(1882977931);
                        fVar2.getClass();
                        s5.x0 x0VarA2 = s5.x0.a(j92.f.f97932i, 0L, 0L, null, null, 0L, null, null, 0, o53.f0.B(20), null, null, 16646143);
                        long jF3 = f(bVar2, o0VarE);
                        bVar5.getClass();
                        h4.r rVarC9 = c2.l.C(aVar11, 0.0f, eVar2.f97917b, 0.0f, 0.0f, 13);
                        if (i30 == 8388608) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if ((i28 & 57344) == 16384) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z26 | z25;
                        objQ6 = o0VarE.q();
                        if (z27) {
                            aVar20 = aVar18;
                            objQ6 = new l3.p1(10, aVar20, cVar);
                            o0VarE.K(objQ6);
                        } else {
                            aVar20 = aVar18;
                            objQ6 = new l3.p1(10, aVar20, cVar);
                            o0VarE.K(objQ6);
                        }
                        eVar3 = eVar2;
                        aVar19 = aVar20;
                        mh.d(cVar, p5.v.c((e23.l) objQ6, rVarC9, false), jF3, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarA2, o0VarE, (i28 >> 12) & 14, 0, 262136);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    } else {
                        aVar19 = aVar18;
                        eVar3 = eVar2;
                        o0VarE.C(1883457067);
                        o0VarE.g0(false);
                    }
                    if (str4 != null) {
                        o0VarE.C(1883529111);
                        fVar2.getClass();
                        s5.x0 x0VarE3 = d92.c.e(j92.f.f97932i);
                        p3.x1 x1Var4 = p3.n.f135158a;
                        i35 = iArr[bVar2.ordinal()];
                        if (i35 != 1) {
                            i34 = 4;
                            o0VarE.C(1667360099);
                            jA = d92.b.a(o0VarE).k().a();
                            o0VarE.g0(false);
                        } else if (i35 != 2) {
                            i34 = 4;
                            o0VarE.C(1667361960);
                            jA = d92.b.a(o0VarE).k().f63528e;
                            o0VarE.g0(false);
                        } else if (i35 != 3) {
                            i34 = 4;
                            if (i35 == 4) {
                                throw kg.f.h(o0VarE, 1667358374, false);
                            }
                            o0VarE.C(1667365928);
                            jA = d92.b.a(o0VarE).k().f63527d;
                            o0VarE.g0(false);
                        } else {
                            i34 = 4;
                            o0VarE.C(1667363976);
                            jA = d92.b.a(o0VarE).k().f63527d;
                            o0VarE.g0(false);
                        }
                        long j14 = jA;
                        bVar5.getClass();
                        p3.o0 o0Var2 = o0VarE;
                        String str7 = str4;
                        mh.c(str7, c2.l.C(aVar11, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13), j14, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE3, o0Var2, (i28 >> 15) & 14, 0, 131064);
                        str5 = str7;
                        o0VarE = o0Var2;
                        o0VarE.g0(false);
                    } else {
                        str5 = str4;
                        i34 = 4;
                        o0VarE.C(1883812203);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    if (aVar15 != null) {
                        o0VarE.C(598896379);
                        h4.r rVarC10 = c2.l.C(aVar11, 0.0f, 0.0f, i34, 0.0f, 11);
                        if ((i28 & 234881024) == 67108864) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objQ5 = o0VarE.q();
                        if (z24) {
                            objQ5 = new ku1.a(aVar15, 29);
                            o0VarE.K(objQ5);
                        } else {
                            objQ5 = new ku1.a(aVar15, 29);
                            o0VarE.K(objQ5);
                        }
                        u0.a(rVarC10, null, null, null, (e23.a) objQ5, o0VarE, 6, 14);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(598994401);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    p3.x1 x1Var5 = p3.n.f135158a;
                    aVar5 = aVar19;
                    str3 = str5;
                    aVar6 = aVar15;
                    aVar7 = aVar16;
                }
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                u2Var = c2.u2.f22900a;
                d92.b.f58623a.getClass();
                bVar5 = d92.b.f58625c;
                bVar5.getClass();
                eVar2 = j92.b.f97899b;
                float f16 = eVar2.f97920e;
                i28 = i16;
                f14 = eVar2.f97920e;
                bVar5.getClass();
                aVar14 = aVar9;
                bVar5.getClass();
                h4.r rVarB3 = c2.l.B(aVar11, f16, f14, 12, f14);
                h4.d.f81522a.getClass();
                aVar15 = aVar10;
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarB3, o0VarE);
                if (cVar2 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar12);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                }
                b4.c(fVar, rVarC2, o0VarE);
                c2.u uVar2 = c2.u.f22885a;
                f111232a.getClass();
                i29 = iArr[bVar.ordinal()];
                if (i29 != 1) {
                    o0VarE.C(232183219);
                    jB = d92.b.a(o0VarE).f().b();
                    o0VarE.g0(false);
                } else if (i29 != 2) {
                    jB = zl.a.b(o0VarE, 232185111, o0VarE).f63509d;
                    o0VarE.g0(false);
                } else if (i29 != 3) {
                    o0VarE.C(232187123);
                    jB = d92.b.a(o0VarE).f().b();
                    o0VarE.g0(false);
                } else {
                    if (i29 == 4) {
                        throw kg.f.h(o0VarE, 232181490, false);
                    }
                    jB = zl.a.b(o0VarE, 232188951, o0VarE).f63508c;
                    o0VarE.g0(false);
                }
                h4.r rVarE2 = u1.n.e(l4.k.b(aVar11, k2.i.f102406a), o4.d0.c(0.14f, d92.b.a(o0VarE).f().f63509d, 14), o4.m1.f128891a);
                bVar5.getClass();
                h4.r rVarQ2 = c2.x2.q(rVarE2, j92.b.f97901d.f97906e);
                bVar5.getClass();
                aVar16 = aVar13;
                i7.b(dVar, null, c2.l.y(rVarQ2, eVar2.f97918c), jB, o0VarE, ((i28 >> 6) & 14) | 48, 0);
                o0VarE.g0(true);
                c2.j.c cVar4 = c2.j.f22696f;
                h4.r rVarC11 = u2Var.c(u2Var.a(aVar11, 1.0f, true), h4.d.a.f81534l);
                bVar5.getClass();
                h4.r rVarA3 = c2.l.A(rVarC11, 0.0f, f14, 1);
                zVarA = c2.y.a(cVar4, h4.d.a.f81536n, o0VarE, 6);
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = h4.k.c(rVarA3, o0VarE);
                if (cVar2 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar12);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
                } else {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
                }
                b4.c(fVar, rVarC3, o0VarE);
                c2.b0 b0Var2 = c2.b0.f22601a;
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                s5.x0 x0VarE4 = d92.c.e(j92.f.f97931h);
                bVar2 = bVar;
                long jF4 = f(bVar2, o0VarE);
                i30 = i28 & 29360128;
                if (i30 == 8388608) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if ((i28 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objQ3 = o0VarE.q();
                if (z19) {
                    c2565a2 = c2565a;
                    if (objQ3 == c2565a2) {
                        aVar17 = aVar14;
                    }
                    h4.r rVarC12 = p5.v.c((e23.l) objQ3, aVar11, false);
                    objQ4 = o0VarE.q();
                    if (objQ4 == c2565a2) {
                        objQ4 = new ky0.k(p1Var, 9);
                        o0VarE.K(objQ4);
                    }
                    p3.m.a.C2565a c2565a5 = c2565a2;
                    aVar18 = aVar17;
                    mh.c(str, rVarC12, jF4, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, (e23.l) objQ4, x0VarE4, o0VarE, (i28 >> 9) & 14, 1572864, 65528);
                    o0VarE = o0VarE;
                    if (cVar != null) {
                        o0VarE.C(1882977931);
                        fVar2.getClass();
                        s5.x0 x0VarA3 = s5.x0.a(j92.f.f97932i, 0L, 0L, null, null, 0L, null, null, 0, o53.f0.B(20), null, null, 16646143);
                        long jF5 = f(bVar2, o0VarE);
                        bVar5.getClass();
                        h4.r rVarC13 = c2.l.C(aVar11, 0.0f, eVar2.f97917b, 0.0f, 0.0f, 13);
                        if (i30 == 8388608) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if ((i28 & 57344) == 16384) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z26 | z25;
                        objQ6 = o0VarE.q();
                        if (z27) {
                            aVar20 = aVar18;
                            objQ6 = new l3.p1(10, aVar20, cVar);
                            o0VarE.K(objQ6);
                        } else {
                            aVar20 = aVar18;
                            objQ6 = new l3.p1(10, aVar20, cVar);
                            o0VarE.K(objQ6);
                        }
                        eVar3 = eVar2;
                        aVar19 = aVar20;
                        mh.d(cVar, p5.v.c((e23.l) objQ6, rVarC13, false), jF5, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarA3, o0VarE, (i28 >> 12) & 14, 0, 262136);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    } else {
                        aVar19 = aVar18;
                        eVar3 = eVar2;
                        o0VarE.C(1883457067);
                        o0VarE.g0(false);
                    }
                    if (str4 != null) {
                        o0VarE.C(1883529111);
                        fVar2.getClass();
                        s5.x0 x0VarE5 = d92.c.e(j92.f.f97932i);
                        p3.x1 x1Var6 = p3.n.f135158a;
                        i35 = iArr[bVar2.ordinal()];
                        if (i35 != 1) {
                            i34 = 4;
                            o0VarE.C(1667360099);
                            jA = d92.b.a(o0VarE).k().a();
                            o0VarE.g0(false);
                        } else if (i35 != 2) {
                            i34 = 4;
                            o0VarE.C(1667361960);
                            jA = d92.b.a(o0VarE).k().f63528e;
                            o0VarE.g0(false);
                        } else if (i35 != 3) {
                            i34 = 4;
                            if (i35 == 4) {
                                throw kg.f.h(o0VarE, 1667358374, false);
                            }
                            o0VarE.C(1667365928);
                            jA = d92.b.a(o0VarE).k().f63527d;
                            o0VarE.g0(false);
                        } else {
                            i34 = 4;
                            o0VarE.C(1667363976);
                            jA = d92.b.a(o0VarE).k().f63527d;
                            o0VarE.g0(false);
                        }
                        long j15 = jA;
                        bVar5.getClass();
                        p3.o0 o0Var3 = o0VarE;
                        String str8 = str4;
                        mh.c(str8, c2.l.C(aVar11, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13), j15, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE5, o0Var3, (i28 >> 15) & 14, 0, 131064);
                        str5 = str8;
                        o0VarE = o0Var3;
                        o0VarE.g0(false);
                    } else {
                        str5 = str4;
                        i34 = 4;
                        o0VarE.C(1883812203);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    if (aVar15 != null) {
                        o0VarE.C(598896379);
                        h4.r rVarC14 = c2.l.C(aVar11, 0.0f, 0.0f, i34, 0.0f, 11);
                        if ((i28 & 234881024) == 67108864) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objQ5 = o0VarE.q();
                        if (z24) {
                            objQ5 = new ku1.a(aVar15, 29);
                            o0VarE.K(objQ5);
                        } else {
                            objQ5 = new ku1.a(aVar15, 29);
                            o0VarE.K(objQ5);
                        }
                        u0.a(rVarC14, null, null, null, (e23.a) objQ5, o0VarE, 6, 14);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(598994401);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    p3.x1 x1Var7 = p3.n.f135158a;
                    aVar5 = aVar19;
                    str3 = str5;
                    aVar6 = aVar15;
                    aVar7 = aVar16;
                } else {
                    c2565a2 = c2565a;
                }
                aVar17 = aVar14;
                objQ3 = new i70.a(aVar17, str, 6);
                o0VarE.K(objQ3);
                h4.r rVarC15 = p5.v.c((e23.l) objQ3, aVar11, false);
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a2) {
                    objQ4 = new ky0.k(p1Var, 9);
                    o0VarE.K(objQ4);
                }
                p3.m.a.C2565a c2565a6 = c2565a2;
                aVar18 = aVar17;
                mh.c(str, rVarC15, jF4, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, (e23.l) objQ4, x0VarE4, o0VarE, (i28 >> 9) & 14, 1572864, 65528);
                o0VarE = o0VarE;
                if (cVar != null) {
                    o0VarE.C(1882977931);
                    fVar2.getClass();
                    s5.x0 x0VarA4 = s5.x0.a(j92.f.f97932i, 0L, 0L, null, null, 0L, null, null, 0, o53.f0.B(20), null, null, 16646143);
                    long jF6 = f(bVar2, o0VarE);
                    bVar5.getClass();
                    h4.r rVarC16 = c2.l.C(aVar11, 0.0f, eVar2.f97917b, 0.0f, 0.0f, 13);
                    if (i30 == 8388608) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if ((i28 & 57344) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z26 | z25;
                    objQ6 = o0VarE.q();
                    if (z27) {
                        aVar20 = aVar18;
                        objQ6 = new l3.p1(10, aVar20, cVar);
                        o0VarE.K(objQ6);
                    } else {
                        aVar20 = aVar18;
                        objQ6 = new l3.p1(10, aVar20, cVar);
                        o0VarE.K(objQ6);
                    }
                    eVar3 = eVar2;
                    aVar19 = aVar20;
                    mh.d(cVar, p5.v.c((e23.l) objQ6, rVarC16, false), jF6, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarA4, o0VarE, (i28 >> 12) & 14, 0, 262136);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    aVar19 = aVar18;
                    eVar3 = eVar2;
                    o0VarE.C(1883457067);
                    o0VarE.g0(false);
                }
                if (str4 != null) {
                    o0VarE.C(1883529111);
                    fVar2.getClass();
                    s5.x0 x0VarE6 = d92.c.e(j92.f.f97932i);
                    p3.x1 x1Var8 = p3.n.f135158a;
                    i35 = iArr[bVar2.ordinal()];
                    if (i35 != 1) {
                        i34 = 4;
                        o0VarE.C(1667360099);
                        jA = d92.b.a(o0VarE).k().a();
                        o0VarE.g0(false);
                    } else if (i35 != 2) {
                        i34 = 4;
                        o0VarE.C(1667361960);
                        jA = d92.b.a(o0VarE).k().f63528e;
                        o0VarE.g0(false);
                    } else if (i35 != 3) {
                        i34 = 4;
                        if (i35 == 4) {
                            throw kg.f.h(o0VarE, 1667358374, false);
                        }
                        o0VarE.C(1667365928);
                        jA = d92.b.a(o0VarE).k().f63527d;
                        o0VarE.g0(false);
                    } else {
                        i34 = 4;
                        o0VarE.C(1667363976);
                        jA = d92.b.a(o0VarE).k().f63527d;
                        o0VarE.g0(false);
                    }
                    long j16 = jA;
                    bVar5.getClass();
                    p3.o0 o0Var4 = o0VarE;
                    String str9 = str4;
                    mh.c(str9, c2.l.C(aVar11, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13), j16, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE6, o0Var4, (i28 >> 15) & 14, 0, 131064);
                    str5 = str9;
                    o0VarE = o0Var4;
                    o0VarE.g0(false);
                } else {
                    str5 = str4;
                    i34 = 4;
                    o0VarE.C(1883812203);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                if (aVar15 != null) {
                    o0VarE.C(598896379);
                    h4.r rVarC17 = c2.l.C(aVar11, 0.0f, 0.0f, i34, 0.0f, 11);
                    if ((i28 & 234881024) == 67108864) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objQ5 = o0VarE.q();
                    if (z24) {
                        objQ5 = new ku1.a(aVar15, 29);
                        o0VarE.K(objQ5);
                    } else {
                        objQ5 = new ku1.a(aVar15, 29);
                        o0VarE.K(objQ5);
                    }
                    u0.a(rVarC17, null, null, null, (e23.a) objQ5, o0VarE, 6, 14);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(598994401);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                p3.x1 x1Var9 = p3.n.f135158a;
                aVar5 = aVar19;
                str3 = str5;
                aVar6 = aVar15;
                aVar7 = aVar16;
            } else {
                bVar2 = bVar;
                o0VarE.e();
                str3 = str2;
                aVar5 = aVar2;
                aVar6 = aVar3;
                aVar7 = aVar4;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new k11.j(this, rVar, bVar2, dVar, str, cVar, str3, aVar7, aVar5, aVar6, i14, i15);
            }
        }
        i16 |= 196608;
        i17 = i15 & 64;
        if (i17 != 0) {
            i16 |= 1572864;
            aVar4 = aVar;
        } else {
            aVar4 = aVar;
            if ((i14 & 1572864) == 0) {
                if (o0VarE.r(aVar4)) {
                    i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i18 = 524288;
                }
                i16 |= i18;
            }
        }
        i19 = i15 & 128;
        if (i19 != 0) {
            i16 |= 12582912;
        } else if ((i14 & 12582912) == 0) {
            if (o0VarE.B(aVar2)) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i16 |= i24;
        }
        i25 = i15 & 256;
        if (i25 != 0) {
            i16 |= 100663296;
        } else if ((i14 & 100663296) == 0) {
            if (o0VarE.r(aVar3)) {
                i26 = 67108864;
            } else {
                i26 = 33554432;
            }
            i16 |= i26;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.B(this)) {
                i36 = 536870912;
            } else {
                i36 = 268435456;
            }
            i16 |= i36;
        }
        if ((i16 & 306783379) != 306783378) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i37 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if (i17 != 0) {
                aVar8 = null;
            } else {
                aVar8 = aVar4;
            }
            if (i19 != 0) {
                aVar9 = null;
            } else {
                aVar9 = aVar2;
            }
            if (i25 != 0) {
                aVar10 = null;
            } else {
                aVar10 = aVar3;
            }
            p3.x1 x1Var10 = p3.n.f135158a;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = kg.f.b(o0VarE);
            }
            a2.j jVar2 = (a2.j) objQ;
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1Var = (p3.p1) objQ2;
            g6.f.a aVar22 = g6.f.f75994b;
            k2.h hVarA2 = k2.i.a(8);
            if (cVar == null) {
                h4.d.f81522a.getClass();
                bVar3 = h4.d.a.f81533k;
            } else {
                h4.d.f81522a.getClass();
                bVar3 = h4.d.a.f81533k;
            }
            h4.g.b bVar7 = bVar3;
            aVar11 = h4.r.S;
            iArr = c.f111242b;
            i27 = iArr[bVar.ordinal()];
            if (i27 != 1) {
                o0VarE.C(929965334);
                d92.b.f58623a.getClass();
                jC = d92.b.a(o0VarE).e().c();
                o0VarE.g0(false);
            } else if (i27 != 2) {
                o0VarE.C(929967129);
                d92.b.f58623a.getClass();
                jC = d92.b.a(o0VarE).e().b();
                o0VarE.g0(false);
            } else if (i27 != 3) {
                o0VarE.C(929969017);
                d92.b.f58623a.getClass();
                jC = ((o4.d0) d92.b.a(o0VarE).e().f63501f.getF182175a()).f128833a;
                o0VarE.g0(false);
            } else {
                if (i27 == 4) {
                    throw kg.f.h(o0VarE, 929963597, false);
                }
                o0VarE.C(929970841);
                d92.b.f58623a.getClass();
                jC = d92.b.a(o0VarE).e().h();
                o0VarE.g0(false);
            }
            h4.r rVarB4 = l4.k.b(c2.x2.f(u1.n.e(aVar11, jC, hVarA2), 1.0f), hVarA2);
            if (aVar8 != null) {
                z15 = true;
            } else {
                z15 = false;
            }
            h4.r rVarA4 = v2.a(rVarB4, z15, new r(jVar2, aVar8, 0), o0VarE, 0);
            if (aVar10 == null) {
                z16 = true;
            } else {
                z16 = false;
            }
            h4.r rVarThen2 = rVar.then(v2.a(rVarA4, z16, new q(1), o0VarE, 0));
            c2.j.f22691a.getClass();
            s2VarA = c2.q2.a(c2.j.f22692b, bVar7, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarThen2, o0VarE);
            h5.g.V.getClass();
            aVar12 = h5.g.a.f81805b;
            if (cVar2 != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar12);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar4 = h5.g.a.f81813j;
            if (o0VarE.T) {
                aVar13 = aVar8;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                u2Var = c2.u2.f22900a;
                d92.b.f58623a.getClass();
                bVar5 = d92.b.f58625c;
                bVar5.getClass();
                eVar2 = j92.b.f97899b;
                float f17 = eVar2.f97920e;
                i28 = i16;
                f14 = eVar2.f97920e;
                bVar5.getClass();
                aVar14 = aVar9;
                bVar5.getClass();
                h4.r rVarB5 = c2.l.B(aVar11, f17, f14, 12, f14);
                h4.d.f81522a.getClass();
                aVar15 = aVar10;
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarB5, o0VarE);
                if (cVar2 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar12);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
                }
                b4.c(fVar, rVarC2, o0VarE);
                c2.u uVar3 = c2.u.f22885a;
                f111232a.getClass();
                i29 = iArr[bVar.ordinal()];
                if (i29 != 1) {
                    o0VarE.C(232183219);
                    jB = d92.b.a(o0VarE).f().b();
                    o0VarE.g0(false);
                } else if (i29 != 2) {
                    jB = zl.a.b(o0VarE, 232185111, o0VarE).f63509d;
                    o0VarE.g0(false);
                } else if (i29 != 3) {
                    o0VarE.C(232187123);
                    jB = d92.b.a(o0VarE).f().b();
                    o0VarE.g0(false);
                } else {
                    if (i29 == 4) {
                        throw kg.f.h(o0VarE, 232181490, false);
                    }
                    jB = zl.a.b(o0VarE, 232188951, o0VarE).f63508c;
                    o0VarE.g0(false);
                }
                h4.r rVarE3 = u1.n.e(l4.k.b(aVar11, k2.i.f102406a), o4.d0.c(0.14f, d92.b.a(o0VarE).f().f63509d, 14), o4.m1.f128891a);
                bVar5.getClass();
                h4.r rVarQ3 = c2.x2.q(rVarE3, j92.b.f97901d.f97906e);
                bVar5.getClass();
                aVar16 = aVar13;
                i7.b(dVar, null, c2.l.y(rVarQ3, eVar2.f97918c), jB, o0VarE, ((i28 >> 6) & 14) | 48, 0);
                o0VarE.g0(true);
                c2.j.c cVar5 = c2.j.f22696f;
                h4.r rVarC18 = u2Var.c(u2Var.a(aVar11, 1.0f, true), h4.d.a.f81534l);
                bVar5.getClass();
                h4.r rVarA5 = c2.l.A(rVarC18, 0.0f, f14, 1);
                zVarA = c2.y.a(cVar5, h4.d.a.f81536n, o0VarE, 6);
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = h4.k.c(rVarA5, o0VarE);
                if (cVar2 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar12);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
                } else {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
                }
                b4.c(fVar, rVarC3, o0VarE);
                c2.b0 b0Var3 = c2.b0.f22601a;
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                s5.x0 x0VarE7 = d92.c.e(j92.f.f97931h);
                bVar2 = bVar;
                long jF7 = f(bVar2, o0VarE);
                i30 = i28 & 29360128;
                if (i30 == 8388608) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if ((i28 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | z17;
                objQ3 = o0VarE.q();
                if (z19) {
                    c2565a2 = c2565a;
                    if (objQ3 == c2565a2) {
                        aVar17 = aVar14;
                    }
                    h4.r rVarC19 = p5.v.c((e23.l) objQ3, aVar11, false);
                    objQ4 = o0VarE.q();
                    if (objQ4 == c2565a2) {
                        objQ4 = new ky0.k(p1Var, 9);
                        o0VarE.K(objQ4);
                    }
                    p3.m.a.C2565a c2565a7 = c2565a2;
                    aVar18 = aVar17;
                    mh.c(str, rVarC19, jF7, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, (e23.l) objQ4, x0VarE7, o0VarE, (i28 >> 9) & 14, 1572864, 65528);
                    o0VarE = o0VarE;
                    if (cVar != null) {
                        o0VarE.C(1882977931);
                        fVar2.getClass();
                        s5.x0 x0VarA5 = s5.x0.a(j92.f.f97932i, 0L, 0L, null, null, 0L, null, null, 0, o53.f0.B(20), null, null, 16646143);
                        long jF8 = f(bVar2, o0VarE);
                        bVar5.getClass();
                        h4.r rVarC110 = c2.l.C(aVar11, 0.0f, eVar2.f97917b, 0.0f, 0.0f, 13);
                        if (i30 == 8388608) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        if ((i28 & 57344) == 16384) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        z27 = z26 | z25;
                        objQ6 = o0VarE.q();
                        if (z27) {
                            aVar20 = aVar18;
                            objQ6 = new l3.p1(10, aVar20, cVar);
                            o0VarE.K(objQ6);
                        } else {
                            aVar20 = aVar18;
                            objQ6 = new l3.p1(10, aVar20, cVar);
                            o0VarE.K(objQ6);
                        }
                        eVar3 = eVar2;
                        aVar19 = aVar20;
                        mh.d(cVar, p5.v.c((e23.l) objQ6, rVarC110, false), jF8, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarA5, o0VarE, (i28 >> 12) & 14, 0, 262136);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    } else {
                        aVar19 = aVar18;
                        eVar3 = eVar2;
                        o0VarE.C(1883457067);
                        o0VarE.g0(false);
                    }
                    if (str4 != null) {
                        o0VarE.C(1883529111);
                        fVar2.getClass();
                        s5.x0 x0VarE8 = d92.c.e(j92.f.f97932i);
                        p3.x1 x1Var11 = p3.n.f135158a;
                        i35 = iArr[bVar2.ordinal()];
                        if (i35 != 1) {
                            i34 = 4;
                            o0VarE.C(1667360099);
                            jA = d92.b.a(o0VarE).k().a();
                            o0VarE.g0(false);
                        } else if (i35 != 2) {
                            i34 = 4;
                            o0VarE.C(1667361960);
                            jA = d92.b.a(o0VarE).k().f63528e;
                            o0VarE.g0(false);
                        } else if (i35 != 3) {
                            i34 = 4;
                            if (i35 == 4) {
                                throw kg.f.h(o0VarE, 1667358374, false);
                            }
                            o0VarE.C(1667365928);
                            jA = d92.b.a(o0VarE).k().f63527d;
                            o0VarE.g0(false);
                        } else {
                            i34 = 4;
                            o0VarE.C(1667363976);
                            jA = d92.b.a(o0VarE).k().f63527d;
                            o0VarE.g0(false);
                        }
                        long j17 = jA;
                        bVar5.getClass();
                        p3.o0 o0Var5 = o0VarE;
                        String str10 = str4;
                        mh.c(str10, c2.l.C(aVar11, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13), j17, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE8, o0Var5, (i28 >> 15) & 14, 0, 131064);
                        str5 = str10;
                        o0VarE = o0Var5;
                        o0VarE.g0(false);
                    } else {
                        str5 = str4;
                        i34 = 4;
                        o0VarE.C(1883812203);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    if (aVar15 != null) {
                        o0VarE.C(598896379);
                        h4.r rVarC111 = c2.l.C(aVar11, 0.0f, 0.0f, i34, 0.0f, 11);
                        if ((i28 & 234881024) == 67108864) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objQ5 = o0VarE.q();
                        if (z24) {
                            objQ5 = new ku1.a(aVar15, 29);
                            o0VarE.K(objQ5);
                        } else {
                            objQ5 = new ku1.a(aVar15, 29);
                            o0VarE.K(objQ5);
                        }
                        u0.a(rVarC111, null, null, null, (e23.a) objQ5, o0VarE, 6, 14);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(598994401);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    p3.x1 x1Var12 = p3.n.f135158a;
                    aVar5 = aVar19;
                    str3 = str5;
                    aVar6 = aVar15;
                    aVar7 = aVar16;
                } else {
                    c2565a2 = c2565a;
                }
                aVar17 = aVar14;
                objQ3 = new i70.a(aVar17, str, 6);
                o0VarE.K(objQ3);
                h4.r rVarC112 = p5.v.c((e23.l) objQ3, aVar11, false);
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a2) {
                    objQ4 = new ky0.k(p1Var, 9);
                    o0VarE.K(objQ4);
                }
                p3.m.a.C2565a c2565a8 = c2565a2;
                aVar18 = aVar17;
                mh.c(str, rVarC112, jF7, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, (e23.l) objQ4, x0VarE7, o0VarE, (i28 >> 9) & 14, 1572864, 65528);
                o0VarE = o0VarE;
                if (cVar != null) {
                    o0VarE.C(1882977931);
                    fVar2.getClass();
                    s5.x0 x0VarA6 = s5.x0.a(j92.f.f97932i, 0L, 0L, null, null, 0L, null, null, 0, o53.f0.B(20), null, null, 16646143);
                    long jF9 = f(bVar2, o0VarE);
                    bVar5.getClass();
                    h4.r rVarC113 = c2.l.C(aVar11, 0.0f, eVar2.f97917b, 0.0f, 0.0f, 13);
                    if (i30 == 8388608) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if ((i28 & 57344) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z26 | z25;
                    objQ6 = o0VarE.q();
                    if (z27) {
                        aVar20 = aVar18;
                        objQ6 = new l3.p1(10, aVar20, cVar);
                        o0VarE.K(objQ6);
                    } else {
                        aVar20 = aVar18;
                        objQ6 = new l3.p1(10, aVar20, cVar);
                        o0VarE.K(objQ6);
                    }
                    eVar3 = eVar2;
                    aVar19 = aVar20;
                    mh.d(cVar, p5.v.c((e23.l) objQ6, rVarC113, false), jF9, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarA6, o0VarE, (i28 >> 12) & 14, 0, 262136);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    aVar19 = aVar18;
                    eVar3 = eVar2;
                    o0VarE.C(1883457067);
                    o0VarE.g0(false);
                }
                if (str4 != null) {
                    o0VarE.C(1883529111);
                    fVar2.getClass();
                    s5.x0 x0VarE9 = d92.c.e(j92.f.f97932i);
                    p3.x1 x1Var13 = p3.n.f135158a;
                    i35 = iArr[bVar2.ordinal()];
                    if (i35 != 1) {
                        i34 = 4;
                        o0VarE.C(1667360099);
                        jA = d92.b.a(o0VarE).k().a();
                        o0VarE.g0(false);
                    } else if (i35 != 2) {
                        i34 = 4;
                        o0VarE.C(1667361960);
                        jA = d92.b.a(o0VarE).k().f63528e;
                        o0VarE.g0(false);
                    } else if (i35 != 3) {
                        i34 = 4;
                        if (i35 == 4) {
                            throw kg.f.h(o0VarE, 1667358374, false);
                        }
                        o0VarE.C(1667365928);
                        jA = d92.b.a(o0VarE).k().f63527d;
                        o0VarE.g0(false);
                    } else {
                        i34 = 4;
                        o0VarE.C(1667363976);
                        jA = d92.b.a(o0VarE).k().f63527d;
                        o0VarE.g0(false);
                    }
                    long j18 = jA;
                    bVar5.getClass();
                    p3.o0 o0Var6 = o0VarE;
                    String str11 = str4;
                    mh.c(str11, c2.l.C(aVar11, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13), j18, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE9, o0Var6, (i28 >> 15) & 14, 0, 131064);
                    str5 = str11;
                    o0VarE = o0Var6;
                    o0VarE.g0(false);
                } else {
                    str5 = str4;
                    i34 = 4;
                    o0VarE.C(1883812203);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                if (aVar15 != null) {
                    o0VarE.C(598896379);
                    h4.r rVarC114 = c2.l.C(aVar11, 0.0f, 0.0f, i34, 0.0f, 11);
                    if ((i28 & 234881024) == 67108864) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objQ5 = o0VarE.q();
                    if (z24) {
                        objQ5 = new ku1.a(aVar15, 29);
                        o0VarE.K(objQ5);
                    } else {
                        objQ5 = new ku1.a(aVar15, 29);
                        o0VarE.K(objQ5);
                    }
                    u0.a(rVarC114, null, null, null, (e23.a) objQ5, o0VarE, 6, 14);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(598994401);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                p3.x1 x1Var14 = p3.n.f135158a;
                aVar5 = aVar19;
                str3 = str5;
                aVar6 = aVar15;
                aVar7 = aVar16;
            } else {
                aVar13 = aVar8;
            }
            v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2Var = c2.u2.f22900a;
            d92.b.f58623a.getClass();
            bVar5 = d92.b.f58625c;
            bVar5.getClass();
            eVar2 = j92.b.f97899b;
            float f18 = eVar2.f97920e;
            i28 = i16;
            f14 = eVar2.f97920e;
            bVar5.getClass();
            aVar14 = aVar9;
            bVar5.getClass();
            h4.r rVarB6 = c2.l.B(aVar11, f18, f14, 12, f14);
            h4.d.f81522a.getClass();
            aVar15 = aVar10;
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarB6, o0VarE);
            if (cVar2 != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar12);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.u uVar4 = c2.u.f22885a;
            f111232a.getClass();
            i29 = iArr[bVar.ordinal()];
            if (i29 != 1) {
                o0VarE.C(232183219);
                jB = d92.b.a(o0VarE).f().b();
                o0VarE.g0(false);
            } else if (i29 != 2) {
                jB = zl.a.b(o0VarE, 232185111, o0VarE).f63509d;
                o0VarE.g0(false);
            } else if (i29 != 3) {
                o0VarE.C(232187123);
                jB = d92.b.a(o0VarE).f().b();
                o0VarE.g0(false);
            } else {
                if (i29 == 4) {
                    throw kg.f.h(o0VarE, 232181490, false);
                }
                jB = zl.a.b(o0VarE, 232188951, o0VarE).f63508c;
                o0VarE.g0(false);
            }
            h4.r rVarE4 = u1.n.e(l4.k.b(aVar11, k2.i.f102406a), o4.d0.c(0.14f, d92.b.a(o0VarE).f().f63509d, 14), o4.m1.f128891a);
            bVar5.getClass();
            h4.r rVarQ4 = c2.x2.q(rVarE4, j92.b.f97901d.f97906e);
            bVar5.getClass();
            aVar16 = aVar13;
            i7.b(dVar, null, c2.l.y(rVarQ4, eVar2.f97918c), jB, o0VarE, ((i28 >> 6) & 14) | 48, 0);
            o0VarE.g0(true);
            c2.j.c cVar6 = c2.j.f22696f;
            h4.r rVarC115 = u2Var.c(u2Var.a(aVar11, 1.0f, true), h4.d.a.f81534l);
            bVar5.getClass();
            h4.r rVarA6 = c2.l.A(rVarC115, 0.0f, f14, 1);
            zVarA = c2.y.a(cVar6, h4.d.a.f81536n, o0VarE, 6);
            iHashCode3 = Long.hashCode(o0VarE.U);
            i2VarA2 = o0VarE.a0();
            rVarC3 = h4.k.c(rVarA6, o0VarE);
            if (cVar2 != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar12);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
            } else {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar4);
            }
            b4.c(fVar, rVarC3, o0VarE);
            c2.b0 b0Var4 = c2.b0.f22601a;
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            s5.x0 x0VarE10 = d92.c.e(j92.f.f97931h);
            bVar2 = bVar;
            long jF10 = f(bVar2, o0VarE);
            i30 = i28 & 29360128;
            if (i30 == 8388608) {
                z17 = true;
            } else {
                z17 = false;
            }
            if ((i28 & 7168) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z18 | z17;
            objQ3 = o0VarE.q();
            if (z19) {
                c2565a2 = c2565a;
                if (objQ3 == c2565a2) {
                    aVar17 = aVar14;
                }
                h4.r rVarC116 = p5.v.c((e23.l) objQ3, aVar11, false);
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a2) {
                    objQ4 = new ky0.k(p1Var, 9);
                    o0VarE.K(objQ4);
                }
                p3.m.a.C2565a c2565a9 = c2565a2;
                aVar18 = aVar17;
                mh.c(str, rVarC116, jF10, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, (e23.l) objQ4, x0VarE10, o0VarE, (i28 >> 9) & 14, 1572864, 65528);
                o0VarE = o0VarE;
                if (cVar != null) {
                    o0VarE.C(1882977931);
                    fVar2.getClass();
                    s5.x0 x0VarA7 = s5.x0.a(j92.f.f97932i, 0L, 0L, null, null, 0L, null, null, 0, o53.f0.B(20), null, null, 16646143);
                    long jF11 = f(bVar2, o0VarE);
                    bVar5.getClass();
                    h4.r rVarC117 = c2.l.C(aVar11, 0.0f, eVar2.f97917b, 0.0f, 0.0f, 13);
                    if (i30 == 8388608) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if ((i28 & 57344) == 16384) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z26 | z25;
                    objQ6 = o0VarE.q();
                    if (z27) {
                        aVar20 = aVar18;
                        objQ6 = new l3.p1(10, aVar20, cVar);
                        o0VarE.K(objQ6);
                    } else {
                        aVar20 = aVar18;
                        objQ6 = new l3.p1(10, aVar20, cVar);
                        o0VarE.K(objQ6);
                    }
                    eVar3 = eVar2;
                    aVar19 = aVar20;
                    mh.d(cVar, p5.v.c((e23.l) objQ6, rVarC117, false), jF11, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarA7, o0VarE, (i28 >> 12) & 14, 0, 262136);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    aVar19 = aVar18;
                    eVar3 = eVar2;
                    o0VarE.C(1883457067);
                    o0VarE.g0(false);
                }
                if (str4 != null) {
                    o0VarE.C(1883529111);
                    fVar2.getClass();
                    s5.x0 x0VarE11 = d92.c.e(j92.f.f97932i);
                    p3.x1 x1Var15 = p3.n.f135158a;
                    i35 = iArr[bVar2.ordinal()];
                    if (i35 != 1) {
                        i34 = 4;
                        o0VarE.C(1667360099);
                        jA = d92.b.a(o0VarE).k().a();
                        o0VarE.g0(false);
                    } else if (i35 != 2) {
                        i34 = 4;
                        o0VarE.C(1667361960);
                        jA = d92.b.a(o0VarE).k().f63528e;
                        o0VarE.g0(false);
                    } else if (i35 != 3) {
                        i34 = 4;
                        if (i35 == 4) {
                            throw kg.f.h(o0VarE, 1667358374, false);
                        }
                        o0VarE.C(1667365928);
                        jA = d92.b.a(o0VarE).k().f63527d;
                        o0VarE.g0(false);
                    } else {
                        i34 = 4;
                        o0VarE.C(1667363976);
                        jA = d92.b.a(o0VarE).k().f63527d;
                        o0VarE.g0(false);
                    }
                    long j19 = jA;
                    bVar5.getClass();
                    p3.o0 o0Var7 = o0VarE;
                    String str12 = str4;
                    mh.c(str12, c2.l.C(aVar11, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13), j19, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE11, o0Var7, (i28 >> 15) & 14, 0, 131064);
                    str5 = str12;
                    o0VarE = o0Var7;
                    o0VarE.g0(false);
                } else {
                    str5 = str4;
                    i34 = 4;
                    o0VarE.C(1883812203);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                if (aVar15 != null) {
                    o0VarE.C(598896379);
                    h4.r rVarC118 = c2.l.C(aVar11, 0.0f, 0.0f, i34, 0.0f, 11);
                    if ((i28 & 234881024) == 67108864) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objQ5 = o0VarE.q();
                    if (z24) {
                        objQ5 = new ku1.a(aVar15, 29);
                        o0VarE.K(objQ5);
                    } else {
                        objQ5 = new ku1.a(aVar15, 29);
                        o0VarE.K(objQ5);
                    }
                    u0.a(rVarC118, null, null, null, (e23.a) objQ5, o0VarE, 6, 14);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(598994401);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                p3.x1 x1Var16 = p3.n.f135158a;
                aVar5 = aVar19;
                str3 = str5;
                aVar6 = aVar15;
                aVar7 = aVar16;
            } else {
                c2565a2 = c2565a;
            }
            aVar17 = aVar14;
            objQ3 = new i70.a(aVar17, str, 6);
            o0VarE.K(objQ3);
            h4.r rVarC119 = p5.v.c((e23.l) objQ3, aVar11, false);
            objQ4 = o0VarE.q();
            if (objQ4 == c2565a2) {
                objQ4 = new ky0.k(p1Var, 9);
                o0VarE.K(objQ4);
            }
            p3.m.a.C2565a c2565a10 = c2565a2;
            aVar18 = aVar17;
            mh.c(str, rVarC119, jF10, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, (e23.l) objQ4, x0VarE10, o0VarE, (i28 >> 9) & 14, 1572864, 65528);
            o0VarE = o0VarE;
            if (cVar != null) {
                o0VarE.C(1882977931);
                fVar2.getClass();
                s5.x0 x0VarA8 = s5.x0.a(j92.f.f97932i, 0L, 0L, null, null, 0L, null, null, 0, o53.f0.B(20), null, null, 16646143);
                long jF12 = f(bVar2, o0VarE);
                bVar5.getClass();
                h4.r rVarC1110 = c2.l.C(aVar11, 0.0f, eVar2.f97917b, 0.0f, 0.0f, 13);
                if (i30 == 8388608) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if ((i28 & 57344) == 16384) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z26 | z25;
                objQ6 = o0VarE.q();
                if (z27) {
                    aVar20 = aVar18;
                    objQ6 = new l3.p1(10, aVar20, cVar);
                    o0VarE.K(objQ6);
                } else {
                    aVar20 = aVar18;
                    objQ6 = new l3.p1(10, aVar20, cVar);
                    o0VarE.K(objQ6);
                }
                eVar3 = eVar2;
                aVar19 = aVar20;
                mh.d(cVar, p5.v.c((e23.l) objQ6, rVarC1110, false), jF12, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0VarA8, o0VarE, (i28 >> 12) & 14, 0, 262136);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                aVar19 = aVar18;
                eVar3 = eVar2;
                o0VarE.C(1883457067);
                o0VarE.g0(false);
            }
            if (str4 != null) {
                o0VarE.C(1883529111);
                fVar2.getClass();
                s5.x0 x0VarE12 = d92.c.e(j92.f.f97932i);
                p3.x1 x1Var17 = p3.n.f135158a;
                i35 = iArr[bVar2.ordinal()];
                if (i35 != 1) {
                    i34 = 4;
                    o0VarE.C(1667360099);
                    jA = d92.b.a(o0VarE).k().a();
                    o0VarE.g0(false);
                } else if (i35 != 2) {
                    i34 = 4;
                    o0VarE.C(1667361960);
                    jA = d92.b.a(o0VarE).k().f63528e;
                    o0VarE.g0(false);
                } else if (i35 != 3) {
                    i34 = 4;
                    if (i35 == 4) {
                        throw kg.f.h(o0VarE, 1667358374, false);
                    }
                    o0VarE.C(1667365928);
                    jA = d92.b.a(o0VarE).k().f63527d;
                    o0VarE.g0(false);
                } else {
                    i34 = 4;
                    o0VarE.C(1667363976);
                    jA = d92.b.a(o0VarE).k().f63527d;
                    o0VarE.g0(false);
                }
                long j110 = jA;
                bVar5.getClass();
                p3.o0 o0Var8 = o0VarE;
                String str13 = str4;
                mh.c(str13, c2.l.C(aVar11, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13), j110, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE12, o0Var8, (i28 >> 15) & 14, 0, 131064);
                str5 = str13;
                o0VarE = o0Var8;
                o0VarE.g0(false);
            } else {
                str5 = str4;
                i34 = 4;
                o0VarE.C(1883812203);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            if (aVar15 != null) {
                o0VarE.C(598896379);
                h4.r rVarC1111 = c2.l.C(aVar11, 0.0f, 0.0f, i34, 0.0f, 11);
                if ((i28 & 234881024) == 67108864) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objQ5 = o0VarE.q();
                if (z24) {
                    objQ5 = new ku1.a(aVar15, 29);
                    o0VarE.K(objQ5);
                } else {
                    objQ5 = new ku1.a(aVar15, 29);
                    o0VarE.K(objQ5);
                }
                u0.a(rVarC1111, null, null, null, (e23.a) objQ5, o0VarE, 6, 14);
                o0VarE.g0(false);
            } else {
                o0VarE.C(598994401);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            p3.x1 x1Var18 = p3.n.f135158a;
            aVar5 = aVar19;
            str3 = str5;
            aVar6 = aVar15;
            aVar7 = aVar16;
        } else {
            bVar2 = bVar;
            o0VarE.e();
            str3 = str2;
            aVar5 = aVar2;
            aVar6 = aVar3;
            aVar7 = aVar4;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k11.j(this, rVar, bVar2, dVar, str, cVar, str3, aVar7, aVar5, aVar6, i14, i15);
        }
    }
}
