package rp0;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.BarDataSet;
import g22.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import lc.u0;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;
import p13.w;
import pi0.e;
import zz.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lrp0/a;", "Lqz/c;", "Lsp0/a;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpi0/e;", "gcmDateFormatter", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Landroid/content/Context;Lpi0/e;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "a", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements qz.c<sp0.a, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f154064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f154065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f154066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalDate f154067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wp0.a f154068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f154069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f154070g;

    static {
        new C2916a(null);
    }

    public a(Context context, e eVar, LocalDate localDate, LocalDate localDate2) {
        context.getClass();
        eVar.getClass();
        this.f154064a = context;
        this.f154065b = eVar;
        this.f154066c = localDate;
        this.f154067d = localDate2;
        this.f154068e = new wp0.a(new l22.a(context));
        this.f154069f = context.getColor(R.color.gcm_chart_indicator_goal_in_progress);
        this.f154070g = context.getColor(R.color.gcm_chart_indicator_goal_achieved);
    }

    @Override // qz.c
    public final List<BarDataSet> a(sp0.a aVar) {
        wp0.a aVar2;
        List list;
        double d14;
        double dDoubleValue;
        Object obj;
        Object next;
        Double d15;
        Double d16;
        Double d17;
        a aVar3 = this;
        sp0.a aVar4 = aVar;
        if (aVar4 == null) {
            list = j0.f134944a;
        } else {
            List<sp0.b> list2 = aVar4.f160503c;
            LocalDate localDate = aVar4.f160501a;
            int i14 = aVar3.f154069f;
            int[] iArr = {i14, i14};
            int[] iArr2 = {aVar3.f154070g};
            int iE = u0.e(localDate, aVar4.f160502b, 1);
            ArrayList arrayList = new ArrayList(iE);
            int i15 = 0;
            while (true) {
                aVar2 = aVar3.f154068e;
                if (i15 >= iE) {
                    break;
                }
                LocalDate localDatePlusDays = localDate.plusDays(i15);
                if (list2 != null) {
                    localDatePlusDays.getClass();
                    List listN0 = h0.N0(list2, new b());
                    d14 = 0.0d;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : listN0) {
                        sp0.b bVar = (sp0.b) obj2;
                        LocalDate localDate2 = bVar.f160505a;
                        if (localDate2 != null && (k.g(localDate2, localDatePlusDays) || bVar.f160505a.isAfter(localDatePlusDays))) {
                            arrayList2.add(obj2);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    do {
                        obj = null;
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        d17 = ((sp0.b) next).f160507c;
                    } while ((d17 != null ? d17.doubleValue() : 0.0d) <= 0.0d);
                    sp0.b bVar2 = (sp0.b) next;
                    double dDoubleValue2 = (bVar2 == null || (d16 = bVar2.f160507c) == null) ? 0.0d : d16.doubleValue();
                    if (dDoubleValue2 > 0.0d) {
                        dDoubleValue = dDoubleValue2;
                    } else {
                        ListIterator listIterator = listN0.listIterator(listN0.size());
                        while (listIterator.hasPrevious()) {
                            Object objPrevious = listIterator.previous();
                            Double d18 = ((sp0.b) objPrevious).f160507c;
                            if ((d18 != null ? d18.doubleValue() : 0.0d) > 0.0d) {
                                obj = objPrevious;
                                break;
                            }
                        }
                        sp0.b bVar3 = (sp0.b) obj;
                        if (bVar3 != null && (d15 = bVar3.f160507c) != null) {
                            dDoubleValue = d15.doubleValue();
                        }
                    }
                    aVar2.getClass();
                    double dH = wp0.a.h(dDoubleValue);
                    l lVarX = x(0.0d, dH, localDatePlusDays);
                    float f14 = (float) dH;
                    int[] iArr3 = iArr2;
                    ArrayList arrayList3 = arrayList;
                    arrayList3.add(new xz.e(i15, 0.0f, (Object) lVarX, iArr3, f14, false, false, 96, (j) null));
                    i15++;
                    iE = iE;
                    arrayList = arrayList3;
                    iArr2 = iArr3;
                    aVar3 = this;
                } else {
                    d14 = 0.0d;
                }
                dDoubleValue = d14;
                aVar2.getClass();
                double dH2 = wp0.a.h(dDoubleValue);
                l lVarX2 = x(0.0d, dH2, localDatePlusDays);
                float f15 = (float) dH2;
                int[] iArr4 = iArr2;
                ArrayList arrayList4 = arrayList;
                arrayList4.add(new xz.e(i15, 0.0f, (Object) lVarX2, iArr4, f15, false, false, 96, (j) null));
                i15++;
                iE = iE;
                arrayList = arrayList4;
                iArr2 = iArr4;
                aVar3 = this;
            }
            int[] iArr5 = iArr2;
            ArrayList arrayList5 = arrayList;
            if (list2 != null) {
                for (sp0.b bVar4 : list2) {
                    LocalDate localDate3 = bVar4.f160505a;
                    int days = localDate3 != null ? Days.daysBetween(localDate, localDate3).getDays() : 0;
                    Double d19 = bVar4.f160506b;
                    double dDoubleValue3 = d19 != null ? d19.doubleValue() : -1.0d;
                    Double d24 = bVar4.f160507c;
                    double dDoubleValue4 = d24 != null ? d24.doubleValue() : -1.0d;
                    aVar2.getClass();
                    wp0.a aVar5 = aVar2;
                    double d25 = dDoubleValue3;
                    arrayList5.set(days, new xz.e(days, (float) wp0.a.h(dDoubleValue3), (Object) x(d25, dDoubleValue4, bVar4.f160505a), d25 >= dDoubleValue4 ? iArr5 : iArr, (float) wp0.a.h(dDoubleValue4), false, false, 96, (j) null));
                    aVar2 = aVar5;
                }
            }
            aVar3 = this;
            list = (list2 == null || list2.isEmpty()) ? j0.f134944a : arrayList5;
        }
        BarDataSet barDataSet = new BarDataSet(list, "");
        Context context = aVar3.f154064a;
        barDataSet.setBarShadowColor(context.getColor(R.color.gcm_progress_indicator_empty));
        barDataSet.setHighlightEnabled(true);
        barDataSet.setHighLightColor(context.getColor(R.color.gcm_chart_highlight_line));
        return w.c(barDataSet);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(sp0.a aVar) {
        return Integer.valueOf(Days.daysBetween(this.f154066c, this.f154067d).getDays() + 1);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(sp0.a aVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(sp0.a aVar) {
        return -0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(sp0.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(sp0.a aVar) {
        return null;
    }

    @Override // qz.c
    public final float i(sp0.a aVar) {
        List<sp0.b> list;
        Double d14;
        List<sp0.b> list2;
        Object next;
        Double d15;
        sp0.a aVar2 = aVar;
        this.f154068e.getClass();
        Object next2 = null;
        double dE = jp0.c.e(null, ((mp0.a) KoinJavaComponent.get$default(mp0.a.class, null, null, 6, null)).a(), 1);
        double dDoubleValue = 0.0d;
        if (aVar2 != null && (list2 = aVar2.f160503c) != null) {
            Iterator<T> it = list2.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    Double d16 = ((sp0.b) next).f160506b;
                    double dDoubleValue2 = d16 != null ? d16.doubleValue() : 0.0d;
                    do {
                        Object next3 = it.next();
                        Double d17 = ((sp0.b) next3).f160506b;
                        double dDoubleValue3 = d17 != null ? d17.doubleValue() : 0.0d;
                        if (Double.compare(dDoubleValue2, dDoubleValue3) < 0) {
                            next = next3;
                            dDoubleValue2 = dDoubleValue3;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            sp0.b bVar = (sp0.b) next;
            if (bVar != null && (d15 = bVar.f160506b) != null) {
                dDoubleValue = d15.doubleValue();
            }
        }
        if (aVar2 != null && (list = aVar2.f160503c) != null) {
            Iterator<T> it3 = list.iterator();
            if (it3.hasNext()) {
                next2 = it3.next();
                if (it3.hasNext()) {
                    Double d18 = ((sp0.b) next2).f160507c;
                    double dDoubleValue4 = d18 != null ? d18.doubleValue() : dE;
                    do {
                        Object next4 = it3.next();
                        Double d19 = ((sp0.b) next4).f160507c;
                        double dDoubleValue5 = d19 != null ? d19.doubleValue() : dE;
                        if (Double.compare(dDoubleValue4, dDoubleValue5) < 0) {
                            next2 = next4;
                            dDoubleValue4 = dDoubleValue5;
                        }
                    } while (it3.hasNext());
                }
            }
            sp0.b bVar2 = (sp0.b) next2;
            if (bVar2 != null && (d14 = bVar2.f160507c) != null) {
                dE = d14.doubleValue();
            }
        }
        return qp0.a.a(wp0.a.h(dDoubleValue), wp0.a.h(dE));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(sp0.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(sp0.a aVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(sp0.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(sp0.a aVar) {
        return null;
    }

    @Override // qz.c
    public final float q(sp0.a aVar) {
        return Days.daysBetween(this.f154066c, this.f154067d).getDays() + 0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(sp0.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(sp0.a aVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List u(sp0.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(sp0.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(sp0.a aVar) {
        return 0.0f;
    }

    public final l x(double d14, double d15, LocalDate localDate) {
        if ((d15 < 0.0d && d14 < 0.0d) || localDate == null) {
            return null;
        }
        String strD = this.f154065b.d(localDate, qi0.a.RELATIVE_YEAR_MONTH_DAY);
        wp0.a aVar = this.f154068e;
        return new l(strD, aVar.d(d14, false), aVar.g(d14, false), null, null, d14 >= d15 ? Integer.valueOf(R.color.gcm_chart_indicator_goal_achieved) : null, Integer.valueOf(d14 < d15 ? R.drawable.gcm_chart_metric_bullet_goal_in_progress : R.drawable.gcm_chart_metric_bullet_goal_achieved), null, SyslogConstants.LOG_LOCAL3, null);
    }

    /* JADX INFO: renamed from: rp0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lrp0/a$a;", "", "<init>", "()V", "", "DEFAULT_X_AXIS_OFFSET", "F", "", "NO_DATA_VALUE", "D", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2916a {
        public /* synthetic */ C2916a(j jVar) {
            this();
        }

        private C2916a() {
        }
    }
}
