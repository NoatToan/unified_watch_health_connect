package vq1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import c22.r0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import gl1.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jq1.g;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.w;
import p13.x;
import vn2.b1;
import yz.k;
import zx0.m;
import zz.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lvq1/d;", "Lqz/c;", "Ljq1/g;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lyz/k;", "timeFormatter", "Lpq1/d;", "stepsDataFormatter", "<init>", "(Landroid/content/Context;Lyz/k;Lpq1/d;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements qz.c<g, ILineDataSet> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f179439h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f179440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f179441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.a f179442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f179443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayerDrawable f179444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f179445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LineDataSet f179446g;

    static {
        new a(null);
    }

    public d(Context context, k kVar, pq1.d dVar) {
        context.getClass();
        kVar.getClass();
        dVar.getClass();
        this.f179440a = context;
        this.f179441b = kVar;
        l22.a aVar = new l22.a(context);
        this.f179442c = aVar;
        this.f179443d = aVar.getString(R.string.lbl_steps);
        Resources resources = context.getResources();
        resources.getClass();
        this.f179444e = r0.a(context, R.drawable.check, R.color.gcm_icon_background_goal_on_chart, R.color.gcm_icon_success, (int) xy2.b.n(resources, 2.0f), R.color.gcm_icon_success, r0.a.SMALL);
    }

    public static float x(g gVar) {
        jq1.b bVar;
        Integer num;
        jq1.f fVar;
        Integer num2;
        List<jq1.f> listA = gVar != null ? gVar.a() : null;
        int iIntValue = 0;
        int iIntValue2 = (listA == null || (fVar = (jq1.f) h0.n0(listA)) == null || (num2 = fVar.f100004c) == null) ? 0 : num2.intValue();
        if (gVar != null && (bVar = gVar.f100009a) != null && (num = bVar.f99984f) != null) {
            iIntValue = num.intValue();
        }
        float fT = y.t(iIntValue2, iIntValue);
        if (listA == null || listA.isEmpty() || fT <= 0.0f) {
            return 10000.0f;
        }
        return fT;
    }

    @Override // qz.c
    public final List<ILineDataSet> a(g gVar) {
        List<jq1.f> listSubList;
        float f14;
        int i14;
        LineDataSet lineDataSet;
        int i15;
        Entry entry;
        jq1.b bVar;
        Integer num;
        g gVar2 = gVar;
        if (gVar2 == null || (listSubList = gVar2.a()) == null) {
            listSubList = j0.f134944a;
        }
        int i16 = 0;
        int iIntValue = (gVar2 == null || (bVar = gVar2.f100009a) == null || (num = bVar.f99984f) == null) ? 0 : num.intValue();
        ArrayList arrayList = new ArrayList();
        listSubList.getClass();
        if (listSubList.size() > 96) {
            listSubList = listSubList.subList(0, 96);
        }
        int entryCount = 0;
        while (entryCount < listSubList.size()) {
            List<jq1.f> listSubList2 = listSubList.subList(entryCount, listSubList.size());
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = listSubList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    f14 = 0.0f;
                    i14 = R.color.gcm_chart_steps_data_set;
                    break;
                }
                jq1.f fVar = (jq1.f) it.next();
                String str = fVar.f100005d;
                f14 = 0.0f;
                Integer num2 = fVar.f100004c;
                i14 = R.color.gcm_chart_steps_data_set;
                if ("none".equalsIgnoreCase(str)) {
                    break;
                }
                DateTime dateTimeN = c22.j0.N(fVar.f100002a, true);
                if (dateTimeN == null) {
                    dateTimeN = DateTime.now();
                    dateTimeN.getClass();
                }
                DateTime dateTimeN2 = c22.j0.N(fVar.f100003b, true);
                if (dateTimeN2 == null) {
                    dateTimeN2 = DateTime.now();
                    dateTimeN2.getClass();
                }
                float minutes = Minutes.minutesBetween(dateTimeN, dateTimeN2).getMinutes();
                Entry entry2 = new Entry(minutes, num2 != null ? num2.intValue() : 0.0f, new l(this.f179441b.a(minutes), pq1.d.b(num2 != null ? num2.intValue() : i16), this.f179443d, null, null, Integer.valueOf(R.color.gcm_chart_steps_data_set), null, null, 216, null));
                if (iIntValue > 0) {
                    if ((num2 != null ? num2.intValue() : -1) >= iIntValue && !this.f179445f) {
                        Entry entry3 = (Entry) h0.n0(arrayList2);
                        this.f179445f = true;
                        LayerDrawable layerDrawable = this.f179444e;
                        if (entry3 == null) {
                            entry = new Entry(entry2.getX(), iIntValue, (Drawable) layerDrawable);
                        } else {
                            float y14 = entry3.getY();
                            float f15 = iIntValue;
                            entry = new Entry(entry3.getX() + (((f15 - y14) * (entry2.getX() - entry3.getX())) / (entry2.getY() - y14)), f15, (Drawable) layerDrawable);
                        }
                        LineDataSet lineDataSet2 = new LineDataSet(w.c(entry), "");
                        lineDataSet2.setDrawValues(false);
                        lineDataSet2.setDrawCircleHole(false);
                        lineDataSet2.setDrawCircles(false);
                        lineDataSet2.setDrawIcons(true);
                        lineDataSet2.setHighlightEnabled(false);
                        this.f179446g = lineDataSet2;
                    }
                }
                arrayList2.add(entry2);
                i16 = 0;
            }
            float fMin = 1.0f;
            if (arrayList2.isEmpty()) {
                lineDataSet = null;
                i15 = 0;
            } else {
                lineDataSet = new LineDataSet(arrayList2, "");
                i15 = 0;
                lineDataSet.setDrawValues(false);
                lineDataSet.setDrawCircleHole(false);
                lineDataSet.setDrawCircles(false);
                lineDataSet.setDrawFilled(true);
                lineDataSet.setDrawHorizontalHighlightIndicator(false);
                Context context = this.f179440a;
                lineDataSet.setHighLightColor(context.getColor(R.color.gcm_chart_highlight_line));
                lineDataSet.setHighlightLineWidth(1.0f);
                lineDataSet.setHighlightEnabled(!listSubList2.isEmpty());
                lineDataSet.setColor(context.getColor(i14));
                lineDataSet.setLineWidth(2.0f);
            }
            if (lineDataSet != null) {
                Integer num3 = ((jq1.f) h0.m0(listSubList)).f100004c;
                float fX = x(gVar2);
                if (fX > f14) {
                    fMin = (Math.min(num3 != null ? num3.intValue() : fX, fX) - f14) / (fX - f14);
                }
                e eVar = new e(this, fMin);
                PaintDrawable paintDrawable = new PaintDrawable();
                paintDrawable.setShape(new RectShape());
                paintDrawable.setShaderFactory(eVar);
                lineDataSet.setFillDrawable(paintDrawable);
                arrayList.add(lineDataSet);
                entryCount += lineDataSet.getEntryCount();
            } else {
                entryCount++;
            }
            i16 = i15;
        }
        LineDataSet lineDataSet3 = this.f179446g;
        if (lineDataSet3 != null) {
            arrayList.add(lineDataSet3);
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(g gVar) {
        return Integer.valueOf(MathKt.c(1440.0f));
    }

    @Override // qz.c
    public final boolean d(g gVar) {
        jq1.b bVar;
        jq1.b bVar2;
        g gVar2 = gVar;
        Integer num = null;
        if (((gVar2 == null || (bVar2 = gVar2.f100009a) == null) ? null : bVar2.f99981c) != null) {
            return false;
        }
        if (gVar2 != null && (bVar = gVar2.f100009a) != null) {
            num = bVar.f99984f;
        }
        return num == null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(g gVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final List f(g gVar) {
        jq1.b bVar;
        g gVar2 = gVar;
        Integer num = (gVar2 == null || (bVar = gVar2.f100009a) == null) ? null : bVar.f99984f;
        if (num == null || num.intValue() <= 0) {
            return null;
        }
        LimitLine limitLine = new LimitLine(num.intValue());
        limitLine.setLineWidth(2.0f);
        limitLine.setLineColor(this.f179440a.getColor(R.color.gcm_chart_steps_data_set));
        limitLine.enableDashedLine(10.0f, 10.0f, 0.0f);
        return w.c(limitLine);
    }

    @Override // qz.c
    public final List g(g gVar) {
        g gVar2 = gVar;
        return m.g(this.f179440a, gVar2 != null ? gVar2.f100011c : null, new b1(4));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float i(g gVar) {
        return x(gVar);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(g gVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(g gVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(g gVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(g gVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float q(g gVar) {
        return 1440.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(g gVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(g gVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final List u(g gVar) {
        g gVar2 = gVar;
        jq1.b bVar = gVar2 != null ? gVar2.f100009a : null;
        Integer num = bVar != null ? bVar.f99984f : null;
        return (num == null || num.intValue() <= 0) ? j0.f134944a : x.d(new xz.f(this.f179442c.getString(R.string.lbl_goal), null, Integer.valueOf(this.f179440a.getColor(R.color.gcm_chart_steps_data_set)), null, new xz.g.c(0, 0.0f, 3, null), null, null, 106, null));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(g gVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(g gVar) {
        return 0.0f;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lvq1/d$a;", "", "<init>", "()V", "", "CHART_GRID_LINE_WIDTH", "F", "DEFAULT_Y_LABEL_VALUE", "", "NO_DATA", "I", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
