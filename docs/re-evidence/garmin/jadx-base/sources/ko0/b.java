package ko0;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import zz.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lko0/b;", "Lqz/c;", "Lco0/c;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lmo0/a;", "heartRateFormatter", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "Llo0/b;", "summarySetupData", "<init>", "(Landroid/content/Context;Lmo0/a;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Llo0/b;)V", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements qz.c<co0.c, ILineDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f105749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mo0.a f105750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f105751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalDate f105752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lo0.b f105753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f105754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f105755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f105756h;

    public b(Context context, mo0.a aVar, LocalDate localDate, LocalDate localDate2, lo0.b bVar) {
        context.getClass();
        aVar.getClass();
        localDate.getClass();
        localDate2.getClass();
        bVar.getClass();
        this.f105749a = context;
        this.f105750b = aVar;
        this.f105751c = localDate;
        this.f105752d = localDate2;
        this.f105753e = bVar;
        l22.a aVar2 = new l22.a(context);
        this.f105754f = aVar2.getString(bVar.getF113997d() == 1.0f ? R.string.lbl_resting_heart_rate : R.string.activities_average_resting_lbl);
        this.f105755g = aVar2.getString(bVar.getF113997d() == 1.0f ? R.string.txt_activity_level_high_label : R.string.lbl_avg_high);
        this.f105756h = aVar2.getString(R.string.lbl_bpm);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    public static float z(co0.c cVar) {
        int iIntValue;
        List<co0.d> list;
        Integer maxHeartRate;
        int iIntValue2;
        List<co0.d> list2;
        Object next;
        Integer restingHeartRate;
        int iIntValue3;
        int iIntValue4 = 0;
        Object next2 = null;
        if (cVar == null || (list2 = cVar.f28124a) == null) {
            iIntValue = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                co0.d.b values = ((co0.d) it.next()).getValues();
                Integer numValueOf = (values == null || (restingHeartRate = values.getRestingHeartRate()) == null || (iIntValue3 = restingHeartRate.intValue()) <= 0) ? null : Integer.valueOf(iIntValue3);
                if (numValueOf != null) {
                    arrayList.add(numValueOf);
                }
            }
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    int iIntValue5 = ((Number) next).intValue();
                    do {
                        Object next3 = it3.next();
                        int iIntValue6 = ((Number) next3).intValue();
                        if (iIntValue5 < iIntValue6) {
                            next = next3;
                            iIntValue5 = iIntValue6;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next = null;
            }
            Integer num = (Integer) next;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
        }
        if (cVar != null && (list = cVar.f28124a) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                co0.d.b values2 = ((co0.d) it4.next()).getValues();
                Integer numValueOf2 = (values2 == null || (maxHeartRate = values2.getMaxHeartRate()) == null || (iIntValue2 = maxHeartRate.intValue()) <= 0) ? null : Integer.valueOf(iIntValue2);
                if (numValueOf2 != null) {
                    arrayList2.add(numValueOf2);
                }
            }
            Iterator it5 = arrayList2.iterator();
            if (it5.hasNext()) {
                next2 = it5.next();
                if (it5.hasNext()) {
                    int iIntValue7 = ((Number) next2).intValue();
                    do {
                        Object next4 = it5.next();
                        int iIntValue8 = ((Number) next4).intValue();
                        if (iIntValue7 < iIntValue8) {
                            next2 = next4;
                            iIntValue7 = iIntValue8;
                        }
                    } while (it5.hasNext());
                }
            }
            Integer num2 = (Integer) next2;
            if (num2 != null) {
                iIntValue4 = num2.intValue();
            }
        }
        int iMax = Math.max(iIntValue, iIntValue4);
        if (iMax == 0) {
            return 200.0f;
        }
        fz.a.f73959a.getClass();
        return (float) fz.a.h(((double) iMax) + 5.0d);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x013d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0, types: [ko0.b] */
    /* JADX WARN: Type inference failed for: r5v5, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    @Override // qz.c
    public final List<ILineDataSet> a(co0.c cVar) {
        ?? arrayList;
        Context context;
        ?? arrayList2;
        xz.a aVar;
        Integer restingHeartRate;
        xz.a aVar2;
        Integer maxHeartRate;
        co0.c cVar2 = cVar;
        mo0.a aVar3 = this.f105750b;
        String str = aVar3.f119870c;
        List<co0.d> list = cVar2 != null ? cVar2.f28124a : null;
        int i14 = 6;
        lo0.b bVar = this.f105753e;
        if (list != null) {
            arrayList = new ArrayList();
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                co0.d dVar = (co0.d) it.next();
                co0.d.b values = dVar.getValues();
                if (values == null || (maxHeartRate = values.getMaxHeartRate()) == null) {
                    aVar2 = null;
                } else {
                    int iIntValue = maxHeartRate.intValue();
                    LocalDate localDateB = dVar.b();
                    if (iIntValue <= 0 || localDateB == null) {
                        aVar2 = null;
                    } else {
                        float f14 = iIntValue;
                        LocalDate localDatePlusDays = localDateB.plusDays(6);
                        localDatePlusDays.getClass();
                        String strC = bVar.c(localDateB, localDatePlusDays);
                        String strA = aVar3.a(iIntValue);
                        String str2 = strA == null ? str : strA;
                        lo0.b.f113999a.getClass();
                        aVar2 = new xz.a(localDateB, f14, new l(strC, str2, this.f105755g, this.f105756h, null, Integer.valueOf(lo0.b.a.f114001b), null, null, 208, null));
                    }
                }
                if (aVar2 != null) {
                    arrayList.add(aVar2);
                }
            }
        } else {
            arrayList = j0.f134944a;
        }
        LocalDate localDate = this.f105751c;
        ArrayList arrayListB = pz.d.b(1, y(arrayList, localDate));
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayListB.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            context = this.f105749a;
            if (!zHasNext) {
                break;
            }
            List list2 = (List) it3.next();
            lo0.b.f113999a.getClass();
            arrayList3.add(x(context.getColor(lo0.b.a.f114001b), list2));
        }
        List<co0.d> list3 = cVar2 != null ? cVar2.f28124a : null;
        if (list3 != null) {
            arrayList2 = new ArrayList();
            for (co0.d dVar2 : list3) {
                co0.d.b values2 = dVar2.getValues();
                if (values2 == null || (restingHeartRate = values2.getRestingHeartRate()) == null) {
                    aVar = null;
                } else {
                    int iIntValue2 = restingHeartRate.intValue();
                    LocalDate localDateB2 = dVar2.b();
                    if (iIntValue2 <= 0 || localDateB2 == null) {
                        aVar = null;
                    } else {
                        float f15 = iIntValue2;
                        LocalDate localDatePlusDays2 = localDateB2.plusDays(i14);
                        localDatePlusDays2.getClass();
                        String strC2 = bVar.c(localDateB2, localDatePlusDays2);
                        String strA2 = aVar3.a(iIntValue2);
                        String str3 = strA2 == null ? str : strA2;
                        lo0.b.f113999a.getClass();
                        aVar = new xz.a(localDateB2, f15, new l(strC2, str3, this.f105754f, this.f105756h, null, Integer.valueOf(lo0.b.a.f114002c), null, null, 208, null));
                    }
                }
                if (aVar != null) {
                    arrayList2.add(aVar);
                }
                bVar = bVar;
                i14 = 6;
            }
        } else {
            arrayList2 = j0.f134944a;
        }
        ArrayList<List> arrayListB2 = pz.d.b(1, y(arrayList2, localDate));
        ArrayList arrayList4 = new ArrayList();
        for (List list4 : arrayListB2) {
            lo0.b.f113999a.getClass();
            arrayList4.add(x(context.getColor(lo0.b.a.f114002c), list4));
        }
        return h0.C0(arrayList3, arrayList4);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer c(co0.c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(co0.c cVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(co0.c cVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(co0.c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(co0.c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float i(co0.c cVar) {
        return z(cVar);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(co0.c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(co0.c cVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(co0.c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(co0.c cVar) {
        return null;
    }

    @Override // qz.c
    public final float q(co0.c cVar) {
        return (int) (Days.daysBetween(this.f105751c, this.f105752d).getDays() / this.f105753e.getF113997d());
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(co0.c cVar) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    @Override // qz.c
    public final float t(co0.c cVar) {
        int iIntValue;
        List<co0.d> list;
        Integer maxHeartRate;
        int iIntValue2;
        List<co0.d> list2;
        Object next;
        Integer restingHeartRate;
        int iIntValue3;
        co0.c cVar2 = cVar;
        int iIntValue4 = 0;
        Object next2 = null;
        if (cVar2 == null || (list2 = cVar2.f28124a) == null) {
            iIntValue = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                co0.d.b values = ((co0.d) it.next()).getValues();
                Integer numValueOf = (values == null || (restingHeartRate = values.getRestingHeartRate()) == null || (iIntValue3 = restingHeartRate.intValue()) <= 0) ? null : Integer.valueOf(iIntValue3);
                if (numValueOf != null) {
                    arrayList.add(numValueOf);
                }
            }
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    int iIntValue5 = ((Number) next).intValue();
                    do {
                        Object next3 = it3.next();
                        int iIntValue6 = ((Number) next3).intValue();
                        if (iIntValue5 > iIntValue6) {
                            next = next3;
                            iIntValue5 = iIntValue6;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next = null;
            }
            Integer num = (Integer) next;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
        }
        if (cVar2 != null && (list = cVar2.f28124a) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                co0.d.b values2 = ((co0.d) it4.next()).getValues();
                Integer numValueOf2 = (values2 == null || (maxHeartRate = values2.getMaxHeartRate()) == null || (iIntValue2 = maxHeartRate.intValue()) <= 0) ? null : Integer.valueOf(iIntValue2);
                if (numValueOf2 != null) {
                    arrayList2.add(numValueOf2);
                }
            }
            Iterator it5 = arrayList2.iterator();
            if (it5.hasNext()) {
                next2 = it5.next();
                if (it5.hasNext()) {
                    int iIntValue7 = ((Number) next2).intValue();
                    do {
                        Object next4 = it5.next();
                        int iIntValue8 = ((Number) next4).intValue();
                        if (iIntValue7 > iIntValue8) {
                            next2 = next4;
                            iIntValue7 = iIntValue8;
                        }
                    } while (it5.hasNext());
                }
            }
            Integer num2 = (Integer) next2;
            if (num2 != null) {
                iIntValue4 = num2.intValue();
            }
        }
        int iMin = Math.min(iIntValue, iIntValue4);
        if (iMin == 0) {
            return 0.0f;
        }
        return xy2.b.y(Double.valueOf(iMin), z(cVar2));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List u(co0.c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(co0.c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(co0.c cVar) {
        return 0.0f;
    }

    public final LineDataSet x(int i14, List list) {
        LineDataSet lineDataSet = new LineDataSet(list, "");
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircles(this.f105753e.getF113996c());
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setCircleColor(i14);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setHighLightColor(this.f105749a.getColor(R.color.gcm_chart_highlight_line));
        lineDataSet.setHighlightLineWidth(1.0f);
        lineDataSet.setLineWidth(2.0f);
        lineDataSet.setColor(i14);
        return lineDataSet;
    }

    public final List<Entry> y(List<xz.a> list, LocalDate localDate) {
        if (list == null || list.isEmpty()) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (xz.a aVar : list) {
            arrayList.add(new Entry(Days.daysBetween(localDate, aVar.f192729a).getDays() / this.f105753e.getF113997d(), aVar.f192730b, aVar.f192731c));
        }
        return arrayList;
    }
}
