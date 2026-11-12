package com.huawei.ui.main.stories.nps.component;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.nps.https.HttpResCallback;
import com.huawei.ui.main.stories.nps.https.HttpUtils;
import com.huawei.ui.main.stories.nps.interactors.mode.QuestionSurveyCommitParam;
import com.huawei.ui.main.stories.nps.interactors.mode.QuestionSurveyRequestParam;
import com.huawei.ui.main.stories.nps.npsstate.NativeConfigBean;
import com.huawei.ui.main.stories.nps.npsstate.NpsUserShowController;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
public class NpsQuestionPageActivity extends BaseActivity implements MultiLayoutAdapter.NpsBarProgressListener {
    private static final int HTTPS_OK = 200;
    private static final int ONE_BATCHS = 1;
    private static final String PROGRESS_DEFAULT_VALUE = "-1";
    private static final String RESULT_CODE = "resCode";
    private static final String STATUS_TRUE = "true";
    private static final String TAG = "NpsQuestionPageActivity";
    private static final int THREE_BATCHS = 3;
    private static final int TWO_BATCHS = 2;
    private MultiLayoutAdapter mAdapter;
    private HealthButton mCommitButton;
    private Context mContext;
    private ListView mListView;
    private NoTitleCustomAlertDialog mNoTitleDialog;
    private NpsUserShowController mShowController;
    private CustomTitleBar mTitleBar;
    private List<NpsQuestion> mList = new ArrayList();
    private int mSurveyTime = 0;
    private String mSurveyId = "";
    private Handler mHandler = new Handler();
    private boolean mIsCommitClicked = false;
    private Runnable mDialogRunnable = new Runnable() { // from class: com.huawei.ui.main.stories.nps.component.NpsQuestionPageActivity.1
        @Override // java.lang.Runnable
        public void run() {
            LogUtil.a(NpsQuestionPageActivity.TAG, "setBIAnalytics:COMMIT_SUCCESS");
            HashMap map = new HashMap();
            map.put("click", 1);
            lmf.d().c(NpsQuestionPageActivity.this.mContext, AnalyticsValue.HEALTH_HOME_NPS_COMMIT_SUCCESS_2010096.value(), map, 0);
            NpsQuestionPageActivity.this.showCommitOkDialog();
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_nps_question_page);
        this.mContext = this;
        NpsUserShowController npsUserShowController = NpsUserShowController.getInstance(BaseApplication.getContext());
        this.mShowController = npsUserShowController;
        int surveyTime = npsUserShowController.getSurveyTime();
        this.mSurveyTime = surveyTime;
        LogUtil.a(TAG, "NpsQuestionPageActivity onCreate() mSurveyTime: ", Integer.valueOf(surveyTime));
        initQueryData(getTheSurveyContent(this.mSurveyTime));
        this.mListView = (ListView) findViewById(R.id.nps_question_lv);
        MultiLayoutAdapter multiLayoutAdapter = new MultiLayoutAdapter(this, this.mList, this);
        this.mAdapter = multiLayoutAdapter;
        this.mListView.setAdapter((ListAdapter) multiLayoutAdapter);
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.nps_survey_title);
        this.mTitleBar = customTitleBar;
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.nps.component.NpsQuestionPageActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a(NpsQuestionPageActivity.TAG, "click back left top");
                NpsQuestionPageActivity.this.setBiAnalytics();
                NpsQuestionPageActivity.this.finish();
            }
        });
        HealthButton healthButton = (HealthButton) findViewById(R.id.nps_question_next_bt);
        this.mCommitButton = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.nps.component.NpsQuestionPageActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NpsQuestionPageActivity.this.commit();
            }
        });
        openHealthNpsBiAnalytics();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void commit() {
        MultiLayoutAdapter multiLayoutAdapter = this.mAdapter;
        List<NpsQuestion> npsQuestionList = multiLayoutAdapter != null ? multiLayoutAdapter.getNpsQuestionList() : null;
        if (njy.e(npsQuestionList)) {
            Context context = this.mContext;
            qpx.e(context, context.getString(R.string.nps_user_survey_input_score_toast));
            return;
        }
        LogUtil.a(TAG, "npsAdd commitContent: ", npsQuestionList.toString());
        if (!isFinishAllRequest(npsQuestionList)) {
            Context context2 = this.mContext;
            qpx.e(context2, context2.getString(R.string.nps_user_survey_input_score_toast));
            return;
        }
        int i = this.mSurveyTime;
        if (i == 0) {
            return;
        }
        this.mShowController.setTheSurveyUnNeeded(i);
        if (CommonUtil.ab(BaseApplication.getContext())) {
            if (this.mIsCommitClicked) {
                return;
            }
            this.mIsCommitClicked = true;
            this.mCommitButton.setTextColor(getResources().getColor(R.color.common_colorAccent_disabled));
            this.mCommitButton.setEnabled(false);
            commitSurvey(this.mShowController.getHuidStr(), this.mSurveyTime, npsQuestionList);
            return;
        }
        showTheAlertDialog();
    }

    private boolean isFinishAllRequest(List<NpsQuestion> list) {
        if (njy.e(list)) {
            LogUtil.d(TAG, "isFinishAllRequest npsQuestionList isEmpty!");
            return false;
        }
        for (NpsQuestion npsQuestion : list) {
            if ("true".equals(npsQuestion.getRequired()) && "-1".equals(npsQuestion.getAnswer())) {
                return false;
            }
        }
        return true;
    }

    private void openHealthNpsBiAnalytics() {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        lmf.d().c(this.mContext, AnalyticsValue.HEALTH_HOME_NPS_ENTER_2010095.value(), map, 0);
    }

    private void showTheAlertDialog() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).c(R.string.nps_user_survey_net_setting, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.nps.component.NpsQuestionPageActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (NpsQuestionPageActivity.this.mNoTitleDialog != null) {
                    NpsQuestionPageActivity.this.mNoTitleDialog.dismiss();
                }
                CommonUtil.t(NpsQuestionPageActivity.this.mContext);
            }
        }).a(R.string.nps_user_survey_grade_cancel, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.nps.component.NpsQuestionPageActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (NpsQuestionPageActivity.this.mNoTitleDialog != null) {
                    NpsQuestionPageActivity.this.mNoTitleDialog.dismiss();
                }
            }
        }).b(R.string.nps_user_survey_no_net).c();
        this.mNoTitleDialog = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        if (isFinishing()) {
            return;
        }
        this.mNoTitleDialog.show();
    }

    private String getTheSurveyContent(int i) throws Throwable {
        String accountInfo = LoginInit.getInstance(this).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.d(TAG, "getTheSurveyContent huidStr isEmpty.");
            return "";
        }
        if (i == 1 || i == 2) {
            NativeConfigBean nativeConfigBean = this.mShowController.getNewUserConfigInfo(accountInfo).get(Integer.valueOf(i));
            if (nativeConfigBean == null) {
                return "";
            }
            String questionContent = nativeConfigBean.getQuestionContent();
            LogUtil.a(TAG, "getTheSurveyContent new user content: ", questionContent);
            return questionContent;
        }
        NpsConfig npsConfig = this.mShowController.readNpsConfig();
        if (npsConfig == null || i != 3) {
            return "";
        }
        NativeConfigBean oldUserConfigInfo = this.mShowController.getOldUserConfigInfo(npsConfig.getVersion() + accountInfo);
        if (oldUserConfigInfo == null) {
            return "";
        }
        String questionContent2 = oldUserConfigInfo.getQuestionContent();
        LogUtil.a(TAG, "getTheSurveyContent old user content: ", questionContent2);
        return questionContent2;
    }

    private void initQueryData(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        QuestionContent questionContentObjectFromData = QuestionContent.objectFromData(str);
        this.mSurveyId = questionContentObjectFromData.getSurveyId();
        List<QuestionContent.SurveyContentBean.QuestionsBean> questions = questionContentObjectFromData.getSurveyContent().getQuestions();
        this.mList.clear();
        for (int i = 0; i < questions.size(); i++) {
            QuestionContent.SurveyContentBean.QuestionsBean questionsBean = questions.get(i);
            NpsQuestion npsQuestion = new NpsQuestion(questionsBean.getType(), questionsBean.getSubTitle(), questionsBean.getQuestion(), questionsBean.getPictureUrl());
            npsQuestion.setId(questionsBean.getId());
            if (TextUtils.isEmpty(questionsBean.getRequired())) {
                npsQuestion.setRequired("true");
            } else {
                npsQuestion.setRequired(questionsBean.getRequired());
            }
            this.mList.add(npsQuestion);
        }
    }

    public void commitSurvey(String str, int i, List<NpsQuestion> list) {
        HashMap<String, String> params = getParams(str, i);
        String url = GRSManager.c(this.mContext).getUrl("domainCcpceConsumerHuawei");
        if (TextUtils.isEmpty(url)) {
            LogUtil.c(TAG, "commitSurvey host is empty");
            url = "http:/";
        }
        String str2 = url + NpsConstantValue.COMMIT_NPS_URL;
        LogUtil.a(TAG, "commitSurvey url string: ..CCPC/EN/ccpcnps/submitSurveyV2/1");
        params.put(QuestionSurveyCommitParam.ANSWERS, getTheAnswerString(list));
        HttpUtils.postReq(this, str2, params, new HashMap(), new HttpResCallback() { // from class: com.huawei.ui.main.stories.nps.component.NpsQuestionPageActivity.6
            /* JADX WARN: Code duplicated, block: B:15:0x003e  */
            @Override // com.huawei.ui.main.stories.nps.https.HttpResCallback
            public void onFinished(int i2, String str3) {
                byte b2;
                LogUtil.a(NpsQuestionPageActivity.TAG, "commitSurvey() result: ", str3);
                if (i2 == 200) {
                    try {
                        String string = new JSONObject(str3).getString(NpsQuestionPageActivity.RESULT_CODE);
                        int iHashCode = string.hashCode();
                        if (iHashCode != 48) {
                            if (iHashCode == 1448635041 && string.equals(NpsConstantValue.QUERY_SYSTEM_BUSY)) {
                                b2 = 1;
                            } else {
                                b2 = -1;
                            }
                        } else if (string.equals("0")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                        if (b2 == 0) {
                            NpsQuestionPageActivity.this.mHandler.post(NpsQuestionPageActivity.this.mDialogRunnable);
                            return;
                        }
                        if (b2 == 1) {
                            NpsQuestionPageActivity.this.mIsCommitClicked = false;
                            NpsQuestionPageActivity.this.mCommitButton.setEnabled(true);
                            NpsQuestionPageActivity.this.mCommitButton.setTextColor(NpsQuestionPageActivity.this.getResources().getColor(R.color.common_colorAccent));
                        } else {
                            LogUtil.a(NpsQuestionPageActivity.TAG, "commitSurvey() result: default");
                            NpsQuestionPageActivity.this.mIsCommitClicked = false;
                            NpsQuestionPageActivity.this.mCommitButton.setEnabled(true);
                            NpsQuestionPageActivity.this.mCommitButton.setTextColor(NpsQuestionPageActivity.this.getResources().getColor(R.color.common_colorAccent));
                        }
                    } catch (JSONException e) {
                        LogUtil.c(NpsQuestionPageActivity.TAG, "commitSurvey JsonSyntaxException, e is ", e.getMessage());
                    }
                }
            }
        });
    }

    private HashMap<String, String> getParams(String str, int i) {
        HashMap<String, String> map = new HashMap<>(10);
        map.put("sn", str);
        map.put("appID", HealthZonePushReceiver.DEAUTH_EVENT_NOTIFY);
        map.put("times", String.valueOf(i));
        map.put(QuestionSurveyCommitParam.SURVEY_ID, this.mSurveyId);
        map.put(FaqConstants.FAQ_EMUIVERSION, NpsCommonUtil.getEmuiVerion());
        map.put("countryCode", NpsCommonUtil.getCountryCode());
        map.put("firmware", NpsCommonUtil.getFirmRomVersion());
        map.put(QuestionSurveyRequestParam.CVERISON, NpsCommonUtil.getClientVersionCode());
        map.put("model", NpsCommonUtil.getInternalModel());
        map.put("os", NpsCommonUtil.getAndroidVersion());
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCommitOkDialog() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).c(R.string.nps_user_survey_grade_sure, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.nps.component.NpsQuestionPageActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (NpsQuestionPageActivity.this.mNoTitleDialog != null) {
                    NpsQuestionPageActivity.this.mNoTitleDialog.dismiss();
                }
                NpsQuestionPageActivity.this.finish();
            }
        }).b(R.string.nps_user_survey_commit_ok).c();
        this.mNoTitleDialog = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        if (isFinishing()) {
            return;
        }
        this.mNoTitleDialog.show();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            LogUtil.a(TAG, "key back）");
            setBiAnalytics();
            finish();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBiAnalytics() {
        LogUtil.a(TAG, "setBiAnalytics:COMMIT_FAIL");
        HashMap map = new HashMap();
        map.put("click", 1);
        lmf.d().c(this.mContext, AnalyticsValue.HEALTH_HOME_NPS_COMMIT_FAIL_2010097.value(), map, 0);
    }

    @Override // com.huawei.ui.main.stories.nps.component.MultiLayoutAdapter.NpsBarProgressListener
    public void getProgress(int i, int i2) {
        LogUtil.a(TAG, Integer.valueOf(i), "--progress--", Integer.valueOf(i2), "--position");
    }

    private String getTheAnswerString(List<NpsQuestion> list) {
        if (njy.e(list)) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Gson gson = new Gson();
        for (NpsQuestion npsQuestion : list) {
            String answer = npsQuestion.getAnswer();
            if ("-1".equals(answer)) {
                answer = "";
            }
            arrayList.add(gson.toJson(new AnswerEntity(qrs.a(npsQuestion.getId()), answer)));
        }
        String string = arrayList.toString();
        LogUtil.a(TAG, "npsAdd getTheAnswerString result: ", string);
        return string;
    }

    static class AnswerEntity {

        @SerializedName("answer")
        String mAnswer;

        @SerializedName("questionId")
        int mQuestionId;

        AnswerEntity(int i, String str) {
            this.mQuestionId = i;
            this.mAnswer = str;
        }

        public int getQuestionId() {
            return this.mQuestionId;
        }

        public void setQuestionId(int i) {
            this.mQuestionId = i;
        }

        public String getAnswer() {
            return this.mAnswer;
        }

        public void setAnswer(String str) {
            this.mAnswer = str;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
