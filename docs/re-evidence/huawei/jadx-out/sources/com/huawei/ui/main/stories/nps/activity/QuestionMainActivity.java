package com.huawei.ui.main.stories.nps.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.operation.utils.AndroidBugWorkaround;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthFragmentStatePagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.nps.harid.HagridNpsManager;
import com.huawei.ui.main.stories.nps.interactors.HwNpsCallback;
import com.huawei.ui.main.stories.nps.interactors.HwNpsManager;
import com.huawei.ui.main.stories.nps.interactors.cache.QuestionCache;
import com.huawei.ui.main.stories.nps.interactors.db.QuestionSurveyTable;
import com.huawei.ui.main.stories.nps.interactors.mode.CommitResponse;
import com.huawei.ui.main.stories.nps.interactors.mode.CreateCommitAnswer;
import com.huawei.ui.main.stories.nps.interactors.mode.CreateQuestionAnswer;
import com.huawei.ui.main.stories.nps.interactors.mode.QuestionSureyResponse;
import com.huawei.ui.main.stories.nps.interactors.mode.QuestionSurveyDetailResponse;
import com.huawei.ui.main.stories.nps.interactors.mode.Records;
import com.huawei.ui.main.stories.nps.interactors.mode.TypeParams;
import com.huawei.ui.main.stories.nps.interactors.util.TaskUtils;
import defpackage.eei;
import defpackage.lmf;
import defpackage.lrw;
import defpackage.mgg;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class QuestionMainActivity extends BaseActivity implements View.OnClickListener {
    private static final String CLICK_BACK_BI = "5";
    private static final String CLICK_COMMIT_BI = "3";
    private static final String CLICK_NEXT_BI = "4";
    private static final String CLICK_PART_COMMIT_BI = "6";
    private static final int DEFAULT_VALUE = -1;
    private static final String FAILED_BI = "2";
    private static final String FROM = "from";
    private static final String HOME = "home";
    private static final String NOTIFY = "notify";
    private static final String SUCCESS_BI = "1";
    private static final String TAG = "QuestionMainActivity";
    private static final String TAG_RELEASE = "Nps_QuestionMainActivity";
    private static final int ZERO_MARGIN = 0;
    private String mActivityFrom;
    private ClickHomeReceiver mClickHomeReceiver;
    private String mCommitAnswerGsonString;
    private CommitResponse mCommitResponse;
    private Context mContext;
    private FiledFragment mLastFragment;
    private LinearLayout mLayoutViewPager;
    private HealthButton mNextButton;
    private ScreenSlidePagerAdapter mPagerAdapter;
    private QuestionSurveyTable mQuestionSurveyTable;
    private String mQuestionType;
    private CustomTitleBar mTitleTextView;
    private HealthViewPager mViewPager;
    private boolean mIsSelected = false;
    private Type mQuestionDetailType = new TypeToken<QuestionSurveyDetailResponse>() { // from class: com.huawei.ui.main.stories.nps.activity.QuestionMainActivity.1
    }.getType();
    private CustomTextAlertDialog mCommitSuccessDialog = null;
    private List<QuestionSureyResponse> mQuestions = new ArrayList(16);
    private int mViewPagerIndex = 0;
    private int mMaxPosition = -1;
    private Type mCommitResponseType = new TypeToken<CommitResponse>() { // from class: com.huawei.ui.main.stories.nps.activity.QuestionMainActivity.2
    }.getType();
    private boolean mIsPosting = false;
    private HwNpsManager mHwNpsManager = null;
    private boolean mIsComplete = false;
    private HwNpsCallback mCommitCallback = new HwNpsCallback() { // from class: com.huawei.ui.main.stories.nps.activity.QuestionMainActivity.5
        @Override // com.huawei.ui.main.stories.nps.interactors.HwNpsCallback
        public void onSuccess(final String str) {
            LogUtil.a(QuestionMainActivity.TAG, "nps upload answers successful response: ", str);
            QuestionMainActivity.this.mIsPosting = false;
            QuestionMainActivity.this.mHwNpsManager.setIsGoSubmitSurveyState(false);
            if (str == null) {
                return;
            }
            TaskUtils.executeAsyncTask(new AsyncTask<Object, Object, Object>() { // from class: com.huawei.ui.main.stories.nps.activity.QuestionMainActivity.5.1
                @Override // android.os.AsyncTask
                protected Object doInBackground(Object... objArr) {
                    Gson gson = new Gson();
                    try {
                        QuestionMainActivity.this.mCommitResponse = (CommitResponse) gson.fromJson(str, QuestionMainActivity.this.mCommitResponseType);
                        return null;
                    } catch (JsonSyntaxException unused) {
                        ReleaseLogUtil.a(QuestionMainActivity.TAG_RELEASE, "nps json error");
                        return null;
                    }
                }

                @Override // android.os.AsyncTask
                protected void onPostExecute(Object obj) {
                    super.onPostExecute(obj);
                    Records.clearAllResult();
                    if (QuestionMainActivity.this.mCommitResponse != null && QuestionMainActivity.this.mCommitResponse.getResCode() == 0) {
                        ReleaseLogUtil.d(QuestionMainActivity.TAG_RELEASE, "nps upload answers successful");
                        QuestionMainActivity.this.mHwNpsManager.setSharedPreference(HwNpsManager.KEY_WEAR_MODEL, "", null);
                        QuestionMainActivity.this.mHwNpsManager.setSharedPreference(HwNpsManager.KEY_WEAR_NAME, "", null);
                        QuestionMainActivity.this.mHwNpsManager.setSharedPreference(HwNpsManager.KEY_WEAR_SN, "", null);
                        QuestionMainActivity.this.mHwNpsManager.setSharedPreference(HwNpsManager.KEY_WEAR_FIRMWARE, "", null);
                        QuestionMainActivity.this.mHwNpsManager.setSharedPreference(HwNpsManager.KEY_WEAR_UUID, "", null);
                        QuestionMainActivity.this.setBiCommitNpsEvent("1");
                        QuestionMainActivity.this.updateQuestionSurveyTable();
                        QuestionMainActivity.this.showCommitSureDialog();
                        return;
                    }
                    LogUtil.j(QuestionMainActivity.TAG, "nps upload answers fail");
                }
            }, new Object[0]);
        }

        @Override // com.huawei.ui.main.stories.nps.interactors.HwNpsCallback
        public void onError() {
            QuestionMainActivity.this.mIsPosting = false;
            QuestionMainActivity.this.mHwNpsManager.setIsGoSubmitSurveyState(false);
            QuestionMainActivity.this.setBiCommitNpsEvent("2");
            LogUtil.a(QuestionMainActivity.TAG, "nps upload answers error");
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().clearFlags(67108864);
        setContentView(R.layout.activity_nps_question_main);
        if (!qrs.aa(BaseApplication.getContext())) {
            AndroidBugWorkaround.assistActivity(this);
        }
        this.mContext = this;
        this.mHwNpsManager = HwNpsManager.getInstance();
        if (bundle != null) {
            this.mViewPagerIndex = bundle.getInt("mViewPagerIndex") - 1;
        }
        handlerIntent();
        String strValue = AnalyticsValue.NPS_OPEN_QUESTION_1090038.value();
        HwNpsManager hwNpsManager = this.mHwNpsManager;
        String str = this.mActivityFrom;
        String str2 = NOTIFY;
        if (!NOTIFY.equals(str)) {
            str2 = HOME;
        }
        hwNpsManager.setBiNpsEvent(strValue, str2);
        ReleaseLogUtil.d(TAG_RELEASE, "nps Enter QuestionMainActivity onCreate!");
        LogUtil.d(TAG, "nps Enter QuestionMainActivity onCreate init!");
        initView();
        List<QuestionSureyResponse> questions = QuestionCache.getQuestions();
        this.mQuestions = questions;
        if (questions.size() < 1) {
            initQuestionsCache();
        }
        if (this.mQuestions.size() < 1) {
            ReleaseLogUtil.d(TAG, "nps QuestionMainActivity mQuestions is null finish!");
            finish();
            return;
        }
        if (this.mViewPagerIndex == 0) {
            cleanData();
        }
        registerHomeReceiver();
        this.mMaxPosition = this.mQuestions.size() - 1;
        this.mPagerAdapter.notifyDataSetChanged();
        changePage(this.mViewPagerIndex);
        updateQuestionSurveyTable();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        if (qrs.aa(BaseApplication.getContext())) {
            return;
        }
        AndroidBugWorkaround.assistActivity(this);
    }

    private void cleanData() {
        if (HagridNpsManager.getInstance().isWeightDeviceNps() || !CommonUtil.bg()) {
            return;
        }
        for (int i = 0; i < this.mQuestions.size(); i++) {
            Integer id = this.mQuestions.get(i).getId();
            Records.getStringDataCenter().remove(id);
            Records.getOptionResult().remove(id);
        }
    }

    private void registerHomeReceiver() {
        this.mClickHomeReceiver = new ClickHomeReceiver();
        BroadcastManagerUtil.c(this.mContext, this.mClickHomeReceiver, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"), LocalBroadcast.f36595c, null);
    }

    private void initView() {
        LinearLayout linearLayout = (LinearLayout) qsp.a(this, R.id.layout_viewpager);
        this.mLayoutViewPager = linearLayout;
        setOnGlobalLayoutListener(linearLayout);
        initLayoutViewPager();
        this.mViewPager = (HealthViewPager) qsp.a(this, R.id.pager);
        ScreenSlidePagerAdapter screenSlidePagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        this.mPagerAdapter = screenSlidePagerAdapter;
        this.mViewPager.setAdapter(screenSlidePagerAdapter);
        this.mViewPager.setIsScroll(false);
        HealthButton healthButton = (HealthButton) qsp.a(this, R.id.question_next);
        this.mNextButton = healthButton;
        healthButton.setVisibility(0);
        this.mNextButton.setOnClickListener(this);
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.question_main_title);
        this.mTitleTextView = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(this.mContext.getResources().getColor(R.color.colorSubBackground));
        setMainTitle();
        if (LanguageUtil.ba(this)) {
            this.mTitleTextView.setLeftButtonDrawable(getDrawable(R.drawable.back_button_mirror), qre.f(R.string.accessibility_go_back));
        } else {
            this.mTitleTextView.setLeftButtonDrawable(getDrawable(R.drawable.back_button), qre.f(R.string.accessibility_go_back));
        }
        this.mTitleTextView.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.nps.activity.QuestionMainActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a(QuestionMainActivity.TAG, "mTitleTextView onClick mViewPagerIndex:", Integer.valueOf(QuestionMainActivity.this.mViewPagerIndex));
                QuestionMainActivity.this.exit();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void exit() {
        ReleaseLogUtil.e(TAG, "exit isWeightDeviceNps:", Boolean.valueOf(HagridNpsManager.getInstance().isWeightDeviceNps()), ", isHuaweiSystem:", Boolean.valueOf(CommonUtil.bg()));
        setBiCommitNpsEvent("5");
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a(TAG, "onBackPressed mViewPagerIndex:", Integer.valueOf(this.mViewPagerIndex));
        exit();
    }

    /* JADX INFO: loaded from: classes19.dex */
    class ClickHomeReceiver extends BroadcastReceiver {
        static final String SYSTEM_DIALOG_REASON_HOME_KEY = "homekey";
        static final String SYSTEM_DIALOG_REASON_KEY = "reason";

        private ClickHomeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && "android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(intent.getAction()) && SYSTEM_DIALOG_REASON_HOME_KEY.equals(intent.getStringExtra("reason"))) {
                LogUtil.a(QuestionMainActivity.TAG, "ClickHomeReceiver homekey");
                QuestionMainActivity.this.setBiCommitNpsEvent("5");
            }
        }
    }

    private void setOnGlobalLayoutListener(final LinearLayout linearLayout) {
        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.main.stories.nps.activity.QuestionMainActivity.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                linearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                linearLayout.setMinimumHeight(linearLayout.getHeight());
            }
        });
    }

    private void initLayoutViewPager() {
        ViewGroup.LayoutParams layoutParams = this.mLayoutViewPager.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(0, getResources().getDimensionPixelOffset(R.dimen.hw_show_public_size_9), 0, 0);
            this.mLayoutViewPager.setLayoutParams(marginLayoutParams);
        }
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
            return;
        }
        Iterator<QuestionSureyResponse> it = questions.iterator();
        while (it.hasNext()) {
            this.mQuestions.add(it.next());
        }
    }

    private void handlerIntent() {
        ReleaseLogUtil.d(TAG_RELEASE, "nps Enter handlerIntent");
        Intent intent = getIntent();
        if (intent == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "handlerIntent intent== null");
            return;
        }
        this.mActivityFrom = intent.getStringExtra("from");
        QuestionSurveyTable questionSurveyTable = this.mHwNpsManager.getQuestionSurveyTable();
        this.mQuestionSurveyTable = questionSurveyTable;
        if (questionSurveyTable != null) {
            LogUtil.a(TAG, "nps mQuestionSurveyTable:", questionSurveyTable.toString());
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    class ScreenSlidePagerAdapter extends HealthFragmentStatePagerAdapter {
        ScreenSlidePagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwFragmentStatePagerAdapter
        public Fragment getItem(int i) {
            QuestionMainActivity questionMainActivity = QuestionMainActivity.this;
            questionMainActivity.mQuestionType = ((QuestionSureyResponse) questionMainActivity.mQuestions.get(i)).getQuestionType();
            if (!TypeParams.QUESTION_FIELD.equals(QuestionMainActivity.this.mQuestionType)) {
                if (!TypeParams.QUESTION_CHOOSE_SINGEL.equals(QuestionMainActivity.this.mQuestionType)) {
                    if (!TypeParams.QUESTION_CHOOSE_MULTI_OPTION.equals(QuestionMainActivity.this.mQuestionType)) {
                        if (TypeParams.QUESTION_CHOOSE_STAR.equals(QuestionMainActivity.this.mQuestionType)) {
                            RatingFragment ratingFragment = new RatingFragment((QuestionSureyResponse) QuestionMainActivity.this.mQuestions.get(i), i + 1);
                            ratingFragment.setRetainInstance(true);
                            return ratingFragment;
                        }
                        ReleaseLogUtil.e(QuestionMainActivity.TAG_RELEASE, "getItem no this questionType");
                        SingleFragment singleFragment = new SingleFragment((QuestionSureyResponse) QuestionMainActivity.this.mQuestions.get(i), i + 1);
                        singleFragment.setRetainInstance(true);
                        return singleFragment;
                    }
                    MultipleFragment multipleFragment = new MultipleFragment((QuestionSureyResponse) QuestionMainActivity.this.mQuestions.get(i), i + 1);
                    multipleFragment.setRetainInstance(true);
                    return multipleFragment;
                }
                SingleFragment singleFragment2 = new SingleFragment((QuestionSureyResponse) QuestionMainActivity.this.mQuestions.get(i), i + 1);
                singleFragment2.setRetainInstance(true);
                return singleFragment2;
            }
            QuestionMainActivity.this.mLastFragment = new FiledFragment((QuestionSureyResponse) QuestionMainActivity.this.mQuestions.get(i), i + 1);
            QuestionMainActivity.this.mLastFragment.setRetainInstance(true);
            return QuestionMainActivity.this.mLastFragment;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public int getCount() {
            return QuestionMainActivity.this.mQuestions.size();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.question_next) {
            int i = this.mViewPagerIndex;
            if (i <= this.mMaxPosition && !this.mIsSelected && !TypeParams.QUESTION_FIELD.equals(this.mQuestions.get(i - 1).getQuestionType()) && HagridNpsManager.getInstance().isWeightDeviceNps()) {
                qpx.e(this.mContext, R.string.nps_user_survey_input_score_toast);
                return;
            }
            setBiCommitNpsEvent("4");
            if (jumpToSpecifiedNextQuestion()) {
                commitCenterData();
            } else {
                changePage(this.mViewPagerIndex);
            }
            this.mIsSelected = false;
        }
    }

    private boolean jumpToSpecifiedNextQuestion() {
        Integer qNextId;
        int i = this.mViewPagerIndex;
        if (i <= 0 || i > this.mMaxPosition) {
            LogUtil.a(TAG, "do not jumpToSpecifiedNextQuestion mViewPagerIndex ", Integer.valueOf(i));
            return false;
        }
        QuestionSureyResponse questionSureyResponse = this.mQuestions.get(i - 1);
        String questionType = questionSureyResponse.getQuestionType();
        Integer id = questionSureyResponse.getId();
        LogUtil.a(TAG, "jumpToSpecifiedNextQuestion questionType ", questionType, " questionId ", id, "mViewPagerIndex ", Integer.valueOf(this.mViewPagerIndex));
        if (questionSureyResponse.getQNextId() != null) {
            qNextId = questionSureyResponse.getQNextId();
        } else if ((TypeParams.QUESTION_CHOOSE_SINGEL.equals(questionType) || TypeParams.QUESTION_CHOOSE_STAR.equals(questionType)) && Records.getOptionNextId().get(id) != null) {
            qNextId = Records.getOptionNextId().get(id);
        } else {
            LogUtil.a(TAG, "do not jumpToSpecifiedNextQuestion mViewPagerIndex ", Integer.valueOf(this.mViewPagerIndex));
            return false;
        }
        if (qNextId != null && qNextId.intValue() == -1) {
            return true;
        }
        for (int i2 = 0; i2 < this.mQuestions.size(); i2++) {
            if (Objects.equals(this.mQuestions.get(i2).getId(), qNextId)) {
                this.mViewPagerIndex = i2;
                break;
            }
        }
        return false;
    }

    private void putQuestionAnswer(Map<String, Object> map) {
        String str;
        int i = this.mViewPagerIndex - 1;
        if (i <= this.mMaxPosition) {
            QuestionSureyResponse questionSureyResponse = this.mQuestions.get(i);
            String questionType = questionSureyResponse.getQuestionType();
            Integer id = questionSureyResponse.getId();
            if (TypeParams.QUESTION_CHOOSE_SINGEL.equals(questionType) || TypeParams.QUESTION_CHOOSE_MULTI_OPTION.equals(questionType) || (TypeParams.QUESTION_CHOOSE_STAR.equals(questionType) && Records.getOptionResult().get(id) != null)) {
                str = Records.getOptionResult().get(id);
            } else {
                str = "";
            }
            if (TypeParams.QUESTION_FIELD.equals(questionType) && Records.getStringDataCenter().get(id) != null) {
                str = Records.getStringDataCenter().get(id);
            }
            map.put(String.valueOf(id), str);
        }
    }

    public void changePage(int i) {
        String string;
        LogUtil.a(TAG, "nps Enter changePage index=", Integer.valueOf(i));
        this.mViewPager.setCurrentItem(i, false);
        this.mNextButton.setEnabled(false);
        int i2 = this.mMaxPosition;
        if (i < i2) {
            string = String.format(Locale.ROOT, getString(R.string.IDS_nps_question_next), UnitUtil.e(i + 1, 1, 0), UnitUtil.e(this.mQuestions.size(), 1, 0));
        } else if (i == i2) {
            string = getString(R.string.IDS_nps_submit);
            if (TypeParams.QUESTION_FIELD.equals(this.mQuestionType)) {
                this.mNextButton.setEnabled(true);
            }
        } else if (i == i2 + 1) {
            commitCenterData();
            string = getString(R.string.IDS_nps_submit);
        } else {
            string = getString(R.string.IDS_nps_submit);
            commitCenterData();
        }
        this.mNextButton.setText(string);
        List<QuestionSureyResponse> list = this.mQuestions;
        if (list != null && i < list.size() && TypeParams.QUESTION_FIELD.equals(this.mQuestions.get(i).getQuestionType())) {
            this.mNextButton.setEnabled(true);
        }
        hideSoftInputWindow();
        this.mViewPagerIndex++;
    }

    private void setMainTitle() {
        String string;
        if (HagridNpsManager.getInstance().isWeightDeviceNps()) {
            string = getResources().getString(R.string.IDS_hw_nps_bodyfat_device_main_title);
        } else if (eei.d(mgg.d(TAG))) {
            LogUtil.a(TAG, "isHonorDevice");
            string = getResources().getString(R.string.IDS_hw_nps_honor_main_title);
        } else {
            string = getResources().getString(R.string.IDS_hw_nps_identify_main_title);
        }
        this.mTitleTextView.setTitleText(string);
    }

    private void hideSoftInputWindow() {
        Object systemService = getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            View viewPeekDecorView = getWindow().peekDecorView();
            if (viewPeekDecorView != null) {
                inputMethodManager.hideSoftInputFromWindow(viewPeekDecorView.getWindowToken(), 0);
            }
        }
    }

    public void commitCenterData() {
        ReleaseLogUtil.d(TAG_RELEASE, "nps Enter commitCenterData");
        if (CommonUtil.ab(this)) {
            ReleaseLogUtil.d(TAG_RELEASE, "nps ready commit");
            setBiCommitNpsEvent("3");
            initPostData();
            postData();
            return;
        }
        qpx.e(this.mContext, R.string.IDS_network_connect_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBiCommitNpsEvent(String str) {
        QuestionSurveyDetailResponse detailResponse;
        ReleaseLogUtil.d(TAG_RELEASE, "setBiCommitNpsEvent");
        HashMap map = new HashMap(16);
        map.put("click", 1);
        if (str != null) {
            map.put("type", str);
        }
        if ("4".equals(str)) {
            map.put("page", String.valueOf(this.mViewPagerIndex));
            putQuestionAnswer(map);
        }
        if ("5".equals(str)) {
            map.put("page", String.valueOf(this.mViewPagerIndex));
        }
        if (("1".equals(str) || "2".equals(str) || "5".equals(str)) && (detailResponse = this.mHwNpsManager.getDetailResponse()) != null) {
            map.put("queryTime", Integer.valueOf(detailResponse.getQueryTimes()));
            map.put("questionType", this.mHwNpsManager.getQuestionType(detailResponse.getSurveyID()));
        }
        map.put("showDay", Integer.valueOf(this.mHwNpsManager.getShowDay()));
        String str2 = this.mActivityFrom;
        String str3 = NOTIFY;
        if (!NOTIFY.equals(str2)) {
            str3 = HOME;
        }
        map.put("from", str3);
        map.put("deviceType", lrw.g());
        map.put(MatterDataContans.KEY_MAC_ADDRESS, lrw.j());
        LogUtil.a(TAG, "setBiCommitNpsEvent map:", map);
        lmf.d().c(this.mContext, AnalyticsValue.NPS_COMMIT_QUESTION_1090039.value(), map, 0);
    }

    private void initPostData() {
        ReleaseLogUtil.d(TAG_RELEASE, "nps Enter initPostData");
        this.mIsComplete = false;
        ArrayList arrayList = new ArrayList(16);
        int size = this.mViewPagerIndex;
        if (size > this.mQuestions.size()) {
            size = this.mQuestions.size();
        }
        for (int i = 0; i < size; i++) {
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
                    String str = Records.getStringDataCenter().get(id);
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(Build.BRAND).append(":").append(Build.MODEL).append("@//").append(str);
                    createCommitAnswer.setAnswer(stringBuffer.toString());
                    arrayList.add(createCommitAnswer);
                    setIsComplete(i);
                }
            } else if (TypeParams.QUESTION_CHOOSE_SINGEL.equals(questionType) || TypeParams.QUESTION_CHOOSE_MULTI_OPTION.equals(questionType) || TypeParams.QUESTION_CHOOSE_STAR.equals(questionType)) {
                if (Records.getOptionResult().get(id) != null) {
                    CreateCommitAnswer createCommitAnswer2 = new CreateCommitAnswer();
                    createCommitAnswer2.setQuestionId(id.intValue());
                    String str2 = Records.getOptionResult().get(id);
                    LogUtil.d(TAG, "nps answer to commit:", str2);
                    createCommitAnswer2.setAnswer(str2);
                    arrayList.add(createCommitAnswer2);
                    setIsComplete(i);
                }
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "nps unsupport type");
            }
            createQuestionAnswer.setAnswers(arrayList);
            LogUtil.d(TAG, "initPostData questionAnswer.questionId=", createQuestionAnswer.getQuestionId());
        }
        toAnswerJson(arrayList);
    }

    private void toAnswerJson(List<CreateCommitAnswer> list) {
        this.mCommitAnswerGsonString = new Gson().toJson(list);
        if (list.isEmpty()) {
            LogUtil.a(TAG, "initPostData commitAnswerList isEmpty");
            this.mCommitAnswerGsonString = "";
        }
        LogUtil.a(TAG, "nps upload answer core data: ", this.mCommitAnswerGsonString);
    }

    private void setIsComplete(int i) {
        if (i == this.mQuestions.size() - 1) {
            this.mIsComplete = true;
        }
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
            hwNpsManager.submitSurveyQuestion(this.mCommitAnswerGsonString, this.mCommitCallback);
            LogUtil.a(TAG, "mCommitAnswerGsonString: ", this.mCommitAnswerGsonString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCommitSureDialog() {
        ReleaseLogUtil.d(TAG_RELEASE, "nps Enter showCommitSureDialog");
        if (this.mCommitSuccessDialog != null) {
            ReleaseLogUtil.d(TAG_RELEASE, "nps mCommitSuccessDialog is showing, return");
            return;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.mContext).b(R.string.IDS_nps_success_message_1).b(getString(R.string.IDS_settings_button_nps_ok).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.nps.activity.QuestionMainActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (QuestionMainActivity.this.isFinishing()) {
                    return;
                }
                if (!TextUtils.isEmpty(HwNpsManager.getInstance().getSharedPreference(HwNpsManager.KEY_NPS_SHOW))) {
                    LogUtil.a(QuestionMainActivity.TAG, "KEY_NPS_SHOW result = ", Integer.valueOf(HwNpsManager.getInstance().setSharedPreference(HwNpsManager.KEY_NPS_SHOW, "")));
                    if (!TextUtils.isEmpty(HwNpsManager.getInstance().getSharedPreference(HwNpsManager.MESSAGE_NPS_ID))) {
                        ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).setMessageRead(HwNpsManager.getInstance().getSharedPreference(HwNpsManager.MESSAGE_NPS_ID));
                    }
                }
                if (QuestionMainActivity.this.mCommitSuccessDialog != null && QuestionMainActivity.this.mCommitSuccessDialog.isShowing()) {
                    ReleaseLogUtil.d(QuestionMainActivity.TAG_RELEASE, "nps close mCommitSuccessDialog");
                    QuestionMainActivity.this.mCommitSuccessDialog.cancel();
                    QuestionMainActivity.this.mCommitSuccessDialog = null;
                }
                QuestionMainActivity.this.finish();
            }
        }).b();
        this.mCommitSuccessDialog = customTextAlertDialogB;
        customTextAlertDialogB.setCanceledOnTouchOutside(false);
        if (isFinishing()) {
            return;
        }
        this.mCommitSuccessDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateQuestionSurveyTable() {
        ReleaseLogUtil.d(TAG_RELEASE, "nps Enter updateQuestionSurveyTable");
        QuestionSurveyTable questionSurveyTable = this.mQuestionSurveyTable;
        if (questionSurveyTable == null) {
            return;
        }
        questionSurveyTable.setLastSurveyTime(new Date().getTime());
        HwNpsManager hwNpsManager = this.mHwNpsManager;
        if (hwNpsManager != null) {
            hwNpsManager.updateQuestionSurveyTable(this.mQuestionSurveyTable);
        }
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
        ClickHomeReceiver clickHomeReceiver;
        super.onDestroy();
        HealthViewPager healthViewPager = this.mViewPager;
        if (healthViewPager != null) {
            healthViewPager.setAdapter(null);
            this.mViewPager = null;
        }
        Context context = this.mContext;
        if (context == null || (clickHomeReceiver = this.mClickHomeReceiver) == null) {
            return;
        }
        try {
            context.unregisterReceiver(clickHomeReceiver);
        } catch (IllegalArgumentException unused) {
            LogUtil.e(TAG, "unregisterReceiver IllegalArgumentException");
        }
        this.mClickHomeReceiver = null;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("mViewPagerIndex", this.mViewPagerIndex);
    }

    public void setIsSelect(boolean z) {
        this.mIsSelected = z;
    }

    public void setButtonClickable(boolean z) {
        this.mNextButton.setEnabled(z);
    }

    public void setIsCommit(boolean z) {
        int i = this.mViewPagerIndex;
        if (i > this.mMaxPosition || z) {
            this.mNextButton.setText(getString(R.string.IDS_nps_submit));
            return;
        }
        this.mNextButton.setText(String.format(Locale.ROOT, getString(R.string.IDS_nps_question_next), UnitUtil.e(i, 1, 0), UnitUtil.e(this.mQuestions.size(), 1, 0)));
    }
}
