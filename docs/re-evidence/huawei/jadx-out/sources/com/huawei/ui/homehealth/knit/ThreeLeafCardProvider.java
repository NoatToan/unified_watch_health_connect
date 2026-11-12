package com.huawei.ui.homehealth.knit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.health.healthmodel.bean.HealthLifeStatistic;
import com.huawei.health.healthmodel.bean.HealthLifeTaskBean;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.stepscard.AchieveTaskHandler;
import com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity;
import com.huawei.watchface.api.HwWatchFaceApi;
import defpackage.ddv;
import defpackage.ezi;
import defpackage.ffe;
import defpackage.fft;
import defpackage.ffv;
import defpackage.fsb;
import defpackage.grv;
import defpackage.iov;
import defpackage.iyg;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.lua;
import defpackage.njy;
import defpackage.qhq;
import defpackage.qqf;
import defpackage.qqt;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrf;
import defpackage.qri;
import defpackage.tdr;
import defpackage.tdy;
import defpackage.tuv;
import defpackage.uye;
import defpackage.wvb;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes17.dex */
public class ThreeLeafCardProvider extends ModelBaseCardProvider {
    private boolean aa;
    private int ab;
    private View.OnClickListener ac;
    private d ad;
    private int ag;
    private int[] ah;
    private int ai;
    private boolean i;
    View.OnClickListener j;
    private int k;
    private int l;
    private final Context m;
    private String o;
    private final boolean q;
    private boolean r;
    private boolean s;
    private List<HealthLifeTaskBean> t;
    private boolean u;
    private float[] v;
    private final boolean w;
    private boolean x;
    private boolean y;
    private List<Integer> z;
    private final BroadcastReceiver n = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.knit.ThreeLeafCardProvider.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !HwWatchFaceApi.ACTION_FOREGROUND_STATUS.equals(intent.getAction())) {
                LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "mForegroundStatusChangeReceiver onReceive intent ", intent);
                return;
            }
            boolean z = false;
            boolean booleanExtra = intent.getBooleanExtra("isForeground", false);
            LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "mForegroundStatusChangeReceiver onReceive isForeground ", Boolean.valueOf(booleanExtra));
            if (booleanExtra) {
                ezi.c((Handler) null, 0);
                if ("threeLeafCard".equals(fsb.b())) {
                    LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "mForegroundStatusChangeReceiver onReceive getTopActivity ", BaseApplication.j());
                    ThreeLeafCardProvider threeLeafCardProvider = ThreeLeafCardProvider.this;
                    if (CommonUtil.i(threeLeafCardProvider.m, "com.huawei.health.MainActivity") && ThreeLeafCardProvider.this.s) {
                        z = true;
                    }
                    threeLeafCardProvider.y = z;
                }
            }
        }
    };
    private final AtomicBoolean p = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(float f, float f2, float f3) {
        return f >= 1.0f && f3 >= 1.0f && f2 >= 1.0f;
    }

    public ThreeLeafCardProvider(Context context, AchieveTaskHandler achieveTaskHandler) {
        Context contextB = BaseApplication.b();
        this.m = contextB;
        this.i = true;
        this.v = new float[3];
        this.ah = new int[]{0, 0, -1, -1};
        this.k = 2;
        this.r = true;
        this.w = LanguageUtil.ba(contextB);
        this.q = LanguageUtil.f(contextB);
        this.ac = new View.OnClickListener() { // from class: com.huawei.ui.homehealth.knit.ThreeLeafCardProvider.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (njy.e(ThreeLeafCardProvider.this.t)) {
                    LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "params is null");
                    return;
                }
                ThreeLeafCardProvider threeLeafCardProvider = ThreeLeafCardProvider.this;
                List listF = threeLeafCardProvider.f((List<HealthLifeTaskBean>) threeLeafCardProvider.t);
                LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "refreshUiWithAnimation size:", Integer.valueOf(listF.size()));
                float fC = ffv.c((List<HealthLifeBean>) listF, 1);
                float fC2 = ffv.c((List<HealthLifeBean>) listF, 2);
                float fC3 = ffv.c((List<HealthLifeBean>) listF, 3);
                boolean zB = ffv.b((List<HealthLifeBean>) listF, fC, fC3, fC2);
                boolean zE = ThreeLeafCardProvider.this.e(fC, fC2, fC3);
                ReleaseLogUtil.d("HL_SCUI_ThreeLeafCardProvider", "refreshUiWithAnimation isSame top:", Float.valueOf(fC), " right:", Float.valueOf(fC2), " left:", Float.valueOf(fC3), " isPerfect:", Boolean.valueOf(zB), " isVibrancy:", Boolean.valueOf(zE));
                ThreeLeafCardProvider.this.u = zB;
                ThreeLeafCardProvider.this.v[0] = fC;
                ThreeLeafCardProvider.this.v[1] = fC3;
                ThreeLeafCardProvider.this.v[2] = fC2;
                if (zB) {
                    lua.a(fft.f34005c, "perfect_three_leaf", System.currentTimeMillis());
                }
                ThreeLeafCardProvider.this.a(zE, zB);
            }
        };
        this.j = new View.OnClickListener() { // from class: com.huawei.ui.homehealth.knit.ThreeLeafCardProvider.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ThreeLeafCardProvider.this.e();
                ThreeLeafCardProvider threeLeafCardProvider = ThreeLeafCardProvider.this;
                threeLeafCardProvider.k = ffv.b((List<HealthLifeBean>) threeLeafCardProvider.f((List<HealthLifeTaskBean>) threeLeafCardProvider.t), 1);
                ThreeLeafCardProvider threeLeafCardProvider2 = ThreeLeafCardProvider.this;
                threeLeafCardProvider2.d(threeLeafCardProvider2.k);
                ThreeLeafCardProvider threeLeafCardProvider3 = ThreeLeafCardProvider.this;
                threeLeafCardProvider3.a(threeLeafCardProvider3.ah);
                if (njy.e(ThreeLeafCardProvider.this.t)) {
                    LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "refreshUiForVisible mHealthLifeTaskList ", ThreeLeafCardProvider.this.t);
                    return;
                }
                ThreeLeafCardProvider threeLeafCardProvider4 = ThreeLeafCardProvider.this;
                List listF = threeLeafCardProvider4.f((List<HealthLifeTaskBean>) threeLeafCardProvider4.t);
                LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "refreshUiForVisible list ", listF);
                float fC = ffv.c((List<HealthLifeBean>) listF, 1);
                float fC2 = ffv.c((List<HealthLifeBean>) listF, 2);
                float fC3 = ffv.c((List<HealthLifeBean>) listF, 3);
                ReleaseLogUtil.d("HL_SCUI_ThreeLeafCardProvider", "refreshUiForVisible top:", Float.valueOf(fC), " right:", Float.valueOf(fC2), " left:", Float.valueOf(fC3), " isPerfect:", Boolean.valueOf(ffv.b((List<HealthLifeBean>) listF, fC, fC3, fC2)));
                ThreeLeafCardProvider.this.v[0] = fC;
                ThreeLeafCardProvider.this.v[1] = fC3;
                ThreeLeafCardProvider.this.v[2] = fC2;
                ThreeLeafCardProvider.this.f.put("SHOW_CLOVER_WITHOUT_ANIMATION", true);
                ThreeLeafCardProvider.this.f();
            }
        };
        this.f25608c = context;
    }

    @Override // com.huawei.ui.homehealth.knit.ModelBaseCardProvider
    protected void c() {
        super.c();
        this.f.put("HEALTH_LIFE_TASK", this.t);
        this.f.put("THREE_LEAF_DATA", this.ah);
        this.f.put("SPORT_TASK_ID", Integer.valueOf(this.k));
        this.f.put("LAST_THREE_LEAF_RATIO", this.v);
        this.f.put("LAST_IS_PERFECT", Boolean.valueOf(this.u));
        this.f.put("SHOW_MAIN_HOME_PAGE_SLEEP", this.f25608c.getResources().getString(R.string.IDS_hw_show_main_home_page_sleep));
        this.f.put("HEALTH_SHOW_HEALTH_DATA_INPUT", this.f25608c.getResources().getString(R.string.IDS_hw_health_show_healthdata_input));
        this.f.put("REFRESH_UI_WITH_ANIMATION", this.ac);
        this.f.put("REFRESH_UI_FOR_VISIBLE", this.j);
        this.f.put("CLICK_SLEEP_AREA_LISTENER", new View.OnClickListener() { // from class: com.huawei.ui.homehealth.knit.ThreeLeafCardProvider.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ThreeLeafCardProvider.this.n();
            }
        });
        this.f.put("CLICK_STEP_AREA_LISTENER", new View.OnClickListener() { // from class: com.huawei.ui.homehealth.knit.ThreeLeafCardProvider.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ThreeLeafCardProvider.this.m();
            }
        });
        this.f.put("CLICK_MOOD_AREA_LISTENER", new View.OnClickListener() { // from class: com.huawei.ui.homehealth.knit.ThreeLeafCardProvider.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ThreeLeafCardProvider.this.l();
            }
        });
        this.f.put("JUMP_TO_HEALTH_MODEL_LISTENER", new View.OnClickListener() { // from class: com.huawei.ui.homehealth.knit.ThreeLeafCardProvider.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ThreeLeafCardProvider.this.y = false;
            }
        });
        this.f.put("CONFIGURATION_CHANGED", new View.OnClickListener() { // from class: com.huawei.ui.homehealth.knit.ThreeLeafCardProvider.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ThreeLeafCardProvider.this.t = new ArrayList();
                ThreeLeafCardProvider.this.ah = new int[]{0, 0, -1, -1};
            }
        });
    }

    public void c(String str) {
        if ("900200006".equals(str) || "900200008".equals(str)) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            ffv.d(arrayList, (ResponseCallback<List<HealthLifeBean>>) new ResponseCallback() { // from class: sqt
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "threeCircleAndStepGoalUpdate onResponse status ", Integer.valueOf(i), " list ", (List) obj);
                }
            });
        }
    }

    static class a implements HiSubscribeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<ThreeLeafCardProvider> f25650c;

        a(ThreeLeafCardProvider threeLeafCardProvider) {
            this.f25650c = new WeakReference<>(threeLeafCardProvider);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            if (list != null && list2 != null && this.f25650c.get() != null) {
                this.f25650c.get().z = list;
                LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "onResult:", Integer.valueOf(list.size()), " failList:", Integer.valueOf(list2.size()));
                return;
            }
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "onResult list null.");
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            ThreeLeafCardProvider threeLeafCardProvider = this.f25650c.get();
            if (threeLeafCardProvider == null) {
                return;
            }
            if (i == 103) {
                LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "switch state changed,", str);
                if ("900300020".equals(str)) {
                    threeLeafCardProvider.r();
                    return;
                }
                return;
            }
            if (ArkUIXConstants.INSERT.equals(str) || "latestDataDownload".equals(str)) {
                threeLeafCardProvider.o = str;
                if (i == DicDataTypeUtil.DataType.BREATH_TRAIN_SET.value() || i == 2 || i == 3 || i == DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD.value() || i == HiSubscribeType.f12261c || i == 14 || i == 200 || i == HiSubscribeType.f12259a) {
                    LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "onChange type:", Integer.valueOf(i), " time:", Long.valueOf(j), " changeKey:", str);
                    if (threeLeafCardProvider.j(i)) {
                        threeLeafCardProvider.h(1);
                        return;
                    }
                    return;
                }
                LogUtil.d("HL_SCUI_ThreeLeafCardProvider", "observerType other type");
                return;
            }
            LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "sync from cloud.", Integer.valueOf(i), " changeKey:", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "getAnimationSwitch");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900300020");
        qhq.b(MatterDataContans.TYPE_HEALTH, arrayList, new HiDataReadResultListener() { // from class: com.huawei.ui.homehealth.knit.ThreeLeafCardProvider.7
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d("HL_SCUI_ThreeLeafCardProvider", "onResult errorCode: ", Integer.valueOf(i), ", data: ", obj);
                if (!njy.b(obj, HiSampleConfig.class)) {
                    LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "list getAnimationSwitch isListTypeMatch false ");
                    ffv.c("healthLifeThreeLeafSwitch", true);
                    return;
                }
                List list = (List) obj;
                if (njy.e(list) || list.size() != 1) {
                    LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "list getAnimationSwitch list is empty ");
                    ffv.c("healthLifeThreeLeafSwitch", true);
                } else {
                    HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(0);
                    LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "animation switch is ", hiSampleConfig.getConfigData());
                    ffv.c("healthLifeThreeLeafSwitch", "1".equals(ffv.a(hiSampleConfig.getConfigData(), "healthLifeThreeLeafSwitch")));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j(int i) {
        boolean z = i == HiSubscribeType.f12261c;
        boolean z2 = i == HiSubscribeType.f12259a;
        if (njy.e(this.t) || !(z || z2)) {
            return true;
        }
        for (HealthLifeTaskBean healthLifeTaskBean : this.t) {
            if (healthLifeTaskBean != null && healthLifeTaskBean.getComplete() <= 0) {
                int id = healthLifeTaskBean.getId();
                if (z && id == 12) {
                    return true;
                }
                if (z2 && id == 14) {
                    return true;
                }
            }
        }
        return false;
    }

    static class d extends BroadcastReceiver {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<ThreeLeafCardProvider> f25653c;

        d(ThreeLeafCardProvider threeLeafCardProvider) {
            this.f25653c = new WeakReference<>(threeLeafCardProvider);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "SyncCloudDataReceiver onReceive intent is null or context is null");
                return;
            }
            ThreeLeafCardProvider threeLeafCardProvider = this.f25653c.get();
            if (threeLeafCardProvider == null) {
                LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "SyncCloudDataReceiver onReceive cardData is null");
                return;
            }
            String stringExtra = intent.getStringExtra("sync_cloud_data_status");
            if (stringExtra == null) {
                LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "SyncCloudDataReceiver onReceive status is null");
            }
            LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "Sync status:", stringExtra, " process:", Double.valueOf(intent.getDoubleExtra("sync_cloud_data_process", 0.0d)));
            threeLeafCardProvider.p.set("ongoing_sync_cloud_data".equals(stringExtra));
            if ("sync_cloud_data_backstage".equals(stringExtra)) {
                threeLeafCardProvider.r();
            }
            if ("sync_cloud_data_finish".equals(stringExtra) || "sync_cloud_data_fail".equals(stringExtra) || "sync_cloud_data_setting_flag".equals(stringExtra)) {
                threeLeafCardProvider.h(1);
                threeLeafCardProvider.r();
            }
        }
    }

    @Override // com.huawei.ui.homehealth.knit.ModelBaseCardProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        super.b(context, sectionBean);
        if (this.r) {
            e();
            this.y = "threeLeafCard".equals(fsb.b());
            this.x = UnitUtil.f();
            c(new a(this));
            y();
            w();
            BroadcastManager.d(this.n);
            this.ag = DateFormatUtil.a(System.currentTimeMillis(), TimeZone.getDefault());
            iyg.e();
            j();
            t();
            f();
            this.r = false;
        }
        k();
    }

    private void w() {
        ObserverManagerUtil.d(new e(this), "HEALTH_MODEL_CARD_KEY_NEW");
    }

    static class e implements Observer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<ThreeLeafCardProvider> f25654a;

        e(ThreeLeafCardProvider threeLeafCardProvider) {
            this.f25654a = new WeakReference<>(threeLeafCardProvider);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            ThreeLeafCardProvider threeLeafCardProvider = this.f25654a.get();
            if (threeLeafCardProvider == null) {
                LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "card is null");
            } else {
                LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "three leaf small card has shown");
                threeLeafCardProvider.h(1);
            }
        }
    }

    public void k() {
        LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "refreshCardData");
        h(1);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        if (this.i) {
            this.i = false;
        } else {
            k();
        }
        ReleaseLogUtil.d("HL_SCUI_ThreeLeafCardProvider", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void y() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("sync_cloud_data_action");
        d dVar = new d(this);
        this.ad = dVar;
        BroadcastManagerUtil.e(this.m, dVar, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(final int i) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: sqq
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c(i);
            }
        });
    }

    public /* synthetic */ void c(int i) {
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        ffv.b(iA, new c(this, i));
        ReleaseLogUtil.d("R_HL_SCUI_ThreeLeafCardProvider", "refreshData dayFormat ", Integer.valueOf(iA), " type ", Integer.valueOf(i));
    }

    static class c implements ResponseCallback<List<HealthLifeTaskBean>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<ThreeLeafCardProvider> f25652b;
        private int e;

        c(ThreeLeafCardProvider threeLeafCardProvider, int i) {
            this.f25652b = new WeakReference<>(threeLeafCardProvider);
            this.e = i;
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<HealthLifeTaskBean> list) {
            WeakReference<ThreeLeafCardProvider> weakReference = this.f25652b;
            if (weakReference == null) {
                LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "GetHealthLifeRecordsCallback onResponse mCardDataReference is null");
                return;
            }
            ThreeLeafCardProvider threeLeafCardProvider = weakReference.get();
            if (threeLeafCardProvider != null) {
                threeLeafCardProvider.t = list;
                threeLeafCardProvider.e(this.e, threeLeafCardProvider.f(list));
            } else {
                LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "GetHealthLifeRecordsCallback onResponse cardData is null");
            }
        }
    }

    public static class b implements ResponseCallback<ffe> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<HealthLifeTaskBean> f25651b;
        private WeakReference<ThreeLeafCardProvider> d;

        b(ThreeLeafCardProvider threeLeafCardProvider, List<HealthLifeTaskBean> list) {
            this.d = new WeakReference<>(threeLeafCardProvider);
            this.f25651b = list;
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, final ffe ffeVar) {
            final ThreeLeafCardProvider threeLeafCardProvider = this.d.get();
            if (threeLeafCardProvider == null) {
                LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "threeLeafCardData is null");
            } else {
                HandlerExecutor.c(new Runnable() { // from class: sqz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f48551c.d(threeLeafCardProvider, ffeVar);
                    }
                });
            }
        }

        public /* synthetic */ void d(ThreeLeafCardProvider threeLeafCardProvider, ffe ffeVar) {
            LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "update message");
            threeLeafCardProvider.e(this.f25651b, ffeVar);
            ffv.d((List<HealthLifeBean>) threeLeafCardProvider.f(this.f25651b));
            ObserverManagerUtil.e("HEALTH_LIFE_DAY_RECORD", this.f25651b);
        }
    }

    private void n(List<HealthLifeTaskBean> list) {
        if (!this.p.get() || "latestDataDownload".equals(this.o)) {
            g(list);
            boolean zH = BaseApplication.h();
            LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "sendDayRecord mIsHomeFragmentVisible:", Boolean.valueOf(this.s), " isRunningForeground:", Boolean.valueOf(zH));
            if ("threeLeafCard".equals(fsb.b()) && zH && this.s) {
                if (njy.b(a(list))) {
                    LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "current day has complete tasks");
                    l(list);
                    return;
                } else {
                    LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "current day do not have complete tasks");
                    e(list, (ffe) null);
                    ffv.d(f(list));
                    ObserverManagerUtil.e("HEALTH_LIFE_DAY_RECORD", list);
                    return;
                }
            }
            ObserverManagerUtil.e("HEALTH_LIFE_DAY_RECORD", list);
        }
    }

    private void l(final List<HealthLifeTaskBean> list) {
        if (!HandlerExecutor.d()) {
            ffv.c(this.ag, new b(this, list));
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: sqn
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c(list);
                }
            });
        }
    }

    public /* synthetic */ void c(List list) {
        ffv.c(this.ag, new b(this, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<HealthLifeTaskBean> list, ffe ffeVar) {
        final ArrayList arrayList = new ArrayList();
        tdr tdrVarA = a(list, ffeVar);
        if (tdrVarA != null) {
            arrayList.add(tdrVarA);
        } else {
            tdr tdrVarE = e(list);
            if (tdrVarE != null) {
                arrayList.add(tdrVarE);
            }
        }
        tdr tdrVarI = i(list);
        if (tdrVarI != null) {
            arrayList.add(tdrVarI);
        }
        if (njy.b(arrayList)) {
            HandlerExecutor.c(new Runnable() { // from class: sqy
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d(arrayList);
                }
            }, this.i ? 2000L : 0L);
        }
    }

    public /* synthetic */ void d(List list) {
        e();
        this.f.put("SET_MESSAGE_LIST", list);
        f();
    }

    private tdr a(List<HealthLifeTaskBean> list, ffe ffeVar) {
        if (ffeVar == null || njy.e(ffeVar.d()) || njy.e(list)) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "there is no cons info");
            return null;
        }
        ffv.b(list, ffeVar);
        a(ffeVar, list);
        List<HealthLifeTaskBean> listH = h(list);
        if (njy.e(listH)) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "there is no just-complete tasks");
            return null;
        }
        LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "getConsCompleteMessage, diffList is ", listH, " data is ", ffeVar.toString());
        return b(listH, ffeVar);
    }

    private void a(ffe ffeVar, List<HealthLifeTaskBean> list) {
        List<HealthLifeStatistic> listD = ffeVar.d();
        List<HealthLifeTaskBean> listD2 = d(a(list), listD);
        if (njy.e(listD2)) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "small card no difflist");
            return;
        }
        HealthLifeTaskBean healthLifeTaskBean = listD2.get(qrf.d(listD2.size()));
        if (healthLifeTaskBean == null) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "getCompleteMessage bean is null");
            return;
        }
        healthLifeTaskBean.getHealthLifeBean().setContinueDays(e(healthLifeTaskBean, listD));
        LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "notifySmallCardConsMessage, bean is ", healthLifeTaskBean.toString());
        ObserverManagerUtil.e("HEALTH_LIFE_CONS_INFO", healthLifeTaskBean, ffv.b(listD2), Integer.valueOf(ffeVar.c()), b(healthLifeTaskBean.getId(), 1, listD2.size() == 1 ? 1 : 2, healthLifeTaskBean, 2));
    }

    private List<HealthLifeTaskBean> d(List<HealthLifeTaskBean> list, List<HealthLifeStatistic> list2) {
        List<Integer> listC = ffv.c(this.ag);
        ArrayList arrayList = new ArrayList();
        LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "shown ids ", listC);
        if (njy.e(list)) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "completeList is empty");
            return arrayList;
        }
        LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "completeList is ", list.toString(), " consInfo is ", list2.toString());
        for (HealthLifeTaskBean healthLifeTaskBean : list) {
            if (!listC.contains(Integer.valueOf(healthLifeTaskBean.getId()))) {
                for (HealthLifeStatistic healthLifeStatistic : list2) {
                    if (healthLifeStatistic.getId() == healthLifeTaskBean.getId() && healthLifeStatistic.getConDays() >= 2) {
                        arrayList.add(healthLifeTaskBean);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<HealthLifeTaskBean> d(List<HealthLifeTaskBean> list, ffe ffeVar) {
        if (njy.e(list) || ffeVar == null || njy.e(ffeVar.d())) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "nothing to fliter for big three leaf card");
            return null;
        }
        List<HealthLifeStatistic> listD = ffeVar.d();
        ArrayList arrayList = new ArrayList();
        for (HealthLifeStatistic healthLifeStatistic : listD) {
            if (healthLifeStatistic.getConDays() >= 2) {
                for (HealthLifeTaskBean healthLifeTaskBean : list) {
                    if (healthLifeTaskBean.getId() == healthLifeStatistic.getId()) {
                        arrayList.add(healthLifeTaskBean);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private tdr b(List<HealthLifeTaskBean> list, ffe ffeVar) {
        List<HealthLifeTaskBean> listD = d(list, ffeVar);
        tdr tdrVarD = null;
        if (njy.e(listD)) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "no diffCons");
            return null;
        }
        int size = listD.size();
        HealthLifeTaskBean healthLifeTaskBean = listD.get(qrf.d(size));
        if (healthLifeTaskBean == null) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "getConsCompleteMessage bean is null");
            return null;
        }
        int size2 = list.size();
        List<HealthLifeStatistic> listD2 = ffeVar.d();
        String name = healthLifeTaskBean.getName();
        if (healthLifeTaskBean.getId() == 12) {
            name = qre.f(R.string.IDS_bp_measurement_for_cons);
        }
        healthLifeTaskBean.getHealthLifeBean().setContinueDays(e(healthLifeTaskBean, listD2));
        LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "current bean is ", healthLifeTaskBean.toString());
        if (size2 == 1) {
            if (size == 1) {
                tdrVarD = b(listD2, healthLifeTaskBean, name, ffeVar.c());
            }
        } else if (size == size2) {
            tdrVarD = d(healthLifeTaskBean, size, name);
        } else if (size != 0) {
            if (!this.aa) {
                LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "already in three leaf card");
                tdrVarD = d(healthLifeTaskBean, size, name);
            } else {
                LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "just from three circle card");
            }
        }
        LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "getConsCompleteMessage diffCompleteCount ", Integer.valueOf(size2), " id  ", Integer.valueOf(healthLifeTaskBean.getId()), " message is :", tdrVarD);
        return tdrVarD;
    }

    private tdr d(HealthLifeTaskBean healthLifeTaskBean, int i, String str) {
        tdr tdrVarB = b(healthLifeTaskBean, 2);
        if (LanguageUtil.f(this.m)) {
            a(tdrVarB, qre.e(R.plurals.IDS_multi_task_cons_info, i, UnitUtil.e(i, 1, 0)));
            c(tdrVarB, str, str, healthLifeTaskBean.getColorResourcesId());
            return tdrVarB;
        }
        String strE = qre.e(R.plurals.IDS_multi_tasks_complte, i, UnitUtil.e(i, 1, 0));
        c(tdrVarB, strE, strE, R.color.textColorPrimary);
        return tdrVarB;
    }

    private tdr b(List<HealthLifeStatistic> list, HealthLifeTaskBean healthLifeTaskBean, String str, int i) {
        tdr tdrVarB = b(healthLifeTaskBean, 1);
        int iE = e(healthLifeTaskBean, list);
        if (iE > i) {
            a(tdrVarB, qre.e(R.plurals.IDS_over_max_cons_complte_tips, i, UnitUtil.e(iE, 1, 0)));
        } else {
            a(tdrVarB, qre.e(R.plurals.IDS_single_task_cons_info, iE, UnitUtil.e(iE, 1, 0)));
        }
        c(tdrVarB, str, str, healthLifeTaskBean.getColorResourcesId());
        return tdrVarB;
    }

    private int e(HealthLifeTaskBean healthLifeTaskBean, List<HealthLifeStatistic> list) {
        for (HealthLifeStatistic healthLifeStatistic : list) {
            if (healthLifeTaskBean.getId() == healthLifeStatistic.getId()) {
                return healthLifeStatistic.getConDays();
            }
        }
        return 0;
    }

    private tdr b(final HealthLifeTaskBean healthLifeTaskBean, final int i) {
        tdr tdrVar = new tdr();
        tdrVar.e(healthLifeTaskBean.getBackgroundColorResourcesId());
        tdrVar.d(R.dimen.textSizeBody2);
        Drawable drawable = ContextCompat.getDrawable(this.m, healthLifeTaskBean.getIconId());
        if (this.w) {
            drawable = qqz.e(this.m, drawable);
        }
        tdrVar.e(drawable);
        tdrVar.c(AnalyticsValue.HEALTH_LIFE_TASK_COMPLETE_2119097.value());
        final int id = healthLifeTaskBean.getId();
        tdrVar.d(b(id, 0, i, healthLifeTaskBean, 1));
        tdrVar.e(new View.OnClickListener() { // from class: sqr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48533c.d(id, i, healthLifeTaskBean, view);
            }
        });
        return tdrVar;
    }

    public /* synthetic */ void d(int i, int i2, HealthLifeTaskBean healthLifeTaskBean, View view) {
        this.y = false;
        lmf.d().c(this.m, AnalyticsValue.HEALTH_LIFE_TASK_COMPLETE_2119097.value(), b(i, 1, i2, healthLifeTaskBean, 1), 0);
        ffv.a(this.f25608c, Uri.parse("").buildUpon().appendQueryParameter("from", "cloverLifeTaskComplete").build());
    }

    private tdr e(List<HealthLifeTaskBean> list) {
        tdr tdrVarB;
        List<HealthLifeTaskBean> listH = h(list);
        if (njy.e(listH)) {
            return null;
        }
        int size = listH.size();
        HealthLifeTaskBean healthLifeTaskBean = listH.get(qrf.d(size));
        if (healthLifeTaskBean == null) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "getCompleteMessage bean is null");
            return null;
        }
        new tdr();
        String name = healthLifeTaskBean.getName();
        if (size == 1) {
            tdrVarB = b(healthLifeTaskBean, 1);
            a(tdrVarB, qre.f(R.string.IDS_life_task_complete));
            c(tdrVarB, name, name, healthLifeTaskBean.getColorResourcesId());
        } else {
            tdr tdrVarB2 = b(healthLifeTaskBean, 2);
            String strE = UnitUtil.e(size, 1, 0);
            if (this.q) {
                c(tdrVarB2, qre.e(R.plurals.IDS_life_task_complete_more_chinese, size, name, strE), name, healthLifeTaskBean.getColorResourcesId());
            } else {
                SpannableString spannableString = new SpannableString(qre.e(R.plurals.IDS_life_task_complete_more, size, strE));
                qri.b(spannableString, spannableString.toString(), R.color.textColorPrimary);
                qri.e(spannableString, spannableString.toString(), R.string.textFontFamilyRegular);
                tdrVarB2.c(spannableString);
            }
            tdrVarB = tdrVarB2;
        }
        LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "getCompleteMessage diffCompleteCount ", Integer.valueOf(listH.size()), " task  ", tdrVarB.a());
        return tdrVarB;
    }

    private void a(tdr tdrVar, String str) {
        SpannableString spannableString = new SpannableString(str);
        qri.b(spannableString, spannableString.toString(), R.color.textColorPrimary);
        qri.e(spannableString, spannableString.toString(), R.string.textFontFamilyRegular);
        tdrVar.a(spannableString);
    }

    private void c(tdr tdrVar, String str, String str2, int i) {
        SpannableString spannableString = new SpannableString(str);
        qri.b(spannableString, spannableString.toString(), R.color.textColorPrimary);
        qri.e(spannableString, spannableString.toString(), R.string.textFontFamilyRegular);
        qri.b(spannableString, str2, i);
        qri.e(spannableString, str2, R.string.textFontFamilyMedium);
        tdrVar.c(spannableString);
    }

    private List<HealthLifeTaskBean> h(List<HealthLifeTaskBean> list) {
        List<HealthLifeTaskBean> listA = a(list);
        if (njy.e(listA)) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "completeList is empty");
            return null;
        }
        List<HealthLifeTaskBean> listA2 = a(ffv.h());
        int size = listA.size();
        int size2 = listA2.size();
        LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "getCompleteMessage completeCount ", Integer.valueOf(size), " lastCompleteCount ", Integer.valueOf(size2));
        if (size <= size2) {
            return null;
        }
        HashMap map = new HashMap();
        for (HealthLifeTaskBean healthLifeTaskBean : listA2) {
            if (healthLifeTaskBean != null) {
                map.put(Integer.valueOf(healthLifeTaskBean.getId()), healthLifeTaskBean);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (HealthLifeTaskBean healthLifeTaskBean2 : listA) {
            if (healthLifeTaskBean2 != null && !map.containsKey(Integer.valueOf(healthLifeTaskBean2.getId()))) {
                arrayList.add(healthLifeTaskBean2);
            }
        }
        return arrayList;
    }

    private tdr i(List<HealthLifeTaskBean> list) {
        HealthLifeTaskBean next;
        if (njy.e(list) || !this.y) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "getReminderMessage list ", list, " mIsSupportShowReminder ", Boolean.valueOf(this.y));
            return null;
        }
        this.y = false;
        Pair<Integer, String> pairA = ffv.a(f(j(list)));
        if (pairA == null) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "getReminderMessage pair is null");
            return null;
        }
        Integer num = pairA.first;
        int iIntValue = num.intValue();
        String str = pairA.second;
        LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "getReminderMessage id ", num, " tip ", str);
        if (iIntValue <= 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator<HealthLifeTaskBean> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next != null && next.getId() == iIntValue) {
                break;
            }
        }
        if (next == null) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "getReminderMessage bean is null");
            return null;
        }
        return a(next, str, iIntValue);
    }

    private tdr a(HealthLifeTaskBean healthLifeTaskBean, String str, final int i) {
        tdr tdrVar = new tdr();
        tdrVar.e(healthLifeTaskBean.getBackgroundColorResourcesId());
        tdrVar.d(R.dimen.textSizeBody2);
        Drawable drawable = ContextCompat.getDrawable(this.m, healthLifeTaskBean.getIconId());
        if (this.w) {
            drawable = qqz.e(this.m, drawable);
        }
        tdrVar.e(drawable);
        SpannableString spannableString = new SpannableString(str);
        qri.b(spannableString, spannableString.toString(), R.color.textColorPrimary);
        qri.e(spannableString, spannableString.toString(), R.string.textFontFamilyRegular);
        tdrVar.c(spannableString);
        Drawable drawable2 = ContextCompat.getDrawable(this.m, R.drawable.arrow_right);
        if (drawable2 != null) {
            drawable2 = qqf.c(drawable2, ContextCompat.getColor(this.m, R.color.colorPrimary));
        }
        if (this.w) {
            drawable2 = qqz.e(this.m, drawable2);
        }
        tdrVar.d(drawable2);
        tdrVar.c(AnalyticsValue.HEALTH_LIFE_TASK_REMINDER_2119096.value());
        tdrVar.d(a(i, 0));
        tdrVar.e(new View.OnClickListener() { // from class: squ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(i, view);
            }
        });
        return tdrVar;
    }

    public /* synthetic */ void d(int i, View view) {
        lmf.d().c(this.m, AnalyticsValue.HEALTH_LIFE_TASK_REMINDER_2119096.value(), a(i, 1), 0);
        if (i == 5) {
            l();
        } else if (i == 6) {
            n();
        } else {
            this.y = false;
            ffv.a(this.f25608c, Uri.parse("").buildUpon().appendQueryParameter("id", String.valueOf(i)).appendQueryParameter("from", "cloverLifeTaskReminder").build());
        }
    }

    private List<HealthLifeTaskBean> a(List<HealthLifeTaskBean> list) {
        if (njy.e(list)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (HealthLifeTaskBean healthLifeTaskBean : list) {
            if (healthLifeTaskBean != null && healthLifeTaskBean.getComplete() > 0) {
                arrayList.add(healthLifeTaskBean);
            }
        }
        return arrayList;
    }

    private List<HealthLifeTaskBean> j(List<HealthLifeTaskBean> list) {
        if (njy.e(list)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (HealthLifeTaskBean healthLifeTaskBean : list) {
            if (healthLifeTaskBean != null && healthLifeTaskBean.getComplete() <= 0) {
                arrayList.add(healthLifeTaskBean);
            }
        }
        return arrayList;
    }

    private void g(final List<HealthLifeTaskBean> list) {
        if (njy.e(list)) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "refreshBottomData list ", list);
            return;
        }
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: sqx
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(list);
                }
            });
            return;
        }
        int size = a(list).size();
        int size2 = list.size();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(size, size2) { // from class: com.huawei.ui.homehealth.knit.ThreeLeafCardProvider.6

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f25644a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f25646c;

            {
                this.f25644a = size;
                this.f25646c = size2;
                add(Integer.valueOf(size));
                add(Integer.valueOf(size2));
            }
        };
        e();
        this.f.put("UPDATE_BOTTOM_DATA_THREE_LEAF", arrayList);
        f();
        LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "refreshBottomData mTotalCount ", Integer.valueOf(this.ai), " totalCount ", Integer.valueOf(size2), " mCompleteCount ", Integer.valueOf(this.l), " completeCount ", Integer.valueOf(size));
        if (this.ai != size2 || this.l != size) {
            ffv.y();
        }
        this.ai = size2;
        this.l = size;
    }

    public /* synthetic */ void b(List list) {
        g((List<HealthLifeTaskBean>) list);
    }

    public void e(final int i, final List<HealthLifeBean> list) {
        if (list == null) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "params is null");
        } else {
            HandlerExecutor.b(new Runnable() { // from class: sqv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48536c.d(list, i);
                }
            });
        }
    }

    public /* synthetic */ void d(List list, int i) {
        LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "refresh data size:", Integer.valueOf(list.size()));
        e();
        int iB = ffv.b((List<HealthLifeBean>) list, 1);
        if (this.k != iB) {
            this.k = iB;
            a(this.ah);
        }
        d(this.k);
        c(i, (List<HealthLifeBean>) list);
        f();
    }

    private void c(int i, List<HealthLifeBean> list) {
        float fC = ffv.c(list, 1);
        float fC2 = ffv.c(list, 2);
        float fC3 = ffv.c(list, 3);
        boolean zB = ffv.b(list, fC, fC3, fC2);
        ReleaseLogUtil.d("HL_SCUI_ThreeLeafCardProvider", "isSame top:", Float.valueOf(fC), " right:", Float.valueOf(fC2), " left:", Float.valueOf(fC3), " isPerfect:", Boolean.valueOf(zB));
        n(this.t);
        if (d(fC, fC2, fC3, zB)) {
            return;
        }
        this.u = zB;
        float[] fArr = this.v;
        fArr[0] = fC;
        fArr[1] = fC3;
        fArr[2] = fC2;
        lua.a(fft.f34005c, "perfect_three_leaf", zB ? System.currentTimeMillis() : 0L);
        if (i == 2) {
            this.f.put("GROW_ALL_CLOVER", true);
        } else {
            this.f.put("GROW_ONE_CLOVER", true);
        }
        a(e(fC, fC2, fC3), zB);
    }

    private boolean d(float f, float f2, float f3, boolean z) {
        float[] fArr = this.v;
        ReleaseLogUtil.d("HL_SCUI_ThreeLeafCardProvider", "mLastTop:", Float.valueOf(fArr[0]), " mLastRight:", Float.valueOf(fArr[2]), " mLastLeft:", Float.valueOf(fArr[1]), " mLastIsPerfect:", Boolean.valueOf(this.u));
        return Float.compare(this.v[0], f) == 0 && Float.compare(this.v[2], f2) == 0 && Float.compare(this.v[1], f3) == 0 && this.u == z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, boolean z2) {
        if (this.f25608c == null || this.f25608c != BaseApplication.j()) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "checkShowFinishTargetAnimation mainActivity is not show");
        } else {
            if (ffv.d("healthLifeThreeLeafSwitch", true)) {
                return;
            }
            LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "animation switch is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HealthLifeBean> f(List<HealthLifeTaskBean> list) {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            Iterator<HealthLifeTaskBean> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getHealthLifeBean());
            }
        }
        return arrayList;
    }

    private void t() {
        ReleaseLogUtil.d("R_HL_SCUI_ThreeLeafCardProvider", "initThreeLeafView");
        List<HealthLifeTaskBean> listB = ffv.b();
        this.t = listB;
        List<HealthLifeBean> listF = f(listB);
        if (njy.b(listF)) {
            HealthLifeBean healthLifeBean = listF.get(0);
            int recordDay = healthLifeBean != null ? healthLifeBean.getRecordDay() : 0;
            int iA = DateFormatUtil.a(System.currentTimeMillis());
            ReleaseLogUtil.d("R_HL_SCUI_ThreeLeafCardProvider", "initThreeLeafView recordDay ", Integer.valueOf(recordDay), " currentDay ", Integer.valueOf(iA));
            if (recordDay == iA) {
                g(this.t);
            } else {
                this.t = new ArrayList();
                listF = new ArrayList<>();
            }
        }
        this.v[0] = ffv.c(listF, 1);
        this.v[1] = ffv.c(listF, 3);
        this.v[2] = ffv.c(listF, 2);
        float[] fArr = this.v;
        boolean zB = ffv.b(listF, fArr[0], fArr[1], fArr[2]);
        this.u = zB;
        if (zB) {
            lua.a(fft.f34005c, "perfect_three_leaf", System.currentTimeMillis());
        }
        this.f.put("SHOW_CLOVER_WITHOUT_ANIMATION", true);
        int iB = ffv.b(listF, 1);
        this.k = iB;
        d(iB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "bindCardData.");
        HealthLifeTaskBean healthLifeTaskBeanB = b(5);
        if (healthLifeTaskBeanB != null && healthLifeTaskBeanB.getHealthLifeBean() != null) {
            HealthLifeBean healthLifeBean = healthLifeTaskBeanB.getHealthLifeBean();
            if (ffv.c(healthLifeBean)) {
                this.f.put("MOOD_VALUE_SCORE", wvb.a(((grv) HiJsonUtil.d(healthLifeBean.getExtendInfo(), grv.class)).c()));
            }
        }
        this.f.put("BIND_CARD_DATA", Integer.valueOf(i));
    }

    @Override // com.huawei.ui.homehealth.knit.ModelBaseCardProvider
    protected void h() {
        e();
        super.h();
        this.f.put("SET_FITNESS_DATA_ORIGIN_ICON2VISIBLE", Integer.valueOf(this.k == 2 ? 0 : 8));
        f();
    }

    @Override // com.huawei.ui.homehealth.knit.ModelBaseCardProvider
    public void c(int i, int[] iArr, int[] iArr2) {
        super.c(i, iArr, iArr2);
        c(iArr);
    }

    private void c(int[] iArr) {
        boolean z;
        e();
        int iA = DateFormatUtil.a(System.currentTimeMillis(), TimeZone.getDefault());
        if (this.ag != iA) {
            this.ag = iA;
            h(2);
            z = true;
        } else {
            z = false;
        }
        int i = iArr[3];
        int i2 = iArr[0];
        int i3 = iArr[4];
        int i4 = iArr[1];
        String str = this.ah[0] + "," + this.ah[3] + "," + this.ah[2] + "," + this.ah[1];
        String str2 = i + "," + i2 + "," + i3 + "," + i4;
        boolean z2 = this.x != UnitUtil.f();
        if (str2.equals(str) && !z2) {
            LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "newData:", str2, " no need refresh.");
            return;
        }
        LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "newData:", str2, " lastData:", str, " todayDate:", Integer.valueOf(this.ag));
        this.x = UnitUtil.f();
        a(new int[]{i, i2, i3, i4});
        if (!z) {
            u();
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int[] iArr) {
        LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "updateRealSportData tempStep:", Integer.valueOf(iArr[0]), " tempCalories:", Integer.valueOf(iArr[3]), " tempDistance:", Integer.valueOf(iArr[2]), " tempIntensity:", Integer.valueOf(iArr[1]));
        if (iArr[0] < 0) {
            iArr[0] = 0;
            this.f.put("SET_FITNESS_DATA_ORIGIN_ICON2VISIBLE", 8);
        }
        int[] iArr2 = this.ah;
        iArr2[0] = iArr[0];
        if (iArr[1] < 0) {
            iArr[1] = 0;
        }
        iArr2[1] = iArr[1];
        this.f.put("BIND_SPORT_LAYOUT", true);
        int i = iArr[3];
        if (i >= 0) {
            this.ah[3] = i;
        }
        int i2 = iArr[2];
        if (i2 >= 0) {
            this.ah[2] = i2;
        }
    }

    private void u() {
        HealthLifeTaskBean healthLifeTaskBeanB = b(this.k);
        if (healthLifeTaskBeanB == null || healthLifeTaskBeanB.getHealthLifeBean() == null) {
            LogUtil.e("HL_SCUI_ThreeLeafCardProvider", "updateSportTask null.");
            return;
        }
        HealthLifeBean healthLifeBean = healthLifeTaskBeanB.getHealthLifeBean();
        if (e(healthLifeBean)) {
            lua.f(fft.f34005c, "step_intensity_bean", qqt.b(healthLifeBean));
            ObserverManagerUtil.e("HOME_PAGE_SPORT_TASK_UPDATE", healthLifeBean);
            c(1, f(this.t));
        }
    }

    private boolean e(HealthLifeBean healthLifeBean) {
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        int recordDay = healthLifeBean.getRecordDay();
        if (iA != recordDay) {
            ReleaseLogUtil.e("R_HL_SCUI_ThreeLeafCardProvider", "refreshSportTask currentDay ", Integer.valueOf(iA), " recordDay ", Integer.valueOf(recordDay));
            return false;
        }
        int i = this.k == 2 ? this.ah[0] : this.ah[1];
        int complete = healthLifeBean.getComplete();
        LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "refreshSportTask target:", healthLifeBean.getTarget(), " curValue:", Integer.valueOf(i), " complete:", Integer.valueOf(complete), " mStepInThreeLeaf:", Integer.valueOf(this.ab));
        if (complete <= 0 && i >= CommonUtil.j(healthLifeBean.getTarget())) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            healthLifeBean.setIsUpdated(true);
            healthLifeBean.setTimestamp(jCurrentTimeMillis);
            healthLifeBean.setComplete(1);
            healthLifeBean.setTimeZone(lsl.q(jCurrentTimeMillis));
            healthLifeBean.setSyncStatus(0);
        } else if (i == CommonUtil.j(healthLifeBean.getResult())) {
            LogUtil.d("HL_SCUI_ThreeLeafCardProvider", "no need refreshSportTask");
        } else {
            healthLifeBean.setIsUpdated(true);
            healthLifeBean.setSyncStatus(0);
        }
        int iJ = CommonUtil.j(healthLifeBean.getResult());
        healthLifeBean.setResult(Integer.toString(i));
        return b(healthLifeBean, iJ, complete);
    }

    private boolean b(HealthLifeBean healthLifeBean, int i, int i2) {
        boolean z = true;
        if (this.k == 2) {
            if (this.ah[0] - this.ab <= 50 && ((i2 > 0 || healthLifeBean.getComplete() <= 0) && (i != 0 || this.ah[0] <= 0))) {
                z = false;
            }
            if (Math.abs(this.ah[0] - this.ab) > 50) {
                this.ab = this.ah[0];
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        HealthLifeTaskBean healthLifeTaskBeanB = b(6);
        if (healthLifeTaskBeanB == null) {
            e(3, false, false);
            ffv.b(this.f25608c, (HealthLifeTaskBean) null, "inputSleepDialog", (ResponseCallback<HealthLifeTaskBean>) null);
            return;
        }
        HealthLifeBean healthLifeBean = healthLifeTaskBeanB.getHealthLifeBean();
        if (healthLifeBean == null) {
            e(3, false, false);
            ffv.b(this.f25608c, healthLifeTaskBeanB, "inputSleepDialog", (ResponseCallback<HealthLifeTaskBean>) null);
            return;
        }
        e(3, healthLifeBean.getComplete() > 0, false);
        if (TextUtils.isEmpty(ffv.d(healthLifeBean.getResult()))) {
            ffv.b(this.f25608c, healthLifeTaskBeanB, "inputSleepDialog", (ResponseCallback<HealthLifeTaskBean>) null);
            return;
        }
        Intent intent = new Intent(this.m, (Class<?>) KnitSleepDetailActivity.class);
        intent.putExtra("from", 2);
        iov.d(this.f25608c, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.k == 2) {
            o();
            return;
        }
        HealthLifeTaskBean healthLifeTaskBeanB = b(3);
        if (healthLifeTaskBeanB == null) {
            ReleaseLogUtil.e("R_HL_SCUI_ThreeLeafCardProvider", "clickStepOrIntensityArea intensityTask is null mBaseSportTaskId ", Integer.valueOf(this.k));
        } else if (healthLifeTaskBeanB.getComplete() > 0) {
            g();
        } else {
            ffv.b(this.f25608c, healthLifeTaskBeanB, "cloverLife", (ResponseCallback<HealthLifeTaskBean>) new ResponseCallback() { // from class: sqm
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.d.b(i, (HealthLifeTaskBean) obj);
                }
            });
        }
    }

    public /* synthetic */ void b(int i, HealthLifeTaskBean healthLifeTaskBean) {
        if (i == 3) {
            h(1);
        }
    }

    protected void o() {
        ReleaseLogUtil.d("HL_SCUI_ThreeLeafCardProvider", "click into steps = ", Integer.valueOf(this.d[3]));
        tdy.e(this.g, this.f25608c, this.d[3], this.d[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        HealthLifeTaskBean healthLifeTaskBeanB = b(5);
        if (healthLifeTaskBeanB == null) {
            e(2, false, false);
            ddv.b().loadH5ProApp(this.f25608c, "com.huawei.health.h5.breath-training", null);
            return;
        }
        HealthLifeBean healthLifeBean = healthLifeTaskBeanB.getHealthLifeBean();
        boolean zC = ffv.c(healthLifeBean);
        e(2, healthLifeTaskBeanB.getComplete() > 0, zC);
        if (!zC && CommonUtils.j(healthLifeBean.getResult()) <= 0) {
            ddv.b().loadH5ProApp(this.f25608c, "com.huawei.health.h5.breath-training", null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("type", 2);
        uye.a(this.f25608c, bundle);
    }

    private HealthLifeTaskBean b(int i) {
        List<HealthLifeTaskBean> list = this.t;
        if (njy.e(list)) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "getHealthLifeTaskById list ", list);
            return null;
        }
        for (HealthLifeTaskBean healthLifeTaskBean : list) {
            if (healthLifeTaskBean != null && healthLifeTaskBean.getHealthLifeBean() != null && healthLifeTaskBean.getId() == i) {
                return healthLifeTaskBean;
            }
        }
        return null;
    }

    private HealthLifeBean e(int i) {
        HealthLifeTaskBean healthLifeTaskBeanB = b(ffv.b(f(this.t), i));
        if (healthLifeTaskBeanB == null) {
            return new HealthLifeBean();
        }
        HealthLifeBean healthLifeBean = healthLifeTaskBeanB.getHealthLifeBean();
        return healthLifeBean == null ? new HealthLifeBean() : healthLifeBean;
    }

    private void e(int i, boolean z, boolean z2) {
        HashMap map = new HashMap(4);
        map.put("click", 1);
        if (i == 2) {
            map.put("type", "moods");
            map.put("hasStressData", Boolean.valueOf(z2));
        } else if (i == 3) {
            map.put("type", "sleep");
        } else {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "setBiEventForClick type ", Integer.valueOf(i));
        }
        map.put("cloverCardStatus", Integer.valueOf(!z ? 1 : 0));
        lmf.d().c(this.m, AnalyticsValue.HEALTH_CLOVER_LIFE_2010119.value(), map, 0);
    }

    @Override // com.huawei.ui.homehealth.knit.ModelBaseCardProvider
    public void b() {
        if ("threeLeafCard".equals(fsb.b())) {
            q();
            s();
            p();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004a A[PHI: r0
      0x004a: PHI (r0v4 int) = (r0v3 int), (r0v16 int) binds: [B:12:0x0048, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    private void q() {
        int i;
        float f;
        HealthLifeBean healthLifeBeanE = e(1);
        int id = healthLifeBeanE.getId();
        int iJ = CommonUtils.j(healthLifeBeanE.getTarget());
        if (id <= 0 || iJ <= 0) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "exitBiForSport sport ", healthLifeBeanE);
            return;
        }
        HashMap map = new HashMap(3);
        map.put("click", 1);
        int iJ2 = CommonUtils.j(healthLifeBeanE.getResult());
        if (id == 2) {
            map.put(ParsedFieldTag.TASK_TYPE, "walk");
            i = this.ah[0];
            if (i > 0) {
                f = i;
            } else {
                f = iJ2;
            }
        } else {
            map.put(ParsedFieldTag.TASK_TYPE, "MVPA");
            i = this.ah[1];
            if (i > 0) {
                f = i;
            } else {
                f = iJ2;
            }
        }
        map.put("taskFinishRate", Double.valueOf(UnitUtil.d((f / iJ) * 100.0f, 0)));
        lmf.d().c(this.m, AnalyticsValue.HEALTH_EXIT_APP_MODE_COMPLETE_2010117.value(), map, 0);
    }

    private void s() {
        HealthLifeBean healthLifeBeanE = e(2);
        if (healthLifeBeanE.getId() <= 0) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "exitBiForMood mood ", healthLifeBeanE);
            return;
        }
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put(ParsedFieldTag.TASK_TYPE, "moods");
        map.put("taskFinishRate", Integer.valueOf(healthLifeBeanE.getComplete() <= 0 ? 0 : 100));
        lmf.d().c(this.m, AnalyticsValue.HEALTH_EXIT_APP_MODE_COMPLETE_2010117.value(), map, 0);
    }

    private void p() {
        HealthLifeBean healthLifeBeanE = e(3);
        if (healthLifeBeanE.getId() <= 0) {
            LogUtil.j("HL_SCUI_ThreeLeafCardProvider", "exitBiForSlumber slumber ", healthLifeBeanE);
            return;
        }
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put(ParsedFieldTag.TASK_TYPE, "sleep");
        map.put("taskFinishRate", Integer.valueOf(healthLifeBeanE.getComplete() <= 0 ? 0 : 100));
        lmf.d().c(this.m, AnalyticsValue.HEALTH_EXIT_APP_MODE_COMPLETE_2010117.value(), map, 0);
    }

    private void d(Map<String, Object> map, int i, int i2) {
        map.put("click", 1);
        map.put("planType", Integer.valueOf(ffv.g()));
        map.put(ParsedFieldTag.TASK_TYPE, Integer.valueOf(i));
        map.put("event", Integer.valueOf(i2));
    }

    private Map<String, Object> a(int i, int i2) {
        HashMap map = new HashMap(4);
        d(map, i, i2);
        return map;
    }

    private Map<String, Object> b(int i, int i2, int i3, HealthLifeTaskBean healthLifeTaskBean, int i4) {
        HashMap map = new HashMap(5);
        d(map, i, i2);
        map.put("reminderType", Integer.valueOf(i3));
        map.put("from", Integer.valueOf(i4));
        map.put("continuumDays", Integer.valueOf(healthLifeTaskBean.getHealthLifeBean().getContinueDays()));
        return map;
    }

    @Override // com.huawei.ui.homehealth.knit.ModelBaseCardProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "onDestroy");
        super.onDestroy();
        if (njy.b(this.z)) {
            HiHealthNativeApi.a(this.m).unSubscribeHiHealthData(this.z, new HiUnSubscribeListener() { // from class: sqs
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    LogUtil.a("HL_SCUI_ThreeLeafCardProvider", "onDestroy unSubscribeHiHealthData isSuccess ", Boolean.valueOf(z));
                }
            });
        }
        tuv.a();
        BroadcastManagerUtil.b(this.m, this.ad);
        BroadcastManager.n(this.n);
        ObserverManagerUtil.a("HEALTH_MODEL_CARD_KEY_NEW");
        e();
        this.f.put("ON_DESTROY", true);
        f();
    }

    @Override // com.huawei.ui.homehealth.knit.ModelBaseCardProvider
    protected void d() {
        this.s = true;
        e();
        this.f.put("STOP_OR_START_ANIMATE", false);
        f();
    }

    @Override // com.huawei.ui.homehealth.knit.ModelBaseCardProvider
    protected void c(String str, int i) {
        e();
        if ("threeLeafCard".equals(str)) {
            fsb.e(str, i);
            this.aa = false;
        }
        this.f.put("CHECK_MSG_RED_DOT_TEXT", new View.OnClickListener() { // from class: com.huawei.ui.homehealth.knit.ThreeLeafCardProvider.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Context context = ThreeLeafCardProvider.this.f25608c;
                int iA = DateFormatUtil.a(System.currentTimeMillis());
                SharedPreferenceManager.e(context, String.valueOf(10000), "SP_PERFECT_RED_POINT", String.valueOf(iA), new StorageParams());
            }
        });
        if ("threeCircleCard".equals(str)) {
            this.aa = true;
            this.f.put("STOP_OR_START_ANIMATE", true);
        }
        this.f.put("UPDATE_MSG_RED_DOT_VISIBILITY", 8);
        f();
    }

    private void c(HiSubscribeListener hiSubscribeListener) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(200);
        arrayList.add(14);
        arrayList.add(2);
        arrayList.add(Integer.valueOf(HiSubscribeType.f12259a));
        arrayList.add(3);
        arrayList.add(Integer.valueOf(HiSubscribeType.f12261c));
        arrayList.add(103);
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.BREATH_TRAIN_SET.value()));
        HiHealthNativeApi.a(this.m).subscribeHiHealthData(arrayList, hiSubscribeListener);
    }

    public void a(boolean z) {
        this.s = z;
        boolean zH = BaseApplication.h();
        e();
        this.f.put("UPDATE_LEAF_CARD_SHOW_STATUS", Boolean.valueOf(zH && z));
        f();
    }
}
