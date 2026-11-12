package com.xiaomi.hm.health.training.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourse;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.ui.fragment.DifficultyFragment;
import com.xiaomi.hm.health.training.ui.fragment.FitnessGoalFragment;
import com.xiaomi.hm.health.training.ui.fragment.StartDateFragment;
import com.xiaomi.hm.health.training.ui.helper.GlobalTitleStyleKt;
import com.xiaomi.hm.health.traininglib.event.EventReqTrainingData;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import com.xiaomi.hm.health.traininglib.util.TrainingDBUtils;
import com.xiaomi.hm.health.traininglib.webapi.RequestTrainingAPI;
import de.greenrobot.event.EventBus;
import java.util.Date;
import rx.Observable;
import rx.SingleSubscriber;
import rx.android.schedulers.AndroidSchedulers;

/* JADX INFO: loaded from: classes21.dex */
public class FormulateCurriculumActivity extends BaseTitleActivity {
    private static TrainingCourse F = null;
    public static final String IS_REDO_COURSE = "isRedoCourse";
    private StartDateFragment A;
    private Fragment B;
    private int C = 0;
    private boolean D = false;
    private LoadingDialog E;
    private Button x;
    private FitnessGoalFragment y;
    private DifficultyFragment z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FormulateCurriculumActivity.this.p();
        }
    }

    public class b extends SingleSubscriber<TrainingCourse> {
        public final /* synthetic */ Date b;

        public b(Date date) {
            this.b = date;
        }

        @Override // rx.SingleSubscriber
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(TrainingCourse trainingCourse) {
            ViewTrainingCourseActivity.startViewTrainingCourse(FormulateCurriculumActivity.this, this.b, trainingCourse, true);
            FormulateCurriculumActivity.this.finish();
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            th.printStackTrace();
        }
    }

    private void initView() {
        setContentViewBehindTitleBar(true, true);
        Button button = (Button) findViewById(R.id.btn_next_step);
        this.x = button;
        button.setOnClickListener(new a());
        this.y = new FitnessGoalFragment();
        this.z = new DifficultyFragment();
        this.A = new StartDateFragment();
        n();
        TrainingAnalytics.event(this, TrainingAnalytics.EventId.CUSTOMIZEDCOURSES_VIEWNUM);
    }

    private Observable<TrainingCourse> m() {
        TrainingCourse trainingCourse = F;
        return trainingCourse != null ? Observable.just(trainingCourse) : TrainingDBUtils.queryTrainedCourseFastRx();
    }

    private void n() {
        int i = this.C;
        if (i == 0) {
            setTitleText(R.string.choose_fitness_goal);
            this.x.setText(R.string.next_step);
            o(this.y);
        } else if (i == 1) {
            setTitleText(R.string.choose_training_difficulty);
            this.x.setText(R.string.next_step);
            o(this.z);
        } else {
            if (i != 2) {
                return;
            }
            setTitleText(R.string.choose_training_start_date);
            this.x.setText(R.string.look_training_course);
            o(this.A);
        }
    }

    private void o(Fragment fragment) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        String simpleName = fragment.getClass().getSimpleName();
        Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag(simpleName);
        if (fragmentFindFragmentByTag == null) {
            fragmentTransactionBeginTransaction.add(R.id.fl_container, fragment, simpleName);
        } else {
            fragmentTransactionBeginTransaction.show(fragmentFindFragmentByTag);
        }
        Fragment fragment2 = this.B;
        if (fragment2 != null) {
            fragmentTransactionBeginTransaction.hide(supportFragmentManager.findFragmentByTag(fragment2.getClass().getSimpleName()));
        }
        this.B = fragment;
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        int i = this.C;
        if (i < 2) {
            if (this.D) {
                return;
            }
            this.C = i + 1;
            n();
            return;
        }
        if (i == 2) {
            Date startDate = this.A.getStartDate();
            if (this.D) {
                m().observeOn(AndroidSchedulers.mainThread()).toSingle().subscribe(new b(startDate));
                return;
            }
            String fitnessGoal = this.y.getFitnessGoal();
            String difficulity = this.z.getDifficulity();
            t(R.string.loading);
            RequestTrainingAPI.reqTrainingPlan(fitnessGoal, difficulity, startDate, true);
        }
    }

    private void q() {
        int i = this.C;
        if (i <= 0) {
            finish();
        } else {
            this.C = i - 1;
            n();
        }
    }

    private void r(int i) {
        LoadingDialog loadingDialog = this.E;
        if (loadingDialog != null) {
            loadingDialog.setFailed(getString(i), 1000, null);
        }
    }

    private void s() {
        LoadingDialog loadingDialog = this.E;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
    }

    public static void startRedoCourse(Context context, TrainingCourse trainingCourse) {
        Intent intent = new Intent(context, (Class<?>) FormulateCurriculumActivity.class);
        intent.putExtra(IS_REDO_COURSE, true);
        F = trainingCourse;
        context.startActivity(intent);
    }

    private void t(int i) {
        if (this.E == null) {
            this.E = LoadingDialog.showDialog(this, getString(i));
        }
        this.E.setCancelable(false);
        this.E.setMessage(getString(i));
        this.E.show();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.C <= 0 || this.D) {
            super.onBackPressed();
        } else {
            q();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_formulate_curriculum);
        GlobalTitleStyleKt.setUnifyTitleStyle(this, getString(R.string.choose_fitness_goal), "");
        EventBus.getDefault().register(this);
        boolean booleanExtra = getIntent().getBooleanExtra(IS_REDO_COURSE, false);
        this.D = booleanExtra;
        if (booleanExtra) {
            this.C = 2;
        }
        initView();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(EventReqTrainingData eventReqTrainingData) {
        if (eventReqTrainingData.method == EventReqTrainingData.DATA_TRAINING_PLAN.method) {
            Object obj = eventReqTrainingData.respData;
            if (obj == null || eventReqTrainingData.resultFlag != 0) {
                if (eventReqTrainingData.resultFlag == 2 && eventReqTrainingData.httpCancleType == 4) {
                    r(R.string.net_not_work);
                    return;
                } else {
                    r(R.string.loading_error);
                    return;
                }
            }
            TrainingCourse trainingCourse = (TrainingCourse) obj;
            if (trainingCourse.trainingPlanId == null || trainingCourse.dayTrainingItems == null) {
                r(R.string.loading_error);
                return;
            }
            s();
            ViewTrainingCourseActivity.startViewTrainingCourse(this, this.A.getStartDate(), trainingCourse, false);
            finish();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        if (this.C <= 0 || this.D) {
            super.onBackPressed();
        } else {
            q();
        }
    }
}
