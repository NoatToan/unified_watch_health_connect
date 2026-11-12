package com.ximalaya.ting.android.sdkdownloader.task;

/* JADX INFO: loaded from: classes22.dex */
public interface Callback {

    public interface Cancelable {
        void cancel();

        void cancleAndRemove();

        boolean isCancelled();

        boolean isRemoved();

        void removeTaskFromQueue();
    }

    public static class CancelledException extends RuntimeException {
        public CancelledException(String str) {
            super(str);
        }
    }

    public interface CommonCallback<ResultType> extends Callback {
        void onCancelled(CancelledException cancelledException);

        void onError(Throwable th, boolean z);

        void onFinished();

        void onRemoved(RemovedException removedException);

        void onSuccess(ResultType resulttype);
    }

    public interface ProgressCallback<ResultType> extends CommonCallback<ResultType> {
        void onLoading(long j, long j2, boolean z);

        void onStarted();

        void onWaiting();
    }

    public static class RemovedException extends RuntimeException {
        public RemovedException(String str) {
            super(str);
        }
    }
}
