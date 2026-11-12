package com.mibi.sdk.task;

import defpackage.b6h;
import defpackage.n4h;
import defpackage.s88;
import defpackage.w9h;

/* JADX INFO: loaded from: classes5.dex */
public class RxCountDown {
    private CounterTask mCounterTask;
    private CountListener mInnerCountListener;

    public static class CountListener implements b6h<Integer> {
        private int mCount;
        private ICountDownListener mCountDownListener;
        private RxCountDown mRxCountDown;

        /* JADX INFO: Access modifiers changed from: private */
        public void startCount() {
            this.mCountDownListener.onStart();
            this.mCountDownListener.onProgress(0L);
        }

        @Override // defpackage.b6h
        public void onError(Throwable th) {
            this.mCountDownListener.onError();
        }

        private CountListener(int i, RxCountDown rxCountDown, ICountDownListener iCountDownListener) {
            this.mCount = i;
            this.mRxCountDown = rxCountDown;
            this.mCountDownListener = iCountDownListener;
        }

        @Override // defpackage.b6h
        public void onSuccess(Integer num) {
            if (num.intValue() >= this.mCount) {
                this.mCountDownListener.onCompleted();
                return;
            }
            int iIntValue = num.intValue() + 1;
            this.mCountDownListener.onProgress(iIntValue);
            this.mRxCountDown.countInterval(iIntValue);
        }
    }

    public static class CounterTask implements w9h<Integer> {
        private static final int SLEEP_PEROID_MS = 1000;
        private int mCurrentTime;

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentTime(int i) {
            this.mCurrentTime = i;
        }

        @Override // defpackage.w9h
        public void call(s88<? super Integer> s88Var) {
            try {
                Thread.sleep(1000L);
                s88Var.e(Integer.valueOf(this.mCurrentTime));
            } catch (InterruptedException e) {
                e.printStackTrace();
                s88Var.d(e);
            }
        }

        private CounterTask() {
        }
    }

    public interface ICountDownListener {
        void onCompleted();

        void onError();

        void onProgress(long j);

        void onStart();
    }

    private RxCountDown() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void countInterval(int i) {
        if (i == 0) {
            this.mInnerCountListener.startCount();
        }
        this.mCounterTask.setCurrentTime(i);
        n4h.a(this.mCounterTask).c(this.mInnerCountListener);
    }

    public static RxCountDown getTask() {
        return new RxCountDown();
    }

    public void start(int i, ICountDownListener iCountDownListener) {
        this.mInnerCountListener = new CountListener(i, this, iCountDownListener);
        this.mCounterTask = new CounterTask();
        countInterval(0);
    }
}
