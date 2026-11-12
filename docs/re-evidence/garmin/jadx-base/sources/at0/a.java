package at0;

import android.content.Context;
import android.graphics.Shader;
import c22.j0;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.lactate_threshold.reports.data.model.LactateSummaryMeasurementsDTO;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import e23.p;
import e32.o;
import f12.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o61.g;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import xz.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lat0/a;", "Lqz/c;", "Lcom/garmin/android/apps/connectmobile/lactate_threshold/reports/data/model/LactateSummaryMeasurementsDTO;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "intervalType", "Lorg/joda/time/DateTime;", "startDate", "endDate", "<init>", "(Landroid/content/Context;ILorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "a", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements qz.c<LactateSummaryMeasurementsDTO, ILineDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f12726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f12727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f12731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12732h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements p<DateTime, Integer, DateTime> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12733a = new b();

        public b() {
            super(2, DateTime.class, "plusDays", "plusDays(I)Lorg/joda/time/DateTime;", 0);
        }

        @Override // e23.p
        public final DateTime invoke(DateTime dateTime, Integer num) {
            DateTime dateTime2 = dateTime;
            int iIntValue = num.intValue();
            dateTime2.getClass();
            return dateTime2.plusDays(iIntValue);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements p<DateTime, Integer, DateTime> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f12734a = new c();

        public c() {
            super(2, DateTime.class, "plusMonths", "plusMonths(I)Lorg/joda/time/DateTime;", 0);
        }

        @Override // e23.p
        public final DateTime invoke(DateTime dateTime, Integer num) {
            DateTime dateTime2 = dateTime;
            int iIntValue = num.intValue();
            dateTime2.getClass();
            return dateTime2.plusMonths(iIntValue);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements p<DateTime, DateTime, Boolean> {
        public d(Object obj) {
            super(2, obj, j0.class, "isSameDay", "isSameDay(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Z", 0);
        }

        @Override // e23.p
        public final Boolean invoke(DateTime dateTime, DateTime dateTime2) {
            ((j0) this.receiver).getClass();
            return Boolean.valueOf(j0.F(dateTime, dateTime2));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class e extends q implements p<DateTime, DateTime, Boolean> {
        public e(Object obj) {
            super(2, obj, j0.class, "isSameMonth", "isSameMonth(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Z", 0);
        }

        @Override // e23.p
        public final Boolean invoke(DateTime dateTime, DateTime dateTime2) {
            ((j0) this.receiver).getClass();
            return Boolean.valueOf(j0.G(dateTime, dateTime2));
        }
    }

    static {
        new C0180a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, int i14, DateTime dateTime, DateTime dateTime2) {
        context.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        this.f12725a = context;
        this.f12726b = dateTime;
        this.f12727c = dateTime2;
        this.f12728d = a7.b.getColor(context, R.color.palette_ruby_2);
        this.f12729e = a7.b.getColor(context, R.color.palette_delta_2);
        Integer num = o.f62808k.f62822d;
        boolean z14 = (num != null && i14 == num.intValue()) ? 1 : 0;
        this.f12730f = z14;
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("M/yy");
        dateTimeFormatterForPattern.getClass();
        this.f12731g = fz.a.e(context, !z14, dateTime, dateTime2, dateTimeFormatterForPattern);
        this.f12732h = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
    }

    public static boolean B(double d14) {
        return (Double.isNaN(d14) || Double.compare(d14, 0.0d) == 0) ? false : true;
    }

    public final Float A(LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO, boolean z14) {
        List<g> list = z14 ? lactateSummaryMeasurementsDTO.f37140f : lactateSummaryMeasurementsDTO.f37139e;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (B(((g) obj).f129582a)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fX = x(((g) it.next()).f129582a, z14);
        while (it.hasNext()) {
            fX = Math.min(fX, x(((g) it.next()).f129582a, z14));
        }
        return Float.valueOf(fX);
    }

    @Override // qz.c
    public final List<ILineDataSet> a(LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO) {
        LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO2 = lactateSummaryMeasurementsDTO;
        if (lactateSummaryMeasurementsDTO2 == null) {
            return p13.j0.f134944a;
        }
        List<g> list = lactateSummaryMeasurementsDTO2.f37139e;
        List<g> list2 = lactateSummaryMeasurementsDTO2.f37140f;
        List<Entry> listY = y(list, false);
        List<Entry> listY2 = y(list2, true);
        if (listY.isEmpty() && listY2.isEmpty()) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        if (!listY.isEmpty()) {
            LineDataSet lineDataSet = new LineDataSet(listY, "BPM");
            lineDataSet.setMode(LineDataSet.Mode.STEPPED);
            lineDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
            int i14 = this.f12728d;
            lineDataSet.setColor(i14);
            lineDataSet.setLineWidth(2.0f);
            lineDataSet.setFillAlpha(65);
            lineDataSet.setFillColor(i14);
            lineDataSet.setDrawCircles(true);
            lineDataSet.setDrawCircleHole(false);
            lineDataSet.setCircleRadius(1.0f);
            lineDataSet.setCircleColor(i14);
            lineDataSet.setDrawValues(false);
            arrayList.add(lineDataSet);
        }
        if (!listY2.isEmpty()) {
            LineDataSet lineDataSet2 = new LineDataSet(listY2, "Pace");
            lineDataSet2.setMode(LineDataSet.Mode.LINEAR);
            lineDataSet2.setAxisDependency(YAxis.AxisDependency.RIGHT);
            int i15 = this.f12729e;
            lineDataSet2.setColor(i15);
            lineDataSet2.setLineWidth(2.0f);
            lineDataSet2.setFillAlpha(65);
            lineDataSet2.setFillColor(i15);
            lineDataSet2.setDrawCircles(true);
            lineDataSet2.setDrawCircleHole(false);
            lineDataSet2.setCircleRadius(3.0f);
            lineDataSet2.setCircleColor(i15);
            lineDataSet2.setDrawValues(false);
            arrayList.add(lineDataSet2);
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // qz.c
    public final Integer c(LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO) {
        return Integer.valueOf(this.f12731g.size());
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO) {
        return null;
    }

    @Override // qz.c
    public final float i(LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO) {
        Float fA;
        LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO2 = lactateSummaryMeasurementsDTO;
        float fFloatValue = (lactateSummaryMeasurementsDTO2 == null || (fA = A(lactateSummaryMeasurementsDTO2, false)) == null) ? 0.0f : fA.floatValue();
        Float fZ = lactateSummaryMeasurementsDTO2 != null ? z(lactateSummaryMeasurementsDTO2, false) : null;
        if (fZ == null) {
            return 0.0f;
        }
        return fZ.floatValue() - fFloatValue < 6.0f ? fZ.floatValue() + 5 : fZ.floatValue();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO) {
        return null;
    }

    @Override // qz.c
    public final boolean k() {
        return true;
    }

    @Override // qz.c
    public final float m(LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO) {
        Float fZ;
        LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO2 = lactateSummaryMeasurementsDTO;
        float fFloatValue = (lactateSummaryMeasurementsDTO2 == null || (fZ = z(lactateSummaryMeasurementsDTO2, true)) == null) ? 0.0f : fZ.floatValue();
        Float fA = lactateSummaryMeasurementsDTO2 != null ? A(lactateSummaryMeasurementsDTO2, true) : null;
        if (fA == null) {
            return 0.0f;
        }
        return fFloatValue - fA.floatValue() < 6.0f ? fA.floatValue() - 6 : fA.floatValue();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // qz.c
    public final List o(LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO) {
        return this.f12731g;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // qz.c
    public final float q(LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO) {
        return this.f12731g.size() - 1.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO) {
        return null;
    }

    @Override // qz.c
    public final float t(LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO) {
        Float fA;
        LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO2 = lactateSummaryMeasurementsDTO;
        if (lactateSummaryMeasurementsDTO2 == null || (fA = A(lactateSummaryMeasurementsDTO2, false)) == null) {
            return 0.0f;
        }
        return fA.floatValue();
    }

    @Override // qz.c
    public final List u(LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO) {
        ArrayList arrayList;
        LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO2 = lactateSummaryMeasurementsDTO;
        ArrayList arrayList2 = null;
        List<g> list = lactateSummaryMeasurementsDTO2 != null ? lactateSummaryMeasurementsDTO2.f37139e : null;
        List<g> list2 = lactateSummaryMeasurementsDTO2 != null ? lactateSummaryMeasurementsDTO2.f37140f : null;
        ArrayList arrayList3 = new ArrayList();
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (B(((g) obj).f129582a)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        Context context = this.f12725a;
        if (arrayList != null && !arrayList.isEmpty()) {
            String string = context.getString(R.string.devices_lbl_bpm);
            string.getClass();
            arrayList3.add(new f(string, null, Integer.valueOf(this.f12728d), null, new xz.g.e(0.0f, 1, null), null, context.getString(R.string.lbl_heart_rate_beats_per_minute), 42, null));
        }
        if (list2 != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (B(((g) obj2).f129582a)) {
                    arrayList2.add(obj2);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            String string2 = context.getString(R.string.lbl_pace);
            string2.getClass();
            arrayList3.add(new f(string2, null, Integer.valueOf(this.f12729e), null, xz.g.a.f192745a, null, null, 106, null));
        }
        return arrayList3;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO) {
        return null;
    }

    @Override // qz.c
    public final float w(LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO) {
        Float fZ;
        LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO2 = lactateSummaryMeasurementsDTO;
        if (lactateSummaryMeasurementsDTO2 == null || (fZ = z(lactateSummaryMeasurementsDTO2, true)) == null) {
            return 0.0f;
        }
        return fZ.floatValue();
    }

    public final float x(double d14, boolean z14) {
        if (!z14) {
            return (float) d14;
        }
        l3.f23124b.getClass();
        return l3.a.p(d14, this.f12732h);
    }

    public final List<Entry> y(List<g> list, boolean z14) {
        if (list == null || list.isEmpty()) {
            return p13.j0.f134944a;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        boolean z15 = this.f12730f;
        p dVar = z15 ? new d(j0.f23099a) : new e(j0.f23099a);
        p pVar = z15 ? b.f12733a : c.f12734a;
        if (!list.isEmpty()) {
            int i14 = 0;
            DateTime dateTime = this.f12726b;
            int i15 = 0;
            while (i14 != size) {
                DateTime dateTime2 = this.f12727c;
                if (!dateTime.isBefore(dateTime2) && !((Boolean) dVar.invoke(dateTime, dateTime2)).booleanValue()) {
                    break;
                }
                g gVar = list.get(i14);
                DateTime dateTime3 = gVar.f129584c;
                if (dateTime3 != null) {
                    if (((Boolean) dVar.invoke(dateTime, dateTime3)).booleanValue()) {
                        double d14 = gVar.f129582a;
                        if (B(d14)) {
                            arrayList.add(new Entry(i15, x(d14, z14)));
                        }
                        i14++;
                    }
                    i15++;
                }
                dateTime = (DateTime) pVar.invoke(dateTime, 1);
            }
        }
        return arrayList;
    }

    public final Float z(LactateSummaryMeasurementsDTO lactateSummaryMeasurementsDTO, boolean z14) {
        List<g> list = z14 ? lactateSummaryMeasurementsDTO.f37140f : lactateSummaryMeasurementsDTO.f37139e;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (B(((g) obj).f129582a)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fX = x(((g) it.next()).f129582a, z14);
        while (it.hasNext()) {
            fX = Math.max(fX, x(((g) it.next()).f129582a, z14));
        }
        return Float.valueOf(fX);
    }

    /* JADX INFO: renamed from: at0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lat0/a$a;", "", "<init>", "()V", "", "BPM_TAG", "Ljava/lang/String;", "PACE_TAG", "", "ORIGINAL_CIRCLE_RADIUS", "F", "", "LINE_ALPHA", "I", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0180a {
        public /* synthetic */ C0180a(j jVar) {
            this();
        }

        private C0180a() {
        }
    }
}
