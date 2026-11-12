package he1;

import android.content.Context;
import android.graphics.Shader;
import android.text.format.DateFormat;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import hz.d;
import j00.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.p;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import qz.c;
import xz.f;
import zz.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lhe1/a;", "Lqz/c;", "Lge1/a;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements c<ge1.a, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f83523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jz.a f83524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a10.a f83525c;

    static {
        new C1646a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f83523a = context;
        this.f83524b = new jz.a(new l22.a(context));
        this.f83525c = new a10.a(context);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static p A(ge1.a aVar) {
        List<d> list;
        Float fValueOf;
        List<d> list2;
        Object next;
        List<d> list3;
        Object next2;
        List<d> list4;
        Float fValueOf2 = null;
        if (aVar == null || (list4 = aVar.f76995c) == null || !(!list4.isEmpty())) {
            if (aVar != null) {
                list = aVar.f76993a;
            } else {
                list = null;
            }
        } else if (aVar != null) {
            list = aVar.f76995c;
        } else {
            list = null;
        }
        if (list != null) {
            Iterator<T> it = list.iterator();
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
        } else {
            fValueOf = null;
        }
        if (aVar == null || (list3 = aVar.f76994b) == null || !(!list3.isEmpty())) {
            if (aVar != null) {
                list2 = aVar.f76993a;
            } else {
                list2 = null;
            }
        } else if (aVar != null) {
            list2 = aVar.f76994b;
        } else {
            list2 = null;
        }
        if (list2 != null) {
            Iterator<T> it3 = list2.iterator();
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
        List<d> list;
        ge1.a aVar2 = aVar;
        if (gl1.d.G(aVar2) || !(aVar2 == null || (list = aVar2.f76993a) == null || !(!list.isEmpty()))) {
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
    public final List<BarDataSet> a(ge1.a aVar) {
        List<d> list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Context context = this.f83523a;
        if (aVar != null && (list = aVar.f76996d) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                DateTime dateTime = ((d) it.next()).f86388a;
                DateTime dateTime2 = aVar.f76999g;
                g.f95975a.getClass();
                float fA = g.a(60, dateTime2, dateTime);
                DateTime dateTimePlusMinutes = dateTime2.plusMinutes(((int) fA) * 60);
                DateTime dateTimeMinusMinutes = dateTimePlusMinutes.minusMinutes(60);
                dateTimeMinusMinutes.getClass();
                arrayList2.add(new BarEntry(fA * 60, t(aVar) + 1.0f, new l(this.f83524b.c(dateTimeMinusMinutes, dateTimePlusMinutes, DateFormat.is24HourFormat(context)), this.f83525c.f242a.getString(R.string.lbl_active), null, null, null, null, Integer.valueOf(R.drawable.gcm_chart_metric_bullet), Integer.valueOf(R.color.gcm_chart_respiration_averages_active), 60, null)));
            }
        }
        if (!arrayList2.isEmpty()) {
            BarDataSet barDataSet = new BarDataSet(arrayList2, "RESPIRATION_TOO_ACTIVE");
            barDataSet.setDrawValues(false);
            barDataSet.setColor(a7.b.getColor(context, R.color.gcm_chart_respiration_averages_active));
            barDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
            barDataSet.setHighLightAlpha(255);
            arrayList.add(barDataSet);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final float t(ge1.a aVar) {
        if (gl1.d.F(aVar)) {
            return ((Number) A(aVar).f128594a).floatValue() - 1.0f;
        }
        return 8.0f;
    }

    @Override // qz.c
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final List<f> u(ge1.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f(this.f83525c.f242a.getString(R.string.lbl_active), null, Integer.valueOf(a7.b.getColor(this.f83523a, R.color.gcm_chart_respiration_averages_active)), null, xz.g.a.f192745a, null, null, 106, null));
        return arrayList;
    }

    /* JADX INFO: renamed from: he1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhe1/a$a;", "", "<init>", "()V", "", "DATA_SET_LABEL", "Ljava/lang/String;", "", "Y_AXIS_MARGIN", "F", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1646a {
        public /* synthetic */ C1646a(j jVar) {
            this();
        }

        private C1646a() {
        }
    }
}
