package iy0;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import i3.e5;
import java.util.List;
import o4.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import zz.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Liy0/q;", "Lqz/e;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;)V", "a", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f95818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f95819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m00.a f95820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yz.j f95821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b00.e f95822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f95823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zz.g f95824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zz.q f95825h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.l<MotionEvent, Unit> {
        public b(Object obj) {
            super(1, obj, pz.d.class, "toggleDoubleHighlight", "toggleDoubleHighlight(Lcom/github/mikephil/charting/charts/BarLineChartBase;Landroid/view/MotionEvent;)V", 1);
        }

        @Override // e23.l
        public final Unit invoke(MotionEvent motionEvent) {
            pz.d.g((BarLineChartBase) this.receiver, motionEvent);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public q(BarLineChartBase<?> barLineChartBase) {
        barLineChartBase.getClass();
        this.f95818a = barLineChartBase;
        Context context = barLineChartBase.getContext();
        this.f95819b = context;
        context.getClass();
        this.f95820c = new m00.a(context, null, 2, null);
        this.f95821d = new yz.j();
        this.f95822e = new b00.e(barLineChartBase, new b(barLineChartBase), null, 4, null);
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        viewPortHandler.getClass();
        this.f95823f = new v(viewPortHandler, 0.0f, 2, null);
        ViewPortHandler viewPortHandler2 = barLineChartBase.getViewPortHandler();
        viewPortHandler2.getClass();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        gl.c.f77766a.getClass();
        paint.setColor(f0.j(gl.c.f77767b.f77769a));
        paint.setAlpha(128);
        paint.setPathEffect(null);
        Unit unit = Unit.INSTANCE;
        this.f95824g = new zz.g(viewPortHandler2, paint);
        this.f95825h = new zz.q(context, 0, null, 6, null);
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f95825h;
    }

    @Override // qz.e
    public final zz.j c() {
        return this.f95823f;
    }

    @Override // qz.e
    public final Entry d(Highlight highlight) {
        highlight.getClass();
        String strA = this.f95820c.a(Double.valueOf(((BarLineScatterCandleBubbleData) this.f95818a.getData()).getEntryForHighlight(highlight).getY()), true);
        String formattedValue = this.f95821d.getFormattedValue(highlight.getX());
        Entry entry = new Entry();
        entry.setData(new zz.l(formattedValue, strA, this.f95819b.getString(R.string.activity_details_elevation), null, null, Integer.valueOf(R.color.gds_data_viz_green_primary), null, null, 216, null));
        return entry;
    }

    @Override // qz.e
    public final zz.k e() {
        return this.f95824g;
    }

    @Override // qz.e
    /* JADX INFO: renamed from: f */
    public final b00.b getF69177c() {
        return this.f95822e;
    }

    @Override // qz.e
    public final Entry g(Highlight[] highlightArr) {
        highlightArr.getClass();
        if (highlightArr.length != 2) {
            return new Entry();
        }
        List listK = highlightArr[0].getX() < highlightArr[1].getX() ? x.k(highlightArr[0], highlightArr[1]) : x.k(highlightArr[1], highlightArr[0]);
        Highlight highlight = (Highlight) listK.get(0);
        Highlight highlight2 = (Highlight) listK.get(1);
        BarLineChartBase<?> barLineChartBase = this.f95818a;
        String strA = this.f95820c.a(Double.valueOf((((double) ((BarLineScatterCandleBubbleData) barLineChartBase.getData()).getEntryForHighlight(highlight).getY()) + ((double) ((BarLineScatterCandleBubbleData) barLineChartBase.getData()).getEntryForHighlight(highlight2).getY())) / ((double) 2)), true);
        float x14 = highlight.getX();
        yz.j jVar = this.f95821d;
        String strG = e5.g(jVar.getFormattedValue(x14), " - ", jVar.getFormattedValue(highlight2.getX()));
        Entry entry = new Entry();
        Context context = this.f95819b;
        entry.setData(new zz.l(strG, strA, context.getString(R.string.string_space_string_pattern, context.getString(R.string.common_avg), context.getString(R.string.activity_details_elevation)), null, null, Integer.valueOf(R.color.gds_data_viz_green_primary), null, null, 216, null));
        return entry;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Liy0/q$a;", "", "<init>", "()V", "", "HIGHLIGHT_OVERLAY_ALPHA", "I", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
