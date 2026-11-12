package com.google.android.exoplayer2.util;

import android.os.Looper;

/* JADX INFO: loaded from: classes14.dex */
public interface HandlerWrapper {

    public interface Message {
        HandlerWrapper getTarget();

        void sendToTarget();
    }

    Looper getLooper();

    boolean hasMessages(int i14);

    Message obtainMessage(int i14);

    Message obtainMessage(int i14, int i15, int i16);

    Message obtainMessage(int i14, int i15, int i16, Object obj);

    Message obtainMessage(int i14, Object obj);

    boolean post(Runnable runnable);

    boolean postAtFrontOfQueue(Runnable runnable);

    boolean postDelayed(Runnable runnable, long j8);

    void removeCallbacksAndMessages(Object obj);

    void removeMessages(int i14);

    boolean sendEmptyMessage(int i14);

    boolean sendEmptyMessageAtTime(int i14, long j8);

    boolean sendEmptyMessageDelayed(int i14, int i15);

    boolean sendMessageAtFrontOfQueue(Message message);
}
