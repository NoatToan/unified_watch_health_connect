package com.huawei.ui.main.stories.fitness.views.heartrate;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.icommon.IStorageModelProvider;
import com.huawei.ui.commonui.linechart.icommon.LogicalUnit;
import com.huawei.ui.commonui.linechart.model.StorageGenericModel;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IFocusObserverItem;
import com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IScrollChartVisitor;
import defpackage.njy;
import defpackage.qmj;
import defpackage.qnh;
import defpackage.ueu;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class ScrollChartHorizontalObserverBradycardiaAlarmView extends ScrollChartHorizontalObserverHRView implements IFocusObserverItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IScrollChartVisitor f27301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f27302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnFocusAreaChangeListener f27303c;

    public interface OnFocusAreaChangeListener {
        void onFocusAreaChange(List<qmj> list);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IFocusObserverItem
    public View onCreateDetailView() {
        return null;
    }

    public ScrollChartHorizontalObserverBradycardiaAlarmView(Context context, ObserveredClassifiedView observeredClassifiedView, String str) {
        super(context, observeredClassifiedView, str);
        this.f27301a = null;
        this.f27303c = null;
        this.f27302b = new Handler(Looper.getMainLooper()) { // from class: com.huawei.ui.main.stories.fitness.views.heartrate.ScrollChartHorizontalObserverBradycardiaAlarmView.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message == null) {
                    return;
                }
                if (message.what == 1) {
                    ScrollChartHorizontalObserverBradycardiaAlarmView.this.b((HwHealthBaseScrollBarLineChart) message.obj);
                }
                super.handleMessage(message);
            }
        };
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.IScrollChartOuterObserver
    public void onRangeShow(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, int i, int i2) {
        if (this.f27302b.hasMessages(1)) {
            this.f27302b.removeMessages(1);
        }
        Message messageObtainMessage = this.f27302b.obtainMessage(1);
        messageObtainMessage.obj = hwHealthBaseScrollBarLineChart;
        this.f27302b.sendMessageDelayed(messageObtainMessage, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
        IScrollChartVisitor iScrollChartVisitor = this.f27301a;
        if (iScrollChartVisitor == null) {
            return;
        }
        iScrollChartVisitor.visitShowModels(hwHealthBaseScrollBarLineChart, HwHealthChartHolder.BRADYCARDIA_WARN, this.mHost.getStepDataType(), new LogicalUnit() { // from class: com.huawei.ui.main.stories.fitness.views.heartrate.ScrollChartHorizontalObserverBradycardiaAlarmView.5
            @Override // com.huawei.ui.commonui.linechart.icommon.LogicalUnit
            public float calculate(List<? extends HwHealthBaseEntry> list) {
                if (njy.e(list)) {
                    return 0.0f;
                }
                ScrollChartHorizontalObserverBradycardiaAlarmView.this.d(list);
                return 0.0f;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<? extends HwHealthBaseEntry> list) {
        if (this.f27303c == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<? extends HwHealthBaseEntry> it = list.iterator();
        while (it.hasNext()) {
            IStorageModel iStorageModelAcquireModel = ((IStorageModelProvider) ((HwHealthBaseEntry) it.next())).acquireModel();
            if (!(iStorageModelAcquireModel instanceof StorageGenericModel)) {
                LogUtil.d("ScrollChartHorizontalObserverBradycardiaAlarmView", "storageModel not instance of StorageGenericModel,logic error");
            } else {
                List<Object> listE = ((StorageGenericModel) iStorageModelAcquireModel).e("BRADYCARDIA_DETAIL");
                if (!njy.e(listE) && njy.b((Object) listE, ueu.class)) {
                    if (listE.size() != 1) {
                        LogUtil.d("ScrollChartHorizontalObserverBradycardiaAlarmView", "details on one pint size not zero,warning!!!");
                    } else {
                        ueu ueuVar = (ueu) listE.get(0);
                        qmj qmjVar = new qmj();
                        qmjVar.b(qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(ueuVar.getStartX())));
                        qmjVar.c(qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(ueuVar.getEndX())));
                        arrayList.add(qmjVar);
                    }
                }
            }
        }
        this.f27303c.onFocusAreaChange(arrayList);
    }

    public void setScrollChartVisitor(IScrollChartVisitor iScrollChartVisitor) {
        this.f27301a = iScrollChartVisitor;
    }

    public void setOnFocusAreaChangeListener(OnFocusAreaChangeListener onFocusAreaChangeListener) {
        this.f27303c = onFocusAreaChangeListener;
    }
}
