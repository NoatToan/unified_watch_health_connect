package ou1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import r53.z1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.GetActiveOrPausedTrainingPlansUseCase$fetchActiveTrainingPlans$2", f = "GetActiveOrPausedTrainingPlansUseCase.kt", l = {28, 34, 40, 53, 63, 69, 79}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f134011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xw1.d f134012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0 f134013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f134014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f134015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f134016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f134017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z1<g3<ww1.g>> f134018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a f134019i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(z1<g3<ww1.g>> z1Var, a aVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f134018h = z1Var;
        this.f134019i = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f134018h, this.f134019i, dVar);
        cVar.f134017g = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x025d  */
    /* JADX WARN: Code duplicated, block: B:105:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00d3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x009f A[PHI: r3 r9
      0x009f: PHI (r3v5 kotlin.jvm.internal.r0) = (r3v4 kotlin.jvm.internal.r0), (r3v7 kotlin.jvm.internal.r0) binds: [B:17:0x009b, B:11:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r9v2 java.lang.Object) = (r9v1 java.lang.Object), (r9v19 java.lang.Object) binds: [B:17:0x009b, B:11:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00da  */
    /* JADX WARN: Code duplicated, block: B:40:0x0100  */
    /* JADX WARN: Code duplicated, block: B:42:0x0108  */
    /* JADX WARN: Code duplicated, block: B:45:0x0116  */
    /* JADX WARN: Code duplicated, block: B:47:0x0123  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:54:0x0134  */
    /* JADX WARN: Code duplicated, block: B:56:0x0138  */
    /* JADX WARN: Code duplicated, block: B:60:0x0173  */
    /* JADX WARN: Code duplicated, block: B:63:0x0179  */
    /* JADX WARN: Code duplicated, block: B:64:0x0180  */
    /* JADX WARN: Code duplicated, block: B:66:0x0184  */
    /* JADX WARN: Code duplicated, block: B:68:0x0188  */
    /* JADX WARN: Code duplicated, block: B:72:0x01be  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:84:0x0208  */
    /* JADX WARN: Code duplicated, block: B:86:0x020c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0226  */
    /* JADX WARN: Code duplicated, block: B:91:0x022a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232 A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016c, code lost:
    
        if (r7.emit(r9, r19) == r2) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b8, code lost:
    
        if (r7.emit(r9, r19) == r2) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0257, code lost:
    
        if (r7.emit(r1, r19) == r2) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, java.lang.Object] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object objJ;
        v2 v2Var;
        List<ww1.i> listA;
        ArrayList arrayList;
        ww1.i iVar;
        xw1.d dVar;
        ww1.i iVar2;
        Object objJ2;
        ww1.i iVar3;
        v2 v2Var2;
        v2.b bVar;
        Iterator it;
        Object next;
        xw1.d dVar2;
        Long l14;
        xw1.d dVar3;
        long jLongValue;
        Object objC;
        xw1.d dVar4;
        ww1.i iVar4;
        v2 v2Var3;
        o53.b0 b0Var = (o53.b0) this.f134017g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f134016f;
        a aVar2 = this.f134019i;
        boolean z14 = true;
        z1<g3<ww1.g>> z1Var = this.f134018h;
        switch (i14) {
            case 0:
                o13.r.b(obj);
                g3<ww1.g> g3VarC = g3.a.c(g3.f35298f);
                this.f134017g = b0Var;
                this.f134016f = 1;
                if (z1Var.emit(g3VarC, this) != aVar) {
                    r0Var = new r0();
                    ax1.i iVar5 = aVar2.f133990b;
                    this.f134017g = b0Var;
                    this.f134011a = r0Var;
                    this.f134016f = 2;
                    objJ = com.garmin.android.apps.connectmobile.f0.J(iVar5, new ax1.m(iVar5, null), this);
                    if (objJ != aVar) {
                        v2Var = (v2) objJ;
                        if (v2Var instanceof v2.b) {
                            if (!(v2Var instanceof v2.a)) {
                                u0.r();
                                return null;
                            }
                            v2.a aVar3 = (v2.a) v2Var;
                            String strD = com.airbnb.lottie.animation.keyframe.a.d(aVar3.f47383a, "Error getting active Training plan dto ");
                            i2.a aVar4 = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar4.getClass();
                            i2.a.f(a2Var, "GetActiveTrainingPlansUseCaseLight", strD);
                            g3<ww1.g> g3VarA = g3.a.a(g3.f35298f, null, aVar3.f47383a, null, null, 13);
                            this.f134017g = b0Var;
                            this.f134011a = r0Var;
                            this.f134012b = null;
                            this.f134016f = 5;
                        } else {
                            listA = ((ww1.f0) ((v2.b) v2Var).f47386a).a();
                            if (listA != null) {
                                arrayList = new ArrayList();
                                for (Object obj2 : listA) {
                                    iVar3 = (ww1.i) obj2;
                                    if (!iVar3.j() || iVar3.o()) {
                                        arrayList.add(obj2);
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                            if (arrayList == null && arrayList.isEmpty()) {
                                ax1.b bVar2 = aVar2.f133989a;
                                this.f134017g = b0Var;
                                this.f134011a = r0Var;
                                this.f134012b = null;
                                this.f134013c = null;
                                this.f134016f = 3;
                                objJ2 = com.garmin.android.apps.connectmobile.f0.J(bVar2, new ax1.c(bVar2, null), this);
                                if (objJ2 != aVar) {
                                    v2Var2 = (v2) objJ2;
                                    if (!(v2Var2 instanceof v2.b)) {
                                        if (v2Var2 instanceof v2.a) {
                                            u0.r();
                                            return null;
                                        }
                                        v2.a aVar5 = (v2.a) v2Var2;
                                        String strD2 = com.airbnb.lottie.animation.keyframe.a.d(aVar5.f47383a, "Error getting active atp plan dto ");
                                        i2.a aVar6 = i2.f36769a;
                                        a2 a2Var2 = a2.GENERAL;
                                        aVar6.getClass();
                                        i2.a.f(a2Var2, "GetActiveTrainingPlansUseCaseLight", strD2);
                                        g3<ww1.g> g3VarA2 = g3.a.a(g3.f35298f, null, aVar5.f47383a, null, null, 13);
                                        this.f134017g = b0Var;
                                        this.f134011a = r0Var;
                                        this.f134012b = null;
                                        this.f134013c = null;
                                        this.f134014d = null;
                                        this.f134016f = 4;
                                    } else {
                                        bVar = (v2.b) v2Var2;
                                        if (bVar.f47387b != 204) {
                                            it = ((Iterable) bVar.f47386a).iterator();
                                            do {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                    dVar2 = (xw1.d) next;
                                                    if (!dVar2.Z()) {
                                                    }
                                                } else {
                                                    next = null;
                                                }
                                                dVar = (xw1.d) next;
                                                Unit unit = Unit.INSTANCE;
                                            } while (!dVar2.e0());
                                            dVar = (xw1.d) next;
                                            Unit unit2 = Unit.INSTANCE;
                                        } else {
                                            dVar = null;
                                        }
                                        iVar2 = null;
                                        if (iVar2 != null) {
                                            l14 = new Long(iVar2.getTrainingPlanId());
                                        } else if (dVar != null) {
                                            l14 = new Long(dVar.getAthletePlanId());
                                        } else {
                                            l14 = null;
                                        }
                                        if (l14 == null) {
                                            jLongValue = l14.longValue();
                                            zf0.d dVar5 = aVar2.f133991c;
                                            this.f134017g = b0Var;
                                            this.f134011a = iVar2;
                                            this.f134012b = dVar;
                                            this.f134013c = r0Var;
                                            this.f134014d = l14;
                                            this.f134015e = jLongValue;
                                            this.f134016f = 6;
                                            objC = dVar5.c(jLongValue, this);
                                            if (objC != aVar) {
                                                dVar4 = dVar;
                                                v2Var3 = (v2) objC;
                                                if (v2Var3 instanceof v2.b) {
                                                    r0Var.f105810a = h0.d0((List) ((v2.b) v2Var3).f47386a);
                                                } else {
                                                    if (!(v2Var3 instanceof v2.a)) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    String strN = wr.g.n("Error getting event for planId ", jLongValue, ". Exception=", ((v2.a) v2Var3).f47383a);
                                                    i2.a aVar7 = i2.f36769a;
                                                    a2 a2Var3 = a2.GENERAL;
                                                    aVar7.getClass();
                                                    i2.a.f(a2Var3, "GetActiveTrainingPlansUseCaseLight", strN);
                                                }
                                                dVar3 = dVar4;
                                                iVar4 = iVar2;
                                                Long l15 = l14;
                                                g3.a aVar8 = g3.f35298f;
                                                if (iVar4 == null) {
                                                    z14 = false;
                                                }
                                                ww1.g gVar = new ww1.g(z14, l15, iVar4, dVar3, (fg0.k) r0Var.f105810a);
                                                aVar8.getClass();
                                                g3<ww1.g> g3VarD = g3.a.d(gVar);
                                                this.f134017g = null;
                                                this.f134011a = null;
                                                this.f134012b = null;
                                                this.f134013c = null;
                                                this.f134014d = null;
                                                this.f134016f = 7;
                                            }
                                        } else {
                                            dVar3 = dVar;
                                            iVar4 = iVar2;
                                            Long l16 = l14;
                                            g3.a aVar9 = g3.f35298f;
                                            if (iVar4 == null) {
                                                z14 = false;
                                            }
                                            ww1.g gVar2 = new ww1.g(z14, l16, iVar4, dVar3, (fg0.k) r0Var.f105810a);
                                            aVar9.getClass();
                                            g3<ww1.g> g3VarD2 = g3.a.d(gVar2);
                                            this.f134017g = null;
                                            this.f134011a = null;
                                            this.f134012b = null;
                                            this.f134013c = null;
                                            this.f134014d = null;
                                            this.f134016f = 7;
                                        }
                                    }
                                }
                            } else {
                                if (arrayList != null) {
                                    iVar = (ww1.i) h0.d0(arrayList);
                                } else {
                                    iVar = null;
                                }
                                dVar = null;
                                iVar2 = iVar;
                                if (iVar2 != null) {
                                    l14 = new Long(iVar2.getTrainingPlanId());
                                } else if (dVar != null) {
                                    l14 = new Long(dVar.getAthletePlanId());
                                } else {
                                    l14 = null;
                                }
                                if (l14 == null) {
                                    jLongValue = l14.longValue();
                                    zf0.d dVar6 = aVar2.f133991c;
                                    this.f134017g = b0Var;
                                    this.f134011a = iVar2;
                                    this.f134012b = dVar;
                                    this.f134013c = r0Var;
                                    this.f134014d = l14;
                                    this.f134015e = jLongValue;
                                    this.f134016f = 6;
                                    objC = dVar6.c(jLongValue, this);
                                    if (objC != aVar) {
                                        dVar4 = dVar;
                                        v2Var3 = (v2) objC;
                                        if (v2Var3 instanceof v2.b) {
                                            r0Var.f105810a = h0.d0((List) ((v2.b) v2Var3).f47386a);
                                        } else {
                                            if (!(v2Var3 instanceof v2.a)) {
                                                u0.r();
                                                return null;
                                            }
                                            String strN2 = wr.g.n("Error getting event for planId ", jLongValue, ". Exception=", ((v2.a) v2Var3).f47383a);
                                            i2.a aVar10 = i2.f36769a;
                                            a2 a2Var4 = a2.GENERAL;
                                            aVar10.getClass();
                                            i2.a.f(a2Var4, "GetActiveTrainingPlansUseCaseLight", strN2);
                                        }
                                        dVar3 = dVar4;
                                        iVar4 = iVar2;
                                        Long l17 = l14;
                                        g3.a aVar11 = g3.f35298f;
                                        if (iVar4 == null && dVar3 == null) {
                                            z14 = false;
                                        }
                                        ww1.g gVar3 = new ww1.g(z14, l17, iVar4, dVar3, (fg0.k) r0Var.f105810a);
                                        aVar11.getClass();
                                        g3<ww1.g> g3VarD3 = g3.a.d(gVar3);
                                        this.f134017g = null;
                                        this.f134011a = null;
                                        this.f134012b = null;
                                        this.f134013c = null;
                                        this.f134014d = null;
                                        this.f134016f = 7;
                                    }
                                } else {
                                    dVar3 = dVar;
                                    iVar4 = iVar2;
                                    Long l18 = l14;
                                    g3.a aVar12 = g3.f35298f;
                                    if (iVar4 == null) {
                                        z14 = false;
                                    }
                                    ww1.g gVar4 = new ww1.g(z14, l18, iVar4, dVar3, (fg0.k) r0Var.f105810a);
                                    aVar12.getClass();
                                    g3<ww1.g> g3VarD4 = g3.a.d(gVar4);
                                    this.f134017g = null;
                                    this.f134011a = null;
                                    this.f134012b = null;
                                    this.f134013c = null;
                                    this.f134014d = null;
                                    this.f134016f = 7;
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                o13.r.b(obj);
                r0Var = new r0();
                ax1.i iVar6 = aVar2.f133990b;
                this.f134017g = b0Var;
                this.f134011a = r0Var;
                this.f134016f = 2;
                objJ = com.garmin.android.apps.connectmobile.f0.J(iVar6, new ax1.m(iVar6, null), this);
                if (objJ != aVar) {
                    v2Var = (v2) objJ;
                    if (v2Var instanceof v2.b) {
                        if (!(v2Var instanceof v2.a)) {
                            u0.r();
                            return null;
                        }
                        v2.a aVar13 = (v2.a) v2Var;
                        String strD3 = com.airbnb.lottie.animation.keyframe.a.d(aVar13.f47383a, "Error getting active Training plan dto ");
                        i2.a aVar14 = i2.f36769a;
                        a2 a2Var5 = a2.GENERAL;
                        aVar14.getClass();
                        i2.a.f(a2Var5, "GetActiveTrainingPlansUseCaseLight", strD3);
                        g3<ww1.g> g3VarA3 = g3.a.a(g3.f35298f, null, aVar13.f47383a, null, null, 13);
                        this.f134017g = b0Var;
                        this.f134011a = r0Var;
                        this.f134012b = null;
                        this.f134016f = 5;
                    } else {
                        listA = ((ww1.f0) ((v2.b) v2Var).f47386a).a();
                        if (listA != null) {
                            arrayList = new ArrayList();
                            while (r9.hasNext()) {
                                iVar3 = (ww1.i) obj2;
                                if (!iVar3.j()) {
                                }
                                arrayList.add(obj2);
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList == null) {
                        }
                        if (arrayList != null) {
                            iVar = (ww1.i) h0.d0(arrayList);
                        } else {
                            iVar = null;
                        }
                        dVar = null;
                        iVar2 = iVar;
                        if (iVar2 != null) {
                            l14 = new Long(iVar2.getTrainingPlanId());
                        } else if (dVar != null) {
                            l14 = new Long(dVar.getAthletePlanId());
                        } else {
                            l14 = null;
                        }
                        if (l14 == null) {
                            jLongValue = l14.longValue();
                            zf0.d dVar7 = aVar2.f133991c;
                            this.f134017g = b0Var;
                            this.f134011a = iVar2;
                            this.f134012b = dVar;
                            this.f134013c = r0Var;
                            this.f134014d = l14;
                            this.f134015e = jLongValue;
                            this.f134016f = 6;
                            objC = dVar7.c(jLongValue, this);
                            if (objC != aVar) {
                                dVar4 = dVar;
                                v2Var3 = (v2) objC;
                                if (v2Var3 instanceof v2.b) {
                                    r0Var.f105810a = h0.d0((List) ((v2.b) v2Var3).f47386a);
                                } else {
                                    if (!(v2Var3 instanceof v2.a)) {
                                        u0.r();
                                        return null;
                                    }
                                    String strN3 = wr.g.n("Error getting event for planId ", jLongValue, ". Exception=", ((v2.a) v2Var3).f47383a);
                                    i2.a aVar15 = i2.f36769a;
                                    a2 a2Var6 = a2.GENERAL;
                                    aVar15.getClass();
                                    i2.a.f(a2Var6, "GetActiveTrainingPlansUseCaseLight", strN3);
                                }
                                dVar3 = dVar4;
                                iVar4 = iVar2;
                                Long l19 = l14;
                                g3.a aVar16 = g3.f35298f;
                                if (iVar4 == null) {
                                    z14 = false;
                                }
                                ww1.g gVar5 = new ww1.g(z14, l19, iVar4, dVar3, (fg0.k) r0Var.f105810a);
                                aVar16.getClass();
                                g3<ww1.g> g3VarD5 = g3.a.d(gVar5);
                                this.f134017g = null;
                                this.f134011a = null;
                                this.f134012b = null;
                                this.f134013c = null;
                                this.f134014d = null;
                                this.f134016f = 7;
                            }
                        } else {
                            dVar3 = dVar;
                            iVar4 = iVar2;
                            Long l110 = l14;
                            g3.a aVar17 = g3.f35298f;
                            if (iVar4 == null) {
                                z14 = false;
                            }
                            ww1.g gVar6 = new ww1.g(z14, l110, iVar4, dVar3, (fg0.k) r0Var.f105810a);
                            aVar17.getClass();
                            g3<ww1.g> g3VarD6 = g3.a.d(gVar6);
                            this.f134017g = null;
                            this.f134011a = null;
                            this.f134012b = null;
                            this.f134013c = null;
                            this.f134014d = null;
                            this.f134016f = 7;
                        }
                    }
                    break;
                }
                return aVar;
            case 2:
                r0Var = (r0) this.f134011a;
                o13.r.b(obj);
                objJ = obj;
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    listA = ((ww1.f0) ((v2.b) v2Var).f47386a).a();
                    if (listA != null) {
                        arrayList = new ArrayList();
                        while (r9.hasNext()) {
                            iVar3 = (ww1.i) obj2;
                            if (!iVar3.j()) {
                            }
                            arrayList.add(obj2);
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                    }
                    if (arrayList != null) {
                        iVar = (ww1.i) h0.d0(arrayList);
                    } else {
                        iVar = null;
                    }
                    dVar = null;
                    iVar2 = iVar;
                    if (iVar2 != null) {
                        l14 = new Long(iVar2.getTrainingPlanId());
                    } else if (dVar != null) {
                        l14 = new Long(dVar.getAthletePlanId());
                    } else {
                        l14 = null;
                    }
                    if (l14 == null) {
                        jLongValue = l14.longValue();
                        zf0.d dVar8 = aVar2.f133991c;
                        this.f134017g = b0Var;
                        this.f134011a = iVar2;
                        this.f134012b = dVar;
                        this.f134013c = r0Var;
                        this.f134014d = l14;
                        this.f134015e = jLongValue;
                        this.f134016f = 6;
                        objC = dVar8.c(jLongValue, this);
                        if (objC != aVar) {
                            dVar4 = dVar;
                            v2Var3 = (v2) objC;
                            if (v2Var3 instanceof v2.b) {
                                r0Var.f105810a = h0.d0((List) ((v2.b) v2Var3).f47386a);
                            } else {
                                if (!(v2Var3 instanceof v2.a)) {
                                    u0.r();
                                    return null;
                                }
                                String strN4 = wr.g.n("Error getting event for planId ", jLongValue, ". Exception=", ((v2.a) v2Var3).f47383a);
                                i2.a aVar18 = i2.f36769a;
                                a2 a2Var7 = a2.GENERAL;
                                aVar18.getClass();
                                i2.a.f(a2Var7, "GetActiveTrainingPlansUseCaseLight", strN4);
                            }
                            dVar3 = dVar4;
                            iVar4 = iVar2;
                            Long l111 = l14;
                            g3.a aVar19 = g3.f35298f;
                            if (iVar4 == null) {
                                z14 = false;
                            }
                            ww1.g gVar7 = new ww1.g(z14, l111, iVar4, dVar3, (fg0.k) r0Var.f105810a);
                            aVar19.getClass();
                            g3<ww1.g> g3VarD7 = g3.a.d(gVar7);
                            this.f134017g = null;
                            this.f134011a = null;
                            this.f134012b = null;
                            this.f134013c = null;
                            this.f134014d = null;
                            this.f134016f = 7;
                        }
                    } else {
                        dVar3 = dVar;
                        iVar4 = iVar2;
                        Long l112 = l14;
                        g3.a aVar110 = g3.f35298f;
                        if (iVar4 == null) {
                            z14 = false;
                        }
                        ww1.g gVar8 = new ww1.g(z14, l112, iVar4, dVar3, (fg0.k) r0Var.f105810a);
                        aVar110.getClass();
                        g3<ww1.g> g3VarD8 = g3.a.d(gVar8);
                        this.f134017g = null;
                        this.f134011a = null;
                        this.f134012b = null;
                        this.f134013c = null;
                        this.f134014d = null;
                        this.f134016f = 7;
                    }
                    break;
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    v2.a aVar111 = (v2.a) v2Var;
                    String strD4 = com.airbnb.lottie.animation.keyframe.a.d(aVar111.f47383a, "Error getting active Training plan dto ");
                    i2.a aVar112 = i2.f36769a;
                    a2 a2Var8 = a2.GENERAL;
                    aVar112.getClass();
                    i2.a.f(a2Var8, "GetActiveTrainingPlansUseCaseLight", strD4);
                    g3<ww1.g> g3VarA4 = g3.a.a(g3.f35298f, null, aVar111.f47383a, null, null, 13);
                    this.f134017g = b0Var;
                    this.f134011a = r0Var;
                    this.f134012b = null;
                    this.f134016f = 5;
                    break;
                }
                return aVar;
            case 3:
                r0Var = (r0) this.f134011a;
                o13.r.b(obj);
                objJ2 = obj;
                v2Var2 = (v2) objJ2;
                if (!(v2Var2 instanceof v2.b)) {
                    bVar = (v2.b) v2Var2;
                    if (bVar.f47387b != 204) {
                        it = ((Iterable) bVar.f47386a).iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                                dVar2 = (xw1.d) next;
                                if (!dVar2.Z()) {
                                }
                            } else {
                                next = null;
                            }
                            dVar = (xw1.d) next;
                            Unit unit3 = Unit.INSTANCE;
                        } while (!dVar2.e0());
                        dVar = (xw1.d) next;
                        Unit unit4 = Unit.INSTANCE;
                    } else {
                        dVar = null;
                    }
                    iVar2 = null;
                    if (iVar2 != null) {
                        l14 = new Long(iVar2.getTrainingPlanId());
                    } else if (dVar != null) {
                        l14 = new Long(dVar.getAthletePlanId());
                    } else {
                        l14 = null;
                    }
                    if (l14 == null) {
                        jLongValue = l14.longValue();
                        zf0.d dVar9 = aVar2.f133991c;
                        this.f134017g = b0Var;
                        this.f134011a = iVar2;
                        this.f134012b = dVar;
                        this.f134013c = r0Var;
                        this.f134014d = l14;
                        this.f134015e = jLongValue;
                        this.f134016f = 6;
                        objC = dVar9.c(jLongValue, this);
                        if (objC != aVar) {
                            dVar4 = dVar;
                            v2Var3 = (v2) objC;
                            if (v2Var3 instanceof v2.b) {
                                r0Var.f105810a = h0.d0((List) ((v2.b) v2Var3).f47386a);
                            } else {
                                if (!(v2Var3 instanceof v2.a)) {
                                    u0.r();
                                    return null;
                                }
                                String strN5 = wr.g.n("Error getting event for planId ", jLongValue, ". Exception=", ((v2.a) v2Var3).f47383a);
                                i2.a aVar113 = i2.f36769a;
                                a2 a2Var9 = a2.GENERAL;
                                aVar113.getClass();
                                i2.a.f(a2Var9, "GetActiveTrainingPlansUseCaseLight", strN5);
                            }
                            dVar3 = dVar4;
                            iVar4 = iVar2;
                            Long l113 = l14;
                            g3.a aVar114 = g3.f35298f;
                            if (iVar4 == null) {
                                z14 = false;
                            }
                            ww1.g gVar9 = new ww1.g(z14, l113, iVar4, dVar3, (fg0.k) r0Var.f105810a);
                            aVar114.getClass();
                            g3<ww1.g> g3VarD9 = g3.a.d(gVar9);
                            this.f134017g = null;
                            this.f134011a = null;
                            this.f134012b = null;
                            this.f134013c = null;
                            this.f134014d = null;
                            this.f134016f = 7;
                        }
                    } else {
                        dVar3 = dVar;
                        iVar4 = iVar2;
                        Long l114 = l14;
                        g3.a aVar115 = g3.f35298f;
                        if (iVar4 == null) {
                            z14 = false;
                        }
                        ww1.g gVar10 = new ww1.g(z14, l114, iVar4, dVar3, (fg0.k) r0Var.f105810a);
                        aVar115.getClass();
                        g3<ww1.g> g3VarD10 = g3.a.d(gVar10);
                        this.f134017g = null;
                        this.f134011a = null;
                        this.f134012b = null;
                        this.f134013c = null;
                        this.f134014d = null;
                        this.f134016f = 7;
                    }
                    break;
                } else {
                    if (v2Var2 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    v2.a aVar20 = (v2.a) v2Var2;
                    String strD5 = com.airbnb.lottie.animation.keyframe.a.d(aVar20.f47383a, "Error getting active atp plan dto ");
                    i2.a aVar21 = i2.f36769a;
                    a2 a2Var10 = a2.GENERAL;
                    aVar21.getClass();
                    i2.a.f(a2Var10, "GetActiveTrainingPlansUseCaseLight", strD5);
                    g3<ww1.g> g3VarA5 = g3.a.a(g3.f35298f, null, aVar20.f47383a, null, null, 13);
                    this.f134017g = b0Var;
                    this.f134011a = r0Var;
                    this.f134012b = null;
                    this.f134013c = null;
                    this.f134014d = null;
                    this.f134016f = 4;
                    break;
                }
                return aVar;
            case 4:
            case 5:
                r0Var = (r0) this.f134011a;
                o13.r.b(obj);
                dVar = null;
                iVar2 = null;
                if (iVar2 != null) {
                    l14 = new Long(iVar2.getTrainingPlanId());
                } else if (dVar != null) {
                    l14 = new Long(dVar.getAthletePlanId());
                } else {
                    l14 = null;
                }
                if (l14 == null) {
                    dVar3 = dVar;
                    iVar4 = iVar2;
                    Long l115 = l14;
                    g3.a aVar116 = g3.f35298f;
                    if (iVar4 == null) {
                        z14 = false;
                    }
                    ww1.g gVar11 = new ww1.g(z14, l115, iVar4, dVar3, (fg0.k) r0Var.f105810a);
                    aVar116.getClass();
                    g3<ww1.g> g3VarD11 = g3.a.d(gVar11);
                    this.f134017g = null;
                    this.f134011a = null;
                    this.f134012b = null;
                    this.f134013c = null;
                    this.f134014d = null;
                    this.f134016f = 7;
                    break;
                } else {
                    jLongValue = l14.longValue();
                    zf0.d dVar10 = aVar2.f133991c;
                    this.f134017g = b0Var;
                    this.f134011a = iVar2;
                    this.f134012b = dVar;
                    this.f134013c = r0Var;
                    this.f134014d = l14;
                    this.f134015e = jLongValue;
                    this.f134016f = 6;
                    objC = dVar10.c(jLongValue, this);
                    if (objC != aVar) {
                        dVar4 = dVar;
                        v2Var3 = (v2) objC;
                        if (v2Var3 instanceof v2.b) {
                            r0Var.f105810a = h0.d0((List) ((v2.b) v2Var3).f47386a);
                        } else {
                            if (!(v2Var3 instanceof v2.a)) {
                                u0.r();
                                return null;
                            }
                            String strN6 = wr.g.n("Error getting event for planId ", jLongValue, ". Exception=", ((v2.a) v2Var3).f47383a);
                            i2.a aVar117 = i2.f36769a;
                            a2 a2Var11 = a2.GENERAL;
                            aVar117.getClass();
                            i2.a.f(a2Var11, "GetActiveTrainingPlansUseCaseLight", strN6);
                        }
                        dVar3 = dVar4;
                        iVar4 = iVar2;
                        Long l116 = l14;
                        g3.a aVar118 = g3.f35298f;
                        if (iVar4 == null) {
                            z14 = false;
                        }
                        ww1.g gVar12 = new ww1.g(z14, l116, iVar4, dVar3, (fg0.k) r0Var.f105810a);
                        aVar118.getClass();
                        g3<ww1.g> g3VarD12 = g3.a.d(gVar12);
                        this.f134017g = null;
                        this.f134011a = null;
                        this.f134012b = null;
                        this.f134013c = null;
                        this.f134014d = null;
                        this.f134016f = 7;
                    }
                    break;
                }
                return aVar;
            case 6:
                long j8 = this.f134015e;
                Long l24 = this.f134014d;
                r0Var = this.f134013c;
                dVar4 = this.f134012b;
                iVar2 = (ww1.i) this.f134011a;
                o13.r.b(obj);
                jLongValue = j8;
                l14 = l24;
                objC = obj;
                v2Var3 = (v2) objC;
                if (v2Var3 instanceof v2.b) {
                    r0Var.f105810a = h0.d0((List) ((v2.b) v2Var3).f47386a);
                } else {
                    if (!(v2Var3 instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    String strN7 = wr.g.n("Error getting event for planId ", jLongValue, ". Exception=", ((v2.a) v2Var3).f47383a);
                    i2.a aVar119 = i2.f36769a;
                    a2 a2Var12 = a2.GENERAL;
                    aVar119.getClass();
                    i2.a.f(a2Var12, "GetActiveTrainingPlansUseCaseLight", strN7);
                }
                dVar3 = dVar4;
                iVar4 = iVar2;
                Long l117 = l14;
                g3.a aVar1110 = g3.f35298f;
                if (iVar4 == null) {
                    z14 = false;
                }
                ww1.g gVar13 = new ww1.g(z14, l117, iVar4, dVar3, (fg0.k) r0Var.f105810a);
                aVar1110.getClass();
                g3<ww1.g> g3VarD13 = g3.a.d(gVar13);
                this.f134017g = null;
                this.f134011a = null;
                this.f134012b = null;
                this.f134013c = null;
                this.f134014d = null;
                this.f134016f = 7;
                break;
            case 7:
                o13.r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
