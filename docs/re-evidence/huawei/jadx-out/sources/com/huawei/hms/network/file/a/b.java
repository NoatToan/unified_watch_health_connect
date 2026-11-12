package com.huawei.hms.network.file.a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.file.api.GlobalRequestConfig;
import com.huawei.hms.network.file.api.Request;
import com.huawei.hms.network.file.api.Result;
import com.huawei.hms.network.file.core.Constants;
import com.huawei.hms.network.file.core.FileManagerException;
import com.huawei.hms.network.file.core.task.ITaskResult;
import com.huawei.hms.network.file.core.task.j;
import com.huawei.hms.network.file.core.task.k;
import com.huawei.hms.network.file.core.task.l;
import com.huawei.hms.network.file.core.util.FLogger;
import com.huawei.hms.network.file.core.util.Utils;
import com.huawei.hms.network.file.download.api.GetRequest;
import com.huawei.hms.network.httpclient.HttpClient;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class b implements com.huawei.hms.network.file.core.task.c<GetRequest, d, e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.huawei.hms.network.file.a.k.b.e f15665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    GlobalRequestConfig f15666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.huawei.hms.network.file.core.c f15667c;
    String d;
    String e;

    void d(long j) {
        com.huawei.hms.network.file.a.k.b.e eVar = this.f15665a;
        if (eVar == null) {
            return;
        }
        String strA = eVar.a(j, this.d);
        this.f15665a.b(j, this.d);
        Utils.deleteFile(d.a(j, strA));
    }

    @Override // com.huawei.hms.network.file.core.task.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(GetRequest getRequest) {
        com.huawei.hms.network.file.a.k.b.e eVar = this.f15665a;
        if (eVar == null) {
            return;
        }
        eVar.a(getRequest, this.d);
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public void c() {
        this.f15667c.f();
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public com.huawei.hms.network.file.core.e<GetRequest> c(long j) {
        com.huawei.hms.network.file.core.e<GetRequest> eVarC;
        com.huawei.hms.network.file.a.k.b.e eVar = this.f15665a;
        if (eVar == null || (eVarC = eVar.c(j, this.d)) == null) {
            return null;
        }
        if (!k.d(eVarC.b())) {
            FLogger.d("DownloadRequestHandler", "getCachedRequest:" + eVarC.a(), new Object[0]);
            return eVarC;
        }
        FLogger.i("DownloadRequestHandler", "getCachedRequest request is finished, delete it:" + j + ",status:" + eVarC.b(), new Object[0]);
        this.f15665a.a(j, this.d);
        return null;
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public void b(List<d> list) {
        if (this.f15665a == null) {
            return;
        }
        this.f15665a.a(c(list), this.d);
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public void b(GetRequest getRequest, com.huawei.hms.network.file.core.task.e.a aVar) {
        com.huawei.hms.network.file.a.k.b.e eVar = this.f15665a;
        if (eVar == null) {
            return;
        }
        eVar.a(getRequest, aVar, this.d);
    }

    @Override // com.huawei.hms.network.file.core.task.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<d> c(GetRequest getRequest) {
        List<d> listA = a(getRequest, getRequest.getFileSize());
        a(getRequest.getId(), listA);
        return listA;
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public List<d> b(long j) {
        com.huawei.hms.network.file.a.k.b.e eVar = this.f15665a;
        if (eVar == null) {
            return null;
        }
        List<d> listD = eVar.d(j, this.d);
        com.huawei.hms.network.file.core.e<GetRequest> eVarC = c(j);
        if (eVarC == null) {
            FLogger.w("DownloadRequestHandler", "getCachedTasks requestInfo not exist:" + j, new Object[0]);
        } else {
            if (b(j, listD) || eVarC.a() == null) {
                if (eVarC.a() != null) {
                    a aVar = new a();
                    a((GetRequest) eVarC.a(), ((GetRequest) eVarC.a()).getFileSize(), aVar);
                    Iterator<d> it = listD.iterator();
                    while (it.hasNext()) {
                        it.next().b(aVar.a());
                    }
                }
                return listD;
            }
            Utils.deleteFile(d.a(j, ((GetRequest) eVarC.a()).getFilePath()));
            this.f15665a.b(j, this.d);
        }
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public e b() {
        return new e(this.f15666b, this.f15667c.a());
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public boolean a(List<d> list) {
        k kVarA = k.a(list);
        if (com.huawei.hms.network.file.core.util.c.a(((d) Utils.cast(kVarA)).B()).exists()) {
            return true;
        }
        FLogger.w("DownloadRequestHandler", "task tmpFile not exist taskid:" + kVarA.f(), new Object[0]);
        return false;
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public void a(GetRequest getRequest, com.huawei.hms.network.file.core.task.e.a aVar) {
        if (this.f15665a == null) {
            return;
        }
        if (aVar == com.huawei.hms.network.file.core.task.e.a.INVALID) {
            FLogger.i("DownloadRequestHandler", "onRequestStatusChanged delete request data," + getRequest.getId() + ",status:" + aVar, new Object[0]);
            d(getRequest.getId());
            return;
        }
        FLogger.i("DownloadRequestHandler", "onRequestStatusChanged update, " + getRequest.getId() + ",status:" + aVar, new Object[0]);
        this.f15665a.b(getRequest, aVar, this.d);
    }

    void a(d dVar, d dVar2) {
        dVar2.a(dVar.A(), dVar.y());
        dVar2.e(dVar.t());
        dVar2.b(dVar.k());
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public void a(long j, boolean z) {
        com.huawei.hms.network.file.a.k.b.e eVar = this.f15665a;
        if (eVar == null) {
            return;
        }
        eVar.b(j, this.d);
        if (z) {
            return;
        }
        String strA = this.f15665a.a(j, this.d);
        if (Utils.isBlank(strA)) {
            return;
        }
        Utils.deleteFile(d.a(j, strA));
    }

    public void a(long j, List<d> list) {
        com.huawei.hms.network.file.a.k.b.e eVar = this.f15665a;
        if (eVar == null) {
            return;
        }
        eVar.a(j, list, this.d);
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public void a(long j) {
        FLogger.i("DownloadRequestHandler", "onRequestCanceled:" + j, new Object[0]);
        d(j);
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public Set<Long> a(int i) {
        com.huawei.hms.network.file.a.k.b.e eVar = this.f15665a;
        if (eVar == null) {
            return null;
        }
        return eVar.a(this.d, i);
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public List<GetRequest> a(boolean z) {
        com.huawei.hms.network.file.a.k.b.e eVar = this.f15665a;
        if (eVar == null) {
            return null;
        }
        List<com.huawei.hms.network.file.core.e<GetRequest>> listA = eVar.a(this.d);
        ArrayList arrayList = new ArrayList();
        if (!Utils.isEmpty(listA)) {
            for (com.huawei.hms.network.file.core.e<GetRequest> eVar2 : listA) {
                if (!z || !k.d(eVar2.b())) {
                    arrayList.add((GetRequest) eVar2.a());
                }
            }
        }
        return arrayList;
    }

    public List<d> a(GetRequest getRequest, List<d> list, long j) {
        int iE = com.huawei.hms.network.file.core.b.e();
        if (j < iE) {
            FLogger.i("DownloadRequestHandler", "onTaskChange no need slice again for size:" + j + ",sliceThreshold:" + iE, new Object[0]);
        } else {
            List<d> listA = a(getRequest, j);
            if (!Utils.isEmpty(listA) && listA.size() > 1) {
                a(listA.get(0), list.get(0));
                List<d> listSubList = listA.subList(1, listA.size());
                ArrayList arrayList = new ArrayList();
                arrayList.add(list.get(0));
                arrayList.addAll(listSubList);
                com.huawei.hms.network.file.a.k.b.e eVar = this.f15665a;
                if (eVar != null) {
                    eVar.b(getRequest.getId(), arrayList, this.d);
                }
                return listSubList;
            }
            FLogger.i("DownloadRequestHandler", "onTaskChange newTasks size is too small", new Object[0]);
        }
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public /* bridge */ /* synthetic */ List a(Request request, List list, long j) {
        return a((GetRequest) request, (List<d>) list, j);
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public j a() {
        return new c(this);
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
            HttpClient httpClientB = this.f15667c.b();
            GlobalRequestConfig globalRequestConfig = this.f15666b;
            if (httpClientB == null) {
                httpClientB = this.f15667c.a();
            }
            return new e(globalRequestConfig, httpClientB);
        }
        if (b2 == 1) {
            HttpClient httpClientC = this.f15667c.c();
            GlobalRequestConfig globalRequestConfig2 = this.f15666b;
            if (httpClientC == null) {
                httpClientC = this.f15667c.a();
            }
            return new e(globalRequestConfig2, httpClientC);
        }
        if (b2 == 2) {
            HttpClient httpClientD = this.f15667c.d();
            GlobalRequestConfig globalRequestConfig3 = this.f15666b;
            if (httpClientD == null) {
                httpClientD = this.f15667c.a();
            }
            return new e(globalRequestConfig3, httpClientD);
        }
        if (b2 != 3) {
            return new e(this.f15666b, this.f15667c.a());
        }
        HttpClient httpClientE = this.f15667c.e();
        GlobalRequestConfig globalRequestConfig4 = this.f15666b;
        if (httpClientE == null) {
            httpClientE = this.f15667c.a();
        }
        return new e(globalRequestConfig4, httpClientE);
    }

    public ITaskResult a(GetRequest getRequest, List<d> list) {
        FLogger.d("DownloadRequestHandler", "download compose start", new Object[0]);
        d dVar = (d) k.a(list);
        String strB = dVar.B();
        File fileA = com.huawei.hms.network.file.core.util.c.a(strB);
        if (!fileA.exists()) {
            FLogger.e("DownloadRequestHandler", "download compose tmpfile not exist");
            return new l(Constants.ErrorCode.TASK_COMPOSE_TMPFILE_ERROR);
        }
        a(getRequest, strB);
        File fileA2 = com.huawei.hms.network.file.core.util.c.a(dVar.z());
        if (!fileA.renameTo(fileA2)) {
            FLogger.e("DownloadRequestHandler", "download compose rename file failed!");
            if (fileA2.isDirectory()) {
                FLogger.w("DownloadRequestHandler", "The download file path is a directory. Please add the file name to the download file path!", new Object[0]);
            }
            return new l(Constants.ErrorCode.TASK_COMPOSE_TMPFILE_ERROR);
        }
        FLogger.d("DownloadRequestHandler", "download compose success", new Object[0]);
        l lVar = new l(Constants.ErrorCode.SUCCESS);
        lVar.setTask(dVar);
        if (dVar.u() != null) {
            lVar.setRawResponse(dVar.u().getRawResponse());
            return lVar;
        }
        FLogger.e("DownloadRequestHandler", "resultResult is null:" + getRequest.getId());
        return lVar;
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public /* bridge */ /* synthetic */ ITaskResult a(Request request, List list) {
        return a((GetRequest) request, (List<d>) list);
    }

    @Override // com.huawei.hms.network.file.core.task.c
    public Result a(GetRequest getRequest) {
        return (Utils.isUrlValid(getRequest.getUrl()) && Utils.isUrlValid(getRequest.getBackupUrls())) ? Result.RESULT_SUCCESS : new Result(Constants.ErrorCode.REQUEST_URL_EMPTY);
    }

    private List<d> c(List<d> list) {
        ArrayList arrayList = new ArrayList();
        for (d dVar : list) {
            if (dVar.c() > 0) {
                arrayList.add(new d(dVar.p(), dVar.c() - 1, dVar.A(), dVar.y(), dVar.z(), dVar.t(), dVar.f()));
            } else {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    private boolean b(GetRequest getRequest, String str) throws Throwable {
        String sha256 = getRequest.getSha256();
        if (Utils.isBlank(sha256)) {
            FLogger.w("DownloadRequestHandler", "checkDownloadedFile warning: file sha256 is null", new Object[0]);
            return true;
        }
        String fileHashData = Utils.getFileHashData(str, "SHA-256");
        if (sha256.equalsIgnoreCase(fileHashData)) {
            return true;
        }
        FLogger.w("DownloadRequestHandler", "file sha256 check failed expect:" + StringUtils.anonymizeMessage(sha256) + ", actual:" + StringUtils.anonymizeMessage(fileHashData), new Object[0]);
        return false;
    }

    private boolean b(long j, List<d> list) {
        if (Utils.isEmpty(list)) {
            return true;
        }
        com.huawei.hms.network.file.core.e<GetRequest> eVarC = c(j);
        if (eVarC == null) {
            FLogger.w("DownloadRequestHandler", "checkAndFillDownloadTasks requestInfo not exist:" + j, new Object[0]);
            return false;
        }
        int size = list.size();
        String filePath = null;
        for (d dVar : list) {
            dVar.a((GetRequest) eVarC.a());
            dVar.b(((GetRequest) eVarC.a()).getFileSize());
            dVar.e(size);
            if (Utils.isBlank(dVar.z())) {
                if (Utils.isBlank(filePath)) {
                    filePath = ((GetRequest) eVarC.a()).getFilePath();
                    dVar.f(filePath);
                    FLogger.w("DownloadRequestHandler", "checkDownloadTasks fix filePath:" + filePath, new Object[0]);
                } else {
                    dVar.f(filePath);
                }
            }
            if (!com.huawei.hms.network.file.core.util.c.a(dVar.B()).exists()) {
                FLogger.w("DownloadRequestHandler", "cached task tmpFile not exist taskid:" + dVar.f(), new Object[0]);
                return false;
            }
            if (dVar.y() > 0 && dVar.A() > dVar.y()) {
                FLogger.w("DownloadRequestHandler", "task pos invfalid:" + dVar, new Object[0]);
                return false;
            }
        }
        return true;
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f15668a = 0;

        void b() {
            this.f15668a |= 1;
        }

        int a() {
            return this.f15668a;
        }

        a() {
        }
    }

    private void a(GetRequest getRequest, String str) {
        try {
            try {
                RandomAccessFile randomAccessFileA = com.huawei.hms.network.file.core.util.c.a(str, "r");
                if (getRequest.getFileSize() > 0 && randomAccessFileA.length() != getRequest.getFileSize()) {
                    String str2 = " fileSize= " + randomAccessFileA.length() + " vs " + getRequest.getFileSize();
                    FLogger.e("DownloadRequestHandler", "file length error:" + str2);
                    throw new FileManagerException(Constants.ErrorCode.FILE_SIZE_ERROR, str2);
                }
                if (!b(getRequest, str)) {
                    FLogger.e("DownloadRequestHandler", "downloadTask : " + getRequest.getId() + "check file hash failed");
                    throw new FileManagerException(Constants.ErrorCode.CHECK_FILE_HASH_FAILED);
                }
                FLogger.i("DownloadRequestHandler", "downloadTask id: " + getRequest.getId() + " checkDownloadedFile succeed", new Object[0]);
                Utils.close(randomAccessFileA);
            } catch (IOException unused) {
                throw new FileManagerException(Constants.ErrorCode.FILE_IO_EXCEPTION);
            }
        } catch (Throwable th) {
            Utils.close(null);
            throw th;
        }
    }

    private List<d> a(GetRequest getRequest, long j) {
        b bVar = this;
        a aVar = new a();
        int iA = bVar.a(getRequest, j, aVar);
        long j2 = j / ((long) iA);
        ArrayList arrayList = new ArrayList();
        String filePath = "";
        int i = 0;
        while (i < iA) {
            long j3 = ((long) i) * j2;
            long j4 = i == iA + (-1) ? j - 1 : (j3 + j2) - 1;
            long offset = getRequest.getOffset();
            long offset2 = j4 < 0 ? -1L : j4 + getRequest.getOffset();
            if (TextUtils.isEmpty(filePath)) {
                filePath = getRequest.getFilePath();
                if (TextUtils.isEmpty(filePath)) {
                    filePath = bVar.e + "hwdownloadfile_" + getRequest.getId();
                }
            }
            String str = filePath;
            ArrayList arrayList2 = arrayList;
            d dVar = new d(getRequest, 0L, offset + j3, offset2, str, iA);
            dVar.b(aVar.a());
            arrayList2.add(dVar);
            i++;
            arrayList = arrayList2;
            filePath = str;
            bVar = this;
        }
        return arrayList;
    }

    private int a(GetRequest getRequest, long j, a aVar) {
        if (getRequest.getConfig() != null) {
            boolean zIsEnableSlice = getRequest.isEnableSlice();
            long speedLimit = getRequest.getSpeedLimit();
            if (!zIsEnableSlice || speedLimit > 0) {
                return 1;
            }
        }
        int iE = com.huawei.hms.network.file.core.b.e();
        if (j < iE) {
            return 1;
        }
        int iA = com.huawei.hms.network.file.a.j.a.b.b().a(j, 1000L);
        if (iA > 0) {
            FLogger.i("DownloadRequestHandler", "getSliceNum use predictSliceNum:" + iA, new Object[0]);
            aVar.b();
        } else {
            iA = com.huawei.hms.network.file.core.b.d();
        }
        FLogger.i("DownloadRequestHandler", "getConfigSliceNum sliceThreshold:" + iE + ",sliceNum:" + iA, new Object[0]);
        return iA;
    }

    public b(Context context, String str, GlobalRequestConfig globalRequestConfig, String str2) {
        this.f15666b = globalRequestConfig;
        this.f15667c = new com.huawei.hms.network.file.core.c(context, globalRequestConfig, str);
        this.d = str;
        this.e = str2;
        com.huawei.hms.network.file.a.k.b.e eVarA = com.huawei.hms.network.file.a.k.b.e.a(context);
        this.f15665a = eVarA;
        if (eVarA.a()) {
            return;
        }
        FLogger.e("DownloadRequestHandler", "create DB RunTimeException init DB failed!");
        this.f15665a = null;
    }
}
