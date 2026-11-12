package i60;

import android.content.Context;
import android.graphics.Shader;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.j0;
import p13.w;
import zz.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Li60/c;", "Lqz/c;", "Ln60/b;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Li60/a;", "dataAdapter", "Lo82/g;", "intervalType", "<init>", "(Landroid/content/Context;Li60/a;Lo82/g;)V", "gcm-critical-swim-speed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements qz.c<n60.b, ILineDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f91804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f91805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o82.g f91806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f91807d;

    public c(Context context, a aVar, o82.g gVar) {
        context.getClass();
        aVar.getClass();
        gVar.getClass();
        this.f91804a = context;
        this.f91805b = aVar;
        this.f91806c = gVar;
        f.f91815d.getClass();
        this.f91807d = new f(context.getColor(R.color.gcm_chart_critical_swim_speed_data_set), R.drawable.circle_white, R.color.gcm_chart_critical_swim_speed_data_set);
    }

    @Override // qz.c
    public final List<ILineDataSet> a(n60.b bVar) {
        f fVar;
        List list;
        n60.b bVar2 = bVar;
        a aVar = this.f91805b;
        ArrayList arrayList = aVar.f91803c;
        LineDataSet lineDataSet = null;
        if (arrayList == null) {
            List<n60.a> listB = bVar2 != null ? bVar2.b() : null;
            arrayList = new ArrayList();
            if (listB != null) {
                for (n60.a aVar2 : listB) {
                    LocalDate localDate = aVar2.getCom.google.firebase.messaging.Constants.MessagePayloadKeys.FROM java.lang.String();
                    LocalDate until = aVar2.getUntil();
                    Double d14 = aVar2.d();
                    if (localDate != null && until != null && d14 != null) {
                        arrayList.add(new d(localDate, until, d14.doubleValue()));
                    }
                }
            }
            aVar.f91803c = arrayList;
        }
        ArrayList<xz.a> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fVar = this.f91807d;
            if (!zHasNext) {
                break;
            }
            d dVar = (d) it.next();
            LocalDate localDate2 = dVar.f91808a;
            double d15 = dVar.f91810c;
            String strB = aVar.b(dVar.f91808a, dVar.f91809b);
            l3.f23124b.getClass();
            arrayList2.add(new xz.a(localDate2, (float) d15, new l(strB, l3.a.w0((int) d15), null, this.f91804a.getString(R.string.lbl_minute_100_meters), null, null, Integer.valueOf(fVar.f91817b), Integer.valueOf(fVar.f91818c), 52, null)));
        }
        LocalDate localDate3 = aVar.f91801a;
        if (arrayList2.isEmpty()) {
            list = j0.f134944a;
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (xz.a aVar3 : arrayList2) {
                arrayList3.add(new Entry(aVar.a(localDate3, aVar3.f192729a), aVar3.f192730b, aVar3.f192731c));
            }
            list = arrayList3;
        }
        if (!list.isEmpty()) {
            lineDataSet = new LineDataSet(list, "");
            lineDataSet.setDrawValues(false);
            lineDataSet.setDrawCircles(this.f91806c != o82.g.f130856i);
            int i14 = fVar.f91816a;
            lineDataSet.setCircleColor(i14);
            lineDataSet.setDrawCircleHole(false);
            lineDataSet.setDrawHorizontalHighlightIndicator(false);
            lineDataSet.setHighLightColor(i14);
            lineDataSet.setLineWidth(2.0f);
            lineDataSet.setColor(i14);
        }
        return lineDataSet == null ? j0.f134944a : w.c(lineDataSet);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer c(n60.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(n60.b bVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(n60.b bVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(n60.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(n60.b bVar) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final float i(n60.b bVar) {
        return ((Number) a.c(bVar).f128595b).floatValue();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(n60.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(n60.b bVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(n60.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(n60.b bVar) {
        return null;
    }

    @Override // qz.c
    public final float q(n60.b bVar) {
        a aVar = this.f91805b;
        return aVar.a(aVar.f91801a, aVar.f91802b);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(n60.b bVar) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.c
    public final float t(n60.b bVar) {
        return ((Number) a.c(bVar).f128594a).floatValue();
    }

    @Override // qz.c
    public final List u(n60.b bVar) {
        n60.b bVar2 = bVar;
        List<g60.b> listD = bVar2 != null ? bVar2.d() : null;
        if (listD == null || listD.isEmpty()) {
            return j0.f134944a;
        }
        Context context = this.f91804a;
        String string = context.getString(R.string.lbl_css_result);
        string.getClass();
        return w.c(new xz.f(string, null, Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_critical_swim_speed_data_set)), null, xz.g.a.f192745a, null, null, 106, null));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(n60.b bVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(n60.b bVar) {
        return 0.0f;
    }
}
