package gp1;

import android.content.Context;
import android.graphics.Shader;
import c22.l3;
import c22.t;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.BarDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.w;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lgp1/f;", "Lqz/c;", "", "Lip1/f;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/joda/time/LocalDate;", "startDate", "endDate", "<init>", "(Landroid/content/Context;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "a", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements qz.c<List<? extends ip1.f>, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f78448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f78449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f78450d;

    static {
        new a(null);
    }

    public f(Context context, LocalDate localDate, LocalDate localDate2) {
        context.getClass();
        this.f78447a = context;
        this.f78448b = localDate;
        this.f78449c = localDate2;
        this.f78450d = context.getColor(R.color.palette_mango_27);
    }

    @Override // qz.c
    public final List<BarDataSet> a(List<? extends ip1.f> list) {
        List<? extends ip1.f> list2 = list;
        ArrayList arrayList = new ArrayList();
        if (list2 != null) {
            int i14 = 0;
            for (Object obj : list2) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                double d14 = ((ip1.f) obj).f94685b;
                l3.f23124b.getClass();
                double d15 = d14 / 60.0d;
                arrayList.add(new xz.e(i14, d15 < 1.0d ? (float) d15 : (float) Math.floor(d15), (Object) null, new int[]{this.f78450d}, 0.0f, false, false, 116, (j) null));
                i14 = i15;
            }
        }
        return w.c(new BarDataSet(arrayList, ""));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(List<? extends ip1.f> list) {
        return Integer.valueOf(Days.daysBetween(this.f78448b, this.f78449c).getDays() + 1);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(List<? extends ip1.f> list) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(List<? extends ip1.f> list) {
        return -0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(List<? extends ip1.f> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(List<? extends ip1.f> list) {
        return null;
    }

    @Override // qz.c
    public final float i(List<? extends ip1.f> list) {
        double dMax;
        List<? extends ip1.f> list2 = list;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            if (!it.hasNext()) {
                t.g();
                return 0.0f;
            }
            dMax = ((ip1.f) it.next()).f94685b;
            while (it.hasNext()) {
                dMax = Math.max(dMax, ((ip1.f) it.next()).f94685b);
            }
        } else {
            dMax = 0.0d;
        }
        l3.f23124b.getClass();
        float f14 = (float) (dMax / 60.0d);
        float f15 = 3;
        return ((float) Math.ceil(f14 / f15)) * f15;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(List<? extends ip1.f> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(List<? extends ip1.f> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(List<? extends ip1.f> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(List<? extends ip1.f> list) {
        return null;
    }

    @Override // qz.c
    public final float q(List<? extends ip1.f> list) {
        return Days.daysBetween(this.f78448b, this.f78449c).getDays() + 0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(List<? extends ip1.f> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(List<? extends ip1.f> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final List u(List<? extends ip1.f> list) {
        List<? extends ip1.f> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        String string = this.f78447a.getString(R.string.edge_solar_charge_chart_legend);
        string.getClass();
        return w.c(new xz.f(string, null, Integer.valueOf(this.f78450d), null, xz.g.a.f192745a, null, null, 106, null));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(List<? extends ip1.f> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(List<? extends ip1.f> list) {
        return 0.0f;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgp1/f$a;", "", "<init>", "()V", "", "DEFAULT_X_AXIS_OFFSET", "F", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
