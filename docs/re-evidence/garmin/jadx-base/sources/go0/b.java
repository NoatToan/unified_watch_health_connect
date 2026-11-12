package go0;

import e32.o;
import g22.k;
import hd1.a0;
import i53.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.x;
import p13.y;
import r53.i;
import r53.j;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements i<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f78182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ go0.a f78183b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f78184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ go0.a f78185b;

        /* JADX INFO: renamed from: go0.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.heartrate.domain.dashboard.GetHeartRateDataUseCase$invoke$$inlined$map$1$2", f = "GetHeartRateDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C1578a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f78186a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f78187b;

            public C1578a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f78186a = obj;
                this.f78187b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, go0.a aVar) {
            this.f78184a = jVar;
            this.f78185b = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x01f5  */
        /* JADX WARN: Code duplicated, block: B:102:0x01f7  */
        /* JADX WARN: Code duplicated, block: B:104:0x01fb  */
        /* JADX WARN: Code duplicated, block: B:106:0x01ff  */
        /* JADX WARN: Code duplicated, block: B:107:0x0207  */
        /* JADX WARN: Code duplicated, block: B:108:0x0209  */
        /* JADX WARN: Code duplicated, block: B:125:0x0241 A[EDGE_INSN: B:125:0x0241->B:126:0x0243 BREAK  A[LOOP:3: B:120:0x022c->B:264:?]] */
        /* JADX WARN: Code duplicated, block: B:128:0x0247 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:129:0x0249  */
        /* JADX WARN: Code duplicated, block: B:132:0x0251  */
        /* JADX WARN: Code duplicated, block: B:134:0x025b  */
        /* JADX WARN: Code duplicated, block: B:135:0x025e  */
        /* JADX WARN: Code duplicated, block: B:138:0x026d A[LOOP:5: B:136:0x0267->B:138:0x026d, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:143:0x029e A[LOOP:4: B:141:0x0298->B:143:0x029e, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:144:0x02b5  */
        /* JADX WARN: Code duplicated, block: B:156:0x02ee  */
        /* JADX WARN: Code duplicated, block: B:159:0x02f4  */
        /* JADX WARN: Code duplicated, block: B:160:0x02ff  */
        /* JADX WARN: Code duplicated, block: B:162:0x0302  */
        /* JADX WARN: Code duplicated, block: B:163:0x030d  */
        /* JADX WARN: Code duplicated, block: B:165:0x0310  */
        /* JADX WARN: Code duplicated, block: B:166:0x0317  */
        /* JADX WARN: Code duplicated, block: B:169:0x031f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:170:0x0321  */
        /* JADX WARN: Code duplicated, block: B:171:0x0326  */
        /* JADX WARN: Code duplicated, block: B:173:0x0329  */
        /* JADX WARN: Code duplicated, block: B:176:0x0338 A[LOOP:6: B:175:0x0336->B:176:0x0338, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:179:0x035d  */
        /* JADX WARN: Code duplicated, block: B:182:0x036c  */
        /* JADX WARN: Code duplicated, block: B:184:0x0379  */
        /* JADX WARN: Code duplicated, block: B:185:0x037e  */
        /* JADX WARN: Code duplicated, block: B:187:0x0382  */
        /* JADX WARN: Code duplicated, block: B:189:0x0386  */
        /* JADX WARN: Code duplicated, block: B:190:0x038b  */
        /* JADX WARN: Code duplicated, block: B:192:0x038f  */
        /* JADX WARN: Code duplicated, block: B:193:0x0391  */
        /* JADX WARN: Code duplicated, block: B:195:0x0395  */
        /* JADX WARN: Code duplicated, block: B:197:0x039c  */
        /* JADX WARN: Code duplicated, block: B:199:0x039f  */
        /* JADX WARN: Code duplicated, block: B:202:0x03ae  */
        /* JADX WARN: Code duplicated, block: B:204:0x03b8  */
        /* JADX WARN: Code duplicated, block: B:205:0x03c1  */
        /* JADX WARN: Code duplicated, block: B:210:0x03e2  */
        /* JADX WARN: Code duplicated, block: B:212:0x03ec  */
        /* JADX WARN: Code duplicated, block: B:216:0x040e  */
        /* JADX WARN: Code duplicated, block: B:217:0x041d  */
        /* JADX WARN: Code duplicated, block: B:219:0x0423  */
        /* JADX WARN: Code duplicated, block: B:222:0x0432  */
        /* JADX WARN: Code duplicated, block: B:224:0x043c  */
        /* JADX WARN: Code duplicated, block: B:225:0x0446  */
        /* JADX WARN: Code duplicated, block: B:228:0x044d  */
        /* JADX WARN: Code duplicated, block: B:230:0x0450  */
        /* JADX WARN: Code duplicated, block: B:231:0x045c  */
        /* JADX WARN: Code duplicated, block: B:237:0x0485  */
        /* JADX WARN: Code duplicated, block: B:244:0x0497  */
        /* JADX WARN: Code duplicated, block: B:245:0x04a3  */
        /* JADX WARN: Code duplicated, block: B:249:0x04c0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:270:0x0398 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:274:0x03ff A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:275:0x0449 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:278:0x042c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
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
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C1578a c1578a;
            Object objPrevious;
            Integer num;
            double d14;
            List listM0;
            int i14;
            boolean z14;
            List<gs1.d.b> listF;
            gs1.d.b bVar;
            Integer num2;
            boolean z15;
            yz1.d dVar2;
            List<gs1.d.b> listF2;
            int size;
            ArrayList arrayList;
            int i15;
            DateTime dateTimeNow;
            DateTime dateTimeMinusHours;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList<gs1.d.b> arrayList4;
            Integer num3;
            Integer num4;
            ArrayList arrayList5;
            Long lValueOf;
            float fFloatValue;
            float fFloatValue2;
            Long lValueOf2;
            e aVar;
            Float fQ0;
            Float fV0;
            Iterator<T> it;
            Integer num5;
            Float fValueOf;
            LinkedHashMap linkedHashMap;
            DateTime dateTime;
            Long lValueOf3;
            Integer num6;
            Integer num7;
            Iterator<T> it3;
            T next;
            gs1.d.b bVar2;
            DateTime dateTime2;
            boolean zIsAfter;
            boolean z16;
            DateTime dateTime3;
            boolean zIsBefore;
            Float fQ1;
            ArrayList arrayList6;
            Float fValueOf2;
            Long lValueOf4;
            Long lValueOf5;
            i53.c cVarE;
            Iterator<T> it4;
            ArrayList arrayList7;
            T next2;
            Iterable iterable;
            Iterator<T> it5;
            a0 a0Var;
            T next3;
            List listK;
            Iterator<T> it6;
            co0.b bVar3;
            hs1.e heartRate;
            if (dVar instanceof C1578a) {
                c1578a = (C1578a) dVar;
                int i16 = c1578a.f78187b;
                if ((i16 & Integer.MIN_VALUE) != 0) {
                    c1578a.f78187b = i16 - Integer.MIN_VALUE;
                } else {
                    c1578a = new C1578a(dVar);
                }
            } else {
                c1578a = new C1578a(dVar);
            }
            Object obj2 = c1578a.f78186a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i17 = c1578a.f78187b;
            if (i17 == 0) {
                r.b(obj2);
                j70.j jVar = (j70.j) obj;
                go0.a aVar3 = this.f78185b;
                ae0.b bVar4 = aVar3.f78180b;
                ServerData serverdata = jVar.f97543b;
                RealtimeData realtimedata = jVar.f97544c;
                List list = (List) serverdata;
                List listA = ae0.b.a(list != null ? (String) h0.d0(list) : null, o.f62807j);
                ListIterator listIterator = listA.listIterator(listA.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    LocalDate localDateB = ((hs1.d) objPrevious).b();
                    if (localDateB != null && k.g(localDateB, LocalDate.now())) {
                        break;
                    }
                }
                hs1.d dVar3 = (hs1.d) objPrevious;
                if (dVar3 == null || (heartRate = dVar3.getHeartRate()) == null || (num = heartRate.getRestingValue()) == null) {
                    a0 a0Var2 = (a0) realtimedata;
                    num = a0Var2 != null ? new Integer(a0Var2.f83365d) : null;
                }
                List list2 = (List) serverdata;
                gs1.d.c cVar = (gs1.d.c) aVar3.a(list2 != null ? (String) h0.e0(1, list2) : null, new c());
                String str = list2 != null ? (String) h0.e0(2, list2) : null;
                double d15 = 30.0d;
                Double dValueOf = Double.valueOf(30.0d);
                List list3 = (List) aVar3.a(str, new d());
                if (list3 != null) {
                    Iterator<T> it7 = list3.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            d14 = d15;
                            next3 = (T) null;
                            break;
                        }
                        next3 = it7.next();
                        co0.b.a aVar4 = co0.b.f28120b;
                        String sport = ((co0.e) next3).getSport();
                        aVar4.getClass();
                        d14 = d15;
                        co0.b[] bVarArrValues = co0.b.values();
                        int length = bVarArrValues.length;
                        int i18 = 0;
                        while (true) {
                            if (i18 >= length) {
                                it6 = it7;
                                bVar3 = null;
                                break;
                            }
                            bVar3 = bVarArrValues[i18];
                            it6 = it7;
                            if (s.g(bVar3.f28123a, sport)) {
                                break;
                            }
                            i18++;
                            it7 = it6;
                        }
                        if (bVar3 == co0.b.DEFAULT) {
                            break;
                        }
                        it7 = it6;
                        d15 = d14;
                    }
                    co0.e eVar = next3;
                    if (eVar != null) {
                        Integer zone1Floor = eVar.getZone1Floor();
                        int iIntValue = zone1Floor != null ? zone1Floor.intValue() : 90;
                        Integer zone2Floor = eVar.getZone2Floor();
                        int iIntValue2 = zone2Floor != null ? zone2Floor.intValue() : 110;
                        Integer zone3Floor = eVar.getZone3Floor();
                        int iIntValue3 = zone3Floor != null ? zone3Floor.intValue() : 130;
                        Integer zone4Floor = eVar.getZone4Floor();
                        int iIntValue4 = zone4Floor != null ? zone4Floor.intValue() : 150;
                        Integer zone5Floor = eVar.getZone5Floor();
                        int iIntValue5 = zone5Floor != null ? zone5Floor.intValue() : 165;
                        Integer maxHeartRateUsed = eVar.getMaxHeartRateUsed();
                        int iIntValue6 = maxHeartRateUsed != null ? maxHeartRateUsed.intValue() : 165;
                        if (iIntValue6 > iIntValue5) {
                            i14 = 10;
                            listK = x.k(dValueOf, Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue6));
                        } else {
                            i14 = 10;
                            listK = x.k(dValueOf, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5));
                        }
                        ArrayList arrayList8 = new ArrayList(y.r(listK, i14));
                        Iterator<T> it8 = listK.iterator();
                        while (it8.hasNext()) {
                            arrayList8.add(Float.valueOf(((Number) it8.next()).floatValue()));
                        }
                        listM0 = h0.M0(arrayList8);
                    }
                    if (aVar3.f78181c.C3() > 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        a0Var = (a0) realtimedata;
                        if (a0Var != null) {
                            num2 = new Integer(a0Var.f83364c);
                        } else {
                            num2 = null;
                        }
                    } else if (cVar != null || (listF = cVar.f()) == null || (bVar = (gs1.d.b) h0.n0(listF)) == null) {
                        num2 = null;
                    } else {
                        num2 = bVar.f78714b;
                    }
                    if (!listA.isEmpty() && !listA.isEmpty()) {
                        Iterator<T> it9 = listA.iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                z15 = false;
                                break;
                            }
                            if (((hs1.d) it9.next()).getHeartRate() != null) {
                                z15 = true;
                                break;
                            }
                        }
                    } else {
                        z15 = false;
                        break;
                    }
                    dVar2 = jVar.f97542a;
                    if (z14) {
                        if (listM0 == null) {
                            listM0 = j0.f134944a;
                        }
                        fQ1 = h0.q0(listM0);
                        if (fQ1 != null) {
                            it4 = listM0.iterator();
                            if (it4.hasNext()) {
                                arrayList7 = new ArrayList();
                                next2 = it4.next();
                                while (it4.hasNext()) {
                                    T next4 = it4.next();
                                    arrayList7.add(Float.valueOf(((Number) next4).floatValue() - next2.floatValue()));
                                    next2 = next4;
                                }
                                iterable = arrayList7;
                            } else {
                                iterable = j0.f134944a;
                            }
                            Iterable iterable2 = iterable;
                            arrayList6 = new ArrayList(y.r(iterable2, i14));
                            it5 = iterable2.iterator();
                            while (it5.hasNext()) {
                                arrayList6.add(Float.valueOf(((Number) it5.next()).floatValue() / fQ1.floatValue()));
                            }
                        } else {
                            arrayList6 = null;
                        }
                        if (num2 != null || fQ1 == null || num2.intValue() < d14 || fQ1.floatValue() <= d14) {
                            fValueOf2 = null;
                        } else {
                            fValueOf2 = Float.valueOf(((float) num2.intValue()) > fQ1.floatValue() ? 1.0f : num2.intValue() / fQ1.floatValue());
                        }
                        if (num2 != null) {
                            lValueOf4 = Long.valueOf(num2.intValue());
                        } else {
                            lValueOf4 = null;
                        }
                        if (num != null) {
                            lValueOf5 = Long.valueOf(num.intValue());
                        } else {
                            lValueOf5 = null;
                        }
                        if (arrayList6 != null) {
                            cVarE = i53.a.e(arrayList6);
                        } else {
                            cVarE = null;
                        }
                        aVar = new e.b(dVar2, lValueOf4, lValueOf5, cVarE, fValueOf2, z15);
                    } else {
                        if (cVar != null) {
                            listF2 = cVar.f();
                        } else {
                            listF2 = null;
                        }
                        if (listM0 == null) {
                            listM0 = j0.f134944a;
                        }
                        size = listM0.size();
                        arrayList = new ArrayList(size);
                        for (i15 = 0; i15 < size; i15++) {
                            arrayList.add(Integer.valueOf(df0.b.a(i15)));
                        }
                        dateTimeNow = DateTime.now(DateTimeZone.UTC);
                        dateTimeMinusHours = dateTimeNow.minusHours(4);
                        arrayList2 = new ArrayList();
                        arrayList3 = new ArrayList();
                        if (listF2 != null) {
                            arrayList4 = new ArrayList();
                            it3 = listF2.iterator();
                            while (it3.hasNext()) {
                                next = it3.next();
                                bVar2 = (gs1.d.b) next;
                                Iterator<T> it10 = it3;
                                dateTime2 = bVar2.f78713a;
                                if (dateTime2 != null) {
                                    zIsAfter = dateTime2.isAfter(dateTimeMinusHours);
                                } else {
                                    zIsAfter = false;
                                }
                                if (zIsAfter) {
                                    dateTime3 = bVar2.f78713a;
                                    if (dateTime3 != null) {
                                        zIsBefore = dateTime3.isBefore(dateTimeNow);
                                    } else {
                                        zIsBefore = false;
                                    }
                                    if (zIsBefore) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    arrayList4.add(next);
                                }
                                it3 = it10;
                            }
                        } else {
                            arrayList4 = null;
                        }
                        if (arrayList4 != null) {
                            linkedHashMap = new LinkedHashMap();
                            for (gs1.d.b bVar5 : arrayList4) {
                                dateTime = bVar5.f78713a;
                                if (dateTime != null) {
                                    lValueOf3 = Long.valueOf(dateTime.getMillis());
                                } else {
                                    lValueOf3 = null;
                                }
                                Integer num8 = bVar5.f78714b;
                                if (lValueOf3 != null || num8 == null) {
                                    num6 = num2;
                                    num7 = num;
                                    if (!linkedHashMap.isEmpty()) {
                                        arrayList2.add(i53.a.g(linkedHashMap));
                                        arrayList3.add(c02.a.a(linkedHashMap, arrayList, listM0));
                                        linkedHashMap = new LinkedHashMap();
                                    }
                                } else {
                                    num6 = num2;
                                    num7 = num;
                                    linkedHashMap.put(Float.valueOf(lValueOf3.longValue()), Float.valueOf(num8.intValue()));
                                }
                                num2 = num6;
                                num = num7;
                            }
                            num3 = num2;
                            num4 = num;
                            if (!linkedHashMap.isEmpty()) {
                                arrayList2.add(i53.a.g(linkedHashMap));
                                arrayList3.add(c02.a.a(linkedHashMap, arrayList, listM0));
                            }
                        } else {
                            num3 = num2;
                            num4 = num;
                        }
                        if (arrayList4 != null) {
                            arrayList5 = new ArrayList();
                            it = arrayList4.iterator();
                            while (it.hasNext()) {
                                num5 = ((gs1.d.b) it.next()).f78714b;
                                if (num5 != null) {
                                    fValueOf = Float.valueOf(num5.intValue());
                                } else {
                                    fValueOf = null;
                                }
                                if (fValueOf != null) {
                                    arrayList5.add(fValueOf);
                                }
                            }
                        } else {
                            arrayList5 = null;
                        }
                        if (num3 != null) {
                            lValueOf = Long.valueOf(num3.intValue());
                        } else {
                            lValueOf = null;
                        }
                        f fVarJ = i53.a.j(arrayList2);
                        f fVarJ2 = i53.a.j(arrayList3);
                        float millis = dateTimeMinusHours.getMillis();
                        float millis2 = dateTimeMinusHours.plusHours(4).getMillis();
                        fFloatValue = 0.0f;
                        if (arrayList5 != null || (fV0 = h0.v0(arrayList5)) == null) {
                            fFloatValue2 = 0.0f;
                        } else {
                            fFloatValue2 = fV0.floatValue();
                        }
                        if (arrayList5 != null && (fQ0 = h0.q0(arrayList5)) != null) {
                            fFloatValue = fQ0.floatValue();
                        }
                        float f14 = fFloatValue;
                        if (num4 != null) {
                            lValueOf2 = Long.valueOf(num4.intValue());
                        } else {
                            lValueOf2 = null;
                        }
                        aVar = new e.a(dVar2, lValueOf, lValueOf2, fVarJ, fVarJ2, millis, millis2, fFloatValue2, f14, z15);
                    }
                    c1578a.f78187b = 1;
                    if (this.f78184a.emit(aVar, c1578a) == aVar2) {
                        return aVar2;
                    }
                } else {
                    d14 = 30.0d;
                }
                i14 = 10;
                listM0 = null;
                if (aVar3.f78181c.C3() > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    a0Var = (a0) realtimedata;
                    if (a0Var != null) {
                        num2 = new Integer(a0Var.f83364c);
                    } else {
                        num2 = null;
                    }
                } else if (cVar != null) {
                    num2 = null;
                } else {
                    num2 = null;
                }
                if (!listA.isEmpty()) {
                    z15 = false;
                    break;
                }
                z15 = false;
                break;
                dVar2 = jVar.f97542a;
                if (z14) {
                    if (listM0 == null) {
                        listM0 = j0.f134944a;
                    }
                    fQ1 = h0.q0(listM0);
                    if (fQ1 != null) {
                        it4 = listM0.iterator();
                        if (it4.hasNext()) {
                            iterable = j0.f134944a;
                        } else {
                            arrayList7 = new ArrayList();
                            next2 = it4.next();
                            while (it4.hasNext()) {
                                T next5 = it4.next();
                                arrayList7.add(Float.valueOf(((Number) next5).floatValue() - next2.floatValue()));
                                next2 = next5;
                            }
                            iterable = arrayList7;
                        }
                        Iterable iterable3 = iterable;
                        arrayList6 = new ArrayList(y.r(iterable3, i14));
                        it5 = iterable3.iterator();
                        while (it5.hasNext()) {
                            arrayList6.add(Float.valueOf(((Number) it5.next()).floatValue() / fQ1.floatValue()));
                        }
                    } else {
                        arrayList6 = null;
                    }
                    if (num2 != null) {
                        fValueOf2 = null;
                    } else {
                        fValueOf2 = null;
                    }
                    if (num2 != null) {
                        lValueOf4 = Long.valueOf(num2.intValue());
                    } else {
                        lValueOf4 = null;
                    }
                    if (num != null) {
                        lValueOf5 = Long.valueOf(num.intValue());
                    } else {
                        lValueOf5 = null;
                    }
                    if (arrayList6 != null) {
                        cVarE = i53.a.e(arrayList6);
                    } else {
                        cVarE = null;
                    }
                    aVar = new e.b(dVar2, lValueOf4, lValueOf5, cVarE, fValueOf2, z15);
                } else {
                    if (cVar != null) {
                        listF2 = cVar.f();
                    } else {
                        listF2 = null;
                    }
                    if (listM0 == null) {
                        listM0 = j0.f134944a;
                    }
                    size = listM0.size();
                    arrayList = new ArrayList(size);
                    while (i15 < size) {
                        arrayList.add(Integer.valueOf(df0.b.a(i15)));
                    }
                    dateTimeNow = DateTime.now(DateTimeZone.UTC);
                    dateTimeMinusHours = dateTimeNow.minusHours(4);
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    if (listF2 != null) {
                        arrayList4 = new ArrayList();
                        it3 = listF2.iterator();
                        while (it3.hasNext()) {
                            next = it3.next();
                            bVar2 = (gs1.d.b) next;
                            Iterator<T> it11 = it3;
                            dateTime2 = bVar2.f78713a;
                            if (dateTime2 != null) {
                                zIsAfter = dateTime2.isAfter(dateTimeMinusHours);
                            } else {
                                zIsAfter = false;
                            }
                            if (zIsAfter) {
                                z16 = false;
                            } else {
                                dateTime3 = bVar2.f78713a;
                                if (dateTime3 != null) {
                                    zIsBefore = dateTime3.isBefore(dateTimeNow);
                                } else {
                                    zIsBefore = false;
                                }
                                if (zIsBefore) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                            }
                            if (z16) {
                                arrayList4.add(next);
                            }
                            it3 = it11;
                        }
                    } else {
                        arrayList4 = null;
                    }
                    if (arrayList4 != null) {
                        linkedHashMap = new LinkedHashMap();
                        while (r4.hasNext()) {
                            dateTime = bVar5.f78713a;
                            if (dateTime != null) {
                                lValueOf3 = Long.valueOf(dateTime.getMillis());
                            } else {
                                lValueOf3 = null;
                            }
                            Integer num9 = bVar5.f78714b;
                            if (lValueOf3 != null) {
                                num6 = num2;
                                num7 = num;
                                if (!linkedHashMap.isEmpty()) {
                                    arrayList2.add(i53.a.g(linkedHashMap));
                                    arrayList3.add(c02.a.a(linkedHashMap, arrayList, listM0));
                                    linkedHashMap = new LinkedHashMap();
                                }
                            } else {
                                num6 = num2;
                                num7 = num;
                                if (!linkedHashMap.isEmpty()) {
                                    arrayList2.add(i53.a.g(linkedHashMap));
                                    arrayList3.add(c02.a.a(linkedHashMap, arrayList, listM0));
                                    linkedHashMap = new LinkedHashMap();
                                }
                            }
                            num2 = num6;
                            num = num7;
                        }
                        num3 = num2;
                        num4 = num;
                        if (!linkedHashMap.isEmpty()) {
                            arrayList2.add(i53.a.g(linkedHashMap));
                            arrayList3.add(c02.a.a(linkedHashMap, arrayList, listM0));
                        }
                    } else {
                        num3 = num2;
                        num4 = num;
                    }
                    if (arrayList4 != null) {
                        arrayList5 = new ArrayList();
                        it = arrayList4.iterator();
                        while (it.hasNext()) {
                            num5 = ((gs1.d.b) it.next()).f78714b;
                            if (num5 != null) {
                                fValueOf = Float.valueOf(num5.intValue());
                            } else {
                                fValueOf = null;
                            }
                            if (fValueOf != null) {
                                arrayList5.add(fValueOf);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                    if (num3 != null) {
                        lValueOf = Long.valueOf(num3.intValue());
                    } else {
                        lValueOf = null;
                    }
                    f fVarJ3 = i53.a.j(arrayList2);
                    f fVarJ4 = i53.a.j(arrayList3);
                    float millis3 = dateTimeMinusHours.getMillis();
                    float millis4 = dateTimeMinusHours.plusHours(4).getMillis();
                    fFloatValue = 0.0f;
                    if (arrayList5 != null) {
                        fFloatValue2 = 0.0f;
                    } else {
                        fFloatValue2 = 0.0f;
                    }
                    if (arrayList5 != null) {
                        fFloatValue = fQ0.floatValue();
                    }
                    float f15 = fFloatValue;
                    if (num4 != null) {
                        lValueOf2 = Long.valueOf(num4.intValue());
                    } else {
                        lValueOf2 = null;
                    }
                    aVar = new e.a(dVar2, lValueOf, lValueOf2, fVarJ3, fVarJ4, millis3, millis4, fFloatValue2, f15, z15);
                }
                c1578a.f78187b = 1;
                if (this.f78184a.emit(aVar, c1578a) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i17 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj2);
            }
            return Unit.INSTANCE;
        }
    }

    public b(i iVar, go0.a aVar) {
        this.f78182a = iVar;
        this.f78183b = aVar;
    }

    @Override // r53.i
    public final Object collect(j<? super e> jVar, t13.d dVar) {
        Object objCollect = this.f78182a.collect(new a(jVar, this.f78183b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
