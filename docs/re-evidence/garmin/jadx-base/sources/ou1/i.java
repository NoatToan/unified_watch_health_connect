package ou1;

import am.x0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import lc.u0;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lou1/i;", "", "Lcx1/o;", "fitnessStatsRepo", "<init>", "(Lcx1/o;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cx1.o f134058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<yw1.g> f134059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map.Entry<String, yw1.e> f134060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map.Entry<String, yw1.e> f134061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<yw1.g> f134062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<yw1.g> f134063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<yw1.g> f134064g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f134065a;

        static {
            int[] iArr = new int[vt1.o.values().length];
            try {
                iArr[vt1.o.f180175f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vt1.o.f180178i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vt1.o.f180176g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f134065a = iArr;
        }
    }

    static {
        new a(null);
    }

    public i(cx1.o oVar) {
        oVar.getClass();
        this.f134058a = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(LocalDate localDate, LocalDate localDate2, ArrayList arrayList, v13.c cVar) {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f134068c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f134068c = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objJ = jVar.f134066a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f134068c;
        if (i15 == 0) {
            o13.r.b(objJ);
            fy1.i.f73924a.getClass();
            List list = (List) fy1.i.f73932i.getValue();
            jVar.f134068c = 1;
            int i16 = cx1.o.f56663b;
            Boolean bool = Boolean.FALSE;
            cx1.o oVar = this.f134058a;
            objJ = com.garmin.android.apps.connectmobile.f0.J(oVar, new cx1.a(oVar, localDate, localDate2, list, arrayList, bool, null), jVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            this.f134059b = (List) ((v2.b) v2Var).f47386a;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting the activities performance stats ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "TrainingPlanFitnessStatsUseCase", strD);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:56:0x0104  */
    /* JADX WARN: Code duplicated, block: B:59:0x0109  */
    /* JADX WARN: Code duplicated, block: B:60:0x010c  */
    /* JADX WARN: Code duplicated, block: B:62:0x010f  */
    /* JADX WARN: Code duplicated, block: B:63:0x011a  */
    /* JADX WARN: Code duplicated, block: B:66:0x012d  */
    /* JADX WARN: Code duplicated, block: B:67:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x0144  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x015b  */
    /* JADX WARN: Code duplicated, block: B:77:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x0173 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x0184  */
    /* JADX WARN: Code duplicated, block: B:88:0x018f  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object b(LocalDate localDate, LocalDate localDate2, String str, boolean z14, double d14, boolean z15, v13.c cVar) {
        k kVar;
        yw1.e eVar;
        boolean z16;
        double d15;
        boolean z17;
        String str2;
        yw1.g gVar;
        Map<String, yw1.e> map;
        yw1.f fVar;
        Double d16;
        Double d17;
        yw1.f fVar2;
        Double d18;
        Double d19;
        boolean zG;
        Double d24;
        String strC;
        Double d25;
        Map<String, yw1.e> map2;
        Map<String, yw1.e> map3;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f134075g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f134075g = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        k kVar2 = kVar;
        Object objJ = kVar2.f134073e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar2.f134075g;
        String strC2 = null;
        if (i15 == 0) {
            o13.r.b(objJ);
            List<yw1.g> list = this.f134059b;
            eVar = (list == null || (gVar = (yw1.g) h0.d0(list)) == null || (map = gVar.f199923c) == null) ? null : map.get(str);
            if (eVar == null) {
                fy1.i.f73924a.getClass();
                List list2 = (List) fy1.i.f73932i.getValue();
                kVar2.f134069a = str;
                z16 = z14;
                kVar2.f134070b = z16;
                d15 = d14;
                kVar2.f134072d = d15;
                z17 = z15;
                kVar2.f134071c = z17;
                kVar2.f134075g = 1;
                cx1.o oVar = this.f134058a;
                objJ = com.garmin.android.apps.connectmobile.f0.J(oVar, new cx1.b(oVar, localDate, localDate2, list2, str, null), kVar2);
                if (objJ == aVar) {
                    return aVar;
                }
                str2 = str;
            } else {
                z16 = z14;
                d15 = d14;
                z17 = z15;
                str2 = str;
            }
            if (eVar != null) {
                fVar = eVar.f199906d;
                if (fVar != null) {
                    d16 = fVar.f199918e;
                } else {
                    d16 = null;
                }
                if (d16 != null) {
                    d17 = new Double(d16.doubleValue() / d15);
                } else {
                    d17 = null;
                }
                fVar2 = eVar.f199908f;
                if (fVar2 != null) {
                    d18 = fVar2.f199918e;
                } else {
                    d18 = null;
                }
                if (d18 != null) {
                    d19 = new Double(d18.doubleValue() / d15);
                } else {
                    d19 = null;
                }
                zG = p005kotlin.jvm.internal.s.g(str2, x0.f4324r.f4358a);
                if (p005kotlin.jvm.internal.s.c(d17, 0.0d) && d17 != null) {
                    d24 = new Double(fy1.b.a(d17.doubleValue(), z16, zG));
                } else {
                    d24 = null;
                }
                if (p005kotlin.jvm.internal.s.c(d19, 0.0d) && d19 != null) {
                    strC = fy1.b.c(d19.doubleValue());
                } else {
                    strC = null;
                }
                yw1.c cVar2 = new yw1.c(d24, strC);
                if (p005kotlin.jvm.internal.s.c(d16, 0.0d) && d16 != null) {
                    d25 = new Double(fy1.b.a(d16.doubleValue(), z16, zG));
                } else {
                    d25 = null;
                }
                if (!p005kotlin.jvm.internal.s.c(d18, 0.0d) && d18 != null) {
                    strC2 = fy1.b.c(d18.doubleValue());
                }
                yw1.d dVar = new yw1.d(d25, strC2);
                return z17 ? p13.x.k(dVar, cVar2) : p13.x.k(cVar2, dVar);
            }
            return null;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z18 = kVar2.f134071c;
        double d26 = kVar2.f134072d;
        boolean z19 = kVar2.f134070b;
        str2 = kVar2.f134069a;
        o13.r.b(objJ);
        z17 = z18;
        d15 = d26;
        z16 = z19;
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            List list3 = (List) ((v2.b) v2Var).f47386a;
            yw1.g gVar2 = (yw1.g) h0.d0(list3);
            if (gVar2 == null || (map3 = gVar2.f199923c) == null || !map3.isEmpty()) {
                yw1.g gVar3 = (yw1.g) h0.d0(list3);
                if (gVar3 != null && (map2 = gVar3.f199923c) != null) {
                    eVar = map2.get(str2);
                }
                if (eVar != null) {
                    fVar = eVar.f199906d;
                    if (fVar != null) {
                        d16 = fVar.f199918e;
                    } else {
                        d16 = null;
                    }
                    if (d16 != null) {
                        d17 = new Double(d16.doubleValue() / d15);
                    } else {
                        d17 = null;
                    }
                    fVar2 = eVar.f199908f;
                    if (fVar2 != null) {
                        d18 = fVar2.f199918e;
                    } else {
                        d18 = null;
                    }
                    if (d18 != null) {
                        d19 = new Double(d18.doubleValue() / d15);
                    } else {
                        d19 = null;
                    }
                    zG = p005kotlin.jvm.internal.s.g(str2, x0.f4324r.f4358a);
                    if (p005kotlin.jvm.internal.s.c(d17, 0.0d)) {
                        d24 = null;
                    } else {
                        d24 = new Double(fy1.b.a(d17.doubleValue(), z16, zG));
                    }
                    if (p005kotlin.jvm.internal.s.c(d19, 0.0d)) {
                        strC = null;
                    } else {
                        strC = fy1.b.c(d19.doubleValue());
                    }
                    yw1.c cVar3 = new yw1.c(d24, strC);
                    if (p005kotlin.jvm.internal.s.c(d16, 0.0d)) {
                        d25 = null;
                    } else {
                        d25 = new Double(fy1.b.a(d16.doubleValue(), z16, zG));
                    }
                    if (!p005kotlin.jvm.internal.s.c(d18, 0.0d)) {
                        strC2 = fy1.b.c(d18.doubleValue());
                    }
                    yw1.d dVar2 = new yw1.d(d25, strC2);
                    if (z17) {
                    }
                }
            }
            return null;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting the activity performance stats ");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "TrainingPlanFitnessStatsUseCase", strD);
        eVar = null;
        if (eVar != null) {
            fVar = eVar.f199906d;
            if (fVar != null) {
                d16 = fVar.f199918e;
            } else {
                d16 = null;
            }
            if (d16 != null) {
                d17 = new Double(d16.doubleValue() / d15);
            } else {
                d17 = null;
            }
            fVar2 = eVar.f199908f;
            if (fVar2 != null) {
                d18 = fVar2.f199918e;
            } else {
                d18 = null;
            }
            if (d18 != null) {
                d19 = new Double(d18.doubleValue() / d15);
            } else {
                d19 = null;
            }
            zG = p005kotlin.jvm.internal.s.g(str2, x0.f4324r.f4358a);
            if (p005kotlin.jvm.internal.s.c(d17, 0.0d)) {
                d24 = null;
            } else {
                d24 = new Double(fy1.b.a(d17.doubleValue(), z16, zG));
            }
            if (p005kotlin.jvm.internal.s.c(d19, 0.0d)) {
                strC = null;
            } else {
                strC = fy1.b.c(d19.doubleValue());
            }
            yw1.c cVar4 = new yw1.c(d24, strC);
            if (p005kotlin.jvm.internal.s.c(d16, 0.0d)) {
                d25 = null;
            } else {
                d25 = new Double(fy1.b.a(d16.doubleValue(), z16, zG));
            }
            if (!p005kotlin.jvm.internal.s.c(d18, 0.0d)) {
                strC2 = fy1.b.c(d18.doubleValue());
            }
            yw1.d dVar3 = new yw1.d(d25, strC2);
            if (z17) {
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Serializable c(LocalDate localDate, LocalDate localDate2, boolean z14, v13.c cVar) {
        m mVar;
        Double d14;
        yw1.l lVar;
        yw1.l lVar2;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f134080e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f134080e = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objJ = mVar.f134078c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f134080e;
        if (i15 == 0) {
            o13.r.b(objJ);
            LocalDate localDateMinusDays = localDate.minusDays(30);
            localDateMinusDays.getClass();
            mVar.f134076a = localDate;
            mVar.f134077b = z14;
            mVar.f134080e = 1;
            cx1.o oVar = this.f134058a;
            objJ = com.garmin.android.apps.connectmobile.f0.J(oVar, new cx1.c(oVar, localDateMinusDays, localDate2, null), mVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = mVar.f134077b;
            localDate = mVar.f134076a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error occurred while fetching critical swim speed info ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "TrainingPlanFitnessStatsUseCase", strD);
            return null;
        }
        yw1.a aVar3 = (yw1.a) ((v2.b) v2Var).f47386a;
        List<yw1.l> list = aVar3.f199897c;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                yw1.l lVar3 = (yw1.l) obj;
                if (LocalDate.parse(lVar3.f199953d) != null) {
                    LocalDate localDate3 = LocalDate.parse(lVar3.f199953d);
                    localDate3.getClass();
                    if (localDate3.compareTo((ReadablePartial) localDate) <= 0) {
                        arrayList.add(obj);
                    }
                }
            }
            List listN0 = h0.N0(arrayList, new l());
            if (listN0 == null || (lVar2 = (yw1.l) h0.d0(listN0)) == null) {
                d14 = null;
            } else {
                d14 = lVar2.f199954e;
            }
        } else {
            d14 = null;
        }
        List<yw1.l> list2 = aVar3.f199897c;
        Double d15 = (list2 == null || (lVar = (yw1.l) h0.n0(list2)) == null) ? null : lVar.f199954e;
        if (d15 != null && d14 != null) {
            l3.a aVar4 = l3.f23124b;
            double d16 = 1000;
            double dDoubleValue = d14.doubleValue() / d16;
            aVar4.getClass();
            int iR = l3.a.r(dDoubleValue, z14);
            int iR2 = l3.a.r(d15.doubleValue() / d16, z14);
            if (iR < iR2) {
                return new o13.u(new Integer(iR), new Integer(iR2), new Integer(z14 ? R.string.lbl_per_100_meters : R.string.lbl_per_100_yards));
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(LocalDate localDate, LocalDate localDate2, v13.c cVar) {
        n nVar;
        Map<String, yw1.e> map;
        Set<Map.Entry<String, yw1.e>> setEntrySet;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f134083c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f134083c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objJ = nVar.f134081a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f134083c;
        if (i15 == 0) {
            o13.r.b(objJ);
            String str = x0.f4312o.f4358a;
            fy1.i.f73924a.getClass();
            List list = (List) fy1.i.f73934k.getValue();
            nVar.f134083c = 1;
            cx1.o oVar = this.f134058a;
            objJ = com.garmin.android.apps.connectmobile.f0.J(oVar, new cx1.b(oVar, localDate, localDate2, list, str, null), nVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        Map.Entry<String, yw1.e> entry = null;
        if (v2Var instanceof v2.b) {
            yw1.g gVar = (yw1.g) h0.d0((List) ((v2.b) v2Var).f47386a);
            if (gVar != null && (map = gVar.f199923c) != null && (setEntrySet = map.entrySet()) != null) {
                entry = (Map.Entry) h0.c0(setEntrySet);
            }
            this.f134061d = entry;
            return Unit.INSTANCE;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting the cycling achievement stats stats ");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.f(a2Var, "TrainingPlanFitnessStatsUseCase", strD);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(LocalDate localDate, LocalDate localDate2, v13.c cVar) {
        p pVar;
        i iVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f134101d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f134101d = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object objJ = pVar.f134099b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f134101d;
        List<yw1.g> list = null;
        if (i15 == 0) {
            o13.r.b(objJ);
            pVar.f134098a = this;
            pVar.f134101d = 1;
            cx1.o oVar = this.f134058a;
            objJ = com.garmin.android.apps.connectmobile.f0.J(oVar, new cx1.e(oVar, localDate, localDate2, null), pVar);
            if (objJ == aVar) {
                return aVar;
            }
            iVar = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iVar = pVar.f134098a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            list = (List) ((v2.b) v2Var).f47386a;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting the fitness coach stats ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "TrainingPlanFitnessStatsUseCase", strD);
        }
        iVar.f134062e = list;
        return Unit.INSTANCE;
    }

    public final List<yw1.g> f() {
        return this.f134064g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(LocalDate localDate, LocalDate localDate2, v13.c cVar) {
        s sVar;
        i iVar;
        List<yw1.g> list;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f134107d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f134107d = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object objJ = sVar.f134105b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f134107d;
        if (i15 == 0) {
            o13.r.b(objJ);
            sVar.f134104a = this;
            sVar.f134107d = 1;
            cx1.o oVar = this.f134058a;
            objJ = com.garmin.android.apps.connectmobile.f0.J(oVar, new cx1.g(oVar, localDate, localDate2, "daily", null), sVar);
            if (objJ == aVar) {
                return aVar;
            }
            iVar = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iVar = sVar.f134104a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            list = (List) ((v2.b) v2Var).f47386a;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting the FROG coach daily stats ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "TrainingPlanFitnessStatsUseCase", strD);
            list = null;
        }
        iVar.f134064g = list;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<yw1.p> h(double d14, boolean z14, boolean z15) {
        Double dValueOf;
        Double dValueOf2;
        Double dValueOf3;
        Double dValueOf4;
        Double dValueOf5;
        Double dValueOf6;
        char c14;
        Double d15;
        Double d16;
        Double dValueOf7;
        Map<String, yw1.e> map;
        Map<String, yw1.e> map2;
        Map<String, yw1.e> map3;
        Map<String, yw1.e> map4;
        Map<String, yw1.e> map5;
        Map<String, yw1.e> map6;
        Map<String, yw1.e> map7;
        List<yw1.g> list = this.f134063f;
        if (list == null) {
            return null;
        }
        yw1.g gVar = (yw1.g) h0.d0(list);
        if (gVar != null && (map7 = gVar.f199923c) != null && map7.isEmpty()) {
            return null;
        }
        yw1.g gVar2 = (yw1.g) h0.d0(list);
        if (gVar2 == null || (map6 = gVar2.f199923c) == null) {
            dValueOf = null;
        } else {
            ArrayList arrayList = new ArrayList(map6.size());
            Iterator<Map.Entry<String, yw1.e>> it = map6.entrySet().iterator();
            while (it.hasNext()) {
                yw1.f fVar = it.next().getValue().f199907e;
                arrayList.add(fVar != null ? fVar.f199918e : null);
            }
            dValueOf = Double.valueOf(h0.P0(h0.Z(arrayList)));
        }
        yw1.g gVar3 = (yw1.g) h0.d0(list);
        if (gVar3 == null || (map5 = gVar3.f199923c) == null) {
            dValueOf2 = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map5.size());
            Iterator<Map.Entry<String, yw1.e>> it3 = map5.entrySet().iterator();
            while (it3.hasNext()) {
                yw1.f fVar2 = it3.next().getValue().f199906d;
                arrayList2.add(fVar2 != null ? fVar2.f199918e : null);
            }
            dValueOf2 = Double.valueOf(h0.P0(h0.Z(arrayList2)));
        }
        yw1.g gVar4 = (yw1.g) h0.d0(list);
        if (gVar4 == null || (map4 = gVar4.f199923c) == null) {
            dValueOf3 = null;
        } else {
            ArrayList arrayList3 = new ArrayList(map4.size());
            Iterator<Map.Entry<String, yw1.e>> it4 = map4.entrySet().iterator();
            while (it4.hasNext()) {
                yw1.f fVar3 = it4.next().getValue().f199905c;
                arrayList3.add(fVar3 != null ? fVar3.f199918e : null);
            }
            dValueOf3 = Double.valueOf(h0.P0(h0.Z(arrayList3)));
        }
        yw1.g gVar5 = (yw1.g) h0.d0(list);
        if (gVar5 == null || (map3 = gVar5.f199923c) == null) {
            dValueOf4 = null;
        } else {
            ArrayList arrayList4 = new ArrayList(map3.size());
            Iterator<Map.Entry<String, yw1.e>> it5 = map3.entrySet().iterator();
            while (it5.hasNext()) {
                yw1.f fVar4 = it5.next().getValue().f199908f;
                arrayList4.add(fVar4 != null ? fVar4.f199918e : null);
            }
            dValueOf4 = Double.valueOf(h0.P0(h0.Z(arrayList4)));
        }
        yw1.g gVar6 = (yw1.g) h0.d0(list);
        if (gVar6 == null || (map2 = gVar6.f199923c) == null) {
            dValueOf5 = null;
        } else {
            ArrayList arrayList5 = new ArrayList(map2.size());
            Iterator<Map.Entry<String, yw1.e>> it6 = map2.entrySet().iterator();
            while (it6.hasNext()) {
                yw1.f fVar5 = it6.next().getValue().f199910h;
                arrayList5.add(fVar5 != null ? fVar5.f199918e : null);
            }
            dValueOf5 = Double.valueOf(h0.P0(h0.Z(arrayList5)));
        }
        yw1.g gVar7 = (yw1.g) h0.d0(list);
        if (gVar7 == null || (map = gVar7.f199923c) == null) {
            dValueOf6 = null;
        } else {
            ArrayList arrayList6 = new ArrayList(map.size());
            Iterator<Map.Entry<String, yw1.e>> it7 = map.entrySet().iterator();
            while (it7.hasNext()) {
                yw1.f fVar6 = it7.next().getValue().f199909g;
                arrayList6.add(fVar6 != null ? fVar6.f199918e : null);
            }
            dValueOf6 = Double.valueOf(h0.P0(h0.Z(arrayList6)));
        }
        if (dValueOf5 == null || dValueOf6 == null) {
            c14 = 1;
            d15 = dValueOf2;
            if (dValueOf5 != null) {
                dValueOf6 = Double.valueOf(dValueOf5.doubleValue() * ((double) 2));
            }
        } else {
            c14 = 1;
            d15 = dValueOf2;
            dValueOf6 = Double.valueOf((dValueOf5.doubleValue() * ((double) 2)) + dValueOf6.doubleValue());
        }
        Integer numValueOf = (p005kotlin.jvm.internal.s.c(dValueOf, 0.0d) || dValueOf == null) ? null : Integer.valueOf((int) (dValueOf.doubleValue() / d14));
        if (p005kotlin.jvm.internal.s.c(d15, 0.0d)) {
            d16 = null;
            dValueOf7 = null;
        } else if (d15 != 0) {
            d16 = null;
            dValueOf7 = Double.valueOf(fy1.b.a(d15.doubleValue() / d14, z15, false));
        } else {
            d16 = null;
            dValueOf7 = null;
        }
        yw1.q qVar = new yw1.q(numValueOf, dValueOf7, (p005kotlin.jvm.internal.s.c(dValueOf4, 0.0d) || dValueOf4 == null) ? d16 : fy1.b.c(dValueOf4.doubleValue() / d14), (p005kotlin.jvm.internal.s.c(dValueOf3, 0.0d) || dValueOf3 == null) ? d16 : u0.h(d14, dValueOf3), (p005kotlin.jvm.internal.s.c(dValueOf6, 0.0d) || dValueOf6 == null) ? d16 : Long.valueOf(MathKt.d(dValueOf6.doubleValue() / d14)));
        yw1.r rVar = new yw1.r((p005kotlin.jvm.internal.s.c(d15, 0.0d) || dValueOf == 0) ? d16 : Integer.valueOf((int) dValueOf.doubleValue()), p005kotlin.jvm.internal.s.c(d15, 0.0d) ? d16 : d15, (p005kotlin.jvm.internal.s.c(d15, 0.0d) || d15 == 0) ? d16 : Double.valueOf(fy1.b.a(d15.doubleValue(), z15, false)), (p005kotlin.jvm.internal.s.c(dValueOf4, 0.0d) || dValueOf4 == null) ? d16 : fy1.b.c(dValueOf4.doubleValue()), p005kotlin.jvm.internal.s.c(dValueOf3, 0.0d) ? d16 : dValueOf3, (p005kotlin.jvm.internal.s.c(dValueOf6, 0.0d) || dValueOf6 == null) ? d16 : Long.valueOf(MathKt.d(dValueOf6.doubleValue())));
        if (z14) {
            yw1.p[] pVarArr = new yw1.p[2];
            pVarArr[0] = rVar;
            pVarArr[c14] = qVar;
            return p13.x.k(pVarArr);
        }
        yw1.p[] pVarArr2 = new yw1.p[2];
        pVarArr2[0] = qVar;
        pVarArr2[c14] = rVar;
        return p13.x.k(pVarArr2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(LocalDate localDate, LocalDate localDate2, v13.c cVar) {
        t tVar;
        i iVar;
        List<yw1.g> list;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f134111d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f134111d = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object objJ = tVar.f134109b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar.f134111d;
        if (i15 == 0) {
            o13.r.b(objJ);
            tVar.f134108a = this;
            tVar.f134111d = 1;
            cx1.o oVar = this.f134058a;
            objJ = com.garmin.android.apps.connectmobile.f0.J(oVar, new cx1.g(oVar, localDate, localDate2, TtmlNode.COMBINE_ALL, null), tVar);
            if (objJ == aVar) {
                return aVar;
            }
            iVar = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iVar = tVar.f134108a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            list = (List) ((v2.b) v2Var).f47386a;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting the FROG coach stats ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "TrainingPlanFitnessStatsUseCase", strD);
            list = null;
        }
        iVar.f134063f = list;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable j(LocalDate localDate, LocalDate localDate2, vt1.o oVar, v13.c cVar) {
        v vVar;
        Double d14;
        Double d15;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f134115d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f134115d = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object objJ = vVar.f134113b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f134115d;
        if (i15 == 0) {
            o13.r.b(objJ);
            LocalDate localDateMinusDays = localDate.minusDays(30);
            localDateMinusDays.getClass();
            String upperCase = oVar.f180184a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            vVar.f134112a = localDate;
            vVar.f134115d = 1;
            cx1.o oVar2 = this.f134058a;
            objJ = com.garmin.android.apps.connectmobile.f0.J(oVar2, new cx1.h(oVar2, localDateMinusDays, localDate2, upperCase, null), vVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            localDate = vVar.f134112a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error occurred while fetching functional threshold power info ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "TrainingPlanFitnessStatsUseCase", strD);
            return null;
        }
        T t7 = ((v2.b) v2Var).f47386a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) t7) {
            yw1.l lVar = (yw1.l) obj;
            if (LocalDate.parse(lVar.f199953d) != null) {
                LocalDate localDate3 = LocalDate.parse(lVar.f199953d);
                localDate3.getClass();
                if (localDate3.compareTo((ReadablePartial) localDate) <= 0) {
                    arrayList.add(obj);
                }
            }
        }
        yw1.l lVar2 = (yw1.l) h0.d0(h0.N0(arrayList, new u()));
        Integer num = (lVar2 == null || (d15 = lVar2.f199954e) == null) ? null : new Integer((int) d15.doubleValue());
        yw1.l lVar3 = (yw1.l) h0.n0((List) t7);
        Integer num2 = (lVar3 == null || (d14 = lVar3.f199954e) == null) ? null : new Integer((int) d14.doubleValue());
        if (num2 == null || num == null || num.intValue() >= num2.intValue()) {
            return null;
        }
        return new o13.u(num, num2, new Integer(R.string.lbl_watts));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable k(LocalDate localDate, LocalDate localDate2, vt1.o oVar, v13.c cVar) {
        x xVar;
        Double d14;
        Double d15;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i14 = xVar.f134119d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                xVar.f134119d = i14 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object objJ = xVar.f134117b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = xVar.f134119d;
        if (i15 == 0) {
            o13.r.b(objJ);
            LocalDate localDateMinusDays = localDate.minusDays(30);
            localDateMinusDays.getClass();
            String upperCase = oVar.f180184a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            xVar.f134116a = localDate;
            xVar.f134119d = 1;
            cx1.o oVar2 = this.f134058a;
            objJ = com.garmin.android.apps.connectmobile.f0.J(oVar2, new cx1.i(oVar2, localDateMinusDays, localDate2, upperCase, null), xVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            localDate = xVar.f134116a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error occurred while fetching lactate threshold heart rate info ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "TrainingPlanFitnessStatsUseCase", strD);
            return null;
        }
        T t7 = ((v2.b) v2Var).f47386a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) t7) {
            yw1.l lVar = (yw1.l) obj;
            if (LocalDate.parse(lVar.f199953d) != null) {
                LocalDate localDate3 = LocalDate.parse(lVar.f199953d);
                localDate3.getClass();
                if (localDate3.compareTo((ReadablePartial) localDate) <= 0) {
                    arrayList.add(obj);
                }
            }
        }
        yw1.l lVar2 = (yw1.l) h0.d0(h0.N0(arrayList, new w()));
        Integer num = (lVar2 == null || (d15 = lVar2.f199954e) == null) ? null : new Integer((int) d15.doubleValue());
        yw1.l lVar3 = (yw1.l) h0.n0((List) t7);
        Integer num2 = (lVar3 == null || (d14 = lVar3.f199954e) == null) ? null : new Integer((int) d14.doubleValue());
        if (num2 == null || num == null || num.intValue() >= num2.intValue()) {
            return null;
        }
        return new o13.u(num, num2, new Integer(R.string.lbl_bpm));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable l(LocalDate localDate, LocalDate localDate2, vt1.o oVar, v13.c cVar) {
        z zVar;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i14 = zVar.f134123d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zVar.f134123d = i14 - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, cVar);
            }
        } else {
            zVar = new z(this, cVar);
        }
        Object objJ = zVar.f134121b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = zVar.f134123d;
        if (i15 == 0) {
            o13.r.b(objJ);
            LocalDate localDateMinusDays = localDate.minusDays(30);
            localDateMinusDays.getClass();
            String upperCase = oVar.f180184a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            zVar.f134120a = localDate;
            zVar.f134123d = 1;
            cx1.o oVar2 = this.f134058a;
            objJ = com.garmin.android.apps.connectmobile.f0.J(oVar2, new cx1.j(oVar2, localDateMinusDays, localDate2, upperCase, null), zVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            localDate = zVar.f134120a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error occurred while fetching lactate threshold speed info ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "TrainingPlanFitnessStatsUseCase", strD);
            return null;
        }
        T t7 = ((v2.b) v2Var).f47386a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) t7) {
            yw1.l lVar = (yw1.l) obj;
            if (LocalDate.parse(lVar.f199953d) != null) {
                LocalDate localDate3 = LocalDate.parse(lVar.f199953d);
                localDate3.getClass();
                if (localDate3.compareTo((ReadablePartial) localDate) <= 0) {
                    arrayList.add(obj);
                }
            }
        }
        yw1.l lVar2 = (yw1.l) h0.d0(h0.N0(arrayList, new y()));
        yw1.l lVar3 = (yw1.l) h0.n0((List) t7);
        Double d14 = ((lVar2 != null ? lVar2.f199954e : null) == null || Double.isNaN(lVar2.f199954e.doubleValue())) ? null : new Double(lVar2.f199954e.doubleValue() * ((double) 10));
        Double d15 = ((lVar3 != null ? lVar3.f199954e : null) == null || Double.isNaN(lVar3.f199954e.doubleValue())) ? null : new Double(lVar3.f199954e.doubleValue() * ((double) 10));
        if (d15 == null || d14 == null || d14.doubleValue() >= d15.doubleValue()) {
            return null;
        }
        return new o13.p(d14, d15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(LocalDate localDate, LocalDate localDate2, v13.c cVar) {
        b0 b0Var;
        Map<String, yw1.e> map;
        Set<Map.Entry<String, yw1.e>> setEntrySet;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i14 = b0Var.f134010c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b0Var.f134010c = i14 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(this, cVar);
            }
        } else {
            b0Var = new b0(this, cVar);
        }
        Object objJ = b0Var.f134008a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b0Var.f134010c;
        if (i15 == 0) {
            o13.r.b(objJ);
            String str = x0.f4308n.f4358a;
            fy1.i.f73924a.getClass();
            List list = (List) fy1.i.f73933j.getValue();
            b0Var.f134010c = 1;
            cx1.o oVar = this.f134058a;
            objJ = com.garmin.android.apps.connectmobile.f0.J(oVar, new cx1.b(oVar, localDate, localDate2, list, str, null), b0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            yw1.g gVar = (yw1.g) h0.d0((List) ((v2.b) v2Var).f47386a);
            this.f134060c = (gVar == null || (map = gVar.f199923c) == null || (setEntrySet = map.entrySet()) == null) ? null : (Map.Entry) h0.c0(setEntrySet);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting the running achievement stats ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "TrainingPlanFitnessStatsUseCase", strD);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(LocalDate localDate, LocalDate localDate2, v13.c cVar) {
        c0 c0Var;
        yw1.f fVar;
        Double d14;
        yw1.f fVar2;
        Map<String, yw1.e> map;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i14 = c0Var.f134022c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0Var.f134022c = i14 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        Object objJ = c0Var.f134020a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c0Var.f134022c;
        if (i15 == 0) {
            o13.r.b(objJ);
            c0Var.f134022c = 1;
            cx1.o oVar = this.f134058a;
            objJ = com.garmin.android.apps.connectmobile.f0.J(oVar, new cx1.m(oVar, localDate, localDate2, null), c0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting the Strength performance stats ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "TrainingPlanFitnessStatsUseCase", strD);
            return null;
        }
        yw1.g gVar = (yw1.g) h0.d0((List) ((v2.b) v2Var).f47386a);
        yw1.e eVar = (gVar == null || (map = gVar.f199923c) == null) ? null : map.get(x0.f4309n1.f4358a);
        Double d15 = (eVar == null || (fVar2 = eVar.f199912j) == null) ? null : fVar2.f199918e;
        Long l14 = (eVar == null || (fVar = eVar.f199911i) == null || (d14 = fVar.f199918e) == null) ? null : new Long(MathKt.d(d14.doubleValue()));
        if (d15 != null && l14 != null && d15.doubleValue() > 0.0d && l14.longValue() > 0) {
            l3.a aVar3 = l3.f23124b;
            long jLongValue = l14.longValue();
            aVar3.getClass();
            String strE1 = l3.a.e1(jLongValue);
            if (strE1 != null) {
                return new yw1.u((int) d15.doubleValue(), strE1);
            }
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lou1/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ACCEPTED", "ARCHIVED", "", "THIRTY_DAYS", "I", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
