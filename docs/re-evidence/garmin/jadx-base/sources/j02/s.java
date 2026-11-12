package j02;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import lc.u0;
import o53.j2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.b2;
import p3.c2;
import p3.p0;
import p3.x3;
import s1.e2;
import s1.j1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u001bB\u009b\u0001\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00124\u0010\u000b\u001a0\u0012,\u0012*\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00140\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lj02/s;", "T", "", "Lj02/i;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Lp3/x3;", "Lkotlin/Function4;", "Lt13/d;", "", "onMoveState", "", "scrollThreshold", "Lj02/a;", "scrollThresholdPadding", "Lj02/j0;", "scroller", "Lg6/o;", "layoutDirection", "", "lazyVerticalStaggeredGridRtlFix", "Lkotlin/Function2;", "Ln4/d;", "shouldItemMove", "<init>", "(Lj02/i;Lo53/b0;Lp3/x3;FLj02/a;Lj02/j0;Lg6/o;ZLe23/p;)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class s<T> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f96125v = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<T> f96126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.b0 f96127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x3<e23.r<o53.b0, T, T, t13.d<? super Unit>, Object>> f96128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f96129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j02.a f96130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j0 f96131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g6.o f96132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f96133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e23.p<n4.d, n4.d, Boolean> f96134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z53.b f96135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c2 f96136k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p3.d0 f96137l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c2 f96138m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c2 f96139n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c2 f96140o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c2 f96141p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f96142q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashSet<Object> f96143r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c2 f96144s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s1.b<n4.c, s1.o> f96145t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final r53.c2 f96146u;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f96148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f96149c;

        static {
            int[] iArr = new int[b2.values().length];
            try {
                iArr[b2.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b2.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f96147a = iArr;
            int[] iArr2 = new int[g6.o.values().length];
            try {
                iArr2[g6.o.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[g6.o.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f96148b = iArr2;
            int[] iArr3 = new int[j0.b.values().length];
            try {
                iArr3[j0.b.FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[j0.b.BACKWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f96149c = iArr3;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(i<? extends T> iVar, o53.b0 b0Var, x3<? extends e23.r<? super o53.b0, ? super T, ? super T, ? super t13.d<? super Unit>, ? extends Object>> x3Var, float f14, j02.a aVar, j0 j0Var, g6.o oVar, boolean z14, e23.p<? super n4.d, ? super n4.d, Boolean> pVar) {
        iVar.getClass();
        b0Var.getClass();
        x3Var.getClass();
        aVar.getClass();
        j0Var.getClass();
        oVar.getClass();
        pVar.getClass();
        this.f96126a = iVar;
        this.f96127b = b0Var;
        this.f96128c = x3Var;
        this.f96129d = f14;
        this.f96130e = aVar;
        this.f96131f = j0Var;
        this.f96132g = oVar;
        this.f96133h = z14;
        this.f96134i = pVar;
        this.f96135j = z53.c.a();
        this.f96136k = p0.n(null);
        this.f96137l = p0.f(new q(this, 2));
        n4.c.f123541b.getClass();
        this.f96138m = p0.n(n4.c.a(0L));
        g6.k.f76003b.getClass();
        this.f96139n = p0.n(g6.k.a(0L));
        this.f96140o = p0.n(null);
        this.f96141p = p0.n(null);
        this.f96142q = 0L;
        this.f96143r = new HashSet<>();
        this.f96144s = p0.n(null);
        this.f96145t = new s1.b<>(n4.c.a(0L), e2.f155573f, null, null, 12, null);
        this.f96146u = p0.s(new q(this, 3));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02bc, code lost:
    
        if (r1.getIndex() > r14.getIndex()) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02d6, code lost:
    
        if (r0.P(r8) == r9) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r14.getIndex() == r2.b()) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
    
        if (r14.getIndex() == r1.getIndex()) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
    
        r7.e(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        return p005kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19, types: [j02.j0$b, java.lang.Object, o53.d0, t13.d, t13.g] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(s sVar, j0.b bVar, v13.c cVar) {
        t tVar;
        j0.b bVar2;
        b2 b2Var;
        n4.d dVarB;
        n4.d dVar;
        ArrayList arrayList;
        float f14;
        float f15;
        j0.b bVar3;
        ?? r14;
        Object obj;
        Object objPrevious;
        g gVar;
        g gVar2;
        T next;
        g gVar3;
        n4.d dVar2;
        HashSet<Object> hashSet = sVar.f96143r;
        i<T> iVar = sVar.f96126a;
        z53.b bVar4 = sVar.f96135j;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f96153d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f96153d = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(sVar, cVar);
            }
        } else {
            tVar = new t(sVar, cVar);
        }
        t tVar2 = tVar;
        Object obj2 = tVar2.f96151b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar2.f96153d;
        if (i15 == 0) {
            o13.r.b(obj2);
            tVar2.f96150a = bVar;
            tVar2.f96153d = 1;
            if (bVar4.c(tVar2) != aVar) {
                bVar2 = bVar;
            }
            return aVar;
        }
        if (i15 == 1) {
            j0.b bVar5 = tVar2.f96150a;
            o13.r.b(obj2);
            bVar2 = bVar5;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj2);
        }
        return Unit.INSTANCE;
        g<T> gVarD = sVar.d();
        if (gVarD == null) {
            bVar4.e(null);
            return Unit.INSTANCE;
        }
        int[] iArr = b.f96149c;
        int i16 = iArr[bVar2.ordinal()];
        if (i16 == 1) {
            g gVar4 = (g) p13.h0.n0(iVar.c().e());
            if (gVar4 != null) {
            }
            long jI = sVar.i(sVar.h(sVar.e()));
            long jD = gVarD.d();
            g6.k.a aVar2 = g6.k.f76003b;
            j0.b bVar6 = bVar2;
            long j8 = n4.c.j((((long) Float.floatToRawIntBits((int) (jD & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (jD >> 32)) << 32), jI);
            n4.d dVarF = g8.i.f(j8, p.d(j8, g6.n.c(gVarD.a())));
            b2 b2VarF = sVar.f();
            b2VarF.getClass();
            int i17 = p.a.f96121a[b2VarF.ordinal()];
            if (i17 == 1) {
                b2Var = b2.Horizontal;
            } else {
                if (i17 != 2) {
                    u0.r();
                    return null;
                }
                b2Var = b2.Vertical;
            }
            int i18 = b.f96147a[b2Var.ordinal()];
            if (i18 == 1) {
                dVarB = n4.d.b(dVarF, 0.0f, 0.0f, Float.POSITIVE_INFINITY, 5);
            } else {
                if (i18 != 2) {
                    u0.r();
                    return null;
                }
                dVarB = n4.d.b(dVarF, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 0.0f, 10);
            }
            f0 f0VarC = iVar.c();
            j02.a aVar3 = sVar.f96130e;
            aVar3.getClass();
            j02.b.a aVar4 = j02.b.f96025c;
            b2 orientation = f0VarC.getOrientation();
            boolean zC = f0VarC.c();
            aVar4.getClass();
            j02.b bVarA = j02.b.a.a(orientation, aVar3, zC);
            f0VarC.getClass();
            bVarA.getClass();
            i0 i0VarB = f0VarC.b(bVarA);
            float f16 = i0VarB.f96071a;
            float f17 = i0VarB.f96072b;
            int i19 = h.a.f96070a[f0VarC.getOrientation().ordinal()];
            if (i19 == 1) {
                dVar = dVarB;
                ArrayList arrayListE = f0VarC.e();
                arrayList = new ArrayList();
                for (Object obj3 : arrayListE) {
                    g gVar5 = (g) obj3;
                    long jD2 = gVar5.d();
                    g6.k.a aVar5 = g6.k.f76003b;
                    if (((int) (jD2 & 4294967295L)) >= f16) {
                        int iD = (int) (gVar5.d() & 4294967295L);
                        long jA = gVar5.a();
                        f14 = f17;
                        f15 = f16;
                        if (iD + ((int) (jA & 4294967295L)) <= f14) {
                            arrayList.add(obj3);
                        }
                    } else {
                        f14 = f17;
                        f15 = f16;
                    }
                    f16 = f15;
                    f17 = f14;
                }
            } else if (i19 == 2) {
                ArrayList arrayListE2 = f0VarC.e();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : arrayListE2) {
                    g gVar6 = (g) obj4;
                    long jD3 = gVar6.d();
                    g6.k.a aVar6 = g6.k.f76003b;
                    if (((int) (jD3 >> 32)) >= f16) {
                        dVar2 = dVarB;
                        if (((int) (gVar6.d() >> 32)) + ((int) (gVar6.a() >> 32)) <= f17) {
                            arrayList2.add(obj4);
                        }
                    } else {
                        dVar2 = dVarB;
                    }
                    dVarB = dVar2;
                }
                dVar = dVarB;
                arrayList = arrayList2;
            } else {
                dVar = dVarB;
                u0.r();
                arrayList = null;
            }
            if (arrayList.isEmpty()) {
                arrayList = iVar.c().e();
            }
            ArrayList arrayList3 = arrayList;
            int i24 = j0.b.a.f96081a[bVar6.ordinal()];
            if (i24 == 1) {
                bVar3 = j0.b.FORWARD;
            } else {
                if (i24 != 2) {
                    u0.r();
                    return null;
                }
                bVar3 = j0.b.BACKWARD;
            }
            g gVarC = c(sVar, dVar, arrayList3, bVar3, null, 8);
            if (gVarC == null) {
                int i25 = iArr[bVar6.ordinal()];
                if (i25 == 1) {
                    ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                        gVar2 = (g) objPrevious;
                        gVar2.getClass();
                    } while (!hashSet.contains(gVar2.getKey()));
                    gVar = (g) objPrevious;
                } else {
                    if (i25 != 2) {
                        u0.r();
                        return null;
                    }
                    Iterator<T> it = arrayList3.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        gVar3 = (g) next;
                        gVar3.getClass();
                    } while (!hashSet.contains(gVar3.getKey()));
                    gVar = (g) next;
                }
                gVarC = gVar;
            }
            if (gVarC == null) {
                bVar4.e(null);
                return Unit.INSTANCE;
            }
            int i26 = b.f96149c[bVar6.ordinal()];
            if (i26 == 1) {
                r14 = 0;
                obj = null;
            } else {
                if (i26 != 2) {
                    u0.r();
                    return null;
                }
                if (gVarC.getIndex() >= gVarD.getIndex()) {
                    obj = null;
                    bVar4.e(obj);
                    return Unit.INSTANCE;
                }
                r14 = 0;
                o53.c2 c2VarT = ge1.b.T(sVar.f96127b, r14, r14, new u(sVar, gVarD, gVarC, r14), 3);
                bVar4.e(r14);
                tVar2.f96150a = r14;
                tVar2.f96153d = 2;
            }
        } else if (i16 != 2) {
            u0.r();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0104  */
    /* JADX WARN: Code duplicated, block: B:50:0x0106  */
    /* JADX WARN: Code duplicated, block: B:53:0x0111 A[Catch: all -> 0x0159, TryCatch #1 {all -> 0x0159, blocks: (B:61:0x0185, B:51:0x0107, B:53:0x0111, B:57:0x0165, B:56:0x015c, B:47:0x00d4), top: B:70:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x015c A[Catch: all -> 0x0159, TryCatch #1 {all -> 0x0159, blocks: (B:61:0x0185, B:51:0x0107, B:53:0x0111, B:57:0x0165, B:56:0x015c, B:47:0x00d4), top: B:70:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0184  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final Object b(s sVar, g gVar, g gVar2, v13.c cVar) throws Throwable {
        v vVar;
        g gVar3;
        g gVar4;
        z53.a aVar;
        int i14;
        g gVar5;
        e23.r<o53.b0, T, T, t13.d<? super Unit>, Object> f182175a;
        o53.b0 b0Var;
        e2.n f96061a;
        e2.n f96061a2;
        g gVar6;
        g6.k kVarA;
        w wVar;
        T t7;
        Object obj;
        Throwable th3;
        i<T> iVar = sVar.f96126a;
        c2 c2Var = sVar.f96141p;
        c2 c2Var2 = sVar.f96140o;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i15 = vVar.f96165h;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                vVar.f96165h = i15 - Integer.MIN_VALUE;
            } else {
                vVar = new v(sVar, cVar);
            }
        } else {
            vVar = new v(sVar, cVar);
        }
        Object obj2 = vVar.f96163f;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = vVar.f96165h;
        int i17 = 0;
        try {
            if (i16 != 0) {
                if (i16 == 1) {
                    g gVar7 = vVar.f96159b;
                    g gVar8 = vVar.f96158a;
                    o13.r.b(obj2);
                    gVar4 = gVar7;
                    gVar3 = gVar8;
                } else {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            i17 = vVar.f96162e;
                            int i18 = vVar.f96161d;
                            z53.a aVar3 = vVar.f96160c;
                            gVar6 = vVar.f96159b;
                            gVar5 = vVar.f96158a;
                            try {
                                o13.r.b(obj2);
                                i14 = i18;
                                aVar = aVar3;
                                if (gVar6.getIndex() > gVar5.getIndex()) {
                                    long jD = gVar6.d();
                                    long jA = gVar6.a();
                                    g6.k.a aVar4 = g6.k.f76003b;
                                    long j8 = (((long) (((int) (jD & 4294967295L)) + ((int) (jA & 4294967295L)))) & 4294967295L) | (((long) (((int) (jD >> 32)) + ((int) (jA >> 32)))) << 32);
                                    long jA2 = gVar5.a();
                                    kVarA = g6.k.a((((long) (((int) (j8 >> 32)) - ((int) (jA2 >> 32)))) << 32) | (((long) (((int) (j8 & 4294967295L)) - ((int) (jA2 & 4294967295L)))) & 4294967295L));
                                } else {
                                    kVarA = g6.k.a(gVar6.d());
                                }
                                c2Var.setValue(kVarA);
                                wVar = new w(sVar, null);
                                vVar.f96158a = null;
                                vVar.f96159b = null;
                                vVar.f96160c = aVar;
                                vVar.f96161d = i14;
                                vVar.f96162e = i17;
                                vVar.f96165h = 4;
                                if (j2.b(1000L, wVar, vVar) != aVar2) {
                                    t7 = null;
                                }
                                return aVar2;
                            } catch (Throwable th4) {
                                th3 = th4;
                                aVar = aVar3;
                            }
                        } else {
                            if (i16 != 4) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            aVar = vVar.f96160c;
                            try {
                                o13.r.b(obj2);
                                t7 = null;
                            } catch (Throwable th5) {
                                th3 = th5;
                            }
                        }
                        obj = null;
                        aVar.e(obj);
                        throw th3;
                    }
                    int i19 = vVar.f96161d;
                    z53.a aVar5 = vVar.f96160c;
                    g gVar9 = vVar.f96159b;
                    g gVar10 = vVar.f96158a;
                    o13.r.b(obj2);
                    i14 = i19;
                    aVar = aVar5;
                    gVar4 = gVar9;
                    gVar5 = gVar10;
                    try {
                        c2Var2.setValue(new Integer(gVar5.getIndex()));
                        f182175a = sVar.f96128c.getF182175a();
                        b0Var = sVar.f96127b;
                        f96061a = gVar5.getF96061a();
                        f96061a2 = gVar4.getF96061a();
                        vVar.f96158a = gVar5;
                        vVar.f96159b = gVar4;
                        vVar.f96160c = aVar;
                        vVar.f96161d = i14;
                        vVar.f96162e = 0;
                        vVar.f96165h = 3;
                        if (f182175a.invoke(b0Var, f96061a, f96061a2, vVar) == aVar2) {
                            gVar6 = gVar4;
                            if (gVar6.getIndex() > gVar5.getIndex()) {
                                long jD2 = gVar6.d();
                                long jA3 = gVar6.a();
                                g6.k.a aVar6 = g6.k.f76003b;
                                long j14 = (((long) (((int) (jD2 & 4294967295L)) + ((int) (jA3 & 4294967295L)))) & 4294967295L) | (((long) (((int) (jD2 >> 32)) + ((int) (jA3 >> 32)))) << 32);
                                long jA4 = gVar5.a();
                                kVarA = g6.k.a((((long) (((int) (j14 >> 32)) - ((int) (jA4 >> 32)))) << 32) | (((long) (((int) (j14 & 4294967295L)) - ((int) (jA4 & 4294967295L)))) & 4294967295L));
                            } else {
                                kVarA = g6.k.a(gVar6.d());
                            }
                            c2Var.setValue(kVarA);
                            wVar = new w(sVar, null);
                            vVar.f96158a = null;
                            vVar.f96159b = null;
                            vVar.f96160c = aVar;
                            vVar.f96161d = i14;
                            vVar.f96162e = i17;
                            vVar.f96165h = 4;
                            if (j2.b(1000L, wVar, vVar) != aVar2) {
                                t7 = null;
                            }
                        }
                        return aVar2;
                    } catch (Throwable th6) {
                        th3 = th6;
                        obj = null;
                    }
                }
                c2Var2.setValue(t7);
                c2Var.setValue(t7);
                Unit unit = Unit.INSTANCE;
                aVar.e(t7);
                return Unit.INSTANCE;
            }
            o13.r.b(obj2);
            if (gVar.getIndex() == gVar2.getIndex()) {
                return Unit.INSTANCE;
            }
            if (gVar.getIndex() == iVar.b() || gVar2.getIndex() == iVar.b()) {
                int iB = iVar.b();
                int iA = iVar.a();
                gVar3 = gVar;
                vVar.f96158a = gVar3;
                gVar4 = gVar2;
                vVar.f96159b = gVar4;
                vVar.f96165h = 1;
                if (iVar.d(iB, iA) != aVar2) {
                }
                return aVar2;
            }
            gVar3 = gVar;
            gVar4 = gVar2;
            z53.b bVar = sVar.f96135j;
            vVar.f96158a = gVar3;
            vVar.f96159b = gVar4;
            vVar.f96160c = bVar;
            vVar.f96161d = 0;
            vVar.f96165h = 2;
            if (bVar.c(vVar) != aVar2) {
                aVar = bVar;
                i14 = 0;
                gVar5 = gVar3;
                c2Var2.setValue(new Integer(gVar5.getIndex()));
                f182175a = sVar.f96128c.getF182175a();
                b0Var = sVar.f96127b;
                f96061a = gVar5.getF96061a();
                f96061a2 = gVar4.getF96061a();
                vVar.f96158a = gVar5;
                vVar.f96159b = gVar4;
                vVar.f96160c = aVar;
                vVar.f96161d = i14;
                vVar.f96162e = 0;
                vVar.f96165h = 3;
                if (f182175a.invoke(b0Var, f96061a, f96061a2, vVar) == aVar2) {
                    gVar6 = gVar4;
                    if (gVar6.getIndex() > gVar5.getIndex()) {
                        long jD3 = gVar6.d();
                        long jA5 = gVar6.a();
                        g6.k.a aVar7 = g6.k.f76003b;
                        long j15 = (((long) (((int) (jD3 & 4294967295L)) + ((int) (jA5 & 4294967295L)))) & 4294967295L) | (((long) (((int) (jD3 >> 32)) + ((int) (jA5 >> 32)))) << 32);
                        long jA6 = gVar5.a();
                        kVarA = g6.k.a((((long) (((int) (j15 >> 32)) - ((int) (jA6 >> 32)))) << 32) | (((long) (((int) (j15 & 4294967295L)) - ((int) (jA6 & 4294967295L)))) & 4294967295L));
                    } else {
                        kVarA = g6.k.a(gVar6.d());
                    }
                    c2Var.setValue(kVarA);
                    wVar = new w(sVar, null);
                    vVar.f96158a = null;
                    vVar.f96159b = null;
                    vVar.f96160c = aVar;
                    vVar.f96161d = i14;
                    vVar.f96162e = i17;
                    vVar.f96165h = 4;
                    if (j2.b(1000L, wVar, vVar) != aVar2) {
                        t7 = null;
                        c2Var2.setValue(t7);
                        c2Var.setValue(t7);
                        Unit unit2 = Unit.INSTANCE;
                        aVar.e(t7);
                        return Unit.INSTANCE;
                    }
                }
            }
            return aVar2;
        } catch (CancellationException unused) {
        }
    }

    public static g c(s sVar, n4.d dVar, List list, j0.b bVar, iz1.f fVar, int i14) {
        if ((i14 & 4) != 0) {
            bVar = j0.b.FORWARD;
        }
        Object rVar = fVar;
        if ((i14 & 8) != 0) {
            rVar = new r(0);
        }
        sVar.getClass();
        gw1.d dVar2 = new gw1.d(sVar, 23, dVar, rVar);
        int i15 = b.f96149c[bVar.ordinal()];
        Object obj = null;
        if (i15 == 1) {
            for (T t7 : list) {
                if (((Boolean) dVar2.invoke(t7)).booleanValue()) {
                    obj = t7;
                    break;
                }
            }
            return (g) obj;
        }
        if (i15 != 2) {
            u0.r();
            return null;
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            if (((Boolean) dVar2.invoke(objPrevious)).booleanValue()) {
                obj = objPrevious;
                break;
            }
        }
        return (g) obj;
    }

    public final g<T> d() {
        T f182175a = this.f96136k.getF182175a();
        Object obj = null;
        if (f182175a == null) {
            return null;
        }
        for (Object obj2 : this.f96126a.c().e()) {
            if (p005kotlin.jvm.internal.s.g(((g) obj2).getKey(), f182175a)) {
                obj = obj2;
                break;
            }
        }
        return (g) obj;
    }

    public final long e() {
        long jD;
        g<T> gVarD = d();
        if (gVarD == null) {
            n4.c.f123541b.getClass();
            return 0L;
        }
        int index = gVarD.getIndex();
        c2 c2Var = this.f96140o;
        Integer num = (Integer) c2Var.getF182175a();
        c2 c2Var2 = this.f96141p;
        if (num == null || index != num.intValue() || ((Integer) c2Var.getF182175a()) == null) {
            c2Var.setValue(null);
            c2Var2.setValue(null);
            jD = gVarD.d();
        } else {
            g6.k kVar = (g6.k) c2Var2.getF182175a();
            jD = kVar != null ? kVar.f76005a : gVarD.d();
        }
        long j8 = ((n4.c) this.f96138m.getF182175a()).f123544a;
        long j14 = ((g6.k) this.f96139n.getF182175a()).f76005a;
        return n4.c.j(j8, i(h(n4.c.i((((long) Float.floatToRawIntBits((int) (j14 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j14 >> 32))) << 32), (((long) Float.floatToRawIntBits((int) (jD & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jD >> 32))) << 32)))));
    }

    public final b2 f() {
        return this.f96126a.c().f96068a.getOrientation();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(Object obj, long j8, v13.c cVar) {
        a0 a0Var;
        Object next;
        g gVar;
        long j14;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i14 = a0Var.f96024g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a0Var.f96024g = i14 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(this, cVar);
            }
        } else {
            a0Var = new a0(this, cVar);
        }
        Object obj2 = a0Var.f96022e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a0Var.f96024g;
        if (i15 == 0) {
            o13.r.b(obj2);
            i<T> iVar = this.f96126a;
            Iterator it = iVar.c().e().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((g) next).getKey(), obj));
            gVar = (g) next;
            if (gVar != null) {
                long jD = gVar.d();
                b2 b2VarF = f();
                b2VarF.getClass();
                int i16 = p.a.f96121a[b2VarF.ordinal()];
                if (i16 == 1) {
                    g6.k.a aVar2 = g6.k.f76003b;
                    j14 = jD & 4294967295L;
                } else {
                    if (i16 != 2) {
                        u0.r();
                        return null;
                    }
                    g6.k.a aVar3 = g6.k.f76003b;
                    j14 = jD >> 32;
                }
                int i17 = (int) j14;
                if (i17 < 0) {
                    j1 j1VarC = s1.l.c(7, 0.0f, 0.0f, null);
                    a0Var.f96018a = obj;
                    a0Var.f96019b = gVar;
                    a0Var.f96020c = gVar;
                    a0Var.f96021d = j8;
                    a0Var.f96024g = 1;
                    if (iVar.e(i17, j1VarC, a0Var) == aVar) {
                        return aVar;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j8 = a0Var.f96021d;
        g gVar2 = a0Var.f96020c;
        Object obj3 = a0Var.f96018a;
        o13.r.b(obj2);
        gVar = gVar2;
        obj = obj3;
        this.f96136k.setValue(obj);
        this.f96139n.setValue(g6.k.a(gVar.d()));
        this.f96142q = j8;
        return Unit.INSTANCE;
    }

    public final long h(long j8) {
        boolean zI = this.f96126a.c().f96068a.i();
        if (zI) {
            j8 = p.e(f(), j8);
        } else if (zI) {
            u0.r();
            return 0L;
        }
        int i14 = b.f96147a[f().ordinal()];
        if (i14 == 1) {
            return j8;
        }
        if (i14 != 2) {
            u0.r();
            return 0L;
        }
        int i15 = b.f96148b[this.f96132g.ordinal()];
        if (i15 == 1) {
            return j8;
        }
        if (i15 == 2) {
            return p.e(b2.Horizontal, j8);
        }
        u0.r();
        return 0L;
    }

    public final long i(long j8) {
        int i14 = b.f96148b[this.f96132g.ordinal()];
        if (i14 == 1) {
            return j8;
        }
        if (i14 == 2) {
            return (this.f96133h && f() == b2.Vertical) ? p.e(b2.Horizontal, j8) : j8;
        }
        u0.r();
        return 0L;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj02/s$a;", "", "<init>", "()V", "", "MOVE_ITEMS_LAYOUT_INFO_UPDATE_MAX_WAIT_DURATION", "J", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ s(i iVar, o53.b0 b0Var, x3 x3Var, float f14, j02.a aVar, j0 j0Var, g6.o oVar, boolean z14, e23.p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(iVar, b0Var, x3Var, f14, aVar, j0Var, oVar, (i14 & 128) != 0 ? false : z14, (i14 & 256) != 0 ? new in2.e((byte) 0, 6) : pVar);
    }
}
