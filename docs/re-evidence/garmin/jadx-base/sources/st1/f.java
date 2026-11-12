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
@v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.domain.usecase.QuitActiveTrainingPlansUseCase$quitMultipleLegacyTrainingPlans$2", f = "QuitActiveTrainingPlansUseCase.kt", l = {92, 95, 102, 109, 112, 119, 122, 127, 133}, m = "invokeSuspend", v = 2)
public final class f extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f160886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f160887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f160888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f160889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.a f160890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ww1.c f160891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<ww1.e> f160892g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.domain.usecase.QuitActiveTrainingPlansUseCase$quitMultipleLegacyTrainingPlans$2$results$1$1", f = "QuitActiveTrainingPlansUseCase.kt", l = {108}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f160893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f160894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ww1.e f160895c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, ww1.e eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f160894b = cVar;
            this.f160895c = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f160894b, this.f160895c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f160893a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            uw1.b bVar = this.f160894b.f160869a;
            long j8 = this.f160895c.f187755a;
            this.f160893a = 1;
            Object objA = bVar.a(j8, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, ww1.a aVar, ww1.c cVar2, List<ww1.e> list, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f160889d = cVar;
        this.f160890e = aVar;
        this.f160891f = cVar2;
        this.f160892g = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f160889d, this.f160890e, this.f160891f, this.f160892g, dVar);
        fVar.f160888c = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006e A[PHI: r3
      0x006e: PHI (r3v5 java.lang.Object) = (r3v4 java.lang.Object), (r3v10 java.lang.Object) binds: [B:16:0x006a, B:10:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0074  */
    /* JADX WARN: Code duplicated, block: B:23:0x008f A[PHI: r3 r6
      0x008f: PHI (r3v11 rt1.j) = (r3v9 rt1.j), (r3v15 rt1.j) binds: [B:21:0x008b, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x008f: PHI (r6v4 java.lang.Object) = (r6v3 java.lang.Object), (r6v9 java.lang.Object) binds: [B:21:0x008b, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    /* JADX WARN: Code duplicated, block: B:27:0x009b  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ae A[LOOP:2: B:28:0x00a8->B:30:0x00ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0 A[PHI: r1 r3
      0x00d0: PHI (r1v14 java.lang.Object) = (r1v13 java.lang.Object), (r1v24 java.lang.Object) binds: [B:32:0x00cc, B:8:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r3v16 rt1.j) = (r3v11 rt1.j), (r3v24 rt1.j) binds: [B:32:0x00cc, B:8:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Code duplicated, block: B:52:0x0120  */
    /* JADX WARN: Code duplicated, block: B:62:0x0183  */
    /* JADX WARN: Code duplicated, block: B:65:0x019d  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[LOOP:0: B:40:0x00e0->B:81:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0165, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r2) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0180, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r2) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019a, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r2) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01bc, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r2) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e1, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r2) goto L75;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objJ;
        v2 v2Var;
        j jVar;
        Object objA;
        v2 v2Var2;
        ArrayList arrayList;
        Iterator<T> it;
        Object objO;
        List list;
        Iterator it3;
        ArrayList arrayList2;
        int i14;
        int i15;
        Long l14;
        b0 b0Var = (b0) this.f160888c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f160887b;
        ww1.a aVar2 = this.f160890e;
        List<ww1.e> list2 = this.f160892g;
        c cVar = this.f160889d;
        switch (i16) {
            case 0:
                r.b(obj);
                p2 p2Var = cVar.f160872d;
                g3 g3VarC = g3.a.c(g3.f35298f);
                this.f160888c = b0Var;
                this.f160887b = 1;
                p2Var.k(null, g3VarC);
                if (Unit.INSTANCE != aVar) {
                    gu1.b bVar = cVar.f160870b;
                    long j8 = aVar2.f187755a;
                    this.f160888c = b0Var;
                    this.f160887b = 2;
                    objJ = f0.J(bVar, new gu1.j(bVar, j8, null), this);
                    if (objJ != aVar) {
                        v2Var = (v2) objJ;
                        if (v2Var instanceof v2.b) {
                            if (!(v2Var instanceof v2.a)) {
                                u0.r();
                                return null;
                            }
                            p2 p2Var2 = cVar.f160872d;
                            g3 g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
                            this.f160888c = null;
                            this.f160887b = 9;
                            p2Var2.k(null, g3VarA);
                        } else {
                            jVar = new j(aVar2.f187706g, null, 2, null);
                            uw1.b bVar2 = cVar.f160869a;
                            long j14 = this.f160891f.f187755a;
                            this.f160888c = b0Var;
                            this.f160886a = jVar;
                            this.f160887b = 3;
                            objA = bVar2.a(j14, this);
                            if (objA != aVar) {
                                v2Var2 = (v2) objA;
                                if (!(v2Var2 instanceof v2.b)) {
                                    if (v2Var2 instanceof v2.a) {
                                        u0.r();
                                        return null;
                                    }
                                    p2 p2Var3 = cVar.f160872d;
                                    g3 g3VarA2 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                    this.f160888c = null;
                                    this.f160886a = null;
                                    this.f160887b = 8;
                                    p2Var3.k(null, g3VarA2);
                                } else if (!list2.isEmpty()) {
                                    p2 p2Var4 = cVar.f160872d;
                                    g3.f35298f.getClass();
                                    g3 g3VarD = g3.a.d(jVar);
                                    this.f160888c = null;
                                    this.f160886a = null;
                                    this.f160887b = 7;
                                    p2Var4.k(null, g3VarD);
                                } else {
                                    arrayList = new ArrayList(y.r(list2, 10));
                                    it = list2.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(ge1.b.j(b0Var, null, null, new a(cVar, (ww1.e) it.next(), null), 3));
                                    }
                                    this.f160888c = b0Var;
                                    this.f160886a = jVar;
                                    this.f160887b = 4;
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
                                                            l14 = new Long(list2.get(i14).f187755a);
                                                        } else {
                                                            l14 = null;
                                                        }
                                                        arrayList2.add(l14);
                                                        i14 = i15;
                                                    }
                                                    String strConcat = "Error quitting static plans ".concat(h0.k0(h0.Z(arrayList2), ",", null, null, null, 62));
                                                    i2.a aVar3 = i2.f36769a;
                                                    a2 a2Var = a2.GENERAL;
                                                    aVar3.getClass();
                                                    i2.a.f(a2Var, "QuitActiveTrainingPlansUseCase", strConcat);
                                                    p2 p2Var5 = cVar.f160872d;
                                                    g3 g3VarA3 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                                    this.f160888c = null;
                                                    this.f160886a = null;
                                                    this.f160887b = 6;
                                                    p2Var5.k(null, g3VarA3);
                                                    break;
                                                }
                                            }
                                        }
                                        p2 p2Var6 = cVar.f160872d;
                                        g3.f35298f.getClass();
                                        g3 g3VarD2 = g3.a.d(jVar);
                                        this.f160888c = null;
                                        this.f160886a = null;
                                        this.f160887b = 5;
                                        p2Var6.k(null, g3VarD2);
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                r.b(obj);
                gu1.b bVar3 = cVar.f160870b;
                long j15 = aVar2.f187755a;
                this.f160888c = b0Var;
                this.f160887b = 2;
                objJ = f0.J(bVar3, new gu1.j(bVar3, j15, null), this);
                if (objJ != aVar) {
                    v2Var = (v2) objJ;
                    if (v2Var instanceof v2.b) {
                        if (!(v2Var instanceof v2.a)) {
                            u0.r();
                            return null;
                        }
                        p2 p2Var7 = cVar.f160872d;
                        g3 g3VarA4 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                        this.f160888c = null;
                        this.f160887b = 9;
                        p2Var7.k(null, g3VarA4);
                    } else {
                        jVar = new j(aVar2.f187706g, null, 2, null);
                        uw1.b bVar4 = cVar.f160869a;
                        long j16 = this.f160891f.f187755a;
                        this.f160888c = b0Var;
                        this.f160886a = jVar;
                        this.f160887b = 3;
                        objA = bVar4.a(j16, this);
                        if (objA != aVar) {
                            v2Var2 = (v2) objA;
                            if (!(v2Var2 instanceof v2.b)) {
                                if (v2Var2 instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                p2 p2Var8 = cVar.f160872d;
                                g3 g3VarA5 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                this.f160888c = null;
                                this.f160886a = null;
                                this.f160887b = 8;
                                p2Var8.k(null, g3VarA5);
                            } else if (!list2.isEmpty()) {
                                arrayList = new ArrayList(y.r(list2, 10));
                                it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(ge1.b.j(b0Var, null, null, new a(cVar, (ww1.e) it.next(), null), 3));
                                }
                                this.f160888c = b0Var;
                                this.f160886a = jVar;
                                this.f160887b = 4;
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
                                                    l14 = new Long(list2.get(i14).f187755a);
                                                } else {
                                                    l14 = null;
                                                }
                                                arrayList2.add(l14);
                                                i14 = i15;
                                            }
                                            String strConcat2 = "Error quitting static plans ".concat(h0.k0(h0.Z(arrayList2), ",", null, null, null, 62));
                                            i2.a aVar4 = i2.f36769a;
                                            a2 a2Var2 = a2.GENERAL;
                                            aVar4.getClass();
                                            i2.a.f(a2Var2, "QuitActiveTrainingPlansUseCase", strConcat2);
                                            p2 p2Var9 = cVar.f160872d;
                                            g3 g3VarA6 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                            this.f160888c = null;
                                            this.f160886a = null;
                                            this.f160887b = 6;
                                            p2Var9.k(null, g3VarA6);
                                            break;
                                        }
                                    }
                                    p2 p2Var10 = cVar.f160872d;
                                    g3.f35298f.getClass();
                                    g3 g3VarD3 = g3.a.d(jVar);
                                    this.f160888c = null;
                                    this.f160886a = null;
                                    this.f160887b = 5;
                                    p2Var10.k(null, g3VarD3);
                                }
                            } else {
                                p2 p2Var11 = cVar.f160872d;
                                g3.f35298f.getClass();
                                g3 g3VarD4 = g3.a.d(jVar);
                                this.f160888c = null;
                                this.f160886a = null;
                                this.f160887b = 7;
                                p2Var11.k(null, g3VarD4);
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 2:
                r.b(obj);
                objJ = obj;
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    jVar = new j(aVar2.f187706g, null, 2, null);
                    uw1.b bVar5 = cVar.f160869a;
                    long j17 = this.f160891f.f187755a;
                    this.f160888c = b0Var;
                    this.f160886a = jVar;
                    this.f160887b = 3;
                    objA = bVar5.a(j17, this);
                    if (objA != aVar) {
                        v2Var2 = (v2) objA;
                        if (!(v2Var2 instanceof v2.b)) {
                            if (v2Var2 instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            p2 p2Var12 = cVar.f160872d;
                            g3 g3VarA7 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                            this.f160888c = null;
                            this.f160886a = null;
                            this.f160887b = 8;
                            p2Var12.k(null, g3VarA7);
                        } else if (!list2.isEmpty()) {
                            arrayList = new ArrayList(y.r(list2, 10));
                            it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(ge1.b.j(b0Var, null, null, new a(cVar, (ww1.e) it.next(), null), 3));
                            }
                            this.f160888c = b0Var;
                            this.f160886a = jVar;
                            this.f160887b = 4;
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
                                                l14 = new Long(list2.get(i14).f187755a);
                                            } else {
                                                l14 = null;
                                            }
                                            arrayList2.add(l14);
                                            i14 = i15;
                                        }
                                        String strConcat3 = "Error quitting static plans ".concat(h0.k0(h0.Z(arrayList2), ",", null, null, null, 62));
                                        i2.a aVar5 = i2.f36769a;
                                        a2 a2Var3 = a2.GENERAL;
                                        aVar5.getClass();
                                        i2.a.f(a2Var3, "QuitActiveTrainingPlansUseCase", strConcat3);
                                        p2 p2Var13 = cVar.f160872d;
                                        g3 g3VarA8 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                        this.f160888c = null;
                                        this.f160886a = null;
                                        this.f160887b = 6;
                                        p2Var13.k(null, g3VarA8);
                                        break;
                                    }
                                }
                                p2 p2Var14 = cVar.f160872d;
                                g3.f35298f.getClass();
                                g3 g3VarD5 = g3.a.d(jVar);
                                this.f160888c = null;
                                this.f160886a = null;
                                this.f160887b = 5;
                                p2Var14.k(null, g3VarD5);
                            }
                        } else {
                            p2 p2Var15 = cVar.f160872d;
                            g3.f35298f.getClass();
                            g3 g3VarD6 = g3.a.d(jVar);
                            this.f160888c = null;
                            this.f160886a = null;
                            this.f160887b = 7;
                            p2Var15.k(null, g3VarD6);
                        }
                    }
                    break;
                } else {
                    if (!(v2Var instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    p2 p2Var16 = cVar.f160872d;
                    g3 g3VarA9 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                    this.f160888c = null;
                    this.f160887b = 9;
                    p2Var16.k(null, g3VarA9);
                    break;
                }
                return aVar;
            case 3:
                jVar = this.f160886a;
                r.b(obj);
                objA = obj;
                v2Var2 = (v2) objA;
                if (!(v2Var2 instanceof v2.b)) {
                    if (!list2.isEmpty()) {
                        p2 p2Var17 = cVar.f160872d;
                        g3.f35298f.getClass();
                        g3 g3VarD7 = g3.a.d(jVar);
                        this.f160888c = null;
                        this.f160886a = null;
                        this.f160887b = 7;
                        p2Var17.k(null, g3VarD7);
                        break;
                    } else {
                        arrayList = new ArrayList(y.r(list2, 10));
                        it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(ge1.b.j(b0Var, null, null, new a(cVar, (ww1.e) it.next(), null), 3));
                        }
                        this.f160888c = b0Var;
                        this.f160886a = jVar;
                        this.f160887b = 4;
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
                                            l14 = new Long(list2.get(i14).f187755a);
                                        } else {
                                            l14 = null;
                                        }
                                        arrayList2.add(l14);
                                        i14 = i15;
                                    }
                                    String strConcat4 = "Error quitting static plans ".concat(h0.k0(h0.Z(arrayList2), ",", null, null, null, 62));
                                    i2.a aVar6 = i2.f36769a;
                                    a2 a2Var4 = a2.GENERAL;
                                    aVar6.getClass();
                                    i2.a.f(a2Var4, "QuitActiveTrainingPlansUseCase", strConcat4);
                                    p2 p2Var18 = cVar.f160872d;
                                    g3 g3VarA10 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                                    this.f160888c = null;
                                    this.f160886a = null;
                                    this.f160887b = 6;
                                    p2Var18.k(null, g3VarA10);
                                    break;
                                }
                            }
                            p2 p2Var19 = cVar.f160872d;
                            g3.f35298f.getClass();
                            g3 g3VarD8 = g3.a.d(jVar);
                            this.f160888c = null;
                            this.f160886a = null;
                            this.f160887b = 5;
                            p2Var19.k(null, g3VarD8);
                        }
                        break;
                    }
                    return aVar;
                }
                if (v2Var2 instanceof v2.a) {
                    u0.r();
                    return null;
                }
                p2 p2Var110 = cVar.f160872d;
                g3 g3VarA11 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                this.f160888c = null;
                this.f160886a = null;
                this.f160887b = 8;
                p2Var110.k(null, g3VarA11);
                break;
                break;
            case 4:
                j jVar2 = this.f160886a;
                r.b(obj);
                jVar = jVar2;
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
                                l14 = new Long(list2.get(i14).f187755a);
                            } else {
                                l14 = null;
                            }
                            arrayList2.add(l14);
                            i14 = i15;
                        }
                        String strConcat5 = "Error quitting static plans ".concat(h0.k0(h0.Z(arrayList2), ",", null, null, null, 62));
                        i2.a aVar7 = i2.f36769a;
                        a2 a2Var5 = a2.GENERAL;
                        aVar7.getClass();
                        i2.a.f(a2Var5, "QuitActiveTrainingPlansUseCase", strConcat5);
                        p2 p2Var111 = cVar.f160872d;
                        g3 g3VarA12 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                        this.f160888c = null;
                        this.f160886a = null;
                        this.f160887b = 6;
                        p2Var111.k(null, g3VarA12);
                        break;
                    }
                }
                p2 p2Var112 = cVar.f160872d;
                g3.f35298f.getClass();
                g3 g3VarD9 = g3.a.d(jVar);
                this.f160888c = null;
                this.f160886a = null;
                this.f160887b = 5;
                p2Var112.k(null, g3VarD9);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                r.b(obj);
                return Unit.INSTANCE;
            default:
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
