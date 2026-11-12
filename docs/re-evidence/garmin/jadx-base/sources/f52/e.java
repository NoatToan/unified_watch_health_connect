package f52;

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
import f21.g0;
import gl1.y;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.Minutes;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.w;
import p13.x;
import yz.k;
import zx0.m;
import zz.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lf52/e;", "Lqz/c;", "Lz42/g;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lyz/k;", "timeFormatter", "Ld52/e;", "dataFormatter", "<init>", "(Landroid/content/Context;Lyz/k;Ld52/e;)V", "a", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements qz.c<z42.g, ILineDataSet> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f69181h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f69182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f69183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.a f69184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f69185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayerDrawable f69186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f69187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LineDataSet f69188g;

    static {
        new a(null);
    }

    public e(Context context, k kVar, d52.e eVar) {
        context.getClass();
        kVar.getClass();
        eVar.getClass();
        this.f69182a = context;
        this.f69183b = kVar;
        l22.a aVar = new l22.a(context);
        this.f69184c = aVar;
        this.f69185d = aVar.getString(R.string.lbl_pushes);
        Resources resources = context.getResources();
        resources.getClass();
        this.f69186e = r0.a(context, R.drawable.check, R.color.gcm_icon_background_goal_on_chart, R.color.gcm_icon_success, (int) xy2.b.n(resources, 2.0f), R.color.gcm_icon_success, r0.a.SMALL);
    }

    public static float x(z42.g gVar) {
        z42.b bVar;
        Integer pushesGoal;
        z42.f fVar;
        Integer pushes;
        List<z42.f> listA = gVar != null ? gVar.a() : null;
        int iIntValue = 0;
        int iIntValue2 = (listA == null || (fVar = (z42.f) h0.n0(listA)) == null || (pushes = fVar.getPushes()) == null) ? 0 : pushes.intValue();
        if (gVar != null && (bVar = gVar.f202396a) != null && (pushesGoal = bVar.getPushesGoal()) != null) {
            iIntValue = pushesGoal.intValue();
        }
        float fT = y.t(iIntValue2, iIntValue);
        if (listA == null || listA.isEmpty() || fT <= 0.0f) {
            return 10000.0f;
        }
        return fT;
    }

    @Override // qz.c
    public final List<ILineDataSet> a(z42.g gVar) throws ParseException {
        List<z42.f> listSubList;
        LineDataSet lineDataSet;
        int i14;
        Entry entry;
        z42.b bVar;
        Integer pushesGoal;
        z42.g gVar2 = gVar;
        if (gVar2 == null || (listSubList = gVar2.a()) == null) {
            listSubList = j0.f134944a;
        }
        int i15 = 0;
        int iIntValue = (gVar2 == null || (bVar = gVar2.f202396a) == null || (pushesGoal = bVar.getPushesGoal()) == null) ? 0 : pushesGoal.intValue();
        ArrayList arrayList = new ArrayList();
        listSubList.getClass();
        if (listSubList.size() > 96) {
            listSubList = listSubList.subList(0, 96);
        }
        int entryCount = 0;
        while (entryCount < listSubList.size()) {
            List<z42.f> listSubList2 = listSubList.subList(entryCount, listSubList.size());
            ArrayList arrayList2 = new ArrayList();
            for (z42.f fVar : listSubList2) {
                if (!fVar.j()) {
                    break;
                }
                float minutes = Minutes.minutesBetween(fVar.h(), fVar.d()).getMinutes();
                String strA = this.f69183b.a(minutes);
                Integer pushes = fVar.getPushes();
                l lVar = new l(strA, d52.e.b(pushes != null ? pushes.intValue() : i15), this.f69185d, null, null, Integer.valueOf(R.color.gcm_chart_steps_data_set), null, null, 216, null);
                Integer pushes2 = fVar.getPushes();
                Entry entry2 = new Entry(minutes, pushes2 != null ? pushes2.intValue() : 0.0f, lVar);
                if (iIntValue > 0) {
                    Integer pushes3 = fVar.getPushes();
                    if ((pushes3 != null ? pushes3.intValue() : -1) >= iIntValue && !this.f69187f) {
                        Entry entry3 = (Entry) h0.n0(arrayList2);
                        this.f69187f = true;
                        LayerDrawable layerDrawable = this.f69186e;
                        if (entry3 == null) {
                            entry = new Entry(entry2.getX(), iIntValue, (Drawable) layerDrawable);
                        } else {
                            float y14 = entry3.getY();
                            float f14 = iIntValue;
                            entry = new Entry(entry3.getX() + (((f14 - y14) * (entry2.getX() - entry3.getX())) / (entry2.getY() - y14)), f14, (Drawable) layerDrawable);
                        }
                        LineDataSet lineDataSet2 = new LineDataSet(w.c(entry), "");
                        lineDataSet2.setDrawValues(false);
                        lineDataSet2.setDrawCircleHole(false);
                        lineDataSet2.setDrawCircles(false);
                        lineDataSet2.setDrawIcons(true);
                        lineDataSet2.setHighlightEnabled(false);
                        this.f69188g = lineDataSet2;
                    }
                }
                arrayList2.add(entry2);
                i15 = 0;
            }
            if (arrayList2.isEmpty()) {
                lineDataSet = null;
                i14 = 0;
            } else {
                lineDataSet = new LineDataSet(arrayList2, "");
                i14 = 0;
                lineDataSet.setDrawValues(false);
                lineDataSet.setDrawCircleHole(false);
                lineDataSet.setDrawCircles(false);
                lineDataSet.setDrawFilled(true);
                lineDataSet.setDrawHorizontalHighlightIndicator(false);
                Context context = this.f69182a;
                lineDataSet.setHighLightColor(context.getColor(R.color.gcm_chart_highlight_line));
                lineDataSet.setHighlightLineWidth(1.0f);
                lineDataSet.setHighlightEnabled(!listSubList2.isEmpty());
                lineDataSet.setColor(context.getColor(R.color.gcm_chart_steps_data_set));
                lineDataSet.setLineWidth(2.0f);
            }
            if (lineDataSet != null) {
                Integer pushes4 = ((z42.f) h0.m0(listSubList)).getPushes();
                float fX = x(gVar2);
                f fVar2 = new f(this, fX > 0.0f ? (Math.min(pushes4 != null ? pushes4.intValue() : fX, fX) - 0.0f) / (fX - 0.0f) : 1.0f);
                PaintDrawable paintDrawable = new PaintDrawable();
                paintDrawable.setShape(new RectShape());
                paintDrawable.setShaderFactory(fVar2);
                lineDataSet.setFillDrawable(paintDrawable);
                arrayList.add(lineDataSet);
                entryCount += lineDataSet.getEntryCount();
            } else {
                entryCount++;
            }
            i15 = i14;
        }
        LineDataSet lineDataSet3 = this.f69188g;
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
    public final Integer c(z42.g gVar) {
        return Integer.valueOf(MathKt.c(1440.0f));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(z42.g gVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(z42.g gVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final List f(z42.g gVar) {
        z42.g gVar2 = gVar;
        z42.b bVar = gVar2 != null ? gVar2.f202396a : null;
        Integer pushesGoal = bVar != null ? bVar.getPushesGoal() : null;
        if ((bVar != null ? bVar.getPushes() : null) == null || pushesGoal == null || pushesGoal.intValue() <= 0) {
            return null;
        }
        LimitLine limitLine = new LimitLine(pushesGoal.intValue());
        limitLine.setLineWidth(2.0f);
        limitLine.setLineColor(this.f69182a.getColor(R.color.gcm_chart_steps_data_set));
        limitLine.enableDashedLine(10.0f, 10.0f, 0.0f);
        return w.c(limitLine);
    }

    @Override // qz.c
    public final List g(z42.g gVar) {
        z42.g gVar2 = gVar;
        return m.g(this.f69182a, gVar2 != null ? gVar2.f202398c : null, new g0(8));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float i(z42.g gVar) {
        return x(gVar);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(z42.g gVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(z42.g gVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(z42.g gVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(z42.g gVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float q(z42.g gVar) {
        return 1440.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(z42.g gVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(z42.g gVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final List u(z42.g gVar) {
        z42.g gVar2 = gVar;
        z42.b bVar = gVar2 != null ? gVar2.f202396a : null;
        return ((bVar != null ? bVar.getPushes() : null) == null || (bVar != null ? bVar.getPushesGoal() : null) == null) ? j0.f134944a : x.d(new xz.f(this.f69184c.getString(R.string.lbl_goal), null, Integer.valueOf(this.f69182a.getColor(R.color.gcm_chart_steps_data_set)), null, new xz.g.c(0, 0.0f, 3, null), null, null, 106, null));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(z42.g gVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(z42.g gVar) {
        return 0.0f;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lf52/e$a;", "", "<init>", "()V", "", "CHART_GRID_LINE_WIDTH", "F", "DEFAULT_Y_LABEL_VALUE", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
