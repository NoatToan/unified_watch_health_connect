package rz1;

import c22.j0;
import g22.k;
import hd1.k0;
import j53.l;
import java.util.Iterator;
import java.util.List;
import o13.p;
import o13.r;
import o13.u;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import oz1.s;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.i;
import r53.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements i<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f155221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f155222b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f155223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f155224b;

        /* JADX INFO: renamed from: rz1.e$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.trainingrediness.domain.GetTrainingReadinessKeyStatsDataUseCase$invoke$$inlined$map$1$2", f = "GetTrainingReadinessKeyStatsDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2943a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f155225a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f155226b;

            public C2943a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f155225a = obj;
                this.f155226b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, g gVar) {
            this.f155223a = jVar;
            this.f155224b = gVar;
        }

        /* JADX WARN: Code duplicated, block: B:109:0x0185  */
        /* JADX WARN: Code duplicated, block: B:112:0x018c  */
        /* JADX WARN: Code duplicated, block: B:113:0x0195  */
        /* JADX WARN: Code duplicated, block: B:116:0x019a  */
        /* JADX WARN: Code duplicated, block: B:117:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:119:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:121:0x01ac  */
        /* JADX WARN: Code duplicated, block: B:123:0x01b1  */
        /* JADX WARN: Code duplicated, block: B:125:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:127:0x01bd  */
        /* JADX WARN: Code duplicated, block: B:128:0x01c4  */
        /* JADX WARN: Code duplicated, block: B:135:0x01d9  */
        /* JADX WARN: Code duplicated, block: B:137:0x01e0  */
        /* JADX WARN: Code duplicated, block: B:138:0x01e5  */
        /* JADX WARN: Code duplicated, block: B:141:0x01ec  */
        /* JADX WARN: Code duplicated, block: B:144:0x01f3  */
        /* JADX WARN: Code duplicated, block: B:147:0x01fd  */
        /* JADX WARN: Code duplicated, block: B:151:0x0211  */
        /* JADX WARN: Code duplicated, block: B:154:0x022b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:174:0x0209 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:175:? A[LOOP:2: B:145:0x01f7->B:175:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2943a c2943a;
            oz1.b bVar;
            u13.a aVar;
            List list;
            u uVar;
            boolean z14;
            boolean z15;
            p pVar;
            boolean zBooleanValue;
            Float f14;
            oz1.u uVar2;
            s sVar;
            Boolean validSleep;
            i53.c cVarB;
            boolean zK;
            Boolean boolValueOf;
            h hVar;
            Iterator<T> it;
            List listN;
            T next;
            int i14;
            DateTime dateTimeS;
            T next2;
            if (dVar instanceof C2943a) {
                c2943a = (C2943a) dVar;
                int i15 = c2943a.f155226b;
                if ((i15 & Integer.MIN_VALUE) != 0) {
                    c2943a.f155226b = i15 - Integer.MIN_VALUE;
                } else {
                    c2943a = new C2943a(dVar);
                }
            } else {
                c2943a = new C2943a(dVar);
            }
            Object obj2 = c2943a.f155225a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i16 = c2943a.f155226b;
            if (i16 == 0) {
                r.b(obj2);
                j70.j jVar = (j70.j) obj;
                p pVar2 = (p) jVar.f97543b;
                String str = pVar2 != null ? (String) pVar2.f128594a : null;
                g gVar = this.f155224b;
                gVar.getClass();
                List list2 = (List) gVar.a(str, new f());
                if (list2 != null) {
                    Iterator<T> it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next2 = (T) null;
                            break;
                        }
                        next2 = it3.next();
                        DateTime dateTimeS2 = ((oz1.b) next2).s();
                        if (dateTimeS2 != null && k.k(dateTimeS2)) {
                            break;
                        }
                    }
                    bVar = next2;
                } else {
                    bVar = null;
                }
                k0 k0Var = (k0) jVar.f97544c;
                Float score = bVar != null ? bVar.getScore() : null;
                oz1.u.a aVar3 = oz1.u.f134627e;
                String level = bVar != null ? bVar.getLevel() : null;
                aVar3.getClass();
                oz1.u uVarA = oz1.u.a.a(level);
                s.a aVar4 = s.f134612d;
                String feedbackShort = bVar != null ? bVar.getFeedbackShort() : null;
                aVar4.getClass();
                s sVarA = s.a.a(feedbackShort);
                Float fValueOf = k0Var != null ? Float.valueOf(k0Var.f83386b) : null;
                oz1.u uVarB = oz1.u.a.b(k0Var != null ? Integer.valueOf(k0Var.f83387c) : null);
                s sVarB = s.a.b(k0Var != null ? Integer.valueOf(k0Var.f83388d) : null);
                DateTime dateTimeN = j0.N(bVar != null ? bVar.getTimestamp() : null, true);
                long millis = dateTimeN != null ? dateTimeN.getMillis() : 0L;
                long j8 = k0Var != null ? k0Var.f83396a : 0L;
                if (fValueOf == null || p005kotlin.jvm.internal.s.e(fValueOf, -1.0f) || uVarB == null || sVarB == null || j8 <= millis) {
                    aVar = aVar2;
                    list = list2;
                } else {
                    aVar = aVar2;
                    list = list2;
                    if (j0.E(j8, DateTimeUtils.currentTimeMillis())) {
                        uVar = new u(fValueOf, uVarB, sVarB);
                    }
                    z14 = false;
                    if (list != null || list.isEmpty()) {
                        z15 = false;
                    } else {
                        DateTime dateTimeNow = DateTime.now();
                        Iterator<T> it4 = list.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it4.next();
                            oz1.b bVar2 = (oz1.b) next;
                            DateTime dateTimeS3 = bVar2.s();
                            if (dateTimeS3 != null) {
                                i14 = 1;
                                if (k.k(dateTimeS3) && bVar2.k()) {
                                    break;
                                }
                            } else {
                                i14 = 1;
                            }
                            DateTime dateTimeS4 = bVar2.s();
                            if ((dateTimeS4 != null && k.f(dateTimeS4, dateTimeNow.minusDays(i14)) == i14 && bVar2.k()) || ((dateTimeS = bVar2.s()) != null && k.f(dateTimeS, dateTimeNow.minusDays(2)) && bVar2.k())) {
                                break;
                            }
                        }
                        if (next != null) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    }
                    pVar = (p) jVar.f97543b;
                    if (pVar != null) {
                        zBooleanValue = ((Boolean) pVar.f128595b).booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    yz1.d dVar2 = jVar.f97542a;
                    if (zBooleanValue) {
                        f14 = null;
                    } else {
                        f14 = (Float) uVar.f128605a;
                    }
                    if (zBooleanValue) {
                        uVar2 = oz1.u.RECENT_DIVE;
                    } else {
                        uVar2 = (oz1.u) uVar.f128606b;
                    }
                    oz1.u uVar3 = uVar2;
                    if (zBooleanValue) {
                        sVar = s.DO_NOT_EXERCISE;
                    } else {
                        sVar = (s) uVar.f128607c;
                    }
                    s sVar2 = sVar;
                    if (bVar != null) {
                        validSleep = bVar.getValidSleep();
                    } else {
                        validSleep = null;
                    }
                    if (bVar != null || (listN = oc.b.n(bVar, gVar.f155228a)) == null || (cVarB = i53.a.j(listN)) == null) {
                        cVarB = l.b();
                    }
                    i53.c cVar = cVarB;
                    if (bVar != null) {
                        zK = bVar.k();
                    } else {
                        zK = false;
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(zK);
                    if (list != null) {
                        if (!list.isEmpty()) {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (((oz1.b) it.next()).k()) {
                                    z14 = true;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z14);
                    } else {
                        boolValueOf = null;
                    }
                    hVar = new h(dVar2, f14, uVar3, sVar2, validSleep, cVar, boolValueOf2, boolValueOf, Boolean.valueOf(z15));
                    c2943a.f155226b = 1;
                    if (this.f155223a.emit(hVar, c2943a) == aVar) {
                        return aVar;
                    }
                }
                uVar = new u(score, uVarA, sVarA);
                z14 = false;
                if (list != null) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                pVar = (p) jVar.f97543b;
                if (pVar != null) {
                    zBooleanValue = ((Boolean) pVar.f128595b).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                yz1.d dVar3 = jVar.f97542a;
                if (zBooleanValue) {
                    f14 = (Float) uVar.f128605a;
                } else {
                    f14 = null;
                }
                if (zBooleanValue) {
                    uVar2 = (oz1.u) uVar.f128606b;
                } else {
                    uVar2 = oz1.u.RECENT_DIVE;
                }
                oz1.u uVar4 = uVar2;
                if (zBooleanValue) {
                    sVar = (s) uVar.f128607c;
                } else {
                    sVar = s.DO_NOT_EXERCISE;
                }
                s sVar3 = sVar;
                if (bVar != null) {
                    validSleep = bVar.getValidSleep();
                } else {
                    validSleep = null;
                }
                if (bVar != null) {
                    cVarB = l.b();
                } else {
                    cVarB = l.b();
                }
                i53.c cVar2 = cVarB;
                if (bVar != null) {
                    zK = bVar.k();
                } else {
                    zK = false;
                }
                Boolean boolValueOf3 = Boolean.valueOf(zK);
                if (list != null) {
                    if (!list.isEmpty()) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (((oz1.b) it.next()).k()) {
                                z14 = true;
                                break;
                            }
                        }
                    }
                    boolValueOf = Boolean.valueOf(z14);
                } else {
                    boolValueOf = null;
                }
                hVar = new h(dVar3, f14, uVar4, sVar3, validSleep, cVar2, boolValueOf3, boolValueOf, Boolean.valueOf(z15));
                c2943a.f155226b = 1;
                if (this.f155223a.emit(hVar, c2943a) == aVar) {
                    return aVar;
                }
            } else {
                if (i16 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public e(i iVar, g gVar) {
        this.f155221a = iVar;
        this.f155222b = gVar;
    }

    @Override // r53.i
    public final Object collect(j<? super h> jVar, t13.d dVar) {
        Object objCollect = this.f155221a.collect(new a(jVar, this.f155222b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
