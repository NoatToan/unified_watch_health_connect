package u61;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.BarDataSet;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p13.j0;
import p13.u;
import p13.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lu61/a;", "Lqz/c;", "", "Lo61/i;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/DateTime;", "startDate", "endDate", "<init>", "(Landroid/content/Context;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements qz.c<List<? extends o61.i>, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f168855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f168856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f168857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f168858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DateTimeFormatter f168859e;

    static {
        new C3164a(null);
    }

    public a(Context context, DateTime dateTime, DateTime dateTime2) {
        context.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        this.f168855a = context;
        this.f168856b = dateTime;
        this.f168857c = dateTime2;
        this.f168858d = Days.daysBetween(dateTime, dateTime2.plusDays(1)).getDays();
        this.f168859e = DateTimeFormat.forPattern("M/yy");
    }

    @Override // qz.c
    public final List<BarDataSet> a(List<? extends o61.i> list) {
        List<? extends o61.i> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            a61.e eVar = a61.e.f1563a;
            eVar.getClass();
            if (u.T(a61.e.f(list2)) > 0.0d) {
                eVar.getClass();
                double[] dArrF = a61.e.f(list2);
                if (dArrF.length == 0) {
                    return j0.f134944a;
                }
                ArrayList arrayList = new ArrayList(dArrF.length);
                int length = dArrF.length;
                int i14 = 0;
                int i15 = 0;
                while (i14 < length) {
                    arrayList.add(new xz.e(i15, (float) dArrF[i14], (Object) null, new int[0], 0.0f, false, false, 116, (p005kotlin.jvm.internal.j) null));
                    i14++;
                    i15++;
                }
                BarDataSet barDataSet = new BarDataSet(arrayList, "");
                barDataSet.setColor(a7.b.getColor(this.f168855a, R.color.gcm_chart_indicator));
                return w.c(barDataSet);
            }
        }
        return j0.f134944a;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(List<? extends o61.i> list) {
        return Integer.valueOf(this.f168858d);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(List<? extends o61.i> list) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(List<? extends o61.i> list) {
        return -0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(List<? extends o61.i> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(List<? extends o61.i> list) {
        return null;
    }

    @Override // qz.c
    public final float i(List<? extends o61.i> list) {
        List<? extends o61.i> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return 0.0f;
        }
        a61.e.f1563a.getClass();
        return u.T(a61.e.f(list2)) > 0.0d ? 100.0f : 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(List<? extends o61.i> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(List<? extends o61.i> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final List o(List<? extends o61.i> list) {
        DateTimeFormatter dateTimeFormatter = this.f168859e;
        dateTimeFormatter.getClass();
        return fz.a.e(this.f168855a, 0, this.f168856b, this.f168857c, dateTimeFormatter);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(List<? extends o61.i> list) {
        return null;
    }

    @Override // qz.c
    public final float q(List<? extends o61.i> list) {
        return this.f168858d - 0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(List<? extends o61.i> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(List<? extends o61.i> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List u(List<? extends o61.i> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(List<? extends o61.i> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(List<? extends o61.i> list) {
        return 0.0f;
    }

    /* JADX INFO: renamed from: u61.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lu61/a$a;", "", "<init>", "()V", "", "X_AXIS_OFFSET", "F", "LEFT_AXIS_MAX_VALUE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3164a {
        public /* synthetic */ C3164a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3164a() {
        }
    }
}
