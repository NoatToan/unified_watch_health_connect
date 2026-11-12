package com.huawei.hms.network.file.core.task;

import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.network.embedded.n2;
import com.huawei.hms.network.embedded.x2;
import com.huawei.hms.network.file.api.Callback;
import com.huawei.hms.network.file.api.Progress;
import com.huawei.hms.network.file.api.Request;
import com.huawei.hms.network.file.api.RequestConfig;
import com.huawei.hms.network.file.api.Response;
import com.huawei.hms.network.file.api.Result;
import com.huawei.hms.network.file.core.Constants;
import com.huawei.hms.network.file.core.FileManagerException;
import com.huawei.hms.network.file.core.util.FLogger;
import com.huawei.hms.network.file.core.util.Utils;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Submit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes10.dex */
public class i<R extends Request> implements f<k<R>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile R f15758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Callback f15759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c f15760c;
    volatile List<k> d;
    com.huawei.hms.network.file.core.d f;
    List<String> g;
    h j;
    ExecutorService k;
    ExecutorService l;
    ExecutorService m;
    j o;
    int s;
    com.huawei.hms.network.file.core.util.f u;
    RequestFinishedInfo w;
    volatile Throwable x;
    volatile Submit y;
    String z;
    private final Object e = new Object();
    int h = 0;
    volatile String i = "";
    volatile long n = 0;
    private com.huawei.hms.network.file.core.a p = com.huawei.hms.network.file.core.a.a();
    volatile boolean q = false;
    volatile boolean r = false;
    volatile boolean t = false;
    private final Object v = new Object();
    private boolean A = false;

    public Result k() {
        FLogger.i("RequestProcessor", "requestProcessor start:" + this.f15758a.getId(), new Object[0]);
        Result resultA = this.f15760c.a(this.f15758a);
        if (resultA.getCode() != Constants.ErrorCode.SUCCESS.getErrorCode()) {
            FLogger.e("RequestProcessor", "start checkParams failed:" + resultA);
            return resultA;
        }
        this.f15760c.b(this.f15758a);
        this.d = d(this.f15760c.c(this.f15758a));
        a(true);
        this.o.d(this.f15758a);
        this.p.c(this.f15758a.getId());
        return resultA;
    }

    void j() {
        this.n = 0L;
    }

    public Result i() {
        synchronized (this) {
            boolean zN = n();
            FLogger.i("RequestProcessor", "pause request:" + this.f15758a.getId() + ",isTaskExecuteFinished:" + zN, new Object[0]);
            if (zN) {
                return Result.RESULT_STATUS_FAILED;
            }
            this.o.c(this.f15758a);
            this.r = false;
            b();
            h hVar = this.j;
            if (hVar != null) {
                hVar.a();
            }
            o();
            return Result.RESULT_SUCCESS;
        }
    }

    public void h() {
        h hVar;
        synchronized (this) {
            e.a aVarD = d();
            FLogger.w("RequestProcessor", "onFinished status:" + aVarD, new Object[0]);
            if (aVarD != e.a.PROCESS) {
                return;
            }
            if (this.q && (hVar = this.j) != null && !hVar.d()) {
                FLogger.i("RequestProcessor", "task is finished", new Object[0]);
                return;
            }
            for (k kVar : this.d) {
                FLogger.d("RequestProcessor", "task is Finished:" + kVar.b(), new Object[0]);
                if (!kVar.b()) {
                    FLogger.w("RequestProcessor", "task is still process", new Object[0]);
                    return;
                }
            }
            this.q = true;
            if (this.w != null) {
                k.a(this.d, this.w);
            }
            h hVar2 = new h(this, this.d, this.m);
            this.j = hVar2;
            hVar2.c();
        }
    }

    void g() {
        FLogger.i("RequestProcessor", "notifyRequestFinished", new Object[0]);
        this.f.a(this.f15758a);
    }

    boolean f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f15758a.getUrl());
        if (!Utils.isEmpty(this.f15758a.getBackupUrls())) {
            arrayList.addAll(this.f15758a.getBackupUrls());
        }
        return !Utils.isDeepEqual(arrayList, this.g);
    }

    boolean e() {
        boolean z;
        synchronized (this) {
            z = this.x != null;
        }
        return z;
    }

    public e.a d() {
        return this.o.c();
    }

    public R c() {
        R r;
        synchronized (this.v) {
            r = this.f15758a;
        }
        return r;
    }

    boolean b(List<ITaskResult> list) {
        this.o.a(this.f15758a);
        FLogger.i("RequestProcessor", "2.compose results", new Object[0]);
        try {
            ITaskResult iTaskResultA = this.f15760c.a(this.f15758a, this.d);
            if (Constants.a(iTaskResultA.getErrorCode())) {
                FLogger.i("RequestProcessor", "3.convertResponse", new Object[0]);
                try {
                    final Response response = new Response(iTaskResultA.getErrorCode(), iTaskResultA.getErrorMessage(), this.f15758a, iTaskResultA.getRawResponse(), this.f15758a.getConverter() != null ? this.f15758a.getConverter().convertResponse(this.f15758a, iTaskResultA) : null);
                    FLogger.i("RequestProcessor", "4.runAsyncForResponse success:" + this.f15758a.getId(), new Object[0]);
                    int iB = this.p.b(this.f15758a.getId());
                    a(response, iB);
                    LinkedHashMap<String, String> linkedHashMapA = a(iB);
                    a(new Runnable() { // from class: com.huawei.hms.network.file.core.task.i$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.a(response);
                        }
                    });
                    this.p.a(this.f15758a.getId());
                    this.u.a(this.d, null, this.o, linkedHashMapA);
                    return false;
                } catch (Throwable th) {
                    FLogger.e("RequestProcessor", "5.task failed ", th);
                    e = new FileManagerException("convert exception:" + th);
                }
            } else {
                FLogger.w("RequestProcessor", iTaskResultA.getErrorMessage(), new Object[0]);
                e = new FileManagerException(iTaskResultA.getErrorCode(), iTaskResultA.getErrorMessage());
            }
        } catch (FileManagerException e) {
            e = e;
        }
        a(e, c(list));
        return true;
    }

    boolean b(final Throwable th) {
        FileManagerException fileManagerException;
        if (!c(th)) {
            if (th instanceof FileManagerException) {
                fileManagerException = (FileManagerException) Utils.cast(th);
            } else if (th.getCause() instanceof FileManagerException) {
                th = th.getCause();
                fileManagerException = (FileManagerException) Utils.cast(th);
            } else {
                fileManagerException = new FileManagerException(Constants.ErrorCode.TASK_UNCACHED_EXCEPTION, th);
            }
            return !a(fileManagerException);
        }
        final Constants.ErrorCode errorCode = Constants.ErrorCode.TASK_PAUSE_EXCEPTION;
        if (d() == e.a.CANCEL) {
            errorCode = Constants.ErrorCode.TASK_CANCEL_EXCEPTION;
        }
        if (this.f15759b != null) {
            final Response responseB = b(errorCode.getErrorCode());
            a(responseB, this.p.b(this.f15758a.getId()));
            this.p.a(this.f15758a.getId());
            a(new Runnable() { // from class: com.huawei.hms.network.file.core.task.i$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(errorCode, th, responseB);
                }
            });
        }
        return true;
    }

    public boolean b(k<R> kVar) {
        synchronized (this) {
            if (!this.r) {
                this.r = true;
                if (!b(this.f15758a)) {
                    this.r = false;
                    return false;
                }
                this.f15760c.c();
                this.u.a();
                this.o.a(this.f15758a, this.d);
            }
            return true;
        }
    }

    void b() {
        String str;
        String str2;
        synchronized (this) {
            this.t = true;
            StringBuilder sb = new StringBuilder("cancelTasks isTaskNull:");
            sb.append(this.d == null);
            FLogger.w("RequestProcessor", sb.toString(), new Object[0]);
            if (this.d != null) {
                for (k kVar : this.d) {
                    kVar.b(true);
                    if (this.y != null) {
                        try {
                            this.y.cancel();
                            FLogger.i("RequestProcessor", "submit.cancel state:" + this.y.isCanceled(), new Object[0]);
                        } catch (RuntimeException e) {
                            e = e;
                            str = "submit.cancel runtimeException";
                            FLogger.e("RequestProcessor", str, e);
                        } catch (Exception e2) {
                            e = e2;
                            str = "submit.cancel exception";
                            FLogger.e("RequestProcessor", str, e);
                        }
                    }
                    if (kVar.g() != null) {
                        try {
                            kVar.g().cancel();
                        } catch (RuntimeException e3) {
                            e = e3;
                            str2 = "submit.cancel runtimeException";
                            FLogger.e("RequestProcessor", str2, e);
                        } catch (Exception e4) {
                            e = e4;
                            str2 = "submit.cancel exception";
                            FLogger.e("RequestProcessor", str2, e);
                        }
                    }
                    if (kVar.e() != null) {
                        kVar.e().cancel(true);
                    }
                }
            }
        }
    }

    boolean a(Throwable th) {
        boolean zB;
        synchronized (this) {
            this.o.a(this.f15758a);
            if (!this.t) {
                b();
            }
            if (th != null && this.x == null) {
                this.x = th;
            }
            zB = b(this.x);
        }
        return zB;
    }

    boolean a(String str) {
        if (Utils.isUrlValid(this.f15758a.getUrl()) && Utils.isUrlValid(this.f15758a.getBackupUrls())) {
            return true;
        }
        FLogger.e("RequestProcessor", "checkAllUrlsValid failed for:" + str);
        a(new FileManagerException(Constants.ErrorCode.REQUEST_URL_EMPTY), (Response) null);
        return false;
    }

    @Override // com.huawei.hms.network.file.core.task.f
    public boolean a(long j) {
        FLogger.i("RequestProcessor", "onFileLengthUpdated fileSize:" + j, new Object[0]);
        if (this.t) {
            FLogger.w("RequestProcessor", "onFileLengthUpdated, all task is Canceled, no need to process", new Object[0]);
            return false;
        }
        List<k> listA = this.f15760c.a(this.f15758a, this.d, j);
        if (Utils.isEmpty(listA)) {
            return false;
        }
        FLogger.i("RequestProcessor", "onFileLengthUpdated, newTaskListSize:" + listA.size(), new Object[0]);
        this.d.addAll(listA);
        a(listA);
        return true;
    }

    void a(boolean z) {
        synchronized (this) {
            if (Utils.isEmpty(this.d)) {
                FLogger.i("RequestProcessor", "startCore getCachedTasks", new Object[0]);
                this.d = d(this.f15760c.b(this.f15758a.getId()));
                this.o.a(this.o.c(this.d));
            }
            if (Utils.isEmpty(this.d)) {
                FLogger.i("RequestProcessor", "startCore decompose", new Object[0]);
                this.d = d(this.f15760c.c(this.f15758a));
            }
            if (z) {
                this.i = l();
            }
            if (Utils.isEmpty(this.d)) {
                a(new FileManagerException(Constants.ErrorCode.REQUEST_TASKS_EMPTY), (Response) null);
                return;
            }
            if (this.t) {
                k kVarA = k.a(this.d);
                if (kVarA.r() != null) {
                    this.w = kVarA.r();
                }
                this.d = d(k.b(this.d));
            }
            this.t = false;
            a(this.d);
        }
    }

    void a(List<k> list) {
        synchronized (this) {
            try {
                if (this.k.isShutdown() || this.m.isShutdown()) {
                    FLogger.e("RequestProcessor", "executorService is shutdown");
                    return;
                }
                if (this.j != null) {
                    FLogger.i("RequestProcessor", "disable last allfuture", new Object[0]);
                    this.j.b();
                }
                FLogger.i("RequestProcessor", "executeTasks size:" + list.size(), new Object[0]);
                this.x = null;
                this.z = UUID.randomUUID().toString();
                if (Utils.isEmpty(list)) {
                    FLogger.e("RequestProcessor", "executeTasks tasks is null");
                    a(new FileManagerException(Constants.ErrorCode.REQUEST_TASKS_EMPTY), (Response) null);
                    return;
                }
                this.u.b();
                Iterator<k> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        new a(this, it.next(), this.k, this.m, this.z).a();
                    } catch (RejectedExecutionException e) {
                        FLogger.e("RequestProcessor", "RejectedExecutionException for CompletableFuture.supplyAsync");
                        b();
                        a(new FileManagerException(Constants.ErrorCode.TASK_SUBMIT_EXCEPTION, e), (Response) null);
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void a(Throwable th, String str) {
        synchronized (this) {
            if (this.A) {
                FLogger.w("RequestProcessor", "has throw exception, this time ignore", new Object[0]);
                return;
            }
            if (this.x == null) {
                FLogger.i("RequestProcessor", "onTaskFutureException set throwable", new Object[0]);
                this.x = th;
            }
            b();
            this.A = a(this.x);
        }
    }

    void a(Runnable runnable) {
        String str;
        if (this.l.isShutdown()) {
            str = "runAsyncForResponse respExecutorService is shut down";
        } else {
            try {
                this.l.submit(runnable);
                return;
            } catch (RejectedExecutionException unused) {
                str = "runAsyncForResponse failed for RejectedExecutionException";
            }
        }
        FLogger.e("RequestProcessor", str);
    }

    @Override // com.huawei.hms.network.file.core.task.f
    public void a(Submit submit) {
        this.y = submit;
    }

    @Override // com.huawei.hms.network.file.core.task.f
    public void a(k<R> kVar) {
        final Progress progressA;
        if (this.f15759b == null) {
            return;
        }
        synchronized (this.e) {
            if (this.t) {
                FLogger.i("RequestProcessor", "onProgress no need for status:" + d(), new Object[0]);
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if ((this.n <= 0 || jCurrentTimeMillis - this.n > 1000) && (progressA = this.o.a(this.f15758a, this.i, this.d)) != null) {
                    this.n = jCurrentTimeMillis;
                    this.f15760c.b(this.d);
                    this.f15760c.b(this.f15758a, d());
                    a(new Runnable() { // from class: com.huawei.hms.network.file.core.task.i$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.a(progressA);
                        }
                    });
                }
            }
        }
    }

    void a(e eVar) {
        synchronized (this) {
            eVar.a(this.i);
            eVar.a(this.f15758a);
            eVar.b(false);
        }
    }

    void a(FileManagerException fileManagerException, List<ITaskResult> list) {
        a(fileManagerException, c(list), false);
    }

    void a(final FileManagerException fileManagerException, Response response, boolean z) {
        final Response response2;
        FLogger.i("RequestProcessor", "onRequestException isNetworkException:" + z, new Object[0]);
        if (!z) {
            this.f15760c.a(this.f15758a.getId(), false);
        }
        int iB = this.p.b(this.f15758a.getId());
        if (response != null) {
            response2 = new Response(fileManagerException.getErrorCode(), fileManagerException.getMessage(), response.getRequest(), response.getRawResponse(), null);
            a(response2, iB);
        } else {
            response2 = null;
        }
        LinkedHashMap<String, String> linkedHashMapA = a(iB);
        this.o.a(this.f15758a, fileManagerException);
        this.p.a(this.f15758a.getId());
        if (this.f15759b != null) {
            a(new Runnable() { // from class: com.huawei.hms.network.file.core.task.i$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(fileManagerException, response2);
                }
            });
        }
        this.u.a(this.d, fileManagerException, this.o, linkedHashMapA);
    }

    void a(FileManagerException fileManagerException, Response response) {
        a(fileManagerException, response, false);
    }

    public void a(R r, Callback callback, boolean z) {
        synchronized (this) {
            if (!Utils.isEmpty(this.d) && !this.f15760c.a(this.d)) {
                this.d.clear();
            }
            this.o.e(r);
            c(r);
            this.p.c(r.getId());
            this.f15759b = callback;
            this.A = false;
            FLogger.i("RequestProcessor", "resume :" + r.getId() + ";resume url :" + Utils.anonymizeMessage(r.getUrl()), new Object[0]);
            a(z);
        }
    }

    public Result a() {
        synchronized (this) {
            boolean zN = n();
            FLogger.i("RequestProcessor", "cancel request:" + this.f15758a.getId() + ",isTaskExecuteFinished:" + zN, new Object[0]);
            if (zN) {
                return Result.RESULT_STATUS_FAILED;
            }
            e.a aVarD = d();
            this.o.b(this.f15758a);
            if (aVarD != e.a.PAUSE) {
                b();
                h hVar = this.j;
                if (hVar != null) {
                    hVar.a();
                }
            }
            this.f15760c.a(this.f15758a.getId());
            o();
            return Result.RESULT_SUCCESS;
        }
    }

    Request a(R r) {
        try {
            return this.f15759b.onStart(r);
        } catch (Throwable th) {
            FLogger.e("RequestProcessor", "customRequestCallback.onStart exception", th);
            return null;
        }
    }

    private void o() {
        a((Throwable) new CancellationException("task is Interrupt"));
    }

    private boolean n() {
        synchronized (this) {
            h hVar = this.j;
            return hVar != null && hVar.e();
        }
    }

    private List<String> m() {
        ArrayList arrayList = new ArrayList();
        if (Utils.isUrlValid(this.f15758a.getUrl())) {
            arrayList.add(this.f15758a.getUrl());
        }
        if (Utils.isUrlValid(this.f15758a.getBackupUrls())) {
            arrayList.addAll(this.f15758a.getBackupUrls());
        }
        return arrayList;
    }

    private String l() {
        if (Utils.isEmpty(this.g)) {
            this.g = m();
        }
        if (this.h >= this.g.size()) {
            return null;
        }
        FLogger.i("RequestProcessor", "getNextUrl urlIndex :" + this.h, new Object[0]);
        List<String> list = this.g;
        int i = this.h;
        this.h = i + 1;
        return list.get(i);
    }

    private List<k> d(List<k> list) {
        return (list == null || list.size() <= 0) ? list : Collections.synchronizedList(list);
    }

    private boolean c(Throwable th) {
        return (th instanceof CancellationException) || (th.getCause() instanceof CancellationException);
    }

    private void c(R r) {
        synchronized (this.v) {
            this.f15758a = r;
        }
    }

    private Response c(List<ITaskResult> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (ITaskResult iTaskResult : list) {
            if (iTaskResult.getRawResponse() != null) {
                return new Response(iTaskResult.getErrorCode(), this.f15758a, iTaskResult.getRawResponse(), null);
            }
        }
        return new Response(list.get(0).getErrorCode(), this.f15758a, null, null);
    }

    private boolean b(final R r) {
        if (this.f15759b == null) {
            return a("performOnStart null callback");
        }
        Request requestA = a((Request) r);
        if (requestA == null || requestA == r) {
            return a("performOnStart no update");
        }
        FLogger.i("RequestProcessor", "performOnStart update request:" + requestA, new Object[0]);
        if (r.getId() != requestA.getId()) {
            FLogger.e("RequestProcessor", "performOnStart, onStart return another request");
            g();
            final Response responseB = b(Constants.ErrorCode.REQUEST_UPDATE_REQUEST_ERROR.getErrorCode());
            a(responseB, this.p.b(r.getId()));
            this.p.a(r.getId());
            a(new Runnable() { // from class: com.huawei.hms.network.file.core.task.i$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(r, responseB);
                }
            });
            return false;
        }
        c(requestA);
        if (!a("after on Start")) {
            return false;
        }
        if (f()) {
            List<String> list = this.g;
            if (list != null) {
                list.clear();
            }
            this.h = 0;
            this.i = l();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(FileManagerException fileManagerException, Response response) {
        g();
        this.f15759b.onException(this.f15758a, com.huawei.hms.network.file.core.util.b.a(fileManagerException), response);
    }

    private Response b(int i) {
        if (this.d.size() > 0) {
            k kVarA = k.a(this.d);
            if (kVarA.u() != null) {
                return new Response(i, this.f15758a, kVarA.u().getRawResponse(), null);
            }
        }
        return new Response(i, this.f15758a, null, null);
    }

    private boolean a(FileManagerException fileManagerException) {
        FLogger.w("RequestProcessor", "notifyTaskException(will cancel other tasks)", new Object[0]);
        boolean zA = com.huawei.hms.network.file.core.util.b.a(fileManagerException.getCause());
        boolean z = d() == e.a.PROCESS && this.h < this.g.size();
        FLogger.i("RequestProcessor", "notifyTaskException isNetworkException:" + zA + ",needRetry:" + z + ",getStatus:" + d(), new Object[0]);
        if (!z) {
            FLogger.e("RequestProcessor", "processFileManagerException", fileManagerException);
            a(fileManagerException, b(fileManagerException.getErrorCode()), zA);
            return z;
        }
        k kVarA = k.a(this.d);
        boolean z2 = kVarA == null || kVarA.d() == e.b.UPLOAD;
        if (!zA || z2) {
            this.f15760c.a(c().getId(), true);
            this.d.clear();
        }
        FLogger.i("RequestProcessor", "notifyTaskException try next url", new Object[0]);
        j();
        a(true);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Constants.ErrorCode errorCode, Throwable th, Response response) {
        this.f15759b.onException(this.f15758a, com.huawei.hms.network.file.core.util.b.a(new FileManagerException(errorCode, th)), response);
    }

    private void a(Response response, int i) {
        if (!Utils.isEmpty(this.d)) {
            k kVarA = k.a(this.d);
            if (kVarA.d() == e.b.UPLOAD) {
                ((com.huawei.hms.network.file.b.f) Utils.cast(kVarA)).a(response.getExtraInfo());
            }
            response.getExtraInfo().put(x2.PROTOCOL, kVarA.n());
            response.getExtraInfo().put("protocol_impl", kVarA.o());
            response.getExtraInfo().put(n2.CONGESTION_CONTROL_TYPE, kVarA.i());
            response.getExtraInfo().put("concurrent_task_num", Integer.valueOf(i));
            response.getExtraInfo().put("multipath_algorithm", Integer.valueOf(kVarA.l()));
        }
        RequestConfig config = this.f15758a.getConfig();
        if (config != null) {
            response.getExtraInfo().put("association_id", Utils.getValueFromOptions("association_id", config.getOptions()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Response response) {
        Callback callback = this.f15759b;
        if (callback != null) {
            try {
                callback.onSuccess(response);
            } catch (Throwable th) {
                FLogger.e("RequestProcessor", "customRequestCallback.onSuccess exception", th);
            }
        }
        FLogger.i("RequestProcessor", "5.remove data after onSuccess", new Object[0]);
        this.o.f(this.f15758a);
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Request request, Response response) {
        this.f15759b.onException(request, com.huawei.hms.network.file.core.util.b.a(new FileManagerException(Constants.ErrorCode.REQUEST_UPDATE_REQUEST_ERROR)), response);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Progress progress) {
        if (this.t) {
            FLogger.i("RequestProcessor", "response onProgress no need for status:" + d(), new Object[0]);
        } else {
            FLogger.v("RequestProcessor", "onProgress:" + progress);
            this.f15759b.onProgress(this.f15758a, progress);
        }
    }

    private LinkedHashMap<String, String> a(int i) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        int i2 = this.h;
        linkedHashMap.put("retry_url_index", String.valueOf(i2 == 0 ? 0 : i2 - 1));
        linkedHashMap.put("domain", NetworkUtil.getHost(this.i));
        linkedHashMap.put(x2.API_ID, Utils.anonymizeMessage(Utils.getUrlPath(this.i)));
        linkedHashMap.put("task_num", String.valueOf(this.s));
        linkedHashMap.put("concurrent_task_num", String.valueOf(i));
        return linkedHashMap;
    }

    public i(R r, c cVar, Callback callback, com.huawei.hms.network.file.core.d dVar, com.huawei.hms.network.file.core.f fVar) {
        c(r);
        this.f15760c = cVar;
        this.o = cVar.a();
        this.f15759b = callback;
        this.f = dVar;
        this.k = fVar.d();
        this.l = fVar.c();
        this.m = fVar.a();
        this.s = fVar.b();
        this.u = new com.huawei.hms.network.file.core.util.f(dVar);
    }
}
