package com.huawei.ui.main.stories.nps.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.nps.interactors.mode.QuestionSureyResponse;
import com.huawei.ui.main.stories.nps.interactors.mode.QuestionSurveyChooseResponse;
import com.huawei.ui.main.stories.nps.interactors.mode.Records;
import com.huawei.ui.main.stories.nps.interactors.util.ParamsUtils;
import defpackage.qsp;
import defpackage.uvf;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class RatingFragment extends BaseFragment {
    private static final int ICON_ASTERISK_WIDTH = 7;
    private static final String TAG = "RatingFragment";
    private int mNumber;
    private List<QuestionSurveyChooseResponse> mQuestionChooseResponses;
    private QuestionSureyResponse mQuestionSurveyResponse;
    private RatingBar mRatingBar;
    private HealthTextView mRatingText;
    private HealthTextView mTitle;

    public RatingFragment() {
    }

    public RatingFragment(QuestionSureyResponse questionSureyResponse, int i) {
        this.mQuestionSurveyResponse = questionSureyResponse;
        this.mNumber = i;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_nps_question_rating, viewGroup, false);
        if (this.mQuestionSurveyResponse != null && (getActivity() instanceof QuestionMainActivity)) {
            this.mQuestionChooseResponses = this.mQuestionSurveyResponse.getChoose();
            this.mTitle = (HealthTextView) qsp.a(viewInflate, R.id.rating_title);
            this.mRatingBar = (RatingBar) qsp.a(viewInflate, R.id.rating_bar);
            this.mRatingText = (HealthTextView) qsp.a(viewInflate, R.id.rating_text);
            this.mRatingBar.setNumStars(this.mQuestionChooseResponses.size());
            this.mRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: com.huawei.ui.main.stories.nps.activity.RatingFragment$$ExternalSyntheticLambda0
                @Override // android.widget.RatingBar.OnRatingBarChangeListener
                public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
                    this.f$0.m1733xd6179d3b(ratingBar, f, z);
                }
            });
            setTitleText();
        }
        return viewInflate;
    }

    /* JADX INFO: renamed from: lambda$onCreateView$0$com-huawei-ui-main-stories-nps-activity-RatingFragment, reason: not valid java name */
    /* synthetic */ void m1733xd6179d3b(RatingBar ratingBar, float f, boolean z) {
        LogUtil.a(TAG, "OnRatingBarChangeListener rating", Float.valueOf(f));
        QuestionMainActivity questionMainActivity = (QuestionMainActivity) getActivity();
        questionMainActivity.setIsSelect(true);
        questionMainActivity.setButtonClickable(true);
        int i = (int) f;
        if (this.mQuestionSurveyResponse == null) {
            LogUtil.a(TAG, "OnRatingBarChangeListener error");
            return;
        }
        if (i == 0) {
            LogUtil.a(TAG, "score is error.");
            questionMainActivity.setIsSelect(false);
            questionMainActivity.setButtonClickable(false);
            this.mRatingText.setText("");
            return;
        }
        if (CollectionUtils.a(this.mQuestionChooseResponses) || this.mQuestionChooseResponses.size() < i) {
            return;
        }
        int i2 = i - 1;
        this.mRatingText.setText(this.mQuestionChooseResponses.get(i2).getRemark());
        Records.getOptionResult().put(this.mQuestionSurveyResponse.getId(), String.valueOf(i));
        Records.getOptionNextId().put(this.mQuestionSurveyResponse.getId(), this.mQuestionChooseResponses.get(i2).getNextId());
    }

    private void setTitleText() {
        String str = this.mNumber + ". " + this.mQuestionSurveyResponse.getQuestion() + ParamsUtils.getQuestionTypeParams(this.mQuestionSurveyResponse.getQuestionType());
        if (!this.mQuestionSurveyResponse.isRequired()) {
            this.mTitle.setText(str);
            return;
        }
        String str2 = str + " ";
        SpannableString spannableString = new SpannableString(str2);
        Drawable drawable = getResources().getDrawable(R.drawable.icon_asterisk);
        int iDipToPix = dipToPix(7.0f);
        drawable.setBounds(0, 0, iDipToPix, iDipToPix);
        spannableString.setSpan(new uvf(drawable, 0, 0), str2.length() - 1, str2.length(), 1);
        this.mTitle.setText(spannableString);
    }

    private int dipToPix(float f) {
        return (int) ((f * BaseApplication.getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }
}
