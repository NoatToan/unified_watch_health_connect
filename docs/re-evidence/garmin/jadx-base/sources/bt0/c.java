package bt0;

import android.content.Context;
import android.graphics.Shader;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import p13.h0;
import p13.j0;
import p13.w;
import zz.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lbt0/c;", "Lqz/c;", "Lvs0/c;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lbt0/b;", "dataAdapter", "Lxs0/a;", "lactateThresholdSportType", "<init>", "(Landroid/content/Context;Lbt0/b;Lxs0/a;)V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements qz.c<vs0.c, ILineDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f21043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xs0.a f21044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xs0.b f21045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f21046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f21047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21048f;

    public c(Context context, b bVar, xs0.a aVar) {
        context.getClass();
        bVar.getClass();
        aVar.getClass();
        this.f21043a = bVar;
        this.f21044b = aVar;
        xs0.b bVar2 = xs0.b.PACE;
        this.f21045c = bVar2;
        f.a aVar2 = f.f21060g;
        xs0.b bVar3 = xs0.b.HEART_RATE;
        aVar2.getClass();
        this.f21046d = f.a.a(context, bVar3, aVar);
        this.f21047e = f.a.a(context, bVar2, aVar);
        this.f21048f = context.getColor(R.color.gcm_chart_highlight_line);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x015e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.ArrayList] */
    @Override // qz.c
    public final List<ILineDataSet> a(vs0.c cVar) {
        ?? arrayList;
        ?? arrayList2;
        ArrayList<xz.a> arrayList3;
        ?? arrayList4;
        String str;
        String str2;
        vs0.c cVar2 = cVar;
        if (cVar2 == null) {
            return j0.f134944a;
        }
        b bVar = this.f21043a;
        List<k> listB = bVar.b(cVar2);
        LocalDate localDate = bVar.f21034a;
        f fVar = this.f21046d;
        if (listB != null) {
            arrayList = new ArrayList();
            for (k kVar : listB) {
                DateTime dateTime = kVar.f21084a;
                double d14 = kVar.f21085b;
                LocalDate localDate2 = dateTime.toLocalDate();
                localDate2.getClass();
                DateTime dateTime2 = kVar.f21084a;
                DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("MMMM d, yyyy");
                dateTimeFormatterForPattern.getClass();
                String strH = c22.j0.h(dateTime2, dateTimeFormatterForPattern);
                fVar.getClass();
                x0 x0Var = x0.f105818a;
                arrayList.add(new xz.a(localDate2, (float) d14, new l(strH, String.format("%d %s", Arrays.copyOf(new Object[]{Integer.valueOf((int) d14), fVar.f21066f}, 2)), fVar.f21065e, null, null, Integer.valueOf(fVar.f21063c), Integer.valueOf(fVar.f21064d), null, SyslogConstants.LOG_LOCAL3, null)));
            }
        } else {
            arrayList = j0.f134944a;
        }
        if (arrayList == 0 || arrayList.isEmpty()) {
            arrayList2 = j0.f134944a;
        } else {
            arrayList2 = new ArrayList();
            for (xz.a aVar : arrayList) {
                arrayList2.add(new Entry(bVar.a(localDate, aVar.f192729a), aVar.f192730b, fVar.f21062b, aVar.f192731c));
            }
        }
        String str3 = "";
        new LineDataSet(arrayList2, "");
        LineDataSet lineDataSet = new LineDataSet(arrayList2, "");
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        int i14 = this.f21048f;
        lineDataSet.setHighLightColor(i14);
        lineDataSet.setLineWidth(1.0f);
        lineDataSet.setColor(fVar.f21061a);
        List listC = w.c(lineDataSet);
        List<k> listD = bVar.d(cVar2);
        if (listD != null) {
            ArrayList arrayList5 = new ArrayList();
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                k kVar2 = (k) it.next();
                DateTime dateTime3 = kVar2.f21084a;
                String str4 = str3;
                double d15 = kVar2.f21085b;
                LocalDate localDate3 = dateTime3.toLocalDate();
                localDate3.getClass();
                float f14 = (float) d15;
                String strI = com.nimbusds.jose.shaded.gson.internal.a.i("MMMM d, yyyy", kVar2.f21084a);
                f fVar2 = this.f21047e;
                fVar2.getClass();
                String str5 = fVar2.f21066f;
                int i15 = b.a.f21042a[bVar.f21037d.ordinal()];
                Iterator it3 = it;
                if (i15 == 1) {
                    x0 x0Var2 = x0.f105818a;
                    str = String.format("%d %s", Arrays.copyOf(new Object[]{Integer.valueOf((int) d15), str5}, 2));
                    str2 = str;
                } else if (i15 == 2) {
                    l3.f23124b.getClass();
                    String strW0 = l3.a.w0((int) d15);
                    x0 x0Var3 = x0.f105818a;
                    str = String.format("%s %s", Arrays.copyOf(new Object[]{strW0, str5}, 2));
                    str2 = str;
                } else if (i15 == 3) {
                    x0 x0Var4 = x0.f105818a;
                    str = String.format("%d %s", Arrays.copyOf(new Object[]{Integer.valueOf((int) d15), str5}, 2));
                    str2 = str;
                } else {
                    if (i15 != 4) {
                        u0.r();
                        return null;
                    }
                    x0 x0Var5 = x0.f105818a;
                    str2 = String.format("%.2f %s", Arrays.copyOf(new Object[]{Double.valueOf(d15), str5}, 2));
                }
                f fVar3 = this.f21047e;
                arrayList5.add(new xz.a(localDate3, f14, new l(strI, str2, fVar3.f21065e, null, null, Integer.valueOf(fVar3.f21063c), Integer.valueOf(this.f21047e.f21064d), null, SyslogConstants.LOG_LOCAL3, null)));
                str3 = str4;
                it = it3;
            }
            arrayList3 = arrayList5;
        } else {
            arrayList3 = null;
        }
        String str6 = str3;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            arrayList4 = j0.f134944a;
        } else {
            arrayList4 = new ArrayList();
            for (xz.a aVar2 : arrayList3) {
                arrayList4.add(new Entry(bVar.a(localDate, aVar2.f192729a), aVar2.f192730b, this.f21047e.f21062b, aVar2.f192731c));
            }
        }
        new LineDataSet(arrayList4, str6);
        LineDataSet lineDataSet2 = new LineDataSet(arrayList4, str6);
        lineDataSet2.setDrawValues(false);
        lineDataSet2.setDrawCircles(false);
        lineDataSet2.setDrawCircleHole(false);
        lineDataSet2.setDrawHorizontalHighlightIndicator(false);
        lineDataSet2.setHighLightColor(i14);
        lineDataSet2.setLineWidth(1.0f);
        lineDataSet2.setColor(this.f21047e.f21061a);
        lineDataSet2.setAxisDependency(YAxis.AxisDependency.RIGHT);
        return h0.C0(listC, w.c(lineDataSet2));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer c(vs0.c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(vs0.c cVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(vs0.c cVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(vs0.c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(vs0.c cVar) {
        return null;
    }

    @Override // qz.c
    public final float i(vs0.c cVar) {
        vs0.c cVar2 = cVar;
        b bVar = this.f21043a;
        p<Float, Float> pVarE = bVar.f21038e;
        if (pVarE == null) {
            pVarE = new h(bVar.b(cVar2)).e(5);
            bVar.f21038e = pVarE;
        }
        return pVarE.f128595b.floatValue();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(vs0.c cVar) {
        return null;
    }

    @Override // qz.c
    public final boolean k() {
        return this.f21045c == xs0.b.PACE;
    }

    @Override // qz.c
    public final float m(vs0.c cVar) {
        return this.f21043a.c(cVar).f128594a.floatValue();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(vs0.c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(vs0.c cVar) {
        return null;
    }

    @Override // qz.c
    public final float q(vs0.c cVar) {
        b bVar = this.f21043a;
        return bVar.a(bVar.f21034a, bVar.f21035b);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(vs0.c cVar) {
        return null;
    }

    @Override // qz.c
    public final float t(vs0.c cVar) {
        vs0.c cVar2 = cVar;
        b bVar = this.f21043a;
        p<Float, Float> pVarE = bVar.f21038e;
        if (pVarE == null) {
            pVarE = new h(bVar.b(cVar2)).e(5);
            bVar.f21038e = pVarE;
        }
        return pVarE.f128594a.floatValue();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List u(vs0.c cVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(vs0.c cVar) {
        return null;
    }

    @Override // qz.c
    public final float w(vs0.c cVar) {
        return this.f21043a.c(cVar).f128595b.floatValue();
    }
}
