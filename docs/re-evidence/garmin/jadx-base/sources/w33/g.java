package w33;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import o13.p;
import p005kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p13.h0;
import p13.x;
import p13.y;
import s33.j;
import s33.m;
import s33.o;
import s33.s;
import s33.w;
import u33.h;
import z33.n;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f181902a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z33.e f181903b;

    static {
        z33.e eVar = new z33.e();
        eVar.a(v33.a.f175422a);
        eVar.a(v33.a.f175423b);
        eVar.a(v33.a.f175424c);
        eVar.a(v33.a.f175425d);
        eVar.a(v33.a.f175426e);
        eVar.a(v33.a.f175427f);
        eVar.a(v33.a.f175428g);
        eVar.a(v33.a.f175429h);
        eVar.a(v33.a.f175430i);
        eVar.a(v33.a.f175431j);
        eVar.a(v33.a.f175432k);
        eVar.a(v33.a.f175433l);
        f181903b = eVar;
    }

    private g() {
    }

    public static d.b a(s33.e eVar, u33.d dVar, h hVar) {
        String strK0;
        eVar.getClass();
        dVar.getClass();
        hVar.getClass();
        z33.g.f<s33.e, v33.a.c> fVar = v33.a.f175422a;
        fVar.getClass();
        v33.a.c cVar = (v33.a.c) u33.f.a(eVar, fVar);
        String string = (cVar == null || (cVar.f175448b & 1) != 1) ? "<init>" : dVar.getString(cVar.f175449c);
        if (cVar == null || (cVar.f175448b & 2) != 2) {
            List<w> list = eVar.f156592e;
            list.getClass();
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            for (w wVar : list) {
                wVar.getClass();
                s sVarK = u33.g.k(wVar, hVar);
                f181902a.getClass();
                String strE = e(sVarK, dVar);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strK0 = h0.k0(arrayList, "", "(", ")V", null, 56);
        } else {
            strK0 = dVar.getString(cVar.f175450d);
        }
        return new d.b(string, strK0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x004a: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x004c A[HIDDEN]
          (r4v2 java.lang.String) from 0x004d: PHI (r4 I:??) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:22:0x004a, B:20:0x003b] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static w33.d.a b(s33.o r4, u33.d r5, u33.h r6, boolean r7) {
        /*
            r4.getClass()
            r5.getClass()
            r6.getClass()
            z33.g$f<s33.o, v33.a$d> r0 = v33.a.f175425d
            r0.getClass()
            java.lang.Object r0 = u33.f.a(r4, r0)
            v33.a$d r0 = (v33.a.d) r0
            r1 = 0
            if (r0 != 0) goto L18
            goto L4c
        L18:
            int r2 = r0.f175459b
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L21
            v33.a$b r0 = r0.f175460c
            goto L22
        L21:
            r0 = r1
        L22:
            if (r0 != 0) goto L27
            if (r7 == 0) goto L27
            goto L4c
        L27:
            if (r0 == 0) goto L31
            int r7 = r0.f175437b
            r7 = r7 & r3
            if (r7 != r3) goto L31
            int r7 = r0.f175438c
            goto L33
        L31:
            int r7 = r4.f156771f
        L33:
            if (r0 == 0) goto L42
            int r2 = r0.f175437b
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L42
            int r4 = r0.f175439d
            java.lang.String r4 = r5.getString(r4)
            goto L4d
        L42:
            s33.s r4 = u33.g.i(r4, r6)
            java.lang.String r4 = e(r4, r5)
            if (r4 != 0) goto L4d
        L4c:
            return r1
        L4d:
            w33.d$a r6 = new w33.d$a
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w33.g.b(s33.o, u33.d, u33.h, boolean):w33.d$a");
    }

    public static d.b c(j jVar, u33.d dVar, h hVar) {
        String strConcat;
        jVar.getClass();
        dVar.getClass();
        hVar.getClass();
        z33.g.f<j, v33.a.c> fVar = v33.a.f175423b;
        fVar.getClass();
        v33.a.c cVar = (v33.a.c) u33.f.a(jVar, fVar);
        int i14 = (cVar == null || (cVar.f175448b & 1) != 1) ? jVar.f156685f : cVar.f175449c;
        if (cVar == null || (cVar.f175448b & 2) != 2) {
            List listL = x.l(u33.g.f(jVar, hVar));
            List<w> list = jVar.f156695p;
            list.getClass();
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            for (w wVar : list) {
                wVar.getClass();
                arrayList.add(u33.g.k(wVar, hVar));
            }
            ArrayList<s> arrayListC0 = h0.C0(listL, arrayList);
            ArrayList arrayList2 = new ArrayList(y.r(arrayListC0, 10));
            for (s sVar : arrayListC0) {
                f181902a.getClass();
                String strE = e(sVar, dVar);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(u33.g.h(jVar, hVar), dVar);
            if (strE2 == null) {
                return null;
            }
            strConcat = h0.k0(arrayList2, "", "(", ")", null, 56).concat(strE2);
        } else {
            strConcat = dVar.getString(cVar.f175450d);
        }
        return new d.b(dVar.getString(i14), strConcat);
    }

    public static final boolean d(o oVar) {
        oVar.getClass();
        c.f181891a.getClass();
        u33.b.C3157b c3157b = c.f181892b;
        Object objF = oVar.f(v33.a.f175426e);
        objF.getClass();
        return c3157b.d(((Number) objF).intValue()).booleanValue();
    }

    public static String e(s sVar, u33.d dVar) {
        if (sVar.m()) {
            return b.b(dVar.a(sVar.f156859i));
        }
        return null;
    }

    public static final p<e, s33.c> f(String[] strArr, String[] strArr2) throws InvalidProtocolBufferException {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        f181902a.getClass();
        e eVarH = h(byteArrayInputStream, strArr2);
        s33.c.a aVar = s33.c.X;
        aVar.getClass();
        z33.d dVarC = z33.d.c(byteArrayInputStream);
        n nVar = (n) aVar.a(dVarC, f181903b);
        try {
            dVarC.a(0);
            z33.b.b(nVar);
            return new p<>(eVarH, (s33.c) nVar);
        } catch (InvalidProtocolBufferException e4) {
            throw e4.setUnfinishedMessage(nVar);
        }
    }

    public static final p<e, j> g(String[] strArr, String[] strArr2) {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        f181902a.getClass();
        e eVarH = h(byteArrayInputStream, strArr2);
        j.a aVar = j.B;
        aVar.getClass();
        z33.d dVarC = z33.d.c(byteArrayInputStream);
        n nVar = (n) aVar.a(dVarC, f181903b);
        try {
            dVarC.a(0);
            z33.b.b(nVar);
            return new p<>(eVarH, (j) nVar);
        } catch (InvalidProtocolBufferException e4) {
            throw e4.setUnfinishedMessage(nVar);
        }
    }

    public static e h(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        v33.a.e eVar = (v33.a.e) v33.a.e.f175474h.c(byteArrayInputStream, f181903b);
        eVar.getClass();
        return new e(eVar, strArr);
    }

    public static final p<e, m> i(String[] strArr, String[] strArr2) throws InvalidProtocolBufferException {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        f181902a.getClass();
        e eVarH = h(byteArrayInputStream, strArr2);
        m.a aVar = m.f156736l;
        aVar.getClass();
        z33.d dVarC = z33.d.c(byteArrayInputStream);
        n nVar = (n) aVar.a(dVarC, f181903b);
        try {
            dVarC.a(0);
            z33.b.b(nVar);
            return new p<>(eVarH, (m) nVar);
        } catch (InvalidProtocolBufferException e4) {
            throw e4.setUnfinishedMessage(nVar);
        }
    }
}
