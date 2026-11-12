package la1;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.google.firebase.perf.util.Constants;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.e;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p13.x;
import zz.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lla1/a;", "Lqz/c;", "Lna1/c;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "intervalLabel", "chartTextDescription", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/lang/String;Ljava/lang/String;)V", "a", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements qz.c<na1.c, ILineDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f111617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f111620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f111621e;

    static {
        new C2138a(null);
    }

    public a(Context context, LocalDate localDate, LocalDate localDate2, String str, String str2) {
        context.getClass();
        localDate.getClass();
        localDate2.getClass();
        str.getClass();
        str2.getClass();
        this.f111617a = context;
        this.f111618b = str;
        this.f111619c = str2;
        String string = context.getString(R.string.common_watts);
        string.getClass();
        this.f111620d = string;
        String string2 = context.getString(R.string.power_curve_record_label);
        string2.getClass();
        this.f111621e = string2;
    }

    public static float z(na1.c cVar) {
        na1.b bVar;
        List<na1.a> listB;
        List<na1.a> list;
        int size = 0;
        int size2 = (cVar == null || (list = cVar.f125206b) == null) ? 0 : list.size();
        if (cVar != null && (bVar = cVar.f125205a) != null && (listB = bVar.b()) != null) {
            size = listB.size();
        }
        int iMax = Math.max(size2, size);
        if (iMax > 0) {
            return iMax - 1;
        }
        return 12.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r27v0, types: [la1.a] */
    @Override // qz.c
    public final List<ILineDataSet> a(na1.c cVar) throws Throwable {
        Throwable th3;
        List list;
        ?? r14;
        int i14;
        List list2;
        Object entry;
        na1.b bVar;
        List<na1.a> listB;
        Entry entry2;
        na1.c cVar2 = cVar;
        List<na1.a> list3 = cVar2 != null ? cVar2.f125206b : null;
        int i15 = R.string.lbl_power_cap;
        Context context = this.f111617a;
        if (list3 == null || list3.isEmpty()) {
            th3 = null;
            list = j0.f134944a;
        } else {
            ArrayList arrayList = new ArrayList();
            int i16 = 0;
            for (Object obj : list3) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    x.q();
                    throw null;
                }
                na1.a aVar = (na1.a) obj;
                Integer power = aVar.getPower();
                if (power != null) {
                    int iIntValue = power.intValue();
                    float f14 = i16;
                    float f15 = iIntValue;
                    Integer duration = aVar.getDuration();
                    String strY = y(duration != null ? duration.intValue() : 0);
                    String string = context.getString(R.string.lbl_power_cap);
                    string.getClass();
                    Locale locale = Locale.ROOT;
                    entry2 = new Entry(f14, f15, new l(e5.g(strY, StringUtils.SPACE, j20.x.f(locale, string, locale)), String.valueOf(iIntValue), this.f111621e, this.f111620d, null, Integer.valueOf(R.color.secondary_text), null, null, 208, null));
                } else {
                    entry2 = null;
                }
                if (entry2 != null) {
                    arrayList.add(entry2);
                }
                i16 = i17;
            }
            th3 = null;
            list = arrayList;
        }
        if (cVar2 == null || (bVar = cVar2.f125205a) == null) {
            r14 = th3;
        } else {
            listB = bVar.b();
        }
        if (r14 == 0 || r14.isEmpty()) {
            r14 = listB;
            r14 = listB;
            i14 = R.color.blue_10_static;
            list2 = j0.f134944a;
        } else {
            r14 = listB;
            ArrayList arrayList2 = new ArrayList();
            int i18 = 0;
            for (Object obj2 : r14) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    x.q();
                    throw th3;
                }
                na1.a aVar2 = (na1.a) obj2;
                Integer power2 = aVar2.getPower();
                if (power2 != null) {
                    int iIntValue2 = power2.intValue();
                    float f16 = i18;
                    float f17 = iIntValue2;
                    Integer duration2 = aVar2.getDuration();
                    String strY2 = y(duration2 != null ? duration2.intValue() : 0);
                    String string2 = context.getString(i15);
                    string2.getClass();
                    Locale locale2 = Locale.ROOT;
                    entry = new Entry(f16, f17, new l(e5.g(strY2, StringUtils.SPACE, j20.x.f(locale2, string2, locale2)), String.valueOf(iIntValue2), this.f111618b, this.f111620d, null, Integer.valueOf(R.color.blue_10_static), null, null, 208, null));
                } else {
                    entry = th3;
                }
                if (entry != null) {
                    arrayList2.add(entry);
                }
                i18 = i19;
                i15 = R.string.lbl_power_cap;
            }
            i14 = R.color.blue_10_static;
            list2 = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        if (!list.isEmpty()) {
            arrayList3.add(x(list, R.color.secondary_text, R.color.gray_50_static, 255));
        }
        if (!list2.isEmpty()) {
            arrayList3.add(x(list2, i14, R.color.palette_delta_2, 77));
        }
        return arrayList3;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(na1.c cVar) {
        int iZ = (int) z(cVar);
        if (iZ <= 0) {
            iZ = 12;
        }
        return Integer.valueOf(iZ);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(na1.c cVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(na1.c cVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(na1.c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(na1.c cVar) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    @Override // qz.c
    public final float i(na1.c cVar) {
        int iIntValue;
        na1.b bVar;
        List<na1.a> listB;
        Integer power;
        List<na1.a> list;
        Object next;
        Integer power2;
        na1.c cVar2 = cVar;
        Object next2 = null;
        int iIntValue2 = 0;
        if (cVar2 == null || (list = cVar2.f125206b) == null) {
            iIntValue = 0;
        } else {
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    Integer power3 = ((na1.a) next).getPower();
                    int iIntValue3 = power3 != null ? power3.intValue() : 0;
                    do {
                        Object next3 = it.next();
                        Integer power4 = ((na1.a) next3).getPower();
                        int iIntValue4 = power4 != null ? power4.intValue() : 0;
                        if (iIntValue3 < iIntValue4) {
                            next = next3;
                            iIntValue3 = iIntValue4;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            na1.a aVar = (na1.a) next;
            if (aVar == null || (power2 = aVar.getPower()) == null) {
                iIntValue = 0;
            } else {
                iIntValue = power2.intValue();
            }
        }
        if (cVar2 != null && (bVar = cVar2.f125205a) != null && (listB = bVar.b()) != null) {
            Iterator<T> it3 = listB.iterator();
            if (it3.hasNext()) {
                next2 = it3.next();
                if (it3.hasNext()) {
                    Integer power5 = ((na1.a) next2).getPower();
                    int iIntValue5 = power5 != null ? power5.intValue() : 0;
                    do {
                        Object next4 = it3.next();
                        Integer power6 = ((na1.a) next4).getPower();
                        int iIntValue6 = power6 != null ? power6.intValue() : 0;
                        if (iIntValue5 < iIntValue6) {
                            next2 = next4;
                            iIntValue5 = iIntValue6;
                        }
                    } while (it3.hasNext());
                }
            }
            na1.a aVar2 = (na1.a) next2;
            if (aVar2 != null && (power = aVar2.getPower()) != null) {
                iIntValue2 = power.intValue();
            }
        }
        int iMax = Math.max(iIntValue, iIntValue2);
        if (iMax <= 0) {
            return 1400.0f;
        }
        if (iMax < 100) {
            int i14 = iMax % 70;
            if (i14 != 0) {
                iMax += 70 - i14;
            }
            return iMax;
        }
        if (iMax < 100) {
            return iMax;
        }
        int i15 = iMax % Constants.FROZEN_FRAME_TIME;
        if (i15 != 0) {
            iMax += 700 - i15;
        }
        return iMax;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(na1.c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(na1.c cVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final List o(na1.c cVar) {
        Context context;
        na1.b bVar;
        List<na1.a> list;
        na1.b bVar2;
        List<na1.a> listB;
        na1.c cVar2 = cVar;
        List<na1.a> listB2 = null;
        if (((cVar2 == null || (bVar2 = cVar2.f125205a) == null || (listB = bVar2.b()) == null) ? 0 : listB.size()) > ((cVar2 == null || (list = cVar2.f125206b) == null) ? 0 : list.size())) {
            if (cVar2 != null && (bVar = cVar2.f125205a) != null) {
                listB2 = bVar.b();
            }
        } else if (cVar2 != null) {
            listB2 = cVar2.f125206b;
        }
        if (listB2 != null && !listB2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listB2.iterator();
            while (it.hasNext()) {
                Integer duration = ((na1.a) it.next()).getDuration();
                arrayList.add(y(duration != null ? duration.intValue() : 0));
            }
            return arrayList;
        }
        int[] iArr = {1, 2, 5, 10, 20, 30};
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i14 = 0;
        while (true) {
            context = this.f111617a;
            if (i14 >= 6) {
                break;
            }
            arrayList3.add(iArr[i14] + StringUtils.SPACE + context.getString(R.string.lbl_second));
            i14++;
        }
        arrayList2.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (int i15 = 0; i15 < 6; i15++) {
            arrayList4.add(iArr[i15] + StringUtils.SPACE + context.getString(R.string.common_min_abbreviated_without_period));
        }
        arrayList2.addAll(arrayList4);
        arrayList2.add("1 " + context.getString(R.string.lbl_hour));
        return arrayList2;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(na1.c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float q(na1.c cVar) {
        return z(cVar);
    }

    @Override // qz.c
    public final String r(na1.c cVar) {
        na1.b bVar;
        List<na1.a> listB;
        List<na1.a> list;
        na1.c cVar2 = cVar;
        if (cVar2 == null || (bVar = cVar2.f125205a) == null || (listB = bVar.b()) == null || !listB.isEmpty() || (list = cVar2.f125206b) == null || list.isEmpty()) {
            return null;
        }
        return this.f111619c;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(na1.c cVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List u(na1.c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(na1.c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(na1.c cVar) {
        return 0.0f;
    }

    public final LineDataSet x(List<? extends Entry> list, int i14, int i15, int i16) {
        LineDataSet lineDataSet = new LineDataSet(list, "");
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setDrawFilled(true);
        Context context = this.f111617a;
        lineDataSet.setFillColor(a7.b.getColor(context, i15));
        lineDataSet.setFillAlpha(i16);
        lineDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
        lineDataSet.setHighlightLineWidth(1.0f);
        lineDataSet.setLineWidth(2.0f);
        lineDataSet.setColor(a7.b.getColor(context, i14));
        return lineDataSet;
    }

    public final String y(int i14) {
        Context context = this.f111617a;
        if (i14 <= 59) {
            return e.d(i14, StringUtils.SPACE, context.getString(R.string.lbl_second));
        }
        return i14 <= 3599 ? e.d(i14 / 60, StringUtils.SPACE, context.getString(R.string.common_min_abbreviated_without_period)) : e.d(i14 / DateTimeConstants.SECONDS_PER_HOUR, StringUtils.SPACE, context.getString(R.string.lbl_hour));
    }

    /* JADX INFO: renamed from: la1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lla1/a$a;", "", "<init>", "()V", "", "DEFAULT_X_AXIS_LABELS_COUNT", "F", "DEFAULT_Y_AXIS_MAX_VALUE", "", "Y_AXIS_LABEL_MULTIPLIER", "I", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2138a {
        public /* synthetic */ C2138a(j jVar) {
            this();
        }

        private C2138a() {
        }
    }
}
