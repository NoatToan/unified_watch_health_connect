package p50;

import e23.l;
import e23.p;
import java.util.Map;
import o13.h;
import p3.l1;
import p3.n1;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f136110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f136111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f136112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f136113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f136114f;

    public /* synthetic */ d(p pVar, l lVar, e23.a aVar, p1 p1Var, p1 p1Var2) {
        this.f136109a = 22;
        this.f136114f = pVar;
        this.f136112d = lVar;
        this.f136113e = aVar;
        this.f136110b = p1Var;
        this.f136111c = p1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:111:0x0309  */
    /* JADX WARN: Code duplicated, block: B:112:0x030e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0311  */
    /* JADX WARN: Code duplicated, block: B:115:0x0313  */
    /* JADX WARN: Code duplicated, block: B:117:0x0317 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0319  */
    /* JADX WARN: Code duplicated, block: B:119:0x031e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0322  */
    /* JADX WARN: Code duplicated, block: B:124:0x032a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0335  */
    /* JADX WARN: Code duplicated, block: B:129:0x0338  */
    /* JADX WARN: Code duplicated, block: B:132:0x0343  */
    /* JADX WARN: Code duplicated, block: B:135:0x034e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0389 A[PHI: r4
      0x0389: PHI (r4v28 java.lang.String) = (r4v25 java.lang.String), (r4v30 java.lang.String) binds: [B:160:0x03ab, B:151:0x0386] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:162:0x03ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:164:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:166:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:169:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:171:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:211:0x0534  */
    /* JADX WARN: Code duplicated, block: B:231:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x02e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0270  */
    /* JADX WARN: Code duplicated, block: B:76:0x0275  */
    /* JADX WARN: Code duplicated, block: B:78:0x0278  */
    /* JADX WARN: Code duplicated, block: B:79:0x027a  */
    /* JADX WARN: Code duplicated, block: B:81:0x027e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0280  */
    /* JADX WARN: Code duplicated, block: B:83:0x0285  */
    /* JADX WARN: Code duplicated, block: B:85:0x0289  */
    /* JADX WARN: Code duplicated, block: B:89:0x029f  */
    /* JADX WARN: Code duplicated, block: B:92:0x02af A[LOOP:3: B:87:0x0299->B:92:0x02af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:99:0x02d4 A[LOOP:4: B:95:0x02c6->B:99:0x02d4, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v31 java.lang.Object, still in use, count: 2, list:
          (r9v31 java.lang.Object) from 0x026c: PHI (r9 I:??) = (r9v21 java.lang.Object), (r9v31 java.lang.Object) binds: [B:72:0x026b, B:229:0x026c] A[DONT_GENERATE, DONT_INLINE]
          (r9v31 java.lang.Object) from 0x025e: CHECK_CAST (o13.p) (r9v31 java.lang.Object)
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
    @Override // e23.a
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 1542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p50.d.invoke():java.lang.Object");
    }

    public /* synthetic */ d(int i14, Object obj, Object obj2, Object obj3, Object obj4, p1 p1Var) {
        this.f136109a = i14;
        this.f136112d = obj;
        this.f136113e = obj2;
        this.f136110b = p1Var;
        this.f136114f = obj3;
        this.f136111c = obj4;
    }

    public /* synthetic */ d(j23.l lVar, p1 p1Var, n1 n1Var, l1 l1Var, p1 p1Var2) {
        this.f136109a = 1;
        this.f136112d = lVar;
        this.f136110b = p1Var;
        this.f136113e = n1Var;
        this.f136111c = l1Var;
        this.f136114f = p1Var2;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14) {
        this.f136109a = i14;
        this.f136112d = obj;
        this.f136113e = obj2;
        this.f136114f = obj3;
        this.f136110b = obj4;
        this.f136111c = obj5;
    }

    public /* synthetic */ d(Map map, p pVar, n1 n1Var, p1 p1Var, p1 p1Var2) {
        this.f136109a = 19;
        this.f136112d = map;
        this.f136114f = pVar;
        this.f136113e = n1Var;
        this.f136110b = p1Var;
        this.f136111c = p1Var2;
    }

    public /* synthetic */ d(mx1.a aVar, p1 p1Var, dy1.d dVar, p1 p1Var2, p1 p1Var3) {
        this.f136109a = 14;
        this.f136112d = aVar;
        this.f136110b = p1Var;
        this.f136113e = dVar;
        this.f136114f = p1Var2;
        this.f136111c = p1Var3;
    }

    public /* synthetic */ d(h hVar, Object obj, Object obj2, Object obj3, p1 p1Var, int i14) {
        this.f136109a = i14;
        this.f136112d = hVar;
        this.f136113e = obj;
        this.f136114f = obj2;
        this.f136111c = obj3;
        this.f136110b = p1Var;
    }

    public /* synthetic */ d(p1 p1Var, Object obj, Object obj2, p1 p1Var2, p1 p1Var3, int i14) {
        this.f136109a = i14;
        this.f136110b = p1Var;
        this.f136112d = obj;
        this.f136113e = obj2;
        this.f136114f = p1Var2;
        this.f136111c = p1Var3;
    }
}
