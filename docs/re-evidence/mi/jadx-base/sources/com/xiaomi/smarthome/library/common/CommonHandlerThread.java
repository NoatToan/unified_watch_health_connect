package com.xiaomi.smarthome.library.common;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CommonHandlerThread extends HandlerThread {
    private Handler mHandler;
    private final List<Pair<Message, Long>> mPendingMsgList;
    private WeakReference<Handler> mRefThreadHandler;
    private Handler mUiHandler;

    public CommonHandlerThread(String str) {
        super(str);
        this.mPendingMsgList = new ArrayList();
        initThread(null);
    }

    private void initThread(Handler handler) {
        setThreadHandler(handler);
        this.mUiHandler = new Handler(Looper.getMainLooper());
    }

    @Override // java.lang.Thread
    public void destroy() {
        this.mHandler.removeCallbacksAndMessages(null);
        super.quit();
    }

    public void execute(Runnable runnable) {
        executeDelayed(runnable, 0L);
    }

    public void executeDelayed(Runnable runnable, long j) {
        sendMessageDelayed(Message.obtain((Handler) null, runnable), j);
    }

    public boolean hasMessages(int i) {
        Handler handler = this.mHandler;
        if (handler != null) {
            return handler.hasMessages(i);
        }
        synchronized (this.mPendingMsgList) {
            try {
                Iterator<Pair<Message, Long>> it = this.mPendingMsgList.iterator();
                while (it.hasNext()) {
                    if (((Message) it.next().first).what == i) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Message obtainMessage(int i, Object obj) {
        return Message.obtain(null, i, obj);
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        this.mHandler = new Handler(getLooper()) { // from class: com.xiaomi.smarthome.library.common.CommonHandlerThread.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Handler handler;
                if (CommonHandlerThread.this.mRefThreadHandler == null || (handler = (Handler) CommonHandlerThread.this.mRefThreadHandler.get()) == null) {
                    return;
                }
                handler.handleMessage(message);
            }
        };
        synchronized (this.mPendingMsgList) {
            try {
                for (Pair<Message, Long> pair : this.mPendingMsgList) {
                    this.mHandler.sendMessageDelayed((Message) pair.first, ((Long) pair.second).longValue());
                }
                this.mPendingMsgList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void post(Runnable runnable) {
        this.mUiHandler.post(runnable);
    }

    public void postDelayed(Runnable runnable, long j) {
        this.mUiHandler.postDelayed(runnable, j);
    }

    public void removeMessages(int i) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeMessages(i);
            return;
        }
        synchronized (this.mPendingMsgList) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Pair<Message, Long> pair : this.mPendingMsgList) {
                    if (((Message) pair.first).what == i) {
                        arrayList.add(pair);
                    }
                }
                this.mPendingMsgList.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void sendEmptyMessage(int i) {
        sendEmptyMessageDelayed(i, 0L);
    }

    public void sendEmptyMessageDelayed(int i, long j) {
        sendMessageDelayed(Message.obtain((Handler) null, i), j);
    }

    public void sendMessage(Message message) {
        sendMessageDelayed(message, 0L);
    }

    public void sendMessageDelayed(Message message, long j) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessageDelayed(message, j);
            return;
        }
        synchronized (this.mPendingMsgList) {
            this.mPendingMsgList.add(new Pair<>(message, Long.valueOf(j)));
        }
    }

    public void setThreadHandler(Handler handler) {
        this.mRefThreadHandler = new WeakReference<>(handler);
    }

    public void sendMessage(int i, Object obj) {
        sendMessage(obtainMessage(i, obj));
    }

    public CommonHandlerThread(String str, Handler handler) {
        super(str);
        this.mPendingMsgList = new ArrayList();
        initThread(handler);
    }
}
