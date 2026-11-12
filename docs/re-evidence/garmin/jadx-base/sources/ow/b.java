package ow;

import c53.a0;
import c53.c0;
import com.garmin.android.apps.connectmobile.R;
import e32.o;
import g22.k;
import i53.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import kw.g;
import kw.h;
import kw.l;
import kw.n;
import lc.u0;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import ot1.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.g0;
import p13.t0;
import p13.y;
import r53.i;
import r53.j;
import v13.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements i<kw.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f134279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ow.a f134280b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f134281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ow.a f134282b;

        /* JADX INFO: renamed from: ow.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @e(c = "com.garmin.android.apps.connectmobile.blood_pressure.domain.dashboard.GetBloodPressureDataUseCase$invoke$$inlined$map$1$2", f = "GetBloodPressureDataUseCase.kt", l = {76, 50}, m = "emit", v = 2)
        public static final class C2548a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f134283a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f134284b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public j f134286d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public j70.d f134287e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public h f134288f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public pw.a f134289g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public int f134290h;

            public C2548a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f134283a = obj;
                this.f134284b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, ow.a aVar) {
            this.f134281a = jVar;
            this.f134282b = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:174:0x036b, code lost:
        
            if (r13.emit(r18, r2) == r3) goto L175;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, t13.d dVar) {
            C2548a c2548a;
            j70.d dVar2;
            h hVar;
            pw.a aVar;
            j jVar;
            int i14;
            List<l> listD;
            l lVarPrevious;
            List<pw.a> listK;
            T next;
            n nVar;
            kw.j jVarValueOf;
            T next2;
            f fVarI;
            List<l> listD2;
            kw.b[] bVarArr;
            g gVar;
            g gVar2;
            Set<n> setB;
            T next3;
            if (dVar instanceof C2548a) {
                c2548a = (C2548a) dVar;
                int i15 = c2548a.f134284b;
                if ((i15 & Integer.MIN_VALUE) != 0) {
                    c2548a.f134284b = i15 - Integer.MIN_VALUE;
                } else {
                    c2548a = new C2548a(dVar);
                }
            } else {
                c2548a = new C2548a(dVar);
            }
            Object objC = c2548a.f134283a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i16 = c2548a.f134284b;
            ow.a aVar3 = this.f134282b;
            if (i16 != 0) {
                if (i16 == 1) {
                    i14 = c2548a.f134290h;
                    aVar = c2548a.f134289g;
                    hVar = c2548a.f134288f;
                    dVar2 = c2548a.f134287e;
                    jVar = c2548a.f134286d;
                    r.b(objC);
                } else {
                    if (i16 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(objC);
                }
                return Unit.INSTANCE;
            }
            r.b(objC);
            dVar2 = (j70.d) obj;
            String str = (String) dVar2.f97521b;
            aVar3.getClass();
            hVar = (h) aVar3.a(str, new c());
            if (hVar == null || (listD = hVar.d()) == null) {
                aVar = null;
            } else {
                ListIterator<l> listIterator = listD.listIterator(listD.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        lVarPrevious = null;
                        break;
                    }
                    lVarPrevious = listIterator.previous();
                    DateTime dateTimeQ = lVarPrevious.q();
                    if (dateTimeQ != null && k.k(dateTimeQ)) {
                        break;
                    }
                }
                l lVar = lVarPrevious;
                if (lVar == null || (listK = lVar.k()) == null) {
                    aVar = null;
                } else {
                    Iterator<T> it = listK.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            long jK = ((pw.a) next).k();
                            do {
                                T next4 = it.next();
                                long jK2 = ((pw.a) next4).k();
                                if (jK < jK2) {
                                    next = next4;
                                    jK = jK2;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = (T) null;
                    }
                    aVar = next;
                }
            }
            nw.a aVar4 = aVar3.f134275b;
            jVar = this.f134281a;
            c2548a.f134286d = jVar;
            c2548a.f134287e = dVar2;
            c2548a.f134288f = hVar;
            c2548a.f134289g = aVar;
            c2548a.f134290h = 0;
            c2548a.f134284b = 1;
            objC = aVar4.c(c2548a);
            if (objC != aVar2) {
                i14 = 0;
            }
            return aVar2;
            kw.e eVar = (kw.e) objC;
            if (eVar == null || (setB = eVar.b()) == null) {
                nVar = null;
            } else {
                Iterator<T> it3 = setB.iterator();
                loop0: while (true) {
                    if (!it3.hasNext()) {
                        next3 = (T) null;
                        break;
                    }
                    next3 = it3.next();
                    Set<String> setB2 = ((n) next3).b();
                    if (setB2 != null) {
                        Set<String> set = setB2;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (String str2 : set) {
                                String upperCase = aVar3.f134276c.toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                if (s.g(str2, upperCase)) {
                                    break loop0;
                                }
                            }
                        }
                    }
                }
                nVar = next3;
            }
            if (nVar == null) {
                jVarValueOf = kw.j.WORLD;
            } else {
                String upperCase2 = aVar3.f134276c.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                jVarValueOf = kw.j.valueOf(upperCase2);
            }
            aVar3.getClass();
            kw.b[] bVarArrValues = kw.b.values();
            ArrayList arrayList = new ArrayList();
            int length = bVarArrValues.length;
            int i17 = 0;
            while (i17 < length) {
                kw.b bVar = bVarArrValues[i17];
                int i18 = ow.a.C2547a.f134278b[jVarValueOf.ordinal()];
                kw.j jVar2 = jVarValueOf;
                if (i18 == 1) {
                    bVarArr = bVarArrValues;
                    int i19 = ow.a.C2547a.f134277a[bVar.ordinal()];
                    if (i19 == 1) {
                        gVar = new g("NORMAL", R.color.blood_pressure_category1, bVar);
                        gVar2 = gVar;
                    } else if (i19 == 2) {
                        gVar2 = new g("HIGH_NORMAL", R.color.blood_pressure_category2, bVar);
                    } else if (i19 == 3) {
                        gVar2 = new g("GRADE_1", R.color.blood_pressure_category3, bVar);
                    } else if (i19 == 4) {
                        gVar2 = new g("GRADE_2", R.color.blood_pressure_category4, bVar);
                    } else {
                        if (i19 != 5) {
                            u0.r();
                            return null;
                        }
                        gVar2 = null;
                    }
                } else {
                    if (i18 != 2) {
                        u0.r();
                        return null;
                    }
                    int i24 = ow.a.C2547a.f134277a[bVar.ordinal()];
                    bVarArr = bVarArrValues;
                    if (i24 == 1) {
                        gVar = new g("NORMAL", R.color.blood_pressure_category1, bVar);
                        gVar2 = gVar;
                    } else if (i24 == 2) {
                        gVar2 = new g("ELEVATED", R.color.blood_pressure_category2, bVar);
                    } else if (i24 == 3) {
                        gVar2 = new g("STAGE_1_HIGH", R.color.blood_pressure_category3, bVar);
                    } else if (i24 == 4) {
                        gVar2 = new g("STAGE_2_HIGH", R.color.blood_pressure_category4, bVar);
                    } else {
                        if (i24 != 5) {
                            u0.r();
                            return null;
                        }
                        gVar2 = new g("HYPERTENSIVE_CRISIS", R.color.blood_pressure_category5, bVar);
                    }
                }
                if (gVar2 != null) {
                    arrayList.add(gVar2);
                }
                i17++;
                jVarValueOf = jVar2;
                bVarArrValues = bVarArr;
            }
            int iA = t0.a(y.r(arrayList, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (Object obj2 : arrayList) {
                linkedHashMap.put(((g) obj2).f106854c, obj2);
            }
            Iterator<T> it4 = linkedHashMap.values().iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = (T) null;
                    break;
                }
                next2 = it4.next();
            } while (!s.g(((g) next2).f106852a, aVar != null ? aVar.getCategoryName() : null));
            g gVar3 = next2;
            Integer num = gVar3 != null ? new Integer(gVar3.f106853b) : null;
            LocalDate localDateMinusDays = LocalDate.now().minusDays(o.f62807j.f62819a - 1);
            if (hVar == null || (listD2 = hVar.d()) == null) {
                fVarI = null;
            } else {
                localDateMinusDays.getClass();
                Collection<g> collectionValues = linkedHashMap.values();
                int iA2 = t0.a(y.r(collectionValues, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
                for (g gVar4 : collectionValues) {
                    linkedHashMap2.put(gVar4.f106852a, Integer.valueOf(gVar4.f106853b));
                }
                fVarI = i53.a.i(c0.o(new a0(c0.h(c0.p(new g0(listD2), new o50.a(13, localDateMinusDays, linkedHashMap2)), new nw0.f(aVar3, 25)), new d()), new t(12)));
            }
            kw.a aVar5 = new kw.a(dVar2.f97520a, aVar != null ? aVar.getCategoryName() : null, num, aVar != null ? aVar.getSystolic() : null, aVar != null ? aVar.getDiastolic() : null, aVar != null ? new Long(aVar.j()) : null, fVarI);
            c2548a.f134286d = null;
            c2548a.f134287e = null;
            c2548a.f134288f = null;
            c2548a.f134289g = null;
            c2548a.f134290h = i14;
            c2548a.f134284b = 2;
        }
    }

    public b(i iVar, ow.a aVar) {
        this.f134279a = iVar;
        this.f134280b = aVar;
    }

    @Override // r53.i
    public final Object collect(j<? super kw.a> jVar, t13.d dVar) {
        Object objCollect = this.f134279a.collect(new a(jVar, this.f134280b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
