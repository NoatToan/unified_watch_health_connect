package fs;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b5.h0;
import c2.q;
import c2.u;
import d62.o;
import ds.k0;
import e23.l;
import e23.p;
import f5.g0;
import f5.z0;
import fb1.d0;
import fo.x;
import h4.k;
import h4.r;
import h5.e0;
import l72.v2;
import o4.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p008y1.h1;
import p3.b4;
import p3.i2;
import p3.m;
import p3.m1;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<k0, Unit> f73363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f73364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f73365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f73366d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n4.d f73367e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ m1 f73368f;

        /* JADX INFO: renamed from: fs.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.share.stickers.StickerKt$Sticker$5$1$1$1", f = "Sticker.kt", l = {58, 73}, m = "invokeSuspend", v = 2)
        public static final class C1480a extends v13.h implements p<b5.c, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f73369a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public float f73370b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f73371c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f73372d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public /* synthetic */ Object f73373e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ l<k0, Unit> f73374f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ f f73375g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ e23.a<Unit> f73376h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ e23.a<Unit> f73377i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ n4.d f73378j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ m1 f73379k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1480a(l<? super k0, Unit> lVar, f fVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, n4.d dVar, m1 m1Var, t13.d<? super C1480a> dVar2) {
                super(2, dVar2);
                this.f73374f = lVar;
                this.f73375g = fVar;
                this.f73376h = aVar;
                this.f73377i = aVar2;
                this.f73378j = dVar;
                this.f73379k = m1Var;
            }

            public static final boolean a(f fVar, n4.d dVar, m1 m1Var) {
                float floatValue = (fVar.f73391f.getFloatValue() * m1Var.getFloatValue()) / 2.0f;
                return Float.intBitsToFloat((int) (fVar.a() & 4294967295L)) + floatValue > dVar.f123550d + floatValue;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C1480a c1480a = new C1480a(this.f73374f, this.f73375g, this.f73376h, this.f73377i, this.f73378j, this.f73379k, dVar);
                c1480a.f73373e = obj;
                return c1480a;
            }

            @Override // e23.p
            public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
                return ((C1480a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:102:0x01b4 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:103:0x01a6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:104:? A[LOOP:1: B:69:0x0196->B:104:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:71:0x019c A[Catch: all -> 0x0181, TRY_LEAVE, TryCatch #1 {all -> 0x0181, blocks: (B:65:0x018b, B:68:0x0192, B:69:0x0196, B:71:0x019c, B:57:0x0178, B:59:0x017e, B:63:0x0186, B:62:0x0184), top: B:93:0x018b }] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Path cross not found for [B:93:0x018b, B:68:0x0192], limit reached: 103 */
            /* JADX WARN: Path cross not found for [B:97:0x009c, B:39:0x00ab], limit reached: 103 */
            /* JADX WARN: Type inference failed for: r10v1 */
            /* JADX WARN: Type inference failed for: r10v2 */
            /* JADX WARN: Type inference failed for: r10v7 */
            /* JADX WARN: Type inference failed for: r10v8 */
            /* JADX WARN: Type inference failed for: r14v0 */
            /* JADX WARN: Type inference failed for: r14v1 */
            /* JADX WARN: Type inference failed for: r14v10 */
            /* JADX WARN: Type inference failed for: r14v11 */
            /* JADX WARN: Type inference failed for: r14v12 */
            /* JADX WARN: Type inference failed for: r14v13 */
            /* JADX WARN: Type inference failed for: r14v14 */
            /* JADX WARN: Type inference failed for: r14v15 */
            /* JADX WARN: Type inference failed for: r14v16 */
            /* JADX WARN: Type inference failed for: r14v17 */
            /* JADX WARN: Type inference failed for: r14v18 */
            /* JADX WARN: Type inference failed for: r14v2 */
            /* JADX WARN: Type inference failed for: r14v3, types: [int] */
            /* JADX WARN: Type inference failed for: r14v4 */
            /* JADX WARN: Type inference failed for: r14v6 */
            /* JADX WARN: Type inference failed for: r14v7 */
            /* JADX WARN: Type inference failed for: r14v8 */
            /* JADX WARN: Type inference failed for: r14v9, types: [int] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0068 -> B:22:0x006b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // v13.a
            public final java.lang.Object invokeSuspend(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 502
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fs.d.a.C1480a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super k0, Unit> lVar, f fVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, n4.d dVar, m1 m1Var) {
            this.f73363a = lVar;
            this.f73364b = fVar;
            this.f73365c = aVar;
            this.f73366d = aVar2;
            this.f73367e = dVar;
            this.f73368f = m1Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
            Object objC = h1.c(h0Var, new C1480a(this.f73363a, this.f73364b, this.f73365c, this.f73366d, this.f73367e, this.f73368f, null), dVar);
            return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:54:0x00af  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:74:0x0117  */
    /* JADX WARN: Code duplicated, block: B:77:0x015b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0162  */
    /* JADX WARN: Code duplicated, block: B:80:0x0166  */
    /* JADX WARN: Code duplicated, block: B:85:0x0187  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void a(f fVar, boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, n4.d dVar, l<? super k0, Unit> lVar, m mVar, int i14, int i15) {
        e23.a<Unit> aVar3;
        int i16;
        n4.d dVar2;
        int i17;
        l<? super k0, Unit> lVar2;
        boolean z15;
        boolean z16;
        o0 o0Var;
        n4.d dVar3;
        l<? super k0, Unit> lVar3;
        p2 p2VarI0;
        m.a aVar4;
        int i18;
        e23.a<Unit> aVar5;
        n4.d dVar4;
        l<? super k0, Unit> lVar4;
        Object objQ;
        m.a.C2565a c2565a;
        m1 m1Var;
        Object objQ2;
        m1 m1Var2;
        Object objQ3;
        boolean zR;
        Object objQ4;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar6;
        h5.g.a.b bVar;
        Object objQ5;
        Object objQ6;
        aVar.getClass();
        o0 o0VarE = mVar.E(1481292949);
        int i19 = (o0VarE.r(fVar) ? 4 : 2) | i14;
        if ((i14 & 384) == 0) {
            i19 |= o0VarE.r(aVar) ? 256 : 128;
        }
        int i24 = i15 & 8;
        if (i24 != 0) {
            i16 = i19 | 3072;
            aVar3 = aVar2;
        } else {
            aVar3 = aVar2;
            i16 = i19 | (o0VarE.r(aVar3) ? 2048 : 1024);
        }
        int i25 = i15 & 16;
        if (i25 != 0) {
            i17 = i16 | 24576;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i17 = i16 | (o0VarE.B(dVar2) ? 16384 : 8192);
        }
        int i26 = i15 & 32;
        if (i26 == 0) {
            if ((196608 & i14) == 0) {
                lVar2 = lVar;
                i17 |= o0VarE.r(lVar2) ? 131072 : 65536;
            }
            if ((74899 & i17) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i17 & 1, z15)) {
                aVar4 = m.f135153a;
                if (i24 != 0) {
                    objQ6 = o0VarE.q();
                    aVar4.getClass();
                    if (objQ6 == m.a.f135155b) {
                        objQ6 = new d0(26);
                        o0VarE.K(objQ6);
                    }
                    aVar5 = (e23.a) objQ6;
                    i18 = i25;
                } else {
                    i18 = i25;
                    aVar5 = aVar3;
                }
                if (i18 != 0) {
                    n4.d.f123545e.getClass();
                    dVar4 = n4.d.f123546f;
                } else {
                    dVar4 = dVar2;
                }
                if (i26 != 0) {
                    objQ5 = o0VarE.q();
                    aVar4.getClass();
                    if (objQ5 == m.a.f135155b) {
                        objQ5 = new x(10);
                        o0VarE.K(objQ5);
                    }
                    lVar4 = (l) objQ5;
                } else {
                    lVar4 = lVar2;
                }
                x1 x1Var = n.f135158a;
                objQ = o0VarE.q();
                aVar4.getClass();
                c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = n23.j.o(0.0f, o0VarE);
                }
                m1Var = (m1) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = n23.j.o(0.0f, o0VarE);
                }
                m1Var2 = (m1) objQ2;
                r.a aVar7 = r.S;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new c(m1Var, m1Var2, 0);
                    o0VarE.K(objQ3);
                }
                r rVarF = g0.f(aVar7, (l) objQ3);
                zR = o0VarE.r(fVar);
                objQ4 = o0VarE.q();
                if (zR || objQ4 == c2565a) {
                    objQ4 = new ci0.b(fVar, 24, m1Var, m1Var2);
                    o0VarE.K(objQ4);
                }
                z16 = z14;
                r rVarA = v2.a(s0.a(rVarF, (l) objQ4), z16, new ak0.h(fVar, dVar4, lVar4, aVar, aVar5, m1Var2, 7), o0VarE, 48);
                h4.d.f81522a.getClass();
                z0VarD = q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarA, o0VarE);
                h5.g.V.getClass();
                aVar6 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u uVar = u.f22885a;
                wf.f.a aVar8 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                aVar8.f184930c = fVar.f73387b.get(fVar.f73389d.getIntValue()).f73394b;
                wf.h.a(aVar8);
                jf.r.a(aVar8.a(), null, null, null, null, null, null, o0VarE, 48, 2044);
                o0Var = o0VarE;
                o0Var.g0(true);
                lVar3 = lVar4;
                aVar3 = aVar5;
                dVar3 = dVar4;
            } else {
                z16 = z14;
                o0Var = o0VarE;
                o0Var.e();
                dVar3 = dVar2;
                lVar3 = lVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new o(fVar, z16, aVar, aVar3, dVar3, lVar3, i14, i15);
            }
        }
        i17 |= 196608;
        lVar2 = lVar;
        if ((74899 & i17) != 74898) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i17 & 1, z15)) {
            aVar4 = m.f135153a;
            if (i24 != 0) {
                objQ6 = o0VarE.q();
                aVar4.getClass();
                if (objQ6 == m.a.f135155b) {
                    objQ6 = new d0(26);
                    o0VarE.K(objQ6);
                }
                aVar5 = (e23.a) objQ6;
                i18 = i25;
            } else {
                i18 = i25;
                aVar5 = aVar3;
            }
            if (i18 != 0) {
                n4.d.f123545e.getClass();
                dVar4 = n4.d.f123546f;
            } else {
                dVar4 = dVar2;
            }
            if (i26 != 0) {
                objQ5 = o0VarE.q();
                aVar4.getClass();
                if (objQ5 == m.a.f135155b) {
                    objQ5 = new x(10);
                    o0VarE.K(objQ5);
                }
                lVar4 = (l) objQ5;
            } else {
                lVar4 = lVar2;
            }
            x1 x1Var2 = n.f135158a;
            objQ = o0VarE.q();
            aVar4.getClass();
            c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = n23.j.o(0.0f, o0VarE);
            }
            m1Var = (m1) objQ;
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = n23.j.o(0.0f, o0VarE);
            }
            m1Var2 = (m1) objQ2;
            r.a aVar9 = r.S;
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new c(m1Var, m1Var2, 0);
                o0VarE.K(objQ3);
            }
            r rVarF2 = g0.f(aVar9, (l) objQ3);
            zR = o0VarE.r(fVar);
            objQ4 = o0VarE.q();
            if (zR) {
                objQ4 = new ci0.b(fVar, 24, m1Var, m1Var2);
                o0VarE.K(objQ4);
            } else {
                objQ4 = new ci0.b(fVar, 24, m1Var, m1Var2);
                o0VarE.K(objQ4);
            }
            z16 = z14;
            r rVarA2 = v2.a(s0.a(rVarF2, (l) objQ4), z16, new ak0.h(fVar, dVar4, lVar4, aVar, aVar5, m1Var2, 7), o0VarE, 48);
            h4.d.f81522a.getClass();
            z0VarD = q.d(h4.d.a.f81524b, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarA2, o0VarE);
            h5.g.V.getClass();
            aVar6 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar2 = u.f22885a;
            wf.f.a aVar10 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            aVar10.f184930c = fVar.f73387b.get(fVar.f73389d.getIntValue()).f73394b;
            wf.h.a(aVar10);
            jf.r.a(aVar10.a(), null, null, null, null, null, null, o0VarE, 48, 2044);
            o0Var = o0VarE;
            o0Var.g0(true);
            lVar3 = lVar4;
            aVar3 = aVar5;
            dVar3 = dVar4;
        } else {
            z16 = z14;
            o0Var = o0VarE;
            o0Var.e();
            dVar3 = dVar2;
            lVar3 = lVar2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(fVar, z16, aVar, aVar3, dVar3, lVar3, i14, i15);
        }
    }
}
