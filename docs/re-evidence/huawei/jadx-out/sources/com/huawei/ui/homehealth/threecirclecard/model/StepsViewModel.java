package com.huawei.ui.homehealth.threecirclecard.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.media3.common.C;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.manager.DaemonService;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.ui.widget.XiaomiWidgetProvider;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.ICommonReport;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.fga;
import defpackage.ipb;
import defpackage.tuv;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class StepsViewModel extends ViewModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f26130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MutableLiveData<ResourceResultInfo> f26131c;
    private MutableLiveData<HashMap<String, Integer>> d;
    private Context e;
    private BroadcastReceiver j;
    private MutableLiveData<Bundle> k;
    private volatile IExecuteResult l;
    private volatile h o;
    private volatile boolean g = false;
    private HealthOpenSDK h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f26129a = new e(this);
    private int m = 0;
    private boolean f = false;
    private volatile boolean i = false;

    public static class e extends BaseHandler<StepsViewModel> {
        public e(StepsViewModel stepsViewModel) {
            super(stepsViewModel);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(StepsViewModel stepsViewModel, Message message) {
            if (message == null) {
                ReleaseLogUtil.e("SCUI_StepsViewModel", "msg == null");
                return;
            }
            int i = message.what;
            if (i == 2) {
                stepsViewModel.b();
                return;
            }
            if (i != 3) {
                if (i == 17 && !stepsViewModel.g) {
                    ReleaseLogUtil.e("SCUI_StepsViewModel", "opensdk not reg success, retry! ");
                    stepsViewModel.b();
                    return;
                }
                return;
            }
            stepsViewModel.l();
        }
    }

    public void d(HealthOpenSDK healthOpenSDK) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.e == null) {
            this.e = BaseApplication.getContext();
        }
        this.h = healthOpenSDK;
        f();
        a();
        LogUtil.a("SCUI_StepsViewModel", "initData finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    public void c(LifecycleOwner lifecycleOwner, Observer<Bundle> observer) {
        if (lifecycleOwner == null || observer == null) {
            LogUtil.j("SCUI_StepsViewModel", "observeStepsData() is null");
            return;
        }
        if (this.k == null) {
            this.k = new MutableLiveData<>();
        }
        this.k.observe(lifecycleOwner, observer);
    }

    public void d(LifecycleOwner lifecycleOwner, Observer<HashMap<String, Integer>> observer) {
        if (lifecycleOwner == null || observer == null) {
            LogUtil.j("SCUI_StepsViewModel", "observeGoalData() is null");
            return;
        }
        if (this.d == null) {
            this.d = new MutableLiveData<>();
        }
        this.d.observe(lifecycleOwner, observer);
    }

    public void a(LifecycleOwner lifecycleOwner, Observer<ResourceResultInfo> observer) {
        if (lifecycleOwner == null || observer == null) {
            LogUtil.j("SCUI_StepsViewModel", "observeMarketingData() is null");
            return;
        }
        if (this.f26131c == null) {
            this.f26131c = new MutableLiveData<>();
        }
        this.f26131c.observe(lifecycleOwner, observer);
    }

    public void d(Observer<Bundle> observer) {
        if (observer == null) {
            LogUtil.j("SCUI_StepsViewModel", "removeStepsDataObserver() is null");
        } else if (this.k != null) {
            LogUtil.a("SCUI_StepsViewModel", "removeStepsDataObserver");
            this.k.removeObserver(observer);
        }
    }

    public void e(Observer<HashMap<String, Integer>> observer) {
        if (observer == null) {
            LogUtil.j("SCUI_StepsViewModel", "removeGoalDataObserver() is null");
        } else if (this.d != null) {
            LogUtil.a("SCUI_StepsViewModel", "removeGoalDataObserver");
            this.d.removeObserver(observer);
        }
    }

    public void c(Observer<ResourceResultInfo> observer) {
        if (observer == null) {
            LogUtil.j("SCUI_StepsViewModel", "removeMarketingDataObserver() is null");
        } else if (this.f26131c != null) {
            LogUtil.a("SCUI_StepsViewModel", "removeMarketingDataObserver");
            this.f26131c.removeObserver(observer);
        }
    }

    private void f() {
        if (this.h == null) {
            ReleaseLogUtil.e("SCUI_StepsViewModel", "mHealthOpenSdk null");
            return;
        }
        if (this.o != null) {
            ReleaseLogUtil.e("SCUI_StepsViewModel", "init but mStepCallback not null");
            return;
        }
        this.o = new h(this);
        this.l = new c();
        fga.d(this.e).d(this.l);
        b();
        Handler handler = this.f26129a;
        if (handler == null || handler.hasMessages(17)) {
            return;
        }
        this.f26129a.sendEmptyMessageDelayed(17, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    private void j() {
        if (this.j != null) {
            LogUtil.j("SCUI_StepsViewModel", "registerProcessRestart mProcessReceiver has registered");
            return;
        }
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.threecirclecard.model.StepsViewModel.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String stringExtra = intent.getStringExtra("processName");
                boolean booleanExtra = intent.getBooleanExtra("isRunning", false);
                LogUtil.a("SCUI_StepsViewModel", "processName: ", stringExtra, " isRunning: ", Boolean.valueOf(booleanExtra), " time: ", Long.valueOf(intent.getLongExtra("time", 0L)));
                if (XiaomiWidgetProvider.DAEMON_SERVICE_PROCESS.equals(stringExtra) && booleanExtra) {
                    ReleaseLogUtil.d("SCUI_StepsViewModel", "DaemonService restart");
                    StepsViewModel.this.b();
                }
            }
        };
        this.j = broadcastReceiver;
        BroadcastManager.a(broadcastReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        BroadcastReceiver broadcastReceiver = this.j;
        if (broadcastReceiver != null) {
            BroadcastManager.m(broadcastReceiver);
            this.j = null;
        }
    }

    public void a() {
        if (this.f26130b == null) {
            this.f26130b = new b();
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: tdt
            @Override // java.lang.Runnable
            public final void run() {
                this.e.i();
            }
        });
    }

    public /* synthetic */ void i() {
        tuv.c().d(this.f26130b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        try {
            this.e.startService(new Intent(this.e, (Class<?>) DaemonService.class));
            b();
        } catch (Exception e2) {
            LogUtil.e("SCUI_StepsViewModel", "MSG_REBIND_OPENSDK", LogAnonymous.b(e2));
            j();
        }
    }

    protected void b() {
        if (this.h == null || this.o == null || this.l == null) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: tdv
            @Override // java.lang.Runnable
            public final void run() {
                this.f49008c.c();
            }
        });
    }

    public /* synthetic */ void c() {
        if (this.h == null || this.o == null || this.l == null) {
            return;
        }
        ReleaseLogUtil.d("SCUI_StepsViewModel", "doRegister");
        this.h.e(this.o);
        this.h.a(this.o, this.l);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        LogUtil.a("SCUI_StepsViewModel", "destroy StepsCard");
        Handler handler = this.f26129a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: tds
            @Override // java.lang.Runnable
            public final void run() {
                this.d.h();
            }
        });
        if (this.l != null) {
            fga.d(this.e).b(this.l);
        }
        n();
    }

    public /* synthetic */ void h() {
        if (this.h == null) {
            ReleaseLogUtil.e("SCUI_StepsViewModel", "onDestroy mHealthOpenSdk null");
        } else if (this.o == null) {
            ReleaseLogUtil.e("SCUI_StepsViewModel", "onDestroy mStepCallback null!!!why?");
        } else {
            LogUtil.a("SCUI_StepsViewModel", "unRegister mStepCallback:", this.o);
            this.h.e(this.o);
        }
    }

    class c implements IExecuteResult {
        private c() {
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            ReleaseLogUtil.d("SCUI_StepsViewModel", "RegisterResult onSuccess");
            StepsViewModel.this.g = true;
            if (StepsViewModel.this.f) {
                ipb.b();
            }
            StepsViewModel.this.n();
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
            ReleaseLogUtil.e("SCUI_StepsViewModel", "RegisterResult onFailed");
            StepsViewModel.this.k();
            if (StepsViewModel.this.f) {
                ipb.d();
            }
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
            ReleaseLogUtil.e("SCUI_StepsViewModel", "RegisterResult onServiceException");
            StepsViewModel.this.f26129a.sendMessage(StepsViewModel.this.f26129a.obtainMessage(3));
            if (StepsViewModel.this.f) {
                ipb.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        Handler handler = this.f26129a;
        if (handler == null) {
            LogUtil.j("SCUI_StepsViewModel", "retryRegister mHandler == null");
            return;
        }
        if (handler.hasMessages(2)) {
            return;
        }
        int i = this.m + 1;
        this.m = i;
        ReleaseLogUtil.d("SCUI_StepsViewModel", "retryRegister mRegisterTimes=", Integer.valueOf(i));
        int i2 = this.m;
        if (i2 <= 10) {
            this.f26129a.sendEmptyMessageDelayed(2, i2 * 200);
        } else {
            o();
        }
    }

    private void o() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: tdu
            @Override // java.lang.Runnable
            public final void run() {
                this.f49007a.g();
            }
        });
    }

    public /* synthetic */ void g() {
        if (this.f) {
            ReleaseLogUtil.d("SCUI_StepsViewModel", "initSDK mIsReInitStepSdk true");
            return;
        }
        ipb.i();
        ReleaseLogUtil.d("SCUI_StepsViewModel", "retryInitStepSDK initSDK start");
        this.f = true;
        HealthOpenSDK healthOpenSDK = this.h;
        if (healthOpenSDK == null) {
            ReleaseLogUtil.e("SCUI_StepsViewModel", "retryInitStepSDK initSDK start");
        } else {
            healthOpenSDK.destorySDK();
            this.h.initSDK(this.e, new IExecuteResult() { // from class: com.huawei.ui.homehealth.threecirclecard.model.StepsViewModel.5
                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onSuccess(Object obj) {
                    ReleaseLogUtil.d("SCUI_StepsViewModel", "retryInitStepSDK initSDK onSuccess");
                    StepsViewModel.this.b();
                }

                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onFailed(Object obj) {
                    ReleaseLogUtil.d("SCUI_StepsViewModel", "retryInitStepSDK initSDK onFailed");
                }

                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onServiceException(Object obj) {
                    ReleaseLogUtil.a("SCUI_StepsViewModel", "retryInitStepSDK initSDK onServiceException");
                }
            }, "HuaweiHealth");
        }
    }

    static class b implements IBaseResponseCallback {
        private WeakReference<StepsViewModel> e;

        private b(StepsViewModel stepsViewModel) {
            this.e = new WeakReference<>(stepsViewModel);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("SCUI_StepsViewModel", "SportAchievementGoalDataCallback ", obj == null ? null : obj.toString());
            StepsViewModel stepsViewModel = this.e.get();
            if (stepsViewModel == null) {
                ReleaseLogUtil.e("SCUI_StepsViewModel", "SportAchievementGoalDataCallback cardData is null ");
            } else if (obj instanceof HashMap) {
                stepsViewModel.d.postValue((HashMap) obj);
            } else {
                LogUtil.j("SCUI_StepsViewModel", "handleMsgUpdateDialog is not instanceof HashMap");
            }
        }
    }

    static class h implements ICommonReport {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<StepsViewModel> f26135b;

        protected h(StepsViewModel stepsViewModel) {
            this.f26135b = null;
            this.f26135b = new WeakReference<>(stepsViewModel);
        }

        @Override // com.huawei.hihealth.motion.ICommonReport
        public void report(Bundle bundle) {
            ReleaseLogUtil.d("SCUI_StepsViewModel", "StepCallback start");
            StepsViewModel stepsViewModel = this.f26135b.get();
            if (stepsViewModel != null && bundle != null) {
                if (stepsViewModel.k != null) {
                    stepsViewModel.k.postValue(bundle);
                    return;
                }
                return;
            }
            ReleaseLogUtil.e("SCUI_StepsViewModel", "StepCallback mStepsCard is null or bundle is null");
        }
    }

    public void d(boolean z) {
        this.i = z;
    }

    public boolean e() {
        return this.i;
    }

    public void d() {
        ReleaseLogUtil.e("SCUI_StepsViewModel", "getOverlayAnimateMarketingRes");
        MarketingApi marketingApi = (MarketingApi) Services.b("FeatureMarketing", MarketingApi.class);
        Task<Map<Integer, ResourceResultInfo>> resourceResultInfoByGateway = marketingApi.getResourceResultInfoByGateway(2052, (String) null);
        resourceResultInfoByGateway.addOnSuccessListener(new d(this, marketingApi));
        resourceResultInfoByGateway.addOnFailureListener(new a(this));
    }

    static class d implements OnSuccessListener<Map<Integer, ResourceResultInfo>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MarketingApi f26134b;
        private WeakReference<StepsViewModel> e;

        d(StepsViewModel stepsViewModel, MarketingApi marketingApi) {
            this.e = new WeakReference<>(stepsViewModel);
            this.f26134b = marketingApi;
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Map<Integer, ResourceResultInfo> map) {
            StepsViewModel stepsViewModel = this.e.get();
            if (stepsViewModel == null) {
                ReleaseLogUtil.e("SCUI_StepsViewModel", "viewModel is null");
                return;
            }
            LogUtil.a("SCUI_StepsViewModel", "marketingResponse: ", map);
            if (map == null || map.isEmpty()) {
                ReleaseLogUtil.e("SCUI_StepsViewModel", "marketingResponse is invalid");
                stepsViewModel.f26131c.postValue(null);
                return;
            }
            Map<Integer, ResourceResultInfo> mapFilterMarketingRules = this.f26134b.filterMarketingRules(map);
            if (mapFilterMarketingRules == null || mapFilterMarketingRules.isEmpty()) {
                ReleaseLogUtil.e("SCUI_StepsViewModel", "filterResultInfoMap is invalid");
                stepsViewModel.f26131c.postValue(null);
            } else if (mapFilterMarketingRules.get(2052) != null) {
                ReleaseLogUtil.d("SCUI_StepsViewModel", "has overlay animate marketing resource");
                stepsViewModel.f26131c.postValue(mapFilterMarketingRules.get(2052));
            } else {
                ReleaseLogUtil.d("SCUI_StepsViewModel", "no overlay animate marketing resource");
                stepsViewModel.f26131c.postValue(null);
            }
        }
    }

    static class a implements OnFailureListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<StepsViewModel> f26133b;

        a(StepsViewModel stepsViewModel) {
            this.f26133b = new WeakReference<>(stepsViewModel);
        }

        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            if (this.f26133b.get() == null) {
                ReleaseLogUtil.e("SCUI_StepsViewModel", "viewModel is null");
            } else {
                LogUtil.e("SCUI_StepsViewModel", "requestMarketResource onFailure,", ExceptionUtils.c(exc));
            }
        }
    }
}
