package b71;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.j0;
import p13.w;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lb71/a;", "Lqz/c;", "", "Le71/f;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements qz.c<List<? extends e71.f>, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f16308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f16309c;

    static {
        new C0230a(null);
    }

    public a(Context context, LocalDate localDate, LocalDate localDate2) {
        context.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f16307a = context;
        this.f16308b = localDate;
        this.f16309c = localDate2;
    }

    @Override // qz.c
    public final List<BarDataSet> a(List<? extends e71.f> list) {
        List<? extends e71.f> list2 = list;
        if (list2 == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (e71.f fVar : list2) {
            List list3 = (List) linkedHashMap.get(fVar.f63298d.withTimeAtStartOfDay());
            if (list3 != null) {
                list3.add(fVar);
            } else {
                linkedHashMap.put(fVar.f63298d.withTimeAtStartOfDay(), x.m(fVar));
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            int i14 = 0;
            if (!it.hasNext()) {
                BarDataSet barDataSet = new BarDataSet(arrayList, "");
                barDataSet.setDrawValues(false);
                barDataSet.setColors(arrayList2);
                barDataSet.setBarBorderWidth(0.0f);
                barDataSet.setHighlightEnabled(true);
                barDataSet.setHighLightColor(a7.b.getColor(this.f16307a, R.color.gcm_chart_highlight_line));
                return w.c(barDataSet);
            }
            Map.Entry entry = (Map.Entry) it.next();
            List list4 = (List) entry.getValue();
            float[] fArr = new float[list4.size()];
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list4) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                e71.f fVar2 = (e71.f) obj;
                fArr[i14] = (float) fVar2.f63297c;
                arrayList2.add(Integer.valueOf(fVar2.f63299e));
                zz.l lVar = fVar2.f63304j;
                if (lVar != null) {
                    arrayList3.add(lVar);
                }
                i14 = i15;
            }
            BarEntry barEntry = new BarEntry(Days.daysBetween(this.f16308b, ((DateTime) entry.getKey()).toLocalDate()).getDays(), fArr);
            barEntry.setData(arrayList3);
            arrayList.add(barEntry);
        }
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer c(List<? extends e71.f> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(List<? extends e71.f> list) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(List<? extends e71.f> list) {
        return -0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(List<? extends e71.f> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(List<? extends e71.f> list) {
        return null;
    }

    @Override // qz.c
    public final float i(List<? extends e71.f> list) {
        return new c(list).e(6).f128595b.floatValue();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(List<? extends e71.f> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(List<? extends e71.f> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(List<? extends e71.f> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(List<? extends e71.f> list) {
        return null;
    }

    @Override // qz.c
    public final float q(List<? extends e71.f> list) {
        return Days.daysBetween(this.f16308b, this.f16309c).getDays() + 0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(List<? extends e71.f> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(List<? extends e71.f> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final List u(List<? extends e71.f> list) {
        List<? extends e71.f> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return j0.f134944a;
        }
        Context context = this.f16307a;
        String string = context.getString(R.string.activity_anaerobic_label);
        string.getClass();
        Integer numValueOf = Integer.valueOf(a7.b.getColor(context, R.color.gcm_exercise_load_purple));
        xz.g.a aVar = xz.g.a.f192745a;
        xz.f fVar = new xz.f(string, null, numValueOf, null, aVar, null, null, 106, null);
        String string2 = context.getString(R.string.lbl_high_aer_lf);
        string2.getClass();
        xz.f fVar2 = new xz.f(string2, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_exercise_load_orange)), null, aVar, null, null, 106, null);
        String string3 = context.getString(R.string.activities_low_aerobic_title);
        string3.getClass();
        xz.f fVar3 = new xz.f(string3, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_exercise_load_teal)), null, aVar, null, null, 106, null);
        String string4 = context.getString(R.string.lbl_unknown);
        string4.getClass();
        return x.k(fVar, fVar2, fVar3, new xz.f(string4, null, Integer.valueOf(a7.b.getColor(context, R.color.palette_gray_4)), null, aVar, null, null, 106, null));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(List<? extends e71.f> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(List<? extends e71.f> list) {
        return 0.0f;
    }

    /* JADX INFO: renamed from: b71.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb71/a$a;", "", "<init>", "()V", "", "X_AXIS_OFFSET", "F", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0230a {
        public /* synthetic */ C0230a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0230a() {
        }
    }
}
