package hq;

import android.content.Context;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.json.internal.JsonDecodingException;
import okhttp3.HttpUrl;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.exercises.SelectExerciseViewModel$prepareResourceIfNecessary$1", f = "SelectExerciseViewModel.kt", l = {109, 111, 114, 115, 118, 122, 124}, m = "invokeSuspend", v = 2)
public final class b1 extends v13.i implements e23.p<androidx.lifecycle.t0<g3<? extends Boolean>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.stats.exercises.c f84968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f84970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.stats.exercises.c f84971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f84972e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.exercises.SelectExerciseViewModel$prepareResourceIfNecessary$1$2", f = "SelectExerciseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.stats.exercises.c f84973a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f84973a = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f84973a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String f123941c;
            Long lValueOf;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            int i14 = com.garmin.android.apps.connectmobile.activities.stats.exercises.c.A;
            com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVar = this.f84973a;
            cVar.getClass();
            try {
                c83.a0<String> a0VarExecute = ((ru1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC_WEB_URL, ru1.a.class, new c83.h.a[0], null, null, null, 120)).g().execute();
                if (a0VarExecute.f25745a.isSuccessful()) {
                    n63.b.a aVar2 = n63.b.f123892d;
                    String str = a0VarExecute.f25746b;
                    if (str == null) {
                        str = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                    }
                    aVar2.getClass();
                    Object obj2 = (n63.i) aVar2.c(n63.k.f123936a, str);
                    if (obj2 instanceof n63.c) {
                        for (n63.i iVar : (Iterable) obj2) {
                            if (iVar instanceof n63.x) {
                                n63.i iVar2 = (n63.i) ((n63.x) iVar).get("exerciseKey");
                                Integer numValueOf = null;
                                if (iVar2 != null) {
                                    n63.z zVarA = n63.j.a(iVar2);
                                    f123941c = zVarA instanceof n63.u ? null : zVarA.getF123941c();
                                }
                                n63.i iVar3 = (n63.i) ((n63.x) iVar).get("rank");
                                if (iVar3 != null) {
                                    try {
                                        lValueOf = Long.valueOf(n63.j.b(n63.j.a(iVar3)));
                                    } catch (JsonDecodingException unused) {
                                        lValueOf = null;
                                    }
                                    if (lValueOf != null) {
                                        long jLongValue = lValueOf.longValue();
                                        if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                                            numValueOf = Integer.valueOf((int) jLongValue);
                                        }
                                    }
                                }
                                if (f123941c != null && numValueOf != null) {
                                    cVar.f29906y.put(f123941c, numValueOf);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e4) {
                i2.a.q(i2.f36769a, "SelectExerciseViewModel: failed to fetch exercise priority list, error: " + e4.getMessage());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVar, Context context, t13.d<? super b1> dVar) {
        super(2, dVar);
        this.f84971d = cVar;
        this.f84972e = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b1 b1Var = new b1(this.f84971d, this.f84972e, dVar);
        b1Var.f84970c = obj;
        return b1Var;
    }

    @Override // e23.p
    public final Object invoke(androidx.lifecycle.t0<g3<? extends Boolean>> t0Var, t13.d<? super Unit> dVar) {
        return ((b1) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005c A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001e, B:10:0x0028, B:51:0x0108, B:13:0x002f, B:39:0x00a7, B:42:0x00c0, B:43:0x00ca, B:45:0x00d0, B:46:0x00eb, B:48:0x00f1, B:16:0x0036, B:35:0x0090, B:17:0x003a, B:29:0x007b, B:18:0x003e, B:24:0x0058, B:26:0x005c, B:31:0x007e, B:21:0x0045), top: B:59:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001e, B:10:0x0028, B:51:0x0108, B:13:0x002f, B:39:0x00a7, B:42:0x00c0, B:43:0x00ca, B:45:0x00d0, B:46:0x00eb, B:48:0x00f1, B:16:0x0036, B:35:0x0090, B:17:0x003a, B:29:0x007b, B:18:0x003e, B:24:0x0058, B:26:0x005c, B:31:0x007e, B:21:0x0045), top: B:59:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0 A[Catch: Exception -> 0x0023, LOOP:0: B:43:0x00ca->B:45:0x00d0, LOOP_END, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001e, B:10:0x0028, B:51:0x0108, B:13:0x002f, B:39:0x00a7, B:42:0x00c0, B:43:0x00ca, B:45:0x00d0, B:46:0x00eb, B:48:0x00f1, B:16:0x0036, B:35:0x0090, B:17:0x003a, B:29:0x007b, B:18:0x003e, B:24:0x0058, B:26:0x005c, B:31:0x007e, B:21:0x0045), top: B:59:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001e, B:10:0x0028, B:51:0x0108, B:13:0x002f, B:39:0x00a7, B:42:0x00c0, B:43:0x00ca, B:45:0x00d0, B:46:0x00eb, B:48:0x00f1, B:16:0x0036, B:35:0x0090, B:17:0x003a, B:29:0x007b, B:18:0x003e, B:24:0x0058, B:26:0x005c, B:31:0x007e, B:21:0x0045), top: B:59:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0107  */
    /* JADX WARN: Code duplicated, block: B:51:0x0108 A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001e, B:10:0x0028, B:51:0x0108, B:13:0x002f, B:39:0x00a7, B:42:0x00c0, B:43:0x00ca, B:45:0x00d0, B:46:0x00eb, B:48:0x00f1, B:16:0x0036, B:35:0x0090, B:17:0x003a, B:29:0x007b, B:18:0x003e, B:24:0x0058, B:26:0x005c, B:31:0x007e, B:21:0x0045), top: B:59:0x000c }] */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
    
        if (r1.emit(r12, r11) == r2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0137, code lost:
    
        if (r1.emit(r12, r11) == r2) goto L56;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVar;
        g3 g3VarA;
        com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVar2;
        Context context;
        int iA;
        LinkedHashMap linkedHashMap;
        p13.c.b bVar;
        x53.b bVar2;
        a aVar;
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) this.f84970c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f84969b;
        com.garmin.android.apps.connectmobile.activities.stats.exercises.c cVar3 = this.f84971d;
        try {
            switch (i14) {
                case 0:
                    o13.r.b(obj);
                    g3 g3VarC = g3.a.c(g3.f35298f);
                    this.f84970c = t0Var;
                    this.f84969b = 1;
                    if (t0Var.emit(g3VarC, this) != aVar2) {
                        if (cVar3.f29896m == null) {
                            a61.r rVar = cVar3.f29884a;
                            this.f84970c = t0Var;
                            this.f84968a = cVar3;
                            this.f84969b = 3;
                            obj = rVar.c(this);
                            if (obj == aVar2) {
                                cVar = cVar3;
                                com.garmin.android.apps.connectmobile.activities.stats.exercises.c.y4(cVar, (List) obj);
                                a61.r rVar2 = cVar3.f29884a;
                                this.f84970c = t0Var;
                                this.f84968a = cVar3;
                                this.f84969b = 4;
                                obj = rVar2.f(this);
                                if (obj != aVar2) {
                                    cVar2 = cVar3;
                                    cVar2.f29894k = ((com.garmin.android.apps.connectmobile.repcounting.model.f) obj).f41128c;
                                    w13.c cVar4 = qu1.a.f147897f;
                                    context = this.f84972e;
                                    iA = p13.t0.a(p13.y.r(cVar4, 10));
                                    if (iA < 16) {
                                        iA = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iA);
                                    bVar = new p13.c.b();
                                    while (bVar.hasNext()) {
                                        qu1.a aVar3 = (qu1.a) bVar.next();
                                        o13.p pVar = new o13.p(aVar3.f147898a, context.getString(aVar3.f147899b));
                                        linkedHashMap.put(pVar.f128594a, pVar.f128595b);
                                    }
                                    cVar3.f29895l = linkedHashMap;
                                    if (cVar3.f29885b) {
                                        g3.a aVar4 = g3.f35298f;
                                        Boolean bool = Boolean.TRUE;
                                        aVar4.getClass();
                                        g3 g3VarD = g3.a.d(bool);
                                        this.f84970c = t0Var;
                                        this.f84968a = null;
                                        this.f84969b = 6;
                                        break;
                                    } else {
                                        x53.c cVar5 = o53.s0.f129406a;
                                        bVar2 = x53.b.f189152a;
                                        aVar = new a(cVar3, null);
                                        this.f84970c = t0Var;
                                        this.f84968a = null;
                                        this.f84969b = 5;
                                        if (ge1.b.e0(bVar2, aVar, this) == aVar2) {
                                            g3.a aVar5 = g3.f35298f;
                                            Boolean bool2 = Boolean.TRUE;
                                            aVar5.getClass();
                                            g3 g3VarD2 = g3.a.d(bool2);
                                            this.f84970c = t0Var;
                                            this.f84968a = null;
                                            this.f84969b = 6;
                                            break;
                                        }
                                    }
                                }
                            }
                        } else {
                            g3VarA = g3.a.a(g3.f35298f, null, new IllegalArgumentException("Must set exerciseList before this."), null, null, 13);
                            this.f84970c = t0Var;
                            this.f84969b = 2;
                            if (t0Var.emit(g3VarA, this) == aVar2) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    return aVar2;
                case 1:
                    o13.r.b(obj);
                    if (cVar3.f29896m == null) {
                        a61.r rVar3 = cVar3.f29884a;
                        this.f84970c = t0Var;
                        this.f84968a = cVar3;
                        this.f84969b = 3;
                        obj = rVar3.c(this);
                        if (obj == aVar2) {
                            cVar = cVar3;
                            com.garmin.android.apps.connectmobile.activities.stats.exercises.c.y4(cVar, (List) obj);
                            a61.r rVar4 = cVar3.f29884a;
                            this.f84970c = t0Var;
                            this.f84968a = cVar3;
                            this.f84969b = 4;
                            obj = rVar4.f(this);
                            if (obj != aVar2) {
                                cVar2 = cVar3;
                                cVar2.f29894k = ((com.garmin.android.apps.connectmobile.repcounting.model.f) obj).f41128c;
                                w13.c cVar6 = qu1.a.f147897f;
                                context = this.f84972e;
                                iA = p13.t0.a(p13.y.r(cVar6, 10));
                                if (iA < 16) {
                                    iA = 16;
                                }
                                linkedHashMap = new LinkedHashMap(iA);
                                bVar = new p13.c.b();
                                while (bVar.hasNext()) {
                                    qu1.a aVar6 = (qu1.a) bVar.next();
                                    o13.p pVar2 = new o13.p(aVar6.f147898a, context.getString(aVar6.f147899b));
                                    linkedHashMap.put(pVar2.f128594a, pVar2.f128595b);
                                }
                                cVar3.f29895l = linkedHashMap;
                                if (cVar3.f29885b) {
                                    g3.a aVar7 = g3.f35298f;
                                    Boolean bool3 = Boolean.TRUE;
                                    aVar7.getClass();
                                    g3 g3VarD3 = g3.a.d(bool3);
                                    this.f84970c = t0Var;
                                    this.f84968a = null;
                                    this.f84969b = 6;
                                    break;
                                } else {
                                    x53.c cVar7 = o53.s0.f129406a;
                                    bVar2 = x53.b.f189152a;
                                    aVar = new a(cVar3, null);
                                    this.f84970c = t0Var;
                                    this.f84968a = null;
                                    this.f84969b = 5;
                                    if (ge1.b.e0(bVar2, aVar, this) == aVar2) {
                                        g3.a aVar8 = g3.f35298f;
                                        Boolean bool4 = Boolean.TRUE;
                                        aVar8.getClass();
                                        g3 g3VarD4 = g3.a.d(bool4);
                                        this.f84970c = t0Var;
                                        this.f84968a = null;
                                        this.f84969b = 6;
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        g3VarA = g3.a.a(g3.f35298f, null, new IllegalArgumentException("Must set exerciseList before this."), null, null, 13);
                        this.f84970c = t0Var;
                        this.f84969b = 2;
                        if (t0Var.emit(g3VarA, this) == aVar2) {
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar2;
                case 2:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                case 3:
                    cVar = this.f84968a;
                    o13.r.b(obj);
                    com.garmin.android.apps.connectmobile.activities.stats.exercises.c.y4(cVar, (List) obj);
                    a61.r rVar5 = cVar3.f29884a;
                    this.f84970c = t0Var;
                    this.f84968a = cVar3;
                    this.f84969b = 4;
                    obj = rVar5.f(this);
                    if (obj != aVar2) {
                        cVar2 = cVar3;
                        cVar2.f29894k = ((com.garmin.android.apps.connectmobile.repcounting.model.f) obj).f41128c;
                        w13.c cVar8 = qu1.a.f147897f;
                        context = this.f84972e;
                        iA = p13.t0.a(p13.y.r(cVar8, 10));
                        if (iA < 16) {
                            iA = 16;
                        }
                        linkedHashMap = new LinkedHashMap(iA);
                        bVar = new p13.c.b();
                        while (bVar.hasNext()) {
                            qu1.a aVar9 = (qu1.a) bVar.next();
                            o13.p pVar3 = new o13.p(aVar9.f147898a, context.getString(aVar9.f147899b));
                            linkedHashMap.put(pVar3.f128594a, pVar3.f128595b);
                        }
                        cVar3.f29895l = linkedHashMap;
                        if (cVar3.f29885b) {
                            g3.a aVar10 = g3.f35298f;
                            Boolean bool5 = Boolean.TRUE;
                            aVar10.getClass();
                            g3 g3VarD5 = g3.a.d(bool5);
                            this.f84970c = t0Var;
                            this.f84968a = null;
                            this.f84969b = 6;
                            break;
                        } else {
                            x53.c cVar9 = o53.s0.f129406a;
                            bVar2 = x53.b.f189152a;
                            aVar = new a(cVar3, null);
                            this.f84970c = t0Var;
                            this.f84968a = null;
                            this.f84969b = 5;
                            if (ge1.b.e0(bVar2, aVar, this) == aVar2) {
                                g3.a aVar11 = g3.f35298f;
                                Boolean bool6 = Boolean.TRUE;
                                aVar11.getClass();
                                g3 g3VarD6 = g3.a.d(bool6);
                                this.f84970c = t0Var;
                                this.f84968a = null;
                                this.f84969b = 6;
                                break;
                            }
                        }
                    }
                    return aVar2;
                case 4:
                    cVar2 = this.f84968a;
                    o13.r.b(obj);
                    cVar2.f29894k = ((com.garmin.android.apps.connectmobile.repcounting.model.f) obj).f41128c;
                    w13.c cVar10 = qu1.a.f147897f;
                    context = this.f84972e;
                    iA = p13.t0.a(p13.y.r(cVar10, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iA);
                    bVar = new p13.c.b();
                    while (bVar.hasNext()) {
                        qu1.a aVar12 = (qu1.a) bVar.next();
                        o13.p pVar4 = new o13.p(aVar12.f147898a, context.getString(aVar12.f147899b));
                        linkedHashMap.put(pVar4.f128594a, pVar4.f128595b);
                    }
                    cVar3.f29895l = linkedHashMap;
                    if (cVar3.f29885b) {
                        g3.a aVar13 = g3.f35298f;
                        Boolean bool7 = Boolean.TRUE;
                        aVar13.getClass();
                        g3 g3VarD7 = g3.a.d(bool7);
                        this.f84970c = t0Var;
                        this.f84968a = null;
                        this.f84969b = 6;
                        break;
                    } else {
                        x53.c cVar11 = o53.s0.f129406a;
                        bVar2 = x53.b.f189152a;
                        aVar = new a(cVar3, null);
                        this.f84970c = t0Var;
                        this.f84968a = null;
                        this.f84969b = 5;
                        if (ge1.b.e0(bVar2, aVar, this) == aVar2) {
                            g3.a aVar14 = g3.f35298f;
                            Boolean bool8 = Boolean.TRUE;
                            aVar14.getClass();
                            g3 g3VarD8 = g3.a.d(bool8);
                            this.f84970c = t0Var;
                            this.f84968a = null;
                            this.f84969b = 6;
                            break;
                        }
                    }
                    return aVar2;
                case 5:
                    o13.r.b(obj);
                    g3.a aVar15 = g3.f35298f;
                    Boolean bool9 = Boolean.TRUE;
                    aVar15.getClass();
                    g3 g3VarD9 = g3.a.d(bool9);
                    this.f84970c = t0Var;
                    this.f84968a = null;
                    this.f84969b = 6;
                    break;
                case 6:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                case 7:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Exception e4) {
            g3 g3VarA2 = g3.a.a(g3.f35298f, null, e4, null, null, 13);
            this.f84970c = null;
            this.f84968a = null;
            this.f84969b = 7;
        }
    }
}
