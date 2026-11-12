package ri0;

import c22.l3;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import j70.x;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o13.r;
import o61.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import r53.i;
import r53.j;
import v13.e;
import yi0.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements i<ti0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f152800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f152801b;

    /* JADX INFO: renamed from: ri0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2885a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f152802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f152803b;

        /* JADX INFO: renamed from: ri0.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @e(c = "com.garmin.android.apps.connectmobile.ftp.dashboard.domain.usecase.GetFtpDataUseCase$invoke$$inlined$map$1$2", f = "GetFtpDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C2886a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f152804a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f152805b;

            public C2886a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f152804a = obj;
                this.f152805b |= Integer.MIN_VALUE;
                return C2885a.this.emit(null, this);
            }
        }

        public C2885a(j jVar, d dVar) {
            this.f152802a = jVar;
            this.f152803b = dVar;
        }

        /* JADX WARN: Code duplicated, block: B:113:0x01e4  */
        /* JADX WARN: Code duplicated, block: B:115:0x01e7 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:116:0x01e9  */
        /* JADX WARN: Code duplicated, block: B:117:0x01f9 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:118:0x01fb  */
        /* JADX WARN: Code duplicated, block: B:119:0x020b  */
        /* JADX WARN: Code duplicated, block: B:121:0x020f  */
        /* JADX WARN: Code duplicated, block: B:124:0x0215  */
        /* JADX WARN: Code duplicated, block: B:127:0x022e A[LOOP:2: B:125:0x0228->B:127:0x022e, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:128:0x025d  */
        /* JADX WARN: Code duplicated, block: B:130:0x0260  */
        /* JADX WARN: Code duplicated, block: B:133:0x026a  */
        /* JADX WARN: Code duplicated, block: B:134:0x0274  */
        /* JADX WARN: Code duplicated, block: B:136:0x0278  */
        /* JADX WARN: Code duplicated, block: B:137:0x0282  */
        /* JADX WARN: Code duplicated, block: B:140:0x0297 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v7, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList] */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C2886a c2886a;
            x xVarB;
            T next;
            Double d14;
            boolean z14;
            String str;
            String strF0;
            Double d15;
            Float f14;
            ?? arrayList;
            Integer num;
            Integer num2;
            ti0.a aVar;
            Iterator<Map.Entry<yi0.a, f>> it;
            Float f15;
            f fVar;
            if (dVar instanceof C2886a) {
                c2886a = (C2886a) dVar;
                int i14 = c2886a.f152805b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2886a.f152805b = i14 - Integer.MIN_VALUE;
                } else {
                    c2886a = new C2886a(dVar);
                }
            } else {
                c2886a = new C2886a(dVar);
            }
            Object obj2 = c2886a.f152804a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2886a.f152805b;
            if (i15 == 0) {
                r.b(obj2);
                j70.d dVar2 = (j70.d) obj;
                List list = (List) dVar2.f97521b;
                String str2 = list != null ? (String) h0.d0(list) : null;
                d dVar3 = this.f152803b;
                dVar3.getClass();
                yi0.c cVar = dVar3.f152810d;
                Iterable iterable = (List) dVar3.a(str2, new b());
                if (iterable == null) {
                    iterable = j0.f134944a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (T t7 : iterable) {
                    String series = ((wi0.a) t7).getSeries();
                    if (series != null && series.equalsIgnoreCase(cVar.f197340b)) {
                        arrayList2.add(t7);
                    }
                }
                wi0.a aVar3 = (wi0.a) h0.e0(arrayList2.size() - 2, arrayList2);
                wi0.a aVar4 = (wi0.a) h0.n0(arrayList2);
                Double value = aVar3 != null ? aVar3.getValue() : null;
                Double value2 = aVar4 != null ? aVar4.getValue() : null;
                if (value == null || value2 == null) {
                    xVarB = null;
                } else {
                    double dDoubleValue = value2.doubleValue();
                    double dDoubleValue2 = value.doubleValue();
                    x.f97667d.getClass();
                    xVarB = x.a.b(dDoubleValue2, dDoubleValue);
                }
                List list2 = (List) dVar2.f97521b;
                Iterable iterable2 = (List) dVar3.a(list2 != null ? (String) h0.e0(1, list2) : null, new c());
                if (iterable2 == null) {
                    iterable2 = j0.f134944a;
                }
                Iterator<T> it3 = iterable2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it3.next();
                    String sport = ((h) next).getSport();
                    if (sport != null && sport.equalsIgnoreCase(cVar.f197340b)) {
                        break;
                    }
                }
                h hVar = next;
                Double d16 = (!zf.b.D(hVar != null ? hVar.getPowerToWeight() : null) || s.g(hVar.getIsStale(), Boolean.TRUE)) ? null : new Double(new BigDecimal(String.valueOf(hVar.getPowerToWeight())).setScale(2, RoundingMode.HALF_UP).doubleValue());
                Double functionalThresholdPower = (!zf.b.D(hVar != null ? hVar.getFunctionalThresholdPower() : null) || s.g(hVar.getIsStale(), Boolean.TRUE)) ? null : hVar.getFunctionalThresholdPower();
                boolean z15 = !dVar3.f152809c.w().equals(UserSettingsDTO.c.FEMALE.f43537a);
                yi0.d.a aVar5 = yi0.d.f197344c;
                Double weight = hVar != null ? hVar.getWeight() : null;
                aVar5.getClass();
                yi0.d dVarA = yi0.d.a.a(cVar, z15, weight);
                yi0.a aVarA = dVarA != null ? dVarA.a(dVarA.f197345a == yi0.b.W_PER_KG ? d16 : functionalThresholdPower, z15) : null;
                boolean z16 = false;
                boolean z17 = (dVarA != null ? dVarA.f197345a : null) == yi0.b.W_PER_KG && d16 != null;
                if ((dVarA != null ? dVarA.f197345a : null) == yi0.b.WATTS && functionalThresholdPower != null) {
                    z16 = true;
                }
                if (z17) {
                    d14 = d16;
                    z14 = z17;
                    strF0 = l3.f23129g.format(d14.doubleValue());
                } else {
                    d14 = d16;
                    z14 = z17;
                    if (z16) {
                        strF0 = l3.a.F0(l3.f23124b, dVar3.f152807a, functionalThresholdPower.doubleValue(), true);
                    } else {
                        str = null;
                    }
                    if (dVarA != null || (fVar = dVarA.f197346b.get(yi0.a.SUPERIOR)) == null) {
                        d15 = null;
                    } else {
                        d15 = (Double) fVar.a(z15).c();
                    }
                    if (d15 != null) {
                        if (z14) {
                            f15 = new Float((float) (d14.doubleValue() / d15.doubleValue()));
                        } else if (z16) {
                            f15 = new Float((float) (functionalThresholdPower.doubleValue() / d15.doubleValue()));
                        } else {
                            f15 = null;
                        }
                        f14 = f15;
                    } else {
                        f14 = null;
                    }
                    yz1.d dVar4 = dVar2.f97520a;
                    if (dVarA != null) {
                        Map<yi0.a, f> map = dVarA.f197346b;
                        arrayList = new ArrayList(map.size());
                        it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            j23.r<Double> rVarA = it.next().getValue().a(z15);
                            arrayList.add(new Float((float) (((Number) rVarA.c()).doubleValue() - ((Number) rVarA.getStart()).doubleValue())));
                        }
                    } else {
                        arrayList = 0;
                    }
                    if (arrayList == 0) {
                        arrayList = j0.f134944a;
                    }
                    i53.c cVarE = i53.a.e((Iterable) arrayList);
                    if (aVarA != null) {
                        num = new Integer(aVarA.f197324a);
                    } else {
                        num = null;
                    }
                    if (xVarB != null) {
                        num2 = new Integer(xVarB.f97672a);
                    } else {
                        num2 = null;
                    }
                    aVar = new ti0.a(dVar4, str, cVarE, f14, num, num2);
                    c2886a.f152805b = 1;
                    if (this.f152802a.emit(aVar, c2886a) == aVar2) {
                        return aVar2;
                    }
                }
                str = strF0;
                if (dVarA != null) {
                    d15 = null;
                } else {
                    d15 = null;
                }
                if (d15 != null) {
                    if (z14) {
                        f15 = new Float((float) (d14.doubleValue() / d15.doubleValue()));
                    } else if (z16) {
                        f15 = new Float((float) (functionalThresholdPower.doubleValue() / d15.doubleValue()));
                    } else {
                        f15 = null;
                    }
                    f14 = f15;
                } else {
                    f14 = null;
                }
                yz1.d dVar5 = dVar2.f97520a;
                if (dVarA != null) {
                    Map<yi0.a, f> map2 = dVarA.f197346b;
                    arrayList = new ArrayList(map2.size());
                    it = map2.entrySet().iterator();
                    while (it.hasNext()) {
                        j23.r<Double> rVarA2 = it.next().getValue().a(z15);
                        arrayList.add(new Float((float) (((Number) rVarA2.c()).doubleValue() - ((Number) rVarA2.getStart()).doubleValue())));
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = j0.f134944a;
                }
                i53.c cVarE2 = i53.a.e((Iterable) arrayList);
                if (aVarA != null) {
                    num = new Integer(aVarA.f197324a);
                } else {
                    num = null;
                }
                if (xVarB != null) {
                    num2 = new Integer(xVarB.f97672a);
                } else {
                    num2 = null;
                }
                aVar = new ti0.a(dVar5, str, cVarE2, f14, num, num2);
                c2886a.f152805b = 1;
                if (this.f152802a.emit(aVar, c2886a) == aVar2) {
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
        this.f152800a = iVar;
        this.f152801b = dVar;
    }

    @Override // r53.i
    public final Object collect(j<? super ti0.a> jVar, t13.d dVar) {
        Object objCollect = this.f152800a.collect(new C2885a(jVar, this.f152801b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
