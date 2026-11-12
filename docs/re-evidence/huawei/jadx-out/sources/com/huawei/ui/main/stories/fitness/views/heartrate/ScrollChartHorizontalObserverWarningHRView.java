package com.huawei.ui.main.stories.fitness.views.heartrate;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
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
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class ScrollChartHorizontalObserverWarningHRView extends ScrollChartHorizontalObserverHRView implements IFocusObserverItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IScrollChartVisitor f27308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnFocusAreaChangeListener f27309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f27310c;

    public interface OnFocusAreaChangeListener {
        void onFocusAreaChange(List<qmj> list);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IFocusObserverItem
    public View onCreateDetailView() {
        return null;
    }

    public ScrollChartHorizontalObserverWarningHRView(Context context, ObserveredClassifiedView observeredClassifiedView, String str) {
        super(context, observeredClassifiedView, str);
        this.f27308a = null;
        this.f27309b = null;
        this.f27310c = new Handler(Looper.getMainLooper()) { // from class: com.huawei.ui.main.stories.fitness.views.heartrate.ScrollChartHorizontalObserverWarningHRView.3
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message == null) {
                    return;
                }
                if (message.what == 1 && (message.obj instanceof c)) {
                    ScrollChartHorizontalObserverWarningHRView.this.a(((c) message.obj).d());
                }
                super.handleMessage(message);
            }
        };
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.IScrollChartOuterObserver
    public void onRangeShow(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, int i, int i2) {
        if (this.f27310c.hasMessages(1)) {
            this.f27310c.removeMessages(1);
        }
        Message messageObtainMessage = this.f27310c.obtainMessage(1);
        messageObtainMessage.obj = new c(hwHealthBaseScrollBarLineChart);
        this.f27310c.sendMessageDelayed(messageObtainMessage, 300L);
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HwHealthBaseScrollBarLineChart f27312b;

        c(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
            this.f27312b = hwHealthBaseScrollBarLineChart;
        }

        public HwHealthBaseScrollBarLineChart d() {
            return this.f27312b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
        IScrollChartVisitor iScrollChartVisitor = this.f27308a;
        if (iScrollChartVisitor == null) {
            return;
        }
        iScrollChartVisitor.visitShowModels(hwHealthBaseScrollBarLineChart, HwHealthChartHolder.HIGH_WARN, this.mHost.getStepDataType(), new LogicalUnit() { // from class: umw
            @Override // com.huawei.ui.commonui.linechart.icommon.LogicalUnit
            public final float calculate(List list) {
                return this.f50374b.e(list);
            }
        });
    }

    public /* synthetic */ float e(List list) {
        if (njy.e(list)) {
            return 0.0f;
        }
        b(list);
        return 0.0f;
    }

    private void b(List<? extends HwHealthBaseEntry> list) {
        if (this.f27309b == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Parcelable parcelable : list) {
            if (parcelable instanceof IStorageModelProvider) {
                IStorageModel iStorageModelAcquireModel = ((IStorageModelProvider) parcelable).acquireModel();
                if (!(iStorageModelAcquireModel instanceof StorageGenericModel)) {
                    LogUtil.j("ScrollChartHorizontalObserverWarningHRView", "storageModel not instanceof StorageGenericModel,logic error");
                } else {
                    List<Object> listE = ((StorageGenericModel) iStorageModelAcquireModel).e("HR_WARNING_DETAIL");
                    if (!njy.e(listE) && njy.b((Object) listE, ueu.class)) {
                        if (listE.size() != 1) {
                            LogUtil.j("ScrollChartHorizontalObserverWarningHRView", "details on one pint size not zero,warning!!!");
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
        }
        this.f27309b.onFocusAreaChange(arrayList);
    }

    public void setOnFocusAreaChangeListener(OnFocusAreaChangeListener onFocusAreaChangeListener) {
        this.f27309b = onFocusAreaChangeListener;
    }

    public void setScrollChartVisitor(IScrollChartVisitor iScrollChartVisitor) {
        this.f27308a = iScrollChartVisitor;
    }
}
