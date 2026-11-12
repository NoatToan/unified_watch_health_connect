package yh0;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.data.BarDataSet;
import g22.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p13.x;
import xz.g;
import zz.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lyh0/e;", "Lqz/c;", "Lsh0/e;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "Lpi0/e;", "gcmDateFormatter", "Lxh0/c;", "floorsDataFormatter", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lpi0/e;Lxh0/c;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements qz.c<sh0.e, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f197266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f197267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f197268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pi0.e f197269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xh0.c f197270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f197271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f197272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f197273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f197274i;

    static {
        new a(null);
    }

    public e(Context context, LocalDate localDate, LocalDate localDate2, pi0.e eVar, xh0.c cVar) {
        context.getClass();
        localDate.getClass();
        localDate2.getClass();
        eVar.getClass();
        cVar.getClass();
        this.f197266a = context;
        this.f197267b = localDate;
        this.f197268c = localDate2;
        this.f197269d = eVar;
        this.f197270e = cVar;
        String string = context.getString(R.string.lbl_climbed);
        string.getClass();
        this.f197271f = string;
        String string2 = context.getString(R.string.lbl_descended);
        string2.getClass();
        this.f197272g = string2;
        this.f197273h = a7.b.getColor(context, R.color.gcm_weekly_floors_climbed);
        this.f197274i = a7.b.getColor(context, R.color.gcm_weekly_floors_descended);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    public static float y(sh0.e eVar) {
        double dDoubleValue;
        double dDoubleValue2;
        Number numberValueOf;
        sh0.f.d dVar;
        Double d14;
        Double d15;
        Double d16;
        Object next;
        Double d17;
        Double d18;
        sh0.f.d dVar2;
        Double d19;
        Object next2 = null;
        List<sh0.f> list = eVar != null ? eVar.f159296a : null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    sh0.f.d dVar3 = ((sh0.f) next).f159298b;
                    double dDoubleValue3 = (dVar3 == null || (d18 = dVar3.f159302b) == null) ? 0.0d : d18.doubleValue();
                    do {
                        Object next3 = it.next();
                        sh0.f.d dVar4 = ((sh0.f) next3).f159298b;
                        double dDoubleValue4 = (dVar4 == null || (d17 = dVar4.f159302b) == null) ? 0.0d : d17.doubleValue();
                        if (Double.compare(dDoubleValue3, dDoubleValue4) < 0) {
                            next = next3;
                            dDoubleValue3 = dDoubleValue4;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            sh0.f fVar = (sh0.f) next;
            if (fVar == null || (dVar2 = fVar.f159298b) == null || (d19 = dVar2.f159302b) == null) {
                dDoubleValue = 0.0d;
            } else {
                dDoubleValue = d19.doubleValue();
            }
        } else {
            dDoubleValue = 0.0d;
        }
        if (list != null) {
            Iterator<T> it3 = list.iterator();
            if (it3.hasNext()) {
                next2 = it3.next();
                if (it3.hasNext()) {
                    sh0.f.d dVar5 = ((sh0.f) next2).f159298b;
                    double dDoubleValue5 = (dVar5 == null || (d16 = dVar5.f159303c) == null) ? 0.0d : d16.doubleValue();
                    do {
                        Object next4 = it3.next();
                        sh0.f.d dVar6 = ((sh0.f) next4).f159298b;
                        double dDoubleValue6 = (dVar6 == null || (d15 = dVar6.f159303c) == null) ? 0.0d : d15.doubleValue();
                        if (Double.compare(dDoubleValue5, dDoubleValue6) < 0) {
                            next2 = next4;
                            dDoubleValue5 = dDoubleValue6;
                        }
                    } while (it3.hasNext());
                }
            }
            sh0.f fVar2 = (sh0.f) next2;
            if (fVar2 == null || (dVar = fVar2.f159298b) == null || (d14 = dVar.f159303c) == null) {
                dDoubleValue2 = 0.0d;
            } else {
                dDoubleValue2 = d14.doubleValue();
            }
        } else {
            dDoubleValue2 = 0.0d;
        }
        if (list == null || list.isEmpty() || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d)) {
            numberValueOf = Float.valueOf(100.0f);
        } else {
            double dMax = Math.max(dDoubleValue, dDoubleValue2);
            if (dMax % ((double) 2) != 0.0d) {
                dMax += (double) 1;
            }
            numberValueOf = Double.valueOf(dMax);
        }
        return numberValueOf.floatValue();
    }

    @Override // qz.c
    public final List<BarDataSet> a(sh0.e eVar) {
        List list;
        Double d14;
        Context context;
        List list2;
        ArrayList arrayList;
        Double d15;
        sh0.e eVar2 = eVar;
        ArrayList arrayList2 = new ArrayList();
        xh0.c cVar = this.f197270e;
        LocalDate localDate = this.f197267b;
        int i14 = 6;
        if (eVar2 == null) {
            list = j0.f134944a;
        } else {
            ArrayList arrayList3 = new ArrayList();
            List<sh0.f> list3 = eVar2.f159296a;
            if (list3 != null) {
                for (sh0.f fVar : list3) {
                    sh0.f.d dVar = fVar.f159298b;
                    if (dVar != null && (d14 = dVar.f159302b) != null) {
                        float fDoubleValue = (float) d14.doubleValue();
                        String str = fVar.f159297a;
                        LocalDate localDateV = str != null ? k.v(str, "yyyy-MM-dd") : null;
                        arrayList3.add(new xz.e(localDateV != null ? Days.daysBetween(localDate, localDateV).getDays() / 7 : 0, fDoubleValue, (Object) x(fDoubleValue, localDateV, localDateV != null ? localDateV.plusDays(6) : null, this.f197271f, cVar.f190979b, R.color.gcm_weekly_floors_climbed), new int[]{this.f197273h}, fDoubleValue, false, false, 96, (j) null));
                    }
                }
            }
            list = arrayList3;
        }
        BarDataSet barDataSet = new BarDataSet(list, "");
        barDataSet.setHighlightEnabled(true);
        Context context2 = this.f197266a;
        char c14 = 627;
        barDataSet.setHighLightColor(a7.b.getColor(context2, R.color.gcm_chart_highlight_line));
        arrayList2.add(barDataSet);
        if (eVar2 == null) {
            list2 = j0.f134944a;
            context = context2;
        } else {
            ArrayList arrayList4 = new ArrayList();
            List<sh0.f> list4 = eVar2.f159296a;
            if (list4 != null) {
                for (sh0.f fVar2 : list4) {
                    sh0.f.d dVar2 = fVar2.f159298b;
                    if (dVar2 == null || (d15 = dVar2.f159303c) == null) {
                        arrayList = arrayList4;
                    } else {
                        float fDoubleValue2 = (float) d15.doubleValue();
                        String str2 = fVar2.f159297a;
                        LocalDate localDateV2 = str2 != null ? k.v(str2, "yyyy-MM-dd") : null;
                        LocalDate localDatePlusDays = localDateV2 != null ? localDateV2.plusDays(i14) : null;
                        arrayList = arrayList4;
                        arrayList.add(new xz.e(localDateV2 != null ? Days.daysBetween(localDate, localDateV2).getDays() / 7 : 0, -Math.abs(fDoubleValue2), (Object) x(fDoubleValue2, localDateV2, localDatePlusDays, this.f197272g, cVar.f190980c, R.color.gcm_weekly_floors_descended), new int[]{this.f197274i}, fDoubleValue2, false, true));
                    }
                    arrayList4 = arrayList;
                    context2 = context2;
                    c14 = 627;
                    i14 = 6;
                }
            }
            context = context2;
            list2 = arrayList4;
        }
        BarDataSet barDataSet2 = new BarDataSet(list2, "");
        barDataSet2.setHighlightEnabled(true);
        barDataSet2.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
        arrayList2.add(barDataSet2);
        return arrayList2;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(sh0.e eVar) {
        return Integer.valueOf(pz.d.e(this.f197267b, this.f197268c, 5).size());
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(sh0.e eVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(sh0.e eVar) {
        return -0.5f;
    }

    @Override // qz.c
    public final List f(sh0.e eVar) {
        sh0.e eVar2 = eVar;
        ArrayList arrayList = new ArrayList();
        if (eVar2 != null && eVar2.b()) {
            LimitLine limitLine = new LimitLine(0.0f);
            limitLine.setLineWidth(0.5f);
            limitLine.setLineColor(a7.b.getColor(this.f197266a, R.color.gcm_chart_floors_limit_line));
            arrayList.add(limitLine);
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(sh0.e eVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float i(sh0.e eVar) {
        return y(eVar);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(sh0.e eVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(sh0.e eVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(sh0.e eVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(sh0.e eVar) {
        return null;
    }

    @Override // qz.c
    public final float q(sh0.e eVar) {
        return (Days.daysBetween(this.f197267b, this.f197268c).getDays() / 7) + 0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(sh0.e eVar) {
        return null;
    }

    @Override // qz.c
    public final float t(sh0.e eVar) {
        return -Math.abs(y(eVar));
    }

    @Override // qz.c
    public final List u(sh0.e eVar) {
        sh0.e eVar2 = eVar;
        if (eVar2 == null || !eVar2.b()) {
            return j0.f134944a;
        }
        Integer numValueOf = Integer.valueOf(this.f197273h);
        g.a aVar = g.a.f192745a;
        return x.k(new xz.f(this.f197271f, null, numValueOf, null, aVar, null, null, 106, null), new xz.f(this.f197272g, null, Integer.valueOf(this.f197274i), null, aVar, null, null, 106, null));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(sh0.e eVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(sh0.e eVar) {
        return 0.0f;
    }

    public final l x(float f14, LocalDate localDate, LocalDate localDate2, String str, String str2, int i14) {
        if (f14 < 0.0f || localDate == null || localDate2 == null) {
            return null;
        }
        return new l(this.f197269d.m(localDate, localDate2, pi0.f.SHORT_MONTH_NO_WEEKDAY), xh0.c.b(f14), str, str2, null, Integer.valueOf(i14), null, null, 208, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lyh0/e$a;", "", "<init>", "()V", "", "DEFAULT_X_AXIS_OFFSET", "F", "DEFAULT_Y_LABEL_VALUE", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
