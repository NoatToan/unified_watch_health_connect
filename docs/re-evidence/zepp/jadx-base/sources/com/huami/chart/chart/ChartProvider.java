package com.huami.chart.chart;

import android.content.Context;
import com.huami.chart.chart.ChartProvider;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.util.Index;
import com.huami.tools.log.HMLog;
import defpackage.ec4;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class ChartProvider {
    private static final String b = "ChartProvider";
    private HMChart a;

    public static abstract class StatisChartProvider implements IChartProvider {
        @Override // com.huami.chart.chart.IChartProvider
        public Index getCurrentIndex() {
            return Index.INVALID_INDEX;
        }

        @Override // com.huami.chart.chart.IChartProvider
        public /* synthetic */ ChartDataList[] getMultiChartDataList() {
            return ec4.a(this);
        }

        @Override // com.huami.chart.chart.IChartProvider
        public /* synthetic */ ChartDataList[] getPointChartDataList() {
            return ec4.b(this);
        }

        @Override // com.huami.chart.chart.IChartProvider
        public boolean preAnim() {
            return false;
        }

        @Override // com.huami.chart.chart.IChartProvider
        public boolean refreshingAnim() {
            return false;
        }
    }

    public class a implements Runnable {
        public final /* synthetic */ IChartProvider a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;

        public a(IChartProvider iChartProvider, boolean z, boolean z2) {
            this.a = iChartProvider;
            this.b = z;
            this.c = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.getChartContainer() == null || this.a.getChartContainer().getVisibility() != 0) {
                return;
            }
            this.a.getChartContainer().removeAllViews();
            this.a.getChartContainer().addView(ChartProvider.this.a);
            ChartProvider.this.a.setInteractive(this.b, this.c, true);
            ChartProvider.this.a.refreshData(this.a);
            if (this.a.preAnim()) {
                ChartProvider.this.a.startPreAnim();
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ IChartProvider a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;

        public b(IChartProvider iChartProvider, boolean z, boolean z2) {
            this.a = iChartProvider;
            this.b = z;
            this.c = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.getChartContainer() == null || this.a.getChartContainer().getVisibility() != 0) {
                return;
            }
            this.a.getChartContainer().removeAllViews();
            this.a.getChartContainer().addView(ChartProvider.this.a);
            ChartProvider.this.a.setInteractive(this.b, this.c);
            ChartProvider.this.a.refreshData(this.a);
            if (this.a.preAnim()) {
                ChartProvider.this.a.startPreAnim();
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ IChartProvider a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;

        public c(IChartProvider iChartProvider, boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = iChartProvider;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.getChartContainer() == null || this.a.getChartContainer().getVisibility() != 0) {
                return;
            }
            this.a.getChartContainer().removeAllViews();
            this.a.getChartContainer().addView(ChartProvider.this.a);
            ChartProvider.this.a.setInteractive(this.b, this.c);
            ChartProvider.this.a.setAnchorCenter(this.d);
            ChartProvider.this.a.refreshData(this.a);
            ChartProvider.this.a.setEnableScale(this.e);
            if (this.a.preAnim()) {
                ChartProvider.this.a.startPreAnim();
            }
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ IChartProvider a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ boolean f;

        public d(IChartProvider iChartProvider, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.a = iChartProvider;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
            this.f = z5;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.getChartContainer() == null || this.a.getChartContainer().getVisibility() != 0) {
                return;
            }
            this.a.getChartContainer().removeAllViews();
            this.a.getChartContainer().addView(ChartProvider.this.a);
            ChartProvider.this.a.setInteractive(this.b, this.c);
            ChartProvider.this.a.setAnchorCenter(this.d);
            ChartProvider.this.a.refreshData(this.e, this.a);
            ChartProvider.this.a.setEnableScale(this.f);
            if (this.a.preAnim()) {
                ChartProvider.this.a.startPreAnim();
            }
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ IChartProvider a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;

        public e(IChartProvider iChartProvider, boolean z, boolean z2, boolean z3) {
            this.a = iChartProvider;
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.getChartContainer() == null || this.a.getChartContainer().getVisibility() != 0) {
                return;
            }
            this.a.getChartContainer().removeAllViews();
            this.a.getChartContainer().addView(ChartProvider.this.a);
            ChartProvider.this.a.setInteractive(this.b, this.c);
            ChartProvider.this.a.setAnchorCenter(this.d);
            ChartProvider.this.a.refreshData(this.a);
            if (this.a.preAnim()) {
                ChartProvider.this.a.startPreAnim();
            }
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ IChartProvider a;
        public final /* synthetic */ boolean b;

        public f(IChartProvider iChartProvider, boolean z) {
            this.a = iChartProvider;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.getChartContainer() == null || this.a.getChartContainer().getVisibility() != 0) {
                return;
            }
            this.a.getChartContainer().removeAllViews();
            this.a.getChartContainer().addView(ChartProvider.this.a);
            ChartProvider.this.a.refreshData(this.b, this.a);
            if (this.a.preAnim()) {
                ChartProvider.this.a.startPreAnim();
            }
        }
    }

    public class g implements Runnable {
        public final /* synthetic */ IChartProvider a;

        public g(IChartProvider iChartProvider) {
            this.a = iChartProvider;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.getChartContainer() == null || this.a.getChartContainer().getVisibility() != 0) {
                return;
            }
            this.a.getChartContainer().removeAllViews();
            this.a.getChartContainer().addView(ChartProvider.this.a);
            ChartProvider.this.a.refreshData(this.a);
            if (this.a.preAnim()) {
                ChartProvider.this.a.startPreAnim();
            }
        }
    }

    public ChartProvider(Context context) {
        this.a = new HMChart(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j() {
        return "createChart...";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k() {
        return "createChart...";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l() {
        return "createChart...";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m() {
        return "createChart...";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n() {
        return "createChart...";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o() {
        return "createChart...";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p() {
        return "createChart...";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q() {
        return "createChart...";
    }

    public void createAutoAdjustChart(IChartProvider iChartProvider, boolean z, boolean z2) {
        HMLog.verbose(b, new Function0() { // from class: tn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartProvider.j();
            }
        });
        iChartProvider.getChartContainer().post(new a(iChartProvider, z, z2));
    }

    public void createChart(IChartProvider iChartProvider, boolean z, boolean z2) {
        HMLog.verbose(b, new Function0() { // from class: un0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartProvider.k();
            }
        });
        iChartProvider.getChartContainer().post(new b(iChartProvider, z, z2));
    }

    public HMChart getChart() {
        HMChart hMChart = this.a;
        if (hMChart != null) {
            return hMChart;
        }
        throw new IllegalStateException("hmchart is null");
    }

    public void refreshChart(IChartProvider iChartProvider) {
        HMLog.verbose(b, new Function0() { // from class: vn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartProvider.q();
            }
        });
        if (this.a == null) {
            throw new IllegalStateException("Call createChart first");
        }
        if (iChartProvider.getChartContainer() == null || iChartProvider.getChartContainer().getVisibility() != 0) {
            return;
        }
        this.a.refreshData(iChartProvider);
        if (iChartProvider.refreshingAnim()) {
            this.a.startRefreshingAnim();
        }
    }

    public ChartProvider(Context context, boolean z) {
        HMChart hMChart = new HMChart(context);
        this.a = hMChart;
        hMChart.setIgnoreRTL(z);
    }

    public void createChart(IChartProvider iChartProvider, boolean z, boolean z2, boolean z3, boolean z4) {
        HMLog.verbose(b, new Function0() { // from class: pn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartProvider.l();
            }
        });
        iChartProvider.getChartContainer().post(new c(iChartProvider, z, z2, z3, z4));
    }

    public void createChart(IChartProvider iChartProvider, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        HMLog.verbose(b, new Function0() { // from class: wn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartProvider.m();
            }
        });
        iChartProvider.getChartContainer().post(new d(iChartProvider, z, z2, z3, z5, z4));
    }

    public void createChart(IChartProvider iChartProvider, boolean z, boolean z2, boolean z3) {
        HMLog.verbose(b, new Function0() { // from class: sn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartProvider.n();
            }
        });
        iChartProvider.getChartContainer().post(new e(iChartProvider, z, z2, z3));
    }

    public void createChart(IChartProvider iChartProvider, boolean z) {
        HMLog.verbose(b, new Function0() { // from class: qn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartProvider.o();
            }
        });
        iChartProvider.getChartContainer().post(new f(iChartProvider, z));
    }

    public void createChart(IChartProvider iChartProvider) {
        HMLog.verbose(b, new Function0() { // from class: rn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartProvider.p();
            }
        });
        iChartProvider.getChartContainer().post(new g(iChartProvider));
    }
}
