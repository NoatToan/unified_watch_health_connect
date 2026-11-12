package u61;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.BarDataSet;
import java.util.ArrayList;
import java.util.List;
import o61.l;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p13.j0;
import p13.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000eB'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lu61/c;", "Lqz/c;", "", "Lo61/l;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/DateTime;", "startDate", "endDate", "", "isAnaerobic", "<init>", "(Landroid/content/Context;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Z)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements qz.c<List<? extends l>, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f168864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f168865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f168866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f168867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f168868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DateTimeFormatter f168869f;

    static {
        new a(null);
    }

    public c(Context context, DateTime dateTime, DateTime dateTime2, boolean z14) {
        context.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        this.f168864a = context;
        this.f168865b = dateTime;
        this.f168866c = dateTime2;
        this.f168867d = z14;
        this.f168868e = Days.daysBetween(dateTime, dateTime2.plusDays(1)).getDays();
        this.f168869f = DateTimeFormat.forPattern("M/yy");
    }

    @Override // qz.c
    public final List<BarDataSet> a(List<? extends l> list) {
        List<? extends l> list2 = list;
        if (!x(list2)) {
            return j0.f134944a;
        }
        a61.e.f1563a.getClass();
        double[] dArr = new double[0];
        if (list2 != null) {
            dArr = new double[list2.size()];
            int i14 = 0;
            for (l lVar : list2) {
                int i15 = i14 + 1;
                dArr[i14] = this.f168867d ? lVar.f129607c : lVar.f129606b;
                i14 = i15;
            }
        }
        if (dArr.length == 0) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i16 = 0;
        int i17 = 0;
        while (i16 < length) {
            arrayList.add(new xz.e(i17, (float) dArr[i16], (Object) null, new int[0], 0.0f, false, false, 116, (p005kotlin.jvm.internal.j) null));
            i16++;
            i17++;
        }
        BarDataSet barDataSet = new BarDataSet(arrayList, "");
        barDataSet.setColor(a7.b.getColor(this.f168864a, R.color.gcm_chart_indicator));
        return w.c(barDataSet);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(List<? extends l> list) {
        return Integer.valueOf(this.f168868e);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(List<? extends l> list) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(List<? extends l> list) {
        return -0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(List<? extends l> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(List<? extends l> list) {
        return null;
    }

    @Override // qz.c
    public final float i(List<? extends l> list) {
        return x(list) ? 5.0f : 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(List<? extends l> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(List<? extends l> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final List o(List<? extends l> list) {
        if (!x(list)) {
            return j0.f134944a;
        }
        DateTimeFormatter dateTimeFormatter = this.f168869f;
        dateTimeFormatter.getClass();
        return fz.a.e(this.f168864a, 0, this.f168865b, this.f168866c, dateTimeFormatter);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(List<? extends l> list) {
        return null;
    }

    @Override // qz.c
    public final float q(List<? extends l> list) {
        return this.f168868e - 0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(List<? extends l> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(List<? extends l> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List u(List<? extends l> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(List<? extends l> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(List<? extends l> list) {
        return 0.0f;
    }

    public final boolean x(List<l> list) {
        if (list != null && !list.isEmpty()) {
            a61.e.f1563a.getClass();
            list.getClass();
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                if (!Double.isNaN(this.f168867d ? list.get(i14).f129607c : list.get(i14).f129606b)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lu61/c$a;", "", "<init>", "()V", "", "X_AXIS_OFFSET", "F", "LEFT_AXIS_MAX_VALUE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
