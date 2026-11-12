package t2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.a0;
import b5.h0;
import b5.m0;
import b5.q;
import b5.s;
import b5.s0;
import b5.u0;
import b5.v0;
import b5.z;
import ch.qos.logback.core.net.SyslogConstants;
import e23.p;
import h5.c2;
import h5.m;
import h5.u1;
import java.util.List;
import m4.e0;
import m4.g0;
import m4.i0;
import m4.j0;
import m4.k;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.h1;
import p008y1.k3;
import v13.e;
import v13.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt2/c;", "Lh5/m;", "Lh5/u1;", "Lm4/k;", "Lm4/e0;", "Lkotlin/Function0;", "", "onHandwritingSlopExceeded", "<init>", "(Le23/a;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class c extends m implements u1, k, e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.a<Unit> f161753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f161754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u0 f161755e;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: t2.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", l = {116, SyslogConstants.LOG_LOCAL2, 182}, m = "invokeSuspend", v = 1)
        public static final class C3053a extends h implements p<b5.c, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public a0 f161757a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public s f161758b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f161759c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f161760d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ c f161761e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3053a(c cVar, t13.d<? super C3053a> dVar) {
                super(2, dVar);
                this.f161761e = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C3053a c3053a = new C3053a(this.f161761e, dVar);
                c3053a.f161760d = obj;
                return c3053a;
            }

            @Override // e23.p
            public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
                return ((C3053a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
            
                if (r9 == r1) goto L144;
             */
            /* JADX WARN: Code restructure failed: missing block: B:143:0x0266, code lost:
            
                if (r3 == r1) goto L144;
             */
            /* JADX WARN: Code restructure failed: missing block: B:144:0x0268, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
            
                if (r8 == r1) goto L144;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x0266 -> B:145:0x0269). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ce -> B:41:0x00d2). Please report as a decompilation issue!!! */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                b5.c cVar;
                Object objB;
                a0 a0Var;
                boolean z14;
                s sVar;
                a0 a0Var2;
                b5.c cVar2;
                s sVar2;
                Object objW0;
                c cVar3;
                a0 a0Var3;
                int i14;
                a0 a0Var4;
                b5.c cVar4;
                a0 a0Var5;
                Object objW1;
                a0 a0Var6;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = this.f161759c;
                c cVar5 = this.f161761e;
                if (i15 != 0) {
                    if (i15 == 1) {
                        cVar = (b5.c) this.f161760d;
                        r.b(obj);
                        objB = obj;
                    } else if (i15 == 2) {
                        sVar2 = this.f161758b;
                        a0Var2 = this.f161757a;
                        cVar2 = (b5.c) this.f161760d;
                        r.b(obj);
                        objW0 = obj;
                        q qVar = (q) objW0;
                        List<a0> list = qVar.f15870a;
                        int size = list.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size) {
                                cVar3 = cVar5;
                                a0Var3 = null;
                                break;
                            }
                            a0Var3 = list.get(i16);
                            a0 a0Var7 = a0Var3;
                            if (!a0Var7.b()) {
                                cVar3 = cVar5;
                                if (z.b(a0Var7.f15748a, a0Var2.f15748a) && a0Var7.f15751d) {
                                    break;
                                }
                            } else {
                                cVar3 = cVar5;
                            }
                            i16++;
                            cVar5 = cVar3;
                        }
                        a0 a0Var8 = a0Var3;
                        if (a0Var8 == null || a0Var8.f15749b - a0Var2.f15749b >= cVar2.getViewConfiguration().c() || qVar.f15872c == 2) {
                            a0Var8 = null;
                        } else {
                            if (n4.c.e(n4.c.i(a0Var8.f15750c, a0Var2.f15750c)) <= cVar2.getViewConfiguration().d()) {
                                cVar5 = cVar3;
                                this.f161760d = cVar2;
                                this.f161757a = a0Var2;
                                this.f161758b = sVar2;
                                this.f161759c = 2;
                                objW0 = cVar2.W0(sVar2, this);
                            }
                            s sVar3 = s.Initial;
                            this.f161760d = cVar4;
                            this.f161757a = a0Var4;
                            a0Var5 = null;
                            this.f161758b = null;
                            this.f161759c = 3;
                            objW1 = cVar4.W0(sVar3, this);
                        }
                        if (a0Var8 == null) {
                            return Unit.INSTANCE;
                        }
                        c cVar6 = cVar3;
                        if (!cVar6.f161754d) {
                            h4.r.c node = cVar6.getNode();
                            q3.c cVar7 = null;
                            while (true) {
                                if (node == null) {
                                    if (!cVar6.getNode().getIsAttached()) {
                                        e5.a.b("visitChildren called on an unattached node");
                                    }
                                    q3.c cVar8 = new q3.c(new h4.r.c[16], 0);
                                    h4.r.c child = cVar6.getNode().getChild();
                                    if (child == null) {
                                        h5.k.a(cVar8, cVar6.getNode());
                                    } else {
                                        cVar8.b(child);
                                    }
                                    loop4: while (true) {
                                        int i17 = cVar8.f142358c;
                                        if (i17 == 0) {
                                            break;
                                        }
                                        h4.r.c cVarB = (h4.r.c) cVar8.k(i17 - 1);
                                        if ((cVarB.getAggregateChildKindSet() & 1024) == 0) {
                                            h5.k.a(cVar8, cVarB);
                                        } else {
                                            while (true) {
                                                if (cVarB == null) {
                                                    continue;
                                                } else if ((cVarB.getKindSet() & 1024) != 0) {
                                                    q3.c cVar9 = null;
                                                    while (true) {
                                                        if (cVarB == null) {
                                                            continue;
                                                        } else {
                                                            if (cVarB instanceof j0) {
                                                                i0.E0((j0) cVarB);
                                                                break;
                                                            }
                                                            if ((cVarB.getKindSet() & 1024) == 0 || !(cVarB instanceof m)) {
                                                                cVarB = h5.k.b(cVar9);
                                                            } else {
                                                                int i18 = 0;
                                                                for (h4.r.c child2 = ((m) cVarB).f81888b; child2 != null; child2 = child2.getChild()) {
                                                                    if ((child2.getKindSet() & 1024) != 0) {
                                                                        i18++;
                                                                        if (i18 == 1) {
                                                                            cVarB = child2;
                                                                        } else {
                                                                            if (cVar9 == null) {
                                                                                cVar9 = new q3.c(new h4.r.c[16], 0);
                                                                            }
                                                                            if (cVarB != null) {
                                                                                cVar9.b(cVarB);
                                                                                cVarB = null;
                                                                            }
                                                                            cVar9.b(child2);
                                                                        }
                                                                    }
                                                                }
                                                                if (i18 != 1) {
                                                                    cVarB = h5.k.b(cVar9);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    cVarB = cVarB.getChild();
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (node instanceof j0) {
                                        i0.E0((j0) node);
                                        break;
                                    }
                                    if ((node.getKindSet() & 1024) != 0 && (node instanceof m)) {
                                        int i19 = 0;
                                        for (h4.r.c child3 = ((m) node).f81888b; child3 != null; child3 = child3.getChild()) {
                                            if ((child3.getKindSet() & 1024) != 0) {
                                                i19++;
                                                if (i19 == 1) {
                                                    node = child3;
                                                } else {
                                                    if (cVar7 == null) {
                                                        cVar7 = new q3.c(new h4.r.c[16], 0);
                                                    }
                                                    if (node != null) {
                                                        cVar7.b(node);
                                                        node = null;
                                                    }
                                                    cVar7.b(child3);
                                                }
                                            }
                                        }
                                        if (i19 == 1) {
                                        }
                                    }
                                    node = h5.k.b(cVar7);
                                }
                            }
                        }
                        i14 = 0;
                        cVar6.f161753c.invoke();
                        a0Var8.a();
                        a0Var4 = a0Var2;
                        cVar4 = cVar2;
                        s sVar4 = s.Initial;
                        this.f161760d = cVar4;
                        this.f161757a = a0Var4;
                        a0Var5 = null;
                        this.f161758b = null;
                        this.f161759c = 3;
                        objW1 = cVar4.W0(sVar4, this);
                    } else {
                        if (i15 != 3) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a0Var4 = this.f161757a;
                        cVar4 = (b5.c) this.f161760d;
                        r.b(obj);
                        i14 = 0;
                        a0Var5 = null;
                        objW1 = obj;
                    }
                    List<a0> list2 = ((q) objW1).f15870a;
                    int size2 = list2.size();
                    int i24 = i14;
                    while (true) {
                        if (i24 >= size2) {
                            a0Var6 = a0Var5;
                            break;
                        }
                        a0 a0Var9 = list2.get(i24);
                        a0 a0Var10 = a0Var9;
                        if (!a0Var10.b() && z.b(a0Var10.f15748a, a0Var4.f15748a) && a0Var10.f15751d) {
                            a0Var6 = a0Var9;
                            break;
                        }
                        i24++;
                    }
                    a0 a0Var11 = a0Var6;
                    if (a0Var11 == null) {
                        return Unit.INSTANCE;
                    }
                    a0Var11.a();
                    s sVar5 = s.Initial;
                    this.f161760d = cVar4;
                    this.f161757a = a0Var4;
                    a0Var5 = null;
                    this.f161758b = null;
                    this.f161759c = 3;
                    objW1 = cVar4.W0(sVar5, this);
                } else {
                    r.b(obj);
                    cVar = (b5.c) this.f161760d;
                    s sVar6 = s.Initial;
                    this.f161760d = cVar;
                    this.f161759c = 1;
                    objB = k3.b(cVar, true, sVar6, this);
                }
                a0 a0Var12 = (a0) objB;
                int i25 = a0Var12.f15756i;
                long j8 = a0Var12.f15750c;
                m0.f15849b.getClass();
                if (i25 != m0.f15852e && a0Var12.f15756i != m0.f15853f) {
                    return Unit.INSTANCE;
                }
                int i26 = (int) (j8 >> 32);
                if (Float.intBitsToFloat(i26) >= 0.0f) {
                    a0Var = a0Var12;
                    if (Float.intBitsToFloat(i26) < ((int) (cVar.a() >> 32))) {
                        int i27 = (int) (j8 & 4294967295L);
                        if (Float.intBitsToFloat(i27) >= 0.0f && Float.intBitsToFloat(i27) < ((int) (4294967295L & cVar.a()))) {
                            z14 = true;
                        }
                    }
                    if (!cVar5.f161754d || z14) {
                        sVar = s.Initial;
                    } else {
                        sVar = s.Main;
                    }
                    a0Var2 = a0Var;
                    cVar2 = cVar;
                    sVar2 = sVar;
                    this.f161760d = cVar2;
                    this.f161757a = a0Var2;
                    this.f161758b = sVar2;
                    this.f161759c = 2;
                    objW0 = cVar2.W0(sVar2, this);
                } else {
                    a0Var = a0Var12;
                }
                z14 = false;
                if (cVar5.f161754d) {
                    sVar = s.Initial;
                } else {
                    sVar = s.Initial;
                }
                a0Var2 = a0Var;
                cVar2 = cVar;
                sVar2 = sVar;
                this.f161760d = cVar2;
                this.f161757a = a0Var2;
                this.f161758b = sVar2;
                this.f161759c = 2;
                objW0 = cVar2.W0(sVar2, this);
            }
        }

        public a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
            Object objC = h1.c(h0Var, new C3053a(c.this, null), dVar);
            return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
        }
    }

    public c(e23.a<Unit> aVar) {
        this.f161753c = aVar;
        v0 v0VarA = s0.a(new a());
        U1(v0VarA);
        this.f161755e = v0VarA;
    }

    @Override // h5.u1
    public final long V0() {
        h5.r rVar = b.f161752a;
        g6.c cVar = h5.k.g(this).A;
        rVar.getClass();
        c2.a aVar = c2.f81742b;
        int iF0 = cVar.f0(rVar.f81950a);
        int iF1 = cVar.f0(rVar.f81951b);
        int iF2 = cVar.f0(rVar.f81952c);
        int iF3 = cVar.f0(rVar.f81953d);
        boolean z14 = rVar.f81954e;
        aVar.getClass();
        return c2.a.b(iF0, iF1, iF2, iF3, z14);
    }

    @Override // h5.u1
    public final void a1() {
        this.f161755e.a1();
    }

    @Override // m4.k
    public final void u(g0 g0Var) {
        this.f161754d = g0Var.a();
    }

    @Override // h5.u1
    public final void u1(q qVar, s sVar, long j8) {
        this.f161755e.u1(qVar, sVar, j8);
    }
}
