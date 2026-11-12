package qm;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.d1;
import androidx.core.view.g1;
import androidx.core.view.s0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet;
import com.github.mikephil.chartingv2.listener.ChartTouchListener;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "4.71")
public class m extends p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u f145398l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f145399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public gz.c f145400n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ps2.d f145401o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f145402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f145403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f145404r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final po.g f145405t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f145406v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f145407w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public MotionEvent f145408x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f145409y;

    public class a implements gz.c.b {
        public a() {
        }

        @Override // gz.c.b
        public final void a(int i14) {
            double d14;
            int iRound;
            String str;
            String string;
            float fD;
            m mVar = m.this;
            u uVar = mVar.f145398l;
            Context context = mVar.f145425b;
            d dVar = mVar.f145399m;
            List<Entry> entriesAtIndex = uVar.getEntriesAtIndex(i14);
            if (entriesAtIndex != null) {
                boolean z14 = am.j.z(f12.l.f68084a);
                int size = entriesAtIndex.size();
                mVar.f145398l.highlightValues(size == 3 ? new Highlight[]{new Highlight(i14, 0), new Highlight(i14, 1), new Highlight(i14, 2)} : new Highlight[]{new Highlight(i14, 0), new Highlight(i14, 1)});
                float val = mVar.f145426c - entriesAtIndex.get(0).getVal();
                if (z14) {
                    iRound = Math.round(val);
                    d14 = 3.2808399d;
                } else {
                    d14 = 3.2808399d;
                    l3.f23124b.getClass();
                    iRound = Math.round((float) (((double) val) * 3.2808399d));
                }
                float val2 = mVar.f145426c - entriesAtIndex.get(1).getVal();
                if (!z14) {
                    l3.f23124b.getClass();
                    val2 = (float) (((double) val2) * d14);
                }
                int iRound2 = Math.round(val2);
                String string2 = context.getString(z14 ? R.string.lbl_meter : R.string.lbl_foot);
                String str2 = dVar.b(iRound) + StringUtils.SPACE + string2;
                String str3 = dVar.b(iRound2) + StringUtils.SPACE + string2;
                if (size == 3) {
                    float val3 = entriesAtIndex.get(2).getVal();
                    if (mVar.f145433j.getB1() == 3) {
                        string = context.getString(R.string.lbl_bpm);
                        float f14 = mVar.f145429f;
                        fD = (((mVar.f145428e - f14) / mVar.f145426c) * val3) + f14;
                    } else {
                        string = context.getString(z14 ? R.string.lbl_celsius : R.string.lbl_fahrenheit);
                        float f15 = mVar.f145431h;
                        fD = (((mVar.f145430g - f15) / mVar.f145426c) * val3) + f15;
                        if (!f12.l.a.a().y()) {
                            l3.f23124b.getClass();
                            fD = (float) l3.a.d(fD);
                        }
                    }
                    str = dVar.b((int) fD) + string;
                } else {
                    str = null;
                }
                String str4 = (String) mVar.f145434k.get(Integer.valueOf(((ILineDataSet) mVar.f145398l.getLineData().getDataSets().get(0)).getEntryIndex(entriesAtIndex.get(0))));
                boolean zIsEmpty = TextUtils.isEmpty(str4);
                gz.c cVar = mVar.f145400n;
                cVar.getClass();
                TextView textView = cVar.f80364i;
                if (textView != null) {
                    textView.setVisibility(!zIsEmpty ? 0 : 8);
                }
                if (!zIsEmpty) {
                    mVar.f145400n.setExtraMarkerLabelValue(context.getString(str4.contains("MANUAL") ? R.string.lbl_po2_manual_set_point : R.string.lbl_po2_auto_set_point));
                }
                mVar.f145400n.d(val2 > 0.0f);
                mVar.f145400n.setMarkerSecondChartValueColor(R.color.palette_ruby_3);
                dVar.getClass();
                l3.f23124b.getClass();
                mVar.f145400n.f(str2, str3, str, l3.a.s1(i14, "%1$d:%2$02d"));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // gz.c.b
        public final void b(int i14, int i15) {
            m mVar = m.this;
            if (mVar.f145401o == null) {
                mVar.f145401o = new ps2.d(this, 17);
            }
            i iVar = mVar.f145402p;
            u uVar = mVar.f145398l;
            float f14 = mVar.f145426c;
            ps2.d dVar = mVar.f145401o;
            iVar.getClass();
            new i.a((LineData) uVar.getData(), i14, i15, f14, dVar).c(new Void[0]);
        }
    }

    public class b extends lz.a {
        public b() {
        }

        @Override // lz.a, com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartDoubleTapped(MotionEvent motionEvent) {
            m mVar = m.this;
            if (mVar.f145403q) {
                mVar.f145403q = false;
                mVar.f145398l.fitScreen();
            } else {
                mVar.f145398l.zoom(2.0f, 1.0f, motionEvent.getX(), motionEvent.getY());
                mVar.f145403q = true;
            }
        }

        @Override // lz.a, com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartGestureEnd(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            m.f(m.this);
        }

        @Override // lz.a, com.github.mikephil.chartingv2.listener.OnChartGestureListener
        public final void onChartScale(MotionEvent motionEvent, float f14, float f15) {
            m.this.f145403q = true;
        }
    }

    public class c implements View.OnTouchListener {
        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view2, MotionEvent motionEvent) {
            m mVar = m.this;
            mVar.f145408x = motionEvent;
            po.g gVar = mVar.f145405t;
            Handler handler = mVar.f145404r;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 5 || actionMasked == 2) {
                handler.postDelayed(gVar, 500L);
            }
            if (actionMasked != 6 && actionMasked != 1) {
                return false;
            }
            handler.removeCallbacks(gVar);
            m.f(mVar);
            return false;
        }
    }

    public m(Context context, zm.p pVar, zm.p pVar2) {
        super(context, pVar, pVar2);
        this.f145399m = new d(this, 0);
        this.f145404r = new Handler();
        this.f145405t = new po.g(this, 7);
        this.f145406v = new a();
        this.f145407w = new b();
        this.f145409y = new c();
        this.f145402p = new i();
    }

    public static void f(m mVar) {
        mVar.f145398l.setDragEnabled(true);
        mVar.f145398l.setScaleEnabled(true);
        mVar.f145398l.setScaleYEnabled(false);
        mVar.f145398l.highlightValues(null);
        mVar.f145398l.setHighlightPerDragEnabled(false);
    }

    @Override // qm.p, zm.q
    public final View d(ViewGroup viewGroup) {
        Context context = this.f145425b;
        u uVar = new u(context);
        ps2.d dVar = new ps2.d(uVar, 15);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        s0.d.c(uVar, dVar);
        qc.c cVar = new qc.c(15);
        if (uVar.isAttachedToWindow()) {
            cVar.invoke(uVar);
        } else {
            uVar.addOnAttachStateChangeListener(new d1(uVar, cVar));
        }
        uVar.setBlockOverlay(true);
        this.f145398l = uVar;
        uVar.setBackgroundColor(a7.b.getColor(context, R.color.gcm3_transparent));
        uVar.getPaint(7).setColor(a7.b.getColor(context, R.color.gcm3_text_orange));
        int i14 = t.f145451a;
        uVar.setLayerType(1, null);
        uVar.getLegend().setEnabled(false);
        uVar.setTouchEnabled(true);
        uVar.setPinchZoom(true);
        uVar.setDoubleTapToZoomEnabled(true);
        uVar.setScaleYEnabled(false);
        uVar.setScaleXEnabled(true);
        uVar.setDescription(null);
        uVar.setDrawGridBackground(false);
        uVar.getAxisLeft().setDrawGridLines(false);
        uVar.getAxisRight().setDrawGridLines(false);
        uVar.setExtraBottomOffset(20.0f);
        u uVar2 = this.f145398l;
        c cVar2 = this.f145409y;
        uVar2.setOnTouchListener(cVar2);
        this.f145398l.setDoubleTapToZoomEnabled(false);
        e(uVar);
        this.f145398l.setTouchEnabled(true);
        gz.c cVar3 = new gz.c(context, R.layout.chart_hover_marker, this.f145399m);
        this.f145400n = cVar3;
        zm.p pVar = this.f145433j;
        boolean z14 = pVar != null;
        cVar3.f80366k = z14;
        cVar3.f80365j = this.f145406v;
        TextView textView = cVar3.f80362g;
        if (textView != null) {
            textView.setVisibility(z14 ? 0 : 8);
        }
        this.f145400n.setComputeDifference(false);
        this.f145398l.setMarkerView(this.f145400n);
        u uVar3 = this.f145398l;
        uVar3.setHighlighter(new kz.a(uVar3));
        this.f145398l.setHighlightPerDragEnabled(false);
        this.f145398l.setHighlightPerTapEnabled(false);
        this.f145398l.setOnChartGestureListener(this.f145407w);
        this.f145398l.setOnTouchListener(cVar2);
        this.f145398l.setDoubleTapToZoomEnabled(false);
        YAxis axisRight = this.f145398l.getAxisRight();
        if (this.f145398l.getLineData().getDataSetCount() != 3) {
            axisRight.setEnabled(false);
            return uVar;
        }
        axisRight.setEnabled(true);
        axisRight.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        ps2.d dVar2 = new ps2.d(this, 16);
        if (pVar.getB1() == 3) {
            axisRight.setTextColor(a7.b.getColor(context, R.color.gcm3_chart_fill_red));
        } else {
            axisRight.setTextColor(a7.b.getColor(context, R.color.gcm_chart_text_label));
        }
        axisRight.setValueFormatter(dVar2);
        return uVar;
    }

    public class d implements gz.f {
        public /* synthetic */ d(m mVar, int i14) {
            this(mVar);
        }

        @Override // gz.f
        public final String a(float f14, boolean z14) {
            return null;
        }

        @Override // gz.f
        public final String b(float f14) {
            return String.format(Locale.getDefault(), "%.0f", Float.valueOf(f14));
        }

        @Override // gz.f
        public final String c(int i14) {
            double d14 = i14;
            l3.f23124b.getClass();
            return l3.a.s1(d14, "%1$d:%2$02d");
        }

        private d(m mVar) {
        }
    }
}
