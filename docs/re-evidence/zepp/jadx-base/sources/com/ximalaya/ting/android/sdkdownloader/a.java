package com.ximalaya.ting.android.sdkdownloader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.sdkdownloader.downloadutil.DownloadState;
import com.ximalaya.ting.android.sdkdownloader.exception.DbException;
import com.ximalaya.ting.android.sdkdownloader.task.Callback;
import java.io.File;

/* JADX INFO: loaded from: classes22.dex */
class a implements Callback.CommonCallback<File>, Callback.ProgressCallback<File>, Callback.Cancelable {
    private static final String f = "DownloadCallBack";
    public static final c g = new c();
    private static final int h = 1000000000;
    private static final int i = 1000000001;
    private static final int j = 1000000002;
    private static final int k = 1000000003;
    private static final int l = 1000000004;
    private static final int m = 1000000005;
    private static final int n = 1000000006;
    private static final int o = 1000000007;
    private Track a;
    private XmDownloadManager b;
    private boolean c = false;
    private boolean d = false;
    private Callback.Cancelable e;

    public static class b {
        public final a a;
        public final Object[] b;

        public b(a aVar, Object... objArr) {
            this.a = aVar;
            this.b = objArr;
        }
    }

    public static final class c extends Handler {
        public static final /* synthetic */ boolean a = false;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object[] objArr;
            Object obj = message.obj;
            if (obj == null) {
                throw new IllegalArgumentException("msg must not be null");
            }
            a aVar = null;
            if (obj instanceof a) {
                aVar = (a) obj;
                objArr = null;
            } else if (obj instanceof b) {
                b bVar = (b) obj;
                aVar = bVar.a;
                objArr = bVar.b;
            } else {
                objArr = null;
            }
            if (aVar == null) {
                return;
            }
            Track track = aVar.a;
            XmDownloadManager xmDownloadManager = aVar.b;
            if (xmDownloadManager == null || track == null) {
                return;
            }
            try {
                switch (message.what) {
                    case a.i /* 1000000001 */:
                        xmDownloadManager.handleOnWaiting(track);
                        break;
                    case a.j /* 1000000002 */:
                        xmDownloadManager.handlerOnStarted(track);
                        break;
                    case a.k /* 1000000003 */:
                        xmDownloadManager.handlerOnSuccess(track);
                        break;
                    case a.l /* 1000000004 */:
                        xmDownloadManager.handlerOnError(track, (Throwable) objArr[0]);
                        break;
                    case a.m /* 1000000005 */:
                        xmDownloadManager.handlerOnCancelled(track, (Callback.CancelledException) objArr[0]);
                        break;
                    case a.n /* 1000000006 */:
                        xmDownloadManager.handlerOnRemoved(track, (Callback.RemovedException) objArr[0]);
                        break;
                    case a.o /* 1000000007 */:
                        xmDownloadManager.handlerOnProgress(track, ((Long) objArr[0]).longValue(), ((Long) objArr[1]).longValue());
                        break;
                }
            } catch (Throwable th) {
                if (message.what != a.l) {
                    aVar.onError(th, true);
                }
            }
        }

        private c() {
            super(Looper.getMainLooper());
        }
    }

    public a(Track track) {
        this.a = track;
    }

    private boolean d() {
        return isCancelled() || DownloadState.valueOf(this.a.getDownloadStatus()).value() > DownloadState.STARTED.value();
    }

    public boolean c() {
        return this.a.getDownloadStatus() == DownloadState.STARTED.value();
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.Callback.Cancelable
    public void cancel() {
        this.c = true;
        Callback.Cancelable cancelable = this.e;
        if (cancelable != null) {
            cancelable.cancel();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.Callback.Cancelable
    public void cancleAndRemove() {
        this.d = true;
        Callback.Cancelable cancelable = this.e;
        if (cancelable != null) {
            cancelable.cancleAndRemove();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.Callback.CommonCallback
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onSuccess(File file) {
        synchronized (a.class) {
            try {
                this.a.setDownloadStatus(DownloadState.FINISHED.value());
                this.b.updateDownloadInfo(this.a);
            } catch (DbException e) {
                Log.e(f, "onSuccess: " + e.getMessage());
            }
            g.obtainMessage(k, this).sendToTarget();
        }
    }

    public void f() {
        this.c = true;
    }

    public void g(Callback.Cancelable cancelable) {
        this.e = cancelable;
    }

    public void h(XmDownloadManager xmDownloadManager) {
        this.b = xmDownloadManager;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.Callback.Cancelable
    public boolean isCancelled() {
        return this.c;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.Callback.Cancelable
    public boolean isRemoved() {
        return this.d;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.Callback.CommonCallback
    public void onCancelled(Callback.CancelledException cancelledException) {
        synchronized (a.class) {
            try {
                this.a.setDownloadStatus(DownloadState.STOPPED.value());
                this.b.updateDownloadInfo(this.a);
            } catch (DbException e) {
                Log.e(f, "onCancelled: " + e.getMessage());
            }
            g.obtainMessage(m, new b(this, cancelledException)).sendToTarget();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.Callback.CommonCallback
    public void onError(Throwable th, boolean z) {
        synchronized (a.class) {
            try {
                this.a.setDownloadStatus(DownloadState.ERROR.value());
                this.b.updateDownloadInfo(this.a);
            } catch (DbException e) {
                Log.e(f, "onError: " + e.getMessage());
            }
            if (!z) {
                g.obtainMessage(l, new b(this, th)).sendToTarget();
            }
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.Callback.CommonCallback
    public void onFinished() {
        this.c = false;
        this.d = false;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.Callback.ProgressCallback
    public void onLoading(long j2, long j3, boolean z) {
        synchronized (a.class) {
            if (z) {
                try {
                    this.a.setDownloadStatus(DownloadState.STARTED.value());
                    this.a.setDownloadSize(j2);
                    this.a.setDownloadedSize(j3);
                    this.b.updateDownloadInfo(this.a);
                } catch (DbException e) {
                    Log.e(f, "onLoading: " + e.getMessage());
                }
                g.obtainMessage(o, new b(this, Long.valueOf(j2), Long.valueOf(j3))).sendToTarget();
            }
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.Callback.CommonCallback
    public void onRemoved(Callback.RemovedException removedException) {
        synchronized (a.class) {
            g.obtainMessage(n, new b(this, removedException)).sendToTarget();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.Callback.ProgressCallback
    public void onStarted() {
        synchronized (a.class) {
            try {
                this.a.setDownloadStatus(DownloadState.STARTED.value());
                this.b.updateDownloadInfo(this.a);
            } catch (DbException e) {
                Log.e(f, "onStarted: " + e.getMessage());
            }
        }
        g.obtainMessage(j, this).sendToTarget();
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.Callback.ProgressCallback
    public void onWaiting() {
        synchronized (a.class) {
            try {
                this.a.setDownloadStatus(DownloadState.WAITING.value());
                this.b.updateDownloadInfo(this.a);
            } catch (DbException e) {
                Log.e(f, "onWaiting : " + e.getMessage());
            }
            g.obtainMessage(i, this).sendToTarget();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.Callback.Cancelable
    public void removeTaskFromQueue() {
        Callback.Cancelable cancelable = this.e;
        if (cancelable != null) {
            cancelable.removeTaskFromQueue();
        }
    }
}
