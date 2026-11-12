package w02;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e2.i0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.b2;
import p008y1.m2;
import p13.h0;
import p3.a2;
import p3.c2;
import p3.p0;
import p3.x3;
import s1.j1;
import tn2.s0;
import vn2.b1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00124\u0010\u000b\u001a0\u0012,\u0012*\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00070\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lw02/r;", "", "Le2/i0;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Lp3/x3;", "Lkotlin/Function4;", "Le2/n;", "Lt13/d;", "", "onMoveState", "", "scrollThreshold", "<init>", "(Le2/i0;Lo53/b0;Lp3/x3;F)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f181122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.b0 f181123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x3<e23.r<o53.b0, e2.n, e2.n, t13.d<? super Boolean>, Object>> f181124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f181125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z53.b f181126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c2 f181127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p3.d0 f181128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a2 f181129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a2 f181130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c2 f181131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c2 f181132k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashSet<Object> f181133l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c0 f181134m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r53.c2 f181135n;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f181137b;

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
            f181136a = iArr;
            int[] iArr2 = new int[c0.b.values().length];
            try {
                iArr2[c0.b.FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[c0.b.BACKWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f181137b = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(i0 i0Var, o53.b0 b0Var, x3<? extends e23.r<? super o53.b0, ? super e2.n, ? super e2.n, ? super t13.d<? super Boolean>, ? extends Object>> x3Var, float f14) {
        i0Var.getClass();
        b0Var.getClass();
        x3Var.getClass();
        this.f181122a = i0Var;
        this.f181123b = b0Var;
        this.f181124c = x3Var;
        this.f181125d = f14;
        this.f181126e = z53.c.a();
        this.f181127f = p0.n(null);
        this.f181128g = p0.f(new k(this, 1));
        this.f181129h = new a2(0);
        this.f181130i = new a2(0);
        this.f181131j = p0.n(null);
        this.f181132k = p0.n(null);
        this.f181133l = new HashSet<>();
        this.f181134m = new c0(i0Var, b0Var, new k(this, 2));
        this.f181135n = p0.s(new k(this, 3));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0201, code lost:
    
        if (r1.getF68148a() < r13.getF68148a()) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0213, code lost:
    
        if (r1.getF68148a() > r13.getF68148a()) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0215, code lost:
    
        r0 = ge1.b.T(r19.f181123b, null, null, new w02.t(r19, r13, r1, null), 3);
        r7.e(null);
        r8.f181138a = null;
        r8.f181141d = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x022e, code lost:
    
        if (r0.P(r8) != r9) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0234, code lost:
    
        r7.e(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0239, code lost:
    
        return p005kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (r13.getF68148a() == r2.h()) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (r13.getF68148a() == r1.getF68148a()) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        r7.e(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        return p005kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(r rVar, c0.b bVar, v13.c cVar) {
        s sVar;
        c0.b bVar2;
        int i14;
        n4.d dVarB;
        c0.b bVar3;
        Object objPrevious;
        e2.n nVar;
        e2.n nVar2;
        Object next;
        e2.n nVar3;
        HashSet<Object> hashSet = rVar.f181133l;
        i0 i0Var = rVar.f181122a;
        z53.b bVar4 = rVar.f181126e;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i15 = sVar.f181141d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                sVar.f181141d = i15 - Integer.MIN_VALUE;
            } else {
                sVar = new s(rVar, cVar);
            }
        } else {
            sVar = new s(rVar, cVar);
        }
        s sVar2 = sVar;
        Object obj = sVar2.f181139b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = sVar2.f181141d;
        if (i16 == 0) {
            o13.r.b(obj);
            sVar2.f181138a = bVar;
            sVar2.f181141d = 1;
            if (bVar4.c(sVar2) != aVar) {
                bVar2 = bVar;
            }
            return aVar;
        }
        if (i16 == 1) {
            c0.b bVar5 = sVar2.f181138a;
            o13.r.b(obj);
            bVar2 = bVar5;
        } else {
            if (i16 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        e2.n nVarD = rVar.d();
        if (nVarD == null) {
            bVar4.e(null);
            return Unit.INSTANCE;
        }
        int[] iArr = a.f181137b;
        int i17 = iArr[bVar2.ordinal()];
        if (i17 == 1) {
            e2.n nVar4 = (e2.n) h0.n0(i0Var.j().e());
            if (nVar4 != null) {
            }
            int offset = nVarD.getOffset() + rVar.e();
            int size = nVarD.getSize() + offset;
            b2 b2VarG = rVar.g();
            b2 b2Var = b2.Vertical;
            n4.d dVar = b2VarG == b2Var ? new n4.d(0.0f, offset, (int) (i0Var.j().a() >> 32), size) : new n4.d(offset, 0.0f, size, (int) (i0Var.j().a() & 4294967295L));
            b2 b2VarG2 = rVar.g();
            int[] iArr2 = a.f181136a;
            int i18 = iArr2[b2VarG2.ordinal()];
            if (i18 != 1) {
                i14 = 2;
                if (i18 != 2) {
                    u0.r();
                    return null;
                }
            } else {
                i14 = 2;
                b2Var = b2.Horizontal;
            }
            int i19 = iArr2[b2Var.ordinal()];
            if (i19 == 1) {
                dVarB = n4.d.b(dVar, 0.0f, 0.0f, Float.POSITIVE_INFINITY, 5);
            } else {
                if (i19 != i14) {
                    u0.r();
                    return null;
                }
                dVarB = n4.d.b(dVar, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 0.0f, 10);
            }
            e2.v vVarJ = i0Var.j();
            List<e2.n> listE = vVarJ.e();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listE) {
                e2.n nVar5 = (e2.n) obj2;
                if (nVar5.getOffset() >= 0) {
                    if (nVar5.getSize() + nVar5.getOffset() <= f(vVarJ)) {
                        arrayList.add(obj2);
                    }
                }
            }
            boolean zIsEmpty = arrayList.isEmpty();
            List listE2 = arrayList;
            if (zIsEmpty) {
                listE2 = i0Var.j().e();
            }
            List list = listE2;
            int i24 = c0.b.a.f181072a[bVar2.ordinal()];
            if (i24 == 1) {
                bVar3 = c0.b.FORWARD;
            } else {
                if (i24 != 2) {
                    u0.r();
                    return null;
                }
                bVar3 = c0.b.BACKWARD;
            }
            e2.n nVarC = c(rVar, dVarB, list, bVar3, null, 8);
            if (nVarC == null) {
                int i25 = iArr[bVar2.ordinal()];
                if (i25 == 1) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                        nVar2 = (e2.n) objPrevious;
                        nVar2.getClass();
                    } while (!hashSet.contains(nVar2.getF68149b()));
                    nVar = (e2.n) objPrevious;
                } else {
                    if (i25 != 2) {
                        u0.r();
                        return null;
                    }
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        nVar3 = (e2.n) next;
                        nVar3.getClass();
                    } while (!hashSet.contains(nVar3.getF68149b()));
                    nVar = (e2.n) next;
                }
                nVarC = nVar;
            }
            if (nVarC == null) {
                bVar4.e(null);
                return Unit.INSTANCE;
            }
            int i26 = a.f181137b[bVar2.ordinal()];
            if (i26 != 1) {
                if (i26 != 2) {
                    u0.r();
                    return null;
                }
            }
        } else if (i17 != 2) {
            u0.r();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00f5 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #3 {all -> 0x003c, blocks: (B:14:0x0037, B:64:0x014b, B:52:0x00ed, B:54:0x00f5, B:57:0x00fb, B:59:0x0111, B:61:0x012e, B:60:0x0125), top: B:71:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fb A[Catch: all -> 0x003c, TRY_ENTER, TryCatch #3 {all -> 0x003c, blocks: (B:14:0x0037, B:64:0x014b, B:52:0x00ed, B:54:0x00f5, B:57:0x00fb, B:59:0x0111, B:61:0x012e, B:60:0x0125), top: B:71:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0111 A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:14:0x0037, B:64:0x014b, B:52:0x00ed, B:54:0x00f5, B:57:0x00fb, B:59:0x0111, B:61:0x012e, B:60:0x0125), top: B:71:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0125 A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:14:0x0037, B:64:0x014b, B:52:0x00ed, B:54:0x00f5, B:57:0x00fb, B:59:0x0111, B:61:0x012e, B:60:0x0125), top: B:71:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0148, code lost:
    
        if (o53.j2.b(1000, r1, r5) == r6) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [e2.i0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
    public static final Object b(r rVar, e2.n nVar, e2.n nVar2, v13.c cVar) throws Throwable {
        u uVar;
        z53.a aVar;
        e2.n nVar3;
        e2.n nVar4;
        int i14;
        z53.a aVar2;
        e2.n nVar5;
        e2.n nVar6;
        Integer num;
        ?? r14 = rVar.f181122a;
        c2 c2Var = rVar.f181132k;
        c2 c2Var2 = rVar.f181131j;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i15 = uVar.f181153h;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                uVar.f181153h = i15 - Integer.MIN_VALUE;
            } else {
                uVar = new u(rVar, cVar);
            }
        } else {
            uVar = new u(rVar, cVar);
        }
        Object obj = uVar.f181151f;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = uVar.f181153h;
        int i17 = 0;
        try {
            try {
                try {
                    if (i16 == 0) {
                        o13.r.b(obj);
                        if (nVar.getF68148a() == nVar2.getF68148a()) {
                            return Unit.INSTANCE;
                        }
                        aVar = rVar.f181126e;
                        uVar.f181146a = nVar;
                        nVar3 = nVar2;
                        uVar.f181147b = nVar3;
                        uVar.f181148c = aVar;
                        uVar.f181149d = 0;
                        uVar.f181153h = 1;
                        if (aVar.c(uVar) != aVar3) {
                            nVar4 = nVar;
                            i14 = 0;
                        }
                        return aVar3;
                    }
                    if (i16 != 1) {
                        if (i16 == 2) {
                            i17 = uVar.f181150e;
                            int i18 = uVar.f181149d;
                            z53.a aVar4 = uVar.f181148c;
                            nVar5 = uVar.f181147b;
                            nVar6 = uVar.f181146a;
                            try {
                                o13.r.b(obj);
                                i14 = i18;
                                aVar2 = aVar4;
                                if (!((Boolean) obj).booleanValue()) {
                                    Unit unit = Unit.INSTANCE;
                                    aVar2.e(null);
                                    return unit;
                                }
                                c2Var2.setValue(new Integer(nVar6.getF68148a()));
                                if (nVar5.getF68148a() > nVar6.getF68148a()) {
                                    num = new Integer((nVar5.getOffset() + nVar5.getSize()) - nVar6.getSize());
                                } else {
                                    num = new Integer(nVar5.getOffset());
                                }
                                c2Var.setValue(num);
                                v vVar = new v(rVar, null);
                                uVar.f181146a = null;
                                uVar.f181147b = null;
                                uVar.f181148c = aVar2;
                                uVar.f181149d = i14;
                                uVar.f181150e = i17;
                                uVar.f181153h = 3;
                            } catch (Throwable th3) {
                                th = th3;
                                r14 = aVar4;
                                r14.e(null);
                                throw th;
                            }
                        } else {
                            if (i16 != 3) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            aVar2 = uVar.f181148c;
                            o13.r.b(obj);
                        }
                        c2Var2.setValue(null);
                        c2Var.setValue(null);
                        Unit unit2 = Unit.INSTANCE;
                        aVar2.e(null);
                        return Unit.INSTANCE;
                    }
                    i14 = uVar.f181149d;
                    z53.a aVar5 = uVar.f181148c;
                    nVar3 = uVar.f181147b;
                    nVar4 = uVar.f181146a;
                    o13.r.b(obj);
                    aVar = aVar5;
                    if (!((Boolean) rVar.f181128g.getF182175a()).booleanValue()) {
                        Unit unit3 = Unit.INSTANCE;
                        aVar.e(null);
                        return unit3;
                    }
                    if (nVar4.getF68148a() == r14.h() || nVar3.getF68148a() == r14.h()) {
                        r14.k(r14.h(), r14.i());
                    }
                    e23.r<o53.b0, e2.n, e2.n, t13.d<? super Boolean>, Object> f182175a = rVar.f181124c.getF182175a();
                    o53.b0 b0Var = rVar.f181123b;
                    uVar.f181146a = nVar4;
                    uVar.f181147b = nVar3;
                    uVar.f181148c = aVar;
                    uVar.f181149d = i14;
                    uVar.f181150e = 0;
                    uVar.f181153h = 2;
                    Object objInvoke = f182175a.invoke(b0Var, nVar4, nVar3, uVar);
                    if (objInvoke != aVar3) {
                        aVar2 = aVar;
                        obj = objInvoke;
                        nVar5 = nVar3;
                        nVar6 = nVar4;
                        if (!((Boolean) obj).booleanValue()) {
                            Unit unit4 = Unit.INSTANCE;
                            aVar2.e(null);
                            return unit4;
                        }
                        c2Var2.setValue(new Integer(nVar6.getF68148a()));
                        if (nVar5.getF68148a() > nVar6.getF68148a()) {
                            num = new Integer((nVar5.getOffset() + nVar5.getSize()) - nVar6.getSize());
                        } else {
                            num = new Integer(nVar5.getOffset());
                        }
                        c2Var.setValue(num);
                        v vVar2 = new v(rVar, null);
                        uVar.f181146a = null;
                        uVar.f181147b = null;
                        uVar.f181148c = aVar2;
                        uVar.f181149d = i14;
                        uVar.f181150e = i17;
                        uVar.f181153h = 3;
                    }
                    return aVar3;
                } catch (Throwable th4) {
                    th = th4;
                    r14 = aVar;
                    r14.e(null);
                    throw th;
                }
            } catch (CancellationException unused) {
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public static e2.n c(r rVar, n4.d dVar, List list, c0.b bVar, vu1.b bVar2, int i14) {
        if ((i14 & 4) != 0) {
            bVar = c0.b.FORWARD;
        }
        Object b1Var = bVar2;
        if ((i14 & 8) != 0) {
            b1Var = new b1(27);
        }
        rVar.getClass();
        s0 s0Var = new s0(rVar, 21, dVar, b1Var);
        int i15 = a.f181137b[bVar.ordinal()];
        Object obj = null;
        if (i15 == 1) {
            for (Object obj2 : list) {
                if (((Boolean) s0Var.invoke(obj2)).booleanValue()) {
                    obj = obj2;
                    break;
                }
            }
            return (e2.n) obj;
        }
        if (i15 != 2) {
            u0.r();
            return null;
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            if (((Boolean) s0Var.invoke(objPrevious)).booleanValue()) {
                obj = objPrevious;
                break;
            }
        }
        return (e2.n) obj;
    }

    public static int f(e2.v vVar) {
        int i14 = a.f181136a[vVar.getOrientation().ordinal()];
        if (i14 == 1) {
            return (int) (vVar.a() & 4294967295L);
        }
        if (i14 == 2) {
            return (int) (vVar.a() >> 32);
        }
        u0.r();
        return 0;
    }

    public final e2.n d() {
        T f182175a = this.f181127f.getF182175a();
        Object obj = null;
        if (f182175a == 0) {
            return null;
        }
        for (Object obj2 : this.f181122a.j().e()) {
            if (p005kotlin.jvm.internal.s.g(((e2.n) obj2).getF68149b(), f182175a)) {
                obj = obj2;
                break;
            }
        }
        return (e2.n) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int e() {
        int offset;
        e2.n nVarD = d();
        if (nVarD == null) {
            return 0;
        }
        int f68148a = nVarD.getF68148a();
        c2 c2Var = this.f181131j;
        Integer num = (Integer) c2Var.getF182175a();
        c2 c2Var2 = this.f181132k;
        if (num == null || f68148a != num.intValue() || ((Integer) c2Var.getF182175a()) == null) {
            c2Var.setValue(null);
            c2Var2.setValue(null);
            offset = nVarD.getOffset();
        } else {
            Integer num2 = (Integer) c2Var2.getF182175a();
            offset = num2 != null ? num2.intValue() : nVarD.getOffset();
        }
        return (this.f181130i.getIntValue() + this.f181129h.getIntValue()) - offset;
    }

    public final b2 g() {
        return this.f181122a.j().getOrientation();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(Object obj, v13.c cVar) {
        z zVar;
        Object next;
        e2.n nVar;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i14 = zVar.f181169f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zVar.f181169f = i14 - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, cVar);
            }
        } else {
            zVar = new z(this, cVar);
        }
        Object obj2 = zVar.f181167d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = zVar.f181169f;
        if (i15 == 0) {
            o13.r.b(obj2);
            i0 i0Var = this.f181122a;
            Iterator<T> it = i0Var.j().e().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((e2.n) next).getF68149b(), obj));
            nVar = (e2.n) next;
            if (nVar != null) {
                int offset = nVar.getOffset();
                if (offset < 0) {
                    j1 j1VarC = s1.l.c(7, 0.0f, 0.0f, null);
                    zVar.f181164a = obj;
                    zVar.f181165b = nVar;
                    zVar.f181166c = nVar;
                    zVar.f181169f = 1;
                    if (m2.a(i0Var, offset, j1VarC, zVar) == aVar) {
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
        e2.n nVar2 = zVar.f181166c;
        Object obj3 = zVar.f181164a;
        o13.r.b(obj2);
        nVar = nVar2;
        obj = obj3;
        this.f181127f.setValue(obj);
        this.f181130i.t(nVar.getOffset());
        return Unit.INSTANCE;
    }

    public final void i() {
        e2.n nVarD = d();
        Integer numValueOf = nVarD != null ? Integer.valueOf(nVarD.getOffset()) : null;
        this.f181129h.t(0);
        this.f181127f.setValue(null);
        this.f181130i.t(numValueOf != null ? numValueOf.intValue() : 0);
        c0 c0Var = this.f181134m;
        ge1.b.T(c0Var.f181065b, null, null, new f0(c0Var, null), 3);
        this.f181131j.setValue(null);
        this.f181132k.setValue(null);
    }
}
