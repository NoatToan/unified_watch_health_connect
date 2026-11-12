package com.huawei.health.basesport.controls;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.basefitnessadvice.R;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.pao;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseControlButton extends RelativeLayout {
    private static final int ANIMATION_RTL_TIME = 200;
    private static final int ANIMATION_RTL_TIME_ZERO = 0;
    private static final String PROPERTY_NAME = "translationX";
    private static final String TAG = "Track_BaseControlButton";
    protected Context mContext;
    protected Handler mHandler;
    protected int mMoveLength;
    protected SportControlButton mPauseButton;
    protected SportControlButton mPlayButton;
    protected CircleProgressButton mStopButton;
    protected ImageView mVoiceIcon;
    protected int mVoiceIconMoveLength;

    protected abstract void onPauseClickEvents();

    protected abstract void onPlayClickEvents();

    protected abstract void onStopClickEvents();

    protected abstract void setMoveLength();

    public BaseControlButton(Context context) {
        super(context);
        this.mHandler = new a(Looper.getMainLooper(), this);
        initView(context);
    }

    public BaseControlButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHandler = new a(Looper.getMainLooper(), this);
        initView(context);
    }

    public BaseControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHandler = new a(Looper.getMainLooper(), this);
        initView(context);
    }

    public BaseControlButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mHandler = new a(Looper.getMainLooper(), this);
    }

    private void initView(Context context) {
        if (context == null) {
            LogUtil.e(TAG, "context is null");
            return;
        }
        this.mContext = context;
        View.inflate(context, R.layout.control_button_layout, this);
        this.mStopButton = (CircleProgressButton) findViewById(R.id.track_main_page_btn_stop_indoor);
        SportControlButton sportControlButton = (SportControlButton) findViewById(R.id.track_main_page_btn_pause);
        this.mPauseButton = sportControlButton;
        sportControlButton.setOnClickListener(new View.OnClickListener() { // from class: ddw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31687b.m823xb9c555ee(view);
            }
        });
        SportControlButton sportControlButton2 = (SportControlButton) findViewById(R.id.track_main_page_btn_play);
        this.mPlayButton = sportControlButton2;
        sportControlButton2.setOnClickListener(new View.OnClickListener() { // from class: deb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31698a.m824xbafba8cd(view);
            }
        });
        this.mStopButton.d(new CircleProgressButton.CircleProcessListener() { // from class: com.huawei.health.basesport.controls.BaseControlButton.5
            @Override // com.huawei.health.basesport.controls.CircleProgressButton.CircleProcessListener
            public void onCancel() {
            }

            @Override // com.huawei.health.basesport.controls.CircleProgressButton.CircleProcessListener
            public void onStarted() {
            }

            @Override // com.huawei.health.basesport.controls.CircleProgressButton.CircleProcessListener
            public void onFinished() {
                BaseControlButton.this.onStopClickEvents();
            }
        });
        this.mPauseButton.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.basesport.controls.BaseControlButton.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                BaseControlButton.this.initMoveLength();
                BaseControlButton.this.setMoveLength();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$initView$0$com-huawei-health-basesport-controls-BaseControlButton, reason: not valid java name */
    public /* synthetic */ void m823xb9c555ee(View view) {
        onPauseClickEvents();
    }

    /* JADX INFO: renamed from: lambda$initView$1$com-huawei-health-basesport-controls-BaseControlButton, reason: not valid java name */
    public /* synthetic */ void m824xbafba8cd(View view) {
        onPlayClickEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initMoveLength() {
        this.mMoveLength = pao.e(this.mContext, 8.0f) + (this.mPauseButton.getWidth() / 2);
    }

    public void showBtnStopAndPlay() {
        this.mHandler.sendEmptyMessage(101);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hidePauseAndShowPlayBtn(int i) {
        this.mPauseButton.setVisibility(4);
        this.mPlayButton.setVisibility(0);
        this.mStopButton.setVisibility(0);
        LogUtil.a(TAG, "onGlobalLayout");
        if (LanguageUtil.ba(this.mContext)) {
            slideView(0, 0 - this.mMoveLength, i, this.mStopButton, false);
            slideView(0, this.mMoveLength, i, this.mPlayButton, false);
            moveVoiceIcon(0, 0 - this.mVoiceIconMoveLength, i);
        } else {
            slideView(0, this.mMoveLength, i, this.mStopButton, false);
            slideView(0, 0 - this.mMoveLength, i, this.mPlayButton, false);
            moveVoiceIcon(0, this.mVoiceIconMoveLength, i);
        }
    }

    public void foldBtnStopAndPlay() {
        this.mHandler.sendEmptyMessage(100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onlyShowStopBtn() {
        this.mPauseButton.setVisibility(8);
        this.mPlayButton.setVisibility(8);
        this.mStopButton.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hidePlayAndShowPauseBtn() {
        this.mStopButton.setProgressZero();
        this.mStopButton.d(true);
        if (LanguageUtil.ba(this.mContext)) {
            slideView(this.mMoveLength, 0, 200, this.mPlayButton, true);
            slideView(0 - this.mMoveLength, 0, 200, this.mStopButton, true);
            moveVoiceIcon(0 - this.mVoiceIconMoveLength, 0, 200);
        } else {
            slideView(this.mMoveLength, 0, 200, this.mStopButton, true);
            slideView(0 - this.mMoveLength, 0, 200, this.mPlayButton, true);
            moveVoiceIcon(this.mVoiceIconMoveLength, 0, 200);
        }
    }

    private void moveVoiceIcon(int i, int i2, int i3) {
        ImageView imageView;
        if (this.mVoiceIconMoveLength <= 0 || (imageView = this.mVoiceIcon) == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "translationX", i, i2);
        objectAnimatorOfFloat.setDuration(i3);
        objectAnimatorOfFloat.start();
    }

    public void slideView(int i, int i2, int i3, final View view, final boolean z) {
        if (view == null) {
            LogUtil.e(TAG, "slideView view is null");
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", i, i2);
        objectAnimatorOfFloat.setDuration(i3);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.huawei.health.basesport.controls.BaseControlButton.4
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
                BaseControlButton.this.slideViewEnd(z, view);
            }
        });
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void slideViewEnd(boolean z, View view) {
        if (z) {
            view.setVisibility(8);
            if (view.getId() == R.id.track_main_page_btn_stop_indoor) {
                this.mPauseButton.setVisibility(0);
                return;
            }
            return;
        }
        view.setVisibility(0);
        this.mPauseButton.setVisibility(8);
        if (view.getId() == R.id.track_main_page_btn_stop_indoor) {
            this.mStopButton.d(false);
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    static class a extends BaseHandler<BaseControlButton> {
        a(Looper looper, BaseControlButton baseControlButton) {
            super(looper, baseControlButton);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(BaseControlButton baseControlButton, Message message) {
            if (message != null) {
                switch (message.what) {
                    case 100:
                        baseControlButton.hidePlayAndShowPauseBtn();
                        break;
                    case 101:
                        baseControlButton.hidePauseAndShowPlayBtn(200);
                        break;
                    case 103:
                        baseControlButton.onlyShowStopBtn();
                        break;
                    case 104:
                        baseControlButton.hidePauseAndShowPlayBtn(0);
                        break;
                }
            }
            LogUtil.j(BaseControlButton.TAG, "handleMessage message is null");
        }
    }
}
