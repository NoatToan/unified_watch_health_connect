package com.ximalaya.ting.android.sdkdownloader.http;

import android.text.TextUtils;
import com.ximalaya.ting.android.opensdk.util.Logger;
import com.ximalaya.ting.android.sdkdownloader.XmDownloadManager;
import com.ximalaya.ting.android.sdkdownloader.exception.HttpException;
import com.ximalaya.ting.android.sdkdownloader.exception.HttpRedirectException;
import com.ximalaya.ting.android.sdkdownloader.http.app.HttpRetryHandler;
import com.ximalaya.ting.android.sdkdownloader.http.app.RedirectHandler;
import com.ximalaya.ting.android.sdkdownloader.http.app.RequestTracker;
import com.ximalaya.ting.android.sdkdownloader.http.loader.FileLoader;
import com.ximalaya.ting.android.sdkdownloader.http.request.HttpRequest;
import com.ximalaya.ting.android.sdkdownloader.http.request.UriRequest;
import com.ximalaya.ting.android.sdkdownloader.task.AbsTask;
import com.ximalaya.ting.android.sdkdownloader.task.Callback;
import com.ximalaya.ting.android.sdkdownloader.task.Priority;
import com.ximalaya.ting.android.sdkdownloader.task.PriorityExecutor;
import com.ximalaya.ting.android.sdkdownloader.util.IOUtil;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes22.dex */
public class DownloadTask<ResultType> extends AbsTask<ResultType> implements ProgressHandler {
    private static final int r = 3;
    private static final AtomicInteger s = new AtomicInteger(0);
    private static final HashMap<String, WeakReference<DownloadTask<?>>> t = new HashMap<>(1);
    private static final PriorityExecutor u = new PriorityExecutor(3, false);
    private static final int v = 1;
    private static final int w = 3;
    public static final /* synthetic */ boolean x = false;
    private RequestParams g;
    private UriRequest h;
    private DownloadTask<ResultType>.c i;
    private final Executor j;
    private volatile boolean k;
    private final Callback.CommonCallback<ResultType> l;
    private Object m;
    private Callback.ProgressCallback n;
    private RequestTracker o;
    private long p;
    private long q;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadTask.this.n();
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ boolean a;

        public b(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger.log("DownloadTask : cancelWorks 2");
            if (!this.a) {
                DownloadTask.this.n();
                return;
            }
            DownloadTask.this.m();
            if (DownloadTask.this.h != null) {
                try {
                    DownloadTask.this.h.closeAndRemove();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public final class c {
        public Object a;
        public Throwable b;

        public /* synthetic */ c(DownloadTask downloadTask, a aVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:42:0x0080  */
        /* JADX WARN: Code duplicated, block: B:43:0x0083  */
        public void a() {
            HttpException httpException;
            int code;
            RedirectHandler redirectHandler;
            String str;
            boolean z = false;
            while (DownloadTask.s.get() >= 3 && !DownloadTask.this.isCancelled()) {
                try {
                    synchronized (DownloadTask.s) {
                        try {
                            DownloadTask.s.wait(10L);
                        } catch (InterruptedException unused) {
                            z = true;
                            DownloadTask.s.incrementAndGet();
                            if (z) {
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("cancelled before request");
                            if (z) {
                                str = "(interrupted)";
                            } else {
                                str = "";
                            }
                            sb.append(str);
                            throw new Callback.CancelledException(sb.toString());
                        } catch (Throwable unused2) {
                        }
                    }
                } catch (Throwable th) {
                    try {
                        this.b = th;
                        if ((th instanceof HttpException) && (((code = (httpException = th).getCode()) == 301 || code == 302) && (redirectHandler = DownloadTask.this.g.getRedirectHandler()) != null)) {
                            try {
                                RequestParams redirectParams = redirectHandler.getRedirectParams(DownloadTask.this.h);
                                if (redirectParams != null) {
                                    DownloadTask.this.g = redirectParams;
                                    DownloadTask downloadTask = DownloadTask.this;
                                    downloadTask.h = downloadTask.o();
                                    this.b = new HttpRedirectException(code, httpException.getMessage(), httpException.getResult());
                                }
                            } catch (Throwable unused3) {
                                this.b = th;
                            }
                        }
                        synchronized (DownloadTask.s) {
                            DownloadTask.s.decrementAndGet();
                            DownloadTask.s.notifyAll();
                            return;
                        }
                    } catch (Throwable th2) {
                        synchronized (DownloadTask.s) {
                            DownloadTask.s.decrementAndGet();
                            DownloadTask.s.notifyAll();
                            throw th2;
                        }
                    }
                }
            }
            DownloadTask.s.incrementAndGet();
            if (!z || DownloadTask.this.isCancelled()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("cancelled before request");
                if (z) {
                    str = "(interrupted)";
                } else {
                    str = "";
                }
                sb2.append(str);
                throw new Callback.CancelledException(sb2.toString());
            }
            try {
                if (!DownloadTask.this.isCancelled()) {
                    this.a = DownloadTask.this.h.loadResult();
                }
            } catch (Throwable th3) {
                this.b = th3;
            }
            Throwable th4 = this.b;
            if (th4 != null) {
                throw th4;
            }
            synchronized (DownloadTask.s) {
                DownloadTask.s.decrementAndGet();
                DownloadTask.s.notifyAll();
            }
        }

        private c() {
        }
    }

    public DownloadTask(RequestParams requestParams, Callback.Cancelable cancelable, Callback.CommonCallback<ResultType> commonCallback) {
        super(cancelable);
        this.k = false;
        this.m = null;
        this.q = 800L;
        this.g = requestParams;
        this.l = commonCallback;
        if (commonCallback instanceof Callback.ProgressCallback) {
            this.n = (Callback.ProgressCallback) commonCallback;
        }
        RequestTracker requestTracker = requestParams.getRequestTracker();
        if (requestTracker == null && (commonCallback instanceof RequestTracker)) {
            requestTracker = (RequestTracker) commonCallback;
        }
        if (requestTracker != null) {
            this.o = new com.ximalaya.ting.android.sdkdownloader.http.b(requestTracker);
        }
        if (requestParams.getExecutor() != null) {
            this.j = requestParams.getExecutor();
        } else {
            this.j = u;
        }
    }

    private void l() {
        HashMap<String, WeakReference<DownloadTask<?>>> map = t;
        synchronized (map) {
            String saveFilePath = this.g.getSaveFilePath();
            if (!TextUtils.isEmpty(saveFilePath)) {
                WeakReference<DownloadTask<?>> weakReference = map.get(saveFilePath);
                if (weakReference != null) {
                    DownloadTask<?> downloadTask = weakReference.get();
                    if (downloadTask != null) {
                        downloadTask.cancel();
                        downloadTask.n();
                    }
                    map.remove(saveFilePath);
                }
                map.put(saveFilePath, new WeakReference<>(this));
            }
            if (map.size() > 3) {
                Iterator<Map.Entry<String, WeakReference<DownloadTask<?>>>> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    WeakReference<DownloadTask<?>> value = it2.next().getValue();
                    if (value == null || value.get() == null) {
                        it2.remove();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        Object obj = this.m;
        if (obj instanceof Closeable) {
            IOUtil.closeQuietly((Closeable) obj);
        }
        this.m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        m();
        IOUtil.closeQuietly(this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public UriRequest o() throws Throwable {
        this.g.a();
        HttpRequest httpRequest = new HttpRequest(this.g);
        httpRequest.setCallingClassLoader(this.l.getClass().getClassLoader());
        httpRequest.setProgressHandler(this);
        this.q = this.g.getLoadingUpdateMaxTimeSpan();
        update(1, httpRequest);
        return httpRequest;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public void cancelWorks(boolean z) {
        Logger.log("DownloadTask : cancelWorks 1");
        XmDownloadManager.getInstance().task().run(new b(z));
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public ResultType doBackground() throws Throwable {
        if (isCancelled()) {
            throw new Callback.CancelledException("cancelled before request");
        }
        this.h = o();
        l();
        HttpRetryHandler httpRetryHandler = this.g.getHttpRetryHandler();
        if (httpRetryHandler == null) {
            httpRetryHandler = new HttpRetryHandler();
        }
        httpRetryHandler.setMaxRetryCount(this.g.getMaxRetryCount());
        if (isCancelled()) {
            throw new Callback.CancelledException("cancelled before request");
        }
        a aVar = null;
        Callback.CancelledException th = null;
        ResultType resulttype = null;
        boolean zCanRetry = true;
        int i = 0;
        while (zCanRetry) {
            try {
                if (isCancelled()) {
                    throw new Callback.CancelledException("cancelled before request");
                }
                this.h.close();
                try {
                    m();
                    DownloadTask<ResultType>.c cVar = new c(this, aVar);
                    this.i = cVar;
                    cVar.a();
                    DownloadTask<ResultType>.c cVar2 = this.i;
                    Throwable th2 = cVar2.b;
                    if (th2 != null) {
                        throw th2;
                    }
                    Object obj = cVar2.a;
                    this.m = obj;
                    try {
                        if (isCancelled()) {
                            throw new Callback.CancelledException("cancelled after request");
                        }
                        resulttype = (ResultType) obj;
                        zCanRetry = false;
                    } catch (HttpRedirectException unused) {
                        resulttype = (ResultType) obj;
                        zCanRetry = true;
                    } catch (Throwable th3) {
                        th = th3;
                        resulttype = (ResultType) obj;
                        int responseCode = this.h.getResponseCode();
                        if (responseCode == 204 || responseCode == 205 || responseCode == 304) {
                            return null;
                        }
                        if (responseCode == 403) {
                            RequestParams params = this.h.getParams();
                            this.g = params;
                            try {
                                if (params.getDataSaveType() == FileLoader.DATA_SAVE_TYPE_PAY) {
                                    this.g.uriInvalid();
                                }
                                this.h = o();
                            } catch (Throwable th4) {
                                th4.printStackTrace();
                            }
                        }
                        if (isCancelled() && !(th instanceof Callback.CancelledException)) {
                            th = new Callback.CancelledException("canceled by user");
                        }
                        i++;
                        zCanRetry = httpRetryHandler.canRetry(this.h, th, i);
                    }
                } catch (Throwable th5) {
                    m();
                    if (isCancelled()) {
                        throw new Callback.CancelledException("cancelled during request");
                    }
                    throw th5;
                }
            } catch (HttpRedirectException unused2) {
            } catch (Throwable th6) {
                th = th6;
            }
            zCanRetry = true;
        }
        if (th == null || resulttype != null) {
            return resulttype;
        }
        this.k = true;
        throw th;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public Executor getExecutor() {
        return this.j;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public Priority getPriority() {
        return this.g.getPriority();
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public boolean isCancelFast() {
        return this.g.isCancelFast();
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public void onCancelled(Callback.CancelledException cancelledException) {
        this.l.onCancelled(cancelledException);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public void onError(Throwable th, boolean z) {
        RequestTracker requestTracker = this.o;
        if (requestTracker != null) {
            requestTracker.onError(this.h, th, z);
        }
        this.l.onError(th, z);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public void onFinished() {
        RequestTracker requestTracker = this.o;
        if (requestTracker != null) {
            requestTracker.onFinished(this.h);
        }
        XmDownloadManager.getInstance().task().run(new a());
        this.l.onFinished();
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public void onRemoved(Callback.RemovedException removedException) {
        RequestTracker requestTracker = this.o;
        if (requestTracker != null) {
            requestTracker.onRemoved(this.h);
        }
        this.l.onRemoved(removedException);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public void onStarted() {
        RequestTracker requestTracker = this.o;
        if (requestTracker != null) {
            requestTracker.onStart(this.g);
        }
        Callback.ProgressCallback progressCallback = this.n;
        if (progressCallback != null) {
            progressCallback.onStarted();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public void onSuccess(ResultType resulttype) {
        if (this.k) {
            return;
        }
        RequestTracker requestTracker = this.o;
        if (requestTracker != null) {
            requestTracker.onSuccess(this.h, resulttype);
        }
        this.l.onSuccess(resulttype);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public void onUpdate(int i, Object... objArr) {
        Callback.ProgressCallback progressCallback;
        if (i == 1) {
            RequestTracker requestTracker = this.o;
            if (requestTracker != null) {
                requestTracker.onRequestCreated((UriRequest) objArr[0]);
                return;
            }
            return;
        }
        if (i == 3 && (progressCallback = this.n) != null && objArr.length == 3) {
            try {
                progressCallback.onLoading(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue(), ((Boolean) objArr[2]).booleanValue());
            } catch (Throwable th) {
                this.l.onError(th, true);
            }
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.AbsTask
    public void onWaiting() {
        RequestTracker requestTracker = this.o;
        if (requestTracker != null) {
            requestTracker.onWaiting(this.g);
        }
        Callback.ProgressCallback progressCallback = this.n;
        if (progressCallback != null) {
            progressCallback.onWaiting();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.Callback.Cancelable
    public void removeTaskFromQueue() {
    }

    public String toString() {
        return this.g.toString();
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.http.ProgressHandler
    public boolean updateProgress(long j, long j2, boolean z) {
        if (isCancelled() || isFinished()) {
            return false;
        }
        if (this.n != null && this.h != null && j > 0) {
            if (j < j2) {
                j = j2;
            }
            if (z) {
                this.p = System.currentTimeMillis();
                update(3, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(this.h.isLoading()));
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.p >= this.q) {
                    this.p = jCurrentTimeMillis;
                    update(3, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(this.h.isLoading()));
                }
            }
        }
        return (isCancelled() || isFinished()) ? false : true;
    }
}
