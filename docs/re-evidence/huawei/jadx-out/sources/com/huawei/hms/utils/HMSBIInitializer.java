package com.huawei.hms.utils;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.framework.network.grs.IQueryUrlCallBack;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.huawei.hms.stats.HianalyticsExist;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class HMSBIInitializer {
    private static final Object d = new Object();
    private static HMSBIInitializer e;
    private static HiAnalyticsInstance f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicBoolean f16892b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f16893c = HianalyticsExist.isHianalyticsExist();

    class a implements IQueryUrlCallBack {
        a() {
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackFail(int i) {
            HMSLog.e("HMSBIInitializer", "get grs failed, the errorcode is " + i);
            HMSBIInitializer.this.f16892b.set(false);
            com.huawei.hms.stats.a.c().a();
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackSuccess(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    if (HMSBIInitializer.this.f16893c) {
                        HMSBIInitializer.this.a(str);
                    } else {
                        HmsHiAnalyticsUtils.init(HMSBIInitializer.this.f16891a, false, false, false, str, "com.huawei.hwid");
                    }
                    HMSLog.i("HMSBIInitializer", "BI URL acquired successfully");
                } catch (Throwable th) {
                    HMSLog.e("HMSBIInitializer", "HA Init error, message : " + th.getMessage());
                }
            }
            HMSBIInitializer.this.f16892b.set(false);
            com.huawei.hms.stats.a.c().b();
        }
    }

    class b extends AsyncTask<String, Integer, Void> {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            HMSBIInitializer.this.b(strArr[0]);
            return null;
        }

        /* synthetic */ b(HMSBIInitializer hMSBIInitializer, a aVar) {
            this();
        }
    }

    private HMSBIInitializer(Context context) {
        this.f16891a = context;
    }

    public static HMSBIInitializer getInstance(Context context) {
        synchronized (d) {
            if (e == null && context != null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    e = new HMSBIInitializer(applicationContext);
                } else {
                    e = new HMSBIInitializer(context);
                }
            }
        }
        return e;
    }

    public HiAnalyticsInstance getAnalyticsInstance() {
        return f;
    }

    public void initBI() {
        boolean initFlag = !this.f16893c ? HmsHiAnalyticsUtils.getInitFlag() : HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
        HMSLog.i("HMSBIInitializer", "Builder->biInitFlag :" + initFlag);
        if (initFlag || AnalyticsSwitchHolder.isAnalyticsDisabled(this.f16891a)) {
            return;
        }
        HMSLog.i("HMSBIInitializer", "Builder->biInitFlag : start initHaSDK");
        initHaSDK();
    }

    protected void initHaSDK() {
        if (this.f16892b.compareAndSet(false, true)) {
            String issueCountryCode = GrsApp.getInstance().getIssueCountryCode(this.f16891a);
            if (!TextUtils.isEmpty(issueCountryCode)) {
                issueCountryCode = issueCountryCode.toUpperCase(Locale.ENGLISH);
            }
            if (!"UNKNOWN".equalsIgnoreCase(issueCountryCode) && !TextUtils.isEmpty(issueCountryCode)) {
                new b(this, null).execute(issueCountryCode);
            } else {
                HMSLog.e("HMSBIInitializer", "Failed to get device issue country");
                this.f16892b.set(false);
            }
        }
    }

    public boolean isInit() {
        return !this.f16893c ? HmsHiAnalyticsUtils.getInitFlag() : HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag(HiAnalyticsConstant.HA_SERVICE_TAG);
        f = instanceByTag;
        if (instanceByTag != null) {
            instanceByTag.setAppid("com.huawei.hwid");
            return;
        }
        HiAnalyticsConfig hiAnalyticsConfigBuild = new HiAnalyticsConfig.Builder().setEnableImei(false).setEnableUDID(false).setEnableSN(false).setCollectURL(str).build();
        HiAnalyticsInstance hiAnalyticsInstanceCreate = new HiAnalyticsInstance.Builder(this.f16891a).setOperConf(hiAnalyticsConfigBuild).setMaintConf(new HiAnalyticsConfig.Builder().setEnableImei(false).setEnableUDID(false).setEnableSN(false).setCollectURL(str).build()).create(HiAnalyticsConstant.HA_SERVICE_TAG);
        f = hiAnalyticsInstanceCreate;
        if (hiAnalyticsInstanceCreate != null) {
            hiAnalyticsInstanceCreate.setAppid("com.huawei.hwid");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        HMSLog.i("HMSBIInitializer", "Start to query GRS");
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setIssueCountry(str);
        new GrsClient(this.f16891a, grsBaseInfo).ayncGetGrsUrl("com.huawei.cloud.opensdkhianalytics", "ROOTV2", new a());
    }
}
