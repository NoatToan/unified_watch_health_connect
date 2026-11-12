package com.huawei.healthcloud.plugintrack.ui.viewholder;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.huawei.health.basesport.sportui.OnEndCountdownListener;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ive;
import defpackage.jaq;
import defpackage.jau;
import defpackage.jbc;
import defpackage.pqj;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes10.dex */
public class CountdownDialog {
    public static final int COUNT_DOWN_NUMBER_FOR_OUT_GOING = 3;
    public static final int COUNT_DOWN_NUMBER_FOR_ROPE = 5;
    private static final int DELAY_TIME = 150;
    private static final int[] ICONS_FROM_FIVE = {R.drawable.track_ic_health_countdown_go, R.drawable.track_ic_health_countdown_num1, R.drawable.track_ic_health_countdown_num2, R.drawable.track_ic_health_countdown_num3, R.drawable.track_ic_health_countdown_num4, R.drawable.track_ic_health_countdown_num5};
    private static final int MAX_COUNTDOWN_NUMBER = 6;
    private static final String TAG = "Track_CountdownDialog";
    private AnimatorSet mAnimatorSet;
    private Context mContext;
    private boolean mIsNotArabicNum;
    private String mModuleID;
    private ImageView mNum;
    private HealthTextView mNumText;
    private View mRootView;
    private ImageView mRound;
    private StorageParams mStorageParams;
    private jaq mTrackSharedPreferenceUtil;
    private OnEndCountdownListener mEndListener = null;
    private int mCountdown = 5;
    private boolean mIsGoEnable = false;

    public CountdownDialog(Context context, View view) {
        if (context == null || view == null) {
            throw new RuntimeException("Invalid param");
        }
        this.mContext = context;
        this.mRootView = view;
        this.mStorageParams = new StorageParams();
        this.mModuleID = Integer.toString(20002);
        this.mTrackSharedPreferenceUtil = new jaq(BaseApplication.getContext(), this.mStorageParams, this.mModuleID);
        this.mIsNotArabicNum = LanguageUtil.aw(this.mContext);
        initView();
    }

    public void addEndCountdown(OnEndCountdownListener onEndCountdownListener) {
        this.mEndListener = onEndCountdownListener;
    }

    private void initView() {
        this.mNum = (ImageView) this.mRootView.findViewById(R.id.track_conut_down_num);
        this.mRound = (ImageView) this.mRootView.findViewById(R.id.track_conut_down_num_round);
        this.mNumText = (HealthTextView) this.mRootView.findViewById(R.id.track_conut_down_num_text);
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.mContext, R.animator.track_map_conut_down_num);
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(this.mContext, R.animator.track_map_conut_down_round);
        if (this.mIsNotArabicNum) {
            this.mNumText.setVisibility(0);
            animatorLoadAnimator.setTarget(this.mNumText);
        } else {
            this.mNum.setVisibility(0);
            animatorLoadAnimator.setTarget(this.mNum);
        }
        animatorLoadAnimator2.setTarget(this.mRound);
        AnimatorSet animatorSet = new AnimatorSet();
        this.mAnimatorSet = animatorSet;
        animatorSet.playTogether(animatorLoadAnimator, animatorLoadAnimator2);
        this.mAnimatorSet.addListener(new Animator.AnimatorListener() { // from class: com.huawei.healthcloud.plugintrack.ui.viewholder.CountdownDialog.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                CountdownDialog countdownDialog = CountdownDialog.this;
                int i = countdownDialog.mCountdown - 1;
                countdownDialog.mCountdown = i;
                countdownDialog.countdown(i);
            }
        });
    }

    public void setTimeStart(int i) {
        this.mCountdown = i;
    }

    public void enableGo() {
        this.mIsGoEnable = true;
    }

    public void startCountdown() {
        this.mRootView.postDelayed(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.viewholder.CountdownDialog.5
            @Override // java.lang.Runnable
            public void run() {
                CountdownDialog.this.mRound.setVisibility(0);
                CountdownDialog countdownDialog = CountdownDialog.this;
                countdownDialog.countdown(countdownDialog.mCountdown);
            }
        }, 150L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void countdown(int i) {
        LogUtil.a(TAG, "countdown() :", Integer.valueOf(i));
        if (i < ((this.mIsNotArabicNum || !this.mIsGoEnable) ? 1 : 0)) {
            if (this.mEndListener != null) {
                jau.c().e(false);
                this.mEndListener.endCountdown();
                return;
            }
            return;
        }
        sendBroadcastToVoiceService(i);
        if (this.mIsNotArabicNum) {
            this.mNumText.setText(UnitUtil.e(i, 1, 0));
        } else {
            this.mNum.setImageResource(ICONS_FROM_FIVE[i]);
        }
        this.mAnimatorSet.start();
    }

    private void sendBroadcastToVoiceService(int i) {
        if (i > 6 || i < 0) {
            return;
        }
        jau.c().e(true);
        if (isVoiceValid(ive.c().b()) && isNeedVoice()) {
            Bundle bundle = new Bundle();
            bundle.putString("voiceType", "intelligentVoice");
            bundle.putInt("intelligentVoice", i);
            jau.c().d(new jbc(20, bundle));
        }
    }

    private boolean isNeedVoice() {
        if (pqj.b().b(this.mContext)) {
            return true;
        }
        return LanguageUtil.o(this.mContext) && !UnitUtil.f();
    }

    private boolean isVoiceValid(int i) {
        if (i == 2) {
            return true;
        }
        if (CommonUtil.j(SharedPreferenceManager.e(this.mContext, Integer.toString(20002), "map_tracking_sport_type")) == 283) {
            return jaq.d();
        }
        return jaq.c() == 1;
    }
}
