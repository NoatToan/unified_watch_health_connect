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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lyh0/a;", "Lqz/c;", "Lsh0/a;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "Lpi0/e;", "gcmDateFormatter", "Lxh0/c;", "floorsDataFormatter", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lpi0/e;Lxh0/c;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements qz.c<sh0.a, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f197245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f197246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f197247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pi0.e f197248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xh0.c f197249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f197250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f197251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f197252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f197253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f197254j;

    static {
        new C3692a(null);
    }

    public a(Context context, LocalDate localDate, LocalDate localDate2, pi0.e eVar, xh0.c cVar) {
        context.getClass();
        eVar.getClass();
        cVar.getClass();
        this.f197245a = context;
        this.f197246b = localDate;
        this.f197247c = localDate2;
        this.f197248d = eVar;
        this.f197249e = cVar;
        String string = context.getString(R.string.lbl_climbed);
        string.getClass();
        this.f197250f = string;
        String string2 = context.getString(R.string.lbl_descended);
        string2.getClass();
        this.f197251g = string2;
        String string3 = context.getString(R.string.lbl_goal);
        string3.getClass();
        this.f197252h = string3;
        this.f197253i = a7.b.getColor(context, R.color.gcm_weekly_floors_climbed);
        this.f197254j = a7.b.getColor(context, R.color.gcm_weekly_floors_descended);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    public static float y(sh0.a aVar) {
        int iIntValue;
        int iIntValue2;
        Integer numB;
        sh0.b.d dVar;
        Integer num;
        Integer num2;
        Integer num3;
        Object next;
        Integer num4;
        Integer num5;
        sh0.b.d dVar2;
        Integer num6;
        Object next2 = null;
        List<sh0.b> list = aVar != null ? aVar.f159272a : null;
        int iIntValue3 = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    sh0.b.d dVar3 = ((sh0.b) next).f159274b;
                    int iIntValue4 = (dVar3 == null || (num5 = dVar3.f159278b) == null) ? 0 : num5.intValue();
                    do {
                        Object next3 = it.next();
                        sh0.b.d dVar4 = ((sh0.b) next3).f159274b;
                        int iIntValue5 = (dVar4 == null || (num4 = dVar4.f159278b) == null) ? 0 : num4.intValue();
                        if (iIntValue4 < iIntValue5) {
                            next = next3;
                            iIntValue4 = iIntValue5;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            sh0.b bVar = (sh0.b) next;
            if (bVar == null || (dVar2 = bVar.f159274b) == null || (num6 = dVar2.f159278b) == null) {
                iIntValue = 0;
            } else {
                iIntValue = num6.intValue();
            }
        } else {
            iIntValue = 0;
        }
        if (list != null) {
            Iterator<T> it3 = list.iterator();
            if (it3.hasNext()) {
                next2 = it3.next();
                if (it3.hasNext()) {
                    sh0.b.d dVar5 = ((sh0.b) next2).f159274b;
                    int iIntValue6 = (dVar5 == null || (num3 = dVar5.f159279c) == null) ? 0 : num3.intValue();
                    do {
                        Object next4 = it3.next();
                        sh0.b.d dVar6 = ((sh0.b) next4).f159274b;
                        int iIntValue7 = (dVar6 == null || (num2 = dVar6.f159279c) == null) ? 0 : num2.intValue();
                        if (iIntValue6 < iIntValue7) {
                            next2 = next4;
                            iIntValue6 = iIntValue7;
                        }
                    } while (it3.hasNext());
                }
            }
            sh0.b bVar2 = (sh0.b) next2;
            if (bVar2 == null || (dVar = bVar2.f159274b) == null || (num = dVar.f159279c) == null) {
                iIntValue2 = 0;
            } else {
                iIntValue2 = num.intValue();
            }
        } else {
            iIntValue2 = 0;
        }
        if (aVar != null && (numB = aVar.b()) != null) {
            iIntValue3 = numB.intValue();
        }
        if (list == null || list.isEmpty()) {
            return 16.0f;
        }
        if (iIntValue == 0 && iIntValue2 == 0) {
            return 16.0f;
        }
        float fMax = Math.max(Math.max(iIntValue, iIntValue2), iIntValue3);
        return fMax % ((float) 2) == 0.0f ? fMax : fMax + 1;
    }

    @Override // qz.c
    public final List<BarDataSet> a(sh0.a aVar) {
        List list;
        Integer num;
        List list2;
        ArrayList arrayList;
        Integer num2;
        sh0.a aVar2 = aVar;
        ArrayList arrayList2 = new ArrayList();
        xh0.c cVar = this.f197249e;
        LocalDate localDate = this.f197246b;
        if (aVar2 == null) {
            list = j0.f134944a;
        } else {
            ArrayList arrayList3 = new ArrayList();
            List<sh0.b> list3 = aVar2.f159272a;
            if (list3 != null) {
                for (sh0.b bVar : list3) {
                    sh0.b.d dVar = bVar.f159274b;
                    if (dVar != null && (num = dVar.f159278b) != null) {
                        float fIntValue = num.intValue();
                        String str = bVar.f159273a;
                        LocalDate localDateV = str != null ? k.v(str, "yyyy-MM-dd") : null;
                        arrayList3.add(new xz.e(localDateV != null ? Days.daysBetween(localDate, localDateV).getDays() : 0, fIntValue, (Object) x(fIntValue, localDateV, this.f197250f, cVar.f190979b, R.color.gcm_weekly_floors_climbed), new int[]{this.f197253i}, fIntValue, false, false, 96, (j) null));
                    }
                }
            }
            list = arrayList3;
        }
        BarDataSet barDataSet = new BarDataSet(list, "");
        barDataSet.setHighlightEnabled(true);
        Context context = this.f197245a;
        barDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
        arrayList2.add(barDataSet);
        if (aVar2 == null) {
            list2 = j0.f134944a;
        } else {
            ArrayList arrayList4 = new ArrayList();
            List<sh0.b> list4 = aVar2.f159272a;
            if (list4 != null) {
                for (sh0.b bVar2 : list4) {
                    sh0.b.d dVar2 = bVar2.f159274b;
                    if (dVar2 == null || (num2 = dVar2.f159279c) == null) {
                        arrayList = arrayList4;
                    } else {
                        float fIntValue2 = num2.intValue();
                        String str2 = bVar2.f159273a;
                        LocalDate localDateV2 = str2 != null ? k.v(str2, "yyyy-MM-dd") : null;
                        arrayList = arrayList4;
                        arrayList.add(new xz.e(localDateV2 != null ? Days.daysBetween(localDate, localDateV2).getDays() : 0, -Math.abs(fIntValue2), (Object) x(fIntValue2, localDateV2, this.f197251g, cVar.f190980c, R.color.gcm_weekly_floors_descended), new int[]{this.f197254j}, fIntValue2, false, true));
                    }
                    arrayList4 = arrayList;
                }
            }
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
    public final Integer c(sh0.a aVar) {
        return Integer.valueOf(Days.daysBetween(this.f197246b, this.f197247c).getDays() + 1);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(sh0.a aVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(sh0.a aVar) {
        return -0.5f;
    }

    @Override // qz.c
    public final List f(sh0.a aVar) {
        sh0.a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        if (aVar2 != null && aVar2.d()) {
            LimitLine limitLine = new LimitLine(0.0f);
            limitLine.setLineWidth(0.5f);
            Context context = this.f197245a;
            limitLine.setLineColor(a7.b.getColor(context, R.color.gcm_chart_floors_limit_line));
            arrayList.add(limitLine);
            Integer numB = aVar2.b();
            Float fValueOf = numB != null ? Float.valueOf(numB.intValue()) : null;
            if (fValueOf != null && fValueOf.floatValue() >= 0.0f) {
                LimitLine limitLine2 = new LimitLine(fValueOf.floatValue());
                limitLine2.setLineWidth(2.0f);
                limitLine2.setLineColor(a7.b.getColor(context, R.color.gcm_chart_floors_goal));
                limitLine2.enableDashedLine(10.0f, 10.0f, 0.0f);
                arrayList.add(limitLine2);
            }
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(sh0.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float i(sh0.a aVar) {
        return y(aVar);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(sh0.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(sh0.a aVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(sh0.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(sh0.a aVar) {
        return null;
    }

    @Override // qz.c
    public final float q(sh0.a aVar) {
        return Days.daysBetween(this.f197246b, this.f197247c).getDays() + 0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(sh0.a aVar) {
        return null;
    }

    @Override // qz.c
    public final float t(sh0.a aVar) {
        return -Math.abs(y(aVar));
    }

    @Override // qz.c
    public final List u(sh0.a aVar) {
        sh0.a aVar2 = aVar;
        if (aVar2 == null || !aVar2.d()) {
            return j0.f134944a;
        }
        Integer numValueOf = Integer.valueOf(this.f197253i);
        g.a aVar3 = g.a.f192745a;
        return x.k(new xz.f(this.f197250f, null, numValueOf, null, aVar3, null, null, 106, null), new xz.f(this.f197251g, null, Integer.valueOf(this.f197254j), null, aVar3, null, null, 106, null), new xz.f(this.f197252h, null, Integer.valueOf(a7.b.getColor(this.f197245a, R.color.gcm_chart_floors_goal)), null, new g.c(0, 0.0f, 3, null), null, null, 106, null));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(sh0.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(sh0.a aVar) {
        return 0.0f;
    }

    public final l x(float f14, LocalDate localDate, String str, String str2, int i14) {
        if (f14 < 0.0f || localDate == null || this.f197247c == null) {
            return null;
        }
        return new l(this.f197248d.d(localDate, qi0.a.RELATIVE_YEAR_MONTH_DAY), xh0.c.b(f14), str, str2, null, Integer.valueOf(i14), null, null, 208, null);
    }

    /* JADX INFO: renamed from: yh0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lyh0/a$a;", "", "<init>", "()V", "", "DEFAULT_X_AXIS_OFFSET", "F", "DEFAULT_Y_LABEL_VALUE", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3692a {
        public /* synthetic */ C3692a(j jVar) {
            this();
        }

        private C3692a() {
        }
    }
}
