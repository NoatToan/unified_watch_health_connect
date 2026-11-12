package iw0;

import android.content.Context;
import android.graphics.Shader;
import b63.o;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import pv0.w;
import pv0.x;
import pv0.y;
import zz.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0001\u0011B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Liw0/b;", "LifestyleMetric", "Lqz/c;", "Lkw0/f;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Lpi0/e;", "dateTimeFormatter", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lj23/g;", "Lb63/o;", "dateInterval", "", "showDetailedTypes", "isDaily", "<init>", "(Lpi0/e;Landroid/content/Context;Lj23/g;ZZ)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b<LifestyleMetric> implements qz.c<kw0.f<LifestyleMetric>, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pi0.e f95279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f95280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j23.g<o> f95281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f95282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f95283e;

    static {
        new a(null);
    }

    public b(pi0.e eVar, Context context, j23.g<o> gVar, boolean z14, boolean z15) {
        eVar.getClass();
        context.getClass();
        gVar.getClass();
        this.f95279a = eVar;
        this.f95280b = context;
        this.f95281c = gVar;
        this.f95282d = z14;
        this.f95283e = z15;
    }

    public static BarDataSet x(b bVar, ArrayList arrayList, ArrayList arrayList2, int i14) {
        Integer numValueOf = Integer.valueOf(R.color.gds_data_viz_blue_primary);
        if ((i14 & 2) != 0) {
            numValueOf = null;
        }
        if ((i14 & 4) != 0) {
            arrayList2 = null;
        }
        Context context = bVar.f95280b;
        BarDataSet barDataSet = new BarDataSet(arrayList, "");
        barDataSet.setDrawValues(false);
        if (numValueOf != null) {
            barDataSet.setColor(a7.b.getColor(context, numValueOf.intValue()));
        }
        if (arrayList2 != null) {
            barDataSet.setColors(arrayList2);
        }
        barDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
        barDataSet.setHighLightAlpha(255);
        return barDataSet;
    }

    @Override // qz.c
    public final List<BarDataSet> a(Object obj) {
        ArrayList arrayList;
        List<y> listA;
        String strC;
        Integer numValueOf;
        Iterator it;
        Iterator it3;
        List<y> listA2;
        kw0.f fVar = (kw0.f) obj;
        Integer numValueOf2 = Integer.valueOf(R.color.gds_data_viz_blue_primary);
        if (fVar == null) {
            return j0.f134944a;
        }
        w wVar = fVar.f106945b;
        List<kw0.d> list = fVar.f106948e;
        int i14 = 0;
        j23.g<o> gVar = this.f95281c;
        Context context = this.f95280b;
        boolean z14 = this.f95282d;
        boolean z15 = this.f95283e;
        if (!z14) {
            y yVar = null;
            float f14 = 0.0f;
            List<kw0.d> listB = lw0.a.b(list);
            int iB = lw0.b.b(gVar, z15);
            ArrayList arrayList2 = new ArrayList(iB);
            int i15 = 0;
            while (i15 < iB) {
                arrayList2.add(new BarEntry(i15, f14));
                i15++;
                f14 = 0.0f;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : listB) {
                o oVar = ((kw0.d) obj2).f106914a;
                Object arrayList3 = linkedHashMap.get(oVar);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap.put(oVar, arrayList3);
                }
                ((List) arrayList3).add(obj2);
            }
            ArrayList<kw0.d> arrayList4 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                o oVar2 = (o) entry.getKey();
                Iterator it4 = ((Iterable) entry.getValue()).iterator();
                int iIntValue = 0;
                while (it4.hasNext()) {
                    Integer num = ((kw0.d) it4.next()).f106915b;
                    iIntValue += num != null ? num.intValue() : 0;
                }
                arrayList4.add(new kw0.d(oVar2, Integer.valueOf(iIntValue), yVar));
                yVar = null;
            }
            for (kw0.d dVar : arrayList4) {
                o oVar3 = dVar.f106914a;
                int iB2 = lw0.b.b(((o) gVar.getStart()).d(oVar3 == null ? (o) gVar.getStart() : oVar3), z15) - 1;
                Integer num2 = dVar.f106915b;
                float fIntValue = num2 != null ? num2.intValue() : -1.0f;
                arrayList2.set(iB2, new BarEntry(iB2, fIntValue, i53.a.e(p13.w.c(y((int) fIntValue, oVar3, new l22.a(context).getString(R.string.lbl_quantity), numValueOf2)))));
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : arrayList2) {
                if (((BarEntry) obj3).getY() != 0.0f) {
                    arrayList5.add(obj3);
                }
            }
            return p13.w.c(x(this, arrayList5, null, 4));
        }
        List listA3 = (wVar == null || (listA2 = x.a(wVar)) == null) ? null : lw0.a.a(listA2, list);
        if (listA3 == null) {
            listA3 = j0.f134944a;
        }
        List<kw0.d> listB2 = lw0.a.b(list);
        int iB3 = lw0.b.b(gVar, z15);
        ArrayList arrayList6 = new ArrayList(iB3);
        for (int i16 = 0; i16 < iB3; i16++) {
            arrayList6.add(new BarEntry(i16, new float[0]));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj4 : listB2) {
            o oVar4 = ((kw0.d) obj4).f106914a;
            Object arrayList7 = linkedHashMap2.get(oVar4);
            if (arrayList7 == null) {
                arrayList7 = new ArrayList();
                linkedHashMap2.put(oVar4, arrayList7);
            }
            ((List) arrayList7).add(obj4);
        }
        ArrayList<iw0.a> arrayList8 = new ArrayList(linkedHashMap2.size());
        Iterator it5 = linkedHashMap2.entrySet().iterator();
        while (it5.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it5.next();
            int size = listA3.size();
            ArrayList arrayList9 = new ArrayList(size);
            for (int i17 = i14; i17 < size; i17++) {
                arrayList9.add(Float.valueOf(0.0f));
            }
            Iterator it6 = ((Iterable) entry2.getValue()).iterator();
            while (it6.hasNext()) {
                kw0.d dVar2 = (kw0.d) it6.next();
                Iterator it7 = listA3.iterator();
                int i18 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        it = it6;
                        it3 = it5;
                        i18 = -1;
                        break;
                    }
                    it = it6;
                    it3 = it5;
                    if (s.g((y) it7.next(), dVar2.f106916c)) {
                        break;
                    }
                    i18++;
                    it5 = it3;
                    it6 = it;
                }
                int i19 = i18;
                if (i19 >= 0) {
                    Integer num3 = dVar2.f106915b;
                    arrayList9.set(i19, Float.valueOf(num3 != null ? num3.intValue() : 0.0f));
                }
                it5 = it3;
                it6 = it;
            }
            arrayList8.add(new iw0.a((o) entry2.getKey(), arrayList9, wVar));
            it5 = it5;
            i14 = 0;
        }
        for (iw0.a aVar : arrayList8) {
            o oVar5 = aVar.f95276a;
            List<Float> list2 = aVar.f95277b;
            int iB4 = lw0.b.b(((o) gVar.getStart()).d(oVar5 == null ? (o) gVar.getStart() : oVar5), z15) - 1;
            ArrayList arrayList10 = new ArrayList();
            int i24 = 0;
            for (Object obj5 : list2) {
                int i25 = i24 + 1;
                if (i24 < 0) {
                    p13.x.q();
                    throw null;
                }
                w wVar2 = wVar;
                float fFloatValue = ((Number) obj5).floatValue();
                if (fFloatValue > 0.0f) {
                    y yVar2 = (y) h0.e0(i24, listA3);
                    if (yVar2 != null) {
                        zv0.a aVar2 = zv0.a.f207158a;
                        l22.a aVar3 = new l22.a(context);
                        aVar2.getClass();
                        strC = zv0.a.c(yVar2, aVar3);
                    } else {
                        strC = null;
                    }
                    int i26 = (int) fFloatValue;
                    if (strC == null) {
                        strC = fVar.f106944a;
                    }
                    if (yVar2 != null) {
                        bw0.a.b.f21564a.getClass();
                        numValueOf = Integer.valueOf(bw0.a.b.a(yVar2));
                    } else {
                        numValueOf = null;
                    }
                    arrayList10.add(y(i26, oVar5, strC, numValueOf));
                } else {
                    listA3 = listA3;
                }
                i24 = i25;
                wVar = wVar2;
                listA3 = listA3;
            }
            arrayList6.set(iB4, new BarEntry(iB4, h0.Y0(list2), i53.a.e(arrayList10)));
            wVar = wVar;
            listA3 = listA3;
        }
        w wVar3 = wVar;
        ArrayList arrayList11 = new ArrayList();
        for (Object obj6 : arrayList6) {
            if (((BarEntry) obj6).getY() != 0.0f) {
                arrayList11.add(obj6);
            }
        }
        if (wVar3 == null || (listA = x.a(wVar3)) == null) {
            arrayList = null;
        } else {
            ArrayList<y> arrayListA = lw0.a.a(listA, list);
            arrayList = new ArrayList(p13.y.r(arrayListA, 10));
            for (y yVar3 : arrayListA) {
                bw0.a.b.f21564a.getClass();
                arrayList.add(Integer.valueOf(context.getColor(bw0.a.b.a(yVar3))));
            }
        }
        return p13.w.c(x(this, arrayList11, arrayList, 2));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(Object obj) {
        return Integer.valueOf(lw0.b.b(this.f95281c, this.f95283e));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(Object obj) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(Object obj) {
        return -0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(Object obj) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    @Override // qz.c
    public final float i(Object obj) {
        float fIntValue;
        List<kw0.d> list;
        kw0.f fVar = (kw0.f) obj;
        if (fVar == null || (list = fVar.f106948e) == null) {
            fIntValue = 0.0f;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : list) {
                o oVar = ((kw0.d) obj2).f106914a;
                Object arrayList = linkedHashMap.get(oVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(oVar, arrayList);
                }
                ((List) arrayList).add(obj2);
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Iterator it3 = ((Iterable) ((Map.Entry) it.next()).getValue()).iterator();
                int iIntValue = 0;
                while (it3.hasNext()) {
                    Integer num = ((kw0.d) it3.next()).f106915b;
                    iIntValue += num != null ? num.intValue() : 0;
                }
                arrayList2.add(Integer.valueOf(iIntValue));
            }
            Integer num2 = (Integer) h0.o0(arrayList2);
            if (num2 != null) {
                fIntValue = num2.intValue();
            } else {
                fIntValue = 0.0f;
            }
        }
        float f14 = 5;
        if (fIntValue < f14) {
            return f14 - 1.0f;
        }
        float f15 = 4;
        float f16 = fIntValue % f15;
        return f16 == 0.0f ? fIntValue : (f15 - f16) + fIntValue;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(Object obj) {
        return 5;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(Object obj) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(Object obj) {
        return null;
    }

    @Override // qz.c
    public final float q(Object obj) {
        return lw0.b.c(this.f95281c, this.f95283e, true);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(Object obj) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List u(Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(Object obj) {
        return 0.0f;
    }

    public final l y(int i14, o oVar, String str, Integer num) {
        DateTime dateTimeNow;
        String strL;
        if (oVar == null || (dateTimeNow = g22.l.h(oVar).toDateTimeAtStartOfDay()) == null) {
            dateTimeNow = DateTime.now();
        }
        DateTime dateTimePlusDays = null;
        boolean z14 = this.f95283e;
        if (!z14 && dateTimeNow != null) {
            dateTimePlusDays = dateTimeNow.plusDays(6);
        }
        pi0.e eVar = this.f95279a;
        if (z14) {
            dateTimeNow.getClass();
            strL = eVar.a(dateTimeNow, qi0.a.RELATIVE_YEAR_MONTH_DAY);
        } else if (dateTimePlusDays != null) {
            dateTimeNow.getClass();
            strL = eVar.l(dateTimeNow, dateTimePlusDays, pi0.f.SHORT_MONTH_NO_WEEKDAY);
        } else {
            strL = "";
        }
        String str2 = strL;
        String strValueOf = String.valueOf(i14);
        int iIntValue = R.color.gds_data_viz_blue_primary;
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : R.color.gds_data_viz_blue_primary);
        Integer numValueOf2 = Integer.valueOf(R.drawable.gcm_chart_metric_bullet);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new l(str2, strValueOf, str, null, null, numValueOf, numValueOf2, Integer.valueOf(iIntValue), 24, null);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Liw0/b$a;", "", "<init>", "()V", "", "DEFAULT_X_AXIS_OFFSET", "F", "", "Y_AXIS_LABELS_COUNT", "I", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
