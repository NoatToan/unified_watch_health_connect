package com.huawei.ui.homehealth.threecirclecard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.healthmodel.HealthModelApi;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.health.healthmodel.bean.HealthLifeStatistic;
import com.huawei.health.healthmodel.bean.HealthLifeTaskBean;
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
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ucd.cloveranimation.AddFrameListener;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.view.Clover;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.stepscard.AchieveTaskHandler;
import com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity;
import com.huawei.watchface.api.HwWatchFaceApi;
import defpackage.ddv;
import defpackage.ezi;
import defpackage.ffe;
import defpackage.fft;
import defpackage.ffv;
import defpackage.fru;
import defpackage.grv;
import defpackage.iov;
import defpackage.iyg;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.lsl;
import defpackage.lua;
import defpackage.njy;
import defpackage.qfj;
import defpackage.qhq;
import defpackage.qji;
import defpackage.qqf;
import defpackage.qqt;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrf;
import defpackage.qri;
import defpackage.qrs;
import defpackage.qtg;
import defpackage.sqw;
import defpackage.tbf;
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
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes17.dex */
public class ThreeLeafCardData extends TwoModelBaseCard {
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private int[] ae;
    private String af;
    private float ag;
    private float ah;
    private int ai;
    private boolean aj;
    private List<Integer> ak;
    private final CopyOnWriteArrayList<String> al;
    private a am;
    private int an;
    private int ao;
    private int ap;
    private String aq;
    private b ar;
    private ThreeLeafCardViewHolder as;
    private boolean f;
    private final Context g;
    private AchieveTaskHandler h;
    private boolean j;
    private int k;
    private int l;
    private String m;
    private int n;
    private Context o;
    private int p;
    private final BroadcastReceiver q;
    private List<fru> r;
    private List<HealthLifeTaskBean> s;
    private long t;
    private final boolean u;
    private final boolean v;
    private final AtomicBoolean w;
    private boolean x;
    private int y;
    private float z;

    private boolean a(float f, float f2, float f3) {
        return f >= 1.0f && f3 >= 1.0f && f2 >= 1.0f;
    }

    public void d(String str) {
        if ("900200006".equals(str) || "900200008".equals(str)) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            ffv.d(arrayList, (ResponseCallback<List<HealthLifeBean>>) new ResponseCallback() { // from class: tbv
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    LogUtil.a("HL_SCUI_ThreeLeafCardData", "threeCircleAndStepGoalUpdate onResponse status ", Integer.valueOf(i), " list ", (List) obj);
                }
            });
        }
    }

    static class c implements HiSubscribeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<ThreeLeafCardData> f26116b;

        c(ThreeLeafCardData threeLeafCardData) {
            this.f26116b = new WeakReference<>(threeLeafCardData);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            if (list != null && list2 != null && this.f26116b.get() != null) {
                this.f26116b.get().ak = list;
                LogUtil.a("HL_SCUI_ThreeLeafCardData", "onResult:", Integer.valueOf(list.size()), " failList:", Integer.valueOf(list2.size()));
                return;
            }
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "onResult list null.");
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            ThreeLeafCardData threeLeafCardData = this.f26116b.get();
            if (threeLeafCardData == null) {
                return;
            }
            if (i == 103) {
                LogUtil.a("HL_SCUI_ThreeLeafCardData", "switch state changed,", str);
                if ("900300020".equals(str)) {
                    threeLeafCardData.v();
                    return;
                }
                return;
            }
            if (ArkUIXConstants.INSERT.equals(str) || "latestDataDownload".equals(str)) {
                threeLeafCardData.m = str;
                if (i == DicDataTypeUtil.DataType.BREATH_TRAIN_SET.value() || i == 2 || i == 3 || i == DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD.value() || i == HiSubscribeType.f12261c || i == 14 || i == 200 || i == HiSubscribeType.f12259a) {
                    LogUtil.a("HL_SCUI_ThreeLeafCardData", "onChange type:", Integer.valueOf(i), " time:", Long.valueOf(j), " changeKey:", str);
                    if (threeLeafCardData.a(i)) {
                        threeLeafCardData.j(1);
                        return;
                    }
                    return;
                }
                LogUtil.d("HL_SCUI_ThreeLeafCardData", "observerType other type");
                return;
            }
            LogUtil.a("HL_SCUI_ThreeLeafCardData", "sync from cloud.", Integer.valueOf(i), " changeKey:", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "getAnimationSwitch");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900300020");
        qhq.b(MatterDataContans.TYPE_HEALTH, arrayList, new HiDataReadResultListener() { // from class: com.huawei.ui.homehealth.threecirclecard.ThreeLeafCardData.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d("HL_SCUI_ThreeLeafCardData", "onResult errorCode: ", Integer.valueOf(i), ", data: ", obj);
                if (!njy.b(obj, HiSampleConfig.class)) {
                    LogUtil.j("HL_SCUI_ThreeLeafCardData", "list getAnimationSwitch isListTypeMatch false ");
                    ffv.c("healthLifeThreeLeafSwitch", true);
                    return;
                }
                List list = (List) obj;
                if (njy.e(list) || list.size() != 1) {
                    LogUtil.j("HL_SCUI_ThreeLeafCardData", "list getAnimationSwitch list is empty ");
                    ffv.c("healthLifeThreeLeafSwitch", true);
                } else {
                    HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(0);
                    LogUtil.a("HL_SCUI_ThreeLeafCardData", "animation switch is ", hiSampleConfig.getConfigData());
                    ffv.c("healthLifeThreeLeafSwitch", "1".equals(ffv.a(hiSampleConfig.getConfigData(), "healthLifeThreeLeafSwitch")));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i) {
        boolean z = i == HiSubscribeType.f12261c;
        boolean z2 = i == HiSubscribeType.f12259a;
        if (njy.e(this.s) || !(z || z2)) {
            return true;
        }
        for (HealthLifeTaskBean healthLifeTaskBean : this.s) {
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

    static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<ThreeLeafCardData> f26115a;

        a(ThreeLeafCardData threeLeafCardData) {
            this.f26115a = new WeakReference<>(threeLeafCardData);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("HL_SCUI_ThreeLeafCardData", "SyncCloudDataReceiver onReceive intent is null or context is null");
                return;
            }
            ThreeLeafCardData threeLeafCardData = this.f26115a.get();
            if (threeLeafCardData == null) {
                LogUtil.j("HL_SCUI_ThreeLeafCardData", "SyncCloudDataReceiver onReceive cardData is null");
                return;
            }
            String stringExtra = intent.getStringExtra("sync_cloud_data_status");
            LogUtil.a("HL_SCUI_ThreeLeafCardData", "Sync status:", stringExtra, " process:", Double.valueOf(intent.getDoubleExtra("sync_cloud_data_process", 0.0d)));
            threeLeafCardData.w.set("ongoing_sync_cloud_data".equals(stringExtra));
            if ("sync_cloud_data_backstage".equals(stringExtra)) {
                threeLeafCardData.v();
            }
            if ("sync_cloud_data_finish".equals(stringExtra) || "sync_cloud_data_fail".equals(stringExtra) || "sync_cloud_data_setting_flag".equals(stringExtra)) {
                threeLeafCardData.ab();
                threeLeafCardData.v();
            }
        }
    }

    public ThreeLeafCardData(Context context) {
        super(context);
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.al = copyOnWriteArrayList;
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.threecirclecard.ThreeLeafCardData.5
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent == null || !HwWatchFaceApi.ACTION_FOREGROUND_STATUS.equals(intent.getAction())) {
                    LogUtil.j("HL_SCUI_ThreeLeafCardData", "mForegroundStatusChangeReceiver onReceive intent ", intent);
                    return;
                }
                boolean z = false;
                boolean booleanExtra = intent.getBooleanExtra("isForeground", false);
                LogUtil.a("HL_SCUI_ThreeLeafCardData", "mForegroundStatusChangeReceiver onReceive isForeground ", Boolean.valueOf(booleanExtra));
                if (booleanExtra) {
                    ThreeLeafCardData.this.al.add("all");
                    ThreeLeafCardData.this.ad();
                    ezi.c((Handler) null, 0);
                    if ("threeLeafCard".equals(tbf.e())) {
                        LogUtil.a("HL_SCUI_ThreeLeafCardData", "mForegroundStatusChangeReceiver onReceive getTopActivity ", BaseApplication.j());
                        ThreeLeafCardData threeLeafCardData = ThreeLeafCardData.this;
                        if (CommonUtil.i(threeLeafCardData.g, "com.huawei.health.MainActivity") && ThreeLeafCardData.this.x) {
                            z = true;
                        }
                        threeLeafCardData.aa = z;
                    }
                }
            }
        };
        this.q = broadcastReceiver;
        this.w = new AtomicBoolean();
        Context contextB = BaseApplication.b();
        this.g = contextB;
        this.j = true;
        this.f = false;
        this.p = -1;
        this.l = -1;
        this.n = 2;
        CommonUtil.d("HL_SCUI_ThreeLeafCardData", "ThreeLeafCardData");
        this.o = context == null ? contextB : context;
        this.v = LanguageUtil.ba(contextB);
        this.u = LanguageUtil.f(contextB);
        copyOnWriteArrayList.add("all");
        this.aa = "threeLeafCard".equals(tbf.e());
        this.ac = UnitUtil.f();
        boolean z = z();
        this.ab = z;
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "init mIsShowHealthLifeTask：", Boolean.valueOf(z));
        ag();
        BroadcastManager.d(broadcastReceiver);
        if (!this.ab) {
            ac();
        } else {
            aa();
        }
        this.ap = DateFormatUtil.a(System.currentTimeMillis(), TimeZone.getDefault());
        iyg.e();
    }

    public ThreeLeafCardData(Context context, AchieveTaskHandler achieveTaskHandler) {
        this(context);
        this.h = achieveTaskHandler;
    }

    private boolean z() {
        return tdy.c((ResponseCallback<Boolean>) new ResponseCallback() { // from class: tbw
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.d.c(i, (Boolean) obj);
            }
        });
    }

    public /* synthetic */ void c(int i, final Boolean bool) {
        if (HandlerExecutor.c()) {
            return;
        }
        HandlerExecutor.c(new Runnable() { // from class: tcn
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e(bool);
            }
        });
    }

    public /* synthetic */ void e(Boolean bool) {
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "getHealthLifeStateAndUpdate callback data：", bool);
        if (b(bool.booleanValue())) {
            ab();
        }
    }

    private void af() {
        ObserverManagerUtil.d(new b(this), "HEALTH_MODEL_CARD_KEY_NEW");
    }

    static class b implements Observer {
        private WeakReference<ThreeLeafCardData> e;

        b(ThreeLeafCardData threeLeafCardData) {
            this.e = new WeakReference<>(threeLeafCardData);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            ThreeLeafCardData threeLeafCardData = this.e.get();
            if (threeLeafCardData == null) {
                LogUtil.j("HL_SCUI_ThreeLeafCardData", "card is null");
                return;
            }
            LogUtil.a("HL_SCUI_ThreeLeafCardData", "three leaf small card has shown");
            if (TextUtils.equals(str, "HEALTH_MODEL_CARD_KEY_NEW")) {
                threeLeafCardData.j(1);
            } else if (TextUtils.equals(str, ObserveLabels.REFRESH_HEALTH_LIFE)) {
                threeLeafCardData.ad();
            }
        }
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard, com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        ThreeLeafCardViewHolder threeLeafCardViewHolder = new ThreeLeafCardViewHolder(viewGroup, this.o, false);
        this.as = threeLeafCardViewHolder;
        i(threeLeafCardViewHolder.z);
        i();
        c("threeLeafCard");
        a();
        if (!this.ab) {
            ai();
            ae();
            j(1);
        } else {
            ad();
        }
        return this.as;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        if (!this.ab) {
            ReleaseLogUtil.e("R_HL_SCUI_ThreeLeafCardData", "getHealthLifeData mIsShowHealthLifeTask false");
            return;
        }
        if (System.currentTimeMillis() - this.t < 5000 && njy.e(this.al)) {
            ReleaseLogUtil.e("R_HL_SCUI_ThreeLeafCardData", "getHealthLifeData mIsGettingHealthLifeData true and mIsNeedUpdateSchedule false");
            return;
        }
        this.t = System.currentTimeMillis();
        ReleaseLogUtil.d("R_HL_SCUI_ThreeLeafCardData", "getHealthLifeData mTaskIdList ", this.al);
        final List<String> listA = sqw.a();
        qfj qfjVarA = ffv.a(this.al, (ResponseCallback<qfj>) null);
        k(sqw.b(qfjVarA, listA, this.f26120a[1], this.d[1]));
        b(sqw.e(qfjVarA));
        e(qfjVarA);
        ThreadPoolManager.c().execute(new Runnable() { // from class: tbr
            @Override // java.lang.Runnable
            public final void run() {
                this.f48954b.e(listA);
            }
        });
    }

    public /* synthetic */ void e(final List list) {
        ReleaseLogUtil.d("R_HL_SCUI_ThreeLeafCardData", "getHealthLifeData");
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        ffv.a(this.al, (ResponseCallback<qfj>) new ResponseCallback() { // from class: tcc
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f48964c.d(jElapsedRealtime, list, i, (qfj) obj);
            }
        });
    }

    public /* synthetic */ void d(long j, List list, int i, qfj qfjVar) {
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "getHealthLifeData onResponse ", Long.valueOf(SystemClock.elapsedRealtime() - j));
        k(sqw.b(qfjVar, list, this.f26120a[1], this.d[1]));
        b(sqw.e(qfjVar));
        this.t = 0L;
        this.al.clear();
        b(qfjVar);
        e(qfjVar);
        ObserverManagerUtil.e(ObserveLabels.HEALTH_LIFE_QUERY_SCHEDULES_RESP, qfjVar);
    }

    private void b(qfj qfjVar) {
        final List<tdr> listB = tdy.b(this.o, qfjVar);
        if (njy.e(listB)) {
            return;
        }
        HandlerExecutor.c(new Runnable() { // from class: tcf
            @Override // java.lang.Runnable
            public final void run() {
                this.e.j(listB);
            }
        }, this.j ? 2000L : 0L);
    }

    public /* synthetic */ void j(List list) {
        ThreeLeafCardViewHolder threeLeafCardViewHolder = this.as;
        if (threeLeafCardViewHolder == null) {
            ReleaseLogUtil.e("R_HL_SCUI_ThreeLeafCardData", "setMessageList mThreeLeafCardViewHolder null");
        } else {
            threeLeafCardViewHolder.c((List<tdr>) list);
        }
    }

    private void e(final qfj qfjVar) {
        if (qfjVar == null) {
            ReleaseLogUtil.e("R_HL_SCUI_ThreeLeafCardData", "updateBottomData querySchedulesResp null");
            return;
        }
        HandlerExecutor.b(new Runnable() { // from class: tck
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(qfjVar);
            }
        });
        boolean zH = BaseApplication.h();
        String strE = tbf.e();
        ReleaseLogUtil.d("R_HL_SCUI_ThreeLeafCardData", "updateBottomData mIsHomeFragmentVisible ", Boolean.valueOf(this.x), " isRunningForeground ", Boolean.valueOf(zH), " currentType ", strE);
        if (this.x && zH && "threeLeafCard".equals(strE)) {
            ffv.d(qfjVar);
        }
    }

    public /* synthetic */ void a(qfj qfjVar) {
        if (this.as == null) {
            ReleaseLogUtil.e("R_HL_SCUI_ThreeLeafCardData", "updateBottomData mThreeLeafCardViewHolder null");
            return;
        }
        List<String> listC = sqw.c(qfjVar);
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "updateBottomData taskIdList ", listC);
        this.as.a(qfjVar.a(listC), listC.size());
    }

    private void k(final List<fru> list) {
        HandlerExecutor.b(new Runnable() { // from class: tbz
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d(list);
            }
        });
    }

    public /* synthetic */ void d(List list) {
        if (this.as == null) {
            ReleaseLogUtil.e("R_HL_SCUI_ThreeLeafCardData", "refreshHealthLifeData mThreeLeafCardViewHolder is null");
            return;
        }
        if (!njy.e(this.r) && njy.c(this.r, list, true)) {
            ReleaseLogUtil.e("R_HL_SCUI_ThreeLeafCardData", "refreshHealthLifeData dataList is same");
            return;
        }
        this.r = list;
        if (njy.e(list)) {
            ReleaseLogUtil.e("R_HL_SCUI_ThreeLeafCardData", "refreshHealthLifeData dataList is empty");
            this.as.b(8, this.ab);
            return;
        }
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "refreshHealthLifeData dataList :", list.toString());
        this.as.b(0, this.ab);
        this.as.j(list.size() >= 4 ? 0 : 8);
        for (int i = 0; i < Math.min(4, list.size()); i++) {
            if (i == 0) {
                this.as.e((fru) list.get(0));
            } else if (i == 1) {
                this.as.c((fru) list.get(1));
            } else if (i == 2) {
                this.as.b((fru) list.get(2));
            } else {
                this.as.d((fru) list.get(3));
            }
        }
        this.as.f(list.size());
    }

    private void b(final qtg qtgVar) {
        HandlerExecutor.b(new Runnable() { // from class: tcj
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e(qtgVar);
            }
        });
    }

    public /* synthetic */ void e(qtg qtgVar) {
        ThreeLeafCardViewHolder threeLeafCardViewHolder = this.as;
        if (threeLeafCardViewHolder == null) {
            ReleaseLogUtil.e("R_HL_SCUI_ThreeLeafCardData", "refreshHealthLifeClover mThreeLeafCardViewHolder is null");
        } else {
            threeLeafCardViewHolder.e(qtgVar);
        }
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard, com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "HL_SCUI_ThreeLeafCardData";
    }

    protected void i() {
        ThreeLeafCardViewHolder threeLeafCardViewHolder = this.as;
        if (threeLeafCardViewHolder == null) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "initThreeCircleIcon mThreeLeafCardViewHolder is null");
            return;
        }
        ImageView imageViewG = threeLeafCardViewHolder.g();
        if (imageViewG != null) {
            imageViewG.setBackground(ContextCompat.getDrawable(this.g, R.drawable.icon_three_circle));
            lrd.b(this.as.ax, qre.f(R.string.IDS_three_circle_title));
        }
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard, com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void refreshCardData() {
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "refreshCardData");
        super.refreshCardData();
        tdy.c((ResponseCallback<Boolean>) new ResponseCallback() { // from class: tco
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.d.a(i, (Boolean) obj);
            }
        });
    }

    public /* synthetic */ void a(int i, final Boolean bool) {
        HandlerExecutor.b(new Runnable() { // from class: tcm
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d(bool);
            }
        });
    }

    public /* synthetic */ void d(Boolean bool) {
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "isShowHealthLife callback data：", bool);
        b(bool.booleanValue());
        ab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        if (!this.ab) {
            j(1);
        } else {
            ad();
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        if (this.j) {
            this.j = false;
            this.al.clear();
        } else {
            this.f = true;
            refreshCardData();
        }
        ReleaseLogUtil.d("HL_SCUI_ThreeLeafCardData", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private boolean b(boolean z) {
        ReleaseLogUtil.d("HL_SCUI_ThreeLeafCardData", "checkShowStatus, isHealthLife:", Boolean.valueOf(z), " mIsShowHealthLifeTask:", Boolean.valueOf(this.ab));
        if (this.ab == z) {
            return false;
        }
        this.ab = z;
        ObserverManagerUtil.e(ObserveLabels.HEALTH_LIFE_VERSION, Integer.valueOf(z ? 1 : 0));
        if (this.ab) {
            this.al.add("all");
            aj();
            aa();
        } else {
            ah();
            ac();
            ai();
            ae();
        }
        SharedPreferenceManager.a(String.valueOf(10000), "SP_IS_HEALTH_LIFE_BI", z);
        return true;
    }

    private void aj() {
        if (njy.b(this.ak)) {
            HiHealthNativeApi.a(this.g).unSubscribeHiHealthData(this.ak, new HiUnSubscribeListener() { // from class: tbt
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    LogUtil.a("HL_SCUI_ThreeLeafCardData", "releaseThreeLeaf unSubscribeHiHealthData isSuccess ", Boolean.valueOf(z));
                }
            });
        }
        BroadcastManagerUtil.b(this.g, this.am);
        BroadcastManager.n(this.q);
        ObserverManagerUtil.a("HEALTH_MODEL_CARD_KEY_NEW");
        this.s = new ArrayList();
        this.p = -1;
        this.l = -1;
        this.an = 0;
        this.y = 0;
        this.ao = -1;
        this.k = -1;
        this.ah = -1.0f;
        this.z = -1.0f;
        this.ag = -1.0f;
    }

    private void ac() {
        a(new c(this));
        af();
    }

    private void ah() {
        b bVar = this.ar;
        if (bVar != null) {
            ObserverManagerUtil.a(bVar, ObserveLabels.REFRESH_HEALTH_LIFE);
            this.ar = null;
        }
        this.r = null;
    }

    private void aa() {
        b bVar = new b(this);
        this.ar = bVar;
        ObserverManagerUtil.d(bVar, ObserveLabels.REFRESH_HEALTH_LIFE);
        ThreeLeafCardViewHolder threeLeafCardViewHolder = this.as;
        if (threeLeafCardViewHolder != null) {
            threeLeafCardViewHolder.r();
        }
    }

    public void d(RecyclerView.ViewHolder viewHolder, int i) {
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "onBindViewHolder");
        if (this.j || !this.f || this.as == null) {
            return;
        }
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "isOnResume set false");
        this.f = false;
    }

    private void ag() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("sync_cloud_data_action");
        a aVar = new a(this);
        this.am = aVar;
        BroadcastManagerUtil.e(this.g, aVar, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(final int i) {
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "refreshData");
        ThreeLeafCardViewHolder threeLeafCardViewHolder = this.as;
        if (threeLeafCardViewHolder == null) {
            ReleaseLogUtil.e("R_HL_SCUI_ThreeLeafCardData", "refreshData mThreeLeafCardViewHolder is null");
            return;
        }
        final Clover cloverN = threeLeafCardViewHolder.n();
        if (cloverN == null) {
            ReleaseLogUtil.e("R_HL_SCUI_ThreeLeafCardData", "refreshData clover is null");
        } else {
            this.as.p();
            ThreadPoolManager.c().execute(new Runnable() { // from class: tbu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48957c.c(i, cloverN);
                }
            });
        }
    }

    public /* synthetic */ void c(int i, Clover clover) {
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        ffv.b(iA, new e(this, i, clover));
        ReleaseLogUtil.d("R_HL_SCUI_ThreeLeafCardData", "refreshData dayFormat ", Integer.valueOf(iA), " type ", Integer.valueOf(i));
    }

    static class e implements ResponseCallback<List<HealthLifeTaskBean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f26118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<ThreeLeafCardData> f26119b;
        private WeakReference<Clover> e;

        e(ThreeLeafCardData threeLeafCardData, int i, Clover clover) {
            this.f26119b = new WeakReference<>(threeLeafCardData);
            this.f26118a = i;
            this.e = new WeakReference<>(clover);
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<HealthLifeTaskBean> list) {
            WeakReference<ThreeLeafCardData> weakReference = this.f26119b;
            if (weakReference == null) {
                LogUtil.j("HL_SCUI_ThreeLeafCardData", "GetHealthLifeRecordsCallback onResponse mCardDataReference is null");
                return;
            }
            ThreeLeafCardData threeLeafCardData = weakReference.get();
            if (threeLeafCardData != null) {
                threeLeafCardData.s = list;
                WeakReference<Clover> weakReference2 = this.e;
                if (weakReference2 != null) {
                    threeLeafCardData.a(this.f26118a, weakReference2.get(), threeLeafCardData.i(list));
                    return;
                } else {
                    LogUtil.j("HL_SCUI_ThreeLeafCardData", "GetHealthLifeRecordsCallback onResponse mCloverReference is null");
                    return;
                }
            }
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "GetHealthLifeRecordsCallback onResponse cardData is null");
        }
    }

    public static class d implements ResponseCallback<ffe> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<ThreeLeafCardData> f26117c;
        private List<HealthLifeTaskBean> e;

        d(ThreeLeafCardData threeLeafCardData, List<HealthLifeTaskBean> list) {
            this.f26117c = new WeakReference<>(threeLeafCardData);
            this.e = list;
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, final ffe ffeVar) {
            final ThreeLeafCardData threeLeafCardData = this.f26117c.get();
            if (threeLeafCardData == null) {
                LogUtil.j("HL_SCUI_ThreeLeafCardData", "threeLeafCardData is null");
            } else {
                HandlerExecutor.b(new Runnable() { // from class: tcs
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.b(threeLeafCardData, ffeVar);
                    }
                });
            }
        }

        public /* synthetic */ void b(ThreeLeafCardData threeLeafCardData, ffe ffeVar) {
            LogUtil.a("HL_SCUI_ThreeLeafCardData", "update message");
            threeLeafCardData.b(this.e, ffeVar);
            ffv.d((List<HealthLifeBean>) threeLeafCardData.i(this.e));
            ObserverManagerUtil.e("HEALTH_LIFE_DAY_RECORD", this.e);
        }
    }

    private void t(List<HealthLifeTaskBean> list) {
        if (!this.w.get() || "latestDataDownload".equals(this.m)) {
            b(list);
            boolean zH = BaseApplication.h();
            LogUtil.a("HL_SCUI_ThreeLeafCardData", "sendDayRecord mIsHomeFragmentVisible:", Boolean.valueOf(this.x), " isRunningForeground:", Boolean.valueOf(zH));
            if ("threeLeafCard".equals(tbf.e()) && zH && this.x) {
                if (njy.b(h(list))) {
                    LogUtil.a("HL_SCUI_ThreeLeafCardData", "current day has complete tasks");
                    o(list);
                    return;
                } else {
                    LogUtil.a("HL_SCUI_ThreeLeafCardData", "current day do not have complete tasks");
                    b(list, (ffe) null);
                    ffv.d(i(list));
                    ObserverManagerUtil.e("HEALTH_LIFE_DAY_RECORD", list);
                    return;
                }
            }
            ObserverManagerUtil.e("HEALTH_LIFE_DAY_RECORD", list);
        }
    }

    private void o(final List<HealthLifeTaskBean> list) {
        if (!HandlerExecutor.d()) {
            ffv.c(this.ap, new d(this, list));
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: tbx
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.a(list);
                }
            });
        }
    }

    public /* synthetic */ void a(List list) {
        ffv.c(this.ap, new d(this, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<HealthLifeTaskBean> list, ffe ffeVar) {
        final ArrayList arrayList = new ArrayList();
        tdr tdrVarD = d(list, ffeVar);
        if (tdrVarD != null) {
            arrayList.add(tdrVarD);
        } else {
            tdr tdrVarG = g(list);
            if (tdrVarG != null) {
                arrayList.add(tdrVarG);
            }
        }
        tdr tdrVarM = m(list);
        if (tdrVarM != null) {
            arrayList.add(tdrVarM);
        }
        if (njy.b(arrayList)) {
            HandlerExecutor.c(new Runnable() { // from class: tbs
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c(arrayList);
                }
            }, this.j ? 2000L : 0L);
        }
    }

    public /* synthetic */ void c(List list) {
        this.as.c((List<tdr>) list);
    }

    private tdr d(List<HealthLifeTaskBean> list, ffe ffeVar) {
        if (ffeVar == null || njy.e(ffeVar.d()) || njy.e(list)) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "there is no cons info");
            return null;
        }
        ffv.b(list, ffeVar);
        b(ffeVar, list);
        List<HealthLifeTaskBean> listF = f(list);
        if (njy.e(listF)) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "there is no just-complete tasks");
            return null;
        }
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "getConsCompleteMessage, diffList is ", listF, " data is ", ffeVar.toString());
        return a(listF, ffeVar);
    }

    private void b(ffe ffeVar, List<HealthLifeTaskBean> list) {
        List<HealthLifeStatistic> listD = ffeVar.d();
        List<HealthLifeTaskBean> listC = c(h(list), listD);
        if (njy.e(listC)) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "small card no difflist");
            return;
        }
        HealthLifeTaskBean healthLifeTaskBean = listC.get(qrf.d(listC.size()));
        if (healthLifeTaskBean == null) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "getCompleteMessage bean is null");
            return;
        }
        healthLifeTaskBean.getHealthLifeBean().setContinueDays(c(healthLifeTaskBean, listD));
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "notifySmallCardConsMessage, bean is ", healthLifeTaskBean.toString());
        ObserverManagerUtil.e("HEALTH_LIFE_CONS_INFO", healthLifeTaskBean, ffv.b(listC), Integer.valueOf(ffeVar.c()), a(healthLifeTaskBean.getId(), 1, listC.size() == 1 ? 1 : 2, healthLifeTaskBean, 2));
    }

    private List<HealthLifeTaskBean> c(List<HealthLifeTaskBean> list, List<HealthLifeStatistic> list2) {
        List<Integer> listC = ffv.c(this.ap);
        ArrayList arrayList = new ArrayList();
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "shown ids ", listC);
        if (njy.e(list)) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "completeList is empty");
            return arrayList;
        }
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "completeList is ", list.toString(), " consInfo is ", list2.toString());
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

    private List<HealthLifeTaskBean> e(List<HealthLifeTaskBean> list, ffe ffeVar) {
        if (njy.e(list) || ffeVar == null || njy.e(ffeVar.d())) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "nothing to fliter for big three leaf card");
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

    private tdr a(List<HealthLifeTaskBean> list, ffe ffeVar) {
        List<HealthLifeTaskBean> listE = e(list, ffeVar);
        tdr tdrVarC = null;
        if (njy.e(listE)) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "no diffCons");
            return null;
        }
        int size = listE.size();
        HealthLifeTaskBean healthLifeTaskBean = listE.get(qrf.d(size));
        if (healthLifeTaskBean == null) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "getConsCompleteMessage bean is null");
            return null;
        }
        int size2 = list.size();
        List<HealthLifeStatistic> listD = ffeVar.d();
        String name = healthLifeTaskBean.getName();
        if (healthLifeTaskBean.getId() == 12) {
            name = qre.f(R.string.IDS_bp_measurement_for_cons);
        }
        healthLifeTaskBean.getHealthLifeBean().setContinueDays(c(healthLifeTaskBean, listD));
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "current bean is ", healthLifeTaskBean.toString());
        if (size2 == 1) {
            if (size == 1) {
                tdrVarC = d(listD, healthLifeTaskBean, name, ffeVar.c());
            }
        } else if (size == size2) {
            tdrVarC = c(healthLifeTaskBean, size, name);
        } else if (size == 1) {
            tdrVarC = d(listD, healthLifeTaskBean, name, ffeVar.c());
        } else if (size != 0) {
            if (!this.aj) {
                LogUtil.a("HL_SCUI_ThreeLeafCardData", "already in three leaf card");
                tdrVarC = c(healthLifeTaskBean, size, name);
            } else {
                LogUtil.j("HL_SCUI_ThreeLeafCardData", "just from three circle card");
            }
        }
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "getConsCompleteMessage diffCompleteCount ", Integer.valueOf(size2), " id  ", Integer.valueOf(healthLifeTaskBean.getId()), " message is :", tdrVarC);
        return tdrVarC;
    }

    private tdr c(HealthLifeTaskBean healthLifeTaskBean, int i, String str) {
        tdr tdrVarD = d(healthLifeTaskBean, 2);
        if (LanguageUtil.f(this.g)) {
            c(tdrVarD, qre.e(R.plurals.IDS_multi_task_cons_info, i, UnitUtil.e(i, 1, 0)));
            a(tdrVarD, str, str, healthLifeTaskBean.getColorResourcesId());
            return tdrVarD;
        }
        String strE = qre.e(R.plurals.IDS_multi_tasks_complte, i, UnitUtil.e(i, 1, 0));
        a(tdrVarD, strE, strE, R.color.textColorPrimary);
        return tdrVarD;
    }

    private tdr d(List<HealthLifeStatistic> list, HealthLifeTaskBean healthLifeTaskBean, String str, int i) {
        tdr tdrVarD = d(healthLifeTaskBean, 1);
        int iC = c(healthLifeTaskBean, list);
        if (iC > i) {
            c(tdrVarD, qre.e(R.plurals.IDS_over_max_cons_complte_tips, i, UnitUtil.e(i, 1, 0)));
        } else {
            c(tdrVarD, qre.e(R.plurals.IDS_single_task_cons_info, iC, UnitUtil.e(iC, 1, 0)));
        }
        a(tdrVarD, str, str, healthLifeTaskBean.getColorResourcesId());
        return tdrVarD;
    }

    private int c(HealthLifeTaskBean healthLifeTaskBean, List<HealthLifeStatistic> list) {
        for (HealthLifeStatistic healthLifeStatistic : list) {
            if (healthLifeTaskBean.getId() == healthLifeStatistic.getId()) {
                return healthLifeStatistic.getConDays();
            }
        }
        return 0;
    }

    private tdr d(final HealthLifeTaskBean healthLifeTaskBean, final int i) {
        tdr tdrVar = new tdr();
        tdrVar.e(healthLifeTaskBean.getBackgroundColorResourcesId());
        tdrVar.d(R.dimen.textSizeBody2);
        Drawable drawable = ContextCompat.getDrawable(this.g, healthLifeTaskBean.getIconId());
        if (this.v) {
            drawable = qqz.e(this.g, drawable);
        }
        tdrVar.e(drawable);
        tdrVar.c(AnalyticsValue.HEALTH_LIFE_TASK_COMPLETE_2119097.value());
        final int id = healthLifeTaskBean.getId();
        tdrVar.d(a(id, 0, i, healthLifeTaskBean, 1));
        tdrVar.e(new View.OnClickListener() { // from class: tbq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(id, i, healthLifeTaskBean, view);
            }
        });
        return tdrVar;
    }

    public /* synthetic */ void a(int i, int i2, HealthLifeTaskBean healthLifeTaskBean, View view) {
        this.aa = false;
        lmf.d().c(this.g, AnalyticsValue.HEALTH_LIFE_TASK_COMPLETE_2119097.value(), a(i, 1, i2, healthLifeTaskBean, 1), 0);
        ffv.a(this.o, Uri.parse("").buildUpon().appendQueryParameter("from", "cloverLifeTaskComplete").build());
    }

    private tdr g(List<HealthLifeTaskBean> list) {
        tdr tdrVarD;
        List<HealthLifeTaskBean> listF = f(list);
        if (njy.e(listF)) {
            return null;
        }
        int size = listF.size();
        HealthLifeTaskBean healthLifeTaskBean = listF.get(qrf.d(size));
        if (healthLifeTaskBean == null) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "getCompleteMessage bean is null");
            return null;
        }
        new tdr();
        String name = healthLifeTaskBean.getName();
        if (size == 1) {
            tdrVarD = d(healthLifeTaskBean, 1);
            c(tdrVarD, qre.f(R.string.IDS_life_task_complete));
            a(tdrVarD, name, name, healthLifeTaskBean.getColorResourcesId());
        } else {
            tdr tdrVarD2 = d(healthLifeTaskBean, 2);
            String strE = UnitUtil.e(size, 1, 0);
            if (this.u) {
                a(tdrVarD2, qre.e(R.plurals.IDS_life_task_complete_more_chinese, size, name, strE), name, healthLifeTaskBean.getColorResourcesId());
            } else {
                SpannableString spannableString = new SpannableString(qre.e(R.plurals.IDS_life_task_complete_more, size, strE));
                qri.b(spannableString, spannableString.toString(), R.color.textColorPrimary);
                qri.e(spannableString, spannableString.toString(), R.string.textFontFamilyRegular);
                tdrVarD2.c(spannableString);
            }
            tdrVarD = tdrVarD2;
        }
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "getCompleteMessage diffCompleteCount ", Integer.valueOf(listF.size()), " task  ", tdrVarD.a());
        return tdrVarD;
    }

    private void c(tdr tdrVar, String str) {
        SpannableString spannableString = new SpannableString(str);
        qri.b(spannableString, spannableString.toString(), R.color.textColorPrimary);
        qri.e(spannableString, spannableString.toString(), R.string.textFontFamilyRegular);
        tdrVar.a(spannableString);
    }

    private void a(tdr tdrVar, String str, String str2, int i) {
        SpannableString spannableString = new SpannableString(str);
        qri.b(spannableString, spannableString.toString(), R.color.textColorPrimary);
        qri.e(spannableString, spannableString.toString(), R.string.textFontFamilyRegular);
        qri.b(spannableString, str2, i);
        qri.e(spannableString, str2, R.string.textFontFamilyMedium);
        tdrVar.c(spannableString);
    }

    private List<HealthLifeTaskBean> f(List<HealthLifeTaskBean> list) {
        List<HealthLifeTaskBean> listH = h(list);
        if (njy.e(listH)) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "completeList is empty");
            return null;
        }
        List<HealthLifeTaskBean> listH2 = h(ffv.h());
        int size = listH.size();
        int size2 = listH2.size();
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "getCompleteMessage completeCount ", Integer.valueOf(size), " lastCompleteCount ", Integer.valueOf(size2));
        if (size <= size2) {
            return null;
        }
        HashMap map = new HashMap();
        for (HealthLifeTaskBean healthLifeTaskBean : listH2) {
            if (healthLifeTaskBean != null) {
                map.put(Integer.valueOf(healthLifeTaskBean.getId()), healthLifeTaskBean);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (HealthLifeTaskBean healthLifeTaskBean2 : listH) {
            if (healthLifeTaskBean2 != null && !map.containsKey(Integer.valueOf(healthLifeTaskBean2.getId()))) {
                arrayList.add(healthLifeTaskBean2);
            }
        }
        return arrayList;
    }

    private tdr m(List<HealthLifeTaskBean> list) {
        HealthLifeTaskBean next;
        if (njy.e(list) || !this.aa) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "getReminderMessage list ", list, " mIsSupportShowReminder ", Boolean.valueOf(this.aa));
            return null;
        }
        this.aa = false;
        Pair<Integer, String> pairA = ffv.a(i(l(list)));
        if (pairA == null) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "getReminderMessage pair is null");
            return null;
        }
        Integer num = pairA.first;
        final int iIntValue = num.intValue();
        String str = pairA.second;
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "getReminderMessage id ", num, " tip ", str);
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
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "getReminderMessage bean is null");
            return null;
        }
        tdr tdrVar = new tdr();
        tdrVar.e(next.getBackgroundColorResourcesId());
        tdrVar.d(R.dimen.textSizeBody2);
        Drawable drawable = ContextCompat.getDrawable(this.g, next.getIconId());
        if (this.v) {
            drawable = qqz.e(this.g, drawable);
        }
        tdrVar.e(drawable);
        SpannableString spannableString = new SpannableString(str);
        qri.b(spannableString, spannableString.toString(), R.color.textColorPrimary);
        qri.e(spannableString, spannableString.toString(), R.string.textFontFamilyRegular);
        tdrVar.c(spannableString);
        Drawable drawable2 = ContextCompat.getDrawable(this.g, R.drawable.arrow_right);
        if (drawable2 != null) {
            drawable2 = qqf.c(drawable2, ContextCompat.getColor(this.g, R.color.colorPrimary));
        }
        if (this.v) {
            drawable2 = qqz.e(this.g, drawable2);
        }
        tdrVar.d(drawable2);
        tdrVar.c(AnalyticsValue.HEALTH_LIFE_TASK_REMINDER_2119096.value());
        tdrVar.d(e(iIntValue, 0));
        tdrVar.e(new View.OnClickListener() { // from class: tca
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(iIntValue, view);
            }
        });
        return tdrVar;
    }

    public /* synthetic */ void c(int i, View view) {
        lmf.d().c(this.g, AnalyticsValue.HEALTH_LIFE_TASK_REMINDER_2119096.value(), e(i, 1), 0);
        if (i == 5) {
            s();
        } else if (i == 6) {
            r();
        } else {
            this.aa = false;
            ffv.a(this.o, Uri.parse("").buildUpon().appendQueryParameter("id", String.valueOf(i)).appendQueryParameter("from", "cloverLifeTaskReminder").build());
        }
    }

    private List<HealthLifeTaskBean> h(List<HealthLifeTaskBean> list) {
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

    private List<HealthLifeTaskBean> l(List<HealthLifeTaskBean> list) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void b(final List<HealthLifeTaskBean> list) {
        if (this.as == null) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "refreshBottomData mThreeLeafCardViewHolder null");
            return;
        }
        if (njy.e(list)) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "refreshBottomData list ", list);
            return;
        }
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: tby
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b(list);
                }
            });
            return;
        }
        int size = h(list).size();
        int size2 = list.size();
        this.as.a(size, size2);
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "refreshBottomData mTotalCount ", Integer.valueOf(this.ao), " totalCount ", Integer.valueOf(size2), " mCompleteCount ", Integer.valueOf(this.k), " completeCount ", Integer.valueOf(size));
        if (this.ao != size2 || this.k != size) {
            ffv.y();
        }
        this.ao = size2;
        this.k = size;
    }

    public void a(final int i, final Clover clover, final List<HealthLifeBean> list) {
        if (clover == null || list == null) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "params is null");
        } else {
            HandlerExecutor.b(new Runnable() { // from class: tch
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48967c.d(list, i, clover);
                }
            });
        }
    }

    public /* synthetic */ void d(List list, int i, Clover clover) {
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "refresh data size:", Integer.valueOf(list.size()));
        int iB = ffv.b((List<HealthLifeBean>) list, 1);
        if (this.n != iB) {
            this.n = iB;
            a(this.an, this.l, this.p, this.y);
        }
        d(this.n);
        d(i, clover, (List<HealthLifeBean>) list);
    }

    private void d(int i, Clover clover, List<HealthLifeBean> list) {
        float fC = ffv.c(list, 1);
        float fC2 = ffv.c(list, 2);
        float fC3 = ffv.c(list, 3);
        boolean zB = ffv.b(list, fC, fC3, fC2);
        ReleaseLogUtil.d("HL_SCUI_ThreeLeafCardData", "isSame top:", Float.valueOf(fC), " right:", Float.valueOf(fC2), " left:", Float.valueOf(fC3), " isPerfect:", Boolean.valueOf(zB));
        t(this.s);
        if (d(fC, fC2, fC3, zB)) {
            return;
        }
        this.ad = zB;
        this.ah = fC;
        this.ag = fC2;
        this.z = fC3;
        lua.a(fft.f34005c, "perfect_three_leaf", zB ? System.currentTimeMillis() : 0L);
        if (i == 2) {
            a(clover, fC, fC3, fC2, zB);
        } else {
            c(clover, fC, fC3, fC2, zB);
        }
        b(a(fC, fC2, fC3), zB);
    }

    private void c(Clover clover, List<HealthLifeTaskBean> list) {
        if (clover == null || njy.e(list)) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "params is null");
            return;
        }
        List<HealthLifeBean> listI = i(list);
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "refreshUiWithAnimation size:", Integer.valueOf(listI.size()));
        float fC = ffv.c(listI, 1);
        float fC2 = ffv.c(listI, 2);
        float fC3 = ffv.c(listI, 3);
        boolean zB = ffv.b(listI, fC, fC3, fC2);
        boolean zA = a(fC, fC2, fC3);
        ReleaseLogUtil.d("HL_SCUI_ThreeLeafCardData", "refreshUiWithAnimation isSame top:", Float.valueOf(fC), " right:", Float.valueOf(fC2), " left:", Float.valueOf(fC3), " isPerfect:", Boolean.valueOf(zB), " isVibrancy:", Boolean.valueOf(zA));
        this.ad = zB;
        this.ah = fC;
        this.ag = fC2;
        this.z = fC3;
        if (zB) {
            lua.a(fft.f34005c, "perfect_three_leaf", System.currentTimeMillis());
        }
        b(zA, zB);
    }

    private boolean d(float f, float f2, float f3, boolean z) {
        ReleaseLogUtil.d("HL_SCUI_ThreeLeafCardData", "mLastTop:", Float.valueOf(this.ah), " mLastRight:", Float.valueOf(this.ag), " mLastLeft:", Float.valueOf(this.z), " mLastIsPerfect:", Boolean.valueOf(this.ad));
        return Float.compare(this.ah, f) == 0 && Float.compare(this.ag, f2) == 0 && Float.compare(this.z, f3) == 0 && this.ad == z;
    }

    private void b(boolean z, boolean z2) {
        Context context = this.o;
        if (context == null || context != BaseApplication.j()) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "checkShowFinishTargetAnimation mainActivity is not show");
            return;
        }
        if (!ffv.d("healthLifeThreeLeafSwitch", true)) {
            LogUtil.a("HL_SCUI_ThreeLeafCardData", "animation switch is closed");
        } else if (z2) {
            this.h.d(AchieveTaskHandler.AchieveAniType.THREE_LEAF_PERFECT, new Bundle());
        } else if (z) {
            this.h.d(AchieveTaskHandler.AchieveAniType.THREE_LEAF_ACTIVE, new Bundle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HealthLifeBean> i(List<HealthLifeTaskBean> list) {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            Iterator<HealthLifeTaskBean> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getHealthLifeBean());
            }
        }
        return arrayList;
    }

    private void ae() {
        ThreeLeafCardViewHolder threeLeafCardViewHolder = this.as;
        if (threeLeafCardViewHolder == null) {
            ReleaseLogUtil.e("R_HL_SCUI_ThreeLeafCardData", "initThreeLeafView mThreeLeafCardViewHolder is null");
            return;
        }
        Clover cloverN = threeLeafCardViewHolder.n();
        if (cloverN == null) {
            ReleaseLogUtil.e("R_HL_SCUI_ThreeLeafCardData", "initThreeLeafView clover is null");
            return;
        }
        ReleaseLogUtil.d("R_HL_SCUI_ThreeLeafCardData", "initThreeLeafView");
        cloverN.setMaxOutsideScale(1.02f);
        cloverN.setCloverWithIcon(0.0f, 0.0f, 0.0f);
        List<HealthLifeTaskBean> listB = ffv.b();
        this.s = listB;
        List<HealthLifeBean> listI = i(listB);
        if (njy.b(listI)) {
            HealthLifeBean healthLifeBean = listI.get(0);
            int recordDay = healthLifeBean != null ? healthLifeBean.getRecordDay() : 0;
            int iA = DateFormatUtil.a(System.currentTimeMillis());
            ReleaseLogUtil.d("R_HL_SCUI_ThreeLeafCardData", "initThreeLeafView recordDay ", Integer.valueOf(recordDay), " currentDay ", Integer.valueOf(iA));
            if (recordDay == iA) {
                b(this.s);
            } else {
                this.s = new ArrayList();
                listI = new ArrayList<>();
            }
        }
        this.ah = ffv.c(listI, 1);
        this.ag = ffv.c(listI, 2);
        float fC = ffv.c(listI, 3);
        this.z = fC;
        boolean zB = ffv.b(listI, this.ah, fC, this.ag);
        this.ad = zB;
        if (zB) {
            lua.a(fft.f34005c, "perfect_three_leaf", System.currentTimeMillis());
        }
        b(cloverN, this.ah, this.z, this.ag, this.ad);
        int iB = ffv.b(listI, 1);
        this.n = iB;
        d(iB);
    }

    private void b(Clover clover, float f, float f2, float f3, boolean z) {
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "showCloverWithoutAnimation top:", Float.valueOf(f), " left:", Float.valueOf(f2), " right:", Float.valueOf(f3), " isPerfect:", Boolean.valueOf(z));
        c(clover, z);
        clover.setCloverWithIcon(f, f2, f3);
    }

    private void c(final Clover clover, final float f, final float f2, final float f3, boolean z) {
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "growOneClover top:", Float.valueOf(f), " left:", Float.valueOf(f2), " right:", Float.valueOf(f3), " isPerfect:", Boolean.valueOf(z));
        c(clover, z);
        if (!"threeLeafCard".equals(tbf.e())) {
            clover.setCloverWithIcon(f, f2, f3);
            return;
        }
        if (Float.compare(f, 1.0f) == 0 && Float.compare(f2, 1.0f) == 0 && Float.compare(f3, 1.0f) == 0) {
            clover.setCloverRunAnimator(0.999f, f2, f3);
        } else {
            clover.setCloverRunAnimator(f, f2, f3);
        }
        clover.postDelayed(new Runnable() { // from class: tbp
            @Override // java.lang.Runnable
            public final void run() {
                clover.setCloverWithIcon(f, f2, f3);
            }
        }, 550L);
    }

    private void a(Clover clover, float f, float f2, float f3, boolean z) {
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "growAllClover top:", Float.valueOf(f), " left:", Float.valueOf(f2), " right:", Float.valueOf(f3), " isPerfect:", Boolean.valueOf(z));
        c(clover, z);
        if (!"threeLeafCard".equals(tbf.e())) {
            clover.setCloverWithIcon(f, f2, f3);
        } else {
            clover.setCloverRunGrowAnimator(f, f2, f3);
            clover.setAnimEndListener(new AddFrameListener() { // from class: tcd
                @Override // com.huawei.ucd.cloveranimation.AddFrameListener
                public final void onFinished() {
                    LogUtil.a("HL_SCUI_ThreeLeafCardData", "growAllClover finished.");
                }
            });
        }
    }

    private void c(Clover clover, boolean z) {
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "initClover.");
        ThreeLeafCardViewHolder threeLeafCardViewHolder = this.as;
        if (threeLeafCardViewHolder != null) {
            threeLeafCardViewHolder.p();
        }
        clover.b();
        clover.setPlayAllFrameAnimation(true);
        clover.setAllFull(z);
    }

    private void d(int i) {
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "bindCardData.");
        if (this.as == null) {
            return;
        }
        this.as.b((ffv.n() || njy.b(this.s)) ? 0 : 8, this.ab);
        am();
        if (i == 2) {
            this.as.d(R.string.IDS_settings_steps, this.an, R.plurals.IDS_single_circle_walk_target_desc);
        } else {
            this.as.d(8);
            this.as.d(R.string.IDS_intensity_new, this.y, R.plurals.IDS_single_circle_intensity_target_desc);
        }
        al();
    }

    private void am() {
        HealthLifeTaskBean healthLifeTaskBeanE = e(6);
        if (healthLifeTaskBeanE == null || healthLifeTaskBeanE.getHealthLifeBean() == null) {
            this.as.c(R.string.IDS_hw_show_main_home_page_sleep, R.string.IDS_hw_health_show_healthdata_input, true);
            return;
        }
        HealthLifeBean healthLifeBean = healthLifeTaskBeanE.getHealthLifeBean();
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "wake up:", healthLifeBean.getResult(), " ", Integer.valueOf(healthLifeBean.getRecordDay()), " complete:", Integer.valueOf(healthLifeBean.getComplete()));
        String strD = ffv.d(healthLifeBean.getResult());
        if (healthLifeBean.getComplete() == 3) {
            this.as.c(R.string.IDS_hw_show_main_home_page_sleep, R.string.IDS_plugin_course_completed, false);
        } else if (TextUtils.isEmpty(strD)) {
            this.as.c(R.string.IDS_hw_show_main_home_page_sleep, R.string.IDS_hw_health_show_healthdata_input, true);
        } else {
            this.as.b(R.string.IDS_hw_show_main_home_page_sleep, UnitUtil.e(ffv.b(strD), 129), R.string.IDS_sleep_record_get_up_time);
        }
    }

    private void al() {
        HealthLifeTaskBean healthLifeTaskBeanE = e(5);
        if (healthLifeTaskBeanE == null || healthLifeTaskBeanE.getHealthLifeBean() == null) {
            this.as.e(R.string.IDS_mood);
            this.as.a(R.string.IDS_breath_train);
            return;
        }
        HealthLifeBean healthLifeBean = healthLifeTaskBeanE.getHealthLifeBean();
        if (ffv.c(healthLifeBean)) {
            grv grvVar = (grv) HiJsonUtil.d(healthLifeBean.getExtendInfo(), grv.class);
            int iC = grvVar.c();
            this.as.c(R.string.IDS_mood, iC, wvb.a(iC), ffv.e(grvVar.e()));
            return;
        }
        if (CommonUtil.j(healthLifeBean.getResult()) == 0) {
            this.as.e(R.string.IDS_mood);
            this.as.a(R.string.IDS_breath_train);
        } else {
            this.as.e(R.string.IDS_mood);
            int iJ = CommonUtil.j(healthLifeBean.getResult());
            this.as.a(iJ, qre.e(R.plurals.IDS_breath_task_count, iJ, ""));
        }
    }

    private void h(int i) {
        this.an = i;
        ThreeLeafCardViewHolder threeLeafCardViewHolder = this.as;
        if (threeLeafCardViewHolder == null) {
            LogUtil.e("HL_SCUI_ThreeLeafCardData", "updateStepText null.");
        } else if (this.n == 2) {
            threeLeafCardViewHolder.d(R.string.IDS_settings_steps, this.an, R.plurals.IDS_single_circle_walk_target_desc);
        } else {
            this.aq = UnitUtil.e(i, 1, 0);
        }
    }

    private void g(int i) {
        this.y = i;
        ThreeLeafCardViewHolder threeLeafCardViewHolder = this.as;
        if (threeLeafCardViewHolder == null) {
            LogUtil.e("HL_SCUI_ThreeLeafCardData", "updateIntensityText null.");
        } else if (this.n == 2) {
            this.aq = UnitUtil.e(i, 1, 0);
        } else {
            threeLeafCardViewHolder.d(R.string.IDS_intensity_new, this.y, R.plurals.IDS_single_circle_intensity_target_desc);
        }
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard
    public void f_() {
        super.f_();
        ThreeLeafCardViewHolder threeLeafCardViewHolder = this.as;
        if (threeLeafCardViewHolder == null) {
            ReleaseLogUtil.e("HL_SCUI_ThreeLeafCardData", "handleMessageWhenReferenceNotNull viewHolder is null");
        } else {
            threeLeafCardViewHolder.d(this.n == 2 ? 0 : 8);
        }
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard
    public void b(int i, int[] iArr, int[] iArr2) {
        super.b(i, iArr, iArr2);
        b(iArr, iArr2);
    }

    private void b(int[] iArr, int[] iArr2) {
        boolean z;
        int iA = DateFormatUtil.a(System.currentTimeMillis(), TimeZone.getDefault());
        boolean z2 = true;
        if (this.ap != iA) {
            this.ap = iA;
            ab();
            z = true;
        } else {
            z = false;
        }
        int i = iArr[3];
        int i2 = iArr[0];
        int i3 = iArr[4];
        int i4 = iArr[1];
        String str = this.an + "," + this.l + "," + this.p + "," + this.y;
        String str2 = i + "," + i2 + "," + i3 + "," + i4;
        boolean z3 = this.ac != UnitUtil.f();
        if (str2.equals(str) && !z3) {
            z2 = false;
        }
        if (!this.ab ? !z2 : !(!str2.equals(str) || z3 || !Arrays.equals(this.ae, iArr2))) {
            LogUtil.a("HL_SCUI_ThreeLeafCardData", "newData:", str2, " no need refresh.");
            return;
        }
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "newData:", str2, " lastData:", str, " todayDate:", Integer.valueOf(this.ap));
        this.ac = UnitUtil.f();
        if (this.ab) {
            ReleaseLogUtil.d("R_HL_SCUI_ThreeLeafCardData", "refreshRealDataFromSdk is ShowHealthLifeTask");
            ad();
            this.an = i;
            this.l = i2;
            this.p = i3;
            this.y = i4;
            this.ae = iArr2;
            return;
        }
        a(i, i2, i3, i4);
        if (z) {
            return;
        }
        an();
    }

    private void a(int i, int i2, int i3, int i4) {
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "updateRealSportData tempStep:", Integer.valueOf(i), " tempCalories:", Integer.valueOf(i2), " tempDistance:", Integer.valueOf(i3), " tempIntensity:", Integer.valueOf(i4));
        if (i < 0) {
            ThreeLeafCardViewHolder threeLeafCardViewHolder = this.as;
            if (threeLeafCardViewHolder != null) {
                threeLeafCardViewHolder.d(8);
            }
            i = 0;
        }
        h(i);
        if (i4 < 0) {
            i4 = 0;
        }
        g(i4);
        if (i2 >= 0) {
            this.l = i2;
            this.af = UnitUtil.e(Math.round(i2 * 0.001f), 1, 0);
        }
        if (i3 >= 0) {
            this.p = i3;
        }
    }

    private void an() {
        HealthLifeTaskBean healthLifeTaskBeanE = e(this.n);
        if (healthLifeTaskBeanE == null || healthLifeTaskBeanE.getHealthLifeBean() == null) {
            LogUtil.e("HL_SCUI_ThreeLeafCardData", "updateSportTask null.");
            return;
        }
        HealthLifeBean healthLifeBean = healthLifeTaskBeanE.getHealthLifeBean();
        if (d(healthLifeBean)) {
            lua.f(fft.f34005c, "step_intensity_bean", qqt.b(healthLifeBean));
            ObserverManagerUtil.e("HOME_PAGE_SPORT_TASK_UPDATE", healthLifeBean);
            ThreeLeafCardViewHolder threeLeafCardViewHolder = this.as;
            if (threeLeafCardViewHolder == null || threeLeafCardViewHolder.n() == null) {
                LogUtil.j("HL_SCUI_ThreeLeafCardData", "not init finish.");
            } else {
                d(1, this.as.n(), i(this.s));
            }
        }
    }

    private boolean d(HealthLifeBean healthLifeBean) {
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        int recordDay = healthLifeBean.getRecordDay();
        if (iA != recordDay) {
            ReleaseLogUtil.e("R_HL_SCUI_ThreeLeafCardData", "refreshSportTask currentDay ", Integer.valueOf(iA), " recordDay ", Integer.valueOf(recordDay));
            return false;
        }
        int i = this.n == 2 ? this.an : this.y;
        int complete = healthLifeBean.getComplete();
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "refreshSportTask target:", healthLifeBean.getTarget(), " curValue:", Integer.valueOf(i), " complete:", Integer.valueOf(complete), " mStepInThreeLeaf:", Integer.valueOf(this.ai));
        if (complete <= 0 && i >= CommonUtil.j(healthLifeBean.getTarget())) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            healthLifeBean.setIsUpdated(true);
            healthLifeBean.setTimestamp(jCurrentTimeMillis);
            healthLifeBean.setComplete(1);
            healthLifeBean.setTimeZone(lsl.q(jCurrentTimeMillis));
            healthLifeBean.setSyncStatus(0);
        } else if (i == CommonUtil.j(healthLifeBean.getResult())) {
            LogUtil.d("HL_SCUI_ThreeLeafCardData", "no need refreshSportTask");
        } else {
            healthLifeBean.setIsUpdated(true);
            healthLifeBean.setSyncStatus(0);
        }
        int iJ = CommonUtil.j(healthLifeBean.getResult());
        healthLifeBean.setResult(Integer.toString(i));
        return c(healthLifeBean, iJ, complete);
    }

    private boolean c(HealthLifeBean healthLifeBean, int i, int i2) {
        boolean z = true;
        if (this.n == 2) {
            if (this.an - this.ai <= 50 && ((i2 > 0 || healthLifeBean.getComplete() <= 0) && (i != 0 || this.an <= 0))) {
                z = false;
            }
            if (Math.abs(this.an - this.ai) > 50) {
                this.ai = this.an;
            }
        }
        return z;
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        HealthModelApi healthModelApiC = ffv.c();
        if (view == null || healthModelApiC == null) {
            LogUtil.e("HL_SCUI_ThreeLeafCardData", "onClick view == null");
            return;
        }
        ReleaseLogUtil.d("HL_SCUI_ThreeLeafCardData", "onClick view ", view);
        if (qrs.e(view)) {
            return;
        }
        int id = view.getId();
        if (id == R.id.stepLayout || id == R.id.data_layout_sleep_array || id == R.id.data_layout_step_layout) {
            r();
            return;
        }
        if (id == R.id.time_strength_layout) {
            y();
            return;
        }
        if (id == R.id.activityLayout || id == R.id.data_layout_emotion_pressure || id == R.id.data_layout_emotion_breath_count || id == R.id.data_layout_emotion_breath_array) {
            s();
            return;
        }
        if (id == R.id.three_leaf_layout || id == R.id.three_leaf_layout_inflated || id == R.id.three_leaf_default_layout || id == R.id.three_leaf_default_layout_inflated) {
            a("cloverLife");
            return;
        }
        if (id == R.id.bottom_step_layout || id == R.id.bottom_step_layout_2 || id == R.id.bottom_step_value) {
            a("HOME_HEALTH_LIFE_COMPLETE_TODAY");
        } else if (id != R.id.hw_health_fitness_data_origin_icon2_layout || this.as.c() == null) {
            LogUtil.a("HL_SCUI_ThreeLeafCardData", "click others.");
        } else {
            k();
        }
    }

    private void a(String str) {
        ThreeLeafCardViewHolder threeLeafCardViewHolder;
        this.aa = false;
        if (this.ab && (threeLeafCardViewHolder = this.as) != null && threeLeafCardViewHolder.m().getVisibility() == 0 && !LoginInit.getInstance(this.o).isBrowseMode()) {
            ReleaseLogUtil.d("R_HL_SCUI_ThreeLeafCardData", "jumpToHealthModel to health life GuidePage");
            H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
            builder.addPath("#/GuidePage?entrance=enter_healthclovers_page");
            ddv.b().loadH5ProApp(this.o, "com.huawei.health.h5.health-clovers", builder);
        } else {
            ffv.a(this.o, Uri.parse("").buildUpon().appendQueryParameter("from", str).appendQueryParameter("entrance", "enter_healthclovers_page").build());
        }
        if (this.ab) {
            ThreeLeafCardViewHolder threeLeafCardViewHolder2 = this.as;
            sqw.e("h1", "cloverLife", Boolean.valueOf(threeLeafCardViewHolder2 == null || threeLeafCardViewHolder2.m() == null || this.as.m().getVisibility() != 0));
        }
    }

    private void r() {
        HealthLifeTaskBean healthLifeTaskBeanE = e(6);
        if (healthLifeTaskBeanE == null) {
            d(3, false, false);
            ffv.b(this.o, (HealthLifeTaskBean) null, "inputSleepDialog", (ResponseCallback<HealthLifeTaskBean>) null);
            return;
        }
        HealthLifeBean healthLifeBean = healthLifeTaskBeanE.getHealthLifeBean();
        if (healthLifeBean == null) {
            d(3, false, false);
            ffv.b(this.o, healthLifeTaskBeanE, "inputSleepDialog", (ResponseCallback<HealthLifeTaskBean>) null);
            return;
        }
        d(3, healthLifeBean.getComplete() > 0, false);
        if (TextUtils.isEmpty(ffv.d(healthLifeBean.getResult()))) {
            ffv.b(this.o, healthLifeTaskBeanE, "inputSleepDialog", (ResponseCallback<HealthLifeTaskBean>) null);
            return;
        }
        Intent intent = new Intent(this.g, (Class<?>) KnitSleepDetailActivity.class);
        intent.putExtra("from", 2);
        iov.d(this.o, intent);
    }

    private void y() {
        if (this.n == 2) {
            q();
            return;
        }
        HealthLifeTaskBean healthLifeTaskBeanE = e(3);
        if (healthLifeTaskBeanE == null) {
            ReleaseLogUtil.e("R_HL_SCUI_ThreeLeafCardData", "clickStepOrIntensityArea intensityTask is null mBaseSportTaskId ", Integer.valueOf(this.n));
        } else if (healthLifeTaskBeanE.getComplete() > 0) {
            t();
        } else {
            ffv.b(this.o, healthLifeTaskBeanE, "cloverLife", (ResponseCallback<HealthLifeTaskBean>) new ResponseCallback() { // from class: tcl
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.e.d(i, (HealthLifeTaskBean) obj);
                }
            });
        }
    }

    public /* synthetic */ void d(int i, HealthLifeTaskBean healthLifeTaskBean) {
        if (i == 3) {
            j(1);
        }
    }

    private void s() {
        HealthLifeTaskBean healthLifeTaskBeanE = e(5);
        if (healthLifeTaskBeanE == null) {
            d(2, false, false);
            ddv.b().loadH5ProApp(this.o, "com.huawei.health.h5.breath-training", null);
            return;
        }
        HealthLifeBean healthLifeBean = healthLifeTaskBeanE.getHealthLifeBean();
        boolean zC = ffv.c(healthLifeBean);
        d(2, healthLifeTaskBeanE.getComplete() > 0, zC);
        if (!zC && CommonUtils.j(healthLifeBean.getResult()) <= 0) {
            ddv.b().loadH5ProApp(this.o, "com.huawei.health.h5.breath-training", null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("type", 2);
        uye.a(this.o, bundle);
    }

    private HealthLifeTaskBean e(int i) {
        List<HealthLifeTaskBean> list = this.s;
        if (njy.e(list)) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "getHealthLifeTaskById list ", list);
            return null;
        }
        for (HealthLifeTaskBean healthLifeTaskBean : list) {
            if (healthLifeTaskBean != null && healthLifeTaskBean.getHealthLifeBean() != null && healthLifeTaskBean.getId() == i) {
                return healthLifeTaskBean;
            }
        }
        return null;
    }

    private HealthLifeBean c(int i) {
        HealthLifeTaskBean healthLifeTaskBeanE = e(ffv.b(i(this.s), i));
        if (healthLifeTaskBeanE == null) {
            return new HealthLifeBean();
        }
        HealthLifeBean healthLifeBean = healthLifeTaskBeanE.getHealthLifeBean();
        return healthLifeBean == null ? new HealthLifeBean() : healthLifeBean;
    }

    private void d(int i, boolean z, boolean z2) {
        HashMap map = new HashMap(4);
        map.put("click", 1);
        if (i == 2) {
            map.put("type", "moods");
            map.put("hasStressData", Boolean.valueOf(z2));
        } else if (i == 3) {
            map.put("type", "sleep");
        } else {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "setBiEventForClick type ", Integer.valueOf(i));
        }
        map.put("cloverCardStatus", Integer.valueOf(!z ? 1 : 0));
        lmf.d().c(this.g, AnalyticsValue.HEALTH_CLOVER_LIFE_2010119.value(), map, 0);
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard
    public void b() {
        if ("threeLeafCard".equals(tbf.e())) {
            x();
            u();
            w();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0045 A[PHI: r1
      0x0045: PHI (r1v5 int) = (r1v4 int), (r1v11 int) binds: [B:12:0x0043, B:9:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    private void x() {
        int i;
        float f;
        HealthLifeBean healthLifeBeanC = c(1);
        int id = healthLifeBeanC.getId();
        int iJ = CommonUtils.j(healthLifeBeanC.getTarget());
        if (id <= 0 || iJ <= 0) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "exitBiForSport sport ", healthLifeBeanC);
            return;
        }
        HashMap map = new HashMap(3);
        map.put("click", 1);
        int iJ2 = CommonUtils.j(healthLifeBeanC.getResult());
        if (id == 2) {
            map.put(ParsedFieldTag.TASK_TYPE, "walk");
            i = this.an;
            if (i > 0) {
                f = i;
            } else {
                f = iJ2;
            }
        } else {
            map.put(ParsedFieldTag.TASK_TYPE, "MVPA");
            i = this.y;
            if (i > 0) {
                f = i;
            } else {
                f = iJ2;
            }
        }
        map.put("taskFinishRate", Double.valueOf(UnitUtil.d((f / iJ) * 100.0f, 0)));
        lmf.d().c(this.g, AnalyticsValue.HEALTH_EXIT_APP_MODE_COMPLETE_2010117.value(), map, 0);
    }

    private void u() {
        HealthLifeBean healthLifeBeanC = c(2);
        if (healthLifeBeanC.getId() <= 0) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "exitBiForMood mood ", healthLifeBeanC);
            return;
        }
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put(ParsedFieldTag.TASK_TYPE, "moods");
        map.put("taskFinishRate", Integer.valueOf(healthLifeBeanC.getComplete() <= 0 ? 0 : 100));
        lmf.d().c(this.g, AnalyticsValue.HEALTH_EXIT_APP_MODE_COMPLETE_2010117.value(), map, 0);
    }

    private void w() {
        HealthLifeBean healthLifeBeanC = c(3);
        if (healthLifeBeanC.getId() <= 0) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "exitBiForSlumber slumber ", healthLifeBeanC);
            return;
        }
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put(ParsedFieldTag.TASK_TYPE, "sleep");
        map.put("taskFinishRate", Integer.valueOf(healthLifeBeanC.getComplete() <= 0 ? 0 : 100));
        lmf.d().c(this.g, AnalyticsValue.HEALTH_EXIT_APP_MODE_COMPLETE_2010117.value(), map, 0);
    }

    private void e(Map<String, Object> map, int i, int i2) {
        map.put("click", 1);
        map.put("planType", Integer.valueOf(ffv.g()));
        map.put(ParsedFieldTag.TASK_TYPE, Integer.valueOf(i));
        map.put("event", Integer.valueOf(i2));
    }

    private Map<String, Object> e(int i, int i2) {
        HashMap map = new HashMap(4);
        e(map, i, i2);
        return map;
    }

    private Map<String, Object> a(int i, int i2, int i3, HealthLifeTaskBean healthLifeTaskBean, int i4) {
        HashMap map = new HashMap(5);
        e(map, i, i2);
        map.put("reminderType", Integer.valueOf(i3));
        map.put("from", Integer.valueOf(i4));
        map.put("continuumDays", Integer.valueOf(healthLifeTaskBean.getHealthLifeBean().getContinueDays()));
        return map;
    }

    protected void a() {
        Context context = this.o;
        View.OnClickListener onClickListenerB = context instanceof BaseActivity ? qji.b(this, (BaseActivity) context, true, "") : this;
        ThreeLeafCardViewHolder threeLeafCardViewHolder = this.as;
        if (threeLeafCardViewHolder == null) {
            LogUtil.a("HL_SCUI_ThreeLeafCardData", "BaseCardViewHolder is null");
            return;
        }
        d(threeLeafCardViewHolder.k());
        d(this.as.m());
        this.as.c(onClickListenerB);
        m();
    }

    private void d(View view) {
        if (view == null) {
            ReleaseLogUtil.e("R_HL_SCUI_ThreeLeafCardData", "setOnClickListener view is null");
        } else {
            view.setOnClickListener(new View.OnClickListener() { // from class: tcp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f48971a.a(view2);
                }
            });
        }
    }

    public /* synthetic */ void a(View view) {
        if (LoginInit.getInstance(this.o).isBrowseMode()) {
            LoginInit.getInstance(this.o).browsingToLogin(new IBaseResponseCallback() { // from class: tcb
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    ReleaseLogUtil.e("HL_SCUI_ThreeLeafCardData", "setOnClickListener login result = ", Integer.valueOf(i));
                }
            }, "");
        } else {
            a("cloverLife");
        }
    }

    private void ai() {
        ThreeLeafCardViewHolder threeLeafCardViewHolder = this.as;
        if (threeLeafCardViewHolder == null) {
            ReleaseLogUtil.e("HL_SCUI_ThreeLeafCardData", "initThreeLeafDataClickListener mThreeLeafCardViewHolder is null");
            return;
        }
        threeLeafCardViewHolder.d(0, new View.OnClickListener() { // from class: tce
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(view);
            }
        });
        this.as.d(1, new View.OnClickListener() { // from class: tci
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48968a.b(view);
            }
        });
        this.as.d(2, new View.OnClickListener() { // from class: tcg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        });
    }

    public /* synthetic */ void c(View view) {
        ReleaseLogUtil.d("HL_SCUI_ThreeLeafCardData", "onClick first item ");
        if (qrs.e(view)) {
            ReleaseLogUtil.e("HL_SCUI_ThreeLeafCardData", "Fast click first item ");
        } else {
            r();
        }
    }

    public /* synthetic */ void b(View view) {
        ReleaseLogUtil.d("HL_SCUI_ThreeLeafCardData", "onClick second item ");
        if (qrs.e(view)) {
            ReleaseLogUtil.e("HL_SCUI_ThreeLeafCardData", "Fast click second item ");
        } else {
            y();
        }
    }

    public /* synthetic */ void e(View view) {
        ReleaseLogUtil.d("HL_SCUI_ThreeLeafCardData", "onClick third item ");
        if (qrs.e(view)) {
            ReleaseLogUtil.e("HL_SCUI_ThreeLeafCardData", "Fast click third item ");
        } else {
            s();
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onConfigurationChanged(Configuration configuration) {
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "oonConfigurationChanged");
        this.s = new ArrayList();
        this.p = -1;
        this.l = -1;
        this.an = 0;
        this.y = 0;
        super.onConfigurationChanged(configuration);
        ThreeLeafCardViewHolder threeLeafCardViewHolder = this.as;
        if (threeLeafCardViewHolder == null) {
            LogUtil.a("HL_SCUI_ThreeLeafCardData", "onConfigurationChanged holder is null");
        } else {
            threeLeafCardViewHolder.o();
        }
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard
    public CardViewBaseHolder d() {
        return this.as;
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard, com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onDestroy() {
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "onDestroy");
        super.onDestroy();
        if (njy.b(this.ak)) {
            HiHealthNativeApi.a(this.g).unSubscribeHiHealthData(this.ak, new HiUnSubscribeListener() { // from class: tcr
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    LogUtil.a("HL_SCUI_ThreeLeafCardData", "onDestroy unSubscribeHiHealthData isSuccess ", Boolean.valueOf(z));
                }
            });
        }
        tuv.a();
        BroadcastManagerUtil.b(this.g, this.am);
        BroadcastManager.n(this.q);
        ObserverManagerUtil.a("HEALTH_MODEL_CARD_KEY_NEW");
        ThreeLeafCardViewHolder threeLeafCardViewHolder = this.as;
        if (threeLeafCardViewHolder != null) {
            threeLeafCardViewHolder.q();
        }
        ah();
    }

    public void g() {
        this.as.n().setCloverCutValuesWithAnim(0.0f, 0.0f, 0.0f);
    }

    public void f() {
        if (this.ab) {
            LogUtil.a("HL_SCUI_ThreeLeafCardData", "refreshUiForVisible IsShowHealthLifeTask");
            ad();
            return;
        }
        int iB = ffv.b(i(this.s), 1);
        this.n = iB;
        d(iB);
        a(this.an, this.l, this.p, this.y);
        if (njy.e(this.s)) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "refreshUiForVisible mHealthLifeTaskList ", this.s);
            return;
        }
        List<HealthLifeBean> listI = i(this.s);
        LogUtil.a("HL_SCUI_ThreeLeafCardData", "refreshUiForVisible list ", listI);
        float fC = ffv.c(listI, 1);
        float fC2 = ffv.c(listI, 2);
        float fC3 = ffv.c(listI, 3);
        boolean zB = ffv.b(listI, fC, fC3, fC2);
        ReleaseLogUtil.d("HL_SCUI_ThreeLeafCardData", "refreshUiForVisible top:", Float.valueOf(fC), " right:", Float.valueOf(fC2), " left:", Float.valueOf(fC3), " isPerfect:", Boolean.valueOf(zB));
        this.ad = zB;
        this.ah = fC;
        this.ag = fC2;
        this.z = fC3;
        b(this.as.n(), fC, fC3, fC2, zB);
    }

    public void o() {
        if (this.ab) {
            return;
        }
        c(this.as.n(), this.s);
    }

    public void h() {
        if (this.ab) {
            return;
        }
        g();
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard
    protected void e() {
        this.x = true;
        this.as.d(false);
    }

    @Override // com.huawei.ui.homehealth.threecirclecard.TwoModelBaseCard
    public void b(String str, int i) {
        if ("threeLeafCard".equals(str) && this.i != null) {
            this.i.d(str, i);
            this.aj = false;
        }
        ThreeLeafCardViewHolder threeLeafCardViewHolder = this.as;
        if (threeLeafCardViewHolder == null) {
            LogUtil.j("HL_SCUI_ThreeLeafCardData", "afterStepCardChange mThreeLeafCardViewHolder is null");
            return;
        }
        HealthTextView healthTextView = threeLeafCardViewHolder.ab;
        if (healthTextView != null && healthTextView.getVisibility() == 0) {
            Context context = this.o;
            int iA = DateFormatUtil.a(System.currentTimeMillis());
            SharedPreferenceManager.e(context, String.valueOf(10000), "SP_PERFECT_RED_POINT", String.valueOf(iA), new StorageParams());
        }
        if ("threeCircleCard".equals(str)) {
            this.aj = true;
            this.as.d(true);
        }
        this.as.c(8);
        lrd.b(this.as.ax, 8);
    }

    private void a(HiSubscribeListener hiSubscribeListener) {
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
        HiHealthNativeApi.a(this.g).subscribeHiHealthData(arrayList, hiSubscribeListener);
    }

    public void c(boolean z) {
        if (this.as != null) {
            this.x = z;
            this.as.e(BaseApplication.h() && z);
        }
    }
}
