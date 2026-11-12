package miuix.animation.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import miuix.animation.Folme;
import miuix.animation.physics.AnimationHandler;
import miuix.animation.utils.BoostHelper;

/* JADX INFO: loaded from: classes3.dex */
public class AndroidEngine extends FolmeEngine implements AnimationHandler.AnimationFrameCallback {
    private static final int MSG_END = 1;
    private static final int MSG_START = 0;
    static volatile EngineHandler sMainHandler;
    static volatile AndroidEngine sMainInstance;
    static final ThreadLocal<AndroidEngine> sThreadInstance = new ThreadLocal<AndroidEngine>() { // from class: miuix.animation.internal.AndroidEngine.1
        @Override // java.lang.ThreadLocal
        public AndroidEngine initialValue() {
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                return null;
            }
            if (looperMyLooper == Folme.getLooper() || Folme.getUiLooperByTid(looperMyLooper.getThread().getId()) != null) {
                return new AndroidEngine();
            }
            return null;
        }
    };
    private Handler mHandler;

    public static class EngineHandler extends Handler {
        public EngineHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                AndroidEngine.getInst().startAnim();
            } else {
                if (i != 1) {
                    return;
                }
                AndroidEngine.getInst().endAnim();
            }
        }

        public EngineHandler(Looper looper, Handler.Callback callback) {
            super(looper, callback);
        }
    }

    public AndroidEngine() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            return;
        }
        EngineHandler engineHandler = new EngineHandler(looperMyLooper);
        setHandler(engineHandler);
        if (looperMyLooper == Looper.getMainLooper()) {
            sMainInstance = this;
            sMainHandler = engineHandler;
        }
    }

    public static AndroidEngine getInst() {
        AndroidEngine androidEngine = sThreadInstance.get();
        return androidEngine == null ? sMainInstance : androidEngine;
    }

    public static void turboThreadIfNeed(int i) {
        HashMap<Integer, Boolean> map = getInst().mScheduler.mAnimTaskSchedMap;
        if (map.containsKey(Integer.valueOf(i)) || BoostHelper.getInstance().isTurboSchedDisabled || Folme.appContext == null) {
            return;
        }
        try {
            BoostHelper.getInstance().setTurboSchedActionWithPriority(new int[]{i}, 1000L, Folme.appContext);
            map.put(Integer.valueOf(i), Boolean.TRUE);
        } catch (Exception unused) {
        }
    }

    @Override // miuix.animation.internal.FolmeEngine
    public void end() {
        Handler handler = this.mHandler;
        if (handler != null && handler.getLooper() == Looper.myLooper()) {
            endAnim();
            return;
        }
        if (handler == null) {
            handler = sMainHandler;
        }
        if (handler != null) {
            handler.sendEmptyMessage(1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("AndroidEngine.end handler is null! looper: ");
        sb.append(Looper.myLooper());
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    @Override // miuix.animation.internal.FolmeEngine
    public void scheduleNextFrame(long j) {
        AnimationHandler.getInstance().addAnimationFrameCallback(this, j);
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
        this.mScheduler.handler = handler;
    }

    @Override // miuix.animation.internal.FolmeEngine
    public void start() {
        Handler handler = this.mHandler;
        if (handler != null && handler.getLooper() == Looper.myLooper()) {
            startAnim();
            return;
        }
        if (handler == null) {
            handler = sMainHandler;
        }
        if (handler != null) {
            handler.sendEmptyMessage(0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("AndroidEngine.start handler is null! looper: ");
        sb.append(Looper.myLooper());
    }

    @Override // miuix.animation.internal.FolmeEngine
    public void stopNextFrame() {
        AnimationHandler.getInstance().removeCallback(this);
    }
}
