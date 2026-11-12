package com.huawei.agconnect.common.api;

import android.os.Bundle;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.credential.obs.a;
import com.huawei.agconnect.credential.obs.b;
import com.huawei.agconnect.credential.obs.c;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hmf.tasks.TaskExecutors;
import com.huawei.hmf.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public class HaBridge {
    private static final String HA_HTTP_HEADER = "com.huawei.agconnect";
    public static final String HA_SERVICE_TAG_ABTEST = "AGC_TAG_ABTest";
    public static final String HA_SERVICE_TAG_APP_LINKING = "AGC_TAG_AppLinking";
    public static final String HA_SERVICE_TAG_CONFIG = "AGC_TAG_Config";
    public static final String HA_SERVICE_TAG_CRASH = "Crash_TAG";
    public static final String HA_SERVICE_TAG_IAM = "AGC_TAG_IAM";
    private static final String TAG = "HaBridge";
    private c bridgeInstance;
    private String haTag;

    /* JADX INFO: renamed from: lambda$initHaInMain$0$com-huawei-agconnect-common-api-HaBridge, reason: not valid java name */
    /* synthetic */ c m804lambda$initHaInMain$0$comhuaweiagconnectcommonapiHaBridge() throws Exception {
        c cVar = this.bridgeInstance;
        if (cVar != null) {
            return cVar;
        }
        try {
            this.bridgeInstance = b.a(AGConnectInstance.getInstance().getContext(), this.haTag, HA_HTTP_HEADER, AGConnectInstance.getInstance().getOptions().getRoutePolicy().getRouteName());
            Logger.i(TAG, "init HiAnalyticsBridge SDK end.");
            return this.bridgeInstance;
        } catch (Error e) {
            Logger.e(TAG, "please upgrade HiAnalytics SDK (com.huawei.hms:hianalytics) to the latest version");
            throw e;
        }
    }

    /* JADX INFO: renamed from: lambda$syncOAID$5$com-huawei-agconnect-common-api-HaBridge, reason: not valid java name */
    /* synthetic */ void m805lambda$syncOAID$5$comhuaweiagconnectcommonapiHaBridge(final HaSyncCallBack haSyncCallBack, Task task) {
        Logger.i(TAG, "start sync ha oaid");
        ((c) task.getResult()).syncOaid(new a() { // from class: com.huawei.agconnect.common.api.HaBridge.1
            @Override // com.huawei.agconnect.credential.obs.a
            public void result(int i, String str) {
                haSyncCallBack.syncCallBack(i, str);
                Logger.i(HaBridge.TAG, "end sync ha oaid:code:--->" + i + ", msg---->" + str);
            }
        });
    }

    public Task<Void> syncOAID(final HaSyncCallBack haSyncCallBack) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        initHaInMain().addOnCompleteListener(new OnCompleteListener() { // from class: com.huawei.agconnect.common.api.HaBridge$$ExternalSyntheticLambda0
            @Override // com.huawei.hmf.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f$0.m805lambda$syncOAID$5$comhuaweiagconnectcommonapiHaBridge(haSyncCallBack, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    public Task<Void> onReport() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        initHaInMain().addOnCompleteListener(new OnCompleteListener() { // from class: com.huawei.agconnect.common.api.HaBridge$$ExternalSyntheticLambda5
            @Override // com.huawei.hmf.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ((c) task.getResult()).a();
            }
        });
        return taskCompletionSource.getTask();
    }

    public Task<Void> onEvent(final String str, final Bundle bundle) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        initHaInMain().addOnCompleteListener(new OnCompleteListener() { // from class: com.huawei.agconnect.common.api.HaBridge$$ExternalSyntheticLambda1
            @Override // com.huawei.hmf.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ((c) task.getResult()).a(str, bundle);
            }
        });
        return taskCompletionSource.getTask();
    }

    public Task<Map<String, String>> getUserProfiles(final boolean z) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        initHaInMain().addOnCompleteListener(new OnCompleteListener() { // from class: com.huawei.agconnect.common.api.HaBridge$$ExternalSyntheticLambda2
            @Override // com.huawei.hmf.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                taskCompletionSource.setResult(((c) task.getResult()).b(z));
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.agconnect.common.api.HaBridge$$ExternalSyntheticLambda3
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                taskCompletionSource.setResult(null);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task<c> initHaInMain() {
        return Tasks.callInBackground(TaskExecutors.uiThread(), new Callable() { // from class: com.huawei.agconnect.common.api.HaBridge$$ExternalSyntheticLambda4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f$0.m804lambda$initHaInMain$0$comhuaweiagconnectcommonapiHaBridge();
            }
        });
    }

    public HaBridge(String str) {
        this.haTag = str;
    }
}
