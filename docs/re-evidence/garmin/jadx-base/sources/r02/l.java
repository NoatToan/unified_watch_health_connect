package r02;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.s0;
import c2.u;
import f5.g0;
import f5.z0;
import h5.e0;
import li0.y;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class l {
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f4  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, m mVar, boolean z14, z3.e eVar, p3.m mVar2, int i14) {
        z3.e eVar2;
        boolean z15;
        h4.r rVarB;
        o0 o0VarE = mVar2.E(1458796930);
        int i15 = i14 | 6 | (o0VarE.B(mVar) ? 32 : 16) | 384;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar = h4.r.S;
                z15 = true;
            } else {
                o0VarE.e();
                z15 = z14;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            p3.m.a aVar = p3.m.f135153a;
            if (z15) {
                o0VarE.C(-1754441175);
                Boolean bool = (Boolean) mVar.f148904l.getF182175a();
                bool.booleanValue();
                b bVar = (b) mVar.f148907o.getF182175a();
                int i16 = (i15 & 112) ^ 48;
                boolean z16 = (i16 > 32 && o0VarE.B(mVar)) || (i15 & 48) == 32;
                Object objQ = o0VarE.q();
                if (z16) {
                    objQ = new c(mVar, null);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new c(mVar, null);
                        o0VarE.K(objQ);
                    }
                }
                l0.f(bool, bVar, (e23.p) objQ, o0VarE);
                h4.r.a aVar2 = h4.r.S;
                boolean z17 = (i16 > 32 && o0VarE.B(mVar)) || (i15 & 48) == 32;
                Object objQ2 = o0VarE.q();
                if (z17) {
                    objQ2 = new d(mVar);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new d(mVar);
                        o0VarE.K(objQ2);
                    }
                }
                rVarB = s0.b(aVar2, mVar, (PointerInputEventHandler) objQ2);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1754493472);
                o0VarE.g0(false);
                rVarB = h4.r.S;
            }
            h4.r rVarThen = rVar.then(rVarB);
            boolean z18 = (((i15 & 112) ^ 48) > 32 && o0VarE.B(mVar)) || (i15 & 48) == 32;
            Object objQ3 = o0VarE.q();
            if (z18) {
                objQ3 = new o62.s0(mVar, 13);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new o62.s0(mVar, 13);
                    o0VarE.K(objQ3);
                }
            }
            h4.r rVarD = g0.d(rVarThen, (e23.q) objQ3);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            eVar2 = eVar;
            b71.i.n(6, eVar2, o0VarE, true);
        } else {
            eVar2 = eVar;
            o0VarE.e();
            z15 = z14;
        }
        h4.r rVar2 = rVar;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(rVar2, mVar, z15, eVar2, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0048 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, b5.z] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0049 -> B:12:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(b5.c r13, v13.a r14) {
        /*
            boolean r0 = r14 instanceof r02.e
            if (r0 == 0) goto L13
            r0 = r14
            r02.e r0 = (r02.e) r0
            int r1 = r0.f148838d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f148838d = r1
            goto L18
        L13:
            r02.e r0 = new r02.e
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f148837c
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f148838d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            kotlin.jvm.internal.r0 r13 = r0.f148836b
            b5.c r2 = r0.f148835a
            o13.r.b(r14)
            r12 = r0
            r0 = r13
            r13 = r2
        L2d:
            r2 = r12
            goto L4d
        L2f:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r13)
            r13 = 0
            return r13
        L36:
            kotlin.jvm.internal.r0 r14 = wr.g.s(r14)
        L3a:
            r0.f148835a = r13
            r0.f148836b = r14
            r0.f148838d = r3
            b5.s r2 = b5.s.Main
            java.lang.Object r2 = r13.W0(r2, r0)
            if (r2 != r1) goto L49
            return r1
        L49:
            r12 = r0
            r0 = r14
            r14 = r2
            goto L2d
        L4d:
            b5.q r14 = (b5.q) r14
            T r4 = r0.f105810a
            r5 = 0
            if (r4 == 0) goto L56
            r4 = r3
            goto L57
        L56:
            r4 = r5
        L57:
            java.util.List<b5.a0> r14 = r14.f15870a
            java.util.Iterator r14 = r14.iterator()
        L5d:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L97
            java.lang.Object r6 = r14.next()
            b5.a0 r6 = (b5.a0) r6
            boolean r7 = b5.r.b(r6)
            boolean r8 = b5.r.d(r6)
            if (r8 == 0) goto L8a
            long r8 = r6.f15748a
            T r10 = r0.f105810a
            if (r10 != 0) goto L7b
            r8 = r5
            goto L83
        L7b:
            b5.z r10 = (b5.z) r10
            long r10 = r10.f15946a
            boolean r8 = b5.z.b(r10, r8)
        L83:
            if (r8 == 0) goto L8a
            r8 = 0
            r0.f105810a = r8
            int r4 = r4 + (-1)
        L8a:
            if (r7 == 0) goto L5d
            long r6 = r6.f15748a
            b5.z r6 = b5.z.a(r6)
            r0.f105810a = r6
            int r4 = r4 + 1
            goto L5d
        L97:
            if (r4 <= r3) goto L9a
            r5 = r3
        L9a:
            if (r5 == 0) goto L9f
            kotlin.Unit r13 = p005kotlin.Unit.INSTANCE
            return r13
        L9f:
            r14 = r0
            r0 = r2
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: r02.l.b(b5.c, v13.a):java.lang.Object");
    }
}
