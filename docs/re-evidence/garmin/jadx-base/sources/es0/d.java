package es0;

import android.content.Context;
import android.view.MotionEvent;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.utils.ViewPortHandler;
import j23.l;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.w;
import p13.x;
import p13.y;
import yr0.m;
import zz.j;
import zz.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Les0/d;", "Lqz/e;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lkotlin/Function0;", "", "onUserGestureEnd", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Le23/a;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements qz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarLineChartBase<?> f65186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b00.h f65187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f65188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f65189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ks0.c f65190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f65191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f65192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f65193h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"es0/d$a", "Lb00/f;", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends b00.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f65194a;

        public a(e23.a<Unit> aVar) {
            this.f65194a = aVar;
        }

        @Override // b00.f, com.github.mikephil.charting.listener.OnChartGestureListener
        public final void onChartGestureEnd(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            this.f65194a.invoke();
        }
    }

    public d(BarLineChartBase<?> barLineChartBase, e23.a<Unit> aVar) {
        barLineChartBase.getClass();
        aVar.getClass();
        this.f65186a = barLineChartBase;
        Context context = barLineChartBase.getContext();
        context.getClass();
        g gVar = new g(context);
        this.f65187b = new b00.h(barLineChartBase, null, new a(aVar), 2, null);
        ViewPortHandler viewPortHandler = barLineChartBase.getViewPortHandler();
        viewPortHandler.getClass();
        this.f65188c = new c(viewPortHandler, gVar);
        this.f65189d = gVar;
        Context context2 = barLineChartBase.getContext();
        context2.getClass();
        this.f65190e = new ks0.c(context2);
        this.f65191f = new ArrayList();
        String string = barLineChartBase.getContext().getString(R.string.lbl_guidance);
        string.getClass();
        this.f65192g = string;
        String string2 = barLineChartBase.getContext().getString(R.string.lbl_none);
        string2.getClass();
        this.f65193h = string2;
    }

    @Override // qz.e
    public final MarkerView b() {
        return this.f65189d;
    }

    @Override // qz.e
    public final j c() {
        return this.f65188c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz.e
    public final Entry d(Highlight highlight) throws ParseException {
        highlight.getClass();
        Entry entryForHighlight = ((BarLineScatterCandleBubbleData) this.f65186a.getData()).getEntryForHighlight(highlight);
        float x14 = highlight.getX();
        int i14 = ks0.c.f106381g;
        String strD = this.f65190e.d(true, false, x14);
        int x15 = (int) highlight.getX();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f65191f) {
            if (((l) ((p) obj).f128594a).d(x15)) {
                arrayList.add(obj);
            }
        }
        List listS0 = h0.S0(h0.N0(arrayList, new e()), 2);
        ArrayList arrayList2 = new ArrayList(y.r(listS0, 10));
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            arrayList2.add((m) ((p) it.next()).f128595b);
        }
        int size = arrayList2.size();
        if (size == 0) {
            entryForHighlight.setData(w.c(h(strD, null)));
            return entryForHighlight;
        }
        if (size == 1) {
            entryForHighlight.setData(w.c(h(strD, (m) arrayList2.get(0))));
            return entryForHighlight;
        }
        if (size != 2) {
            entryForHighlight.setData(j0.f134944a);
            return entryForHighlight;
        }
        entryForHighlight.setData(x.k(h(strD, (m) arrayList2.get(0)), h(strD, (m) arrayList2.get(1))));
        return entryForHighlight;
    }

    @Override // qz.e
    public final k e() {
        return null;
    }

    @Override // qz.e
    /* JADX INFO: renamed from: f */
    public final b00.b getF78912c() {
        return this.f65187b;
    }

    public final zz.l h(String str, m mVar) {
        if (mVar == null) {
            return new zz.l(str, this.f65193h, this.f65192g, null, null, null, null, null, 248, null);
        }
        String strF = this.f65190e.f(mVar);
        if (mVar == m.LIGHT_AVOIDANCE) {
            return new zz.l(str, strF, this.f65192g, null, null, null, Integer.valueOf(R.drawable.gcm_jet_lag_avoid_light), null, SyslogConstants.LOG_LOCAL7, null);
        }
        return new zz.l(str, strF, this.f65192g, null, null, null, Integer.valueOf(R.drawable.gcm_chart_metric_bullet), Integer.valueOf(ks0.c.e(mVar)), 56, null);
    }
}
