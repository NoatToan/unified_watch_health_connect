package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.manager;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.render.StateMachine;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerProgressCallBack;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.operation.Operation;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.operation.SeekOperation;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.play.MagicPlayer2;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.MagicStateChangedCallBack;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.videorender.RenderNodeSelectListener;
import com.huawei.hwdevicemgr.R;
import com.huawei.watchface.videoedit.gles.drawer.RenderNode;
import com.huawei.watchface.videoedit.param.TemplateModel;
import com.huawei.watchface.videoedit.presenter.ModelVisitor;
import com.huawei.watchface.videoedit.utils.ScreenUtils;
import health.compact.a.LogUtil;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SwaySurfaceManager implements PlayerDelegate, PrepareListener, RenderNodeSelectListener {
    private static final int FRAME_PER_SECOND = 33;
    private static final int MAX_RESIZE_CHANGE = 3;
    private static final float MIN_VALUE = 0.01f;
    private static final String TAG = "SwaySurfaceManager";
    private Activity mActivity;
    private AudioFocusRequest mAudioFocusRequest;
    private AudioManager mAudioManager;
    private MsgRunnable mPendMsg;
    private MagicPlayer2 mPlayer;
    private PlayerProgressCallBack mPlayerProgressCallBack;
    private TextureView mTextureView;
    private boolean mFirstReady = true;
    private float mRatio = 0.0f;
    private int mReSizeChangeSize = 0;
    private MagicStateChangedCallBack mStateCallBack = new MagicStateChangedCallBack() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.manager.SwaySurfaceManager$$ExternalSyntheticLambda2
        @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.MagicStateChangedCallBack
        public final void onStateChanged(StateMachine stateMachine, StateMachine stateMachine2) {
            this.f$0.m1444x5a667be1(stateMachine, stateMachine2);
        }
    };

    static class MsgRunnable implements Runnable {
        private boolean isPost;
        private boolean isReplaceAble;
        private Runnable runnable;
        private final StateMachine state;

        MsgRunnable(StateMachine stateMachine, Runnable runnable, boolean z) {
            this.state = stateMachine;
            this.runnable = runnable;
            this.isPost = false;
            this.isReplaceAble = z;
        }

        MsgRunnable(StateMachine stateMachine, Runnable runnable) {
            this(stateMachine, runnable, true);
        }

        boolean isValid(StateMachine stateMachine) {
            return stateMachine == this.state && !this.isPost;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.isPost = true;
            LogUtil.b(SwaySurfaceManager.TAG, "pending MsgRunnable  is running");
            this.runnable.run();
            this.isReplaceAble = true;
        }
    }

    /* JADX INFO: renamed from: lambda$new$1$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-pluginvideo-videoedit-manager-SwaySurfaceManager, reason: not valid java name */
    /* synthetic */ void m1444x5a667be1(StateMachine stateMachine, StateMachine stateMachine2) {
        MsgRunnable msgRunnable;
        if (stateMachine == StateMachine.READY && this.mFirstReady) {
            this.mFirstReady = false;
            this.mPlayer.resume();
        }
        if (this.mActivity == null || (msgRunnable = this.mPendMsg) == null || !msgRunnable.isValid(stateMachine)) {
            return;
        }
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.manager.SwaySurfaceManager$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1443x17000ca0();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$new$0$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-pluginvideo-videoedit-manager-SwaySurfaceManager, reason: not valid java name */
    /* synthetic */ void m1443x17000ca0() {
        this.mPendMsg.run();
    }

    public SwaySurfaceManager(Activity activity) {
        this.mActivity = activity;
        this.mTextureView = (TextureView) activity.findViewById(R.id.texture_view);
        MagicPlayer2 magicPlayer2 = new MagicPlayer2(activity, this);
        this.mPlayer = magicPlayer2;
        magicPlayer2.registerMagicStateChangedCb(this.mStateCallBack);
        this.mPlayerProgressCallBack = new PlayerProgressCallBack(this.mPlayer);
        if (this.mActivity.getSystemService("audio") instanceof AudioManager) {
            this.mAudioFocusRequest = new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.manager.SwaySurfaceManager$$ExternalSyntheticLambda3
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i) {
                    this.f$0.m1445x9dcceb22(i);
                }
            }).build();
            this.mAudioManager = (AudioManager) this.mActivity.getSystemService("audio");
        }
    }

    /* JADX INFO: renamed from: lambda$new$2$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-pluginvideo-videoedit-manager-SwaySurfaceManager, reason: not valid java name */
    /* synthetic */ void m1445x9dcceb22(int i) {
        if (i == -2 || i == -1) {
            realPause();
        } else {
            if (i != 1) {
                return;
            }
            realPlay();
        }
    }

    public void forceStopScrollingThenPlay(boolean z) {
        if (this.mActivity == null) {
            return;
        }
        this.mPlayer.getMagicHandler().removeMessages(2);
        this.mPlayer.getMagicHandler().removeMessages(0);
        doSeek(z);
    }

    public void doSeek(boolean z) {
        if (this.mActivity == null) {
            return;
        }
        applyOperation(new SeekOperation((int) this.mPlayer.getCurrentTime(), -1, z));
    }

    public boolean isMagicVacant() {
        return this.mPlayer.isMagicVacant();
    }

    public void enter(Intent intent) {
        this.mPlayer.prepare(intent);
        this.mPlayer.registerModelVisitor(getModelVisitor());
    }

    public void enterfromCamera(Intent intent) {
        this.mPlayer.prepare(intent);
    }

    public StateMachine getCurrentState() {
        return this.mPlayer.getStateMachine();
    }

    public TemplateModel getTemplateModel() {
        return this.mPlayer.getTemplateModel();
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate
    public void registerModelVisitor(List<ModelVisitor> list) {
        this.mPlayer.registerModelVisitor(list);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate
    public void unregisterModelVisitor(ModelVisitor modelVisitor) {
        this.mPlayer.unRegisterPlayModelVisitor(modelVisitor);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate
    public void seekTo(int i) {
        seekTo(i, -1);
    }

    private void realSeekTo(int i, int i2) {
        realSeekTo(i, i2, true);
    }

    private void realSeekTo(int i, int i2, boolean z) {
        this.mPlayer.applyOperation(new SeekOperation(i, i2, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realPause() {
        this.mPlayer.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realPlay() {
        if (this.mPlayer.getCurrentTime() >= this.mPlayer.getDurationTime() - 33) {
            realSeekTo(0, -1);
        } else {
            this.mPlayer.resume();
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate
    public void seekTo(int i, int i2) {
        m1448x305fe0b0(i, i2, true);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate
    public void seekTo(int i, boolean z) {
        m1448x305fe0b0(i, -1, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: seekTo, reason: merged with bridge method [inline-methods] */
    public void m1448x305fe0b0(final int i, final int i2, final boolean z) {
        if (this.mPlayer.getStateMachine() == StateMachine.READY) {
            realSeekTo(i, i2, z);
        } else {
            LogUtil.b(TAG, "seekTo is pending in ", this.mPlayer.getStateMachine());
            this.mPendMsg = new MsgRunnable(StateMachine.READY, new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.manager.SwaySurfaceManager$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1448x305fe0b0(i, i2, z);
                }
            });
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate
    public void start() {
        requestAudioFocus();
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate
    public void pause() {
        if (this.mPlayer.getStateMachine() == StateMachine.RUNNING) {
            realPause();
        } else if (this.mPlayer.getStateMachine() == StateMachine.SEEKING) {
            LogUtil.b(TAG, "pause is pending in ", this.mPlayer.getStateMachine());
            this.mPendMsg = new MsgRunnable(StateMachine.READY, new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.manager.SwaySurfaceManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.realPause();
                }
            });
        } else {
            LogUtil.b(TAG, "pause is ignore in ", this.mPlayer.getStateMachine());
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate
    public void stop() {
        removeAudioFocus();
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate
    public void play() {
        if (this.mPlayer.getStateMachine() == StateMachine.READY) {
            realPlay();
        } else if (this.mPlayer.getStateMachine() == StateMachine.SEEKING) {
            LogUtil.b(TAG, "play is pending in ", this.mPlayer.getStateMachine());
            this.mPendMsg = new MsgRunnable(StateMachine.READY, new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.manager.SwaySurfaceManager$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.realPlay();
                }
            });
        } else {
            LogUtil.b(TAG, "play is ignore in ", this.mPlayer.getStateMachine());
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate
    public void toggle() {
        if (this.mPlayer.getStateMachine() == StateMachine.READY) {
            realPlay();
        } else if (this.mPlayer.getStateMachine() == StateMachine.RUNNING) {
            realPause();
        } else {
            LogUtil.b(TAG, "toggle is ignore in ", this.mPlayer.getStateMachine());
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate
    public void addListener(PlayerProgressCallBack.BackProgressListener backProgressListener) {
        this.mPlayerProgressCallBack.addListener(backProgressListener);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate
    public void removeListener(PlayerProgressCallBack.BackProgressListener backProgressListener) {
        this.mPlayerProgressCallBack.removeListener(backProgressListener);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate
    public void applyOperation(final Operation operation) {
        if (this.mPlayer.isMagicVacant()) {
            LogUtil.b(TAG, "applyOperation isMagicVacant is true");
            m1442xab832777(operation);
            return;
        }
        LogUtil.c(TAG, "applyOperation operation ", operation, " is pending");
        boolean z = operation instanceof SeekOperation;
        MsgRunnable msgRunnable = this.mPendMsg;
        if (msgRunnable == null || !z || msgRunnable.isReplaceAble) {
            LogUtil.c(TAG, "applyOperation mPendMsg is override ");
            this.mPendMsg = new MsgRunnable(StateMachine.READY, new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.manager.SwaySurfaceManager$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1442xab832777(operation);
                }
            }, z);
        }
    }

    /* JADX INFO: renamed from: realApplyOperation, reason: merged with bridge method [inline-methods] */
    public void m1442xab832777(Operation operation) {
        this.mPlayer.applyOperation(operation);
    }

    public void destroy() {
        this.mPlayerProgressCallBack.destroy();
        this.mPlayer.unRegisterMagicStateChangedCb(this.mStateCallBack);
        this.mPlayer.release();
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate
    public void registerMagicStateChangedCb(MagicStateChangedCallBack magicStateChangedCallBack) {
        this.mPlayer.registerMagicStateChangedCb(magicStateChangedCallBack);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate
    public void unRegisterMagicStateChangedCb(MagicStateChangedCallBack magicStateChangedCallBack) {
        this.mPlayer.unRegisterMagicStateChangedCb(magicStateChangedCallBack);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate
    public long getCurrentTime() {
        return this.mPlayer.getCurrentTime();
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate
    public boolean isRunning() {
        StateMachine currentState = getCurrentState();
        StateMachine stateMachine = StateMachine.INIT;
        return currentState == StateMachine.RUNNING;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.PlayerDelegate
    public Handler getMagicPlayerHandler() {
        return this.mPlayer.getMagicHandler();
    }

    /* JADX INFO: renamed from: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.manager.SwaySurfaceManager$1, reason: invalid class name */
    class AnonymousClass1 extends ModelVisitor {
        AnonymousClass1(int i) {
            super(i);
        }

        /* JADX INFO: renamed from: lambda$onDataSetChanged$0$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-pluginvideo-videoedit-manager-SwaySurfaceManager$1, reason: not valid java name */
        /* synthetic */ void m1449xfd23fde2() {
            SwaySurfaceManager.this.realLayoutTextureView();
        }

        @Override // com.huawei.watchface.videoedit.presenter.ModelVisitor
        public void onDataSetChanged(TemplateModel templateModel) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.manager.SwaySurfaceManager$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1449xfd23fde2();
                }
            });
        }
    }

    private List<ModelVisitor> getModelVisitor() {
        return Arrays.asList(new AnonymousClass1(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realLayoutTextureView() {
        if (this.mTextureView != null) {
            LogUtil.b(TAG, "realLayoutTextureView onSizeChanged");
            int height = this.mTextureView.getHeight();
            int width = this.mTextureView.getWidth();
            if (this.mReSizeChangeSize >= 3) {
                height = ScreenUtils.getHeight(this.mActivity) / 2;
                width = height;
            }
            if (height * width == 0) {
                this.mReSizeChangeSize++;
                HandlerExecutor.c(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.manager.SwaySurfaceManager$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.realLayoutTextureView();
                    }
                }, 33L);
            } else {
                this.mPlayer.onSizeChanged(width, height);
                this.mTextureView.setVisibility(4);
                HandlerExecutor.c(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.manager.SwaySurfaceManager$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m1447x651cf75d();
                    }
                }, 33L);
            }
        }
    }

    /* JADX INFO: renamed from: lambda$realLayoutTextureView$5$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-pluginvideo-videoedit-manager-SwaySurfaceManager, reason: not valid java name */
    /* synthetic */ void m1447x651cf75d() {
        this.mTextureView.setVisibility(0);
    }

    private void removeAudioFocus() {
        AudioFocusRequest audioFocusRequest;
        AudioManager audioManager = this.mAudioManager;
        if (audioManager == null || (audioFocusRequest = this.mAudioFocusRequest) == null) {
            return;
        }
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    private void requestAudioFocus() {
        AudioFocusRequest audioFocusRequest;
        AudioManager audioManager = this.mAudioManager;
        if (audioManager == null || (audioFocusRequest = this.mAudioFocusRequest) == null) {
            return;
        }
        audioManager.requestAudioFocus(audioFocusRequest);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.manager.PrepareListener
    public void onPrepareError() {
        LogUtil.d(TAG, "onPrepareError");
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.manager.SwaySurfaceManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1446x3873da20();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onPrepareError$6$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-pluginvideo-videoedit-manager-SwaySurfaceManager, reason: not valid java name */
    /* synthetic */ void m1446x3873da20() {
        this.mActivity.finish();
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.videorender.RenderNodeSelectListener
    public List<RenderNode> selectNode(float f, float f2, long j) {
        MagicPlayer2 magicPlayer2 = this.mPlayer;
        if (magicPlayer2 != null) {
            return magicPlayer2.getRenderEventListener().selectNode(f, f2, j);
        }
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.videorender.RenderNodeSelectListener
    public List<RenderNode> selectNode(String str) {
        MagicPlayer2 magicPlayer2 = this.mPlayer;
        if (magicPlayer2 != null) {
            return magicPlayer2.getRenderEventListener().selectNode(str);
        }
        return Collections.EMPTY_LIST;
    }

    public void viewRefresh() {
        this.mPlayer.viewRefresh();
    }

    public MagicPlayer2 getPlayer() {
        return this.mPlayer;
    }

    public void setSurface(Surface surface) {
        MagicPlayer2 magicPlayer2 = this.mPlayer;
        if (magicPlayer2 != null) {
            magicPlayer2.setSurface(surface);
        }
    }

    public void surfaceChanged(int i, int i2) {
        if (this.mPlayer != null) {
            LogUtil.b(TAG, "surfaceChanged onSizeChanged");
            this.mPlayer.onSizeChanged(i, i2);
        }
    }
}
