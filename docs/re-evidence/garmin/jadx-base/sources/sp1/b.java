package sp1;

import android.content.Context;
import android.graphics.Shader;
import c22.j0;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import g22.k;
import gs1.o;
import gs1.t;
import gs1.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.u0;
import p13.w;
import p13.x;
import p13.y;
import xz.f;
import xz.g;
import zx0.m;
import zz.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lsp1/b;", "Lqz/c;", "Lxp1/b;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-solar-intensity_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements qz.c<xp1.b, ILineDataSet> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f160508b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f160509a;

    static {
        new a(null);
    }

    public b(Context context) {
        context.getClass();
        this.f160509a = context;
    }

    @Override // qz.c
    public final List<ILineDataSet> a(xp1.b bVar) {
        i53.c<xp1.d> cVar;
        xp1.b bVar2 = bVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Context context = this.f160509a;
        if (bVar2 != null && (cVar = bVar2.f191855c) != null) {
            ArrayList arrayList6 = new ArrayList(y.r(cVar, 10));
            Iterator<xp1.d> it = cVar.iterator();
            while (it.hasNext()) {
                arrayList6.add(Integer.valueOf(new LocalDateTime(it.next().f191859a).getMillisOfDay()));
            }
            int i14 = 0;
            for (xp1.d dVar : cVar) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                xp1.d dVar2 = dVar;
                long jIntValue = ((long) ((Number) arrayList6.get(i14)).intValue()) / 60000;
                int i16 = (0 > jIntValue || jIntValue >= 1440) ? -1 : (int) jIntValue;
                String strR = j0.r(context, new DateTime(((long) i16) * 60000, DateTimeZone.UTC));
                if (i16 >= 0) {
                    if (dVar2.f191865g) {
                        Entry entry = new Entry(i16, -4.0f);
                        entry.setData(new l(strR, context.getString(qp1.a.BATTERY_FULL.f146023a), null, null, null, null, null, null, 252, null));
                        arrayList3.add(entry);
                    } else if (dVar2.f191864f) {
                        Entry entry2 = new Entry(i16, -4.0f);
                        entry2.setData(new l(strR, context.getString(qp1.a.BATTERY_COLD.f146023a), null, null, null, null, null, null, 252, null));
                        arrayList4.add(entry2);
                    } else if (dVar2.f191863e) {
                        Entry entry3 = new Entry(i16, -4.0f);
                        entry3.setData(new l(strR, context.getString(qp1.a.BATTERY_HOT.f146023a), null, null, null, null, null, null, 252, null));
                        arrayList5.add(entry3);
                    } else if (dVar2.f191866h) {
                        Entry entry4 = new Entry(i16, -4.0f);
                        entry4.setData(new l(strR, context.getString(qp1.a.USB_CONNECTED.f146023a), null, null, null, null, null, null, 252, null));
                        arrayList2.add(entry4);
                    }
                    float f14 = dVar2.f191861c;
                    if (dVar2.f191862d && f14 > 0.0f) {
                        Entry entry5 = new Entry(i16, f14);
                        l3.f23124b.getClass();
                        entry5.setData(new l(strR, context.getString(R.string.lbl_value_percent, l3.f23131i.format(f14)), context.getString(qp1.a.CHARGE.f146023a), null, null, null, null, null, 248, null));
                        arrayList.add(entry5);
                    }
                }
                i14 = i15;
            }
        }
        Map mapE = u0.e(new p(qp1.a.CHARGE, pz.d.b(1, arrayList)), new p(qp1.a.USB_CONNECTED, pz.d.b(1, arrayList2)), new p(qp1.a.BATTERY_FULL, pz.d.b(1, arrayList3)), new p(qp1.a.BATTERY_COLD, pz.d.b(1, arrayList4)), new p(qp1.a.BATTERY_HOT, pz.d.b(1, arrayList5)));
        ArrayList arrayList7 = new ArrayList(mapE.size());
        for (Map.Entry entry6 : mapE.entrySet()) {
            qp1.a aVar = (qp1.a) entry6.getKey();
            List list = (List) entry6.getValue();
            ArrayList arrayList8 = new ArrayList(y.r(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                LineDataSet lineDataSet = new LineDataSet((List) it3.next(), "");
                lineDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
                lineDataSet.setDrawValues(false);
                lineDataSet.setDrawCircleHole(false);
                lineDataSet.setDrawCircles(false);
                lineDataSet.setDrawFilled(true);
                lineDataSet.setDrawHorizontalHighlightIndicator(false);
                lineDataSet.setFillColor(a7.b.getColor(context, aVar.f146024b));
                lineDataSet.setColor(a7.b.getColor(context, aVar.f146024b));
                lineDataSet.setFillAlpha(255);
                lineDataSet.setHighlightEnabled(true);
                lineDataSet.setHighlightLineWidth(1.0f);
                lineDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
                lineDataSet.setFillFormatter(new sn.a(4));
                arrayList8.add(lineDataSet);
            }
            arrayList7.add(arrayList8);
        }
        return y.s(arrayList7);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(xp1.b bVar) {
        return Integer.valueOf(MathKt.c(1440.0f));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(xp1.b bVar) {
        return true;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(xp1.b bVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final List f(xp1.b bVar) {
        return x.k(x(0), x(25), x(50), x(75), x(100));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    @Override // qz.c
    public final List g(xp1.b bVar) {
        DateTime dateTimeWithTimeAtStartOfDay;
        String strPrint;
        xp1.c cVar;
        xp1.c cVar2;
        xp1.b bVar2 = bVar;
        t tVar = null;
        ArrayList arrayList = null;
        if (bVar2 != null) {
            wp1.a.f186533a.getClass();
            o oVar = new o(null, null, null, null, 15, null);
            i53.c<xp1.c> cVar3 = bVar2.f191853a;
            if (cVar3 != null && (cVar2 = (xp1.c) h0.e0(0, cVar3)) != null) {
                oVar = o.b(oVar, Long.valueOf(cVar2.f191858b), Long.valueOf(cVar2.f191857a), null, null, 12);
            }
            o oVarB = oVar;
            if (cVar3 != null && (cVar = (xp1.c) h0.e0(1, cVar3)) != null) {
                oVarB = o.b(oVarB, null, null, Long.valueOf(cVar.f191858b), Long.valueOf(cVar.f191857a), 3);
            }
            o oVar2 = oVarB;
            xp1.c cVar4 = cVar3 != null ? (xp1.c) h0.d0(cVar3) : null;
            String str = bVar2.f191854b;
            if (str != null) {
                dateTimeWithTimeAtStartOfDay = new DateTime(str, DateTimeZone.UTC).withTimeAtStartOfDay();
            } else if (cVar4 != null) {
                long j8 = cVar4.f191858b;
                if (j8 - cVar4.f191857a > 0) {
                    dateTimeWithTimeAtStartOfDay = new DateTime(j8, DateTimeZone.UTC).withTimeAtStartOfDay();
                } else {
                    dateTimeWithTimeAtStartOfDay = null;
                }
            } else {
                dateTimeWithTimeAtStartOfDay = null;
            }
            String strPrint2 = dateTimeWithTimeAtStartOfDay != null ? DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(dateTimeWithTimeAtStartOfDay) : null;
            String strPrint3 = dateTimeWithTimeAtStartOfDay != null ? DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(k.A(dateTimeWithTimeAtStartOfDay)) : null;
            String strPrint4 = dateTimeWithTimeAtStartOfDay != null ? DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(new DateTime(k.A(dateTimeWithTimeAtStartOfDay), DateTimeZone.getDefault())) : null;
            i53.c<xp1.a> cVar5 = bVar2.f191856d;
            if (cVar5 != null) {
                ArrayList arrayList2 = new ArrayList(y.r(cVar5, 10));
                for (xp1.a aVar : cVar5) {
                    Long l14 = aVar.f191847a;
                    String str2 = aVar.f191851e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    gs1.c cVar6 = new gs1.c(str2, aVar.f191852f);
                    String str3 = aVar.f191848b;
                    String str4 = aVar.f191850d;
                    if (str4 != null) {
                        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
                        DateTime dateTimeQ = k.q(str4, "yyyy-MM-dd HH:mm:ss", null);
                        if (dateTimeQ == null) {
                            dateTimeQ = DateTime.now();
                        }
                        strPrint = dateTimeFormatterForPattern.print(dateTimeQ);
                    } else {
                        strPrint = null;
                    }
                    arrayList2.add(new gs1.b(null, l14, str3, cVar6, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, strPrint, null, null, null, null, null, null, null, null, null, null, null, -1048591, null));
                }
                arrayList = arrayList2;
            }
            tVar = new t(new gs1.a(arrayList), null, null, null, null, null, null, oVar2, new z(new gs1.l(null, strPrint2, strPrint3, strPrint4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -15, 1048575, null)), null, null, 1662, null);
        }
        return m.g(this.f160509a, tVar, new zw.b(3));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float i(xp1.b bVar) {
        return 102.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(xp1.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(xp1.b bVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(xp1.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(xp1.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float q(xp1.b bVar) {
        return 1440.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(xp1.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(xp1.b bVar) {
        return -4.0f;
    }

    @Override // qz.c
    public final List u(xp1.b bVar) {
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        i53.c<xp1.d> cVar;
        i53.c<xp1.d> cVar2;
        i53.c<xp1.d> cVar3;
        i53.c<xp1.d> cVar4;
        i53.c<xp1.d> cVar5;
        xp1.b bVar2 = bVar;
        boolean z18 = true;
        if (bVar2 != null && (cVar5 = bVar2.f191855c) != null && !cVar5.isEmpty()) {
            Iterator<xp1.d> it = cVar5.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z14 = false;
                    break;
                }
                xp1.d next = it.next();
                if (next.f191862d && next.f191861c > 0.0f) {
                    z14 = true;
                    break;
                }
            }
        } else {
            z14 = false;
            break;
        }
        if (bVar2 != null && (cVar4 = bVar2.f191855c) != null && !cVar4.isEmpty()) {
            Iterator<xp1.d> it3 = cVar4.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z15 = false;
                    break;
                }
                if (it3.next().f191866h) {
                    z15 = true;
                    break;
                }
            }
        } else {
            z15 = false;
            break;
        }
        if (bVar2 != null && (cVar3 = bVar2.f191855c) != null && !cVar3.isEmpty()) {
            Iterator<xp1.d> it4 = cVar3.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z16 = false;
                    break;
                }
                if (it4.next().f191865g) {
                    z16 = true;
                    break;
                }
            }
        } else {
            z16 = false;
            break;
        }
        if (bVar2 != null && (cVar2 = bVar2.f191855c) != null && !cVar2.isEmpty()) {
            Iterator<xp1.d> it5 = cVar2.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    z17 = false;
                    break;
                }
                if (it5.next().f191864f) {
                    z17 = true;
                    break;
                }
            }
        } else {
            z17 = false;
            break;
        }
        if (bVar2 != null && (cVar = bVar2.f191855c) != null && !cVar.isEmpty()) {
            Iterator<xp1.d> it6 = cVar.iterator();
            do {
                if (!it6.hasNext()) {
                    z18 = false;
                    break;
                }
            } while (!it6.next().f191863e);
        } else {
            z18 = false;
            break;
        }
        q13.b bVarB = w.b();
        if (z14) {
            bVarB.add(qp1.a.CHARGE);
        }
        if (z15) {
            bVarB.add(qp1.a.USB_CONNECTED);
        }
        if (z16) {
            bVarB.add(qp1.a.BATTERY_FULL);
        }
        if (z17) {
            bVarB.add(qp1.a.BATTERY_COLD);
        }
        if (z18) {
            bVarB.add(qp1.a.BATTERY_HOT);
        }
        q13.b bVarA = w.a(bVarB);
        ArrayList arrayList = new ArrayList(y.r(bVarA, 10));
        ListIterator listIterator = bVarA.listIterator(0);
        while (true) {
            q13.b.c cVar6 = (q13.b.c) listIterator;
            if (!cVar6.hasNext()) {
                return arrayList;
            }
            qp1.a aVar = (qp1.a) cVar6.next();
            int i14 = aVar.f146023a;
            Context context = this.f160509a;
            String string = context.getString(i14);
            string.getClass();
            arrayList.add(new f(string, null, Integer.valueOf(context.getColor(aVar.f146024b)), null, g.a.f192745a, Float.valueOf(12.0f), null, 74, null));
        }
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(xp1.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(xp1.b bVar) {
        return 0.0f;
    }

    public final LimitLine x(int i14) {
        float f14 = i14;
        Object[] objArr = {String.valueOf(i14)};
        Context context = this.f160509a;
        LimitLine limitLine = new LimitLine(f14, context.getString(R.string.lbl_value_percent, objArr));
        limitLine.setLineWidth(1.0f);
        rz.a.f155189g.getClass();
        limitLine.setLineColor(a7.b.getColor(context, rz.a.f155190h));
        limitLine.setTextColor(a7.b.getColor(context, rz.a.f155191i));
        limitLine.setTextSize(10.0f);
        limitLine.setTypeface(h22.a.a("font/roboto_regular.ttf", context));
        return limitLine;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lsp1/b$a;", "", "<init>", "()V", "", "MIN_LIMIT_LINE", "I", "LOW_LIMIT_LINE", "MEDIUM_LIMIT_LINE", "HIGH_LIMIT_LINE", "MAX_LIMIT_LINE", "", "MIN_Y_VALUE", "F", "MAX_Y_VALUE", "LEGEND_CIRCLE_SIZE", "gcm-solar-intensity_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
