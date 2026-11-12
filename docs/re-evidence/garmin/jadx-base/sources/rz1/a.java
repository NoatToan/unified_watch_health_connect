package rz1;

import c22.j0;
import ch.qos.logback.core.net.SyslogConstants;
import g22.k;
import hd1.k0;
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
public final class a implements i<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f155212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f155213b;

    /* JADX INFO: renamed from: rz1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2941a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f155214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f155215b;

        /* JADX INFO: renamed from: rz1.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.trainingrediness.domain.GetTrainingReadinessDataUseCase$invoke$$inlined$map$1$2", f = "GetTrainingReadinessDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2942a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f155216a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f155217b;

            public C2942a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f155216a = obj;
                this.f155217b |= Integer.MIN_VALUE;
                return C2941a.this.emit(null, this);
            }
        }

        public C2941a(j jVar, d dVar) {
            this.f155214a = jVar;
            this.f155215b = dVar;
        }

        /* JADX WARN: Code duplicated, block: B:107:0x017f  */
        /* JADX WARN: Code duplicated, block: B:110:0x0186  */
        /* JADX WARN: Code duplicated, block: B:111:0x018f  */
        /* JADX WARN: Code duplicated, block: B:113:0x0192  */
        /* JADX WARN: Code duplicated, block: B:121:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:123:0x01b7  */
        /* JADX WARN: Code duplicated, block: B:125:0x01bd  */
        /* JADX WARN: Code duplicated, block: B:127:0x01c2  */
        /* JADX WARN: Code duplicated, block: B:129:0x01c8  */
        /* JADX WARN: Code duplicated, block: B:131:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:132:0x01d3  */
        /* JADX WARN: Code duplicated, block: B:135:0x01f5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2942a c2942a;
            oz1.b bVar;
            u13.a aVar;
            List list;
            u uVar;
            boolean z14;
            p pVar;
            boolean zBooleanValue;
            Float f14;
            oz1.u uVar2;
            s sVar;
            Boolean validSleep;
            Object objEmit;
            u13.a aVar2;
            Float f15;
            T next;
            DateTime dateTimeS;
            DateTime dateTimeS2;
            T next2;
            if (dVar instanceof C2942a) {
                c2942a = (C2942a) dVar;
                int i14 = c2942a.f155217b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2942a.f155217b = i14 - Integer.MIN_VALUE;
                } else {
                    c2942a = new C2942a(dVar);
                }
            } else {
                c2942a = new C2942a(dVar);
            }
            Object obj2 = c2942a.f155216a;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2942a.f155217b;
            if (i15 == 0) {
                r.b(obj2);
                j70.j jVar = (j70.j) obj;
                p pVar2 = (p) jVar.f97543b;
                String str = pVar2 != null ? (String) pVar2.f128594a : null;
                d dVar2 = this.f155215b;
                dVar2.getClass();
                List list2 = (List) dVar2.a(str, new c());
                if (list2 != null) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = (T) null;
                            break;
                        }
                        next2 = it.next();
                        DateTime dateTimeS3 = ((oz1.b) next2).s();
                        if (dateTimeS3 != null && k.k(dateTimeS3)) {
                            break;
                        }
                    }
                    bVar = next2;
                } else {
                    bVar = null;
                }
                k0 k0Var = (k0) jVar.f97544c;
                Float score = bVar != null ? bVar.getScore() : null;
                oz1.u.a aVar4 = oz1.u.f134627e;
                String level = bVar != null ? bVar.getLevel() : null;
                aVar4.getClass();
                oz1.u uVarA = oz1.u.a.a(level);
                s.a aVar5 = s.f134612d;
                String feedbackShort = bVar != null ? bVar.getFeedbackShort() : null;
                aVar5.getClass();
                s sVarA = s.a.a(feedbackShort);
                Float fValueOf = k0Var != null ? Float.valueOf(k0Var.f83386b) : null;
                oz1.u uVarB = oz1.u.a.b(k0Var != null ? Integer.valueOf(k0Var.f83387c) : null);
                s sVarB = s.a.b(k0Var != null ? Integer.valueOf(k0Var.f83388d) : null);
                DateTime dateTimeN = j0.N(bVar != null ? bVar.getTimestamp() : null, true);
                long millis = dateTimeN != null ? dateTimeN.getMillis() : 0L;
                long j8 = k0Var != null ? k0Var.f83396a : 0L;
                if (fValueOf == null || p005kotlin.jvm.internal.s.e(fValueOf, -1.0f) || uVarB == null || sVarB == null || j8 <= millis) {
                    aVar = aVar3;
                    list = list2;
                } else {
                    aVar = aVar3;
                    list = list2;
                    if (j0.E(j8, DateTimeUtils.currentTimeMillis())) {
                        uVar = new u(fValueOf, uVarB, sVarB);
                    }
                    if (list != null || list.isEmpty()) {
                        z14 = false;
                    } else {
                        DateTime dateTimeNow = DateTime.now();
                        Iterator<T> it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it3.next();
                            oz1.b bVar2 = (oz1.b) next;
                            DateTime dateTimeS4 = bVar2.s();
                            if ((dateTimeS4 != null && k.k(dateTimeS4) && bVar2.k()) || (((dateTimeS = bVar2.s()) != null && k.f(dateTimeS, dateTimeNow.minusDays(1)) && bVar2.k()) || ((dateTimeS2 = bVar2.s()) != null && k.f(dateTimeS2, dateTimeNow.minusDays(2)) && bVar2.k()))) {
                                break;
                            }
                        }
                        if (next != null) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    pVar = (p) jVar.f97543b;
                    if (pVar != null) {
                        zBooleanValue = ((Boolean) pVar.f128595b).booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    boolean zK = bVar != null ? bVar.k() : false;
                    yz1.d dVarA = yz1.e.a(jVar.f97542a, new b(zK));
                    if (!zBooleanValue || (f15 = (Float) uVar.f128605a) == null || f15.floatValue() < 0.0f) {
                        f14 = null;
                    } else {
                        f14 = f15;
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
                    h hVar = new h(dVarA, f14, uVar3, sVar2, validSleep, null, Boolean.valueOf(zK), null, Boolean.valueOf(z14), SyslogConstants.LOG_LOCAL4, null);
                    c2942a.f155217b = 1;
                    objEmit = this.f155214a.emit(hVar, c2942a);
                    aVar2 = aVar;
                    if (objEmit == aVar2) {
                        return aVar2;
                    }
                }
                uVar = new u(score, uVarA, sVarA);
                if (list != null) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                pVar = (p) jVar.f97543b;
                if (pVar != null) {
                    zBooleanValue = ((Boolean) pVar.f128595b).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (bVar != null) {
                }
                yz1.d dVarA2 = yz1.e.a(jVar.f97542a, new b(zK));
                if (zBooleanValue) {
                    f14 = null;
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
                h hVar2 = new h(dVarA2, f14, uVar4, sVar3, validSleep, null, Boolean.valueOf(zK), null, Boolean.valueOf(z14), SyslogConstants.LOG_LOCAL4, null);
                c2942a.f155217b = 1;
                objEmit = this.f155214a.emit(hVar2, c2942a);
                aVar2 = aVar;
                if (objEmit == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public a(i iVar, d dVar) {
        this.f155212a = iVar;
        this.f155213b = dVar;
    }

    @Override // r53.i
    public final Object collect(j<? super h> jVar, t13.d dVar) {
        Object objCollect = this.f155212a.collect(new C2941a(jVar, this.f155213b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
