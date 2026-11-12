package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.render;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.gles.VideoRender;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.play.InputSurface;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.play.MagicPlayer;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.GlRenderThread2;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.watchface.videoedit.presenter.RenderReceiver;
import com.huawei.watchface.videoedit.utils.Utils;

/* JADX INFO: loaded from: classes10.dex */
public class PlayThread2 extends GlRenderThread2 {
    private static final int MSG_DRAW_FRAME = 1;
    private static final int MSG_SWAP_BUFFER = 2;
    private static final String TAG = "PlayThread2";
    private final Object lock = new Object();
    private final Context mContext;
    private InputSurface mInputSurface;
    private VideoRender mRender;
    private RenderHandler mRenderHandler;
    private Surface mSurface;
    private long mUpdateTime;
    private RenderReceiver renderReceiver;

    public PlayThread2(Context context, RenderReceiver renderReceiver) {
        this.mContext = context;
        this.mRender = new VideoRender(context, MagicPlayer.Mode.PLAY);
        this.renderReceiver = renderReceiver;
    }

    class RenderHandler extends Handler {
        private Looper mLooper;

        RenderHandler(Looper looper) {
            super(looper);
            this.mLooper = looper;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                PlayThread2.this.mRender.onDrawFrame(PlayThread2.this.mUpdateTime);
                PlayThread2.this.mInputSurface.swapBuffers();
            } else if (i == 2) {
                PlayThread2.this.mInputSurface.swapBuffers();
            } else {
                throw new IllegalArgumentException("playThread2 msg.what is unkown " + message.what);
            }
        }

        void quit() {
            this.mLooper.quit();
            LogUtil.a(PlayThread2.TAG, "playThread2 RenderHandler quit loop.");
        }
    }

    public void update(int i) {
        this.mUpdateTime = i;
        RenderHandler renderHandler = this.mRenderHandler;
        if (renderHandler == null) {
            return;
        }
        renderHandler.sendEmptyMessage(1);
    }

    public void setSurface(Surface surface) {
        this.mSurface = surface;
        LogUtil.a(TAG, "setSurface playThread2 setSurface enter");
        synchronized (this.lock) {
            this.lock.notifyAll();
        }
    }

    public void setRenderReceiver(RenderReceiver renderReceiver) {
        this.renderReceiver = renderReceiver;
    }

    public void onSizeChanged(int i, int i2) {
        if (this.mRenderHandler == null) {
            return;
        }
        LogUtil.a(TAG, "onSizeChanged playThread2  onSizeChanged: " + i + i2);
        this.mRender.onSizeChanged(i, i2);
        this.mRenderHandler.removeMessages(1);
        this.mRenderHandler.sendEmptyMessage(2);
        this.mRenderHandler.sendEmptyMessage(1);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.GlRenderThread2
    public void doWork() {
        LogUtil.a(TAG, "doWork playThread2 start doWork");
        Looper.prepare();
        this.mRenderHandler = new RenderHandler(Looper.myLooper());
        while (this.mSurface == null) {
            try {
                try {
                    synchronized (this.lock) {
                        if (this.mSurface == null) {
                            this.lock.wait();
                        }
                    }
                } catch (InterruptedException unused) {
                    this.mRenderHandler.quit();
                    LogUtil.j(TAG, "doWork playThread2 is Interrupted: ", Boolean.valueOf(Thread.currentThread().isInterrupted()));
                    LogUtil.a(TAG, "doWork playThread2 do work finally.");
                }
            } catch (Throwable th) {
                LogUtil.a(TAG, "doWork playThread2 do work finally.");
                this.mRender.release();
                Utils.release(this.mInputSurface);
                this.mRenderHandler.quit();
                throw th;
            }
        }
        Surface surface = this.mSurface;
        if (surface != null) {
            this.mInputSurface = new InputSurface(surface);
        }
        this.mInputSurface.makeCurrent();
        this.mRender.init();
        this.renderReceiver.onRenderThreadStart();
        Looper.loop();
        LogUtil.a(TAG, "doWork playThread2 start Looper loop");
        LogUtil.a(TAG, "doWork playThread2 do work finally.");
        this.mRender.release();
        Utils.release(this.mInputSurface);
        this.mRenderHandler.quit();
    }

    public VideoRender getRender() {
        return this.mRender;
    }

    public void quit() {
        RenderHandler renderHandler = this.mRenderHandler;
        if (renderHandler != null) {
            renderHandler.quit();
            LogUtil.a(TAG, "quit playThread2 isAlive: ", Boolean.valueOf(Thread.currentThread().isAlive()));
        }
    }

    public void forceDraw(int i) {
        RenderHandler renderHandler = this.mRenderHandler;
        if (renderHandler == null) {
            return;
        }
        renderHandler.removeMessages(1);
        update(i);
        LogUtil.a(TAG, "forceDraw playThread2 forceDraw at time: ", Long.valueOf(this.mUpdateTime));
    }
}
