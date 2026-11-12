package gp1;

import android.content.Context;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import c22.j0;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.x;
import p13.y;
import zz.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lgp1/a;", "Lqz/c;", "", "Lip1/d;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/DateTime;", "startDateTime", "endDateTime", "<init>", "(Landroid/content/Context;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "a", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements qz.c<List<? extends ip1.d>, ILineDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f78434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f78435c;

    static {
        new C1580a(null);
    }

    public a(Context context, DateTime dateTime, DateTime dateTime2) {
        context.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        this.f78433a = context;
        this.f78434b = dateTime;
        this.f78435c = dateTime2;
    }

    public final LineDataSet A(int i14, List list) {
        int color = a7.b.getColor(this.f78433a, R.color.gcm_chart_highlight_line);
        LineDataSet lineDataSet = new LineDataSet(list, "");
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setHighLightColor(color);
        lineDataSet.setHighlightLineWidth(1.0f);
        lineDataSet.setColor(i14);
        lineDataSet.setLineWidth(0.0f);
        lineDataSet.setDrawFilled(true);
        lineDataSet.setFillAlpha(255);
        lineDataSet.setFillColor(i14);
        return lineDataSet;
    }

    @Override // qz.c
    public final List<ILineDataSet> a(List<? extends ip1.d> list) {
        String string;
        List<? extends ip1.d> list2 = list;
        Context context = this.f78433a;
        int color = a7.b.getColor(context, R.color.gcm_chart_highlight_line);
        ip1.e eVar = ip1.e.f94675e;
        int color2 = a7.b.getColor(context, eVar.f94681b);
        Integer num = eVar.f94682c;
        Integer num2 = eVar.f94683d;
        GradientDrawable gradientDrawable = (num == null || num2 == null) ? null : new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{a7.b.getColor(context, num.intValue()), a7.b.getColor(context, num2.intValue())});
        ArrayList arrayList = new ArrayList();
        long millis = this.f78434b.getMillis();
        if (list2 != null) {
            ArrayList<ip1.d> arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (((ip1.d) obj).f94673b == ip1.e.f94675e) {
                    arrayList2.add(obj);
                }
            }
            for (ip1.d dVar : arrayList2) {
                float millis2 = dVar.f94672a.getMillis() - millis;
                Long l14 = dVar.f94674c;
                double dLongValue = l14 != null ? l14.longValue() : 0.0d;
                l3.f23124b.getClass();
                GradientDrawable gradientDrawable2 = gradientDrawable;
                float f14 = (float) ((dLongValue / ((double) 1000)) / 60.0d);
                if (millis2 >= 0.0f && f14 > 0.0f) {
                    String string2 = context.getString(R.string.string_space_bullet_string_pattern, l3.a.b1((long) millis2), j0.r(context, dVar.f94672a));
                    string2.getClass();
                    if (f14 >= 1.0f) {
                        string = String.valueOf((int) f14);
                    } else {
                        string = context.getString(R.string.less_than_string_pattern, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                        string.getClass();
                    }
                    String str = string;
                    String string3 = context.getString(R.string.common_min_abbreviated_without_period);
                    string3.getClass();
                    arrayList.add(new Entry(millis2, f14, new l(string2, str, null, string3, null, null, null, null, 244, null)));
                }
                gradientDrawable = gradientDrawable2;
            }
        }
        GradientDrawable gradientDrawable3 = gradientDrawable;
        float f15 = 1.0f;
        ArrayList<List> arrayListB = pz.d.b(DateTimeConstants.MILLIS_PER_MINUTE, arrayList);
        ArrayList arrayList3 = new ArrayList(y.r(arrayListB, 10));
        for (List list3 : arrayListB) {
            Entry entry = (Entry) h0.m0(list3);
            arrayList3.add(h0.D0(list3, new Entry(entry.getX() + 60000.0f, entry.getY())));
        }
        ArrayList arrayList4 = new ArrayList(y.r(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            LineDataSet lineDataSet = new LineDataSet((List) it.next(), "");
            lineDataSet.setDrawValues(false);
            lineDataSet.setDrawCircleHole(false);
            lineDataSet.setDrawCircles(false);
            lineDataSet.setDrawHorizontalHighlightIndicator(false);
            lineDataSet.setHighLightColor(color);
            float f16 = f15;
            lineDataSet.setHighlightLineWidth(f16);
            lineDataSet.setColor(color2);
            lineDataSet.setLineWidth(2.0f);
            lineDataSet.setDrawFilled(true);
            GradientDrawable gradientDrawable4 = gradientDrawable3;
            if (gradientDrawable3 != null) {
                lineDataSet.setFillDrawable(gradientDrawable4);
            }
            arrayList4.add(lineDataSet);
            f15 = f16;
            gradientDrawable3 = gradientDrawable4;
        }
        ip1.e eVar2 = ip1.e.f94676f;
        int color3 = a7.b.getColor(context, eVar2.f94681b);
        ArrayList arrayListX = x(list2, eVar2);
        ArrayList arrayList5 = new ArrayList(y.r(arrayListX, 10));
        Iterator it3 = arrayListX.iterator();
        while (it3.hasNext()) {
            arrayList5.add(A(color3, (List) it3.next()));
        }
        ArrayList arrayListC0 = h0.C0(arrayList4, arrayList5);
        ip1.e eVar3 = ip1.e.f94677g;
        int color4 = a7.b.getColor(context, eVar3.f94681b);
        ArrayList arrayListX2 = x(list2, eVar3);
        ArrayList arrayList6 = new ArrayList(y.r(arrayListX2, 10));
        Iterator it4 = arrayListX2.iterator();
        while (it4.hasNext()) {
            arrayList6.add(A(color4, (List) it4.next()));
        }
        ArrayList arrayListC1 = h0.C0(arrayListC0, arrayList6);
        ip1.e eVar4 = ip1.e.f94678h;
        int color5 = a7.b.getColor(context, eVar4.f94681b);
        ArrayList arrayListX3 = x(list2, eVar4);
        ArrayList arrayList7 = new ArrayList(y.r(arrayListX3, 10));
        Iterator it5 = arrayListX3.iterator();
        while (it5.hasNext()) {
            arrayList7.add(A(color5, (List) it5.next()));
        }
        return h0.C0(arrayListC1, arrayList7);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer c(List<? extends ip1.d> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(List<? extends ip1.d> list) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(List<? extends ip1.d> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final List f(List<? extends ip1.d> list) {
        float fI = i(list);
        double d14 = fI;
        return x.k(z(0), z((int) (0.25d * d14)), z((int) (0.5d * d14)), z((int) (d14 * 0.75d)), z((int) fI));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(List<? extends ip1.d> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(List<? extends ip1.d> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(List<? extends ip1.d> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(List<? extends ip1.d> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(List<? extends ip1.d> list) {
        return null;
    }

    @Override // qz.c
    public final float q(List<? extends ip1.d> list) {
        return this.f78435c.getMillis() - this.f78434b.getMillis();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(List<? extends ip1.d> list) {
        return null;
    }

    @Override // qz.c
    public final float t(List<? extends ip1.d> list) {
        List<? extends ip1.d> list2 = list;
        Object obj = null;
        if (list2 != null) {
            for (Object obj2 : list2) {
                if (((ip1.d) obj2).f94673b != ip1.e.f94675e) {
                    obj = obj2;
                    break;
                }
            }
            obj = (ip1.d) obj;
        }
        return obj != null ? -1.0f : 0.0f;
    }

    @Override // qz.c
    public final List u(List<? extends ip1.d> list) {
        ip1.d dVar;
        ip1.d dVar2;
        ip1.d dVar3;
        Object next;
        Object next2;
        Object next3;
        List<? extends ip1.d> list2 = list;
        ArrayList arrayList = new ArrayList();
        Context context = this.f78433a;
        String string = context.getString(R.string.lbl_time_h_m_s);
        string.getClass();
        arrayList.add(new xz.f(string, null, null, null, xz.g.f.f192751a, null, null, 110, null));
        Object obj = null;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it.next();
            } while (((ip1.d) next3).f94673b != ip1.e.f94675e);
            dVar = (ip1.d) next3;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            ip1.e eVar = ip1.e.f94675e;
            String string2 = context.getString(eVar.f94680a);
            string2.getClass();
            arrayList.add(new xz.f(string2, null, Integer.valueOf(a7.b.getColor(context, eVar.f94681b)), null, xz.g.a.f192745a, null, null, 106, null));
        }
        if (list2 != null) {
            Iterator<T> it3 = list2.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (((ip1.d) next2).f94673b != ip1.e.f94676f);
            dVar2 = (ip1.d) next2;
        } else {
            dVar2 = null;
        }
        if (dVar2 != null) {
            ip1.e eVar2 = ip1.e.f94676f;
            String string3 = context.getString(eVar2.f94680a);
            string3.getClass();
            arrayList.add(new xz.f(string3, null, Integer.valueOf(a7.b.getColor(context, eVar2.f94681b)), null, xz.g.a.f192745a, null, null, 106, null));
        }
        if (list2 != null) {
            Iterator<T> it4 = list2.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (((ip1.d) next).f94673b != ip1.e.f94677g);
            dVar3 = (ip1.d) next;
        } else {
            dVar3 = null;
        }
        if (dVar3 != null) {
            ip1.e eVar3 = ip1.e.f94677g;
            String string4 = context.getString(eVar3.f94680a);
            string4.getClass();
            arrayList.add(new xz.f(string4, null, Integer.valueOf(a7.b.getColor(context, eVar3.f94681b)), null, xz.g.a.f192745a, null, null, 106, null));
        }
        if (list2 != null) {
            for (Object obj2 : list2) {
                if (((ip1.d) obj2).f94673b == ip1.e.f94678h) {
                    obj = obj2;
                    break;
                }
            }
            obj = (ip1.d) obj;
        }
        if (obj != null) {
            ip1.e eVar4 = ip1.e.f94678h;
            String string5 = context.getString(eVar4.f94680a);
            string5.getClass();
            arrayList.add(new xz.f(string5, null, Integer.valueOf(a7.b.getColor(context, eVar4.f94681b)), null, xz.g.a.f192745a, null, null, 106, null));
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(List<? extends ip1.d> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(List<? extends ip1.d> list) {
        return 0.0f;
    }

    public final ArrayList x(List list, ip1.e eVar) {
        ArrayList arrayList = new ArrayList();
        long millis = this.f78434b.getMillis();
        if (list != null) {
            ArrayList<ip1.d> arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((ip1.d) obj).f94673b == eVar) {
                    arrayList2.add(obj);
                }
            }
            for (ip1.d dVar : arrayList2) {
                float millis2 = dVar.f94672a.getMillis() - millis;
                if (millis2 >= 0.0f) {
                    DateTime dateTime = dVar.f94672a;
                    Context context = this.f78433a;
                    String strR = j0.r(context, dateTime);
                    String string = context.getString(eVar.f94680a);
                    string.getClass();
                    arrayList.add(new Entry(millis2, -1.0f, new l(strR, string, null, null, null, null, null, null, 252, null)));
                }
            }
        }
        ArrayList<List> arrayListB = pz.d.b(DateTimeConstants.MILLIS_PER_MINUTE, arrayList);
        ArrayList arrayList3 = new ArrayList(y.r(arrayListB, 10));
        for (List list2 : arrayListB) {
            Entry entry = (Entry) h0.m0(list2);
            arrayList3.add(h0.D0(list2, new Entry(entry.getX() + 60000.0f, entry.getY())));
        }
        return arrayList3;
    }

    @Override // qz.c
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final float i(List<ip1.d> list) {
        ArrayList arrayList;
        Long l14;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Long l15 = ((ip1.d) it.next()).f94674c;
                if (l15 != null) {
                    arrayList.add(l15);
                }
            }
        } else {
            arrayList = null;
        }
        long jLongValue = (arrayList == null || (l14 = (Long) h0.o0(arrayList)) == null) ? 0L : l14.longValue();
        l3.a aVar = l3.f23124b;
        aVar.getClass();
        aVar.getClass();
        float f14 = (float) ((jLongValue / ((double) 1000)) / 60.0d);
        if (f14 <= 0.0f) {
            return 4.0f;
        }
        float f15 = 4;
        return ((float) Math.ceil(f14 / f15)) * f15;
    }

    public final LimitLine z(int i14) {
        LimitLine limitLine = new LimitLine(i14, String.valueOf(i14));
        limitLine.setLineWidth(1.0f);
        Context context = this.f78433a;
        limitLine.setLineColor(a7.b.getColor(context, R.color.gcm_surface_3));
        limitLine.setTextColor(a7.b.getColor(context, R.color.gcm_text_secondary));
        limitLine.setTextSize(10.0f);
        limitLine.setTypeface(h22.a.a("font/roboto_regular.ttf", context));
        return limitLine;
    }

    /* JADX INFO: renamed from: gp1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lgp1/a$a;", "", "<init>", "()V", "", "Y_AXIS_LABELS_COUNT", "I", "", "CHART_LINE_WIDTH", "F", "HIGHLIGHT_LINE_WIDTH", "NOT_CHARGING_VALUE", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1580a {
        public /* synthetic */ C1580a(j jVar) {
            this();
        }

        private C1580a() {
        }
    }
}
