package com.huawei.watchface;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.WatchFaceListBean;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSupportInfo;
import com.huawei.watchface.mvp.model.datatype.querysubinfodetail.QuerySubInfoDetailResp;
import com.huawei.watchface.mvp.model.filedownload.threadpool.ThreadPoolManager;
import com.huawei.watchface.mvp.model.helper.JsSafeUrlSystemParamManager;
import com.huawei.watchface.mvp.model.helper.systemparam.NewSystemParamManager;
import com.huawei.watchface.mvp.model.helper.systemparam.SystemParamNames;
import com.huawei.watchface.mvp.model.thread.GetSignThread;
import com.huawei.watchface.mvp.model.thread.GetWatchFaceThread;
import com.huawei.watchface.mvp.model.thread.HitopGetPersonalizedContentThread;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.LanguageUtils;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class g2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f30158c = new Object();
    public static g2 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f30159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HwWatchFaceBtManager f30160b;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g2.this.a();
        }
    }

    public class b implements IBaseResponseCallback {
        public b() {
        }

        @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
        public void onResponse(int i, Object obj) {
            g2.this.a(i);
        }
    }

    public g2(Context context) {
        this.f30159a = context;
    }

    public static g2 b() {
        g2 g2Var;
        synchronized (f30158c) {
            if (d == null) {
                d = new g2(Environment.getApplicationContext());
            }
            g2Var = d;
        }
        return g2Var;
    }

    public final void a() {
        HwLog.i("HwWatchFaceEntranceManager", "getDeviceAndWatchFaceInfo() is called");
        HwWatchFaceBtManager hwWatchFaceBtManager = this.f30160b;
        if (hwWatchFaceBtManager == null) {
            return;
        }
        hwWatchFaceBtManager.getDeviceInfoForUi(new b());
    }

    public final /* synthetic */ void c(String str) {
        a(str, NewSystemParamManager.getSystemParam(SystemParamNames.SYSTEM_PARAM_DEFAULT_PERSONALIZED_RECOMMENDATION_SWITCH, "0"));
    }

    public final void d() {
        HwLog.i("HwWatchFaceEntranceManager", "getLocalWatchFace enter.");
        try {
            c((WatchFaceListBean) new Gson().fromJson(e4.d(this.f30159a), WatchFaceListBean.class));
        } catch (JsonSyntaxException unused) {
            HwLog.e("HwWatchFaceEntranceManager", "getLocalWatchFace JsonSyntaxException");
            a(true);
        }
    }

    public void e() {
        HwLog.i("HwWatchFaceEntranceManager", "getRecommendWatchFace");
        if (this.f30160b == null) {
            HwWatchFaceBtManager hwWatchFaceBtManager = HwWatchFaceBtManager.getInstance(this.f30159a);
            this.f30160b = hwWatchFaceBtManager;
            hwWatchFaceBtManager.registerHealthResponseListener();
        }
        if (this.f30160b.getConnectWatchDeviceInfo() == null) {
            HwLog.w("HwWatchFaceEntranceManager", "getRecommendWatchFace current device info is null return");
        } else {
            j2.g().p();
            ThreadPoolManager.getInstance().tagExecute("HwWatchFaceEntranceManager", new a());
        }
    }

    public final void f() {
        HwLog.i("HwWatchFaceEntranceManager", "getSignAndGetLocal() watchFaceSignBean is null.");
        GetSignThread getSignThread = new GetSignThread();
        if (getSignThread.b(getSignThread.e()) == null) {
            HwLog.w("HwWatchFaceEntranceManager", "getSignAndGetLocal watchFaceSignBean is null.");
        } else {
            d();
        }
    }

    public final boolean c() {
        boolean zEquals;
        HwWatchFaceApi hwWatchFaceApi = HwWatchFaceApi.getInstance(Environment.getApplicationContext());
        if (hwWatchFaceApi == null) {
            HwLog.e("HwWatchFaceEntranceManager", "getIsChargePaid hwWatchFaceApi is null");
            return true;
        }
        if (!hwWatchFaceApi.isOversea()) {
            return true;
        }
        String commonCountryCode = hwWatchFaceApi.getCommonCountryCode();
        if (TextUtils.equals("CN", commonCountryCode)) {
            return true;
        }
        String strA = b3.a(Environment.getApplicationContext(), "overseasSupportOnlineInfo" + commonCountryCode);
        HwLog.i("HwWatchFaceEntranceManager", "getIsChargePaid chargeOnlineState:" + strA);
        if (TextUtils.isEmpty(strA)) {
            d1 d1Var = new d1();
            g4 g4VarB = d1Var.b(d1Var.c(""));
            if (g4VarB == null) {
                HwLog.i("HwWatchFaceEntranceManager", "getIsChargePaid mSupportType is null");
                return true;
            }
            zEquals = TextUtils.equals(g4VarB.b(), "0");
        } else {
            zEquals = TextUtils.equals(strA, "0");
        }
        boolean z = !zEquals;
        HwLog.i("HwWatchFaceEntranceManager", "getIsChargePaid isChargePaidFlag:" + z);
        return z;
    }

    public final void a(int i) {
        if (i == 101) {
            HwLog.i("HwWatchFaceEntranceManager", "dealResponse getDeviceInfoForUi success");
            if (HwWatchFaceBtManager.getInstance(this.f30159a).getConnectWatchDeviceInfo() == null) {
                HwLog.w("HwWatchFaceEntranceManager", "dealResponse current device info is null");
                return;
            }
            a(HwWatchFaceApi.getInstance(this.f30159a).getDeviceIdentify());
            HwWatchFaceBtManager hwWatchFaceBtManager = this.f30160b;
            if (hwWatchFaceBtManager == null) {
                return;
            }
            hwWatchFaceBtManager.getWatchInfoForUi(new IBaseResponseCallback() { // from class: com.huawei.watchface.g2$$ExternalSyntheticLambda4
                @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
                public final void onResponse(int i2, Object obj) {
                    HwLog.i("HwWatchFaceEntranceManager", "dealResponse getWatchInfoForUi errorCode:" + i2);
                }
            });
            return;
        }
        HwLog.w("HwWatchFaceEntranceManager", "dealResponse getDeviceInfoForUi errorCode:" + i);
    }

    public final /* synthetic */ void b(String str) {
        String strF = e4.f(this.f30159a);
        String strE = e4.e(this.f30159a);
        WatchFaceSupportInfo watchFaceSupportInfo = HwWatchFaceBtManager.getInstance(this.f30159a).getWatchFaceSupportInfo();
        if (watchFaceSupportInfo == null) {
            return;
        }
        String str2 = CommonUtils.J() ? "1" : "0";
        String watchFaceMaxVersion = watchFaceSupportInfo.getWatchFaceMaxVersion();
        boolean zB = e4.b(this.f30159a);
        HwLog.i("HwWatchFaceEntranceManager", "getAndSaveTopFace savedVersion: " + strE + ", recentVersion: " + watchFaceMaxVersion + "，needRefreshWatchFace：" + zB);
        if (e4.g(this.f30159a) && strF.equalsIgnoreCase(l1.a(str)) && e4.e(this.f30159a, LanguageUtils.a(false)) && !zB && strE.equals(watchFaceMaxVersion) && TextUtils.equals(str2, e4.a(this.f30159a))) {
            if (WatchFaceHttpUtil.C() == null) {
                f();
                return;
            } else {
                d();
                return;
            }
        }
        a(false);
    }

    public final /* synthetic */ void d(final String str) {
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.g2$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c(str);
            }
        });
    }

    public void a(final String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.i("HwWatchFaceEntranceManager", "getAndSaveTopFace deviceIdentify is empty.");
        } else {
            BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.g2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(str);
                }
            });
        }
    }

    public final void a(boolean z) {
        HwWatchFaceBtManager hwWatchFaceBtManager;
        HwLog.i("HwWatchFaceEntranceManager", "getTopWatchFace() useCache: " + z);
        if (z && (hwWatchFaceBtManager = this.f30160b) != null) {
            final String watchVersion = hwWatchFaceBtManager.getWatchVersion();
            if (TextUtils.isEmpty(watchVersion)) {
                HwLog.w("HwWatchFaceEntranceManager", "getTopWatchFace() watchVersion is empty.");
                return;
            } else {
                e5.c().b(new e5.c() { // from class: com.huawei.watchface.g2$$ExternalSyntheticLambda2
                    @Override // com.huawei.watchface.e5.c
                    public final void onMembershipInfoUpdated(QuerySubInfoDetailResp querySubInfoDetailResp) {
                        this.f$0.a(watchVersion, querySubInfoDetailResp);
                    }
                });
                return;
            }
        }
        HwLog.i("HwWatchFaceEntranceManager", "getTopWatchFace() watchFaceSignBean is null.");
        GetSignThread getSignThread = new GetSignThread();
        if (getSignThread.b(getSignThread.e()) == null) {
            HwLog.w("HwWatchFaceEntranceManager", "getTopWatchFace watchFaceSignBean is null.");
        } else {
            a(true);
        }
    }

    public final void b(WatchFaceListBean watchFaceListBean) {
        if (watchFaceListBean == null) {
            HwLog.w("HwWatchFaceEntranceManager", "saveTopWatchFace watchFaceListBean is null return");
            return;
        }
        c(watchFaceListBean);
        try {
            e4.i(this.f30159a, new Gson().toJson(watchFaceListBean));
        } catch (JsonIOException unused) {
            HwLog.e("HwWatchFaceEntranceManager", "saveTopWatchFace JsonIOException");
        }
        e4.h(this.f30159a, new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).format(new Date()));
        if (HwWatchFaceBtManager.getInstance(this.f30159a).getConnectWatchDeviceInfo() == null) {
            HwLog.w("HwWatchFaceEntranceManager", "current device info is null");
            return;
        }
        WatchFaceSupportInfo watchFaceSupportInfo = HwWatchFaceBtManager.getInstance(this.f30159a).getWatchFaceSupportInfo();
        if (watchFaceSupportInfo == null) {
            HwLog.w("HwWatchFaceEntranceManager", "getWatchFaceSupportInfo is null");
            return;
        }
        Context context = this.f30159a;
        e4.k(context, l1.a(HwWatchFaceApi.getInstance(context).getDeviceIdentify()));
        e4.j(this.f30159a, watchFaceSupportInfo.getWatchFaceMaxVersion());
        e4.g(this.f30159a, LanguageUtils.a(false));
        e4.a(this.f30159a, false);
    }

    public final void c(final WatchFaceListBean watchFaceListBean) {
        BackgroundTaskUtils.postInMainThread(new Runnable() { // from class: com.huawei.watchface.g2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(watchFaceListBean);
            }
        });
    }

    public final /* synthetic */ void a(final String str, QuerySubInfoDetailResp querySubInfoDetailResp) {
        HitopGetPersonalizedContentThread hitopGetPersonalizedContentThread = new HitopGetPersonalizedContentThread();
        String strB = hitopGetPersonalizedContentThread.b(hitopGetPersonalizedContentThread.c(""));
        if (TextUtils.equals(strB, "-1")) {
            JsSafeUrlSystemParamManager.getInstance().b(new JsSafeUrlSystemParamManager.b() { // from class: com.huawei.watchface.g2$$ExternalSyntheticLambda5
                @Override // com.huawei.watchface.mvp.model.helper.JsSafeUrlSystemParamManager.b
                public final void onGetFinished() {
                    this.f$0.d(str);
                }
            });
        } else {
            a(str, strB);
        }
    }

    public final void a(String str, String str2) {
        boolean zEquals = TextUtils.equals(str2, "1");
        e4.b(this.f30159a, zEquals);
        HwLog.i("HwWatchFaceEntranceManager", "getAndSaveTopWatchface isBihHotTest：" + zEquals);
        GetWatchFaceThread getWatchFaceThread = new GetWatchFaceThread(zEquals, c());
        WatchFaceListBean watchFaceListBeanB = getWatchFaceThread.b(getWatchFaceThread.c(str));
        if (watchFaceListBeanB == null) {
            HwLog.w("HwWatchFaceEntranceManager", "getAndSaveTopWatchface() getWatchFaceThread fail.");
        } else {
            b(watchFaceListBeanB);
        }
    }

    public final /* synthetic */ void a(WatchFaceListBean watchFaceListBean) {
        HwLog.i("HwWatchFaceEntranceManager", "sendGetWatchFaceBroadcast() enter.");
        Intent intent = new Intent();
        intent.setAction("com.huawei.watchface.action.ACTION_WATCHFACE_LIST");
        intent.setPackage(Environment.b());
        intent.putExtra("watchFaceBeanList", watchFaceListBean);
        Context context = this.f30159a;
        if (context != null) {
            HwWatchFaceApi.getInstance(context).sendLocalBroadcast(intent);
        }
    }
}
