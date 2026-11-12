package st1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.x;
import p13.y;
import r53.p2;
import rt1.j;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.domain.usecase.QuitActiveTrainingPlansUseCase$quitTrainingPlan$2", f = "QuitActiveTrainingPlansUseCase.kt", l = {40, 46, 48, 60, 63, 70, 73, 78}, m = "invokeSuspend", v = 2)
public final class g extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f160897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f160898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f160899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f160900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<ww1.e> f160901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f160902g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.domain.usecase.QuitActiveTrainingPlansUseCase$quitTrainingPlan$2$staticPlansResults$1$1", f = "QuitActiveTrainingPlansUseCase.kt", l = {59}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f160903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f160904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ww1.e f160905c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, ww1.e eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f160904b = cVar;
            this.f160905c = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f160904b, this.f160905c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f160903a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            uw1.b bVar = this.f160904b.f160869a;
            long j8 = this.f160905c.f187755a;
            this.f160903a = 1;
            Object objA = bVar.a(j8, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, Long l14, boolean z14, List<ww1.e> list, j jVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f160898c = cVar;
        this.f160899d = l14;
        this.f160900e = z14;
        this.f160901f = list;
        this.f160902g = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f160898c, this.f160899d, this.f160900e, this.f160901f, this.f160902g, dVar);
        gVar.f160897b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9 A[LOOP:2: B:33:0x00b3->B:35:0x00b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d9 A[PHI: r1
      0x00d9: PHI (r1v10 java.lang.Object) = (r1v9 java.lang.Object), (r1v19 java.lang.Object) binds: [B:37:0x00d5, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:52:0x010d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0115  */
    /* JADX WARN: Code duplicated, block: B:56:0x011b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0129  */
    /* JADX WARN: Code duplicated, block: B:67:0x0187  */
    /* JADX WARN: Code duplicated, block: B:70:0x019f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[LOOP:0: B:45:0x00e9->B:80:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r3 == r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
    
        if (r3 == r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016c, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0184, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019c, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01bc, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r2) goto L74;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Long l14;
        v2 bVar;
        Object objJ;
        Object objA;
        ArrayList arrayList;
        Iterator<T> it;
        Object objO;
        List list;
        Iterator it3;
        ArrayList arrayList2;
        int i14;
        int i15;
        Long l15;
        b0 b0Var = (b0) this.f160897b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f160896a;
        j jVar = this.f160902g;
        List<ww1.e> list2 = this.f160901f;
        c cVar = this.f160898c;
        switch (i16) {
            case 0:
                r.b(obj);
                p2 p2Var = cVar.f160872d;
                g3 g3VarC = g3.a.c(g3.f35298f);
                this.f160897b = b0Var;
                this.f160896a = 1;
                p2Var.k(null, g3VarC);
                if (Unit.INSTANCE != aVar) {
                    l14 = this.f160899d;
                    if (l14 != null) {
                        bVar = new v2.b(Unit.INSTANCE, 200, null, null, 12, null);
                        if (bVar instanceof v2.b) {
                            if (bVar instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            p2 p2Var2 = cVar.f160872d;
                            g3 g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
                            this.f160897b = null;
                            this.f160896a = 8;
                            p2Var2.k(null, g3VarA);
                        } else if (list2.isEmpty()) {
                            p2 p2Var3 = cVar.f160872d;
                            g3.f35298f.getClass();
                            g3 g3VarD = g3.a.d(jVar);
                            this.f160897b = null;
                            this.f160896a = 7;
                            p2Var3.k(null, g3VarD);
                        } else {
                            arrayList = new ArrayList(y.r(list2, 10));
                            it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(ge1.b.j(b0Var, null, null, new a(cVar, (ww1.e) it.next(), null), 3));
                            }
                            this.f160897b = b0Var;
                            this.f160896a = 4;
                            objO = g8.i.o(arrayList, this);
                            if (objO != aVar) {
                                list = (List) objO;
                                if (list != null || !list.isEmpty()) {
                                    it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        if (!(((v2) it3.next()) instanceof v2.b)) {
                                            arrayList2 = new ArrayList(y.r(list, 10));
                                            i14 = 0;
                                            for (Object obj2 : list) {
                                                i15 = i14 + 1;
                                                if (i14 < 0) {
                                                    x.q();
                                                    throw null;
                                                }
                                                if (((v2) obj2) instanceof v2.a) {
                                                    l15 = new Long(list2.get(i14).f187755a);
                                                } else {
                                                    l15 = null;
                                                }
                                                arrayList2.add(l15);
                                                i14 = i15;
                                            }
                                            String strConcat = "Error quitting static plans ".concat(h0.k0(h0.Z(arrayList2), ",", null, null, null, 62));
                                            i2.a aVar2 = i2.f36769a;
                                            a2 a2Var = a2.GENERAL;
                                            aVar2.getClass();
                                            i2.a.f(a2Var, "QuitActiveTrainingPlansUseCase", strConcat);
                                            p2 p2Var4 = cVar.f160872d;
                                            g3 g3VarA2 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                            this.f160897b = null;
                                            this.f160896a = 6;
                                            p2Var4.k(null, g3VarA2);
                                            break;
                                        }
                                    }
                                }
                                p2 p2Var5 = cVar.f160872d;
                                g3.f35298f.getClass();
                                g3 g3VarD2 = g3.a.d(jVar);
                                this.f160897b = null;
                                this.f160896a = 5;
                                p2Var5.k(null, g3VarD2);
                            }
                        }
                    } else if (this.f160900e) {
                        uw1.b bVar2 = cVar.f160869a;
                        long jLongValue = l14.longValue();
                        this.f160897b = b0Var;
                        this.f160896a = 2;
                        objA = bVar2.a(jLongValue, this);
                    } else {
                        gu1.b bVar3 = cVar.f160870b;
                        long jLongValue2 = l14.longValue();
                        this.f160897b = b0Var;
                        this.f160896a = 3;
                        objJ = f0.J(bVar3, new gu1.j(bVar3, jLongValue2, null), this);
                    }
                    break;
                }
                return aVar;
            case 1:
                r.b(obj);
                l14 = this.f160899d;
                if (l14 != null) {
                    bVar = new v2.b(Unit.INSTANCE, 200, null, null, 12, null);
                    if (bVar instanceof v2.b) {
                        if (bVar instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        p2 p2Var6 = cVar.f160872d;
                        g3 g3VarA3 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                        this.f160897b = null;
                        this.f160896a = 8;
                        p2Var6.k(null, g3VarA3);
                    } else if (list2.isEmpty()) {
                        arrayList = new ArrayList(y.r(list2, 10));
                        it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(ge1.b.j(b0Var, null, null, new a(cVar, (ww1.e) it.next(), null), 3));
                        }
                        this.f160897b = b0Var;
                        this.f160896a = 4;
                        objO = g8.i.o(arrayList, this);
                        if (objO != aVar) {
                            list = (List) objO;
                            if (list != null) {
                            }
                            it3 = list.iterator();
                            while (it3.hasNext()) {
                                if (!(((v2) it3.next()) instanceof v2.b)) {
                                    arrayList2 = new ArrayList(y.r(list, 10));
                                    i14 = 0;
                                    while (r1.hasNext()) {
                                        i15 = i14 + 1;
                                        if (i14 < 0) {
                                            x.q();
                                            throw null;
                                        }
                                        if (((v2) obj2) instanceof v2.a) {
                                            l15 = new Long(list2.get(i14).f187755a);
                                        } else {
                                            l15 = null;
                                        }
                                        arrayList2.add(l15);
                                        i14 = i15;
                                    }
                                    String strConcat2 = "Error quitting static plans ".concat(h0.k0(h0.Z(arrayList2), ",", null, null, null, 62));
                                    i2.a aVar3 = i2.f36769a;
                                    a2 a2Var2 = a2.GENERAL;
                                    aVar3.getClass();
                                    i2.a.f(a2Var2, "QuitActiveTrainingPlansUseCase", strConcat2);
                                    p2 p2Var7 = cVar.f160872d;
                                    g3 g3VarA4 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                    this.f160897b = null;
                                    this.f160896a = 6;
                                    p2Var7.k(null, g3VarA4);
                                    break;
                                }
                            }
                            p2 p2Var8 = cVar.f160872d;
                            g3.f35298f.getClass();
                            g3 g3VarD3 = g3.a.d(jVar);
                            this.f160897b = null;
                            this.f160896a = 5;
                            p2Var8.k(null, g3VarD3);
                        }
                    } else {
                        p2 p2Var9 = cVar.f160872d;
                        g3.f35298f.getClass();
                        g3 g3VarD4 = g3.a.d(jVar);
                        this.f160897b = null;
                        this.f160896a = 7;
                        p2Var9.k(null, g3VarD4);
                    }
                    break;
                } else {
                    if (this.f160900e) {
                        uw1.b bVar4 = cVar.f160869a;
                        long jLongValue3 = l14.longValue();
                        this.f160897b = b0Var;
                        this.f160896a = 2;
                        objA = bVar4.a(jLongValue3, this);
                    } else {
                        gu1.b bVar5 = cVar.f160870b;
                        long jLongValue4 = l14.longValue();
                        this.f160897b = b0Var;
                        this.f160896a = 3;
                        objJ = f0.J(bVar5, new gu1.j(bVar5, jLongValue4, null), this);
                    }
                    break;
                }
                return aVar;
            case 2:
                r.b(obj);
                objA = obj;
                bVar = (v2) objA;
                if (bVar instanceof v2.b) {
                    if (list2.isEmpty()) {
                        p2 p2Var10 = cVar.f160872d;
                        g3.f35298f.getClass();
                        g3 g3VarD5 = g3.a.d(jVar);
                        this.f160897b = null;
                        this.f160896a = 7;
                        p2Var10.k(null, g3VarD5);
                        break;
                    } else {
                        arrayList = new ArrayList(y.r(list2, 10));
                        it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(ge1.b.j(b0Var, null, null, new a(cVar, (ww1.e) it.next(), null), 3));
                        }
                        this.f160897b = b0Var;
                        this.f160896a = 4;
                        objO = g8.i.o(arrayList, this);
                        if (objO != aVar) {
                            list = (List) objO;
                            if (list != null) {
                            }
                            it3 = list.iterator();
                            while (it3.hasNext()) {
                                if (!(((v2) it3.next()) instanceof v2.b)) {
                                    arrayList2 = new ArrayList(y.r(list, 10));
                                    i14 = 0;
                                    while (r1.hasNext()) {
                                        i15 = i14 + 1;
                                        if (i14 < 0) {
                                            x.q();
                                            throw null;
                                        }
                                        if (((v2) obj2) instanceof v2.a) {
                                            l15 = new Long(list2.get(i14).f187755a);
                                        } else {
                                            l15 = null;
                                        }
                                        arrayList2.add(l15);
                                        i14 = i15;
                                    }
                                    String strConcat3 = "Error quitting static plans ".concat(h0.k0(h0.Z(arrayList2), ",", null, null, null, 62));
                                    i2.a aVar4 = i2.f36769a;
                                    a2 a2Var3 = a2.GENERAL;
                                    aVar4.getClass();
                                    i2.a.f(a2Var3, "QuitActiveTrainingPlansUseCase", strConcat3);
                                    p2 p2Var11 = cVar.f160872d;
                                    g3 g3VarA5 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                    this.f160897b = null;
                                    this.f160896a = 6;
                                    p2Var11.k(null, g3VarA5);
                                    break;
                                }
                            }
                            p2 p2Var12 = cVar.f160872d;
                            g3.f35298f.getClass();
                            g3 g3VarD6 = g3.a.d(jVar);
                            this.f160897b = null;
                            this.f160896a = 5;
                            p2Var12.k(null, g3VarD6);
                        }
                        break;
                    }
                    return aVar;
                }
                if (bVar instanceof v2.a) {
                    u0.r();
                    return null;
                }
                p2 p2Var13 = cVar.f160872d;
                g3 g3VarA6 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                this.f160897b = null;
                this.f160896a = 8;
                p2Var13.k(null, g3VarA6);
                break;
                break;
            case 3:
                r.b(obj);
                objJ = obj;
                bVar = (v2) objJ;
                if (bVar instanceof v2.b) {
                    if (list2.isEmpty()) {
                        p2 p2Var14 = cVar.f160872d;
                        g3.f35298f.getClass();
                        g3 g3VarD7 = g3.a.d(jVar);
                        this.f160897b = null;
                        this.f160896a = 7;
                        p2Var14.k(null, g3VarD7);
                        break;
                    } else {
                        arrayList = new ArrayList(y.r(list2, 10));
                        it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(ge1.b.j(b0Var, null, null, new a(cVar, (ww1.e) it.next(), null), 3));
                        }
                        this.f160897b = b0Var;
                        this.f160896a = 4;
                        objO = g8.i.o(arrayList, this);
                        if (objO != aVar) {
                            list = (List) objO;
                            if (list != null) {
                            }
                            it3 = list.iterator();
                            while (it3.hasNext()) {
                                if (!(((v2) it3.next()) instanceof v2.b)) {
                                    arrayList2 = new ArrayList(y.r(list, 10));
                                    i14 = 0;
                                    while (r1.hasNext()) {
                                        i15 = i14 + 1;
                                        if (i14 < 0) {
                                            x.q();
                                            throw null;
                                        }
                                        if (((v2) obj2) instanceof v2.a) {
                                            l15 = new Long(list2.get(i14).f187755a);
                                        } else {
                                            l15 = null;
                                        }
                                        arrayList2.add(l15);
                                        i14 = i15;
                                    }
                                    String strConcat4 = "Error quitting static plans ".concat(h0.k0(h0.Z(arrayList2), ",", null, null, null, 62));
                                    i2.a aVar5 = i2.f36769a;
                                    a2 a2Var4 = a2.GENERAL;
                                    aVar5.getClass();
                                    i2.a.f(a2Var4, "QuitActiveTrainingPlansUseCase", strConcat4);
                                    p2 p2Var15 = cVar.f160872d;
                                    g3 g3VarA7 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                    this.f160897b = null;
                                    this.f160896a = 6;
                                    p2Var15.k(null, g3VarA7);
                                    break;
                                }
                            }
                            p2 p2Var16 = cVar.f160872d;
                            g3.f35298f.getClass();
                            g3 g3VarD8 = g3.a.d(jVar);
                            this.f160897b = null;
                            this.f160896a = 5;
                            p2Var16.k(null, g3VarD8);
                        }
                        break;
                    }
                    return aVar;
                }
                if (bVar instanceof v2.a) {
                    u0.r();
                    return null;
                }
                p2 p2Var17 = cVar.f160872d;
                g3 g3VarA8 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                this.f160897b = null;
                this.f160896a = 8;
                p2Var17.k(null, g3VarA8);
                break;
                break;
            case 4:
                r.b(obj);
                objO = obj;
                list = (List) objO;
                if (list != null) {
                }
                it3 = list.iterator();
                while (it3.hasNext()) {
                    if (!(((v2) it3.next()) instanceof v2.b)) {
                        arrayList2 = new ArrayList(y.r(list, 10));
                        i14 = 0;
                        while (r1.hasNext()) {
                            i15 = i14 + 1;
                            if (i14 < 0) {
                                x.q();
                                throw null;
                            }
                            if (((v2) obj2) instanceof v2.a) {
                                l15 = new Long(list2.get(i14).f187755a);
                            } else {
                                l15 = null;
                            }
                            arrayList2.add(l15);
                            i14 = i15;
                        }
                        String strConcat5 = "Error quitting static plans ".concat(h0.k0(h0.Z(arrayList2), ",", null, null, null, 62));
                        i2.a aVar6 = i2.f36769a;
                        a2 a2Var5 = a2.GENERAL;
                        aVar6.getClass();
                        i2.a.f(a2Var5, "QuitActiveTrainingPlansUseCase", strConcat5);
                        p2 p2Var18 = cVar.f160872d;
                        g3 g3VarA9 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                        this.f160897b = null;
                        this.f160896a = 6;
                        p2Var18.k(null, g3VarA9);
                        break;
                    }
                }
                p2 p2Var19 = cVar.f160872d;
                g3.f35298f.getClass();
                g3 g3VarD9 = g3.a.d(jVar);
                this.f160897b = null;
                this.f160896a = 5;
                p2Var19.k(null, g3VarD9);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                r.b(obj);
                return Unit.INSTANCE;
            default:
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
