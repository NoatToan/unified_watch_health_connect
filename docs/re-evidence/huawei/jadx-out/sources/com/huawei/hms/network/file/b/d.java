package com.huawei.hms.network.file.b;

import android.content.Context;
import com.huawei.hms.network.file.api.GlobalRequestConfig;
import com.huawei.hms.network.file.api.Request;
import com.huawei.hms.network.file.api.Result;
import com.huawei.hms.network.file.core.Constants;
import com.huawei.hms.network.file.core.task.ITaskResult;
import com.huawei.hms.network.file.core.task.j;
import com.huawei.hms.network.file.core.task.l;
import com.huawei.hms.network.file.core.util.FLogger;
import com.huawei.hms.network.file.core.util.Utils;
import com.huawei.hms.network.file.upload.api.BodyRequest;
import com.huawei.hms.network.file.upload.api.PostRequest;
import com.huawei.hms.network.file.upload.api.PutRequest;
import com.huawei.hms.network.httpclient.HttpClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class d implements com.huawei.hms.network.file.core.task.c<BodyRequest, f, h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    GlobalRequestConfig f15716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.huawei.hms.network.file.core.c f15717b;

    public List<f> a(BodyRequest bodyRequest, List<f> list, long j) {
        return null;
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public List<BodyRequest> a(boolean z) {
        return null;
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public Set<Long> a(int i) {
        return null;
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public void a(long j) {
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public void a(long j, boolean z) {
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public void a(BodyRequest bodyRequest, com.huawei.hms.network.file.core.task.e.a aVar) {
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public boolean a(List<f> list) {
        return true;
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public void b(BodyRequest bodyRequest, com.huawei.hms.network.file.core.task.e.a aVar) {
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public void b(List<f> list) {
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public com.huawei.hms.network.file.core.e<BodyRequest> c(long j) {
        return null;
    }

    @Override // com.huawei.hms.network.file.core.task.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(BodyRequest bodyRequest) {
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public void c() {
        this.f15717b.f();
    }

    @Override // com.huawei.hms.network.file.core.task.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<f> c(BodyRequest bodyRequest) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f(bodyRequest));
        return arrayList;
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public List<f> b(long j) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public h b() {
        return new h(this.f15716a, this.f15717b.a());
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public /* bridge */ /* synthetic */ List a(Request request, List list, long j) {
        return a((BodyRequest) request, (List<f>) list, j);
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public j a() {
        return new e(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x000a: IF  (r0v0 int) != (-1575355461 int)  -> B:4:0x000c A[HIDDEN]
      (r0v0 int) from 0x000f: IF  (r0v0 int) != (-1267495076 int)  -> B:6:0x0011 A[HIDDEN]
      (r0v0 int) from 0x0011: IF  (r0v0 int) != (0 int)  -> B:7:0x0013 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    public com.huawei.hms.network.file.core.task.g a(String str) {
        byte b2;
        if (iHashCode != -1575355461) {
            if (iHashCode != -1267495076) {
                if (iHashCode != 0) {
                    switch (str) {
                        case "h1":
                            b2 = 0;
                            break;
                        case "h2":
                            b2 = 1;
                            break;
                        case "h3":
                            b2 = 4;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                } else if (str.equals("")) {
                    b2 = 5;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("h3_pcc")) {
                b2 = 2;
            } else {
                b2 = -1;
            }
        } else if (str.equals("h3_pcc_multipath")) {
            b2 = 3;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            HttpClient httpClientB = this.f15717b.b();
            GlobalRequestConfig globalRequestConfig = this.f15716a;
            if (httpClientB == null) {
                httpClientB = this.f15717b.a();
            }
            return new h(globalRequestConfig, httpClientB);
        }
        if (b2 == 1) {
            HttpClient httpClientC = this.f15717b.c();
            GlobalRequestConfig globalRequestConfig2 = this.f15716a;
            if (httpClientC == null) {
                httpClientC = this.f15717b.a();
            }
            return new h(globalRequestConfig2, httpClientC);
        }
        if (b2 == 2) {
            HttpClient httpClientD = this.f15717b.d();
            GlobalRequestConfig globalRequestConfig3 = this.f15716a;
            if (httpClientD == null) {
                httpClientD = this.f15717b.a();
            }
            return new h(globalRequestConfig3, httpClientD);
        }
        if (b2 != 3) {
            return new h(this.f15716a, this.f15717b.a());
        }
        HttpClient httpClientE = this.f15717b.e();
        GlobalRequestConfig globalRequestConfig4 = this.f15716a;
        if (httpClientE == null) {
            httpClientE = this.f15717b.a();
        }
        return new h(globalRequestConfig4, httpClientE);
    }

    public ITaskResult a(BodyRequest bodyRequest, List<f> list) {
        l lVar = new l(Constants.ErrorCode.SUCCESS);
        lVar.setTask(list.get(0));
        if (list.get(0).u() != null) {
            lVar.setRawResponse(list.get(0).u().getRawResponse());
            return lVar;
        }
        FLogger.e("UploadRequestHandler", "resultResult is null:" + bodyRequest.getId());
        return lVar;
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public /* bridge */ /* synthetic */ ITaskResult a(Request request, List list) {
        return a((BodyRequest) request, (List<f>) list);
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public Result a(BodyRequest bodyRequest) {
        if (!Utils.isUrlValid(bodyRequest.getUrl()) || !Utils.isUrlValid(bodyRequest.getBackupUrls())) {
            return new Result(Constants.ErrorCode.REQUEST_URL_EMPTY);
        }
        if ((bodyRequest instanceof PutRequest) && Utils.isEmpty(((PutRequest) bodyRequest).getFileEntityList())) {
            return new Result(Constants.ErrorCode.TASK_UPLOAD_PARAMS_COMMON_ERROR.getErrorCode(), Constants.ErrorCode.TASK_UPLOAD_PARAMS_COMMON_ERROR.getErrorMessage() + "fileList can not be empty");
        }
        if (!(bodyRequest instanceof PostRequest) || !((PostRequest) bodyRequest).getFileEntityMap().isEmpty()) {
            return Result.RESULT_SUCCESS;
        }
        return new Result(Constants.ErrorCode.TASK_UPLOAD_PARAMS_COMMON_ERROR.getErrorCode(), Constants.ErrorCode.TASK_UPLOAD_PARAMS_COMMON_ERROR.getErrorMessage() + "fileList can not be empty");
    }

    public d(Context context, String str, GlobalRequestConfig globalRequestConfig) {
        this.f15716a = globalRequestConfig;
        this.f15717b = new com.huawei.hms.network.file.core.c(context, globalRequestConfig, str);
    }
}
