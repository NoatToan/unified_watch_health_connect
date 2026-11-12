package com.huawei.hms.common;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.adapter.AvailableUtil;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.BindResolveClients;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.RequestManager;
import com.huawei.hms.common.internal.ResolveClientBean;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.common.internal.TaskApiCallWrapper;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsInnerClient;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import com.huawei.operation.utils.Constants;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class HuaweiApi<TOption extends Api.ApiOptions> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f13006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TOption f13007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f13008c;
    private AbstractClientBuilder<?, TOption> d;
    private String e;
    private String f;
    private SubAppInfo g;
    private WeakReference<Activity> h;
    private int i;
    private int j = 1;
    private boolean k = false;
    private String l;
    private boolean m;
    private RequestManager n;

    public static class RequestHandler<OptionsT extends Api.ApiOptions> implements BaseHmsClient.ConnectionCallbacks, BaseHmsClient.OnConnectionFailedListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AnyClient f13013b;
        private final HuaweiApi<OptionsT> d;
        private ResolveClientBean e;
        public final Queue<TaskApiCallbackWrapper> callbackWaitQueue = new LinkedList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue<TaskApiCallbackWrapper> f13012a = new LinkedList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ConnectionResult f13014c = null;

        RequestHandler(HuaweiApi<OptionsT> huaweiApi) {
            this.d = huaweiApi;
            this.f13013b = huaweiApi.getClient(RequestManager.getHandler().getLooper(), this);
        }

        public AnyClient getClient() {
            return this.f13013b;
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
            HMSLog.i("HuaweiApi", "onConnected");
            BindResolveClients.getInstance().unRegister(this.e);
            this.e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.4
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.b();
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.OnConnectionFailedListener
        public void onConnectionFailed(final ConnectionResult connectionResult) {
            HMSLog.i("HuaweiApi", "onConnectionFailed");
            BindResolveClients.getInstance().unRegister(this.e);
            this.e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.3
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.b(connectionResult);
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            HMSLog.i("HuaweiApi", "onConnectionSuspended");
            BindResolveClients.getInstance().unRegister(this.e);
            this.e = null;
            RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.5
                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.c();
                }
            });
        }

        public void postMessage(final TaskApiCallbackWrapper taskApiCallbackWrapper) {
            RequestManager.addToConnectedReqMap(taskApiCallbackWrapper.a().getTaskApiCall().getTransactionId(), this);
            this.f13012a.add(taskApiCallbackWrapper);
            String uri = taskApiCallbackWrapper.a().getTaskApiCall().getUri();
            String packageName = (((HuaweiApi) this.d).f13008c == null ? this.d.getContext() : ((HuaweiApi) this.d).f13008c).getPackageName();
            if (((HuaweiApi) this.d).f13008c != null) {
                HuaweiApi<OptionsT> huaweiApi = this.d;
                huaweiApi.b(((HuaweiApi) huaweiApi).f13008c);
            }
            final RequestHeader requestHeader = new RequestHeader();
            requestHeader.setSrvName(uri.split("\\.")[0]);
            requestHeader.setApiName(uri);
            requestHeader.setAppID(this.d.getAppID() + "|" + this.d.getSubAppID());
            requestHeader.setPkgName(packageName);
            requestHeader.setSessionId(this.f13013b.getSessionId());
            TaskApiCall taskApiCall = taskApiCallbackWrapper.a().getTaskApiCall();
            requestHeader.setTransactionId(a(taskApiCall.getTransactionId(), uri));
            requestHeader.setParcelable(taskApiCall.getParcelable());
            requestHeader.setKitSdkVersion(this.d.getKitSdkVersion());
            requestHeader.setApiLevel(Math.max(this.d.getApiLevel(), taskApiCall.getApiLevel()));
            this.f13013b.post(requestHeader, taskApiCall.getRequestJson(), new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2
                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    AnyClient.CallBack callBackB = taskApiCallbackWrapper.b();
                    if (callBackB != null) {
                        callBackB.onCallback(iMessageEntity, str);
                    }
                    RequestManager.removeReqByTransId(requestHeader.getTransactionId());
                    RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            RequestHandler.this.f13012a.remove(taskApiCallbackWrapper);
                        }
                    });
                }
            });
        }

        private TaskApiCallbackWrapper b(final TaskApiCallWrapper taskApiCallWrapper) {
            return new TaskApiCallbackWrapper(taskApiCallWrapper, new AnyClient.CallBack() { // from class: com.huawei.hms.common.HuaweiApi.RequestHandler.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private AtomicBoolean f13015a = new AtomicBoolean(true);

                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    if (!(iMessageEntity instanceof ResponseHeader)) {
                        HMSLog.e("HuaweiApi", "header is not instance of ResponseHeader");
                        return;
                    }
                    ResponseHeader responseHeader = (ResponseHeader) iMessageEntity;
                    if (responseHeader.getErrorCode() == 11) {
                        RequestHandler.this.a();
                        HMSLog.i("HuaweiApi", "unbind service");
                    }
                    if (!TextUtils.isEmpty(responseHeader.getResolution())) {
                        HMSLog.e("HuaweiApi", "Response has resolution: " + responseHeader.getResolution());
                    }
                    if (this.f13015a.compareAndSet(true, false)) {
                        HiAnalyticsInnerClient.reportEntryExit(RequestHandler.this.d.getContext(), responseHeader, String.valueOf(RequestHandler.this.d.getKitSdkVersion()));
                    }
                    taskApiCallWrapper.getTaskApiCall().onResponse(RequestHandler.this.f13013b, responseHeader, str, taskApiCallWrapper.getTaskCompletionSource());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            HMSLog.i("HuaweiApi", "wait queue size = " + this.callbackWaitQueue.size());
            HMSLog.i("HuaweiApi", "run queue size = " + this.f13012a.size());
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            Iterator<TaskApiCallbackWrapper> it2 = this.f13012a.iterator();
            while (it2.hasNext()) {
                a(it2.next());
            }
            this.callbackWaitQueue.clear();
            this.f13012a.clear();
            this.f13014c = null;
            this.f13013b.disconnect();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(ConnectionResult connectionResult) {
            this.f13014c = connectionResult;
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            boolean z = true;
            while (it.hasNext()) {
                TaskApiCallWrapper taskApiCallWrapperA = it.next().a();
                ResponseHeader responseHeader = new ResponseHeader(1, 907135003, "Connection Failed:" + a(connectionResult) + Constants.LEFT_BRACKET_ONLY + connectionResult.getErrorCode() + Constants.RIGHT_BRACKET_ONLY);
                responseHeader.setTransactionId(taskApiCallWrapperA.getTaskApiCall().getTransactionId());
                HiAnalyticsInnerClient.reportEntryExit(this.d.getContext(), responseHeader, String.valueOf(this.d.getKitSdkVersion()));
                if (this.f13014c.getResolution() != null && z) {
                    responseHeader.setParcelable(this.f13014c.getResolution());
                    if (Util.isAvailableLibExist(this.d.getContext()) && this.f13014c.getErrorCode() == 26) {
                        responseHeader.setResolution(CommonCode.Resolution.HAS_RESOLUTION);
                    }
                    z = false;
                }
                int errorCode = this.f13014c.getErrorCode();
                if (errorCode == 30 || errorCode == 31) {
                    responseHeader.setErrorCode(errorCode);
                }
                taskApiCallWrapperA.getTaskApiCall().onResponse(this.f13013b, responseHeader, null, taskApiCallWrapperA.getTaskCompletionSource());
            }
            this.callbackWaitQueue.clear();
            this.f13012a.clear();
            this.f13014c = null;
            this.f13013b.disconnect();
        }

        void a(TaskApiCallWrapper taskApiCallWrapper) {
            HMSLog.i("HuaweiApi", "sendRequest");
            TaskApiCallbackWrapper taskApiCallbackWrapperB = b(taskApiCallWrapper);
            if (HMSPackageManager.getInstance(this.d.getContext()).isUpdateHmsForThirdPartyDevice()) {
                this.f13013b.disconnect();
            }
            int hmsVersionCode = HMSPackageManager.getInstance(((HuaweiApi) this.d).f13006a).getHmsVersionCode();
            if (hmsVersionCode < 40000000 && hmsVersionCode > 0 && this.f13013b.isConnected() && !((HuaweiApi) this.d).m && ((BaseHmsClient) this.f13013b).getAdapter().getServiceAction().equals("com.huawei.hms.core.aidlservice")) {
                int requestHmsVersionCode = this.f13013b.getRequestHmsVersionCode();
                if (requestHmsVersionCode <= taskApiCallWrapper.getTaskApiCall().getMinApkVersion()) {
                    requestHmsVersionCode = taskApiCallWrapper.getTaskApiCall().getMinApkVersion();
                }
                if (requestHmsVersionCode > hmsVersionCode) {
                    this.f13013b.disconnect();
                }
            }
            if (this.f13013b.isConnected()) {
                HMSLog.i("HuaweiApi", "isConnected:true.");
                BinderAdapter adapter = ((BaseHmsClient) this.f13013b).getAdapter();
                adapter.updateDelayTask();
                ((HmsClient) this.f13013b).setService(IAIDLInvoke.Stub.asInterface(adapter.getServiceBinder()));
                postMessage(taskApiCallbackWrapperB);
                return;
            }
            HMSLog.i("HuaweiApi", "isConnected:false.");
            this.callbackWaitQueue.add(taskApiCallbackWrapperB);
            ConnectionResult connectionResult = this.f13014c;
            if (connectionResult != null && connectionResult.getErrorCode() != 0) {
                HMSLog.i("HuaweiApi", "onConnectionFailed, ErrorCode:" + this.f13014c.getErrorCode());
                onConnectionFailed(this.f13014c);
                return;
            }
            RequestManager.addRequestToQueue(this);
            Object obj = this.f13013b;
            if (obj instanceof BaseHmsClient) {
                ((BaseHmsClient) obj).setInternalRequest(this);
            }
            a(taskApiCallWrapper.getTaskApiCall().getMinApkVersion(), taskApiCallbackWrapperB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.f13014c = null;
            this.f13012a.clear();
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            while (it.hasNext()) {
                postMessage(it.next());
            }
            this.callbackWaitQueue.clear();
        }

        private String a(String str, String str2) {
            return TextUtils.isEmpty(str) ? TransactionIdCreater.getId(this.d.getAppID(), str2) : str;
        }

        void a(int i, TaskApiCallbackWrapper taskApiCallbackWrapper) {
            synchronized (this) {
                if (this.f13013b.isConnected()) {
                    HMSLog.d("HuaweiApi", "client is connected");
                    return;
                }
                if (this.f13013b.isConnecting()) {
                    HMSLog.d("HuaweiApi", "client is isConnecting");
                    return;
                }
                if (this.d.getActivity() != null) {
                    if (this.e == null) {
                        this.e = new ResolveClientBean(this.f13013b, i);
                    }
                    if (BindResolveClients.getInstance().isClientRegistered(this.e)) {
                        HMSLog.i("HuaweiApi", "mResolveClientBean has already register, return!");
                        return;
                    }
                    BindResolveClients.getInstance().register(this.e);
                }
                this.f13013b.connect(i);
            }
        }

        void a() {
            this.f13013b.disconnect();
        }

        private void a(TaskApiCallbackWrapper taskApiCallbackWrapper) {
            TaskApiCallWrapper taskApiCallWrapperA = taskApiCallbackWrapper.a();
            ResponseHeader responseHeader = new ResponseHeader(1, 907135003, "Connection Suspended");
            responseHeader.setTransactionId(taskApiCallWrapperA.getTaskApiCall().getTransactionId());
            taskApiCallWrapperA.getTaskApiCall().onResponse(this.f13013b, responseHeader, null, taskApiCallWrapperA.getTaskCompletionSource());
        }

        private String a(ConnectionResult connectionResult) {
            if (Util.isAvailableLibExist(this.d.getContext())) {
                int errorCode = connectionResult.getErrorCode();
                if (errorCode == -1) {
                    return "get update result, but has other error codes";
                }
                if (errorCode == 3) {
                    return "HuaWei Mobile Service is disabled";
                }
                if (errorCode == 8) {
                    return "internal error";
                }
                if (errorCode == 10) {
                    return "application configuration error, please developer check configuration";
                }
                if (errorCode == 13) {
                    return "update cancelled";
                }
                if (errorCode != 21) {
                    switch (errorCode) {
                        case 25:
                            return "failed to get update result";
                        case 26:
                            return "update failed, because no activity incoming, can't pop update page";
                        case 27:
                            return "there is already an update popup at the front desk, but it hasn't been clicked or it is not effective for a while";
                        default:
                            return "unknown errorReason";
                    }
                }
                return "device is too old to be support";
            }
            int errorCode2 = connectionResult.getErrorCode();
            if (errorCode2 == -1) {
                return "get update result, but has other error codes";
            }
            if (errorCode2 != 8) {
                return errorCode2 != 10 ? "unknown errorReason" : "application configuration error, please developer check configuration";
            }
            return "internal error";
        }
    }

    public static class TaskApiCallbackWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TaskApiCallWrapper f13026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AnyClient.CallBack f13027b;

        TaskApiCallbackWrapper(TaskApiCallWrapper taskApiCallWrapper, AnyClient.CallBack callBack) {
            this.f13026a = taskApiCallWrapper;
            this.f13027b = callBack;
        }

        TaskApiCallWrapper a() {
            return this.f13026a;
        }

        AnyClient.CallBack b() {
            return this.f13027b;
        }
    }

    static class a<OptionsT extends Api.ApiOptions> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HuaweiApi<OptionsT> f13028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TaskApiCallWrapper f13029b;

        public a(HuaweiApi<OptionsT> huaweiApi, TaskApiCallWrapper taskApiCallWrapper) {
            this.f13028a = huaweiApi;
            this.f13029b = taskApiCallWrapper;
        }

        private void a(RequestHandler requestHandler, Throwable th) {
            Throwable th2;
            AnyClient client;
            String string;
            ResponseHeader responseHeader;
            TaskCompletionSource taskCompletionSource;
            TaskApiCall taskApiCall = null;
            try {
                client = requestHandler.getClient();
                try {
                    responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.INTERNAL_ERROR, th.getMessage());
                    try {
                        string = new JSONObject().toString();
                        try {
                            taskCompletionSource = this.f13029b.getTaskCompletionSource();
                            try {
                                taskApiCall = this.f13029b.getTaskApiCall();
                            } catch (Throwable th3) {
                                th2 = th3;
                                HMSLog.e("HuaweiApi", "<notifyCpException> " + th2.getMessage());
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            taskCompletionSource = null;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        string = null;
                        taskCompletionSource = null;
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                    string = null;
                    responseHeader = null;
                    taskCompletionSource = null;
                    HMSLog.e("HuaweiApi", "<notifyCpException> " + th2.getMessage());
                    if (client != null) {
                    }
                    HMSLog.e("HuaweiApi", "<notifyCpException> isNotify is false, Can not notify CP.");
                }
            } catch (Throwable th7) {
                th2 = th7;
                client = null;
            }
            if (client != null || responseHeader == null || string == null || taskCompletionSource == null || taskApiCall == null) {
                HMSLog.e("HuaweiApi", "<notifyCpException> isNotify is false, Can not notify CP.");
            } else {
                taskApiCall.onResponse(client, responseHeader, string, taskCompletionSource);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestHandler requestHandler = new RequestHandler(this.f13028a);
            try {
                requestHandler.a(this.f13029b);
            } catch (Throwable th) {
                HMSLog.e("HuaweiApi", "sendRequest has exception", th);
                a(requestHandler, th);
            }
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, i, null);
    }

    @Deprecated
    public Task<Boolean> disconnectService() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        RequestManager.getInstance();
        RequestManager.getHandler().post(new Runnable() { // from class: com.huawei.hms.common.HuaweiApi.1
            @Override // java.lang.Runnable
            public void run() {
                HuaweiApi.this.a((HuaweiApi<?>) this, (TaskCompletionSource<Boolean>) taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public <TResult, TClient extends AnyClient> Task<TResult> doWrite(TaskApiCall<TClient, TResult> taskApiCall) {
        this.k = true;
        if (taskApiCall == null) {
            HMSLog.e("HuaweiApi", "in doWrite:taskApiCall is null");
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setException(new ApiException(Status.FAILURE));
            return taskCompletionSource.getTask();
        }
        HiAnalyticsInnerClient.reportEntryClient(this.f13006a, taskApiCall.getUri(), TextUtils.isEmpty(this.g.getSubAppID()) ? this.f : this.g.getSubAppID(), taskApiCall.getTransactionId(), String.valueOf(getKitSdkVersion()));
        if (this.n == null) {
            this.n = RequestManager.getInstance();
        }
        return a(taskApiCall);
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.h;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getApiLevel() {
        return this.j;
    }

    public String getAppID() {
        return this.f;
    }

    public AnyClient getClient(Looper looper, RequestHandler requestHandler) {
        return this.d.buildClient(this.f13006a, getClientSetting(), requestHandler, requestHandler);
    }

    protected ClientSettings getClientSetting() {
        ClientSettings clientSettings = new ClientSettings(this.f13006a.getPackageName(), this.f13006a.getClass().getName(), getScopes(), this.e, null, this.g);
        if (!this.m) {
            String hMSPackageNameForMultiService = HMSPackageManager.getInstance(this.f13006a).getHMSPackageNameForMultiService();
            if (TextUtils.isEmpty(hMSPackageNameForMultiService)) {
                hMSPackageNameForMultiService = "com.huawei.hwid";
            }
            this.l = hMSPackageNameForMultiService;
            HMSLog.i("HuaweiApi", "No setInnerHms, hms pkg name is " + this.l);
        }
        clientSettings.setInnerHmsPkg(this.l);
        clientSettings.setUseInnerHms(this.m);
        WeakReference<Activity> weakReference = this.h;
        if (weakReference != null) {
            clientSettings.setCpActivity(weakReference.get());
        }
        return clientSettings;
    }

    public Context getContext() {
        return this.f13006a;
    }

    public int getKitSdkVersion() {
        return this.i;
    }

    public TOption getOption() {
        return this.f13007b;
    }

    protected List<Scope> getScopes() {
        return Collections.EMPTY_LIST;
    }

    public String getSubAppID() {
        return this.g.getSubAppID();
    }

    public void setApiLevel(int i) {
        this.j = i;
    }

    public void setHostContext(Context context) {
        this.f13008c = context;
    }

    public void setInnerHms() {
        this.l = this.f13006a.getPackageName();
        this.m = true;
        HMSLog.i("HuaweiApi", "<setInnerHms> init inner hms pkg info:" + this.l);
    }

    public void setKitSdkVersion(int i) {
        this.i = i;
    }

    public void setSubAppId(String str) throws ApiException {
        if (!setSubAppInfo(new SubAppInfo(str))) {
            throw new ApiException(Status.FAILURE);
        }
    }

    @Deprecated
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        HMSLog.i("HuaweiApi", "Enter setSubAppInfo");
        SubAppInfo subAppInfo2 = this.g;
        if (subAppInfo2 != null && !TextUtils.isEmpty(subAppInfo2.getSubAppID())) {
            HMSLog.e("HuaweiApi", "subAppInfo is already set");
            return false;
        }
        if (subAppInfo == null) {
            HMSLog.e("HuaweiApi", "subAppInfo is null");
            return false;
        }
        String subAppID = subAppInfo.getSubAppID();
        if (TextUtils.isEmpty(subAppID)) {
            HMSLog.e("HuaweiApi", "subAppId is empty");
            return false;
        }
        if (subAppID.equals(this.e)) {
            HMSLog.e("HuaweiApi", "subAppId is host appid");
            return false;
        }
        if (this.k) {
            HMSLog.e("HuaweiApi", "Client has sent request to Huawei Mobile Services, setting subAppId is not allowed");
            return false;
        }
        this.g = new SubAppInfo(subAppInfo);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        String appId = Util.getAppId(context);
        this.e = appId;
        this.f = appId;
    }

    private void a(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        this.f13006a = context.getApplicationContext();
        this.f13007b = toption;
        this.d = abstractClientBuilder;
        b(context);
        this.g = new SubAppInfo("");
        this.i = i;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(this.e)) {
                HMSLog.e("HuaweiApi", "subAppId is host appid");
            } else {
                HMSLog.i("HuaweiApi", "subAppId is " + str);
                this.g = new SubAppInfo(str);
            }
        }
        a(context);
        if (Util.isAvailableLibExist(context)) {
            AvailableUtil.asyncCheckHmsUpdateInfo(context);
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, i, str);
    }

    private void a(Context context) {
        HMSBIInitializer.getInstance(context).initBI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HuaweiApi<?> huaweiApi, TaskCompletionSource<Boolean> taskCompletionSource) {
        HMSLog.i("HuaweiApi", "innerDisconnect.");
        try {
            huaweiApi.getClient(RequestManager.getHandler().getLooper(), null).disconnect();
            taskCompletionSource.setResult(Boolean.TRUE);
        } catch (Exception e) {
            HMSLog.w("HuaweiApi", "disconnect the binder failed for:" + e.getMessage());
        }
    }

    private <TResult, TClient extends AnyClient> Task<TResult> a(TaskApiCall<TClient, TResult> taskApiCall) {
        TaskCompletionSource taskCompletionSource;
        if (taskApiCall.getToken() == null) {
            taskCompletionSource = new TaskCompletionSource();
        } else {
            taskCompletionSource = new TaskCompletionSource(taskApiCall.getToken());
        }
        RequestManager.getHandler().post(new a(this, new TaskApiCallWrapper(taskApiCall, taskCompletionSource)));
        return taskCompletionSource.getTask();
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.h = new WeakReference<>(activity);
        a(activity, api, toption, abstractClientBuilder, 0, null);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, i, null);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, i, str);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        a(context, api, toption, abstractClientBuilder, 0, null);
    }
}
