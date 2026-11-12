package com.huawei.ui.main.stories.template.health.impl;

import android.os.Handler;
import android.os.Looper;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.LoginResultCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.linechart.common.DateType;
import com.huawei.ui.commonui.transition.ActivityTransitionAnimator;
import com.huawei.ui.main.stories.template.ResourceParseHelper;
import com.huawei.ui.main.stories.template.health.contract.DataDetailActivityContract;
import defpackage.njy;
import defpackage.ula;
import defpackage.uxd;
import defpackage.vbr;
import defpackage.vci;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class HealthDetailCommonActivityPresenter implements DataDetailActivityContract.DetailActivityPresenter<DataDetailActivityContract.DetailActivityView> {
    private boolean mIsFirst;
    protected boolean mIsSubscribe;
    private long mLastTimeMillis;
    private e mListener;
    private final Observer mObserver;
    private int mShowType;
    protected List<Integer> mSubscribeSuccessList;
    private String mTag;
    private WeakReference<DataDetailActivityContract.DetailActivityView> mViewWeakRef;
    protected boolean mNeedResolution = true;
    private final IBaseResponseCallback mBaseResponseCallback = new h(this);

    protected abstract void getLastDataTimestamp(IBaseResponseCallback iBaseResponseCallback);

    protected abstract List<Integer> getSubscribeList();

    protected abstract void initToolBar();

    @Override // com.huawei.ui.main.stories.template.health.contract.DataDetailActivityContract.DetailActivityPresenter
    public void notifyChartDateStatus(DateType dateType, boolean z, boolean z2) {
    }

    @Override // com.huawei.ui.main.stories.template.health.contract.DataDetailActivityContract.DetailActivityPresenter
    public void notifyViewPagerChange(int i) {
    }

    protected void onLogined(String str) {
    }

    @Override // com.huawei.ui.main.stories.template.health.contract.DataDetailActivityContract.DetailActivityPresenter
    public void setChartStartTimeAndEndTime(long j, long j2) {
    }

    public HealthDetailCommonActivityPresenter(String str) {
        this.mTag = "Main_HealthDetailCommonActivityPresenter";
        c cVar = new c(this);
        this.mObserver = cVar;
        this.mIsFirst = true;
        if (StringUtils.j(str)) {
            this.mTag = str;
        }
        boolean zA = ActivityTransitionAnimator.c().a();
        ReleaseLogUtil.c(this.mTag, "HealthDetailCommonActivityPresenter isSupport ", Boolean.valueOf(zA));
        if (zA) {
            ObserverManagerUtil.d(cVar, ObserveLabels.ACTIVITY_TRANSITION_ANIMATOR_END);
        }
    }

    static class c implements Observer {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<HealthDetailCommonActivityPresenter> f29003c;

        c(HealthDetailCommonActivityPresenter healthDetailCommonActivityPresenter) {
            this.f29003c = new WeakReference<>(healthDetailCommonActivityPresenter);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            HealthDetailCommonActivityPresenter healthDetailCommonActivityPresenter = this.f29003c.get();
            if (healthDetailCommonActivityPresenter == null) {
                return;
            }
            LogUtil.a(healthDetailCommonActivityPresenter.mTag, "InnerObserver notify label ", str, " objects ", objArr, " presenter.mLastTimeMillis ", Long.valueOf(healthDetailCommonActivityPresenter.mLastTimeMillis));
            healthDetailCommonActivityPresenter.initPageInfo(healthDetailCommonActivityPresenter.mLastTimeMillis);
        }
    }

    static class h implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<HealthDetailCommonActivityPresenter> f29006a;

        h(HealthDetailCommonActivityPresenter healthDetailCommonActivityPresenter) {
            this.f29006a = new WeakReference<>(healthDetailCommonActivityPresenter);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            long jLongValue = obj instanceof Long ? ((Long) obj).longValue() : 0L;
            HealthDetailCommonActivityPresenter healthDetailCommonActivityPresenter = this.f29006a.get();
            if (healthDetailCommonActivityPresenter == null) {
                return;
            }
            if (i != 0 || jLongValue <= 0) {
                healthDetailCommonActivityPresenter.showNoDataNoDevicesDetailView(i == 2);
            } else {
                healthDetailCommonActivityPresenter.showDetailView(jLongValue);
            }
        }
    }

    public DataDetailActivityContract.DetailActivityView getView() {
        WeakReference<DataDetailActivityContract.DetailActivityView> weakReference = this.mViewWeakRef;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.huawei.ui.main.stories.template.BasePresenter
    public void attachView(DataDetailActivityContract.DetailActivityView detailActivityView) {
        this.mViewWeakRef = new WeakReference<>(detailActivityView);
    }

    @Override // com.huawei.ui.main.stories.template.BasePresenter
    public boolean isViewAttached() {
        WeakReference<DataDetailActivityContract.DetailActivityView> weakReference = this.mViewWeakRef;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    @Override // com.huawei.ui.main.stories.template.health.contract.DataDetailActivityContract.DetailActivityPresenter
    public void initPage(String str, long j, String str2) {
        if (isViewAttached()) {
            initPageInfo(str, j, str2);
        } else {
            LogUtil.j(this.mTag, getClass().getName(), " don't attach View");
        }
    }

    public void initTitleBar(String str, String str2) {
        if (!this.mNeedResolution) {
            LogUtil.a(this.mTag, "initTitleBar not need resolution");
        } else {
            ResourceParseHelper.e(str, str2, new b());
        }
    }

    protected void refreshPage() {
        subscribeData();
        getLastDataTimestamp(this.mBaseResponseCallback);
    }

    private void subscribeData() {
        DataDetailActivityContract.DetailActivityView view = getView();
        if (view == null) {
            return;
        }
        if (this instanceof uxd) {
            this.mListener = new e(this.mTag, this);
            vci.d().b(this.mListener);
            this.mIsSubscribe = true;
            return;
        }
        HiHealthNativeApi.a(view.getViewContext()).subscribeHiHealthData(getSubscribeList(), this.mListener);
    }

    private void unSubscribeData() {
        LogUtil.a(this.mTag, "unSubscribeData");
        if (njy.b(this.mSubscribeSuccessList)) {
            HiHealthNativeApi.a(getView().getViewContext()).unSubscribeHiHealthData(this.mSubscribeSuccessList, new a(this.mTag, "unSubscribeData isSuccess :"));
        } else {
            vci.d().d(this.mListener);
        }
        this.mIsSubscribe = false;
    }

    protected void updateSuccessList(List<Integer> list) {
        LogUtil.a(this.mTag, "subscribeData, onResult");
        if (njy.b(list)) {
            LogUtil.a(this.mTag, "registerDataChangeListener success");
            this.mSubscribeSuccessList = list;
            this.mIsSubscribe = true;
        }
    }

    private void initPageInfo(String str, long j, String str2) {
        initTitleBar(str, str2);
        initToolBar();
        subscribeData();
        LogUtil.a(this.mTag, "initPageInfo mIsFirst ", Boolean.valueOf(this.mIsFirst), " mLastTimeMillis ", Long.valueOf(this.mLastTimeMillis), " targetTimestamp ", Long.valueOf(j), " name ", str, " serviceId ", str2);
        this.mLastTimeMillis = j;
        if (this.mIsFirst && ActivityTransitionAnimator.c().a()) {
            return;
        }
        initPageInfo(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initPageInfo(long j) {
        this.mIsFirst = false;
        if (j <= 0) {
            getLastDataTimestamp(this.mBaseResponseCallback);
        } else {
            showDetailView(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDetailView(long j) {
        if (isViewAttached()) {
            this.mShowType = 0;
            this.mViewWeakRef.get().showDataView(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNoDataNoDevicesDetailView(boolean z) {
        if (!isViewAttached() || this.mShowType == -1) {
            return;
        }
        this.mShowType = -1;
        this.mViewWeakRef.get().showNoDataView(z);
    }

    @Override // com.huawei.ui.main.stories.template.BasePresenter
    public void detachView() {
        if (isViewAttached()) {
            unSubscribeData();
            this.mViewWeakRef.clear();
            this.mViewWeakRef = null;
        }
        ObserverManagerUtil.c(this.mObserver);
    }

    public boolean isSubscribeType() {
        return this.mIsSubscribe;
    }

    protected void login(String str) {
        login(str, "");
    }

    protected void login(String str, String str2) {
        if (getView() == null || getView().getViewContext() == null) {
            LogUtil.j(this.mTag, "getView is null || getViewContext is null");
        } else if (LoginInit.getInstance(getView().getViewContext()).getIsLogined()) {
            onLogined(str);
        } else {
            LoginInit.getInstance(getView().getViewContext()).browsingToLogin(new d(this, str, this.mTag), str2);
        }
    }

    protected static class e implements HiSubscribeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<HealthDetailCommonActivityPresenter> f29005c;
        private final String d;

        public e(String str, HealthDetailCommonActivityPresenter healthDetailCommonActivityPresenter) {
            this.d = str;
            this.f29005c = new WeakReference<>(healthDetailCommonActivityPresenter);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            HealthDetailCommonActivityPresenter healthDetailCommonActivityPresenter = this.f29005c.get();
            if (healthDetailCommonActivityPresenter != null) {
                healthDetailCommonActivityPresenter.updateSuccessList(list);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            if (hiHealthData == null) {
                LogUtil.a(this.d, "onChange, type = ", Integer.valueOf(i));
            } else {
                LogUtil.a(this.d, "onChange, type = ", Integer.valueOf(i), ", newValue = ", hiHealthData.toString());
            }
            HealthDetailCommonActivityPresenter healthDetailCommonActivityPresenter = this.f29005c.get();
            if (healthDetailCommonActivityPresenter == null || !healthDetailCommonActivityPresenter.isSubscribeType()) {
                return;
            }
            if (i == DicDataTypeUtil.DataType.BODY_TEMPERATURE_SET.value() || i == DicDataTypeUtil.DataType.SKIN_TEMPERATURE_SET.value()) {
                vbr.c(str);
            }
            if (i == HiSubscribeType.f12260b || i == HiSubscribeType.e) {
                ula.c().e();
            }
            healthDetailCommonActivityPresenter.getLastDataTimestamp(this.f29005c.get().mBaseResponseCallback);
        }
    }

    protected static class a implements HiUnSubscribeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f29001b;

        public a(String str, String str2) {
            this.f29001b = str;
            this.f29000a = str2;
        }

        @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
        public void onResult(boolean z) {
            LogUtil.a(this.f29001b, this.f29000a, Boolean.valueOf(z));
        }
    }

    public static class d extends LoginResultCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f29004b;
        private final String d;
        private final WeakReference<HealthDetailCommonActivityPresenter> e;

        @Override // com.huawei.hwbasemgr.LoginResultCallback
        public boolean isNeedWait() {
            return true;
        }

        d(HealthDetailCommonActivityPresenter healthDetailCommonActivityPresenter, String str, String str2) {
            this.e = new WeakReference<>(healthDetailCommonActivityPresenter);
            this.f29004b = str;
            this.d = str2;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            final HealthDetailCommonActivityPresenter healthDetailCommonActivityPresenter = this.e.get();
            if (healthDetailCommonActivityPresenter == null) {
                return;
            }
            if (i == 0) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: wqa
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f52343c.c(healthDetailCommonActivityPresenter);
                    }
                });
                LogUtil.j(this.d, "browsingToLogin errorCode is success ", Integer.valueOf(i));
            } else {
                LogUtil.j(this.d, "browsingToLogin errorCode is not success ", Integer.valueOf(i));
            }
        }

        public /* synthetic */ void c(HealthDetailCommonActivityPresenter healthDetailCommonActivityPresenter) {
            healthDetailCommonActivityPresenter.refreshPage();
            healthDetailCommonActivityPresenter.onLogined(this.f29004b);
        }
    }

    static class b implements ResourceParseHelper.ConfigInfoCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<HealthDetailCommonActivityPresenter> f29002c;

        @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.ConfigInfoCallback
        public void getDescription(String str) {
        }

        @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.ConfigInfoCallback
        public void getImagePath(String str) {
        }

        @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.ConfigInfoCallback
        public void showParseErrorAlert() {
        }

        private b(HealthDetailCommonActivityPresenter healthDetailCommonActivityPresenter) {
            this.f29002c = new WeakReference<>(healthDetailCommonActivityPresenter);
        }

        @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.ConfigInfoCallback
        public void getTitleName(String str) {
            HealthDetailCommonActivityPresenter healthDetailCommonActivityPresenter = this.f29002c.get();
            if (healthDetailCommonActivityPresenter == null || healthDetailCommonActivityPresenter.getView() == null || !healthDetailCommonActivityPresenter.isViewAttached()) {
                return;
            }
            healthDetailCommonActivityPresenter.getView().setTitle(str);
        }
    }
}
