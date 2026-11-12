package f2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import p3.p1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68293a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f68294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f68295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f68296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f68297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Serializable f68298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f68299g;

    public /* synthetic */ q0(int i14, e23.l lVar, String str, String str2, String str3, tn2.r0 r0Var) {
        this.f68294b = r0Var;
        this.f68297e = str;
        this.f68298f = str2;
        this.f68295c = i14;
        this.f68299g = str3;
        this.f68296d = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:174:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:175:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:179:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:182:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:183:0x0507  */
    /* JADX WARN: Code duplicated, block: B:190:0x051b  */
    /* JADX WARN: Code duplicated, block: B:195:0x0561  */
    /* JADX WARN: Code duplicated, block: B:198:0x0569  */
    /* JADX WARN: Code duplicated, block: B:199:0x0573  */
    /* JADX WARN: Code duplicated, block: B:206:0x0586  */
    /* JADX WARN: Code duplicated, block: B:220:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:221:0x05ef  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v29 java.lang.Object, still in use, count: 2, list:
          (r12v29 java.lang.Object) from 0x04a0: PHI (r12 I:??) = (r12v24 java.lang.Object), (r12v29 java.lang.Object) binds: [B:171:0x049f, B:284:0x04a0] A[DONT_GENERATE, DONT_INLINE]
          (r12v29 java.lang.Object) from 0x0494: CHECK_CAST (kw.f) (r12v29 java.lang.Object)
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
    @Override // e23.l
    public final java.lang.Object invoke(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 2030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.q0.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ q0(ArrayList arrayList, p005kotlin.jvm.internal.p0 p0Var, List list, e23.l lVar, int i14, z zVar) {
        this.f68294b = arrayList;
        this.f68298f = p0Var;
        this.f68297e = list;
        this.f68296d = lVar;
        this.f68295c = i14;
        this.f68299g = zVar;
    }

    public /* synthetic */ q0(List list, int i14, b63.o oVar, b63.o oVar2, a10.a aVar, e23.l lVar) {
        this.f68294b = list;
        this.f68295c = i14;
        this.f68297e = oVar;
        this.f68298f = oVar2;
        this.f68299g = aVar;
        this.f68296d = lVar;
    }

    public /* synthetic */ q0(sw.g gVar, kw.i iVar, DateTime dateTime, DateTime dateTime2, int i14, p1 p1Var) {
        this.f68294b = gVar;
        this.f68297e = iVar;
        this.f68298f = dateTime;
        this.f68296d = dateTime2;
        this.f68295c = i14;
        this.f68299g = p1Var;
    }
}
