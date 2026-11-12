package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.play;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Trace;
import android.view.Surface;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.render.StateMachine;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.render.VideoSentinel;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.GenerateTemplateModel;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.manager.PrepareListener;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.operation.Operation;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.operation.OperationStatus;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.AudioSentinel;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.MagicStateChangedCallBack;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.RenderSentinel;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils.TemplateModelGenerator;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils.TemplateUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.videorender.RenderNodeSelectListener;
import com.huawei.watchface.videoedit.param.TemplateModel;
import com.huawei.watchface.videoedit.param.TimeLineImpl;
import com.huawei.watchface.videoedit.presenter.ModelVisitor;
import com.huawei.watchface.videoedit.utils.FileUtils;
import com.huawei.watchface.videoedit.utils.SafeIntent;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class MagicPlayer2 {
    private static final int MSG_OPERATION = 6;
    private static final int MSG_PAUSE = 3;
    private static final int MSG_PREPARE = 1;
    private static final int MSG_RELEASE = 5;
    private static final int MSG_RESUME = 4;
    public static final int MSG_SEEK_COMPLETE = 0;
    public static final int MSG_SEEK_TO = 2;
    private static final String TAG = "MagicPlayer2";
    private static final int VIDEO_PATROL_TIME = 30;
    private AudioSentinel audioSentinel;
    private MagicHandle mHandler;
    private HandlerThread mHandlerThread;
    private TemplateModel mModel;
    private final PrepareListener mPrepareListener;
    private GenerateTemplateModel mTemplateModelGenerator;
    private Thread mTimerThread;
    private Context magicContext;
    private Operation pendingOp;
    private int pendingPauseTime;
    private final RenderSentinel renderSentinel;
    private TimeLineImpl timeLine;
    private VideoSentinel videoSentinel;
    private List<ModelVisitor> modelVisitors = new ArrayList();
    private List<MagicStateChangedCallBack> stateChangedCallBacks = new ArrayList();
    private final Object lock = new Object();
    private long waitingSeekFlag = 0;
    private StateMachine mStateMachine = StateMachine.INIT;

    class MagicHandle extends Handler {
        private MagicHandle(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    MagicPlayer2.this.handleSeekComplete(message.arg1);
                    return;
                case 1:
                    MagicPlayer2.this.handlePrepare(message);
                    return;
                case 2:
                    MagicPlayer2.this.handleSeekTo(message.arg1);
                    return;
                case 3:
                    MagicPlayer2.this.handlePause();
                    return;
                case 4:
                    MagicPlayer2.this.handleResume();
                    return;
                case 5:
                    MagicPlayer2.this.handleRelease();
                    return;
                case 6:
                    MagicPlayer2.this.handleOperation();
                    return;
                default:
                    throw new IllegalArgumentException(" msg.what is " + message.what);
            }
        }
    }

    public MagicPlayer2(Context context, PrepareListener prepareListener) {
        this.magicContext = context;
        this.mPrepareListener = prepareListener;
        HandlerThread handlerThread = new HandlerThread(TAG);
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mHandler = new MagicHandle(this.mHandlerThread.getLooper());
        this.timeLine = new TimeLineImpl();
        this.videoSentinel = new VideoSentinel(0, this.mHandler, context);
        this.audioSentinel = new AudioSentinel(0, this.mHandler, this.timeLine);
        RenderSentinel renderSentinel = new RenderSentinel(1, this.mHandler, context);
        this.renderSentinel = renderSentinel;
        registerModelVisitor(this.videoSentinel.getModelVisitor());
        registerModelVisitor(renderSentinel.getModelVisitor());
        registerModelVisitor(this.audioSentinel.getModelVisitor());
        this.mTimerThread = new Thread(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.play.MagicPlayer2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1450x72f0bd39();
            }
        });
        this.pendingPauseTime = -1;
    }

    /* JADX INFO: renamed from: lambda$new$0$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-pluginvideo-videoedit-play-MagicPlayer2, reason: not valid java name */
    /* synthetic */ void m1450x72f0bd39() {
        do {
            try {
                Thread.sleep(30L);
                if (this.mStateMachine == StateMachine.RUNNING) {
                    int durationTime = (int) getDurationTime();
                    int i = this.pendingPauseTime;
                    if (i != -1 && i < this.timeLine.getCurrentTime()) {
                        pause();
                        this.pendingPauseTime = -1;
                    } else if (this.timeLine.getCurrentTime() >= durationTime) {
                        pause();
                        this.renderSentinel.update(getSafeTime());
                    } else {
                        this.videoSentinel.update(getSafeTime());
                        this.audioSentinel.update(getSafeTime());
                        this.renderSentinel.update(getSafeTime());
                    }
                }
            } catch (InterruptedException unused) {
                LogUtil.d(TAG, "MagicPlayer2 InterruptedException");
            }
        } while (this.mStateMachine != StateMachine.RELEASED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSeekTo(int i) {
        if (this.mStateMachine == StateMachine.RUNNING) {
            this.timeLine.pause();
            this.videoSentinel.pause();
            this.audioSentinel.pause();
        }
        this.waitingSeekFlag = 0L;
        if (this.mStateMachine == StateMachine.INIT) {
            this.renderSentinel.seekTo(i);
            this.waitingSeekFlag |= (long) (1 << this.renderSentinel.getFlag());
        } else {
            this.timeLine.seekTo(i);
            this.audioSentinel.seekTo(i);
            this.videoSentinel.seekTo(i);
            this.waitingSeekFlag |= (long) (1 << this.videoSentinel.getFlag());
        }
        setState(StateMachine.SEEKING);
    }

    public final void registerModelVisitor(List<ModelVisitor> list) {
        synchronized (this.lock) {
            this.modelVisitors.addAll(list);
        }
    }

    public void registerMagicStateChangedCb(MagicStateChangedCallBack magicStateChangedCallBack) {
        synchronized (this.lock) {
            this.stateChangedCallBacks.add(magicStateChangedCallBack);
        }
    }

    public StateMachine getStateMachine() {
        return this.mStateMachine;
    }

    public void seekTo(int i) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.arg1 = i;
        this.mHandler.sendMessage(messageObtain);
    }

    public void pause() {
        this.pendingPauseTime = -1;
        this.mHandler.sendEmptyMessage(3);
    }

    public void resume() {
        this.pendingPauseTime = -1;
        this.mHandler.sendEmptyMessage(4);
    }

    public void release() {
        this.pendingPauseTime = -1;
        this.mHandler.sendEmptyMessage(5);
    }

    public void applyOperation(Operation operation) {
        if (!isMagicVacant()) {
            LogUtil.d(TAG, "applyOperation op is doing pendingOp is ", this.pendingOp, " op is ", operation);
            return;
        }
        LogUtil.b(TAG, "applyOperation new op is ", operation);
        this.pendingPauseTime = -1;
        this.pendingOp = operation;
        operation.setStatus(OperationStatus.HOLD_BY_PLAYER);
        this.mHandler.sendEmptyMessage(6);
    }

    public boolean isMagicVacant() {
        Operation operation = this.pendingOp;
        if (operation == null) {
            return true;
        }
        return operation.isOperationHandled();
    }

    public void unRegisterMagicStateChangedCb(MagicStateChangedCallBack magicStateChangedCallBack) {
        synchronized (this.lock) {
            this.stateChangedCallBacks.remove(magicStateChangedCallBack);
        }
    }

    public void unRegisterPlayModelVisitor(ModelVisitor modelVisitor) {
        synchronized (this.lock) {
            this.modelVisitors.remove(modelVisitor);
        }
    }

    public void prepare(Intent intent) {
        if (this.mStateMachine != StateMachine.INIT) {
            throw new IllegalStateException(" prepare mStateMachine is " + this.mStateMachine);
        }
        this.mTimerThread.start();
        MagicHandle magicHandle = this.mHandler;
        magicHandle.sendMessage(magicHandle.obtainMessage(1, intent));
    }

    public void setSurface(Surface surface) {
        this.renderSentinel.setSurface(surface);
    }

    public void setmTemplateModelGenerator(GenerateTemplateModel generateTemplateModel) {
        this.mTemplateModelGenerator = generateTemplateModel;
    }

    public TemplateModel getTemplateModel() {
        return this.mModel;
    }

    public long getCurrentTime() {
        return getSafeTime();
    }

    public long getDurationTime() {
        TemplateModel templateModel = this.mModel;
        if (templateModel == null) {
            return 0L;
        }
        return templateModel.getDuration();
    }

    public RenderNodeSelectListener getRenderEventListener() {
        return this.renderSentinel.getVideoRender().getNodeSelector();
    }

    public void onSizeChanged(int i, int i2) {
        this.renderSentinel.onSizeChanged(i, i2);
    }

    public void viewRefresh() {
        notifyVisitors();
    }

    private int getSafeTime() {
        long currentTime = this.timeLine.getCurrentTime();
        TemplateModel templateModel = this.mModel;
        if (templateModel == null) {
            return (int) currentTime;
        }
        long duration = templateModel.getDuration();
        if (currentTime >= duration) {
            currentTime = duration - 1;
        }
        return (int) currentTime;
    }

    private void notifyVisitors() {
        if (this.mModel == null) {
            LogUtil.d(TAG, "notifyVisitors return");
            return;
        }
        synchronized (this.lock) {
            Iterator<ModelVisitor> it = this.modelVisitors.iterator();
            while (it.hasNext()) {
                it.next().onDataSetChanged(this.mModel);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePrepare(Message message) {
        Object obj = message.obj;
        if (FileUtils.copyAssetsResource(this.magicContext, "template/HawaiianBeach.aac").isPresent()) {
            LogUtil.d(TAG, "handlePreparemusic ok");
        }
        if (obj instanceof Intent) {
            String stringExtra = new SafeIntent((Intent) obj).getStringExtra(TemplateUtil.TEMPLATE_INFO);
            try {
                if (stringExtra != null) {
                    LogUtil.b(TAG, "handlePrepare create model from intent");
                    this.mModel = (TemplateModel) new Gson().fromJson(stringExtra, TemplateModel.class);
                } else {
                    setmTemplateModelGenerator(new TemplateModelGenerator(this.magicContext));
                    Trace.beginSection("handlePrepare");
                    LogUtil.d(TAG, "handlePrepare generateMode start");
                    this.mModel = this.mTemplateModelGenerator.generateMode((Intent) obj);
                    LogUtil.d(TAG, "handlePrepare generateMode end");
                    Trace.endSection();
                }
                TemplateModel templateModel = this.mModel;
                if (templateModel != null) {
                    templateModel.getOperationStack().reset();
                    this.mModel.getOperationStack().queueStack(this.mModel);
                }
                notifyVisitors();
            } catch (JsonSyntaxException | IllegalStateException unused) {
                this.mPrepareListener.onPrepareError();
                return;
            }
        }
        handleSeekTo(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePause() {
        if (this.mStateMachine != StateMachine.RUNNING) {
            LogUtil.d(TAG, "handlePause in ", this.mStateMachine);
            return;
        }
        this.timeLine.pause();
        this.videoSentinel.pause();
        this.audioSentinel.pause();
        setState(StateMachine.READY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResume() {
        if (this.mStateMachine != StateMachine.READY) {
            LogUtil.d(TAG, "handleResume in ", this.mStateMachine);
            return;
        }
        this.timeLine.resume();
        this.videoSentinel.resume();
        this.renderSentinel.resume();
        this.audioSentinel.resume();
        setState(StateMachine.RUNNING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleRelease() {
        this.timeLine.reset();
        this.videoSentinel.release();
        this.renderSentinel.release();
        this.audioSentinel.release();
        setState(StateMachine.RELEASED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOperation() {
        LogUtil.b(TAG, "handleOperation in ", this.mStateMachine);
        if (this.mStateMachine == StateMachine.SEEKING) {
            LogUtil.b(TAG, "SEEKING blockingOperation", this.mStateMachine);
            return;
        }
        if (this.mStateMachine == StateMachine.RUNNING) {
            handlePause();
        } else if (this.mStateMachine == StateMachine.READY) {
            realOperationInReadyState();
        } else {
            LogUtil.d(TAG, "handleOperation stateMachine invalid ");
        }
    }

    private void realOperationInReadyState() {
        LogUtil.b(TAG, "realOperationInReadyState operationStatus is ", this.pendingOp.getStatus());
        if (this.pendingOp.getStatus().equals(OperationStatus.HOLD_BY_PLAYER)) {
            boolean zHandleTemplate = this.pendingOp.handleTemplate(this.mModel);
            LogUtil.b(TAG, "realOperationInReadyState isDateChanged is ", Boolean.valueOf(zHandleTemplate));
            if (zHandleTemplate) {
                TemplateModel model = this.pendingOp.getModel();
                if (model != null) {
                    LogUtil.b(TAG, "realOperationInReadyState pendingModel is active");
                    this.mModel = model;
                }
                this.pendingOp.postHandleTemplate(this.mModel);
                notifyVisitors();
            }
            int seekTime = this.pendingOp.getSeekTime();
            LogUtil.b(TAG, "realOperationInReadyState seekTime is ", Integer.valueOf(seekTime));
            if (seekTime == 2) {
                this.renderSentinel.renderDraw(getSafeTime());
                this.pendingOp.setStatus(OperationStatus.HANDLED);
                setState(StateMachine.READY);
                return;
            } else {
                seekTo(seekTime);
                this.pendingOp.setStatus(OperationStatus.WAITING_FOR_SEEK);
                return;
            }
        }
        if (this.pendingOp.getStatus().equals(OperationStatus.WAITING_FOR_SEEK)) {
            this.pendingOp.setStatus(OperationStatus.HANDLED);
            if (this.pendingOp.isPlayWhenReady()) {
                LogUtil.b(TAG, "realOperationInReadyState isPlayWhenReady is true");
                handleResume();
            } else {
                this.renderSentinel.renderDraw(getSafeTime());
                setState(StateMachine.READY);
            }
            int pauseTime = this.pendingOp.getPauseTime();
            this.pendingPauseTime = pauseTime;
            LogUtil.b(TAG, "realOperationInReadyState pendingPauseTime is true", Integer.valueOf(pauseTime));
            return;
        }
        LogUtil.d(TAG, "realOperationInReadyState realOperationInReadyState", "pendingOp.getStatus() ", this.pendingOp.getStatus());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSeekComplete(int i) {
        LogUtil.b(TAG, "handleSeekComplete mask is  ", Integer.valueOf(i), " handlSeekComplete mStateMachine is ", this.mStateMachine);
        if (this.mStateMachine != StateMachine.SEEKING) {
            LogUtil.b(TAG, "handleSeekComplete abnormal  ", this.mStateMachine);
            return;
        }
        this.waitingSeekFlag &= (long) (~(1 << i));
        if (this.renderSentinel.getFlag() != i) {
            if (this.waitingSeekFlag == 0) {
                this.timeLine.seekCompleted();
                setState(StateMachine.READY);
                return;
            }
            return;
        }
        this.videoSentinel.setSurfacePool(this.renderSentinel.getVideoRender().getRenderTextureManager().getVideoSurfaces(), this.renderSentinel.getVideoRender().getRenderTextureManager());
        this.timeLine.seekTo(0L);
        this.audioSentinel.seekTo(0);
        this.videoSentinel.seekTo(0);
        this.waitingSeekFlag |= (long) (1 << this.videoSentinel.getFlag());
    }

    private void setState(StateMachine stateMachine) {
        StateMachine stateMachine2 = this.mStateMachine;
        this.mStateMachine = stateMachine;
        LogUtil.b(TAG, "newState is ", stateMachine, " oldState ", stateMachine2, "  isMagicVacant = ", Boolean.valueOf(isMagicVacant()));
        if (stateMachine.equals(StateMachine.READY) && !isMagicVacant()) {
            this.mHandler.sendEmptyMessage(6);
            return;
        }
        synchronized (this.lock) {
            Iterator<MagicStateChangedCallBack> it = this.stateChangedCallBacks.iterator();
            while (it.hasNext()) {
                it.next().onStateChanged(stateMachine, stateMachine2);
            }
        }
    }

    public Handler getMagicHandler() {
        return this.mHandler;
    }
}
