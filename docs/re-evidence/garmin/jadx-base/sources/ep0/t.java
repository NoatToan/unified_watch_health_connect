package ep0;

import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import g21.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t implements r53.i<e0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r53.i f64897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f64898b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.j f64899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f64900b;

        /* JADX INFO: renamed from: ep0.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.home.yesterday.domain.dashboard.GetYesterdayStatsDataUseCase$invoke$$inlined$map$1$2", f = "GetYesterdayStatsDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C1380a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f64901a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f64902b;

            public C1380a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f64901a = obj;
                this.f64902b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(r53.j jVar, s sVar) {
            this.f64899a = jVar;
            this.f64900b = sVar;
        }

        /* JADX WARN: Code duplicated, block: B:111:0x01a0  */
        /* JADX WARN: Code duplicated, block: B:128:0x01d3  */
        /* JADX WARN: Code duplicated, block: B:220:0x033f  */
        /* JADX WARN: Code duplicated, block: B:325:0x0541  */
        /* JADX WARN: Code duplicated, block: B:330:0x0561  */
        /* JADX WARN: Code duplicated, block: B:395:0x0694  */
        /* JADX WARN: Code duplicated, block: B:446:0x074a  */
        /* JADX WARN: Code duplicated, block: B:448:0x074d  */
        /* JADX WARN: Code duplicated, block: B:460:0x077d  */
        /* JADX WARN: Code duplicated, block: B:461:0x0780  */
        /* JADX WARN: Code duplicated, block: B:463:0x0783  */
        /* JADX WARN: Code duplicated, block: B:464:0x0785  */
        /* JADX WARN: Code duplicated, block: B:467:0x079f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:489:0x0750 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Failed to find 'out' block for switch in B:170:0x0266. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C1380a c1380a;
            T next;
            T next2;
            l42.b bVar;
            i41.f fVar;
            pw.a aVar;
            pb2.e.t tVar;
            C1380a c1380a2;
            u13.a aVar2;
            j70.b0 b0Var;
            Object obj2;
            int i14;
            int i15;
            boolean z14;
            Object objEmit;
            u13.a aVar3;
            o70.t.b bVarA;
            hs1.k kVarJ;
            Integer avgValue;
            String string;
            String string2;
            String strC;
            String strG;
            String string3;
            String string4;
            hs1.a aVarA;
            hs1.a aVarA2;
            Integer burnedTotal;
            Integer numValueOf;
            String str;
            Integer consumedGoal;
            String strValueOf;
            hs1.i iVarI;
            hs1.j floorsAscended;
            hs1.e eVarD;
            hs1.e eVarD2;
            hs1.f fVarE;
            Double consumedInFractionalMl;
            String strA;
            Integer numValueOf2;
            hs1.g gVarH;
            hs1.g gVarH2;
            String strD;
            hs1.m mVarL;
            Integer numA;
            Double dValueOf;
            l42.c cVarF;
            Double weight;
            String strE;
            String str2;
            d0 d0Var;
            c0 c0Var;
            a0 a0Var;
            hs1.i iVarI2;
            hs1.j floorsAscended2;
            Integer goal;
            hs1.i iVarI3;
            hs1.j floorsAscended3;
            Integer value;
            a0 a0Var2;
            hs1.f fVarE2;
            hs1.f fVarE3;
            Integer numValueOf3;
            l42.c cVarF2;
            pb2.e.c cVar;
            List<pb2.e.h> list;
            T next3;
            List<kw.l> listD;
            T next4;
            List<pw.a> listK;
            T next5;
            DateTime dateTimeQ;
            List<i41.f> listB;
            T next6;
            List<l42.b> listB2;
            T next7;
            if (dVar instanceof C1380a) {
                c1380a = (C1380a) dVar;
                int i16 = c1380a.f64902b;
                if ((i16 & Integer.MIN_VALUE) != 0) {
                    c1380a.f64902b = i16 - Integer.MIN_VALUE;
                } else {
                    c1380a = new C1380a(dVar);
                }
            } else {
                c1380a = new C1380a(dVar);
            }
            Object obj3 = c1380a.f64901a;
            u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
            int i17 = c1380a.f64902b;
            if (i17 == 0) {
                o13.r.b(obj3);
                j70.d dVar2 = (j70.d) obj;
                Data data = dVar2.f97521b;
                j70.b0 b0Var2 = (j70.b0) data;
                List<String> list2 = b0Var2 != null ? b0Var2.f97505c : null;
                s sVar = this.f64900b;
                ae0.b bVar2 = sVar.f64893c;
                Iterator<T> it = ae0.b.a(b0Var2 != null ? b0Var2.f97507e : null, null).iterator();
                do {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                } while (!g22.k.m(((hs1.d) next).b()));
                hs1.d dVar3 = next;
                j70.b0 b0Var3 = (j70.b0) data;
                Iterable iterable = (List) sVar.a(b0Var3 != null ? b0Var3.f97511i : null, new w());
                if (iterable == null) {
                    iterable = j0.f134944a;
                }
                Iterator<T> it3 = iterable.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = (T) null;
                        break;
                    }
                    next2 = it3.next();
                } while (!g22.k.m(((km1.v) next2).s()));
                km1.v vVar = next2;
                l42.k kVar = (l42.k) sVar.a(b0Var3 != null ? b0Var3.f97508f : null, new x());
                if (kVar == null || (listB2 = kVar.b()) == null) {
                    bVar = null;
                } else {
                    Iterator<T> it4 = listB2.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next7 = (T) null;
                            break;
                        }
                        next7 = it4.next();
                    } while (!g22.k.m(((l42.b) next7).g()));
                    bVar = next7;
                }
                i41.e eVar = (i41.e) sVar.a(b0Var3 != null ? b0Var3.f97509g : null, new v());
                if (eVar == null || (listB = eVar.b()) == null) {
                    fVar = null;
                } else {
                    Iterator<T> it5 = listB.iterator();
                    do {
                        if (!it5.hasNext()) {
                            next6 = (T) null;
                            break;
                        }
                        next6 = it5.next();
                    } while (!g22.k.m(((i41.f) next6).f()));
                    fVar = next6;
                }
                kw.h hVar = (kw.h) sVar.a(b0Var3 != null ? b0Var3.f97510h : null, new u());
                if (hVar == null || (listD = hVar.d()) == null) {
                    aVar = null;
                } else {
                    Iterator<T> it6 = listD.iterator();
                    do {
                        if (!it6.hasNext()) {
                            next4 = (T) null;
                            break;
                        }
                        next4 = it6.next();
                        dateTimeQ = ((kw.l) next4).q();
                    } while (!g22.k.m(dateTimeQ != null ? dateTimeQ.toLocalDate() : null));
                    kw.l lVar = next4;
                    if (lVar == null || (listK = lVar.k()) == null) {
                        aVar = null;
                    } else {
                        Iterator<T> it7 = listK.iterator();
                        if (it7.hasNext()) {
                            next5 = it7.next();
                            if (it7.hasNext()) {
                                long jK = ((pw.a) next5).k();
                                do {
                                    T next8 = it7.next();
                                    long jK2 = ((pw.a) next8).k();
                                    if (jK < jK2) {
                                        next5 = next8;
                                        jK = jK2;
                                    }
                                } while (it7.hasNext());
                            }
                        } else {
                            next5 = (T) null;
                        }
                        aVar = next5;
                    }
                }
                if (b0Var3 == null || (cVar = b0Var3.f97512j) == null || (list = cVar.f136983e) == null) {
                    tVar = null;
                } else {
                    Iterator<T> it8 = list.iterator();
                    do {
                        if (!it8.hasNext()) {
                            next3 = (T) null;
                            break;
                        }
                        next3 = it8.next();
                    } while (!g22.k.m(((pb2.e.h) next3).f136996a.toLocalDate()));
                    pb2.e.h hVar2 = next3;
                    if (hVar2 != null) {
                        tVar = hVar2.f136997b;
                    } else {
                        tVar = null;
                    }
                }
                List<String> list3 = list2;
                f0 f0Var = new f0(tVar != null ? tVar.f137093a : null, tVar != null ? tVar.f137094b : null, tVar != null ? tVar.f137095c : null, tVar != null ? tVar.f137096d : null);
                if (list3 != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it9 = list3.iterator();
                    while (it9.hasNext()) {
                        String str3 = (String) it9.next();
                        o70.t.f130062f.getClass();
                        o70.t tVarA = o70.t.a.a(str3);
                        int i18 = tVarA == null ? -1 : s.a.f64896a[tVarA.ordinal()];
                        Iterator<T> it10 = it9;
                        l42.b bVar3 = bVar;
                        if (i18 == 1) {
                            bVarA = fc1.i.a(dVar3);
                        } else if (i18 != 2) {
                            bVarA = tVarA != null ? tVarA.c() : null;
                        } else {
                            bVarA = (vVar == null || !vVar.getSleepFromDevice()) ? o70.t.b.f130095j : o70.t.b.f130096k;
                        }
                        f12.l lVar2 = sVar.f64894d;
                        Context context = sVar.f64891a;
                        C1380a c1380a3 = c1380a;
                        u13.a aVar5 = aVar4;
                        switch (tVarA == null ? -1 : s.a.f64896a[tVarA.ordinal()]) {
                            case 1:
                                b0Var3 = b0Var3;
                                f0Var = f0Var;
                                aVar = aVar;
                                tVarA = tVarA;
                                if (dVar3 == null || (kVarJ = dVar3.getPulseOx()) == null || (avgValue = kVarJ.getAvgValue()) == null || (string = context.getString(R.string.lbl_value_percent, String.valueOf(avgValue.intValue()))) == null) {
                                    strC = null;
                                } else {
                                    string2 = string.toString();
                                    strC = string2;
                                }
                                break;
                            case 2:
                                b0Var3 = b0Var3;
                                f0Var = f0Var;
                                aVar = aVar;
                                tVarA = tVarA;
                                string2 = sVar.e(vVar, false);
                                strC = string2;
                                break;
                            case 3:
                                b0Var3 = b0Var3;
                                f0Var = f0Var;
                                aVar = aVar;
                                tVarA = tVarA;
                                yw.b bVar4 = new yw.b(context);
                                Double systolic = aVar != null ? aVar.getSystolic() : null;
                                Double diastolic = aVar != null ? aVar.getDiastolic() : null;
                                if (systolic != null && diastolic != null) {
                                    strG = bVar4.g(Double.valueOf(systolic.doubleValue()), Double.valueOf(diastolic.doubleValue()), aVar != null ? aVar.getCategoryName() : null, 0, yw.c.NO_SPACES, yw.a.SPACE);
                                    strC = strG;
                                }
                                strC = null;
                                break;
                            case 4:
                                b0Var3 = b0Var3;
                                f0Var = f0Var;
                                aVar = aVar;
                                tVarA = tVarA;
                                Integer numA2 = (dVar3 == null || (aVarA2 = dVar3.getBodyBattery()) == null) ? null : aVarA2.getChargedValue();
                                Integer numB = (dVar3 == null || (aVarA = dVar3.getBodyBattery()) == null) ? null : aVarA.getDrainedValue();
                                if (numA2 != null || numB != null) {
                                    rx.a aVar6 = new rx.a(context);
                                    if (numA2 != null) {
                                        string3 = aVar6.f154899a.getString(R.string.lbl_string_with_positive_sign, String.valueOf(numA2.intValue()));
                                        if (string3 == null) {
                                            string3 = aVar6.f154900b;
                                        }
                                    } else {
                                        string3 = aVar6.f154900b;
                                    }
                                    rx.a aVar7 = new rx.a(context);
                                    if (numB != null) {
                                        string4 = aVar7.f154899a.getString(R.string.lbl_string_with_negative_sign, String.valueOf(numB.intValue()));
                                        if (string4 == null) {
                                            string4 = aVar7.f154900b;
                                        }
                                    } else {
                                        string4 = aVar7.f154900b;
                                    }
                                    strG = context.getString(R.string.string_slash_string_pattern, string3, string4);
                                    strC = strG;
                                }
                                strC = null;
                                break;
                            case 5:
                                f0Var = f0Var;
                                aVar = aVar;
                                hs1.c cVarC = dVar3 != null ? dVar3.getCalories() : null;
                                if (!lVar2.d3()) {
                                    b0Var3 = b0Var3;
                                    tVarA = tVarA;
                                    if (cVarC != null && (burnedTotal = cVarC.getBurnedTotal()) != null) {
                                        int iIntValue = burnedTotal.intValue();
                                        l3.f23124b.getClass();
                                        String str4 = l3.f23131i.format(Integer.valueOf(iIntValue));
                                        if (str4 != null) {
                                            strG = str4.toString();
                                            strC = strG;
                                        }
                                    }
                                    strC = null;
                                } else {
                                    if (cVarC == null || (consumedGoal = cVarC.getConsumedGoal()) == null) {
                                        numValueOf = null;
                                    } else {
                                        int iIntValue2 = consumedGoal.intValue();
                                        Integer burnedActive = cVarC.getBurnedActive();
                                        numValueOf = Integer.valueOf(iIntValue2 + (burnedActive != null ? burnedActive.intValue() : 0));
                                    }
                                    if (numValueOf != null) {
                                        double dIntValue = numValueOf.intValue();
                                        Integer consumedValue = cVarC.getConsumedValue();
                                        double dIntValue2 = consumedValue != null ? consumedValue.intValue() : 0.0d;
                                        l3.f23124b.getClass();
                                        str = l3.f23131i.format(dIntValue - dIntValue2);
                                    } else {
                                        tVarA = tVarA;
                                        str = null;
                                    }
                                    if (str != null) {
                                        String string5 = context.getString(R.string.calories_remaining);
                                        string5.getClass();
                                        String lowerCase = string5.toLowerCase(Locale.ROOT);
                                        lowerCase.getClass();
                                        strG = context.getString(R.string.string_space_string_pattern, str, lowerCase);
                                        strC = strG;
                                    }
                                    strC = null;
                                }
                                break;
                            case 6:
                                f0Var = f0Var;
                                aVar = aVar;
                                Integer value2 = (dVar3 == null || (iVarI = dVar3.getMovement()) == null || (floorsAscended = iVarI.getFloorsAscended()) == null) ? null : floorsAscended.getValue();
                                if (value2 != null && value2.intValue() > 0) {
                                    strValueOf = String.valueOf(value2.intValue());
                                    strC = strValueOf;
                                    tVarA = tVarA;
                                }
                                tVarA = tVarA;
                                strC = null;
                                break;
                            case 7:
                                f0Var = f0Var;
                                aVar = aVar;
                                Object restingValue = (dVar3 == null || (eVarD2 = dVar3.getHeartRate()) == null) ? null : eVarD2.getRestingValue();
                                Object maxValue = (dVar3 == null || (eVarD = dVar3.getHeartRate()) == null) ? null : eVarD.getMaxValue();
                                String string6 = context.getString(R.string.no_value);
                                string6.getClass();
                                if (restingValue != null || maxValue != null) {
                                    if (restingValue == null) {
                                        restingValue = string6;
                                    }
                                    String string7 = context.getString(R.string.string_space_string_pattern, restingValue, context.getString(R.string.lbl_heart_rate_resting_short));
                                    string7.getClass();
                                    if (maxValue == null) {
                                        maxValue = string6;
                                    }
                                    String string8 = context.getString(R.string.string_space_string_pattern, maxValue, context.getString(R.string.lbl_heart_rate_high_short));
                                    string8.getClass();
                                    strValueOf = context.getString(R.string.string_slash_string_pattern, string7, string8);
                                    strC = strValueOf;
                                    tVarA = tVarA;
                                }
                                tVarA = tVarA;
                                strC = null;
                                break;
                            case 8:
                                aVar = aVar;
                                strC = sVar.c(fVar, false);
                                tVarA = tVarA;
                                break;
                            case 9:
                                aVar = aVar;
                                if (dVar3 != null && (fVarE = dVar3.getHydration()) != null && (consumedInFractionalMl = fVarE.getConsumedInFractionalMl()) != null) {
                                    double dDoubleValue = consumedInFractionalMl.doubleValue();
                                    if (dDoubleValue > 0.0d) {
                                        op0.b.a aVar8 = op0.b.f133168a;
                                        gg1.n nVarD0 = lVar2.d0();
                                        aVar8.getClass();
                                        f0Var = f0Var;
                                        strValueOf = new wp0.a(new l22.a(context)).a(dDoubleValue, op0.b.a.a(nVarD0), true);
                                        strC = strValueOf;
                                        tVarA = tVarA;
                                    }
                                }
                                f0Var = f0Var;
                                tVarA = tVarA;
                                strC = null;
                                break;
                            case 10:
                                aVar = aVar;
                                Integer num = f0Var.f75417a;
                                if (num != null) {
                                    int iIntValue3 = num.intValue();
                                    v21.e eVar2 = sVar.f64895e;
                                    l22.a aVar9 = eVar2.f175325b;
                                    l3.f23124b.getClass();
                                    String str5 = l3.f23131i.format(Integer.valueOf(iIntValue3));
                                    if (str5 == null) {
                                        str5 = eVar2.f175327d;
                                    }
                                    strA = aVar9.a(R.string.string_space_string_pattern, str5, aVar9.getString(R.string.calories_total_label));
                                    strC = strA;
                                    f0Var = f0Var;
                                    tVarA = tVarA;
                                }
                                f0Var = f0Var;
                                tVarA = tVarA;
                                strC = null;
                                break;
                            case 11:
                                aVar = aVar;
                                Integer moderate = (dVar3 == null || (gVarH2 = dVar3.getIntensityMinutes()) == null) ? null : gVarH2.getModerate();
                                Integer vigorous = (dVar3 == null || (gVarH = dVar3.getIntensityMinutes()) == null) ? null : gVarH.getVigorous();
                                if (moderate == null || vigorous == null) {
                                    numValueOf2 = null;
                                } else {
                                    int iY = oe2.f.y(Integer.valueOf(moderate.intValue()), Integer.valueOf(vigorous.intValue()));
                                    if (iY > 0) {
                                        numValueOf2 = Integer.valueOf(iY);
                                    } else {
                                        numValueOf2 = null;
                                    }
                                }
                                if (numValueOf2 != null) {
                                    strA = String.valueOf(numValueOf2.intValue());
                                    strC = strA;
                                    f0Var = f0Var;
                                    tVarA = tVarA;
                                }
                                f0Var = f0Var;
                                tVarA = tVarA;
                                strC = null;
                                break;
                            case 12:
                                strD = sVar.d(dVar3, false);
                                strC = strD;
                                tVarA = tVarA;
                                break;
                            case 13:
                                aVar = aVar;
                                Integer num2 = sVar.f(dVar3).f128594a;
                                if (num2 != null) {
                                    int iIntValue4 = num2.intValue();
                                    l3.f23124b.getClass();
                                    String str6 = l3.f23131i.format(Integer.valueOf(iIntValue4));
                                    if (str6 != null) {
                                        strA = str6.toString();
                                        strC = strA;
                                        f0Var = f0Var;
                                        tVarA = tVarA;
                                    }
                                }
                                f0Var = f0Var;
                                tVarA = tVarA;
                                strC = null;
                                break;
                            case 14:
                                aVar = aVar;
                                if (dVar3 != null && (mVarL = dVar3.getStress()) != null && (numA = mVarL.getAvgLevel()) != null) {
                                    strA = String.valueOf(numA.intValue());
                                    strC = strA;
                                    f0Var = f0Var;
                                    tVarA = tVarA;
                                }
                                f0Var = f0Var;
                                tVarA = tVarA;
                                strC = null;
                                break;
                            case 15:
                                q42.h hVar3 = new q42.h(context);
                                if (bVar3 == null || (cVarF = bVar3.f()) == null || (weight = cVarF.getWeight()) == null) {
                                    dValueOf = null;
                                } else {
                                    double dDoubleValue2 = weight.doubleValue();
                                    l3.f23124b.getClass();
                                    dValueOf = Double.valueOf(l3.a.P1(dDoubleValue2));
                                }
                                if (dValueOf == null) {
                                    aVar = aVar;
                                    f0Var = f0Var;
                                    tVarA = tVarA;
                                    strC = null;
                                } else {
                                    strD = q42.h.c(hVar3, dValueOf, l3.f23126d, false, 10);
                                    strC = strD;
                                    tVarA = tVarA;
                                }
                                break;
                            default:
                                f0Var = f0Var;
                                aVar = aVar;
                                tVarA = tVarA;
                                strC = null;
                                break;
                        }
                        int i19 = tVarA != null ? s.a.f64896a[tVarA.ordinal()] : -1;
                        if (i19 == 2) {
                            strE = sVar.e(vVar, true);
                        } else if (i19 != 8) {
                            if (i19 != 12) {
                                str2 = null;
                            } else {
                                strE = sVar.d(dVar3, true);
                            }
                            if (tVarA != null || strC == null) {
                                d0Var = null;
                            } else {
                                b0 b0Var4 = new b0(tVarA.f130082a, bVarA != null ? bVarA.f130098a : null);
                                int[] iArr = s.a.f64896a;
                                if (iArr[tVarA.ordinal()] != 15) {
                                    c0Var = null;
                                } else {
                                    Double weightDelta = (bVar3 == null || (cVarF2 = bVar3.f()) == null) ? null : cVarF2.getWeightDelta();
                                    if (weightDelta == null) {
                                        numValueOf3 = null;
                                    } else if (p005kotlin.jvm.internal.s.c(weightDelta, 0.0d)) {
                                        numValueOf3 = Integer.valueOf(j70.x.EQUAL.f97672a);
                                    } else {
                                        numValueOf3 = weightDelta.doubleValue() > 0.0d ? Integer.valueOf(j70.x.UP.f97672a) : Integer.valueOf(j70.x.DOWN.f97672a);
                                    }
                                    if (numValueOf3 != null) {
                                        c0Var = new c0(numValueOf3.intValue(), o70.t.Q0.f130082a);
                                    } else {
                                        c0Var = null;
                                    }
                                }
                                int i24 = iArr[tVarA.ordinal()];
                                if (i24 == 6) {
                                    a0Var = new a0((dVar3 == null || (iVarI3 = dVar3.getMovement()) == null || (floorsAscended3 = iVarI3.getFloorsAscended()) == null || (value = floorsAscended3.getValue()) == null) ? null : Double.valueOf(value.intValue()), (dVar3 == null || (iVarI2 = dVar3.getMovement()) == null || (floorsAscended2 = iVarI2.getFloorsAscended()) == null || (goal = floorsAscended2.getGoal()) == null) ? null : Double.valueOf(goal.intValue()));
                                } else if (i24 != 9) {
                                    if (i24 != 13) {
                                        a0Var2 = null;
                                    } else {
                                        o13.p<Integer, Integer> pVarF = sVar.f(dVar3);
                                        Integer num3 = pVarF.f128594a;
                                        Double dValueOf2 = num3 != null ? Double.valueOf(num3.intValue()) : null;
                                        Integer num4 = pVarF.f128595b;
                                        a0Var = new a0(dValueOf2, num4 != null ? Double.valueOf(num4.intValue()) : null);
                                    }
                                    d0Var = new d0(b0Var4, strC, str2, c0Var, a0Var2);
                                } else {
                                    a0Var = new a0((dVar3 == null || (fVarE3 = dVar3.getHydration()) == null) ? null : fVarE3.getConsumedInFractionalMl(), (dVar3 == null || (fVarE2 = dVar3.getHydration()) == null) ? null : fVarE2.getGoalInFractionalMl());
                                }
                                a0Var2 = a0Var;
                                d0Var = new d0(b0Var4, strC, str2, c0Var, a0Var2);
                            }
                            if (d0Var != null) {
                                arrayList.add(d0Var);
                            }
                            b0Var3 = b0Var3;
                            it9 = it10;
                            bVar = bVar3;
                            aVar = aVar;
                            c1380a = c1380a3;
                            aVar4 = aVar5;
                            f0Var = f0Var;
                        } else {
                            strE = sVar.c(fVar, true);
                        }
                        str2 = strE;
                        if (tVarA != null) {
                            d0Var = null;
                        } else {
                            d0Var = null;
                        }
                        if (d0Var != null) {
                            arrayList.add(d0Var);
                        }
                        b0Var3 = b0Var3;
                        it9 = it10;
                        bVar = bVar3;
                        aVar = aVar;
                        c1380a = c1380a3;
                        aVar4 = aVar5;
                        f0Var = f0Var;
                    }
                    c1380a2 = c1380a;
                    aVar2 = aVar4;
                    b0Var = b0Var3;
                    obj2 = arrayList;
                } else {
                    c1380a2 = c1380a;
                    aVar2 = aVar4;
                    b0Var = b0Var3;
                    obj2 = j0.f134944a;
                }
                if (b0Var != null) {
                    i14 = 1;
                    boolean z15 = b0Var.f97503a;
                    if (b0Var != null) {
                        i15 = b0Var.f97504b;
                    } else {
                        i15 = 0;
                    }
                    if (i15 > i14) {
                        z14 = i14;
                    } else {
                        z14 = 0;
                    }
                    e0 e0Var = new e0(z15, z14, i53.a.j((Iterable) obj2), dVar2.f97520a);
                    C1380a c1380a4 = c1380a2;
                    c1380a4.f64902b = i14;
                    objEmit = this.f64899a.emit(e0Var, c1380a4);
                    aVar3 = aVar2;
                    if (objEmit == aVar3) {
                        return aVar3;
                    }
                } else {
                    i14 = 1;
                }
                if (b0Var != null) {
                    i15 = b0Var.f97504b;
                } else {
                    i15 = 0;
                }
                if (i15 > i14) {
                    z14 = i14;
                } else {
                    z14 = 0;
                }
                e0 e0Var2 = new e0(z15, z14, i53.a.j((Iterable) obj2), dVar2.f97520a);
                C1380a c1380a5 = c1380a2;
                c1380a5.f64902b = i14;
                objEmit = this.f64899a.emit(e0Var2, c1380a5);
                aVar3 = aVar2;
                if (objEmit == aVar3) {
                    return aVar3;
                }
            } else {
                if (i17 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj3);
            }
            return Unit.INSTANCE;
        }
    }

    public t(r53.i iVar, s sVar) {
        this.f64897a = iVar;
        this.f64898b = sVar;
    }

    @Override // r53.i
    public final Object collect(r53.j<? super e0> jVar, t13.d dVar) {
        Object objCollect = this.f64897a.collect(new a(jVar, this.f64898b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
