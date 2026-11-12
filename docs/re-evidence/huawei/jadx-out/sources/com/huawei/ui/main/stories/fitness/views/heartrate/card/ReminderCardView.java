package com.huawei.ui.main.stories.fitness.views.heartrate.card;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.health.knit.api.ICustomCalculator;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.commonui.linechart.icommon.IStorageModelProvider;
import com.huawei.ui.commonui.linechart.icommon.LogicalUnit;
import com.huawei.ui.commonui.linechart.model.StorageGenericModel;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.heartrate.BradycardiaAlarmActivity;
import com.huawei.ui.main.stories.fitness.activity.heartrate.WarningHRActivity;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IFocusObserverItem;
import com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IScrollChartVisitor;
import com.huawei.ui.main.stories.fitness.views.heartrate.business.WarningHRDetailView;
import com.huawei.ui.main.stories.fitness.views.heartrate.card.ReminderCardView;
import defpackage.njy;
import defpackage.qmj;
import defpackage.qnh;
import defpackage.qre;
import defpackage.ueu;
import defpackage.ukb;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class ReminderCardView extends HeartRateCardView implements IFocusObserverItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DetailViewContainer f27322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DetailViewWithData f27323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f27324c;
    private DetailViewWithoutData d;
    private volatile boolean e;
    private ICustomCalculator f;
    private ICustomCalculator g;
    private String h;
    private OnFocusAreaChangeListener i;
    private boolean j;
    private IScrollChartVisitor l;
    private WeakReference<ReminderCardView> m;
    private String n;

    public interface OnFocusAreaChangeListener {
        void onFocusAreaChange(List<qmj> list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReminderCardView(Context context, ObserveredClassifiedView observeredClassifiedView, boolean z) {
        String strF;
        if (z) {
            strF = qre.f(R.string.IDS_low_heart_rate_reminder);
        } else {
            strF = qre.f(R.string.IDS_high_heart_rate_reminder);
        }
        super(context, observeredClassifiedView, strF, context.getString(R.string.IDS_main_watch_heart_rate_unit_string));
        this.j = false;
        this.f = null;
        this.g = null;
        this.l = null;
        this.i = null;
        this.e = false;
        this.f27324c = new Handler(Looper.getMainLooper()) { // from class: com.huawei.ui.main.stories.fitness.views.heartrate.card.ReminderCardView.5
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    ReminderCardView.this.b((HwHealthBaseScrollBarLineChart) message.obj);
                }
                super.handleMessage(message);
            }
        };
        this.j = z;
        if (z) {
            this.h = "BRADYCARDIA_DETAIL";
            this.n = HwHealthChartHolder.BRADYCARDIA_WARN;
        } else {
            this.h = "HR_WARNING_DETAIL";
            this.n = HwHealthChartHolder.HIGH_WARN;
        }
        this.f27322a = new DetailViewContainer(BaseApplication.getContext());
        this.f27323b = new DetailViewWithData(BaseApplication.getContext(), this.j);
        this.d = new DetailViewWithoutData(BaseApplication.getContext(), this.j);
        this.m = new WeakReference<>(this);
    }

    public boolean c() {
        return this.j;
    }

    public void setHashHistoryData(boolean z) {
        this.e = z;
        this.d.b(this.e);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView
    public void onRangeShow(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, int i, int i2) {
        c(hwHealthBaseScrollBarLineChart);
        if (this.f27324c.hasMessages(1)) {
            this.f27324c.removeMessages(1);
        }
        Message messageObtainMessage = this.f27324c.obtainMessage(1);
        messageObtainMessage.obj = hwHealthBaseScrollBarLineChart;
        this.f27324c.sendMessageDelayed(messageObtainMessage, 300L);
    }

    private void c(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
        ICustomCalculator iCustomCalculator = this.f;
        if (iCustomCalculator == null || this.g == null) {
            setContentText("--");
            return;
        }
        float fCalculate = iCustomCalculator.calculate(hwHealthBaseScrollBarLineChart, this.mHost.getStepDataType());
        float fCalculate2 = this.g.calculate(hwHealthBaseScrollBarLineChart, this.mHost.getStepDataType());
        if (fCalculate >= fCalculate2 && fCalculate2 > 0.0f) {
            setContentText(UnitUtil.e(fCalculate2, 1, 0) + Constants.LINK + UnitUtil.e(fCalculate, 1, 0));
            return;
        }
        setContentText("--");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart) {
        IScrollChartVisitor iScrollChartVisitor = this.l;
        if (iScrollChartVisitor == null) {
            return;
        }
        iScrollChartVisitor.visitShowModels(hwHealthBaseScrollBarLineChart, this.n, this.mHost.getStepDataType(), new LogicalUnit() { // from class: ums
            @Override // com.huawei.ui.commonui.linechart.icommon.LogicalUnit
            public final float calculate(List list) {
                return this.f50371a.a(list);
            }
        });
    }

    public /* synthetic */ float a(List list) {
        if (this.m.get() == null) {
            return 0.0f;
        }
        if (njy.e(list)) {
            this.f27323b.b((List<WarningHRDetailView.c>) null);
            this.f27322a.e(this.d);
            this.d.b(this.e);
            return 0.0f;
        }
        if (!(((HwHealthBaseEntry) list.get(0)) instanceof IStorageModelProvider)) {
            return 0.0f;
        }
        e(list);
        this.f27322a.e(this.f27323b);
        c((List<? extends HwHealthBaseEntry>) list);
        return 0.0f;
    }

    private void e(List<? extends HwHealthBaseEntry> list) {
        ArrayList arrayList = new ArrayList(16);
        Iterator<? extends HwHealthBaseEntry> it = list.iterator();
        while (it.hasNext()) {
            IStorageModel iStorageModelAcquireModel = ((IStorageModelProvider) ((HwHealthBaseEntry) it.next())).acquireModel();
            if (!(iStorageModelAcquireModel instanceof StorageGenericModel)) {
                throw new RuntimeException("storageModel not instance of StorageGenericModel,logic error");
            }
            List<Object> listE = ((StorageGenericModel) iStorageModelAcquireModel).e(this.h);
            if (listE == null) {
                LogUtil.a("HealthHeartRate_ReminderCardView", "loadExtensionView objects is null.");
            } else {
                for (Object obj : listE) {
                    if (obj instanceof ueu) {
                        ueu ueuVar = (ueu) obj;
                        WarningHRDetailView.c cVar = new WarningHRDetailView.c(getContext(), ueuVar.getStartX(), ueuVar.getEndX());
                        cVar.d(ueuVar.e());
                        cVar.c(ueuVar.c());
                        if (ueuVar.d() != null && ueuVar.d().size() > 0) {
                            cVar.e(ueuVar.d());
                        }
                        arrayList.add(cVar);
                    }
                }
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: umz
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ReminderCardView.e((WarningHRDetailView.c) obj2, (WarningHRDetailView.c) obj3);
            }
        });
        this.f27323b.b(arrayList);
    }

    public static /* synthetic */ int e(WarningHRDetailView.c cVar, WarningHRDetailView.c cVar2) {
        return cVar.queryModelStartTime() <= cVar2.queryModelStartTime() ? 1 : -1;
    }

    private void c(List<? extends HwHealthBaseEntry> list) {
        if (this.i != null) {
            ArrayList arrayList = new ArrayList(16);
            Iterator<? extends HwHealthBaseEntry> it = list.iterator();
            while (it.hasNext()) {
                IStorageModel iStorageModelAcquireModel = ((IStorageModelProvider) ((HwHealthBaseEntry) it.next())).acquireModel();
                if (!(iStorageModelAcquireModel instanceof StorageGenericModel)) {
                    throw new RuntimeException("storageModel not instance of StorageGenericModel,logic error");
                }
                List<Object> listE = ((StorageGenericModel) iStorageModelAcquireModel).e(this.h);
                if (!njy.e(listE) && njy.b((Object) listE, ueu.class)) {
                    if (listE.size() != 1) {
                        LogUtil.e("HealthHeartRate_ReminderCardView", "details on one pint size not zero,warning!!!");
                        return;
                    }
                    ueu ueuVar = (ueu) listE.get(0);
                    qmj qmjVar = new qmj();
                    qmjVar.b(qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(ueuVar.getStartX())));
                    qmjVar.c(qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(ueuVar.getEndX())));
                    arrayList.add(qmjVar);
                }
            }
            this.i.onFocusAreaChange(arrayList);
        }
    }

    public void a(ICustomCalculator iCustomCalculator) {
        this.f = iCustomCalculator;
    }

    public void c(ICustomCalculator iCustomCalculator) {
        this.g = iCustomCalculator;
    }

    public void d(IScrollChartVisitor iScrollChartVisitor) {
        this.l = iScrollChartVisitor;
    }

    public void setOnFocusAreaChangeListener(OnFocusAreaChangeListener onFocusAreaChangeListener) {
        this.i = onFocusAreaChangeListener;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IFocusObserverItem
    public View onCreateDetailView() {
        return this.f27322a;
    }

    static class DetailViewContainer extends LinearLayout {
        DetailViewContainer(Context context) {
            super(context);
        }

        public void e(View view) {
            removeAllViews();
            addView(view, -1, -1);
        }
    }

    public static class DetailViewWithoutData extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f27328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f27329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f27330c;
        private int d;
        private ConstraintLayout e;
        private HealthButton f;
        private int g;
        private HealthTextView h;
        private boolean i;
        private boolean j;
        private int k;
        private HealthTextView l;
        private int o;

        DetailViewWithoutData(Context context, boolean z) {
            super(context);
            this.f = null;
            this.j = false;
            this.i = z;
            if (z) {
                this.f27330c = R.string.IDS_resting_heart_rate_low_string;
                this.g = 0;
                this.o = R.string.IDS_resting_heart_rate_low_redirect_string;
                this.d = R.string.IDS_heart_rate_low_ecg_tips;
                this.k = R.string.IDS_heart_rate_low_tips;
            } else {
                this.f27330c = R.string.IDS_resting_heart_rate_high_string;
                this.g = 1;
                this.o = R.string.IDS_resting_heart_rate_high_redirect_string;
                this.d = R.string.IDS_heart_rate_high_ecg_tips;
                this.k = R.string.IDS_heart_rate_high_tips;
            }
            e();
        }

        private void e() {
            inflate(getContext(), R.layout.focus_view_detail_warning_hr_without_data, this);
            HealthButton healthButton = (HealthButton) findViewById(R.id.view_more_data);
            this.f = healthButton;
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: unb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.a(view);
                }
            });
            this.f27329b = getResources().getString(this.f27330c, 50, 100, 10);
            this.h = (HealthTextView) findViewById(R.id.text_rest_heart_rate_tips);
            this.f27328a = (HealthTextView) findViewById(R.id.text_ecg_measurement_reminder);
            this.e = (ConstraintLayout) findViewById(R.id.ecg_measurement_reminder_layout);
            this.l = (HealthTextView) findViewById(R.id.point1);
            this.f27328a.setVisibility(8);
            this.e.setVisibility(8);
            this.l.setVisibility(8);
            if (ukb.a() || !b()) {
                c();
            } else {
                d();
            }
        }

        public /* synthetic */ void a(View view) {
            if (this.i) {
                BradycardiaAlarmActivity.a(getContext());
            } else {
                WarningHRActivity.c(getContext());
            }
        }

        private boolean b() {
            return this.i ? ukb.b() : ukb.e();
        }

        private void h() {
            this.f27328a.setVisibility(0);
            this.e.setVisibility(0);
            this.l.setVisibility(0);
        }

        private void a() {
            this.f27328a.setVisibility(8);
            this.e.setVisibility(8);
            this.l.setVisibility(8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            if (this.h != null) {
                LogUtil.a("HealthHeartRate_ReminderCardView", "device disconnected or device not support heartRate unusuallyAlarm");
                this.h.setText(this.f27329b);
            } else {
                LogUtil.j("HealthHeartRate_ReminderCardView", "mHeartRateTipTextView is null");
            }
            a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            String string;
            LogUtil.a("HealthHeartRate_ReminderCardView", "DetailViewWithoutData device connect,prepare the redirection link");
            String string2 = getResources().getString(R.string.IDS_resting_heart_rate_redirect_setting_string);
            String string3 = getResources().getString(R.string.IDS_heart_rate_ecg_view);
            if (ukb.d()) {
                if (this.j) {
                    h();
                }
                string = getResources().getString(this.k, UnitUtil.e(50.0d, 1, 0), getResources().getQuantityString(R.plurals.IDS_heart_rate_times, 100, 100), getResources().getQuantityString(R.plurals.review_time_minute, 10, 10), string2);
                ukb.b(getResources().getString(this.d, string3), string3, this.f27328a, 0, ukb.h() ? 2 : 1);
            } else {
                string = getResources().getString(this.o, 50, 100, 10, string2);
                a();
            }
            ukb.b(string, string2, this.h, this.g, 0);
        }

        public void b(boolean z) {
            this.j = z;
            if (z) {
                this.f.setVisibility(0);
                if (ukb.d()) {
                    h();
                    return;
                } else {
                    a();
                    return;
                }
            }
            this.f.setVisibility(8);
            a();
            this.j = false;
        }
    }

    public void a() {
        ReminderCardView reminderCardView = this.m.get();
        if (reminderCardView == null) {
            return;
        }
        DetailViewWithData detailViewWithData = reminderCardView.f27323b;
        DetailViewWithoutData detailViewWithoutData = reminderCardView.d;
        detailViewWithData.b();
        detailViewWithoutData.c();
    }

    public void d() {
        ReminderCardView reminderCardView = this.m.get();
        if (reminderCardView == null) {
            return;
        }
        DetailViewWithData detailViewWithData = reminderCardView.f27323b;
        DetailViewWithoutData detailViewWithoutData = reminderCardView.d;
        detailViewWithData.d();
        detailViewWithoutData.d();
    }

    public static class DetailViewWithData extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f27325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f27326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f27327c;
        private LinearLayout d;
        private ConstraintLayout e;
        private ImageView f;
        private boolean g;
        private HealthTextView h;
        private boolean i;
        private LinearLayout j;
        private HealthTextView k;
        private int l;

        DetailViewWithData(Context context, boolean z) {
            super(context);
            this.i = false;
            this.g = z;
            if (z) {
                this.f27325a = R.string.IDS_resting_heart_rate_low_string;
                this.l = R.string.IDS_resting_heart_rate_low_redirect_string;
            } else {
                this.f27325a = R.string.IDS_resting_heart_rate_high_string;
                this.l = R.string.IDS_resting_heart_rate_high_redirect_string;
            }
            a();
        }

        private void a() {
            inflate(getContext(), R.layout.focus_view_detail_warning_hr, this);
            this.d = (LinearLayout) findViewById(R.id.warning_card_list_layout);
            this.j = (LinearLayout) findViewById(R.id.warning_more_layout);
            this.f = (ImageView) findViewById(R.id.image_view_detail);
            if (LanguageUtil.ba(getContext())) {
                this.f.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_left));
            } else {
                this.f.setBackground(getResources().getDrawable(R.drawable.common_ui_arrow_right));
            }
            this.j.setOnClickListener(new View.OnClickListener() { // from class: una
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.d(view);
                }
            });
            this.f27326b = qre.a(this.f27325a, 50, 100, 10);
            this.h = (HealthTextView) findViewById(R.id.text_rest_heart_rate_tips);
            this.f27327c = (HealthTextView) findViewById(R.id.text_ecg_measurement_reminder);
            this.e = (ConstraintLayout) findViewById(R.id.ecg_measurement_reminder_layout);
            this.k = (HealthTextView) findViewById(R.id.point1);
            this.f27327c.setVisibility(8);
            this.e.setVisibility(8);
            this.k.setVisibility(8);
            if (ukb.a() || !ukb.b()) {
                b();
            } else {
                d();
            }
        }

        public /* synthetic */ void d(View view) {
            if (this.g) {
                BradycardiaAlarmActivity.a(getContext());
            } else {
                WarningHRActivity.c(getContext());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (this.h != null) {
                LogUtil.a("HealthHeartRate_ReminderCardView", "device disconnected or device not support heartRate downAlarm");
                this.h.setText(this.f27326b);
            } else {
                LogUtil.j("HealthHeartRate_ReminderCardView", "mHeartRateTipTextView is null");
            }
            e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            String string;
            int i;
            int i2;
            LogUtil.a("HealthHeartRate_ReminderCardView", "DetailViewWithData device connect,prepare the redirection link");
            String string2 = getResources().getString(R.string.IDS_resting_heart_rate_redirect_setting_string);
            String string3 = getResources().getString(R.string.IDS_heart_rate_ecg_view);
            if (ukb.d()) {
                if (this.i) {
                    c();
                }
                String quantityString = getResources().getQuantityString(R.plurals.IDS_heart_rate_times, 100, 100);
                String quantityString2 = getResources().getQuantityString(R.plurals.IDS_hw_map_time_unit_value_minutes, 10, 10);
                if (this.g) {
                    i = R.string.IDS_heart_rate_low_tips;
                    i2 = R.string.IDS_heart_rate_low_ecg_tips;
                } else {
                    i = R.string.IDS_heart_rate_high_tips;
                    i2 = R.string.IDS_heart_rate_high_ecg_tips;
                }
                string = getResources().getString(i, UnitUtil.e(50.0d, 1, 0), quantityString, quantityString2, string2);
                ukb.b(getResources().getString(i2, string3), string3, this.f27327c, 0, ukb.h() ? 2 : 1);
            } else {
                string = getResources().getString(this.l, 50, 100, 10, string2);
                e();
            }
            ukb.b(string, string2, this.h, 1, 0);
        }

        public void b(List<WarningHRDetailView.c> list) {
            this.d.removeAllViews();
            if (list == null || list.size() == 0) {
                invalidate();
                return;
            }
            int i = 0;
            for (WarningHRDetailView.c cVar : list) {
                WarningHRDetailView warningHRDetailView = new WarningHRDetailView(getContext());
                warningHRDetailView.load(cVar);
                this.d.addView(warningHRDetailView, -1, -2);
                i++;
                if (i > 5) {
                    break;
                }
            }
            invalidate();
            if (ukb.d()) {
                c();
            } else {
                e();
            }
            this.i = true;
        }

        private void c() {
            this.f27327c.setVisibility(0);
            this.e.setVisibility(0);
            this.k.setVisibility(0);
        }

        private void e() {
            this.f27327c.setVisibility(8);
            this.e.setVisibility(8);
            this.k.setVisibility(8);
        }
    }
}
