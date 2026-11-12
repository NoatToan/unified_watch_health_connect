package qr0;

import android.content.Context;
import android.graphics.Shader;
import c22.t;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.BarDataSet;
import gl1.d;
import ir0.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.w;
import p13.x;
import p13.y;
import pi0.e;
import qz.c;
import zz.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0011BI\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lqr0/a;", "Lqz/c;", "", "Lir0/f;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/DateTime;", "startDate", "endDate", "", "isGarminCoachReport", "Lo13/p;", "", "customLabels", "<init>", "(Landroid/content/Context;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLo13/p;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements c<List<? extends f>, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f146882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f146883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x00.a f146884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f146885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f146886e;

    static {
        new C2761a(null);
    }

    public a(Context context, DateTime dateTime, DateTime dateTime2, boolean z14, p<String, String> pVar) {
        ArrayList arrayListC;
        String str;
        String str2;
        context.getClass();
        dateTime.getClass();
        this.f146882a = context;
        this.f146883b = dateTime;
        this.f146884c = new x00.a(context);
        this.f146885d = new e(context);
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("M/dd");
        if (!z14 || dateTime2 == null) {
            DateTimeFormatter dateTimeFormatterForPattern2 = DateTimeFormat.forPattern("MMM");
            dateTimeFormatterForPattern2.getClass();
            arrayListC = d.C(context, dateTime, dateTimeFormatterForPattern2);
        } else {
            dateTimeFormatterForPattern.getClass();
            List<String> listE = fz.a.e(context, 5, dateTime, dateTime2, dateTimeFormatterForPattern);
            arrayListC = new ArrayList(y.r(listE, 10));
            ArrayList arrayList = (ArrayList) listE;
            int i14 = 0;
            for (Object obj : arrayList) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                String strH = (String) obj;
                if (i14 == 0) {
                    if (pVar != null && (str2 = pVar.f128594a) != null) {
                        strH = str2;
                    }
                } else if (i14 != arrayList.size() - 1) {
                    strH = StringUtils.SPACE;
                } else if (pVar != null && (str = pVar.f128595b) != null) {
                    strH = com.nimbusds.jose.shaded.gson.internal.a.h(str, "(", strH, ")");
                }
                arrayListC.add(strH);
                i14 = i15;
            }
        }
        this.f146886e = arrayListC;
    }

    public static ArrayList x(List list) {
        Integer numF;
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < 52; i14++) {
            f fVar = list != null ? (f) h0.e0(i14, list) : null;
            float f14 = 0.0f;
            float fIntValue = (fVar == null || (numF = fVar.f()) == null) ? 0.0f : numF.intValue();
            if (fVar != null) {
                f14 = fVar.f94797b;
            }
            arrayList.add(new p(Float.valueOf(fIntValue), Float.valueOf(f14)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final List<BarDataSet> a(List<? extends f> list) {
        Integer numValueOf;
        List<? extends f> list2 = list;
        if (list2 == null) {
            return j0.f134944a;
        }
        ArrayList arrayListX = x(list2);
        ArrayList arrayList = new ArrayList(y.r(arrayListX, 10));
        Iterator it = arrayListX.iterator();
        int i14 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            Context context = this.f146882a;
            if (!zHasNext) {
                BarDataSet barDataSet = new BarDataSet(arrayList, "");
                barDataSet.setBarShadowColor(a7.b.getColor(context, R.color.gcm3_chart_gradient_gray_start));
                barDataSet.setHighLightColor(a7.b.getColor(context, R.color.gcm_chart_highlight_line));
                return w.c(barDataSet);
            }
            Object next = it.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            p pVar = (p) next;
            float f14 = i14;
            A a14 = pVar.f128594a;
            B b14 = pVar.f128595b;
            float fFloatValue = ((Number) a14).floatValue();
            p pVar2 = (p) arrayListX.get(i14);
            DateTime dateTimePlusDays = this.f146883b.plusDays(i14 * 7);
            DateTime dateTimePlusDays2 = dateTimePlusDays.plusDays(6);
            dateTimePlusDays2.getClass();
            String strG = this.f146885d.g(dateTimePlusDays, dateTimePlusDays2, qi0.c.NO_YEAR_OVERLAPPING_ABBREV_MONTH_DAY);
            String strB = this.f146884c.b(Integer.valueOf((int) ((Number) pVar2.f128594a).floatValue()));
            Number number = (Number) pVar2.f128594a;
            if (number.floatValue() > 0.0f) {
                numValueOf = Integer.valueOf(number.floatValue() >= ((Number) pVar2.f128595b).floatValue() ? R.color.gcm_chart_indicator_goal_achieved : R.color.gcm_chart_indicator_goal_in_progress);
            } else {
                numValueOf = null;
            }
            Number number2 = (Number) b14;
            arrayList.add(new xz.e(f14, fFloatValue, (Object) new l(strG, strB, context.getString(R.string.title_intensity_minutes), null, null, numValueOf, null, null, 216, null), ((Number) pVar.f128594a).floatValue() >= number2.floatValue() ? new int[]{a7.b.getColor(context, R.color.gcm_chart_indicator_goal_achieved)} : new int[]{a7.b.getColor(context, R.color.gcm_chart_indicator_goal_in_progress)}, number2.floatValue(), false, false, 96, (j) null));
            i14 = i15;
        }
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(List<? extends f> list) {
        return Integer.valueOf(this.f146886e.size());
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(List<? extends f> list) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(List<? extends f> list) {
        return -0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(List<? extends f> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(List<? extends f> list) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final float i(List<? extends f> list) {
        ArrayList arrayListX = x(list);
        Iterator it = arrayListX.iterator();
        if (!it.hasNext()) {
            t.g();
            return 0.0f;
        }
        float fFloatValue = ((Number) ((p) it.next()).f128594a).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) ((p) it.next()).f128594a).floatValue());
        }
        Iterator it3 = arrayListX.iterator();
        if (!it3.hasNext()) {
            t.g();
            return 0.0f;
        }
        float fFloatValue2 = ((Number) ((p) it3.next()).f128595b).floatValue();
        while (it3.hasNext()) {
            fFloatValue2 = Math.max(fFloatValue2, ((Number) ((p) it3.next()).f128595b).floatValue());
        }
        if (fFloatValue2 <= 0.0f) {
            fFloatValue2 = 150.0f;
        }
        if (fFloatValue < fFloatValue2) {
            fFloatValue = fFloatValue2;
        }
        int iC = MathKt.c((float) Math.ceil(fFloatValue));
        int i14 = iC / 15;
        if (iC % 15 > 0) {
            i14++;
        }
        return i14 * 15;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(List<? extends f> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(List<? extends f> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final List o(List<? extends f> list) {
        return this.f146886e;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(List<? extends f> list) {
        return null;
    }

    @Override // qz.c
    public final float q(List<? extends f> list) {
        return this.f146886e.size() - 0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(List<? extends f> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(List<? extends f> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List u(List<? extends f> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(List<? extends f> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(List<? extends f> list) {
        return 0.0f;
    }

    /* JADX INFO: renamed from: qr0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqr0/a$a;", "", "<init>", "()V", "", "X_AXIS_OFFSET", "F", "", "NEAREST_LABEL_VALUE_FOR_4_LABELS", "I", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2761a {
        public /* synthetic */ C2761a(j jVar) {
            this();
        }

        private C2761a() {
        }
    }

    public /* synthetic */ a(Context context, DateTime dateTime, DateTime dateTime2, boolean z14, p pVar, int i14, j jVar) {
        this(context, dateTime, (i14 & 4) != 0 ? null : dateTime2, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? null : pVar);
    }
}
