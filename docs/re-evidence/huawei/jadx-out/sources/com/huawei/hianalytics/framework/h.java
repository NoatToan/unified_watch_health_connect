package com.huawei.hianalytics.framework;

import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.storage.IStorageHandler;
import com.huawei.hianalytics.framework.config.ICallback;
import com.huawei.hianalytics.framework.datahandler.ReportTask;
import com.huawei.hianalytics.framework.policy.IStoragePolicy;
import com.huawei.hianalytics.framework.threadpool.TaskThread;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements HAFrameworkInstance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11521a;

    public h(String str) {
        this.f11521a = str;
    }

    @Override // com.huawei.hianalytics.framework.HAFrameworkInstance
    public final void clearCacheDataAll() {
        i iVarA = i.a();
        String str = this.f11521a;
        synchronized (iVarA) {
            try {
                IStorageHandler iStorageHandlerC = j.c(str);
                if (iStorageHandlerC != null) {
                    iStorageHandlerC.deleteByTag(str);
                }
            } catch (Exception unused) {
                HiLog.e("HES", "clearCacheDataByTag Exception");
            }
        }
    }

    @Override // com.huawei.hianalytics.framework.HAFrameworkInstance
    public final void clearCacheDataByTag() {
        i iVarA = i.a();
        String str = this.f11521a;
        synchronized (iVarA) {
            try {
                IStorageHandler iStorageHandlerC = j.c(str);
                if (iStorageHandlerC != null) {
                    iStorageHandlerC.deleteByTag(str);
                }
            } catch (Exception unused) {
                HiLog.e("HES", "clearCacheDataByTag Exception");
            }
        }
    }

    @Override // com.huawei.hianalytics.framework.HAFrameworkInstance
    public final void clearCacheDataByTagType(String str) {
        i iVarA = i.a();
        String str2 = this.f11521a;
        synchronized (iVarA) {
            try {
                IStorageHandler iStorageHandlerC = j.c(str2);
                if (iStorageHandlerC != null) {
                    iStorageHandlerC.deleteByTagType(str2, str);
                }
            } catch (Exception unused) {
                HiLog.e("HES", "clearCacheDataByTagType Exception");
            }
        }
    }

    @Override // com.huawei.hianalytics.framework.HAFrameworkInstance
    public final void onEvent(String str, String str2, JSONObject jSONObject, ICallback iCallback) {
        i iVarA = i.a();
        String str3 = this.f11521a;
        synchronized (iVarA) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            IStoragePolicy iStoragePolicyD = j.d(str3);
            t tVar = new t(str3, str, str2, jSONObject, jCurrentTimeMillis, iStoragePolicyD.getDecryptBatchSize(str), iStoragePolicyD.getDecryptBatchSleepTime(str));
            tVar.l = iCallback;
            TaskThread.getRecordThread().addToQueue(tVar);
        }
    }

    @Override // com.huawei.hianalytics.framework.HAFrameworkInstance
    public final void onEventSync(String str, String str2, JSONObject jSONObject) {
        i iVarA = i.a();
        String str3 = this.f11521a;
        synchronized (iVarA) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            IStoragePolicy iStoragePolicyD = j.d(str3);
            new t(str3, str, str2, jSONObject, jCurrentTimeMillis, iStoragePolicyD.getDecryptBatchSize(str), iStoragePolicyD.getDecryptBatchSleepTime(str)).run();
        }
    }

    @Override // com.huawei.hianalytics.framework.HAFrameworkInstance
    public final void onReport(String str) {
        i iVarA = i.a();
        String str2 = this.f11521a;
        iVarA.getClass();
        if (TextUtils.isEmpty(a.a(str2, str))) {
            HiLog.w("HES", "collectUrl is empty, tag: " + str2 + ", type: " + str);
            return;
        }
        IStoragePolicy iStoragePolicyD = j.d(str2);
        if (iStoragePolicyD == null) {
            HiLog.w("HES", "policy is invalid, tag: " + str2 + ", type: " + str);
            return;
        }
        if (iStoragePolicyD.decide(IStoragePolicy.PolicyType.NETWORK, str)) {
            TaskThread.getReportThread().addToQueue(new ReportTask(str2, str, "", iStoragePolicyD.getDecryptBatchSize(str), iStoragePolicyD.getDecryptBatchSleepTime(str)));
            return;
        }
        HiLog.w("HES", "network is invalid, tag: " + str2 + ", type: " + str);
    }

    @Override // com.huawei.hianalytics.framework.HAFrameworkInstance
    public final void onStreamEvent(String str, String str2, JSONObject jSONObject, ICallback iCallback) {
        i iVarA = i.a();
        String str3 = this.f11521a;
        iVarA.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        IStoragePolicy iStoragePolicyD = j.d(str3);
        t tVar = new t(str3, str, str2, jSONObject, jCurrentTimeMillis, iStoragePolicyD.getDecryptBatchSize(str), iStoragePolicyD.getDecryptBatchSleepTime(str));
        tVar.k = true;
        tVar.l = iCallback;
        TaskThread.getRecordThread().addToQueue(tVar);
    }

    @Override // com.huawei.hianalytics.framework.HAFrameworkInstance
    public final void onEvent(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, ICallback iCallback) {
        i iVarA = i.a();
        String str3 = this.f11521a;
        synchronized (iVarA) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            IStoragePolicy iStoragePolicyD = j.d(str3);
            try {
                u uVar = new u(str3, str, str2, jSONObject, jSONObject2, jSONObject3, jCurrentTimeMillis, iStoragePolicyD.getDecryptBatchSize(str), iStoragePolicyD.getDecryptBatchSleepTime(str));
                uVar.l = iCallback;
                TaskThread.getRecordThread().addToQueue(uVar);
            } catch (JSONException unused) {
                HiLog.w("HES", "headerEx or commonEx is not json");
            }
        }
    }

    @Override // com.huawei.hianalytics.framework.HAFrameworkInstance
    public final void onStreamEvent(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, ICallback iCallback) {
        i iVarA = i.a();
        String str3 = this.f11521a;
        iVarA.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        IStoragePolicy iStoragePolicyD = j.d(str3);
        try {
            u uVar = new u(str3, str, str2, jSONObject, jSONObject2, jSONObject3, jCurrentTimeMillis, iStoragePolicyD.getDecryptBatchSize(str), iStoragePolicyD.getDecryptBatchSleepTime(str));
            uVar.k = true;
            uVar.l = iCallback;
            TaskThread.getRecordThread().addToQueue(uVar);
        } catch (JSONException unused) {
            HiLog.w("HES", "headerEx or commonEx is not json");
        }
    }
}
