package ay;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import gs1.j;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.w;
import xz.f;
import xz.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lay/c;", "Lqz/c;", "Lgs1/j;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements qz.c<j, ILineDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f13651b;

    static {
        new a(null);
    }

    public c(Context context) {
        context.getClass();
        this.f13650a = context;
        this.f13651b = new f(new l22.a(context).getString(R.string.lbl_movement), null, Integer.valueOf(context.getColor(R.color.gcm_sleep_chart_movement)), null, g.a.f192745a, null, null, 106, null);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer c(j jVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(j jVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(j jVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(j jVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(j jVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float i(j jVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(j jVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(j jVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(j jVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(j jVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float q(j jVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(j jVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(j jVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final List u(j jVar) {
        j.c payload;
        j jVar2 = jVar;
        List<j.b> listD = (jVar2 == null || (payload = jVar2.getPayload()) == null) ? null : payload.d();
        return (listD == null || listD.isEmpty()) ? j0.f134944a : w.c(this.f13651b);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(j jVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(j jVar) {
        return 10.0f;
    }

    @Override // qz.c
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final List<ILineDataSet> a(j jVar) {
        j.c payload;
        List<j.b> listD;
        LineDataSet lineDataSet;
        if (jVar == null || (payload = jVar.getPayload()) == null || (listD = payload.d()) == null) {
            return j0.f134944a;
        }
        j.c payload2 = jVar.getPayload();
        DateTime dateTimeF = payload2 != null ? payload2.f() : null;
        ArrayList arrayList = new ArrayList();
        int entryCount = 0;
        while (entryCount < listD.size()) {
            List<j.b> listSubList = listD.subList(entryCount, listD.size());
            ArrayList arrayList2 = new ArrayList();
            for (j.b bVar : listSubList) {
                DateTime dateTime = bVar.f78778a;
                Double d14 = bVar.f78779b;
                if (dateTime == null || d14 == null || s.c(d14, 0.0d)) {
                    break;
                }
                DateTime dateTimeNow = dateTimeF == null ? DateTime.now() : dateTimeF;
                DateTime dateTimeNow2 = bVar.f78778a;
                if (dateTimeNow2 == null) {
                    dateTimeNow2 = DateTime.now();
                }
                arrayList2.add(new Entry(Minutes.minutesBetween(dateTimeNow, dateTimeNow2).getMinutes(), (float) d14.doubleValue()));
            }
            if (arrayList2.isEmpty()) {
                lineDataSet = null;
            } else {
                lineDataSet = new LineDataSet(arrayList2, "");
                lineDataSet.setDrawValues(false);
                lineDataSet.setDrawCircles(false);
                lineDataSet.setDrawCircleHole(false);
                lineDataSet.setDrawFilled(true);
                lineDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
                lineDataSet.setHighlightEnabled(false);
                Context context = this.f13650a;
                lineDataSet.setColor(context.getColor(R.color.gcm3_transparent));
                lineDataSet.setFillColor(context.getColor(R.color.gcm_sleep_chart_movement));
                lineDataSet.setFillAlpha(255);
            }
            if (lineDataSet != null) {
                arrayList.add(lineDataSet);
                entryCount += lineDataSet.getEntryCount();
            } else {
                entryCount++;
            }
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lay/c$a;", "", "<init>", "()V", "", "MAX_MOVEMENT_VALUE", "F", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
