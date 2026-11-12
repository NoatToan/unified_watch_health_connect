package com.huawei.ui.homehealth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.ArraySet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.RcmItem;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.GridTemplate;
import com.huawei.health.marketing.views.ColumnLayoutAdapter;
import com.huawei.health.marketing.views.ColumnLinearLayout;
import com.huawei.health.vip.datatypes.BenefitStatusInfo;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.RepeatResourceBenefitInfo;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback;
import defpackage.ffd;
import defpackage.ffq;
import defpackage.ffv;
import defpackage.fua;
import defpackage.lls;
import defpackage.loq;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qqp;
import defpackage.qqt;
import defpackage.qsp;
import defpackage.ugs;
import health.compact.a.BuildTypeConfig;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.LogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class FunctionMenuCardData extends AbstractBaseCardData {
    private static final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColumnLinearLayout f25093b;
    private String h;
    private RecyclerView.ViewHolder l;
    private b p;
    private Timer u;
    private int v;
    private int j = 0;
    private FunctionMenuViewHolder i = null;
    private GridTemplate o = null;
    private GridTemplate k = null;
    private String f = "";
    private String n = "";
    private boolean m = false;
    private boolean e = true;
    private ResourceResultInfo t = new ResourceResultInfo.Builder().build();
    private ResourceBriefInfo s = new ResourceBriefInfo.Builder().setContentType(47).build();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f25094c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f25092a = true;
    private int y = 0;
    private ViewTreeObserver.OnGlobalLayoutListener r = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.homehealth.FunctionMenuCardData.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            FunctionMenuCardData functionMenuCardData = FunctionMenuCardData.this;
            functionMenuCardData.v = functionMenuCardData.l.itemView.getTop();
        }
    };
    private BroadcastReceiver q = new e(this);
    private Context g = BaseApplication.getContext();

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void refreshCardData() {
    }

    static class e extends BroadcastReceiver {
        private WeakReference<FunctionMenuCardData> d;

        e(FunctionMenuCardData functionMenuCardData) {
            this.d = new WeakReference<>(functionMenuCardData);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.b("FunctionMenuCardData", "mSwitchAccountReceiver  onReceive");
            if (intent == null) {
                LogUtil.e("FunctionMenuCardData", "login receive.intent null.");
                return;
            }
            FunctionMenuCardData functionMenuCardData = this.d.get();
            if (functionMenuCardData == null) {
                LogUtil.e("FunctionMenuCardData", "login receive.menuCardData is null.");
                return;
            }
            if ("com.huawei.plugin.account.login".equals(intent.getAction())) {
                functionMenuCardData.b(false);
            }
            if ("com.huawei.plugin.account.logout".equals(intent.getAction())) {
                functionMenuCardData.u();
                functionMenuCardData.b(false);
            }
        }
    }

    public FunctionMenuCardData() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: rgn
            @Override // java.lang.Runnable
            public final void run() {
                this.f47301c.q();
            }
        });
        b bVar = new b(this);
        this.p = bVar;
        HandlerExecutor.c(bVar, 10000L);
        k();
        this.u = new Timer();
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<FunctionMenuCardData> f25107b;

        public b(FunctionMenuCardData functionMenuCardData) {
            this.f25107b = new WeakReference<>(functionMenuCardData);
        }

        @Override // java.lang.Runnable
        public void run() {
            FunctionMenuCardData functionMenuCardData = this.f25107b.get();
            if (functionMenuCardData != null) {
                functionMenuCardData.r();
            } else {
                LogUtil.e("FunctionMenuCardData", "LastTimeCallback activity is null");
            }
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.i = new FunctionMenuViewHolder(LayoutInflater.from(this.g).inflate(R.layout.function_menu_card, viewGroup, false));
        this.f25093b = new ColumnLinearLayout(BaseApplication.getContext());
        m();
        return this.i;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "FunctionMenuCardData";
    }

    public void e(RecyclerView.ViewHolder viewHolder, int i) {
        this.l = viewHolder;
        viewHolder.itemView.getViewTreeObserver().addOnGlobalLayoutListener(this.r);
        l();
        b(true);
    }

    private void l() {
        LogUtil.b("FunctionMenuCardData", "refreshBySp");
        if (this.f25092a) {
            if (this.s == null || this.o == null) {
                LogUtil.b("FunctionMenuCardData", "async restoreCacheData failed");
                if (!q()) {
                    LogUtil.e("FunctionMenuCardData", "no marketing sp data");
                }
            }
            if (this.o == null || this.s == null) {
                LogUtil.e("FunctionMenuCardData", "no marketing sp data");
                return;
            }
            m();
            b(true, false, false, "", null);
            this.k = this.o.m1125clone();
            this.f25092a = false;
            LogUtil.b("FunctionMenuCardData", "refreshBySp completed");
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        ColumnLinearLayout columnLinearLayout = this.f25093b;
        if (columnLinearLayout != null) {
            columnLinearLayout.onResume();
        }
        ReleaseLogUtil.d("FunctionMenuCardData", "main card onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void f() {
        if (this.o != null) {
            LogUtil.b("FunctionMenuCardData", "updateFunctionMenu");
            PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
            LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
            if (payApi != null && loginInit.getIsLogined()) {
                LogUtil.b("FunctionMenuCardData", "queryBenefitInfo");
                payApi.queryBenefitInfo(9, "", new IBaseResponseCallback() { // from class: rgo
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.f47302a.b(i, obj);
                    }
                });
            } else {
                t();
            }
        }
    }

    public /* synthetic */ void b(int i, Object obj) {
        LogUtil.b("FunctionMenuCardData", "errorCode " + i);
        if (i == 0 && (obj instanceof RepeatResourceBenefitInfo) && c((RepeatResourceBenefitInfo) obj)) {
            LogUtil.b("FunctionMenuCardData", "objData instanceof RepeatResourceBenefitInfo");
            this.f = "hasEquity";
            int i2 = i();
            if (i2 == -1) {
                LogUtil.b("FunctionMenuCardData", "healthManageIndex is -1");
                u();
                return;
            } else {
                e(i2);
                return;
            }
        }
        t();
    }

    private void t() {
        this.f = "";
        if (!TextUtils.isEmpty(this.h)) {
            synchronized (d) {
                this.o = (GridTemplate) qqt.e(this.h, GridTemplate.class);
            }
        }
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z, boolean z2, boolean z3, String str, List<RcmItem> list) {
        HandlerExecutor.c(new a(this, z, z2, z3, str, list), 2000L);
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f25104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f25105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<RcmItem> f25106c;
        private final boolean d;
        private final boolean e;
        private final WeakReference<FunctionMenuCardData> j;

        public a(FunctionMenuCardData functionMenuCardData, boolean z, boolean z2, boolean z3, String str, List<RcmItem> list) {
            this.j = new WeakReference<>(functionMenuCardData);
            this.e = z;
            this.d = z2;
            this.f25104a = z3;
            this.f25105b = str;
            this.f25106c = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.j.get() == null) {
                LogUtil.e("FunctionMenuCardData", "LastTimeCallback activity is null");
                return;
            }
            boolean z = this.e;
            boolean z2 = this.d;
            boolean z3 = this.f25104a;
            ObserverManagerUtil.e("marketing_response_arrived", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), this.f25105b, this.f25106c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            ReleaseLogUtil.e("R_FunctionMenuCardData", "isNetworkConnected: false");
            FunctionMenuViewHolder functionMenuViewHolder = this.i;
            if (functionMenuViewHolder != null) {
                functionMenuViewHolder.b(0);
            }
            n();
            u();
            b(false, false, false, "", null);
            return;
        }
        if (z && !this.f25092a) {
            this.u.schedule(new TimerTask() { // from class: com.huawei.ui.homehealth.FunctionMenuCardData.5
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    FunctionMenuCardData.this.p();
                }
            }, 2000L);
        } else {
            p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        ReleaseLogUtil.e("R_FunctionMenuCardData", "request resource");
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        Task<Map<Integer, ResourceResultInfo>> resourceResultInfo = marketingApi.getResourceResultInfo(4043);
        resourceResultInfo.addOnSuccessListener(new d(this, marketingApi));
        resourceResultInfo.addOnFailureListener(new c(this));
    }

    static class d implements OnSuccessListener<Map<Integer, ResourceResultInfo>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<FunctionMenuCardData> f25109b;
        private MarketingApi d;

        d(FunctionMenuCardData functionMenuCardData, MarketingApi marketingApi) {
            this.f25109b = new WeakReference<>(functionMenuCardData);
            this.d = marketingApi;
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Map<Integer, ResourceResultInfo> map) {
            FunctionMenuCardData functionMenuCardData = this.f25109b.get();
            if (functionMenuCardData == null) {
                ReleaseLogUtil.e("R_FunctionMenuCardData", "cardData is null");
                return;
            }
            LogUtil.b("FunctionMenuCardData", "marketingResponse: ", map);
            if (map == null || map.isEmpty()) {
                ReleaseLogUtil.e("R_FunctionMenuCardData", "marketingResponse is invalid");
                functionMenuCardData.b(true, true, false, "", null);
                functionMenuCardData.n();
                functionMenuCardData.u();
                return;
            }
            Map<Integer, ResourceResultInfo> mapFilterMarketingRules = this.d.filterMarketingRules(map);
            if (functionMenuCardData.i != null) {
                functionMenuCardData.i.b(0);
            }
            if (mapFilterMarketingRules == null || mapFilterMarketingRules.isEmpty()) {
                ReleaseLogUtil.e("R_FunctionMenuCardData", "filterResultInfoMap is invalid");
                functionMenuCardData.b(true, true, false, "", null);
                functionMenuCardData.n();
                functionMenuCardData.u();
                return;
            }
            if (mapFilterMarketingRules.get(4043) != null) {
                ReleaseLogUtil.d("R_FunctionMenuCardData", "getOperationService has health operation marketing resource");
                functionMenuCardData.t = mapFilterMarketingRules.get(4043);
                functionMenuCardData.o();
            }
        }
    }

    static class c implements OnFailureListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<FunctionMenuCardData> f25108c;

        c(FunctionMenuCardData functionMenuCardData) {
            this.f25108c = new WeakReference<>(functionMenuCardData);
        }

        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            FunctionMenuCardData functionMenuCardData = this.f25108c.get();
            if (functionMenuCardData != null) {
                functionMenuCardData.b(true, true, false, "", null);
                functionMenuCardData.n();
                functionMenuCardData.u();
                ReleaseLogUtil.a("R_FunctionMenuCardData", "requestMarketResource onFailure");
                return;
            }
            ReleaseLogUtil.e("R_FunctionMenuCardData", "cardData is null");
        }
    }

    private void c(boolean z) {
        SharedPreferenceManager.a("showLocalResources", "FUNCTION_MENU_SHOW_LOCAL_RESOURCES", z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        FunctionMenuViewHolder functionMenuViewHolder;
        if (!VersionControlUtil.isSupportOperationAccount() && (functionMenuViewHolder = this.i) != null) {
            functionMenuViewHolder.b(8);
            return;
        }
        if (BaseApplication.getContext() == null) {
            ReleaseLogUtil.a("FunctionMenuCardData", "loadFunctionMenuSetConfig failed with null context");
            return;
        }
        if (q()) {
            LogUtil.b("FunctionMenuCardData", "restoreCacheData success, use cache data");
            c(false);
            return;
        }
        if (Utils.o()) {
            return;
        }
        try {
            try {
                InputStream inputStreamOpen = BaseApplication.getContext().getAssets().open("FunctionMenuConfig.json");
                if (inputStreamOpen != null) {
                    synchronized (d) {
                        this.o = (GridTemplate) lls.a(inputStreamOpen, GridTemplate.class);
                        h();
                        this.s = new ResourceBriefInfo.Builder().setContentType(47).build();
                    }
                    c(true);
                }
                IoUtils.c(inputStreamOpen);
            } catch (IOException e2) {
                ReleaseLogUtil.a("FunctionMenuCardData", "loadFunctionMenuSetCofig failed, ", LogAnonymous.b(e2));
                IoUtils.c(null);
            }
        } catch (Throwable th) {
            IoUtils.c(null);
            throw th;
        }
    }

    private void h() {
        GridTemplate gridTemplate;
        if (BuildTypeConfig.e() || (gridTemplate = this.o) == null) {
            return;
        }
        List<SingleGridContent> gridContents = gridTemplate.getGridContents();
        if (njy.e(gridContents)) {
            LogUtil.b("FunctionMenuCardData", "singleGridContentList is empty");
            return;
        }
        for (SingleGridContent singleGridContent : gridContents) {
            if (TextUtils.equals(singleGridContent.getTheme(), "饮食日记")) {
                singleGridContent.setLinkValue("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.diet-diary-new?h5pro=true&urlType=4&pName=com.huawei.health");
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        FunctionMenuViewHolder functionMenuViewHolder = this.i;
        if (functionMenuViewHolder == null || this.t == null) {
            b(true, true, false, "", null);
            return;
        }
        functionMenuViewHolder.b(0);
        List<ResourceBriefInfo> resources = this.t.getResources();
        if (resources == null) {
            return;
        }
        LogUtil.b("FunctionMenuCardData", "size: ", Integer.valueOf(resources.size()), ", List<ResourceBriefInfo> : ", resources);
        for (int size = resources.size() - 1; size >= 0; size--) {
            ResourceBriefInfo resourceBriefInfo = resources.get(size);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis > resourceBriefInfo.getEffectiveTime() && jCurrentTimeMillis < resourceBriefInfo.getExpirationTime() && resourceBriefInfo.getContentType() == 47) {
                this.h = resourceBriefInfo.getContent().getContent();
                LogUtil.b("FunctionMenuCardData", "content  " + this.h);
                if (!TextUtils.isEmpty(this.h)) {
                    e(resourceBriefInfo);
                    return;
                }
            }
        }
    }

    private void e(ResourceBriefInfo resourceBriefInfo) {
        String str;
        GridTemplate gridTemplate;
        boolean zEquals = "intelligent_alpha".equals(resourceBriefInfo.getSortingRules());
        List<String> strategyIds = resourceBriefInfo.getStrategyIds();
        List<String> bucketIds = resourceBriefInfo.getBucketIds();
        List<RcmItem> recommendList = resourceBriefInfo.getRecommendList();
        LogUtil.b("FunctionMenuCardData", "strategyIds: ", strategyIds, ", bucketIds: ", bucketIds);
        if (strategyIds == null || bucketIds == null) {
            str = "";
        } else {
            String strB = qqt.b(new loq.a(strategyIds, bucketIds));
            LogUtil.b("FunctionMenuCardData", "abTestInfo: ", strB);
            str = strB;
        }
        b(true, true, zEquals, str, recommendList);
        c(false);
        synchronized (d) {
            this.s = resourceBriefInfo;
            gridTemplate = (GridTemplate) qqt.e(this.h, GridTemplate.class);
            this.o = gridTemplate;
        }
        if (gridTemplate == null) {
            LogUtil.e("FunctionMenuCardData", "handleValidBriefInfo mGridTemplate is null");
        } else if (i() == -1) {
            LogUtil.b("FunctionMenuCardData", "healthManage not found");
            u();
        } else {
            f();
        }
    }

    private boolean c(RepeatResourceBenefitInfo repeatResourceBenefitInfo) {
        return repeatResourceBenefitInfo.getExpireTime().longValue() >= d(repeatResourceBenefitInfo);
    }

    private long d(RepeatResourceBenefitInfo repeatResourceBenefitInfo) {
        return repeatResourceBenefitInfo.getNowTime() != 0 ? repeatResourceBenefitInfo.getNowTime() : System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: rgk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47298c.s();
                }
            });
            return;
        }
        if (this.o == null || this.s == null) {
            return;
        }
        LogUtil.b("FunctionMenuCardData", "saveCacheData");
        SharedPreferences sharedPreferences = BaseApplication.getContext().getSharedPreferences("function_menu_file", 0);
        if (sharedPreferences == null) {
            LogUtil.d("FunctionMenuCardData", "saveCacheData failed, sharedPreference is null");
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (editorEdit == null) {
            LogUtil.d("FunctionMenuCardData", "saveCacheData failed, editor is null");
            return;
        }
        synchronized (d) {
            String strA = qqt.a(this.o, new TypeToken<GridTemplate>() { // from class: com.huawei.ui.homehealth.FunctionMenuCardData.3
            }.getType());
            int contentType = this.s.getContentType();
            String resourceId = this.s.getResourceId();
            String resourceName = this.s.getResourceName();
            String category = this.s.getCategory();
            editorEdit.putString("function_menu_json", strA);
            editorEdit.putInt("content_type", contentType);
            editorEdit.putString("resource_id", resourceId);
            editorEdit.putString("resource_name", resourceName);
            editorEdit.putString("category", category);
            editorEdit.putString("country", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
            editorEdit.putString("health_manage_status", this.f);
            editorEdit.apply();
            LogUtil.b("FunctionMenuCardData", "saveCacheData functionMenuJson: ", strA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: rgh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47296a.j();
                }
            });
            return;
        }
        LogUtil.b("FunctionMenuCardData", "clearCacheData");
        SharedPreferences sharedPreferences = BaseApplication.getContext().getSharedPreferences("function_menu_file", 0);
        if (sharedPreferences == null) {
            LogUtil.d("FunctionMenuCardData", "clearCacheData failed, sharedPreference is null");
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (editorEdit == null) {
            LogUtil.d("FunctionMenuCardData", "clearCacheData failed, editor is null");
            return;
        }
        synchronized (d) {
            editorEdit.putString("function_menu_json", null);
            editorEdit.putInt("content_type", 0);
            editorEdit.putString("resource_id", null);
            editorEdit.putString("resource_name", null);
            editorEdit.putString("category", null);
            editorEdit.putString("country", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
            editorEdit.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        if (this.f25093b == null) {
            LogUtil.e("FunctionMenuCardData", "mColumnLinearLayout is null");
            return;
        }
        synchronized (d) {
            GridTemplate gridTemplate = this.o;
            if (gridTemplate != null && !njy.e(gridTemplate.getGridContents())) {
                LogUtil.b("FunctionMenuCardData", "updateColumnLinearLayout");
                fua.c(this.o.getGridContents());
                GridTemplate gridTemplateM1125clone = this.o.m1125clone();
                y();
                LogUtil.b("FunctionMenuCardData", "mGridTemplate.size" + this.o.getGridContents().size());
                GridTemplate gridTemplate2 = this.k;
                if (gridTemplate2 != null && gridTemplate2.equals(gridTemplateM1125clone) && this.f.equals(this.n)) {
                    LogUtil.e("FunctionMenuCardData", "no data update, not need refresh");
                    return;
                }
                s();
                if (this.f25094c || this.k == null) {
                    HandlerExecutor.c(new Runnable() { // from class: rgj
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.e.m();
                        }
                    });
                } else {
                    HandlerExecutor.c(new Runnable() { // from class: rgl
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f47299c.c();
                        }
                    });
                    this.n = this.f;
                }
                this.k = gridTemplateM1125clone;
            }
        }
    }

    public /* synthetic */ void c() {
        a(this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        LogUtil.b("FunctionMenuCardData", "initViewHolder, mCurStatus:", this.f);
        this.f25093b.e(this.f);
        this.f25093b.b(4043, this.s, this.o);
        this.i.a(this.f25093b);
        this.f25094c = false;
    }

    private void a(String str) {
        LogUtil.b("FunctionMenuCardData", "updateView");
        this.f25093b.d(this.s, this.o, str);
    }

    private void y() {
        String sortingRules = this.s.getSortingRules();
        List<SingleGridContent> gridContents = this.o.getGridContents();
        if (njy.e(gridContents)) {
            return;
        }
        Iterator<SingleGridContent> it = gridContents.iterator();
        while (it.hasNext()) {
            it.next().setInfoType(sortingRules);
        }
    }

    private void e(int i) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        e(i, countDownLatch);
        d(i, countDownLatch);
        a(countDownLatch);
        try {
            LogUtil.b("FunctionMenuCardData", "getHealthManageInfo result：", Boolean.valueOf(countDownLatch.await(10000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.d("FunctionMenuCardData", "getHealthManageInfo InterruptedException");
        }
        if (this.m) {
            this.f = "hasInquiring";
        }
        u();
    }

    private int i() {
        int iE;
        synchronized (d) {
            List<SingleGridContent> gridContents = this.o.getGridContents();
            iE = e(gridContents, "healthManage");
            if (iE == -1) {
                iE = e(gridContents);
            }
        }
        LogUtil.b("FunctionMenuCardData", "healthManageIndex  " + iE);
        return iE;
    }

    private int e(List<SingleGridContent> list) {
        if (njy.e(list)) {
            return -1;
        }
        for (SingleGridContent singleGridContent : list) {
            if (singleGridContent != null && BaseApplication.getContext().getResources().getString(R.string.IDS_guardian_health_management).equals(singleGridContent.getTheme())) {
                return list.indexOf(singleGridContent);
            }
        }
        return -1;
    }

    private void e(int i, final CountDownLatch countDownLatch) {
        ugs.e().getDoctorBasicInfo(new DataCallback() { // from class: com.huawei.ui.homehealth.FunctionMenuCardData.4
            @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
            public void onFailure(int i2, String str) {
                LogUtil.d("FunctionMenuCardData", "getDoctorBasicInfo errorCode " + i2 + ", errorInfo " + str);
                FunctionMenuCardData.this.d(countDownLatch);
            }

            @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.b("FunctionMenuCardData", "getDoctorBasicInfo  " + jSONObject.toString());
                try {
                    if (jSONObject.getInt("resultCode") != 0) {
                        LogUtil.d("FunctionMenuCardData", "resultCode: ", Integer.valueOf(jSONObject.getInt("resultCode")));
                        FunctionMenuCardData.this.d(countDownLatch);
                        return;
                    }
                    String strOptString = jSONObject.optString("doctorId");
                    if (!TextUtils.isEmpty(strOptString) && !"0".equals(strOptString)) {
                        FunctionMenuCardData.this.f = "hasSigned";
                        FunctionMenuCardData.this.b(countDownLatch);
                        return;
                    }
                    LogUtil.b("FunctionMenuCardData", "keySet DOCTOR_HEAD_ID is null");
                    FunctionMenuCardData.this.d(countDownLatch);
                } catch (JSONException unused) {
                    LogUtil.d("FunctionMenuCardData", "parse doctor basic info json fail");
                    FunctionMenuCardData.this.d(countDownLatch);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(CountDownLatch countDownLatch) {
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final CountDownLatch countDownLatch) {
        ReleaseLogUtil.d("R_FunctionMenuCardData", "getHealthLifeChallenge");
        ffv.c("FunctionMenuCardData", (ResponseCallback<ffd>) new ResponseCallback() { // from class: rgq
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.d.c(countDownLatch, i, (ffd) obj);
            }
        });
    }

    public /* synthetic */ void c(CountDownLatch countDownLatch, int i, ffd ffdVar) {
        ReleaseLogUtil.d("R_FunctionMenuCardData", "getHealthLifeChallenge resultCode ", Integer.valueOf(i));
        if (ffdVar != null) {
            ReleaseLogUtil.d("R_FunctionMenuCardData", "getHealthLifeChallenge data ", ffdVar.toString());
            this.f = "hasPlan";
            d(countDownLatch);
            return;
        }
        e(countDownLatch);
    }

    private void e(final CountDownLatch countDownLatch) {
        ReleaseLogUtil.d("R_FunctionMenuCardData", "queryDoctorPlanInfo");
        ffv.e("FunctionMenuCardData", (ResponseCallback<ffq>) new ResponseCallback() { // from class: rgi
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.e.e(countDownLatch, i, (ffq) obj);
            }
        });
    }

    public /* synthetic */ void e(CountDownLatch countDownLatch, int i, ffq ffqVar) {
        ReleaseLogUtil.d("R_FunctionMenuCardData", "queryDoctorPlanInfo resultCode ", Integer.valueOf(i));
        if (ffqVar != null && ffqVar.c()) {
            ReleaseLogUtil.d("R_FunctionMenuCardData", "queryDoctorPlanInfo data ", ffqVar.toString());
            this.f = "hasPlan";
        }
        d(countDownLatch);
    }

    private void d(final int i, final CountDownLatch countDownLatch) {
        ugs.e().getDoctorImInfo(new DataCallback() { // from class: com.huawei.ui.homehealth.FunctionMenuCardData.2
            @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
            public void onFailure(int i2, String str) {
                LogUtil.d("FunctionMenuCardData", "getDoctorImInfo errorCode " + i2 + ", errorInfo " + str);
                FunctionMenuCardData.this.d(countDownLatch);
            }

            @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.b("FunctionMenuCardData", "getDoctorImInfo  " + jSONObject.toString());
                try {
                    if (jSONObject.getInt("resultCode") != 0) {
                        FunctionMenuCardData.this.d(countDownLatch);
                        return;
                    }
                    ArraySet arraySet = new ArraySet();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        arraySet.add(itKeys.next());
                    }
                    if (!arraySet.contains("unReadMsgCount")) {
                        FunctionMenuCardData.this.d(countDownLatch);
                        return;
                    }
                    FunctionMenuCardData.this.y = jSONObject.getInt("unReadMsgCount");
                    LogUtil.b("FunctionMenuCardData", "unReadMsgCount count  " + FunctionMenuCardData.this.y);
                    synchronized (FunctionMenuCardData.d) {
                        List<SingleGridContent> gridContents = FunctionMenuCardData.this.o.getGridContents();
                        if (i < gridContents.size()) {
                            gridContents.get(i).setMessageCount(FunctionMenuCardData.this.y);
                        }
                    }
                    FunctionMenuCardData.this.d(countDownLatch);
                } catch (JSONException unused) {
                    LogUtil.d("FunctionMenuCardData", "parse doctor im info json fail");
                    FunctionMenuCardData.this.d(countDownLatch);
                }
            }
        });
    }

    private void a(final CountDownLatch countDownLatch) {
        this.m = false;
        HashMap map = new HashMap(1);
        map.put("type", 1);
        ugs.e().queryExclusiveGuardianStatus(map, new DataCallback() { // from class: com.huawei.ui.homehealth.FunctionMenuCardData.6
            @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
            public void onFailure(int i, String str) {
                LogUtil.d("FunctionMenuCardData", "queryExclusiveGuardianStatus errorCode " + i + ", errorInfo " + str);
                FunctionMenuCardData.this.d(countDownLatch);
            }

            @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.b("FunctionMenuCardData", "queryExclusiveGuardianStatus  data:", jSONObject);
                if (jSONObject != null) {
                    try {
                        if (jSONObject.getInt("resultCode") == 0 && jSONObject.has(CloudParamKeys.INFO)) {
                            String string = jSONObject.getString(CloudParamKeys.INFO);
                            if (TextUtils.isEmpty(string)) {
                                FunctionMenuCardData.this.d(countDownLatch);
                                return;
                            }
                            BenefitStatusInfo benefitStatusInfo = (BenefitStatusInfo) qqt.e(string, BenefitStatusInfo.class);
                            if (benefitStatusInfo != null && benefitStatusInfo.getStatus() == 0) {
                                FunctionMenuCardData.this.m = true;
                            }
                            FunctionMenuCardData.this.d(countDownLatch);
                            return;
                        }
                    } catch (JSONException e2) {
                        LogUtil.d("FunctionMenuCardData", "queryExclusiveGuardianStatus json error， ", ExceptionUtils.c(e2));
                        FunctionMenuCardData.this.d(countDownLatch);
                        return;
                    }
                }
                FunctionMenuCardData.this.d(countDownLatch);
            }
        });
    }

    private int e(List<SingleGridContent> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(list.get(i).getRedDotFlag())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        String string;
        String string2;
        String string3;
        String string4;
        int i;
        LogUtil.b("FunctionMenuCardData", "getInitData");
        SharedPreferences sharedPreferences = BaseApplication.getContext().getSharedPreferences("function_menu_file", 0);
        String string5 = "";
        if (sharedPreferences != null) {
            string5 = sharedPreferences.getString("function_menu_json", "");
            i = sharedPreferences.getInt("content_type", 0);
            string4 = sharedPreferences.getString("resource_id", "");
            string3 = sharedPreferences.getString("resource_name", "");
            string2 = sharedPreferences.getString("category", "");
            string = sharedPreferences.getString("country", "");
            this.f = sharedPreferences.getString("health_manage_status", "");
        } else {
            string = "";
            string2 = "";
            string3 = "";
            string4 = "";
            i = 0;
        }
        if (!string.equals(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010))) {
            LogUtil.b("FunctionMenuCardData", "country code not equal with last, clear cache");
            j();
            return false;
        }
        if (TextUtils.isEmpty(string5) || i == 0 || "".equals(string4) || "".equals(string3) || "".equals(string2)) {
            return false;
        }
        synchronized (d) {
            this.s = new ResourceBriefInfo.Builder().setContentType(i).setResourceId(string4).setResourceName(string3).setCategory(string2).build();
            this.o = (GridTemplate) qqt.e(string5, GridTemplate.class);
        }
        return true;
    }

    private void k() {
        if (this.e) {
            this.e = false;
            ObserverManagerUtil.d(new AnonymousClass7(), "REFRESH_HEALTH_HEADLINES_SHOW_STATUS");
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.FunctionMenuCardData$7, reason: invalid class name */
    public class AnonymousClass7 implements Observer {
        AnonymousClass7() {
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            if (!njy.c(objArr, 0)) {
                LogUtil.d("FunctionMenuCardData", "null args!");
                return;
            }
            Object obj = objArr[0];
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    ObserverManagerUtil.e("SHOW_HEALTH_HEADLINES_TIPS", -1L, -1L);
                } else {
                    lsy.a(new Runnable() { // from class: rgp
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.d.c();
                        }
                    });
                }
            }
        }

        public /* synthetic */ void c() {
            int iC = FunctionMenuCardData.this.f25093b.getmColumnLayoutAdapter().c();
            int iG = FunctionMenuCardData.this.f25093b.getmColumnLayoutAdapter().g();
            if (FunctionMenuCardData.this.f25093b.getHealthSubHeader() != null && FunctionMenuCardData.this.f25093b.getHealthSubHeader().getVisibility() == 0) {
                iG += FunctionMenuCardData.this.f25093b.getHealthSubHeader().getHeight() - qqp.a(BaseApplication.getContext(), 12.0f);
            }
            ObserverManagerUtil.e("SHOW_HEALTH_HEADLINES_TIPS", Integer.valueOf(iC), Integer.valueOf(iG));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        LogUtil.b("FunctionMenuCardData", "registerSwitchAccountReceiver enter");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.plugin.account.login");
        intentFilter.addAction("com.huawei.plugin.account.logout");
        LocalBroadcastManager.getInstance().registerReceiver(this.q, intentFilter);
        LogUtil.b("FunctionMenuCardData", "registerSwitchAccountReceiver end");
    }

    private void v() {
        try {
            LogUtil.b("FunctionMenuCardData", "unregisterSwitchAccountReceiver mSwitchAccountReceiver != null");
            LocalBroadcastManager.getInstance().unregisterReceiver(this.q);
        } catch (IllegalArgumentException unused) {
            LogUtil.d("FunctionMenuCardData", "unregisterSwitchAccountReceiver IllegalArgumentException");
        }
    }

    public static class FunctionMenuViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        LinearLayout f25102a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        LinearLayout f25103c;
        View d;

        public FunctionMenuViewHolder(View view) {
            super(view);
            this.d = view;
            this.f25103c = (LinearLayout) view.findViewById(R.id.item);
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            this.f25103c.setPadding(((Integer) safeRegionWidth.first).intValue(), 0, ((Integer) safeRegionWidth.second).intValue(), (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_12dp));
            this.f25102a = (LinearLayout) view.findViewById(R.id.operation_service_layout);
        }

        public void a(ColumnLinearLayout columnLinearLayout) {
            this.f25102a.removeAllViews();
            this.f25102a.addView(columnLinearLayout);
        }

        public void b(int i) {
            ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
            if (layoutParams instanceof RecyclerView.LayoutParams) {
                RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                if (i == 0) {
                    layoutParams2.height = -2;
                    layoutParams2.width = -1;
                } else {
                    layoutParams2.height = 0;
                    layoutParams2.width = 0;
                }
                qsp.c(this.d, i);
                this.d.setLayoutParams(layoutParams2);
            }
        }
    }

    public void e() {
        ColumnLayoutAdapter columnLayoutAdapter;
        ColumnLinearLayout columnLinearLayout = this.f25093b;
        if (columnLinearLayout == null || (columnLayoutAdapter = columnLinearLayout.getmColumnLayoutAdapter()) == null) {
            return;
        }
        columnLayoutAdapter.f();
    }

    public void d() {
        ColumnLayoutAdapter columnLayoutAdapter;
        ColumnLinearLayout columnLinearLayout = this.f25093b;
        if (columnLinearLayout == null || (columnLayoutAdapter = columnLinearLayout.getmColumnLayoutAdapter()) == null) {
            return;
        }
        columnLayoutAdapter.b();
    }

    public void b() {
        ColumnLayoutAdapter columnLayoutAdapter;
        ColumnLinearLayout columnLinearLayout = this.f25093b;
        if (columnLinearLayout == null || (columnLayoutAdapter = columnLinearLayout.getmColumnLayoutAdapter()) == null) {
            return;
        }
        columnLayoutAdapter.h();
    }

    public void g() {
        ColumnLayoutAdapter columnLayoutAdapter;
        ColumnLinearLayout columnLinearLayout = this.f25093b;
        if (columnLinearLayout == null || (columnLayoutAdapter = columnLinearLayout.getmColumnLayoutAdapter()) == null) {
            return;
        }
        columnLayoutAdapter.i();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onDestroy() {
        super.onDestroy();
        v();
        ObserverManagerUtil.e("marketing_response_arrived", -1);
        HandlerExecutor.a().removeCallbacks(this.p);
        RecyclerView.ViewHolder viewHolder = this.l;
        if (viewHolder != null && viewHolder.itemView != null) {
            this.l.itemView.getViewTreeObserver().removeOnGlobalLayoutListener(this.r);
        }
        this.u.cancel();
    }
}
