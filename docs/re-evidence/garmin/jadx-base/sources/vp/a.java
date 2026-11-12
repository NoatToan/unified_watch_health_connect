package vp;

import android.content.Context;
import android.graphics.Shader;
import c22.c3;
import c22.l3;
import c22.m3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.BarDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.k0;
import p13.u;
import p13.x;
import p13.y;
import zz.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014BK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lvp/a;", "Lqz/c;", "Lyp/b;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "intervalType", "Lorg/joda/time/LocalDate;", "startDate", "", "isUsingMetric", "isNotStatuteUS", "Lmp/k;", "metricType", "", "Lmp/j;", "chipsStatus", "<init>", "(Landroid/content/Context;ILorg/joda/time/LocalDate;ZZLmp/k;Ljava/util/Map;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements qz.c<yp.b, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f179246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f179247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f179248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f179249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f179250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mp.k f179251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<mp.j, Boolean> f179252g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f179253a;

        static {
            int[] iArr = new int[mp.k.values().length];
            try {
                iArr[mp.k.NON_PACK_WEIGHT_CALORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mp.k.PACK_WEIGHT_CALORIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mp.k.RESTING_CALORIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mp.k.DISTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[mp.k.DISTANCE_SWIMMING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[mp.k.ASCENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f179253a = iArr;
        }
    }

    static {
        new C3345a(null);
    }

    public a(Context context, int i14, LocalDate localDate, boolean z14, boolean z15, mp.k kVar, Map<mp.j, Boolean> map) {
        context.getClass();
        localDate.getClass();
        kVar.getClass();
        map.getClass();
        this.f179246a = context;
        this.f179247b = i14;
        this.f179248c = localDate;
        this.f179249d = z14;
        this.f179250e = z15;
        this.f179251f = kVar;
        this.f179252g = map;
    }

    public static int y(mp.k kVar) {
        int i14 = b.f179253a[kVar.ordinal()];
        if (i14 == 1) {
            return R.color.gds_data_viz_neutral_secondary;
        }
        if (i14 != 2) {
            return i14 != 3 ? R.color.gds_data_viz_neutral_primary : R.color.gds_data_viz_blue_secondary;
        }
        return R.color.gds_data_viz_red_primary;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x029d  */
    /* JADX WARN: Code duplicated, block: B:172:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:175:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:182:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:184:0x0305 A[PHI: r2
      0x0305: PHI (r2v38 xz.e) = (r2v35 xz.e), (r2v41 xz.e), (r2v41 xz.e) binds: [B:183:0x0303, B:176:0x02f4, B:180:0x02fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:185:0x0330  */
    /* JADX WARN: Code duplicated, block: B:187:0x0333  */
    /* JADX WARN: Code duplicated, block: B:213:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:256:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:185:0x0330, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    @Override // qz.c
    public final List<BarDataSet> a(yp.b bVar) {
        double d14;
        ?? linkedHashMap;
        xz.e eVar;
        Map map;
        int i14;
        Iterator it;
        String str;
        ArrayList arrayListC;
        Double dValueOf;
        ArrayList arrayList;
        ArrayList arrayList2;
        BarDataSet barDataSet;
        BarDataSet barDataSet2;
        double dDoubleValue;
        Iterator it3;
        double dDoubleValue2;
        int i15;
        xz.e eVar2;
        xz.e eVar3;
        Object next;
        Double d15;
        Object next2;
        Double d16;
        int i16;
        Float fValueOf;
        yp.c cVar;
        Double d17;
        float fDoubleValue;
        yp.c cVar2;
        Double d18;
        boolean z14;
        xz.e eVar4;
        yp.c cVar3;
        Double d19;
        yp.c cVar4;
        Double d24;
        yp.c cVar5;
        Double d25;
        yp.c cVar6;
        Double d26;
        yp.b bVar2 = bVar;
        mp.k kVar = mp.k.CALORIES;
        LocalDate localDate = this.f179248c;
        int i17 = this.f179247b;
        String str2 = "";
        Context context = this.f179246a;
        mp.k kVar2 = this.f179251f;
        if (kVar2 == kVar) {
            d14 = 0.0d;
            if (s.g(this.f179252g.get(mp.j.PACK_CALORIE_DETAILS), Boolean.TRUE)) {
                Map map2 = bVar2 != null ? bVar2.f198605a : null;
                if (map2 == null) {
                    map2 = k0.f134949a;
                    map2.getClass();
                }
                List listK = x.k(mp.k.PACK_WEIGHT_CALORIES, mp.k.NON_PACK_WEIGHT_CALORIES, mp.k.RESTING_CALORIES);
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = listK.iterator();
                while (it4.hasNext()) {
                    mp.k kVar3 = (mp.k) it4.next();
                    if (((List) map2.get(kVar3)) != null) {
                        Map map3 = bVar2 != null ? bVar2.f198605a : null;
                        if (map3 == null) {
                            map3 = k0.f134949a;
                            map3.getClass();
                        }
                        Iterator it5 = y.s(map3.values()).iterator();
                        if (it5.hasNext()) {
                            Double d27 = ((yp.c) it5.next()).f198606a;
                            double dDoubleValue3 = d27 != null ? d27.doubleValue() : 0.0d;
                            while (it5.hasNext()) {
                                Double d28 = ((yp.c) it5.next()).f198606a;
                                dDoubleValue3 = Math.max(dDoubleValue3, d28 != null ? d28.doubleValue() : 0.0d);
                            }
                            dValueOf = Double.valueOf(dDoubleValue3);
                        } else {
                            dValueOf = null;
                        }
                        float fDoubleValue2 = (dValueOf != null ? (float) dValueOf.doubleValue() : 0.0f) * 0.005f;
                        List list = (List) map3.get(kVar3);
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator it6 = list.iterator();
                            while (it6.hasNext()) {
                                yp.c cVar7 = (yp.c) it6.next();
                                int i18 = cVar7.f198607b;
                                Double d29 = cVar7.f198606a;
                                if (d29 != null) {
                                    fValueOf = Float.valueOf((float) d29.doubleValue());
                                    i16 = i17;
                                } else {
                                    i16 = i17;
                                    fValueOf = null;
                                }
                                LocalDate localDatePlusMonths = i16 == 6 ? localDate.plusMonths(i18) : localDate.plusDays(i18);
                                int[] iArr = b.f179253a;
                                Map map4 = map2;
                                int i19 = iArr[kVar3.ordinal()];
                                Iterator it7 = it4;
                                if (i19 == 1) {
                                    i16 = i16;
                                    it6 = it6;
                                    List list2 = (List) map3.get(mp.k.RESTING_CALORIES);
                                    fDoubleValue = (list2 == null || (cVar = (yp.c) list2.get(i18)) == null || (d17 = cVar.f198606a) == null) ? 0.0f : (float) d17.doubleValue();
                                } else if (i19 != 2) {
                                    i16 = i16;
                                    it6 = it6;
                                } else {
                                    List list3 = (List) map3.get(mp.k.RESTING_CALORIES);
                                    float fDoubleValue3 = (list3 == null || (cVar6 = (yp.c) list3.get(i18)) == null || (d26 = cVar6.f198606a) == null) ? 0.0f : (float) d26.doubleValue();
                                    List list4 = (List) map3.get(mp.k.NON_PACK_WEIGHT_CALORIES);
                                    fDoubleValue = fDoubleValue3 + ((list4 == null || (cVar5 = (yp.c) list4.get(i18)) == null || (d25 = cVar5.f198606a) == null) ? 0.0f : (float) d25.doubleValue());
                                }
                                int i24 = iArr[kVar3.ordinal()];
                                if (i24 == 1) {
                                    List list5 = (List) map3.get(mp.k.PACK_WEIGHT_CALORIES);
                                    z14 = ((list5 == null || (cVar2 = (yp.c) list5.get(i18)) == null || (d18 = cVar2.f198606a) == null) ? 0.0d : d18.doubleValue()) == 0.0d;
                                } else if (i24 == 3) {
                                    List list6 = (List) map3.get(mp.k.NON_PACK_WEIGHT_CALORIES);
                                    if (((list6 == null || (cVar4 = (yp.c) list6.get(i18)) == null || (d24 = cVar4.f198606a) == null) ? 0.0d : d24.doubleValue()) == 0.0d) {
                                        List list7 = (List) map3.get(mp.k.PACK_WEIGHT_CALORIES);
                                        if (((list7 == null || (cVar3 = (yp.c) list7.get(i18)) == null || (d19 = cVar3.f198606a) == null) ? 0.0d : d19.doubleValue()) == 0.0d) {
                                        }
                                    }
                                }
                                if (fValueOf == null || (s.e(fValueOf, 0.0f) && !wp.d.b(kVar3))) {
                                    eVar4 = null;
                                } else {
                                    float fFloatValue = fValueOf.floatValue() + fDoubleValue;
                                    int[] iArr2 = {a7.b.getColor(context, y(kVar3))};
                                    localDatePlusMonths.getClass();
                                    eVar4 = new xz.e(i18, fFloatValue, (Object) x(localDatePlusMonths, kVar3, fValueOf.floatValue()), iArr2, 0.0f, z14, false, 80, (p005kotlin.jvm.internal.j) null);
                                }
                                if (eVar4 != null) {
                                    arrayList.add(eVar4);
                                }
                                it6 = it6;
                                it4 = it7;
                                map2 = map4;
                                i17 = i16;
                            }
                        } else {
                            arrayList = null;
                        }
                        map = map2;
                        i14 = i17;
                        it = it4;
                        if (arrayList != null) {
                            arrayList2 = new ArrayList();
                            Iterator it8 = arrayList.iterator();
                            while (it8.hasNext()) {
                                xz.e eVar5 = (xz.e) it8.next();
                                List list8 = (List) map3.get(mp.k.NON_PACK_WEIGHT_CALORIES);
                                if (list8 != null) {
                                    Iterator it9 = list8.iterator();
                                    do {
                                        if (!it9.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it9.next();
                                    } while (((yp.c) next2).f198607b != ((int) eVar5.getX()));
                                    yp.c cVar8 = (yp.c) next2;
                                    if (cVar8 == null || (d16 = cVar8.f198606a) == null) {
                                        dDoubleValue = 0.0d;
                                    } else {
                                        dDoubleValue = d16.doubleValue();
                                    }
                                } else {
                                    dDoubleValue = 0.0d;
                                }
                                List list9 = (List) map3.get(mp.k.PACK_WEIGHT_CALORIES);
                                if (list9 != null) {
                                    Iterator it10 = list9.iterator();
                                    while (true) {
                                        if (!it10.hasNext()) {
                                            it3 = it8;
                                            next = null;
                                            break;
                                        }
                                        next = it10.next();
                                        Iterator it11 = it10;
                                        it3 = it8;
                                        if (((yp.c) next).f198607b == ((int) eVar5.getX())) {
                                            break;
                                        }
                                        it10 = it11;
                                        it8 = it3;
                                    }
                                    yp.c cVar9 = (yp.c) next;
                                    if (cVar9 != null && (d15 = cVar9.f198606a) != null) {
                                        dDoubleValue2 = d15.doubleValue();
                                    }
                                    i15 = b.f179253a[kVar3.ordinal()];
                                    if (i15 != 1) {
                                        eVar2 = eVar5;
                                        if (dDoubleValue2 > fDoubleValue2) {
                                        }
                                    } else if (i15 == 3) {
                                        eVar2 = eVar5;
                                        double d34 = fDoubleValue2;
                                        eVar3 = (dDoubleValue <= d34 || (dDoubleValue == 0.0d && dDoubleValue2 > d34)) ? new xz.e(eVar2.getX(), eVar2.getY() + fDoubleValue2, (Object) null, new int[]{a7.b.getColor(context, R.color.surface_background_hero)}, 0.0f, eVar2.f192736c, false, 84, (p005kotlin.jvm.internal.j) null) : null;
                                    }
                                    if (eVar3 != null) {
                                        arrayList2.add(eVar3);
                                    }
                                    it8 = it3;
                                } else {
                                    it3 = it8;
                                }
                                dDoubleValue2 = 0.0d;
                                i15 = b.f179253a[kVar3.ordinal()];
                                if (i15 != 1) {
                                    eVar2 = eVar5;
                                    if (dDoubleValue2 > fDoubleValue2) {
                                    }
                                } else if (i15 == 3) {
                                    eVar2 = eVar5;
                                    double d35 = fDoubleValue2;
                                    if (dDoubleValue <= d35) {
                                    }
                                }
                                if (eVar3 != null) {
                                    arrayList2.add(eVar3);
                                }
                                it8 = it3;
                            }
                        } else {
                            arrayList2 = null;
                        }
                        if (arrayList2 != null) {
                            str = str2;
                            barDataSet = new BarDataSet(arrayList2, str);
                            barDataSet.setColor(a7.b.getColor(context, R.color.surface_background_hero));
                            barDataSet.setHighlightEnabled(false);
                        } else {
                            str = str2;
                            barDataSet = null;
                        }
                        if (arrayList != null) {
                            barDataSet2 = new BarDataSet(arrayList, str);
                            barDataSet2.setHighlightEnabled(true);
                            barDataSet2.setHighLightColor(context.getColor(R.color.gcm_chart_highlight_line));
                        } else {
                            barDataSet2 = null;
                        }
                        arrayListC = u.C(new BarDataSet[]{barDataSet, barDataSet2});
                    } else {
                        map = map2;
                        i14 = i17;
                        it = it4;
                        str = str2;
                        arrayListC = null;
                    }
                    if (arrayListC != null) {
                        arrayList3.add(arrayListC);
                    }
                    str2 = str;
                    it4 = it;
                    map2 = map;
                    i17 = i14;
                }
                return y.s(arrayList3);
            }
        } else {
            d14 = 0.0d;
        }
        int i25 = i17;
        int i26 = 0;
        if (kVar2 == kVar) {
            if (bVar2 != null) {
                i53.d<mp.k, List<yp.c>> dVar = bVar2.f198605a;
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry<mp.k, List<yp.c>> entry : dVar.entrySet()) {
                    if (s.g(entry.getKey().f120029b, mp.k.CALORIES.f120029b)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                linkedHashMap = 0;
            }
        } else if (bVar2 != null) {
            linkedHashMap = bVar2.f198605a;
        } else {
            linkedHashMap = 0;
        }
        if (linkedHashMap == 0) {
            return j0.f134944a;
        }
        ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
        Iterator it12 = linkedHashMap.entrySet().iterator();
        while (it12.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it12.next();
            Iterable<yp.c> iterable = (Iterable) entry2.getValue();
            ArrayList arrayList5 = new ArrayList();
            for (yp.c cVar10 : iterable) {
                Double d36 = cVar10.f198606a;
                int i27 = cVar10.f198607b;
                int i28 = i25;
                LocalDate localDatePlusMonths2 = i28 == 6 ? localDate.plusMonths(i27) : localDate.plusDays(i27);
                if (d36 == null || (s.c(d36, d14) && !wp.d.b((mp.k) entry2.getKey()))) {
                    eVar = null;
                } else {
                    float f14 = i27;
                    float fDoubleValue4 = (float) d36.doubleValue();
                    ArrayList arrayList6 = new ArrayList(2);
                    for (int i29 = 2; i26 < i29; i29 = 2) {
                        arrayList6.add(Integer.valueOf(a7.b.getColor(context, im.a.f94094k[i26])));
                        i26++;
                    }
                    int[] iArrA1 = h0.a1(arrayList6);
                    localDatePlusMonths2.getClass();
                    it12 = it12;
                    entry2 = entry2;
                    eVar = new xz.e(f14, fDoubleValue4, (Object) x(localDatePlusMonths2, (mp.k) entry2.getKey(), (float) d36.doubleValue()), iArrA1, 0.0f, false, false, 112, (p005kotlin.jvm.internal.j) null);
                }
                if (eVar != null) {
                    arrayList5.add(eVar);
                }
                it12 = it12;
                entry2 = entry2;
                i25 = i28;
                i26 = 0;
                d14 = 0.0d;
            }
            Iterator it13 = it12;
            BarDataSet barDataSet3 = new BarDataSet(arrayList5, "");
            barDataSet3.setHighlightEnabled(true);
            barDataSet3.setHighLightColor(context.getColor(R.color.gcm_chart_highlight_line));
            arrayList4.add(barDataSet3);
            it12 = it13;
            i26 = 0;
            d14 = 0.0d;
        }
        return arrayList4;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer c(yp.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(yp.b bVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(yp.b bVar) {
        return -0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(yp.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(yp.b bVar) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    @Override // qz.c
    public final float i(yp.b bVar) {
        float fDoubleValue;
        yp.b bVar2 = bVar;
        if (bVar2 != null) {
            i53.d<mp.k, List<yp.c>> dVar = bVar2.f198605a;
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<mp.k, List<yp.c>>> it = dVar.entrySet().iterator();
            while (it.hasNext()) {
                d0.v(arrayList, it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Double d14 = ((yp.c) it3.next()).f198606a;
                if (d14 != null) {
                    arrayList2.add(d14);
                }
            }
            Double dP0 = h0.p0(arrayList2);
            if (dP0 != null) {
                fDoubleValue = (float) dP0.doubleValue();
            } else {
                fDoubleValue = 0.0f;
            }
        } else {
            fDoubleValue = 0.0f;
        }
        return ((float) Math.ceil(fDoubleValue / 4.0f)) * 4.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(yp.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(yp.b bVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(yp.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(yp.b bVar) {
        return null;
    }

    @Override // qz.c
    public final float q(yp.b bVar) {
        float f14;
        LocalDate localDate = this.f179248c;
        LocalDate localDateMinusDays = localDate.plusMonths(1).minusDays(1);
        localDateMinusDays.getClass();
        int iM = oc.b.m(localDate, localDateMinusDays);
        int i14 = this.f179247b;
        if (i14 != 3) {
            f14 = 6.0f;
            if (i14 != 4) {
                if (i14 == 5) {
                    f14 = 27.0f;
                } else if (i14 == 6) {
                    f14 = 11.0f;
                }
            }
        } else {
            f14 = iM - 1.0f;
        }
        return f14 + 0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(yp.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(yp.b bVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final List u(yp.b bVar) {
        if (this.f179251f != mp.k.CALORIES || !s.g(this.f179252g.get(mp.j.PACK_CALORIE_DETAILS), Boolean.TRUE)) {
            return j0.f134944a;
        }
        mp.k kVar = mp.k.RESTING_CALORIES;
        c3 c3Var = kVar.f120028a;
        Context context = this.f179246a;
        String strA = dh.b.A(context, c3Var);
        xz.g.a aVar = xz.g.a.f192745a;
        xz.f fVar = new xz.f(strA, null, Integer.valueOf(a7.b.getColor(context, y(kVar))), null, aVar, null, null, 106, null);
        mp.k kVar2 = mp.k.NON_PACK_WEIGHT_CALORIES;
        xz.f fVar2 = new xz.f(dh.b.A(context, kVar2.f120028a), null, Integer.valueOf(a7.b.getColor(context, y(kVar2))), null, aVar, null, null, 106, null);
        mp.k kVar3 = mp.k.PACK_WEIGHT_CALORIES;
        return x.k(fVar, fVar2, new xz.f(dh.b.A(context, kVar3.f120028a), null, Integer.valueOf(a7.b.getColor(context, y(kVar3))), null, aVar, null, null, 106, null));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(yp.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(yp.b bVar) {
        return 0.0f;
    }

    public final l x(LocalDate localDate, mp.k kVar, float f14) {
        String strD;
        String string;
        int i14 = this.f179247b;
        Context context = this.f179246a;
        if (i14 == 6) {
            pi0.e eVar = new pi0.e(context);
            DateTime dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay();
            dateTimeAtStartOfDay.getClass();
            strD = eVar.j(dateTimeAtStartOfDay, pi0.d.DATE_FULL_MONTH_NO_PAST_YEAR);
        } else {
            strD = new pi0.e(context).d(localDate, qi0.a.RELATIVE_YEAR_MONTH_DAY);
        }
        String str = strD;
        String strA = wp.d.a(context, Double.valueOf(f14), kVar, l3.f23126d, this.f179249d, this.f179250e);
        String strA2 = dh.b.A(context, kVar.f120028a);
        boolean z14 = this.f179249d;
        m3 m3Var = z14 ? m3.KILOMETER : m3.MILE;
        m3 m3Var2 = z14 ? m3.METER : m3.YARD;
        int i15 = b.f179253a[kVar.ordinal()];
        if (i15 == 4) {
            string = context.getString(m3Var.f23164e);
        } else if (i15 == 5) {
            string = context.getString(m3Var2.f23164e);
        } else if (i15 != 6) {
            string = null;
        } else {
            l3.f23124b.getClass();
            string = l3.a.H1(context, z14);
        }
        return new l(str, strA, strA2, string, null, null, Integer.valueOf(R.drawable.gcm_chart_metric_bullet_no_goal), Integer.valueOf(y(kVar)), 48, null);
    }

    /* JADX INFO: renamed from: vp.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvp/a$a;", "", "<init>", "()V", "", "Y_AXIS_INTERVALS_COUNT", "F", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3345a {
        public /* synthetic */ C3345a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3345a() {
        }
    }
}
