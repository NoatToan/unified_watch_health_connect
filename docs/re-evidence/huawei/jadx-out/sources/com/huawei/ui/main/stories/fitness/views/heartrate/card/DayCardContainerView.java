package com.huawei.ui.main.stories.fitness.views.heartrate.card;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView;
import defpackage.qmj;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class DayCardContainerView extends CardContainerView {
    private final List<qmj> g;
    private final Paint h;
    private final List<qmj> i;
    private float j;

    public DayCardContainerView(Context context, ObserveredClassifiedView observeredClassifiedView) {
        super(context, observeredClassifiedView);
        this.j = 0.0f;
        this.h = new Paint();
        this.i = new ArrayList(16);
        this.g = new ArrayList(16);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.heartrate.card.CardContainerView
    protected CardContainerView.e d(List<ScrollChartObserverView> list) {
        return new c(list);
    }

    class c extends CardContainerView.e {
        c(List<ScrollChartObserverView> list) {
            super(list);
        }

        @Override // com.huawei.ui.main.stories.fitness.views.heartrate.card.CardContainerView.e
        public void a() {
            if (!DayCardContainerView.this.f27317c.d || DayCardContainerView.this.f27317c.f27318c == null) {
                return;
            }
            CardContainerView.c.e eVar = DayCardContainerView.this.f27317c.f27318c;
            if (HwHealthChartHolder.LAYER_ID_REST_HR.equals(eVar.e.a())) {
                DayCardContainerView.this.mHost.disableManualReferenceLine();
                DayCardContainerView.this.f27317c.d = false;
                DayCardContainerView.this.f27317c.f27318c = null;
            } else if (HwHealthChartHolder.LAYER_ID_WARNING_HR.equals(eVar.e.a())) {
                DayCardContainerView.this.mHost.disableFocusArea();
                DayCardContainerView.this.f27317c.d = false;
                DayCardContainerView.this.f27317c.f27318c = null;
            } else {
                if (HwHealthChartHolder.LAYER_ID_BRADYCARDIA.equals(eVar.e.a())) {
                    DayCardContainerView.this.mHost.disableFocusArea();
                    DayCardContainerView.this.f27317c.d = false;
                    DayCardContainerView.this.f27317c.f27318c = null;
                    return;
                }
                super.a();
            }
        }

        @Override // com.huawei.ui.main.stories.fitness.views.heartrate.card.CardContainerView.e
        public void a(int i) throws CardContainerView.a {
            if (i < 0 || DayCardContainerView.this.f27316b.size() <= i) {
                return;
            }
            HwHealthChartHolder.c cVar = DayCardContainerView.this.f27316b.get(i);
            if (DayCardContainerView.this.mHost != null) {
                DayCardContainerView.this.mHost.selectDataLayerId(cVar.a());
            }
            if (!HwHealthChartHolder.LAYER_ID_REST_HR.equals(cVar.a())) {
                if (DayCardContainerView.this.mHost != null) {
                    DayCardContainerView.this.mHost.setMarkerTimeShowFlag(true);
                }
                if (HwHealthChartHolder.LAYER_ID_WARNING_HR.equals(cVar.a())) {
                    DayCardContainerView.this.f27317c.d = true;
                    DayCardContainerView.this.f27317c.f27318c = new CardContainerView.c.e(null, cVar);
                    if (DayCardContainerView.this.mHost.isChartInNatureViewPosition()) {
                        DayCardContainerView.this.c();
                        return;
                    }
                    return;
                }
                if (HwHealthChartHolder.LAYER_ID_BRADYCARDIA.equals(cVar.a())) {
                    DayCardContainerView.this.f27317c.d = true;
                    DayCardContainerView.this.f27317c.f27318c = new CardContainerView.c.e(null, cVar);
                    if (DayCardContainerView.this.mHost.isChartInNatureViewPosition()) {
                        DayCardContainerView.this.e();
                        return;
                    }
                    return;
                }
                super.a(i);
                return;
            }
            DayCardContainerView.this.f27317c.d = true;
            DayCardContainerView.this.f27317c.f27318c = new CardContainerView.c.e(null, cVar);
            if (DayCardContainerView.this.mHost != null) {
                DayCardContainerView.this.mHost.setMarkerTimeShowFlag(false);
            }
            DayCardContainerView.this.d();
        }

        @Override // com.huawei.ui.main.stories.fitness.views.heartrate.card.CardContainerView.e
        public void b() {
            DayCardContainerView.this.h.setStrokeWidth(qrs.d(BaseApplication.getContext(), 2.0f));
            DayCardContainerView.this.h.setColor(Color.argb(255, 252, 49, 89));
            DayCardContainerView.this.h.setStyle(Paint.Style.STROKE);
            for (HwHealthChartHolder.c cVar : DayCardContainerView.this.f27316b) {
                if (cVar != null && HwHealthChartHolder.LAYER_ID_REST_HR.equals(cVar.a())) {
                    HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSetFakeDataLayer = DayCardContainerView.this.mHost.fakeDataLayer(cVar);
                    d(cVar, hwHealthBaseBarLineDataSetFakeDataLayer);
                    DayCardContainerView.this.e.put(cVar, hwHealthBaseBarLineDataSetFakeDataLayer);
                } else if (cVar != null && HwHealthChartHolder.LAYER_ID_WARNING_HR.equals(cVar.a())) {
                    HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSetFakeDataLayer2 = DayCardContainerView.this.mHost.fakeDataLayer(cVar);
                    d(cVar, hwHealthBaseBarLineDataSetFakeDataLayer2);
                    DayCardContainerView.this.e.put(cVar, hwHealthBaseBarLineDataSetFakeDataLayer2);
                } else if (cVar != null && HwHealthChartHolder.LAYER_ID_BRADYCARDIA.equals(cVar.a())) {
                    HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSetFakeDataLayer3 = DayCardContainerView.this.mHost.fakeDataLayer(cVar);
                    d(cVar, hwHealthBaseBarLineDataSetFakeDataLayer3);
                    DayCardContainerView.this.e.put(cVar, hwHealthBaseBarLineDataSetFakeDataLayer3);
                }
            }
            for (ScrollChartObserverView scrollChartObserverView : this.f27321c) {
                if (scrollChartObserverView instanceof RestCardView) {
                    DayCardContainerView.this.d((RestCardView) scrollChartObserverView);
                } else if (scrollChartObserverView instanceof ReminderCardView) {
                    DayCardContainerView.this.d((ReminderCardView) scrollChartObserverView);
                } else {
                    LogUtil.a("DayCardContainerView", "view not instance of above.");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        d(this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(float f) {
        this.j = f;
        if (this.f27317c.d && HwHealthChartHolder.LAYER_ID_REST_HR.equals(this.f27317c.f27318c.e.a())) {
            if (this.j > 0.0f) {
                this.mHost.enableManualReferenceLine(Math.round(this.j), this.h, true);
            } else {
                this.mHost.enableManualReferenceLine(Integer.MIN_VALUE, this.h, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(RestCardView restCardView) {
        restCardView.setOnReferenceChangeListener(new RestCardView.OnReferenceChange() { // from class: com.huawei.ui.main.stories.fitness.views.heartrate.card.DayCardContainerView.3
            @Override // com.huawei.ui.main.stories.fitness.views.heartrate.card.RestCardView.OnReferenceChange
            public void onReferenceChange(float f) {
                DayCardContainerView.this.d(f);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final ReminderCardView reminderCardView) {
        reminderCardView.setOnFocusAreaChangeListener(new ReminderCardView.OnFocusAreaChangeListener() { // from class: umu
            @Override // com.huawei.ui.main.stories.fitness.views.heartrate.card.ReminderCardView.OnFocusAreaChangeListener
            public final void onFocusAreaChange(List list) {
                this.f50373b.d(reminderCardView, list);
            }
        });
    }

    public /* synthetic */ void d(ReminderCardView reminderCardView, List list) {
        if (this.mHost.isChartInNatureViewPosition()) {
            if (reminderCardView.c()) {
                c((List<qmj>) list);
            } else {
                b((List<qmj>) list);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        b(this.i);
    }

    private void b(List<qmj> list) {
        List<qmj> list2 = this.i;
        if (list != list2) {
            list2.clear();
            this.i.addAll(list);
        }
        if (this.f27317c.d && HwHealthChartHolder.LAYER_ID_WARNING_HR.equals(this.f27317c.f27318c.e.a())) {
            this.mHost.focusArea(this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        c(this.g);
    }

    private void c(List<qmj> list) {
        List<qmj> list2 = this.g;
        if (list != list2) {
            list2.clear();
            this.g.addAll(list);
        }
        if (this.f27317c.d && HwHealthChartHolder.LAYER_ID_BRADYCARDIA.equals(this.f27317c.f27318c.e.a())) {
            this.mHost.focusArea(this.g);
        }
    }
}
