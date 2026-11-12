package com.huawei.ui.main.stories.fitness.views.heartrate;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import defpackage.njy;
import defpackage.qmj;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class DayHeartRateDoubleViewHorizontalDataObserverView extends MultiViewHorizontalDataObserverView {
    private Paint f;
    private List<qmj> i;
    private List<qmj> k;
    private float n;

    public DayHeartRateDoubleViewHorizontalDataObserverView(Context context) {
        super(context);
        this.n = 0.0f;
        this.f = new Paint();
        this.k = new ArrayList(10);
        this.i = new ArrayList(10);
    }

    public DayHeartRateDoubleViewHorizontalDataObserverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = 0.0f;
        this.f = new Paint();
        this.k = new ArrayList(10);
        this.i = new ArrayList(10);
    }

    public DayHeartRateDoubleViewHorizontalDataObserverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = 0.0f;
        this.f = new Paint();
        this.k = new ArrayList(10);
        this.i = new ArrayList(10);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.heartrate.MultiViewHorizontalDataObserverView
    protected MultiViewHorizontalDataObserverView.f a(List<ScrollChartHorizontalObserverHRView> list) {
        return new b(list);
    }

    class b extends MultiViewHorizontalDataObserverView.f {
        b(List<? extends View> list) {
            super(list);
        }

        @Override // com.huawei.ui.main.stories.fitness.views.heartrate.MultiViewHorizontalDataObserverView.f
        public void a() {
            if (d()) {
                return;
            }
            if (!DayHeartRateDoubleViewHorizontalDataObserverView.this.c(HwHealthChartHolder.LAYER_ID_REST_HR)) {
                if (!DayHeartRateDoubleViewHorizontalDataObserverView.this.c(HwHealthChartHolder.LAYER_ID_WARNING_HR)) {
                    if (DayHeartRateDoubleViewHorizontalDataObserverView.this.c(HwHealthChartHolder.LAYER_ID_BRADYCARDIA)) {
                        DayHeartRateDoubleViewHorizontalDataObserverView.this.f27294a.disableFocusArea();
                        b();
                        return;
                    } else {
                        super.a();
                        return;
                    }
                }
                DayHeartRateDoubleViewHorizontalDataObserverView.this.f27294a.disableFocusArea();
                b();
                return;
            }
            DayHeartRateDoubleViewHorizontalDataObserverView.this.f27294a.disableManualReferenceLine();
            b();
        }

        @Override // com.huawei.ui.main.stories.fitness.views.heartrate.MultiViewHorizontalDataObserverView.f
        public void e(int i) throws MultiViewHorizontalDataObserverView.e {
            if (njy.e(DayHeartRateDoubleViewHorizontalDataObserverView.this.h, i)) {
                return;
            }
            HwHealthChartHolder.c cVar = DayHeartRateDoubleViewHorizontalDataObserverView.this.h.get(i);
            if (HwHealthChartHolder.LAYER_ID_REST_HR.equals(cVar.a())) {
                DayHeartRateDoubleViewHorizontalDataObserverView.this.j.c(true);
                DayHeartRateDoubleViewHorizontalDataObserverView.this.j.a(new MultiViewHorizontalDataObserverView.d.a(null, cVar));
                DayHeartRateDoubleViewHorizontalDataObserverView.this.f27294a.setMarkerTimeShowFlag(false);
                DayHeartRateDoubleViewHorizontalDataObserverView.this.e();
                return;
            }
            DayHeartRateDoubleViewHorizontalDataObserverView.this.f27294a.setMarkerTimeShowFlag(true);
            if (HwHealthChartHolder.LAYER_ID_WARNING_HR.equals(cVar.a())) {
                DayHeartRateDoubleViewHorizontalDataObserverView.this.j.c(true);
                DayHeartRateDoubleViewHorizontalDataObserverView.this.j.a(new MultiViewHorizontalDataObserverView.d.a(null, cVar));
                DayHeartRateDoubleViewHorizontalDataObserverView.this.d();
            } else {
                if (HwHealthChartHolder.LAYER_ID_BRADYCARDIA.equals(cVar.a())) {
                    DayHeartRateDoubleViewHorizontalDataObserverView.this.j.c(true);
                    DayHeartRateDoubleViewHorizontalDataObserverView.this.j.a(new MultiViewHorizontalDataObserverView.d.a(null, cVar));
                    DayHeartRateDoubleViewHorizontalDataObserverView.this.a();
                    return;
                }
                super.e(i);
            }
        }

        @Override // com.huawei.ui.main.stories.fitness.views.heartrate.MultiViewHorizontalDataObserverView.f
        public void e() {
            DayHeartRateDoubleViewHorizontalDataObserverView.this.f.setStrokeWidth(qrs.d(BaseApplication.getContext(), 2.0f));
            DayHeartRateDoubleViewHorizontalDataObserverView.this.f.setColor(Color.argb(255, 252, 49, 89));
            DayHeartRateDoubleViewHorizontalDataObserverView.this.f.setStyle(Paint.Style.STROKE);
            for (HwHealthChartHolder.c cVar : DayHeartRateDoubleViewHorizontalDataObserverView.this.h) {
                if (cVar != null && HwHealthChartHolder.LAYER_ID_REST_HR.equals(cVar.a())) {
                    HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSetFakeDataLayer = DayHeartRateDoubleViewHorizontalDataObserverView.this.f27294a.fakeDataLayer(cVar);
                    b(cVar, hwHealthBaseBarLineDataSetFakeDataLayer);
                    DayHeartRateDoubleViewHorizontalDataObserverView.this.e.put(cVar, hwHealthBaseBarLineDataSetFakeDataLayer);
                } else if (cVar != null && HwHealthChartHolder.LAYER_ID_WARNING_HR.equals(cVar.a())) {
                    HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSetFakeDataLayer2 = DayHeartRateDoubleViewHorizontalDataObserverView.this.f27294a.fakeDataLayer(cVar);
                    b(cVar, hwHealthBaseBarLineDataSetFakeDataLayer2);
                    DayHeartRateDoubleViewHorizontalDataObserverView.this.e.put(cVar, hwHealthBaseBarLineDataSetFakeDataLayer2);
                } else if (cVar != null && HwHealthChartHolder.LAYER_ID_BRADYCARDIA.equals(cVar.a())) {
                    HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSetFakeDataLayer3 = DayHeartRateDoubleViewHorizontalDataObserverView.this.f27294a.fakeDataLayer(cVar);
                    b(cVar, hwHealthBaseBarLineDataSetFakeDataLayer3);
                    DayHeartRateDoubleViewHorizontalDataObserverView.this.e.put(cVar, hwHealthBaseBarLineDataSetFakeDataLayer3);
                }
            }
            for (View view : this.f27300a) {
                if (view instanceof ScrollChartHorizontalObserverRestHRView) {
                    DayHeartRateDoubleViewHorizontalDataObserverView.this.e((ScrollChartHorizontalObserverRestHRView) view);
                }
                if (view instanceof ScrollChartHorizontalObserverWarningHRView) {
                    DayHeartRateDoubleViewHorizontalDataObserverView.this.c((ScrollChartHorizontalObserverWarningHRView) view);
                }
                if (view instanceof ScrollChartHorizontalObserverBradycardiaAlarmView) {
                    DayHeartRateDoubleViewHorizontalDataObserverView.this.c((ScrollChartHorizontalObserverBradycardiaAlarmView) view);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        d(this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(ScrollChartHorizontalObserverRestHRView scrollChartHorizontalObserverRestHRView) {
        scrollChartHorizontalObserverRestHRView.setOnReferenceChangeListener(new ScrollChartHorizontalObserverRestHRView.OnReferenceChange() { // from class: umt
            @Override // com.huawei.ui.main.stories.fitness.views.heartrate.ScrollChartHorizontalObserverRestHRView.OnReferenceChange
            public final void onReferenceChange(float f) {
                this.f50372a.d(f);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ScrollChartHorizontalObserverWarningHRView scrollChartHorizontalObserverWarningHRView) {
        scrollChartHorizontalObserverWarningHRView.setOnFocusAreaChangeListener(new ScrollChartHorizontalObserverWarningHRView.OnFocusAreaChangeListener() { // from class: umq
            @Override // com.huawei.ui.main.stories.fitness.views.heartrate.ScrollChartHorizontalObserverWarningHRView.OnFocusAreaChangeListener
            public final void onFocusAreaChange(List list) {
                this.f50370c.e(list);
            }
        });
    }

    public /* synthetic */ void e(List list) {
        if (this.f27294a == null || !this.f27294a.isChartInNatureViewPosition()) {
            return;
        }
        b((List<qmj>) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ScrollChartHorizontalObserverBradycardiaAlarmView scrollChartHorizontalObserverBradycardiaAlarmView) {
        scrollChartHorizontalObserverBradycardiaAlarmView.setOnFocusAreaChangeListener(new ScrollChartHorizontalObserverBradycardiaAlarmView.OnFocusAreaChangeListener() { // from class: umo
            @Override // com.huawei.ui.main.stories.fitness.views.heartrate.ScrollChartHorizontalObserverBradycardiaAlarmView.OnFocusAreaChangeListener
            public final void onFocusAreaChange(List list) {
                this.f50368a.d(list);
            }
        });
    }

    public /* synthetic */ void d(List list) {
        if (this.f27294a == null || !this.f27294a.isChartInNatureViewPosition()) {
            return;
        }
        c((List<qmj>) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void d(float f) {
        this.n = f;
        if (this.j.e() && c(HwHealthChartHolder.LAYER_ID_REST_HR)) {
            if (this.n > 0.0f) {
                this.f27294a.enableManualReferenceLine(Math.round(this.n), this.f, true);
            } else {
                this.f27294a.enableManualReferenceLine(Integer.MIN_VALUE, this.f, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        b(this.k);
    }

    private void b(List<qmj> list) {
        List<qmj> list2 = this.k;
        if (list != list2) {
            list2.clear();
            this.k.addAll(list);
        }
        if (this.j.e() && c(HwHealthChartHolder.LAYER_ID_WARNING_HR)) {
            this.f27294a.focusArea(this.k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        c(this.i);
    }

    private void c(List<qmj> list) {
        List<qmj> list2 = this.i;
        if (list != list2) {
            list2.clear();
            this.i.addAll(list);
        }
        if (this.j.e() && c(HwHealthChartHolder.LAYER_ID_BRADYCARDIA)) {
            this.f27294a.focusArea(this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.j == null || TextUtils.isEmpty(str) || this.j.d() == null || this.j.d().b() == null) {
            return false;
        }
        return str.equals(this.j.d().b().a());
    }
}
