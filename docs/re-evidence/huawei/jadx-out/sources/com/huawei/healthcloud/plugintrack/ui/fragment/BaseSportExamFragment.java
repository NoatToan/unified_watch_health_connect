package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.C;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.basesport.sportui.OnEndCountdownListener;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.IOnBackPressed;
import com.huawei.healthcloud.plugintrack.ui.activity.SportBaseActivity;
import com.huawei.healthcloud.plugintrack.ui.view.CanvasChangeView;
import com.huawei.healthcloud.plugintrack.ui.view.CircleProgressButton;
import com.huawei.healthcloud.plugintrack.ui.view.SquareProgress;
import com.huawei.healthcloud.plugintrack.ui.view.ToolsLayout;
import com.huawei.healthcloud.plugintrack.ui.view.glrender.CameraGlView;
import com.huawei.healthcloud.plugintrack.ui.viewholder.CountdownDialog;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.ive;
import defpackage.jpm;
import defpackage.jqi;
import defpackage.ppq;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseSportExamFragment extends BaseSportingFragment implements IOnBackPressed {
    private static final int CLICK_INTERVAL = 600;
    private static final int MESSAGE_SEND_RESET_VIEW = 10001;
    protected HealthImageView mBackImg;
    private View mContentView;
    private CountdownDialog mCountdownDialog;
    protected View mCountdownView;
    protected View mDataPanelLayout;
    protected HealthTextView mPortraitPreTipsTwo;
    protected HealthTextView mPreTips;
    protected CameraGlView mRenderView;
    protected CanvasChangeView mSportDataView;
    protected ViewGroup mSportPreView;
    private int mSportType;
    protected SquareProgress mSquareProgress;
    protected ImageButton mSwitchCameraInSportButton;
    protected HealthTextView mSwitchCameraPopText;
    protected ImageButton mSwitchCameraPreSportButton;
    private LinearLayout mSwitchScreenBg;
    protected CustomTitleBar mTitleBar;
    protected ViewGroup mToIntroduceButtonLayout;
    protected ToolsLayout mToolsLayout;
    protected SportExamViewModel mViewModel;
    protected boolean mIsStartTheTest = false;
    private final Handler mHandler = new b(Looper.getMainLooper(), this);

    protected abstract void dealProgressEnd();

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public abstract int getLayoutId();

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public abstract String getLogTag();

    protected abstract SportExamViewModel getViewModel();

    protected abstract boolean isSupportLandScreen();

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initView(View view) {
        if (view == null) {
            LogUtil.j(getLogTag(), "view == null");
            return;
        }
        this.mContentView = view;
        BaseActivity.cancelLayoutById(view);
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        view.setPaddingRelative(((Integer) safeRegionWidth.first).intValue(), view.getPaddingTop(), ((Integer) safeRegionWidth.second).intValue(), view.getPaddingBottom());
        initSportPreView(view);
        initSportDataView(view);
        this.mRenderView = (CameraGlView) view.findViewById(R.id.camera_pre_view);
        initCameraView(view);
        initCountDownDialog(view);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (isSupportLandScreen()) {
            switchScreenTips();
            LogUtil.a(getTag(), "onConfigurationChanged:,", Integer.valueOf(getResources().getConfiguration().orientation));
            setSurfaceRotation();
        }
    }

    public void setSurfaceRotation() {
        SportExamViewModel sportExamViewModel;
        if (getActivity() == null || (sportExamViewModel = this.mViewModel) == null) {
            return;
        }
        if (!sportExamViewModel.isAlreadyInit()) {
            ReleaseLogUtil.d(getTag(), "changeOrientation NO isAlreadyInit");
            return;
        }
        Display defaultDisplay = getActivity().getWindowManager().getDefaultDisplay();
        if (defaultDisplay != null) {
            int rotation = defaultDisplay.getRotation();
            ReleaseLogUtil.d(getTag(), "setSurfaceRotation result:", Integer.valueOf(ppq.c().setSurfaceRotation(rotation)), "rotation:", Integer.valueOf(rotation));
        }
    }

    private void initSportDataView(View view) {
        int iS;
        this.mSportDataView = (CanvasChangeView) view.findViewById(R.id.sport_data_view);
        this.mDataPanelLayout = view.findViewById(R.id.data_panel_layout);
        if (isSupportLandScreen()) {
            iS = getResources().getDimensionPixelSize(R.dimen.health_common_16dp);
        } else {
            iS = qrs.s(view.getContext());
        }
        View view2 = this.mDataPanelLayout;
        view2.setPaddingRelative(view2.getPaddingStart(), iS, this.mDataPanelLayout.getPaddingEnd(), this.mDataPanelLayout.getPaddingBottom());
        if (isSupportLandScreen()) {
            this.mSwitchScreenBg = (LinearLayout) view.findViewById(R.id.switch_screen_bg);
        }
        this.mToolsLayout = (ToolsLayout) view.findViewById(R.id.sport_control_layout);
    }

    private void initCountDownDialog(View view) {
        CountdownDialog countdownDialog = new CountdownDialog(getContext(), view);
        this.mCountdownDialog = countdownDialog;
        countdownDialog.setTimeStart(3);
        this.mCountdownDialog.addEndCountdown(new OnEndCountdownListener() { // from class: jmi
            @Override // com.huawei.health.basesport.sportui.OnEndCountdownListener
            public final void endCountdown() {
                this.d.endCountDown();
            }
        });
        View viewFindViewById = view.findViewById(R.id.track_main_page_perm_bg);
        this.mCountdownView = viewFindViewById;
        viewFindViewById.setBackgroundResource(R.color.transparent);
    }

    public void endCountDown() {
        SportExamViewModel sportExamViewModel = this.mViewModel;
        if (sportExamViewModel != null) {
            sportExamViewModel.onStartSport();
        }
    }

    private void initSportPreView(View view) {
        this.mSportPreView = (ViewGroup) view.findViewById(R.id.pre_sport_layout);
        CustomTitleBar customTitleBar = (CustomTitleBar) view.findViewById(R.id.title_bar);
        this.mTitleBar = customTitleBar;
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: jmg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.lambda$initSportPreView$0(view2);
            }
        });
        this.mTitleBar.setLeftButtonDrawable(ContextCompat.getDrawable(view.getContext(), R.drawable.write_back), qre.f(R.string.accessibility_go_back));
        SquareProgress squareProgress = (SquareProgress) view.findViewById(R.id.pre_progress);
        this.mSquareProgress = squareProgress;
        squareProgress.setPaddingRelative(squareProgress.getPaddingStart(), this.mSquareProgress.getPaddingTop(), this.mSquareProgress.getPaddingEnd(), this.mSquareProgress.getPaddingBottom());
        this.mPreTips = (HealthTextView) view.findViewById(R.id.use_tips_1);
        this.mPortraitPreTipsTwo = (HealthTextView) view.findViewById(R.id.use_tips_2);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.how_to_use_layout);
        this.mToIntroduceButtonLayout = viewGroup;
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: jmj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f38730c.lambda$initSportPreView$1(view2);
            }
        });
        HealthImageView healthImageView = (HealthImageView) view.findViewById(R.id.back_img);
        this.mBackImg = healthImageView;
        if (healthImageView != null) {
            healthImageView.setOnClickListener(new View.OnClickListener() { // from class: jmh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f38729c.lambda$initSportPreView$2(view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSportPreView$0(View view) {
        onTitleBarBackBtnClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSportPreView$1(View view) {
        startUserGuidance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSportPreView$2(View view) {
        onTitleBarBackBtnClicked();
    }

    public void startUserGuidance() {
        FragmentActivity activity = getActivity();
        if (activity instanceof SportBaseActivity) {
            ((SportBaseActivity) activity).c(1);
        }
    }

    private void onTitleBarBackBtnClicked() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            LogUtil.e(getTag(), "onTitleBarBackBtnClicked activity is null");
        } else {
            onBackPressed();
            activity.finish();
        }
    }

    public void onBackPressed() {
        removePreProgressObservers();
    }

    private void removePreProgressObservers() {
        SportExamViewModel sportExamViewModel = this.mViewModel;
        if (sportExamViewModel == null) {
            LogUtil.j(getTag(), "removePreProgressObservers, mViewModel is null");
        } else {
            sportExamViewModel.removeSportDataObservers("preSportProgress", this);
        }
    }

    private void initCameraView(View view) {
        this.mSwitchCameraPreSportButton = (ImageButton) view.findViewById(R.id.switch_camera_pre_sport_button);
        this.mSwitchCameraInSportButton = (ImageButton) view.findViewById(R.id.switch_camera_in_sport_button);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initViewModel() {
        SportExamViewModel viewModel = getViewModel();
        this.mViewModel = viewModel;
        int sportType = viewModel.getSportType();
        this.mSportType = sportType;
        if (sportType != 400002) {
            this.mCountdownDialog.enableGo();
        }
        if (!this.mViewModel.getIsFirstInit()) {
            this.mViewModel.enableCanStart(true);
        }
        this.mViewModel.observeSportLifeCycle(getLogTag(), this);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment
    public void initData() {
        this.mRenderView.setRadio(0.4f);
        this.mRenderView.setIsOptimalSize(true);
        this.mRenderView.setOnPreviewListener(this.mViewModel);
        this.mRenderView.c(true);
        setupSwitchCameraButton();
        initFirstPop();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getActivity() != null) {
            getActivity().getWindow().addFlags(128);
            getActivity().getWindow().addFlags(1024);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        LogUtil.a(getLogTag(), "onPause()");
        super.onPause();
        if (getActivity() != null) {
            getActivity().getWindow().clearFlags(128);
        }
    }

    private void setupSwitchCameraButton() {
        boolean zE = SportSupportUtil.e();
        boolean zC = SportSupportUtil.c();
        if (zE && zC) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: jmf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f38728c.lambda$setupSwitchCameraButton$3(view);
                }
            };
            this.mSwitchCameraPreSportButton.setOnClickListener(onClickListener);
            this.mSwitchCameraInSportButton.setOnClickListener(onClickListener);
            adjustSwitchCameraPreSportButtonPositionIfNeeded();
            return;
        }
        this.mSwitchCameraInSportButton.setVisibility(8);
        this.mSwitchCameraPreSportButton.setVisibility(8);
        if (zE) {
            switchCamera();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupSwitchCameraButton$3(View view) {
        onSwitchCameraButtonClicked();
    }

    private void adjustSwitchCameraPreSportButtonPositionIfNeeded() {
        this.mSwitchCameraPreSportButton.post(new Runnable() { // from class: jmk
            @Override // java.lang.Runnable
            public final void run() {
                this.e.lambda$adjustSwitchCameraPreSportButtonPositionIfNeeded$4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$adjustSwitchCameraPreSportButtonPositionIfNeeded$4() {
        jpm.c(this.mSwitchCameraPreSportButton, this.mToIntroduceButtonLayout);
    }

    private void onSwitchCameraButtonClicked() {
        if (qrs.c(600)) {
            LogUtil.e(getTag(), "CLICK IS FAST");
        } else {
            switchCamera();
            this.mSwitchCameraPopText.setVisibility(8);
        }
    }

    private void switchCamera() {
        boolean z = !this.mRenderView.d();
        this.mRenderView.d(z);
        this.mViewModel.switchCamera(z);
    }

    private void initFirstPop() {
        this.mSwitchCameraPopText = (HealthTextView) this.mContentView.findViewById(R.id.switch_camera_pre_sport_pop);
        if (!SportSupportUtil.e() || !SportSupportUtil.c()) {
            this.mSwitchCameraPopText.setVisibility(8);
        } else if (this.mViewModel.getIsFirstInit()) {
            this.mSwitchCameraPopText.setVisibility(0);
            this.mContentView.setOnClickListener(new View.OnClickListener() { // from class: jme
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f38727c.lambda$initFirstPop$5(view);
                }
            });
        } else {
            this.mSwitchCameraPopText.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initFirstPop$5(View view) {
        this.mSwitchCameraPopText.setVisibility(8);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onCountDown() {
        if (!this.mIsStartTheTest) {
            this.mCountdownView.setVisibility(0);
        }
        this.mCountdownDialog.startCountdown();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportingFragment, com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        if (z && getActivity() != null) {
            getActivity().getWindow().setFlags(16778240, 16778240);
            if (isSupportLandScreen()) {
                getActivity().setRequestedOrientation(4);
            }
        }
        super.setUserVisibleHint(z);
        SportExamViewModel sportExamViewModel = this.mViewModel;
        if (sportExamViewModel != null) {
            sportExamViewModel.enableCanStart(z);
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        LogUtil.a(getTag(), "onPauseSport");
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        LogUtil.a(getTag(), "onStartSport");
        this.mIsStartTheTest = true;
        startDataSport();
    }

    protected void startDataSport() {
        this.mCountdownView.setVisibility(8);
        this.mSportDataView.setVisibility(0);
        this.mDataPanelLayout.startAnimation(jqi.b());
        this.mDataPanelLayout.setVisibility(0);
        this.mToolsLayout.setVisibility(0);
        initControlButton();
    }

    private void initControlButton() {
        CircleProgressButton circleProgressButton = this.mToolsLayout.getCircleProgressButton();
        ToolsLayout toolsLayout = this.mToolsLayout;
        toolsLayout.setShowOrHideView(toolsLayout.getBottomPanel());
        circleProgressButton.b(new CircleProgressButton.CircleProcessListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment.4
            @Override // com.huawei.healthcloud.plugintrack.ui.view.CircleProgressButton.CircleProcessListener
            public void onCancel() {
            }

            @Override // com.huawei.healthcloud.plugintrack.ui.view.CircleProgressButton.CircleProcessListener
            public void onStarted() {
            }

            @Override // com.huawei.healthcloud.plugintrack.ui.view.CircleProgressButton.CircleProcessListener
            public void onFinished() {
                BaseSportExamFragment.this.clickStopButton();
            }
        });
        this.mToolsLayout.e();
    }

    public void clickStopButton() {
        this.mToolsLayout.setVisibility(8);
        SportExamViewModel sportExamViewModel = this.mViewModel;
        if (sportExamViewModel != null) {
            sportExamViewModel.m825x32b3e3a1();
        }
        this.mSwitchCameraPopText.setVisibility(8);
        if (getActivity() == null || this.mViewModel.getSportType() == 400002) {
            return;
        }
        getActivity().finish();
    }

    protected void dealPreProgress(int i) {
        this.mSquareProgress.setProgress(i);
        if (i >= 100) {
            AnimationSet animationSetI = jqi.i();
            animationSetI.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.BaseSportExamFragment.1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    BaseSportExamFragment.this.dealProgressEnd();
                }
            });
            this.mSportPreView.startAnimation(animationSetI);
        }
    }

    protected void switchScreenTips() {
        if (getActivity() != null && getResources().getConfiguration().orientation == 1) {
            this.mSwitchScreenBg.setVisibility(0);
            this.mSportPreView.setVisibility(8);
            this.mSportDataView.setVisibility(8);
        } else {
            this.mSwitchScreenBg.setVisibility(8);
            this.mSportPreView.setVisibility(0);
            if (this.mIsStartTheTest) {
                this.mSportDataView.setVisibility(0);
            }
        }
        if (this.mIsStartTheTest) {
            this.mSportPreView.setVisibility(8);
        }
    }

    public void finish() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.mIsStartTheTest) {
            return;
        }
        sendSportResult(-1L);
    }

    public void sendSportResult(long j) {
        LogUtil.a(getTag(), "sendSportResult");
        if (!this.mIsStartTheTest) {
            j = -1;
        }
        ive.c().a(this.mSportType, j);
    }

    public void dealPreStartSportTips(int i, int i2) {
        ViewGroup viewGroup = this.mSportPreView;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            return;
        }
        if (i == -10) {
            dealPreStartLightTips(i2);
        } else if (i == -11) {
            dealManyPeopleByPreStart(i2);
        }
    }

    private void dealPreStartLightTips(int i) {
        if (isSupportLandScreen()) {
            this.mPreTips.setText(R.string.IDS_ai_fitness_sport_tip_keep_light_bright);
        } else {
            this.mPortraitPreTipsTwo.setVisibility(8);
            this.mPreTips.setText(R.string.IDS_track_kepp_bright);
            if (this.mPreTips.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mPreTips.getLayoutParams();
                marginLayoutParams.topMargin = qrs.s(this.mSportPreView.getContext()) * 2;
                this.mPreTips.setLayoutParams(marginLayoutParams);
            }
        }
        this.mHandler.removeMessages(10001);
        Message messageObtainMessage = this.mHandler.obtainMessage();
        messageObtainMessage.what = 10001;
        messageObtainMessage.obj = Integer.valueOf(i);
        this.mHandler.sendMessageDelayed(messageObtainMessage, 6000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initPreViewDefaultTips(int i, int i2) {
        HealthTextView healthTextView = this.mPreTips;
        if (healthTextView == null) {
            LogUtil.j(getTag(), "initPreViewDefaultTips mPreTips == null");
            return;
        }
        healthTextView.setText(i);
        this.mPreTips.setVisibility(0);
        if (isSupportLandScreen() || this.mPortraitPreTipsTwo == null) {
            return;
        }
        if (this.mPreTips.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mPreTips.getLayoutParams();
            marginLayoutParams.topMargin = qrs.s(this.mSportPreView.getContext());
            this.mPreTips.setLayoutParams(marginLayoutParams);
        }
        this.mPortraitPreTipsTwo.setVisibility(0);
        this.mPortraitPreTipsTwo.setText(i2);
    }

    private void dealManyPeopleByPreStart(int i) {
        if (isSupportLandScreen()) {
            this.mPreTips.setText(R.string.IDS_ai_fitness_sport_tip_keep_one_inside_screen);
        } else {
            this.mPortraitPreTipsTwo.setText(R.string.IDS_ai_fitness_sport_tip_keep_one_inside_screen);
        }
        this.mHandler.removeMessages(10001);
        Message messageObtainMessage = this.mHandler.obtainMessage();
        messageObtainMessage.what = 10001;
        messageObtainMessage.obj = Integer.valueOf(i);
        this.mHandler.sendMessageDelayed(messageObtainMessage, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    class b extends BaseHandler<BaseSportExamFragment> {
        b(Looper looper, BaseSportExamFragment baseSportExamFragment) {
            super(looper, baseSportExamFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(BaseSportExamFragment baseSportExamFragment, Message message) {
            if (message.what == 10001) {
                Object obj = message.obj;
                if (obj instanceof Integer) {
                    BaseSportExamFragment.this.initPreViewDefaultTips(((Integer) obj).intValue(), R.string.IDS_track_skip_body_into_screen);
                }
            }
        }
    }
}
