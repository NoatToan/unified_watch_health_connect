package com.huawei.hms.network.file.core.task;

import android.text.TextUtils;
import com.huawei.hms.network.file.api.RequestConfig;
import com.huawei.hms.network.file.core.Constants;
import com.huawei.hms.network.file.core.FileManagerException;
import com.huawei.hms.network.file.core.util.FLogger;
import com.huawei.hms.network.file.upload.api.BodyRequest;
import com.huawei.hms.network.file.upload.api.FileEntity;
import com.huawei.hms.network.file.upload.api.PostRequest;
import com.huawei.hms.network.file.upload.api.PutRequest;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f15746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f15747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ExecutorService f15748c;
    ExecutorService d;
    String e;

    public void a() {
        if (this.f15747b.c() <= 0 || this.f15747b.a() <= 0 || this.f15747b.c() < this.f15747b.a()) {
            this.f15747b.a(this.f15748c.submit(new Callable() { // from class: com.huawei.hms.network.file.core.task.a$$ExternalSyntheticLambda1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f$0.b();
                }
            }));
            return;
        }
        FLogger.i("RequestProcessor", "taskId:" + this.f15747b.f() + " already finished before, ingnore", new Object[0]);
        this.f15747b.a(a((k) this.f15747b));
        this.f15747b.a(true);
        this.f15746a.a(this.f15747b);
        this.f15746a.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ITaskResult b(k kVar) {
        if (kVar.u() != null) {
            return kVar.u();
        }
        l lVar = new l(Constants.ErrorCode.SUCCESS);
        lVar.setTask(kVar);
        lVar.setRawResponse(null);
        kVar.a(lVar);
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ITaskResult b() {
        g gVarB;
        try {
            synchronized (this.f15746a) {
                if (this.f15746a.t) {
                    FLogger.w("RequestProcessor", "all task is Canceled, no need to process", new Object[0]);
                } else if (this.f15746a.b((k) this.f15747b)) {
                    FLogger.v("RequestProcessor", "executeTasks currentUrl:" + this.f15746a.i + ",taskSize:" + this.f15746a.d.size());
                    this.f15746a.a(this.f15747b);
                    boolean z = this.f15747b instanceof com.huawei.hms.network.file.a.d;
                    int i = !z ? 1 : 0;
                    if (!a(i)) {
                        gVarB = this.f15746a.f15760c.b();
                    } else if (z) {
                        String strA = com.huawei.hms.network.file.a.h.f().a(i, b((com.huawei.hms.network.file.a.d) this.f15747b));
                        FLogger.d("ForkTaskFuture", "protocol = " + strA, new Object[0]);
                        gVarB = ((com.huawei.hms.network.file.a.b) this.f15746a.f15760c).a(strA);
                    } else {
                        String strA2 = com.huawei.hms.network.file.a.h.f().a(i, a((com.huawei.hms.network.file.b.f) this.f15747b));
                        FLogger.d("ForkTaskFuture", "protocol = " + strA2, new Object[0]);
                        gVarB = ((com.huawei.hms.network.file.b.d) this.f15746a.f15760c).a(strA2);
                    }
                    gVarB.a(this.f15746a);
                    l lVar = (l) gVarB.a(this.f15747b);
                    if (this.f15746a.t) {
                        FLogger.w("RequestProcessor", "all task is Canceled, no need to finished", new Object[0]);
                        return null;
                    }
                    this.f15746a.h();
                    return lVar;
                }
                return null;
            }
        } catch (Throwable th) {
            synchronized (this.f15746a) {
                if (this.f15747b.h()) {
                    return null;
                }
                if (!(th instanceof FileManagerException)) {
                    this.f15746a.a(new FileManagerException(Constants.ErrorCode.TASK_UNCACHED_EXCEPTION, th.getMessage()), this.e);
                    return null;
                }
                FLogger.w("RequestProcessor", "future.exceptionally ,exceptionTask:" + this.f15747b, new Object[0]);
                this.f15746a.a(th, this.e);
                return null;
            }
        }
    }

    private long b(com.huawei.hms.network.file.a.d dVar) {
        long jA = a(dVar);
        FLogger.v("ForkTaskFuture", "complete file size is " + jA);
        return jA <= 0 ? dVar.a() : jA;
    }

    private boolean a(int i) {
        return com.huawei.hms.network.file.a.h.f().a(i);
    }

    private Future<ITaskResult> a(final k kVar) {
        return this.d.submit(new Callable() { // from class: com.huawei.hms.network.file.core.task.a$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return a.b(kVar);
            }
        });
    }

    private long a(com.huawei.hms.network.file.b.f fVar) {
        BodyRequest bodyRequestP = fVar.p();
        long jContentLength = 0;
        if (bodyRequestP instanceof PutRequest) {
            try {
                jContentLength = new com.huawei.hms.network.file.b.c(fVar, ((PutRequest) bodyRequestP).getFileEntityList(), null).contentLength();
            } catch (IOException e) {
                FLogger.e("ForkTaskFuture", "get requestBody contentLength error", e);
            }
        } else {
            PostRequest postRequest = (PostRequest) bodyRequestP;
            for (String str : postRequest.getFileEntityMap().keySet()) {
                List<FileEntity> list = postRequest.getFileEntityMap().get(str);
                if (list == null || list.isEmpty()) {
                    FLogger.w("ForkTaskFuture", "no FileEntity for:" + str, new Object[0]);
                } else {
                    FLogger.d("ForkTaskFuture", "fileParams for:" + str + ",fileListSize:" + list.size(), new Object[0]);
                    try {
                        jContentLength += new com.huawei.hms.network.file.b.c(fVar, list, null).contentLength();
                    } catch (IOException e2) {
                        FLogger.e("ForkTaskFuture", "get fileBody contentLength error", e2);
                    }
                }
            }
        }
        FLogger.d("ForkTaskFuture", "upload filesize:" + jContentLength, new Object[0]);
        return jContentLength;
    }

    private long a(com.huawei.hms.network.file.a.d dVar) {
        if (dVar != null && dVar.p() != null) {
            RequestConfig config = dVar.p().getConfig();
            if (config != null && !TextUtils.isEmpty(config.getOptions())) {
                try {
                    return new JSONObject(config.getOptions()).getLong("complete_file_size");
                } catch (JSONException e) {
                    FLogger.w("ForkTaskFuture", "get complete file size fail " + e.getMessage(), new Object[0]);
                    return 0L;
                }
            }
            FLogger.v("ForkTaskFuture", "config options is empty");
        }
        return 0L;
    }

    public a(i iVar, e eVar, ExecutorService executorService, ExecutorService executorService2, String str) {
        this.f15746a = iVar;
        this.f15747b = eVar;
        this.f15748c = executorService;
        this.d = executorService2;
        this.e = str;
    }
}
