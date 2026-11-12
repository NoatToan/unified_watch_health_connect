package com.huawei.ui.device.activity.questionsuggestions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import com.huawei.ui.device.views.device.RoundProgressImageView;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.rcr;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
abstract class BaseQuestionSuggestionActivity extends BaseActivity implements View.OnClickListener {
    static final String CURRENT_PROCESS_DESCRIPTION_KEY = "CURRENT_PROCESS_DESCRIPTION";
    static final String CURRENT_PROCESS_KEY = "CURRENT_PROCESS";
    static final String SPILT = "/";
    static final int STATUS_FAILED = 2;
    static final int STATUS_PROGRESS = 1;
    static final int STATUS_SUCCESS = 3;
    private static final String TAG_RELEASE = "R_BaseQuestionSuggestionActivity";
    HealthButton mButton;
    HealthTextView mCircleTipText;
    Context mContext;
    HealthTextView mFeedBackText;
    HealthCheckBox mLogEnhancementModeCheckbox;
    Handler mLogHandler;
    RelativeLayout mPercentSuggestionRelative;
    HealthTextView mPercentText;
    HealthTextView mStatusTipContentText;
    HealthTextView mStatusTipText;
    LinearLayout mSuggestionFailedLinear;
    RoundProgressImageView mSuggestionProgressImageView;
    RelativeLayout mSwitchLayout;
    ImageView mTopSuggestionImageView;
    RelativeLayout mTopSuggestionRelative;
    String mLastProgressDescription = "";
    String mErrorTipContent = "";

    abstract void onAgreeAndContinueClick();

    abstract void openQuestionSuggestion();

    abstract void processIntentData(Intent intent);

    BaseQuestionSuggestionActivity() {
    }

    /* JADX INFO: loaded from: classes16.dex */
    static class c extends Handler {
        private final WeakReference<BaseQuestionSuggestionActivity> e;

        private c(BaseQuestionSuggestionActivity baseQuestionSuggestionActivity) {
            this.e = new WeakReference<>(baseQuestionSuggestionActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            BaseQuestionSuggestionActivity baseQuestionSuggestionActivity = this.e.get();
            if (baseQuestionSuggestionActivity == null || baseQuestionSuggestionActivity.isFinishing()) {
                ReleaseLogUtil.d(BaseQuestionSuggestionActivity.TAG_RELEASE, "Activity is finishing or null.");
                return;
            }
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    baseQuestionSuggestionActivity.showSuggestionErrorMsg();
                    return;
                } else if (i != 3) {
                    ReleaseLogUtil.d(BaseQuestionSuggestionActivity.TAG_RELEASE, "LogHandler hit default.");
                    return;
                } else {
                    baseQuestionSuggestionActivity.openQuestionSuggestion();
                    baseQuestionSuggestionActivity.onFinish();
                    return;
                }
            }
            Bundle data = message.getData();
            if (data == null) {
                return;
            }
            int i2 = data.getInt(BaseQuestionSuggestionActivity.CURRENT_PROCESS_KEY);
            String string = data.getString(BaseQuestionSuggestionActivity.CURRENT_PROCESS_DESCRIPTION_KEY);
            ReleaseLogUtil.d(BaseQuestionSuggestionActivity.TAG_RELEASE, "LogHandler progress is: ", Integer.valueOf(i2), ", progressDescription is: ", string);
            if (StringUtils.j(string)) {
                if (string.equals(baseQuestionSuggestionActivity.mLastProgressDescription)) {
                    baseQuestionSuggestionActivity.showBandProgress(i2);
                    return;
                }
                baseQuestionSuggestionActivity.showBandProgress(i2);
                baseQuestionSuggestionActivity.mCircleTipText.setText(string);
                baseQuestionSuggestionActivity.mLastProgressDescription = string;
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReleaseLogUtil.d(TAG_RELEASE, "onCreate.");
        this.mContext = this;
        this.mLogHandler = new c();
        setContentView(R.layout.activity_question_suggestion);
        initView();
        processIntentData(getIntent());
    }

    private void initView() {
        ReleaseLogUtil.d(TAG_RELEASE, "Enter initView!");
        this.mTopSuggestionRelative = (RelativeLayout) qsp.a(this, R.id.top_suggestion_layout);
        this.mTopSuggestionImageView = (ImageView) qsp.a(this, R.id.top_suggestion_imageview);
        this.mSuggestionProgressImageView = (RoundProgressImageView) qsp.a(this, R.id.center_suggestion_circle);
        this.mPercentSuggestionRelative = (RelativeLayout) qsp.a(this, R.id.relative_percent_suggestion);
        this.mLogEnhancementModeCheckbox = (HealthCheckBox) qsp.a(this, R.id.log_enhancement_mode_checkbox);
        this.mPercentText = (HealthTextView) qsp.a(this, R.id.text_percent);
        this.mCircleTipText = (HealthTextView) qsp.a(this, R.id.text_circle_tip);
        this.mSuggestionFailedLinear = (LinearLayout) qsp.a(this, R.id.linear_suggestion_failed);
        this.mStatusTipText = (HealthTextView) qsp.a(this, R.id.text_status_tip);
        this.mStatusTipContentText = (HealthTextView) qsp.a(this, R.id.text_status_tip_content);
        this.mButton = (HealthButton) qsp.a(this, R.id.button_suggestion);
        this.mFeedBackText = (HealthTextView) qsp.a(this, R.id.text_feedback_tip);
        RelativeLayout relativeLayout = (RelativeLayout) qsp.a(this, R.id.log_enhancement_mode_switch_layout);
        this.mSwitchLayout = relativeLayout;
        relativeLayout.setVisibility(8);
        this.mButton.setOnClickListener(this);
        this.mFeedBackText.setOnClickListener(this);
        this.mTopSuggestionRelative.setVisibility(8);
        this.mTopSuggestionImageView.setVisibility(0);
        this.mStatusTipText.setText(R.string.IDS_device_release_user_profile_log_collect);
        this.mStatusTipContentText.setText(R.string.IDS_device_release_log_collect_tip);
        this.mButton.setVisibility(0);
        this.mButton.setClickable(true);
        this.mButton.setBackground(getResources().getDrawable(R.drawable.button_background_emphasize));
        this.mButton.setText(R.string.IDS_device_release_user_profile_agree_and_continue);
        this.mFeedBackText.setText(R.string.IDS_device_release_user_profile_feedback_question);
        rcr.a(this.mButton, this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.e(view)) {
            ReleaseLogUtil.e(TAG_RELEASE, "button click too fast.");
            return;
        }
        if (view == this.mButton) {
            onAgreeAndContinueClick();
        } else if (view == this.mFeedBackText) {
            openQuestionSuggestion();
            onFinish();
        } else {
            ReleaseLogUtil.d(TAG_RELEASE, "other onclick: ", view);
        }
    }

    void showLogsCollecting(String str) {
        this.mTopSuggestionRelative.setVisibility(0);
        this.mTopSuggestionImageView.setVisibility(8);
        this.mPercentSuggestionRelative.setVisibility(0);
        this.mSuggestionFailedLinear.setVisibility(8);
        this.mStatusTipContentText.setText(str);
        this.mButton.setVisibility(4);
        showBandProgress(0);
        this.mStatusTipText.setText(R.string.IDS_device_release_user_profile_log_collecting);
        this.mFeedBackText.setText(R.string.IDS_device_release_user_profile_no_collect_feedback_question);
    }

    void deleteLogFiles(File file) {
        File[] fileArrListFiles;
        if (file == null || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2 != null && file2.exists()) {
                if (file2.isFile() && !file2.getName().contains("_WearableBeta_app_bigdata.log")) {
                    ReleaseLogUtil.d(TAG_RELEASE, "delete log file: ", Boolean.valueOf(file2.delete()));
                } else {
                    deleteLogFiles(file2);
                }
            }
        }
    }

    void showSuggestionErrorMsg() {
        if (this.mContext == null) {
            return;
        }
        showBandProgress(0);
        this.mCircleTipText.setText("");
        this.mTopSuggestionRelative.setVisibility(0);
        this.mTopSuggestionImageView.setVisibility(8);
        this.mPercentSuggestionRelative.setVisibility(8);
        this.mSuggestionFailedLinear.setVisibility(0);
        this.mStatusTipText.setText(R.string.IDS_device_release_user_profile_log_collect_failure);
        this.mStatusTipContentText.setText(this.mErrorTipContent);
        this.mButton.setVisibility(0);
        this.mButton.setClickable(true);
        this.mButton.setBackground(getResources().getDrawable(R.drawable.button_background_emphasize));
        this.mButton.setText(R.string.IDS_retry);
        this.mFeedBackText.setText(R.string.IDS_device_release_user_profile_no_collect_feedback_question);
        rcr.a(this.mButton, this);
        ReleaseLogUtil.a(TAG_RELEASE, "showSuggestionErrorMsg() get device log failed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showBandProgress(int i) {
        SpannableString spannableStringB = UnitUtil.b(this.mContext, "[\\d]", UnitUtil.e(i, 2, 0), R.style.log_collecting_percent_number_style_num, R.style.log_collecting_percent_number_style_sign);
        ReleaseLogUtil.d(TAG_RELEASE, "showBandProgress() percentText is: ", spannableStringB);
        this.mPercentText.setText(spannableStringB);
        this.mSuggestionProgressImageView.e(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFinish() {
        setIntent(null);
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ReleaseLogUtil.d(TAG_RELEASE, "onDestroy");
    }
}
