package qm1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import km1.s;
import km1.v;
import o13.p;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.i0;
import p13.h0;
import p13.j0;
import p13.t0;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements r53.i<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f145610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f145611b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f145612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f145613b;

        /* JADX INFO: renamed from: qm1.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.sleep.domain.dashboard.GetSleepDataUseCase$invoke$$inlined$map$1$2", f = "GetSleepDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2743a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f145614a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f145615b;

            public C2743a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f145614a = obj;
                this.f145615b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, j jVar2) {
            this.f145612a = jVar;
            this.f145613b = jVar2;
        }

        /* JADX WARN: Code duplicated, block: B:104:0x01ed  */
        /* JADX WARN: Code duplicated, block: B:106:0x01f1  */
        /* JADX WARN: Code duplicated, block: B:110:0x01fa  */
        /* JADX WARN: Code duplicated, block: B:113:0x0204  */
        /* JADX WARN: Code duplicated, block: B:120:0x021a  */
        /* JADX WARN: Code duplicated, block: B:124:0x0223  */
        /* JADX WARN: Code duplicated, block: B:127:0x022d  */
        /* JADX WARN: Code duplicated, block: B:129:0x0235  */
        /* JADX WARN: Code duplicated, block: B:130:0x023a  */
        /* JADX WARN: Code duplicated, block: B:132:0x023d  */
        /* JADX WARN: Code duplicated, block: B:133:0x023f  */
        /* JADX WARN: Code duplicated, block: B:140:0x0258 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:144:0x0247 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:145:0x020c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:149:0x01fe A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:152:0x0242 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:153:0x0247 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:156:? A[LOOP:2: B:125:0x0227->B:156:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2743a c2743a;
            k kVar;
            km1.c cVar;
            i53.f fVarB;
            boolean z14;
            Iterator<T> it;
            v vVar;
            int sleepTimeSeconds;
            boolean z15;
            boolean z16;
            Iterator<T> it3;
            v vVar2;
            jm1.c sleepScores;
            List<s> listA;
            v dailySleep;
            v dailySleep2;
            DateTime dateTime;
            DateTimeZone zone;
            DateTime dateTime2;
            DateTime dateTime3;
            v dailySleep3;
            rm1.b bVarA;
            v dailySleep4;
            if (dVar instanceof C2743a) {
                c2743a = (C2743a) dVar;
                int i14 = c2743a.f145615b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2743a.f145615b = i14 - Integer.MIN_VALUE;
                } else {
                    c2743a = new C2743a(dVar);
                }
            } else {
                c2743a = new C2743a(dVar);
            }
            Object obj2 = c2743a.f145614a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2743a.f145615b;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                List list = (List) dVar2.f97521b;
                Integer num = null;
                String str = list != null ? (String) h0.d0(list) : null;
                j jVar = this.f145613b;
                jVar.getClass();
                bv.d dVar3 = jVar.f145619b;
                km1.c cVar2 = (km1.c) jVar.a(str, new g());
                List list2 = (List) dVar2.f97521b;
                Collection collection = (List) jVar.a(list2 != null ? (String) h0.n0(list2) : null, new h());
                if (collection == null) {
                    collection = j0.f134944a;
                }
                boolean zE = (cVar2 == null || (dailySleep4 = cVar2.getDailySleep()) == null) ? false : ql1.c.e(dailySleep4);
                p pVar = (cVar2 == null || (dailySleep3 = cVar2.getDailySleep()) == null || (bVarA = ql1.c.a(dailySleep3, dVar3.h(), dVar3.d())) == null) ? null : new p(bVarA.f153532a, bVarA.f153533b);
                p pVar2 = new p((pVar == null || (dateTime3 = (DateTime) pVar.f128594a) == null) ? null : new Long(dateTime3.getMillis()), (pVar == null || (dateTime2 = (DateTime) pVar.f128595b) == null) ? null : new Long(dateTime2.getMillis()));
                String id3 = (pVar == null || (dateTime = (DateTime) pVar.f128594a) == null || (zone = dateTime.getZone()) == null) ? null : zone.getID();
                boolean z17 = (cVar2 == null || (dailySleep2 = cVar2.getDailySleep()) == null || !dailySleep2.getSleepFromDevice()) ? false : true;
                yz1.d dVar4 = dVar2.f97520a;
                Integer numF0 = cVar2 != null ? cVar2.f0() : null;
                if (cVar2 != null && (dailySleep = cVar2.getDailySleep()) != null) {
                    num = new Integer(dailySleep.getSleepTimeSeconds());
                }
                Integer num2 = num;
                if (cVar2 == null || (listA = cVar2.A()) == null) {
                    cVar = cVar2;
                } else {
                    Iterator<T> it4 = listA.iterator();
                    int iB = 0;
                    while (it4.hasNext()) {
                        iB = ((s) it4.next()).b() + iB;
                    }
                    if (zE) {
                        fVarB = i53.a.a(new n(rl1.k.MANUAL, 1.0f));
                        cVar = cVar2;
                    } else {
                        ArrayList arrayList = new ArrayList(y.r(listA, 10));
                        Iterator<T> it5 = listA.iterator();
                        while (it5.hasNext()) {
                            s sVar = (s) it5.next();
                            i iVar = new i0() { // from class: qm1.i
                                @Override // p005kotlin.jvm.internal.i0, k23.n
                                public final Object get(Object obj3) {
                                    return Integer.valueOf(((rl1.k) obj3).f153447a);
                                }
                            };
                            ArrayList arrayList2 = arrayList;
                            Integer numValueOf = Integer.valueOf((int) sVar.getSleepActivityLevel());
                            rl1.k[] kVarArrValues = rl1.k.values();
                            Iterator<T> it6 = it5;
                            int iA = t0.a(kVarArrValues.length);
                            km1.c cVar3 = cVar2;
                            if (iA < 16) {
                                iA = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                            int length = kVarArrValues.length;
                            int i16 = 0;
                            while (i16 < length) {
                                int i17 = length;
                                rl1.k kVar2 = kVarArrValues[i16];
                                linkedHashMap.put(iVar.invoke(kVar2), kVar2);
                                i16++;
                                length = i17;
                            }
                            rl1.k kVar3 = (rl1.k) ((Enum) linkedHashMap.get(numValueOf));
                            if (kVar3 == null) {
                                kVar3 = rl1.k.NO_LEVELS;
                            }
                            arrayList2.add(new n(kVar3, sVar.b() / iB));
                            arrayList = arrayList2;
                            it5 = it6;
                            cVar2 = cVar3;
                        }
                        cVar = cVar2;
                        fVarB = i53.a.j(arrayList);
                    }
                    if (fVarB == null) {
                    }
                    i53.f fVar = fVarB;
                    if (cVar == null && cVar.z0()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z17) {
                        if (collection != null || !collection.isEmpty()) {
                            it3 = collection.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    vVar2 = (v) it3.next();
                                    if (vVar2 == null && (sleepScores = vVar2.getSleepScores()) != null && sleepScores.o()) {
                                        z16 = true;
                                    }
                                }
                            }
                        }
                        z16 = false;
                    } else {
                        if (collection != null || !collection.isEmpty()) {
                            it = collection.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    vVar = (v) it.next();
                                    if (vVar != null) {
                                        sleepTimeSeconds = vVar.getSleepTimeSeconds();
                                    } else {
                                        sleepTimeSeconds = 0;
                                    }
                                    if (sleepTimeSeconds > 0) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z15) {
                                        z16 = true;
                                    }
                                }
                            }
                        }
                        z16 = false;
                    }
                    kVar = new k(dVar4, numF0, num2, fVar, pVar2, id3, z14, z17, z16);
                    c2743a.f145615b = 1;
                    if (this.f145612a.emit(kVar, c2743a) == aVar) {
                        return aVar;
                    }
                }
                fVarB = j53.l.b();
                i53.f fVar2 = fVarB;
                if (cVar == null) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                if (z17) {
                    if (collection != null) {
                        it3 = collection.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                vVar2 = (v) it3.next();
                                if (vVar2 == null) {
                                }
                            }
                        }
                    } else {
                        it3 = collection.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                vVar2 = (v) it3.next();
                                if (vVar2 == null) {
                                }
                            }
                        }
                    }
                    z16 = false;
                } else {
                    if (collection != null) {
                        it = collection.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                vVar = (v) it.next();
                                if (vVar != null) {
                                    sleepTimeSeconds = vVar.getSleepTimeSeconds();
                                } else {
                                    sleepTimeSeconds = 0;
                                }
                                if (sleepTimeSeconds > 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    z16 = true;
                                }
                            }
                        }
                    } else {
                        it = collection.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                vVar = (v) it.next();
                                if (vVar != null) {
                                    sleepTimeSeconds = vVar.getSleepTimeSeconds();
                                } else {
                                    sleepTimeSeconds = 0;
                                }
                                if (sleepTimeSeconds > 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    z16 = true;
                                }
                            }
                        }
                    }
                    z16 = false;
                }
                kVar = new k(dVar4, numF0, num2, fVar2, pVar2, id3, z14, z17, z16);
                c2743a.f145615b = 1;
                if (this.f145612a.emit(kVar, c2743a) == aVar) {
                    return aVar;
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

    public f(r53.i iVar, j jVar) {
        this.f145610a = iVar;
        this.f145611b = jVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super k> jVar, t13.d dVar) {
        Object objCollect = this.f145610a.collect(new a(jVar, this.f145611b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
