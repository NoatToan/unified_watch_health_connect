package com.huawei.ui.main.stories.health.sleep;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.media3.common.PlaybackException;
import androidx.work.PeriodicWorkRequest;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.android.gms.fitness.FitnessStatusCodes;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.knit.data.MajorProvider;
import com.huawei.health.knit.section.chart.CoreSleepDayDetailView;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.manager.util.TimeUtil;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.SleepDailyProcessResultCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarActivity;
import com.huawei.ui.commonui.calendarview.HealthDataMarkDateTrigger;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementJsUtil;
import defpackage.ecu;
import defpackage.eey;
import defpackage.fra;
import defpackage.ftu;
import defpackage.gxd;
import defpackage.gxq;
import defpackage.idy;
import defpackage.lsl;
import defpackage.lsm;
import defpackage.ltb;
import defpackage.njy;
import defpackage.nkb;
import defpackage.oxi;
import defpackage.qec;
import defpackage.qqk;
import defpackage.qre;
import defpackage.qrk;
import defpackage.uag;
import defpackage.uay;
import defpackage.uck;
import defpackage.uif;
import defpackage.uig;
import defpackage.uik;
import defpackage.ujd;
import defpackage.ukb;
import defpackage.uyt;
import defpackage.uzi;
import defpackage.uzo;
import defpackage.wud;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class SleepDayBarChartProvider extends MajorProvider<gxq> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static uik f28055b;
    private boolean ab;
    private Boolean ac;
    private int ad;
    private boolean af;
    private Observer aj;
    private boolean ak;
    private SectionBean ap;
    private int au;
    private long av;
    private String aw;
    private String ax;
    private int az;
    private g ba;
    private long bc;
    private boolean j;
    private e l;
    private HealthCalendar m;
    private Date p;
    private h q;
    private CustomViewDialog r;
    private WeakReference<Context> s;
    private Handler u;
    private int v;
    private String y;
    public static List<String> e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<String> f28054a = new CopyOnWriteArrayList();
    public static List<String> d = new CopyOnWriteArrayList();
    private static final Object i = new Object();
    private static String h = "0";
    public Map<String, Object> g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gxq f28056c = new gxq(SleepViewConstants.ViewTypeEnum.DAY);
    private List<String> an = new ArrayList(16);
    private final Handler ay = new a(this);
    private long o = 0;
    private boolean ae = false;
    private boolean z = true;
    private CopyOnWriteArrayList<uig> at = new CopyOnWriteArrayList<>();
    private float al = 0.0f;
    private float am = 0.0f;
    private boolean f = true;
    private boolean ai = false;
    private List<fra> n = new CopyOnWriteArrayList();
    private List<uif> w = new ArrayList();
    private HandlerThread bb = null;
    private BroadcastReceiver as = new BroadcastReceiver() { // from class: com.huawei.ui.main.stories.health.sleep.SleepDayBarChartProvider.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("SleepDayBarChartProvider", "receiver mRefreshReceiver");
            SleepDayBarChartProvider.this.ay.sendEmptyMessage(25);
        }
    };
    private BroadcastReceiver ar = new BroadcastReceiver() { // from class: com.huawei.ui.main.stories.health.sleep.SleepDayBarChartProvider.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.a("SleepDayBarChartProvider", "mProcessRateReceiver.intent == null.");
                return;
            }
            int intExtra = intent.getIntExtra("core_sleep_sync_status", 0);
            if (ltb.m(SleepDayBarChartProvider.this.p) == ltb.m(ltb.b())) {
                Message messageObtain = Message.obtain();
                ReleaseLogUtil.d("R_Sleep_SleepDayBarChartProvider", "mProcessRateReceiver results = ", Integer.valueOf(intExtra));
                messageObtain.what = 5000;
                messageObtain.obj = Integer.valueOf(intExtra);
                SleepDayBarChartProvider.this.ay.sendMessageDelayed(messageObtain, intExtra == 1010 ? 0L : 1000L);
            }
        }
    };
    private Set<String> x = new HashSet();
    private boolean ah = false;
    private boolean ag = false;
    private boolean aa = false;
    private Set<String> ao = Collections.synchronizedSet(new HashSet());
    private int k = 0;
    private IBaseResponseCallback aq = new d(this);
    private BroadcastReceiver t = new BroadcastReceiver() { // from class: com.huawei.ui.main.stories.health.sleep.SleepDayBarChartProvider.7
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("SleepDayBarChartProvider", "receive commonSleep success.");
            int iB = qqk.c().b();
            LogUtil.a("SleepDayBarChartProvider", "currentRate = ", Integer.valueOf(iB));
            if (iB > 0 && iB < 100) {
                LogUtil.a("SleepDayBarChartProvider", "isSyncing coreSleep now, don't refresh page.");
                return;
            }
            if (SleepDayBarChartProvider.this.e() instanceof KnitSleepDetailActivity) {
                boolean zB = ((KnitSleepDetailActivity) SleepDayBarChartProvider.this.e()).b();
                LogUtil.a("SleepDayBarChartProvider", "goto refresh common sleep data. isHasCoreSleepData: ", Boolean.valueOf(zB));
                boolean zIsSyncing = qec.e().isSyncing();
                LogUtil.a("SleepDayBarChartProvider", "isSyncing: ", Boolean.valueOf(zIsSyncing));
                if (zB || zIsSyncing) {
                    return;
                }
                qqk.c().d(100);
                SleepDayBarChartProvider.this.b(false);
            }
        }
    };

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public /* synthetic */ void parseParams(Context context, HashMap map, Object obj) {
        d(context, (HashMap<String, Object>) map, (gxq) obj);
    }

    public int a() {
        return this.v;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        LogUtil.a("SleepDayBarChartProvider", "loadData");
        this.s = new WeakReference<>(context);
        this.ap = sectionBean;
        this.q = new h(this);
        this.l = new e(this);
        f28055b = new uik();
        this.ai = false;
        this.ae = false;
        ftu.c().c(context);
        if (this.z) {
            u();
            j();
            r();
            ar();
            ad();
            ai();
            n();
            uzo.b(e(), this.ay);
            av();
            ObserverManagerUtil.d(new Observer() { // from class: uzc
                @Override // com.huawei.haf.design.pattern.Observer
                public final void notify(String str, Object[] objArr) {
                    this.e.c(str, objArr);
                }
            }, "FINISH_SLEEP_TAG");
            Observer observer = new Observer() { // from class: uza
                @Override // com.huawei.haf.design.pattern.Observer
                public final void notify(String str, Object[] objArr) {
                    this.d.b(str, objArr);
                }
            };
            this.aj = observer;
            ObserverManagerUtil.d(observer, "SLEEP_MESSAGE_JUMP_TAG");
        }
    }

    public /* synthetic */ void b(String str, Object[] objArr) {
        LogUtil.a("SleepDayBarChartProvider", "notify mMessageJumpObserver!");
        if (!njy.c(objArr, 0)) {
            LogUtil.a("SleepDayBarChartProvider", "null args!");
            return;
        }
        Date dateB = ltb.b();
        Object obj = objArr[0];
        if (obj instanceof String) {
            try {
                dateB = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse((String) obj);
            } catch (ParseException e2) {
                LogUtil.a("SleepDayBarChartProvider", "parse exception = ", e2.getMessage());
            }
            e(dateB);
            return;
        }
        if (obj instanceof Long) {
            long jB = TimeUtil.b(((Long) obj).longValue());
            if (njy.c(objArr, 1)) {
                Object obj2 = objArr[1];
                if ((obj2 instanceof Boolean) && ((Boolean) obj2).booleanValue()) {
                    LogUtil.a("SleepDayBarChartProvider", "notify mMessageJumpObserver, isFromDeleteData");
                    Date date = new Date();
                    date.setTime(jB);
                    e(date);
                }
            }
        }
    }

    public Context e() {
        WeakReference<Context> weakReference = this.s;
        if (weakReference == null) {
            return BaseApplication.getContext();
        }
        Context context = weakReference.get();
        return context == null ? BaseApplication.getContext() : context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(String str, Object[] objArr) {
        LogUtil.a("SleepDayBarChartProvider", "notify received! label: ", str);
        Date dateB = ltb.b();
        if (!njy.c(objArr, 0)) {
            LogUtil.a("SleepDayBarChartProvider", "null args!");
            return;
        }
        Object obj = objArr[0];
        if (obj instanceof String) {
            try {
                dateB = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse((String) obj);
            } catch (ParseException e2) {
                LogUtil.a("SleepDayBarChartProvider", "parse exception = ", e2.getMessage());
            }
            e(dateB);
            return;
        }
        if (obj instanceof Long) {
            e(new Date(TimeUtil.b(((Long) obj).longValue())));
            Context context = this.s.get();
            if (context instanceof KnitSleepDetailActivity) {
                final KnitSleepDetailActivity knitSleepDetailActivity = (KnitSleepDetailActivity) context;
                HandlerExecutor.b(new Runnable() { // from class: uyv
                    @Override // java.lang.Runnable
                    public final void run() {
                        knitSleepDetailActivity.getViewPager().setCurrentItem(0);
                    }
                });
                return;
            }
            return;
        }
        LogUtil.a("SleepDayBarChartProvider", "wrong args!");
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        this.o = System.currentTimeMillis();
        ReleaseLogUtil.d("R_Sleep_SleepDayBarChartProvider", "LoadDefaultData");
        LogUtil.a("SleepDayBarChartProvider", "LoadDefaultData:", this);
        k();
        sectionBean.c(this.f28056c);
    }

    private void k() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: uyw
            @Override // java.lang.Runnable
            public final void run() {
                ddv.b().initH5Pro();
            }
        });
    }

    public void d(Context context, HashMap<String, Object> map, gxq gxqVar) {
        uzo.b(map, this);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        LogUtil.a("SleepDayBarChartProvider", "onDestroy");
        HashMap map = new HashMap(16);
        map.put("startTime", Long.valueOf(System.currentTimeMillis()));
        map.put("time", Long.valueOf(SystemClock.elapsedRealtime() - this.o));
        a(map);
        idy.b(AnalyticsValue.HEALTH_SLEEP_CORE_SLEEP_TIME_21300031.value(), map);
        ObserverManagerUtil.a("SLEEP_SYNC_RATE");
        ObserverManagerUtil.a(this.aj, "SLEEP_MESSAGE_JUMP_TAG");
        uzo.c(this.ag, this.ar, e(), this.as, this.t);
        Map<String, Object> map2 = this.g;
        if (map2 != null) {
            map2.clear();
        }
        ab();
        this.ay.removeCallbacksAndMessages(null);
        g gVar = this.ba;
        if (gVar == null || !njy.b(gVar.f28071c)) {
            return;
        }
        HiHealthNativeApi.a(e()).unSubscribeHiHealthData(this.ba.f28071c, null);
    }

    private void ab() {
        Handler handler = this.u;
        if (handler == null || this.bb == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.bb.quitSafely();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        super.onResume();
        LogUtil.a("SleepDayBarChartProvider", "onresume");
        if (!this.z || !ltb.ac(this.p)) {
            b(this.p, "TYPE_ON_RESUME", uag.c((Boolean) false).booleanValue());
        }
        ObserverManagerUtil.e("CHART_START_END_TIME", Long.valueOf(lsl.a(lsl.d(this.p.getTime(), -1), 20, 0)), Long.valueOf(lsl.a(this.p.getTime(), 20, 0)));
    }

    static class f implements SleepDailyProcessResultCallback<gxd> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<String> f28066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<SleepDayBarChartProvider> f28067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Date f28068c;

        public f(SleepDayBarChartProvider sleepDayBarChartProvider, Set<String> set, Date date) {
            this.f28067b = new WeakReference<>(sleepDayBarChartProvider);
            this.f28068c = date;
            this.f28066a = set;
        }

        @Override // com.huawei.hwbasemgr.SleepDailyProcessResultCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, gxd gxdVar) {
            Date date;
            ReleaseLogUtil.d("R_Sleep_SleepDayBarChartProvider", "Get result,mDate is ", this.f28068c, " errorCode:", Integer.valueOf(i), " result is null, ", Boolean.valueOf(gxdVar == null));
            Set<String> set = this.f28066a;
            if (set != null) {
                set.add("TYPE_DAILY_RESULT");
            }
            SleepDayBarChartProvider sleepDayBarChartProvider = this.f28067b.get();
            if (sleepDayBarChartProvider == null) {
                ReleaseLogUtil.a("R_Sleep_SleepDayBarChartProvider", "WeakReference is null");
                return;
            }
            if (i != 0 || gxdVar == null) {
                LogUtil.j("SleepDayBarChartProvider", "SleepDailyProcessResult failed!!");
                Date date2 = this.f28068c;
                if (date2 == null || !date2.equals(sleepDayBarChartProvider.p)) {
                    return;
                }
                sleepDayBarChartProvider.c();
                return;
            }
            gxq gxqVar = sleepDayBarChartProvider.f28056c;
            if (gxqVar != null && (date = this.f28068c) != null && date.equals(sleepDayBarChartProvider.p)) {
                LogUtil.a("SleepDayBarChartProvider", "getDailyProcessResult, currentDay is ", sleepDayBarChartProvider.p);
                uzo.c(gxqVar.m(), "MGMT_DAILY_SLEEP_PROCESS", gxdVar);
                uzo.c(sleepDayBarChartProvider.g, "MGMT_DAILY_SLEEP_PROCESS", gxdVar);
                sleepDayBarChartProvider.c();
                return;
            }
            ReleaseLogUtil.e("R_Sleep_SleepDayBarChartProvider", "Data or Date is null", Boolean.valueOf(gxqVar == null), Boolean.valueOf(this.f28068c == null), " currentDay = ", sleepDayBarChartProvider.p);
        }
    }

    public static class j implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f28073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<SleepDayBarChartProvider> f28074b;
        private final Date d;

        public j(SleepDayBarChartProvider sleepDayBarChartProvider, String str, Date date) {
            this.f28074b = new WeakReference<>(sleepDayBarChartProvider);
            this.f28073a = str;
            this.d = date;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ReleaseLogUtil.d("R_Sleep_SleepDayBarChartProvider", "Get open status,type is ", this.f28073a);
            final SleepDayBarChartProvider sleepDayBarChartProvider = this.f28074b.get();
            if (sleepDayBarChartProvider == null) {
                ReleaseLogUtil.a("R_Sleep_SleepDayBarChartProvider", "SleepManagerStateCallBack provider is null.");
                return;
            }
            final boolean z = i == 0 && (obj instanceof Boolean) && ((Boolean) obj).booleanValue();
            sleepDayBarChartProvider.e(z);
            HandlerExecutor.b(new Runnable() { // from class: uzg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50801b.e(sleepDayBarChartProvider, z);
                }
            });
        }

        public /* synthetic */ void e(SleepDayBarChartProvider sleepDayBarChartProvider, boolean z) {
            sleepDayBarChartProvider.b(this.d, this.f28073a, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Date date, String str, boolean z) {
        gxq gxqVar = this.f28056c;
        Map<String, Object> mapM = gxqVar.m();
        str.hashCode();
        if (str.equals("TYPE_ON_RESUME")) {
            boolean zEquals = Boolean.valueOf(z).equals(mapM.get("OPEN_STATUS"));
            boolean zEquals2 = Boolean.FALSE.equals(mapM.get("BAR_CHART_IS_TODAY"));
            uzo.c(mapM, "OPEN_STATUS", Boolean.valueOf(z));
            if (!zEquals && z && zEquals2) {
                e(ltb.b());
            } else if (!zEquals && !zEquals2) {
                notifyMinorProviders(gxqVar);
            } else {
                LogUtil.a("SleepDayBarChartProvider", "activity to query the lastest sleep day");
            }
            LogUtil.a("SleepDayBarChartProvider", "isChange:", Boolean.valueOf(!zEquals), "isOpen:", Boolean.valueOf(z), "isToday:", Boolean.valueOf(!zEquals2));
            return;
        }
        if (str.equals("TYPE_GET_SLEEP_DATA")) {
            uzo.c(mapM, "OPEN_STATUS", Boolean.valueOf(z));
            Set<String> set = this.ao;
            if (set != null) {
                set.add("TYPE_OPEN_STATUS");
            }
            LogUtil.a("SleepDayBarChartProvider", "mDate is ", date);
            if (date.equals(this.p)) {
                LogUtil.a("SleepDayBarChartProvider", "get open status ,current day is ", this.p);
                c();
                return;
            }
            return;
        }
        LogUtil.a("SleepDayBarChartProvider", "others");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        if (!z || Boolean.TRUE.equals(this.ac)) {
            return;
        }
        HandlerExecutor.c(new Runnable() { // from class: uyy
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b();
            }
        }, 1000L);
    }

    public /* synthetic */ void b() {
        if (this.ac == null) {
            Boolean boolValueOf = Boolean.valueOf(SharedPreferenceManager.b(String.valueOf(10006), "sleep_manage_private_dg_show_key", false));
            this.ac = boolValueOf;
            LogUtil.a("SleepDayBarChartProvider", "checkToShowPrivateDialog: get mHasShowPrivateOpenDialog", boolValueOf);
        }
        if (this.ac.booleanValue()) {
            return;
        }
        List<Integer> needOpenPrivate = SleepManagementJsUtil.getNeedOpenPrivate();
        if (needOpenPrivate.isEmpty()) {
            return;
        }
        Boolean bool = true;
        this.ac = bool;
        SharedPreferenceManager.a(String.valueOf(10006), "sleep_manage_private_dg_show_key", bool.booleanValue());
        LogUtil.a("SleepDayBarChartProvider", "checkToShowPrivateDialog: set mHasShowPrivateOpenDialog", this.ac);
        SleepManagementJsUtil.showPrivateOpenDialog(needOpenPrivate, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void c() {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: uzb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50758b.c();
                }
            });
            return;
        }
        LogUtil.a("SleepDayBarChartProvider", "notifyCustomMinorProviders: responses is ", this.ao);
        if (this.ao.size() == 3 || (this.ao.contains("TYPE_GET_SLEEP_DATA") && !this.f28056c.r())) {
            ReleaseLogUtil.d("R_Sleep_SleepDayBarChartProvider", "got all data or unvalid");
            LogUtil.a("SleepDayBarChartProvider", "notifyCustomMinorProviders,already got open status and daily result");
            ag();
            w();
        }
    }

    private void ag() {
        if (this.ao.size() != 3) {
            LogUtil.a("SleepDayBarChartProvider", "mResponses is not 3");
            return;
        }
        Bundle extra = getExtra();
        boolean z = extra != null ? extra.getBoolean("key_bundle_health_red_dot", false) : false;
        HashMap map = new HashMap();
        gxd gxdVar = this.f28056c.m().get("MGMT_DAILY_SLEEP_PROCESS") instanceof gxd ? (gxd) this.f28056c.m().get("MGMT_DAILY_SLEEP_PROCESS") : null;
        int iJ = gxdVar != null ? gxdVar.j() : -1;
        map.put("dataType", Integer.valueOf(this.k));
        map.put("OPEN_STATUS", this.f28056c.m().get("OPEN_STATUS"));
        map.put("MGMT_DAILY_SLEEP_PROCESS", Integer.valueOf(iJ));
        map.put("key_bundle_health_red_dot", Boolean.valueOf(z));
        LogUtil.a("SleepDayBarChartProvider", "bimap is", map.toString());
        ObserverManagerUtil.e("SLEEP_DAY_TYPE_BI_TYPE", map);
    }

    private void w() {
        if (this.f28056c.f() == this.p.getTime()) {
            notifyMinorProviders(this.f28056c);
            this.aa = true;
        } else {
            ReleaseLogUtil.d("R_Sleep_SleepDayBarChartProvider", "not today data");
        }
    }

    private void a(Map<String, Object> map) {
        gxq gxqVar = this.f28056c;
        if (gxqVar == null) {
            LogUtil.a("SleepDayBarChartProvider", "mTotalSleepData is null");
            return;
        }
        if (gxqVar.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            map.put("type", 3);
        } else if (this.f28056c.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
            map.put("type", 2);
        } else {
            map.put("type", 1);
        }
    }

    private void j() {
        long j2;
        LogUtil.a("SleepDayBarChartProvider", "getCoreSleepData");
        long jD = lsl.d(lsl.r(System.currentTimeMillis()), -2);
        String strC = uck.c(e(), "goToEcgTipTime");
        if (!"default_value".equals(strC)) {
            try {
                j2 = Long.parseLong(strC);
            } catch (NumberFormatException unused) {
                LogUtil.j("SleepDayBarChartProvider", "getCoreSleepData lastTime parseLong exception");
                j2 = 0;
            }
            if (jD < j2) {
                return;
            }
        }
        LogUtil.a("SleepDayBarChartProvider", "requestCoreSleepDetail: ");
        f28055b.d(new Date(jD), new Date(System.currentTimeMillis()), new b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<gxq> list) {
        LogUtil.a("SleepDayBarChartProvider", "showGoToEcg");
        int i2 = nkb.d().l().getAgeOrDefaultValue() < 65 ? 6 : 5;
        Iterator<gxq> it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            int i3 = it.next().k().i();
            if (i3 == 0) {
                z = false;
            }
            if (i3 >= i2 * 60) {
                z = false;
            }
        }
        if (z && ukb.d()) {
            this.ay.sendEmptyMessage(6009);
            uck.d(e(), "goToEcgTipTime", String.valueOf(TimeUtil.a(new Date().getTime())));
        }
    }

    public void e(Date date) {
        LogUtil.a("SleepDayBarChartProvider", "requestSpecifiedDayDatas date is " + date);
        this.p = (Date) date.clone();
        av();
        y();
    }

    private boolean t() {
        if (njy.e(this.w)) {
            return false;
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (uif uifVar : this.w) {
            if (uifVar.a() == 32) {
                z = true;
            } else if (uifVar.e() instanceof Boolean) {
                if (((Boolean) uifVar.e()).booleanValue()) {
                    z3 = true;
                } else {
                    z2 = true;
                }
            }
        }
        if (z && z2) {
            return true;
        }
        return z && z3;
    }

    private void g() {
        LogUtil.a("SleepDayBarChartProvider", "enter dismissLoading...");
        uzo.c(this.g, "BAR_CHART_IS_DISMISS_LOADING", (Object) true);
    }

    public void b(boolean z) {
        synchronized (i) {
            if (e() instanceof KnitSleepDetailActivity) {
                ((KnitSleepDetailActivity) e()).b(true);
            }
            ReleaseLogUtil.d("R_Sleep_SleepDayBarChartProvider", "RequestDatas mCurrentDay is ", this.p);
            ObserverManagerUtil.e("SLEEP_CHART_NOW_DATE", Long.valueOf(this.p.getTime()));
            ObserverManagerUtil.e("CHART_START_END_TIME", Long.valueOf(lsl.a(lsl.d(this.p.getTime(), -1), 20, 0)), Long.valueOf(lsl.a(this.p.getTime(), 20, 0)));
            this.ay.removeMessages(20);
            this.ay.sendEmptyMessageDelayed(20, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
            uzo.c(this.g, "BAR_CHART_IS_DISMISS_LOADING", (Object) false);
            if (this.p != null) {
                c(z);
            }
            this.f28056c.e(this.g);
            this.ap.c(this.f28056c);
        }
    }

    private void c(boolean z) {
        if (!lsl.aa(this.p.getTime())) {
            uzo.c(this.g, "BAR_CHART_IS_TODAY", (Object) false);
        }
        d((Date) this.p.clone(), z);
        if (VersionControlUtil.isSupportSleepManagement()) {
            this.aa = false;
            this.ao = Collections.synchronizedSet(new HashSet());
            uzo.a(this.f28056c.m(), "MGMT_DAILY_SLEEP_PROCESS");
            if (this.f28056c.m() != null) {
                this.f28056c.m().put("from", Integer.valueOf(this.ad));
            }
            a(this.p, this.ao);
            if (uag.c((Boolean) null) != null) {
                b(this.p, "TYPE_GET_SLEEP_DATA", uag.c((Boolean) false).booleanValue());
            } else {
                uag.e(new j(this, "TYPE_GET_SLEEP_DATA", this.p));
            }
            this.ay.postDelayed(new Runnable() { // from class: uyx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50755a.f();
                }
            }, 1000L);
        }
    }

    public /* synthetic */ void f() {
        if (!this.ao.contains("TYPE_GET_SLEEP_DATA") || this.aa) {
            return;
        }
        LogUtil.a("SleepDayBarChartProvider", "notifyCustomMinorProviders, already get sleep data but not get open status and daily result");
        w();
    }

    private void a(final Date date, final Set<String> set) {
        if (date == null || set == null) {
            LogUtil.j("SleepDayBarChartProvider", " requestDailyResult ");
        }
        i();
        this.u.removeCallbacksAndMessages(null);
        this.u.post(new Runnable() { // from class: uyz
            @Override // java.lang.Runnable
            public final void run() {
                this.f50757c.c(date, set);
            }
        });
    }

    public /* synthetic */ void c(Date date, Set set) {
        LogUtil.a("SleepDayBarChartProvider", " sleepDailyResult start.", date);
        uag.c(date, new f(this, set, date));
        LogUtil.a("SleepDayBarChartProvider", " sleepDailyResult end.");
    }

    private void i() {
        if (this.u == null) {
            HandlerThread handlerThread = new HandlerThread("sleepDailyResult");
            this.bb = handlerThread;
            handlerThread.start();
            this.u = new Handler(this.bb.getLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        LogUtil.a("SleepDayBarChartProvider", "mFitnessOriginListData is ", this.w);
        if (njy.b(this.w)) {
            String strE = SharedPreferenceManager.e(e(), String.valueOf(10006), "SLEEP_DEVICE_ICON_RED_DOT_KEY");
            LogUtil.a("SleepDayBarChartProvider", "showRedDot is ", strE);
            if ("".equals(strE)) {
                uzo.a(e(), this.g);
            } else if ("false".equals(strE)) {
                uzo.c(this.g, "BAR_CHART_HELP_ICON", qre.c(R.drawable.ic_public_detail));
            }
            uzo.c(this.g, "BAR_CHART_HELP_ICON_VISIBILITY", (Object) 0);
        } else {
            uzo.c(this.g, "BAR_CHART_HELP_ICON_VISIBILITY", (Object) 8);
        }
        if (njy.e(this.w) || TextUtils.isEmpty(this.y) || this.v == 0) {
            LogUtil.j("SleepDayBarChartProvider", "msg.obj not instanceof List");
        } else {
            this.f28056c.e(this.g);
            this.ap.c(this.f28056c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aq() {
        LogUtil.a("SleepDayBarChartProvider", "showFitnessDataOriginDialog()");
        String str = this.y;
        if (str == null || str.equals("") || this.v == 0) {
            return;
        }
        int iAx = this.f28056c.k().ax();
        String strE = SharedPreferenceManager.e(e(), String.valueOf(10006), "SLEEP_DEVICE_ICON_RED_DOT_KEY");
        LogUtil.a("SleepDayBarChartProvider", "showFitnessDataOriginDialog showRedDot is ", strE);
        if ("".equals(strE)) {
            uzo.c(this.g, "BAR_CHART_HELP_ICON", qre.c(R.drawable.ic_public_detail));
            this.f28056c.e(this.g);
            this.ap.c(this.f28056c);
            SharedPreferenceManager.e(e(), String.valueOf(10006), "SLEEP_DEVICE_ICON_RED_DOT_KEY", "false", new StorageParams());
        }
        CustomViewDialog customViewDialog = this.r;
        if (customViewDialog != null && customViewDialog.isShowing()) {
            this.r.dismiss();
            return;
        }
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(e());
        uzi.e(this.x, this.v, this.w, builder, e(), iAx);
        CustomViewDialog customViewDialogD = builder.d();
        this.r = customViewDialogD;
        customViewDialogD.show();
    }

    private int d(long j2, long j3) {
        return uzo.c(j2, j3, this.bc, this.av);
    }

    private int e(SparseArray<Object> sparseArray, int i2) {
        return uzo.a(sparseArray, i2, this.bc, this.av);
    }

    private void d(Date date, boolean z) {
        f28055b = new uik();
        h hVar = new h(this);
        this.q = hVar;
        f28055b.b(new Date[]{date, date}, "SleepDayBarChartProvider", 1, z, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(HealthCalendar healthCalendar) {
        Date date = new Date(lsl.r(healthCalendar.transformCalendar().getTimeInMillis()));
        this.p = date;
        ReleaseLogUtil.d("R_Sleep_SleepDayBarChartProvider", "prossCalendarSelect mCurrentDay ", date, " calendar ", healthCalendar);
        av();
        y();
    }

    private void ad() {
        this.ay.postDelayed(new Runnable() { // from class: uzd
            @Override // java.lang.Runnable
            public final void run() {
                this.f50759a.h();
            }
        }, 1L);
    }

    public /* synthetic */ void h() {
        if (this.ai) {
            return;
        }
        LogUtil.a("SleepDayBarChartProvider", "requestSleepDataDelayed, requestYearDatas.");
        b(true);
    }

    private void r() {
        LogUtil.a("SleepDayBarChartProvider", "loadingAnimation.start by sleepDayBarChartProvider initViewPagerData");
        this.ay.removeMessages(20);
        this.ay.sendEmptyMessageDelayed(20, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
        uyt uytVar = new uyt();
        uytVar.e(this.at);
        uytVar.b(0);
        uytVar.a(this.f28056c.n() == SleepViewConstants.SleepTypeEnum.SCIENCE);
        uytVar.e(0.0d);
        uytVar.d(false);
        uytVar.d(this.p);
        uzo.c(this.g, "BAR_CHART_LEGEND_ONE_DRAWABLE", qre.c(R.drawable.deep_sleep_round));
        uzo.c(this.g, "BAR_CHART_LEGEND_ONE_TEXT", e().getString(R.string.IDS_hw_show_main_health_page_healthdata_sleep_deepsleep));
        uzo.c(this.g, "BAR_CHART_LEGEND_TWO_DRAWABLE", qre.c(R.drawable.light_sleep_round));
        uzo.c(this.g, "BAR_CHART_LEGEND_TWO_TEXT", e().getString(R.string.IDS_hw_show_main_health_page_healthdata_sleep_shallowsleep));
        uzo.c(this.g, "BAR_CHART_LEGEND_THREE_DRAWABLE", qre.c(R.drawable.rem_sleep_round));
        uzo.c(this.g, "BAR_CHART_LEGEND_THREE_TEXT", e().getString(R.string.IDS_fitness_core_sleep_rem_sleep));
        uzo.c(this.g, "BAR_CHART_LEGEND_FIVE_DRAWABLE", qre.c(R.drawable.wake_sleep_round));
        uzo.c(this.g, "BAR_CHART_LEGEND_FIVE_TEXT", e().getString(R.string.IDS_details_sleep_sleep_latency));
        uzo.c(this.g, "BAR_CHART_LEGEND_FOUR_DRAWABLE", qre.c(R.drawable.true_sleep_noon_round));
        uzo.c(this.g, "BAR_CHART_LEGEND_FOUR_TEXT", e().getString(R.string.IDS_fitness_core_sleep_noontime_sleep));
        uzo.c(this.g, "BAR_CHART_LEGEND_SIX_DRAWABLE", qre.c(R.drawable.manual_bed_round));
        uzo.c(this.g, "BAR_CHART_LEGEND_SIX_TEXT", e().getString(R.string.IDS_manual_sleep_bed));
        uzo.c(this.g, "BAR_CHART_LEGEND_SEVEN_DRAWABLE", qre.c(R.drawable.manual_sleep_round));
        uzo.c(this.g, "BAR_CHART_LEGEND_SEVEN_TEXT", e().getString(R.string.IDS_manual_sleep_sleep));
        a(uytVar);
        LogUtil.a("SleepDayBarChartProvider", "initViewPagerData mSleepDataList: ", this.at.toString());
    }

    private void e(int i2) {
        if (i2 == 0) {
            uzo.c(this.g, "BAR_CHART_LEGEND_ONE_TEXT", e().getString(R.string.IDS_hw_show_main_health_page_healthdata_sleep_deepsleep));
            uzo.c(this.g, "BAR_CHART_LEGEND_TWO_TEXT", e().getString(R.string.IDS_hw_show_main_health_page_healthdata_sleep_shallowsleep));
            uzo.c(this.g, "BAR_CHART_LEGEND_THREE_TEXT", e().getString(R.string.IDS_fitness_core_sleep_rem_sleep));
        } else if (i2 == 5) {
            uzo.c(this.g, "BAR_CHART_LEGEND_ONE_TEXT", e().getString(R.string.IDS_hw_aasm_label_sleep_deepsleep));
            uzo.c(this.g, "BAR_CHART_LEGEND_TWO_TEXT", e().getString(R.string.IDS_hw_aasm_label_sleep_shallowsleep));
            uzo.c(this.g, "BAR_CHART_LEGEND_THREE_TEXT", e().getString(R.string.IDS_hw_aasm_label_sleep_rem));
        }
    }

    private void ai() {
        an();
        uzo.c(this.g, "BAR_CHART_VIEWPAGER_TOUCH_EVENT", new HealthViewPager.OnViewPagerTouchEvent() { // from class: com.huawei.ui.main.stories.health.sleep.SleepDayBarChartProvider.2
            @Override // com.huawei.ui.commonui.viewpager.HealthViewPager.OnViewPagerTouchEvent
            public void onTouchDown(MotionEvent motionEvent) {
                if (SleepDayBarChartProvider.this.e() instanceof KnitSleepDetailActivity) {
                    ((KnitSleepDetailActivity) SleepDayBarChartProvider.this.e()).getViewPager().setIsScroll(false);
                    if (motionEvent != null) {
                        SleepDayBarChartProvider.this.al = motionEvent.getRawX();
                        SleepDayBarChartProvider.this.am = motionEvent.getRawY();
                    }
                }
            }

            @Override // com.huawei.ui.commonui.viewpager.HealthViewPager.OnViewPagerTouchEvent
            public void onTouchUp(MotionEvent motionEvent) {
                SleepDayBarChartProvider.this.b(motionEvent);
            }

            @Override // com.huawei.ui.commonui.viewpager.HealthViewPager.OnViewPagerTouchEvent
            public void setIsViewTouch(Boolean bool) {
                SleepDayBarChartProvider.this.ab = bool.booleanValue();
            }
        });
        boolean zD = eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "SleepDayBarChartProvider"), 143);
        ReleaseLogUtil.e("R_Sleep_SleepDayBarChartProvider", "isSupportCoreSequence：", Boolean.valueOf(zD));
        qec.e().registerProgressListener(this.aq);
        if (zD) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.SLEEP_DETAILS.value()));
            HiHealthNativeApi.a(e()).subscribeHiHealthData(arrayList, new c(this));
        }
    }

    static class c implements HiSubscribeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference f28063a;

        public c(SleepDayBarChartProvider sleepDayBarChartProvider) {
            this.f28063a = new WeakReference(sleepDayBarChartProvider);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            LogUtil.a("SleepDayBarChartProvider", "successList: " + list + ", failList: " + list2);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            WeakReference weakReference = this.f28063a;
            if (weakReference == null || !(weakReference.get() instanceof SleepDayBarChartProvider)) {
                LogUtil.a("SleepDayBarChartProvider", "mWeakReference is null or not instance of SleepDayBarChartProvider");
                return;
            }
            LogUtil.a("SleepDayBarChartProvider", "CoreSleepSequenceSubscribeListtener type is", Integer.valueOf(i), " changeKey is ", str);
            ReleaseLogUtil.d("R_Sleep_SleepDayBarChartProvider", "CSSSL is ", Integer.valueOf(i), " CK is ", str);
            SleepDayBarChartProvider sleepDayBarChartProvider = (SleepDayBarChartProvider) this.f28063a.get();
            if (sleepDayBarChartProvider == null) {
                LogUtil.a("SleepDayBarChartProvider", "sleepDayBarChartProvider is null");
            } else if (ArkUIXConstants.INSERT.equals(str)) {
                ReleaseLogUtil.d("R_Sleep_SleepDayBarChartProvider", "CSSSL");
                sleepDayBarChartProvider.e(ltb.b());
            }
        }
    }

    private void n() {
        uzo.c(this.g, "BAR_CHART_CALENDAR_CLICK_EVENT", new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.health.sleep.SleepDayBarChartProvider.1
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i2, int i3) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i2, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("calendar", SleepDayBarChartProvider.this.m);
                bundle.putParcelable("markDateTrigger", new HealthDataMarkDateTrigger(new int[]{44105, 44004, 44108, 44109}));
                bundle.putBoolean("isSetGrayUnmarkedDate", true);
                if (SleepDayBarChartProvider.this.e() instanceof Activity) {
                    HealthCalendarActivity.c((Activity) SleepDayBarChartProvider.this.e(), bundle, SleepDayBarChartProvider.this.l);
                }
            }
        });
        this.f28056c.e(this.g);
        this.ap.c(this.f28056c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MotionEvent motionEvent) {
        if (e() instanceof KnitSleepDetailActivity) {
            ((KnitSleepDetailActivity) e()).getViewPager().setIsScroll(true);
            if (this.ai) {
                LogUtil.a("SleepDayBarChartProvider", "onTouchUp mIsLoading is true.");
                return;
            }
            float fAbs = Math.abs(motionEvent.getRawX() - this.al);
            if (fAbs < Math.abs(motionEvent.getRawY() - this.am)) {
                return;
            }
            float rawX = motionEvent.getRawX();
            boolean zBa = LanguageUtil.ba(BaseApplication.getContext());
            if (fAbs <= 100.0f || !this.ab) {
                return;
            }
            if (rawX > this.al) {
                if (!zBa) {
                    p();
                    return;
                } else {
                    if (this.j) {
                        return;
                    }
                    ac();
                    return;
                }
            }
            if (zBa) {
                p();
            } else {
                if (this.j) {
                    return;
                }
                ac();
            }
        }
    }

    private void f(final boolean z) {
        this.ay.postDelayed(new Runnable() { // from class: uze
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(z);
            }
        }, 500L);
    }

    public /* synthetic */ void a(boolean z) {
        this.ae = z;
    }

    private void an() {
        b(new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.health.sleep.SleepDayBarChartProvider.4
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i2, int i3) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i2, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if ("BAR_LEFT_ARROW_CLICK_EVENT".equals(str)) {
                    SleepDayBarChartProvider.this.p();
                    return;
                }
                if ("BAR_RIGHT_ARROW_CLICK_EVENT".equals(str)) {
                    SleepDayBarChartProvider.this.ac();
                } else if ("BAR_HELP_ICON_CLICK_EVENT".equals(str)) {
                    SleepDayBarChartProvider.this.aq();
                } else {
                    LogUtil.a("SleepDayBarChartProvider", "onClick wrong");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        LogUtil.a("SleepDayBarChartProvider", "day calendar is " + calendar);
        if (this.m == null) {
            this.m = new HealthCalendar();
        }
        this.m = this.m.transformFromCalendar(calendar);
    }

    private void al() {
        this.f28056c.a(this.y);
        this.f28056c.b(this.an);
        this.f28056c.e(this.g);
        this.f28056c.e(this.v);
        this.f28056c.e(this.p.getTime());
        LogUtil.a("SleepDayBarChartProvider", "setSleepDataUi mTotalSleepData = ", this.f28056c.toString());
        b(this.f28056c);
    }

    private void as() {
        LogUtil.a("SleepDayBarChartProvider", "recommend id : ", h);
        if (this.f28056c.k().ay() || this.f28056c.g().ab()) {
            LogUtil.a("SleepDayBarChartProvider", "isNoonSleepOnly.");
            d(8, "BAR_CHART_PROCESS_TEXT_VISIBILITY");
            d(8, "BAR_CHART_CORE_LEGEND_VISIBILITY");
            d(8, "BAR_CHART_REM_LEGEND_VISIBILITY");
            d(0, "BAR_CHART_NOON_LEGEND_VISIBILITY");
            this.f28056c.e(this.g);
            this.ap.c(this.f28056c);
        } else {
            d(0, "BAR_CHART_CORE_LEGEND_VISIBILITY");
            d(0, "BAR_CHART_REM_LEGEND_VISIBILITY");
            d(8, "BAR_CHART_NOON_LEGEND_VISIBILITY");
            if (this.f28056c.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
                d(8, "BAR_CHART_REM_LEGEND_VISIBILITY");
            }
            if (this.f28056c.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
                d(8, "BAR_CHART_PROCESS_TEXT_VISIBILITY");
                d(8, "BAR_CHART_CORE_LEGEND_VISIBILITY");
                d(8, "BAR_CHART_REM_LEGEND_VISIBILITY");
                d(0, "BAR_CHART_NOON_LEGEND_VISIBILITY");
                if (!this.f28056c.h().n()) {
                    LogUtil.a("SleepDayBarChartProvider", "manual is sus");
                    uzo.c(this.g, "IS_INCOMPLETE_DATA", (Object) true);
                } else {
                    LogUtil.a("SleepDayBarChartProvider", "manual is not sus");
                    uzo.c(this.g, "IS_INCOMPLETE_DATA", (Object) false);
                }
            }
            e(this.f28056c.k().ax());
            this.f28056c.e(this.g);
            this.ap.c(this.f28056c);
        }
        am();
    }

    private void d(int i2, String str) {
        uzo.c(this.g, str, Integer.valueOf(i2));
    }

    private void am() {
        LogUtil.a("SleepDayBarChartProvider", "mTotalSleepData : ", this.f28056c.toString());
        if (this.f28056c.r()) {
            d(4, "BAR_CHART_PROCESS_TEXT_VISIBILITY");
            this.f28056c.e(this.g);
            this.ap.c(this.f28056c);
        } else {
            ax();
        }
        this.f28056c.e(this.p.getTime());
        this.f28056c.e(t());
        uzo.c(this.g, "FITNESSCORE_SLEEP_DETAIL_INTERACTOR", f28055b);
        this.f28056c.e(this.g);
        this.ao.add("TYPE_GET_SLEEP_DATA");
        c();
    }

    private void b(OnClickSectionListener onClickSectionListener) {
        CoreSleepDayDetailView.OnClickViewDefaultListener onClickViewDefaultListener = new CoreSleepDayDetailView.OnClickViewDefaultListener() { // from class: com.huawei.ui.main.stories.health.sleep.SleepDayBarChartProvider.9
            @Override // com.huawei.health.knit.section.chart.CoreSleepDayDetailView.OnClickViewDefaultListener
            public void onClickViewDefaultListener(String str, String str2, int i2, boolean z, int i3, ArrayList<fra> arrayList, int i4) {
                String strF;
                int i5;
                int iU;
                int i6;
                String string;
                int i7;
                String string2;
                int i8;
                if (SleepDayBarChartProvider.this.f28056c.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
                    SleepDayBarChartProvider.this.b(str, str2, i2, i3, arrayList, i4);
                    return;
                }
                if (i2 == -1) {
                    if (SleepDayBarChartProvider.this.f28056c.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
                        if (SleepDayBarChartProvider.this.f28056c.k().ay()) {
                            i7 = SleepDayBarChartProvider.this.f28056c.k().ar();
                            string2 = SleepDayBarChartProvider.this.e().getString(R.string.IDS_fitness_core_sleep_noontime_sleep);
                            i8 = i7;
                        } else {
                            i7 = SleepDayBarChartProvider.this.f28056c.k().i() + SleepDayBarChartProvider.this.f28056c.k().ar();
                            int iAr = SleepDayBarChartProvider.this.f28056c.k().ar();
                            LogUtil.a("SleepDayBarChartProvider", "sleepTime = ", Integer.valueOf(SleepDayBarChartProvider.this.f28056c.k().i()), ", noonSleepTime = ", Integer.valueOf(SleepDayBarChartProvider.this.f28056c.k().ar()));
                            string2 = SleepDayBarChartProvider.this.e().getString(R.string.IDS_fitness_core_sleep_night_sleep);
                            i8 = i7 - iAr;
                        }
                        iU = SleepDayBarChartProvider.this.f28056c.k().ar();
                    } else {
                        if (SleepDayBarChartProvider.this.f28056c.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
                            if (SleepDayBarChartProvider.this.f28056c.g().ab()) {
                                i7 = SleepDayBarChartProvider.this.f28056c.g().u();
                                string2 = SleepDayBarChartProvider.this.e().getString(R.string.IDS_fitness_core_sleep_noontime_sleep);
                                i8 = i7;
                            } else {
                                i7 = SleepDayBarChartProvider.this.f28056c.g().i() + SleepDayBarChartProvider.this.f28056c.g().u();
                                int iU2 = SleepDayBarChartProvider.this.f28056c.g().u();
                                string2 = SleepDayBarChartProvider.this.e().getString(R.string.IDS_fitness_total_sleep_data_title);
                                i8 = i7 - iU2;
                            }
                            iU = SleepDayBarChartProvider.this.f28056c.g().u();
                        } else if (SleepDayBarChartProvider.this.f28056c.n() == SleepViewConstants.SleepTypeEnum.COMMON) {
                            i6 = SleepDayBarChartProvider.this.f28056c.b().i();
                            string = SleepDayBarChartProvider.this.e().getString(R.string.IDS_fitness_total_sleep_data_title);
                            i5 = i6;
                            iU = 0;
                        } else {
                            i5 = 0;
                            iU = 0;
                            i6 = i2;
                            string = str;
                        }
                        strF = "";
                    }
                    String str3 = string2;
                    i5 = i7;
                    i6 = i8;
                    string = str3;
                    strF = "";
                } else {
                    strF = str2;
                    i5 = 0;
                    iU = 0;
                    i6 = i2;
                    string = str;
                }
                boolean zR = SleepDayBarChartProvider.this.f28056c.r();
                if (!string.equals(SleepDayBarChartProvider.this.ax) || !strF.equals(SleepDayBarChartProvider.this.aw) || SleepDayBarChartProvider.this.au != i6) {
                    if (SleepDayBarChartProvider.this.f28056c.k().ax() == 5) {
                        String strF2 = qre.f(R.string.IDS_hw_show_main_health_page_healthdata_sleep_deepsleep);
                        String strF3 = qre.f(R.string.IDS_hw_show_main_health_page_healthdata_sleep_shallowsleep);
                        String strF4 = qre.f(R.string.IDS_fitness_core_sleep_rem_sleep);
                        if (strF.equals(strF2)) {
                            strF = qre.f(R.string.IDS_hw_aasm_label_sleep_deepsleep);
                        } else if (strF.equals(strF3)) {
                            strF = qre.f(R.string.IDS_hw_aasm_label_sleep_shallowsleep);
                        } else if (strF.equals(strF4)) {
                            strF = qre.f(R.string.IDS_hw_aasm_label_sleep_rem);
                        }
                    }
                    uzo.c(SleepDayBarChartProvider.this.g, "BAR_CHART_PERIOD_STRING", string);
                    uzo.c(SleepDayBarChartProvider.this.g, "BAR_CHART_TYPE_STRING", strF);
                    uzo.c(SleepDayBarChartProvider.this.g, "BAR_CHART_TIME_INT", Integer.valueOf(i6));
                    uzo.c(SleepDayBarChartProvider.this.g, "BAR_CHART_DATA_VALID", Boolean.valueOf(zR));
                    uzo.c(SleepDayBarChartProvider.this.g, "SLEEP_HYBRID_NIGHT_TIME", Integer.valueOf(i5));
                    uzo.c(SleepDayBarChartProvider.this.g, "SLEEP_HYBRID_NOON_TIME", Integer.valueOf(iU));
                    uzo.c(SleepDayBarChartProvider.this.g, "is_need_refresh_chart", (Object) false);
                    SleepDayBarChartProvider.this.ax = string;
                    SleepDayBarChartProvider.this.aw = strF;
                    SleepDayBarChartProvider.this.au = i6;
                    SleepDayBarChartProvider.this.f28056c.e(SleepDayBarChartProvider.this.g);
                    SleepDayBarChartProvider.this.ap.c(SleepDayBarChartProvider.this.f28056c);
                }
                SleepDayBarChartProvider sleepDayBarChartProvider = SleepDayBarChartProvider.this;
                sleepDayBarChartProvider.c(sleepDayBarChartProvider.p.getTime());
            }
        };
        uzo.c(this.g, "BAR_CHART_ARROW_COMMON_EVENT", onClickSectionListener);
        uzo.c(this.g, "BAR_CHART_CLICK_EVENT", onClickViewDefaultListener);
        this.f28056c.e(this.g);
        this.ap.c(this.f28056c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:23:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:25:0x0101  */
    public void b(String str, String str2, int i2, int i3, ArrayList<fra> arrayList, int i4) {
        uzo.c(this.g, "BAR_CHART_TIME_INT", Integer.valueOf(i2));
        uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_SLEEP_PERIOD", "");
        if (i2 == -1) {
            ah();
        } else if (i3 == 2) {
            if (njy.b(arrayList)) {
                fra fraVar = arrayList.get(0);
                int iD = fraVar.d() - fraVar.b();
                uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_SLEEP_TIME", Integer.valueOf(iD));
                uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_BED_TIME", Integer.valueOf(i2 + iD));
                uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_BED_TITLE", e().getString(R.string.IDS_manual_sleep_bed_time));
                uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_SLEEP_TITLE", e().getString(R.string.IDS_manual_sleep_sleep_time));
            }
        } else if (i3 == 3) {
            if (njy.c(arrayList, 1)) {
                fra fraVar2 = arrayList.get(0);
                int iD2 = fraVar2.d() - fraVar2.b();
                uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_SLEEP_TIME", Integer.valueOf(iD2));
                fra fraVar3 = arrayList.get(1);
                uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_BED_TIME", Integer.valueOf(i2 + (fraVar3.d() - fraVar3.b()) + iD2));
                uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_BED_TITLE", e().getString(R.string.IDS_manual_sleep_bed_time));
                uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_SLEEP_TITLE", e().getString(R.string.IDS_manual_sleep_sleep_time));
            }
        } else if (i3 != 4) {
            if (i3 != 5) {
                if (i4 == 66) {
                    uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_BED_TITLE", "");
                    uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_SLEEP_TITLE", e().getString(R.string.IDS_manual_sleep_sleep_time));
                    uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_BED_TIME", (Object) 0);
                    uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_SLEEP_TIME", Integer.valueOf(i2));
                    uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_SLEEP_PERIOD", str);
                } else if (i4 == 67) {
                    uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_BED_TITLE", e().getString(R.string.IDS_manual_sleep_bed_time));
                    uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_SLEEP_TITLE", "");
                    uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_BED_TIME", Integer.valueOf(i2));
                    uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_SLEEP_TIME", (Object) 0);
                    uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_SLEEP_PERIOD", str);
                } else {
                    LogUtil.a("SleepDayBarChartProvider", "wrong data type!");
                    ah();
                }
            } else if (njy.c(arrayList, 1)) {
                fra fraVar4 = arrayList.get(0);
                int iD3 = fraVar4.d() - fraVar4.b();
                uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_SLEEP_TIME", Integer.valueOf(iD3));
                fra fraVar5 = arrayList.get(1);
                uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_BED_TIME", Integer.valueOf(i2 + (fraVar5.d() - fraVar5.b()) + iD3));
                uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_BED_TITLE", e().getString(R.string.IDS_manual_sleep_bed_time));
                uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_SLEEP_TITLE", e().getString(R.string.IDS_manual_sleep_sleep_time));
            }
        } else if (njy.b(arrayList)) {
            fra fraVar6 = arrayList.get(0);
            int iD4 = fraVar6.d() - fraVar6.b();
            uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_SLEEP_TIME", Integer.valueOf(iD4));
            uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_BED_TIME", Integer.valueOf(i2 + iD4));
            uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_BED_TITLE", e().getString(R.string.IDS_manual_sleep_bed_time));
            uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_SLEEP_TITLE", e().getString(R.string.IDS_manual_sleep_sleep_time));
        }
        this.f28056c.e(this.g);
        this.ap.c(this.f28056c);
        c(this.p.getTime());
    }

    private void ah() {
        String string;
        String string2;
        uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_BED_TIME", Integer.valueOf(this.f28056c.h().o()));
        uzo.c(this.g, "BAR_CHART_TOTAL_MANUAL_SLEEP_TIME", Integer.valueOf(this.f28056c.h().i()));
        Map<String, Object> map = this.g;
        if (this.af) {
            string = e().getString(R.string.IDS_manual_sleep_total_bed_time);
        } else {
            string = e().getString(R.string.IDS_manual_sleep_bed_time);
        }
        uzo.c(map, "BAR_CHART_TOTAL_MANUAL_BED_TITLE", string);
        Map<String, Object> map2 = this.g;
        if (this.af) {
            string2 = e().getString(R.string.IDS_manual_sleep_total_sleep_time);
        } else {
            string2 = e().getString(R.string.IDS_manual_sleep_sleep_time);
        }
        uzo.c(map2, "BAR_CHART_TOTAL_MANUAL_SLEEP_TITLE", string2);
        uzo.c(this.g, "is_need_refresh_chart", (Object) false);
    }

    private void av() {
        LogUtil.a("SleepDayBarChartProvider", "updateDateArrowVisible enter: ");
        long jM = ltb.m(this.p);
        long jM2 = ltb.m(ltb.b());
        LogUtil.a("SleepDayBarChartProvider", "currentDay: ", Long.valueOf(jM), ", today = ", Long.valueOf(jM2));
        boolean z = jM == jM2;
        this.j = z;
        uzo.c(this.g, "BAR_CHART_IS_TODAY", Boolean.valueOf(z));
        this.f28056c.e(this.g);
        this.ap.c(this.f28056c);
    }

    private void ar() {
        long longExtra;
        Bundle extra = getExtra();
        this.p = ltb.b();
        if (extra != null) {
            this.ad = extra.getInt("from", -1);
            long j2 = extra.getLong("endTime", 0L);
            boolean z = extra.getBoolean("key_is_open_sleep_management", false);
            String string = extra.getString("jumpFromFileSyncNotify");
            if (e() instanceof Activity) {
                longExtra = ((Activity) e()).getIntent().getLongExtra("key_bundle_health_last_data_time", 0L);
                LogUtil.a("SleepDayBarChartProvider", "lastTimestamp = ", Long.valueOf(longExtra));
                if (longExtra == 0) {
                    longExtra = extra.getLong("key_bundle_health_last_data_time", 0L);
                }
            } else {
                longExtra = extra.getLong("key_bundle_health_last_data_time", 0L);
            }
            LogUtil.a("SleepDayBarChartProvider", "Op :", Boolean.valueOf(z), "lastTt:", Long.valueOf(longExtra), "fm:", Integer.valueOf(this.ad), "wakeUT:", Long.valueOf(j2));
            if (z) {
                LogUtil.a("R_Sleep_SleepDayBarChartProvider", "already open sleep mangement, just show today, even if no data");
            } else if (j2 > 0 && "jumpFromFileSyncNotify".equals(string)) {
                this.p.setTime(j2);
            } else if (longExtra > 0) {
                this.p.setTime(longExtra);
            } else {
                LogUtil.a("SleepDayBarChartProvider", "jumpTag is wrong");
            }
        }
        ReleaseLogUtil.d("R_Sleep_SleepDayBarChartProvider", "Current_day :", this.p);
        uzo.c(this.g, "BAR_CHART_DATE_TEXT", m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        LogUtil.a("SleepDayBarChartProvider", "leftProcess");
        if (this.ai) {
            LogUtil.a("SleepDayBarChartProvider", "leftProcess OnClickListener mIsLoading is true.");
            return;
        }
        this.p = ltb.p(this.p);
        av();
        LogUtil.a("SleepDayBarChartProvider", "leftProcess, mCurrentDay = ", ltb.v(this.p));
        y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        LogUtil.a("SleepDayBarChartProvider", "rightProcess");
        if (this.ai) {
            LogUtil.a("SleepDayBarChartProvider", "rightProcess OnClickListener mIsLoading is true.");
            return;
        }
        this.p = ltb.q(this.p);
        av();
        LogUtil.a("SleepDayBarChartProvider", "rightProcess, mCurrentDay = ", ltb.v(this.p));
        y();
    }

    private void y() {
        this.ae = false;
        uzo.c(this.g, "BAR_CHART_DATE_TEXT", m());
        this.f28056c.e(this.g);
        this.ap.c(this.f28056c);
        ax();
        b(false);
    }

    private void x() {
        LogUtil.a("SleepDayBarChartProvider", "refreshNoSleepData");
        if (f28055b == null) {
            return;
        }
        this.ay.removeMessages(20);
        av();
        this.f28056c = new gxq(SleepViewConstants.ViewTypeEnum.DAY);
        d(8, "BAR_CHART_NOON_LEGEND_VISIBILITY");
        d(8, "BAR_CHART_REM_LEGEND_VISIBILITY");
        d(8, "BAR_CHART_CORE_LEGEND_VISIBILITY");
        d(0, "BAR_CHART_PROCESS_TEXT_VISIBILITY");
        this.f28056c.b(SleepViewConstants.SleepTypeEnum.UNKNOWN);
        this.f28056c.e(this.p.getTime());
        this.f28056c.e(t());
        uzo.c(this.g, "FITNESSCORE_SLEEP_DETAIL_INTERACTOR", f28055b);
        uzo.c(this.g, "BAR_COMMON_IS_PHONE", (Object) false);
        this.f28056c.e(this.g);
        this.ao.add("TYPE_GET_SLEEP_DATA");
        c();
        this.ap.c(this.f28056c);
    }

    private void c(boolean z, boolean z2) {
        if (f28055b == null || z) {
            return;
        }
        this.ay.removeMessages(20);
        av();
        this.ay.sendEmptyMessage(PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED);
        d(z2);
    }

    private void a(boolean z, boolean z2) {
        if (f28055b == null) {
            return;
        }
        if (!z) {
            this.ay.removeMessages(20);
            av();
            uyt uytVar = new uyt();
            uytVar.e(this.at);
            uytVar.a(true);
            uytVar.e(this.f28056c.k().az());
            uytVar.d(true);
            uytVar.d(this.p);
            if (z2) {
                uytVar.b(0);
            }
            a(uytVar);
            f(true);
            at();
        }
        LogUtil.a("SleepDayBarChartProvider", "refreshOnlyNoonSleep isChart ", Boolean.valueOf(z));
    }

    private void at() {
        al();
        as();
    }

    private void ax() {
        ak();
        this.at.clear();
        uyt uytVar = new uyt();
        uytVar.b(0);
        uytVar.e(this.at);
        uytVar.a(this.f28056c.n() == SleepViewConstants.SleepTypeEnum.SCIENCE);
        uytVar.e(this.f28056c.k().az());
        uytVar.d(false);
        uytVar.d(this.p);
        this.f28056c.b(SleepViewConstants.SleepTypeEnum.UNKNOWN);
        a(uytVar);
        f(true);
        d(8, "BAR_CHART_CORE_LEGEND_VISIBILITY");
        d(8, "BAR_CHART_REM_LEGEND_VISIBILITY");
        d(8, "BAR_CHART_NOON_LEGEND_VISIBILITY");
        this.f28056c.e(this.g);
        this.ap.c(this.f28056c);
    }

    private void ak() {
        uzo.c(this.g, "BAR_CHART_IS_NO_DATA_REC", (Object) true);
        this.f28056c.e(this.g);
        this.ap.c(this.f28056c);
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.health.sleep.SleepDayBarChartProvider$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f28057b;

        static {
            int[] iArr = new int[SleepViewConstants.SleepTypeEnum.values().length];
            f28057b = iArr;
            try {
                iArr[SleepViewConstants.SleepTypeEnum.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28057b[SleepViewConstants.SleepTypeEnum.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28057b[SleepViewConstants.SleepTypeEnum.SCIENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28057b[SleepViewConstants.SleepTypeEnum.COMMON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void b(gxq gxqVar) {
        int i2;
        int i3 = AnonymousClass10.f28057b[gxqVar.n().ordinal()];
        if (i3 == 1) {
            i2 = gxqVar.g().i();
        } else if (i3 == 2) {
            i2 = gxqVar.h().i();
        } else if (i3 == 3) {
            i2 = gxqVar.k().i();
        } else if (i3 == 4) {
            i2 = gxqVar.b().i();
        } else {
            LogUtil.a("SleepDayBarChartProvider", "other sleepType");
            i2 = 0;
        }
        uzo.b(i2);
    }

    static class e implements CommonUiBaseResponse {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<SleepDayBarChartProvider> f28065b;

        e(SleepDayBarChartProvider sleepDayBarChartProvider) {
            this.f28065b = new WeakReference<>(sleepDayBarChartProvider);
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            SleepDayBarChartProvider sleepDayBarChartProvider = this.f28065b.get();
            if (sleepDayBarChartProvider != null && i == 1 && (obj instanceof HealthCalendar)) {
                sleepDayBarChartProvider.b((HealthCalendar) obj);
            }
        }
    }

    static class h implements CommonUiBaseResponse {
        private WeakReference<SleepDayBarChartProvider> d;

        h(SleepDayBarChartProvider sleepDayBarChartProvider) {
            this.d = new WeakReference<>(sleepDayBarChartProvider);
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            ReleaseLogUtil.d("R_Sleep_SleepDayBarChartProvider", "All back now ");
            SleepDayBarChartProvider sleepDayBarChartProvider = this.d.get();
            if (sleepDayBarChartProvider == null) {
                return;
            }
            b(obj, sleepDayBarChartProvider);
            if (i == 100) {
                sleepDayBarChartProvider.v();
            } else {
                sleepDayBarChartProvider.s();
            }
            d(sleepDayBarChartProvider);
        }

        private void b(Object obj, SleepDayBarChartProvider sleepDayBarChartProvider) {
            if (!(obj instanceof ujd)) {
                LogUtil.e("SleepDayBarChartProvider", "object is not SleepDataFormInteractor");
                return;
            }
            ujd ujdVar = (ujd) obj;
            uzo.c(sleepDayBarChartProvider.g, "is_need_refresh_chart", Boolean.valueOf(c((gxq) lsm.e(sleepDayBarChartProvider.f28056c), (gxq) lsm.e(ujdVar.h()))));
            sleepDayBarChartProvider.f28056c = ujdVar.h();
            sleepDayBarChartProvider.at = ujdVar.b();
            sleepDayBarChartProvider.y = ujdVar.c();
            sleepDayBarChartProvider.v = ujdVar.e();
            sleepDayBarChartProvider.x = ujdVar.d();
            sleepDayBarChartProvider.an = ujdVar.g();
            sleepDayBarChartProvider.ak = ujdVar.j();
            sleepDayBarChartProvider.w = ujdVar.a();
            gxq gxqVar = sleepDayBarChartProvider.f28056c;
            CopyOnWriteArrayList copyOnWriteArrayList = sleepDayBarChartProvider.at;
            String str = sleepDayBarChartProvider.y;
            int i = sleepDayBarChartProvider.v;
            List list = sleepDayBarChartProvider.an;
            boolean z = sleepDayBarChartProvider.ak;
            LogUtil.a("SleepDayBarChartProvider", "mSleepViewData: ", gxqVar, " mSleepDataList: ", copyOnWriteArrayList, " mDeviceId: ", str, " mDeviceType: ", Integer.valueOf(i), " mNoonSleepList: ", list, " mIsSuspicious: ", Boolean.valueOf(z), " mFitnessOriginListData:", sleepDayBarChartProvider.w);
        }

        private boolean c(gxq gxqVar, gxq gxqVar2) {
            if (gxqVar == null || gxqVar2 == null) {
                ReleaseLogUtil.e("R_Sleep_SleepDayBarChartProvider", "data is null");
                return false;
            }
            return !gxqVar.toString().equals(gxqVar2.toString());
        }

        private void d(SleepDayBarChartProvider sleepDayBarChartProvider) {
            uzo.b(sleepDayBarChartProvider);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        String str;
        this.k = 0;
        ReleaseLogUtil.d("R_Sleep_SleepDayBarChartProvider", "Judge data");
        gxq gxqVar = this.f28056c;
        if (gxqVar == null) {
            gxqVar = null;
        }
        LogUtil.a("SleepDayBarChartProvider", "mSleepViewData:", gxqVar, " mDeviceId:", this.y, " mDeviceType:", Integer.valueOf(this.v));
        gxq gxqVar2 = this.f28056c;
        if (gxqVar2 == null || !gxqVar2.r() || (str = this.y) == null || str.equals("") || this.v == 0) {
            ReleaseLogUtil.d("R_Sleep_SleepDayBarChartProvider", "Unvalid data");
            LogUtil.a("SleepDayBarChartProvider", "1、Data platform access to numerous");
            qqk.c().c(5001);
            this.ai = false;
            this.k = 0;
            this.f28056c = new gxq(SleepViewConstants.ViewTypeEnum.DAY);
        } else if (this.f28056c.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
            LogUtil.a("SleepDayBarChartProvider", "9、data is manual");
            qqk.c().c(FitnessStatusCodes.AGGREGATION_NOT_SUPPORTED);
            this.ai = false;
            this.k = 5;
        } else if (this.f28056c.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            if (this.f28056c.g().y() > 0 && this.f28056c.g().q() == 0) {
                uzo.d(this.v);
            } else if (this.f28056c.g().ab()) {
                uzo.a(this.v);
            } else {
                uzo.e(this.v);
            }
            this.ai = false;
            this.k = 3;
        } else if (this.f28056c.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
            if (this.f28056c.k().aw() > 0 && this.f28056c.k().u() == 0 && this.f28056c.k().ap() == 0) {
                uzo.d(this.v);
            } else if (this.f28056c.k().ay()) {
                uzo.a(this.v);
            } else {
                uzo.e(this.v);
            }
            this.ai = false;
            this.k = 1;
        } else {
            this.k = 4;
            LogUtil.a("SleepDayBarChartProvider", "5、Data platform gets to normal sleep");
            qqk.c().c(5004);
            this.ai = false;
        }
        uzo.c(this.g, "WAKEUP_FEELING", (Object) (-1));
        uzo.c(this.g, "IS_INCOMPLETE_DATA", (Object) false);
        if (this.v == 3) {
            ap();
            aj();
        } else {
            boolean z = qqk.c().d() == 5003;
            if (this.f28056c.k().aq() == 0 && this.ak && this.f28056c.n() == SleepViewConstants.SleepTypeEnum.SCIENCE && !z) {
                uzo.c(this.g, "IS_INCOMPLETE_DATA", (Object) true);
            }
            uzo.c(this.g, "BAR_CHART_HIDE_TYPE", (Object) 5);
        }
        this.ay.sendEmptyMessage(5000);
        LogUtil.a("SleepDayBarChartProvider", "wearList is ", d, " smartPillowList is ", f28054a, " phoneList is ", e);
        z();
        aa();
    }

    private void aa() {
        int iY;
        int iAr;
        int iBa;
        if (this.s.get() instanceof KnitSleepDetailActivity) {
            KnitSleepDetailActivity knitSleepDetailActivity = (KnitSleepDetailActivity) this.s.get();
            int iU = 0;
            boolean z = "jumpFromFileSyncNotify".equals(knitSleepDetailActivity.c()) && knitSleepDetailActivity.e() > 0;
            if (this.f28056c.n() == SleepViewConstants.SleepTypeEnum.UNKNOWN || !lsl.c(this.p.getTime(), System.currentTimeMillis()) || !z) {
                ReleaseLogUtil.e("R_Sleep_SleepDayBarChartProvider", "not need save sp");
                return;
            }
            int iAp = this.f28056c.k().ap();
            if (this.f28056c.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
                iU = this.f28056c.k().u();
                iY = this.f28056c.k().aw();
                iAr = this.f28056c.k().ar();
                iBa = this.f28056c.k().ba();
            } else if (this.f28056c.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
                int iU2 = this.f28056c.g().u();
                int iAa = this.f28056c.g().aa();
                int iQ = this.f28056c.g().q();
                iBa = iAa;
                iY = this.f28056c.g().y();
                iU = iQ;
                iAr = iU2;
            } else {
                iY = 0;
                iAr = 0;
                iBa = 0;
            }
            SharedPreferenceManager.d(Integer.toString(PrebakedEffectId.RT_COIN_DROP), "ENTRY_ACTIVITY_TIME_SP_KEY", Objects.hash(Integer.valueOf(iU + iY + iAp + iAr), Integer.valueOf(iBa), Integer.valueOf(iAr), Integer.valueOf(this.f28056c.h().o()), Long.valueOf(lsl.r(this.p.getTime()))));
            return;
        }
        ReleaseLogUtil.e("R_Sleep_SleepDayBarChartProvider", "sleepActRef is null");
    }

    private void aj() {
        long jE = ltb.e(this.p) * 1000;
        this.bc = jE;
        this.av = ((jE / 1000) + k.b.m) * 1000;
        uzo.c(this.g, "BAR_CHART_HIDE_TYPE", Integer.valueOf(d(this.f28056c.g().a(), this.f28056c.g().d())));
        uzo.c(this.g, "BAR_COMMON_PHONE_START_TIME", Long.valueOf(this.f28056c.g().a()));
        uzo.c(this.g, "BAR_COMMON_PHONE_END_TIME", Long.valueOf(this.f28056c.g().d()));
        uzo.c(this.g, "time_zone", this.f28056c.g().m());
    }

    private void ap() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.SLEEP_RECORD.value()));
        if (TimeUtil.d(this.p.getTime(), System.currentTimeMillis()) && this.ba == null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(this.p);
            calendar.add(5, 1);
            Date time = calendar.getTime();
            calendar.setTime(this.p);
            calendar.add(5, -1);
            this.ba = new g(this, ltb.m(calendar.getTime()) * 1000, ltb.o(time) * 1000);
            HiHealthNativeApi.a(e()).subscribeHiHealthData(arrayList, this.ba);
        }
    }

    private void z() {
        if (this.f) {
            this.f = false;
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.health.sleep.SleepDayBarChartProvider.8
                @Override // java.lang.Runnable
                public void run() {
                    ObserverManagerUtil.e("SCORE_PROVIDER_DATA_ARRIVED", new Object[0]);
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(SparseArray<Object> sparseArray) {
        if (sparseArray == null || sparseArray.size() <= 0) {
            LogUtil.a("SleepDayBarChartProvider", "map is null");
            return -1;
        }
        LogUtil.a("SleepDayBarChartProvider", "SLEEP_WAKEUP_FEEL");
        long jE = ltb.e(this.p) * 1000;
        this.bc = jE;
        this.av = ((jE / 1000) + k.b.m) * 1000;
        int iE = e(sparseArray, DicDataTypeUtil.DataType.WAKE_UP_FEELING.value());
        LogUtil.a("SleepDayBarChartProvider", "wakeUpFeeling: " + iE);
        return iE;
    }

    private void a(uyt uytVar) {
        if (uytVar == null || uytVar.e() == null) {
            return;
        }
        this.n.clear();
        this.af = false;
        int iC = Integer.MAX_VALUE;
        for (uig uigVar : uytVar.e()) {
            if (uigVar != null) {
                if (uigVar.b() > iC) {
                    this.af = true;
                }
                iC = uigVar.c();
                fra fraVar = new fra();
                fraVar.e(uigVar.b());
                fraVar.b(uigVar.c());
                fraVar.a(uigVar.e());
                fraVar.b(uigVar.d());
                fraVar.a(uigVar.a());
                LogUtil.a("SleepDayBarChartProvider", "mData ", fraVar.toString());
                this.n.add(fraVar);
            }
        }
        uzo.c(this.g, "BAR_CHART_DATA_LIST", this.n);
        uzo.c(this.g, "BAR_CHART_IS_SCIENCE_SLEEP", Boolean.valueOf(uytVar.d()));
        uzo.c(this.g, "BAR_CHART_VALID_DATA", Double.valueOf(uytVar.b()));
        uzo.c(this.g, "BAR_CHART_IS_TYPE", Boolean.valueOf(uytVar.h()));
        uzo.c(this.g, "BAR_CHART_CURRENT_DAY", uytVar.a());
        uzo.c(this.g, "BAR_CHART_COLOR_TYPE", Integer.valueOf(uytVar.c()));
        uzo.c(this.g, "BAR_COMMON_IS_PHONE", Boolean.valueOf(this.f28056c.n() == SleepViewConstants.SleepTypeEnum.PHONE));
        uzo.c(this.g, "BAR_COMMON_IS_MANUAL", Boolean.valueOf(this.f28056c.n() == SleepViewConstants.SleepTypeEnum.MANUAL));
        uzo.c(this.g, "BAR_COMMON_IS_MANUAL_INCOMPLETE", Boolean.valueOf(this.ak));
        uzo.c(this.g, "BAR_SCIENCE_IS_SUPPORT_BEDTIME", Boolean.valueOf(this.f28056c.n() == SleepViewConstants.SleepTypeEnum.SCIENCE));
        this.f28056c.e(this.g);
        this.ap.c(this.f28056c);
    }

    private static boolean e(SleepDayBarChartProvider sleepDayBarChartProvider, uay uayVar, int i2) {
        if (i2 != 0) {
            return false;
        }
        if (ltb.m(sleepDayBarChartProvider.p) == ltb.m(ltb.b())) {
            if (sleepDayBarChartProvider.z) {
                sleepDayBarChartProvider.ae = true;
                uayVar.c(false, false);
            } else {
                int iB = qqk.c().b();
                LogUtil.a("SleepDayBarChartProvider", "coreSleepProcRate: ", Integer.valueOf(iB));
                if (iB >= 0 && iB < 100) {
                    sleepDayBarChartProvider.f(true);
                } else {
                    ac(sleepDayBarChartProvider);
                }
            }
            sleepDayBarChartProvider.z = false;
        } else {
            e(sleepDayBarChartProvider, 5);
            sleepDayBarChartProvider.g();
            sleepDayBarChartProvider.x();
        }
        return true;
    }

    private static void ac(SleepDayBarChartProvider sleepDayBarChartProvider) {
        sleepDayBarChartProvider.g();
        if (uay.d().c()) {
            e(sleepDayBarChartProvider, 1);
        } else {
            e(sleepDayBarChartProvider, -1);
        }
        sleepDayBarChartProvider.x();
    }

    private static void e(SleepDayBarChartProvider sleepDayBarChartProvider, int i2) {
        LogUtil.a("SleepDayBarChartProvider", " setSyncText " + i2);
        uzo.c(sleepDayBarChartProvider.g, "BAR_CHART_SYNC_TEXT", sleepDayBarChartProvider.e().getString(wud.t(i2)));
        sleepDayBarChartProvider.f28056c.e(sleepDayBarChartProvider.g);
        sleepDayBarChartProvider.ap.c(sleepDayBarChartProvider.f28056c);
    }

    private static void a(SleepDayBarChartProvider sleepDayBarChartProvider, int i2, int i3) {
        boolean zD = eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "SleepDayBarChartProvider"), 143);
        ReleaseLogUtil.e("R_Sleep_SleepDayBarChartProvider", "isSupportCoreSequence：", Boolean.valueOf(zD));
        if (zD && i2 == 1001) {
            sleepDayBarChartProvider.g();
            LogUtil.a("SleepDayBarChartProvider", "mIsSupportCoreSequence is true and results is 1001");
            return;
        }
        if (i2 == 1001) {
            switch (i3) {
                case 5002:
                    sleepDayBarChartProvider.c(false, false);
                    break;
                case 5003:
                    sleepDayBarChartProvider.a(false, false);
                    break;
                case 5004:
                    sleepDayBarChartProvider.b(false, false);
                    break;
                case FitnessStatusCodes.MISSING_BLE_PERMISSION /* 5006 */:
                case FitnessStatusCodes.UNSUPPORTED_PLATFORM /* 5007 */:
                    sleepDayBarChartProvider.e(false, false);
                    break;
            }
            sleepDayBarChartProvider.b(false);
            sleepDayBarChartProvider.g();
            return;
        }
        LogUtil.a("SleepDayBarChartProvider", "coreSleepSyncResults results = ", Integer.valueOf(i2));
    }

    private void b(boolean z, boolean z2) {
        if (f28055b == null) {
            return;
        }
        LogUtil.a("SleepDayBarChartProvider", "refreshNormalSleep isChart ", Boolean.valueOf(z));
        if (z) {
            return;
        }
        av();
        this.ay.sendEmptyMessage(PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED);
        g(z2);
        ao();
        c(this.az);
        this.f28056c.e(this.p.getTime());
        this.f28056c.e(t());
        uzo.c(this.g, "FITNESSCORE_SLEEP_DETAIL_INTERACTOR", f28055b);
        this.f28056c.e(this.g);
        this.ao.add("TYPE_GET_SLEEP_DATA");
        c();
        this.ap.c(this.f28056c);
    }

    private void ao() {
        if (this.f28056c.n() == SleepViewConstants.SleepTypeEnum.MANUAL) {
            this.az = this.f28056c.h().i();
            return;
        }
        if (this.f28056c.n() == SleepViewConstants.SleepTypeEnum.PHONE) {
            this.az = this.f28056c.g().i() + this.f28056c.g().u();
        } else if (this.f28056c.n() == SleepViewConstants.SleepTypeEnum.COMMON) {
            this.az = this.f28056c.b().i();
        } else if (this.f28056c.n() == SleepViewConstants.SleepTypeEnum.SCIENCE) {
            this.az = this.f28056c.k().i() + this.f28056c.k().ar();
        }
    }

    private void g(boolean z) {
        uyt uytVar = new uyt();
        uytVar.e(this.at);
        uytVar.a(false);
        uytVar.e(this.f28056c.k().az());
        uytVar.d(false);
        uytVar.d(this.p);
        if (z) {
            uytVar.b(0);
        }
        a(uytVar);
        f(true);
        d(8, "BAR_CHART_NOON_LEGEND_VISIBILITY");
        d(8, "BAR_CHART_REM_LEGEND_VISIBILITY");
        d(0, "BAR_CHART_CORE_LEGEND_VISIBILITY");
        d(4, "BAR_CHART_PROCESS_TEXT_VISIBILITY");
    }

    private void e(boolean z, boolean z2) {
        LogUtil.a("SleepDayBarChartProvider", " refreshCoreSleep isChart" + z + "isSetHighLight " + z2);
        if (f28055b == null) {
            return;
        }
        if (!z) {
            this.ay.removeMessages(20);
            av();
            d(z2);
        }
        LogUtil.a("SleepDayBarChartProvider", "refreshCoreSleep isChart ", Boolean.valueOf(z));
    }

    private void c(int i2) {
        if (i2 / 60 != 0) {
            d(0, "DURATION_TIME_LAYOUT_VISIBILITY");
        } else if (i2 % 60 == 0) {
            d(4, "DURATION_TIME_LAYOUT_VISIBILITY");
        } else {
            d(0, "DURATION_TIME_LAYOUT_VISIBILITY");
        }
    }

    private static void e(SleepDayBarChartProvider sleepDayBarChartProvider, uay uayVar) {
        if (ltb.m(sleepDayBarChartProvider.p) == ltb.m(ltb.b()) && sleepDayBarChartProvider.z) {
            sleepDayBarChartProvider.e(false, false);
            sleepDayBarChartProvider.g();
            uayVar.c(true, true);
            sleepDayBarChartProvider.z = false;
            return;
        }
        sleepDayBarChartProvider.e(false, true);
        sleepDayBarChartProvider.g();
    }

    private void u() {
        LogUtil.a("SleepDayBarChartProvider", "registerBroadcast !!!");
        this.ag = false;
        BroadcastManagerUtil.e(e(), this.ar, new IntentFilter("action_send_core_sleep_sync_rate"));
        BroadcastManagerUtil.c(e(), this.as, new IntentFilter("com.huawei.health.action.ACTION_CALLBACKSERVICE_PHONESERVICE_DEAD"), LocalBroadcast.f36595c, null);
        LocalBroadcastManager.getInstance().registerReceiver(this.t, new IntentFilter("com.huawei.health.action.COMMON_DATA_SAVE_COMPLETED"));
        this.ag = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(SleepDayBarChartProvider sleepDayBarChartProvider, Message message, uay uayVar) {
        int iD = qqk.c().d();
        int iIntValue = (!(message.obj instanceof Integer) || ((Integer) message.obj).intValue() == 0) ? 0 : ((Integer) message.obj).intValue();
        sleepDayBarChartProvider.ah = false;
        LogUtil.a("SleepDayBarChartProvider", "syncLogicProcessing type = ", Integer.valueOf(iD));
        switch (iD) {
            case 5001:
                sleepDayBarChartProvider.ah = true;
                c(sleepDayBarChartProvider, uayVar, iIntValue);
                break;
            case 5002:
                a(sleepDayBarChartProvider, uayVar, iIntValue);
                break;
            case 5003:
                sleepDayBarChartProvider.ah = true;
                b(sleepDayBarChartProvider, uayVar, iIntValue);
                break;
            case 5004:
                d(sleepDayBarChartProvider, uayVar, iIntValue);
                break;
            case FitnessStatusCodes.UNKNOWN_AUTH_ERROR /* 5005 */:
                if (iIntValue == 1004 || iIntValue == 1003 || iIntValue == 1008) {
                    LogUtil.j("SleepDayBarChartProvider", "requestSuggestData not need update ui, result = ", Integer.valueOf(iIntValue));
                    return;
                } else {
                    b(sleepDayBarChartProvider, message, uayVar, iIntValue);
                    sleepDayBarChartProvider.ai = false;
                }
                break;
            case FitnessStatusCodes.MISSING_BLE_PERMISSION /* 5006 */:
                b(sleepDayBarChartProvider, message, uayVar, iIntValue);
                break;
            case FitnessStatusCodes.UNSUPPORTED_PLATFORM /* 5007 */:
                c(sleepDayBarChartProvider, message, uayVar, iIntValue);
                break;
            case FitnessStatusCodes.TRANSIENT_ERROR /* 5008 */:
                sleepDayBarChartProvider.ah = true;
                b(sleepDayBarChartProvider, uayVar, iIntValue);
                break;
            case FitnessStatusCodes.EQUIVALENT_SESSION_ENDED /* 5009 */:
                b(sleepDayBarChartProvider, message, uayVar, iIntValue);
                break;
            case FitnessStatusCodes.APP_NOT_FIT_ENABLED /* 5010 */:
                sleepDayBarChartProvider.ah = true;
                b(sleepDayBarChartProvider, uayVar, iIntValue);
                break;
            case FitnessStatusCodes.API_EXCEPTION /* 5011 */:
                b(sleepDayBarChartProvider, message, uayVar, iIntValue);
                break;
            case FitnessStatusCodes.AGGREGATION_NOT_SUPPORTED /* 5012 */:
                b(sleepDayBarChartProvider, message, uayVar, iIntValue);
                break;
        }
        if (this.s.get() instanceof KnitSleepDetailActivity) {
            if (this.f28056c.n() == SleepViewConstants.SleepTypeEnum.MANUAL && this.f28056c.h().i() <= 0) {
                this.ah = true;
            }
            ((KnitSleepDetailActivity) this.s.get()).b(sleepDayBarChartProvider.ah);
        }
    }

    private static void c(SleepDayBarChartProvider sleepDayBarChartProvider, uay uayVar, int i2) {
        if (e(sleepDayBarChartProvider, uayVar, i2)) {
            return;
        }
        LogUtil.a("SleepDayBarChartProvider", "setDataPlatformsType1 " + i2);
        boolean zD = eey.d(ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "SleepDayBarChartProvider"), 143);
        ReleaseLogUtil.e("R_Sleep_SleepDayBarChartProvider", "isSupportCoreSequence：", Boolean.valueOf(zD));
        switch (i2) {
            case 1001:
                sleepDayBarChartProvider.g();
                if (zD) {
                    ac(sleepDayBarChartProvider);
                } else {
                    sleepDayBarChartProvider.b(false);
                }
                break;
            case 1002:
                sleepDayBarChartProvider.g();
                e(sleepDayBarChartProvider, 6);
                sleepDayBarChartProvider.x();
                break;
            case 1003:
                ac(sleepDayBarChartProvider);
                break;
            case 1004:
            case 1008:
                break;
            case 1005:
                sleepDayBarChartProvider.g();
                e(sleepDayBarChartProvider, -1);
                sleepDayBarChartProvider.x();
                break;
            case 1006:
                ac(sleepDayBarChartProvider);
                break;
            case 1007:
                sleepDayBarChartProvider.g();
                e(sleepDayBarChartProvider, 3);
                sleepDayBarChartProvider.x();
                break;
            default:
                ac(sleepDayBarChartProvider);
                break;
        }
    }

    private static void a(SleepDayBarChartProvider sleepDayBarChartProvider, uay uayVar, int i2) {
        if (i2 != 0) {
            a(sleepDayBarChartProvider, i2, 5002);
            return;
        }
        if (ltb.m(sleepDayBarChartProvider.p) == ltb.m(ltb.b()) && sleepDayBarChartProvider.z) {
            uayVar.c(false, false);
            sleepDayBarChartProvider.c(false, false);
            sleepDayBarChartProvider.g();
            sleepDayBarChartProvider.z = false;
            return;
        }
        sleepDayBarChartProvider.c(false, true);
        sleepDayBarChartProvider.g();
    }

    private static void b(SleepDayBarChartProvider sleepDayBarChartProvider, uay uayVar, int i2) {
        if (i2 != 0) {
            a(sleepDayBarChartProvider, i2, 5003);
            return;
        }
        if (ltb.m(sleepDayBarChartProvider.p) == ltb.m(ltb.b()) && sleepDayBarChartProvider.z) {
            sleepDayBarChartProvider.a(false, false);
            sleepDayBarChartProvider.g();
            uayVar.c(true, true);
            sleepDayBarChartProvider.z = false;
            return;
        }
        sleepDayBarChartProvider.a(false, true);
        sleepDayBarChartProvider.g();
    }

    private static void d(SleepDayBarChartProvider sleepDayBarChartProvider, uay uayVar, int i2) {
        if (i2 != 0) {
            a(sleepDayBarChartProvider, i2, 5004);
            return;
        }
        if (ltb.m(sleepDayBarChartProvider.p) == ltb.m(ltb.b()) && sleepDayBarChartProvider.z) {
            sleepDayBarChartProvider.b(false, false);
            sleepDayBarChartProvider.g();
            uayVar.c(false, true);
            sleepDayBarChartProvider.z = false;
            return;
        }
        sleepDayBarChartProvider.b(false, true);
        sleepDayBarChartProvider.g();
    }

    private static void b(SleepDayBarChartProvider sleepDayBarChartProvider, Message message, uay uayVar, int i2) {
        h = message.arg2 + "";
        StringBuilder sb = new StringBuilder("setDataPlatformsType6 results");
        sb.append(i2);
        LogUtil.a("SleepDayBarChartProvider", sb.toString());
        if (i2 != 0) {
            a(sleepDayBarChartProvider, i2, FitnessStatusCodes.MISSING_BLE_PERMISSION);
        } else {
            e(sleepDayBarChartProvider, uayVar);
        }
    }

    private static void c(SleepDayBarChartProvider sleepDayBarChartProvider, Message message, uay uayVar, int i2) {
        h = message.arg2 + "";
        if (i2 != 0) {
            a(sleepDayBarChartProvider, i2, FitnessStatusCodes.UNSUPPORTED_PLATFORM);
        } else {
            e(sleepDayBarChartProvider, uayVar);
        }
    }

    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<SleepDayBarChartProvider> f28064c;

        d(SleepDayBarChartProvider sleepDayBarChartProvider) {
            this.f28064c = new WeakReference<>(sleepDayBarChartProvider);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.e("SleepDayBarChartProvider", "mProgressCallBack errCode=", Integer.valueOf(i));
            SleepDayBarChartProvider sleepDayBarChartProvider = this.f28064c.get();
            if (sleepDayBarChartProvider == null) {
                LogUtil.e("SleepDayBarChartProvider", "handler is null");
                return;
            }
            if (i == 20000) {
                int iA = oxi.a(obj == null ? "0" : obj.toString());
                qqk.c().d(iA);
                LogUtil.a("SleepDayBarChartProvider", "progress rate = ", Integer.valueOf(iA));
                uzo.e(iA, sleepDayBarChartProvider.p, sleepDayBarChartProvider.ay, sleepDayBarChartProvider.ae);
                return;
            }
            if (i != 10000) {
                sleepDayBarChartProvider.ay.sendEmptyMessage(3);
            } else {
                LogUtil.a("SleepDayBarChartProvider", "mProgressCallBack normal status");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(SleepDayBarChartProvider sleepDayBarChartProvider, Message message) {
        int i2 = message.arg1;
        LogUtil.a("SleepDayBarChartProvider", "mCustomTransDialogBuilder set rate = ", Integer.valueOf(i2));
        ObserverManagerUtil.e("SLEEP_SYNC_RATE", Integer.valueOf(i2));
        uyt uytVar = new uyt();
        if (ltb.m(sleepDayBarChartProvider.p) == ltb.m(ltb.b())) {
            uytVar.b(1);
        } else {
            uytVar.b(0);
        }
        boolean z = qqk.c().d() == 5003;
        LogUtil.a("SleepDayBarChartProvider", "isOnlySleep: ", Boolean.valueOf(z), ", isScienceSleep: ", Boolean.valueOf(sleepDayBarChartProvider.f28056c.n() == SleepViewConstants.SleepTypeEnum.SCIENCE));
        uytVar.e(sleepDayBarChartProvider.at);
        uytVar.a(sleepDayBarChartProvider.f28056c.n() == SleepViewConstants.SleepTypeEnum.SCIENCE);
        uytVar.e(sleepDayBarChartProvider.f28056c.k().az());
        uytVar.d(z);
        uytVar.d(sleepDayBarChartProvider.p);
        sleepDayBarChartProvider.a(uytVar);
        aa(sleepDayBarChartProvider);
    }

    private static void aa(SleepDayBarChartProvider sleepDayBarChartProvider) {
        switch (qqk.c().d()) {
            case 5001:
                sleepDayBarChartProvider.ae = true;
                break;
            case 5002:
                sleepDayBarChartProvider.c(true, false);
                break;
            case 5003:
                sleepDayBarChartProvider.a(true, false);
                break;
            case 5004:
                sleepDayBarChartProvider.b(true, false);
                break;
            case FitnessStatusCodes.MISSING_BLE_PERMISSION /* 5006 */:
                sleepDayBarChartProvider.e(true, false);
                break;
            case FitnessStatusCodes.UNSUPPORTED_PLATFORM /* 5007 */:
                sleepDayBarChartProvider.e(true, false);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ad(SleepDayBarChartProvider sleepDayBarChartProvider) {
        LogUtil.a("SleepDayBarChartProvider", "show sync end loadingAnimation.stop()");
        qqk.c().d(100);
        ObserverManagerUtil.e("SLEEP_SYNC_RATE", 100);
        sleepDayBarChartProvider.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        LogUtil.a("SleepDayBarChartProvider", "handleWhenSyncTimeOut() loadingAnimation.stop()");
        g();
        qqk.c().d(100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtil.a("SleepDayBarChartProvider", "handleSyncTimeOut");
        g();
        ObserverManagerUtil.e("SLEEP_SYNC_RATE", 101);
    }

    class a extends BaseHandler<SleepDayBarChartProvider> {
        a(SleepDayBarChartProvider sleepDayBarChartProvider) {
            super(sleepDayBarChartProvider);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(SleepDayBarChartProvider sleepDayBarChartProvider, Message message) {
            if (sleepDayBarChartProvider == null) {
                return;
            }
            uay uayVarD = uay.d();
            int i = message.what;
            if (i == 3) {
                sleepDayBarChartProvider.o();
                return;
            }
            if (i == 20) {
                sleepDayBarChartProvider.l();
                return;
            }
            if (i == 5000) {
                SleepDayBarChartProvider.this.d(sleepDayBarChartProvider, message, uayVarD);
                return;
            }
            if (i == 6008) {
                sleepDayBarChartProvider.ae();
                return;
            }
            if (i != 6009) {
                switch (i) {
                    case 23:
                        SleepDayBarChartProvider.d(sleepDayBarChartProvider, message);
                        break;
                    case 24:
                        SleepDayBarChartProvider.ad(sleepDayBarChartProvider);
                        break;
                    case 25:
                        LogUtil.a("SleepDayBarChartProvider", "sync MSG_PROC_TO_REFRESH_CORE_SLEEP");
                        qqk.c().d(100);
                        ObserverManagerUtil.e("SLEEP_SYNC_RATE", 100);
                        sleepDayBarChartProvider.b(false);
                        break;
                }
                return;
            }
            sleepDayBarChartProvider.af();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        uzo.c(this.g, e(), this.f28056c);
        this.ap.c(this.f28056c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void af() {
        uzo.e(this.g, e(), this.f28056c, this.ap);
        this.ap.c(this.f28056c);
    }

    public void d(boolean z) {
        uyt uytVar = new uyt();
        uytVar.e(this.at);
        uytVar.a(true);
        uytVar.e(this.f28056c.k().az());
        uytVar.d(false);
        uytVar.d(this.p);
        if (z) {
            uytVar.b(0);
        }
        a(uytVar);
        f(true);
        at();
    }

    private String m() {
        if (this.p != null) {
            return qrk.e(e(), this.p.getTime());
        }
        return "--";
    }

    public static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<SleepDayBarChartProvider> f28062a;

        public b(SleepDayBarChartProvider sleepDayBarChartProvider) {
            this.f28062a = new WeakReference<>(sleepDayBarChartProvider);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            WeakReference<SleepDayBarChartProvider> weakReference = this.f28062a;
            if (weakReference == null) {
                LogUtil.a("SleepDayBarChartProvider", "weakReference is null");
                return;
            }
            final SleepDayBarChartProvider sleepDayBarChartProvider = weakReference.get();
            if (sleepDayBarChartProvider == null) {
                LogUtil.a("SleepDayBarChartProvider", "sleepDayBarChartProvider is null");
                return;
            }
            if (i != 0 || obj == null) {
                return;
            }
            LogUtil.a("SleepDayBarChartProvider", "errorCode: " + i);
            if (njy.b(obj, gxq.class)) {
                final List list = (List) obj;
                LogUtil.a("SleepDayBarChartProvider", "onResponse: ", list.toString());
                LogUtil.a("SleepDayBarChartProvider", "size: ", Integer.valueOf(list.size()));
                if (list.size() == 3) {
                    ThreadPoolManager.c().execute(new Runnable() { // from class: uzh
                        @Override // java.lang.Runnable
                        public final void run() {
                            sleepDayBarChartProvider.d((List<gxq>) list);
                        }
                    });
                }
            }
        }
    }

    static class i implements HiDataReadResultListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<SleepDayBarChartProvider> f28072b;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        public i(SleepDayBarChartProvider sleepDayBarChartProvider) {
            this.f28072b = new WeakReference<>(sleepDayBarChartProvider);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("SleepDayBarChartProvider", "read wakeup feeling");
            WeakReference<SleepDayBarChartProvider> weakReference = this.f28072b;
            if (weakReference == null) {
                LogUtil.a("SleepDayBarChartProvider", "weakReference is null");
                return;
            }
            SleepDayBarChartProvider sleepDayBarChartProvider = weakReference.get();
            if (sleepDayBarChartProvider != null) {
                int iE = sleepDayBarChartProvider.e((SparseArray<Object>) obj);
                if (sleepDayBarChartProvider.f28056c == null || sleepDayBarChartProvider.f28056c.m() == null || iE == -1) {
                    return;
                }
                uzo.c(sleepDayBarChartProvider.g, "WAKEUP_FEELING", Integer.valueOf(iE));
                ObserverManagerUtil.e(ObserveLabels.REFRESH_REPORT_BEAN, Integer.valueOf(iE));
            }
        }
    }

    static class g implements HiSubscribeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f28069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<SleepDayBarChartProvider> f28070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<Integer> f28071c;
        private long e;

        public g(SleepDayBarChartProvider sleepDayBarChartProvider, long j, long j2) {
            this.f28070b = new WeakReference<>(sleepDayBarChartProvider);
            this.e = j;
            this.f28069a = j2;
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            LogUtil.a("SleepDayBarChartProvider", "successList: " + list + ", failList: " + list2);
            this.f28071c = list;
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            WeakReference<SleepDayBarChartProvider> weakReference = this.f28070b;
            if (weakReference == null) {
                LogUtil.a("SleepDayBarChartProvider", "weakReference is null");
                return;
            }
            SleepDayBarChartProvider sleepDayBarChartProvider = weakReference.get();
            if (sleepDayBarChartProvider != null) {
                if (sleepDayBarChartProvider.p == null || !TimeUtil.d(sleepDayBarChartProvider.p.getTime(), System.currentTimeMillis())) {
                    return;
                }
                uzo.c(this.e, this.f28069a, 3, new i(sleepDayBarChartProvider));
                return;
            }
            LogUtil.a("SleepDayBarChartProvider", "sleepDayBarChartProvider is null");
        }
    }
}
