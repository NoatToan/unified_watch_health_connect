package com.huawei.ui.main.stories.nps.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.nps.interactors.HwNpsCallback;
import com.huawei.ui.main.stories.nps.interactors.HwNpsManager;
import com.huawei.ui.main.stories.nps.interactors.cache.QuestionCache;
import com.huawei.ui.main.stories.nps.interactors.mode.CommitResponse;
import com.huawei.ui.main.stories.nps.interactors.mode.CreateCommitAnswer;
import com.huawei.ui.main.stories.nps.interactors.mode.CreateQuestionAnswer;
import com.huawei.ui.main.stories.nps.interactors.mode.QuestionSureyResponse;
import com.huawei.ui.main.stories.nps.interactors.mode.QuestionSurveyDetailResponse;
import com.huawei.ui.main.stories.nps.interactors.mode.Records;
import com.huawei.ui.main.stories.nps.interactors.mode.TypeParams;
import com.huawei.ui.main.stories.nps.interactors.util.TaskUtils;
import com.huawei.ui.main.stories.nps.views.OnCheckedChangeListener;
import defpackage.elh;
import defpackage.elo;
import defpackage.lmf;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class EcologyNpsSurveyActivity extends BaseActivity implements View.OnClickListener, OnCheckedChangeListener {
    private static final int DEFAULT_VALUE = -1;
    private static final String FAILED_BI = "2";
    private static final int NUMBER_ONE = 1;
    private static final String SUCCESS_BI = "1";
    private static final String TAG = "EcologyNpsSurveyActivity";
    private static final String TAG_RELEASE = "Nps_EcologyNpsSurveyActivity";
    private static final int ZERO_MARGIN = 0;
    private LinearLayout container;
    private HealthColumnSystem mColumnSystem;
    private String mCommitAnswerGsonString;
    private CommitResponse mCommitResponse;
    private Context mContext;
    private HealthButton mNextButton;
    private CustomTitleBar mTitleTextView;
    private final Type mQuestionDetailType = new TypeToken<QuestionSurveyDetailResponse>() { // from class: com.huawei.ui.main.stories.nps.activity.EcologyNpsSurveyActivity.1
    }.getType();
    private final Type mCommitResponseType = new TypeToken<CommitResponse>() { // from class: com.huawei.ui.main.stories.nps.activity.EcologyNpsSurveyActivity.2
    }.getType();
    private CustomTextAlertDialog mCommitSuccessDialog = null;
    private List<QuestionSureyResponse> mQuestions = new ArrayList(16);
    private int mViewPagerIndex = 0;
    private int mMaxPosition = -1;
    private boolean mIsPosting = false;
    private HwNpsManager mHwNpsManager = null;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_ecology_nps_survey);
        this.mContext = this;
        this.mHwNpsManager = HwNpsManager.getInstance();
        this.mHwNpsManager.setBiNpsEvent(AnalyticsValue.NPS_OPEN_QUESTION_1090038.value(), "");
        ReleaseLogUtil.d(TAG_RELEASE, "nps Enter EcologyNpsSurveyActivity onCreate!");
        initLayout();
        List<QuestionSureyResponse> questions = QuestionCache.getQuestions();
        this.mQuestions = questions;
        if (questions.size() < 1) {
            initQuestionsCache();
        }
        if (this.mQuestions.size() < 1) {
            LogUtil.d(TAG, "nps EcologyNpsSurveyActivity mQuestions is null finish!");
            finish();
        } else {
            this.mMaxPosition = this.mQuestions.size() - 1;
            changePage(this.mViewPagerIndex);
        }
    }

    private void initLayout() {
        this.mNextButton = (HealthButton) findViewById(R.id.question_next);
        if (qrs.af(this.mContext)) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ecology_fragment_container);
            this.container = linearLayout;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.mContext);
            this.mColumnSystem = healthColumnSystem;
            int iA = ((int) healthColumnSystem.a(1)) + this.mColumnSystem.b();
            marginLayoutParams.setMargins(iA, 0, iA, 0);
            this.container.setLayoutParams(marginLayoutParams);
        }
        String sharedPreference = this.mHwNpsManager.getSharedPreference(HwNpsManager.KEY_ECOLOGY_DEVICE_UUID);
        elh elhVarD = ResourceManager.c().d(sharedPreference);
        if (elhVarD == null) {
            return;
        }
        this.mNextButton.setVisibility(0);
        this.mNextButton.setOnClickListener(this);
        this.mTitleTextView = (CustomTitleBar) qsp.a(this, R.id.question_main_title);
        String str = String.format(Locale.ENGLISH, this.mContext.getResources().getString(R.string.IDS_hw_ecology_survey_title), elo.a(sharedPreference, elhVarD.l().d()));
        this.mTitleTextView.setTitleBarBackgroundColor(this.mContext.getResources().getColor(R.color.colorSubBackground));
        this.mTitleTextView.setTitleText(str);
    }

    private void initQuestionsCache() {
        QuestionSurveyDetailResponse questionSurveyDetailResponse;
        if (this.mHwNpsManager == null) {
            return;
        }
        if (this.mQuestions == null) {
            this.mQuestions = new ArrayList(16);
        }
        String questionDetail = this.mHwNpsManager.getQuestionDetail();
        LogUtil.a(TAG, "nps initQuestionsCache getQuestionDetail response: ", questionDetail);
        QuestionSurveyDetailResponse questionSurveyDetailResponse2 = new QuestionSurveyDetailResponse();
        try {
            questionSurveyDetailResponse = (QuestionSurveyDetailResponse) new Gson().fromJson(questionDetail, this.mQuestionDetailType);
            try {
                ReleaseLogUtil.d(TAG_RELEASE, "nps initQuestionsCache detailResponse");
            } catch (JsonSyntaxException unused) {
                questionSurveyDetailResponse2 = questionSurveyDetailResponse;
                ReleaseLogUtil.a(TAG_RELEASE, "nps initQuestionsCache json error");
                questionSurveyDetailResponse = questionSurveyDetailResponse2;
            }
        } catch (JsonSyntaxException unused2) {
        }
        List<QuestionSureyResponse> questions = (questionSurveyDetailResponse == null || questionSurveyDetailResponse.getSurveyContent() == null) ? null : questionSurveyDetailResponse.getSurveyContent().getQuestions();
        if (questions == null) {
            LogUtil.d(TAG, "nps initQuestionsCache questionList == null");
        } else {
            this.mQuestions.addAll(questions);
        }
    }

    @Override // com.huawei.ui.main.stories.nps.views.OnCheckedChangeListener
    public void onClick(boolean z) {
        this.mNextButton.setEnabled(z);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.question_next) {
            changePage(this.mViewPagerIndex);
        }
    }

    public void changePage(int i) {
        String string;
        Fragment ecologyMultipleFragment;
        LogUtil.a(TAG, "nps Enter changePage index=", Integer.valueOf(i));
        String questionType = i == this.mMaxPosition + 1 ? "" : this.mQuestions.get(i).getQuestionType();
        int i2 = this.mMaxPosition;
        if (i < i2) {
            string = String.format(Locale.ENGLISH, getString(R.string.IDS_nps_question_survey_next), Integer.valueOf(i + 1), Integer.valueOf(this.mQuestions.size()));
            if (TypeParams.QUESTION_CHOOSE_SINGEL.equals(questionType)) {
                this.mNextButton.setEnabled(false);
            }
        } else {
            if (i != i2) {
                if (i == i2 + 1) {
                    commitCenterData();
                    return;
                } else {
                    LogUtil.e(TAG, "index is no right");
                    return;
                }
            }
            string = getString(R.string.IDS_nps_submit);
            if (TypeParams.QUESTION_CHOOSE_SINGEL.equals(questionType)) {
                this.mNextButton.setEnabled(false);
            }
        }
        if (TypeParams.QUESTION_FIELD.equals(questionType)) {
            ecologyMultipleFragment = new EcologyFiledFragment(this.mQuestions.get(i), i + 1);
        } else if (TypeParams.QUESTION_CHOOSE_SINGEL.equals(questionType)) {
            ecologyMultipleFragment = new EcologySingleFragment(this.mQuestions.get(i), i + 1, this);
        } else {
            ecologyMultipleFragment = new EcologyMultipleFragment(this.mQuestions.get(i), i + 1, this);
        }
        this.mNextButton.setText(string.toUpperCase(Locale.ENGLISH));
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        if (LanguageUtil.ba(this)) {
            fragmentTransactionBeginTransaction.setCustomAnimations(R.anim.right_enter, R.anim.right_exit, R.anim.left_enter, R.anim.left_exit);
        } else {
            fragmentTransactionBeginTransaction.setCustomAnimations(R.anim.left_enter, R.anim.left_exit, R.anim.right_enter, R.anim.right_exit);
        }
        fragmentTransactionBeginTransaction.replace(R.id.ecology_fragment_container, ecologyMultipleFragment);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        this.mViewPagerIndex++;
    }

    public void commitCenterData() {
        ReleaseLogUtil.d(TAG_RELEASE, "nps Enter commitCenterData");
        if (CommonUtil.ab(this)) {
            ReleaseLogUtil.d(TAG_RELEASE, "nps ready commit");
            initPostData();
            postData();
            return;
        }
        qpx.e(this.mContext, R.string.IDS_network_connect_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBiCommitNpsEvent(String str) {
        ReleaseLogUtil.d(TAG_RELEASE, "setBiCommitNpsEvent");
        String strValue = AnalyticsValue.NPS_COMMIT_QUESTION_1090039.value();
        HashMap map = new HashMap(16);
        map.put("click", 1);
        if (str != null) {
            map.put("type", str);
        }
        lmf.d().c(this.mContext, strValue, map, 0);
    }

    private void initPostData() {
        ReleaseLogUtil.d(TAG_RELEASE, "nps Enter initPostData");
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < this.mQuestions.size(); i++) {
            CreateQuestionAnswer createQuestionAnswer = new CreateQuestionAnswer();
            QuestionSureyResponse questionSureyResponse = this.mQuestions.get(i);
            Integer id = questionSureyResponse.getId();
            String questionType = questionSureyResponse.getQuestionType();
            createQuestionAnswer.setQuestionId(id);
            createQuestionAnswer.setQuestionType(questionType);
            if (TypeParams.QUESTION_FIELD.equals(questionType)) {
                if (Records.getStringDataCenter().get(id) != null) {
                    CreateCommitAnswer createCommitAnswer = new CreateCommitAnswer();
                    createCommitAnswer.setQuestionId(id.intValue());
                    createCommitAnswer.setAnswer(Records.getStringDataCenter().get(id));
                    arrayList.add(createCommitAnswer);
                }
            } else if (TypeParams.QUESTION_CHOOSE_SINGEL.equals(questionType) || "M".equals(questionType)) {
                if (Records.getOptionResult().get(id) != null) {
                    CreateCommitAnswer createCommitAnswer2 = new CreateCommitAnswer();
                    createCommitAnswer2.setQuestionId(id.intValue());
                    String str = Records.getOptionResult().get(id);
                    LogUtil.d(TAG, "nps answer to commit:", str);
                    createCommitAnswer2.setAnswer(str);
                    arrayList.add(createCommitAnswer2);
                }
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "nps unsupport type");
            }
            createQuestionAnswer.setAnswers(arrayList);
            LogUtil.d(TAG, "initPostData questionAnswer.questionId=", createQuestionAnswer.getQuestionId());
        }
        String json = new Gson().toJson(arrayList);
        this.mCommitAnswerGsonString = json;
        LogUtil.a(TAG, "nps upload answer core data: ", json);
    }

    private void postData() {
        ReleaseLogUtil.d(TAG_RELEASE, "nps Enter postData");
        if (this.mIsPosting) {
            ReleaseLogUtil.d(TAG_RELEASE, "nps mIsPosting is true,return");
            return;
        }
        this.mIsPosting = true;
        HwNpsManager hwNpsManager = this.mHwNpsManager;
        if (hwNpsManager != null) {
            hwNpsManager.submitSurveyQuestion(this.mCommitAnswerGsonString, commitCallback());
            LogUtil.a(TAG, "mCommitAnswerGsonString: ", this.mCommitAnswerGsonString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResponse(final String str) {
        LogUtil.a(TAG, "nps upload answers successful response: ", str);
        this.mIsPosting = false;
        TaskUtils.executeAsyncTask(new AsyncTask<Object, Object, Object>() { // from class: com.huawei.ui.main.stories.nps.activity.EcologyNpsSurveyActivity.3
            @Override // android.os.AsyncTask
            protected Object doInBackground(Object... objArr) {
                Gson gson = new Gson();
                try {
                    EcologyNpsSurveyActivity ecologyNpsSurveyActivity = EcologyNpsSurveyActivity.this;
                    ecologyNpsSurveyActivity.mCommitResponse = (CommitResponse) gson.fromJson(str, ecologyNpsSurveyActivity.mCommitResponseType);
                    return null;
                } catch (JsonSyntaxException unused) {
                    ReleaseLogUtil.a(EcologyNpsSurveyActivity.TAG_RELEASE, "nps json error");
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            protected void onPostExecute(Object obj) {
                super.onPostExecute(obj);
                Records.clearAllResult();
                if (EcologyNpsSurveyActivity.this.mCommitResponse != null && EcologyNpsSurveyActivity.this.mCommitResponse.getResCode() == 0) {
                    ReleaseLogUtil.d(EcologyNpsSurveyActivity.TAG_RELEASE, "nps upload answers successful");
                    EcologyNpsSurveyActivity.this.setBiCommitNpsEvent("1");
                    EcologyNpsSurveyActivity.this.mHwNpsManager.setSharedPreference(HwNpsManager.KEY_ECOLOGY_NPS_REQUEST, "", null);
                    EcologyNpsSurveyActivity.this.mHwNpsManager.setSharedPreference(HwNpsManager.KEY_ECOLOGY_DEVICE_UUID, "", null);
                    EcologyNpsSurveyActivity.this.mHwNpsManager.setSharedPreference(HwNpsManager.NPS_ECOLOGY_QUESTION_CONTENT_KEY, "", null);
                    EcologyNpsSurveyActivity.this.mHwNpsManager.setSharedPreference(HwNpsManager.KEY_ECOLOGY_NPS_ID, "", null);
                    EcologyNpsSurveyActivity.this.mHwNpsManager.setSharedPreference(HwNpsManager.KEY_NPS_SHOW, "", null);
                    EcologyNpsSurveyActivity.this.mHwNpsManager.setSharedPreference(HwNpsManager.KEY_ECOLOGY_MODEL, "", null);
                    EcologyNpsSurveyActivity.this.mHwNpsManager.setSharedPreference(HwNpsManager.KEY_NPS_LAST_TIME, String.valueOf(System.currentTimeMillis()), null);
                    EcologyNpsSurveyActivity.this.showCommitSureDialog();
                    return;
                }
                LogUtil.j(EcologyNpsSurveyActivity.TAG, "nps upload answers fail");
            }
        }, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCommitSureDialog() {
        ReleaseLogUtil.d(TAG_RELEASE, "nps Enter showCommitSureDialog");
        if (this.mCommitSuccessDialog != null) {
            ReleaseLogUtil.d(TAG_RELEASE, "nps mCommitSuccessDialog is showing, return");
            return;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.mContext).a(R.string.IDS_nps_success_title).b(R.string.IDS_nps_success_message_1).b(getString(R.string.IDS_settings_button_nps_ok).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.nps.activity.EcologyNpsSurveyActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (EcologyNpsSurveyActivity.this.isFinishing()) {
                    return;
                }
                if (!TextUtils.isEmpty(HwNpsManager.getInstance().getSharedPreference(HwNpsManager.KEY_NPS_SHOW))) {
                    LogUtil.a(EcologyNpsSurveyActivity.TAG, "KEY_NPS_SHOW result = ", Integer.valueOf(HwNpsManager.getInstance().setSharedPreference(HwNpsManager.KEY_NPS_SHOW, "", null)));
                    if (!TextUtils.isEmpty(HwNpsManager.getInstance().getSharedPreference(HwNpsManager.MESSAGE_NPS_ID))) {
                        ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).setMessageRead(HwNpsManager.getInstance().getSharedPreference(HwNpsManager.MESSAGE_NPS_ID));
                    }
                }
                if (EcologyNpsSurveyActivity.this.mCommitSuccessDialog != null && EcologyNpsSurveyActivity.this.mCommitSuccessDialog.isShowing()) {
                    ReleaseLogUtil.d(EcologyNpsSurveyActivity.TAG_RELEASE, "nps close mCommitSuccessDialog");
                    EcologyNpsSurveyActivity.this.mCommitSuccessDialog.cancel();
                    EcologyNpsSurveyActivity.this.mCommitSuccessDialog = null;
                }
                EcologyNpsSurveyActivity.this.finish();
            }
        }).b();
        this.mCommitSuccessDialog = customTextAlertDialogB;
        customTextAlertDialogB.setCanceledOnTouchOutside(false);
        this.mCommitSuccessDialog.setCancelable(false);
        if (isFinishing()) {
            return;
        }
        this.mCommitSuccessDialog.show();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    private HwNpsCallback commitCallback() {
        return new HwNpsCallback() { // from class: com.huawei.ui.main.stories.nps.activity.EcologyNpsSurveyActivity.5
            @Override // com.huawei.ui.main.stories.nps.interactors.HwNpsCallback
            public void onSuccess(String str) {
                LogUtil.a(EcologyNpsSurveyActivity.TAG, "nps upload answers successful response: ", str);
                if (str == null) {
                    return;
                }
                EcologyNpsSurveyActivity.this.handleResponse(str);
            }

            @Override // com.huawei.ui.main.stories.nps.interactors.HwNpsCallback
            public void onError() {
                EcologyNpsSurveyActivity.this.mIsPosting = false;
                EcologyNpsSurveyActivity.this.setBiCommitNpsEvent("2");
                LogUtil.a(EcologyNpsSurveyActivity.TAG, "nps upload answers error ");
            }
        };
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
