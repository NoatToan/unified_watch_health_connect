package com.xiaomi.hm.health.training.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.calendar.ExpandableCalendar;
import com.xiaomi.hm.health.calendar.utils.CalendarDateUtils;
import com.xiaomi.hm.health.calendar.utils.DateBeanWrapper;
import com.xiaomi.hm.health.calendar.utils.DateSingleInstance;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourse;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItem;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.NewTrainingDb;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.ui.widget.TrainingCourseItemExpandableLayout;
import com.xiaomi.hm.health.training.ui.widget.UpDownTextItem;
import com.xiaomi.hm.health.training.utils.OtherUtils;
import com.xiaomi.hm.health.training.utils.TrainingCourseUtils;
import com.xiaomi.hm.health.traininglib.event.EventReqTrainingData;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import com.xiaomi.hm.health.traininglib.util.TrainingConfigManager;
import com.xiaomi.hm.health.traininglib.util.TrainingDBUtils;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import com.xiaomi.hm.health.traininglib.webapi.RequestTrainingAPI;
import de.greenrobot.event.EventBus;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes21.dex */
public class ViewTrainingCourseActivity extends BaseTitleActivity implements View.OnClickListener {
    private static TrainingCourse I = null;
    public static final String START_DATE = "startDate";
    private UpDownTextItem A;
    private TextView B;
    private TextView C;
    private ExpandableCalendar D;
    private LinearLayout E;
    private Date F;
    private LoadingDialog G;
    private SparseArray<Boolean> H = new SparseArray<>();
    private ImageView x;
    private UpDownTextItem y;
    private UpDownTextItem z;

    public class a implements Observer<Boolean> {
        public a() {
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean bool) {
            ViewTrainingCourseActivity.this.t();
            if (!bool.booleanValue()) {
                ViewTrainingCourseActivity.this.s(R.string.loading_error);
                return;
            }
            ViewTrainingCourseActivity.I.status = TrainingCourse.WAITING_PERIOD;
            EventBus.getDefault().post(ViewTrainingCourseActivity.I);
            TrainedCourseActivity.startActvity(ViewTrainingCourseActivity.this, ViewTrainingCourseActivity.I);
            ViewTrainingCourseActivity.this.finish();
        }

        @Override // rx.Observer
        public void onCompleted() {
            ViewTrainingCourseActivity.this.t();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
        }
    }

    public class b implements Func1<HMHttpResponseData, Boolean> {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object c(String str) {
            return "训练计划参加结果：" + str;
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean call(HMHttpResponseData hMHttpResponseData) {
            final String str = new String(hMHttpResponseData.getResponseBody());
            try {
                JSONObject jSONObject = new JSONObject(str);
                boolean z = Boolean.parseBoolean(hMHttpResponseData.getTag());
                if (hMHttpResponseData.isSuccess() && jSONObject.optBoolean("isSuccess") && z) {
                    TrainingDBUtils.addIntoTrainingCourse(ViewTrainingCourseActivity.I, true);
                    NewTrainingDb.INSTANCE.insertTrainingPlan(ViewTrainingCourseActivity.I);
                    return Boolean.TRUE;
                }
            } catch (Exception e) {
                Loggers.getLogger().w("Train-查看训练计划", e, new Supplier() { // from class: com.xiaomi.hm.health.training.ui.activity.c
                    @Override // com.xiaomi.hm.health.training.api.function.Supplier
                    public final Object get() {
                        return ViewTrainingCourseActivity.b.c(str);
                    }
                });
            }
            return Boolean.FALSE;
        }
    }

    public class c implements ExpandableCalendar.OnReminderClickListener {
        public c() {
        }

        @Override // com.xiaomi.hm.health.calendar.ExpandableCalendar.OnReminderClickListener
        public void onReminderClick() {
            TrainingNotifyActivity.startForResult(ViewTrainingCourseActivity.this);
        }
    }

    public class d implements TrainingCourseItemExpandableLayout.OnItemOperatorListener {
        public d() {
        }

        @Override // com.xiaomi.hm.health.training.ui.widget.TrainingCourseItemExpandableLayout.OnItemOperatorListener
        public void onItemClosed(int i) {
            ViewTrainingCourseActivity.this.H.put(i, Boolean.FALSE);
        }

        @Override // com.xiaomi.hm.health.training.ui.widget.TrainingCourseItemExpandableLayout.OnItemOperatorListener
        public void onItemOpened(int i) {
            ViewTrainingCourseActivity.this.H.put(i, Boolean.TRUE);
            for (int i2 = 0; i2 < ViewTrainingCourseActivity.this.H.size(); i2++) {
                if (((Boolean) ViewTrainingCourseActivity.this.H.valueAt(i2)).booleanValue() && i2 != i) {
                    ((TrainingCourseItemExpandableLayout) ViewTrainingCourseActivity.this.E.getChildAt(ViewTrainingCourseActivity.this.H.keyAt(i2))).collapseItem();
                }
            }
        }
    }

    private void initView() {
        setTitleBarVisible(false);
        this.x = (ImageView) findViewById(R.id.imv_header);
        this.y = (UpDownTextItem) findViewById(R.id.udti_kcalorie);
        this.z = (UpDownTextItem) findViewById(R.id.udti_time);
        this.A = (UpDownTextItem) findViewById(R.id.udti_difficulity);
        this.y.setUpText(R.string.total_days);
        this.z.setUpText(R.string.day_average);
        this.A.setUpText(R.string.difficulity);
        this.B = (TextView) findViewById(R.id.tx_training_name);
        this.C = (TextView) findViewById(R.id.tx_subtitle_one);
        TextView textView = (TextView) findViewById(R.id.tx_subtitle_two);
        this.C.setVisibility(0);
        textView.setVisibility(0);
        this.E = (LinearLayout) findViewById(R.id.ll_training_list);
        findViewById(R.id.imv_back).setOnClickListener(this);
        findViewById(R.id.imv_share).setOnClickListener(this);
        findViewById(R.id.tx_join).setOnClickListener(this);
        ExpandableCalendar expandableCalendar = (ExpandableCalendar) findViewById(R.id.ecl_calendar);
        this.D = expandableCalendar;
        expandableCalendar.setCanItemClick(false);
        Date date = (Date) getIntent().getSerializableExtra("startDate");
        this.F = date;
        I.startDay = TrainingDateUtils.formatDate(date, TrainingDateUtils.PATTERN_YMD);
        u(I);
        r(I);
        TrainingAnalytics.event(this, TrainingAnalytics.EventId.TRAININGCOURSES_VIEWNUM);
    }

    private void q(TrainingCourseItem trainingCourseItem, boolean z) {
        TrainingCourseItemExpandableLayout trainingCourseItemExpandableLayout = new TrainingCourseItemExpandableLayout(this);
        trainingCourseItemExpandableLayout.setTrainingCourseItems(trainingCourseItem, z);
        trainingCourseItemExpandableLayout.setPosition(this.E.getChildCount());
        this.H.put(this.E.getChildCount(), Boolean.FALSE);
        this.E.addView(trainingCourseItemExpandableLayout);
        trainingCourseItemExpandableLayout.setOnItemOperatorListener(new d());
    }

    private void r(TrainingCourse trainingCourse) {
        List<DateBeanWrapper<TrainingCourseItem>> allCalenderDates = CalendarDateUtils.getAllCalenderDates(trainingCourse);
        if (allCalenderDates != null) {
            DateBeanWrapper<TrainingCourseItem> dateBeanWrapper = TrainingCourseUtils.getlastDay(allCalenderDates);
            for (DateBeanWrapper<TrainingCourseItem> dateBeanWrapper2 : allCalenderDates) {
                TrainingCourseItem extraData = dateBeanWrapper2.getExtraData();
                if (extraData != null && !dateBeanWrapper2.isWaitingDay()) {
                    q(extraData, dateBeanWrapper2.equals(dateBeanWrapper));
                }
            }
            DateBeanWrapper<TrainingCourseItem> firstDay = TrainingCourseUtils.getFirstDay(allCalenderDates);
            if (firstDay != null) {
                DateSingleInstance.getInstance().setChooseDate(firstDay.getDate());
            }
            this.D.setCreateValue(allCalenderDates, false);
            this.D.setOnReminderClickListener(new c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(int i) {
        LoadingDialog loadingDialog = this.G;
        if (loadingDialog != null) {
            loadingDialog.setFailed(getString(i), 1000, null);
        }
    }

    public static void startViewTrainingCourse(Context context, Date date, TrainingCourse trainingCourse, boolean z) {
        I = trainingCourse;
        Intent intent = new Intent(context, (Class<?>) ViewTrainingCourseActivity.class);
        intent.putExtra("startDate", date);
        intent.putExtra(FormulateCurriculumActivity.IS_REDO_COURSE, z);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        LoadingDialog loadingDialog = this.G;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
    }

    private void u(TrainingCourse trainingCourse) {
        OtherUtils.loadWithGlide(this, this.x, trainingCourse.detailsPageIllustrated);
        this.y.setDownText(String.valueOf(trainingCourse.totalDays));
        this.A.setDownText(TrainingCourseUtils.getDifficulityDegree(this, trainingCourse.difficultyDegree));
        int i = trainingCourse.trainingDays;
        this.z.setDownText(String.format(Locale.getDefault(), "%.0f", Double.valueOf(i > 0 ? Math.ceil((trainingCourse.time / ((double) i)) / 60000.0d) : 0.0d)));
        this.B.setText(trainingCourse.name);
        this.C.setText(trainingCourse.introduction);
    }

    private void v(int i) {
        if (this.G == null) {
            this.G = LoadingDialog.showDialog(this, getString(i));
        }
        this.G.setCancelable(false);
        this.G.setMessage(getString(i));
        this.G.show();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1900) {
            TrainingConfigManager.syncAlarmConfig();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.tx_join) {
            if (id == R.id.imv_back) {
                finish();
            }
        } else if (I != null) {
            TrainingAnalytics.event(this, TrainingAnalytics.EventId.ADDTRAININGCOURSES_OPERATE);
            v(R.string.loading);
            RequestTrainingAPI.reqTrainingPlans(I.trainingPlanId.longValue(), this.F);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_view_training_course);
        EventBus.getDefault().register(this);
        initView();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        I = null;
    }

    public void onEventMainThread(EventReqTrainingData eventReqTrainingData) {
        if (eventReqTrainingData.method == EventReqTrainingData.DATA_TRAINING_PLANS.method) {
            Object obj = eventReqTrainingData.respData;
            if (obj != null && eventReqTrainingData.resultFlag == 0) {
                Observable.just((HMHttpResponseData) obj).map(new b()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
            } else if (eventReqTrainingData.resultFlag == 2 && eventReqTrainingData.httpCancleType == 4) {
                s(R.string.net_not_work);
            } else {
                s(R.string.loading_error);
            }
        }
    }
}
