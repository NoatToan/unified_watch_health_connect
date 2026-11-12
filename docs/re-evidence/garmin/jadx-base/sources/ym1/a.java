package ym1;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.model.GradientColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.w;
import p13.x;
import w52.u0;
import zz.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lym1/a;", "Lqz/c;", "Lym1/c;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "showSleepNeed", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Z)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements qz.c<c, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f198097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f198098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f198099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pi0.e f198100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b10.d f198101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f198102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f198103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f198104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f198105i;

    static {
        new C3710a(null);
    }

    public a(Context context, LocalDate localDate, LocalDate localDate2, boolean z14) {
        context.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f198097a = localDate;
        this.f198098b = localDate2;
        this.f198099c = z14;
        this.f198100d = new pi0.e(context);
        this.f198101e = new b10.d(context);
        this.f198102f = a7.b.getColor(context, R.color.gcm_chart_goal_in_progress);
        this.f198103g = a7.b.getColor(context, z14 ? R.color.gcm_progress_indicator_empty : R.color.gcm3_transparent);
        this.f198104h = a7.b.getColor(context, R.color.gcm_chart_goal_met);
        this.f198105i = a7.b.getColor(context, R.color.gcm_chart_highlight_line);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @Override // qz.c
    public final List<BarDataSet> a(c cVar) {
        List list;
        int iIntValue;
        l lVar;
        Object next;
        Integer num;
        c cVar2 = cVar;
        if (!this.f198099c) {
            return w.c(x(y(cVar2)));
        }
        BarDataSet barDataSetX = x(y(cVar2));
        int i14 = this.f198104h;
        if (cVar2 == null) {
            list = j0.f134944a;
        } else {
            ArrayList arrayList = new ArrayList();
            List<g> list2 = cVar2.f198110b;
            if (list2 != null) {
                for (g gVar : list2) {
                    List<d> list3 = cVar2.f198109a;
                    if (list3 != null) {
                        Iterator<T> it = list3.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!s.g(((d) next).f198111a, gVar.f198127a));
                        d dVar = (d) next;
                        if (dVar == null || (num = dVar.f198112b) == null) {
                            iIntValue = 0;
                        } else {
                            iIntValue = num.intValue();
                        }
                    } else {
                        iIntValue = 0;
                    }
                    Integer num2 = gVar.f198128b;
                    LocalDate localDate = gVar.f198127a;
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    int days = localDate != null ? Days.daysBetween(this.f198097a, localDate).getDays() : 0;
                    float f14 = (iIntValue < iIntValue2 ? iIntValue2 : iIntValue) / 3600.0f;
                    float f15 = days;
                    int[] iArr = {iIntValue >= iIntValue2 ? i14 : iIntValue2};
                    if (localDate != null) {
                        String strD = this.f198100d.d(localDate, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                        Integer numValueOf = Integer.valueOf(iIntValue2);
                        b10.d dVar2 = this.f198101e;
                        lVar = new l(strD, dVar2.d(numValueOf), dVar2.f14215a.getString(R.string.lbl_sleep_need), null, null, Integer.valueOf(R.color.gcm_progress_indicator_empty), null, null, 216, null);
                    } else {
                        lVar = null;
                    }
                    arrayList.add(new xz.e(f15, f14, (Object) lVar, iArr, f14, false, false, 96, (j) null));
                }
            }
            list = arrayList;
        }
        BarDataSet barDataSet = new BarDataSet(list, "SLEEP_NEED_DATASET_LABEL");
        barDataSet.setBarShadowColor(this.f198103g);
        barDataSet.setHighlightEnabled(true);
        barDataSet.setHighLightColor(this.f198105i);
        barDataSet.setColor(i14);
        return x.k(barDataSetX, barDataSet);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(c cVar) {
        return Integer.valueOf(Days.daysBetween(this.f198097a, this.f198098b).getDays() + 1);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(c cVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(c cVar) {
        return -0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(c cVar) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    @Override // qz.c
    public final float i(c cVar) {
        int iIntValue;
        List<g> list;
        Integer num;
        List<d> list2;
        Object next;
        Integer num2;
        c cVar2 = cVar;
        if (cVar2 != null && !u0.n(cVar2)) {
            return 8.0f;
        }
        Object next2 = null;
        int iIntValue2 = 0;
        if (cVar2 == null || (list2 = cVar2.f198109a) == null) {
            iIntValue = 0;
        } else {
            Iterator<T> it = list2.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    Integer num3 = ((d) next).f198112b;
                    int iIntValue3 = num3 != null ? num3.intValue() : 0;
                    do {
                        Object next3 = it.next();
                        Integer num4 = ((d) next3).f198112b;
                        int iIntValue4 = num4 != null ? num4.intValue() : 0;
                        if (iIntValue3 < iIntValue4) {
                            next = next3;
                            iIntValue3 = iIntValue4;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            d dVar = (d) next;
            if (dVar == null || (num2 = dVar.f198112b) == null) {
                iIntValue = 0;
            } else {
                iIntValue = num2.intValue();
            }
        }
        if (cVar2 != null && (list = cVar2.f198110b) != null) {
            Iterator<T> it3 = list.iterator();
            if (it3.hasNext()) {
                next2 = it3.next();
                if (it3.hasNext()) {
                    Integer num5 = ((g) next2).f198128b;
                    int iIntValue5 = num5 != null ? num5.intValue() : 0;
                    do {
                        Object next4 = it3.next();
                        Integer num6 = ((g) next4).f198128b;
                        int iIntValue6 = num6 != null ? num6.intValue() : 0;
                        if (iIntValue5 < iIntValue6) {
                            next2 = next4;
                            iIntValue5 = iIntValue6;
                        }
                    } while (it3.hasNext());
                }
            }
            g gVar = (g) next2;
            if (gVar != null && (num = gVar.f198128b) != null) {
                iIntValue2 = num.intValue();
            }
        }
        if (iIntValue < iIntValue2) {
            iIntValue = iIntValue2;
        }
        float f14 = iIntValue / 3600.0f;
        float f15 = 4;
        float f16 = f14 % f15;
        return f16 == 0.0f ? f14 : (f15 - f16) + f14;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(c cVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(c cVar) {
        return null;
    }

    @Override // qz.c
    public final float q(c cVar) {
        return Days.daysBetween(this.f198097a, this.f198098b).getDays() + 0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(c cVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final List u(c cVar) {
        c cVar2 = cVar;
        ArrayList arrayList = new ArrayList();
        boolean z14 = this.f198099c;
        b10.d dVar = this.f198101e;
        if (cVar2 != null && u0.n(cVar2) && !u0.m(cVar2, z14)) {
            arrayList.add(new xz.f(dVar.f14215a.getString(R.string.lbl_sleep_duration), null, Integer.valueOf(this.f198102f), null, xz.g.a.f192745a, null, null, 106, null));
        }
        int i14 = this.f198104h;
        if (z14) {
            if (cVar2 != null && u0.p(cVar2)) {
                String string = dVar.f14215a.getString(R.string.lbl_sleep_need);
                Integer numValueOf = Integer.valueOf(this.f198103g);
                xz.g.a aVar = xz.g.a.f192745a;
                arrayList.add(new xz.f(string, null, numValueOf, null, aVar, null, null, 106, null));
                if (u0.l(cVar2, true)) {
                    arrayList.add(new xz.f(dVar.f14215a.getString(R.string.lbl_sleep_need_met), null, Integer.valueOf(i14), null, aVar, null, null, 106, null));
                    return arrayList;
                }
            }
        } else if (cVar2 != null && u0.l(cVar2, false)) {
            arrayList.add(new xz.f(dVar.f14215a.getString(R.string.lbl_sleep_duration_met), null, Integer.valueOf(i14), null, xz.g.a.f192745a, null, null, 106, null));
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(c cVar) {
        return 0.0f;
    }

    public final BarDataSet x(List<? extends BarEntry> list) {
        BarDataSet barDataSet = new BarDataSet(list, "SLEEP_DURATION_DATASET_LABEL");
        barDataSet.setBarShadowColor(this.f198103g);
        barDataSet.setHighlightEnabled(true);
        barDataSet.setHighLightColor(this.f198105i);
        int i14 = this.f198102f;
        barDataSet.setGradientColors(w.c(new GradientColor(i14, i14)));
        return barDataSet;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    public final List<BarEntry> y(c cVar) {
        int iIntValue;
        int[] iArr;
        l lVar;
        Object next;
        Integer num;
        if (cVar == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        List<d> list = cVar.f198109a;
        if (list != null) {
            for (d dVar : list) {
                Integer num2 = dVar.f198112b;
                LocalDate localDate = dVar.f198111a;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                if (this.f198099c) {
                    List<g> list2 = cVar.f198110b;
                    if (list2 != null) {
                        Iterator<T> it = list2.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!s.g(((g) next).f198127a, localDate));
                        g gVar = (g) next;
                        if (gVar == null || (num = gVar.f198128b) == null) {
                            iIntValue = -1;
                        } else {
                            iIntValue = num.intValue();
                        }
                    } else {
                        iIntValue = -1;
                    }
                } else {
                    iIntValue = 28800;
                }
                int days = localDate != null ? Days.daysBetween(this.f198097a, localDate).getDays() : 0;
                if (iIntValue < 0 || iIntValue > iIntValue2) {
                    int i14 = this.f198102f;
                    iArr = new int[]{i14, i14};
                } else {
                    int i15 = this.f198104h;
                    iArr = new int[]{i15, i15};
                }
                int[] iArr2 = iArr;
                float f14 = days;
                float f15 = iIntValue2 / 3600.0f;
                float f16 = (iIntValue2 < iIntValue ? iIntValue : iIntValue2) / 3600.0f;
                if (localDate != null) {
                    String strD = this.f198100d.d(localDate, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                    Integer numValueOf = Integer.valueOf(iIntValue2);
                    b10.d dVar2 = this.f198101e;
                    lVar = new l(strD, dVar2.d(numValueOf), dVar2.f14215a.getString(R.string.lbl_sleep_duration), null, null, Integer.valueOf((iIntValue < 0 || iIntValue > iIntValue2) ? R.color.gcm_chart_goal_in_progress : R.color.gcm_chart_goal_met), null, null, 216, null);
                } else {
                    lVar = null;
                }
                arrayList.add(new xz.e(f14, f15, (Object) lVar, iArr2, f16, false, false, 96, (j) null));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ym1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lym1/a$a;", "", "<init>", "()V", "", "SLEEP_DURATION_DATASET_LABEL", "Ljava/lang/String;", "SLEEP_NEED_DATASET_LABEL", "", "DEFAULT_Y_AXIS_MAX_VALUE", "F", "DEFAULT_X_AXIS_OFFSET", "", "NO_SLEEP_NEED_GOAL_SECONDS", "I", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3710a {
        public /* synthetic */ C3710a(j jVar) {
            this();
        }

        private C3710a() {
        }
    }

    public /* synthetic */ a(Context context, LocalDate localDate, LocalDate localDate2, boolean z14, int i14, j jVar) {
        this(context, localDate, localDate2, (i14 & 8) != 0 ? true : z14);
    }
}
