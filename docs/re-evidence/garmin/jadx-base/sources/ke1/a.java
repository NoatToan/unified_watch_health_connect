package ke1;

import android.content.Context;
import android.graphics.Shader;
import android.text.format.DateFormat;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import hz.d;
import j00.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.p;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.x;
import qz.c;
import xz.f;
import zx0.m;
import zz.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lke1/a;", "Lqz/c;", "Lge1/a;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements c<ge1.a, ILineDataSet> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f104539d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f104540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jz.a f104541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a10.a f104542c;

    static {
        new C2000a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f104540a = context;
        this.f104541b = new jz.a(new l22.a(context));
        this.f104542c = new a10.a(context);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX WARN: Multi-variable type inference failed */
    public static p A(ge1.a aVar) {
        Float fValueOf;
        List<d> list;
        Object next;
        List<d> list2;
        Object next2;
        Float fValueOf2 = null;
        if (aVar == null || (list2 = aVar.f76993a) == null) {
            fValueOf = null;
        } else {
            Iterator<T> it = list2.iterator();
            if (it.hasNext()) {
                next2 = it.next();
                if (it.hasNext()) {
                    float f14 = ((d) next2).f86389b;
                    do {
                        Object next3 = it.next();
                        float f15 = ((d) next3).f86389b;
                        if (Float.compare(f14, f15) > 0) {
                            next2 = next3;
                            f14 = f15;
                        }
                    } while (it.hasNext());
                }
            } else {
                next2 = null;
            }
            d dVar = (d) next2;
            if (dVar != null) {
                fValueOf = Float.valueOf(dVar.f86389b);
            } else {
                fValueOf = null;
            }
        }
        if (aVar != null && (list = aVar.f76993a) != null) {
            Iterator<T> it3 = list.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    float f16 = ((d) next).f86389b;
                    do {
                        Object next4 = it3.next();
                        float f17 = ((d) next4).f86389b;
                        if (Float.compare(f16, f17) < 0) {
                            next = next4;
                            f16 = f17;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next = null;
            }
            d dVar2 = (d) next;
            if (dVar2 != null) {
                fValueOf2 = Float.valueOf(dVar2.f86389b);
            }
        }
        j00.a aVar2 = j00.a.f95964a;
        p pVarA = j00.a.a(aVar2, j00.a.c(aVar2, fValueOf, 1.0f, 8.0f), j00.a.b(fValueOf2, 1.0f, 24.0f), 4);
        return new p(Float.valueOf(((Number) pVarA.f128594a).floatValue()), Float.valueOf(((Number) pVarA.f128595b).floatValue()));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer c(ge1.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(ge1.a aVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(ge1.a aVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(ge1.a aVar) {
        return null;
    }

    @Override // qz.c
    public final List g(ge1.a aVar) {
        ge1.a aVar2 = aVar;
        return m.g(this.f104540a, aVar2 != null ? aVar2.f76998f : null, new kb0.d(15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final float i(ge1.a aVar) {
        ge1.a aVar2 = aVar;
        if (gl1.d.G(aVar2)) {
            return ((Number) A(aVar2).f128595b).floatValue();
        }
        return 24.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(ge1.a aVar) {
        return 5;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(ge1.a aVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(ge1.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(ge1.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float q(ge1.a aVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(ge1.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(ge1.a aVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(ge1.a aVar) {
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.github.mikephil.charting.data.BarLineScatterCandleBubbleDataSet, com.github.mikephil.charting.data.BaseDataSet, com.github.mikephil.charting.data.LineDataSet, com.github.mikephil.charting.data.LineRadarDataSet, com.github.mikephil.charting.data.LineScatterCandleRadarDataSet, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    @Override // qz.c
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final List<ILineDataSet> a(ge1.a aVar) {
        int i14;
        ?? r14;
        int i15;
        int iA;
        ArrayList arrayList = new ArrayList();
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Context context = this.f104540a;
        int i16 = 1;
        if (aVar != null) {
            DateTime dateTime = aVar.f76999g;
            DateTime dateTime2 = aVar.f77000h;
            List<d> list = aVar.f76993a;
            int i17 = 0;
            for (Object obj : list) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    x.q();
                    throw null;
                }
                d dVar = (d) obj;
                DateTime dateTime3 = dVar.f86388a;
                if ((dateTime3.isAfter(dateTime) || dateTime3.isEqual(dateTime)) && (dateTime3.isBefore(dateTime2) || dateTime3.isEqual(dateTime2))) {
                    g.f95975a.getClass();
                    int iA2 = g.a(60, dateTime, dateTime3);
                    float f14 = dVar.f86389b;
                    float fC = f14 > 0.0f ? MathKt.c(f14) : -100.0f;
                    if (i17 > 0) {
                        d dVar2 = (d) h0.e0(i17 - 1, list);
                        DateTime dateTime4 = dVar2 != null ? dVar2.f86388a : null;
                        if (dateTime4 != null && (iA = g.a(60, dateTime4, dateTime3)) > i16) {
                            int i19 = (iA2 - iA) + i16;
                            while (i19 < iA2) {
                                arrayList3.add(new Entry(60 * i19, -100.0f));
                                i19++;
                                i16 = i16;
                            }
                        }
                        i15 = i16;
                    } else {
                        i15 = i16;
                        if (iA2 > 0) {
                            for (int i24 = 0; i24 < iA2; i24++) {
                                arrayList3.add(new Entry(i24 * 60, -100.0f));
                            }
                        }
                    }
                    DateTime dateTimePlusMinutes = dateTime.plusMinutes(iA2 * 60);
                    DateTime dateTimeMinusMinutes = dateTimePlusMinutes.minusMinutes(60);
                    dateTimeMinusMinutes.getClass();
                    String strC = this.f104541b.c(dateTimeMinusMinutes, dateTimePlusMinutes, DateFormat.is24HourFormat(context));
                    String strValueOf = String.valueOf((int) fC);
                    a10.a aVar2 = this.f104542c;
                    arrayList3.add(new Entry(iA2 * 60, fC, new l(strC, strValueOf, aVar2.f242a.getString(R.string.activities_avg_respiration_rate_title), aVar2.f244c, null, null, Integer.valueOf(R.drawable.line_white_horizontal_small_fixed_size), null, SyslogConstants.LOG_LOCAL6, null)));
                } else {
                    i15 = i16;
                }
                i17 = i18;
                i16 = i15;
            }
            int i25 = i16;
            d dVar3 = (d) h0.e0(list.size() - 1, list);
            DateTime dateTime5 = dVar3 != null ? dVar3.f86388a : null;
            if (dateTime5 != null) {
                g.f95975a.getClass();
                int iA3 = g.a(60, dateTime5, dateTime2);
                if (iA3 > 0) {
                    int size = arrayList3.size() + iA3;
                    for (int size2 = arrayList3.size(); size2 < size; size2++) {
                        arrayList3.add(new Entry(size2 * 60, -100.0f));
                    }
                }
            }
            i14 = i25;
            if (!arrayList3.isEmpty()) {
                int i26 = 0;
                int i27 = 0;
                for (Object obj2 : arrayList3) {
                    int i28 = i27 + 1;
                    if (i27 < 0) {
                        x.q();
                        throw null;
                    }
                    Entry entry = (Entry) obj2;
                    if (i27 > 0) {
                        float y14 = ((Entry) arrayList3.get(i27 - 1)).getY();
                        float y15 = entry.getY();
                        if ((y14 > 0.0f && y15 <= 0.0f) || (y14 <= 0.0f && y15 > 0.0f)) {
                            arrayList2.add(arrayList3.subList(i26, i27));
                            i26 = i27;
                        }
                    }
                    i27 = i28;
                }
                i14 = i25;
                if (i26 < arrayList3.size()) {
                    arrayList2.add(arrayList3.subList(i26, arrayList3.size()));
                    i14 = i25;
                }
            }
        } else {
            i14 = 1;
        }
        ?? r19 = i14;
        for (List list2 : arrayList2) {
            if (list2.isEmpty()) {
                r14 = r19;
            } else {
                ?? lineDataSet = new LineDataSet(list2, "RESPIRATION_TREND_LINE");
                lineDataSet.setColor(a7.b.getColor(context, R.color.gcm_chart_default_data_set));
                lineDataSet.setDrawValues(false);
                lineDataSet.setDrawCircleHole(false);
                lineDataSet.setDrawCircles(false);
                lineDataSet.setDrawHorizontalHighlightIndicator(false);
                lineDataSet.setMode(LineDataSet.Mode.LINEAR);
                r14 = r19;
                lineDataSet.setHighlightEnabled(r14);
                lineDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
                lineDataSet.setLineWidth(1.5f);
                arrayList.add(lineDataSet);
            }
            r19 = r14;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final float t(ge1.a aVar) {
        if (gl1.d.G(aVar)) {
            return ((Number) A(aVar).f128594a).floatValue();
        }
        return 8.0f;
    }

    @Override // qz.c
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final List<f> u(ge1.a aVar) {
        List<d> list;
        ArrayList arrayList = new ArrayList();
        if (aVar != null && (list = aVar.f76993a) != null && (!list.isEmpty())) {
            arrayList.add(new f(this.f104542c.f242a.getString(R.string.activities_avg_respiration_rate_title), null, Integer.valueOf(a7.b.getColor(this.f104540a, R.color.gcm_chart_default_data_set)), null, new xz.g.e(0.0f, 1, null), null, null, 106, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ke1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lke1/a$a;", "", "<init>", "()V", "", "DATA_SET_LABEL", "Ljava/lang/String;", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2000a {
        public /* synthetic */ C2000a(j jVar) {
            this();
        }

        private C2000a() {
        }
    }
}
