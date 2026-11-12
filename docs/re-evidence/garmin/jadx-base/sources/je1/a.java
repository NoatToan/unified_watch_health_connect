package je1;

import a7.b;
import android.content.Context;
import android.graphics.Shader;
import android.text.format.DateFormat;
import c22.j0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import hz.d;
import j00.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o13.p;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import p13.y;
import qz.c;
import xz.f;
import zz.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lje1/a;", "Lqz/c;", "Lge1/a;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements c<ge1.a, ILineDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f98585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jz.a f98586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a10.a f98587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f98588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f98589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f98590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f98591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f98592h;

    static {
        new C1890a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f98585a = context;
        this.f98586b = new jz.a(new l22.a(context));
        this.f98587c = new a10.a(context);
        this.f98588d = R.color.gcm_chart_respiration_averages_low;
        this.f98589e = b.getColor(context, R.color.gcm_chart_respiration_averages_low);
        this.f98590f = R.color.gcm_chart_respiration_averages_high;
        this.f98591g = b.getColor(context, R.color.gcm_chart_respiration_averages_high);
        this.f98592h = b.getColor(context, R.color.gcm_chart_respiration_averages_bar);
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
        if (aVar == null || (list2 = aVar.f76995c) == null) {
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
        if (aVar != null && (list = aVar.f76994b) != null) {
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
    public final /* bridge */ /* synthetic */ List g(ge1.a aVar) {
        return null;
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

    @Override // qz.c
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final List<ILineDataSet> a(ge1.a aVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        DateTime dateTime;
        a aVar2 = this;
        ge1.a aVar3 = aVar;
        ArrayList arrayList3 = new ArrayList();
        Integer numValueOf = Integer.valueOf(R.drawable.gcm_chart_metric_bullet);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Context context = aVar2.f98585a;
        int i14 = 60;
        if (aVar3 != null) {
            DateTime dateTime2 = aVar3.f76999g;
            DateTime dateTime3 = aVar3.f77000h;
            int i15 = 0;
            for (Object obj : aVar3.f76994b) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    x.q();
                    throw null;
                }
                d dVar = (d) obj;
                ArrayList arrayList4 = new ArrayList();
                DateTime dateTime4 = dVar.f86388a;
                float f14 = dVar.f86389b;
                float f15 = aVar3.f76995c.get(i15).f86389b;
                if ((dateTime4.isAfter(dateTime2) || dateTime4.isEqual(dateTime2)) && (dateTime4.isBefore(dateTime3) || dateTime4.isEqual(dateTime3))) {
                    g.f95975a.getClass();
                    DateTime dateTimePlusMinutes = dateTime2.plusMinutes(g.a(i14, dateTime2, dateTime4) * i14);
                    DateTime dateTimeMinusMinutes = dateTimePlusMinutes.minusMinutes(i14);
                    dateTimeMinusMinutes.getClass();
                    String strC = aVar2.f98586b.c(dateTimeMinusMinutes, dateTimePlusMinutes, DateFormat.is24HourFormat(context));
                    String strValueOf = String.valueOf((int) f15);
                    a10.a aVar4 = aVar2.f98587c;
                    arrayList2 = arrayList4;
                    dateTime = dateTime4;
                    arrayList2.add(new k00.c(dateTime, f15, new l(strC, strValueOf, aVar4.f242a.getString(R.string.gcm_body_battery_lbl_low), aVar4.f244c, null, null, numValueOf, Integer.valueOf(aVar2.f98588d), 48, null)));
                    aVar2 = this;
                    arrayList2.add(new k00.c(dateTime, f14, new l(strC, String.valueOf((int) f14), aVar4.f242a.getString(R.string.gcm_body_battery_lbl_high), aVar4.f244c, null, null, numValueOf, Integer.valueOf(aVar2.f98590f), 48, null)));
                } else {
                    arrayList2 = arrayList4;
                    dateTime = dateTime4;
                }
                linkedHashMap = linkedHashMap;
                linkedHashMap.put("RESPIRATION_HIGH_LOW_" + dateTime, arrayList2);
                aVar3 = aVar;
                i15 = i16;
                dateTime2 = dateTime2;
                arrayList3 = arrayList3;
                context = context;
                dateTime3 = dateTime3;
                i14 = 60;
            }
        }
        ArrayList arrayList5 = arrayList3;
        Context context2 = context;
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            ArrayList<List> arrayList6 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                List<k00.c> list = (List) entry.getValue();
                DateTime dateTime5 = aVar != null ? aVar.f76999g : null;
                DateTime dateTime6 = aVar != null ? aVar.f77000h : null;
                ArrayList arrayList7 = new ArrayList();
                if (list != null && !list.isEmpty()) {
                    ArrayList arrayList8 = new ArrayList();
                    if (!list.isEmpty()) {
                        for (k00.c cVar : list) {
                            DateTime dateTime7 = cVar.f101961a;
                            if (dateTime5 == null || !dateTime7.isBefore(dateTime6)) {
                                j0.f23099a.getClass();
                                if (j0.F(dateTime7, dateTime6)) {
                                }
                            }
                            g gVar = g.f95975a;
                            dateTime5.getClass();
                            gVar.getClass();
                            arrayList8.add(new Entry(g.a(60, dateTime5, dateTime7) * 60, cVar.f101962b, cVar.f101963c));
                        }
                    }
                    if (!arrayList8.isEmpty()) {
                        arrayList7.add(arrayList8);
                    }
                }
                ArrayList arrayList9 = new ArrayList(y.r(arrayList7, 10));
                Iterator it = arrayList7.iterator();
                while (it.hasNext()) {
                    LineDataSet lineDataSet = new LineDataSet((List) it.next(), (String) entry.getKey());
                    lineDataSet.setColor(aVar2.f98592h);
                    lineDataSet.setCircleRadius(4.0f);
                    lineDataSet.setDrawCircles(true);
                    lineDataSet.setDrawCircleHole(false);
                    lineDataSet.setDrawValues(false);
                    lineDataSet.setLineWidth(8.0f);
                    lineDataSet.setCircleColors(x.k(Integer.valueOf(aVar2.f98589e), Integer.valueOf(aVar2.f98591g)));
                    gl.b.i(lineDataSet, context2);
                    arrayList9.add(lineDataSet);
                }
                arrayList6.add(arrayList9);
            }
            for (List list2 : arrayList6) {
                if (list2.isEmpty()) {
                    arrayList = arrayList5;
                } else {
                    arrayList = arrayList5;
                    arrayList.addAll(list2);
                }
                arrayList5 = arrayList;
            }
        }
        return arrayList5;
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
        a10.a aVar2 = this.f98587c;
        String string = aVar2.f242a.getString(R.string.gcm_body_battery_lbl_high);
        Integer numValueOf = Integer.valueOf(this.f98591g);
        xz.g.a aVar3 = xz.g.a.f192745a;
        return x.k(new f(string, null, numValueOf, null, aVar3, null, null, 106, null), new f(aVar2.f242a.getString(R.string.gcm_body_battery_lbl_low), null, Integer.valueOf(this.f98589e), null, aVar3, null, null, 106, null));
    }

    /* JADX INFO: renamed from: je1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lje1/a$a;", "", "<init>", "()V", "", "DATA_SET_LABEL", "Ljava/lang/String;", "", "CIRCLE_RADIUS", "F", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1890a {
        public /* synthetic */ C1890a(j jVar) {
            this();
        }

        private C1890a() {
        }
    }
}
