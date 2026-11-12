package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.health.utils.functionsetcard.FunctionSetBean;
import com.huawei.health.health.utils.functionsetcard.FunctionSetType;
import com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.health.sleep.SleepApi;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.SleepDailyProcessResultCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.functionsetcard.view.SleepThumbnailView;
import com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepJsApi;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementCallback;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes43.dex */
public class skc extends FunctionSetBeanReader {
    private static final Map<Integer, String> d = new HashMap<Integer, String>() { // from class: skc.2
        {
            put(44102, "core_sleep_deep_key");
            put(44103, "core_sleep_shallow_key");
            put(44101, "core_sleep_wake_dream_key");
            put(44105, "core_sleep_total_sleep_time_key");
            put(44001, "sleep_deep_key");
            put(44002, "sleep_shallow_key");
            put(44108, "core_sleep_day_sleep_time_key");
            put(44104, "core_sleep_wake_key");
            put(44109, "data_session_manual_sleep_bed_time_key");
            put(44110, "sleep_device_category_key");
            put(44203, "core_sleep_score_key");
            put(44235, "sleep_version");
            put(44111, "core_sleep_rem_key_aasm");
            put(44112, "core_sleep_deep_key_aasm");
            put(44113, "core_sleep_shallow_key_aasm");
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f48238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Observer f48239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f48240c;
    private boolean e;
    private volatile String f;
    private ImageView g;
    private final c h;
    private final e i;
    private int j;
    private volatile boolean k;
    private final boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private final Observer p;
    private volatile Boolean q;
    private List<Integer> r;
    private long s;
    private SleepThumbnailView t;
    private UserLabelServiceApi u;
    private String w;

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("skinId")
        public String f48248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("expireTime")
        public long f48249c;
    }

    public static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("resultDesc")
        public String f48251c;

        @SerializedName("data")
        public List<a> d;

        @SerializedName("resultCode")
        public int e;
    }

    private boolean b(int i2, double d2) {
        return i2 != 0 && d2 == 0.0d;
    }

    private boolean d(int i2, int i3) {
        return (i3 == 0 && i2 != 0) || i2 < 180;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public boolean isMessageDefaultLargeCard() {
        return true;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public boolean isSubscribeType(int i2) {
        return i2 == 2 || i2 == 3;
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.f)) {
            return false;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f)) {
            return true;
        }
        return !str.equals(this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(int i2) {
        switch (i2) {
            case 1:
                return qre.f(R.string.IDS_sleep_conclusion_1001);
            case 2:
                return qre.f(R.string.IDS_sleep_conclusion_1003);
            case 3:
                return qre.f(R.string.IDS_sleep_conclusion_1002);
            case 4:
                return qre.f(R.string.IDS_sleep_conclusion_1004);
            case 5:
                return qre.f(R.string.IDS_sleep_duration_long);
            case 6:
            case 9:
            default:
                return "";
            case 7:
                return qre.f(R.string.IDS_sleep_conclusion_1006);
            case 8:
                return qre.f(R.string.IDS_sleep_duration_short);
            case 10:
                return "has_core_sleep".equals(this.f48238a) ? "" : qre.f(R.string.IDS_sleep_conclusion_1008);
            case 11:
                return "has_core_sleep".equals(this.f48238a) ? "" : qre.f(R.string.IDS_sleep_conclusion_1009);
            case 12:
                return qre.f(R.string.IDS_sleep_conclusion_1013);
            case 13:
                return qre.f(R.string.IDS_sleep_conclusion_1014);
            case 14:
                return qre.f(R.string.IDS_sleep_conclusion_1015);
            case 15:
                return qre.f(R.string.IDS_sleep_conclusion_1012);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getDataTypeTextColor() {
        return R.color.sleep_daily_problem_text_color;
    }

    static class e extends HandleCacheDataRunnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<skc> f48252c;
        private boolean e;

        e(skc skcVar) {
            super("FunctionSetSleepCardReader", null);
            this.f48252c = new WeakReference<>(skcVar);
        }

        @Override // com.huawei.health.health.utils.functionsetcard.HandleCacheDataRunnable
        public void handleCacheData(HiHealthData hiHealthData, boolean z) {
            skc skcVar = this.f48252c.get();
            LogUtil.a("FunctionSetSleepCardReader", "handleCacheData isNewData: ", Boolean.valueOf(z));
            if (skcVar == null) {
                LogUtil.j("FunctionSetSleepCardReader", "handleCacheData reader is null");
                return;
            }
            if (!z) {
                List<HiHealthData> listE = gwb.e(String.valueOf(DateFormatUtil.a(System.currentTimeMillis())));
                if (njy.b(listE) && !hiHealthData.equals(listE.get(0))) {
                    hiHealthData = listE.get(0);
                }
            }
            if (hiHealthData == null && this.e && z) {
                LogUtil.j("FunctionSetSleepCardReader", "handleCacheData data is null, show empty view");
                skc.setHasCardData(this.f48252c, false);
                skcVar.g();
            } else if (hiHealthData != null) {
                skc.setHasCardData(this.f48252c, true);
                skcVar.e(hiHealthData, z);
                this.e = true;
            }
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void subscribeDataChange() {
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(2);
        arrayList.add(3);
        HiHealthNativeApi.a(this.mContext).subscribeHiHealthData(arrayList, new FunctionSetBeanReader.e("FunctionSetSleepCardReader", this));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void unsubscribeDataChange() {
        HiHealthNativeApi.a(this.mContext).unSubscribeHiHealthData(this.r, new FunctionSetBeanReader.c("FunctionSetSleepCardReader", "unSubscribeSleepData, isSuccess :"));
    }

    public skc(Context context, CardConfig cardConfig) {
        super(context, "FunctionSetSleepCardReader", cardConfig);
        this.i = new e(this);
        this.w = "FunctionSetSleepCardReader";
        this.r = null;
        this.e = false;
        this.j = 0;
        this.n = false;
        this.o = true;
        this.f48238a = "";
        this.k = false;
        Observer observer = new Observer() { // from class: skc.3
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                skc.this.n = true;
                skc.this.readCardData();
            }
        };
        this.f48239b = observer;
        LogUtil.a("FunctionSetSleepCardReader", "FunctionSetSleepCardReader create");
        this.l = Utils.o();
        this.h = new c();
        this.u = (UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class);
        new IntentFilter("com.huawei.hihealth.action_account_login_datas_switch_finish").addAction("com.huawei.hihealth.action_account_login_datas_switch_finish");
        subscribeDataChange();
        Observer observer2 = new Observer() { // from class: skc.1
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                if (StringUtils.g(str) || !skc.this.e) {
                    LogUtil.e("FunctionSetSleepCardReader", "label is null || isRegSuccess");
                } else if ("com.huawei.plugin.account.login".equals(str)) {
                    skc.this.subscribeDataChange();
                }
            }
        };
        this.p = observer2;
        ObserverManagerUtil.d(observer2, "com.huawei.plugin.account.login");
        ObserverManagerUtil.d(observer, "KNIT_SLEEP_ACTIVITY_DESTROY");
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, FunctionSetSubCardData functionSetSubCardData) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onBindViewHolder(viewHolder, functionSetSubCardData);
        ReleaseLogUtil.d("TimeEat_FunctionSetSleepCardReader", "onBindViewHolder finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onDestroy() {
        super.onDestroy();
        if (njy.e(this.r)) {
            LogUtil.j("FunctionSetSleepCardReader", "onDestroy mSleepSuccessList is empty");
        } else {
            unsubscribeDataChange();
        }
        ObserverManagerUtil.a(this.p, "com.huawei.plugin.account.login");
        ObserverManagerUtil.a(this.f48239b, "KNIT_SLEEP_ACTIVITY_DESTROY");
        c cVar = this.h;
        if (cVar == null) {
            LogUtil.j("FunctionSetSleepCardReader", "onDestroy mHandler is null");
        } else {
            cVar.removeCallbacksAndMessages(null);
        }
    }

    private void a(boolean z, boolean z2, long j2) {
        Intent intent = new Intent(this.mContext, (Class<?>) KnitSleepDetailActivity.class);
        intent.putExtra(Constants.CORE_SLEEP_TODAY_HAS_DATA, z);
        intent.putExtra(Constants.SLEEP_TYPE_KEY, z2);
        intent.putExtra("from", 0);
        if (this.q != null) {
            intent.putExtra("key_is_open_sleep_management", this.q);
        }
        intent.setFlags(268435456);
        intent.putExtra("key_bundle_health_red_dot", getFunctionSetBean().g());
        intent.putExtra("key_bundle_health_last_data_time", j2);
        try {
            tfc.a(this.mContext, intent, isShowHomePageRecommendLayout() ? null : this.mCardViewHolder.itemView, false);
        } catch (AndroidRuntimeException e2) {
            LogUtil.e("FunctionSetSleepCardReader", "Activity start failed: " + LogAnonymous.b(e2));
        }
    }

    private void e(Context context) {
        if (CommonUtil.ap()) {
            if (lsl.c(lua.d("SP_ENTER_SLEEP_LAST_TIME", "SP_ENTER_SLEEP_LAST_TIME", 0L), System.currentTimeMillis())) {
                LogUtil.a("FunctionSetSleepCardReader", "has been enter sleep");
                return;
            }
            String url = GRSManager.c(context).getUrl("marketingGateWayUrl");
            if (TextUtils.isEmpty(url)) {
                LogUtil.e("FunctionSetSleepCardReader", "querySkinFromCloudAndUpdate url is empty");
                return;
            }
            String str = url + "/healthCoachRoute/v1/skins";
            Map<String, String> mapD = d();
            String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
            if (!TextUtils.isEmpty(accountInfo)) {
                mapD.put("x-huid", accountInfo);
            }
            String commonCountryCode = GRSManager.c(context).getCommonCountryCode();
            int iE = e();
            String str2 = "?timeZone=" + e(ieg.d()) + "&type=0&noStandSkin=1&clientType=" + iE + "&countryCode=" + commonCountryCode;
            LogUtil.e("FunctionSetSleepCardReader", "querySkinFromCloudAndUpdate");
            try {
                lua.a("SP_ENTER_SLEEP_LAST_TIME", "SP_ENTER_SLEEP_LAST_TIME", System.currentTimeMillis());
            } catch (Exception e2) {
                LogUtil.e("FunctionSetSleepCardReader", "querySkinFromCloudAndUpdate exception: ", e2.getMessage());
            }
        }
    }

    private static Map<String, String> d() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1015);
        HashMap map = new HashMap(16);
        map.put("Content-type", "application/json");
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + accountInfo);
        map.put(CloudParamKeys.X_TS, String.valueOf(System.currentTimeMillis()));
        map.put("x-version", CommonUtil.c(BaseApplication.getContext()));
        return map;
    }

    private int e() {
        if (CommonUtil.bg()) {
            return 1;
        }
        return CommonUtil.bd() ? 2 : 3;
    }

    private String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            LogUtil.j("FunctionSetSleepCardReader", "encodeTimeZone failed: ", e2.getMessage());
            return str;
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public final void readCardData() {
        super.readCardData();
        LogUtil.a("FunctionSetSleepCardReader", "readCardData");
        this.k = false;
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(0L);
        hiAggregateOption.setEndTime(HiDateUtil.g(System.currentTimeMillis()));
        hiAggregateOption.setCount(1);
        hiAggregateOption.setGroupUnitSize(1);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setType(new int[]{44102, 44103, 44101, 44105, 44001, 44002, 44108, 44104, 44109, 44110, 44203, 44235, 44111, 44112, 44113});
        hiAggregateOption.setConstantsKey(new String[]{"core_sleep_deep_key", "core_sleep_shallow_key", "core_sleep_wake_dream_key", "core_sleep_total_sleep_time_key", "sleep_deep_key", "sleep_shallow_key", "core_sleep_day_sleep_time_key", "core_sleep_wake_key", "data_session_manual_sleep_bed_time_key", "sleep_device_category_key", "core_sleep_score_key", "sleep_version", "core_sleep_rem_key_aasm", "core_sleep_deep_key_aasm", "core_sleep_shallow_key_aasm"});
        HiHealthManager.d(this.mContext).aggregateHiHealthData(hiAggregateOption, new b(this));
        if (VersionControlUtil.isSupportSleepManagement()) {
            this.q = uag.c((Boolean) null);
            uag.e(new h(this));
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        ReleaseLogUtil.d("TimeEat_FunctionSetSleepCardReader", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final long j2, int i2) {
        LogUtil.a("FunctionSetSleepCardReader", "dailyProcessResult, curTime: ", Long.valueOf(j2));
        if (!VersionControlUtil.isSupportSleepManagement()) {
            LogUtil.j("FunctionSetSleepCardReader", "not support sleep management");
            return;
        }
        if (i2 >= 80) {
            ReleaseLogUtil.e("TimeEat_FunctionSetSleepCardReader", "sleepScore too high");
            d("");
        } else if (j2 == 0) {
            LogUtil.j("FunctionSetSleepCardReader", "curTime is 0");
        } else if (this.k) {
            LogUtil.j("FunctionSetSleepCardReader", "hide sleep problem");
            d("");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: skc.4
                @Override // java.lang.Runnable
                public void run() {
                    skc.this.c(j2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j2) {
        ReleaseLogUtil.d("TimeEat_", "start query daily problem");
        uag.c(j2, new i(this, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j2) {
        SleepApi sleepApi = (SleepApi) Services.d("Main", SleepApi.class);
        if (sleepApi != null) {
            sleepApi.requestDailyProcessResult(ieg.c(j2), new j(this));
        } else {
            LogUtil.a("FunctionSetSleepCardReader", "sleepServiceApi is null");
        }
    }

    static class j implements SleepDailyProcessResultCallback {
        private WeakReference<skc> e;

        public j(skc skcVar) {
            this.e = new WeakReference<>(skcVar);
        }

        @Override // com.huawei.hwbasemgr.SleepDailyProcessResultCallback
        public void onResponse(int i, Object obj) {
            skc skcVar = this.e.get();
            if (skcVar == null) {
                LogUtil.e("FunctionSetSleepCardReader", "reader is null");
            } else if (obj instanceof gxd) {
                String strC = skcVar.c(((gxd) obj).j());
                LogUtil.a("FunctionSetSleepCardReader", "requested dailyProblem: ", strC);
                skcVar.d(strC);
            }
        }
    }

    static class i implements SleepManagementCallback<Map<String, Object>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<skc> f48253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f48254c;

        public i(skc skcVar, long j) {
            this.f48253b = new WeakReference<>(skcVar);
            this.f48254c = j;
        }

        @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Map<String, Object> map) {
            skc skcVar = this.f48253b.get();
            if (skcVar == null) {
                LogUtil.e("FunctionSetSleepCardReader", "reader is null");
                return;
            }
            if (map.size() == 0) {
                LogUtil.e("FunctionSetSleepCardReader", "result is null");
                skcVar.a(this.f48254c);
                return;
            }
            Object obj = map.get("dailySleepProblem");
            if (obj instanceof Integer) {
                String strC = skcVar.c(((Integer) obj).intValue());
                LogUtil.a("FunctionSetSleepCardReader", "query result: ", strC);
                skcVar.d(strC);
            } else {
                LogUtil.e("FunctionSetSleepCardReader", "object is null");
                skcVar.a(this.f48254c);
            }
        }

        @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.SleepManagementCallback
        public void onFailure(int i, String str) {
            LogUtil.e("FunctionSetSleepCardReader", "errCode: ", Integer.valueOf(i), ", errMsg: ", str);
            skc skcVar = this.f48253b.get();
            if (skcVar != null) {
                skcVar.a(this.f48254c);
            } else {
                LogUtil.e("FunctionSetSleepCardReader", "reader is null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (!a(str)) {
            LogUtil.a("FunctionSetSleepCardReader", "dailyProblem not changed");
            return;
        }
        this.f = str;
        if (getFunctionSetBean() == null) {
            LogUtil.a("FunctionSetSleepCardReader", "functionsetbean not build, wait to build");
            return;
        }
        getFunctionSetBean().e(this.f);
        LogUtil.a("FunctionSetSleepCardReader", "current DailyProblem is ", this.f);
        b(getFunctionSetBean());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean a(HiHealthData hiHealthData) {
        int i2 = hiHealthData.getInt("core_sleep_deep_key");
        int i3 = hiHealthData.getInt("core_sleep_shallow_key");
        int i4 = hiHealthData.getInt("core_sleep_wake_dream_key");
        int i5 = hiHealthData.getInt("core_sleep_wake_key");
        int i6 = hiHealthData.getInt("core_sleep_day_sleep_time_key");
        int i7 = hiHealthData.getInt("data_session_manual_sleep_bed_time_key");
        int i8 = hiHealthData.getInt("core_sleep_total_sleep_time_key");
        int i9 = hiHealthData.getInt("sleep_deep_key");
        int i10 = hiHealthData.getInt("sleep_shallow_key");
        if (gwc.e(hiHealthData)) {
            i2 = hiHealthData.getInt("core_sleep_deep_key_aasm");
            i3 = hiHealthData.getInt("core_sleep_shallow_key_aasm");
            i4 = hiHealthData.getInt("core_sleep_rem_key_aasm");
        }
        return (((((((i2 + i3) + i4) + i5) + i6) + i7) + i8) + i9) + i10 <= 0;
    }

    public static class b implements HiAggregateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<skc> f48250b;

        public b(skc skcVar) {
            this.f48250b = new WeakReference<>(skcVar);
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            WeakReference<skc> weakReference = this.f48250b;
            if (weakReference == null) {
                LogUtil.e("FunctionSetSleepCardReader", "mReference is null");
                return;
            }
            skc skcVar = weakReference.get();
            if (skcVar == null) {
                LogUtil.e("FunctionSetSleepCardReader", "reader is null, refresh failed");
                return;
            }
            HiHealthData hiHealthData = null;
            if (njy.e(list)) {
                LogUtil.j("FunctionSetSleepCardReader", "readCardData onResult dataList is empty");
                skcVar.saveDataFromHealthApi(skcVar.w, skcVar, (HiHealthData) null);
                return;
            }
            LogUtil.a("FunctionSetSleepCardReader", "readCardData success");
            HiHealthData hiHealthData2 = list.get(0);
            LogUtil.a("FunctionSetSleepCardReader", "last data:", hiHealthData2);
            if (skc.a(hiHealthData2)) {
                ReleaseLogUtil.e("error data", new Object[0]);
            } else {
                hiHealthData = hiHealthData2;
            }
            skcVar.saveDataFromHealthApi(skcVar.w, skcVar, hiHealthData);
            if (hiHealthData != null) {
                long startTime = hiHealthData.getStartTime();
                SharedPreferenceManager.c("privacy_center", "sleep", String.valueOf(startTime));
                skcVar.c(startTime, hiHealthData.getInt("core_sleep_score_key"));
                return;
            }
            LogUtil.a("FunctionSetSleepCardReader", "data is null");
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.a("FunctionSetSleepCardReader", "readCardData onResultIntent intentType ", Integer.valueOf(i), " errorCode ", Integer.valueOf(i2));
        }
    }

    static class h implements IBaseResponseCallback {
        private WeakReference<skc> e;

        public h(skc skcVar) {
            this.e = new WeakReference<>(skcVar);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            skc skcVar = this.e.get();
            if (skcVar == null) {
                LogUtil.e("FunctionSetSleepCardReader", "reader is null, refresh failed");
                return;
            }
            ReleaseLogUtil.d("FunctionSetSleepCardReader", "SleepPlanOpenCallback errorCode:", Integer.valueOf(i), " objData:", obj);
            if (obj instanceof Boolean) {
                skcVar.q = (Boolean) obj;
            }
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader, com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void initCardData() {
        sis.e().d(new HiDataReadResultListener() { // from class: skc.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                int[] iArrA = sis.a();
                ArrayList arrayList = new ArrayList();
                SparseArray sparseArray = obj instanceof SparseArray ? (SparseArray) obj : null;
                if (sparseArray != null) {
                    for (int i4 : iArrA) {
                        arrayList.addAll(nkb.c((SparseArray<Object>) sparseArray, i4));
                    }
                }
                LogUtil.a("FunctionSetSleepCardReader", "sleep dataList: ", arrayList);
                HiHealthData hiHealthDataA = skc.this.a(arrayList);
                LogUtil.a("FunctionSetSleepCardReader", "aggregated data: ", hiHealthDataA);
                if (hiHealthDataA == null || skc.a(hiHealthDataA)) {
                    LogUtil.j("FunctionSetSleepCardReader", "readCardData onResult dataList is empty");
                    skc skcVar = skc.this;
                    skcVar.saveDataFromHealthApi(skcVar.w, skc.this, (HiHealthData) null);
                } else {
                    skc skcVar2 = skc.this;
                    skcVar2.saveDataFromHealthApi(skcVar2.w, skc.this, hiHealthDataA);
                    skc.this.c(hiHealthDataA.getStartTime(), hiHealthDataA.getInt("core_sleep_score_key"));
                }
            }
        });
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void saveDataFromHealthApi(String str, FunctionSetBeanReader functionSetBeanReader, HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            if (ArkUIXConstants.DELETE.equals(this.mChangeKey)) {
                ObserverManagerUtil.e("SLEEP_MESSAGE_JUMP_TAG", Long.valueOf(this.s), true);
            }
            super.saveDataFromHealthApi(str, functionSetBeanReader, hiHealthData);
            return;
        }
        int i2 = hiHealthData.getInt("core_sleep_deep_key");
        int i3 = hiHealthData.getInt("core_sleep_shallow_key");
        int i4 = hiHealthData.getInt("core_sleep_wake_dream_key");
        int i5 = hiHealthData.getInt("core_sleep_wake_key");
        int i6 = hiHealthData.getInt("core_sleep_day_sleep_time_key");
        if (gwc.e(hiHealthData)) {
            i2 = hiHealthData.getInt("core_sleep_deep_key_aasm");
            i3 = hiHealthData.getInt("core_sleep_shallow_key_aasm");
            i4 = hiHealthData.getInt("core_sleep_rem_key_aasm");
        }
        if (b(i5, i2 + i3 + i4 + i6)) {
            LogUtil.a("FunctionSetSleepCardReader", "saveDataFromHealthApi, is only wake up time");
            this.k = true;
        } else {
            super.saveDataFromHealthApi(str, functionSetBeanReader, hiHealthData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HiHealthData a(List<HiHealthData> list) {
        String str;
        HiHealthData hiHealthDataC = null;
        if (njy.e(list)) {
            return null;
        }
        long startTime = -1;
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                if (startTime == -1) {
                    startTime = hiHealthData.getStartTime();
                    hiHealthDataC = c(hiHealthData);
                }
                if (hiHealthData.getStartTime() == startTime && (str = d.get(Integer.valueOf(hiHealthData.getType()))) != null) {
                    hiHealthDataC.putInt(str, hiHealthData.getInt("point_value"));
                }
            }
        }
        return hiHealthDataC;
    }

    private HiHealthData c(HiHealthData hiHealthData) {
        Parcel parcelObtain = Parcel.obtain();
        hiHealthData.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        HiHealthData hiHealthDataCreateFromParcel = HiHealthData.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        Iterator<String> it = d.values().iterator();
        while (it.hasNext()) {
            hiHealthDataCreateFromParcel.putInt(it.next(), 0);
        }
        return hiHealthDataCreateFromParcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.m = false;
        b(buildEmptyCardBean());
    }

    private void b(FunctionSetBean functionSetBean) {
        Message messageObtainMessage = this.h.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = functionSetBean;
        this.h.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public FunctionSetBean buildEmptyCardBean() {
        return new FunctionSetBean.c(qre.f(R.string.IDS_hw_show_main_home_page_sleep)).c(qre.f(R.string.IDS_hw_show_main_home_page_sleep_description)).e(FunctionSetType.SLEEP_CARD).c(FunctionSetBean.ViewType.EMPTY_VIEW).b(this.mContext).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: skc.9
                @Override // java.lang.Runnable
                public void run() {
                    skc.this.h();
                }
            });
            return;
        }
        if (this.g == null) {
            this.g = new ImageView(this.mContext);
        }
        this.g.setImageResource(R.drawable.sleep_card_noon_sleep);
        this.f48240c = this.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i2, final int i3, final int i4, final int i5, final int i6, final int i7, final int i8) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: skc.7
                @Override // java.lang.Runnable
                public void run() {
                    skc.this.a(i2, i3, i4, i5, i6, i7, i8);
                }
            });
            return;
        }
        if (this.t == null) {
            this.t = new SleepThumbnailView(this.mContext);
        }
        this.t.setSleepData(i2, i3, i4, i5, i6, i7, i8);
        this.f48240c = this.t;
    }

    private void d(final boolean z) {
        lsy.a(new Runnable() { // from class: skc.10
            @Override // java.lang.Runnable
            public void run() {
                if (!z || SharedPreferenceManager.c(skc.this.mContext)) {
                    return;
                }
                SharedPreferenceManager.e(skc.this.mContext, true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x0188  */
    /* JADX WARN: Code duplicated, block: B:45:0x0195  */
    /* JADX WARN: Code duplicated, block: B:47:0x019b  */
    /* JADX WARN: Code duplicated, block: B:48:0x019d  */
    /* JADX WARN: Code duplicated, block: B:52:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e8  */
    public void e(HiHealthData hiHealthData, boolean z) {
        int i2;
        Boolean bool;
        int i3;
        boolean z2;
        boolean z3;
        String str;
        int i4;
        String str2;
        FunctionSetBean functionSetBeanE;
        this.m = true;
        int i5 = hiHealthData.getInt("core_sleep_deep_key");
        int i6 = hiHealthData.getInt("core_sleep_shallow_key");
        int i7 = hiHealthData.getInt("core_sleep_wake_dream_key");
        int i8 = hiHealthData.getInt("core_sleep_wake_key");
        int i9 = hiHealthData.getInt("core_sleep_day_sleep_time_key");
        int i10 = hiHealthData.getInt("data_session_manual_sleep_bed_time_key");
        int i11 = hiHealthData.getInt("core_sleep_total_sleep_time_key");
        int i12 = hiHealthData.getInt("sleep_deep_key");
        int i13 = hiHealthData.getInt("sleep_shallow_key");
        int i14 = i5;
        double d2 = (((double) (i12 + i13)) * 1.0d) / 60.0d;
        if (gwc.e(hiHealthData)) {
            int i15 = hiHealthData.getInt("core_sleep_deep_key_aasm");
            int i16 = hiHealthData.getInt("core_sleep_shallow_key_aasm");
            i14 = i15;
            i2 = hiHealthData.getInt("core_sleep_rem_key_aasm");
            i6 = i16;
        } else {
            i2 = i7;
        }
        LogUtil.a("FunctionSetSleepCardReader", "deepTime: ", Integer.valueOf(i14), " shallowTime: ", Integer.valueOf(i6), " remTime: ", Integer.valueOf(i2), " awakeTime: ", Integer.valueOf(i8), " noonTime: ", Integer.valueOf(i9), " manualBedTime: ", Integer.valueOf(i10), " manualSleepTime: ", Integer.valueOf(i11), " normalDeepTime: ", Integer.valueOf(i12), " normalShallowTime: ", Integer.valueOf(i13), " normalSleepTime: ", Double.valueOf(d2));
        int i17 = i6;
        double d3 = i14 + i6 + i2 + i9;
        int i18 = i17;
        int i19 = i8;
        if (b(i8, d3)) {
            LogUtil.a("FunctionSetSleepCardReader", "is only wake up time, isNewData: ", Boolean.valueOf(z));
            this.k = true;
            if (!z) {
                setHasCardData(false);
                this.m = false;
                refreshCardBySp(buildEmptyCardBean());
            }
            if (ArkUIXConstants.DELETE.equals(this.mChangeKey)) {
                ObserverManagerUtil.e("SLEEP_MESSAGE_JUMP_TAG", Long.valueOf(this.s), true);
                return;
            }
            return;
        }
        if (d3 != 0.0d) {
            bool = true;
            if (d3 != i9) {
                i3 = i11;
                z2 = true;
            }
            str = "has_core_sleep";
            z3 = false;
            if (z3) {
                this.k = z2;
                h();
                str2 = ArkUIXConstants.DELETE;
            } else {
                if ("has_common_sleep".equals(str)) {
                    i4 = 0;
                } else {
                    i4 = i9;
                }
                str2 = ArkUIXConstants.DELETE;
                a(i14, i18, i2, i19, i4, i10, i3);
            }
            this.f48238a = d(hiHealthData, str);
            functionSetBeanE = e(hiHealthData, d3);
            functionSetBeanE.a(b(d3, i19, i9, i10));
            if (z) {
                setFunctionSetBean(functionSetBeanE);
                b(functionSetBeanE);
            } else {
                refreshCardBySp(functionSetBeanE);
            }
            d(z);
            if (str2.equals(this.mChangeKey)) {
                ObserverManagerUtil.e("SLEEP_MESSAGE_JUMP_TAG", Long.valueOf(this.s), bool);
            }
            LogUtil.a("FunctionSetSleepCardReader", "refreshSleepDataAndTime type ", str, ", category: ", this.f48238a, " deepTime ", Integer.valueOf(i14), " shallowTime ", Integer.valueOf(i18), " remTime ", Integer.valueOf(i2), " awakeTime ", Integer.valueOf(i19), " noonTime ", Integer.valueOf(i9), ", manualBedTime ", Integer.valueOf(i10), ", manualSleepTime ", Integer.valueOf(i3), ", mLastDataTime ", Long.valueOf(this.s));
        }
        bool = true;
        if (d2 != 0.0d) {
            i14 = hiHealthData.getInt("sleep_deep_key");
            int i20 = hiHealthData.getInt("sleep_shallow_key");
            int i21 = hiHealthData.getInt("sleep_wake_key");
            double d4 = (((double) (i14 + i20)) * 1.0d) / 60.0d;
            if (i9 == 0 || d4 != 0.0d) {
                i19 = i21;
                i18 = i20;
                d3 = d4;
                str = "has_common_sleep";
                i3 = i11;
                z2 = true;
                z3 = false;
            } else {
                i19 = i21;
                i18 = i20;
                d3 = i9;
                i3 = i11;
                str = "has_core_sleep";
                z2 = true;
                z3 = true;
            }
        } else if (i10 != 0) {
            i3 = i11;
            d3 = i11 != 0 ? i3 : i10;
            if (d(i10, i3)) {
                LogUtil.a("FunctionSetSleepCardReader", "manualBedTime less than 3 or only bed time");
                z2 = true;
                this.k = true;
            } else {
                z2 = true;
            }
            LogUtil.a("FunctionSetSleepCardReader", "manual bed time data! ");
            str = "has_core_sleep";
            z3 = false;
        } else {
            i3 = i11;
            z2 = true;
            z3 = true;
            d3 = i9;
            str = "has_core_sleep";
        }
        if (z3) {
            this.k = z2;
            h();
            str2 = ArkUIXConstants.DELETE;
        } else {
            if ("has_common_sleep".equals(str)) {
                i4 = 0;
            } else {
                i4 = i9;
            }
            str2 = ArkUIXConstants.DELETE;
            a(i14, i18, i2, i19, i4, i10, i3);
        }
        this.f48238a = d(hiHealthData, str);
        functionSetBeanE = e(hiHealthData, d3);
        functionSetBeanE.a(b(d3, i19, i9, i10));
        if (z) {
            setFunctionSetBean(functionSetBeanE);
            b(functionSetBeanE);
        } else {
            refreshCardBySp(functionSetBeanE);
        }
        d(z);
        if (str2.equals(this.mChangeKey)) {
            ObserverManagerUtil.e("SLEEP_MESSAGE_JUMP_TAG", Long.valueOf(this.s), bool);
        }
        LogUtil.a("FunctionSetSleepCardReader", "refreshSleepDataAndTime type ", str, ", category: ", this.f48238a, " deepTime ", Integer.valueOf(i14), " shallowTime ", Integer.valueOf(i18), " remTime ", Integer.valueOf(i2), " awakeTime ", Integer.valueOf(i19), " noonTime ", Integer.valueOf(i9), ", manualBedTime ", Integer.valueOf(i10), ", manualSleepTime ", Integer.valueOf(i3), ", mLastDataTime ", Long.valueOf(this.s));
    }

    private String d(HiHealthData hiHealthData, String str) {
        if ("has_common_sleep".equals(str)) {
            this.k = true;
            setBiHasDataType("normal");
            setBiDataSource("wearDevice");
            return "has_common_sleep";
        }
        setBiHasDataType("scientific");
        int i2 = hiHealthData.getInt("sleep_device_category_key");
        if (i2 == Integer.parseInt("06D", 16) || i2 == Integer.parseInt("06E", 16)) {
            setBiDataSource("wearDevice");
            return "has_core_sleep";
        }
        if (i2 == Integer.parseInt("001", 16)) {
            setBiDataSource("manual");
            return "has_manual_sleep";
        }
        if (qqk.a(i2)) {
            setBiDataSource("telephone");
            return "has_phone_sleep";
        }
        return "";
    }

    private FunctionSetBean e(HiHealthData hiHealthData, double d2) {
        FunctionSetBean functionSetBeanA;
        if (9.999999747378752E-6d + d2 == 0.0d) {
            functionSetBeanA = buildEmptyCardBean();
            LogUtil.a("FunctionSetSleepCardReader", "getFunctionSetBean buildEmptyCardBean");
        } else {
            long startTime = hiHealthData.getStartTime();
            this.s = startTime;
            setBiHasData(startTime);
            functionSetBeanA = new FunctionSetBean.c(qre.f(R.string.IDS_hw_show_main_home_page_sleep)).d(tfc.b(this.s)).g(tfc.d(this.s)).e(e((int) d2)).c(FunctionSetBean.ViewType.DATA_VIEW).e(FunctionSetType.SLEEP_CARD).b(this.mContext).d((CharSequence) this.f).c(this.f48238a).a();
        }
        functionSetBeanA.d(hiHealthData.toString().hashCode());
        return functionSetBeanA;
    }

    private CharSequence e(int i2) {
        BaseApplication.getContext();
        int i3 = i2 / 60;
        int i4 = i2 % 60;
        String strE = qre.e(R.plurals.IDS_min_unit, i4, UnitUtil.e(i4, 1, 0));
        if (i3 > 0) {
            strE = qre.a(R.string.IDS_two_parts, qre.e(R.plurals.IDS_hour_unit, i3, UnitUtil.e(i3, 1, 0)), strE);
        }
        return tfc.b("[\\d\\-]", strE);
    }

    private boolean b(double d2, int i2, int i3, int i4) {
        int iC = SharedPreferenceManager.c(Integer.toString(PrebakedEffectId.RT_COIN_DROP), "ENTRY_ACTIVITY_TIME_SP_KEY", 0);
        int iHash = Objects.hash(Integer.valueOf((int) d2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(this.s));
        this.j = iHash;
        LogUtil.a("FunctionSetSleepCardReader", "mCurrentHash = ", Integer.valueOf(iHash), "; hash = ", Integer.valueOf(iC));
        if (!this.n) {
            return iC != this.j;
        }
        SharedPreferenceManager.d(Integer.toString(PrebakedEffectId.RT_COIN_DROP), "ENTRY_ACTIVITY_TIME_SP_KEY", this.j);
        this.n = false;
        return false;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public void updateSuccessList(List<Integer> list) {
        LogUtil.a("FunctionSetSleepCardReader", "updateSuccessList");
        if (njy.e(list)) {
            LogUtil.j("FunctionSetSleepCardReader", "updateSuccessList successList is empty");
            this.e = true;
        } else {
            this.r = list;
        }
    }

    static class c extends BaseHandler<skc> {
        private c(skc skcVar) {
            super(Looper.getMainLooper(), skcVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(skc skcVar, Message message) {
            if (skcVar == null || message == null) {
                LogUtil.j("FunctionSetSleepCardReader", "handleMessageWhenReferenceNotNull sleepCardReader or message is null");
                return;
            }
            int i = message.what;
            LogUtil.a("FunctionSetSleepCardReader", "handleMessageWhenReferenceNotNull what ", Integer.valueOf(i));
            if (i == 1) {
                Object obj = message.obj;
                if (!(obj instanceof FunctionSetBean)) {
                    LogUtil.j("FunctionSetSleepCardReader", "handleMessageWhenReferenceNotNull object instanceof FunctionSetBean is false");
                    return;
                }
                FunctionSetBean functionSetBean = (FunctionSetBean) obj;
                LogUtil.a("FunctionSetSleepCardReader", "current changed bean is ", functionSetBean);
                skcVar.notifyItemChanged(functionSetBean);
            }
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData
    public View createCardView() {
        return this.f48240c;
    }

    private Map<String, Object> b() {
        HashMap map = new HashMap(2);
        map.put(FunctionSetBeanReader.BI_HAS_DATA, false);
        if (!(this.mCardViewHolder instanceof FunctionSetBeanReader.MyHolder)) {
            LogUtil.a("FunctionSetSleepCardReader", "mCardViewHolder is not MyHolder instance");
            map.put("guideLanguage", "");
            return map;
        }
        View view = this.mCardViewHolder.itemView;
        if (view == null) {
            LogUtil.a("FunctionSetSleepCardReader", "view is null");
            map.put("guideLanguage", "");
            return map;
        }
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.function_set_empty_items_description);
        if (healthTextView == null) {
            LogUtil.a("FunctionSetSleepCardReader", "sleepEmptyDescription is null");
            map.put("guideLanguage", "");
            return map;
        }
        map.put("guideLanguage", healthTextView.getText().toString());
        return map;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void onCardViewClickListener(FunctionSetBean.ViewType viewType) {
        HashMap map = new HashMap(2);
        map.put("guideLanguage", "");
        map.put("from", 0);
        if (viewType == FunctionSetBean.ViewType.DATA_VIEW) {
            map.put(FunctionSetBeanReader.BI_HAS_DATA, true);
            idy.b(AnalyticsValue.HEALTH_HOME_SLEEP_CARD_CLICK_21300020.value(), map);
            lmf.d().c(this.mContext.getApplicationContext(), AnalyticsValue.HEALTH_HOME_SLEEP_DETAIL_2010011.value(), map, 0);
            ThreadPoolManager.c().execute(new Runnable() { // from class: skh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48264c.a();
                }
            });
            try {
                this.u.clickRecord(Integer.parseInt(AnalyticsValue.HEALTH_HOME_SLEEP_DETAIL_2010011.value()), getHuid());
            } catch (NumberFormatException e2) {
                LogUtil.e("FunctionSetSleepCardReader", "setSleepCardForDataView onClick NumberFormatException ", LogAnonymous.b(e2));
            }
            a(true, "has_core_sleep".equals(getFunctionSetBean().i()), this.s);
        } else {
            map.put(FunctionSetBeanReader.BI_HAS_DATA, false);
            idy.b(AnalyticsValue.HEALTH_HOME_SLEEP_CARD_CLICK_21300020.value(), b());
            lmf.d().c(this.mContext.getApplicationContext(), AnalyticsValue.HEALTH_HOME_SLEEP_DETAIL_2010011.value(), map, 0);
            ThreadPoolManager.c().execute(new Runnable() { // from class: skj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48272a.c();
                }
            });
            try {
                this.u.clickRecord(Integer.parseInt(AnalyticsValue.HEALTH_HOME_SLEEP_DETAIL_2010011.value()), getHuid());
            } catch (NumberFormatException e3) {
                LogUtil.e("FunctionSetSleepCardReader", "setSleepCardForEmptyView onClick NumberFormatException ", LogAnonymous.b(e3));
            }
            j();
        }
        SharedPreferenceManager.d(Integer.toString(PrebakedEffectId.RT_COIN_DROP), "ENTRY_ACTIVITY_TIME_SP_KEY", this.j);
    }

    /* synthetic */ void a() {
        e(this.mContext);
    }

    /* synthetic */ void c() {
        e(this.mContext);
    }

    private void j() {
        if (this.l || qre.f(R.string.IDS_main_no_device_click).equals(getFunctionSetBean().i()) || this.m) {
            a(false, false, this.s);
            return;
        }
        Intent intent = new Intent(this.mContext, (Class<?>) KnitSleepDetailActivity.class);
        intent.putExtra("from", 0);
        tfc.a(this.mContext, intent, isShowHomePageRecommendLayout() ? null : this.mCardViewHolder.itemView, false);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getDefaultLargeCardImageRes() {
        return Integer.toString(R.drawable.pic_health_sleep);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getDefaultImage(boolean z) {
        if (z) {
            return R.drawable.sleep_default_img_big;
        }
        return R.drawable.marketing_default_img_sleep;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonColorId() {
        if (qqs.e(this.mContext)) {
            return R.color.function_marketing_big_card_sleep_dark;
        }
        return R.color.function_marketing_big_card_sleep;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public void setClickEventForButton(HealthButton healthButton) {
        if (healthButton == null) {
            return;
        }
        healthButton.setClickable(true);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: skc.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                H5ProClient.getServiceManager().registerService(SleepJsApi.class);
                ddv.b().loadH5ProApp(skc.this.mContext, "com.huawei.health.h5.sleepdetection", new H5ProLaunchOption.Builder().addPath("#/sleepDataInput?pullFrom=6&whichDate=" + System.currentTimeMillis()).addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).setForceDarkMode(1).setImmerse().showStatusBar().setStatusBarTextBlack(true));
            }
        };
        Activity activity = BaseApplication.getActivity();
        if (activity != null) {
            healthButton.setOnClickListener(qji.d(onClickListener, activity, true, ""));
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public int getButtonTextId() {
        return R.string.IDS_sleep_input_text5;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public HandleCacheDataRunnable getRunnable() {
        return this.i;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader
    public String getChildTag() {
        return "FunctionSetSleepCardReader";
    }
}
