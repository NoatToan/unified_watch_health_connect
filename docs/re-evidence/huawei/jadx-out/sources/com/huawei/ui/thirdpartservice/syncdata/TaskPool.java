package com.huawei.ui.thirdpartservice.syncdata;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.xco;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes20.dex */
public class TaskPool implements SyncTask.UploadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedList<SyncTask> f29162a = new LinkedList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29163b = false;
    private String d;
    private TaskPoolListener e;

    public interface TaskPoolListener {
        void onTaskFinish();

        void tokenInvalidation();
    }

    TaskPool(String str, TaskPoolListener taskPoolListener) {
        this.d = str;
        xco.a(str).d();
        this.e = taskPoolListener;
    }

    void d(SyncTask syncTask) {
        this.f29162a.add(syncTask);
        if (this.f29163b) {
            ReleaseLogUtil.d("R_TaskPool", " data is Sync, no need to execute again");
        } else {
            a();
        }
    }

    void a() {
        SyncTask syncTaskPop = !this.f29162a.isEmpty() ? this.f29162a.pop() : null;
        if (syncTaskPop == null) {
            this.f29163b = false;
            this.e.onTaskFinish();
        } else {
            syncTaskPop.setUploadListener(this);
            this.f29163b = true;
            syncTaskPop.upload();
        }
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.SyncTask.UploadListener
    public void tokenInvalidation(SyncTask syncTask) {
        LogUtil.j("TaskPool", syncTask.getTag(), " tokenInvalidation: ");
        syncTask.setUploadListener(null);
        this.f29162a.push(syncTask);
        this.e.tokenInvalidation();
    }

    void d() {
        this.f29162a.clear();
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.SyncTask.UploadListener
    public void uploadStatusCallback(SyncTask syncTask, boolean z) {
        ReleaseLogUtil.d("R_TaskPool", " uploadStatusCallback,", Boolean.valueOf(z));
        if (z) {
            syncTask.setUploadListener(null);
            LogUtil.a("R_TaskPool", syncTask.getTag(), " updeLastSyncDataTime: ", Long.valueOf(syncTask.getHealthData().getStartTime()));
            xco.a(this.d).a(syncTask.getHealthData().getStartTime());
            a();
            return;
        }
        if (!CommonUtil.ab(BaseApplication.b())) {
            syncTask.setUploadListener(null);
            this.f29162a.clear();
            a();
        } else {
            if (syncTask.canRetry()) {
                syncTask.upload();
                return;
            }
            xco.a(this.d).a(syncTask.getHealthData().getStartTime());
            ReleaseLogUtil.e("R_TaskPool", syncTask.getTag(), " ignore this task: ", syncTask.toString());
            syncTask.setUploadListener(null);
            syncTask.retryTooManyTimes();
            a();
        }
    }

    boolean a(HiHealthData hiHealthData) {
        return xco.a(this.d).b(hiHealthData);
    }

    public void e() {
        xco.a(this.d).a();
    }

    boolean c() {
        return this.f29162a.isEmpty() && !this.f29163b;
    }
}
