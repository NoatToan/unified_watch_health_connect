package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.render.PlayThread2;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.gles.MaterialVisitor;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.gles.VideoRender;
import com.huawei.watchface.videoedit.gles.template.RatioVisitor;
import com.huawei.watchface.videoedit.gles.videorender.RenderDataManager;
import com.huawei.watchface.videoedit.presenter.ModelVisitor;
import com.huawei.watchface.videoedit.presenter.RenderReceiver;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class RenderSentinel extends StateSentinel implements RenderReceiver {
    private static final int MSG_RENDER_SEEK_COMPLETE = 0;
    private static final String TAG = "RenderSentinel";
    private boolean isRenderStart;
    private boolean isResponseSentTo;
    private boolean isSeekReceived;
    private HandlerThread mHandlerThread;
    private RatioVisitor mRatioVisitor;
    private List<ModelVisitor> mVisitors;
    private RenderSentinelHandler renderSentinelHandler;
    private final PlayThread2 renderThread;

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.StateSentinel
    public void pause() {
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.StateSentinel
    public void resume() {
    }

    class RenderSentinelHandler extends Handler {
        private RenderSentinelHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 0) {
                RenderSentinel.this.isRenderStart = true;
                RenderSentinel.this.trySend();
            } else {
                throw new IllegalArgumentException(" msg.what is unkown " + message.what);
            }
        }
    }

    public RenderSentinel(int i, Handler handler, Context context) {
        super(i, handler);
        this.isSeekReceived = false;
        this.isRenderStart = false;
        this.isResponseSentTo = false;
        PlayThread2 playThread2 = new PlayThread2(context, this);
        this.renderThread = playThread2;
        this.mRatioVisitor = new RatioVisitor(context, i);
        List<ModelVisitor> listInitVisitor = initVisitor(playThread2.getRender().getRenderDataManager(), i);
        this.mVisitors = listInitVisitor;
        listInitVisitor.add(this.mRatioVisitor);
        playThread2.setName("renderThread");
        playThread2.setRenderReceiver(this);
        playThread2.start();
        HandlerThread handlerThread = new HandlerThread(TAG);
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.renderSentinelHandler = new RenderSentinelHandler(this.mHandlerThread.getLooper());
        this.isResponseSentTo = false;
    }

    public static List<ModelVisitor> initVisitor(RenderDataManager renderDataManager, int i) {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(new MaterialVisitor(i, "video", renderDataManager));
        return arrayList;
    }

    public void onSizeChanged(int i, int i2) {
        this.renderThread.onSizeChanged(i, i2);
    }

    @Override // com.huawei.watchface.videoedit.presenter.RenderReceiver
    public void onRenderThreadStart() {
        this.renderSentinelHandler.sendEmptyMessage(0);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.StateSentinel
    public void seekTo(int i) {
        if (this.isResponseSentTo) {
            return;
        }
        this.isSeekReceived = true;
        trySend();
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.StateSentinel
    public void update(int i) {
        this.renderThread.update(i);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.StateSentinel
    public void release() {
        LogUtil.b(TAG, "release.");
        this.renderThread.interrupt();
        this.renderThread.quit();
    }

    public void renderDraw(int i) {
        this.renderThread.forceDraw(i);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.Sentinel
    public List<ModelVisitor> getModelVisitor() {
        return this.mVisitors;
    }

    public VideoRender getVideoRender() {
        return this.renderThread.getRender();
    }

    public void setSurface(Surface surface) {
        this.renderThread.setSurface(surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trySend() {
        if (this.isRenderStart && this.isSeekReceived) {
            this.isResponseSentTo = true;
            sendSeekCompleteToMagic();
        }
    }
}
